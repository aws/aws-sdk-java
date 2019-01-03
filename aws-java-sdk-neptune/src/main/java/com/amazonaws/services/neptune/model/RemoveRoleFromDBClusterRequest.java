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
package com.amazonaws.services.neptune.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptune-2014-10-31/RemoveRoleFromDBCluster" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RemoveRoleFromDBClusterRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the DB cluster to disassociate the IAM role from.
     * </p>
     */
    private String dBClusterIdentifier;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role to disassociate from the DB cluster, for example
     * <code>arn:aws:iam::123456789012:role/NeptuneAccessRole</code>.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * The name of the DB cluster to disassociate the IAM role from.
     * </p>
     * 
     * @param dBClusterIdentifier
     *        The name of the DB cluster to disassociate the IAM role from.
     */

    public void setDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
    }

    /**
     * <p>
     * The name of the DB cluster to disassociate the IAM role from.
     * </p>
     * 
     * @return The name of the DB cluster to disassociate the IAM role from.
     */

    public String getDBClusterIdentifier() {
        return this.dBClusterIdentifier;
    }

    /**
     * <p>
     * The name of the DB cluster to disassociate the IAM role from.
     * </p>
     * 
     * @param dBClusterIdentifier
     *        The name of the DB cluster to disassociate the IAM role from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveRoleFromDBClusterRequest withDBClusterIdentifier(String dBClusterIdentifier) {
        setDBClusterIdentifier(dBClusterIdentifier);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role to disassociate from the DB cluster, for example
     * <code>arn:aws:iam::123456789012:role/NeptuneAccessRole</code>.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role to disassociate from the DB cluster, for example
     *        <code>arn:aws:iam::123456789012:role/NeptuneAccessRole</code>.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role to disassociate from the DB cluster, for example
     * <code>arn:aws:iam::123456789012:role/NeptuneAccessRole</code>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role to disassociate from the DB cluster, for example
     *         <code>arn:aws:iam::123456789012:role/NeptuneAccessRole</code>.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role to disassociate from the DB cluster, for example
     * <code>arn:aws:iam::123456789012:role/NeptuneAccessRole</code>.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role to disassociate from the DB cluster, for example
     *        <code>arn:aws:iam::123456789012:role/NeptuneAccessRole</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveRoleFromDBClusterRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
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
        if (getDBClusterIdentifier() != null)
            sb.append("DBClusterIdentifier: ").append(getDBClusterIdentifier()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RemoveRoleFromDBClusterRequest == false)
            return false;
        RemoveRoleFromDBClusterRequest other = (RemoveRoleFromDBClusterRequest) obj;
        if (other.getDBClusterIdentifier() == null ^ this.getDBClusterIdentifier() == null)
            return false;
        if (other.getDBClusterIdentifier() != null && other.getDBClusterIdentifier().equals(this.getDBClusterIdentifier()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDBClusterIdentifier() == null) ? 0 : getDBClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public RemoveRoleFromDBClusterRequest clone() {
        return (RemoveRoleFromDBClusterRequest) super.clone();
    }

}
