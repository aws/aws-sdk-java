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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/GetApplicationAccessScope"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetApplicationAccessScopeResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of authorized targets associated with this access scope.
     * </p>
     */
    private java.util.List<String> authorizedTargets;
    /**
     * <p>
     * The name of the access scope that can be used with the authorized targets.
     * </p>
     */
    private String scope;

    /**
     * <p>
     * An array of authorized targets associated with this access scope.
     * </p>
     * 
     * @return An array of authorized targets associated with this access scope.
     */

    public java.util.List<String> getAuthorizedTargets() {
        return authorizedTargets;
    }

    /**
     * <p>
     * An array of authorized targets associated with this access scope.
     * </p>
     * 
     * @param authorizedTargets
     *        An array of authorized targets associated with this access scope.
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
     * An array of authorized targets associated with this access scope.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAuthorizedTargets(java.util.Collection)} or {@link #withAuthorizedTargets(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param authorizedTargets
     *        An array of authorized targets associated with this access scope.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApplicationAccessScopeResult withAuthorizedTargets(String... authorizedTargets) {
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
     * An array of authorized targets associated with this access scope.
     * </p>
     * 
     * @param authorizedTargets
     *        An array of authorized targets associated with this access scope.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApplicationAccessScopeResult withAuthorizedTargets(java.util.Collection<String> authorizedTargets) {
        setAuthorizedTargets(authorizedTargets);
        return this;
    }

    /**
     * <p>
     * The name of the access scope that can be used with the authorized targets.
     * </p>
     * 
     * @param scope
     *        The name of the access scope that can be used with the authorized targets.
     */

    public void setScope(String scope) {
        this.scope = scope;
    }

    /**
     * <p>
     * The name of the access scope that can be used with the authorized targets.
     * </p>
     * 
     * @return The name of the access scope that can be used with the authorized targets.
     */

    public String getScope() {
        return this.scope;
    }

    /**
     * <p>
     * The name of the access scope that can be used with the authorized targets.
     * </p>
     * 
     * @param scope
     *        The name of the access scope that can be used with the authorized targets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApplicationAccessScopeResult withScope(String scope) {
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

        if (obj instanceof GetApplicationAccessScopeResult == false)
            return false;
        GetApplicationAccessScopeResult other = (GetApplicationAccessScopeResult) obj;
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
    public GetApplicationAccessScopeResult clone() {
        try {
            return (GetApplicationAccessScopeResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
