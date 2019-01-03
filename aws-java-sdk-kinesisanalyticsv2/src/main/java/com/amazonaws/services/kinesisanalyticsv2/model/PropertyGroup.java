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
package com.amazonaws.services.kinesisanalyticsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Property key-value pairs passed into a Java-based Kinesis Data Analytics application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/PropertyGroup" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PropertyGroup implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Describes the key of an application execution property key-value pair.
     * </p>
     */
    private String propertyGroupId;
    /**
     * <p>
     * Describes the value of an application execution property key-value pair.
     * </p>
     */
    private java.util.Map<String, String> propertyMap;

    /**
     * <p>
     * Describes the key of an application execution property key-value pair.
     * </p>
     * 
     * @param propertyGroupId
     *        Describes the key of an application execution property key-value pair.
     */

    public void setPropertyGroupId(String propertyGroupId) {
        this.propertyGroupId = propertyGroupId;
    }

    /**
     * <p>
     * Describes the key of an application execution property key-value pair.
     * </p>
     * 
     * @return Describes the key of an application execution property key-value pair.
     */

    public String getPropertyGroupId() {
        return this.propertyGroupId;
    }

    /**
     * <p>
     * Describes the key of an application execution property key-value pair.
     * </p>
     * 
     * @param propertyGroupId
     *        Describes the key of an application execution property key-value pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PropertyGroup withPropertyGroupId(String propertyGroupId) {
        setPropertyGroupId(propertyGroupId);
        return this;
    }

    /**
     * <p>
     * Describes the value of an application execution property key-value pair.
     * </p>
     * 
     * @return Describes the value of an application execution property key-value pair.
     */

    public java.util.Map<String, String> getPropertyMap() {
        return propertyMap;
    }

    /**
     * <p>
     * Describes the value of an application execution property key-value pair.
     * </p>
     * 
     * @param propertyMap
     *        Describes the value of an application execution property key-value pair.
     */

    public void setPropertyMap(java.util.Map<String, String> propertyMap) {
        this.propertyMap = propertyMap;
    }

    /**
     * <p>
     * Describes the value of an application execution property key-value pair.
     * </p>
     * 
     * @param propertyMap
     *        Describes the value of an application execution property key-value pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PropertyGroup withPropertyMap(java.util.Map<String, String> propertyMap) {
        setPropertyMap(propertyMap);
        return this;
    }

    public PropertyGroup addPropertyMapEntry(String key, String value) {
        if (null == this.propertyMap) {
            this.propertyMap = new java.util.HashMap<String, String>();
        }
        if (this.propertyMap.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.propertyMap.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into PropertyMap.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PropertyGroup clearPropertyMapEntries() {
        this.propertyMap = null;
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
        if (getPropertyGroupId() != null)
            sb.append("PropertyGroupId: ").append(getPropertyGroupId()).append(",");
        if (getPropertyMap() != null)
            sb.append("PropertyMap: ").append(getPropertyMap());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PropertyGroup == false)
            return false;
        PropertyGroup other = (PropertyGroup) obj;
        if (other.getPropertyGroupId() == null ^ this.getPropertyGroupId() == null)
            return false;
        if (other.getPropertyGroupId() != null && other.getPropertyGroupId().equals(this.getPropertyGroupId()) == false)
            return false;
        if (other.getPropertyMap() == null ^ this.getPropertyMap() == null)
            return false;
        if (other.getPropertyMap() != null && other.getPropertyMap().equals(this.getPropertyMap()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPropertyGroupId() == null) ? 0 : getPropertyGroupId().hashCode());
        hashCode = prime * hashCode + ((getPropertyMap() == null) ? 0 : getPropertyMap().hashCode());
        return hashCode;
    }

    @Override
    public PropertyGroup clone() {
        try {
            return (PropertyGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalyticsv2.model.transform.PropertyGroupMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
