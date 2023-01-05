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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains success information for an entry that is associated with the <a
 * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_BatchGetAssetPropertyValue.html"
 * >BatchGetAssetPropertyValue</a> API.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/BatchGetAssetPropertyValueSuccessEntry"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetAssetPropertyValueSuccessEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the entry.
     * </p>
     */
    private String entryId;

    private AssetPropertyValue assetPropertyValue;

    /**
     * <p>
     * The ID of the entry.
     * </p>
     * 
     * @param entryId
     *        The ID of the entry.
     */

    public void setEntryId(String entryId) {
        this.entryId = entryId;
    }

    /**
     * <p>
     * The ID of the entry.
     * </p>
     * 
     * @return The ID of the entry.
     */

    public String getEntryId() {
        return this.entryId;
    }

    /**
     * <p>
     * The ID of the entry.
     * </p>
     * 
     * @param entryId
     *        The ID of the entry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetAssetPropertyValueSuccessEntry withEntryId(String entryId) {
        setEntryId(entryId);
        return this;
    }

    /**
     * @param assetPropertyValue
     */

    public void setAssetPropertyValue(AssetPropertyValue assetPropertyValue) {
        this.assetPropertyValue = assetPropertyValue;
    }

    /**
     * @return
     */

    public AssetPropertyValue getAssetPropertyValue() {
        return this.assetPropertyValue;
    }

    /**
     * @param assetPropertyValue
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetAssetPropertyValueSuccessEntry withAssetPropertyValue(AssetPropertyValue assetPropertyValue) {
        setAssetPropertyValue(assetPropertyValue);
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
        if (getAssetPropertyValue() != null)
            sb.append("AssetPropertyValue: ").append(getAssetPropertyValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetAssetPropertyValueSuccessEntry == false)
            return false;
        BatchGetAssetPropertyValueSuccessEntry other = (BatchGetAssetPropertyValueSuccessEntry) obj;
        if (other.getEntryId() == null ^ this.getEntryId() == null)
            return false;
        if (other.getEntryId() != null && other.getEntryId().equals(this.getEntryId()) == false)
            return false;
        if (other.getAssetPropertyValue() == null ^ this.getAssetPropertyValue() == null)
            return false;
        if (other.getAssetPropertyValue() != null && other.getAssetPropertyValue().equals(this.getAssetPropertyValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEntryId() == null) ? 0 : getEntryId().hashCode());
        hashCode = prime * hashCode + ((getAssetPropertyValue() == null) ? 0 : getAssetPropertyValue().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetAssetPropertyValueSuccessEntry clone() {
        try {
            return (BatchGetAssetPropertyValueSuccessEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotsitewise.model.transform.BatchGetAssetPropertyValueSuccessEntryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
