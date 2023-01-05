/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a Fleet Advisor collector.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/CollectorResponse" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CollectorResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The reference ID of the Fleet Advisor collector.
     * </p>
     */
    private String collectorReferencedId;
    /**
     * <p>
     * The name of the Fleet Advisor collector .
     * </p>
     */
    private String collectorName;
    /**
     * <p>
     * The version of your Fleet Advisor collector, in semantic versioning format, for example <code>1.0.2</code>
     * </p>
     */
    private String collectorVersion;
    /**
     * <p>
     * Whether the collector version is up to date.
     * </p>
     */
    private String versionStatus;
    /**
     * <p>
     * A summary description of the Fleet Advisor collector.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The Amazon S3 bucket that the Fleet Advisor collector uses to store inventory metadata.
     * </p>
     */
    private String s3BucketName;
    /**
     * <p>
     * The IAM role that grants permissions to access the specified Amazon S3 bucket.
     * </p>
     */
    private String serviceAccessRoleArn;

    private CollectorHealthCheck collectorHealthCheck;
    /**
     * <p>
     * The timestamp of the last time the collector received data, in the following format:
     * <code>2022-01-24T19:04:02.596113Z</code>
     * </p>
     */
    private String lastDataReceived;
    /**
     * <p>
     * The timestamp when DMS registered the collector, in the following format:
     * <code>2022-01-24T19:04:02.596113Z</code>
     * </p>
     */
    private String registeredDate;
    /**
     * <p>
     * The timestamp when you created the collector, in the following format: <code>2022-01-24T19:04:02.596113Z</code>
     * </p>
     */
    private String createdDate;
    /**
     * <p>
     * The timestamp when DMS last modified the collector, in the following format:
     * <code>2022-01-24T19:04:02.596113Z</code>
     * </p>
     */
    private String modifiedDate;

    private InventoryData inventoryData;

    /**
     * <p>
     * The reference ID of the Fleet Advisor collector.
     * </p>
     * 
     * @param collectorReferencedId
     *        The reference ID of the Fleet Advisor collector.
     */

    public void setCollectorReferencedId(String collectorReferencedId) {
        this.collectorReferencedId = collectorReferencedId;
    }

    /**
     * <p>
     * The reference ID of the Fleet Advisor collector.
     * </p>
     * 
     * @return The reference ID of the Fleet Advisor collector.
     */

    public String getCollectorReferencedId() {
        return this.collectorReferencedId;
    }

    /**
     * <p>
     * The reference ID of the Fleet Advisor collector.
     * </p>
     * 
     * @param collectorReferencedId
     *        The reference ID of the Fleet Advisor collector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CollectorResponse withCollectorReferencedId(String collectorReferencedId) {
        setCollectorReferencedId(collectorReferencedId);
        return this;
    }

    /**
     * <p>
     * The name of the Fleet Advisor collector .
     * </p>
     * 
     * @param collectorName
     *        The name of the Fleet Advisor collector .
     */

    public void setCollectorName(String collectorName) {
        this.collectorName = collectorName;
    }

    /**
     * <p>
     * The name of the Fleet Advisor collector .
     * </p>
     * 
     * @return The name of the Fleet Advisor collector .
     */

    public String getCollectorName() {
        return this.collectorName;
    }

    /**
     * <p>
     * The name of the Fleet Advisor collector .
     * </p>
     * 
     * @param collectorName
     *        The name of the Fleet Advisor collector .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CollectorResponse withCollectorName(String collectorName) {
        setCollectorName(collectorName);
        return this;
    }

    /**
     * <p>
     * The version of your Fleet Advisor collector, in semantic versioning format, for example <code>1.0.2</code>
     * </p>
     * 
     * @param collectorVersion
     *        The version of your Fleet Advisor collector, in semantic versioning format, for example <code>1.0.2</code>
     */

    public void setCollectorVersion(String collectorVersion) {
        this.collectorVersion = collectorVersion;
    }

    /**
     * <p>
     * The version of your Fleet Advisor collector, in semantic versioning format, for example <code>1.0.2</code>
     * </p>
     * 
     * @return The version of your Fleet Advisor collector, in semantic versioning format, for example
     *         <code>1.0.2</code>
     */

    public String getCollectorVersion() {
        return this.collectorVersion;
    }

    /**
     * <p>
     * The version of your Fleet Advisor collector, in semantic versioning format, for example <code>1.0.2</code>
     * </p>
     * 
     * @param collectorVersion
     *        The version of your Fleet Advisor collector, in semantic versioning format, for example <code>1.0.2</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CollectorResponse withCollectorVersion(String collectorVersion) {
        setCollectorVersion(collectorVersion);
        return this;
    }

    /**
     * <p>
     * Whether the collector version is up to date.
     * </p>
     * 
     * @param versionStatus
     *        Whether the collector version is up to date.
     * @see VersionStatus
     */

    public void setVersionStatus(String versionStatus) {
        this.versionStatus = versionStatus;
    }

    /**
     * <p>
     * Whether the collector version is up to date.
     * </p>
     * 
     * @return Whether the collector version is up to date.
     * @see VersionStatus
     */

    public String getVersionStatus() {
        return this.versionStatus;
    }

    /**
     * <p>
     * Whether the collector version is up to date.
     * </p>
     * 
     * @param versionStatus
     *        Whether the collector version is up to date.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VersionStatus
     */

    public CollectorResponse withVersionStatus(String versionStatus) {
        setVersionStatus(versionStatus);
        return this;
    }

    /**
     * <p>
     * Whether the collector version is up to date.
     * </p>
     * 
     * @param versionStatus
     *        Whether the collector version is up to date.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VersionStatus
     */

    public CollectorResponse withVersionStatus(VersionStatus versionStatus) {
        this.versionStatus = versionStatus.toString();
        return this;
    }

    /**
     * <p>
     * A summary description of the Fleet Advisor collector.
     * </p>
     * 
     * @param description
     *        A summary description of the Fleet Advisor collector.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A summary description of the Fleet Advisor collector.
     * </p>
     * 
     * @return A summary description of the Fleet Advisor collector.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A summary description of the Fleet Advisor collector.
     * </p>
     * 
     * @param description
     *        A summary description of the Fleet Advisor collector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CollectorResponse withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 bucket that the Fleet Advisor collector uses to store inventory metadata.
     * </p>
     * 
     * @param s3BucketName
     *        The Amazon S3 bucket that the Fleet Advisor collector uses to store inventory metadata.
     */

    public void setS3BucketName(String s3BucketName) {
        this.s3BucketName = s3BucketName;
    }

    /**
     * <p>
     * The Amazon S3 bucket that the Fleet Advisor collector uses to store inventory metadata.
     * </p>
     * 
     * @return The Amazon S3 bucket that the Fleet Advisor collector uses to store inventory metadata.
     */

    public String getS3BucketName() {
        return this.s3BucketName;
    }

    /**
     * <p>
     * The Amazon S3 bucket that the Fleet Advisor collector uses to store inventory metadata.
     * </p>
     * 
     * @param s3BucketName
     *        The Amazon S3 bucket that the Fleet Advisor collector uses to store inventory metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CollectorResponse withS3BucketName(String s3BucketName) {
        setS3BucketName(s3BucketName);
        return this;
    }

    /**
     * <p>
     * The IAM role that grants permissions to access the specified Amazon S3 bucket.
     * </p>
     * 
     * @param serviceAccessRoleArn
     *        The IAM role that grants permissions to access the specified Amazon S3 bucket.
     */

    public void setServiceAccessRoleArn(String serviceAccessRoleArn) {
        this.serviceAccessRoleArn = serviceAccessRoleArn;
    }

    /**
     * <p>
     * The IAM role that grants permissions to access the specified Amazon S3 bucket.
     * </p>
     * 
     * @return The IAM role that grants permissions to access the specified Amazon S3 bucket.
     */

    public String getServiceAccessRoleArn() {
        return this.serviceAccessRoleArn;
    }

    /**
     * <p>
     * The IAM role that grants permissions to access the specified Amazon S3 bucket.
     * </p>
     * 
     * @param serviceAccessRoleArn
     *        The IAM role that grants permissions to access the specified Amazon S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CollectorResponse withServiceAccessRoleArn(String serviceAccessRoleArn) {
        setServiceAccessRoleArn(serviceAccessRoleArn);
        return this;
    }

    /**
     * @param collectorHealthCheck
     */

    public void setCollectorHealthCheck(CollectorHealthCheck collectorHealthCheck) {
        this.collectorHealthCheck = collectorHealthCheck;
    }

    /**
     * @return
     */

    public CollectorHealthCheck getCollectorHealthCheck() {
        return this.collectorHealthCheck;
    }

    /**
     * @param collectorHealthCheck
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CollectorResponse withCollectorHealthCheck(CollectorHealthCheck collectorHealthCheck) {
        setCollectorHealthCheck(collectorHealthCheck);
        return this;
    }

    /**
     * <p>
     * The timestamp of the last time the collector received data, in the following format:
     * <code>2022-01-24T19:04:02.596113Z</code>
     * </p>
     * 
     * @param lastDataReceived
     *        The timestamp of the last time the collector received data, in the following format:
     *        <code>2022-01-24T19:04:02.596113Z</code>
     */

    public void setLastDataReceived(String lastDataReceived) {
        this.lastDataReceived = lastDataReceived;
    }

    /**
     * <p>
     * The timestamp of the last time the collector received data, in the following format:
     * <code>2022-01-24T19:04:02.596113Z</code>
     * </p>
     * 
     * @return The timestamp of the last time the collector received data, in the following format:
     *         <code>2022-01-24T19:04:02.596113Z</code>
     */

    public String getLastDataReceived() {
        return this.lastDataReceived;
    }

    /**
     * <p>
     * The timestamp of the last time the collector received data, in the following format:
     * <code>2022-01-24T19:04:02.596113Z</code>
     * </p>
     * 
     * @param lastDataReceived
     *        The timestamp of the last time the collector received data, in the following format:
     *        <code>2022-01-24T19:04:02.596113Z</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CollectorResponse withLastDataReceived(String lastDataReceived) {
        setLastDataReceived(lastDataReceived);
        return this;
    }

    /**
     * <p>
     * The timestamp when DMS registered the collector, in the following format:
     * <code>2022-01-24T19:04:02.596113Z</code>
     * </p>
     * 
     * @param registeredDate
     *        The timestamp when DMS registered the collector, in the following format:
     *        <code>2022-01-24T19:04:02.596113Z</code>
     */

    public void setRegisteredDate(String registeredDate) {
        this.registeredDate = registeredDate;
    }

    /**
     * <p>
     * The timestamp when DMS registered the collector, in the following format:
     * <code>2022-01-24T19:04:02.596113Z</code>
     * </p>
     * 
     * @return The timestamp when DMS registered the collector, in the following format:
     *         <code>2022-01-24T19:04:02.596113Z</code>
     */

    public String getRegisteredDate() {
        return this.registeredDate;
    }

    /**
     * <p>
     * The timestamp when DMS registered the collector, in the following format:
     * <code>2022-01-24T19:04:02.596113Z</code>
     * </p>
     * 
     * @param registeredDate
     *        The timestamp when DMS registered the collector, in the following format:
     *        <code>2022-01-24T19:04:02.596113Z</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CollectorResponse withRegisteredDate(String registeredDate) {
        setRegisteredDate(registeredDate);
        return this;
    }

    /**
     * <p>
     * The timestamp when you created the collector, in the following format: <code>2022-01-24T19:04:02.596113Z</code>
     * </p>
     * 
     * @param createdDate
     *        The timestamp when you created the collector, in the following format:
     *        <code>2022-01-24T19:04:02.596113Z</code>
     */

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>
     * The timestamp when you created the collector, in the following format: <code>2022-01-24T19:04:02.596113Z</code>
     * </p>
     * 
     * @return The timestamp when you created the collector, in the following format:
     *         <code>2022-01-24T19:04:02.596113Z</code>
     */

    public String getCreatedDate() {
        return this.createdDate;
    }

    /**
     * <p>
     * The timestamp when you created the collector, in the following format: <code>2022-01-24T19:04:02.596113Z</code>
     * </p>
     * 
     * @param createdDate
     *        The timestamp when you created the collector, in the following format:
     *        <code>2022-01-24T19:04:02.596113Z</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CollectorResponse withCreatedDate(String createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    /**
     * <p>
     * The timestamp when DMS last modified the collector, in the following format:
     * <code>2022-01-24T19:04:02.596113Z</code>
     * </p>
     * 
     * @param modifiedDate
     *        The timestamp when DMS last modified the collector, in the following format:
     *        <code>2022-01-24T19:04:02.596113Z</code>
     */

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    /**
     * <p>
     * The timestamp when DMS last modified the collector, in the following format:
     * <code>2022-01-24T19:04:02.596113Z</code>
     * </p>
     * 
     * @return The timestamp when DMS last modified the collector, in the following format:
     *         <code>2022-01-24T19:04:02.596113Z</code>
     */

    public String getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * <p>
     * The timestamp when DMS last modified the collector, in the following format:
     * <code>2022-01-24T19:04:02.596113Z</code>
     * </p>
     * 
     * @param modifiedDate
     *        The timestamp when DMS last modified the collector, in the following format:
     *        <code>2022-01-24T19:04:02.596113Z</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CollectorResponse withModifiedDate(String modifiedDate) {
        setModifiedDate(modifiedDate);
        return this;
    }

    /**
     * @param inventoryData
     */

    public void setInventoryData(InventoryData inventoryData) {
        this.inventoryData = inventoryData;
    }

    /**
     * @return
     */

    public InventoryData getInventoryData() {
        return this.inventoryData;
    }

    /**
     * @param inventoryData
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CollectorResponse withInventoryData(InventoryData inventoryData) {
        setInventoryData(inventoryData);
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
        if (getCollectorReferencedId() != null)
            sb.append("CollectorReferencedId: ").append(getCollectorReferencedId()).append(",");
        if (getCollectorName() != null)
            sb.append("CollectorName: ").append(getCollectorName()).append(",");
        if (getCollectorVersion() != null)
            sb.append("CollectorVersion: ").append(getCollectorVersion()).append(",");
        if (getVersionStatus() != null)
            sb.append("VersionStatus: ").append(getVersionStatus()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getS3BucketName() != null)
            sb.append("S3BucketName: ").append(getS3BucketName()).append(",");
        if (getServiceAccessRoleArn() != null)
            sb.append("ServiceAccessRoleArn: ").append(getServiceAccessRoleArn()).append(",");
        if (getCollectorHealthCheck() != null)
            sb.append("CollectorHealthCheck: ").append(getCollectorHealthCheck()).append(",");
        if (getLastDataReceived() != null)
            sb.append("LastDataReceived: ").append(getLastDataReceived()).append(",");
        if (getRegisteredDate() != null)
            sb.append("RegisteredDate: ").append(getRegisteredDate()).append(",");
        if (getCreatedDate() != null)
            sb.append("CreatedDate: ").append(getCreatedDate()).append(",");
        if (getModifiedDate() != null)
            sb.append("ModifiedDate: ").append(getModifiedDate()).append(",");
        if (getInventoryData() != null)
            sb.append("InventoryData: ").append(getInventoryData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CollectorResponse == false)
            return false;
        CollectorResponse other = (CollectorResponse) obj;
        if (other.getCollectorReferencedId() == null ^ this.getCollectorReferencedId() == null)
            return false;
        if (other.getCollectorReferencedId() != null && other.getCollectorReferencedId().equals(this.getCollectorReferencedId()) == false)
            return false;
        if (other.getCollectorName() == null ^ this.getCollectorName() == null)
            return false;
        if (other.getCollectorName() != null && other.getCollectorName().equals(this.getCollectorName()) == false)
            return false;
        if (other.getCollectorVersion() == null ^ this.getCollectorVersion() == null)
            return false;
        if (other.getCollectorVersion() != null && other.getCollectorVersion().equals(this.getCollectorVersion()) == false)
            return false;
        if (other.getVersionStatus() == null ^ this.getVersionStatus() == null)
            return false;
        if (other.getVersionStatus() != null && other.getVersionStatus().equals(this.getVersionStatus()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getS3BucketName() == null ^ this.getS3BucketName() == null)
            return false;
        if (other.getS3BucketName() != null && other.getS3BucketName().equals(this.getS3BucketName()) == false)
            return false;
        if (other.getServiceAccessRoleArn() == null ^ this.getServiceAccessRoleArn() == null)
            return false;
        if (other.getServiceAccessRoleArn() != null && other.getServiceAccessRoleArn().equals(this.getServiceAccessRoleArn()) == false)
            return false;
        if (other.getCollectorHealthCheck() == null ^ this.getCollectorHealthCheck() == null)
            return false;
        if (other.getCollectorHealthCheck() != null && other.getCollectorHealthCheck().equals(this.getCollectorHealthCheck()) == false)
            return false;
        if (other.getLastDataReceived() == null ^ this.getLastDataReceived() == null)
            return false;
        if (other.getLastDataReceived() != null && other.getLastDataReceived().equals(this.getLastDataReceived()) == false)
            return false;
        if (other.getRegisteredDate() == null ^ this.getRegisteredDate() == null)
            return false;
        if (other.getRegisteredDate() != null && other.getRegisteredDate().equals(this.getRegisteredDate()) == false)
            return false;
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null)
            return false;
        if (other.getCreatedDate() != null && other.getCreatedDate().equals(this.getCreatedDate()) == false)
            return false;
        if (other.getModifiedDate() == null ^ this.getModifiedDate() == null)
            return false;
        if (other.getModifiedDate() != null && other.getModifiedDate().equals(this.getModifiedDate()) == false)
            return false;
        if (other.getInventoryData() == null ^ this.getInventoryData() == null)
            return false;
        if (other.getInventoryData() != null && other.getInventoryData().equals(this.getInventoryData()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCollectorReferencedId() == null) ? 0 : getCollectorReferencedId().hashCode());
        hashCode = prime * hashCode + ((getCollectorName() == null) ? 0 : getCollectorName().hashCode());
        hashCode = prime * hashCode + ((getCollectorVersion() == null) ? 0 : getCollectorVersion().hashCode());
        hashCode = prime * hashCode + ((getVersionStatus() == null) ? 0 : getVersionStatus().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getS3BucketName() == null) ? 0 : getS3BucketName().hashCode());
        hashCode = prime * hashCode + ((getServiceAccessRoleArn() == null) ? 0 : getServiceAccessRoleArn().hashCode());
        hashCode = prime * hashCode + ((getCollectorHealthCheck() == null) ? 0 : getCollectorHealthCheck().hashCode());
        hashCode = prime * hashCode + ((getLastDataReceived() == null) ? 0 : getLastDataReceived().hashCode());
        hashCode = prime * hashCode + ((getRegisteredDate() == null) ? 0 : getRegisteredDate().hashCode());
        hashCode = prime * hashCode + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        hashCode = prime * hashCode + ((getModifiedDate() == null) ? 0 : getModifiedDate().hashCode());
        hashCode = prime * hashCode + ((getInventoryData() == null) ? 0 : getInventoryData().hashCode());
        return hashCode;
    }

    @Override
    public CollectorResponse clone() {
        try {
            return (CollectorResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.databasemigrationservice.model.transform.CollectorResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
