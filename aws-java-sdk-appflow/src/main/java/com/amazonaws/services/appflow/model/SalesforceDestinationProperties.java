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
 * The properties that are applied when Salesforce is being used as a destination.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/SalesforceDestinationProperties"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SalesforceDestinationProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The object specified in the Salesforce flow destination.
     * </p>
     */
    private String object;
    /**
     * <p>
     * The name of the field that Amazon AppFlow uses as an ID when performing a write operation such as update or
     * delete.
     * </p>
     */
    private java.util.List<String> idFieldNames;
    /**
     * <p>
     * The settings that determine how Amazon AppFlow handles an error when placing data in the Salesforce destination.
     * For example, this setting would determine if the flow should fail after one insertion error, or continue and
     * attempt to insert every record regardless of the initial failure. <code>ErrorHandlingConfig</code> is a part of
     * the destination connector details.
     * </p>
     */
    private ErrorHandlingConfig errorHandlingConfig;
    /**
     * <p>
     * This specifies the type of write operation to be performed in Salesforce. When the value is <code>UPSERT</code>,
     * then <code>idFieldNames</code> is required.
     * </p>
     */
    private String writeOperationType;

    /**
     * <p>
     * The object specified in the Salesforce flow destination.
     * </p>
     * 
     * @param object
     *        The object specified in the Salesforce flow destination.
     */

    public void setObject(String object) {
        this.object = object;
    }

    /**
     * <p>
     * The object specified in the Salesforce flow destination.
     * </p>
     * 
     * @return The object specified in the Salesforce flow destination.
     */

    public String getObject() {
        return this.object;
    }

    /**
     * <p>
     * The object specified in the Salesforce flow destination.
     * </p>
     * 
     * @param object
     *        The object specified in the Salesforce flow destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SalesforceDestinationProperties withObject(String object) {
        setObject(object);
        return this;
    }

    /**
     * <p>
     * The name of the field that Amazon AppFlow uses as an ID when performing a write operation such as update or
     * delete.
     * </p>
     * 
     * @return The name of the field that Amazon AppFlow uses as an ID when performing a write operation such as update
     *         or delete.
     */

    public java.util.List<String> getIdFieldNames() {
        return idFieldNames;
    }

    /**
     * <p>
     * The name of the field that Amazon AppFlow uses as an ID when performing a write operation such as update or
     * delete.
     * </p>
     * 
     * @param idFieldNames
     *        The name of the field that Amazon AppFlow uses as an ID when performing a write operation such as update
     *        or delete.
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
     * The name of the field that Amazon AppFlow uses as an ID when performing a write operation such as update or
     * delete.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIdFieldNames(java.util.Collection)} or {@link #withIdFieldNames(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param idFieldNames
     *        The name of the field that Amazon AppFlow uses as an ID when performing a write operation such as update
     *        or delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SalesforceDestinationProperties withIdFieldNames(String... idFieldNames) {
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
     * The name of the field that Amazon AppFlow uses as an ID when performing a write operation such as update or
     * delete.
     * </p>
     * 
     * @param idFieldNames
     *        The name of the field that Amazon AppFlow uses as an ID when performing a write operation such as update
     *        or delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SalesforceDestinationProperties withIdFieldNames(java.util.Collection<String> idFieldNames) {
        setIdFieldNames(idFieldNames);
        return this;
    }

    /**
     * <p>
     * The settings that determine how Amazon AppFlow handles an error when placing data in the Salesforce destination.
     * For example, this setting would determine if the flow should fail after one insertion error, or continue and
     * attempt to insert every record regardless of the initial failure. <code>ErrorHandlingConfig</code> is a part of
     * the destination connector details.
     * </p>
     * 
     * @param errorHandlingConfig
     *        The settings that determine how Amazon AppFlow handles an error when placing data in the Salesforce
     *        destination. For example, this setting would determine if the flow should fail after one insertion error,
     *        or continue and attempt to insert every record regardless of the initial failure.
     *        <code>ErrorHandlingConfig</code> is a part of the destination connector details.
     */

    public void setErrorHandlingConfig(ErrorHandlingConfig errorHandlingConfig) {
        this.errorHandlingConfig = errorHandlingConfig;
    }

    /**
     * <p>
     * The settings that determine how Amazon AppFlow handles an error when placing data in the Salesforce destination.
     * For example, this setting would determine if the flow should fail after one insertion error, or continue and
     * attempt to insert every record regardless of the initial failure. <code>ErrorHandlingConfig</code> is a part of
     * the destination connector details.
     * </p>
     * 
     * @return The settings that determine how Amazon AppFlow handles an error when placing data in the Salesforce
     *         destination. For example, this setting would determine if the flow should fail after one insertion error,
     *         or continue and attempt to insert every record regardless of the initial failure.
     *         <code>ErrorHandlingConfig</code> is a part of the destination connector details.
     */

    public ErrorHandlingConfig getErrorHandlingConfig() {
        return this.errorHandlingConfig;
    }

    /**
     * <p>
     * The settings that determine how Amazon AppFlow handles an error when placing data in the Salesforce destination.
     * For example, this setting would determine if the flow should fail after one insertion error, or continue and
     * attempt to insert every record regardless of the initial failure. <code>ErrorHandlingConfig</code> is a part of
     * the destination connector details.
     * </p>
     * 
     * @param errorHandlingConfig
     *        The settings that determine how Amazon AppFlow handles an error when placing data in the Salesforce
     *        destination. For example, this setting would determine if the flow should fail after one insertion error,
     *        or continue and attempt to insert every record regardless of the initial failure.
     *        <code>ErrorHandlingConfig</code> is a part of the destination connector details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SalesforceDestinationProperties withErrorHandlingConfig(ErrorHandlingConfig errorHandlingConfig) {
        setErrorHandlingConfig(errorHandlingConfig);
        return this;
    }

    /**
     * <p>
     * This specifies the type of write operation to be performed in Salesforce. When the value is <code>UPSERT</code>,
     * then <code>idFieldNames</code> is required.
     * </p>
     * 
     * @param writeOperationType
     *        This specifies the type of write operation to be performed in Salesforce. When the value is
     *        <code>UPSERT</code>, then <code>idFieldNames</code> is required.
     * @see WriteOperationType
     */

    public void setWriteOperationType(String writeOperationType) {
        this.writeOperationType = writeOperationType;
    }

    /**
     * <p>
     * This specifies the type of write operation to be performed in Salesforce. When the value is <code>UPSERT</code>,
     * then <code>idFieldNames</code> is required.
     * </p>
     * 
     * @return This specifies the type of write operation to be performed in Salesforce. When the value is
     *         <code>UPSERT</code>, then <code>idFieldNames</code> is required.
     * @see WriteOperationType
     */

    public String getWriteOperationType() {
        return this.writeOperationType;
    }

    /**
     * <p>
     * This specifies the type of write operation to be performed in Salesforce. When the value is <code>UPSERT</code>,
     * then <code>idFieldNames</code> is required.
     * </p>
     * 
     * @param writeOperationType
     *        This specifies the type of write operation to be performed in Salesforce. When the value is
     *        <code>UPSERT</code>, then <code>idFieldNames</code> is required.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WriteOperationType
     */

    public SalesforceDestinationProperties withWriteOperationType(String writeOperationType) {
        setWriteOperationType(writeOperationType);
        return this;
    }

    /**
     * <p>
     * This specifies the type of write operation to be performed in Salesforce. When the value is <code>UPSERT</code>,
     * then <code>idFieldNames</code> is required.
     * </p>
     * 
     * @param writeOperationType
     *        This specifies the type of write operation to be performed in Salesforce. When the value is
     *        <code>UPSERT</code>, then <code>idFieldNames</code> is required.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WriteOperationType
     */

    public SalesforceDestinationProperties withWriteOperationType(WriteOperationType writeOperationType) {
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

        if (obj instanceof SalesforceDestinationProperties == false)
            return false;
        SalesforceDestinationProperties other = (SalesforceDestinationProperties) obj;
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
    public SalesforceDestinationProperties clone() {
        try {
            return (SalesforceDestinationProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appflow.model.transform.SalesforceDestinationPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
