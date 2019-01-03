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

/**
 * <p>
 * Describes an import instance task.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ImportInstanceTaskDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportInstanceTaskDetails implements Serializable, Cloneable {

    /**
     * <p>
     * A description of the task.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The ID of the instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The instance operating system.
     * </p>
     */
    private String platform;
    /**
     * <p>
     * One or more volumes.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ImportInstanceVolumeDetailItem> volumes;

    /**
     * <p>
     * A description of the task.
     * </p>
     * 
     * @param description
     *        A description of the task.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the task.
     * </p>
     * 
     * @return A description of the task.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the task.
     * </p>
     * 
     * @param description
     *        A description of the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportInstanceTaskDetails withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * 
     * @return The ID of the instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportInstanceTaskDetails withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The instance operating system.
     * </p>
     * 
     * @param platform
     *        The instance operating system.
     * @see PlatformValues
     */

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * <p>
     * The instance operating system.
     * </p>
     * 
     * @return The instance operating system.
     * @see PlatformValues
     */

    public String getPlatform() {
        return this.platform;
    }

    /**
     * <p>
     * The instance operating system.
     * </p>
     * 
     * @param platform
     *        The instance operating system.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PlatformValues
     */

    public ImportInstanceTaskDetails withPlatform(String platform) {
        setPlatform(platform);
        return this;
    }

    /**
     * <p>
     * The instance operating system.
     * </p>
     * 
     * @param platform
     *        The instance operating system.
     * @see PlatformValues
     */

    public void setPlatform(PlatformValues platform) {
        withPlatform(platform);
    }

    /**
     * <p>
     * The instance operating system.
     * </p>
     * 
     * @param platform
     *        The instance operating system.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PlatformValues
     */

    public ImportInstanceTaskDetails withPlatform(PlatformValues platform) {
        this.platform = platform.toString();
        return this;
    }

    /**
     * <p>
     * One or more volumes.
     * </p>
     * 
     * @return One or more volumes.
     */

    public java.util.List<ImportInstanceVolumeDetailItem> getVolumes() {
        if (volumes == null) {
            volumes = new com.amazonaws.internal.SdkInternalList<ImportInstanceVolumeDetailItem>();
        }
        return volumes;
    }

    /**
     * <p>
     * One or more volumes.
     * </p>
     * 
     * @param volumes
     *        One or more volumes.
     */

    public void setVolumes(java.util.Collection<ImportInstanceVolumeDetailItem> volumes) {
        if (volumes == null) {
            this.volumes = null;
            return;
        }

        this.volumes = new com.amazonaws.internal.SdkInternalList<ImportInstanceVolumeDetailItem>(volumes);
    }

    /**
     * <p>
     * One or more volumes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVolumes(java.util.Collection)} or {@link #withVolumes(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param volumes
     *        One or more volumes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportInstanceTaskDetails withVolumes(ImportInstanceVolumeDetailItem... volumes) {
        if (this.volumes == null) {
            setVolumes(new com.amazonaws.internal.SdkInternalList<ImportInstanceVolumeDetailItem>(volumes.length));
        }
        for (ImportInstanceVolumeDetailItem ele : volumes) {
            this.volumes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more volumes.
     * </p>
     * 
     * @param volumes
     *        One or more volumes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportInstanceTaskDetails withVolumes(java.util.Collection<ImportInstanceVolumeDetailItem> volumes) {
        setVolumes(volumes);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getPlatform() != null)
            sb.append("Platform: ").append(getPlatform()).append(",");
        if (getVolumes() != null)
            sb.append("Volumes: ").append(getVolumes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportInstanceTaskDetails == false)
            return false;
        ImportInstanceTaskDetails other = (ImportInstanceTaskDetails) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
            return false;
        if (other.getVolumes() == null ^ this.getVolumes() == null)
            return false;
        if (other.getVolumes() != null && other.getVolumes().equals(this.getVolumes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        hashCode = prime * hashCode + ((getVolumes() == null) ? 0 : getVolumes().hashCode());
        return hashCode;
    }

    @Override
    public ImportInstanceTaskDetails clone() {
        try {
            return (ImportInstanceTaskDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
