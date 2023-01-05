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
 * >BatchGetAssetPropertyValueHistory</a> API.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/BatchGetAssetPropertyValueHistorySuccessEntry"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetAssetPropertyValueHistorySuccessEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the entry.
     * </p>
     */
    private String entryId;
    /**
     * <p>
     * The requested historical values for the specified asset property.
     * </p>
     */
    private java.util.List<AssetPropertyValue> assetPropertyValueHistory;

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

    public BatchGetAssetPropertyValueHistorySuccessEntry withEntryId(String entryId) {
        setEntryId(entryId);
        return this;
    }

    /**
     * <p>
     * The requested historical values for the specified asset property.
     * </p>
     * 
     * @return The requested historical values for the specified asset property.
     */

    public java.util.List<AssetPropertyValue> getAssetPropertyValueHistory() {
        return assetPropertyValueHistory;
    }

    /**
     * <p>
     * The requested historical values for the specified asset property.
     * </p>
     * 
     * @param assetPropertyValueHistory
     *        The requested historical values for the specified asset property.
     */

    public void setAssetPropertyValueHistory(java.util.Collection<AssetPropertyValue> assetPropertyValueHistory) {
        if (assetPropertyValueHistory == null) {
            this.assetPropertyValueHistory = null;
            return;
        }

        this.assetPropertyValueHistory = new java.util.ArrayList<AssetPropertyValue>(assetPropertyValueHistory);
    }

    /**
     * <p>
     * The requested historical values for the specified asset property.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssetPropertyValueHistory(java.util.Collection)} or
     * {@link #withAssetPropertyValueHistory(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param assetPropertyValueHistory
     *        The requested historical values for the specified asset property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetAssetPropertyValueHistorySuccessEntry withAssetPropertyValueHistory(AssetPropertyValue... assetPropertyValueHistory) {
        if (this.assetPropertyValueHistory == null) {
            setAssetPropertyValueHistory(new java.util.ArrayList<AssetPropertyValue>(assetPropertyValueHistory.length));
        }
        for (AssetPropertyValue ele : assetPropertyValueHistory) {
            this.assetPropertyValueHistory.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The requested historical values for the specified asset property.
     * </p>
     * 
     * @param assetPropertyValueHistory
     *        The requested historical values for the specified asset property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetAssetPropertyValueHistorySuccessEntry withAssetPropertyValueHistory(java.util.Collection<AssetPropertyValue> assetPropertyValueHistory) {
        setAssetPropertyValueHistory(assetPropertyValueHistory);
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
        if (getAssetPropertyValueHistory() != null)
            sb.append("AssetPropertyValueHistory: ").append(getAssetPropertyValueHistory());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetAssetPropertyValueHistorySuccessEntry == false)
            return false;
        BatchGetAssetPropertyValueHistorySuccessEntry other = (BatchGetAssetPropertyValueHistorySuccessEntry) obj;
        if (other.getEntryId() == null ^ this.getEntryId() == null)
            return false;
        if (other.getEntryId() != null && other.getEntryId().equals(this.getEntryId()) == false)
            return false;
        if (other.getAssetPropertyValueHistory() == null ^ this.getAssetPropertyValueHistory() == null)
            return false;
        if (other.getAssetPropertyValueHistory() != null && other.getAssetPropertyValueHistory().equals(this.getAssetPropertyValueHistory()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEntryId() == null) ? 0 : getEntryId().hashCode());
        hashCode = prime * hashCode + ((getAssetPropertyValueHistory() == null) ? 0 : getAssetPropertyValueHistory().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetAssetPropertyValueHistorySuccessEntry clone() {
        try {
            return (BatchGetAssetPropertyValueHistorySuccessEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotsitewise.model.transform.BatchGetAssetPropertyValueHistorySuccessEntryMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
