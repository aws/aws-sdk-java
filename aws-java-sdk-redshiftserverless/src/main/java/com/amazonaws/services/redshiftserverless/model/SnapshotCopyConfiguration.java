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
package com.amazonaws.services.redshiftserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The object that you configure to copy snapshots from one namespace to a namespace in another Amazon Web Services
 * Region.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/SnapshotCopyConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SnapshotCopyConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the KMS key to use to encrypt your snapshots in the destination Amazon Web Services Region.
     * </p>
     */
    private String destinationKmsKeyId;
    /**
     * <p>
     * The destination Amazon Web Services Region to copy snapshots to.
     * </p>
     */
    private String destinationRegion;
    /**
     * <p>
     * The name of the namespace to copy snapshots from in the source Amazon Web Services Region.
     * </p>
     */
    private String namespaceName;
    /**
     * <p>
     * The ARN of the snapshot copy configuration object.
     * </p>
     */
    private String snapshotCopyConfigurationArn;
    /**
     * <p>
     * The ID of the snapshot copy configuration object.
     * </p>
     */
    private String snapshotCopyConfigurationId;
    /**
     * <p>
     * The retention period of snapshots that are copied to the destination Amazon Web Services Region.
     * </p>
     */
    private Integer snapshotRetentionPeriod;

    /**
     * <p>
     * The ID of the KMS key to use to encrypt your snapshots in the destination Amazon Web Services Region.
     * </p>
     * 
     * @param destinationKmsKeyId
     *        The ID of the KMS key to use to encrypt your snapshots in the destination Amazon Web Services Region.
     */

    public void setDestinationKmsKeyId(String destinationKmsKeyId) {
        this.destinationKmsKeyId = destinationKmsKeyId;
    }

    /**
     * <p>
     * The ID of the KMS key to use to encrypt your snapshots in the destination Amazon Web Services Region.
     * </p>
     * 
     * @return The ID of the KMS key to use to encrypt your snapshots in the destination Amazon Web Services Region.
     */

    public String getDestinationKmsKeyId() {
        return this.destinationKmsKeyId;
    }

    /**
     * <p>
     * The ID of the KMS key to use to encrypt your snapshots in the destination Amazon Web Services Region.
     * </p>
     * 
     * @param destinationKmsKeyId
     *        The ID of the KMS key to use to encrypt your snapshots in the destination Amazon Web Services Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnapshotCopyConfiguration withDestinationKmsKeyId(String destinationKmsKeyId) {
        setDestinationKmsKeyId(destinationKmsKeyId);
        return this;
    }

    /**
     * <p>
     * The destination Amazon Web Services Region to copy snapshots to.
     * </p>
     * 
     * @param destinationRegion
     *        The destination Amazon Web Services Region to copy snapshots to.
     */

    public void setDestinationRegion(String destinationRegion) {
        this.destinationRegion = destinationRegion;
    }

    /**
     * <p>
     * The destination Amazon Web Services Region to copy snapshots to.
     * </p>
     * 
     * @return The destination Amazon Web Services Region to copy snapshots to.
     */

    public String getDestinationRegion() {
        return this.destinationRegion;
    }

    /**
     * <p>
     * The destination Amazon Web Services Region to copy snapshots to.
     * </p>
     * 
     * @param destinationRegion
     *        The destination Amazon Web Services Region to copy snapshots to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnapshotCopyConfiguration withDestinationRegion(String destinationRegion) {
        setDestinationRegion(destinationRegion);
        return this;
    }

    /**
     * <p>
     * The name of the namespace to copy snapshots from in the source Amazon Web Services Region.
     * </p>
     * 
     * @param namespaceName
     *        The name of the namespace to copy snapshots from in the source Amazon Web Services Region.
     */

    public void setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
    }

    /**
     * <p>
     * The name of the namespace to copy snapshots from in the source Amazon Web Services Region.
     * </p>
     * 
     * @return The name of the namespace to copy snapshots from in the source Amazon Web Services Region.
     */

    public String getNamespaceName() {
        return this.namespaceName;
    }

    /**
     * <p>
     * The name of the namespace to copy snapshots from in the source Amazon Web Services Region.
     * </p>
     * 
     * @param namespaceName
     *        The name of the namespace to copy snapshots from in the source Amazon Web Services Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnapshotCopyConfiguration withNamespaceName(String namespaceName) {
        setNamespaceName(namespaceName);
        return this;
    }

    /**
     * <p>
     * The ARN of the snapshot copy configuration object.
     * </p>
     * 
     * @param snapshotCopyConfigurationArn
     *        The ARN of the snapshot copy configuration object.
     */

    public void setSnapshotCopyConfigurationArn(String snapshotCopyConfigurationArn) {
        this.snapshotCopyConfigurationArn = snapshotCopyConfigurationArn;
    }

    /**
     * <p>
     * The ARN of the snapshot copy configuration object.
     * </p>
     * 
     * @return The ARN of the snapshot copy configuration object.
     */

    public String getSnapshotCopyConfigurationArn() {
        return this.snapshotCopyConfigurationArn;
    }

    /**
     * <p>
     * The ARN of the snapshot copy configuration object.
     * </p>
     * 
     * @param snapshotCopyConfigurationArn
     *        The ARN of the snapshot copy configuration object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnapshotCopyConfiguration withSnapshotCopyConfigurationArn(String snapshotCopyConfigurationArn) {
        setSnapshotCopyConfigurationArn(snapshotCopyConfigurationArn);
        return this;
    }

    /**
     * <p>
     * The ID of the snapshot copy configuration object.
     * </p>
     * 
     * @param snapshotCopyConfigurationId
     *        The ID of the snapshot copy configuration object.
     */

    public void setSnapshotCopyConfigurationId(String snapshotCopyConfigurationId) {
        this.snapshotCopyConfigurationId = snapshotCopyConfigurationId;
    }

    /**
     * <p>
     * The ID of the snapshot copy configuration object.
     * </p>
     * 
     * @return The ID of the snapshot copy configuration object.
     */

    public String getSnapshotCopyConfigurationId() {
        return this.snapshotCopyConfigurationId;
    }

    /**
     * <p>
     * The ID of the snapshot copy configuration object.
     * </p>
     * 
     * @param snapshotCopyConfigurationId
     *        The ID of the snapshot copy configuration object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnapshotCopyConfiguration withSnapshotCopyConfigurationId(String snapshotCopyConfigurationId) {
        setSnapshotCopyConfigurationId(snapshotCopyConfigurationId);
        return this;
    }

    /**
     * <p>
     * The retention period of snapshots that are copied to the destination Amazon Web Services Region.
     * </p>
     * 
     * @param snapshotRetentionPeriod
     *        The retention period of snapshots that are copied to the destination Amazon Web Services Region.
     */

    public void setSnapshotRetentionPeriod(Integer snapshotRetentionPeriod) {
        this.snapshotRetentionPeriod = snapshotRetentionPeriod;
    }

    /**
     * <p>
     * The retention period of snapshots that are copied to the destination Amazon Web Services Region.
     * </p>
     * 
     * @return The retention period of snapshots that are copied to the destination Amazon Web Services Region.
     */

    public Integer getSnapshotRetentionPeriod() {
        return this.snapshotRetentionPeriod;
    }

    /**
     * <p>
     * The retention period of snapshots that are copied to the destination Amazon Web Services Region.
     * </p>
     * 
     * @param snapshotRetentionPeriod
     *        The retention period of snapshots that are copied to the destination Amazon Web Services Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnapshotCopyConfiguration withSnapshotRetentionPeriod(Integer snapshotRetentionPeriod) {
        setSnapshotRetentionPeriod(snapshotRetentionPeriod);
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
        if (getDestinationKmsKeyId() != null)
            sb.append("DestinationKmsKeyId: ").append(getDestinationKmsKeyId()).append(",");
        if (getDestinationRegion() != null)
            sb.append("DestinationRegion: ").append(getDestinationRegion()).append(",");
        if (getNamespaceName() != null)
            sb.append("NamespaceName: ").append(getNamespaceName()).append(",");
        if (getSnapshotCopyConfigurationArn() != null)
            sb.append("SnapshotCopyConfigurationArn: ").append(getSnapshotCopyConfigurationArn()).append(",");
        if (getSnapshotCopyConfigurationId() != null)
            sb.append("SnapshotCopyConfigurationId: ").append(getSnapshotCopyConfigurationId()).append(",");
        if (getSnapshotRetentionPeriod() != null)
            sb.append("SnapshotRetentionPeriod: ").append(getSnapshotRetentionPeriod());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SnapshotCopyConfiguration == false)
            return false;
        SnapshotCopyConfiguration other = (SnapshotCopyConfiguration) obj;
        if (other.getDestinationKmsKeyId() == null ^ this.getDestinationKmsKeyId() == null)
            return false;
        if (other.getDestinationKmsKeyId() != null && other.getDestinationKmsKeyId().equals(this.getDestinationKmsKeyId()) == false)
            return false;
        if (other.getDestinationRegion() == null ^ this.getDestinationRegion() == null)
            return false;
        if (other.getDestinationRegion() != null && other.getDestinationRegion().equals(this.getDestinationRegion()) == false)
            return false;
        if (other.getNamespaceName() == null ^ this.getNamespaceName() == null)
            return false;
        if (other.getNamespaceName() != null && other.getNamespaceName().equals(this.getNamespaceName()) == false)
            return false;
        if (other.getSnapshotCopyConfigurationArn() == null ^ this.getSnapshotCopyConfigurationArn() == null)
            return false;
        if (other.getSnapshotCopyConfigurationArn() != null && other.getSnapshotCopyConfigurationArn().equals(this.getSnapshotCopyConfigurationArn()) == false)
            return false;
        if (other.getSnapshotCopyConfigurationId() == null ^ this.getSnapshotCopyConfigurationId() == null)
            return false;
        if (other.getSnapshotCopyConfigurationId() != null && other.getSnapshotCopyConfigurationId().equals(this.getSnapshotCopyConfigurationId()) == false)
            return false;
        if (other.getSnapshotRetentionPeriod() == null ^ this.getSnapshotRetentionPeriod() == null)
            return false;
        if (other.getSnapshotRetentionPeriod() != null && other.getSnapshotRetentionPeriod().equals(this.getSnapshotRetentionPeriod()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDestinationKmsKeyId() == null) ? 0 : getDestinationKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getDestinationRegion() == null) ? 0 : getDestinationRegion().hashCode());
        hashCode = prime * hashCode + ((getNamespaceName() == null) ? 0 : getNamespaceName().hashCode());
        hashCode = prime * hashCode + ((getSnapshotCopyConfigurationArn() == null) ? 0 : getSnapshotCopyConfigurationArn().hashCode());
        hashCode = prime * hashCode + ((getSnapshotCopyConfigurationId() == null) ? 0 : getSnapshotCopyConfigurationId().hashCode());
        hashCode = prime * hashCode + ((getSnapshotRetentionPeriod() == null) ? 0 : getSnapshotRetentionPeriod().hashCode());
        return hashCode;
    }

    @Override
    public SnapshotCopyConfiguration clone() {
        try {
            return (SnapshotCopyConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.redshiftserverless.model.transform.SnapshotCopyConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
