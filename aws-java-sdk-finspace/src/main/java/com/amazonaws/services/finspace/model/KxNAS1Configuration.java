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
package com.amazonaws.services.finspace.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The structure containing the size and type of the network attached storage (NAS_1) file system volume.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/KxNAS1Configuration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KxNAS1Configuration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of the network attached storage.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The size of the network attached storage. For storage type <code>SSD_1000</code> and <code>SSD_250</code> you can
     * select the minimum size as 1200 GB or increments of 2400 GB. For storage type <code>HDD_12</code> you can select
     * the minimum size as 6000 GB or increments of 6000 GB.
     * </p>
     */
    private Integer size;

    /**
     * <p>
     * The type of the network attached storage.
     * </p>
     * 
     * @param type
     *        The type of the network attached storage.
     * @see KxNAS1Type
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the network attached storage.
     * </p>
     * 
     * @return The type of the network attached storage.
     * @see KxNAS1Type
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the network attached storage.
     * </p>
     * 
     * @param type
     *        The type of the network attached storage.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KxNAS1Type
     */

    public KxNAS1Configuration withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the network attached storage.
     * </p>
     * 
     * @param type
     *        The type of the network attached storage.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KxNAS1Type
     */

    public KxNAS1Configuration withType(KxNAS1Type type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The size of the network attached storage. For storage type <code>SSD_1000</code> and <code>SSD_250</code> you can
     * select the minimum size as 1200 GB or increments of 2400 GB. For storage type <code>HDD_12</code> you can select
     * the minimum size as 6000 GB or increments of 6000 GB.
     * </p>
     * 
     * @param size
     *        The size of the network attached storage. For storage type <code>SSD_1000</code> and <code>SSD_250</code>
     *        you can select the minimum size as 1200 GB or increments of 2400 GB. For storage type <code>HDD_12</code>
     *        you can select the minimum size as 6000 GB or increments of 6000 GB.
     */

    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * <p>
     * The size of the network attached storage. For storage type <code>SSD_1000</code> and <code>SSD_250</code> you can
     * select the minimum size as 1200 GB or increments of 2400 GB. For storage type <code>HDD_12</code> you can select
     * the minimum size as 6000 GB or increments of 6000 GB.
     * </p>
     * 
     * @return The size of the network attached storage. For storage type <code>SSD_1000</code> and <code>SSD_250</code>
     *         you can select the minimum size as 1200 GB or increments of 2400 GB. For storage type <code>HDD_12</code>
     *         you can select the minimum size as 6000 GB or increments of 6000 GB.
     */

    public Integer getSize() {
        return this.size;
    }

    /**
     * <p>
     * The size of the network attached storage. For storage type <code>SSD_1000</code> and <code>SSD_250</code> you can
     * select the minimum size as 1200 GB or increments of 2400 GB. For storage type <code>HDD_12</code> you can select
     * the minimum size as 6000 GB or increments of 6000 GB.
     * </p>
     * 
     * @param size
     *        The size of the network attached storage. For storage type <code>SSD_1000</code> and <code>SSD_250</code>
     *        you can select the minimum size as 1200 GB or increments of 2400 GB. For storage type <code>HDD_12</code>
     *        you can select the minimum size as 6000 GB or increments of 6000 GB.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxNAS1Configuration withSize(Integer size) {
        setSize(size);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getSize() != null)
            sb.append("Size: ").append(getSize());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KxNAS1Configuration == false)
            return false;
        KxNAS1Configuration other = (KxNAS1Configuration) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getSize() == null ^ this.getSize() == null)
            return false;
        if (other.getSize() != null && other.getSize().equals(this.getSize()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getSize() == null) ? 0 : getSize().hashCode());
        return hashCode;
    }

    @Override
    public KxNAS1Configuration clone() {
        try {
            return (KxNAS1Configuration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.finspace.model.transform.KxNAS1ConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
