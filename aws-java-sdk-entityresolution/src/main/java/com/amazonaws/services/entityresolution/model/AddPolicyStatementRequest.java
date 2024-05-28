/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.entityresolution.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/AddPolicyStatement"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddPolicyStatementRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The action that the principal can use on the resource.
     * </p>
     * <p>
     * For example, <code>entityresolution:GetIdMappingJob</code>, <code>entityresolution:GetMatchingJob</code>.
     * </p>
     */
    private java.util.List<String> action;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource that will be accessed by the principal.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * A set of condition keys that you can use in key policies.
     * </p>
     */
    private String condition;
    /**
     * <p>
     * Determines whether the permissions specified in the policy are to be allowed (<code>Allow</code>) or denied (
     * <code>Deny</code>).
     * </p>
     */
    private String effect;
    /**
     * <p>
     * The Amazon Web Services service or Amazon Web Services account that can access the resource defined as ARN.
     * </p>
     */
    private java.util.List<String> principal;
    /**
     * <p>
     * A statement identifier that differentiates the statement from others in the same policy.
     * </p>
     */
    private String statementId;

    /**
     * <p>
     * The action that the principal can use on the resource.
     * </p>
     * <p>
     * For example, <code>entityresolution:GetIdMappingJob</code>, <code>entityresolution:GetMatchingJob</code>.
     * </p>
     * 
     * @return The action that the principal can use on the resource. </p>
     *         <p>
     *         For example, <code>entityresolution:GetIdMappingJob</code>, <code>entityresolution:GetMatchingJob</code>.
     */

    public java.util.List<String> getAction() {
        return action;
    }

    /**
     * <p>
     * The action that the principal can use on the resource.
     * </p>
     * <p>
     * For example, <code>entityresolution:GetIdMappingJob</code>, <code>entityresolution:GetMatchingJob</code>.
     * </p>
     * 
     * @param action
     *        The action that the principal can use on the resource. </p>
     *        <p>
     *        For example, <code>entityresolution:GetIdMappingJob</code>, <code>entityresolution:GetMatchingJob</code>.
     */

    public void setAction(java.util.Collection<String> action) {
        if (action == null) {
            this.action = null;
            return;
        }

        this.action = new java.util.ArrayList<String>(action);
    }

    /**
     * <p>
     * The action that the principal can use on the resource.
     * </p>
     * <p>
     * For example, <code>entityresolution:GetIdMappingJob</code>, <code>entityresolution:GetMatchingJob</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAction(java.util.Collection)} or {@link #withAction(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param action
     *        The action that the principal can use on the resource. </p>
     *        <p>
     *        For example, <code>entityresolution:GetIdMappingJob</code>, <code>entityresolution:GetMatchingJob</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddPolicyStatementRequest withAction(String... action) {
        if (this.action == null) {
            setAction(new java.util.ArrayList<String>(action.length));
        }
        for (String ele : action) {
            this.action.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The action that the principal can use on the resource.
     * </p>
     * <p>
     * For example, <code>entityresolution:GetIdMappingJob</code>, <code>entityresolution:GetMatchingJob</code>.
     * </p>
     * 
     * @param action
     *        The action that the principal can use on the resource. </p>
     *        <p>
     *        For example, <code>entityresolution:GetIdMappingJob</code>, <code>entityresolution:GetMatchingJob</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddPolicyStatementRequest withAction(java.util.Collection<String> action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource that will be accessed by the principal.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the resource that will be accessed by the principal.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource that will be accessed by the principal.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the resource that will be accessed by the principal.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource that will be accessed by the principal.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the resource that will be accessed by the principal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddPolicyStatementRequest withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * A set of condition keys that you can use in key policies.
     * </p>
     * 
     * @param condition
     *        A set of condition keys that you can use in key policies.
     */

    public void setCondition(String condition) {
        this.condition = condition;
    }

    /**
     * <p>
     * A set of condition keys that you can use in key policies.
     * </p>
     * 
     * @return A set of condition keys that you can use in key policies.
     */

    public String getCondition() {
        return this.condition;
    }

    /**
     * <p>
     * A set of condition keys that you can use in key policies.
     * </p>
     * 
     * @param condition
     *        A set of condition keys that you can use in key policies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddPolicyStatementRequest withCondition(String condition) {
        setCondition(condition);
        return this;
    }

    /**
     * <p>
     * Determines whether the permissions specified in the policy are to be allowed (<code>Allow</code>) or denied (
     * <code>Deny</code>).
     * </p>
     * 
     * @param effect
     *        Determines whether the permissions specified in the policy are to be allowed (<code>Allow</code>) or
     *        denied (<code>Deny</code>).
     * @see StatementEffect
     */

    public void setEffect(String effect) {
        this.effect = effect;
    }

    /**
     * <p>
     * Determines whether the permissions specified in the policy are to be allowed (<code>Allow</code>) or denied (
     * <code>Deny</code>).
     * </p>
     * 
     * @return Determines whether the permissions specified in the policy are to be allowed (<code>Allow</code>) or
     *         denied (<code>Deny</code>).
     * @see StatementEffect
     */

    public String getEffect() {
        return this.effect;
    }

    /**
     * <p>
     * Determines whether the permissions specified in the policy are to be allowed (<code>Allow</code>) or denied (
     * <code>Deny</code>).
     * </p>
     * 
     * @param effect
     *        Determines whether the permissions specified in the policy are to be allowed (<code>Allow</code>) or
     *        denied (<code>Deny</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StatementEffect
     */

    public AddPolicyStatementRequest withEffect(String effect) {
        setEffect(effect);
        return this;
    }

    /**
     * <p>
     * Determines whether the permissions specified in the policy are to be allowed (<code>Allow</code>) or denied (
     * <code>Deny</code>).
     * </p>
     * 
     * @param effect
     *        Determines whether the permissions specified in the policy are to be allowed (<code>Allow</code>) or
     *        denied (<code>Deny</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StatementEffect
     */

    public AddPolicyStatementRequest withEffect(StatementEffect effect) {
        this.effect = effect.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services service or Amazon Web Services account that can access the resource defined as ARN.
     * </p>
     * 
     * @return The Amazon Web Services service or Amazon Web Services account that can access the resource defined as
     *         ARN.
     */

    public java.util.List<String> getPrincipal() {
        return principal;
    }

    /**
     * <p>
     * The Amazon Web Services service or Amazon Web Services account that can access the resource defined as ARN.
     * </p>
     * 
     * @param principal
     *        The Amazon Web Services service or Amazon Web Services account that can access the resource defined as
     *        ARN.
     */

    public void setPrincipal(java.util.Collection<String> principal) {
        if (principal == null) {
            this.principal = null;
            return;
        }

        this.principal = new java.util.ArrayList<String>(principal);
    }

    /**
     * <p>
     * The Amazon Web Services service or Amazon Web Services account that can access the resource defined as ARN.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPrincipal(java.util.Collection)} or {@link #withPrincipal(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param principal
     *        The Amazon Web Services service or Amazon Web Services account that can access the resource defined as
     *        ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddPolicyStatementRequest withPrincipal(String... principal) {
        if (this.principal == null) {
            setPrincipal(new java.util.ArrayList<String>(principal.length));
        }
        for (String ele : principal) {
            this.principal.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services service or Amazon Web Services account that can access the resource defined as ARN.
     * </p>
     * 
     * @param principal
     *        The Amazon Web Services service or Amazon Web Services account that can access the resource defined as
     *        ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddPolicyStatementRequest withPrincipal(java.util.Collection<String> principal) {
        setPrincipal(principal);
        return this;
    }

    /**
     * <p>
     * A statement identifier that differentiates the statement from others in the same policy.
     * </p>
     * 
     * @param statementId
     *        A statement identifier that differentiates the statement from others in the same policy.
     */

    public void setStatementId(String statementId) {
        this.statementId = statementId;
    }

    /**
     * <p>
     * A statement identifier that differentiates the statement from others in the same policy.
     * </p>
     * 
     * @return A statement identifier that differentiates the statement from others in the same policy.
     */

    public String getStatementId() {
        return this.statementId;
    }

    /**
     * <p>
     * A statement identifier that differentiates the statement from others in the same policy.
     * </p>
     * 
     * @param statementId
     *        A statement identifier that differentiates the statement from others in the same policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddPolicyStatementRequest withStatementId(String statementId) {
        setStatementId(statementId);
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
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCondition() != null)
            sb.append("Condition: ").append(getCondition()).append(",");
        if (getEffect() != null)
            sb.append("Effect: ").append(getEffect()).append(",");
        if (getPrincipal() != null)
            sb.append("Principal: ").append(getPrincipal()).append(",");
        if (getStatementId() != null)
            sb.append("StatementId: ").append(getStatementId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AddPolicyStatementRequest == false)
            return false;
        AddPolicyStatementRequest other = (AddPolicyStatementRequest) obj;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCondition() == null ^ this.getCondition() == null)
            return false;
        if (other.getCondition() != null && other.getCondition().equals(this.getCondition()) == false)
            return false;
        if (other.getEffect() == null ^ this.getEffect() == null)
            return false;
        if (other.getEffect() != null && other.getEffect().equals(this.getEffect()) == false)
            return false;
        if (other.getPrincipal() == null ^ this.getPrincipal() == null)
            return false;
        if (other.getPrincipal() != null && other.getPrincipal().equals(this.getPrincipal()) == false)
            return false;
        if (other.getStatementId() == null ^ this.getStatementId() == null)
            return false;
        if (other.getStatementId() != null && other.getStatementId().equals(this.getStatementId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCondition() == null) ? 0 : getCondition().hashCode());
        hashCode = prime * hashCode + ((getEffect() == null) ? 0 : getEffect().hashCode());
        hashCode = prime * hashCode + ((getPrincipal() == null) ? 0 : getPrincipal().hashCode());
        hashCode = prime * hashCode + ((getStatementId() == null) ? 0 : getStatementId().hashCode());
        return hashCode;
    }

    @Override
    public AddPolicyStatementRequest clone() {
        return (AddPolicyStatementRequest) super.clone();
    }

}
