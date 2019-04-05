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
 * Segment definition.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/WriteSegmentRequest" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WriteSegmentRequest implements Serializable, Cloneable, StructuredPojo {

    /** The segment dimensions attributes. */
    private SegmentDimensions dimensions;
    /** The name of segment */
    private String name;
    /**
     * A segment group, which consists of zero or more source segments, plus dimensions that are applied to those source
     * segments. Your request can only include one segment group. Your request can include either a SegmentGroups object
     * or a Dimensions object, but not both.
     */
    private SegmentGroupList segmentGroups;
    /** The Tags for the segments. */
    private java.util.Map<String, String> tags;

    /**
     * The segment dimensions attributes.
     * 
     * @param dimensions
     *        The segment dimensions attributes.
     */

    public void setDimensions(SegmentDimensions dimensions) {
        this.dimensions = dimensions;
    }

    /**
     * The segment dimensions attributes.
     * 
     * @return The segment dimensions attributes.
     */

    public SegmentDimensions getDimensions() {
        return this.dimensions;
    }

    /**
     * The segment dimensions attributes.
     * 
     * @param dimensions
     *        The segment dimensions attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WriteSegmentRequest withDimensions(SegmentDimensions dimensions) {
        setDimensions(dimensions);
        return this;
    }

    /**
     * The name of segment
     * 
     * @param name
     *        The name of segment
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The name of segment
     * 
     * @return The name of segment
     */

    public String getName() {
        return this.name;
    }

    /**
     * The name of segment
     * 
     * @param name
     *        The name of segment
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WriteSegmentRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * A segment group, which consists of zero or more source segments, plus dimensions that are applied to those source
     * segments. Your request can only include one segment group. Your request can include either a SegmentGroups object
     * or a Dimensions object, but not both.
     * 
     * @param segmentGroups
     *        A segment group, which consists of zero or more source segments, plus dimensions that are applied to those
     *        source segments. Your request can only include one segment group. Your request can include either a
     *        SegmentGroups object or a Dimensions object, but not both.
     */

    public void setSegmentGroups(SegmentGroupList segmentGroups) {
        this.segmentGroups = segmentGroups;
    }

    /**
     * A segment group, which consists of zero or more source segments, plus dimensions that are applied to those source
     * segments. Your request can only include one segment group. Your request can include either a SegmentGroups object
     * or a Dimensions object, but not both.
     * 
     * @return A segment group, which consists of zero or more source segments, plus dimensions that are applied to
     *         those source segments. Your request can only include one segment group. Your request can include either a
     *         SegmentGroups object or a Dimensions object, but not both.
     */

    public SegmentGroupList getSegmentGroups() {
        return this.segmentGroups;
    }

    /**
     * A segment group, which consists of zero or more source segments, plus dimensions that are applied to those source
     * segments. Your request can only include one segment group. Your request can include either a SegmentGroups object
     * or a Dimensions object, but not both.
     * 
     * @param segmentGroups
     *        A segment group, which consists of zero or more source segments, plus dimensions that are applied to those
     *        source segments. Your request can only include one segment group. Your request can include either a
     *        SegmentGroups object or a Dimensions object, but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WriteSegmentRequest withSegmentGroups(SegmentGroupList segmentGroups) {
        setSegmentGroups(segmentGroups);
        return this;
    }

    /**
     * The Tags for the segments.
     * 
     * @return The Tags for the segments.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * The Tags for the segments.
     * 
     * @param tags
     *        The Tags for the segments.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * The Tags for the segments.
     * 
     * @param tags
     *        The Tags for the segments.
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
