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
 * The properties that are applied when using SAPOData as a flow destination
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/SAPODataDestinationProperties"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SAPODataDestinationProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The object path specified in the SAPOData flow destination.
     * </p>
     */
    private String objectPath;
    /**
     * <p>
     * Determines how Amazon AppFlow handles the success response that it gets from the connector after placing data.
     * </p>
     * <p>
     * For example, this setting would determine where to write the response from a destination connector upon a
     * successful insert operation.
     * </p>
     */
    private SuccessResponseHandlingConfig successResponseHandlingConfig;

    private java.util.List<String> idFieldNames;

    private ErrorHandlingConfig errorHandlingConfig;

    private String writeOperationType;

    /**
     * <p>
     * The object path specified in the SAPOData flow destination.
     * </p>
     * 
     * @param objectPath
     *        The object path specified in the SAPOData flow destination.
     */

    public void setObjectPath(String objectPath) {
        this.objectPath = objectPath;
    }

    /**
     * <p>
     * The object path specified in the SAPOData flow destination.
     * </p>
     * 
     * @return The object path specified in the SAPOData flow destination.
     */

    public String getObjectPath() {
        return this.objectPath;
    }

    /**
     * <p>
     * The object path specified in the SAPOData flow destination.
     * </p>
     * 
     * @param objectPath
     *        The object path specified in the SAPOData flow destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SAPODataDestinationProperties withObjectPath(String objectPath) {
        setObjectPath(objectPath);
        return this;
    }

    /**
     * <p>
     * Determines how Amazon AppFlow handles the success response that it gets from the connector after placing data.
     * </p>
     * <p>
     * For example, this setting would determine where to write the response from a destination connector upon a
     * successful insert operation.
     * </p>
     * 
     * @param successResponseHandlingConfig
     *        Determines how Amazon AppFlow handles the success response that it gets from the connector after placing
     *        data.</p>
     *        <p>
     *        For example, this setting would determine where to write the response from a destination connector upon a
     *        successful insert operation.
     */

    public void setSuccessResponseHandlingConfig(SuccessResponseHandlingConfig successResponseHandlingConfig) {
        this.successResponseHandlingConfig = successResponseHandlingConfig;
    }

    /**
     * <p>
     * Determines how Amazon AppFlow handles the success response that it gets from the connector after placing data.
     * </p>
     * <p>
     * For example, this setting would determine where to write the response from a destination connector upon a
     * successful insert operation.
     * </p>
     * 
     * @return Determines how Amazon AppFlow handles the success response that it gets from the connector after placing
     *         data.</p>
     *         <p>
     *         For example, this setting would determine where to write the response from a destination connector upon a
     *         successful insert operation.
     */

    public SuccessResponseHandlingConfig getSuccessResponseHandlingConfig() {
        return this.successResponseHandlingConfig;
    }

    /**
     * <p>
     * Determines how Amazon AppFlow handles the success response that it gets from the connector after placing data.
     * </p>
     * <p>
     * For example, this setting would determine where to write the response from a destination connector upon a
     * successful insert operation.
     * </p>
     * 
     * @param successResponseHandlingConfig
     *        Determines how Amazon AppFlow handles the success response that it gets from the connector after placing
     *        data.</p>
     *        <p>
     *        For example, this setting would determine where to write the response from a destination connector upon a
     *        successful insert operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SAPODataDestinationProperties withSuccessResponseHandlingConfig(SuccessResponseHandlingConfig successResponseHandlingConfig) {
        setSuccessResponseHandlingConfig(successResponseHandlingConfig);
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

    public SAPODataDestinationProperties withIdFieldNames(String... idFieldNames) {
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

    public SAPODataDestinationProperties withIdFieldNames(java.util.Collection<String> idFieldNames) {
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

    public SAPODataDestinationProperties withErrorHandlingConfig(ErrorHandlingConfig errorHandlingConfig) {
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

    public SAPODataDestinationProperties withWriteOperationType(String writeOperationType) {
        setWriteOperationType(writeOperationType);
        return this;
    }

    /**
     * @param writeOperationType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WriteOperationType
     */

    public SAPODataDestinationProperties withWriteOperationType(WriteOperationType writeOperationType) {
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
        if (getObjectPath() != null)
            sb.append("ObjectPath: ").append(getObjectPath()).append(",");
        if (getSuccessResponseHandlingConfig() != null)
            sb.append("SuccessResponseHandlingConfig: ").append(getSuccessResponseHandlingConfig()).append(",");
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

        if (obj instanceof SAPODataDestinationProperties == false)
            return false;
        SAPODataDestinationProperties other = (SAPODataDestinationProperties) obj;
        if (other.getObjectPath() == null ^ this.getObjectPath() == null)
            return false;
        if (other.getObjectPath() != null && other.getObjectPath().equals(this.getObjectPath()) == false)
            return false;
        if (other.getSuccessResponseHandlingConfig() == null ^ this.getSuccessResponseHandlingConfig() == null)
            return false;
        if (other.getSuccessResponseHandlingConfig() != null
                && other.getSuccessResponseHandlingConfig().equals(this.getSuccessResponseHandlingConfig()) == false)
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

        hashCode = prime * hashCode + ((getObjectPath() == null) ? 0 : getObjectPath().hashCode());
        hashCode = prime * hashCode + ((getSuccessResponseHandlingConfig() == null) ? 0 : getSuccessResponseHandlingConfig().hashCode());
        hashCode = prime * hashCode + ((getIdFieldNames() == null) ? 0 : getIdFieldNames().hashCode());
        hashCode = prime * hashCode + ((getErrorHandlingConfig() == null) ? 0 : getErrorHandlingConfig().hashCode());
        hashCode = prime * hashCode + ((getWriteOperationType() == null) ? 0 : getWriteOperationType().hashCode());
        return hashCode;
    }

    @Override
    public SAPODataDestinationProperties clone() {
        try {
            return (SAPODataDestinationProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appflow.model.transform.SAPODataDestinationPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
