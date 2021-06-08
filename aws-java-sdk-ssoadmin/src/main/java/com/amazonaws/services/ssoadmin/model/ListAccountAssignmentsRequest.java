/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListAccountAssignments" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAccountAssignmentsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the SSO instance under which the operation will be executed. For more information about ARNs, see <a
     * href="/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and AWS Service
     * Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     */
    private String instanceArn;
    /**
     * <p>
     * The identifier of the AWS account from which to list the assignments.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The ARN of the permission set from which to list assignments.
     * </p>
     */
    private String permissionSetArn;
    /**
     * <p>
     * The maximum number of results to display for the assignment.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The pagination token for the list API. Initially the value is null. Use the output of previous API calls to make
     * subsequent calls.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The ARN of the SSO instance under which the operation will be executed. For more information about ARNs, see <a
     * href="/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and AWS Service
     * Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param instanceArn
     *        The ARN of the SSO instance under which the operation will be executed. For more information about ARNs,
     *        see <a href="/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and AWS Service
     *        Namespaces</a> in the <i>AWS General Reference</i>.
     */

    public void setInstanceArn(String instanceArn) {
        this.instanceArn = instanceArn;
    }

    /**
     * <p>
     * The ARN of the SSO instance under which the operation will be executed. For more information about ARNs, see <a
     * href="/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and AWS Service
     * Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @return The ARN of the SSO instance under which the operation will be executed. For more information about ARNs,
     *         see <a href="/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and AWS
     *         Service Namespaces</a> in the <i>AWS General Reference</i>.
     */

    public String getInstanceArn() {
        return this.instanceArn;
    }

    /**
     * <p>
     * The ARN of the SSO instance under which the operation will be executed. For more information about ARNs, see <a
     * href="/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and AWS Service
     * Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param instanceArn
     *        The ARN of the SSO instance under which the operation will be executed. For more information about ARNs,
     *        see <a href="/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and AWS Service
     *        Namespaces</a> in the <i>AWS General Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccountAssignmentsRequest withInstanceArn(String instanceArn) {
        setInstanceArn(instanceArn);
        return this;
    }

    /**
     * <p>
     * The identifier of the AWS account from which to list the assignments.
     * </p>
     * 
     * @param accountId
     *        The identifier of the AWS account from which to list the assignments.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The identifier of the AWS account from which to list the assignments.
     * </p>
     * 
     * @return The identifier of the AWS account from which to list the assignments.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The identifier of the AWS account from which to list the assignments.
     * </p>
     * 
     * @param accountId
     *        The identifier of the AWS account from which to list the assignments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccountAssignmentsRequest withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The ARN of the permission set from which to list assignments.
     * </p>
     * 
     * @param permissionSetArn
     *        The ARN of the permission set from which to list assignments.
     */

    public void setPermissionSetArn(String permissionSetArn) {
        this.permissionSetArn = permissionSetArn;
    }

    /**
     * <p>
     * The ARN of the permission set from which to list assignments.
     * </p>
     * 
     * @return The ARN of the permission set from which to list assignments.
     */

    public String getPermissionSetArn() {
        return this.permissionSetArn;
    }

    /**
     * <p>
     * The ARN of the permission set from which to list assignments.
     * </p>
     * 
     * @param permissionSetArn
     *        The ARN of the permission set from which to list assignments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccountAssignmentsRequest withPermissionSetArn(String permissionSetArn) {
        setPermissionSetArn(permissionSetArn);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to display for the assignment.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to display for the assignment.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to display for the assignment.
     * </p>
     * 
     * @return The maximum number of results to display for the assignment.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to display for the assignment.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to display for the assignment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccountAssignmentsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
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

    public ListAccountAssignmentsRequest withNextToken(String nextToken) {
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
        if (getInstanceArn() != null)
            sb.append("InstanceArn: ").append(getInstanceArn()).append(",");
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getPermissionSetArn() != null)
            sb.append("PermissionSetArn: ").append(getPermissionSetArn()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
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

        if (obj instanceof ListAccountAssignmentsRequest == false)
            return false;
        ListAccountAssignmentsRequest other = (ListAccountAssignmentsRequest) obj;
        if (other.getInstanceArn() == null ^ this.getInstanceArn() == null)
            return false;
        if (other.getInstanceArn() != null && other.getInstanceArn().equals(this.getInstanceArn()) == false)
            return false;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getPermissionSetArn() == null ^ this.getPermissionSetArn() == null)
            return false;
        if (other.getPermissionSetArn() != null && other.getPermissionSetArn().equals(this.getPermissionSetArn()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
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

        hashCode = prime * hashCode + ((getInstanceArn() == null) ? 0 : getInstanceArn().hashCode());
        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getPermissionSetArn() == null) ? 0 : getPermissionSetArn().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAccountAssignmentsRequest clone() {
        return (ListAccountAssignmentsRequest) super.clone();
    }

}
