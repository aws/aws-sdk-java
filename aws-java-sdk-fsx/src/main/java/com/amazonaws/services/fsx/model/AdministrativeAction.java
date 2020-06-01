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
package com.amazonaws.services.fsx.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a specific Amazon FSx Administrative Action for the current Windows file system.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/AdministrativeAction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AdministrativeAction implements Serializable, Cloneable, StructuredPojo {

    private String administrativeActionType;
    /**
     * <p>
     * Provides the percent complete of a <code>STORAGE_OPTIMIZATION</code> administrative action.
     * </p>
     */
    private Integer progressPercent;
    /**
     * <p>
     * Time that the administrative action request was received.
     * </p>
     */
    private java.util.Date requestTime;
    /**
     * <p>
     * Describes the status of the administrative action, as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FAILED</code> - Amazon FSx failed to process the administrative action successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> - Amazon FSx is processing the administrative action.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code> - Amazon FSx is waiting to process the administrative action.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETED</code> - Amazon FSx has finished processing the administrative task.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATED_OPTIMIZING</code> - For a storage capacity increase update, Amazon FSx has updated the file system
     * with the new storage capacity, and is now performing the storage optimization process. For more information, see
     * <a href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-storage-capacity.html">Managing Storage
     * Capacity</a>.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * Describes the target <code>StorageCapacity</code> or <code>ThroughputCapacity</code> value provided in the
     * <code>UpdateFileSystem</code> operation. Returned for <code>FILE_SYSTEM_UPDATE</code> administrative actions.
     * </p>
     */
    private FileSystem targetFileSystemValues;

    private AdministrativeActionFailureDetails failureDetails;

    /**
     * @param administrativeActionType
     * @see AdministrativeActionType
     */

    public void setAdministrativeActionType(String administrativeActionType) {
        this.administrativeActionType = administrativeActionType;
    }

    /**
     * @return
     * @see AdministrativeActionType
     */

    public String getAdministrativeActionType() {
        return this.administrativeActionType;
    }

    /**
     * @param administrativeActionType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AdministrativeActionType
     */

    public AdministrativeAction withAdministrativeActionType(String administrativeActionType) {
        setAdministrativeActionType(administrativeActionType);
        return this;
    }

    /**
     * @param administrativeActionType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AdministrativeActionType
     */

    public AdministrativeAction withAdministrativeActionType(AdministrativeActionType administrativeActionType) {
        this.administrativeActionType = administrativeActionType.toString();
        return this;
    }

    /**
     * <p>
     * Provides the percent complete of a <code>STORAGE_OPTIMIZATION</code> administrative action.
     * </p>
     * 
     * @param progressPercent
     *        Provides the percent complete of a <code>STORAGE_OPTIMIZATION</code> administrative action.
     */

    public void setProgressPercent(Integer progressPercent) {
        this.progressPercent = progressPercent;
    }

    /**
     * <p>
     * Provides the percent complete of a <code>STORAGE_OPTIMIZATION</code> administrative action.
     * </p>
     * 
     * @return Provides the percent complete of a <code>STORAGE_OPTIMIZATION</code> administrative action.
     */

    public Integer getProgressPercent() {
        return this.progressPercent;
    }

    /**
     * <p>
     * Provides the percent complete of a <code>STORAGE_OPTIMIZATION</code> administrative action.
     * </p>
     * 
     * @param progressPercent
     *        Provides the percent complete of a <code>STORAGE_OPTIMIZATION</code> administrative action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdministrativeAction withProgressPercent(Integer progressPercent) {
        setProgressPercent(progressPercent);
        return this;
    }

    /**
     * <p>
     * Time that the administrative action request was received.
     * </p>
     * 
     * @param requestTime
     *        Time that the administrative action request was received.
     */

    public void setRequestTime(java.util.Date requestTime) {
        this.requestTime = requestTime;
    }

    /**
     * <p>
     * Time that the administrative action request was received.
     * </p>
     * 
     * @return Time that the administrative action request was received.
     */

    public java.util.Date getRequestTime() {
        return this.requestTime;
    }

    /**
     * <p>
     * Time that the administrative action request was received.
     * </p>
     * 
     * @param requestTime
     *        Time that the administrative action request was received.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdministrativeAction withRequestTime(java.util.Date requestTime) {
        setRequestTime(requestTime);
        return this;
    }

    /**
     * <p>
     * Describes the status of the administrative action, as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FAILED</code> - Amazon FSx failed to process the administrative action successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> - Amazon FSx is processing the administrative action.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code> - Amazon FSx is waiting to process the administrative action.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETED</code> - Amazon FSx has finished processing the administrative task.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATED_OPTIMIZING</code> - For a storage capacity increase update, Amazon FSx has updated the file system
     * with the new storage capacity, and is now performing the storage optimization process. For more information, see
     * <a href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-storage-capacity.html">Managing Storage
     * Capacity</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Describes the status of the administrative action, as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>FAILED</code> - Amazon FSx failed to process the administrative action successfully.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN_PROGRESS</code> - Amazon FSx is processing the administrative action.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PENDING</code> - Amazon FSx is waiting to process the administrative action.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COMPLETED</code> - Amazon FSx has finished processing the administrative task.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATED_OPTIMIZING</code> - For a storage capacity increase update, Amazon FSx has updated the file
     *        system with the new storage capacity, and is now performing the storage optimization process. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-storage-capacity.html">Managing Storage
     *        Capacity</a>.
     *        </p>
     *        </li>
     * @see Status
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Describes the status of the administrative action, as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FAILED</code> - Amazon FSx failed to process the administrative action successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> - Amazon FSx is processing the administrative action.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code> - Amazon FSx is waiting to process the administrative action.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETED</code> - Amazon FSx has finished processing the administrative task.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATED_OPTIMIZING</code> - For a storage capacity increase update, Amazon FSx has updated the file system
     * with the new storage capacity, and is now performing the storage optimization process. For more information, see
     * <a href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-storage-capacity.html">Managing Storage
     * Capacity</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Describes the status of the administrative action, as follows:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>FAILED</code> - Amazon FSx failed to process the administrative action successfully.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IN_PROGRESS</code> - Amazon FSx is processing the administrative action.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PENDING</code> - Amazon FSx is waiting to process the administrative action.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>COMPLETED</code> - Amazon FSx has finished processing the administrative task.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UPDATED_OPTIMIZING</code> - For a storage capacity increase update, Amazon FSx has updated the file
     *         system with the new storage capacity, and is now performing the storage optimization process. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-storage-capacity.html">Managing
     *         Storage Capacity</a>.
     *         </p>
     *         </li>
     * @see Status
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Describes the status of the administrative action, as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FAILED</code> - Amazon FSx failed to process the administrative action successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> - Amazon FSx is processing the administrative action.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code> - Amazon FSx is waiting to process the administrative action.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETED</code> - Amazon FSx has finished processing the administrative task.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATED_OPTIMIZING</code> - For a storage capacity increase update, Amazon FSx has updated the file system
     * with the new storage capacity, and is now performing the storage optimization process. For more information, see
     * <a href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-storage-capacity.html">Managing Storage
     * Capacity</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Describes the status of the administrative action, as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>FAILED</code> - Amazon FSx failed to process the administrative action successfully.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN_PROGRESS</code> - Amazon FSx is processing the administrative action.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PENDING</code> - Amazon FSx is waiting to process the administrative action.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COMPLETED</code> - Amazon FSx has finished processing the administrative task.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATED_OPTIMIZING</code> - For a storage capacity increase update, Amazon FSx has updated the file
     *        system with the new storage capacity, and is now performing the storage optimization process. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-storage-capacity.html">Managing Storage
     *        Capacity</a>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public AdministrativeAction withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Describes the status of the administrative action, as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FAILED</code> - Amazon FSx failed to process the administrative action successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> - Amazon FSx is processing the administrative action.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code> - Amazon FSx is waiting to process the administrative action.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETED</code> - Amazon FSx has finished processing the administrative task.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATED_OPTIMIZING</code> - For a storage capacity increase update, Amazon FSx has updated the file system
     * with the new storage capacity, and is now performing the storage optimization process. For more information, see
     * <a href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-storage-capacity.html">Managing Storage
     * Capacity</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Describes the status of the administrative action, as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>FAILED</code> - Amazon FSx failed to process the administrative action successfully.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN_PROGRESS</code> - Amazon FSx is processing the administrative action.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PENDING</code> - Amazon FSx is waiting to process the administrative action.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COMPLETED</code> - Amazon FSx has finished processing the administrative task.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATED_OPTIMIZING</code> - For a storage capacity increase update, Amazon FSx has updated the file
     *        system with the new storage capacity, and is now performing the storage optimization process. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-storage-capacity.html">Managing Storage
     *        Capacity</a>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public AdministrativeAction withStatus(Status status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Describes the target <code>StorageCapacity</code> or <code>ThroughputCapacity</code> value provided in the
     * <code>UpdateFileSystem</code> operation. Returned for <code>FILE_SYSTEM_UPDATE</code> administrative actions.
     * </p>
     * 
     * @param targetFileSystemValues
     *        Describes the target <code>StorageCapacity</code> or <code>ThroughputCapacity</code> value provided in the
     *        <code>UpdateFileSystem</code> operation. Returned for <code>FILE_SYSTEM_UPDATE</code> administrative
     *        actions.
     */

    public void setTargetFileSystemValues(FileSystem targetFileSystemValues) {
        this.targetFileSystemValues = targetFileSystemValues;
    }

    /**
     * <p>
     * Describes the target <code>StorageCapacity</code> or <code>ThroughputCapacity</code> value provided in the
     * <code>UpdateFileSystem</code> operation. Returned for <code>FILE_SYSTEM_UPDATE</code> administrative actions.
     * </p>
     * 
     * @return Describes the target <code>StorageCapacity</code> or <code>ThroughputCapacity</code> value provided in
     *         the <code>UpdateFileSystem</code> operation. Returned for <code>FILE_SYSTEM_UPDATE</code> administrative
     *         actions.
     */

    public FileSystem getTargetFileSystemValues() {
        return this.targetFileSystemValues;
    }

    /**
     * <p>
     * Describes the target <code>StorageCapacity</code> or <code>ThroughputCapacity</code> value provided in the
     * <code>UpdateFileSystem</code> operation. Returned for <code>FILE_SYSTEM_UPDATE</code> administrative actions.
     * </p>
     * 
     * @param targetFileSystemValues
     *        Describes the target <code>StorageCapacity</code> or <code>ThroughputCapacity</code> value provided in the
     *        <code>UpdateFileSystem</code> operation. Returned for <code>FILE_SYSTEM_UPDATE</code> administrative
     *        actions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdministrativeAction withTargetFileSystemValues(FileSystem targetFileSystemValues) {
        setTargetFileSystemValues(targetFileSystemValues);
        return this;
    }

    /**
     * @param failureDetails
     */

    public void setFailureDetails(AdministrativeActionFailureDetails failureDetails) {
        this.failureDetails = failureDetails;
    }

    /**
     * @return
     */

    public AdministrativeActionFailureDetails getFailureDetails() {
        return this.failureDetails;
    }

    /**
     * @param failureDetails
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdministrativeAction withFailureDetails(AdministrativeActionFailureDetails failureDetails) {
        setFailureDetails(failureDetails);
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
        if (getAdministrativeActionType() != null)
            sb.append("AdministrativeActionType: ").append(getAdministrativeActionType()).append(",");
        if (getProgressPercent() != null)
            sb.append("ProgressPercent: ").append(getProgressPercent()).append(",");
        if (getRequestTime() != null)
            sb.append("RequestTime: ").append(getRequestTime()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getTargetFileSystemValues() != null)
            sb.append("TargetFileSystemValues: ").append(getTargetFileSystemValues()).append(",");
        if (getFailureDetails() != null)
            sb.append("FailureDetails: ").append(getFailureDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AdministrativeAction == false)
            return false;
        AdministrativeAction other = (AdministrativeAction) obj;
        if (other.getAdministrativeActionType() == null ^ this.getAdministrativeActionType() == null)
            return false;
        if (other.getAdministrativeActionType() != null && other.getAdministrativeActionType().equals(this.getAdministrativeActionType()) == false)
            return false;
        if (other.getProgressPercent() == null ^ this.getProgressPercent() == null)
            return false;
        if (other.getProgressPercent() != null && other.getProgressPercent().equals(this.getProgressPercent()) == false)
            return false;
        if (other.getRequestTime() == null ^ this.getRequestTime() == null)
            return false;
        if (other.getRequestTime() != null && other.getRequestTime().equals(this.getRequestTime()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTargetFileSystemValues() == null ^ this.getTargetFileSystemValues() == null)
            return false;
        if (other.getTargetFileSystemValues() != null && other.getTargetFileSystemValues().equals(this.getTargetFileSystemValues()) == false)
            return false;
        if (other.getFailureDetails() == null ^ this.getFailureDetails() == null)
            return false;
        if (other.getFailureDetails() != null && other.getFailureDetails().equals(this.getFailureDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdministrativeActionType() == null) ? 0 : getAdministrativeActionType().hashCode());
        hashCode = prime * hashCode + ((getProgressPercent() == null) ? 0 : getProgressPercent().hashCode());
        hashCode = prime * hashCode + ((getRequestTime() == null) ? 0 : getRequestTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTargetFileSystemValues() == null) ? 0 : getTargetFileSystemValues().hashCode());
        hashCode = prime * hashCode + ((getFailureDetails() == null) ? 0 : getFailureDetails().hashCode());
        return hashCode;
    }

    @Override
    public AdministrativeAction clone() {
        try {
            return (AdministrativeAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fsx.model.transform.AdministrativeActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
