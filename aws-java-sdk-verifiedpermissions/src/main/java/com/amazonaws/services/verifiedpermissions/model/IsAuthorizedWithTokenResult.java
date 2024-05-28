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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/IsAuthorizedWithToken"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IsAuthorizedWithTokenResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An authorization decision that indicates if the authorization request should be allowed or denied.
     * </p>
     */
    private String decision;
    /**
     * <p>
     * The list of determining policies used to make the authorization decision. For example, if there are multiple
     * matching policies, where at least one is a forbid policy, then because forbid always overrides permit the forbid
     * policies are the determining policies. If all matching policies are permit policies, then those policies are the
     * determining policies. When no policies match and the response is the default DENY, there are no determining
     * policies.
     * </p>
     */
    private java.util.List<DeterminingPolicyItem> determiningPolicies;
    /**
     * <p>
     * Errors that occurred while making an authorization decision. For example, a policy references an entity or entity
     * attribute that does not exist in the slice.
     * </p>
     */
    private java.util.List<EvaluationErrorItem> errors;
    /**
     * <p>
     * The identifier of the principal in the ID or access token.
     * </p>
     */
    private EntityIdentifier principal;

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

    public IsAuthorizedWithTokenResult withDecision(String decision) {
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

    public IsAuthorizedWithTokenResult withDecision(Decision decision) {
        this.decision = decision.toString();
        return this;
    }

    /**
     * <p>
     * The list of determining policies used to make the authorization decision. For example, if there are multiple
     * matching policies, where at least one is a forbid policy, then because forbid always overrides permit the forbid
     * policies are the determining policies. If all matching policies are permit policies, then those policies are the
     * determining policies. When no policies match and the response is the default DENY, there are no determining
     * policies.
     * </p>
     * 
     * @return The list of determining policies used to make the authorization decision. For example, if there are
     *         multiple matching policies, where at least one is a forbid policy, then because forbid always overrides
     *         permit the forbid policies are the determining policies. If all matching policies are permit policies,
     *         then those policies are the determining policies. When no policies match and the response is the default
     *         DENY, there are no determining policies.
     */

    public java.util.List<DeterminingPolicyItem> getDeterminingPolicies() {
        return determiningPolicies;
    }

    /**
     * <p>
     * The list of determining policies used to make the authorization decision. For example, if there are multiple
     * matching policies, where at least one is a forbid policy, then because forbid always overrides permit the forbid
     * policies are the determining policies. If all matching policies are permit policies, then those policies are the
     * determining policies. When no policies match and the response is the default DENY, there are no determining
     * policies.
     * </p>
     * 
     * @param determiningPolicies
     *        The list of determining policies used to make the authorization decision. For example, if there are
     *        multiple matching policies, where at least one is a forbid policy, then because forbid always overrides
     *        permit the forbid policies are the determining policies. If all matching policies are permit policies,
     *        then those policies are the determining policies. When no policies match and the response is the default
     *        DENY, there are no determining policies.
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
     * The list of determining policies used to make the authorization decision. For example, if there are multiple
     * matching policies, where at least one is a forbid policy, then because forbid always overrides permit the forbid
     * policies are the determining policies. If all matching policies are permit policies, then those policies are the
     * determining policies. When no policies match and the response is the default DENY, there are no determining
     * policies.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDeterminingPolicies(java.util.Collection)} or {@link #withDeterminingPolicies(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param determiningPolicies
     *        The list of determining policies used to make the authorization decision. For example, if there are
     *        multiple matching policies, where at least one is a forbid policy, then because forbid always overrides
     *        permit the forbid policies are the determining policies. If all matching policies are permit policies,
     *        then those policies are the determining policies. When no policies match and the response is the default
     *        DENY, there are no determining policies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IsAuthorizedWithTokenResult withDeterminingPolicies(DeterminingPolicyItem... determiningPolicies) {
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
     * The list of determining policies used to make the authorization decision. For example, if there are multiple
     * matching policies, where at least one is a forbid policy, then because forbid always overrides permit the forbid
     * policies are the determining policies. If all matching policies are permit policies, then those policies are the
     * determining policies. When no policies match and the response is the default DENY, there are no determining
     * policies.
     * </p>
     * 
     * @param determiningPolicies
     *        The list of determining policies used to make the authorization decision. For example, if there are
     *        multiple matching policies, where at least one is a forbid policy, then because forbid always overrides
     *        permit the forbid policies are the determining policies. If all matching policies are permit policies,
     *        then those policies are the determining policies. When no policies match and the response is the default
     *        DENY, there are no determining policies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IsAuthorizedWithTokenResult withDeterminingPolicies(java.util.Collection<DeterminingPolicyItem> determiningPolicies) {
        setDeterminingPolicies(determiningPolicies);
        return this;
    }

    /**
     * <p>
     * Errors that occurred while making an authorization decision. For example, a policy references an entity or entity
     * attribute that does not exist in the slice.
     * </p>
     * 
     * @return Errors that occurred while making an authorization decision. For example, a policy references an entity
     *         or entity attribute that does not exist in the slice.
     */

    public java.util.List<EvaluationErrorItem> getErrors() {
        return errors;
    }

    /**
     * <p>
     * Errors that occurred while making an authorization decision. For example, a policy references an entity or entity
     * attribute that does not exist in the slice.
     * </p>
     * 
     * @param errors
     *        Errors that occurred while making an authorization decision. For example, a policy references an entity or
     *        entity attribute that does not exist in the slice.
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
     * Errors that occurred while making an authorization decision. For example, a policy references an entity or entity
     * attribute that does not exist in the slice.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setErrors(java.util.Collection)} or {@link #withErrors(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param errors
     *        Errors that occurred while making an authorization decision. For example, a policy references an entity or
     *        entity attribute that does not exist in the slice.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IsAuthorizedWithTokenResult withErrors(EvaluationErrorItem... errors) {
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
     * Errors that occurred while making an authorization decision. For example, a policy references an entity or entity
     * attribute that does not exist in the slice.
     * </p>
     * 
     * @param errors
     *        Errors that occurred while making an authorization decision. For example, a policy references an entity or
     *        entity attribute that does not exist in the slice.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IsAuthorizedWithTokenResult withErrors(java.util.Collection<EvaluationErrorItem> errors) {
        setErrors(errors);
        return this;
    }

    /**
     * <p>
     * The identifier of the principal in the ID or access token.
     * </p>
     * 
     * @param principal
     *        The identifier of the principal in the ID or access token.
     */

    public void setPrincipal(EntityIdentifier principal) {
        this.principal = principal;
    }

    /**
     * <p>
     * The identifier of the principal in the ID or access token.
     * </p>
     * 
     * @return The identifier of the principal in the ID or access token.
     */

    public EntityIdentifier getPrincipal() {
        return this.principal;
    }

    /**
     * <p>
     * The identifier of the principal in the ID or access token.
     * </p>
     * 
     * @param principal
     *        The identifier of the principal in the ID or access token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IsAuthorizedWithTokenResult withPrincipal(EntityIdentifier principal) {
        setPrincipal(principal);
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
        if (getDecision() != null)
            sb.append("Decision: ").append(getDecision()).append(",");
        if (getDeterminingPolicies() != null)
            sb.append("DeterminingPolicies: ").append(getDeterminingPolicies()).append(",");
        if (getErrors() != null)
            sb.append("Errors: ").append("***Sensitive Data Redacted***").append(",");
        if (getPrincipal() != null)
            sb.append("Principal: ").append(getPrincipal());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IsAuthorizedWithTokenResult == false)
            return false;
        IsAuthorizedWithTokenResult other = (IsAuthorizedWithTokenResult) obj;
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
        if (other.getPrincipal() == null ^ this.getPrincipal() == null)
            return false;
        if (other.getPrincipal() != null && other.getPrincipal().equals(this.getPrincipal()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDecision() == null) ? 0 : getDecision().hashCode());
        hashCode = prime * hashCode + ((getDeterminingPolicies() == null) ? 0 : getDeterminingPolicies().hashCode());
        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        hashCode = prime * hashCode + ((getPrincipal() == null) ? 0 : getPrincipal().hashCode());
        return hashCode;
    }

    @Override
    public IsAuthorizedWithTokenResult clone() {
        try {
            return (IsAuthorizedWithTokenResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
