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
package com.amazonaws.services.appflow.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The profile properties required by the custom connector.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/CustomConnectorProfileProperties"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomConnectorProfileProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A map of properties that are required to create a profile for the custom connector.
     * </p>
     */
    private java.util.Map<String, String> profileProperties;

    private OAuth2Properties oAuth2Properties;

    /**
     * <p>
     * A map of properties that are required to create a profile for the custom connector.
     * </p>
     * 
     * @return A map of properties that are required to create a profile for the custom connector.
     */

    public java.util.Map<String, String> getProfileProperties() {
        return profileProperties;
    }

    /**
     * <p>
     * A map of properties that are required to create a profile for the custom connector.
     * </p>
     * 
     * @param profileProperties
     *        A map of properties that are required to create a profile for the custom connector.
     */

    public void setProfileProperties(java.util.Map<String, String> profileProperties) {
        this.profileProperties = profileProperties;
    }

    /**
     * <p>
     * A map of properties that are required to create a profile for the custom connector.
     * </p>
     * 
     * @param profileProperties
     *        A map of properties that are required to create a profile for the custom connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomConnectorProfileProperties withProfileProperties(java.util.Map<String, String> profileProperties) {
        setProfileProperties(profileProperties);
        return this;
    }

    /**
     * Add a single ProfileProperties entry
     *
     * @see CustomConnectorProfileProperties#withProfileProperties
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CustomConnectorProfileProperties addProfilePropertiesEntry(String key, String value) {
        if (null == this.profileProperties) {
            this.profileProperties = new java.util.HashMap<String, String>();
        }
        if (this.profileProperties.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.profileProperties.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ProfileProperties.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomConnectorProfileProperties clearProfilePropertiesEntries() {
        this.profileProperties = null;
        return this;
    }

    /**
     * @param oAuth2Properties
     */

    public void setOAuth2Properties(OAuth2Properties oAuth2Properties) {
        this.oAuth2Properties = oAuth2Properties;
    }

    /**
     * @return
     */

    public OAuth2Properties getOAuth2Properties() {
        return this.oAuth2Properties;
    }

    /**
     * @param oAuth2Properties
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomConnectorProfileProperties withOAuth2Properties(OAuth2Properties oAuth2Properties) {
        setOAuth2Properties(oAuth2Properties);
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
        if (getProfileProperties() != null)
            sb.append("ProfileProperties: ").append(getProfileProperties()).append(",");
        if (getOAuth2Properties() != null)
            sb.append("OAuth2Properties: ").append(getOAuth2Properties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomConnectorProfileProperties == false)
            return false;
        CustomConnectorProfileProperties other = (CustomConnectorProfileProperties) obj;
        if (other.getProfileProperties() == null ^ this.getProfileProperties() == null)
            return false;
        if (other.getProfileProperties() != null && other.getProfileProperties().equals(this.getProfileProperties()) == false)
            return false;
        if (other.getOAuth2Properties() == null ^ this.getOAuth2Properties() == null)
            return false;
        if (other.getOAuth2Properties() != null && other.getOAuth2Properties().equals(this.getOAuth2Properties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProfileProperties() == null) ? 0 : getProfileProperties().hashCode());
        hashCode = prime * hashCode + ((getOAuth2Properties() == null) ? 0 : getOAuth2Properties().hashCode());
        return hashCode;
    }

    @Override
    public CustomConnectorProfileProperties clone() {
        try {
            return (CustomConnectorProfileProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appflow.model.transform.CustomConnectorProfilePropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
