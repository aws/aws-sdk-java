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
package com.amazonaws.services.ssoadmin.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that describes an IAM Identity Center access scope and its authorized targets.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ScopeDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScopeDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An array list of ARNs of applications.
     * </p>
     */
    private java.util.List<String> authorizedTargets;
    /**
     * <p>
     * The name of the access scope.
     * </p>
     */
    private String scope;

    /**
     * <p>
     * An array list of ARNs of applications.
     * </p>
     * 
     * @return An array list of ARNs of applications.
     */

    public java.util.List<String> getAuthorizedTargets() {
        return authorizedTargets;
    }

    /**
     * <p>
     * An array list of ARNs of applications.
     * </p>
     * 
     * @param authorizedTargets
     *        An array list of ARNs of applications.
     */

    public void setAuthorizedTargets(java.util.Collection<String> authorizedTargets) {
        if (authorizedTargets == null) {
            this.authorizedTargets = null;
            return;
        }

        this.authorizedTargets = new java.util.ArrayList<String>(authorizedTargets);
    }

    /**
     * <p>
     * An array list of ARNs of applications.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAuthorizedTargets(java.util.Collection)} or {@link #withAuthorizedTargets(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param authorizedTargets
     *        An array list of ARNs of applications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScopeDetails withAuthorizedTargets(String... authorizedTargets) {
        if (this.authorizedTargets == null) {
            setAuthorizedTargets(new java.util.ArrayList<String>(authorizedTargets.length));
        }
        for (String ele : authorizedTargets) {
            this.authorizedTargets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array list of ARNs of applications.
     * </p>
     * 
     * @param authorizedTargets
     *        An array list of ARNs of applications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScopeDetails withAuthorizedTargets(java.util.Collection<String> authorizedTargets) {
        setAuthorizedTargets(authorizedTargets);
        return this;
    }

    /**
     * <p>
     * The name of the access scope.
     * </p>
     * 
     * @param scope
     *        The name of the access scope.
     */

    public void setScope(String scope) {
        this.scope = scope;
    }

    /**
     * <p>
     * The name of the access scope.
     * </p>
     * 
     * @return The name of the access scope.
     */

    public String getScope() {
        return this.scope;
    }

    /**
     * <p>
     * The name of the access scope.
     * </p>
     * 
     * @param scope
     *        The name of the access scope.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScopeDetails withScope(String scope) {
        setScope(scope);
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
        if (getAuthorizedTargets() != null)
            sb.append("AuthorizedTargets: ").append(getAuthorizedTargets()).append(",");
        if (getScope() != null)
            sb.append("Scope: ").append(getScope());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScopeDetails == false)
            return false;
        ScopeDetails other = (ScopeDetails) obj;
        if (other.getAuthorizedTargets() == null ^ this.getAuthorizedTargets() == null)
            return false;
        if (other.getAuthorizedTargets() != null && other.getAuthorizedTargets().equals(this.getAuthorizedTargets()) == false)
            return false;
        if (other.getScope() == null ^ this.getScope() == null)
            return false;
        if (other.getScope() != null && other.getScope().equals(this.getScope()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuthorizedTargets() == null) ? 0 : getAuthorizedTargets().hashCode());
        hashCode = prime * hashCode + ((getScope() == null) ? 0 : getScope().hashCode());
        return hashCode;
    }

    @Override
    public ScopeDetails clone() {
        try {
            return (ScopeDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssoadmin.model.transform.ScopeDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
