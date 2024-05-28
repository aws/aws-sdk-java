/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/ModifyReplicationConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyReplicationConfigRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name of the replication to modify.
     * </p>
     */
    private String replicationConfigArn;
    /**
     * <p>
     * The new replication config to apply to the replication.
     * </p>
     */
    private String replicationConfigIdentifier;
    /**
     * <p>
     * The type of replication.
     * </p>
     */
    private String replicationType;
    /**
     * <p>
     * Table mappings specified in the replication.
     * </p>
     */
    private String tableMappings;
    /**
     * <p>
     * The settings for the replication.
     * </p>
     */
    private String replicationSettings;
    /**
     * <p>
     * Additional settings for the replication.
     * </p>
     */
    private String supplementalSettings;
    /**
     * <p>
     * Configuration parameters for provisioning an DMS Serverless replication.
     * </p>
     */
    private ComputeConfig computeConfig;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source endpoint for this DMS serverless replication configuration.
     * </p>
     */
    private String sourceEndpointArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the target endpoint for this DMS serverless replication configuration.
     * </p>
     */
    private String targetEndpointArn;

    /**
     * <p>
     * The Amazon Resource Name of the replication to modify.
     * </p>
     * 
     * @param replicationConfigArn
     *        The Amazon Resource Name of the replication to modify.
     */

    public void setReplicationConfigArn(String replicationConfigArn) {
        this.replicationConfigArn = replicationConfigArn;
    }

    /**
     * <p>
     * The Amazon Resource Name of the replication to modify.
     * </p>
     * 
     * @return The Amazon Resource Name of the replication to modify.
     */

    public String getReplicationConfigArn() {
        return this.replicationConfigArn;
    }

    /**
     * <p>
     * The Amazon Resource Name of the replication to modify.
     * </p>
     * 
     * @param replicationConfigArn
     *        The Amazon Resource Name of the replication to modify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyReplicationConfigRequest withReplicationConfigArn(String replicationConfigArn) {
        setReplicationConfigArn(replicationConfigArn);
        return this;
    }

    /**
     * <p>
     * The new replication config to apply to the replication.
     * </p>
     * 
     * @param replicationConfigIdentifier
     *        The new replication config to apply to the replication.
     */

    public void setReplicationConfigIdentifier(String replicationConfigIdentifier) {
        this.replicationConfigIdentifier = replicationConfigIdentifier;
    }

    /**
     * <p>
     * The new replication config to apply to the replication.
     * </p>
     * 
     * @return The new replication config to apply to the replication.
     */

    public String getReplicationConfigIdentifier() {
        return this.replicationConfigIdentifier;
    }

    /**
     * <p>
     * The new replication config to apply to the replication.
     * </p>
     * 
     * @param replicationConfigIdentifier
     *        The new replication config to apply to the replication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyReplicationConfigRequest withReplicationConfigIdentifier(String replicationConfigIdentifier) {
        setReplicationConfigIdentifier(replicationConfigIdentifier);
        return this;
    }

    /**
     * <p>
     * The type of replication.
     * </p>
     * 
     * @param replicationType
     *        The type of replication.
     * @see MigrationTypeValue
     */

    public void setReplicationType(String replicationType) {
        this.replicationType = replicationType;
    }

    /**
     * <p>
     * The type of replication.
     * </p>
     * 
     * @return The type of replication.
     * @see MigrationTypeValue
     */

    public String getReplicationType() {
        return this.replicationType;
    }

    /**
     * <p>
     * The type of replication.
     * </p>
     * 
     * @param replicationType
     *        The type of replication.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MigrationTypeValue
     */

    public ModifyReplicationConfigRequest withReplicationType(String replicationType) {
        setReplicationType(replicationType);
        return this;
    }

    /**
     * <p>
     * The type of replication.
     * </p>
     * 
     * @param replicationType
     *        The type of replication.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MigrationTypeValue
     */

    public ModifyReplicationConfigRequest withReplicationType(MigrationTypeValue replicationType) {
        this.replicationType = replicationType.toString();
        return this;
    }

    /**
     * <p>
     * Table mappings specified in the replication.
     * </p>
     * 
     * @param tableMappings
     *        Table mappings specified in the replication.
     */

    public void setTableMappings(String tableMappings) {
        this.tableMappings = tableMappings;
    }

    /**
     * <p>
     * Table mappings specified in the replication.
     * </p>
     * 
     * @return Table mappings specified in the replication.
     */

    public String getTableMappings() {
        return this.tableMappings;
    }

    /**
     * <p>
     * Table mappings specified in the replication.
     * </p>
     * 
     * @param tableMappings
     *        Table mappings specified in the replication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyReplicationConfigRequest withTableMappings(String tableMappings) {
        setTableMappings(tableMappings);
        return this;
    }

    /**
     * <p>
     * The settings for the replication.
     * </p>
     * 
     * @param replicationSettings
     *        The settings for the replication.
     */

    public void setReplicationSettings(String replicationSettings) {
        this.replicationSettings = replicationSettings;
    }

    /**
     * <p>
     * The settings for the replication.
     * </p>
     * 
     * @return The settings for the replication.
     */

    public String getReplicationSettings() {
        return this.replicationSettings;
    }

    /**
     * <p>
     * The settings for the replication.
     * </p>
     * 
     * @param replicationSettings
     *        The settings for the replication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyReplicationConfigRequest withReplicationSettings(String replicationSettings) {
        setReplicationSettings(replicationSettings);
        return this;
    }

    /**
     * <p>
     * Additional settings for the replication.
     * </p>
     * 
     * @param supplementalSettings
     *        Additional settings for the replication.
     */

    public void setSupplementalSettings(String supplementalSettings) {
        this.supplementalSettings = supplementalSettings;
    }

    /**
     * <p>
     * Additional settings for the replication.
     * </p>
     * 
     * @return Additional settings for the replication.
     */

    public String getSupplementalSettings() {
        return this.supplementalSettings;
    }

    /**
     * <p>
     * Additional settings for the replication.
     * </p>
     * 
     * @param supplementalSettings
     *        Additional settings for the replication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyReplicationConfigRequest withSupplementalSettings(String supplementalSettings) {
        setSupplementalSettings(supplementalSettings);
        return this;
    }

    /**
     * <p>
     * Configuration parameters for provisioning an DMS Serverless replication.
     * </p>
     * 
     * @param computeConfig
     *        Configuration parameters for provisioning an DMS Serverless replication.
     */

    public void setComputeConfig(ComputeConfig computeConfig) {
        this.computeConfig = computeConfig;
    }

    /**
     * <p>
     * Configuration parameters for provisioning an DMS Serverless replication.
     * </p>
     * 
     * @return Configuration parameters for provisioning an DMS Serverless replication.
     */

    public ComputeConfig getComputeConfig() {
        return this.computeConfig;
    }

    /**
     * <p>
     * Configuration parameters for provisioning an DMS Serverless replication.
     * </p>
     * 
     * @param computeConfig
     *        Configuration parameters for provisioning an DMS Serverless replication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyReplicationConfigRequest withComputeConfig(ComputeConfig computeConfig) {
        setComputeConfig(computeConfig);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source endpoint for this DMS serverless replication configuration.
     * </p>
     * 
     * @param sourceEndpointArn
     *        The Amazon Resource Name (ARN) of the source endpoint for this DMS serverless replication configuration.
     */

    public void setSourceEndpointArn(String sourceEndpointArn) {
        this.sourceEndpointArn = sourceEndpointArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source endpoint for this DMS serverless replication configuration.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the source endpoint for this DMS serverless replication configuration.
     */

    public String getSourceEndpointArn() {
        return this.sourceEndpointArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source endpoint for this DMS serverless replication configuration.
     * </p>
     * 
     * @param sourceEndpointArn
     *        The Amazon Resource Name (ARN) of the source endpoint for this DMS serverless replication configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyReplicationConfigRequest withSourceEndpointArn(String sourceEndpointArn) {
        setSourceEndpointArn(sourceEndpointArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the target endpoint for this DMS serverless replication configuration.
     * </p>
     * 
     * @param targetEndpointArn
     *        The Amazon Resource Name (ARN) of the target endpoint for this DMS serverless replication configuration.
     */

    public void setTargetEndpointArn(String targetEndpointArn) {
        this.targetEndpointArn = targetEndpointArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the target endpoint for this DMS serverless replication configuration.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the target endpoint for this DMS serverless replication configuration.
     */

    public String getTargetEndpointArn() {
        return this.targetEndpointArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the target endpoint for this DMS serverless replication configuration.
     * </p>
     * 
     * @param targetEndpointArn
     *        The Amazon Resource Name (ARN) of the target endpoint for this DMS serverless replication configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyReplicationConfigRequest withTargetEndpointArn(String targetEndpointArn) {
        setTargetEndpointArn(targetEndpointArn);
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
        if (getReplicationConfigArn() != null)
            sb.append("ReplicationConfigArn: ").append(getReplicationConfigArn()).append(",");
        if (getReplicationConfigIdentifier() != null)
            sb.append("ReplicationConfigIdentifier: ").append(getReplicationConfigIdentifier()).append(",");
        if (getReplicationType() != null)
            sb.append("ReplicationType: ").append(getReplicationType()).append(",");
        if (getTableMappings() != null)
            sb.append("TableMappings: ").append(getTableMappings()).append(",");
        if (getReplicationSettings() != null)
            sb.append("ReplicationSettings: ").append(getReplicationSettings()).append(",");
        if (getSupplementalSettings() != null)
            sb.append("SupplementalSettings: ").append(getSupplementalSettings()).append(",");
        if (getComputeConfig() != null)
            sb.append("ComputeConfig: ").append(getComputeConfig()).append(",");
        if (getSourceEndpointArn() != null)
            sb.append("SourceEndpointArn: ").append(getSourceEndpointArn()).append(",");
        if (getTargetEndpointArn() != null)
            sb.append("TargetEndpointArn: ").append(getTargetEndpointArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyReplicationConfigRequest == false)
            return false;
        ModifyReplicationConfigRequest other = (ModifyReplicationConfigRequest) obj;
        if (other.getReplicationConfigArn() == null ^ this.getReplicationConfigArn() == null)
            return false;
        if (other.getReplicationConfigArn() != null && other.getReplicationConfigArn().equals(this.getReplicationConfigArn()) == false)
            return false;
        if (other.getReplicationConfigIdentifier() == null ^ this.getReplicationConfigIdentifier() == null)
            return false;
        if (other.getReplicationConfigIdentifier() != null && other.getReplicationConfigIdentifier().equals(this.getReplicationConfigIdentifier()) == false)
            return false;
        if (other.getReplicationType() == null ^ this.getReplicationType() == null)
            return false;
        if (other.getReplicationType() != null && other.getReplicationType().equals(this.getReplicationType()) == false)
            return false;
        if (other.getTableMappings() == null ^ this.getTableMappings() == null)
            return false;
        if (other.getTableMappings() != null && other.getTableMappings().equals(this.getTableMappings()) == false)
            return false;
        if (other.getReplicationSettings() == null ^ this.getReplicationSettings() == null)
            return false;
        if (other.getReplicationSettings() != null && other.getReplicationSettings().equals(this.getReplicationSettings()) == false)
            return false;
        if (other.getSupplementalSettings() == null ^ this.getSupplementalSettings() == null)
            return false;
        if (other.getSupplementalSettings() != null && other.getSupplementalSettings().equals(this.getSupplementalSettings()) == false)
            return false;
        if (other.getComputeConfig() == null ^ this.getComputeConfig() == null)
            return false;
        if (other.getComputeConfig() != null && other.getComputeConfig().equals(this.getComputeConfig()) == false)
            return false;
        if (other.getSourceEndpointArn() == null ^ this.getSourceEndpointArn() == null)
            return false;
        if (other.getSourceEndpointArn() != null && other.getSourceEndpointArn().equals(this.getSourceEndpointArn()) == false)
            return false;
        if (other.getTargetEndpointArn() == null ^ this.getTargetEndpointArn() == null)
            return false;
        if (other.getTargetEndpointArn() != null && other.getTargetEndpointArn().equals(this.getTargetEndpointArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReplicationConfigArn() == null) ? 0 : getReplicationConfigArn().hashCode());
        hashCode = prime * hashCode + ((getReplicationConfigIdentifier() == null) ? 0 : getReplicationConfigIdentifier().hashCode());
        hashCode = prime * hashCode + ((getReplicationType() == null) ? 0 : getReplicationType().hashCode());
        hashCode = prime * hashCode + ((getTableMappings() == null) ? 0 : getTableMappings().hashCode());
        hashCode = prime * hashCode + ((getReplicationSettings() == null) ? 0 : getReplicationSettings().hashCode());
        hashCode = prime * hashCode + ((getSupplementalSettings() == null) ? 0 : getSupplementalSettings().hashCode());
        hashCode = prime * hashCode + ((getComputeConfig() == null) ? 0 : getComputeConfig().hashCode());
        hashCode = prime * hashCode + ((getSourceEndpointArn() == null) ? 0 : getSourceEndpointArn().hashCode());
        hashCode = prime * hashCode + ((getTargetEndpointArn() == null) ? 0 : getTargetEndpointArn().hashCode());
        return hashCode;
    }

    @Override
    public ModifyReplicationConfigRequest clone() {
        return (ModifyReplicationConfigRequest) super.clone();
    }

}
