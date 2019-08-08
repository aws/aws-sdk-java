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
package com.amazonaws.services.lakeformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/ListPermissions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPermissionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of principals and their permissions on the resource for the specified principal and resource types.
     * </p>
     */
    private java.util.List<PrincipalResourcePermissions> principalResourcePermissions;
    /**
     * <p>
     * A continuation token, if this is not the first call to retrieve this list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of principals and their permissions on the resource for the specified principal and resource types.
     * </p>
     * 
     * @return A list of principals and their permissions on the resource for the specified principal and resource
     *         types.
     */

    public java.util.List<PrincipalResourcePermissions> getPrincipalResourcePermissions() {
        return principalResourcePermissions;
    }

    /**
     * <p>
     * A list of principals and their permissions on the resource for the specified principal and resource types.
     * </p>
     * 
     * @param principalResourcePermissions
     *        A list of principals and their permissions on the resource for the specified principal and resource types.
     */

    public void setPrincipalResourcePermissions(java.util.Collection<PrincipalResourcePermissions> principalResourcePermissions) {
        if (principalResourcePermissions == null) {
            this.principalResourcePermissions = null;
            return;
        }

        this.principalResourcePermissions = new java.util.ArrayList<PrincipalResourcePermissions>(principalResourcePermissions);
    }

    /**
     * <p>
     * A list of principals and their permissions on the resource for the specified principal and resource types.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPrincipalResourcePermissions(java.util.Collection)} or
     * {@link #withPrincipalResourcePermissions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param principalResourcePermissions
     *        A list of principals and their permissions on the resource for the specified principal and resource types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPermissionsResult withPrincipalResourcePermissions(PrincipalResourcePermissions... principalResourcePermissions) {
        if (this.principalResourcePermissions == null) {
            setPrincipalResourcePermissions(new java.util.ArrayList<PrincipalResourcePermissions>(principalResourcePermissions.length));
        }
        for (PrincipalResourcePermissions ele : principalResourcePermissions) {
            this.principalResourcePermissions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of principals and their permissions on the resource for the specified principal and resource types.
     * </p>
     * 
     * @param principalResourcePermissions
     *        A list of principals and their permissions on the resource for the specified principal and resource types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPermissionsResult withPrincipalResourcePermissions(java.util.Collection<PrincipalResourcePermissions> principalResourcePermissions) {
        setPrincipalResourcePermissions(principalResourcePermissions);
        return this;
    }

    /**
     * <p>
     * A continuation token, if this is not the first call to retrieve this list.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, if this is not the first call to retrieve this list.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A continuation token, if this is not the first call to retrieve this list.
     * </p>
     * 
     * @return A continuation token, if this is not the first call to retrieve this list.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A continuation token, if this is not the first call to retrieve this list.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, if this is not the first call to retrieve this list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPermissionsResult withNextToken(String nextToken) {
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
        if (getPrincipalResourcePermissions() != null)
            sb.append("PrincipalResourcePermissions: ").append(getPrincipalResourcePermissions()).append(",");
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

        if (obj instanceof ListPermissionsResult == false)
            return false;
        ListPermissionsResult other = (ListPermissionsResult) obj;
        if (other.getPrincipalResourcePermissions() == null ^ this.getPrincipalResourcePermissions() == null)
            return false;
        if (other.getPrincipalResourcePermissions() != null && other.getPrincipalResourcePermissions().equals(this.getPrincipalResourcePermissions()) == false)
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

        hashCode = prime * hashCode + ((getPrincipalResourcePermissions() == null) ? 0 : getPrincipalResourcePermissions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListPermissionsResult clone() {
        try {
            return (ListPermissionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
