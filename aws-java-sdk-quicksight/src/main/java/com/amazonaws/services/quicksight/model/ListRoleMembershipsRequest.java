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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListRoleMemberships" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRoleMembershipsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the role.
     * </p>
     */
    private String role;
    /**
     * <p>
     * A pagination token that can be used in a subsequent request.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The ID for the Amazon Web Services account that you want to create a group in. The Amazon Web Services account ID
     * that you provide must be the same Amazon Web Services account that contains your Amazon QuickSight account.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * The namespace that includes the role.
     * </p>
     */
    private String namespace;

    /**
     * <p>
     * The name of the role.
     * </p>
     * 
     * @param role
     *        The name of the role.
     * @see Role
     */

    public void setRole(String role) {
        this.role = role;
    }

    /**
     * <p>
     * The name of the role.
     * </p>
     * 
     * @return The name of the role.
     * @see Role
     */

    public String getRole() {
        return this.role;
    }

    /**
     * <p>
     * The name of the role.
     * </p>
     * 
     * @param role
     *        The name of the role.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Role
     */

    public ListRoleMembershipsRequest withRole(String role) {
        setRole(role);
        return this;
    }

    /**
     * <p>
     * The name of the role.
     * </p>
     * 
     * @param role
     *        The name of the role.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Role
     */

    public ListRoleMembershipsRequest withRole(Role role) {
        this.role = role.toString();
        return this;
    }

    /**
     * <p>
     * A pagination token that can be used in a subsequent request.
     * </p>
     * 
     * @param nextToken
     *        A pagination token that can be used in a subsequent request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token that can be used in a subsequent request.
     * </p>
     * 
     * @return A pagination token that can be used in a subsequent request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A pagination token that can be used in a subsequent request.
     * </p>
     * 
     * @param nextToken
     *        A pagination token that can be used in a subsequent request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRoleMembershipsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * 
     * @return The maximum number of results to return.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRoleMembershipsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The ID for the Amazon Web Services account that you want to create a group in. The Amazon Web Services account ID
     * that you provide must be the same Amazon Web Services account that contains your Amazon QuickSight account.
     * </p>
     * 
     * @param awsAccountId
     *        The ID for the Amazon Web Services account that you want to create a group in. The Amazon Web Services
     *        account ID that you provide must be the same Amazon Web Services account that contains your Amazon
     *        QuickSight account.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The ID for the Amazon Web Services account that you want to create a group in. The Amazon Web Services account ID
     * that you provide must be the same Amazon Web Services account that contains your Amazon QuickSight account.
     * </p>
     * 
     * @return The ID for the Amazon Web Services account that you want to create a group in. The Amazon Web Services
     *         account ID that you provide must be the same Amazon Web Services account that contains your Amazon
     *         QuickSight account.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The ID for the Amazon Web Services account that you want to create a group in. The Amazon Web Services account ID
     * that you provide must be the same Amazon Web Services account that contains your Amazon QuickSight account.
     * </p>
     * 
     * @param awsAccountId
     *        The ID for the Amazon Web Services account that you want to create a group in. The Amazon Web Services
     *        account ID that you provide must be the same Amazon Web Services account that contains your Amazon
     *        QuickSight account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRoleMembershipsRequest withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * The namespace that includes the role.
     * </p>
     * 
     * @param namespace
     *        The namespace that includes the role.
     */

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * The namespace that includes the role.
     * </p>
     * 
     * @return The namespace that includes the role.
     */

    public String getNamespace() {
        return this.namespace;
    }

    /**
     * <p>
     * The namespace that includes the role.
     * </p>
     * 
     * @param namespace
     *        The namespace that includes the role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRoleMembershipsRequest withNamespace(String namespace) {
        setNamespace(namespace);
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
        if (getRole() != null)
            sb.append("Role: ").append(getRole()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: ").append(getAwsAccountId()).append(",");
        if (getNamespace() != null)
            sb.append("Namespace: ").append(getNamespace());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRoleMembershipsRequest == false)
            return false;
        ListRoleMembershipsRequest other = (ListRoleMembershipsRequest) obj;
        if (other.getRole() == null ^ this.getRole() == null)
            return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        return hashCode;
    }

    @Override
    public ListRoleMembershipsRequest clone() {
        return (ListRoleMembershipsRequest) super.clone();
    }

}
