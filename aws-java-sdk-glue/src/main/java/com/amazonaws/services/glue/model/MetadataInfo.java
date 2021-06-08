/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure containing metadata information for a schema version.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/MetadataInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetadataInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The metadata key’s corresponding value.
     * </p>
     */
    private String metadataValue;
    /**
     * <p>
     * The time at which the entry was created.
     * </p>
     */
    private String createdTime;
    /**
     * <p>
     * Other metadata belonging to the same metadata key.
     * </p>
     */
    private java.util.List<OtherMetadataValueListItem> otherMetadataValueList;

    /**
     * <p>
     * The metadata key’s corresponding value.
     * </p>
     * 
     * @param metadataValue
     *        The metadata key’s corresponding value.
     */

    public void setMetadataValue(String metadataValue) {
        this.metadataValue = metadataValue;
    }

    /**
     * <p>
     * The metadata key’s corresponding value.
     * </p>
     * 
     * @return The metadata key’s corresponding value.
     */

    public String getMetadataValue() {
        return this.metadataValue;
    }

    /**
     * <p>
     * The metadata key’s corresponding value.
     * </p>
     * 
     * @param metadataValue
     *        The metadata key’s corresponding value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetadataInfo withMetadataValue(String metadataValue) {
        setMetadataValue(metadataValue);
        return this;
    }

    /**
     * <p>
     * The time at which the entry was created.
     * </p>
     * 
     * @param createdTime
     *        The time at which the entry was created.
     */

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The time at which the entry was created.
     * </p>
     * 
     * @return The time at which the entry was created.
     */

    public String getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The time at which the entry was created.
     * </p>
     * 
     * @param createdTime
     *        The time at which the entry was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetadataInfo withCreatedTime(String createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * Other metadata belonging to the same metadata key.
     * </p>
     * 
     * @return Other metadata belonging to the same metadata key.
     */

    public java.util.List<OtherMetadataValueListItem> getOtherMetadataValueList() {
        return otherMetadataValueList;
    }

    /**
     * <p>
     * Other metadata belonging to the same metadata key.
     * </p>
     * 
     * @param otherMetadataValueList
     *        Other metadata belonging to the same metadata key.
     */

    public void setOtherMetadataValueList(java.util.Collection<OtherMetadataValueListItem> otherMetadataValueList) {
        if (otherMetadataValueList == null) {
            this.otherMetadataValueList = null;
            return;
        }

        this.otherMetadataValueList = new java.util.ArrayList<OtherMetadataValueListItem>(otherMetadataValueList);
    }

    /**
     * <p>
     * Other metadata belonging to the same metadata key.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOtherMetadataValueList(java.util.Collection)} or
     * {@link #withOtherMetadataValueList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param otherMetadataValueList
     *        Other metadata belonging to the same metadata key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetadataInfo withOtherMetadataValueList(OtherMetadataValueListItem... otherMetadataValueList) {
        if (this.otherMetadataValueList == null) {
            setOtherMetadataValueList(new java.util.ArrayList<OtherMetadataValueListItem>(otherMetadataValueList.length));
        }
        for (OtherMetadataValueListItem ele : otherMetadataValueList) {
            this.otherMetadataValueList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Other metadata belonging to the same metadata key.
     * </p>
     * 
     * @param otherMetadataValueList
     *        Other metadata belonging to the same metadata key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetadataInfo withOtherMetadataValueList(java.util.Collection<OtherMetadataValueListItem> otherMetadataValueList) {
        setOtherMetadataValueList(otherMetadataValueList);
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
        if (getMetadataValue() != null)
            sb.append("MetadataValue: ").append(getMetadataValue()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getOtherMetadataValueList() != null)
            sb.append("OtherMetadataValueList: ").append(getOtherMetadataValueList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetadataInfo == false)
            return false;
        MetadataInfo other = (MetadataInfo) obj;
        if (other.getMetadataValue() == null ^ this.getMetadataValue() == null)
            return false;
        if (other.getMetadataValue() != null && other.getMetadataValue().equals(this.getMetadataValue()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getOtherMetadataValueList() == null ^ this.getOtherMetadataValueList() == null)
            return false;
        if (other.getOtherMetadataValueList() != null && other.getOtherMetadataValueList().equals(this.getOtherMetadataValueList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetadataValue() == null) ? 0 : getMetadataValue().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getOtherMetadataValueList() == null) ? 0 : getOtherMetadataValueList().hashCode());
        return hashCode;
    }

    @Override
    public MetadataInfo clone() {
        try {
            return (MetadataInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.MetadataInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
