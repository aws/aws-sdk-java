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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * <p>
 * Contains the output for ImportImage.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportImageResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The architecture of the virtual machine.
     * </p>
     */
    private String architecture;
    /**
     * <p>
     * A description of the import task.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Indicates whether the AMI is encypted.
     * </p>
     */
    private Boolean encrypted;
    /**
     * <p>
     * The target hypervisor of the import task.
     * </p>
     */
    private String hypervisor;
    /**
     * <p>
     * The ID of the Amazon Machine Image (AMI) created by the import task.
     * </p>
     */
    private String imageId;
    /**
     * <p>
     * The task ID of the import image task.
     * </p>
     */
    private String importTaskId;
    /**
     * <p>
     * The identifier for the AWS Key Management Service (AWS KMS) customer master key (CMK) that was used to create the
     * encrypted AMI.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The license type of the virtual machine.
     * </p>
     */
    private String licenseType;
    /**
     * <p>
     * The operating system of the virtual machine.
     * </p>
     */
    private String platform;
    /**
     * <p>
     * The progress of the task.
     * </p>
     */
    private String progress;
    /**
     * <p>
     * Information about the snapshots.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<SnapshotDetail> snapshotDetails;
    /**
     * <p>
     * A brief status of the task.
     * </p>
     */
    private String status;
    /**
     * <p>
     * A detailed status message of the import task.
     * </p>
     */
    private String statusMessage;

    /**
     * <p>
     * The architecture of the virtual machine.
     * </p>
     * 
     * @param architecture
     *        The architecture of the virtual machine.
     */

    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    /**
     * <p>
     * The architecture of the virtual machine.
     * </p>
     * 
     * @return The architecture of the virtual machine.
     */

    public String getArchitecture() {
        return this.architecture;
    }

    /**
     * <p>
     * The architecture of the virtual machine.
     * </p>
     * 
     * @param architecture
     *        The architecture of the virtual machine.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportImageResult withArchitecture(String architecture) {
        setArchitecture(architecture);
        return this;
    }

    /**
     * <p>
     * A description of the import task.
     * </p>
     * 
     * @param description
     *        A description of the import task.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the import task.
     * </p>
     * 
     * @return A description of the import task.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the import task.
     * </p>
     * 
     * @param description
     *        A description of the import task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportImageResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Indicates whether the AMI is encypted.
     * </p>
     * 
     * @param encrypted
     *        Indicates whether the AMI is encypted.
     */

    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    /**
     * <p>
     * Indicates whether the AMI is encypted.
     * </p>
     * 
     * @return Indicates whether the AMI is encypted.
     */

    public Boolean getEncrypted() {
        return this.encrypted;
    }

    /**
     * <p>
     * Indicates whether the AMI is encypted.
     * </p>
     * 
     * @param encrypted
     *        Indicates whether the AMI is encypted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportImageResult withEncrypted(Boolean encrypted) {
        setEncrypted(encrypted);
        return this;
    }

    /**
     * <p>
     * Indicates whether the AMI is encypted.
     * </p>
     * 
     * @return Indicates whether the AMI is encypted.
     */

    public Boolean isEncrypted() {
        return this.encrypted;
    }

    /**
     * <p>
     * The target hypervisor of the import task.
     * </p>
     * 
     * @param hypervisor
     *        The target hypervisor of the import task.
     */

    public void setHypervisor(String hypervisor) {
        this.hypervisor = hypervisor;
    }

    /**
     * <p>
     * The target hypervisor of the import task.
     * </p>
     * 
     * @return The target hypervisor of the import task.
     */

    public String getHypervisor() {
        return this.hypervisor;
    }

    /**
     * <p>
     * The target hypervisor of the import task.
     * </p>
     * 
     * @param hypervisor
     *        The target hypervisor of the import task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportImageResult withHypervisor(String hypervisor) {
        setHypervisor(hypervisor);
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon Machine Image (AMI) created by the import task.
     * </p>
     * 
     * @param imageId
     *        The ID of the Amazon Machine Image (AMI) created by the import task.
     */

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    /**
     * <p>
     * The ID of the Amazon Machine Image (AMI) created by the import task.
     * </p>
     * 
     * @return The ID of the Amazon Machine Image (AMI) created by the import task.
     */

    public String getImageId() {
        return this.imageId;
    }

    /**
     * <p>
     * The ID of the Amazon Machine Image (AMI) created by the import task.
     * </p>
     * 
     * @param imageId
     *        The ID of the Amazon Machine Image (AMI) created by the import task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportImageResult withImageId(String imageId) {
        setImageId(imageId);
        return this;
    }

    /**
     * <p>
     * The task ID of the import image task.
     * </p>
     * 
     * @param importTaskId
     *        The task ID of the import image task.
     */

    public void setImportTaskId(String importTaskId) {
        this.importTaskId = importTaskId;
    }

    /**
     * <p>
     * The task ID of the import image task.
     * </p>
     * 
     * @return The task ID of the import image task.
     */

    public String getImportTaskId() {
        return this.importTaskId;
    }

    /**
     * <p>
     * The task ID of the import image task.
     * </p>
     * 
     * @param importTaskId
     *        The task ID of the import image task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportImageResult withImportTaskId(String importTaskId) {
        setImportTaskId(importTaskId);
        return this;
    }

    /**
     * <p>
     * The identifier for the AWS Key Management Service (AWS KMS) customer master key (CMK) that was used to create the
     * encrypted AMI.
     * </p>
     * 
     * @param kmsKeyId
     *        The identifier for the AWS Key Management Service (AWS KMS) customer master key (CMK) that was used to
     *        create the encrypted AMI.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The identifier for the AWS Key Management Service (AWS KMS) customer master key (CMK) that was used to create the
     * encrypted AMI.
     * </p>
     * 
     * @return The identifier for the AWS Key Management Service (AWS KMS) customer master key (CMK) that was used to
     *         create the encrypted AMI.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The identifier for the AWS Key Management Service (AWS KMS) customer master key (CMK) that was used to create the
     * encrypted AMI.
     * </p>
     * 
     * @param kmsKeyId
     *        The identifier for the AWS Key Management Service (AWS KMS) customer master key (CMK) that was used to
     *        create the encrypted AMI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportImageResult withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The license type of the virtual machine.
     * </p>
     * 
     * @param licenseType
     *        The license type of the virtual machine.
     */

    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }

    /**
     * <p>
     * The license type of the virtual machine.
     * </p>
     * 
     * @return The license type of the virtual machine.
     */

    public String getLicenseType() {
        return this.licenseType;
    }

    /**
     * <p>
     * The license type of the virtual machine.
     * </p>
     * 
     * @param licenseType
     *        The license type of the virtual machine.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportImageResult withLicenseType(String licenseType) {
        setLicenseType(licenseType);
        return this;
    }

    /**
     * <p>
     * The operating system of the virtual machine.
     * </p>
     * 
     * @param platform
     *        The operating system of the virtual machine.
     */

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * <p>
     * The operating system of the virtual machine.
     * </p>
     * 
     * @return The operating system of the virtual machine.
     */

    public String getPlatform() {
        return this.platform;
    }

    /**
     * <p>
     * The operating system of the virtual machine.
     * </p>
     * 
     * @param platform
     *        The operating system of the virtual machine.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportImageResult withPlatform(String platform) {
        setPlatform(platform);
        return this;
    }

    /**
     * <p>
     * The progress of the task.
     * </p>
     * 
     * @param progress
     *        The progress of the task.
     */

    public void setProgress(String progress) {
        this.progress = progress;
    }

    /**
     * <p>
     * The progress of the task.
     * </p>
     * 
     * @return The progress of the task.
     */

    public String getProgress() {
        return this.progress;
    }

    /**
     * <p>
     * The progress of the task.
     * </p>
     * 
     * @param progress
     *        The progress of the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportImageResult withProgress(String progress) {
        setProgress(progress);
        return this;
    }

    /**
     * <p>
     * Information about the snapshots.
     * </p>
     * 
     * @return Information about the snapshots.
     */

    public java.util.List<SnapshotDetail> getSnapshotDetails() {
        if (snapshotDetails == null) {
            snapshotDetails = new com.amazonaws.internal.SdkInternalList<SnapshotDetail>();
        }
        return snapshotDetails;
    }

    /**
     * <p>
     * Information about the snapshots.
     * </p>
     * 
     * @param snapshotDetails
     *        Information about the snapshots.
     */

    public void setSnapshotDetails(java.util.Collection<SnapshotDetail> snapshotDetails) {
        if (snapshotDetails == null) {
            this.snapshotDetails = null;
            return;
        }

        this.snapshotDetails = new com.amazonaws.internal.SdkInternalList<SnapshotDetail>(snapshotDetails);
    }

    /**
     * <p>
     * Information about the snapshots.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSnapshotDetails(java.util.Collection)} or {@link #withSnapshotDetails(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param snapshotDetails
     *        Information about the snapshots.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportImageResult withSnapshotDetails(SnapshotDetail... snapshotDetails) {
        if (this.snapshotDetails == null) {
            setSnapshotDetails(new com.amazonaws.internal.SdkInternalList<SnapshotDetail>(snapshotDetails.length));
        }
        for (SnapshotDetail ele : snapshotDetails) {
            this.snapshotDetails.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the snapshots.
     * </p>
     * 
     * @param snapshotDetails
     *        Information about the snapshots.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportImageResult withSnapshotDetails(java.util.Collection<SnapshotDetail> snapshotDetails) {
        setSnapshotDetails(snapshotDetails);
        return this;
    }

    /**
     * <p>
     * A brief status of the task.
     * </p>
     * 
     * @param status
     *        A brief status of the task.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * A brief status of the task.
     * </p>
     * 
     * @return A brief status of the task.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * A brief status of the task.
     * </p>
     * 
     * @param status
     *        A brief status of the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportImageResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * A detailed status message of the import task.
     * </p>
     * 
     * @param statusMessage
     *        A detailed status message of the import task.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * A detailed status message of the import task.
     * </p>
     * 
     * @return A detailed status message of the import task.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * A detailed status message of the import task.
     * </p>
     * 
     * @param statusMessage
     *        A detailed status message of the import task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportImageResult withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
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
        if (getArchitecture() != null)
            sb.append("Architecture: ").append(getArchitecture()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getEncrypted() != null)
            sb.append("Encrypted: ").append(getEncrypted()).append(",");
        if (getHypervisor() != null)
            sb.append("Hypervisor: ").append(getHypervisor()).append(",");
        if (getImageId() != null)
            sb.append("ImageId: ").append(getImageId()).append(",");
        if (getImportTaskId() != null)
            sb.append("ImportTaskId: ").append(getImportTaskId()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getLicenseType() != null)
            sb.append("LicenseType: ").append(getLicenseType()).append(",");
        if (getPlatform() != null)
            sb.append("Platform: ").append(getPlatform()).append(",");
        if (getProgress() != null)
            sb.append("Progress: ").append(getProgress()).append(",");
        if (getSnapshotDetails() != null)
            sb.append("SnapshotDetails: ").append(getSnapshotDetails()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportImageResult == false)
            return false;
        ImportImageResult other = (ImportImageResult) obj;
        if (other.getArchitecture() == null ^ this.getArchitecture() == null)
            return false;
        if (other.getArchitecture() != null && other.getArchitecture().equals(this.getArchitecture()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEncrypted() == null ^ this.getEncrypted() == null)
            return false;
        if (other.getEncrypted() != null && other.getEncrypted().equals(this.getEncrypted()) == false)
            return false;
        if (other.getHypervisor() == null ^ this.getHypervisor() == null)
            return false;
        if (other.getHypervisor() != null && other.getHypervisor().equals(this.getHypervisor()) == false)
            return false;
        if (other.getImageId() == null ^ this.getImageId() == null)
            return false;
        if (other.getImageId() != null && other.getImageId().equals(this.getImageId()) == false)
            return false;
        if (other.getImportTaskId() == null ^ this.getImportTaskId() == null)
            return false;
        if (other.getImportTaskId() != null && other.getImportTaskId().equals(this.getImportTaskId()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getLicenseType() == null ^ this.getLicenseType() == null)
            return false;
        if (other.getLicenseType() != null && other.getLicenseType().equals(this.getLicenseType()) == false)
            return false;
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
            return false;
        if (other.getProgress() == null ^ this.getProgress() == null)
            return false;
        if (other.getProgress() != null && other.getProgress().equals(this.getProgress()) == false)
            return false;
        if (other.getSnapshotDetails() == null ^ this.getSnapshotDetails() == null)
            return false;
        if (other.getSnapshotDetails() != null && other.getSnapshotDetails().equals(this.getSnapshotDetails()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArchitecture() == null) ? 0 : getArchitecture().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEncrypted() == null) ? 0 : getEncrypted().hashCode());
        hashCode = prime * hashCode + ((getHypervisor() == null) ? 0 : getHypervisor().hashCode());
        hashCode = prime * hashCode + ((getImageId() == null) ? 0 : getImageId().hashCode());
        hashCode = prime * hashCode + ((getImportTaskId() == null) ? 0 : getImportTaskId().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getLicenseType() == null) ? 0 : getLicenseType().hashCode());
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        hashCode = prime * hashCode + ((getProgress() == null) ? 0 : getProgress().hashCode());
        hashCode = prime * hashCode + ((getSnapshotDetails() == null) ? 0 : getSnapshotDetails().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        return hashCode;
    }

    @Override
    public ImportImageResult clone() {
        try {
            return (ImportImageResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
