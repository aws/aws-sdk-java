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
 * Contains information about storage volumes attached to MSK broker nodes.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/StorageInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StorageInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * EBS volume information.
     * </p>
     */
    private EBSStorageInfo ebsStorageInfo;

    /**
     * <p>
     * EBS volume information.
     * </p>
     * 
     * @param ebsStorageInfo
     *        EBS volume information.
     */

    public void setEbsStorageInfo(EBSStorageInfo ebsStorageInfo) {
        this.ebsStorageInfo = ebsStorageInfo;
    }

    /**
     * <p>
     * EBS volume information.
     * </p>
     * 
     * @return EBS volume information.
     */

    public EBSStorageInfo getEbsStorageInfo() {
        return this.ebsStorageInfo;
    }

    /**
     * <p>
     * EBS volume information.
     * </p>
     * 
     * @param ebsStorageInfo
     *        EBS volume information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageInfo withEbsStorageInfo(EBSStorageInfo ebsStorageInfo) {
        setEbsStorageInfo(ebsStorageInfo);
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
        if (getEbsStorageInfo() != null)
            sb.append("EbsStorageInfo: ").append(getEbsStorageInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StorageInfo == false)
            return false;
        StorageInfo other = (StorageInfo) obj;
        if (other.getEbsStorageInfo() == null ^ this.getEbsStorageInfo() == null)
            return false;
        if (other.getEbsStorageInfo() != null && other.getEbsStorageInfo().equals(this.getEbsStorageInfo()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEbsStorageInfo() == null) ? 0 : getEbsStorageInfo().hashCode());
        return hashCode;
    }

    @Override
    public StorageInfo clone() {
        try {
            return (StorageInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kafka.model.transform.StorageInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
