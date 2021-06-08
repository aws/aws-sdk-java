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
package com.amazonaws.services.cloudhsmv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/ModifyCluster" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyClusterRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A policy that defines how the service retains backups.
     * </p>
     */
    private BackupRetentionPolicy backupRetentionPolicy;
    /**
     * <p>
     * The identifier (ID) of the cluster that you want to modify. To find the cluster ID, use <a>DescribeClusters</a>.
     * </p>
     */
    private String clusterId;

    /**
     * <p>
     * A policy that defines how the service retains backups.
     * </p>
     * 
     * @param backupRetentionPolicy
     *        A policy that defines how the service retains backups.
     */

    public void setBackupRetentionPolicy(BackupRetentionPolicy backupRetentionPolicy) {
        this.backupRetentionPolicy = backupRetentionPolicy;
    }

    /**
     * <p>
     * A policy that defines how the service retains backups.
     * </p>
     * 
     * @return A policy that defines how the service retains backups.
     */

    public BackupRetentionPolicy getBackupRetentionPolicy() {
        return this.backupRetentionPolicy;
    }

    /**
     * <p>
     * A policy that defines how the service retains backups.
     * </p>
     * 
     * @param backupRetentionPolicy
     *        A policy that defines how the service retains backups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyClusterRequest withBackupRetentionPolicy(BackupRetentionPolicy backupRetentionPolicy) {
        setBackupRetentionPolicy(backupRetentionPolicy);
        return this;
    }

    /**
     * <p>
     * The identifier (ID) of the cluster that you want to modify. To find the cluster ID, use <a>DescribeClusters</a>.
     * </p>
     * 
     * @param clusterId
     *        The identifier (ID) of the cluster that you want to modify. To find the cluster ID, use
     *        <a>DescribeClusters</a>.
     */

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    /**
     * <p>
     * The identifier (ID) of the cluster that you want to modify. To find the cluster ID, use <a>DescribeClusters</a>.
     * </p>
     * 
     * @return The identifier (ID) of the cluster that you want to modify. To find the cluster ID, use
     *         <a>DescribeClusters</a>.
     */

    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * <p>
     * The identifier (ID) of the cluster that you want to modify. To find the cluster ID, use <a>DescribeClusters</a>.
     * </p>
     * 
     * @param clusterId
     *        The identifier (ID) of the cluster that you want to modify. To find the cluster ID, use
     *        <a>DescribeClusters</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyClusterRequest withClusterId(String clusterId) {
        setClusterId(clusterId);
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
        if (getBackupRetentionPolicy() != null)
            sb.append("BackupRetentionPolicy: ").append(getBackupRetentionPolicy()).append(",");
        if (getClusterId() != null)
            sb.append("ClusterId: ").append(getClusterId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyClusterRequest == false)
            return false;
        ModifyClusterRequest other = (ModifyClusterRequest) obj;
        if (other.getBackupRetentionPolicy() == null ^ this.getBackupRetentionPolicy() == null)
            return false;
        if (other.getBackupRetentionPolicy() != null && other.getBackupRetentionPolicy().equals(this.getBackupRetentionPolicy()) == false)
            return false;
        if (other.getClusterId() == null ^ this.getClusterId() == null)
            return false;
        if (other.getClusterId() != null && other.getClusterId().equals(this.getClusterId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBackupRetentionPolicy() == null) ? 0 : getBackupRetentionPolicy().hashCode());
        hashCode = prime * hashCode + ((getClusterId() == null) ? 0 : getClusterId().hashCode());
        return hashCode;
    }

    @Override
    public ModifyClusterRequest clone() {
        return (ModifyClusterRequest) super.clone();
    }

}
