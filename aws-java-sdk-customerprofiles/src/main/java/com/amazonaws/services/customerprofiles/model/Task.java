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
package com.amazonaws.services.customerprofiles.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/Task" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Task implements Serializable, Cloneable, StructuredPojo {

    private ConnectorOperator connectorOperator;

    private String destinationField;

    private java.util.List<String> sourceFields;

    private java.util.Map<String, String> taskProperties;

    private String taskType;

    /**
     * @param connectorOperator
     */

    public void setConnectorOperator(ConnectorOperator connectorOperator) {
        this.connectorOperator = connectorOperator;
    }

    /**
     * @return
     */

    public ConnectorOperator getConnectorOperator() {
        return this.connectorOperator;
    }

    /**
     * @param connectorOperator
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Task withConnectorOperator(ConnectorOperator connectorOperator) {
        setConnectorOperator(connectorOperator);
        return this;
    }

    /**
     * @param destinationField
     */

    public void setDestinationField(String destinationField) {
        this.destinationField = destinationField;
    }

    /**
     * @return
     */

    public String getDestinationField() {
        return this.destinationField;
    }

    /**
     * @param destinationField
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Task withDestinationField(String destinationField) {
        setDestinationField(destinationField);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<String> getSourceFields() {
        return sourceFields;
    }

    /**
     * @param sourceFields
     */

    public void setSourceFields(java.util.Collection<String> sourceFields) {
        if (sourceFields == null) {
            this.sourceFields = null;
            return;
        }

        this.sourceFields = new java.util.ArrayList<String>(sourceFields);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSourceFields(java.util.Collection)} or {@link #withSourceFields(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param sourceFields
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Task withSourceFields(String... sourceFields) {
        if (this.sourceFields == null) {
            setSourceFields(new java.util.ArrayList<String>(sourceFields.length));
        }
        for (String ele : sourceFields) {
            this.sourceFields.add(ele);
        }
        return this;
    }

    /**
     * @param sourceFields
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Task withSourceFields(java.util.Collection<String> sourceFields) {
        setSourceFields(sourceFields);
        return this;
    }

    /**
     * @return
     */

    public java.util.Map<String, String> getTaskProperties() {
        return taskProperties;
    }

    /**
     * @param taskProperties
     */

    public void setTaskProperties(java.util.Map<String, String> taskProperties) {
        this.taskProperties = taskProperties;
    }

    /**
     * @param taskProperties
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Task withTaskProperties(java.util.Map<String, String> taskProperties) {
        setTaskProperties(taskProperties);
        return this;
    }

    /**
     * Add a single TaskProperties entry
     *
     * @see Task#withTaskProperties
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Task addTaskPropertiesEntry(String key, String value) {
        if (null == this.taskProperties) {
            this.taskProperties = new java.util.HashMap<String, String>();
        }
        if (this.taskProperties.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.taskProperties.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into TaskProperties.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Task clearTaskPropertiesEntries() {
        this.taskProperties = null;
        return this;
    }

    /**
     * @param taskType
     * @see TaskType
     */

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    /**
     * @return
     * @see TaskType
     */

    public String getTaskType() {
        return this.taskType;
    }

    /**
     * @param taskType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskType
     */

    public Task withTaskType(String taskType) {
        setTaskType(taskType);
        return this;
    }

    /**
     * @param taskType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskType
     */

    public Task withTaskType(TaskType taskType) {
        this.taskType = taskType.toString();
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
        if (getConnectorOperator() != null)
            sb.append("ConnectorOperator: ").append(getConnectorOperator()).append(",");
        if (getDestinationField() != null)
            sb.append("DestinationField: ").append(getDestinationField()).append(",");
        if (getSourceFields() != null)
            sb.append("SourceFields: ").append(getSourceFields()).append(",");
        if (getTaskProperties() != null)
            sb.append("TaskProperties: ").append(getTaskProperties()).append(",");
        if (getTaskType() != null)
            sb.append("TaskType: ").append(getTaskType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Task == false)
            return false;
        Task other = (Task) obj;
        if (other.getConnectorOperator() == null ^ this.getConnectorOperator() == null)
            return false;
        if (other.getConnectorOperator() != null && other.getConnectorOperator().equals(this.getConnectorOperator()) == false)
            return false;
        if (other.getDestinationField() == null ^ this.getDestinationField() == null)
            return false;
        if (other.getDestinationField() != null && other.getDestinationField().equals(this.getDestinationField()) == false)
            return false;
        if (other.getSourceFields() == null ^ this.getSourceFields() == null)
            return false;
        if (other.getSourceFields() != null && other.getSourceFields().equals(this.getSourceFields()) == false)
            return false;
        if (other.getTaskProperties() == null ^ this.getTaskProperties() == null)
            return false;
        if (other.getTaskProperties() != null && other.getTaskProperties().equals(this.getTaskProperties()) == false)
            return false;
        if (other.getTaskType() == null ^ this.getTaskType() == null)
            return false;
        if (other.getTaskType() != null && other.getTaskType().equals(this.getTaskType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectorOperator() == null) ? 0 : getConnectorOperator().hashCode());
        hashCode = prime * hashCode + ((getDestinationField() == null) ? 0 : getDestinationField().hashCode());
        hashCode = prime * hashCode + ((getSourceFields() == null) ? 0 : getSourceFields().hashCode());
        hashCode = prime * hashCode + ((getTaskProperties() == null) ? 0 : getTaskProperties().hashCode());
        hashCode = prime * hashCode + ((getTaskType() == null) ? 0 : getTaskType().hashCode());
        return hashCode;
    }

    @Override
    public Task clone() {
        try {
            return (Task) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.customerprofiles.model.transform.TaskMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
