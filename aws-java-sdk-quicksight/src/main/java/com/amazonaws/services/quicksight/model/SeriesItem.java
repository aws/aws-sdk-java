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
 * The series item configuration of a line chart.
 * </p>
 * <p>
 * This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/SeriesItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SeriesItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The field series item configuration of a line chart.
     * </p>
     */
    private FieldSeriesItem fieldSeriesItem;
    /**
     * <p>
     * The data field series item configuration of a line chart.
     * </p>
     */
    private DataFieldSeriesItem dataFieldSeriesItem;

    /**
     * <p>
     * The field series item configuration of a line chart.
     * </p>
     * 
     * @param fieldSeriesItem
     *        The field series item configuration of a line chart.
     */

    public void setFieldSeriesItem(FieldSeriesItem fieldSeriesItem) {
        this.fieldSeriesItem = fieldSeriesItem;
    }

    /**
     * <p>
     * The field series item configuration of a line chart.
     * </p>
     * 
     * @return The field series item configuration of a line chart.
     */

    public FieldSeriesItem getFieldSeriesItem() {
        return this.fieldSeriesItem;
    }

    /**
     * <p>
     * The field series item configuration of a line chart.
     * </p>
     * 
     * @param fieldSeriesItem
     *        The field series item configuration of a line chart.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SeriesItem withFieldSeriesItem(FieldSeriesItem fieldSeriesItem) {
        setFieldSeriesItem(fieldSeriesItem);
        return this;
    }

    /**
     * <p>
     * The data field series item configuration of a line chart.
     * </p>
     * 
     * @param dataFieldSeriesItem
     *        The data field series item configuration of a line chart.
     */

    public void setDataFieldSeriesItem(DataFieldSeriesItem dataFieldSeriesItem) {
        this.dataFieldSeriesItem = dataFieldSeriesItem;
    }

    /**
     * <p>
     * The data field series item configuration of a line chart.
     * </p>
     * 
     * @return The data field series item configuration of a line chart.
     */

    public DataFieldSeriesItem getDataFieldSeriesItem() {
        return this.dataFieldSeriesItem;
    }

    /**
     * <p>
     * The data field series item configuration of a line chart.
     * </p>
     * 
     * @param dataFieldSeriesItem
     *        The data field series item configuration of a line chart.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SeriesItem withDataFieldSeriesItem(DataFieldSeriesItem dataFieldSeriesItem) {
        setDataFieldSeriesItem(dataFieldSeriesItem);
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
        if (getFieldSeriesItem() != null)
            sb.append("FieldSeriesItem: ").append(getFieldSeriesItem()).append(",");
        if (getDataFieldSeriesItem() != null)
            sb.append("DataFieldSeriesItem: ").append(getDataFieldSeriesItem());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SeriesItem == false)
            return false;
        SeriesItem other = (SeriesItem) obj;
        if (other.getFieldSeriesItem() == null ^ this.getFieldSeriesItem() == null)
            return false;
        if (other.getFieldSeriesItem() != null && other.getFieldSeriesItem().equals(this.getFieldSeriesItem()) == false)
            return false;
        if (other.getDataFieldSeriesItem() == null ^ this.getDataFieldSeriesItem() == null)
            return false;
        if (other.getDataFieldSeriesItem() != null && other.getDataFieldSeriesItem().equals(this.getDataFieldSeriesItem()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFieldSeriesItem() == null) ? 0 : getFieldSeriesItem().hashCode());
        hashCode = prime * hashCode + ((getDataFieldSeriesItem() == null) ? 0 : getDataFieldSeriesItem().hashCode());
        return hashCode;
    }

    @Override
    public SeriesItem clone() {
        try {
            return (SeriesItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.SeriesItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
