/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/RestoreTableFromBackup" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RestoreTableFromBackupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the new table to which the backup must be restored.
     * </p>
     */
    private String targetTableName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) associated with the backup.
     * </p>
     */
    private String backupArn;
    /**
     * <p>
     * The billing mode of the restored table.
     * </p>
     */
    private String billingModeOverride;
    /**
     * <p>
     * List of global secondary indexes for the restored table. The indexes provided should match existing secondary
     * indexes. You can choose to exclude some or all of the indexes at the time of restore.
     * </p>
     */
    private java.util.List<GlobalSecondaryIndex> globalSecondaryIndexOverride;
    /**
     * <p>
     * List of local secondary indexes for the restored table. The indexes provided should match existing secondary
     * indexes. You can choose to exclude some or all of the indexes at the time of restore.
     * </p>
     */
    private java.util.List<LocalSecondaryIndex> localSecondaryIndexOverride;
    /**
     * <p>
     * Provisioned throughput settings for the restored table.
     * </p>
     */
    private ProvisionedThroughput provisionedThroughputOverride;
    /**
     * <p>
     * The new server-side encryption settings for the restored table.
     * </p>
     */
    private SSESpecification sSESpecificationOverride;

    /**
     * <p>
     * The name of the new table to which the backup must be restored.
     * </p>
     * 
     * @param targetTableName
     *        The name of the new table to which the backup must be restored.
     */

    public void setTargetTableName(String targetTableName) {
        this.targetTableName = targetTableName;
    }

    /**
     * <p>
     * The name of the new table to which the backup must be restored.
     * </p>
     * 
     * @return The name of the new table to which the backup must be restored.
     */

    public String getTargetTableName() {
        return this.targetTableName;
    }

    /**
     * <p>
     * The name of the new table to which the backup must be restored.
     * </p>
     * 
     * @param targetTableName
     *        The name of the new table to which the backup must be restored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTableFromBackupRequest withTargetTableName(String targetTableName) {
        setTargetTableName(targetTableName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) associated with the backup.
     * </p>
     * 
     * @param backupArn
     *        The Amazon Resource Name (ARN) associated with the backup.
     */

    public void setBackupArn(String backupArn) {
        this.backupArn = backupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) associated with the backup.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) associated with the backup.
     */

    public String getBackupArn() {
        return this.backupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) associated with the backup.
     * </p>
     * 
     * @param backupArn
     *        The Amazon Resource Name (ARN) associated with the backup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTableFromBackupRequest withBackupArn(String backupArn) {
        setBackupArn(backupArn);
        return this;
    }

    /**
     * <p>
     * The billing mode of the restored table.
     * </p>
     * 
     * @param billingModeOverride
     *        The billing mode of the restored table.
     * @see BillingMode
     */

    public void setBillingModeOverride(String billingModeOverride) {
        this.billingModeOverride = billingModeOverride;
    }

    /**
     * <p>
     * The billing mode of the restored table.
     * </p>
     * 
     * @return The billing mode of the restored table.
     * @see BillingMode
     */

    public String getBillingModeOverride() {
        return this.billingModeOverride;
    }

    /**
     * <p>
     * The billing mode of the restored table.
     * </p>
     * 
     * @param billingModeOverride
     *        The billing mode of the restored table.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BillingMode
     */

    public RestoreTableFromBackupRequest withBillingModeOverride(String billingModeOverride) {
        setBillingModeOverride(billingModeOverride);
        return this;
    }

    /**
     * <p>
     * The billing mode of the restored table.
     * </p>
     * 
     * @param billingModeOverride
     *        The billing mode of the restored table.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BillingMode
     */

    public RestoreTableFromBackupRequest withBillingModeOverride(BillingMode billingModeOverride) {
        this.billingModeOverride = billingModeOverride.toString();
        return this;
    }

    /**
     * <p>
     * List of global secondary indexes for the restored table. The indexes provided should match existing secondary
     * indexes. You can choose to exclude some or all of the indexes at the time of restore.
     * </p>
     * 
     * @return List of global secondary indexes for the restored table. The indexes provided should match existing
     *         secondary indexes. You can choose to exclude some or all of the indexes at the time of restore.
     */

    public java.util.List<GlobalSecondaryIndex> getGlobalSecondaryIndexOverride() {
        return globalSecondaryIndexOverride;
    }

    /**
     * <p>
     * List of global secondary indexes for the restored table. The indexes provided should match existing secondary
     * indexes. You can choose to exclude some or all of the indexes at the time of restore.
     * </p>
     * 
     * @param globalSecondaryIndexOverride
     *        List of global secondary indexes for the restored table. The indexes provided should match existing
     *        secondary indexes. You can choose to exclude some or all of the indexes at the time of restore.
     */

    public void setGlobalSecondaryIndexOverride(java.util.Collection<GlobalSecondaryIndex> globalSecondaryIndexOverride) {
        if (globalSecondaryIndexOverride == null) {
            this.globalSecondaryIndexOverride = null;
            return;
        }

        this.globalSecondaryIndexOverride = new java.util.ArrayList<GlobalSecondaryIndex>(globalSecondaryIndexOverride);
    }

    /**
     * <p>
     * List of global secondary indexes for the restored table. The indexes provided should match existing secondary
     * indexes. You can choose to exclude some or all of the indexes at the time of restore.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGlobalSecondaryIndexOverride(java.util.Collection)} or
     * {@link #withGlobalSecondaryIndexOverride(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param globalSecondaryIndexOverride
     *        List of global secondary indexes for the restored table. The indexes provided should match existing
     *        secondary indexes. You can choose to exclude some or all of the indexes at the time of restore.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTableFromBackupRequest withGlobalSecondaryIndexOverride(GlobalSecondaryIndex... globalSecondaryIndexOverride) {
        if (this.globalSecondaryIndexOverride == null) {
            setGlobalSecondaryIndexOverride(new java.util.ArrayList<GlobalSecondaryIndex>(globalSecondaryIndexOverride.length));
        }
        for (GlobalSecondaryIndex ele : globalSecondaryIndexOverride) {
            this.globalSecondaryIndexOverride.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of global secondary indexes for the restored table. The indexes provided should match existing secondary
     * indexes. You can choose to exclude some or all of the indexes at the time of restore.
     * </p>
     * 
     * @param globalSecondaryIndexOverride
     *        List of global secondary indexes for the restored table. The indexes provided should match existing
     *        secondary indexes. You can choose to exclude some or all of the indexes at the time of restore.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTableFromBackupRequest withGlobalSecondaryIndexOverride(java.util.Collection<GlobalSecondaryIndex> globalSecondaryIndexOverride) {
        setGlobalSecondaryIndexOverride(globalSecondaryIndexOverride);
        return this;
    }

    /**
     * <p>
     * List of local secondary indexes for the restored table. The indexes provided should match existing secondary
     * indexes. You can choose to exclude some or all of the indexes at the time of restore.
     * </p>
     * 
     * @return List of local secondary indexes for the restored table. The indexes provided should match existing
     *         secondary indexes. You can choose to exclude some or all of the indexes at the time of restore.
     */

    public java.util.List<LocalSecondaryIndex> getLocalSecondaryIndexOverride() {
        return localSecondaryIndexOverride;
    }

    /**
     * <p>
     * List of local secondary indexes for the restored table. The indexes provided should match existing secondary
     * indexes. You can choose to exclude some or all of the indexes at the time of restore.
     * </p>
     * 
     * @param localSecondaryIndexOverride
     *        List of local secondary indexes for the restored table. The indexes provided should match existing
     *        secondary indexes. You can choose to exclude some or all of the indexes at the time of restore.
     */

    public void setLocalSecondaryIndexOverride(java.util.Collection<LocalSecondaryIndex> localSecondaryIndexOverride) {
        if (localSecondaryIndexOverride == null) {
            this.localSecondaryIndexOverride = null;
            return;
        }

        this.localSecondaryIndexOverride = new java.util.ArrayList<LocalSecondaryIndex>(localSecondaryIndexOverride);
    }

    /**
     * <p>
     * List of local secondary indexes for the restored table. The indexes provided should match existing secondary
     * indexes. You can choose to exclude some or all of the indexes at the time of restore.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLocalSecondaryIndexOverride(java.util.Collection)} or
     * {@link #withLocalSecondaryIndexOverride(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param localSecondaryIndexOverride
     *        List of local secondary indexes for the restored table. The indexes provided should match existing
     *        secondary indexes. You can choose to exclude some or all of the indexes at the time of restore.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTableFromBackupRequest withLocalSecondaryIndexOverride(LocalSecondaryIndex... localSecondaryIndexOverride) {
        if (this.localSecondaryIndexOverride == null) {
            setLocalSecondaryIndexOverride(new java.util.ArrayList<LocalSecondaryIndex>(localSecondaryIndexOverride.length));
        }
        for (LocalSecondaryIndex ele : localSecondaryIndexOverride) {
            this.localSecondaryIndexOverride.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of local secondary indexes for the restored table. The indexes provided should match existing secondary
     * indexes. You can choose to exclude some or all of the indexes at the time of restore.
     * </p>
     * 
     * @param localSecondaryIndexOverride
     *        List of local secondary indexes for the restored table. The indexes provided should match existing
     *        secondary indexes. You can choose to exclude some or all of the indexes at the time of restore.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTableFromBackupRequest withLocalSecondaryIndexOverride(java.util.Collection<LocalSecondaryIndex> localSecondaryIndexOverride) {
        setLocalSecondaryIndexOverride(localSecondaryIndexOverride);
        return this;
    }

    /**
     * <p>
     * Provisioned throughput settings for the restored table.
     * </p>
     * 
     * @param provisionedThroughputOverride
     *        Provisioned throughput settings for the restored table.
     */

    public void setProvisionedThroughputOverride(ProvisionedThroughput provisionedThroughputOverride) {
        this.provisionedThroughputOverride = provisionedThroughputOverride;
    }

    /**
     * <p>
     * Provisioned throughput settings for the restored table.
     * </p>
     * 
     * @return Provisioned throughput settings for the restored table.
     */

    public ProvisionedThroughput getProvisionedThroughputOverride() {
        return this.provisionedThroughputOverride;
    }

    /**
     * <p>
     * Provisioned throughput settings for the restored table.
     * </p>
     * 
     * @param provisionedThroughputOverride
     *        Provisioned throughput settings for the restored table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTableFromBackupRequest withProvisionedThroughputOverride(ProvisionedThroughput provisionedThroughputOverride) {
        setProvisionedThroughputOverride(provisionedThroughputOverride);
        return this;
    }

    /**
     * <p>
     * The new server-side encryption settings for the restored table.
     * </p>
     * 
     * @param sSESpecificationOverride
     *        The new server-side encryption settings for the restored table.
     */

    public void setSSESpecificationOverride(SSESpecification sSESpecificationOverride) {
        this.sSESpecificationOverride = sSESpecificationOverride;
    }

    /**
     * <p>
     * The new server-side encryption settings for the restored table.
     * </p>
     * 
     * @return The new server-side encryption settings for the restored table.
     */

    public SSESpecification getSSESpecificationOverride() {
        return this.sSESpecificationOverride;
    }

    /**
     * <p>
     * The new server-side encryption settings for the restored table.
     * </p>
     * 
     * @param sSESpecificationOverride
     *        The new server-side encryption settings for the restored table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTableFromBackupRequest withSSESpecificationOverride(SSESpecification sSESpecificationOverride) {
        setSSESpecificationOverride(sSESpecificationOverride);
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
        if (getTargetTableName() != null)
            sb.append("TargetTableName: ").append(getTargetTableName()).append(",");
        if (getBackupArn() != null)
            sb.append("BackupArn: ").append(getBackupArn()).append(",");
        if (getBillingModeOverride() != null)
            sb.append("BillingModeOverride: ").append(getBillingModeOverride()).append(",");
        if (getGlobalSecondaryIndexOverride() != null)
            sb.append("GlobalSecondaryIndexOverride: ").append(getGlobalSecondaryIndexOverride()).append(",");
        if (getLocalSecondaryIndexOverride() != null)
            sb.append("LocalSecondaryIndexOverride: ").append(getLocalSecondaryIndexOverride()).append(",");
        if (getProvisionedThroughputOverride() != null)
            sb.append("ProvisionedThroughputOverride: ").append(getProvisionedThroughputOverride()).append(",");
        if (getSSESpecificationOverride() != null)
            sb.append("SSESpecificationOverride: ").append(getSSESpecificationOverride());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RestoreTableFromBackupRequest == false)
            return false;
        RestoreTableFromBackupRequest other = (RestoreTableFromBackupRequest) obj;
        if (other.getTargetTableName() == null ^ this.getTargetTableName() == null)
            return false;
        if (other.getTargetTableName() != null && other.getTargetTableName().equals(this.getTargetTableName()) == false)
            return false;
        if (other.getBackupArn() == null ^ this.getBackupArn() == null)
            return false;
        if (other.getBackupArn() != null && other.getBackupArn().equals(this.getBackupArn()) == false)
            return false;
        if (other.getBillingModeOverride() == null ^ this.getBillingModeOverride() == null)
            return false;
        if (other.getBillingModeOverride() != null && other.getBillingModeOverride().equals(this.getBillingModeOverride()) == false)
            return false;
        if (other.getGlobalSecondaryIndexOverride() == null ^ this.getGlobalSecondaryIndexOverride() == null)
            return false;
        if (other.getGlobalSecondaryIndexOverride() != null && other.getGlobalSecondaryIndexOverride().equals(this.getGlobalSecondaryIndexOverride()) == false)
            return false;
        if (other.getLocalSecondaryIndexOverride() == null ^ this.getLocalSecondaryIndexOverride() == null)
            return false;
        if (other.getLocalSecondaryIndexOverride() != null && other.getLocalSecondaryIndexOverride().equals(this.getLocalSecondaryIndexOverride()) == false)
            return false;
        if (other.getProvisionedThroughputOverride() == null ^ this.getProvisionedThroughputOverride() == null)
            return false;
        if (other.getProvisionedThroughputOverride() != null
                && other.getProvisionedThroughputOverride().equals(this.getProvisionedThroughputOverride()) == false)
            return false;
        if (other.getSSESpecificationOverride() == null ^ this.getSSESpecificationOverride() == null)
            return false;
        if (other.getSSESpecificationOverride() != null && other.getSSESpecificationOverride().equals(this.getSSESpecificationOverride()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargetTableName() == null) ? 0 : getTargetTableName().hashCode());
        hashCode = prime * hashCode + ((getBackupArn() == null) ? 0 : getBackupArn().hashCode());
        hashCode = prime * hashCode + ((getBillingModeOverride() == null) ? 0 : getBillingModeOverride().hashCode());
        hashCode = prime * hashCode + ((getGlobalSecondaryIndexOverride() == null) ? 0 : getGlobalSecondaryIndexOverride().hashCode());
        hashCode = prime * hashCode + ((getLocalSecondaryIndexOverride() == null) ? 0 : getLocalSecondaryIndexOverride().hashCode());
        hashCode = prime * hashCode + ((getProvisionedThroughputOverride() == null) ? 0 : getProvisionedThroughputOverride().hashCode());
        hashCode = prime * hashCode + ((getSSESpecificationOverride() == null) ? 0 : getSSESpecificationOverride().hashCode());
        return hashCode;
    }

    @Override
    public RestoreTableFromBackupRequest clone() {
        return (RestoreTableFromBackupRequest) super.clone();
    }

}
