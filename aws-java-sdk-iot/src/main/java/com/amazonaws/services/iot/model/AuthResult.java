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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The authorizer result.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AuthResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Authorization information.
     * </p>
     */
    private AuthInfo authInfo;
    /**
     * <p>
     * The policies and statements that allowed the specified action.
     * </p>
     */
    private Allowed allowed;
    /**
     * <p>
     * The policies and statements that denied the specified action.
     * </p>
     */
    private Denied denied;
    /**
     * <p>
     * The final authorization decision of this scenario. Multiple statements are taken into account when determining
     * the authorization decision. An explicit deny statement can override multiple allow statements.
     * </p>
     */
    private String authDecision;
    /**
     * <p>
     * Contains any missing context values found while evaluating policy.
     * </p>
     */
    private java.util.List<String> missingContextValues;

    /**
     * <p>
     * Authorization information.
     * </p>
     * 
     * @param authInfo
     *        Authorization information.
     */

    public void setAuthInfo(AuthInfo authInfo) {
        this.authInfo = authInfo;
    }

    /**
     * <p>
     * Authorization information.
     * </p>
     * 
     * @return Authorization information.
     */

    public AuthInfo getAuthInfo() {
        return this.authInfo;
    }

    /**
     * <p>
     * Authorization information.
     * </p>
     * 
     * @param authInfo
     *        Authorization information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthResult withAuthInfo(AuthInfo authInfo) {
        setAuthInfo(authInfo);
        return this;
    }

    /**
     * <p>
     * The policies and statements that allowed the specified action.
     * </p>
     * 
     * @param allowed
     *        The policies and statements that allowed the specified action.
     */

    public void setAllowed(Allowed allowed) {
        this.allowed = allowed;
    }

    /**
     * <p>
     * The policies and statements that allowed the specified action.
     * </p>
     * 
     * @return The policies and statements that allowed the specified action.
     */

    public Allowed getAllowed() {
        return this.allowed;
    }

    /**
     * <p>
     * The policies and statements that allowed the specified action.
     * </p>
     * 
     * @param allowed
     *        The policies and statements that allowed the specified action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthResult withAllowed(Allowed allowed) {
        setAllowed(allowed);
        return this;
    }

    /**
     * <p>
     * The policies and statements that denied the specified action.
     * </p>
     * 
     * @param denied
     *        The policies and statements that denied the specified action.
     */

    public void setDenied(Denied denied) {
        this.denied = denied;
    }

    /**
     * <p>
     * The policies and statements that denied the specified action.
     * </p>
     * 
     * @return The policies and statements that denied the specified action.
     */

    public Denied getDenied() {
        return this.denied;
    }

    /**
     * <p>
     * The policies and statements that denied the specified action.
     * </p>
     * 
     * @param denied
     *        The policies and statements that denied the specified action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthResult withDenied(Denied denied) {
        setDenied(denied);
        return this;
    }

    /**
     * <p>
     * The final authorization decision of this scenario. Multiple statements are taken into account when determining
     * the authorization decision. An explicit deny statement can override multiple allow statements.
     * </p>
     * 
     * @param authDecision
     *        The final authorization decision of this scenario. Multiple statements are taken into account when
     *        determining the authorization decision. An explicit deny statement can override multiple allow statements.
     * @see AuthDecision
     */

    public void setAuthDecision(String authDecision) {
        this.authDecision = authDecision;
    }

    /**
     * <p>
     * The final authorization decision of this scenario. Multiple statements are taken into account when determining
     * the authorization decision. An explicit deny statement can override multiple allow statements.
     * </p>
     * 
     * @return The final authorization decision of this scenario. Multiple statements are taken into account when
     *         determining the authorization decision. An explicit deny statement can override multiple allow
     *         statements.
     * @see AuthDecision
     */

    public String getAuthDecision() {
        return this.authDecision;
    }

    /**
     * <p>
     * The final authorization decision of this scenario. Multiple statements are taken into account when determining
     * the authorization decision. An explicit deny statement can override multiple allow statements.
     * </p>
     * 
     * @param authDecision
     *        The final authorization decision of this scenario. Multiple statements are taken into account when
     *        determining the authorization decision. An explicit deny statement can override multiple allow statements.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthDecision
     */

    public AuthResult withAuthDecision(String authDecision) {
        setAuthDecision(authDecision);
        return this;
    }

    /**
     * <p>
     * The final authorization decision of this scenario. Multiple statements are taken into account when determining
     * the authorization decision. An explicit deny statement can override multiple allow statements.
     * </p>
     * 
     * @param authDecision
     *        The final authorization decision of this scenario. Multiple statements are taken into account when
     *        determining the authorization decision. An explicit deny statement can override multiple allow statements.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthDecision
     */

    public AuthResult withAuthDecision(AuthDecision authDecision) {
        this.authDecision = authDecision.toString();
        return this;
    }

    /**
     * <p>
     * Contains any missing context values found while evaluating policy.
     * </p>
     * 
     * @return Contains any missing context values found while evaluating policy.
     */

    public java.util.List<String> getMissingContextValues() {
        return missingContextValues;
    }

    /**
     * <p>
     * Contains any missing context values found while evaluating policy.
     * </p>
     * 
     * @param missingContextValues
     *        Contains any missing context values found while evaluating policy.
     */

    public void setMissingContextValues(java.util.Collection<String> missingContextValues) {
        if (missingContextValues == null) {
            this.missingContextValues = null;
            return;
        }

        this.missingContextValues = new java.util.ArrayList<String>(missingContextValues);
    }

    /**
     * <p>
     * Contains any missing context values found while evaluating policy.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMissingContextValues(java.util.Collection)} or {@link #withMissingContextValues(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param missingContextValues
     *        Contains any missing context values found while evaluating policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthResult withMissingContextValues(String... missingContextValues) {
        if (this.missingContextValues == null) {
            setMissingContextValues(new java.util.ArrayList<String>(missingContextValues.length));
        }
        for (String ele : missingContextValues) {
            this.missingContextValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains any missing context values found while evaluating policy.
     * </p>
     * 
     * @param missingContextValues
     *        Contains any missing context values found while evaluating policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthResult withMissingContextValues(java.util.Collection<String> missingContextValues) {
        setMissingContextValues(missingContextValues);
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
        if (getAuthInfo() != null)
            sb.append("AuthInfo: ").append(getAuthInfo()).append(",");
        if (getAllowed() != null)
            sb.append("Allowed: ").append(getAllowed()).append(",");
        if (getDenied() != null)
            sb.append("Denied: ").append(getDenied()).append(",");
        if (getAuthDecision() != null)
            sb.append("AuthDecision: ").append(getAuthDecision()).append(",");
        if (getMissingContextValues() != null)
            sb.append("MissingContextValues: ").append(getMissingContextValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AuthResult == false)
            return false;
        AuthResult other = (AuthResult) obj;
        if (other.getAuthInfo() == null ^ this.getAuthInfo() == null)
            return false;
        if (other.getAuthInfo() != null && other.getAuthInfo().equals(this.getAuthInfo()) == false)
            return false;
        if (other.getAllowed() == null ^ this.getAllowed() == null)
            return false;
        if (other.getAllowed() != null && other.getAllowed().equals(this.getAllowed()) == false)
            return false;
        if (other.getDenied() == null ^ this.getDenied() == null)
            return false;
        if (other.getDenied() != null && other.getDenied().equals(this.getDenied()) == false)
            return false;
        if (other.getAuthDecision() == null ^ this.getAuthDecision() == null)
            return false;
        if (other.getAuthDecision() != null && other.getAuthDecision().equals(this.getAuthDecision()) == false)
            return false;
        if (other.getMissingContextValues() == null ^ this.getMissingContextValues() == null)
            return false;
        if (other.getMissingContextValues() != null && other.getMissingContextValues().equals(this.getMissingContextValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuthInfo() == null) ? 0 : getAuthInfo().hashCode());
        hashCode = prime * hashCode + ((getAllowed() == null) ? 0 : getAllowed().hashCode());
        hashCode = prime * hashCode + ((getDenied() == null) ? 0 : getDenied().hashCode());
        hashCode = prime * hashCode + ((getAuthDecision() == null) ? 0 : getAuthDecision().hashCode());
        hashCode = prime * hashCode + ((getMissingContextValues() == null) ? 0 : getMissingContextValues().hashCode());
        return hashCode;
    }

    @Override
    public AuthResult clone() {
        try {
            return (AuthResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.AuthResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
