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
package com.amazonaws.services.appflow.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The properties that are applied when Zendesk is used as a destination.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/ZendeskDestinationProperties"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ZendeskDestinationProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The object specified in the Zendesk flow destination.
     * </p>
     */
    private String object;

    private java.util.List<String> idFieldNames;

    private ErrorHandlingConfig errorHandlingConfig;

    private String writeOperationType;

    /**
     * <p>
     * The object specified in the Zendesk flow destination.
     * </p>
     * 
     * @param object
     *        The object specified in the Zendesk flow destination.
     */

    public void setObject(String object) {
        this.object = object;
    }

    /**
     * <p>
     * The object specified in the Zendesk flow destination.
     * </p>
     * 
     * @return The object specified in the Zendesk flow destination.
     */

    public String getObject() {
        return this.object;
    }

    /**
     * <p>
     * The object specified in the Zendesk flow destination.
     * </p>
     * 
     * @param object
     *        The object specified in the Zendesk flow destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ZendeskDestinationProperties withObject(String object) {
        setObject(object);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<String> getIdFieldNames() {
        return idFieldNames;
    }

    /**
     * @param idFieldNames
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
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIdFieldNames(java.util.Collection)} or {@link #withIdFieldNames(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param idFieldNames
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ZendeskDestinationProperties withIdFieldNames(String... idFieldNames) {
        if (this.idFieldNames == null) {
            setIdFieldNames(new java.util.ArrayList<String>(idFieldNames.length));
        }
        for (String ele : idFieldNames) {
            this.idFieldNames.add(ele);
        }
        return this;
    }

    /**
     * @param idFieldNames
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ZendeskDestinationProperties withIdFieldNames(java.util.Collection<String> idFieldNames) {
        setIdFieldNames(idFieldNames);
        return this;
    }

    /**
     * @param errorHandlingConfig
     */

    public void setErrorHandlingConfig(ErrorHandlingConfig errorHandlingConfig) {
        this.errorHandlingConfig = errorHandlingConfig;
    }

    /**
     * @return
     */

    public ErrorHandlingConfig getErrorHandlingConfig() {
        return this.errorHandlingConfig;
    }

    /**
     * @param errorHandlingConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ZendeskDestinationProperties withErrorHandlingConfig(ErrorHandlingConfig errorHandlingConfig) {
        setErrorHandlingConfig(errorHandlingConfig);
        return this;
    }

    /**
     * @param writeOperationType
     * @see WriteOperationType
     */

    public void setWriteOperationType(String writeOperationType) {
        this.writeOperationType = writeOperationType;
    }

    /**
     * @return
     * @see WriteOperationType
     */

    public String getWriteOperationType() {
        return this.writeOperationType;
    }

    /**
     * @param writeOperationType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WriteOperationType
     */

    public ZendeskDestinationProperties withWriteOperationType(String writeOperationType) {
        setWriteOperationType(writeOperationType);
        return this;
    }

    /**
     * @param writeOperationType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WriteOperationType
     */

    public ZendeskDestinationProperties withWriteOperationType(WriteOperationType writeOperationType) {
        this.writeOperationType = writeOperationType.toString();
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
        if (getObject() != null)
            sb.append("Object: ").append(getObject()).append(",");
        if (getIdFieldNames() != null)
            sb.append("IdFieldNames: ").append(getIdFieldNames()).append(",");
        if (getErrorHandlingConfig() != null)
            sb.append("ErrorHandlingConfig: ").append(getErrorHandlingConfig()).append(",");
        if (getWriteOperationType() != null)
            sb.append("WriteOperationType: ").append(getWriteOperationType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ZendeskDestinationProperties == false)
            return false;
        ZendeskDestinationProperties other = (ZendeskDestinationProperties) obj;
        if (other.getObject() == null ^ this.getObject() == null)
            return false;
        if (other.getObject() != null && other.getObject().equals(this.getObject()) == false)
            return false;
        if (other.getIdFieldNames() == null ^ this.getIdFieldNames() == null)
            return false;
        if (other.getIdFieldNames() != null && other.getIdFieldNames().equals(this.getIdFieldNames()) == false)
            return false;
        if (other.getErrorHandlingConfig() == null ^ this.getErrorHandlingConfig() == null)
            return false;
        if (other.getErrorHandlingConfig() != null && other.getErrorHandlingConfig().equals(this.getErrorHandlingConfig()) == false)
            return false;
        if (other.getWriteOperationType() == null ^ this.getWriteOperationType() == null)
            return false;
        if (other.getWriteOperationType() != null && other.getWriteOperationType().equals(this.getWriteOperationType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getObject() == null) ? 0 : getObject().hashCode());
        hashCode = prime * hashCode + ((getIdFieldNames() == null) ? 0 : getIdFieldNames().hashCode());
        hashCode = prime * hashCode + ((getErrorHandlingConfig() == null) ? 0 : getErrorHandlingConfig().hashCode());
        hashCode = prime * hashCode + ((getWriteOperationType() == null) ? 0 : getWriteOperationType().hashCode());
        return hashCode;
    }

    @Override
    public ZendeskDestinationProperties clone() {
        try {
            return (ZendeskDestinationProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appflow.model.transform.ZendeskDestinationPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
