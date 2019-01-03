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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * An AWS Identity and Access Management (IAM) role that can be used by the associated Amazon Redshift cluster to access
 * other AWS services.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ClusterIamRole" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClusterIamRole implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role, for example,
     * <code>arn:aws:iam::123456789012:role/RedshiftCopyUnload</code>.
     * </p>
     */
    private String iamRoleArn;
    /**
     * <p>
     * A value that describes the status of the IAM role's association with an Amazon Redshift cluster.
     * </p>
     * <p>
     * The following are possible statuses and descriptions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>in-sync</code>: The role is available for use by the cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>adding</code>: The role is in the process of being associated with the cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>removing</code>: The role is in the process of being disassociated with the cluster.
     * </p>
     * </li>
     * </ul>
     */
    private String applyStatus;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role, for example,
     * <code>arn:aws:iam::123456789012:role/RedshiftCopyUnload</code>.
     * </p>
     * 
     * @param iamRoleArn
     *        The Amazon Resource Name (ARN) of the IAM role, for example,
     *        <code>arn:aws:iam::123456789012:role/RedshiftCopyUnload</code>.
     */

    public void setIamRoleArn(String iamRoleArn) {
        this.iamRoleArn = iamRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role, for example,
     * <code>arn:aws:iam::123456789012:role/RedshiftCopyUnload</code>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role, for example,
     *         <code>arn:aws:iam::123456789012:role/RedshiftCopyUnload</code>.
     */

    public String getIamRoleArn() {
        return this.iamRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role, for example,
     * <code>arn:aws:iam::123456789012:role/RedshiftCopyUnload</code>.
     * </p>
     * 
     * @param iamRoleArn
     *        The Amazon Resource Name (ARN) of the IAM role, for example,
     *        <code>arn:aws:iam::123456789012:role/RedshiftCopyUnload</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterIamRole withIamRoleArn(String iamRoleArn) {
        setIamRoleArn(iamRoleArn);
        return this;
    }

    /**
     * <p>
     * A value that describes the status of the IAM role's association with an Amazon Redshift cluster.
     * </p>
     * <p>
     * The following are possible statuses and descriptions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>in-sync</code>: The role is available for use by the cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>adding</code>: The role is in the process of being associated with the cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>removing</code>: The role is in the process of being disassociated with the cluster.
     * </p>
     * </li>
     * </ul>
     * 
     * @param applyStatus
     *        A value that describes the status of the IAM role's association with an Amazon Redshift cluster.</p>
     *        <p>
     *        The following are possible statuses and descriptions.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>in-sync</code>: The role is available for use by the cluster.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>adding</code>: The role is in the process of being associated with the cluster.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>removing</code>: The role is in the process of being disassociated with the cluster.
     *        </p>
     *        </li>
     */

    public void setApplyStatus(String applyStatus) {
        this.applyStatus = applyStatus;
    }

    /**
     * <p>
     * A value that describes the status of the IAM role's association with an Amazon Redshift cluster.
     * </p>
     * <p>
     * The following are possible statuses and descriptions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>in-sync</code>: The role is available for use by the cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>adding</code>: The role is in the process of being associated with the cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>removing</code>: The role is in the process of being disassociated with the cluster.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A value that describes the status of the IAM role's association with an Amazon Redshift cluster.</p>
     *         <p>
     *         The following are possible statuses and descriptions.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>in-sync</code>: The role is available for use by the cluster.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>adding</code>: The role is in the process of being associated with the cluster.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>removing</code>: The role is in the process of being disassociated with the cluster.
     *         </p>
     *         </li>
     */

    public String getApplyStatus() {
        return this.applyStatus;
    }

    /**
     * <p>
     * A value that describes the status of the IAM role's association with an Amazon Redshift cluster.
     * </p>
     * <p>
     * The following are possible statuses and descriptions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>in-sync</code>: The role is available for use by the cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>adding</code>: The role is in the process of being associated with the cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>removing</code>: The role is in the process of being disassociated with the cluster.
     * </p>
     * </li>
     * </ul>
     * 
     * @param applyStatus
     *        A value that describes the status of the IAM role's association with an Amazon Redshift cluster.</p>
     *        <p>
     *        The following are possible statuses and descriptions.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>in-sync</code>: The role is available for use by the cluster.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>adding</code>: The role is in the process of being associated with the cluster.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>removing</code>: The role is in the process of being disassociated with the cluster.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterIamRole withApplyStatus(String applyStatus) {
        setApplyStatus(applyStatus);
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
        if (getIamRoleArn() != null)
            sb.append("IamRoleArn: ").append(getIamRoleArn()).append(",");
        if (getApplyStatus() != null)
            sb.append("ApplyStatus: ").append(getApplyStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClusterIamRole == false)
            return false;
        ClusterIamRole other = (ClusterIamRole) obj;
        if (other.getIamRoleArn() == null ^ this.getIamRoleArn() == null)
            return false;
        if (other.getIamRoleArn() != null && other.getIamRoleArn().equals(this.getIamRoleArn()) == false)
            return false;
        if (other.getApplyStatus() == null ^ this.getApplyStatus() == null)
            return false;
        if (other.getApplyStatus() != null && other.getApplyStatus().equals(this.getApplyStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIamRoleArn() == null) ? 0 : getIamRoleArn().hashCode());
        hashCode = prime * hashCode + ((getApplyStatus() == null) ? 0 : getApplyStatus().hashCode());
        return hashCode;
    }

    @Override
    public ClusterIamRole clone() {
        try {
            return (ClusterIamRole) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
