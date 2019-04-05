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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/SegmentResponse" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SegmentResponse implements Serializable, Cloneable, StructuredPojo {

    /** The ID of the application that the segment applies to. */
    private String applicationId;
    /** The arn for the segment. */
    private String arn;
    /** The date and time when the segment was created. */
    private String creationDate;
    /** The segment dimensions attributes. */
    private SegmentDimensions dimensions;
    /** The unique segment ID. */
    private String id;
    /** The import job settings. */
    private SegmentImportResource importDefinition;
    /** The date and time when the segment was last modified. */
    private String lastModifiedDate;
    /** The name of the segment. */
    private String name;
    /**
     * A segment group, which consists of zero or more source segments, plus dimensions that are applied to those source
     * segments.
     */
    private SegmentGroupList segmentGroups;
    /**
     * The segment type: DIMENSIONAL - A dynamic segment built from selection criteria based on endpoint data reported
     * by your app. You create this type of segment by using the segment builder in the Amazon Pinpoint console or by
     * making a POST request to the segments resource. IMPORT - A static segment built from an imported set of endpoint
     * definitions. You create this type of segment by importing a segment in the Amazon Pinpoint console or by making a
     * POST request to the jobs/import resource.
     */
    private String segmentType;
    /** The Tags for the segment. */
    private java.util.Map<String, String> tags;
    /** The segment version number. */
    private Integer version;

    /**
     * The ID of the application that the segment applies to.
     * 
     * @param applicationId
     *        The ID of the application that the segment applies to.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * The ID of the application that the segment applies to.
     * 
     * @return The ID of the application that the segment applies to.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * The ID of the application that the segment applies to.
     * 
     * @param applicationId
     *        The ID of the application that the segment applies to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SegmentResponse withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * The arn for the segment.
     * 
     * @param arn
     *        The arn for the segment.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * The arn for the segment.
     * 
     * @return The arn for the segment.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * The arn for the segment.
     * 
     * @param arn
     *        The arn for the segment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SegmentResponse withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * The date and time when the segment was created.
     * 
     * @param creationDate
     *        The date and time when the segment was created.
     */

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * The date and time when the segment was created.
     * 
     * @return The date and time when the segment was created.
     */

    public String getCreationDate() {
        return this.creationDate;
    }

    /**
     * The date and time when the segment was created.
     * 
     * @param creationDate
     *        The date and time when the segment was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SegmentResponse withCreationDate(String creationDate) {
        setCreationDate(creationDate);
        return this;
    }

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

    public SegmentResponse withDimensions(SegmentDimensions dimensions) {
        setDimensions(dimensions);
        return this;
    }

    /**
     * The unique segment ID.
     * 
     * @param id
     *        The unique segment ID.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * The unique segment ID.
     * 
     * @return The unique segment ID.
     */

    public String getId() {
        return this.id;
    }

    /**
     * The unique segment ID.
     * 
     * @param id
     *        The unique segment ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SegmentResponse withId(String id) {
        setId(id);
        return this;
    }

    /**
     * The import job settings.
     * 
     * @param importDefinition
     *        The import job settings.
     */

    public void setImportDefinition(SegmentImportResource importDefinition) {
        this.importDefinition = importDefinition;
    }

    /**
     * The import job settings.
     * 
     * @return The import job settings.
     */

    public SegmentImportResource getImportDefinition() {
        return this.importDefinition;
    }

    /**
     * The import job settings.
     * 
     * @param importDefinition
     *        The import job settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SegmentResponse withImportDefinition(SegmentImportResource importDefinition) {
        setImportDefinition(importDefinition);
        return this;
    }

    /**
     * The date and time when the segment was last modified.
     * 
     * @param lastModifiedDate
     *        The date and time when the segment was last modified.
     */

    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * The date and time when the segment was last modified.
     * 
     * @return The date and time when the segment was last modified.
     */

    public String getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * The date and time when the segment was last modified.
     * 
     * @param lastModifiedDate
     *        The date and time when the segment was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SegmentResponse withLastModifiedDate(String lastModifiedDate) {
        setLastModifiedDate(lastModifiedDate);
        return this;
    }

    /**
     * The name of the segment.
     * 
     * @param name
     *        The name of the segment.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The name of the segment.
     * 
     * @return The name of the segment.
     */

    public String getName() {
        return this.name;
    }

    /**
     * The name of the segment.
     * 
     * @param name
     *        The name of the segment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SegmentResponse withName(String name) {
        setName(name);
        return this;
    }

    /**
     * A segment group, which consists of zero or more source segments, plus dimensions that are applied to those source
     * segments.
     * 
     * @param segmentGroups
     *        A segment group, which consists of zero or more source segments, plus dimensions that are applied to those
     *        source segments.
     */

    public void setSegmentGroups(SegmentGroupList segmentGroups) {
        this.segmentGroups = segmentGroups;
    }

    /**
     * A segment group, which consists of zero or more source segments, plus dimensions that are applied to those source
     * segments.
     * 
     * @return A segment group, which consists of zero or more source segments, plus dimensions that are applied to
     *         those source segments.
     */

    public SegmentGroupList getSegmentGroups() {
        return this.segmentGroups;
    }

    /**
     * A segment group, which consists of zero or more source segments, plus dimensions that are applied to those source
     * segments.
     * 
     * @param segmentGroups
     *        A segment group, which consists of zero or more source segments, plus dimensions that are applied to those
     *        source segments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SegmentResponse withSegmentGroups(SegmentGroupList segmentGroups) {
        setSegmentGroups(segmentGroups);
        return this;
    }

    /**
     * The segment type: DIMENSIONAL - A dynamic segment built from selection criteria based on endpoint data reported
     * by your app. You create this type of segment by using the segment builder in the Amazon Pinpoint console or by
     * making a POST request to the segments resource. IMPORT - A static segment built from an imported set of endpoint
     * definitions. You create this type of segment by importing a segment in the Amazon Pinpoint console or by making a
     * POST request to the jobs/import resource.
     * 
     * @param segmentType
     *        The segment type: DIMENSIONAL - A dynamic segment built from selection criteria based on endpoint data
     *        reported by your app. You create this type of segment by using the segment builder in the Amazon Pinpoint
     *        console or by making a POST request to the segments resource. IMPORT - A static segment built from an
     *        imported set of endpoint definitions. You create this type of segment by importing a segment in the Amazon
     *        Pinpoint console or by making a POST request to the jobs/import resource.
     * @see SegmentType
     */

    public void setSegmentType(String segmentType) {
        this.segmentType = segmentType;
    }

    /**
     * The segment type: DIMENSIONAL - A dynamic segment built from selection criteria based on endpoint data reported
     * by your app. You create this type of segment by using the segment builder in the Amazon Pinpoint console or by
     * making a POST request to the segments resource. IMPORT - A static segment built from an imported set of endpoint
     * definitions. You create this type of segment by importing a segment in the Amazon Pinpoint console or by making a
     * POST request to the jobs/import resource.
     * 
     * @return The segment type: DIMENSIONAL - A dynamic segment built from selection criteria based on endpoint data
     *         reported by your app. You create this type of segment by using the segment builder in the Amazon Pinpoint
     *         console or by making a POST request to the segments resource. IMPORT - A static segment built from an
     *         imported set of endpoint definitions. You create this type of segment by importing a segment in the
     *         Amazon Pinpoint console or by making a POST request to the jobs/import resource.
     * @see SegmentType
     */

    public String getSegmentType() {
        return this.segmentType;
    }

    /**
     * The segment type: DIMENSIONAL - A dynamic segment built from selection criteria based on endpoint data reported
     * by your app. You create this type of segment by using the segment builder in the Amazon Pinpoint console or by
     * making a POST request to the segments resource. IMPORT - A static segment built from an imported set of endpoint
     * definitions. You create this type of segment by importing a segment in the Amazon Pinpoint console or by making a
     * POST request to the jobs/import resource.
     * 
     * @param segmentType
     *        The segment type: DIMENSIONAL - A dynamic segment built from selection criteria based on endpoint data
     *        reported by your app. You create this type of segment by using the segment builder in the Amazon Pinpoint
     *        console or by making a POST request to the segments resource. IMPORT - A static segment built from an
     *        imported set of endpoint definitions. You create this type of segment by importing a segment in the Amazon
     *        Pinpoint console or by making a POST request to the jobs/import resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SegmentType
     */

    public SegmentResponse withSegmentType(String segmentType) {
        setSegmentType(segmentType);
        return this;
    }

    /**
     * The segment type: DIMENSIONAL - A dynamic segment built from selection criteria based on endpoint data reported
     * by your app. You create this type of segment by using the segment builder in the Amazon Pinpoint console or by
     * making a POST request to the segments resource. IMPORT - A static segment built from an imported set of endpoint
     * definitions. You create this type of segment by importing a segment in the Amazon Pinpoint console or by making a
     * POST request to the jobs/import resource.
     * 
     * @param segmentType
     *        The segment type: DIMENSIONAL - A dynamic segment built from selection criteria based on endpoint data
     *        reported by your app. You create this type of segment by using the segment builder in the Amazon Pinpoint
     *        console or by making a POST request to the segments resource. IMPORT - A static segment built from an
     *        imported set of endpoint definitions. You create this type of segment by importing a segment in the Amazon
     *        Pinpoint console or by making a POST request to the jobs/import resource.
     * @see SegmentType
     */

    public void setSegmentType(SegmentType segmentType) {
        withSegmentType(segmentType);
    }

    /**
     * The segment type: DIMENSIONAL - A dynamic segment built from selection criteria based on endpoint data reported
     * by your app. You create this type of segment by using the segment builder in the Amazon Pinpoint console or by
     * making a POST request to the segments resource. IMPORT - A static segment built from an imported set of endpoint
     * definitions. You create this type of segment by importing a segment in the Amazon Pinpoint console or by making a
     * POST request to the jobs/import resource.
     * 
     * @param segmentType
     *        The segment type: DIMENSIONAL - A dynamic segment built from selection criteria based on endpoint data
     *        reported by your app. You create this type of segment by using the segment builder in the Amazon Pinpoint
     *        console or by making a POST request to the segments resource. IMPORT - A static segment built from an
     *        imported set of endpoint definitions. You create this type of segment by importing a segment in the Amazon
     *        Pinpoint console or by making a POST request to the jobs/import resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SegmentType
     */

    public SegmentResponse withSegmentType(SegmentType segmentType) {
        this.segmentType = segmentType.toString();
        return this;
    }

    /**
     * The Tags for the segment.
     * 
     * @return The Tags for the segment.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * The Tags for the segment.
     * 
     * @param tags
     *        The Tags for the segment.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * The Tags for the segment.
     * 
     * @param tags
     *        The Tags for the segment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SegmentResponse withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    public SegmentResponse addTagsEntry(String key, String value) {
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

    public SegmentResponse clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * The segment version number.
     * 
     * @param version
     *        The segment version number.
     */

    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * The segment version number.
     * 
     * @return The segment version number.
     */

    public Integer getVersion() {
        return this.version;
    }

    /**
     * The segment version number.
     * 
     * @param version
     *        The segment version number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SegmentResponse withVersion(Integer version) {
        setVersion(version);
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getDimensions() != null)
            sb.append("Dimensions: ").append(getDimensions()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getImportDefinition() != null)
            sb.append("ImportDefinition: ").append(getImportDefinition()).append(",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: ").append(getLastModifiedDate()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSegmentGroups() != null)
            sb.append("SegmentGroups: ").append(getSegmentGroups()).append(",");
        if (getSegmentType() != null)
            sb.append("SegmentType: ").append(getSegmentType()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SegmentResponse == false)
            return false;
        SegmentResponse other = (SegmentResponse) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getDimensions() == null ^ this.getDimensions() == null)
            return false;
        if (other.getDimensions() != null && other.getDimensions().equals(this.getDimensions()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getImportDefinition() == null ^ this.getImportDefinition() == null)
            return false;
        if (other.getImportDefinition() != null && other.getImportDefinition().equals(this.getImportDefinition()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSegmentGroups() == null ^ this.getSegmentGroups() == null)
            return false;
        if (other.getSegmentGroups() != null && other.getSegmentGroups().equals(this.getSegmentGroups()) == false)
            return false;
        if (other.getSegmentType() == null ^ this.getSegmentType() == null)
            return false;
        if (other.getSegmentType() != null && other.getSegmentType().equals(this.getSegmentType()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getDimensions() == null) ? 0 : getDimensions().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getImportDefinition() == null) ? 0 : getImportDefinition().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSegmentGroups() == null) ? 0 : getSegmentGroups().hashCode());
        hashCode = prime * hashCode + ((getSegmentType() == null) ? 0 : getSegmentType().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public SegmentResponse clone() {
        try {
            return (SegmentResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.SegmentResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
