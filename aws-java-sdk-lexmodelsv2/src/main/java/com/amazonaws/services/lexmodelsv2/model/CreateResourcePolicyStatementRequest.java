/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/CreateResourcePolicyStatement"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateResourcePolicyStatementRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the bot or bot alias that the resource policy is attached to.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * The name of the statement. The ID is the same as the <code>Sid</code> IAM property. The statement name must be
     * unique within the policy. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_sid.html">IAM JSON policy
     * elements: Sid</a>.
     * </p>
     */
    private String statementId;
    /**
     * <p>
     * Determines whether the statement allows or denies access to the resource.
     * </p>
     */
    private String effect;
    /**
     * <p>
     * An IAM principal, such as an IAM users, IAM roles, or AWS services that is allowed or denied access to a
     * resource. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_principal.html">AWS JSON
     * policy elements: Principal</a>.
     * </p>
     */
    private java.util.List<Principal> principal;
    /**
     * <p>
     * The Amazon Lex action that this policy either allows or denies. The action must apply to the resource type of the
     * specified ARN. For more information, see <a
     * href="https://docs.aws.amazon.com/service-authorization/latest/reference/list_amazonlexv2.html"> Actions,
     * resources, and condition keys for Amazon Lex V2</a>.
     * </p>
     */
    private java.util.List<String> action;
    /**
     * <p>
     * Specifies a condition when the policy is in effect. If the principal of the policy is a service principal, you
     * must provide two condition blocks, one with a SourceAccount global condition key and one with a SourceArn global
     * condition key.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_condition.html">IAM JSON
     * policy elements: Condition </a>.
     * </p>
     */
    private java.util.Map<String, java.util.Map<String, String>> condition;
    /**
     * <p>
     * The identifier of the revision of the policy to edit. If this revision ID doesn't match the current revision ID,
     * Amazon Lex throws an exception.
     * </p>
     * <p>
     * If you don't specify a revision, Amazon Lex overwrites the contents of the policy with the new values.
     * </p>
     */
    private String expectedRevisionId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the bot or bot alias that the resource policy is attached to.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the bot or bot alias that the resource policy is attached to.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the bot or bot alias that the resource policy is attached to.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the bot or bot alias that the resource policy is attached to.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the bot or bot alias that the resource policy is attached to.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the bot or bot alias that the resource policy is attached to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResourcePolicyStatementRequest withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * The name of the statement. The ID is the same as the <code>Sid</code> IAM property. The statement name must be
     * unique within the policy. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_sid.html">IAM JSON policy
     * elements: Sid</a>.
     * </p>
     * 
     * @param statementId
     *        The name of the statement. The ID is the same as the <code>Sid</code> IAM property. The statement name
     *        must be unique within the policy. For more information, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_sid.html">IAM JSON
     *        policy elements: Sid</a>.
     */

    public void setStatementId(String statementId) {
        this.statementId = statementId;
    }

    /**
     * <p>
     * The name of the statement. The ID is the same as the <code>Sid</code> IAM property. The statement name must be
     * unique within the policy. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_sid.html">IAM JSON policy
     * elements: Sid</a>.
     * </p>
     * 
     * @return The name of the statement. The ID is the same as the <code>Sid</code> IAM property. The statement name
     *         must be unique within the policy. For more information, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_sid.html">IAM JSON
     *         policy elements: Sid</a>.
     */

    public String getStatementId() {
        return this.statementId;
    }

    /**
     * <p>
     * The name of the statement. The ID is the same as the <code>Sid</code> IAM property. The statement name must be
     * unique within the policy. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_sid.html">IAM JSON policy
     * elements: Sid</a>.
     * </p>
     * 
     * @param statementId
     *        The name of the statement. The ID is the same as the <code>Sid</code> IAM property. The statement name
     *        must be unique within the policy. For more information, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_sid.html">IAM JSON
     *        policy elements: Sid</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResourcePolicyStatementRequest withStatementId(String statementId) {
        setStatementId(statementId);
        return this;
    }

    /**
     * <p>
     * Determines whether the statement allows or denies access to the resource.
     * </p>
     * 
     * @param effect
     *        Determines whether the statement allows or denies access to the resource.
     * @see Effect
     */

    public void setEffect(String effect) {
        this.effect = effect;
    }

    /**
     * <p>
     * Determines whether the statement allows or denies access to the resource.
     * </p>
     * 
     * @return Determines whether the statement allows or denies access to the resource.
     * @see Effect
     */

    public String getEffect() {
        return this.effect;
    }

    /**
     * <p>
     * Determines whether the statement allows or denies access to the resource.
     * </p>
     * 
     * @param effect
     *        Determines whether the statement allows or denies access to the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Effect
     */

    public CreateResourcePolicyStatementRequest withEffect(String effect) {
        setEffect(effect);
        return this;
    }

    /**
     * <p>
     * Determines whether the statement allows or denies access to the resource.
     * </p>
     * 
     * @param effect
     *        Determines whether the statement allows or denies access to the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Effect
     */

    public CreateResourcePolicyStatementRequest withEffect(Effect effect) {
        this.effect = effect.toString();
        return this;
    }

    /**
     * <p>
     * An IAM principal, such as an IAM users, IAM roles, or AWS services that is allowed or denied access to a
     * resource. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_principal.html">AWS JSON
     * policy elements: Principal</a>.
     * </p>
     * 
     * @return An IAM principal, such as an IAM users, IAM roles, or AWS services that is allowed or denied access to a
     *         resource. For more information, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_principal.html">AWS
     *         JSON policy elements: Principal</a>.
     */

    public java.util.List<Principal> getPrincipal() {
        return principal;
    }

    /**
     * <p>
     * An IAM principal, such as an IAM users, IAM roles, or AWS services that is allowed or denied access to a
     * resource. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_principal.html">AWS JSON
     * policy elements: Principal</a>.
     * </p>
     * 
     * @param principal
     *        An IAM principal, such as an IAM users, IAM roles, or AWS services that is allowed or denied access to a
     *        resource. For more information, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_principal.html">AWS
     *        JSON policy elements: Principal</a>.
     */

    public void setPrincipal(java.util.Collection<Principal> principal) {
        if (principal == null) {
            this.principal = null;
            return;
        }

        this.principal = new java.util.ArrayList<Principal>(principal);
    }

    /**
     * <p>
     * An IAM principal, such as an IAM users, IAM roles, or AWS services that is allowed or denied access to a
     * resource. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_principal.html">AWS JSON
     * policy elements: Principal</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPrincipal(java.util.Collection)} or {@link #withPrincipal(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param principal
     *        An IAM principal, such as an IAM users, IAM roles, or AWS services that is allowed or denied access to a
     *        resource. For more information, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_principal.html">AWS
     *        JSON policy elements: Principal</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResourcePolicyStatementRequest withPrincipal(Principal... principal) {
        if (this.principal == null) {
            setPrincipal(new java.util.ArrayList<Principal>(principal.length));
        }
        for (Principal ele : principal) {
            this.principal.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An IAM principal, such as an IAM users, IAM roles, or AWS services that is allowed or denied access to a
     * resource. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_principal.html">AWS JSON
     * policy elements: Principal</a>.
     * </p>
     * 
     * @param principal
     *        An IAM principal, such as an IAM users, IAM roles, or AWS services that is allowed or denied access to a
     *        resource. For more information, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_principal.html">AWS
     *        JSON policy elements: Principal</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResourcePolicyStatementRequest withPrincipal(java.util.Collection<Principal> principal) {
        setPrincipal(principal);
        return this;
    }

    /**
     * <p>
     * The Amazon Lex action that this policy either allows or denies. The action must apply to the resource type of the
     * specified ARN. For more information, see <a
     * href="https://docs.aws.amazon.com/service-authorization/latest/reference/list_amazonlexv2.html"> Actions,
     * resources, and condition keys for Amazon Lex V2</a>.
     * </p>
     * 
     * @return The Amazon Lex action that this policy either allows or denies. The action must apply to the resource
     *         type of the specified ARN. For more information, see <a
     *         href="https://docs.aws.amazon.com/service-authorization/latest/reference/list_amazonlexv2.html"> Actions,
     *         resources, and condition keys for Amazon Lex V2</a>.
     */

    public java.util.List<String> getAction() {
        return action;
    }

    /**
     * <p>
     * The Amazon Lex action that this policy either allows or denies. The action must apply to the resource type of the
     * specified ARN. For more information, see <a
     * href="https://docs.aws.amazon.com/service-authorization/latest/reference/list_amazonlexv2.html"> Actions,
     * resources, and condition keys for Amazon Lex V2</a>.
     * </p>
     * 
     * @param action
     *        The Amazon Lex action that this policy either allows or denies. The action must apply to the resource type
     *        of the specified ARN. For more information, see <a
     *        href="https://docs.aws.amazon.com/service-authorization/latest/reference/list_amazonlexv2.html"> Actions,
     *        resources, and condition keys for Amazon Lex V2</a>.
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
     * The Amazon Lex action that this policy either allows or denies. The action must apply to the resource type of the
     * specified ARN. For more information, see <a
     * href="https://docs.aws.amazon.com/service-authorization/latest/reference/list_amazonlexv2.html"> Actions,
     * resources, and condition keys for Amazon Lex V2</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAction(java.util.Collection)} or {@link #withAction(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param action
     *        The Amazon Lex action that this policy either allows or denies. The action must apply to the resource type
     *        of the specified ARN. For more information, see <a
     *        href="https://docs.aws.amazon.com/service-authorization/latest/reference/list_amazonlexv2.html"> Actions,
     *        resources, and condition keys for Amazon Lex V2</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResourcePolicyStatementRequest withAction(String... action) {
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
     * The Amazon Lex action that this policy either allows or denies. The action must apply to the resource type of the
     * specified ARN. For more information, see <a
     * href="https://docs.aws.amazon.com/service-authorization/latest/reference/list_amazonlexv2.html"> Actions,
     * resources, and condition keys for Amazon Lex V2</a>.
     * </p>
     * 
     * @param action
     *        The Amazon Lex action that this policy either allows or denies. The action must apply to the resource type
     *        of the specified ARN. For more information, see <a
     *        href="https://docs.aws.amazon.com/service-authorization/latest/reference/list_amazonlexv2.html"> Actions,
     *        resources, and condition keys for Amazon Lex V2</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResourcePolicyStatementRequest withAction(java.util.Collection<String> action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * Specifies a condition when the policy is in effect. If the principal of the policy is a service principal, you
     * must provide two condition blocks, one with a SourceAccount global condition key and one with a SourceArn global
     * condition key.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_condition.html">IAM JSON
     * policy elements: Condition </a>.
     * </p>
     * 
     * @return Specifies a condition when the policy is in effect. If the principal of the policy is a service
     *         principal, you must provide two condition blocks, one with a SourceAccount global condition key and one
     *         with a SourceArn global condition key.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_condition.html">IAM
     *         JSON policy elements: Condition </a>.
     */

    public java.util.Map<String, java.util.Map<String, String>> getCondition() {
        return condition;
    }

    /**
     * <p>
     * Specifies a condition when the policy is in effect. If the principal of the policy is a service principal, you
     * must provide two condition blocks, one with a SourceAccount global condition key and one with a SourceArn global
     * condition key.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_condition.html">IAM JSON
     * policy elements: Condition </a>.
     * </p>
     * 
     * @param condition
     *        Specifies a condition when the policy is in effect. If the principal of the policy is a service principal,
     *        you must provide two condition blocks, one with a SourceAccount global condition key and one with a
     *        SourceArn global condition key.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_condition.html">IAM
     *        JSON policy elements: Condition </a>.
     */

    public void setCondition(java.util.Map<String, java.util.Map<String, String>> condition) {
        this.condition = condition;
    }

    /**
     * <p>
     * Specifies a condition when the policy is in effect. If the principal of the policy is a service principal, you
     * must provide two condition blocks, one with a SourceAccount global condition key and one with a SourceArn global
     * condition key.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_condition.html">IAM JSON
     * policy elements: Condition </a>.
     * </p>
     * 
     * @param condition
     *        Specifies a condition when the policy is in effect. If the principal of the policy is a service principal,
     *        you must provide two condition blocks, one with a SourceAccount global condition key and one with a
     *        SourceArn global condition key.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_condition.html">IAM
     *        JSON policy elements: Condition </a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResourcePolicyStatementRequest withCondition(java.util.Map<String, java.util.Map<String, String>> condition) {
        setCondition(condition);
        return this;
    }

    /**
     * Add a single Condition entry
     *
     * @see CreateResourcePolicyStatementRequest#withCondition
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateResourcePolicyStatementRequest addConditionEntry(String key, java.util.Map<String, String> value) {
        if (null == this.condition) {
            this.condition = new java.util.HashMap<String, java.util.Map<String, String>>();
        }
        if (this.condition.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.condition.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Condition.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResourcePolicyStatementRequest clearConditionEntries() {
        this.condition = null;
        return this;
    }

    /**
     * <p>
     * The identifier of the revision of the policy to edit. If this revision ID doesn't match the current revision ID,
     * Amazon Lex throws an exception.
     * </p>
     * <p>
     * If you don't specify a revision, Amazon Lex overwrites the contents of the policy with the new values.
     * </p>
     * 
     * @param expectedRevisionId
     *        The identifier of the revision of the policy to edit. If this revision ID doesn't match the current
     *        revision ID, Amazon Lex throws an exception.</p>
     *        <p>
     *        If you don't specify a revision, Amazon Lex overwrites the contents of the policy with the new values.
     */

    public void setExpectedRevisionId(String expectedRevisionId) {
        this.expectedRevisionId = expectedRevisionId;
    }

    /**
     * <p>
     * The identifier of the revision of the policy to edit. If this revision ID doesn't match the current revision ID,
     * Amazon Lex throws an exception.
     * </p>
     * <p>
     * If you don't specify a revision, Amazon Lex overwrites the contents of the policy with the new values.
     * </p>
     * 
     * @return The identifier of the revision of the policy to edit. If this revision ID doesn't match the current
     *         revision ID, Amazon Lex throws an exception.</p>
     *         <p>
     *         If you don't specify a revision, Amazon Lex overwrites the contents of the policy with the new values.
     */

    public String getExpectedRevisionId() {
        return this.expectedRevisionId;
    }

    /**
     * <p>
     * The identifier of the revision of the policy to edit. If this revision ID doesn't match the current revision ID,
     * Amazon Lex throws an exception.
     * </p>
     * <p>
     * If you don't specify a revision, Amazon Lex overwrites the contents of the policy with the new values.
     * </p>
     * 
     * @param expectedRevisionId
     *        The identifier of the revision of the policy to edit. If this revision ID doesn't match the current
     *        revision ID, Amazon Lex throws an exception.</p>
     *        <p>
     *        If you don't specify a revision, Amazon Lex overwrites the contents of the policy with the new values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResourcePolicyStatementRequest withExpectedRevisionId(String expectedRevisionId) {
        setExpectedRevisionId(expectedRevisionId);
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
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getStatementId() != null)
            sb.append("StatementId: ").append(getStatementId()).append(",");
        if (getEffect() != null)
            sb.append("Effect: ").append(getEffect()).append(",");
        if (getPrincipal() != null)
            sb.append("Principal: ").append(getPrincipal()).append(",");
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getCondition() != null)
            sb.append("Condition: ").append(getCondition()).append(",");
        if (getExpectedRevisionId() != null)
            sb.append("ExpectedRevisionId: ").append(getExpectedRevisionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateResourcePolicyStatementRequest == false)
            return false;
        CreateResourcePolicyStatementRequest other = (CreateResourcePolicyStatementRequest) obj;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getStatementId() == null ^ this.getStatementId() == null)
            return false;
        if (other.getStatementId() != null && other.getStatementId().equals(this.getStatementId()) == false)
            return false;
        if (other.getEffect() == null ^ this.getEffect() == null)
            return false;
        if (other.getEffect() != null && other.getEffect().equals(this.getEffect()) == false)
            return false;
        if (other.getPrincipal() == null ^ this.getPrincipal() == null)
            return false;
        if (other.getPrincipal() != null && other.getPrincipal().equals(this.getPrincipal()) == false)
            return false;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getCondition() == null ^ this.getCondition() == null)
            return false;
        if (other.getCondition() != null && other.getCondition().equals(this.getCondition()) == false)
            return false;
        if (other.getExpectedRevisionId() == null ^ this.getExpectedRevisionId() == null)
            return false;
        if (other.getExpectedRevisionId() != null && other.getExpectedRevisionId().equals(this.getExpectedRevisionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getStatementId() == null) ? 0 : getStatementId().hashCode());
        hashCode = prime * hashCode + ((getEffect() == null) ? 0 : getEffect().hashCode());
        hashCode = prime * hashCode + ((getPrincipal() == null) ? 0 : getPrincipal().hashCode());
        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getCondition() == null) ? 0 : getCondition().hashCode());
        hashCode = prime * hashCode + ((getExpectedRevisionId() == null) ? 0 : getExpectedRevisionId().hashCode());
        return hashCode;
    }

    @Override
    public CreateResourcePolicyStatementRequest clone() {
        return (CreateResourcePolicyStatementRequest) super.clone();
    }

}
