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
 * The properties that are applied when the custom connector is being used as a source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/CustomConnectorSourceProperties"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomConnectorSourceProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The entity specified in the custom connector as a source in the flow.
     * </p>
     */
    private String entityName;
    /**
     * <p>
     * Custom properties that are required to use the custom connector as a source.
     * </p>
     */
    private java.util.Map<String, String> customProperties;

    /**
     * <p>
     * The entity specified in the custom connector as a source in the flow.
     * </p>
     * 
     * @param entityName
     *        The entity specified in the custom connector as a source in the flow.
     */

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    /**
     * <p>
     * The entity specified in the custom connector as a source in the flow.
     * </p>
     * 
     * @return The entity specified in the custom connector as a source in the flow.
     */

    public String getEntityName() {
        return this.entityName;
    }

    /**
     * <p>
     * The entity specified in the custom connector as a source in the flow.
     * </p>
     * 
     * @param entityName
     *        The entity specified in the custom connector as a source in the flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomConnectorSourceProperties withEntityName(String entityName) {
        setEntityName(entityName);
        return this;
    }

    /**
     * <p>
     * Custom properties that are required to use the custom connector as a source.
     * </p>
     * 
     * @return Custom properties that are required to use the custom connector as a source.
     */

    public java.util.Map<String, String> getCustomProperties() {
        return customProperties;
    }

    /**
     * <p>
     * Custom properties that are required to use the custom connector as a source.
     * </p>
     * 
     * @param customProperties
     *        Custom properties that are required to use the custom connector as a source.
     */

    public void setCustomProperties(java.util.Map<String, String> customProperties) {
        this.customProperties = customProperties;
    }

    /**
     * <p>
     * Custom properties that are required to use the custom connector as a source.
     * </p>
     * 
     * @param customProperties
     *        Custom properties that are required to use the custom connector as a source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomConnectorSourceProperties withCustomProperties(java.util.Map<String, String> customProperties) {
        setCustomProperties(customProperties);
        return this;
    }

    /**
     * Add a single CustomProperties entry
     *
     * @see CustomConnectorSourceProperties#withCustomProperties
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CustomConnectorSourceProperties addCustomPropertiesEntry(String key, String value) {
        if (null == this.customProperties) {
            this.customProperties = new java.util.HashMap<String, String>();
        }
        if (this.customProperties.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.customProperties.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into CustomProperties.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomConnectorSourceProperties clearCustomPropertiesEntries() {
        this.customProperties = null;
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
        if (getEntityName() != null)
            sb.append("EntityName: ").append(getEntityName()).append(",");
        if (getCustomProperties() != null)
            sb.append("CustomProperties: ").append(getCustomProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomConnectorSourceProperties == false)
            return false;
        CustomConnectorSourceProperties other = (CustomConnectorSourceProperties) obj;
        if (other.getEntityName() == null ^ this.getEntityName() == null)
            return false;
        if (other.getEntityName() != null && other.getEntityName().equals(this.getEntityName()) == false)
            return false;
        if (other.getCustomProperties() == null ^ this.getCustomProperties() == null)
            return false;
        if (other.getCustomProperties() != null && other.getCustomProperties().equals(this.getCustomProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEntityName() == null) ? 0 : getEntityName().hashCode());
        hashCode = prime * hashCode + ((getCustomProperties() == null) ? 0 : getCustomProperties().hashCode());
        return hashCode;
    }

    @Override
    public CustomConnectorSourceProperties clone() {
        try {
            return (CustomConnectorSourceProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appflow.model.transform.CustomConnectorSourcePropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
