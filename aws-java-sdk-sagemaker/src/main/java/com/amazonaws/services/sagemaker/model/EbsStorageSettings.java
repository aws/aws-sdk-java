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
 * A collection of EBS storage settings that apply to both private and shared spaces.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/EbsStorageSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EbsStorageSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The size of an EBS storage volume for a space.
     * </p>
     */
    private Integer ebsVolumeSizeInGb;

    /**
     * <p>
     * The size of an EBS storage volume for a space.
     * </p>
     * 
     * @param ebsVolumeSizeInGb
     *        The size of an EBS storage volume for a space.
     */

    public void setEbsVolumeSizeInGb(Integer ebsVolumeSizeInGb) {
        this.ebsVolumeSizeInGb = ebsVolumeSizeInGb;
    }

    /**
     * <p>
     * The size of an EBS storage volume for a space.
     * </p>
     * 
     * @return The size of an EBS storage volume for a space.
     */

    public Integer getEbsVolumeSizeInGb() {
        return this.ebsVolumeSizeInGb;
    }

    /**
     * <p>
     * The size of an EBS storage volume for a space.
     * </p>
     * 
     * @param ebsVolumeSizeInGb
     *        The size of an EBS storage volume for a space.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EbsStorageSettings withEbsVolumeSizeInGb(Integer ebsVolumeSizeInGb) {
        setEbsVolumeSizeInGb(ebsVolumeSizeInGb);
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
        if (getEbsVolumeSizeInGb() != null)
            sb.append("EbsVolumeSizeInGb: ").append(getEbsVolumeSizeInGb());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EbsStorageSettings == false)
            return false;
        EbsStorageSettings other = (EbsStorageSettings) obj;
        if (other.getEbsVolumeSizeInGb() == null ^ this.getEbsVolumeSizeInGb() == null)
            return false;
        if (other.getEbsVolumeSizeInGb() != null && other.getEbsVolumeSizeInGb().equals(this.getEbsVolumeSizeInGb()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEbsVolumeSizeInGb() == null) ? 0 : getEbsVolumeSizeInGb().hashCode());
        return hashCode;
    }

    @Override
    public EbsStorageSettings clone() {
        try {
            return (EbsStorageSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.EbsStorageSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
