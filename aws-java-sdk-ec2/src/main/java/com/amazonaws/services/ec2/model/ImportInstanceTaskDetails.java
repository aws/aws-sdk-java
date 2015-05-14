/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes an import instance task.
 * </p>
 */
public class ImportInstanceTaskDetails implements Serializable, Cloneable {

    /**
     * One or more volumes.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<ImportInstanceVolumeDetailItem> volumes;

    /**
     * The ID of the instance.
     */
    private String instanceId;

    /**
     * The instance operating system.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Windows
     */
    private String platform;

    /**
     * A description of the task.
     */
    private String description;

    /**
     * One or more volumes.
     *
     * @return One or more volumes.
     */
    public java.util.List<ImportInstanceVolumeDetailItem> getVolumes() {
        if (volumes == null) {
              volumes = new com.amazonaws.internal.ListWithAutoConstructFlag<ImportInstanceVolumeDetailItem>();
              volumes.setAutoConstruct(true);
        }
        return volumes;
    }
    
    /**
     * One or more volumes.
     *
     * @param volumes One or more volumes.
     */
    public void setVolumes(java.util.Collection<ImportInstanceVolumeDetailItem> volumes) {
        if (volumes == null) {
            this.volumes = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<ImportInstanceVolumeDetailItem> volumesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ImportInstanceVolumeDetailItem>(volumes.size());
        volumesCopy.addAll(volumes);
        this.volumes = volumesCopy;
    }
    
    /**
     * One or more volumes.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setVolumes(java.util.Collection)} or {@link
     * #withVolumes(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param volumes One or more volumes.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ImportInstanceTaskDetails withVolumes(ImportInstanceVolumeDetailItem... volumes) {
        if (getVolumes() == null) setVolumes(new java.util.ArrayList<ImportInstanceVolumeDetailItem>(volumes.length));
        for (ImportInstanceVolumeDetailItem value : volumes) {
            getVolumes().add(value);
        }
        return this;
    }
    
    /**
     * One or more volumes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param volumes One or more volumes.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ImportInstanceTaskDetails withVolumes(java.util.Collection<ImportInstanceVolumeDetailItem> volumes) {
        if (volumes == null) {
            this.volumes = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<ImportInstanceVolumeDetailItem> volumesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ImportInstanceVolumeDetailItem>(volumes.size());
            volumesCopy.addAll(volumes);
            this.volumes = volumesCopy;
        }

        return this;
    }

    /**
     * The ID of the instance.
     *
     * @return The ID of the instance.
     */
    public String getInstanceId() {
        return instanceId;
    }
    
    /**
     * The ID of the instance.
     *
     * @param instanceId The ID of the instance.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
     * The ID of the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceId The ID of the instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ImportInstanceTaskDetails withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * The instance operating system.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Windows
     *
     * @return The instance operating system.
     *
     * @see PlatformValues
     */
    public String getPlatform() {
        return platform;
    }
    
    /**
     * The instance operating system.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Windows
     *
     * @param platform The instance operating system.
     *
     * @see PlatformValues
     */
    public void setPlatform(String platform) {
        this.platform = platform;
    }
    
    /**
     * The instance operating system.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Windows
     *
     * @param platform The instance operating system.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see PlatformValues
     */
    public ImportInstanceTaskDetails withPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    /**
     * The instance operating system.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Windows
     *
     * @param platform The instance operating system.
     *
     * @see PlatformValues
     */
    public void setPlatform(PlatformValues platform) {
        this.platform = platform.toString();
    }
    
    /**
     * The instance operating system.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Windows
     *
     * @param platform The instance operating system.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see PlatformValues
     */
    public ImportInstanceTaskDetails withPlatform(PlatformValues platform) {
        this.platform = platform.toString();
        return this;
    }

    /**
     * A description of the task.
     *
     * @return A description of the task.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * A description of the task.
     *
     * @param description A description of the task.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * A description of the task.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description A description of the task.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ImportInstanceTaskDetails withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getVolumes() != null) sb.append("Volumes: " + getVolumes() + ",");
        if (getInstanceId() != null) sb.append("InstanceId: " + getInstanceId() + ",");
        if (getPlatform() != null) sb.append("Platform: " + getPlatform() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVolumes() == null) ? 0 : getVolumes().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode()); 
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ImportInstanceTaskDetails == false) return false;
        ImportInstanceTaskDetails other = (ImportInstanceTaskDetails)obj;
        
        if (other.getVolumes() == null ^ this.getVolumes() == null) return false;
        if (other.getVolumes() != null && other.getVolumes().equals(this.getVolumes()) == false) return false; 
        if (other.getInstanceId() == null ^ this.getInstanceId() == null) return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false) return false; 
        if (other.getPlatform() == null ^ this.getPlatform() == null) return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        return true;
    }
    
    @Override
    public ImportInstanceTaskDetails clone() {
        try {
            return (ImportInstanceTaskDetails) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    