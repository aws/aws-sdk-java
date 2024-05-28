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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A collection of default EBS storage settings that apply to spaces created within a domain or user profile.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DefaultEbsStorageSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DefaultEbsStorageSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The default size of the EBS storage volume for a space.
     * </p>
     */
    private Integer defaultEbsVolumeSizeInGb;
    /**
     * <p>
     * The maximum size of the EBS storage volume for a space.
     * </p>
     */
    private Integer maximumEbsVolumeSizeInGb;

    /**
     * <p>
     * The default size of the EBS storage volume for a space.
     * </p>
     * 
     * @param defaultEbsVolumeSizeInGb
     *        The default size of the EBS storage volume for a space.
     */

    public void setDefaultEbsVolumeSizeInGb(Integer defaultEbsVolumeSizeInGb) {
        this.defaultEbsVolumeSizeInGb = defaultEbsVolumeSizeInGb;
    }

    /**
     * <p>
     * The default size of the EBS storage volume for a space.
     * </p>
     * 
     * @return The default size of the EBS storage volume for a space.
     */

    public Integer getDefaultEbsVolumeSizeInGb() {
        return this.defaultEbsVolumeSizeInGb;
    }

    /**
     * <p>
     * The default size of the EBS storage volume for a space.
     * </p>
     * 
     * @param defaultEbsVolumeSizeInGb
     *        The default size of the EBS storage volume for a space.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DefaultEbsStorageSettings withDefaultEbsVolumeSizeInGb(Integer defaultEbsVolumeSizeInGb) {
        setDefaultEbsVolumeSizeInGb(defaultEbsVolumeSizeInGb);
        return this;
    }

    /**
     * <p>
     * The maximum size of the EBS storage volume for a space.
     * </p>
     * 
     * @param maximumEbsVolumeSizeInGb
     *        The maximum size of the EBS storage volume for a space.
     */

    public void setMaximumEbsVolumeSizeInGb(Integer maximumEbsVolumeSizeInGb) {
        this.maximumEbsVolumeSizeInGb = maximumEbsVolumeSizeInGb;
    }

    /**
     * <p>
     * The maximum size of the EBS storage volume for a space.
     * </p>
     * 
     * @return The maximum size of the EBS storage volume for a space.
     */

    public Integer getMaximumEbsVolumeSizeInGb() {
        return this.maximumEbsVolumeSizeInGb;
    }

    /**
     * <p>
     * The maximum size of the EBS storage volume for a space.
     * </p>
     * 
     * @param maximumEbsVolumeSizeInGb
     *        The maximum size of the EBS storage volume for a space.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DefaultEbsStorageSettings withMaximumEbsVolumeSizeInGb(Integer maximumEbsVolumeSizeInGb) {
        setMaximumEbsVolumeSizeInGb(maximumEbsVolumeSizeInGb);
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
        if (getDefaultEbsVolumeSizeInGb() != null)
            sb.append("DefaultEbsVolumeSizeInGb: ").append(getDefaultEbsVolumeSizeInGb()).append(",");
        if (getMaximumEbsVolumeSizeInGb() != null)
            sb.append("MaximumEbsVolumeSizeInGb: ").append(getMaximumEbsVolumeSizeInGb());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DefaultEbsStorageSettings == false)
            return false;
        DefaultEbsStorageSettings other = (DefaultEbsStorageSettings) obj;
        if (other.getDefaultEbsVolumeSizeInGb() == null ^ this.getDefaultEbsVolumeSizeInGb() == null)
            return false;
        if (other.getDefaultEbsVolumeSizeInGb() != null && other.getDefaultEbsVolumeSizeInGb().equals(this.getDefaultEbsVolumeSizeInGb()) == false)
            return false;
        if (other.getMaximumEbsVolumeSizeInGb() == null ^ this.getMaximumEbsVolumeSizeInGb() == null)
            return false;
        if (other.getMaximumEbsVolumeSizeInGb() != null && other.getMaximumEbsVolumeSizeInGb().equals(this.getMaximumEbsVolumeSizeInGb()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDefaultEbsVolumeSizeInGb() == null) ? 0 : getDefaultEbsVolumeSizeInGb().hashCode());
        hashCode = prime * hashCode + ((getMaximumEbsVolumeSizeInGb() == null) ? 0 : getMaximumEbsVolumeSizeInGb().hashCode());
        return hashCode;
    }

    @Override
    public DefaultEbsStorageSettings clone() {
        try {
            return (DefaultEbsStorageSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.DefaultEbsStorageSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
