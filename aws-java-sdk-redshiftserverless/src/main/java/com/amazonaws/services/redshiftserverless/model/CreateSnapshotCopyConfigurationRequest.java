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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/CreateSnapshotCopyConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSnapshotCopyConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The KMS key to use to encrypt your snapshots in the destination Amazon Web Services Region.
     * </p>
     */
    private String destinationKmsKeyId;
    /**
     * <p>
     * The destination Amazon Web Services Region that you want to copy snapshots to.
     * </p>
     */
    private String destinationRegion;
    /**
     * <p>
     * The name of the namespace to copy snapshots from.
     * </p>
     */
    private String namespaceName;
    /**
     * <p>
     * The retention period of the snapshots that you copy to the destination Amazon Web Services Region.
     * </p>
     */
    private Integer snapshotRetentionPeriod;

    /**
     * <p>
     * The KMS key to use to encrypt your snapshots in the destination Amazon Web Services Region.
     * </p>
     * 
     * @param destinationKmsKeyId
     *        The KMS key to use to encrypt your snapshots in the destination Amazon Web Services Region.
     */

    public void setDestinationKmsKeyId(String destinationKmsKeyId) {
        this.destinationKmsKeyId = destinationKmsKeyId;
    }

    /**
     * <p>
     * The KMS key to use to encrypt your snapshots in the destination Amazon Web Services Region.
     * </p>
     * 
     * @return The KMS key to use to encrypt your snapshots in the destination Amazon Web Services Region.
     */

    public String getDestinationKmsKeyId() {
        return this.destinationKmsKeyId;
    }

    /**
     * <p>
     * The KMS key to use to encrypt your snapshots in the destination Amazon Web Services Region.
     * </p>
     * 
     * @param destinationKmsKeyId
     *        The KMS key to use to encrypt your snapshots in the destination Amazon Web Services Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSnapshotCopyConfigurationRequest withDestinationKmsKeyId(String destinationKmsKeyId) {
        setDestinationKmsKeyId(destinationKmsKeyId);
        return this;
    }

    /**
     * <p>
     * The destination Amazon Web Services Region that you want to copy snapshots to.
     * </p>
     * 
     * @param destinationRegion
     *        The destination Amazon Web Services Region that you want to copy snapshots to.
     */

    public void setDestinationRegion(String destinationRegion) {
        this.destinationRegion = destinationRegion;
    }

    /**
     * <p>
     * The destination Amazon Web Services Region that you want to copy snapshots to.
     * </p>
     * 
     * @return The destination Amazon Web Services Region that you want to copy snapshots to.
     */

    public String getDestinationRegion() {
        return this.destinationRegion;
    }

    /**
     * <p>
     * The destination Amazon Web Services Region that you want to copy snapshots to.
     * </p>
     * 
     * @param destinationRegion
     *        The destination Amazon Web Services Region that you want to copy snapshots to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSnapshotCopyConfigurationRequest withDestinationRegion(String destinationRegion) {
        setDestinationRegion(destinationRegion);
        return this;
    }

    /**
     * <p>
     * The name of the namespace to copy snapshots from.
     * </p>
     * 
     * @param namespaceName
     *        The name of the namespace to copy snapshots from.
     */

    public void setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
    }

    /**
     * <p>
     * The name of the namespace to copy snapshots from.
     * </p>
     * 
     * @return The name of the namespace to copy snapshots from.
     */

    public String getNamespaceName() {
        return this.namespaceName;
    }

    /**
     * <p>
     * The name of the namespace to copy snapshots from.
     * </p>
     * 
     * @param namespaceName
     *        The name of the namespace to copy snapshots from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSnapshotCopyConfigurationRequest withNamespaceName(String namespaceName) {
        setNamespaceName(namespaceName);
        return this;
    }

    /**
     * <p>
     * The retention period of the snapshots that you copy to the destination Amazon Web Services Region.
     * </p>
     * 
     * @param snapshotRetentionPeriod
     *        The retention period of the snapshots that you copy to the destination Amazon Web Services Region.
     */

    public void setSnapshotRetentionPeriod(Integer snapshotRetentionPeriod) {
        this.snapshotRetentionPeriod = snapshotRetentionPeriod;
    }

    /**
     * <p>
     * The retention period of the snapshots that you copy to the destination Amazon Web Services Region.
     * </p>
     * 
     * @return The retention period of the snapshots that you copy to the destination Amazon Web Services Region.
     */

    public Integer getSnapshotRetentionPeriod() {
        return this.snapshotRetentionPeriod;
    }

    /**
     * <p>
     * The retention period of the snapshots that you copy to the destination Amazon Web Services Region.
     * </p>
     * 
     * @param snapshotRetentionPeriod
     *        The retention period of the snapshots that you copy to the destination Amazon Web Services Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSnapshotCopyConfigurationRequest withSnapshotRetentionPeriod(Integer snapshotRetentionPeriod) {
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

        if (obj instanceof CreateSnapshotCopyConfigurationRequest == false)
            return false;
        CreateSnapshotCopyConfigurationRequest other = (CreateSnapshotCopyConfigurationRequest) obj;
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
        hashCode = prime * hashCode + ((getSnapshotRetentionPeriod() == null) ? 0 : getSnapshotRetentionPeriod().hashCode());
        return hashCode;
    }

    @Override
    public CreateSnapshotCopyConfigurationRequest clone() {
        return (CreateSnapshotCopyConfigurationRequest) super.clone();
    }

}
