/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListSecurityProfilePermissions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSecurityProfilePermissionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The permissions granted to the security profile. For a complete list of valid permissions, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/security-profile-list.html">List of security profile
     * permissions</a>.
     * </p>
     */
    private java.util.List<String> permissions;
    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The permissions granted to the security profile. For a complete list of valid permissions, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/security-profile-list.html">List of security profile
     * permissions</a>.
     * </p>
     * 
     * @return The permissions granted to the security profile. For a complete list of valid permissions, see <a
     *         href="https://docs.aws.amazon.com/connect/latest/adminguide/security-profile-list.html">List of security
     *         profile permissions</a>.
     */

    public java.util.List<String> getPermissions() {
        return permissions;
    }

    /**
     * <p>
     * The permissions granted to the security profile. For a complete list of valid permissions, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/security-profile-list.html">List of security profile
     * permissions</a>.
     * </p>
     * 
     * @param permissions
     *        The permissions granted to the security profile. For a complete list of valid permissions, see <a
     *        href="https://docs.aws.amazon.com/connect/latest/adminguide/security-profile-list.html">List of security
     *        profile permissions</a>.
     */

    public void setPermissions(java.util.Collection<String> permissions) {
        if (permissions == null) {
            this.permissions = null;
            return;
        }

        this.permissions = new java.util.ArrayList<String>(permissions);
    }

    /**
     * <p>
     * The permissions granted to the security profile. For a complete list of valid permissions, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/security-profile-list.html">List of security profile
     * permissions</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPermissions(java.util.Collection)} or {@link #withPermissions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param permissions
     *        The permissions granted to the security profile. For a complete list of valid permissions, see <a
     *        href="https://docs.aws.amazon.com/connect/latest/adminguide/security-profile-list.html">List of security
     *        profile permissions</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSecurityProfilePermissionsResult withPermissions(String... permissions) {
        if (this.permissions == null) {
            setPermissions(new java.util.ArrayList<String>(permissions.length));
        }
        for (String ele : permissions) {
            this.permissions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The permissions granted to the security profile. For a complete list of valid permissions, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/security-profile-list.html">List of security profile
     * permissions</a>.
     * </p>
     * 
     * @param permissions
     *        The permissions granted to the security profile. For a complete list of valid permissions, see <a
     *        href="https://docs.aws.amazon.com/connect/latest/adminguide/security-profile-list.html">List of security
     *        profile permissions</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSecurityProfilePermissionsResult withPermissions(java.util.Collection<String> permissions) {
        setPermissions(permissions);
        return this;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        If there are additional results, this is the token for the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @return If there are additional results, this is the token for the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        If there are additional results, this is the token for the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSecurityProfilePermissionsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getPermissions() != null)
            sb.append("Permissions: ").append(getPermissions()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListSecurityProfilePermissionsResult == false)
            return false;
        ListSecurityProfilePermissionsResult other = (ListSecurityProfilePermissionsResult) obj;
        if (other.getPermissions() == null ^ this.getPermissions() == null)
            return false;
        if (other.getPermissions() != null && other.getPermissions().equals(this.getPermissions()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPermissions() == null) ? 0 : getPermissions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListSecurityProfilePermissionsResult clone() {
        try {
            return (ListSecurityProfilePermissionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
