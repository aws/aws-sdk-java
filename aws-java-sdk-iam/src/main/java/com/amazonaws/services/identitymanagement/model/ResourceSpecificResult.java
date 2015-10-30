/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the result of the simulation of a single API action call on a
 * single resource.
 * </p>
 * <p>
 * This data type is used by a member of the EvaluationResult data type.
 * </p>
 */
public class ResourceSpecificResult implements Serializable, Cloneable {

    /**
     * The name of the simulated resource, in Amazon Resource Name (ARN)
     * format.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String evalResourceName;

    /**
     * The result of the simulation of the simulated API action on the
     * resource specified in <code>EvalResourceName</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>allowed, explicitDeny, implicitDeny
     */
    private String evalResourceDecision;

    /**
     * A list of the statements in the input policies that determine the
     * result for this part of the simulation. Remember that even if multiple
     * statements allow the action on the resource, if <i>any</i> statement
     * denies that action, then the explicit deny overrides any allow, and
     * the deny statement is the only entry included in the result.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Statement> matchedStatements;

    /**
     * A list of context keys that are required by the included input
     * policies but that were not provided by one of the input parameters. To
     * discover the context keys used by a set of policies, you can call
     * <a>GetContextKeysForCustomPolicy</a> or
     * <a>GetContextKeysForPrincipalPolicy</a>.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> missingContextValues;

    /**
     * Additional details about the results of the evaluation decision. When
     * there are both IAM policies and resource policies, this parameter
     * explains how each set of policies contributes to the final evaluation
     * decision. When simulating cross-account access to a resource, both the
     * resource-based policy and the caller's IAM policy must grant access.
     */
    private java.util.Map<String,String> evalDecisionDetails;

    /**
     * The name of the simulated resource, in Amazon Resource Name (ARN)
     * format.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return The name of the simulated resource, in Amazon Resource Name (ARN)
     *         format.
     */
    public String getEvalResourceName() {
        return evalResourceName;
    }
    
    /**
     * The name of the simulated resource, in Amazon Resource Name (ARN)
     * format.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param evalResourceName The name of the simulated resource, in Amazon Resource Name (ARN)
     *         format.
     */
    public void setEvalResourceName(String evalResourceName) {
        this.evalResourceName = evalResourceName;
    }
    
    /**
     * The name of the simulated resource, in Amazon Resource Name (ARN)
     * format.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param evalResourceName The name of the simulated resource, in Amazon Resource Name (ARN)
     *         format.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ResourceSpecificResult withEvalResourceName(String evalResourceName) {
        this.evalResourceName = evalResourceName;
        return this;
    }

    /**
     * The result of the simulation of the simulated API action on the
     * resource specified in <code>EvalResourceName</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>allowed, explicitDeny, implicitDeny
     *
     * @return The result of the simulation of the simulated API action on the
     *         resource specified in <code>EvalResourceName</code>.
     *
     * @see PolicyEvaluationDecisionType
     */
    public String getEvalResourceDecision() {
        return evalResourceDecision;
    }
    
    /**
     * The result of the simulation of the simulated API action on the
     * resource specified in <code>EvalResourceName</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>allowed, explicitDeny, implicitDeny
     *
     * @param evalResourceDecision The result of the simulation of the simulated API action on the
     *         resource specified in <code>EvalResourceName</code>.
     *
     * @see PolicyEvaluationDecisionType
     */
    public void setEvalResourceDecision(String evalResourceDecision) {
        this.evalResourceDecision = evalResourceDecision;
    }
    
    /**
     * The result of the simulation of the simulated API action on the
     * resource specified in <code>EvalResourceName</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>allowed, explicitDeny, implicitDeny
     *
     * @param evalResourceDecision The result of the simulation of the simulated API action on the
     *         resource specified in <code>EvalResourceName</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see PolicyEvaluationDecisionType
     */
    public ResourceSpecificResult withEvalResourceDecision(String evalResourceDecision) {
        this.evalResourceDecision = evalResourceDecision;
        return this;
    }

    /**
     * The result of the simulation of the simulated API action on the
     * resource specified in <code>EvalResourceName</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>allowed, explicitDeny, implicitDeny
     *
     * @param evalResourceDecision The result of the simulation of the simulated API action on the
     *         resource specified in <code>EvalResourceName</code>.
     *
     * @see PolicyEvaluationDecisionType
     */
    public void setEvalResourceDecision(PolicyEvaluationDecisionType evalResourceDecision) {
        this.evalResourceDecision = evalResourceDecision.toString();
    }
    
    /**
     * The result of the simulation of the simulated API action on the
     * resource specified in <code>EvalResourceName</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>allowed, explicitDeny, implicitDeny
     *
     * @param evalResourceDecision The result of the simulation of the simulated API action on the
     *         resource specified in <code>EvalResourceName</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see PolicyEvaluationDecisionType
     */
    public ResourceSpecificResult withEvalResourceDecision(PolicyEvaluationDecisionType evalResourceDecision) {
        this.evalResourceDecision = evalResourceDecision.toString();
        return this;
    }

    /**
     * A list of the statements in the input policies that determine the
     * result for this part of the simulation. Remember that even if multiple
     * statements allow the action on the resource, if <i>any</i> statement
     * denies that action, then the explicit deny overrides any allow, and
     * the deny statement is the only entry included in the result.
     *
     * @return A list of the statements in the input policies that determine the
     *         result for this part of the simulation. Remember that even if multiple
     *         statements allow the action on the resource, if <i>any</i> statement
     *         denies that action, then the explicit deny overrides any allow, and
     *         the deny statement is the only entry included in the result.
     */
    public java.util.List<Statement> getMatchedStatements() {
        if (matchedStatements == null) {
              matchedStatements = new com.amazonaws.internal.ListWithAutoConstructFlag<Statement>();
              matchedStatements.setAutoConstruct(true);
        }
        return matchedStatements;
    }
    
    /**
     * A list of the statements in the input policies that determine the
     * result for this part of the simulation. Remember that even if multiple
     * statements allow the action on the resource, if <i>any</i> statement
     * denies that action, then the explicit deny overrides any allow, and
     * the deny statement is the only entry included in the result.
     *
     * @param matchedStatements A list of the statements in the input policies that determine the
     *         result for this part of the simulation. Remember that even if multiple
     *         statements allow the action on the resource, if <i>any</i> statement
     *         denies that action, then the explicit deny overrides any allow, and
     *         the deny statement is the only entry included in the result.
     */
    public void setMatchedStatements(java.util.Collection<Statement> matchedStatements) {
        if (matchedStatements == null) {
            this.matchedStatements = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Statement> matchedStatementsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Statement>(matchedStatements.size());
        matchedStatementsCopy.addAll(matchedStatements);
        this.matchedStatements = matchedStatementsCopy;
    }
    
    /**
     * A list of the statements in the input policies that determine the
     * result for this part of the simulation. Remember that even if multiple
     * statements allow the action on the resource, if <i>any</i> statement
     * denies that action, then the explicit deny overrides any allow, and
     * the deny statement is the only entry included in the result.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setMatchedStatements(java.util.Collection)} or
     * {@link #withMatchedStatements(java.util.Collection)} if you want to
     * override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param matchedStatements A list of the statements in the input policies that determine the
     *         result for this part of the simulation. Remember that even if multiple
     *         statements allow the action on the resource, if <i>any</i> statement
     *         denies that action, then the explicit deny overrides any allow, and
     *         the deny statement is the only entry included in the result.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ResourceSpecificResult withMatchedStatements(Statement... matchedStatements) {
        if (getMatchedStatements() == null) setMatchedStatements(new java.util.ArrayList<Statement>(matchedStatements.length));
        for (Statement value : matchedStatements) {
            getMatchedStatements().add(value);
        }
        return this;
    }
    
    /**
     * A list of the statements in the input policies that determine the
     * result for this part of the simulation. Remember that even if multiple
     * statements allow the action on the resource, if <i>any</i> statement
     * denies that action, then the explicit deny overrides any allow, and
     * the deny statement is the only entry included in the result.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param matchedStatements A list of the statements in the input policies that determine the
     *         result for this part of the simulation. Remember that even if multiple
     *         statements allow the action on the resource, if <i>any</i> statement
     *         denies that action, then the explicit deny overrides any allow, and
     *         the deny statement is the only entry included in the result.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ResourceSpecificResult withMatchedStatements(java.util.Collection<Statement> matchedStatements) {
        if (matchedStatements == null) {
            this.matchedStatements = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Statement> matchedStatementsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Statement>(matchedStatements.size());
            matchedStatementsCopy.addAll(matchedStatements);
            this.matchedStatements = matchedStatementsCopy;
        }

        return this;
    }

    /**
     * A list of context keys that are required by the included input
     * policies but that were not provided by one of the input parameters. To
     * discover the context keys used by a set of policies, you can call
     * <a>GetContextKeysForCustomPolicy</a> or
     * <a>GetContextKeysForPrincipalPolicy</a>.
     *
     * @return A list of context keys that are required by the included input
     *         policies but that were not provided by one of the input parameters. To
     *         discover the context keys used by a set of policies, you can call
     *         <a>GetContextKeysForCustomPolicy</a> or
     *         <a>GetContextKeysForPrincipalPolicy</a>.
     */
    public java.util.List<String> getMissingContextValues() {
        if (missingContextValues == null) {
              missingContextValues = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              missingContextValues.setAutoConstruct(true);
        }
        return missingContextValues;
    }
    
    /**
     * A list of context keys that are required by the included input
     * policies but that were not provided by one of the input parameters. To
     * discover the context keys used by a set of policies, you can call
     * <a>GetContextKeysForCustomPolicy</a> or
     * <a>GetContextKeysForPrincipalPolicy</a>.
     *
     * @param missingContextValues A list of context keys that are required by the included input
     *         policies but that were not provided by one of the input parameters. To
     *         discover the context keys used by a set of policies, you can call
     *         <a>GetContextKeysForCustomPolicy</a> or
     *         <a>GetContextKeysForPrincipalPolicy</a>.
     */
    public void setMissingContextValues(java.util.Collection<String> missingContextValues) {
        if (missingContextValues == null) {
            this.missingContextValues = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> missingContextValuesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(missingContextValues.size());
        missingContextValuesCopy.addAll(missingContextValues);
        this.missingContextValues = missingContextValuesCopy;
    }
    
    /**
     * A list of context keys that are required by the included input
     * policies but that were not provided by one of the input parameters. To
     * discover the context keys used by a set of policies, you can call
     * <a>GetContextKeysForCustomPolicy</a> or
     * <a>GetContextKeysForPrincipalPolicy</a>.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setMissingContextValues(java.util.Collection)} or
     * {@link #withMissingContextValues(java.util.Collection)} if you want to
     * override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param missingContextValues A list of context keys that are required by the included input
     *         policies but that were not provided by one of the input parameters. To
     *         discover the context keys used by a set of policies, you can call
     *         <a>GetContextKeysForCustomPolicy</a> or
     *         <a>GetContextKeysForPrincipalPolicy</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ResourceSpecificResult withMissingContextValues(String... missingContextValues) {
        if (getMissingContextValues() == null) setMissingContextValues(new java.util.ArrayList<String>(missingContextValues.length));
        for (String value : missingContextValues) {
            getMissingContextValues().add(value);
        }
        return this;
    }
    
    /**
     * A list of context keys that are required by the included input
     * policies but that were not provided by one of the input parameters. To
     * discover the context keys used by a set of policies, you can call
     * <a>GetContextKeysForCustomPolicy</a> or
     * <a>GetContextKeysForPrincipalPolicy</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param missingContextValues A list of context keys that are required by the included input
     *         policies but that were not provided by one of the input parameters. To
     *         discover the context keys used by a set of policies, you can call
     *         <a>GetContextKeysForCustomPolicy</a> or
     *         <a>GetContextKeysForPrincipalPolicy</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ResourceSpecificResult withMissingContextValues(java.util.Collection<String> missingContextValues) {
        if (missingContextValues == null) {
            this.missingContextValues = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> missingContextValuesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(missingContextValues.size());
            missingContextValuesCopy.addAll(missingContextValues);
            this.missingContextValues = missingContextValuesCopy;
        }

        return this;
    }

    /**
     * Additional details about the results of the evaluation decision. When
     * there are both IAM policies and resource policies, this parameter
     * explains how each set of policies contributes to the final evaluation
     * decision. When simulating cross-account access to a resource, both the
     * resource-based policy and the caller's IAM policy must grant access.
     *
     * @return Additional details about the results of the evaluation decision. When
     *         there are both IAM policies and resource policies, this parameter
     *         explains how each set of policies contributes to the final evaluation
     *         decision. When simulating cross-account access to a resource, both the
     *         resource-based policy and the caller's IAM policy must grant access.
     */
    public java.util.Map<String,String> getEvalDecisionDetails() {
        
        if (evalDecisionDetails == null) {
            evalDecisionDetails = new java.util.HashMap<String,String>();
        }
        return evalDecisionDetails;
    }
    
    /**
     * Additional details about the results of the evaluation decision. When
     * there are both IAM policies and resource policies, this parameter
     * explains how each set of policies contributes to the final evaluation
     * decision. When simulating cross-account access to a resource, both the
     * resource-based policy and the caller's IAM policy must grant access.
     *
     * @param evalDecisionDetails Additional details about the results of the evaluation decision. When
     *         there are both IAM policies and resource policies, this parameter
     *         explains how each set of policies contributes to the final evaluation
     *         decision. When simulating cross-account access to a resource, both the
     *         resource-based policy and the caller's IAM policy must grant access.
     */
    public void setEvalDecisionDetails(java.util.Map<String,String> evalDecisionDetails) {
        this.evalDecisionDetails = evalDecisionDetails;
    }
    
    /**
     * Additional details about the results of the evaluation decision. When
     * there are both IAM policies and resource policies, this parameter
     * explains how each set of policies contributes to the final evaluation
     * decision. When simulating cross-account access to a resource, both the
     * resource-based policy and the caller's IAM policy must grant access.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param evalDecisionDetails Additional details about the results of the evaluation decision. When
     *         there are both IAM policies and resource policies, this parameter
     *         explains how each set of policies contributes to the final evaluation
     *         decision. When simulating cross-account access to a resource, both the
     *         resource-based policy and the caller's IAM policy must grant access.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ResourceSpecificResult withEvalDecisionDetails(java.util.Map<String,String> evalDecisionDetails) {
        setEvalDecisionDetails(evalDecisionDetails);
        return this;
    }

    /**
     * Additional details about the results of the evaluation decision. When
     * there are both IAM policies and resource policies, this parameter
     * explains how each set of policies contributes to the final evaluation
     * decision. When simulating cross-account access to a resource, both the
     * resource-based policy and the caller's IAM policy must grant access.
     * <p>
     * The method adds a new key-value pair into EvalDecisionDetails
     * parameter, and returns a reference to this object so that method calls
     * can be chained together.
     *
     * @param key The key of the entry to be added into EvalDecisionDetails.
     * @param value The corresponding value of the entry to be added into EvalDecisionDetails.
     */
  public ResourceSpecificResult addEvalDecisionDetailsEntry(String key, String value) {
    if (null == this.evalDecisionDetails) {
      this.evalDecisionDetails = new java.util.HashMap<String,String>();
    }
    if (this.evalDecisionDetails.containsKey(key))
      throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
    this.evalDecisionDetails.put(key, value);
    return this;
  }

  /**
   * Removes all the entries added into EvalDecisionDetails.
   * <p>
   * Returns a reference to this object so that method calls can be chained together.
   */
  public ResourceSpecificResult clearEvalDecisionDetailsEntries() {
    this.evalDecisionDetails = null;
    return this;
  }
  
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getEvalResourceName() != null) sb.append("EvalResourceName: " + getEvalResourceName() + ",");
        if (getEvalResourceDecision() != null) sb.append("EvalResourceDecision: " + getEvalResourceDecision() + ",");
        if (getMatchedStatements() != null) sb.append("MatchedStatements: " + getMatchedStatements() + ",");
        if (getMissingContextValues() != null) sb.append("MissingContextValues: " + getMissingContextValues() + ",");
        if (getEvalDecisionDetails() != null) sb.append("EvalDecisionDetails: " + getEvalDecisionDetails() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getEvalResourceName() == null) ? 0 : getEvalResourceName().hashCode()); 
        hashCode = prime * hashCode + ((getEvalResourceDecision() == null) ? 0 : getEvalResourceDecision().hashCode()); 
        hashCode = prime * hashCode + ((getMatchedStatements() == null) ? 0 : getMatchedStatements().hashCode()); 
        hashCode = prime * hashCode + ((getMissingContextValues() == null) ? 0 : getMissingContextValues().hashCode()); 
        hashCode = prime * hashCode + ((getEvalDecisionDetails() == null) ? 0 : getEvalDecisionDetails().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ResourceSpecificResult == false) return false;
        ResourceSpecificResult other = (ResourceSpecificResult)obj;
        
        if (other.getEvalResourceName() == null ^ this.getEvalResourceName() == null) return false;
        if (other.getEvalResourceName() != null && other.getEvalResourceName().equals(this.getEvalResourceName()) == false) return false; 
        if (other.getEvalResourceDecision() == null ^ this.getEvalResourceDecision() == null) return false;
        if (other.getEvalResourceDecision() != null && other.getEvalResourceDecision().equals(this.getEvalResourceDecision()) == false) return false; 
        if (other.getMatchedStatements() == null ^ this.getMatchedStatements() == null) return false;
        if (other.getMatchedStatements() != null && other.getMatchedStatements().equals(this.getMatchedStatements()) == false) return false; 
        if (other.getMissingContextValues() == null ^ this.getMissingContextValues() == null) return false;
        if (other.getMissingContextValues() != null && other.getMissingContextValues().equals(this.getMissingContextValues()) == false) return false; 
        if (other.getEvalDecisionDetails() == null ^ this.getEvalDecisionDetails() == null) return false;
        if (other.getEvalDecisionDetails() != null && other.getEvalDecisionDetails().equals(this.getEvalDecisionDetails()) == false) return false; 
        return true;
    }
    
    @Override
    public ResourceSpecificResult clone() {
        try {
            return (ResourceSpecificResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    