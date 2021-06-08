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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DescribeAccountAssignmentDeletionStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAccountAssignmentDeletionStatusRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * The identifier that is used to track the request operation progress.
     * </p>
     */
    private String accountAssignmentDeletionRequestId;

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

    public DescribeAccountAssignmentDeletionStatusRequest withInstanceArn(String instanceArn) {
        setInstanceArn(instanceArn);
        return this;
    }

    /**
     * <p>
     * The identifier that is used to track the request operation progress.
     * </p>
     * 
     * @param accountAssignmentDeletionRequestId
     *        The identifier that is used to track the request operation progress.
     */

    public void setAccountAssignmentDeletionRequestId(String accountAssignmentDeletionRequestId) {
        this.accountAssignmentDeletionRequestId = accountAssignmentDeletionRequestId;
    }

    /**
     * <p>
     * The identifier that is used to track the request operation progress.
     * </p>
     * 
     * @return The identifier that is used to track the request operation progress.
     */

    public String getAccountAssignmentDeletionRequestId() {
        return this.accountAssignmentDeletionRequestId;
    }

    /**
     * <p>
     * The identifier that is used to track the request operation progress.
     * </p>
     * 
     * @param accountAssignmentDeletionRequestId
     *        The identifier that is used to track the request operation progress.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAccountAssignmentDeletionStatusRequest withAccountAssignmentDeletionRequestId(String accountAssignmentDeletionRequestId) {
        setAccountAssignmentDeletionRequestId(accountAssignmentDeletionRequestId);
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
        if (getAccountAssignmentDeletionRequestId() != null)
            sb.append("AccountAssignmentDeletionRequestId: ").append(getAccountAssignmentDeletionRequestId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAccountAssignmentDeletionStatusRequest == false)
            return false;
        DescribeAccountAssignmentDeletionStatusRequest other = (DescribeAccountAssignmentDeletionStatusRequest) obj;
        if (other.getInstanceArn() == null ^ this.getInstanceArn() == null)
            return false;
        if (other.getInstanceArn() != null && other.getInstanceArn().equals(this.getInstanceArn()) == false)
            return false;
        if (other.getAccountAssignmentDeletionRequestId() == null ^ this.getAccountAssignmentDeletionRequestId() == null)
            return false;
        if (other.getAccountAssignmentDeletionRequestId() != null
                && other.getAccountAssignmentDeletionRequestId().equals(this.getAccountAssignmentDeletionRequestId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceArn() == null) ? 0 : getInstanceArn().hashCode());
        hashCode = prime * hashCode + ((getAccountAssignmentDeletionRequestId() == null) ? 0 : getAccountAssignmentDeletionRequestId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAccountAssignmentDeletionStatusRequest clone() {
        return (DescribeAccountAssignmentDeletionStatusRequest) super.clone();
    }

}
