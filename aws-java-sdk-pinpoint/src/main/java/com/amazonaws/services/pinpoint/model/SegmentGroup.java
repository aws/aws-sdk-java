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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Segment group definition.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/SegmentGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SegmentGroup implements Serializable, Cloneable, StructuredPojo {

    /** List of dimensions to include or exclude. */
    private java.util.List<SegmentDimensions> dimensions;
    /**
     * The base segment that you build your segment on. The source segment defines the starting "universe" of endpoints.
     * When you add dimensions to the segment, it filters the source segment based on the dimensions that you specify.
     * You can specify more than one dimensional segment. You can only specify one imported segment.
     * 
     * NOTE: If you specify an imported segment for this attribute, the segment size estimate that appears in the Amazon
     * Pinpoint console shows the size of the imported segment, without any filters applied to it.
     */
    private java.util.List<SegmentReference> sourceSegments;
    /**
     * Specify how to handle multiple source segments. For example, if you specify three source segments, should the
     * resulting segment be based on any or all of the segments? Acceptable values: ANY or ALL.
     */
    private String sourceType;
    /**
     * Specify how to handle multiple segment dimensions. For example, if you specify three dimensions, should the
     * resulting segment include endpoints that are matched by all, any, or none of the dimensions? Acceptable values:
     * ALL, ANY, or NONE.
     */
    private String type;

    /**
     * List of dimensions to include or exclude.
     * 
     * @return List of dimensions to include or exclude.
     */

    public java.util.List<SegmentDimensions> getDimensions() {
        return dimensions;
    }

    /**
     * List of dimensions to include or exclude.
     * 
     * @param dimensions
     *        List of dimensions to include or exclude.
     */

    public void setDimensions(java.util.Collection<SegmentDimensions> dimensions) {
        if (dimensions == null) {
            this.dimensions = null;
            return;
        }

        this.dimensions = new java.util.ArrayList<SegmentDimensions>(dimensions);
    }

    /**
     * List of dimensions to include or exclude.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDimensions(java.util.Collection)} or {@link #withDimensions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dimensions
     *        List of dimensions to include or exclude.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SegmentGroup withDimensions(SegmentDimensions... dimensions) {
        if (this.dimensions == null) {
            setDimensions(new java.util.ArrayList<SegmentDimensions>(dimensions.length));
        }
        for (SegmentDimensions ele : dimensions) {
            this.dimensions.add(ele);
        }
        return this;
    }

    /**
     * List of dimensions to include or exclude.
     * 
     * @param dimensions
     *        List of dimensions to include or exclude.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SegmentGroup withDimensions(java.util.Collection<SegmentDimensions> dimensions) {
        setDimensions(dimensions);
        return this;
    }

    /**
     * The base segment that you build your segment on. The source segment defines the starting "universe" of endpoints.
     * When you add dimensions to the segment, it filters the source segment based on the dimensions that you specify.
     * You can specify more than one dimensional segment. You can only specify one imported segment.
     * 
     * NOTE: If you specify an imported segment for this attribute, the segment size estimate that appears in the Amazon
     * Pinpoint console shows the size of the imported segment, without any filters applied to it.
     * 
     * @return The base segment that you build your segment on. The source segment defines the starting "universe" of
     *         endpoints. When you add dimensions to the segment, it filters the source segment based on the dimensions
     *         that you specify. You can specify more than one dimensional segment. You can only specify one imported
     *         segment.
     * 
     *         NOTE: If you specify an imported segment for this attribute, the segment size estimate that appears in
     *         the Amazon Pinpoint console shows the size of the imported segment, without any filters applied to it.
     */

    public java.util.List<SegmentReference> getSourceSegments() {
        return sourceSegments;
    }

    /**
     * The base segment that you build your segment on. The source segment defines the starting "universe" of endpoints.
     * When you add dimensions to the segment, it filters the source segment based on the dimensions that you specify.
     * You can specify more than one dimensional segment. You can only specify one imported segment.
     * 
     * NOTE: If you specify an imported segment for this attribute, the segment size estimate that appears in the Amazon
     * Pinpoint console shows the size of the imported segment, without any filters applied to it.
     * 
     * @param sourceSegments
     *        The base segment that you build your segment on. The source segment defines the starting "universe" of
     *        endpoints. When you add dimensions to the segment, it filters the source segment based on the dimensions
     *        that you specify. You can specify more than one dimensional segment. You can only specify one imported
     *        segment.
     * 
     *        NOTE: If you specify an imported segment for this attribute, the segment size estimate that appears in the
     *        Amazon Pinpoint console shows the size of the imported segment, without any filters applied to it.
     */

    public void setSourceSegments(java.util.Collection<SegmentReference> sourceSegments) {
        if (sourceSegments == null) {
            this.sourceSegments = null;
            return;
        }

        this.sourceSegments = new java.util.ArrayList<SegmentReference>(sourceSegments);
    }

    /**
     * The base segment that you build your segment on. The source segment defines the starting "universe" of endpoints.
     * When you add dimensions to the segment, it filters the source segment based on the dimensions that you specify.
     * You can specify more than one dimensional segment. You can only specify one imported segment.
     * 
     * NOTE: If you specify an imported segment for this attribute, the segment size estimate that appears in the Amazon
     * Pinpoint console shows the size of the imported segment, without any filters applied to it.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSourceSegments(java.util.Collection)} or {@link #withSourceSegments(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param sourceSegments
     *        The base segment that you build your segment on. The source segment defines the starting "universe" of
     *        endpoints. When you add dimensions to the segment, it filters the source segment based on the dimensions
     *        that you specify. You can specify more than one dimensional segment. You can only specify one imported
     *        segment.
     * 
     *        NOTE: If you specify an imported segment for this attribute, the segment size estimate that appears in the
     *        Amazon Pinpoint console shows the size of the imported segment, without any filters applied to it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SegmentGroup withSourceSegments(SegmentReference... sourceSegments) {
        if (this.sourceSegments == null) {
            setSourceSegments(new java.util.ArrayList<SegmentReference>(sourceSegments.length));
        }
        for (SegmentReference ele : sourceSegments) {
            this.sourceSegments.add(ele);
        }
        return this;
    }

    /**
     * The base segment that you build your segment on. The source segment defines the starting "universe" of endpoints.
     * When you add dimensions to the segment, it filters the source segment based on the dimensions that you specify.
     * You can specify more than one dimensional segment. You can only specify one imported segment.
     * 
     * NOTE: If you specify an imported segment for this attribute, the segment size estimate that appears in the Amazon
     * Pinpoint console shows the size of the imported segment, without any filters applied to it.
     * 
     * @param sourceSegments
     *        The base segment that you build your segment on. The source segment defines the starting "universe" of
     *        endpoints. When you add dimensions to the segment, it filters the source segment based on the dimensions
     *        that you specify. You can specify more than one dimensional segment. You can only specify one imported
     *        segment.
     * 
     *        NOTE: If you specify an imported segment for this attribute, the segment size estimate that appears in the
     *        Amazon Pinpoint console shows the size of the imported segment, without any filters applied to it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SegmentGroup withSourceSegments(java.util.Collection<SegmentReference> sourceSegments) {
        setSourceSegments(sourceSegments);
        return this;
    }

    /**
     * Specify how to handle multiple source segments. For example, if you specify three source segments, should the
     * resulting segment be based on any or all of the segments? Acceptable values: ANY or ALL.
     * 
     * @param sourceType
     *        Specify how to handle multiple source segments. For example, if you specify three source segments, should
     *        the resulting segment be based on any or all of the segments? Acceptable values: ANY or ALL.
     * @see SourceType
     */

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * Specify how to handle multiple source segments. For example, if you specify three source segments, should the
     * resulting segment be based on any or all of the segments? Acceptable values: ANY or ALL.
     * 
     * @return Specify how to handle multiple source segments. For example, if you specify three source segments, should
     *         the resulting segment be based on any or all of the segments? Acceptable values: ANY or ALL.
     * @see SourceType
     */

    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * Specify how to handle multiple source segments. For example, if you specify three source segments, should the
     * resulting segment be based on any or all of the segments? Acceptable values: ANY or ALL.
     * 
     * @param sourceType
     *        Specify how to handle multiple source segments. For example, if you specify three source segments, should
     *        the resulting segment be based on any or all of the segments? Acceptable values: ANY or ALL.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SourceType
     */

    public SegmentGroup withSourceType(String sourceType) {
        setSourceType(sourceType);
        return this;
    }

    /**
     * Specify how to handle multiple source segments. For example, if you specify three source segments, should the
     * resulting segment be based on any or all of the segments? Acceptable values: ANY or ALL.
     * 
     * @param sourceType
     *        Specify how to handle multiple source segments. For example, if you specify three source segments, should
     *        the resulting segment be based on any or all of the segments? Acceptable values: ANY or ALL.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SourceType
     */

    public SegmentGroup withSourceType(SourceType sourceType) {
        this.sourceType = sourceType.toString();
        return this;
    }

    /**
     * Specify how to handle multiple segment dimensions. For example, if you specify three dimensions, should the
     * resulting segment include endpoints that are matched by all, any, or none of the dimensions? Acceptable values:
     * ALL, ANY, or NONE.
     * 
     * @param type
     *        Specify how to handle multiple segment dimensions. For example, if you specify three dimensions, should
     *        the resulting segment include endpoints that are matched by all, any, or none of the dimensions?
     *        Acceptable values: ALL, ANY, or NONE.
     * @see Type
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * Specify how to handle multiple segment dimensions. For example, if you specify three dimensions, should the
     * resulting segment include endpoints that are matched by all, any, or none of the dimensions? Acceptable values:
     * ALL, ANY, or NONE.
     * 
     * @return Specify how to handle multiple segment dimensions. For example, if you specify three dimensions, should
     *         the resulting segment include endpoints that are matched by all, any, or none of the dimensions?
     *         Acceptable values: ALL, ANY, or NONE.
     * @see Type
     */

    public String getType() {
        return this.type;
    }

    /**
     * Specify how to handle multiple segment dimensions. For example, if you specify three dimensions, should the
     * resulting segment include endpoints that are matched by all, any, or none of the dimensions? Acceptable values:
     * ALL, ANY, or NONE.
     * 
     * @param type
     *        Specify how to handle multiple segment dimensions. For example, if you specify three dimensions, should
     *        the resulting segment include endpoints that are matched by all, any, or none of the dimensions?
     *        Acceptable values: ALL, ANY, or NONE.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Type
     */

    public SegmentGroup withType(String type) {
        setType(type);
        return this;
    }

    /**
     * Specify how to handle multiple segment dimensions. For example, if you specify three dimensions, should the
     * resulting segment include endpoints that are matched by all, any, or none of the dimensions? Acceptable values:
     * ALL, ANY, or NONE.
     * 
     * @param type
     *        Specify how to handle multiple segment dimensions. For example, if you specify three dimensions, should
     *        the resulting segment include endpoints that are matched by all, any, or none of the dimensions?
     *        Acceptable values: ALL, ANY, or NONE.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Type
     */

    public SegmentGroup withType(Type type) {
        this.type = type.toString();
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
        if (getSourceSegments() != null)
            sb.append("SourceSegments: ").append(getSourceSegments()).append(",");
        if (getSourceType() != null)
            sb.append("SourceType: ").append(getSourceType()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SegmentGroup == false)
            return false;
        SegmentGroup other = (SegmentGroup) obj;
        if (other.getDimensions() == null ^ this.getDimensions() == null)
            return false;
        if (other.getDimensions() != null && other.getDimensions().equals(this.getDimensions()) == false)
            return false;
        if (other.getSourceSegments() == null ^ this.getSourceSegments() == null)
            return false;
        if (other.getSourceSegments() != null && other.getSourceSegments().equals(this.getSourceSegments()) == false)
            return false;
        if (other.getSourceType() == null ^ this.getSourceType() == null)
            return false;
        if (other.getSourceType() != null && other.getSourceType().equals(this.getSourceType()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDimensions() == null) ? 0 : getDimensions().hashCode());
        hashCode = prime * hashCode + ((getSourceSegments() == null) ? 0 : getSourceSegments().hashCode());
        hashCode = prime * hashCode + ((getSourceType() == null) ? 0 : getSourceType().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public SegmentGroup clone() {
        try {
            return (SegmentGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.SegmentGroupMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
