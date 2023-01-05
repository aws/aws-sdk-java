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
package com.amazonaws.services.finspacedata.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/ListUsersByPermissionGroup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListUsersByPermissionGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier for the permission group.
     * </p>
     */
    private String permissionGroupId;
    /**
     * <p>
     * A token that indicates where a results page should begin.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results per page.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The unique identifier for the permission group.
     * </p>
     * 
     * @param permissionGroupId
     *        The unique identifier for the permission group.
     */

    public void setPermissionGroupId(String permissionGroupId) {
        this.permissionGroupId = permissionGroupId;
    }

    /**
     * <p>
     * The unique identifier for the permission group.
     * </p>
     * 
     * @return The unique identifier for the permission group.
     */

    public String getPermissionGroupId() {
        return this.permissionGroupId;
    }

    /**
     * <p>
     * The unique identifier for the permission group.
     * </p>
     * 
     * @param permissionGroupId
     *        The unique identifier for the permission group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUsersByPermissionGroupRequest withPermissionGroupId(String permissionGroupId) {
        setPermissionGroupId(permissionGroupId);
        return this;
    }

    /**
     * <p>
     * A token that indicates where a results page should begin.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates where a results page should begin.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that indicates where a results page should begin.
     * </p>
     * 
     * @return A token that indicates where a results page should begin.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token that indicates where a results page should begin.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates where a results page should begin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUsersByPermissionGroupRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results per page.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results per page.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results per page.
     * </p>
     * 
     * @return The maximum number of results per page.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results per page.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results per page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUsersByPermissionGroupRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getPermissionGroupId() != null)
            sb.append("PermissionGroupId: ").append(getPermissionGroupId()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListUsersByPermissionGroupRequest == false)
            return false;
        ListUsersByPermissionGroupRequest other = (ListUsersByPermissionGroupRequest) obj;
        if (other.getPermissionGroupId() == null ^ this.getPermissionGroupId() == null)
            return false;
        if (other.getPermissionGroupId() != null && other.getPermissionGroupId().equals(this.getPermissionGroupId()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPermissionGroupId() == null) ? 0 : getPermissionGroupId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListUsersByPermissionGroupRequest clone() {
        return (ListUsersByPermissionGroupRequest) super.clone();
    }

}
