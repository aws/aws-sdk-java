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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An IAM role that the cluster can use to access other AWS services.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsRedshiftClusterIamRole"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsRedshiftClusterIamRole implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The status of the IAM role's association with the cluster.
     * </p>
     * <p>
     * Valid values: <code>in-sync</code> | <code>adding</code> | <code>removing</code>
     * </p>
     */
    private String applyStatus;
    /**
     * <p>
     * The ARN of the IAM role.
     * </p>
     */
    private String iamRoleArn;

    /**
     * <p>
     * The status of the IAM role's association with the cluster.
     * </p>
     * <p>
     * Valid values: <code>in-sync</code> | <code>adding</code> | <code>removing</code>
     * </p>
     * 
     * @param applyStatus
     *        The status of the IAM role's association with the cluster.</p>
     *        <p>
     *        Valid values: <code>in-sync</code> | <code>adding</code> | <code>removing</code>
     */

    public void setApplyStatus(String applyStatus) {
        this.applyStatus = applyStatus;
    }

    /**
     * <p>
     * The status of the IAM role's association with the cluster.
     * </p>
     * <p>
     * Valid values: <code>in-sync</code> | <code>adding</code> | <code>removing</code>
     * </p>
     * 
     * @return The status of the IAM role's association with the cluster.</p>
     *         <p>
     *         Valid values: <code>in-sync</code> | <code>adding</code> | <code>removing</code>
     */

    public String getApplyStatus() {
        return this.applyStatus;
    }

    /**
     * <p>
     * The status of the IAM role's association with the cluster.
     * </p>
     * <p>
     * Valid values: <code>in-sync</code> | <code>adding</code> | <code>removing</code>
     * </p>
     * 
     * @param applyStatus
     *        The status of the IAM role's association with the cluster.</p>
     *        <p>
     *        Valid values: <code>in-sync</code> | <code>adding</code> | <code>removing</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterIamRole withApplyStatus(String applyStatus) {
        setApplyStatus(applyStatus);
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM role.
     * </p>
     * 
     * @param iamRoleArn
     *        The ARN of the IAM role.
     */

    public void setIamRoleArn(String iamRoleArn) {
        this.iamRoleArn = iamRoleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role.
     * </p>
     * 
     * @return The ARN of the IAM role.
     */

    public String getIamRoleArn() {
        return this.iamRoleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role.
     * </p>
     * 
     * @param iamRoleArn
     *        The ARN of the IAM role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterIamRole withIamRoleArn(String iamRoleArn) {
        setIamRoleArn(iamRoleArn);
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
        if (getApplyStatus() != null)
            sb.append("ApplyStatus: ").append(getApplyStatus()).append(",");
        if (getIamRoleArn() != null)
            sb.append("IamRoleArn: ").append(getIamRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsRedshiftClusterIamRole == false)
            return false;
        AwsRedshiftClusterIamRole other = (AwsRedshiftClusterIamRole) obj;
        if (other.getApplyStatus() == null ^ this.getApplyStatus() == null)
            return false;
        if (other.getApplyStatus() != null && other.getApplyStatus().equals(this.getApplyStatus()) == false)
            return false;
        if (other.getIamRoleArn() == null ^ this.getIamRoleArn() == null)
            return false;
        if (other.getIamRoleArn() != null && other.getIamRoleArn().equals(this.getIamRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplyStatus() == null) ? 0 : getApplyStatus().hashCode());
        hashCode = prime * hashCode + ((getIamRoleArn() == null) ? 0 : getIamRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public AwsRedshiftClusterIamRole clone() {
        try {
            return (AwsRedshiftClusterIamRole) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsRedshiftClusterIamRoleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
