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
 * Contains the results of a simulation.
 * </p>
 * <p>
 * This data type is used by the return parameter of <code>
 * SimulatePolicy </code> .
 * </p>
 */
public class EvaluationResult implements Serializable, Cloneable {

    /**
     * The name of the API action tested on the indicated resource.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 128<br/>
     */
    private String evalActionName;

    /**
     * The ARN of the resource that the indicated API action was tested on.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String evalResourceName;

    /**
     * The result of the simulation.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>allowed, explicitDeny, implicitDeny
     */
    private String evalDecision;

    /**
     * A list of the statements in the input policies that determine the
     * result for this scenario. Remember that even if multiple statements
     * allow the action on the resource, if only one statement denies that
     * action, then the explicit deny overrides any allow, and the deny
     * statement is the only entry included in the result.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Statement> matchedStatements;

    /**
     * A list of context keys that are required by the included input
     * policies but that were not provided by one of the input parameters. To
     * discover the context keys used by a set of policies, you can call
     * <a>GetContextKeysForCustomPolicy</a> or
     * <a>GetContextKeysForPrincipalPolicy</a>. <caution> <p>If the response
     * includes any keys in this list, then the reported results might be
     * untrustworthy because the simulation could not completely evaluate all
     * of the conditions specified in the policies that would occur in a real
     * world request. </caution>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> missingContextValues;

    /**
     * Additional details about the results of the evaluation decision. When
     * there are both IAM policies and resource policies, this parameter
     * explains how each set of policies contributes to the final evaluation
     * decision. When simulating cross-account access to a resource, both the
     * resource-based policy and the caller's IAM policy must grant access.
     * See <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_compare-resource-policies.html">How
     * IAM Roles Differ from Resource-based Policies</a>
     */
    private java.util.Map<String,String> evalDecisionDetails;

    /**
     * The individual results of the simulation of the API action specified
     * in EvalActionName on each resource.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<ResourceSpecificResult> resourceSpecificResults;

    /**
     * The name of the API action tested on the indicated resource.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 128<br/>
     *
     * @return The name of the API action tested on the indicated resource.
     */
    public String getEvalActionName() {
        return evalActionName;
    }
    
    /**
     * The name of the API action tested on the indicated resource.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 128<br/>
     *
     * @param evalActionName The name of the API action tested on the indicated resource.
     */
    public void setEvalActionName(String evalActionName) {
        this.evalActionName = evalActionName;
    }
    
    /**
     * The name of the API action tested on the indicated resource.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 128<br/>
     *
     * @param evalActionName The name of the API action tested on the indicated resource.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public EvaluationResult withEvalActionName(String evalActionName) {
        this.evalActionName = evalActionName;
        return this;
    }

    /**
     * The ARN of the resource that the indicated API action was tested on.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return The ARN of the resource that the indicated API action was tested on.
     */
    public String getEvalResourceName() {
        return evalResourceName;
    }
    
    /**
     * The ARN of the resource that the indicated API action was tested on.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param evalResourceName The ARN of the resource that the indicated API action was tested on.
     */
    public void setEvalResourceName(String evalResourceName) {
        this.evalResourceName = evalResourceName;
    }
    
    /**
     * The ARN of the resource that the indicated API action was tested on.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param evalResourceName The ARN of the resource that the indicated API action was tested on.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public EvaluationResult withEvalResourceName(String evalResourceName) {
        this.evalResourceName = evalResourceName;
        return this;
    }

    /**
     * The result of the simulation.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>allowed, explicitDeny, implicitDeny
     *
     * @return The result of the simulation.
     *
     * @see PolicyEvaluationDecisionType
     */
    public String getEvalDecision() {
        return evalDecision;
    }
    
    /**
     * The result of the simulation.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>allowed, explicitDeny, implicitDeny
     *
     * @param evalDecision The result of the simulation.
     *
     * @see PolicyEvaluationDecisionType
     */
    public void setEvalDecision(String evalDecision) {
        this.evalDecision = evalDecision;
    }
    
    /**
     * The result of the simulation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>allowed, explicitDeny, implicitDeny
     *
     * @param evalDecision The result of the simulation.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see PolicyEvaluationDecisionType
     */
    public EvaluationResult withEvalDecision(String evalDecision) {
        this.evalDecision = evalDecision;
        return this;
    }

    /**
     * The result of the simulation.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>allowed, explicitDeny, implicitDeny
     *
     * @param evalDecision The result of the simulation.
     *
     * @see PolicyEvaluationDecisionType
     */
    public void setEvalDecision(PolicyEvaluationDecisionType evalDecision) {
        this.evalDecision = evalDecision.toString();
    }
    
    /**
     * The result of the simulation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>allowed, explicitDeny, implicitDeny
     *
     * @param evalDecision The result of the simulation.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see PolicyEvaluationDecisionType
     */
    public EvaluationResult withEvalDecision(PolicyEvaluationDecisionType evalDecision) {
        this.evalDecision = evalDecision.toString();
        return this;
    }

    /**
     * A list of the statements in the input policies that determine the
     * result for this scenario. Remember that even if multiple statements
     * allow the action on the resource, if only one statement denies that
     * action, then the explicit deny overrides any allow, and the deny
     * statement is the only entry included in the result.
     *
     * @return A list of the statements in the input policies that determine the
     *         result for this scenario. Remember that even if multiple statements
     *         allow the action on the resource, if only one statement denies that
     *         action, then the explicit deny overrides any allow, and the deny
     *         statement is the only entry included in the result.
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
     * result for this scenario. Remember that even if multiple statements
     * allow the action on the resource, if only one statement denies that
     * action, then the explicit deny overrides any allow, and the deny
     * statement is the only entry included in the result.
     *
     * @param matchedStatements A list of the statements in the input policies that determine the
     *         result for this scenario. Remember that even if multiple statements
     *         allow the action on the resource, if only one statement denies that
     *         action, then the explicit deny overrides any allow, and the deny
     *         statement is the only entry included in the result.
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
     * result for this scenario. Remember that even if multiple statements
     * allow the action on the resource, if only one statement denies that
     * action, then the explicit deny overrides any allow, and the deny
     * statement is the only entry included in the result.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setMatchedStatements(java.util.Collection)} or
     * {@link #withMatchedStatements(java.util.Collection)} if you want to
     * override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param matchedStatements A list of the statements in the input policies that determine the
     *         result for this scenario. Remember that even if multiple statements
     *         allow the action on the resource, if only one statement denies that
     *         action, then the explicit deny overrides any allow, and the deny
     *         statement is the only entry included in the result.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public EvaluationResult withMatchedStatements(Statement... matchedStatements) {
        if (getMatchedStatements() == null) setMatchedStatements(new java.util.ArrayList<Statement>(matchedStatements.length));
        for (Statement value : matchedStatements) {
            getMatchedStatements().add(value);
        }
        return this;
    }
    
    /**
     * A list of the statements in the input policies that determine the
     * result for this scenario. Remember that even if multiple statements
     * allow the action on the resource, if only one statement denies that
     * action, then the explicit deny overrides any allow, and the deny
     * statement is the only entry included in the result.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param matchedStatements A list of the statements in the input policies that determine the
     *         result for this scenario. Remember that even if multiple statements
     *         allow the action on the resource, if only one statement denies that
     *         action, then the explicit deny overrides any allow, and the deny
     *         statement is the only entry included in the result.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public EvaluationResult withMatchedStatements(java.util.Collection<Statement> matchedStatements) {
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
     * <a>GetContextKeysForPrincipalPolicy</a>. <caution> <p>If the response
     * includes any keys in this list, then the reported results might be
     * untrustworthy because the simulation could not completely evaluate all
     * of the conditions specified in the policies that would occur in a real
     * world request. </caution>
     *
     * @return A list of context keys that are required by the included input
     *         policies but that were not provided by one of the input parameters. To
     *         discover the context keys used by a set of policies, you can call
     *         <a>GetContextKeysForCustomPolicy</a> or
     *         <a>GetContextKeysForPrincipalPolicy</a>. <caution> <p>If the response
     *         includes any keys in this list, then the reported results might be
     *         untrustworthy because the simulation could not completely evaluate all
     *         of the conditions specified in the policies that would occur in a real
     *         world request. </caution>
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
     * <a>GetContextKeysForPrincipalPolicy</a>. <caution> <p>If the response
     * includes any keys in this list, then the reported results might be
     * untrustworthy because the simulation could not completely evaluate all
     * of the conditions specified in the policies that would occur in a real
     * world request. </caution>
     *
     * @param missingContextValues A list of context keys that are required by the included input
     *         policies but that were not provided by one of the input parameters. To
     *         discover the context keys used by a set of policies, you can call
     *         <a>GetContextKeysForCustomPolicy</a> or
     *         <a>GetContextKeysForPrincipalPolicy</a>. <caution> <p>If the response
     *         includes any keys in this list, then the reported results might be
     *         untrustworthy because the simulation could not completely evaluate all
     *         of the conditions specified in the policies that would occur in a real
     *         world request. </caution>
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
     * <a>GetContextKeysForPrincipalPolicy</a>. <caution> <p>If the response
     * includes any keys in this list, then the reported results might be
     * untrustworthy because the simulation could not completely evaluate all
     * of the conditions specified in the policies that would occur in a real
     * world request. </caution>
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
     *         <a>GetContextKeysForPrincipalPolicy</a>. <caution> <p>If the response
     *         includes any keys in this list, then the reported results might be
     *         untrustworthy because the simulation could not completely evaluate all
     *         of the conditions specified in the policies that would occur in a real
     *         world request. </caution>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public EvaluationResult withMissingContextValues(String... missingContextValues) {
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
     * <a>GetContextKeysForPrincipalPolicy</a>. <caution> <p>If the response
     * includes any keys in this list, then the reported results might be
     * untrustworthy because the simulation could not completely evaluate all
     * of the conditions specified in the policies that would occur in a real
     * world request. </caution>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param missingContextValues A list of context keys that are required by the included input
     *         policies but that were not provided by one of the input parameters. To
     *         discover the context keys used by a set of policies, you can call
     *         <a>GetContextKeysForCustomPolicy</a> or
     *         <a>GetContextKeysForPrincipalPolicy</a>. <caution> <p>If the response
     *         includes any keys in this list, then the reported results might be
     *         untrustworthy because the simulation could not completely evaluate all
     *         of the conditions specified in the policies that would occur in a real
     *         world request. </caution>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public EvaluationResult withMissingContextValues(java.util.Collection<String> missingContextValues) {
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
     * See <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_compare-resource-policies.html">How
     * IAM Roles Differ from Resource-based Policies</a>
     *
     * @return Additional details about the results of the evaluation decision. When
     *         there are both IAM policies and resource policies, this parameter
     *         explains how each set of policies contributes to the final evaluation
     *         decision. When simulating cross-account access to a resource, both the
     *         resource-based policy and the caller's IAM policy must grant access.
     *         See <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_compare-resource-policies.html">How
     *         IAM Roles Differ from Resource-based Policies</a>
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
     * See <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_compare-resource-policies.html">How
     * IAM Roles Differ from Resource-based Policies</a>
     *
     * @param evalDecisionDetails Additional details about the results of the evaluation decision. When
     *         there are both IAM policies and resource policies, this parameter
     *         explains how each set of policies contributes to the final evaluation
     *         decision. When simulating cross-account access to a resource, both the
     *         resource-based policy and the caller's IAM policy must grant access.
     *         See <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_compare-resource-policies.html">How
     *         IAM Roles Differ from Resource-based Policies</a>
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
     * See <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_compare-resource-policies.html">How
     * IAM Roles Differ from Resource-based Policies</a>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param evalDecisionDetails Additional details about the results of the evaluation decision. When
     *         there are both IAM policies and resource policies, this parameter
     *         explains how each set of policies contributes to the final evaluation
     *         decision. When simulating cross-account access to a resource, both the
     *         resource-based policy and the caller's IAM policy must grant access.
     *         See <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_compare-resource-policies.html">How
     *         IAM Roles Differ from Resource-based Policies</a>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public EvaluationResult withEvalDecisionDetails(java.util.Map<String,String> evalDecisionDetails) {
        setEvalDecisionDetails(evalDecisionDetails);
        return this;
    }

    /**
     * Additional details about the results of the evaluation decision. When
     * there are both IAM policies and resource policies, this parameter
     * explains how each set of policies contributes to the final evaluation
     * decision. When simulating cross-account access to a resource, both the
     * resource-based policy and the caller's IAM policy must grant access.
     * See <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_compare-resource-policies.html">How
     * IAM Roles Differ from Resource-based Policies</a>
     * <p>
     * The method adds a new key-value pair into EvalDecisionDetails
     * parameter, and returns a reference to this object so that method calls
     * can be chained together.
     *
     * @param key The key of the entry to be added into EvalDecisionDetails.
     * @param value The corresponding value of the entry to be added into EvalDecisionDetails.
     */
  public EvaluationResult addEvalDecisionDetailsEntry(String key, String value) {
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
  public EvaluationResult clearEvalDecisionDetailsEntries() {
    this.evalDecisionDetails = null;
    return this;
  }
  
    /**
     * The individual results of the simulation of the API action specified
     * in EvalActionName on each resource.
     *
     * @return The individual results of the simulation of the API action specified
     *         in EvalActionName on each resource.
     */
    public java.util.List<ResourceSpecificResult> getResourceSpecificResults() {
        if (resourceSpecificResults == null) {
              resourceSpecificResults = new com.amazonaws.internal.ListWithAutoConstructFlag<ResourceSpecificResult>();
              resourceSpecificResults.setAutoConstruct(true);
        }
        return resourceSpecificResults;
    }
    
    /**
     * The individual results of the simulation of the API action specified
     * in EvalActionName on each resource.
     *
     * @param resourceSpecificResults The individual results of the simulation of the API action specified
     *         in EvalActionName on each resource.
     */
    public void setResourceSpecificResults(java.util.Collection<ResourceSpecificResult> resourceSpecificResults) {
        if (resourceSpecificResults == null) {
            this.resourceSpecificResults = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<ResourceSpecificResult> resourceSpecificResultsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ResourceSpecificResult>(resourceSpecificResults.size());
        resourceSpecificResultsCopy.addAll(resourceSpecificResults);
        this.resourceSpecificResults = resourceSpecificResultsCopy;
    }
    
    /**
     * The individual results of the simulation of the API action specified
     * in EvalActionName on each resource.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setResourceSpecificResults(java.util.Collection)} or
     * {@link #withResourceSpecificResults(java.util.Collection)} if you want
     * to override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resourceSpecificResults The individual results of the simulation of the API action specified
     *         in EvalActionName on each resource.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public EvaluationResult withResourceSpecificResults(ResourceSpecificResult... resourceSpecificResults) {
        if (getResourceSpecificResults() == null) setResourceSpecificResults(new java.util.ArrayList<ResourceSpecificResult>(resourceSpecificResults.length));
        for (ResourceSpecificResult value : resourceSpecificResults) {
            getResourceSpecificResults().add(value);
        }
        return this;
    }
    
    /**
     * The individual results of the simulation of the API action specified
     * in EvalActionName on each resource.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resourceSpecificResults The individual results of the simulation of the API action specified
     *         in EvalActionName on each resource.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public EvaluationResult withResourceSpecificResults(java.util.Collection<ResourceSpecificResult> resourceSpecificResults) {
        if (resourceSpecificResults == null) {
            this.resourceSpecificResults = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<ResourceSpecificResult> resourceSpecificResultsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ResourceSpecificResult>(resourceSpecificResults.size());
            resourceSpecificResultsCopy.addAll(resourceSpecificResults);
            this.resourceSpecificResults = resourceSpecificResultsCopy;
        }

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
        if (getEvalActionName() != null) sb.append("EvalActionName: " + getEvalActionName() + ",");
        if (getEvalResourceName() != null) sb.append("EvalResourceName: " + getEvalResourceName() + ",");
        if (getEvalDecision() != null) sb.append("EvalDecision: " + getEvalDecision() + ",");
        if (getMatchedStatements() != null) sb.append("MatchedStatements: " + getMatchedStatements() + ",");
        if (getMissingContextValues() != null) sb.append("MissingContextValues: " + getMissingContextValues() + ",");
        if (getEvalDecisionDetails() != null) sb.append("EvalDecisionDetails: " + getEvalDecisionDetails() + ",");
        if (getResourceSpecificResults() != null) sb.append("ResourceSpecificResults: " + getResourceSpecificResults() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getEvalActionName() == null) ? 0 : getEvalActionName().hashCode()); 
        hashCode = prime * hashCode + ((getEvalResourceName() == null) ? 0 : getEvalResourceName().hashCode()); 
        hashCode = prime * hashCode + ((getEvalDecision() == null) ? 0 : getEvalDecision().hashCode()); 
        hashCode = prime * hashCode + ((getMatchedStatements() == null) ? 0 : getMatchedStatements().hashCode()); 
        hashCode = prime * hashCode + ((getMissingContextValues() == null) ? 0 : getMissingContextValues().hashCode()); 
        hashCode = prime * hashCode + ((getEvalDecisionDetails() == null) ? 0 : getEvalDecisionDetails().hashCode()); 
        hashCode = prime * hashCode + ((getResourceSpecificResults() == null) ? 0 : getResourceSpecificResults().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof EvaluationResult == false) return false;
        EvaluationResult other = (EvaluationResult)obj;
        
        if (other.getEvalActionName() == null ^ this.getEvalActionName() == null) return false;
        if (other.getEvalActionName() != null && other.getEvalActionName().equals(this.getEvalActionName()) == false) return false; 
        if (other.getEvalResourceName() == null ^ this.getEvalResourceName() == null) return false;
        if (other.getEvalResourceName() != null && other.getEvalResourceName().equals(this.getEvalResourceName()) == false) return false; 
        if (other.getEvalDecision() == null ^ this.getEvalDecision() == null) return false;
        if (other.getEvalDecision() != null && other.getEvalDecision().equals(this.getEvalDecision()) == false) return false; 
        if (other.getMatchedStatements() == null ^ this.getMatchedStatements() == null) return false;
        if (other.getMatchedStatements() != null && other.getMatchedStatements().equals(this.getMatchedStatements()) == false) return false; 
        if (other.getMissingContextValues() == null ^ this.getMissingContextValues() == null) return false;
        if (other.getMissingContextValues() != null && other.getMissingContextValues().equals(this.getMissingContextValues()) == false) return false; 
        if (other.getEvalDecisionDetails() == null ^ this.getEvalDecisionDetails() == null) return false;
        if (other.getEvalDecisionDetails() != null && other.getEvalDecisionDetails().equals(this.getEvalDecisionDetails()) == false) return false; 
        if (other.getResourceSpecificResults() == null ^ this.getResourceSpecificResults() == null) return false;
        if (other.getResourceSpecificResults() != null && other.getResourceSpecificResults().equals(this.getResourceSpecificResults()) == false) return false; 
        return true;
    }
    
    @Override
    public EvaluationResult clone() {
        try {
            return (EvaluationResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    