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
package com.amazonaws.services.apigateway.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A configuration property of an SDK type.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SdkConfigurationProperty implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of a an <a>SdkType</a> configuration property.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The user-friendly name of an <a>SdkType</a> configuration property.
     * </p>
     */
    private String friendlyName;
    /**
     * <p>
     * The description of an <a>SdkType</a> configuration property.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A boolean flag of an <a>SdkType</a> configuration property to indicate if the associated SDK configuration
     * property is required (<code>true</code>) or not (<code>false</code>).
     * </p>
     */
    private Boolean required;
    /**
     * <p>
     * The default value of an <a>SdkType</a> configuration property.
     * </p>
     */
    private String defaultValue;

    /**
     * <p>
     * The name of a an <a>SdkType</a> configuration property.
     * </p>
     * 
     * @param name
     *        The name of a an <a>SdkType</a> configuration property.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of a an <a>SdkType</a> configuration property.
     * </p>
     * 
     * @return The name of a an <a>SdkType</a> configuration property.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of a an <a>SdkType</a> configuration property.
     * </p>
     * 
     * @param name
     *        The name of a an <a>SdkType</a> configuration property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SdkConfigurationProperty withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The user-friendly name of an <a>SdkType</a> configuration property.
     * </p>
     * 
     * @param friendlyName
     *        The user-friendly name of an <a>SdkType</a> configuration property.
     */

    public void setFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
    }

    /**
     * <p>
     * The user-friendly name of an <a>SdkType</a> configuration property.
     * </p>
     * 
     * @return The user-friendly name of an <a>SdkType</a> configuration property.
     */

    public String getFriendlyName() {
        return this.friendlyName;
    }

    /**
     * <p>
     * The user-friendly name of an <a>SdkType</a> configuration property.
     * </p>
     * 
     * @param friendlyName
     *        The user-friendly name of an <a>SdkType</a> configuration property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SdkConfigurationProperty withFriendlyName(String friendlyName) {
        setFriendlyName(friendlyName);
        return this;
    }

    /**
     * <p>
     * The description of an <a>SdkType</a> configuration property.
     * </p>
     * 
     * @param description
     *        The description of an <a>SdkType</a> configuration property.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of an <a>SdkType</a> configuration property.
     * </p>
     * 
     * @return The description of an <a>SdkType</a> configuration property.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of an <a>SdkType</a> configuration property.
     * </p>
     * 
     * @param description
     *        The description of an <a>SdkType</a> configuration property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SdkConfigurationProperty withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A boolean flag of an <a>SdkType</a> configuration property to indicate if the associated SDK configuration
     * property is required (<code>true</code>) or not (<code>false</code>).
     * </p>
     * 
     * @param required
     *        A boolean flag of an <a>SdkType</a> configuration property to indicate if the associated SDK configuration
     *        property is required (<code>true</code>) or not (<code>false</code>).
     */

    public void setRequired(Boolean required) {
        this.required = required;
    }

    /**
     * <p>
     * A boolean flag of an <a>SdkType</a> configuration property to indicate if the associated SDK configuration
     * property is required (<code>true</code>) or not (<code>false</code>).
     * </p>
     * 
     * @return A boolean flag of an <a>SdkType</a> configuration property to indicate if the associated SDK
     *         configuration property is required (<code>true</code>) or not (<code>false</code>).
     */

    public Boolean getRequired() {
        return this.required;
    }

    /**
     * <p>
     * A boolean flag of an <a>SdkType</a> configuration property to indicate if the associated SDK configuration
     * property is required (<code>true</code>) or not (<code>false</code>).
     * </p>
     * 
     * @param required
     *        A boolean flag of an <a>SdkType</a> configuration property to indicate if the associated SDK configuration
     *        property is required (<code>true</code>) or not (<code>false</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SdkConfigurationProperty withRequired(Boolean required) {
        setRequired(required);
        return this;
    }

    /**
     * <p>
     * A boolean flag of an <a>SdkType</a> configuration property to indicate if the associated SDK configuration
     * property is required (<code>true</code>) or not (<code>false</code>).
     * </p>
     * 
     * @return A boolean flag of an <a>SdkType</a> configuration property to indicate if the associated SDK
     *         configuration property is required (<code>true</code>) or not (<code>false</code>).
     */

    public Boolean isRequired() {
        return this.required;
    }

    /**
     * <p>
     * The default value of an <a>SdkType</a> configuration property.
     * </p>
     * 
     * @param defaultValue
     *        The default value of an <a>SdkType</a> configuration property.
     */

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    /**
     * <p>
     * The default value of an <a>SdkType</a> configuration property.
     * </p>
     * 
     * @return The default value of an <a>SdkType</a> configuration property.
     */

    public String getDefaultValue() {
        return this.defaultValue;
    }

    /**
     * <p>
     * The default value of an <a>SdkType</a> configuration property.
     * </p>
     * 
     * @param defaultValue
     *        The default value of an <a>SdkType</a> configuration property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SdkConfigurationProperty withDefaultValue(String defaultValue) {
        setDefaultValue(defaultValue);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getFriendlyName() != null)
            sb.append("FriendlyName: ").append(getFriendlyName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getRequired() != null)
            sb.append("Required: ").append(getRequired()).append(",");
        if (getDefaultValue() != null)
            sb.append("DefaultValue: ").append(getDefaultValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SdkConfigurationProperty == false)
            return false;
        SdkConfigurationProperty other = (SdkConfigurationProperty) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getFriendlyName() == null ^ this.getFriendlyName() == null)
            return false;
        if (other.getFriendlyName() != null && other.getFriendlyName().equals(this.getFriendlyName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getRequired() == null ^ this.getRequired() == null)
            return false;
        if (other.getRequired() != null && other.getRequired().equals(this.getRequired()) == false)
            return false;
        if (other.getDefaultValue() == null ^ this.getDefaultValue() == null)
            return false;
        if (other.getDefaultValue() != null && other.getDefaultValue().equals(this.getDefaultValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getFriendlyName() == null) ? 0 : getFriendlyName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getRequired() == null) ? 0 : getRequired().hashCode());
        hashCode = prime * hashCode + ((getDefaultValue() == null) ? 0 : getDefaultValue().hashCode());
        return hashCode;
    }

    @Override
    public SdkConfigurationProperty clone() {
        try {
            return (SdkConfigurationProperty) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apigateway.model.transform.SdkConfigurationPropertyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
