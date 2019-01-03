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
package com.amazonaws.services.pi.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An array of descriptions and aggregated values for each dimension within a dimension group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pi-2018-02-27/DimensionKeyDescription" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DimensionKeyDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A map of name-value pairs for the dimensions in the group.
     * </p>
     */
    private java.util.Map<String, String> dimensions;
    /**
     * <p>
     * The aggregated metric value for the dimension(s), over the requested time range.
     * </p>
     */
    private Double total;
    /**
     * <p>
     * If <code>PartitionBy</code> was specified, <code>PartitionKeys</code> contains the dimensions that were.
     * </p>
     */
    private java.util.List<Double> partitions;

    /**
     * <p>
     * A map of name-value pairs for the dimensions in the group.
     * </p>
     * 
     * @return A map of name-value pairs for the dimensions in the group.
     */

    public java.util.Map<String, String> getDimensions() {
        return dimensions;
    }

    /**
     * <p>
     * A map of name-value pairs for the dimensions in the group.
     * </p>
     * 
     * @param dimensions
     *        A map of name-value pairs for the dimensions in the group.
     */

    public void setDimensions(java.util.Map<String, String> dimensions) {
        this.dimensions = dimensions;
    }

    /**
     * <p>
     * A map of name-value pairs for the dimensions in the group.
     * </p>
     * 
     * @param dimensions
     *        A map of name-value pairs for the dimensions in the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DimensionKeyDescription withDimensions(java.util.Map<String, String> dimensions) {
        setDimensions(dimensions);
        return this;
    }

    public DimensionKeyDescription addDimensionsEntry(String key, String value) {
        if (null == this.dimensions) {
            this.dimensions = new java.util.HashMap<String, String>();
        }
        if (this.dimensions.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.dimensions.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Dimensions.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DimensionKeyDescription clearDimensionsEntries() {
        this.dimensions = null;
        return this;
    }

    /**
     * <p>
     * The aggregated metric value for the dimension(s), over the requested time range.
     * </p>
     * 
     * @param total
     *        The aggregated metric value for the dimension(s), over the requested time range.
     */

    public void setTotal(Double total) {
        this.total = total;
    }

    /**
     * <p>
     * The aggregated metric value for the dimension(s), over the requested time range.
     * </p>
     * 
     * @return The aggregated metric value for the dimension(s), over the requested time range.
     */

    public Double getTotal() {
        return this.total;
    }

    /**
     * <p>
     * The aggregated metric value for the dimension(s), over the requested time range.
     * </p>
     * 
     * @param total
     *        The aggregated metric value for the dimension(s), over the requested time range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DimensionKeyDescription withTotal(Double total) {
        setTotal(total);
        return this;
    }

    /**
     * <p>
     * If <code>PartitionBy</code> was specified, <code>PartitionKeys</code> contains the dimensions that were.
     * </p>
     * 
     * @return If <code>PartitionBy</code> was specified, <code>PartitionKeys</code> contains the dimensions that were.
     */

    public java.util.List<Double> getPartitions() {
        return partitions;
    }

    /**
     * <p>
     * If <code>PartitionBy</code> was specified, <code>PartitionKeys</code> contains the dimensions that were.
     * </p>
     * 
     * @param partitions
     *        If <code>PartitionBy</code> was specified, <code>PartitionKeys</code> contains the dimensions that were.
     */

    public void setPartitions(java.util.Collection<Double> partitions) {
        if (partitions == null) {
            this.partitions = null;
            return;
        }

        this.partitions = new java.util.ArrayList<Double>(partitions);
    }

    /**
     * <p>
     * If <code>PartitionBy</code> was specified, <code>PartitionKeys</code> contains the dimensions that were.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPartitions(java.util.Collection)} or {@link #withPartitions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param partitions
     *        If <code>PartitionBy</code> was specified, <code>PartitionKeys</code> contains the dimensions that were.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DimensionKeyDescription withPartitions(Double... partitions) {
        if (this.partitions == null) {
            setPartitions(new java.util.ArrayList<Double>(partitions.length));
        }
        for (Double ele : partitions) {
            this.partitions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * If <code>PartitionBy</code> was specified, <code>PartitionKeys</code> contains the dimensions that were.
     * </p>
     * 
     * @param partitions
     *        If <code>PartitionBy</code> was specified, <code>PartitionKeys</code> contains the dimensions that were.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DimensionKeyDescription withPartitions(java.util.Collection<Double> partitions) {
        setPartitions(partitions);
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
        if (getDimensions() != null)
            sb.append("Dimensions: ").append(getDimensions()).append(",");
        if (getTotal() != null)
            sb.append("Total: ").append(getTotal()).append(",");
        if (getPartitions() != null)
            sb.append("Partitions: ").append(getPartitions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DimensionKeyDescription == false)
            return false;
        DimensionKeyDescription other = (DimensionKeyDescription) obj;
        if (other.getDimensions() == null ^ this.getDimensions() == null)
            return false;
        if (other.getDimensions() != null && other.getDimensions().equals(this.getDimensions()) == false)
            return false;
        if (other.getTotal() == null ^ this.getTotal() == null)
            return false;
        if (other.getTotal() != null && other.getTotal().equals(this.getTotal()) == false)
            return false;
        if (other.getPartitions() == null ^ this.getPartitions() == null)
            return false;
        if (other.getPartitions() != null && other.getPartitions().equals(this.getPartitions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDimensions() == null) ? 0 : getDimensions().hashCode());
        hashCode = prime * hashCode + ((getTotal() == null) ? 0 : getTotal().hashCode());
        hashCode = prime * hashCode + ((getPartitions() == null) ? 0 : getPartitions().hashCode());
        return hashCode;
    }

    @Override
    public DimensionKeyDescription clone() {
        try {
            return (DimensionKeyDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pi.model.transform.DimensionKeyDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
