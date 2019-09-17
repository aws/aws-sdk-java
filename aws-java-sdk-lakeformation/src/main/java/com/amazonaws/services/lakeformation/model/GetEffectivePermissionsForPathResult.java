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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/GetEffectivePermissionsForPath"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetEffectivePermissionsForPathResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * A list of the permissions for the specified table or database resource located at the path in Amazon S3.
     * </p>
     */
    private java.util.List<PrincipalResourcePermissions> permissions;
    /**
     * <p>
     * A continuation token, if this is not the first call to retrieve this list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of the permissions for the specified table or database resource located at the path in Amazon S3.
     * </p>
     * 
     * @return A list of the permissions for the specified table or database resource located at the path in Amazon S3.
     */

    public java.util.List<PrincipalResourcePermissions> getPermissions() {
        return permissions;
    }

    /**
     * <p>
     * A list of the permissions for the specified table or database resource located at the path in Amazon S3.
     * </p>
     * 
     * @param permissions
     *        A list of the permissions for the specified table or database resource located at the path in Amazon S3.
     */

    public void setPermissions(java.util.Collection<PrincipalResourcePermissions> permissions) {
        if (permissions == null) {
            this.permissions = null;
            return;
        }

        this.permissions = new java.util.ArrayList<PrincipalResourcePermissions>(permissions);
    }

    /**
     * <p>
     * A list of the permissions for the specified table or database resource located at the path in Amazon S3.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPermissions(java.util.Collection)} or {@link #withPermissions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param permissions
     *        A list of the permissions for the specified table or database resource located at the path in Amazon S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEffectivePermissionsForPathResult withPermissions(PrincipalResourcePermissions... permissions) {
        if (this.permissions == null) {
            setPermissions(new java.util.ArrayList<PrincipalResourcePermissions>(permissions.length));
        }
        for (PrincipalResourcePermissions ele : permissions) {
            this.permissions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the permissions for the specified table or database resource located at the path in Amazon S3.
     * </p>
     * 
     * @param permissions
     *        A list of the permissions for the specified table or database resource located at the path in Amazon S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEffectivePermissionsForPathResult withPermissions(java.util.Collection<PrincipalResourcePermissions> permissions) {
        setPermissions(permissions);
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

    public GetEffectivePermissionsForPathResult withNextToken(String nextToken) {
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

        if (obj instanceof GetEffectivePermissionsForPathResult == false)
            return false;
        GetEffectivePermissionsForPathResult other = (GetEffectivePermissionsForPathResult) obj;
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
    public GetEffectivePermissionsForPathResult clone() {
        try {
            return (GetEffectivePermissionsForPathResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
