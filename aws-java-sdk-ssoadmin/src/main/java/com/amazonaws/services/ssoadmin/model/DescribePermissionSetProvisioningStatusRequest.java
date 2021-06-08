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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DescribePermissionSetProvisioningStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribePermissionSetProvisioningStatusRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * The identifier that is provided by the <a>ProvisionPermissionSet</a> call to retrieve the current status of the
     * provisioning workflow.
     * </p>
     */
    private String provisionPermissionSetRequestId;

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

    public DescribePermissionSetProvisioningStatusRequest withInstanceArn(String instanceArn) {
        setInstanceArn(instanceArn);
        return this;
    }

    /**
     * <p>
     * The identifier that is provided by the <a>ProvisionPermissionSet</a> call to retrieve the current status of the
     * provisioning workflow.
     * </p>
     * 
     * @param provisionPermissionSetRequestId
     *        The identifier that is provided by the <a>ProvisionPermissionSet</a> call to retrieve the current status
     *        of the provisioning workflow.
     */

    public void setProvisionPermissionSetRequestId(String provisionPermissionSetRequestId) {
        this.provisionPermissionSetRequestId = provisionPermissionSetRequestId;
    }

    /**
     * <p>
     * The identifier that is provided by the <a>ProvisionPermissionSet</a> call to retrieve the current status of the
     * provisioning workflow.
     * </p>
     * 
     * @return The identifier that is provided by the <a>ProvisionPermissionSet</a> call to retrieve the current status
     *         of the provisioning workflow.
     */

    public String getProvisionPermissionSetRequestId() {
        return this.provisionPermissionSetRequestId;
    }

    /**
     * <p>
     * The identifier that is provided by the <a>ProvisionPermissionSet</a> call to retrieve the current status of the
     * provisioning workflow.
     * </p>
     * 
     * @param provisionPermissionSetRequestId
     *        The identifier that is provided by the <a>ProvisionPermissionSet</a> call to retrieve the current status
     *        of the provisioning workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePermissionSetProvisioningStatusRequest withProvisionPermissionSetRequestId(String provisionPermissionSetRequestId) {
        setProvisionPermissionSetRequestId(provisionPermissionSetRequestId);
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
        if (getProvisionPermissionSetRequestId() != null)
            sb.append("ProvisionPermissionSetRequestId: ").append(getProvisionPermissionSetRequestId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribePermissionSetProvisioningStatusRequest == false)
            return false;
        DescribePermissionSetProvisioningStatusRequest other = (DescribePermissionSetProvisioningStatusRequest) obj;
        if (other.getInstanceArn() == null ^ this.getInstanceArn() == null)
            return false;
        if (other.getInstanceArn() != null && other.getInstanceArn().equals(this.getInstanceArn()) == false)
            return false;
        if (other.getProvisionPermissionSetRequestId() == null ^ this.getProvisionPermissionSetRequestId() == null)
            return false;
        if (other.getProvisionPermissionSetRequestId() != null
                && other.getProvisionPermissionSetRequestId().equals(this.getProvisionPermissionSetRequestId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceArn() == null) ? 0 : getInstanceArn().hashCode());
        hashCode = prime * hashCode + ((getProvisionPermissionSetRequestId() == null) ? 0 : getProvisionPermissionSetRequestId().hashCode());
        return hashCode;
    }

    @Override
    public DescribePermissionSetProvisioningStatusRequest clone() {
        return (DescribePermissionSetProvisioningStatusRequest) super.clone();
    }

}
