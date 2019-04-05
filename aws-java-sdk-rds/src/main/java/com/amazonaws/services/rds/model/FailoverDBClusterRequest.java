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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/FailoverDBCluster" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FailoverDBClusterRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A DB cluster identifier to force a failover for. This parameter is not case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing DBCluster.
     * </p>
     * </li>
     * </ul>
     */
    private String dBClusterIdentifier;
    /**
     * <p>
     * The name of the instance to promote to the primary instance.
     * </p>
     * <p>
     * You must specify the instance identifier for an Aurora Replica in the DB cluster. For example,
     * <code>mydbcluster-replica1</code>.
     * </p>
     */
    private String targetDBInstanceIdentifier;

    /**
     * <p>
     * A DB cluster identifier to force a failover for. This parameter is not case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing DBCluster.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dBClusterIdentifier
     *        A DB cluster identifier to force a failover for. This parameter is not case-sensitive.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must match the identifier of an existing DBCluster.
     *        </p>
     *        </li>
     */

    public void setDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
    }

    /**
     * <p>
     * A DB cluster identifier to force a failover for. This parameter is not case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing DBCluster.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A DB cluster identifier to force a failover for. This parameter is not case-sensitive.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must match the identifier of an existing DBCluster.
     *         </p>
     *         </li>
     */

    public String getDBClusterIdentifier() {
        return this.dBClusterIdentifier;
    }

    /**
     * <p>
     * A DB cluster identifier to force a failover for. This parameter is not case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing DBCluster.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dBClusterIdentifier
     *        A DB cluster identifier to force a failover for. This parameter is not case-sensitive.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must match the identifier of an existing DBCluster.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailoverDBClusterRequest withDBClusterIdentifier(String dBClusterIdentifier) {
        setDBClusterIdentifier(dBClusterIdentifier);
        return this;
    }

    /**
     * <p>
     * The name of the instance to promote to the primary instance.
     * </p>
     * <p>
     * You must specify the instance identifier for an Aurora Replica in the DB cluster. For example,
     * <code>mydbcluster-replica1</code>.
     * </p>
     * 
     * @param targetDBInstanceIdentifier
     *        The name of the instance to promote to the primary instance.</p>
     *        <p>
     *        You must specify the instance identifier for an Aurora Replica in the DB cluster. For example,
     *        <code>mydbcluster-replica1</code>.
     */

    public void setTargetDBInstanceIdentifier(String targetDBInstanceIdentifier) {
        this.targetDBInstanceIdentifier = targetDBInstanceIdentifier;
    }

    /**
     * <p>
     * The name of the instance to promote to the primary instance.
     * </p>
     * <p>
     * You must specify the instance identifier for an Aurora Replica in the DB cluster. For example,
     * <code>mydbcluster-replica1</code>.
     * </p>
     * 
     * @return The name of the instance to promote to the primary instance.</p>
     *         <p>
     *         You must specify the instance identifier for an Aurora Replica in the DB cluster. For example,
     *         <code>mydbcluster-replica1</code>.
     */

    public String getTargetDBInstanceIdentifier() {
        return this.targetDBInstanceIdentifier;
    }

    /**
     * <p>
     * The name of the instance to promote to the primary instance.
     * </p>
     * <p>
     * You must specify the instance identifier for an Aurora Replica in the DB cluster. For example,
     * <code>mydbcluster-replica1</code>.
     * </p>
     * 
     * @param targetDBInstanceIdentifier
     *        The name of the instance to promote to the primary instance.</p>
     *        <p>
     *        You must specify the instance identifier for an Aurora Replica in the DB cluster. For example,
     *        <code>mydbcluster-replica1</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailoverDBClusterRequest withTargetDBInstanceIdentifier(String targetDBInstanceIdentifier) {
        setTargetDBInstanceIdentifier(targetDBInstanceIdentifier);
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
        if (getTargetDBInstanceIdentifier() != null)
            sb.append("TargetDBInstanceIdentifier: ").append(getTargetDBInstanceIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FailoverDBClusterRequest == false)
            return false;
        FailoverDBClusterRequest other = (FailoverDBClusterRequest) obj;
        if (other.getDBClusterIdentifier() == null ^ this.getDBClusterIdentifier() == null)
            return false;
        if (other.getDBClusterIdentifier() != null && other.getDBClusterIdentifier().equals(this.getDBClusterIdentifier()) == false)
            return false;
        if (other.getTargetDBInstanceIdentifier() == null ^ this.getTargetDBInstanceIdentifier() == null)
            return false;
        if (other.getTargetDBInstanceIdentifier() != null && other.getTargetDBInstanceIdentifier().equals(this.getTargetDBInstanceIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDBClusterIdentifier() == null) ? 0 : getDBClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getTargetDBInstanceIdentifier() == null) ? 0 : getTargetDBInstanceIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public FailoverDBClusterRequest clone() {
        return (FailoverDBClusterRequest) super.clone();
    }

}
