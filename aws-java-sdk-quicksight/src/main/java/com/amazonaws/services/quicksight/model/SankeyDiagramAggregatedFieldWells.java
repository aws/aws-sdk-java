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
 * The field well configuration of a sankey diagram.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/SankeyDiagramAggregatedFieldWells"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SankeyDiagramAggregatedFieldWells implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The source field wells of a sankey diagram.
     * </p>
     */
    private java.util.List<DimensionField> source;
    /**
     * <p>
     * The destination field wells of a sankey diagram.
     * </p>
     */
    private java.util.List<DimensionField> destination;
    /**
     * <p>
     * The weight field wells of a sankey diagram.
     * </p>
     */
    private java.util.List<MeasureField> weight;

    /**
     * <p>
     * The source field wells of a sankey diagram.
     * </p>
     * 
     * @return The source field wells of a sankey diagram.
     */

    public java.util.List<DimensionField> getSource() {
        return source;
    }

    /**
     * <p>
     * The source field wells of a sankey diagram.
     * </p>
     * 
     * @param source
     *        The source field wells of a sankey diagram.
     */

    public void setSource(java.util.Collection<DimensionField> source) {
        if (source == null) {
            this.source = null;
            return;
        }

        this.source = new java.util.ArrayList<DimensionField>(source);
    }

    /**
     * <p>
     * The source field wells of a sankey diagram.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSource(java.util.Collection)} or {@link #withSource(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param source
     *        The source field wells of a sankey diagram.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SankeyDiagramAggregatedFieldWells withSource(DimensionField... source) {
        if (this.source == null) {
            setSource(new java.util.ArrayList<DimensionField>(source.length));
        }
        for (DimensionField ele : source) {
            this.source.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The source field wells of a sankey diagram.
     * </p>
     * 
     * @param source
     *        The source field wells of a sankey diagram.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SankeyDiagramAggregatedFieldWells withSource(java.util.Collection<DimensionField> source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * The destination field wells of a sankey diagram.
     * </p>
     * 
     * @return The destination field wells of a sankey diagram.
     */

    public java.util.List<DimensionField> getDestination() {
        return destination;
    }

    /**
     * <p>
     * The destination field wells of a sankey diagram.
     * </p>
     * 
     * @param destination
     *        The destination field wells of a sankey diagram.
     */

    public void setDestination(java.util.Collection<DimensionField> destination) {
        if (destination == null) {
            this.destination = null;
            return;
        }

        this.destination = new java.util.ArrayList<DimensionField>(destination);
    }

    /**
     * <p>
     * The destination field wells of a sankey diagram.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDestination(java.util.Collection)} or {@link #withDestination(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param destination
     *        The destination field wells of a sankey diagram.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SankeyDiagramAggregatedFieldWells withDestination(DimensionField... destination) {
        if (this.destination == null) {
            setDestination(new java.util.ArrayList<DimensionField>(destination.length));
        }
        for (DimensionField ele : destination) {
            this.destination.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The destination field wells of a sankey diagram.
     * </p>
     * 
     * @param destination
     *        The destination field wells of a sankey diagram.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SankeyDiagramAggregatedFieldWells withDestination(java.util.Collection<DimensionField> destination) {
        setDestination(destination);
        return this;
    }

    /**
     * <p>
     * The weight field wells of a sankey diagram.
     * </p>
     * 
     * @return The weight field wells of a sankey diagram.
     */

    public java.util.List<MeasureField> getWeight() {
        return weight;
    }

    /**
     * <p>
     * The weight field wells of a sankey diagram.
     * </p>
     * 
     * @param weight
     *        The weight field wells of a sankey diagram.
     */

    public void setWeight(java.util.Collection<MeasureField> weight) {
        if (weight == null) {
            this.weight = null;
            return;
        }

        this.weight = new java.util.ArrayList<MeasureField>(weight);
    }

    /**
     * <p>
     * The weight field wells of a sankey diagram.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWeight(java.util.Collection)} or {@link #withWeight(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param weight
     *        The weight field wells of a sankey diagram.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SankeyDiagramAggregatedFieldWells withWeight(MeasureField... weight) {
        if (this.weight == null) {
            setWeight(new java.util.ArrayList<MeasureField>(weight.length));
        }
        for (MeasureField ele : weight) {
            this.weight.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The weight field wells of a sankey diagram.
     * </p>
     * 
     * @param weight
     *        The weight field wells of a sankey diagram.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SankeyDiagramAggregatedFieldWells withWeight(java.util.Collection<MeasureField> weight) {
        setWeight(weight);
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
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getDestination() != null)
            sb.append("Destination: ").append(getDestination()).append(",");
        if (getWeight() != null)
            sb.append("Weight: ").append(getWeight());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SankeyDiagramAggregatedFieldWells == false)
            return false;
        SankeyDiagramAggregatedFieldWells other = (SankeyDiagramAggregatedFieldWells) obj;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null && other.getDestination().equals(this.getDestination()) == false)
            return false;
        if (other.getWeight() == null ^ this.getWeight() == null)
            return false;
        if (other.getWeight() != null && other.getWeight().equals(this.getWeight()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode + ((getWeight() == null) ? 0 : getWeight().hashCode());
        return hashCode;
    }

    @Override
    public SankeyDiagramAggregatedFieldWells clone() {
        try {
            return (SankeyDiagramAggregatedFieldWells) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.SankeyDiagramAggregatedFieldWellsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
