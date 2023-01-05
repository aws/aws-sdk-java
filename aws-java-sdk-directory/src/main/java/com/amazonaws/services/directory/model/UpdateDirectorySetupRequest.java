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
package com.amazonaws.services.directory.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/UpdateDirectorySetup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDirectorySetupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the directory on which you want to perform the update.
     * </p>
     */
    private String directoryId;
    /**
     * <p>
     * The type of update that needs to be performed on the directory. For example, OS.
     * </p>
     */
    private String updateType;
    /**
     * <p>
     * The settings for the OS update that needs to be performed on the directory.
     * </p>
     */
    private OSUpdateSettings oSUpdateSettings;
    /**
     * <p>
     * The boolean that specifies if a snapshot for the directory needs to be taken before updating the directory.
     * </p>
     */
    private Boolean createSnapshotBeforeUpdate;

    /**
     * <p>
     * The identifier of the directory on which you want to perform the update.
     * </p>
     * 
     * @param directoryId
     *        The identifier of the directory on which you want to perform the update.
     */

    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }

    /**
     * <p>
     * The identifier of the directory on which you want to perform the update.
     * </p>
     * 
     * @return The identifier of the directory on which you want to perform the update.
     */

    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * <p>
     * The identifier of the directory on which you want to perform the update.
     * </p>
     * 
     * @param directoryId
     *        The identifier of the directory on which you want to perform the update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDirectorySetupRequest withDirectoryId(String directoryId) {
        setDirectoryId(directoryId);
        return this;
    }

    /**
     * <p>
     * The type of update that needs to be performed on the directory. For example, OS.
     * </p>
     * 
     * @param updateType
     *        The type of update that needs to be performed on the directory. For example, OS.
     * @see UpdateType
     */

    public void setUpdateType(String updateType) {
        this.updateType = updateType;
    }

    /**
     * <p>
     * The type of update that needs to be performed on the directory. For example, OS.
     * </p>
     * 
     * @return The type of update that needs to be performed on the directory. For example, OS.
     * @see UpdateType
     */

    public String getUpdateType() {
        return this.updateType;
    }

    /**
     * <p>
     * The type of update that needs to be performed on the directory. For example, OS.
     * </p>
     * 
     * @param updateType
     *        The type of update that needs to be performed on the directory. For example, OS.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpdateType
     */

    public UpdateDirectorySetupRequest withUpdateType(String updateType) {
        setUpdateType(updateType);
        return this;
    }

    /**
     * <p>
     * The type of update that needs to be performed on the directory. For example, OS.
     * </p>
     * 
     * @param updateType
     *        The type of update that needs to be performed on the directory. For example, OS.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpdateType
     */

    public UpdateDirectorySetupRequest withUpdateType(UpdateType updateType) {
        this.updateType = updateType.toString();
        return this;
    }

    /**
     * <p>
     * The settings for the OS update that needs to be performed on the directory.
     * </p>
     * 
     * @param oSUpdateSettings
     *        The settings for the OS update that needs to be performed on the directory.
     */

    public void setOSUpdateSettings(OSUpdateSettings oSUpdateSettings) {
        this.oSUpdateSettings = oSUpdateSettings;
    }

    /**
     * <p>
     * The settings for the OS update that needs to be performed on the directory.
     * </p>
     * 
     * @return The settings for the OS update that needs to be performed on the directory.
     */

    public OSUpdateSettings getOSUpdateSettings() {
        return this.oSUpdateSettings;
    }

    /**
     * <p>
     * The settings for the OS update that needs to be performed on the directory.
     * </p>
     * 
     * @param oSUpdateSettings
     *        The settings for the OS update that needs to be performed on the directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDirectorySetupRequest withOSUpdateSettings(OSUpdateSettings oSUpdateSettings) {
        setOSUpdateSettings(oSUpdateSettings);
        return this;
    }

    /**
     * <p>
     * The boolean that specifies if a snapshot for the directory needs to be taken before updating the directory.
     * </p>
     * 
     * @param createSnapshotBeforeUpdate
     *        The boolean that specifies if a snapshot for the directory needs to be taken before updating the
     *        directory.
     */

    public void setCreateSnapshotBeforeUpdate(Boolean createSnapshotBeforeUpdate) {
        this.createSnapshotBeforeUpdate = createSnapshotBeforeUpdate;
    }

    /**
     * <p>
     * The boolean that specifies if a snapshot for the directory needs to be taken before updating the directory.
     * </p>
     * 
     * @return The boolean that specifies if a snapshot for the directory needs to be taken before updating the
     *         directory.
     */

    public Boolean getCreateSnapshotBeforeUpdate() {
        return this.createSnapshotBeforeUpdate;
    }

    /**
     * <p>
     * The boolean that specifies if a snapshot for the directory needs to be taken before updating the directory.
     * </p>
     * 
     * @param createSnapshotBeforeUpdate
     *        The boolean that specifies if a snapshot for the directory needs to be taken before updating the
     *        directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDirectorySetupRequest withCreateSnapshotBeforeUpdate(Boolean createSnapshotBeforeUpdate) {
        setCreateSnapshotBeforeUpdate(createSnapshotBeforeUpdate);
        return this;
    }

    /**
     * <p>
     * The boolean that specifies if a snapshot for the directory needs to be taken before updating the directory.
     * </p>
     * 
     * @return The boolean that specifies if a snapshot for the directory needs to be taken before updating the
     *         directory.
     */

    public Boolean isCreateSnapshotBeforeUpdate() {
        return this.createSnapshotBeforeUpdate;
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
        if (getDirectoryId() != null)
            sb.append("DirectoryId: ").append(getDirectoryId()).append(",");
        if (getUpdateType() != null)
            sb.append("UpdateType: ").append(getUpdateType()).append(",");
        if (getOSUpdateSettings() != null)
            sb.append("OSUpdateSettings: ").append(getOSUpdateSettings()).append(",");
        if (getCreateSnapshotBeforeUpdate() != null)
            sb.append("CreateSnapshotBeforeUpdate: ").append(getCreateSnapshotBeforeUpdate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDirectorySetupRequest == false)
            return false;
        UpdateDirectorySetupRequest other = (UpdateDirectorySetupRequest) obj;
        if (other.getDirectoryId() == null ^ this.getDirectoryId() == null)
            return false;
        if (other.getDirectoryId() != null && other.getDirectoryId().equals(this.getDirectoryId()) == false)
            return false;
        if (other.getUpdateType() == null ^ this.getUpdateType() == null)
            return false;
        if (other.getUpdateType() != null && other.getUpdateType().equals(this.getUpdateType()) == false)
            return false;
        if (other.getOSUpdateSettings() == null ^ this.getOSUpdateSettings() == null)
            return false;
        if (other.getOSUpdateSettings() != null && other.getOSUpdateSettings().equals(this.getOSUpdateSettings()) == false)
            return false;
        if (other.getCreateSnapshotBeforeUpdate() == null ^ this.getCreateSnapshotBeforeUpdate() == null)
            return false;
        if (other.getCreateSnapshotBeforeUpdate() != null && other.getCreateSnapshotBeforeUpdate().equals(this.getCreateSnapshotBeforeUpdate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDirectoryId() == null) ? 0 : getDirectoryId().hashCode());
        hashCode = prime * hashCode + ((getUpdateType() == null) ? 0 : getUpdateType().hashCode());
        hashCode = prime * hashCode + ((getOSUpdateSettings() == null) ? 0 : getOSUpdateSettings().hashCode());
        hashCode = prime * hashCode + ((getCreateSnapshotBeforeUpdate() == null) ? 0 : getCreateSnapshotBeforeUpdate().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDirectorySetupRequest clone() {
        return (UpdateDirectorySetupRequest) super.clone();
    }

}
