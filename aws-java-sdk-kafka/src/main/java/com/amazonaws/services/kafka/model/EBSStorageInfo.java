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
package com.amazonaws.services.kafka.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the EBS storage volumes attached to Kafka broker nodes.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/EBSStorageInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EBSStorageInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The size in GiB of the EBS volume for the data drive on each broker node.
     * </p>
     */
    private Integer volumeSize;

    /**
     * <p>
     * The size in GiB of the EBS volume for the data drive on each broker node.
     * </p>
     * 
     * @param volumeSize
     *        The size in GiB of the EBS volume for the data drive on each broker node.
     */

    public void setVolumeSize(Integer volumeSize) {
        this.volumeSize = volumeSize;
    }

    /**
     * <p>
     * The size in GiB of the EBS volume for the data drive on each broker node.
     * </p>
     * 
     * @return The size in GiB of the EBS volume for the data drive on each broker node.
     */

    public Integer getVolumeSize() {
        return this.volumeSize;
    }

    /**
     * <p>
     * The size in GiB of the EBS volume for the data drive on each broker node.
     * </p>
     * 
     * @param volumeSize
     *        The size in GiB of the EBS volume for the data drive on each broker node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EBSStorageInfo withVolumeSize(Integer volumeSize) {
        setVolumeSize(volumeSize);
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
        if (getVolumeSize() != null)
            sb.append("VolumeSize: ").append(getVolumeSize());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EBSStorageInfo == false)
            return false;
        EBSStorageInfo other = (EBSStorageInfo) obj;
        if (other.getVolumeSize() == null ^ this.getVolumeSize() == null)
            return false;
        if (other.getVolumeSize() != null && other.getVolumeSize().equals(this.getVolumeSize()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVolumeSize() == null) ? 0 : getVolumeSize().hashCode());
        return hashCode;
    }

    @Override
    public EBSStorageInfo clone() {
        try {
            return (EBSStorageInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kafka.model.transform.EBSStorageInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
