/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListPermissionSetsProvisionedToAccount"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPermissionSetsProvisionedToAccountResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The pagination token for the list API. Initially the value is null. Use the output of previous API calls to make
     * subsequent calls.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Defines the level of access that an AWS account has.
     * </p>
     */
    private java.util.List<String> permissionSets;

    /**
     * <p>
     * The pagination token for the list API. Initially the value is null. Use the output of previous API calls to make
     * subsequent calls.
     * </p>
     * 
     * @param nextToken
     *        The pagination token for the list API. Initially the value is null. Use the output of previous API calls
     *        to make subsequent calls.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token for the list API. Initially the value is null. Use the output of previous API calls to make
     * subsequent calls.
     * </p>
     * 
     * @return The pagination token for the list API. Initially the value is null. Use the output of previous API calls
     *         to make subsequent calls.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token for the list API. Initially the value is null. Use the output of previous API calls to make
     * subsequent calls.
     * </p>
     * 
     * @param nextToken
     *        The pagination token for the list API. Initially the value is null. Use the output of previous API calls
     *        to make subsequent calls.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPermissionSetsProvisionedToAccountResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Defines the level of access that an AWS account has.
     * </p>
     * 
     * @return Defines the level of access that an AWS account has.
     */

    public java.util.List<String> getPermissionSets() {
        return permissionSets;
    }

    /**
     * <p>
     * Defines the level of access that an AWS account has.
     * </p>
     * 
     * @param permissionSets
     *        Defines the level of access that an AWS account has.
     */

    public void setPermissionSets(java.util.Collection<String> permissionSets) {
        if (permissionSets == null) {
            this.permissionSets = null;
            return;
        }

        this.permissionSets = new java.util.ArrayList<String>(permissionSets);
    }

    /**
     * <p>
     * Defines the level of access that an AWS account has.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPermissionSets(java.util.Collection)} or {@link #withPermissionSets(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param permissionSets
     *        Defines the level of access that an AWS account has.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPermissionSetsProvisionedToAccountResult withPermissionSets(String... permissionSets) {
        if (this.permissionSets == null) {
            setPermissionSets(new java.util.ArrayList<String>(permissionSets.length));
        }
        for (String ele : permissionSets) {
            this.permissionSets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Defines the level of access that an AWS account has.
     * </p>
     * 
     * @param permissionSets
     *        Defines the level of access that an AWS account has.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPermissionSetsProvisionedToAccountResult withPermissionSets(java.util.Collection<String> permissionSets) {
        setPermissionSets(permissionSets);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getPermissionSets() != null)
            sb.append("PermissionSets: ").append(getPermissionSets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListPermissionSetsProvisionedToAccountResult == false)
            return false;
        ListPermissionSetsProvisionedToAccountResult other = (ListPermissionSetsProvisionedToAccountResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getPermissionSets() == null ^ this.getPermissionSets() == null)
            return false;
        if (other.getPermissionSets() != null && other.getPermissionSets().equals(this.getPermissionSets()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getPermissionSets() == null) ? 0 : getPermissionSets().hashCode());
        return hashCode;
    }

    @Override
    public ListPermissionSetsProvisionedToAccountResult clone() {
        try {
            return (ListPermissionSetsProvisionedToAccountResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
