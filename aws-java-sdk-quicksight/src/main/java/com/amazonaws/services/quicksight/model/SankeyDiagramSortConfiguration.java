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
 * The sort configuration of a sankey diagram.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/SankeyDiagramSortConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SankeyDiagramSortConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The sort configuration of the weight fields.
     * </p>
     */
    private java.util.List<FieldSortOptions> weightSort;
    /**
     * <p>
     * The limit on the number of source nodes that are displayed in a sankey diagram.
     * </p>
     */
    private ItemsLimitConfiguration sourceItemsLimit;
    /**
     * <p>
     * The limit on the number of destination nodes that are displayed in a sankey diagram.
     * </p>
     */
    private ItemsLimitConfiguration destinationItemsLimit;

    /**
     * <p>
     * The sort configuration of the weight fields.
     * </p>
     * 
     * @return The sort configuration of the weight fields.
     */

    public java.util.List<FieldSortOptions> getWeightSort() {
        return weightSort;
    }

    /**
     * <p>
     * The sort configuration of the weight fields.
     * </p>
     * 
     * @param weightSort
     *        The sort configuration of the weight fields.
     */

    public void setWeightSort(java.util.Collection<FieldSortOptions> weightSort) {
        if (weightSort == null) {
            this.weightSort = null;
            return;
        }

        this.weightSort = new java.util.ArrayList<FieldSortOptions>(weightSort);
    }

    /**
     * <p>
     * The sort configuration of the weight fields.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWeightSort(java.util.Collection)} or {@link #withWeightSort(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param weightSort
     *        The sort configuration of the weight fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SankeyDiagramSortConfiguration withWeightSort(FieldSortOptions... weightSort) {
        if (this.weightSort == null) {
            setWeightSort(new java.util.ArrayList<FieldSortOptions>(weightSort.length));
        }
        for (FieldSortOptions ele : weightSort) {
            this.weightSort.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The sort configuration of the weight fields.
     * </p>
     * 
     * @param weightSort
     *        The sort configuration of the weight fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SankeyDiagramSortConfiguration withWeightSort(java.util.Collection<FieldSortOptions> weightSort) {
        setWeightSort(weightSort);
        return this;
    }

    /**
     * <p>
     * The limit on the number of source nodes that are displayed in a sankey diagram.
     * </p>
     * 
     * @param sourceItemsLimit
     *        The limit on the number of source nodes that are displayed in a sankey diagram.
     */

    public void setSourceItemsLimit(ItemsLimitConfiguration sourceItemsLimit) {
        this.sourceItemsLimit = sourceItemsLimit;
    }

    /**
     * <p>
     * The limit on the number of source nodes that are displayed in a sankey diagram.
     * </p>
     * 
     * @return The limit on the number of source nodes that are displayed in a sankey diagram.
     */

    public ItemsLimitConfiguration getSourceItemsLimit() {
        return this.sourceItemsLimit;
    }

    /**
     * <p>
     * The limit on the number of source nodes that are displayed in a sankey diagram.
     * </p>
     * 
     * @param sourceItemsLimit
     *        The limit on the number of source nodes that are displayed in a sankey diagram.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SankeyDiagramSortConfiguration withSourceItemsLimit(ItemsLimitConfiguration sourceItemsLimit) {
        setSourceItemsLimit(sourceItemsLimit);
        return this;
    }

    /**
     * <p>
     * The limit on the number of destination nodes that are displayed in a sankey diagram.
     * </p>
     * 
     * @param destinationItemsLimit
     *        The limit on the number of destination nodes that are displayed in a sankey diagram.
     */

    public void setDestinationItemsLimit(ItemsLimitConfiguration destinationItemsLimit) {
        this.destinationItemsLimit = destinationItemsLimit;
    }

    /**
     * <p>
     * The limit on the number of destination nodes that are displayed in a sankey diagram.
     * </p>
     * 
     * @return The limit on the number of destination nodes that are displayed in a sankey diagram.
     */

    public ItemsLimitConfiguration getDestinationItemsLimit() {
        return this.destinationItemsLimit;
    }

    /**
     * <p>
     * The limit on the number of destination nodes that are displayed in a sankey diagram.
     * </p>
     * 
     * @param destinationItemsLimit
     *        The limit on the number of destination nodes that are displayed in a sankey diagram.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SankeyDiagramSortConfiguration withDestinationItemsLimit(ItemsLimitConfiguration destinationItemsLimit) {
        setDestinationItemsLimit(destinationItemsLimit);
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
        if (getWeightSort() != null)
            sb.append("WeightSort: ").append(getWeightSort()).append(",");
        if (getSourceItemsLimit() != null)
            sb.append("SourceItemsLimit: ").append(getSourceItemsLimit()).append(",");
        if (getDestinationItemsLimit() != null)
            sb.append("DestinationItemsLimit: ").append(getDestinationItemsLimit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SankeyDiagramSortConfiguration == false)
            return false;
        SankeyDiagramSortConfiguration other = (SankeyDiagramSortConfiguration) obj;
        if (other.getWeightSort() == null ^ this.getWeightSort() == null)
            return false;
        if (other.getWeightSort() != null && other.getWeightSort().equals(this.getWeightSort()) == false)
            return false;
        if (other.getSourceItemsLimit() == null ^ this.getSourceItemsLimit() == null)
            return false;
        if (other.getSourceItemsLimit() != null && other.getSourceItemsLimit().equals(this.getSourceItemsLimit()) == false)
            return false;
        if (other.getDestinationItemsLimit() == null ^ this.getDestinationItemsLimit() == null)
            return false;
        if (other.getDestinationItemsLimit() != null && other.getDestinationItemsLimit().equals(this.getDestinationItemsLimit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWeightSort() == null) ? 0 : getWeightSort().hashCode());
        hashCode = prime * hashCode + ((getSourceItemsLimit() == null) ? 0 : getSourceItemsLimit().hashCode());
        hashCode = prime * hashCode + ((getDestinationItemsLimit() == null) ? 0 : getDestinationItemsLimit().hashCode());
        return hashCode;
    }

    @Override
    public SankeyDiagramSortConfiguration clone() {
        try {
            return (SankeyDiagramSortConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.SankeyDiagramSortConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
