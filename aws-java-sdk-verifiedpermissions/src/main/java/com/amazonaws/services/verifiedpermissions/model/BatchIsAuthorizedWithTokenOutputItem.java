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
package com.amazonaws.services.verifiedpermissions.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The decision, based on policy evaluation, from an individual authorization request in a
 * <code>BatchIsAuthorizedWithToken</code> API request.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/BatchIsAuthorizedWithTokenOutputItem"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchIsAuthorizedWithTokenOutputItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The authorization request that initiated the decision.
     * </p>
     */
    private BatchIsAuthorizedWithTokenInputItem request;
    /**
     * <p>
     * An authorization decision that indicates if the authorization request should be allowed or denied.
     * </p>
     */
    private String decision;
    /**
     * <p>
     * The list of determining policies used to make the authorization decision. For example, if there are two matching
     * policies, where one is a forbid and the other is a permit, then the forbid policy will be the determining policy.
     * In the case of multiple matching permit policies then there would be multiple determining policies. In the case
     * that no policies match, and hence the response is DENY, there would be no determining policies.
     * </p>
     */
    private java.util.List<DeterminingPolicyItem> determiningPolicies;
    /**
     * <p>
     * Errors that occurred while making an authorization decision. For example, a policy might reference an entity or
     * attribute that doesn't exist in the request.
     * </p>
     */
    private java.util.List<EvaluationErrorItem> errors;

    /**
     * <p>
     * The authorization request that initiated the decision.
     * </p>
     * 
     * @param request
     *        The authorization request that initiated the decision.
     */

    public void setRequest(BatchIsAuthorizedWithTokenInputItem request) {
        this.request = request;
    }

    /**
     * <p>
     * The authorization request that initiated the decision.
     * </p>
     * 
     * @return The authorization request that initiated the decision.
     */

    public BatchIsAuthorizedWithTokenInputItem getRequest() {
        return this.request;
    }

    /**
     * <p>
     * The authorization request that initiated the decision.
     * </p>
     * 
     * @param request
     *        The authorization request that initiated the decision.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchIsAuthorizedWithTokenOutputItem withRequest(BatchIsAuthorizedWithTokenInputItem request) {
        setRequest(request);
        return this;
    }

    /**
     * <p>
     * An authorization decision that indicates if the authorization request should be allowed or denied.
     * </p>
     * 
     * @param decision
     *        An authorization decision that indicates if the authorization request should be allowed or denied.
     * @see Decision
     */

    public void setDecision(String decision) {
        this.decision = decision;
    }

    /**
     * <p>
     * An authorization decision that indicates if the authorization request should be allowed or denied.
     * </p>
     * 
     * @return An authorization decision that indicates if the authorization request should be allowed or denied.
     * @see Decision
     */

    public String getDecision() {
        return this.decision;
    }

    /**
     * <p>
     * An authorization decision that indicates if the authorization request should be allowed or denied.
     * </p>
     * 
     * @param decision
     *        An authorization decision that indicates if the authorization request should be allowed or denied.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Decision
     */

    public BatchIsAuthorizedWithTokenOutputItem withDecision(String decision) {
        setDecision(decision);
        return this;
    }

    /**
     * <p>
     * An authorization decision that indicates if the authorization request should be allowed or denied.
     * </p>
     * 
     * @param decision
     *        An authorization decision that indicates if the authorization request should be allowed or denied.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Decision
     */

    public BatchIsAuthorizedWithTokenOutputItem withDecision(Decision decision) {
        this.decision = decision.toString();
        return this;
    }

    /**
     * <p>
     * The list of determining policies used to make the authorization decision. For example, if there are two matching
     * policies, where one is a forbid and the other is a permit, then the forbid policy will be the determining policy.
     * In the case of multiple matching permit policies then there would be multiple determining policies. In the case
     * that no policies match, and hence the response is DENY, there would be no determining policies.
     * </p>
     * 
     * @return The list of determining policies used to make the authorization decision. For example, if there are two
     *         matching policies, where one is a forbid and the other is a permit, then the forbid policy will be the
     *         determining policy. In the case of multiple matching permit policies then there would be multiple
     *         determining policies. In the case that no policies match, and hence the response is DENY, there would be
     *         no determining policies.
     */

    public java.util.List<DeterminingPolicyItem> getDeterminingPolicies() {
        return determiningPolicies;
    }

    /**
     * <p>
     * The list of determining policies used to make the authorization decision. For example, if there are two matching
     * policies, where one is a forbid and the other is a permit, then the forbid policy will be the determining policy.
     * In the case of multiple matching permit policies then there would be multiple determining policies. In the case
     * that no policies match, and hence the response is DENY, there would be no determining policies.
     * </p>
     * 
     * @param determiningPolicies
     *        The list of determining policies used to make the authorization decision. For example, if there are two
     *        matching policies, where one is a forbid and the other is a permit, then the forbid policy will be the
     *        determining policy. In the case of multiple matching permit policies then there would be multiple
     *        determining policies. In the case that no policies match, and hence the response is DENY, there would be
     *        no determining policies.
     */

    public void setDeterminingPolicies(java.util.Collection<DeterminingPolicyItem> determiningPolicies) {
        if (determiningPolicies == null) {
            this.determiningPolicies = null;
            return;
        }

        this.determiningPolicies = new java.util.ArrayList<DeterminingPolicyItem>(determiningPolicies);
    }

    /**
     * <p>
     * The list of determining policies used to make the authorization decision. For example, if there are two matching
     * policies, where one is a forbid and the other is a permit, then the forbid policy will be the determining policy.
     * In the case of multiple matching permit policies then there would be multiple determining policies. In the case
     * that no policies match, and hence the response is DENY, there would be no determining policies.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDeterminingPolicies(java.util.Collection)} or {@link #withDeterminingPolicies(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param determiningPolicies
     *        The list of determining policies used to make the authorization decision. For example, if there are two
     *        matching policies, where one is a forbid and the other is a permit, then the forbid policy will be the
     *        determining policy. In the case of multiple matching permit policies then there would be multiple
     *        determining policies. In the case that no policies match, and hence the response is DENY, there would be
     *        no determining policies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchIsAuthorizedWithTokenOutputItem withDeterminingPolicies(DeterminingPolicyItem... determiningPolicies) {
        if (this.determiningPolicies == null) {
            setDeterminingPolicies(new java.util.ArrayList<DeterminingPolicyItem>(determiningPolicies.length));
        }
        for (DeterminingPolicyItem ele : determiningPolicies) {
            this.determiningPolicies.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of determining policies used to make the authorization decision. For example, if there are two matching
     * policies, where one is a forbid and the other is a permit, then the forbid policy will be the determining policy.
     * In the case of multiple matching permit policies then there would be multiple determining policies. In the case
     * that no policies match, and hence the response is DENY, there would be no determining policies.
     * </p>
     * 
     * @param determiningPolicies
     *        The list of determining policies used to make the authorization decision. For example, if there are two
     *        matching policies, where one is a forbid and the other is a permit, then the forbid policy will be the
     *        determining policy. In the case of multiple matching permit policies then there would be multiple
     *        determining policies. In the case that no policies match, and hence the response is DENY, there would be
     *        no determining policies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchIsAuthorizedWithTokenOutputItem withDeterminingPolicies(java.util.Collection<DeterminingPolicyItem> determiningPolicies) {
        setDeterminingPolicies(determiningPolicies);
        return this;
    }

    /**
     * <p>
     * Errors that occurred while making an authorization decision. For example, a policy might reference an entity or
     * attribute that doesn't exist in the request.
     * </p>
     * 
     * @return Errors that occurred while making an authorization decision. For example, a policy might reference an
     *         entity or attribute that doesn't exist in the request.
     */

    public java.util.List<EvaluationErrorItem> getErrors() {
        return errors;
    }

    /**
     * <p>
     * Errors that occurred while making an authorization decision. For example, a policy might reference an entity or
     * attribute that doesn't exist in the request.
     * </p>
     * 
     * @param errors
     *        Errors that occurred while making an authorization decision. For example, a policy might reference an
     *        entity or attribute that doesn't exist in the request.
     */

    public void setErrors(java.util.Collection<EvaluationErrorItem> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new java.util.ArrayList<EvaluationErrorItem>(errors);
    }

    /**
     * <p>
     * Errors that occurred while making an authorization decision. For example, a policy might reference an entity or
     * attribute that doesn't exist in the request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setErrors(java.util.Collection)} or {@link #withErrors(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param errors
     *        Errors that occurred while making an authorization decision. For example, a policy might reference an
     *        entity or attribute that doesn't exist in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchIsAuthorizedWithTokenOutputItem withErrors(EvaluationErrorItem... errors) {
        if (this.errors == null) {
            setErrors(new java.util.ArrayList<EvaluationErrorItem>(errors.length));
        }
        for (EvaluationErrorItem ele : errors) {
            this.errors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Errors that occurred while making an authorization decision. For example, a policy might reference an entity or
     * attribute that doesn't exist in the request.
     * </p>
     * 
     * @param errors
     *        Errors that occurred while making an authorization decision. For example, a policy might reference an
     *        entity or attribute that doesn't exist in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchIsAuthorizedWithTokenOutputItem withErrors(java.util.Collection<EvaluationErrorItem> errors) {
        setErrors(errors);
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
        if (getRequest() != null)
            sb.append("Request: ").append(getRequest()).append(",");
        if (getDecision() != null)
            sb.append("Decision: ").append(getDecision()).append(",");
        if (getDeterminingPolicies() != null)
            sb.append("DeterminingPolicies: ").append(getDeterminingPolicies()).append(",");
        if (getErrors() != null)
            sb.append("Errors: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchIsAuthorizedWithTokenOutputItem == false)
            return false;
        BatchIsAuthorizedWithTokenOutputItem other = (BatchIsAuthorizedWithTokenOutputItem) obj;
        if (other.getRequest() == null ^ this.getRequest() == null)
            return false;
        if (other.getRequest() != null && other.getRequest().equals(this.getRequest()) == false)
            return false;
        if (other.getDecision() == null ^ this.getDecision() == null)
            return false;
        if (other.getDecision() != null && other.getDecision().equals(this.getDecision()) == false)
            return false;
        if (other.getDeterminingPolicies() == null ^ this.getDeterminingPolicies() == null)
            return false;
        if (other.getDeterminingPolicies() != null && other.getDeterminingPolicies().equals(this.getDeterminingPolicies()) == false)
            return false;
        if (other.getErrors() == null ^ this.getErrors() == null)
            return false;
        if (other.getErrors() != null && other.getErrors().equals(this.getErrors()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRequest() == null) ? 0 : getRequest().hashCode());
        hashCode = prime * hashCode + ((getDecision() == null) ? 0 : getDecision().hashCode());
        hashCode = prime * hashCode + ((getDeterminingPolicies() == null) ? 0 : getDeterminingPolicies().hashCode());
        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        return hashCode;
    }

    @Override
    public BatchIsAuthorizedWithTokenOutputItem clone() {
        try {
            return (BatchIsAuthorizedWithTokenOutputItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.verifiedpermissions.model.transform.BatchIsAuthorizedWithTokenOutputItemMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
