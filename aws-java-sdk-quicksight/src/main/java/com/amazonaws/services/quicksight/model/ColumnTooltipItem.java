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
 * The tooltip item for the columns that are not part of a field well.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ColumnTooltipItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ColumnTooltipItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The target column of the tooltip item.
     * </p>
     */
    private ColumnIdentifier column;
    /**
     * <p>
     * The label of the tooltip item.
     * </p>
     */
    private String label;
    /**
     * <p>
     * The visibility of the tooltip item.
     * </p>
     */
    private String visibility;
    /**
     * <p>
     * The aggregation function of the column tooltip item.
     * </p>
     */
    private AggregationFunction aggregation;

    /**
     * <p>
     * The target column of the tooltip item.
     * </p>
     * 
     * @param column
     *        The target column of the tooltip item.
     */

    public void setColumn(ColumnIdentifier column) {
        this.column = column;
    }

    /**
     * <p>
     * The target column of the tooltip item.
     * </p>
     * 
     * @return The target column of the tooltip item.
     */

    public ColumnIdentifier getColumn() {
        return this.column;
    }

    /**
     * <p>
     * The target column of the tooltip item.
     * </p>
     * 
     * @param column
     *        The target column of the tooltip item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnTooltipItem withColumn(ColumnIdentifier column) {
        setColumn(column);
        return this;
    }

    /**
     * <p>
     * The label of the tooltip item.
     * </p>
     * 
     * @param label
     *        The label of the tooltip item.
     */

    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * <p>
     * The label of the tooltip item.
     * </p>
     * 
     * @return The label of the tooltip item.
     */

    public String getLabel() {
        return this.label;
    }

    /**
     * <p>
     * The label of the tooltip item.
     * </p>
     * 
     * @param label
     *        The label of the tooltip item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnTooltipItem withLabel(String label) {
        setLabel(label);
        return this;
    }

    /**
     * <p>
     * The visibility of the tooltip item.
     * </p>
     * 
     * @param visibility
     *        The visibility of the tooltip item.
     * @see Visibility
     */

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    /**
     * <p>
     * The visibility of the tooltip item.
     * </p>
     * 
     * @return The visibility of the tooltip item.
     * @see Visibility
     */

    public String getVisibility() {
        return this.visibility;
    }

    /**
     * <p>
     * The visibility of the tooltip item.
     * </p>
     * 
     * @param visibility
     *        The visibility of the tooltip item.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public ColumnTooltipItem withVisibility(String visibility) {
        setVisibility(visibility);
        return this;
    }

    /**
     * <p>
     * The visibility of the tooltip item.
     * </p>
     * 
     * @param visibility
     *        The visibility of the tooltip item.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public ColumnTooltipItem withVisibility(Visibility visibility) {
        this.visibility = visibility.toString();
        return this;
    }

    /**
     * <p>
     * The aggregation function of the column tooltip item.
     * </p>
     * 
     * @param aggregation
     *        The aggregation function of the column tooltip item.
     */

    public void setAggregation(AggregationFunction aggregation) {
        this.aggregation = aggregation;
    }

    /**
     * <p>
     * The aggregation function of the column tooltip item.
     * </p>
     * 
     * @return The aggregation function of the column tooltip item.
     */

    public AggregationFunction getAggregation() {
        return this.aggregation;
    }

    /**
     * <p>
     * The aggregation function of the column tooltip item.
     * </p>
     * 
     * @param aggregation
     *        The aggregation function of the column tooltip item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnTooltipItem withAggregation(AggregationFunction aggregation) {
        setAggregation(aggregation);
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
        if (getColumn() != null)
            sb.append("Column: ").append(getColumn()).append(",");
        if (getLabel() != null)
            sb.append("Label: ").append(getLabel()).append(",");
        if (getVisibility() != null)
            sb.append("Visibility: ").append(getVisibility()).append(",");
        if (getAggregation() != null)
            sb.append("Aggregation: ").append(getAggregation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ColumnTooltipItem == false)
            return false;
        ColumnTooltipItem other = (ColumnTooltipItem) obj;
        if (other.getColumn() == null ^ this.getColumn() == null)
            return false;
        if (other.getColumn() != null && other.getColumn().equals(this.getColumn()) == false)
            return false;
        if (other.getLabel() == null ^ this.getLabel() == null)
            return false;
        if (other.getLabel() != null && other.getLabel().equals(this.getLabel()) == false)
            return false;
        if (other.getVisibility() == null ^ this.getVisibility() == null)
            return false;
        if (other.getVisibility() != null && other.getVisibility().equals(this.getVisibility()) == false)
            return false;
        if (other.getAggregation() == null ^ this.getAggregation() == null)
            return false;
        if (other.getAggregation() != null && other.getAggregation().equals(this.getAggregation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getColumn() == null) ? 0 : getColumn().hashCode());
        hashCode = prime * hashCode + ((getLabel() == null) ? 0 : getLabel().hashCode());
        hashCode = prime * hashCode + ((getVisibility() == null) ? 0 : getVisibility().hashCode());
        hashCode = prime * hashCode + ((getAggregation() == null) ? 0 : getAggregation().hashCode());
        return hashCode;
    }

    @Override
    public ColumnTooltipItem clone() {
        try {
            return (ColumnTooltipItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.ColumnTooltipItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
