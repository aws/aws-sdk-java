/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class AddRoleToDBClusterRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the DB cluster to associate the IAM role with.
     * </p>
     */
    private String dBClusterIdentifier;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role to associate with the Aurora DB cluster, for example
     * <code>arn:aws:iam::123456789012:role/AuroraAccessRole</code>.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * The name of the DB cluster to associate the IAM role with.
     * </p>
     * 
     * @param dBClusterIdentifier
     *        The name of the DB cluster to associate the IAM role with.
     */

    public void setDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
    }

    /**
     * <p>
     * The name of the DB cluster to associate the IAM role with.
     * </p>
     * 
     * @return The name of the DB cluster to associate the IAM role with.
     */

    public String getDBClusterIdentifier() {
        return this.dBClusterIdentifier;
    }

    /**
     * <p>
     * The name of the DB cluster to associate the IAM role with.
     * </p>
     * 
     * @param dBClusterIdentifier
     *        The name of the DB cluster to associate the IAM role with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddRoleToDBClusterRequest withDBClusterIdentifier(String dBClusterIdentifier) {
        setDBClusterIdentifier(dBClusterIdentifier);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role to associate with the Aurora DB cluster, for example
     * <code>arn:aws:iam::123456789012:role/AuroraAccessRole</code>.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role to associate with the Aurora DB cluster, for example
     *        <code>arn:aws:iam::123456789012:role/AuroraAccessRole</code>.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role to associate with the Aurora DB cluster, for example
     * <code>arn:aws:iam::123456789012:role/AuroraAccessRole</code>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role to associate with the Aurora DB cluster, for example
     *         <code>arn:aws:iam::123456789012:role/AuroraAccessRole</code>.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role to associate with the Aurora DB cluster, for example
     * <code>arn:aws:iam::123456789012:role/AuroraAccessRole</code>.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role to associate with the Aurora DB cluster, for example
     *        <code>arn:aws:iam::123456789012:role/AuroraAccessRole</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddRoleToDBClusterRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("DBClusterIdentifier: " + getDBClusterIdentifier() + ",");
        if (getRoleArn() != null)
            sb.append("RoleArn: " + getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AddRoleToDBClusterRequest == false)
            return false;
        AddRoleToDBClusterRequest other = (AddRoleToDBClusterRequest) obj;
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
    public AddRoleToDBClusterRequest clone() {
        return (AddRoleToDBClusterRequest) super.clone();
    }
}
