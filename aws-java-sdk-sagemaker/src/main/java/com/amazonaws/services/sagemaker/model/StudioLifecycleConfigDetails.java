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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details of the Studio Lifecycle Configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/StudioLifecycleConfigDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StudioLifecycleConfigDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lifecycle Configuration.
     * </p>
     */
    private String studioLifecycleConfigArn;
    /**
     * <p>
     * The name of the Studio Lifecycle Configuration.
     * </p>
     */
    private String studioLifecycleConfigName;
    /**
     * <p>
     * The creation time of the Studio Lifecycle Configuration.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * This value is equivalent to CreationTime because Studio Lifecycle Configurations are immutable.
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * The App type to which the Lifecycle Configuration is attached.
     * </p>
     */
    private String studioLifecycleConfigAppType;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lifecycle Configuration.
     * </p>
     * 
     * @param studioLifecycleConfigArn
     *        The Amazon Resource Name (ARN) of the Lifecycle Configuration.
     */

    public void setStudioLifecycleConfigArn(String studioLifecycleConfigArn) {
        this.studioLifecycleConfigArn = studioLifecycleConfigArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lifecycle Configuration.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Lifecycle Configuration.
     */

    public String getStudioLifecycleConfigArn() {
        return this.studioLifecycleConfigArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lifecycle Configuration.
     * </p>
     * 
     * @param studioLifecycleConfigArn
     *        The Amazon Resource Name (ARN) of the Lifecycle Configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StudioLifecycleConfigDetails withStudioLifecycleConfigArn(String studioLifecycleConfigArn) {
        setStudioLifecycleConfigArn(studioLifecycleConfigArn);
        return this;
    }

    /**
     * <p>
     * The name of the Studio Lifecycle Configuration.
     * </p>
     * 
     * @param studioLifecycleConfigName
     *        The name of the Studio Lifecycle Configuration.
     */

    public void setStudioLifecycleConfigName(String studioLifecycleConfigName) {
        this.studioLifecycleConfigName = studioLifecycleConfigName;
    }

    /**
     * <p>
     * The name of the Studio Lifecycle Configuration.
     * </p>
     * 
     * @return The name of the Studio Lifecycle Configuration.
     */

    public String getStudioLifecycleConfigName() {
        return this.studioLifecycleConfigName;
    }

    /**
     * <p>
     * The name of the Studio Lifecycle Configuration.
     * </p>
     * 
     * @param studioLifecycleConfigName
     *        The name of the Studio Lifecycle Configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StudioLifecycleConfigDetails withStudioLifecycleConfigName(String studioLifecycleConfigName) {
        setStudioLifecycleConfigName(studioLifecycleConfigName);
        return this;
    }

    /**
     * <p>
     * The creation time of the Studio Lifecycle Configuration.
     * </p>
     * 
     * @param creationTime
     *        The creation time of the Studio Lifecycle Configuration.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The creation time of the Studio Lifecycle Configuration.
     * </p>
     * 
     * @return The creation time of the Studio Lifecycle Configuration.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The creation time of the Studio Lifecycle Configuration.
     * </p>
     * 
     * @param creationTime
     *        The creation time of the Studio Lifecycle Configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StudioLifecycleConfigDetails withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * This value is equivalent to CreationTime because Studio Lifecycle Configurations are immutable.
     * </p>
     * 
     * @param lastModifiedTime
     *        This value is equivalent to CreationTime because Studio Lifecycle Configurations are immutable.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * This value is equivalent to CreationTime because Studio Lifecycle Configurations are immutable.
     * </p>
     * 
     * @return This value is equivalent to CreationTime because Studio Lifecycle Configurations are immutable.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * This value is equivalent to CreationTime because Studio Lifecycle Configurations are immutable.
     * </p>
     * 
     * @param lastModifiedTime
     *        This value is equivalent to CreationTime because Studio Lifecycle Configurations are immutable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StudioLifecycleConfigDetails withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * The App type to which the Lifecycle Configuration is attached.
     * </p>
     * 
     * @param studioLifecycleConfigAppType
     *        The App type to which the Lifecycle Configuration is attached.
     * @see StudioLifecycleConfigAppType
     */

    public void setStudioLifecycleConfigAppType(String studioLifecycleConfigAppType) {
        this.studioLifecycleConfigAppType = studioLifecycleConfigAppType;
    }

    /**
     * <p>
     * The App type to which the Lifecycle Configuration is attached.
     * </p>
     * 
     * @return The App type to which the Lifecycle Configuration is attached.
     * @see StudioLifecycleConfigAppType
     */

    public String getStudioLifecycleConfigAppType() {
        return this.studioLifecycleConfigAppType;
    }

    /**
     * <p>
     * The App type to which the Lifecycle Configuration is attached.
     * </p>
     * 
     * @param studioLifecycleConfigAppType
     *        The App type to which the Lifecycle Configuration is attached.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StudioLifecycleConfigAppType
     */

    public StudioLifecycleConfigDetails withStudioLifecycleConfigAppType(String studioLifecycleConfigAppType) {
        setStudioLifecycleConfigAppType(studioLifecycleConfigAppType);
        return this;
    }

    /**
     * <p>
     * The App type to which the Lifecycle Configuration is attached.
     * </p>
     * 
     * @param studioLifecycleConfigAppType
     *        The App type to which the Lifecycle Configuration is attached.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StudioLifecycleConfigAppType
     */

    public StudioLifecycleConfigDetails withStudioLifecycleConfigAppType(StudioLifecycleConfigAppType studioLifecycleConfigAppType) {
        this.studioLifecycleConfigAppType = studioLifecycleConfigAppType.toString();
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
        if (getStudioLifecycleConfigArn() != null)
            sb.append("StudioLifecycleConfigArn: ").append(getStudioLifecycleConfigArn()).append(",");
        if (getStudioLifecycleConfigName() != null)
            sb.append("StudioLifecycleConfigName: ").append(getStudioLifecycleConfigName()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getStudioLifecycleConfigAppType() != null)
            sb.append("StudioLifecycleConfigAppType: ").append(getStudioLifecycleConfigAppType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StudioLifecycleConfigDetails == false)
            return false;
        StudioLifecycleConfigDetails other = (StudioLifecycleConfigDetails) obj;
        if (other.getStudioLifecycleConfigArn() == null ^ this.getStudioLifecycleConfigArn() == null)
            return false;
        if (other.getStudioLifecycleConfigArn() != null && other.getStudioLifecycleConfigArn().equals(this.getStudioLifecycleConfigArn()) == false)
            return false;
        if (other.getStudioLifecycleConfigName() == null ^ this.getStudioLifecycleConfigName() == null)
            return false;
        if (other.getStudioLifecycleConfigName() != null && other.getStudioLifecycleConfigName().equals(this.getStudioLifecycleConfigName()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getStudioLifecycleConfigAppType() == null ^ this.getStudioLifecycleConfigAppType() == null)
            return false;
        if (other.getStudioLifecycleConfigAppType() != null && other.getStudioLifecycleConfigAppType().equals(this.getStudioLifecycleConfigAppType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStudioLifecycleConfigArn() == null) ? 0 : getStudioLifecycleConfigArn().hashCode());
        hashCode = prime * hashCode + ((getStudioLifecycleConfigName() == null) ? 0 : getStudioLifecycleConfigName().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getStudioLifecycleConfigAppType() == null) ? 0 : getStudioLifecycleConfigAppType().hashCode());
        return hashCode;
    }

    @Override
    public StudioLifecycleConfigDetails clone() {
        try {
            return (StudioLifecycleConfigDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.StudioLifecycleConfigDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
