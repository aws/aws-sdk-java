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
 * <p>
 * Specifies the configuration, dimension, and other settings for a segment. A WriteSegmentRequest object can include a
 * Dimensions object or a SegmentGroups object, but not both.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/WriteSegmentRequest" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WriteSegmentRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The criteria that define the dimensions for the segment.
     * </p>
     */
    private SegmentDimensions dimensions;
    /**
     * <p>
     * The name of the segment.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The segment group to use and the dimensions to apply to the group's base segments in order to build the segment.
     * A segment group can consist of zero or more base segments. Your request can include only one segment group.
     * </p>
     */
    private SegmentGroupList segmentGroups;
    /**
     * <p>
     * A string-to-string map of key-value pairs that defines the tags to associate with the segment. Each tag consists
     * of a required tag key and an associated tag value.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The criteria that define the dimensions for the segment.
     * </p>
     * 
     * @param dimensions
     *        The criteria that define the dimensions for the segment.
     */

    public void setDimensions(SegmentDimensions dimensions) {
        this.dimensions = dimensions;
    }

    /**
     * <p>
     * The criteria that define the dimensions for the segment.
     * </p>
     * 
     * @return The criteria that define the dimensions for the segment.
     */

    public SegmentDimensions getDimensions() {
        return this.dimensions;
    }

    /**
     * <p>
     * The criteria that define the dimensions for the segment.
     * </p>
     * 
     * @param dimensions
     *        The criteria that define the dimensions for the segment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WriteSegmentRequest withDimensions(SegmentDimensions dimensions) {
        setDimensions(dimensions);
        return this;
    }

    /**
     * <p>
     * The name of the segment.
     * </p>
     * 
     * @param name
     *        The name of the segment.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the segment.
     * </p>
     * 
     * @return The name of the segment.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the segment.
     * </p>
     * 
     * @param name
     *        The name of the segment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WriteSegmentRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The segment group to use and the dimensions to apply to the group's base segments in order to build the segment.
     * A segment group can consist of zero or more base segments. Your request can include only one segment group.
     * </p>
     * 
     * @param segmentGroups
     *        The segment group to use and the dimensions to apply to the group's base segments in order to build the
     *        segment. A segment group can consist of zero or more base segments. Your request can include only one
     *        segment group.
     */

    public void setSegmentGroups(SegmentGroupList segmentGroups) {
        this.segmentGroups = segmentGroups;
    }

    /**
     * <p>
     * The segment group to use and the dimensions to apply to the group's base segments in order to build the segment.
     * A segment group can consist of zero or more base segments. Your request can include only one segment group.
     * </p>
     * 
     * @return The segment group to use and the dimensions to apply to the group's base segments in order to build the
     *         segment. A segment group can consist of zero or more base segments. Your request can include only one
     *         segment group.
     */

    public SegmentGroupList getSegmentGroups() {
        return this.segmentGroups;
    }

    /**
     * <p>
     * The segment group to use and the dimensions to apply to the group's base segments in order to build the segment.
     * A segment group can consist of zero or more base segments. Your request can include only one segment group.
     * </p>
     * 
     * @param segmentGroups
     *        The segment group to use and the dimensions to apply to the group's base segments in order to build the
     *        segment. A segment group can consist of zero or more base segments. Your request can include only one
     *        segment group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WriteSegmentRequest withSegmentGroups(SegmentGroupList segmentGroups) {
        setSegmentGroups(segmentGroups);
        return this;
    }

    /**
     * <p>
     * A string-to-string map of key-value pairs that defines the tags to associate with the segment. Each tag consists
     * of a required tag key and an associated tag value.
     * </p>
     * 
     * @return A string-to-string map of key-value pairs that defines the tags to associate with the segment. Each tag
     *         consists of a required tag key and an associated tag value.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A string-to-string map of key-value pairs that defines the tags to associate with the segment. Each tag consists
     * of a required tag key and an associated tag value.
     * </p>
     * 
     * @param tags
     *        A string-to-string map of key-value pairs that defines the tags to associate with the segment. Each tag
     *        consists of a required tag key and an associated tag value.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A string-to-string map of key-value pairs that defines the tags to associate with the segment. Each tag consists
     * of a required tag key and an associated tag value.
     * </p>
     * 
     * @param tags
     *        A string-to-string map of key-value pairs that defines the tags to associate with the segment. Each tag
     *        consists of a required tag key and an associated tag value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WriteSegmentRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    public WriteSegmentRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WriteSegmentRequest clearTagsEntries() {
        this.tags = null;
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSegmentGroups() != null)
            sb.append("SegmentGroups: ").append(getSegmentGroups()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WriteSegmentRequest == false)
            return false;
        WriteSegmentRequest other = (WriteSegmentRequest) obj;
        if (other.getDimensions() == null ^ this.getDimensions() == null)
            return false;
        if (other.getDimensions() != null && other.getDimensions().equals(this.getDimensions()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSegmentGroups() == null ^ this.getSegmentGroups() == null)
            return false;
        if (other.getSegmentGroups() != null && other.getSegmentGroups().equals(this.getSegmentGroups()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDimensions() == null) ? 0 : getDimensions().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSegmentGroups() == null) ? 0 : getSegmentGroups().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public WriteSegmentRequest clone() {
        try {
            return (WriteSegmentRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.WriteSegmentRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
