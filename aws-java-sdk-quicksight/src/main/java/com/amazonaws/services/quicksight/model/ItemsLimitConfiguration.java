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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The limit configuration of the visual display for an axis.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ItemsLimitConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ItemsLimitConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The limit on how many items of a field are showed in the chart. For example, the number of slices that are
     * displayed in a pie chart.
     * </p>
     */
    private Long itemsLimit;
    /**
     * <p>
     * The <code>Show other</code> of an axis in the chart. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INCLUDE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EXCLUDE</code>
     * </p>
     * </li>
     * </ul>
     */
    private String otherCategories;

    /**
     * <p>
     * The limit on how many items of a field are showed in the chart. For example, the number of slices that are
     * displayed in a pie chart.
     * </p>
     * 
     * @param itemsLimit
     *        The limit on how many items of a field are showed in the chart. For example, the number of slices that are
     *        displayed in a pie chart.
     */

    public void setItemsLimit(Long itemsLimit) {
        this.itemsLimit = itemsLimit;
    }

    /**
     * <p>
     * The limit on how many items of a field are showed in the chart. For example, the number of slices that are
     * displayed in a pie chart.
     * </p>
     * 
     * @return The limit on how many items of a field are showed in the chart. For example, the number of slices that
     *         are displayed in a pie chart.
     */

    public Long getItemsLimit() {
        return this.itemsLimit;
    }

    /**
     * <p>
     * The limit on how many items of a field are showed in the chart. For example, the number of slices that are
     * displayed in a pie chart.
     * </p>
     * 
     * @param itemsLimit
     *        The limit on how many items of a field are showed in the chart. For example, the number of slices that are
     *        displayed in a pie chart.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ItemsLimitConfiguration withItemsLimit(Long itemsLimit) {
        setItemsLimit(itemsLimit);
        return this;
    }

    /**
     * <p>
     * The <code>Show other</code> of an axis in the chart. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INCLUDE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EXCLUDE</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param otherCategories
     *        The <code>Show other</code> of an axis in the chart. Choose one of the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>INCLUDE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EXCLUDE</code>
     *        </p>
     *        </li>
     * @see OtherCategories
     */

    public void setOtherCategories(String otherCategories) {
        this.otherCategories = otherCategories;
    }

    /**
     * <p>
     * The <code>Show other</code> of an axis in the chart. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INCLUDE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EXCLUDE</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The <code>Show other</code> of an axis in the chart. Choose one of the following options:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>INCLUDE</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>EXCLUDE</code>
     *         </p>
     *         </li>
     * @see OtherCategories
     */

    public String getOtherCategories() {
        return this.otherCategories;
    }

    /**
     * <p>
     * The <code>Show other</code> of an axis in the chart. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INCLUDE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EXCLUDE</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param otherCategories
     *        The <code>Show other</code> of an axis in the chart. Choose one of the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>INCLUDE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EXCLUDE</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OtherCategories
     */

    public ItemsLimitConfiguration withOtherCategories(String otherCategories) {
        setOtherCategories(otherCategories);
        return this;
    }

    /**
     * <p>
     * The <code>Show other</code> of an axis in the chart. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INCLUDE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EXCLUDE</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param otherCategories
     *        The <code>Show other</code> of an axis in the chart. Choose one of the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>INCLUDE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EXCLUDE</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OtherCategories
     */

    public ItemsLimitConfiguration withOtherCategories(OtherCategories otherCategories) {
        this.otherCategories = otherCategories.toString();
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
        if (getItemsLimit() != null)
            sb.append("ItemsLimit: ").append(getItemsLimit()).append(",");
        if (getOtherCategories() != null)
            sb.append("OtherCategories: ").append(getOtherCategories());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ItemsLimitConfiguration == false)
            return false;
        ItemsLimitConfiguration other = (ItemsLimitConfiguration) obj;
        if (other.getItemsLimit() == null ^ this.getItemsLimit() == null)
            return false;
        if (other.getItemsLimit() != null && other.getItemsLimit().equals(this.getItemsLimit()) == false)
            return false;
        if (other.getOtherCategories() == null ^ this.getOtherCategories() == null)
            return false;
        if (other.getOtherCategories() != null && other.getOtherCategories().equals(this.getOtherCategories()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getItemsLimit() == null) ? 0 : getItemsLimit().hashCode());
        hashCode = prime * hashCode + ((getOtherCategories() == null) ? 0 : getOtherCategories().hashCode());
        return hashCode;
    }

    @Override
    public ItemsLimitConfiguration clone() {
        try {
            return (ItemsLimitConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.ItemsLimitConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
