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
 * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_BatchGetAssetPropertyAggregates.html"
 * >BatchGetAssetPropertyAggregates</a> API.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/BatchGetAssetPropertyAggregatesSuccessEntry"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetAssetPropertyAggregatesSuccessEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the entry.
     * </p>
     */
    private String entryId;
    /**
     * <p>
     * The requested aggregated asset property values (for example, average, minimum, and maximum).
     * </p>
     */
    private java.util.List<AggregatedValue> aggregatedValues;

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

    public BatchGetAssetPropertyAggregatesSuccessEntry withEntryId(String entryId) {
        setEntryId(entryId);
        return this;
    }

    /**
     * <p>
     * The requested aggregated asset property values (for example, average, minimum, and maximum).
     * </p>
     * 
     * @return The requested aggregated asset property values (for example, average, minimum, and maximum).
     */

    public java.util.List<AggregatedValue> getAggregatedValues() {
        return aggregatedValues;
    }

    /**
     * <p>
     * The requested aggregated asset property values (for example, average, minimum, and maximum).
     * </p>
     * 
     * @param aggregatedValues
     *        The requested aggregated asset property values (for example, average, minimum, and maximum).
     */

    public void setAggregatedValues(java.util.Collection<AggregatedValue> aggregatedValues) {
        if (aggregatedValues == null) {
            this.aggregatedValues = null;
            return;
        }

        this.aggregatedValues = new java.util.ArrayList<AggregatedValue>(aggregatedValues);
    }

    /**
     * <p>
     * The requested aggregated asset property values (for example, average, minimum, and maximum).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAggregatedValues(java.util.Collection)} or {@link #withAggregatedValues(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param aggregatedValues
     *        The requested aggregated asset property values (for example, average, minimum, and maximum).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetAssetPropertyAggregatesSuccessEntry withAggregatedValues(AggregatedValue... aggregatedValues) {
        if (this.aggregatedValues == null) {
            setAggregatedValues(new java.util.ArrayList<AggregatedValue>(aggregatedValues.length));
        }
        for (AggregatedValue ele : aggregatedValues) {
            this.aggregatedValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The requested aggregated asset property values (for example, average, minimum, and maximum).
     * </p>
     * 
     * @param aggregatedValues
     *        The requested aggregated asset property values (for example, average, minimum, and maximum).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetAssetPropertyAggregatesSuccessEntry withAggregatedValues(java.util.Collection<AggregatedValue> aggregatedValues) {
        setAggregatedValues(aggregatedValues);
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
        if (getAggregatedValues() != null)
            sb.append("AggregatedValues: ").append(getAggregatedValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetAssetPropertyAggregatesSuccessEntry == false)
            return false;
        BatchGetAssetPropertyAggregatesSuccessEntry other = (BatchGetAssetPropertyAggregatesSuccessEntry) obj;
        if (other.getEntryId() == null ^ this.getEntryId() == null)
            return false;
        if (other.getEntryId() != null && other.getEntryId().equals(this.getEntryId()) == false)
            return false;
        if (other.getAggregatedValues() == null ^ this.getAggregatedValues() == null)
            return false;
        if (other.getAggregatedValues() != null && other.getAggregatedValues().equals(this.getAggregatedValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEntryId() == null) ? 0 : getEntryId().hashCode());
        hashCode = prime * hashCode + ((getAggregatedValues() == null) ? 0 : getAggregatedValues().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetAssetPropertyAggregatesSuccessEntry clone() {
        try {
            return (BatchGetAssetPropertyAggregatesSuccessEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotsitewise.model.transform.BatchGetAssetPropertyAggregatesSuccessEntryMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
