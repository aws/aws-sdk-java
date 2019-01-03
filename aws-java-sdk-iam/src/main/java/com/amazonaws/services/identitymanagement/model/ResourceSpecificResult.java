/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the result of the simulation of a single API operation call on a single resource.
 * </p>
 * <p>
 * This data type is used by a member of the <a>EvaluationResult</a> data type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/ResourceSpecificResult" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceSpecificResult implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the simulated resource, in Amazon Resource Name (ARN) format.
     * </p>
     */
    private String evalResourceName;
    /**
     * <p>
     * The result of the simulation of the simulated API operation on the resource specified in
     * <code>EvalResourceName</code>.
     * </p>
     */
    private String evalResourceDecision;
    /**
     * <p>
     * A list of the statements in the input policies that determine the result for this part of the simulation.
     * Remember that even if multiple statements allow the operation on the resource, if <i>any</i> statement denies
     * that operation, then the explicit deny overrides any allow. In addition, the deny statement is the only entry
     * included in the result.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Statement> matchedStatements;
    /**
     * <p>
     * A list of context keys that are required by the included input policies but that were not provided by one of the
     * input parameters. This list is used when a list of ARNs is included in the <code>ResourceArns</code> parameter
     * instead of "*". If you do not specify individual resources, by setting <code>ResourceArns</code> to "*" or by not
     * including the <code>ResourceArns</code> parameter, then any missing context values are instead included under the
     * <code>EvaluationResults</code> section. To discover the context keys used by a set of policies, you can call
     * <a>GetContextKeysForCustomPolicy</a> or <a>GetContextKeysForPrincipalPolicy</a>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> missingContextValues;
    /**
     * <p>
     * Additional details about the results of the evaluation decision. When there are both IAM policies and resource
     * policies, this parameter explains how each set of policies contributes to the final evaluation decision. When
     * simulating cross-account access to a resource, both the resource-based policy and the caller's IAM policy must
     * grant access.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalMap<String, String> evalDecisionDetails;

    /**
     * <p>
     * The name of the simulated resource, in Amazon Resource Name (ARN) format.
     * </p>
     * 
     * @param evalResourceName
     *        The name of the simulated resource, in Amazon Resource Name (ARN) format.
     */

    public void setEvalResourceName(String evalResourceName) {
        this.evalResourceName = evalResourceName;
    }

    /**
     * <p>
     * The name of the simulated resource, in Amazon Resource Name (ARN) format.
     * </p>
     * 
     * @return The name of the simulated resource, in Amazon Resource Name (ARN) format.
     */

    public String getEvalResourceName() {
        return this.evalResourceName;
    }

    /**
     * <p>
     * The name of the simulated resource, in Amazon Resource Name (ARN) format.
     * </p>
     * 
     * @param evalResourceName
     *        The name of the simulated resource, in Amazon Resource Name (ARN) format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceSpecificResult withEvalResourceName(String evalResourceName) {
        setEvalResourceName(evalResourceName);
        return this;
    }

    /**
     * <p>
     * The result of the simulation of the simulated API operation on the resource specified in
     * <code>EvalResourceName</code>.
     * </p>
     * 
     * @param evalResourceDecision
     *        The result of the simulation of the simulated API operation on the resource specified in
     *        <code>EvalResourceName</code>.
     * @see PolicyEvaluationDecisionType
     */

    public void setEvalResourceDecision(String evalResourceDecision) {
        this.evalResourceDecision = evalResourceDecision;
    }

    /**
     * <p>
     * The result of the simulation of the simulated API operation on the resource specified in
     * <code>EvalResourceName</code>.
     * </p>
     * 
     * @return The result of the simulation of the simulated API operation on the resource specified in
     *         <code>EvalResourceName</code>.
     * @see PolicyEvaluationDecisionType
     */

    public String getEvalResourceDecision() {
        return this.evalResourceDecision;
    }

    /**
     * <p>
     * The result of the simulation of the simulated API operation on the resource specified in
     * <code>EvalResourceName</code>.
     * </p>
     * 
     * @param evalResourceDecision
     *        The result of the simulation of the simulated API operation on the resource specified in
     *        <code>EvalResourceName</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PolicyEvaluationDecisionType
     */

    public ResourceSpecificResult withEvalResourceDecision(String evalResourceDecision) {
        setEvalResourceDecision(evalResourceDecision);
        return this;
    }

    /**
     * <p>
     * The result of the simulation of the simulated API operation on the resource specified in
     * <code>EvalResourceName</code>.
     * </p>
     * 
     * @param evalResourceDecision
     *        The result of the simulation of the simulated API operation on the resource specified in
     *        <code>EvalResourceName</code>.
     * @see PolicyEvaluationDecisionType
     */

    public void setEvalResourceDecision(PolicyEvaluationDecisionType evalResourceDecision) {
        withEvalResourceDecision(evalResourceDecision);
    }

    /**
     * <p>
     * The result of the simulation of the simulated API operation on the resource specified in
     * <code>EvalResourceName</code>.
     * </p>
     * 
     * @param evalResourceDecision
     *        The result of the simulation of the simulated API operation on the resource specified in
     *        <code>EvalResourceName</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PolicyEvaluationDecisionType
     */

    public ResourceSpecificResult withEvalResourceDecision(PolicyEvaluationDecisionType evalResourceDecision) {
        this.evalResourceDecision = evalResourceDecision.toString();
        return this;
    }

    /**
     * <p>
     * A list of the statements in the input policies that determine the result for this part of the simulation.
     * Remember that even if multiple statements allow the operation on the resource, if <i>any</i> statement denies
     * that operation, then the explicit deny overrides any allow. In addition, the deny statement is the only entry
     * included in the result.
     * </p>
     * 
     * @return A list of the statements in the input policies that determine the result for this part of the simulation.
     *         Remember that even if multiple statements allow the operation on the resource, if <i>any</i> statement
     *         denies that operation, then the explicit deny overrides any allow. In addition, the deny statement is the
     *         only entry included in the result.
     */

    public java.util.List<Statement> getMatchedStatements() {
        if (matchedStatements == null) {
            matchedStatements = new com.amazonaws.internal.SdkInternalList<Statement>();
        }
        return matchedStatements;
    }

    /**
     * <p>
     * A list of the statements in the input policies that determine the result for this part of the simulation.
     * Remember that even if multiple statements allow the operation on the resource, if <i>any</i> statement denies
     * that operation, then the explicit deny overrides any allow. In addition, the deny statement is the only entry
     * included in the result.
     * </p>
     * 
     * @param matchedStatements
     *        A list of the statements in the input policies that determine the result for this part of the simulation.
     *        Remember that even if multiple statements allow the operation on the resource, if <i>any</i> statement
     *        denies that operation, then the explicit deny overrides any allow. In addition, the deny statement is the
     *        only entry included in the result.
     */

    public void setMatchedStatements(java.util.Collection<Statement> matchedStatements) {
        if (matchedStatements == null) {
            this.matchedStatements = null;
            return;
        }

        this.matchedStatements = new com.amazonaws.internal.SdkInternalList<Statement>(matchedStatements);
    }

    /**
     * <p>
     * A list of the statements in the input policies that determine the result for this part of the simulation.
     * Remember that even if multiple statements allow the operation on the resource, if <i>any</i> statement denies
     * that operation, then the explicit deny overrides any allow. In addition, the deny statement is the only entry
     * included in the result.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMatchedStatements(java.util.Collection)} or {@link #withMatchedStatements(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param matchedStatements
     *        A list of the statements in the input policies that determine the result for this part of the simulation.
     *        Remember that even if multiple statements allow the operation on the resource, if <i>any</i> statement
     *        denies that operation, then the explicit deny overrides any allow. In addition, the deny statement is the
     *        only entry included in the result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceSpecificResult withMatchedStatements(Statement... matchedStatements) {
        if (this.matchedStatements == null) {
            setMatchedStatements(new com.amazonaws.internal.SdkInternalList<Statement>(matchedStatements.length));
        }
        for (Statement ele : matchedStatements) {
            this.matchedStatements.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the statements in the input policies that determine the result for this part of the simulation.
     * Remember that even if multiple statements allow the operation on the resource, if <i>any</i> statement denies
     * that operation, then the explicit deny overrides any allow. In addition, the deny statement is the only entry
     * included in the result.
     * </p>
     * 
     * @param matchedStatements
     *        A list of the statements in the input policies that determine the result for this part of the simulation.
     *        Remember that even if multiple statements allow the operation on the resource, if <i>any</i> statement
     *        denies that operation, then the explicit deny overrides any allow. In addition, the deny statement is the
     *        only entry included in the result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceSpecificResult withMatchedStatements(java.util.Collection<Statement> matchedStatements) {
        setMatchedStatements(matchedStatements);
        return this;
    }

    /**
     * <p>
     * A list of context keys that are required by the included input policies but that were not provided by one of the
     * input parameters. This list is used when a list of ARNs is included in the <code>ResourceArns</code> parameter
     * instead of "*". If you do not specify individual resources, by setting <code>ResourceArns</code> to "*" or by not
     * including the <code>ResourceArns</code> parameter, then any missing context values are instead included under the
     * <code>EvaluationResults</code> section. To discover the context keys used by a set of policies, you can call
     * <a>GetContextKeysForCustomPolicy</a> or <a>GetContextKeysForPrincipalPolicy</a>.
     * </p>
     * 
     * @return A list of context keys that are required by the included input policies but that were not provided by one
     *         of the input parameters. This list is used when a list of ARNs is included in the
     *         <code>ResourceArns</code> parameter instead of "*". If you do not specify individual resources, by
     *         setting <code>ResourceArns</code> to "*" or by not including the <code>ResourceArns</code> parameter,
     *         then any missing context values are instead included under the <code>EvaluationResults</code> section. To
     *         discover the context keys used by a set of policies, you can call <a>GetContextKeysForCustomPolicy</a> or
     *         <a>GetContextKeysForPrincipalPolicy</a>.
     */

    public java.util.List<String> getMissingContextValues() {
        if (missingContextValues == null) {
            missingContextValues = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return missingContextValues;
    }

    /**
     * <p>
     * A list of context keys that are required by the included input policies but that were not provided by one of the
     * input parameters. This list is used when a list of ARNs is included in the <code>ResourceArns</code> parameter
     * instead of "*". If you do not specify individual resources, by setting <code>ResourceArns</code> to "*" or by not
     * including the <code>ResourceArns</code> parameter, then any missing context values are instead included under the
     * <code>EvaluationResults</code> section. To discover the context keys used by a set of policies, you can call
     * <a>GetContextKeysForCustomPolicy</a> or <a>GetContextKeysForPrincipalPolicy</a>.
     * </p>
     * 
     * @param missingContextValues
     *        A list of context keys that are required by the included input policies but that were not provided by one
     *        of the input parameters. This list is used when a list of ARNs is included in the
     *        <code>ResourceArns</code> parameter instead of "*". If you do not specify individual resources, by setting
     *        <code>ResourceArns</code> to "*" or by not including the <code>ResourceArns</code> parameter, then any
     *        missing context values are instead included under the <code>EvaluationResults</code> section. To discover
     *        the context keys used by a set of policies, you can call <a>GetContextKeysForCustomPolicy</a> or
     *        <a>GetContextKeysForPrincipalPolicy</a>.
     */

    public void setMissingContextValues(java.util.Collection<String> missingContextValues) {
        if (missingContextValues == null) {
            this.missingContextValues = null;
            return;
        }

        this.missingContextValues = new com.amazonaws.internal.SdkInternalList<String>(missingContextValues);
    }

    /**
     * <p>
     * A list of context keys that are required by the included input policies but that were not provided by one of the
     * input parameters. This list is used when a list of ARNs is included in the <code>ResourceArns</code> parameter
     * instead of "*". If you do not specify individual resources, by setting <code>ResourceArns</code> to "*" or by not
     * including the <code>ResourceArns</code> parameter, then any missing context values are instead included under the
     * <code>EvaluationResults</code> section. To discover the context keys used by a set of policies, you can call
     * <a>GetContextKeysForCustomPolicy</a> or <a>GetContextKeysForPrincipalPolicy</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMissingContextValues(java.util.Collection)} or {@link #withMissingContextValues(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param missingContextValues
     *        A list of context keys that are required by the included input policies but that were not provided by one
     *        of the input parameters. This list is used when a list of ARNs is included in the
     *        <code>ResourceArns</code> parameter instead of "*". If you do not specify individual resources, by setting
     *        <code>ResourceArns</code> to "*" or by not including the <code>ResourceArns</code> parameter, then any
     *        missing context values are instead included under the <code>EvaluationResults</code> section. To discover
     *        the context keys used by a set of policies, you can call <a>GetContextKeysForCustomPolicy</a> or
     *        <a>GetContextKeysForPrincipalPolicy</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceSpecificResult withMissingContextValues(String... missingContextValues) {
        if (this.missingContextValues == null) {
            setMissingContextValues(new com.amazonaws.internal.SdkInternalList<String>(missingContextValues.length));
        }
        for (String ele : missingContextValues) {
            this.missingContextValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of context keys that are required by the included input policies but that were not provided by one of the
     * input parameters. This list is used when a list of ARNs is included in the <code>ResourceArns</code> parameter
     * instead of "*". If you do not specify individual resources, by setting <code>ResourceArns</code> to "*" or by not
     * including the <code>ResourceArns</code> parameter, then any missing context values are instead included under the
     * <code>EvaluationResults</code> section. To discover the context keys used by a set of policies, you can call
     * <a>GetContextKeysForCustomPolicy</a> or <a>GetContextKeysForPrincipalPolicy</a>.
     * </p>
     * 
     * @param missingContextValues
     *        A list of context keys that are required by the included input policies but that were not provided by one
     *        of the input parameters. This list is used when a list of ARNs is included in the
     *        <code>ResourceArns</code> parameter instead of "*". If you do not specify individual resources, by setting
     *        <code>ResourceArns</code> to "*" or by not including the <code>ResourceArns</code> parameter, then any
     *        missing context values are instead included under the <code>EvaluationResults</code> section. To discover
     *        the context keys used by a set of policies, you can call <a>GetContextKeysForCustomPolicy</a> or
     *        <a>GetContextKeysForPrincipalPolicy</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceSpecificResult withMissingContextValues(java.util.Collection<String> missingContextValues) {
        setMissingContextValues(missingContextValues);
        return this;
    }

    /**
     * <p>
     * Additional details about the results of the evaluation decision. When there are both IAM policies and resource
     * policies, this parameter explains how each set of policies contributes to the final evaluation decision. When
     * simulating cross-account access to a resource, both the resource-based policy and the caller's IAM policy must
     * grant access.
     * </p>
     * 
     * @return Additional details about the results of the evaluation decision. When there are both IAM policies and
     *         resource policies, this parameter explains how each set of policies contributes to the final evaluation
     *         decision. When simulating cross-account access to a resource, both the resource-based policy and the
     *         caller's IAM policy must grant access.
     */

    public java.util.Map<String, String> getEvalDecisionDetails() {
        if (evalDecisionDetails == null) {
            evalDecisionDetails = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        return evalDecisionDetails;
    }

    /**
     * <p>
     * Additional details about the results of the evaluation decision. When there are both IAM policies and resource
     * policies, this parameter explains how each set of policies contributes to the final evaluation decision. When
     * simulating cross-account access to a resource, both the resource-based policy and the caller's IAM policy must
     * grant access.
     * </p>
     * 
     * @param evalDecisionDetails
     *        Additional details about the results of the evaluation decision. When there are both IAM policies and
     *        resource policies, this parameter explains how each set of policies contributes to the final evaluation
     *        decision. When simulating cross-account access to a resource, both the resource-based policy and the
     *        caller's IAM policy must grant access.
     */

    public void setEvalDecisionDetails(java.util.Map<String, String> evalDecisionDetails) {
        this.evalDecisionDetails = evalDecisionDetails == null ? null : new com.amazonaws.internal.SdkInternalMap<String, String>(evalDecisionDetails);
    }

    /**
     * <p>
     * Additional details about the results of the evaluation decision. When there are both IAM policies and resource
     * policies, this parameter explains how each set of policies contributes to the final evaluation decision. When
     * simulating cross-account access to a resource, both the resource-based policy and the caller's IAM policy must
     * grant access.
     * </p>
     * 
     * @param evalDecisionDetails
     *        Additional details about the results of the evaluation decision. When there are both IAM policies and
     *        resource policies, this parameter explains how each set of policies contributes to the final evaluation
     *        decision. When simulating cross-account access to a resource, both the resource-based policy and the
     *        caller's IAM policy must grant access.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceSpecificResult withEvalDecisionDetails(java.util.Map<String, String> evalDecisionDetails) {
        setEvalDecisionDetails(evalDecisionDetails);
        return this;
    }

    public ResourceSpecificResult addEvalDecisionDetailsEntry(String key, String value) {
        if (null == this.evalDecisionDetails) {
            this.evalDecisionDetails = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        if (this.evalDecisionDetails.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.evalDecisionDetails.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into EvalDecisionDetails.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceSpecificResult clearEvalDecisionDetailsEntries() {
        this.evalDecisionDetails = null;
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getEvalResourceName() != null)
            sb.append("EvalResourceName: ").append(getEvalResourceName()).append(",");
        if (getEvalResourceDecision() != null)
            sb.append("EvalResourceDecision: ").append(getEvalResourceDecision()).append(",");
        if (getMatchedStatements() != null)
            sb.append("MatchedStatements: ").append(getMatchedStatements()).append(",");
        if (getMissingContextValues() != null)
            sb.append("MissingContextValues: ").append(getMissingContextValues()).append(",");
        if (getEvalDecisionDetails() != null)
            sb.append("EvalDecisionDetails: ").append(getEvalDecisionDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceSpecificResult == false)
            return false;
        ResourceSpecificResult other = (ResourceSpecificResult) obj;
        if (other.getEvalResourceName() == null ^ this.getEvalResourceName() == null)
            return false;
        if (other.getEvalResourceName() != null && other.getEvalResourceName().equals(this.getEvalResourceName()) == false)
            return false;
        if (other.getEvalResourceDecision() == null ^ this.getEvalResourceDecision() == null)
            return false;
        if (other.getEvalResourceDecision() != null && other.getEvalResourceDecision().equals(this.getEvalResourceDecision()) == false)
            return false;
        if (other.getMatchedStatements() == null ^ this.getMatchedStatements() == null)
            return false;
        if (other.getMatchedStatements() != null && other.getMatchedStatements().equals(this.getMatchedStatements()) == false)
            return false;
        if (other.getMissingContextValues() == null ^ this.getMissingContextValues() == null)
            return false;
        if (other.getMissingContextValues() != null && other.getMissingContextValues().equals(this.getMissingContextValues()) == false)
            return false;
        if (other.getEvalDecisionDetails() == null ^ this.getEvalDecisionDetails() == null)
            return false;
        if (other.getEvalDecisionDetails() != null && other.getEvalDecisionDetails().equals(this.getEvalDecisionDetails()) == false)
            return false;
        return true;
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
    public ResourceSpecificResult clone() {
        try {
            return (ResourceSpecificResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
