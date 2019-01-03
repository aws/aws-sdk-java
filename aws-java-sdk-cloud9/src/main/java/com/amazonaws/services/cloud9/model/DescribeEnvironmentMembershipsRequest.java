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
package com.amazonaws.services.cloud9.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloud9-2017-09-23/DescribeEnvironmentMemberships"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeEnvironmentMembershipsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an individual environment member to get information about. If no value is
     * specified, information about all environment members are returned.
     * </p>
     */
    private String userArn;
    /**
     * <p>
     * The ID of the environment to get environment member information about.
     * </p>
     */
    private String environmentId;
    /**
     * <p>
     * The type of environment member permissions to get information about. Available values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>owner</code>: Owns the environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>read-only</code>: Has read-only access to the environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>read-write</code>: Has read-write access to the environment.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If no value is specified, information about all environment members are returned.
     * </p>
     */
    private java.util.List<String> permissions;
    /**
     * <p>
     * During a previous call, if there are more than 25 items in the list, only the first 25 items are returned, along
     * with a unique string called a <i>next token</i>. To get the next batch of items in the list, call this operation
     * again, adding the next token to the call. To get all of the items in the list, keep calling this operation with
     * each subsequent next token that is returned, until no more next tokens are returned.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of environment members to get information about.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an individual environment member to get information about. If no value is
     * specified, information about all environment members are returned.
     * </p>
     * 
     * @param userArn
     *        The Amazon Resource Name (ARN) of an individual environment member to get information about. If no value
     *        is specified, information about all environment members are returned.
     */

    public void setUserArn(String userArn) {
        this.userArn = userArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an individual environment member to get information about. If no value is
     * specified, information about all environment members are returned.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an individual environment member to get information about. If no value
     *         is specified, information about all environment members are returned.
     */

    public String getUserArn() {
        return this.userArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an individual environment member to get information about. If no value is
     * specified, information about all environment members are returned.
     * </p>
     * 
     * @param userArn
     *        The Amazon Resource Name (ARN) of an individual environment member to get information about. If no value
     *        is specified, information about all environment members are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEnvironmentMembershipsRequest withUserArn(String userArn) {
        setUserArn(userArn);
        return this;
    }

    /**
     * <p>
     * The ID of the environment to get environment member information about.
     * </p>
     * 
     * @param environmentId
     *        The ID of the environment to get environment member information about.
     */

    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    /**
     * <p>
     * The ID of the environment to get environment member information about.
     * </p>
     * 
     * @return The ID of the environment to get environment member information about.
     */

    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * <p>
     * The ID of the environment to get environment member information about.
     * </p>
     * 
     * @param environmentId
     *        The ID of the environment to get environment member information about.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEnvironmentMembershipsRequest withEnvironmentId(String environmentId) {
        setEnvironmentId(environmentId);
        return this;
    }

    /**
     * <p>
     * The type of environment member permissions to get information about. Available values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>owner</code>: Owns the environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>read-only</code>: Has read-only access to the environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>read-write</code>: Has read-write access to the environment.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If no value is specified, information about all environment members are returned.
     * </p>
     * 
     * @return The type of environment member permissions to get information about. Available values include:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>owner</code>: Owns the environment.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>read-only</code>: Has read-only access to the environment.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>read-write</code>: Has read-write access to the environment.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If no value is specified, information about all environment members are returned.
     * @see Permissions
     */

    public java.util.List<String> getPermissions() {
        return permissions;
    }

    /**
     * <p>
     * The type of environment member permissions to get information about. Available values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>owner</code>: Owns the environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>read-only</code>: Has read-only access to the environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>read-write</code>: Has read-write access to the environment.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If no value is specified, information about all environment members are returned.
     * </p>
     * 
     * @param permissions
     *        The type of environment member permissions to get information about. Available values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>owner</code>: Owns the environment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>read-only</code>: Has read-only access to the environment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>read-write</code>: Has read-write access to the environment.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If no value is specified, information about all environment members are returned.
     * @see Permissions
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
     * The type of environment member permissions to get information about. Available values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>owner</code>: Owns the environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>read-only</code>: Has read-only access to the environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>read-write</code>: Has read-write access to the environment.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If no value is specified, information about all environment members are returned.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPermissions(java.util.Collection)} or {@link #withPermissions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param permissions
     *        The type of environment member permissions to get information about. Available values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>owner</code>: Owns the environment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>read-only</code>: Has read-only access to the environment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>read-write</code>: Has read-write access to the environment.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If no value is specified, information about all environment members are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Permissions
     */

    public DescribeEnvironmentMembershipsRequest withPermissions(String... permissions) {
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
     * The type of environment member permissions to get information about. Available values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>owner</code>: Owns the environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>read-only</code>: Has read-only access to the environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>read-write</code>: Has read-write access to the environment.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If no value is specified, information about all environment members are returned.
     * </p>
     * 
     * @param permissions
     *        The type of environment member permissions to get information about. Available values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>owner</code>: Owns the environment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>read-only</code>: Has read-only access to the environment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>read-write</code>: Has read-write access to the environment.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If no value is specified, information about all environment members are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Permissions
     */

    public DescribeEnvironmentMembershipsRequest withPermissions(java.util.Collection<String> permissions) {
        setPermissions(permissions);
        return this;
    }

    /**
     * <p>
     * The type of environment member permissions to get information about. Available values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>owner</code>: Owns the environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>read-only</code>: Has read-only access to the environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>read-write</code>: Has read-write access to the environment.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If no value is specified, information about all environment members are returned.
     * </p>
     * 
     * @param permissions
     *        The type of environment member permissions to get information about. Available values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>owner</code>: Owns the environment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>read-only</code>: Has read-only access to the environment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>read-write</code>: Has read-write access to the environment.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If no value is specified, information about all environment members are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Permissions
     */

    public DescribeEnvironmentMembershipsRequest withPermissions(Permissions... permissions) {
        java.util.ArrayList<String> permissionsCopy = new java.util.ArrayList<String>(permissions.length);
        for (Permissions value : permissions) {
            permissionsCopy.add(value.toString());
        }
        if (getPermissions() == null) {
            setPermissions(permissionsCopy);
        } else {
            getPermissions().addAll(permissionsCopy);
        }
        return this;
    }

    /**
     * <p>
     * During a previous call, if there are more than 25 items in the list, only the first 25 items are returned, along
     * with a unique string called a <i>next token</i>. To get the next batch of items in the list, call this operation
     * again, adding the next token to the call. To get all of the items in the list, keep calling this operation with
     * each subsequent next token that is returned, until no more next tokens are returned.
     * </p>
     * 
     * @param nextToken
     *        During a previous call, if there are more than 25 items in the list, only the first 25 items are returned,
     *        along with a unique string called a <i>next token</i>. To get the next batch of items in the list, call
     *        this operation again, adding the next token to the call. To get all of the items in the list, keep calling
     *        this operation with each subsequent next token that is returned, until no more next tokens are returned.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * During a previous call, if there are more than 25 items in the list, only the first 25 items are returned, along
     * with a unique string called a <i>next token</i>. To get the next batch of items in the list, call this operation
     * again, adding the next token to the call. To get all of the items in the list, keep calling this operation with
     * each subsequent next token that is returned, until no more next tokens are returned.
     * </p>
     * 
     * @return During a previous call, if there are more than 25 items in the list, only the first 25 items are
     *         returned, along with a unique string called a <i>next token</i>. To get the next batch of items in the
     *         list, call this operation again, adding the next token to the call. To get all of the items in the list,
     *         keep calling this operation with each subsequent next token that is returned, until no more next tokens
     *         are returned.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * During a previous call, if there are more than 25 items in the list, only the first 25 items are returned, along
     * with a unique string called a <i>next token</i>. To get the next batch of items in the list, call this operation
     * again, adding the next token to the call. To get all of the items in the list, keep calling this operation with
     * each subsequent next token that is returned, until no more next tokens are returned.
     * </p>
     * 
     * @param nextToken
     *        During a previous call, if there are more than 25 items in the list, only the first 25 items are returned,
     *        along with a unique string called a <i>next token</i>. To get the next batch of items in the list, call
     *        this operation again, adding the next token to the call. To get all of the items in the list, keep calling
     *        this operation with each subsequent next token that is returned, until no more next tokens are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEnvironmentMembershipsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of environment members to get information about.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of environment members to get information about.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of environment members to get information about.
     * </p>
     * 
     * @return The maximum number of environment members to get information about.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of environment members to get information about.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of environment members to get information about.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEnvironmentMembershipsRequest withMaxResults(Integer maxResults) {
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
        if (getUserArn() != null)
            sb.append("UserArn: ").append(getUserArn()).append(",");
        if (getEnvironmentId() != null)
            sb.append("EnvironmentId: ").append(getEnvironmentId()).append(",");
        if (getPermissions() != null)
            sb.append("Permissions: ").append(getPermissions()).append(",");
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

        if (obj instanceof DescribeEnvironmentMembershipsRequest == false)
            return false;
        DescribeEnvironmentMembershipsRequest other = (DescribeEnvironmentMembershipsRequest) obj;
        if (other.getUserArn() == null ^ this.getUserArn() == null)
            return false;
        if (other.getUserArn() != null && other.getUserArn().equals(this.getUserArn()) == false)
            return false;
        if (other.getEnvironmentId() == null ^ this.getEnvironmentId() == null)
            return false;
        if (other.getEnvironmentId() != null && other.getEnvironmentId().equals(this.getEnvironmentId()) == false)
            return false;
        if (other.getPermissions() == null ^ this.getPermissions() == null)
            return false;
        if (other.getPermissions() != null && other.getPermissions().equals(this.getPermissions()) == false)
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

        hashCode = prime * hashCode + ((getUserArn() == null) ? 0 : getUserArn().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentId() == null) ? 0 : getEnvironmentId().hashCode());
        hashCode = prime * hashCode + ((getPermissions() == null) ? 0 : getPermissions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public DescribeEnvironmentMembershipsRequest clone() {
        return (DescribeEnvironmentMembershipsRequest) super.clone();
    }

}
