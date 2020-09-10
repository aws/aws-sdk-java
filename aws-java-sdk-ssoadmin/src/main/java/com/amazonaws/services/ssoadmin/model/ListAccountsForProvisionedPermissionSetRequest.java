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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListAccountsForProvisionedPermissionSet"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAccountsForProvisionedPermissionSetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * The ARN of the <a>PermissionSet</a> from which the associated AWS accounts will be listed.
     * </p>
     */
    private String permissionSetArn;
    /**
     * <p>
     * The permission set provisioning status for an AWS account.
     * </p>
     */
    private String provisioningStatus;
    /**
     * <p>
     * The maximum number of results to display for the <a>PermissionSet</a>.
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

    public ListAccountsForProvisionedPermissionSetRequest withInstanceArn(String instanceArn) {
        setInstanceArn(instanceArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the <a>PermissionSet</a> from which the associated AWS accounts will be listed.
     * </p>
     * 
     * @param permissionSetArn
     *        The ARN of the <a>PermissionSet</a> from which the associated AWS accounts will be listed.
     */

    public void setPermissionSetArn(String permissionSetArn) {
        this.permissionSetArn = permissionSetArn;
    }

    /**
     * <p>
     * The ARN of the <a>PermissionSet</a> from which the associated AWS accounts will be listed.
     * </p>
     * 
     * @return The ARN of the <a>PermissionSet</a> from which the associated AWS accounts will be listed.
     */

    public String getPermissionSetArn() {
        return this.permissionSetArn;
    }

    /**
     * <p>
     * The ARN of the <a>PermissionSet</a> from which the associated AWS accounts will be listed.
     * </p>
     * 
     * @param permissionSetArn
     *        The ARN of the <a>PermissionSet</a> from which the associated AWS accounts will be listed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccountsForProvisionedPermissionSetRequest withPermissionSetArn(String permissionSetArn) {
        setPermissionSetArn(permissionSetArn);
        return this;
    }

    /**
     * <p>
     * The permission set provisioning status for an AWS account.
     * </p>
     * 
     * @param provisioningStatus
     *        The permission set provisioning status for an AWS account.
     * @see ProvisioningStatus
     */

    public void setProvisioningStatus(String provisioningStatus) {
        this.provisioningStatus = provisioningStatus;
    }

    /**
     * <p>
     * The permission set provisioning status for an AWS account.
     * </p>
     * 
     * @return The permission set provisioning status for an AWS account.
     * @see ProvisioningStatus
     */

    public String getProvisioningStatus() {
        return this.provisioningStatus;
    }

    /**
     * <p>
     * The permission set provisioning status for an AWS account.
     * </p>
     * 
     * @param provisioningStatus
     *        The permission set provisioning status for an AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProvisioningStatus
     */

    public ListAccountsForProvisionedPermissionSetRequest withProvisioningStatus(String provisioningStatus) {
        setProvisioningStatus(provisioningStatus);
        return this;
    }

    /**
     * <p>
     * The permission set provisioning status for an AWS account.
     * </p>
     * 
     * @param provisioningStatus
     *        The permission set provisioning status for an AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProvisioningStatus
     */

    public ListAccountsForProvisionedPermissionSetRequest withProvisioningStatus(ProvisioningStatus provisioningStatus) {
        this.provisioningStatus = provisioningStatus.toString();
        return this;
    }

    /**
     * <p>
     * The maximum number of results to display for the <a>PermissionSet</a>.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to display for the <a>PermissionSet</a>.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to display for the <a>PermissionSet</a>.
     * </p>
     * 
     * @return The maximum number of results to display for the <a>PermissionSet</a>.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to display for the <a>PermissionSet</a>.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to display for the <a>PermissionSet</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccountsForProvisionedPermissionSetRequest withMaxResults(Integer maxResults) {
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

    public ListAccountsForProvisionedPermissionSetRequest withNextToken(String nextToken) {
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
        if (getPermissionSetArn() != null)
            sb.append("PermissionSetArn: ").append(getPermissionSetArn()).append(",");
        if (getProvisioningStatus() != null)
            sb.append("ProvisioningStatus: ").append(getProvisioningStatus()).append(",");
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

        if (obj instanceof ListAccountsForProvisionedPermissionSetRequest == false)
            return false;
        ListAccountsForProvisionedPermissionSetRequest other = (ListAccountsForProvisionedPermissionSetRequest) obj;
        if (other.getInstanceArn() == null ^ this.getInstanceArn() == null)
            return false;
        if (other.getInstanceArn() != null && other.getInstanceArn().equals(this.getInstanceArn()) == false)
            return false;
        if (other.getPermissionSetArn() == null ^ this.getPermissionSetArn() == null)
            return false;
        if (other.getPermissionSetArn() != null && other.getPermissionSetArn().equals(this.getPermissionSetArn()) == false)
            return false;
        if (other.getProvisioningStatus() == null ^ this.getProvisioningStatus() == null)
            return false;
        if (other.getProvisioningStatus() != null && other.getProvisioningStatus().equals(this.getProvisioningStatus()) == false)
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
        hashCode = prime * hashCode + ((getPermissionSetArn() == null) ? 0 : getPermissionSetArn().hashCode());
        hashCode = prime * hashCode + ((getProvisioningStatus() == null) ? 0 : getProvisioningStatus().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAccountsForProvisionedPermissionSetRequest clone() {
        return (ListAccountsForProvisionedPermissionSetRequest) super.clone();
    }

}
