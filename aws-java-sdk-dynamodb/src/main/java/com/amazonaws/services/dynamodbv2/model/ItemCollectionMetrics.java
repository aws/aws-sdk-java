/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about item collections, if any, that were affected by the operation. <code>ItemCollectionMetrics</code>
 * is only returned if the request asked for it. If the table does not have any local secondary indexes, this
 * information is not returned in the response.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/ItemCollectionMetrics" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ItemCollectionMetrics implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The partition key value of the item collection. This value is the same as the partition key value of the item.
     * </p>
     */
    private java.util.Map<String, AttributeValue> itemCollectionKey;
    /**
     * <p>
     * An estimate of item collection size, in gigabytes. This value is a two-element array containing a lower bound and
     * an upper bound for the estimate. The estimate includes the size of all the items in the table, plus the size of
     * all attributes projected into all of the local secondary indexes on that table. Use this estimate to measure
     * whether a local secondary index is approaching its size limit.
     * </p>
     * <p>
     * The estimate is subject to change over time; therefore, do not rely on the precision or accuracy of the estimate.
     * </p>
     */
    private java.util.List<Double> sizeEstimateRangeGB;

    /**
     * <p>
     * The partition key value of the item collection. This value is the same as the partition key value of the item.
     * </p>
     * 
     * @return The partition key value of the item collection. This value is the same as the partition key value of the
     *         item.
     */

    public java.util.Map<String, AttributeValue> getItemCollectionKey() {
        return itemCollectionKey;
    }

    /**
     * <p>
     * The partition key value of the item collection. This value is the same as the partition key value of the item.
     * </p>
     * 
     * @param itemCollectionKey
     *        The partition key value of the item collection. This value is the same as the partition key value of the
     *        item.
     */

    public void setItemCollectionKey(java.util.Map<String, AttributeValue> itemCollectionKey) {
        this.itemCollectionKey = itemCollectionKey;
    }

    /**
     * <p>
     * The partition key value of the item collection. This value is the same as the partition key value of the item.
     * </p>
     * 
     * @param itemCollectionKey
     *        The partition key value of the item collection. This value is the same as the partition key value of the
     *        item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ItemCollectionMetrics withItemCollectionKey(java.util.Map<String, AttributeValue> itemCollectionKey) {
        setItemCollectionKey(itemCollectionKey);
        return this;
    }

    public ItemCollectionMetrics addItemCollectionKeyEntry(String key, AttributeValue value) {
        if (null == this.itemCollectionKey) {
            this.itemCollectionKey = new java.util.HashMap<String, AttributeValue>();
        }
        if (this.itemCollectionKey.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.itemCollectionKey.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ItemCollectionKey.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ItemCollectionMetrics clearItemCollectionKeyEntries() {
        this.itemCollectionKey = null;
        return this;
    }

    /**
     * <p>
     * An estimate of item collection size, in gigabytes. This value is a two-element array containing a lower bound and
     * an upper bound for the estimate. The estimate includes the size of all the items in the table, plus the size of
     * all attributes projected into all of the local secondary indexes on that table. Use this estimate to measure
     * whether a local secondary index is approaching its size limit.
     * </p>
     * <p>
     * The estimate is subject to change over time; therefore, do not rely on the precision or accuracy of the estimate.
     * </p>
     * 
     * @return An estimate of item collection size, in gigabytes. This value is a two-element array containing a lower
     *         bound and an upper bound for the estimate. The estimate includes the size of all the items in the table,
     *         plus the size of all attributes projected into all of the local secondary indexes on that table. Use this
     *         estimate to measure whether a local secondary index is approaching its size limit.</p>
     *         <p>
     *         The estimate is subject to change over time; therefore, do not rely on the precision or accuracy of the
     *         estimate.
     */

    public java.util.List<Double> getSizeEstimateRangeGB() {
        return sizeEstimateRangeGB;
    }

    /**
     * <p>
     * An estimate of item collection size, in gigabytes. This value is a two-element array containing a lower bound and
     * an upper bound for the estimate. The estimate includes the size of all the items in the table, plus the size of
     * all attributes projected into all of the local secondary indexes on that table. Use this estimate to measure
     * whether a local secondary index is approaching its size limit.
     * </p>
     * <p>
     * The estimate is subject to change over time; therefore, do not rely on the precision or accuracy of the estimate.
     * </p>
     * 
     * @param sizeEstimateRangeGB
     *        An estimate of item collection size, in gigabytes. This value is a two-element array containing a lower
     *        bound and an upper bound for the estimate. The estimate includes the size of all the items in the table,
     *        plus the size of all attributes projected into all of the local secondary indexes on that table. Use this
     *        estimate to measure whether a local secondary index is approaching its size limit.</p>
     *        <p>
     *        The estimate is subject to change over time; therefore, do not rely on the precision or accuracy of the
     *        estimate.
     */

    public void setSizeEstimateRangeGB(java.util.Collection<Double> sizeEstimateRangeGB) {
        if (sizeEstimateRangeGB == null) {
            this.sizeEstimateRangeGB = null;
            return;
        }

        this.sizeEstimateRangeGB = new java.util.ArrayList<Double>(sizeEstimateRangeGB);
    }

    /**
     * <p>
     * An estimate of item collection size, in gigabytes. This value is a two-element array containing a lower bound and
     * an upper bound for the estimate. The estimate includes the size of all the items in the table, plus the size of
     * all attributes projected into all of the local secondary indexes on that table. Use this estimate to measure
     * whether a local secondary index is approaching its size limit.
     * </p>
     * <p>
     * The estimate is subject to change over time; therefore, do not rely on the precision or accuracy of the estimate.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSizeEstimateRangeGB(java.util.Collection)} or {@link #withSizeEstimateRangeGB(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param sizeEstimateRangeGB
     *        An estimate of item collection size, in gigabytes. This value is a two-element array containing a lower
     *        bound and an upper bound for the estimate. The estimate includes the size of all the items in the table,
     *        plus the size of all attributes projected into all of the local secondary indexes on that table. Use this
     *        estimate to measure whether a local secondary index is approaching its size limit.</p>
     *        <p>
     *        The estimate is subject to change over time; therefore, do not rely on the precision or accuracy of the
     *        estimate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ItemCollectionMetrics withSizeEstimateRangeGB(Double... sizeEstimateRangeGB) {
        if (this.sizeEstimateRangeGB == null) {
            setSizeEstimateRangeGB(new java.util.ArrayList<Double>(sizeEstimateRangeGB.length));
        }
        for (Double ele : sizeEstimateRangeGB) {
            this.sizeEstimateRangeGB.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An estimate of item collection size, in gigabytes. This value is a two-element array containing a lower bound and
     * an upper bound for the estimate. The estimate includes the size of all the items in the table, plus the size of
     * all attributes projected into all of the local secondary indexes on that table. Use this estimate to measure
     * whether a local secondary index is approaching its size limit.
     * </p>
     * <p>
     * The estimate is subject to change over time; therefore, do not rely on the precision or accuracy of the estimate.
     * </p>
     * 
     * @param sizeEstimateRangeGB
     *        An estimate of item collection size, in gigabytes. This value is a two-element array containing a lower
     *        bound and an upper bound for the estimate. The estimate includes the size of all the items in the table,
     *        plus the size of all attributes projected into all of the local secondary indexes on that table. Use this
     *        estimate to measure whether a local secondary index is approaching its size limit.</p>
     *        <p>
     *        The estimate is subject to change over time; therefore, do not rely on the precision or accuracy of the
     *        estimate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ItemCollectionMetrics withSizeEstimateRangeGB(java.util.Collection<Double> sizeEstimateRangeGB) {
        setSizeEstimateRangeGB(sizeEstimateRangeGB);
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
        if (getItemCollectionKey() != null)
            sb.append("ItemCollectionKey: ").append(getItemCollectionKey()).append(",");
        if (getSizeEstimateRangeGB() != null)
            sb.append("SizeEstimateRangeGB: ").append(getSizeEstimateRangeGB());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ItemCollectionMetrics == false)
            return false;
        ItemCollectionMetrics other = (ItemCollectionMetrics) obj;
        if (other.getItemCollectionKey() == null ^ this.getItemCollectionKey() == null)
            return false;
        if (other.getItemCollectionKey() != null && other.getItemCollectionKey().equals(this.getItemCollectionKey()) == false)
            return false;
        if (other.getSizeEstimateRangeGB() == null ^ this.getSizeEstimateRangeGB() == null)
            return false;
        if (other.getSizeEstimateRangeGB() != null && other.getSizeEstimateRangeGB().equals(this.getSizeEstimateRangeGB()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getItemCollectionKey() == null) ? 0 : getItemCollectionKey().hashCode());
        hashCode = prime * hashCode + ((getSizeEstimateRangeGB() == null) ? 0 : getSizeEstimateRangeGB().hashCode());
        return hashCode;
    }

    @Override
    public ItemCollectionMetrics clone() {
        try {
            return (ItemCollectionMetrics) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dynamodbv2.model.transform.ItemCollectionMetricsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
