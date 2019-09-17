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
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents the properties of a replica.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/ReplicaSettingsDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplicaSettingsDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The region name of the replica.
     * </p>
     */
    private String regionName;
    /**
     * <p>
     * The current state of the region:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The region is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The region is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The region is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The region is ready for use.
     * </p>
     * </li>
     * </ul>
     */
    private String replicaStatus;
    /**
     * <p>
     * The read/write capacity mode of the replica.
     * </p>
     */
    private BillingModeSummary replicaBillingModeSummary;
    /**
     * <p>
     * The maximum number of strongly consistent reads consumed per second before DynamoDB returns a
     * <code>ThrottlingException</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#ProvisionedThroughput"
     * >Specifying Read and Write Requirements</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     */
    private Long replicaProvisionedReadCapacityUnits;
    /**
     * <p>
     * Autoscaling settings for a global table replica's read capacity units.
     * </p>
     */
    private AutoScalingSettingsDescription replicaProvisionedReadCapacityAutoScalingSettings;
    /**
     * <p>
     * The maximum number of writes consumed per second before DynamoDB returns a <code>ThrottlingException</code>. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#ProvisionedThroughput"
     * >Specifying Read and Write Requirements</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     */
    private Long replicaProvisionedWriteCapacityUnits;
    /**
     * <p>
     * AutoScaling settings for a global table replica's write capacity units.
     * </p>
     */
    private AutoScalingSettingsDescription replicaProvisionedWriteCapacityAutoScalingSettings;
    /**
     * <p>
     * Replica global secondary index settings for the global table.
     * </p>
     */
    private java.util.List<ReplicaGlobalSecondaryIndexSettingsDescription> replicaGlobalSecondaryIndexSettings;

    /**
     * <p>
     * The region name of the replica.
     * </p>
     * 
     * @param regionName
     *        The region name of the replica.
     */

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    /**
     * <p>
     * The region name of the replica.
     * </p>
     * 
     * @return The region name of the replica.
     */

    public String getRegionName() {
        return this.regionName;
    }

    /**
     * <p>
     * The region name of the replica.
     * </p>
     * 
     * @param regionName
     *        The region name of the replica.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicaSettingsDescription withRegionName(String regionName) {
        setRegionName(regionName);
        return this;
    }

    /**
     * <p>
     * The current state of the region:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The region is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The region is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The region is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The region is ready for use.
     * </p>
     * </li>
     * </ul>
     * 
     * @param replicaStatus
     *        The current state of the region:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATING</code> - The region is being created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATING</code> - The region is being updated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code> - The region is being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code> - The region is ready for use.
     *        </p>
     *        </li>
     * @see ReplicaStatus
     */

    public void setReplicaStatus(String replicaStatus) {
        this.replicaStatus = replicaStatus;
    }

    /**
     * <p>
     * The current state of the region:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The region is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The region is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The region is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The region is ready for use.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The current state of the region:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CREATING</code> - The region is being created.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UPDATING</code> - The region is being updated.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETING</code> - The region is being deleted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ACTIVE</code> - The region is ready for use.
     *         </p>
     *         </li>
     * @see ReplicaStatus
     */

    public String getReplicaStatus() {
        return this.replicaStatus;
    }

    /**
     * <p>
     * The current state of the region:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The region is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The region is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The region is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The region is ready for use.
     * </p>
     * </li>
     * </ul>
     * 
     * @param replicaStatus
     *        The current state of the region:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATING</code> - The region is being created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATING</code> - The region is being updated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code> - The region is being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code> - The region is ready for use.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicaStatus
     */

    public ReplicaSettingsDescription withReplicaStatus(String replicaStatus) {
        setReplicaStatus(replicaStatus);
        return this;
    }

    /**
     * <p>
     * The current state of the region:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The region is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The region is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The region is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The region is ready for use.
     * </p>
     * </li>
     * </ul>
     * 
     * @param replicaStatus
     *        The current state of the region:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATING</code> - The region is being created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATING</code> - The region is being updated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code> - The region is being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code> - The region is ready for use.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicaStatus
     */

    public ReplicaSettingsDescription withReplicaStatus(ReplicaStatus replicaStatus) {
        this.replicaStatus = replicaStatus.toString();
        return this;
    }

    /**
     * <p>
     * The read/write capacity mode of the replica.
     * </p>
     * 
     * @param replicaBillingModeSummary
     *        The read/write capacity mode of the replica.
     */

    public void setReplicaBillingModeSummary(BillingModeSummary replicaBillingModeSummary) {
        this.replicaBillingModeSummary = replicaBillingModeSummary;
    }

    /**
     * <p>
     * The read/write capacity mode of the replica.
     * </p>
     * 
     * @return The read/write capacity mode of the replica.
     */

    public BillingModeSummary getReplicaBillingModeSummary() {
        return this.replicaBillingModeSummary;
    }

    /**
     * <p>
     * The read/write capacity mode of the replica.
     * </p>
     * 
     * @param replicaBillingModeSummary
     *        The read/write capacity mode of the replica.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicaSettingsDescription withReplicaBillingModeSummary(BillingModeSummary replicaBillingModeSummary) {
        setReplicaBillingModeSummary(replicaBillingModeSummary);
        return this;
    }

    /**
     * <p>
     * The maximum number of strongly consistent reads consumed per second before DynamoDB returns a
     * <code>ThrottlingException</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#ProvisionedThroughput"
     * >Specifying Read and Write Requirements</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @param replicaProvisionedReadCapacityUnits
     *        The maximum number of strongly consistent reads consumed per second before DynamoDB returns a
     *        <code>ThrottlingException</code>. For more information, see <a href=
     *        "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#ProvisionedThroughput"
     *        >Specifying Read and Write Requirements</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     */

    public void setReplicaProvisionedReadCapacityUnits(Long replicaProvisionedReadCapacityUnits) {
        this.replicaProvisionedReadCapacityUnits = replicaProvisionedReadCapacityUnits;
    }

    /**
     * <p>
     * The maximum number of strongly consistent reads consumed per second before DynamoDB returns a
     * <code>ThrottlingException</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#ProvisionedThroughput"
     * >Specifying Read and Write Requirements</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @return The maximum number of strongly consistent reads consumed per second before DynamoDB returns a
     *         <code>ThrottlingException</code>. For more information, see <a href=
     *         "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#ProvisionedThroughput"
     *         >Specifying Read and Write Requirements</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     */

    public Long getReplicaProvisionedReadCapacityUnits() {
        return this.replicaProvisionedReadCapacityUnits;
    }

    /**
     * <p>
     * The maximum number of strongly consistent reads consumed per second before DynamoDB returns a
     * <code>ThrottlingException</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#ProvisionedThroughput"
     * >Specifying Read and Write Requirements</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @param replicaProvisionedReadCapacityUnits
     *        The maximum number of strongly consistent reads consumed per second before DynamoDB returns a
     *        <code>ThrottlingException</code>. For more information, see <a href=
     *        "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#ProvisionedThroughput"
     *        >Specifying Read and Write Requirements</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicaSettingsDescription withReplicaProvisionedReadCapacityUnits(Long replicaProvisionedReadCapacityUnits) {
        setReplicaProvisionedReadCapacityUnits(replicaProvisionedReadCapacityUnits);
        return this;
    }

    /**
     * <p>
     * Autoscaling settings for a global table replica's read capacity units.
     * </p>
     * 
     * @param replicaProvisionedReadCapacityAutoScalingSettings
     *        Autoscaling settings for a global table replica's read capacity units.
     */

    public void setReplicaProvisionedReadCapacityAutoScalingSettings(AutoScalingSettingsDescription replicaProvisionedReadCapacityAutoScalingSettings) {
        this.replicaProvisionedReadCapacityAutoScalingSettings = replicaProvisionedReadCapacityAutoScalingSettings;
    }

    /**
     * <p>
     * Autoscaling settings for a global table replica's read capacity units.
     * </p>
     * 
     * @return Autoscaling settings for a global table replica's read capacity units.
     */

    public AutoScalingSettingsDescription getReplicaProvisionedReadCapacityAutoScalingSettings() {
        return this.replicaProvisionedReadCapacityAutoScalingSettings;
    }

    /**
     * <p>
     * Autoscaling settings for a global table replica's read capacity units.
     * </p>
     * 
     * @param replicaProvisionedReadCapacityAutoScalingSettings
     *        Autoscaling settings for a global table replica's read capacity units.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicaSettingsDescription withReplicaProvisionedReadCapacityAutoScalingSettings(
            AutoScalingSettingsDescription replicaProvisionedReadCapacityAutoScalingSettings) {
        setReplicaProvisionedReadCapacityAutoScalingSettings(replicaProvisionedReadCapacityAutoScalingSettings);
        return this;
    }

    /**
     * <p>
     * The maximum number of writes consumed per second before DynamoDB returns a <code>ThrottlingException</code>. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#ProvisionedThroughput"
     * >Specifying Read and Write Requirements</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @param replicaProvisionedWriteCapacityUnits
     *        The maximum number of writes consumed per second before DynamoDB returns a
     *        <code>ThrottlingException</code>. For more information, see <a href=
     *        "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#ProvisionedThroughput"
     *        >Specifying Read and Write Requirements</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     */

    public void setReplicaProvisionedWriteCapacityUnits(Long replicaProvisionedWriteCapacityUnits) {
        this.replicaProvisionedWriteCapacityUnits = replicaProvisionedWriteCapacityUnits;
    }

    /**
     * <p>
     * The maximum number of writes consumed per second before DynamoDB returns a <code>ThrottlingException</code>. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#ProvisionedThroughput"
     * >Specifying Read and Write Requirements</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @return The maximum number of writes consumed per second before DynamoDB returns a
     *         <code>ThrottlingException</code>. For more information, see <a href=
     *         "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#ProvisionedThroughput"
     *         >Specifying Read and Write Requirements</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     */

    public Long getReplicaProvisionedWriteCapacityUnits() {
        return this.replicaProvisionedWriteCapacityUnits;
    }

    /**
     * <p>
     * The maximum number of writes consumed per second before DynamoDB returns a <code>ThrottlingException</code>. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#ProvisionedThroughput"
     * >Specifying Read and Write Requirements</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @param replicaProvisionedWriteCapacityUnits
     *        The maximum number of writes consumed per second before DynamoDB returns a
     *        <code>ThrottlingException</code>. For more information, see <a href=
     *        "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#ProvisionedThroughput"
     *        >Specifying Read and Write Requirements</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicaSettingsDescription withReplicaProvisionedWriteCapacityUnits(Long replicaProvisionedWriteCapacityUnits) {
        setReplicaProvisionedWriteCapacityUnits(replicaProvisionedWriteCapacityUnits);
        return this;
    }

    /**
     * <p>
     * AutoScaling settings for a global table replica's write capacity units.
     * </p>
     * 
     * @param replicaProvisionedWriteCapacityAutoScalingSettings
     *        AutoScaling settings for a global table replica's write capacity units.
     */

    public void setReplicaProvisionedWriteCapacityAutoScalingSettings(AutoScalingSettingsDescription replicaProvisionedWriteCapacityAutoScalingSettings) {
        this.replicaProvisionedWriteCapacityAutoScalingSettings = replicaProvisionedWriteCapacityAutoScalingSettings;
    }

    /**
     * <p>
     * AutoScaling settings for a global table replica's write capacity units.
     * </p>
     * 
     * @return AutoScaling settings for a global table replica's write capacity units.
     */

    public AutoScalingSettingsDescription getReplicaProvisionedWriteCapacityAutoScalingSettings() {
        return this.replicaProvisionedWriteCapacityAutoScalingSettings;
    }

    /**
     * <p>
     * AutoScaling settings for a global table replica's write capacity units.
     * </p>
     * 
     * @param replicaProvisionedWriteCapacityAutoScalingSettings
     *        AutoScaling settings for a global table replica's write capacity units.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicaSettingsDescription withReplicaProvisionedWriteCapacityAutoScalingSettings(
            AutoScalingSettingsDescription replicaProvisionedWriteCapacityAutoScalingSettings) {
        setReplicaProvisionedWriteCapacityAutoScalingSettings(replicaProvisionedWriteCapacityAutoScalingSettings);
        return this;
    }

    /**
     * <p>
     * Replica global secondary index settings for the global table.
     * </p>
     * 
     * @return Replica global secondary index settings for the global table.
     */

    public java.util.List<ReplicaGlobalSecondaryIndexSettingsDescription> getReplicaGlobalSecondaryIndexSettings() {
        return replicaGlobalSecondaryIndexSettings;
    }

    /**
     * <p>
     * Replica global secondary index settings for the global table.
     * </p>
     * 
     * @param replicaGlobalSecondaryIndexSettings
     *        Replica global secondary index settings for the global table.
     */

    public void setReplicaGlobalSecondaryIndexSettings(java.util.Collection<ReplicaGlobalSecondaryIndexSettingsDescription> replicaGlobalSecondaryIndexSettings) {
        if (replicaGlobalSecondaryIndexSettings == null) {
            this.replicaGlobalSecondaryIndexSettings = null;
            return;
        }

        this.replicaGlobalSecondaryIndexSettings = new java.util.ArrayList<ReplicaGlobalSecondaryIndexSettingsDescription>(replicaGlobalSecondaryIndexSettings);
    }

    /**
     * <p>
     * Replica global secondary index settings for the global table.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReplicaGlobalSecondaryIndexSettings(java.util.Collection)} or
     * {@link #withReplicaGlobalSecondaryIndexSettings(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param replicaGlobalSecondaryIndexSettings
     *        Replica global secondary index settings for the global table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicaSettingsDescription withReplicaGlobalSecondaryIndexSettings(
            ReplicaGlobalSecondaryIndexSettingsDescription... replicaGlobalSecondaryIndexSettings) {
        if (this.replicaGlobalSecondaryIndexSettings == null) {
            setReplicaGlobalSecondaryIndexSettings(new java.util.ArrayList<ReplicaGlobalSecondaryIndexSettingsDescription>(
                    replicaGlobalSecondaryIndexSettings.length));
        }
        for (ReplicaGlobalSecondaryIndexSettingsDescription ele : replicaGlobalSecondaryIndexSettings) {
            this.replicaGlobalSecondaryIndexSettings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Replica global secondary index settings for the global table.
     * </p>
     * 
     * @param replicaGlobalSecondaryIndexSettings
     *        Replica global secondary index settings for the global table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicaSettingsDescription withReplicaGlobalSecondaryIndexSettings(
            java.util.Collection<ReplicaGlobalSecondaryIndexSettingsDescription> replicaGlobalSecondaryIndexSettings) {
        setReplicaGlobalSecondaryIndexSettings(replicaGlobalSecondaryIndexSettings);
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
        if (getRegionName() != null)
            sb.append("RegionName: ").append(getRegionName()).append(",");
        if (getReplicaStatus() != null)
            sb.append("ReplicaStatus: ").append(getReplicaStatus()).append(",");
        if (getReplicaBillingModeSummary() != null)
            sb.append("ReplicaBillingModeSummary: ").append(getReplicaBillingModeSummary()).append(",");
        if (getReplicaProvisionedReadCapacityUnits() != null)
            sb.append("ReplicaProvisionedReadCapacityUnits: ").append(getReplicaProvisionedReadCapacityUnits()).append(",");
        if (getReplicaProvisionedReadCapacityAutoScalingSettings() != null)
            sb.append("ReplicaProvisionedReadCapacityAutoScalingSettings: ").append(getReplicaProvisionedReadCapacityAutoScalingSettings()).append(",");
        if (getReplicaProvisionedWriteCapacityUnits() != null)
            sb.append("ReplicaProvisionedWriteCapacityUnits: ").append(getReplicaProvisionedWriteCapacityUnits()).append(",");
        if (getReplicaProvisionedWriteCapacityAutoScalingSettings() != null)
            sb.append("ReplicaProvisionedWriteCapacityAutoScalingSettings: ").append(getReplicaProvisionedWriteCapacityAutoScalingSettings()).append(",");
        if (getReplicaGlobalSecondaryIndexSettings() != null)
            sb.append("ReplicaGlobalSecondaryIndexSettings: ").append(getReplicaGlobalSecondaryIndexSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplicaSettingsDescription == false)
            return false;
        ReplicaSettingsDescription other = (ReplicaSettingsDescription) obj;
        if (other.getRegionName() == null ^ this.getRegionName() == null)
            return false;
        if (other.getRegionName() != null && other.getRegionName().equals(this.getRegionName()) == false)
            return false;
        if (other.getReplicaStatus() == null ^ this.getReplicaStatus() == null)
            return false;
        if (other.getReplicaStatus() != null && other.getReplicaStatus().equals(this.getReplicaStatus()) == false)
            return false;
        if (other.getReplicaBillingModeSummary() == null ^ this.getReplicaBillingModeSummary() == null)
            return false;
        if (other.getReplicaBillingModeSummary() != null && other.getReplicaBillingModeSummary().equals(this.getReplicaBillingModeSummary()) == false)
            return false;
        if (other.getReplicaProvisionedReadCapacityUnits() == null ^ this.getReplicaProvisionedReadCapacityUnits() == null)
            return false;
        if (other.getReplicaProvisionedReadCapacityUnits() != null
                && other.getReplicaProvisionedReadCapacityUnits().equals(this.getReplicaProvisionedReadCapacityUnits()) == false)
            return false;
        if (other.getReplicaProvisionedReadCapacityAutoScalingSettings() == null ^ this.getReplicaProvisionedReadCapacityAutoScalingSettings() == null)
            return false;
        if (other.getReplicaProvisionedReadCapacityAutoScalingSettings() != null
                && other.getReplicaProvisionedReadCapacityAutoScalingSettings().equals(this.getReplicaProvisionedReadCapacityAutoScalingSettings()) == false)
            return false;
        if (other.getReplicaProvisionedWriteCapacityUnits() == null ^ this.getReplicaProvisionedWriteCapacityUnits() == null)
            return false;
        if (other.getReplicaProvisionedWriteCapacityUnits() != null
                && other.getReplicaProvisionedWriteCapacityUnits().equals(this.getReplicaProvisionedWriteCapacityUnits()) == false)
            return false;
        if (other.getReplicaProvisionedWriteCapacityAutoScalingSettings() == null ^ this.getReplicaProvisionedWriteCapacityAutoScalingSettings() == null)
            return false;
        if (other.getReplicaProvisionedWriteCapacityAutoScalingSettings() != null
                && other.getReplicaProvisionedWriteCapacityAutoScalingSettings().equals(this.getReplicaProvisionedWriteCapacityAutoScalingSettings()) == false)
            return false;
        if (other.getReplicaGlobalSecondaryIndexSettings() == null ^ this.getReplicaGlobalSecondaryIndexSettings() == null)
            return false;
        if (other.getReplicaGlobalSecondaryIndexSettings() != null
                && other.getReplicaGlobalSecondaryIndexSettings().equals(this.getReplicaGlobalSecondaryIndexSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegionName() == null) ? 0 : getRegionName().hashCode());
        hashCode = prime * hashCode + ((getReplicaStatus() == null) ? 0 : getReplicaStatus().hashCode());
        hashCode = prime * hashCode + ((getReplicaBillingModeSummary() == null) ? 0 : getReplicaBillingModeSummary().hashCode());
        hashCode = prime * hashCode + ((getReplicaProvisionedReadCapacityUnits() == null) ? 0 : getReplicaProvisionedReadCapacityUnits().hashCode());
        hashCode = prime * hashCode
                + ((getReplicaProvisionedReadCapacityAutoScalingSettings() == null) ? 0 : getReplicaProvisionedReadCapacityAutoScalingSettings().hashCode());
        hashCode = prime * hashCode + ((getReplicaProvisionedWriteCapacityUnits() == null) ? 0 : getReplicaProvisionedWriteCapacityUnits().hashCode());
        hashCode = prime * hashCode
                + ((getReplicaProvisionedWriteCapacityAutoScalingSettings() == null) ? 0 : getReplicaProvisionedWriteCapacityAutoScalingSettings().hashCode());
        hashCode = prime * hashCode + ((getReplicaGlobalSecondaryIndexSettings() == null) ? 0 : getReplicaGlobalSecondaryIndexSettings().hashCode());
        return hashCode;
    }

    @Override
    public ReplicaSettingsDescription clone() {
        try {
            return (ReplicaSettingsDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dynamodbv2.model.transform.ReplicaSettingsDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
