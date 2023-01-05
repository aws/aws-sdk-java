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
 * The properties that are applied when the custom connector is being used as a destination.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/CustomConnectorDestinationProperties"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomConnectorDestinationProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The entity specified in the custom connector as a destination in the flow.
     * </p>
     */
    private String entityName;
    /**
     * <p>
     * The settings that determine how Amazon AppFlow handles an error when placing data in the custom connector as
     * destination.
     * </p>
     */
    private ErrorHandlingConfig errorHandlingConfig;
    /**
     * <p>
     * Specifies the type of write operation to be performed in the custom connector when it's used as destination.
     * </p>
     */
    private String writeOperationType;
    /**
     * <p>
     * The name of the field that Amazon AppFlow uses as an ID when performing a write operation such as update, delete,
     * or upsert.
     * </p>
     */
    private java.util.List<String> idFieldNames;
    /**
     * <p>
     * The custom properties that are specific to the connector when it's used as a destination in the flow.
     * </p>
     */
    private java.util.Map<String, String> customProperties;

    /**
     * <p>
     * The entity specified in the custom connector as a destination in the flow.
     * </p>
     * 
     * @param entityName
     *        The entity specified in the custom connector as a destination in the flow.
     */

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    /**
     * <p>
     * The entity specified in the custom connector as a destination in the flow.
     * </p>
     * 
     * @return The entity specified in the custom connector as a destination in the flow.
     */

    public String getEntityName() {
        return this.entityName;
    }

    /**
     * <p>
     * The entity specified in the custom connector as a destination in the flow.
     * </p>
     * 
     * @param entityName
     *        The entity specified in the custom connector as a destination in the flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomConnectorDestinationProperties withEntityName(String entityName) {
        setEntityName(entityName);
        return this;
    }

    /**
     * <p>
     * The settings that determine how Amazon AppFlow handles an error when placing data in the custom connector as
     * destination.
     * </p>
     * 
     * @param errorHandlingConfig
     *        The settings that determine how Amazon AppFlow handles an error when placing data in the custom connector
     *        as destination.
     */

    public void setErrorHandlingConfig(ErrorHandlingConfig errorHandlingConfig) {
        this.errorHandlingConfig = errorHandlingConfig;
    }

    /**
     * <p>
     * The settings that determine how Amazon AppFlow handles an error when placing data in the custom connector as
     * destination.
     * </p>
     * 
     * @return The settings that determine how Amazon AppFlow handles an error when placing data in the custom connector
     *         as destination.
     */

    public ErrorHandlingConfig getErrorHandlingConfig() {
        return this.errorHandlingConfig;
    }

    /**
     * <p>
     * The settings that determine how Amazon AppFlow handles an error when placing data in the custom connector as
     * destination.
     * </p>
     * 
     * @param errorHandlingConfig
     *        The settings that determine how Amazon AppFlow handles an error when placing data in the custom connector
     *        as destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomConnectorDestinationProperties withErrorHandlingConfig(ErrorHandlingConfig errorHandlingConfig) {
        setErrorHandlingConfig(errorHandlingConfig);
        return this;
    }

    /**
     * <p>
     * Specifies the type of write operation to be performed in the custom connector when it's used as destination.
     * </p>
     * 
     * @param writeOperationType
     *        Specifies the type of write operation to be performed in the custom connector when it's used as
     *        destination.
     * @see WriteOperationType
     */

    public void setWriteOperationType(String writeOperationType) {
        this.writeOperationType = writeOperationType;
    }

    /**
     * <p>
     * Specifies the type of write operation to be performed in the custom connector when it's used as destination.
     * </p>
     * 
     * @return Specifies the type of write operation to be performed in the custom connector when it's used as
     *         destination.
     * @see WriteOperationType
     */

    public String getWriteOperationType() {
        return this.writeOperationType;
    }

    /**
     * <p>
     * Specifies the type of write operation to be performed in the custom connector when it's used as destination.
     * </p>
     * 
     * @param writeOperationType
     *        Specifies the type of write operation to be performed in the custom connector when it's used as
     *        destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WriteOperationType
     */

    public CustomConnectorDestinationProperties withWriteOperationType(String writeOperationType) {
        setWriteOperationType(writeOperationType);
        return this;
    }

    /**
     * <p>
     * Specifies the type of write operation to be performed in the custom connector when it's used as destination.
     * </p>
     * 
     * @param writeOperationType
     *        Specifies the type of write operation to be performed in the custom connector when it's used as
     *        destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WriteOperationType
     */

    public CustomConnectorDestinationProperties withWriteOperationType(WriteOperationType writeOperationType) {
        this.writeOperationType = writeOperationType.toString();
        return this;
    }

    /**
     * <p>
     * The name of the field that Amazon AppFlow uses as an ID when performing a write operation such as update, delete,
     * or upsert.
     * </p>
     * 
     * @return The name of the field that Amazon AppFlow uses as an ID when performing a write operation such as update,
     *         delete, or upsert.
     */

    public java.util.List<String> getIdFieldNames() {
        return idFieldNames;
    }

    /**
     * <p>
     * The name of the field that Amazon AppFlow uses as an ID when performing a write operation such as update, delete,
     * or upsert.
     * </p>
     * 
     * @param idFieldNames
     *        The name of the field that Amazon AppFlow uses as an ID when performing a write operation such as update,
     *        delete, or upsert.
     */

    public void setIdFieldNames(java.util.Collection<String> idFieldNames) {
        if (idFieldNames == null) {
            this.idFieldNames = null;
            return;
        }

        this.idFieldNames = new java.util.ArrayList<String>(idFieldNames);
    }

    /**
     * <p>
     * The name of the field that Amazon AppFlow uses as an ID when performing a write operation such as update, delete,
     * or upsert.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIdFieldNames(java.util.Collection)} or {@link #withIdFieldNames(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param idFieldNames
     *        The name of the field that Amazon AppFlow uses as an ID when performing a write operation such as update,
     *        delete, or upsert.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomConnectorDestinationProperties withIdFieldNames(String... idFieldNames) {
        if (this.idFieldNames == null) {
            setIdFieldNames(new java.util.ArrayList<String>(idFieldNames.length));
        }
        for (String ele : idFieldNames) {
            this.idFieldNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The name of the field that Amazon AppFlow uses as an ID when performing a write operation such as update, delete,
     * or upsert.
     * </p>
     * 
     * @param idFieldNames
     *        The name of the field that Amazon AppFlow uses as an ID when performing a write operation such as update,
     *        delete, or upsert.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomConnectorDestinationProperties withIdFieldNames(java.util.Collection<String> idFieldNames) {
        setIdFieldNames(idFieldNames);
        return this;
    }

    /**
     * <p>
     * The custom properties that are specific to the connector when it's used as a destination in the flow.
     * </p>
     * 
     * @return The custom properties that are specific to the connector when it's used as a destination in the flow.
     */

    public java.util.Map<String, String> getCustomProperties() {
        return customProperties;
    }

    /**
     * <p>
     * The custom properties that are specific to the connector when it's used as a destination in the flow.
     * </p>
     * 
     * @param customProperties
     *        The custom properties that are specific to the connector when it's used as a destination in the flow.
     */

    public void setCustomProperties(java.util.Map<String, String> customProperties) {
        this.customProperties = customProperties;
    }

    /**
     * <p>
     * The custom properties that are specific to the connector when it's used as a destination in the flow.
     * </p>
     * 
     * @param customProperties
     *        The custom properties that are specific to the connector when it's used as a destination in the flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomConnectorDestinationProperties withCustomProperties(java.util.Map<String, String> customProperties) {
        setCustomProperties(customProperties);
        return this;
    }

    /**
     * Add a single CustomProperties entry
     *
     * @see CustomConnectorDestinationProperties#withCustomProperties
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CustomConnectorDestinationProperties addCustomPropertiesEntry(String key, String value) {
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

    public CustomConnectorDestinationProperties clearCustomPropertiesEntries() {
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
        if (getErrorHandlingConfig() != null)
            sb.append("ErrorHandlingConfig: ").append(getErrorHandlingConfig()).append(",");
        if (getWriteOperationType() != null)
            sb.append("WriteOperationType: ").append(getWriteOperationType()).append(",");
        if (getIdFieldNames() != null)
            sb.append("IdFieldNames: ").append(getIdFieldNames()).append(",");
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

        if (obj instanceof CustomConnectorDestinationProperties == false)
            return false;
        CustomConnectorDestinationProperties other = (CustomConnectorDestinationProperties) obj;
        if (other.getEntityName() == null ^ this.getEntityName() == null)
            return false;
        if (other.getEntityName() != null && other.getEntityName().equals(this.getEntityName()) == false)
            return false;
        if (other.getErrorHandlingConfig() == null ^ this.getErrorHandlingConfig() == null)
            return false;
        if (other.getErrorHandlingConfig() != null && other.getErrorHandlingConfig().equals(this.getErrorHandlingConfig()) == false)
            return false;
        if (other.getWriteOperationType() == null ^ this.getWriteOperationType() == null)
            return false;
        if (other.getWriteOperationType() != null && other.getWriteOperationType().equals(this.getWriteOperationType()) == false)
            return false;
        if (other.getIdFieldNames() == null ^ this.getIdFieldNames() == null)
            return false;
        if (other.getIdFieldNames() != null && other.getIdFieldNames().equals(this.getIdFieldNames()) == false)
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
        hashCode = prime * hashCode + ((getErrorHandlingConfig() == null) ? 0 : getErrorHandlingConfig().hashCode());
        hashCode = prime * hashCode + ((getWriteOperationType() == null) ? 0 : getWriteOperationType().hashCode());
        hashCode = prime * hashCode + ((getIdFieldNames() == null) ? 0 : getIdFieldNames().hashCode());
        hashCode = prime * hashCode + ((getCustomProperties() == null) ? 0 : getCustomProperties().hashCode());
        return hashCode;
    }

    @Override
    public CustomConnectorDestinationProperties clone() {
        try {
            return (CustomConnectorDestinationProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appflow.model.transform.CustomConnectorDestinationPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
