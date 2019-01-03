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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/RebootReplicationInstance" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RebootReplicationInstanceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication instance.
     * </p>
     */
    private String replicationInstanceArn;
    /**
     * <p>
     * If this parameter is <code>true</code>, the reboot is conducted through a Multi-AZ failover. (If the instance
     * isn't configured for Multi-AZ, then you can't specify <code>true</code>.)
     * </p>
     */
    private Boolean forceFailover;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication instance.
     * </p>
     * 
     * @param replicationInstanceArn
     *        The Amazon Resource Name (ARN) of the replication instance.
     */

    public void setReplicationInstanceArn(String replicationInstanceArn) {
        this.replicationInstanceArn = replicationInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication instance.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the replication instance.
     */

    public String getReplicationInstanceArn() {
        return this.replicationInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication instance.
     * </p>
     * 
     * @param replicationInstanceArn
     *        The Amazon Resource Name (ARN) of the replication instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RebootReplicationInstanceRequest withReplicationInstanceArn(String replicationInstanceArn) {
        setReplicationInstanceArn(replicationInstanceArn);
        return this;
    }

    /**
     * <p>
     * If this parameter is <code>true</code>, the reboot is conducted through a Multi-AZ failover. (If the instance
     * isn't configured for Multi-AZ, then you can't specify <code>true</code>.)
     * </p>
     * 
     * @param forceFailover
     *        If this parameter is <code>true</code>, the reboot is conducted through a Multi-AZ failover. (If the
     *        instance isn't configured for Multi-AZ, then you can't specify <code>true</code>.)
     */

    public void setForceFailover(Boolean forceFailover) {
        this.forceFailover = forceFailover;
    }

    /**
     * <p>
     * If this parameter is <code>true</code>, the reboot is conducted through a Multi-AZ failover. (If the instance
     * isn't configured for Multi-AZ, then you can't specify <code>true</code>.)
     * </p>
     * 
     * @return If this parameter is <code>true</code>, the reboot is conducted through a Multi-AZ failover. (If the
     *         instance isn't configured for Multi-AZ, then you can't specify <code>true</code>.)
     */

    public Boolean getForceFailover() {
        return this.forceFailover;
    }

    /**
     * <p>
     * If this parameter is <code>true</code>, the reboot is conducted through a Multi-AZ failover. (If the instance
     * isn't configured for Multi-AZ, then you can't specify <code>true</code>.)
     * </p>
     * 
     * @param forceFailover
     *        If this parameter is <code>true</code>, the reboot is conducted through a Multi-AZ failover. (If the
     *        instance isn't configured for Multi-AZ, then you can't specify <code>true</code>.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RebootReplicationInstanceRequest withForceFailover(Boolean forceFailover) {
        setForceFailover(forceFailover);
        return this;
    }

    /**
     * <p>
     * If this parameter is <code>true</code>, the reboot is conducted through a Multi-AZ failover. (If the instance
     * isn't configured for Multi-AZ, then you can't specify <code>true</code>.)
     * </p>
     * 
     * @return If this parameter is <code>true</code>, the reboot is conducted through a Multi-AZ failover. (If the
     *         instance isn't configured for Multi-AZ, then you can't specify <code>true</code>.)
     */

    public Boolean isForceFailover() {
        return this.forceFailover;
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
        if (getReplicationInstanceArn() != null)
            sb.append("ReplicationInstanceArn: ").append(getReplicationInstanceArn()).append(",");
        if (getForceFailover() != null)
            sb.append("ForceFailover: ").append(getForceFailover());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RebootReplicationInstanceRequest == false)
            return false;
        RebootReplicationInstanceRequest other = (RebootReplicationInstanceRequest) obj;
        if (other.getReplicationInstanceArn() == null ^ this.getReplicationInstanceArn() == null)
            return false;
        if (other.getReplicationInstanceArn() != null && other.getReplicationInstanceArn().equals(this.getReplicationInstanceArn()) == false)
            return false;
        if (other.getForceFailover() == null ^ this.getForceFailover() == null)
            return false;
        if (other.getForceFailover() != null && other.getForceFailover().equals(this.getForceFailover()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReplicationInstanceArn() == null) ? 0 : getReplicationInstanceArn().hashCode());
        hashCode = prime * hashCode + ((getForceFailover() == null) ? 0 : getForceFailover().hashCode());
        return hashCode;
    }

    @Override
    public RebootReplicationInstanceRequest clone() {
        return (RebootReplicationInstanceRequest) super.clone();
    }

}
