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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Information about an AMI that is currently in the Recycle Bin.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ImageRecycleBinInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImageRecycleBinInfo implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the AMI.
     * </p>
     */
    private String imageId;
    /**
     * <p>
     * The name of the AMI.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the AMI.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The date and time when the AMI entered the Recycle Bin.
     * </p>
     */
    private java.util.Date recycleBinEnterTime;
    /**
     * <p>
     * The date and time when the AMI is to be permanently deleted from the Recycle Bin.
     * </p>
     */
    private java.util.Date recycleBinExitTime;

    /**
     * <p>
     * The ID of the AMI.
     * </p>
     * 
     * @param imageId
     *        The ID of the AMI.
     */

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    /**
     * <p>
     * The ID of the AMI.
     * </p>
     * 
     * @return The ID of the AMI.
     */

    public String getImageId() {
        return this.imageId;
    }

    /**
     * <p>
     * The ID of the AMI.
     * </p>
     * 
     * @param imageId
     *        The ID of the AMI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageRecycleBinInfo withImageId(String imageId) {
        setImageId(imageId);
        return this;
    }

    /**
     * <p>
     * The name of the AMI.
     * </p>
     * 
     * @param name
     *        The name of the AMI.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the AMI.
     * </p>
     * 
     * @return The name of the AMI.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the AMI.
     * </p>
     * 
     * @param name
     *        The name of the AMI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageRecycleBinInfo withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the AMI.
     * </p>
     * 
     * @param description
     *        The description of the AMI.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the AMI.
     * </p>
     * 
     * @return The description of the AMI.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the AMI.
     * </p>
     * 
     * @param description
     *        The description of the AMI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageRecycleBinInfo withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The date and time when the AMI entered the Recycle Bin.
     * </p>
     * 
     * @param recycleBinEnterTime
     *        The date and time when the AMI entered the Recycle Bin.
     */

    public void setRecycleBinEnterTime(java.util.Date recycleBinEnterTime) {
        this.recycleBinEnterTime = recycleBinEnterTime;
    }

    /**
     * <p>
     * The date and time when the AMI entered the Recycle Bin.
     * </p>
     * 
     * @return The date and time when the AMI entered the Recycle Bin.
     */

    public java.util.Date getRecycleBinEnterTime() {
        return this.recycleBinEnterTime;
    }

    /**
     * <p>
     * The date and time when the AMI entered the Recycle Bin.
     * </p>
     * 
     * @param recycleBinEnterTime
     *        The date and time when the AMI entered the Recycle Bin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageRecycleBinInfo withRecycleBinEnterTime(java.util.Date recycleBinEnterTime) {
        setRecycleBinEnterTime(recycleBinEnterTime);
        return this;
    }

    /**
     * <p>
     * The date and time when the AMI is to be permanently deleted from the Recycle Bin.
     * </p>
     * 
     * @param recycleBinExitTime
     *        The date and time when the AMI is to be permanently deleted from the Recycle Bin.
     */

    public void setRecycleBinExitTime(java.util.Date recycleBinExitTime) {
        this.recycleBinExitTime = recycleBinExitTime;
    }

    /**
     * <p>
     * The date and time when the AMI is to be permanently deleted from the Recycle Bin.
     * </p>
     * 
     * @return The date and time when the AMI is to be permanently deleted from the Recycle Bin.
     */

    public java.util.Date getRecycleBinExitTime() {
        return this.recycleBinExitTime;
    }

    /**
     * <p>
     * The date and time when the AMI is to be permanently deleted from the Recycle Bin.
     * </p>
     * 
     * @param recycleBinExitTime
     *        The date and time when the AMI is to be permanently deleted from the Recycle Bin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageRecycleBinInfo withRecycleBinExitTime(java.util.Date recycleBinExitTime) {
        setRecycleBinExitTime(recycleBinExitTime);
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
        if (getImageId() != null)
            sb.append("ImageId: ").append(getImageId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getRecycleBinEnterTime() != null)
            sb.append("RecycleBinEnterTime: ").append(getRecycleBinEnterTime()).append(",");
        if (getRecycleBinExitTime() != null)
            sb.append("RecycleBinExitTime: ").append(getRecycleBinExitTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImageRecycleBinInfo == false)
            return false;
        ImageRecycleBinInfo other = (ImageRecycleBinInfo) obj;
        if (other.getImageId() == null ^ this.getImageId() == null)
            return false;
        if (other.getImageId() != null && other.getImageId().equals(this.getImageId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getRecycleBinEnterTime() == null ^ this.getRecycleBinEnterTime() == null)
            return false;
        if (other.getRecycleBinEnterTime() != null && other.getRecycleBinEnterTime().equals(this.getRecycleBinEnterTime()) == false)
            return false;
        if (other.getRecycleBinExitTime() == null ^ this.getRecycleBinExitTime() == null)
            return false;
        if (other.getRecycleBinExitTime() != null && other.getRecycleBinExitTime().equals(this.getRecycleBinExitTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImageId() == null) ? 0 : getImageId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getRecycleBinEnterTime() == null) ? 0 : getRecycleBinEnterTime().hashCode());
        hashCode = prime * hashCode + ((getRecycleBinExitTime() == null) ? 0 : getRecycleBinExitTime().hashCode());
        return hashCode;
    }

    @Override
    public ImageRecycleBinInfo clone() {
        try {
            return (ImageRecycleBinInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
