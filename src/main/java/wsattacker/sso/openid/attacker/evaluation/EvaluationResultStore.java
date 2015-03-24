/*
 * OpenID Attacker
 * (C) 2015 Christian Mainka & Christian Koßmann
 *
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation; either version 2 of the License, or (at your option) any later
 * version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 *
 * You should have received a copy of the GNU General Public License along with
 * this program; if not, write to the Free Software Foundation, Inc., 51
 * Franklin Street, Fifth Floor, Boston, MA 02110-1301, USA.
 */
package wsattacker.sso.openid.attacker.evaluation;

import java.util.ArrayList;
import java.util.List;
import org.jdesktop.observablecollections.ObservableCollections;
import org.jdesktop.observablecollections.ObservableList;

public class EvaluationResultStore {
    private static EvaluationResultStore INSTANCE;
    
    private final ObservableList<EvaluationResult> evaluationResults = ObservableCollections.observableList(new ArrayList<EvaluationResult>());
    
    private EvaluationResultStore() {
        
    }
    
    public static EvaluationResultStore getEvaluationResultStore() {
        if (INSTANCE == null) {
            INSTANCE = new EvaluationResultStore();
        }
        
        return INSTANCE;
    }
    
    public void addEvaluationResult(EvaluationResult result) {
        evaluationResults.add(result);
    }
    
    public EvaluationResult getLatestEvaluationResult() {
        return evaluationResults.get(evaluationResults.size()-1);
    }
    
    public List<EvaluationResult> getEvaluationResults() {
        return evaluationResults;
    }

    public void setEvaluationResults(List<EvaluationResult> evaluationResults) {
        
    }
}
