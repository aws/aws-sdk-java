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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains error information for asset property value entries that are associated with the <a
 * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_BatchPutAssetPropertyValue.html"
 * >BatchPutAssetPropertyValue</a> API.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/BatchPutAssetPropertyErrorEntry"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchPutAssetPropertyErrorEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the failed entry.
     * </p>
     */
    private String entryId;
    /**
     * <p>
     * The list of update property value errors.
     * </p>
     */
    private java.util.List<BatchPutAssetPropertyError> errors;

    /**
     * <p>
     * The ID of the failed entry.
     * </p>
     * 
     * @param entryId
     *        The ID of the failed entry.
     */

    public void setEntryId(String entryId) {
        this.entryId = entryId;
    }

    /**
     * <p>
     * The ID of the failed entry.
     * </p>
     * 
     * @return The ID of the failed entry.
     */

    public String getEntryId() {
        return this.entryId;
    }

    /**
     * <p>
     * The ID of the failed entry.
     * </p>
     * 
     * @param entryId
     *        The ID of the failed entry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchPutAssetPropertyErrorEntry withEntryId(String entryId) {
        setEntryId(entryId);
        return this;
    }

    /**
     * <p>
     * The list of update property value errors.
     * </p>
     * 
     * @return The list of update property value errors.
     */

    public java.util.List<BatchPutAssetPropertyError> getErrors() {
        return errors;
    }

    /**
     * <p>
     * The list of update property value errors.
     * </p>
     * 
     * @param errors
     *        The list of update property value errors.
     */

    public void setErrors(java.util.Collection<BatchPutAssetPropertyError> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new java.util.ArrayList<BatchPutAssetPropertyError>(errors);
    }

    /**
     * <p>
     * The list of update property value errors.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setErrors(java.util.Collection)} or {@link #withErrors(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param errors
     *        The list of update property value errors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchPutAssetPropertyErrorEntry withErrors(BatchPutAssetPropertyError... errors) {
        if (this.errors == null) {
            setErrors(new java.util.ArrayList<BatchPutAssetPropertyError>(errors.length));
        }
        for (BatchPutAssetPropertyError ele : errors) {
            this.errors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of update property value errors.
     * </p>
     * 
     * @param errors
     *        The list of update property value errors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchPutAssetPropertyErrorEntry withErrors(java.util.Collection<BatchPutAssetPropertyError> errors) {
        setErrors(errors);
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
        if (getEntryId() != null)
            sb.append("EntryId: ").append(getEntryId()).append(",");
        if (getErrors() != null)
            sb.append("Errors: ").append(getErrors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchPutAssetPropertyErrorEntry == false)
            return false;
        BatchPutAssetPropertyErrorEntry other = (BatchPutAssetPropertyErrorEntry) obj;
        if (other.getEntryId() == null ^ this.getEntryId() == null)
            return false;
        if (other.getEntryId() != null && other.getEntryId().equals(this.getEntryId()) == false)
            return false;
        if (other.getErrors() == null ^ this.getErrors() == null)
            return false;
        if (other.getErrors() != null && other.getErrors().equals(this.getErrors()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEntryId() == null) ? 0 : getEntryId().hashCode());
        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        return hashCode;
    }

    @Override
    public BatchPutAssetPropertyErrorEntry clone() {
        try {
            return (BatchPutAssetPropertyErrorEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotsitewise.model.transform.BatchPutAssetPropertyErrorEntryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
