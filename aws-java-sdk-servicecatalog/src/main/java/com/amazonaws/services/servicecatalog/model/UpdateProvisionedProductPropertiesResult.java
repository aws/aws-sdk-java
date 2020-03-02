/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/UpdateProvisionedProductProperties"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateProvisionedProductPropertiesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The provisioned product identifier.
     * </p>
     */
    private String provisionedProductId;
    /**
     * <p>
     * A map that contains the properties updated.
     * </p>
     */
    private java.util.Map<String, String> provisionedProductProperties;
    /**
     * <p>
     * The identifier of the record.
     * </p>
     */
    private String recordId;
    /**
     * <p>
     * The status of the request.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The provisioned product identifier.
     * </p>
     * 
     * @param provisionedProductId
     *        The provisioned product identifier.
     */

    public void setProvisionedProductId(String provisionedProductId) {
        this.provisionedProductId = provisionedProductId;
    }

    /**
     * <p>
     * The provisioned product identifier.
     * </p>
     * 
     * @return The provisioned product identifier.
     */

    public String getProvisionedProductId() {
        return this.provisionedProductId;
    }

    /**
     * <p>
     * The provisioned product identifier.
     * </p>
     * 
     * @param provisionedProductId
     *        The provisioned product identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProvisionedProductPropertiesResult withProvisionedProductId(String provisionedProductId) {
        setProvisionedProductId(provisionedProductId);
        return this;
    }

    /**
     * <p>
     * A map that contains the properties updated.
     * </p>
     * 
     * @return A map that contains the properties updated.
     */

    public java.util.Map<String, String> getProvisionedProductProperties() {
        return provisionedProductProperties;
    }

    /**
     * <p>
     * A map that contains the properties updated.
     * </p>
     * 
     * @param provisionedProductProperties
     *        A map that contains the properties updated.
     */

    public void setProvisionedProductProperties(java.util.Map<String, String> provisionedProductProperties) {
        this.provisionedProductProperties = provisionedProductProperties;
    }

    /**
     * <p>
     * A map that contains the properties updated.
     * </p>
     * 
     * @param provisionedProductProperties
     *        A map that contains the properties updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProvisionedProductPropertiesResult withProvisionedProductProperties(java.util.Map<String, String> provisionedProductProperties) {
        setProvisionedProductProperties(provisionedProductProperties);
        return this;
    }

    /**
     * Add a single ProvisionedProductProperties entry
     *
     * @see UpdateProvisionedProductPropertiesResult#withProvisionedProductProperties
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProvisionedProductPropertiesResult addProvisionedProductPropertiesEntry(String key, String value) {
        if (null == this.provisionedProductProperties) {
            this.provisionedProductProperties = new java.util.HashMap<String, String>();
        }
        if (this.provisionedProductProperties.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.provisionedProductProperties.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ProvisionedProductProperties.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProvisionedProductPropertiesResult clearProvisionedProductPropertiesEntries() {
        this.provisionedProductProperties = null;
        return this;
    }

    /**
     * <p>
     * The identifier of the record.
     * </p>
     * 
     * @param recordId
     *        The identifier of the record.
     */

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    /**
     * <p>
     * The identifier of the record.
     * </p>
     * 
     * @return The identifier of the record.
     */

    public String getRecordId() {
        return this.recordId;
    }

    /**
     * <p>
     * The identifier of the record.
     * </p>
     * 
     * @param recordId
     *        The identifier of the record.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProvisionedProductPropertiesResult withRecordId(String recordId) {
        setRecordId(recordId);
        return this;
    }

    /**
     * <p>
     * The status of the request.
     * </p>
     * 
     * @param status
     *        The status of the request.
     * @see RecordStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the request.
     * </p>
     * 
     * @return The status of the request.
     * @see RecordStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the request.
     * </p>
     * 
     * @param status
     *        The status of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecordStatus
     */

    public UpdateProvisionedProductPropertiesResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the request.
     * </p>
     * 
     * @param status
     *        The status of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecordStatus
     */

    public UpdateProvisionedProductPropertiesResult withStatus(RecordStatus status) {
        this.status = status.toString();
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
        if (getProvisionedProductId() != null)
            sb.append("ProvisionedProductId: ").append(getProvisionedProductId()).append(",");
        if (getProvisionedProductProperties() != null)
            sb.append("ProvisionedProductProperties: ").append(getProvisionedProductProperties()).append(",");
        if (getRecordId() != null)
            sb.append("RecordId: ").append(getRecordId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateProvisionedProductPropertiesResult == false)
            return false;
        UpdateProvisionedProductPropertiesResult other = (UpdateProvisionedProductPropertiesResult) obj;
        if (other.getProvisionedProductId() == null ^ this.getProvisionedProductId() == null)
            return false;
        if (other.getProvisionedProductId() != null && other.getProvisionedProductId().equals(this.getProvisionedProductId()) == false)
            return false;
        if (other.getProvisionedProductProperties() == null ^ this.getProvisionedProductProperties() == null)
            return false;
        if (other.getProvisionedProductProperties() != null && other.getProvisionedProductProperties().equals(this.getProvisionedProductProperties()) == false)
            return false;
        if (other.getRecordId() == null ^ this.getRecordId() == null)
            return false;
        if (other.getRecordId() != null && other.getRecordId().equals(this.getRecordId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProvisionedProductId() == null) ? 0 : getProvisionedProductId().hashCode());
        hashCode = prime * hashCode + ((getProvisionedProductProperties() == null) ? 0 : getProvisionedProductProperties().hashCode());
        hashCode = prime * hashCode + ((getRecordId() == null) ? 0 : getRecordId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public UpdateProvisionedProductPropertiesResult clone() {
        try {
            return (UpdateProvisionedProductPropertiesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
