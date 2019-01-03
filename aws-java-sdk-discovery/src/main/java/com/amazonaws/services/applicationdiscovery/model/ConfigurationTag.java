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
package com.amazonaws.services.applicationdiscovery.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Tags for a configuration item. Tags are metadata that help you categorize IT assets.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfigurationTag implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A type of IT asset to tag.
     * </p>
     */
    private String configurationType;
    /**
     * <p>
     * The configuration ID for the item to tag. You can specify a list of keys and values.
     * </p>
     */
    private String configurationId;
    /**
     * <p>
     * A type of tag on which to filter. For example, <i>serverType</i>.
     * </p>
     */
    private String key;
    /**
     * <p>
     * A value on which to filter. For example <i>key = serverType</i> and <i>value = web server</i>.
     * </p>
     */
    private String value;
    /**
     * <p>
     * The time the configuration tag was created in Coordinated Universal Time (UTC).
     * </p>
     */
    private java.util.Date timeOfCreation;

    /**
     * <p>
     * A type of IT asset to tag.
     * </p>
     * 
     * @param configurationType
     *        A type of IT asset to tag.
     * @see ConfigurationItemType
     */

    public void setConfigurationType(String configurationType) {
        this.configurationType = configurationType;
    }

    /**
     * <p>
     * A type of IT asset to tag.
     * </p>
     * 
     * @return A type of IT asset to tag.
     * @see ConfigurationItemType
     */

    public String getConfigurationType() {
        return this.configurationType;
    }

    /**
     * <p>
     * A type of IT asset to tag.
     * </p>
     * 
     * @param configurationType
     *        A type of IT asset to tag.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfigurationItemType
     */

    public ConfigurationTag withConfigurationType(String configurationType) {
        setConfigurationType(configurationType);
        return this;
    }

    /**
     * <p>
     * A type of IT asset to tag.
     * </p>
     * 
     * @param configurationType
     *        A type of IT asset to tag.
     * @see ConfigurationItemType
     */

    public void setConfigurationType(ConfigurationItemType configurationType) {
        withConfigurationType(configurationType);
    }

    /**
     * <p>
     * A type of IT asset to tag.
     * </p>
     * 
     * @param configurationType
     *        A type of IT asset to tag.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfigurationItemType
     */

    public ConfigurationTag withConfigurationType(ConfigurationItemType configurationType) {
        this.configurationType = configurationType.toString();
        return this;
    }

    /**
     * <p>
     * The configuration ID for the item to tag. You can specify a list of keys and values.
     * </p>
     * 
     * @param configurationId
     *        The configuration ID for the item to tag. You can specify a list of keys and values.
     */

    public void setConfigurationId(String configurationId) {
        this.configurationId = configurationId;
    }

    /**
     * <p>
     * The configuration ID for the item to tag. You can specify a list of keys and values.
     * </p>
     * 
     * @return The configuration ID for the item to tag. You can specify a list of keys and values.
     */

    public String getConfigurationId() {
        return this.configurationId;
    }

    /**
     * <p>
     * The configuration ID for the item to tag. You can specify a list of keys and values.
     * </p>
     * 
     * @param configurationId
     *        The configuration ID for the item to tag. You can specify a list of keys and values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationTag withConfigurationId(String configurationId) {
        setConfigurationId(configurationId);
        return this;
    }

    /**
     * <p>
     * A type of tag on which to filter. For example, <i>serverType</i>.
     * </p>
     * 
     * @param key
     *        A type of tag on which to filter. For example, <i>serverType</i>.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * A type of tag on which to filter. For example, <i>serverType</i>.
     * </p>
     * 
     * @return A type of tag on which to filter. For example, <i>serverType</i>.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * A type of tag on which to filter. For example, <i>serverType</i>.
     * </p>
     * 
     * @param key
     *        A type of tag on which to filter. For example, <i>serverType</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationTag withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * A value on which to filter. For example <i>key = serverType</i> and <i>value = web server</i>.
     * </p>
     * 
     * @param value
     *        A value on which to filter. For example <i>key = serverType</i> and <i>value = web server</i>.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * A value on which to filter. For example <i>key = serverType</i> and <i>value = web server</i>.
     * </p>
     * 
     * @return A value on which to filter. For example <i>key = serverType</i> and <i>value = web server</i>.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * A value on which to filter. For example <i>key = serverType</i> and <i>value = web server</i>.
     * </p>
     * 
     * @param value
     *        A value on which to filter. For example <i>key = serverType</i> and <i>value = web server</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationTag withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * The time the configuration tag was created in Coordinated Universal Time (UTC).
     * </p>
     * 
     * @param timeOfCreation
     *        The time the configuration tag was created in Coordinated Universal Time (UTC).
     */

    public void setTimeOfCreation(java.util.Date timeOfCreation) {
        this.timeOfCreation = timeOfCreation;
    }

    /**
     * <p>
     * The time the configuration tag was created in Coordinated Universal Time (UTC).
     * </p>
     * 
     * @return The time the configuration tag was created in Coordinated Universal Time (UTC).
     */

    public java.util.Date getTimeOfCreation() {
        return this.timeOfCreation;
    }

    /**
     * <p>
     * The time the configuration tag was created in Coordinated Universal Time (UTC).
     * </p>
     * 
     * @param timeOfCreation
     *        The time the configuration tag was created in Coordinated Universal Time (UTC).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationTag withTimeOfCreation(java.util.Date timeOfCreation) {
        setTimeOfCreation(timeOfCreation);
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
        if (getConfigurationType() != null)
            sb.append("ConfigurationType: ").append(getConfigurationType()).append(",");
        if (getConfigurationId() != null)
            sb.append("ConfigurationId: ").append(getConfigurationId()).append(",");
        if (getKey() != null)
            sb.append("Key: ").append(getKey()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getTimeOfCreation() != null)
            sb.append("TimeOfCreation: ").append(getTimeOfCreation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConfigurationTag == false)
            return false;
        ConfigurationTag other = (ConfigurationTag) obj;
        if (other.getConfigurationType() == null ^ this.getConfigurationType() == null)
            return false;
        if (other.getConfigurationType() != null && other.getConfigurationType().equals(this.getConfigurationType()) == false)
            return false;
        if (other.getConfigurationId() == null ^ this.getConfigurationId() == null)
            return false;
        if (other.getConfigurationId() != null && other.getConfigurationId().equals(this.getConfigurationId()) == false)
            return false;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getTimeOfCreation() == null ^ this.getTimeOfCreation() == null)
            return false;
        if (other.getTimeOfCreation() != null && other.getTimeOfCreation().equals(this.getTimeOfCreation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigurationType() == null) ? 0 : getConfigurationType().hashCode());
        hashCode = prime * hashCode + ((getConfigurationId() == null) ? 0 : getConfigurationId().hashCode());
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getTimeOfCreation() == null) ? 0 : getTimeOfCreation().hashCode());
        return hashCode;
    }

    @Override
    public ConfigurationTag clone() {
        try {
            return (ConfigurationTag) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.applicationdiscovery.model.transform.ConfigurationTagMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
