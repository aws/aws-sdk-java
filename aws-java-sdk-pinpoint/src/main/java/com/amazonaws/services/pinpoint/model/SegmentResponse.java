/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Provides information about the configuration, dimension, and other settings for a segment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/SegmentResponse" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SegmentResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier for the application that the segment is associated with.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the segment.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The date and time when the segment was created.
     * </p>
     */
    private String creationDate;
    /**
     * <p>
     * The dimension settings for the segment.
     * </p>
     */
    private SegmentDimensions dimensions;
    /**
     * <p>
     * The unique identifier for the segment.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The settings for the import job that's associated with the segment.
     * </p>
     */
    private SegmentImportResource importDefinition;
    /**
     * <p>
     * The date and time when the segment was last modified.
     * </p>
     */
    private String lastModifiedDate;
    /**
     * <p>
     * The name of the segment.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A list of one or more segment groups that apply to the segment. Each segment group consists of zero or more base
     * segments and the dimensions that are applied to those base segments.
     * </p>
     */
    private SegmentGroupList segmentGroups;
    /**
     * <p>
     * The segment type. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DIMENSIONAL - A dynamic segment, which is a segment that uses selection criteria that you specify and is based on
     * endpoint data that's reported by your app. Dynamic segments can change over time.
     * </p>
     * </li>
     * <li>
     * <p>
     * IMPORT - A static segment, which is a segment that uses selection criteria that you specify and is based on
     * endpoint definitions that you they don't change over time.
     * </p>
     * </li>
     * </ul>
     */
    private String segmentType;
    /**
     * <p>
     * A string-to-string map of key-value pairs that identifies the tags that are associated with the segment. Each tag
     * consists of a required tag key and an associated tag value.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The version number of the segment.
     * </p>
     */
    private Integer version;

    /**
     * <p>
     * The unique identifier for the application that the segment is associated with.
     * </p>
     * 
     * @param applicationId
     *        The unique identifier for the application that the segment is associated with.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The unique identifier for the application that the segment is associated with.
     * </p>
     * 
     * @return The unique identifier for the application that the segment is associated with.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The unique identifier for the application that the segment is associated with.
     * </p>
     * 
     * @param applicationId
     *        The unique identifier for the application that the segment is associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SegmentResponse withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the segment.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the segment.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the segment.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the segment.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the segment.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the segment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SegmentResponse withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The date and time when the segment was created.
     * </p>
     * 
     * @param creationDate
     *        The date and time when the segment was created.
     */

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date and time when the segment was created.
     * </p>
     * 
     * @return The date and time when the segment was created.
     */

    public String getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date and time when the segment was created.
     * </p>
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
     * <p>
     * The dimension settings for the segment.
     * </p>
     * 
     * @param dimensions
     *        The dimension settings for the segment.
     */

    public void setDimensions(SegmentDimensions dimensions) {
        this.dimensions = dimensions;
    }

    /**
     * <p>
     * The dimension settings for the segment.
     * </p>
     * 
     * @return The dimension settings for the segment.
     */

    public SegmentDimensions getDimensions() {
        return this.dimensions;
    }

    /**
     * <p>
     * The dimension settings for the segment.
     * </p>
     * 
     * @param dimensions
     *        The dimension settings for the segment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SegmentResponse withDimensions(SegmentDimensions dimensions) {
        setDimensions(dimensions);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the segment.
     * </p>
     * 
     * @param id
     *        The unique identifier for the segment.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier for the segment.
     * </p>
     * 
     * @return The unique identifier for the segment.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier for the segment.
     * </p>
     * 
     * @param id
     *        The unique identifier for the segment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SegmentResponse withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The settings for the import job that's associated with the segment.
     * </p>
     * 
     * @param importDefinition
     *        The settings for the import job that's associated with the segment.
     */

    public void setImportDefinition(SegmentImportResource importDefinition) {
        this.importDefinition = importDefinition;
    }

    /**
     * <p>
     * The settings for the import job that's associated with the segment.
     * </p>
     * 
     * @return The settings for the import job that's associated with the segment.
     */

    public SegmentImportResource getImportDefinition() {
        return this.importDefinition;
    }

    /**
     * <p>
     * The settings for the import job that's associated with the segment.
     * </p>
     * 
     * @param importDefinition
     *        The settings for the import job that's associated with the segment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SegmentResponse withImportDefinition(SegmentImportResource importDefinition) {
        setImportDefinition(importDefinition);
        return this;
    }

    /**
     * <p>
     * The date and time when the segment was last modified.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date and time when the segment was last modified.
     */

    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The date and time when the segment was last modified.
     * </p>
     * 
     * @return The date and time when the segment was last modified.
     */

    public String getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * <p>
     * The date and time when the segment was last modified.
     * </p>
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

    public SegmentResponse withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A list of one or more segment groups that apply to the segment. Each segment group consists of zero or more base
     * segments and the dimensions that are applied to those base segments.
     * </p>
     * 
     * @param segmentGroups
     *        A list of one or more segment groups that apply to the segment. Each segment group consists of zero or
     *        more base segments and the dimensions that are applied to those base segments.
     */

    public void setSegmentGroups(SegmentGroupList segmentGroups) {
        this.segmentGroups = segmentGroups;
    }

    /**
     * <p>
     * A list of one or more segment groups that apply to the segment. Each segment group consists of zero or more base
     * segments and the dimensions that are applied to those base segments.
     * </p>
     * 
     * @return A list of one or more segment groups that apply to the segment. Each segment group consists of zero or
     *         more base segments and the dimensions that are applied to those base segments.
     */

    public SegmentGroupList getSegmentGroups() {
        return this.segmentGroups;
    }

    /**
     * <p>
     * A list of one or more segment groups that apply to the segment. Each segment group consists of zero or more base
     * segments and the dimensions that are applied to those base segments.
     * </p>
     * 
     * @param segmentGroups
     *        A list of one or more segment groups that apply to the segment. Each segment group consists of zero or
     *        more base segments and the dimensions that are applied to those base segments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SegmentResponse withSegmentGroups(SegmentGroupList segmentGroups) {
        setSegmentGroups(segmentGroups);
        return this;
    }

    /**
     * <p>
     * The segment type. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DIMENSIONAL - A dynamic segment, which is a segment that uses selection criteria that you specify and is based on
     * endpoint data that's reported by your app. Dynamic segments can change over time.
     * </p>
     * </li>
     * <li>
     * <p>
     * IMPORT - A static segment, which is a segment that uses selection criteria that you specify and is based on
     * endpoint definitions that you import from a file. Imported segments are static; they don't change over time.
     * </p>
     * </li>
     * </ul>
     * 
     * @param segmentType
     *        The segment type. Valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        DIMENSIONAL - A dynamic segment, which is a segment that uses selection criteria that you specify and is
     *        based on endpoint data that's reported by your app. Dynamic segments can change over time.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        IMPORT - A static segment, which is a segment that uses selection criteria that you specify and is based
     *        on endpoint definitions that you import from a file. Imported segments are static; they don't change over
     *        time.
     *        </p>
     *        </li>
     * @see SegmentType
     */

    public void setSegmentType(String segmentType) {
        this.segmentType = segmentType;
    }

    /**
     * <p>
     * The segment type. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DIMENSIONAL - A dynamic segment, which is a segment that uses selection criteria that you specify and is based on
     * endpoint data that's reported by your app. Dynamic segments can change over time.
     * </p>
     * </li>
     * <li>
     * <p>
     * IMPORT - A static segment, which is a segment that uses selection criteria that you specify and is based on
     * endpoint definitions that you import from a file. Imported segments are static; they don't change over time.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The segment type. Valid values are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         DIMENSIONAL - A dynamic segment, which is a segment that uses selection criteria that you specify and is
     *         based on endpoint data that's reported by your app. Dynamic segments can change over time.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IMPORT - A static segment, which is a segment that uses selection criteria that you specify and is based
     *         on endpoint definitions that you import from a file. Imported segments are static; they don't change over
     *         time.
     *         </p>
     *         </li>
     * @see SegmentType
     */

    public String getSegmentType() {
        return this.segmentType;
    }

    /**
     * <p>
     * The segment type. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DIMENSIONAL - A dynamic segment, which is a segment that uses selection criteria that you specify and is based on
     * endpoint data that's reported by your app. Dynamic segments can change over time.
     * </p>
     * </li>
     * <li>
     * <p>
     * IMPORT - A static segment, which is a segment that uses selection criteria that you specify and is based on
     * endpoint definitions that you import from a file. Imported segments are static; they don't change over time.
     * </p>
     * </li>
     * </ul>
     * 
     * @param segmentType
     *        The segment type. Valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        DIMENSIONAL - A dynamic segment, which is a segment that uses selection criteria that you specify and is
     *        based on endpoint data that's reported by your app. Dynamic segments can change over time.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        IMPORT - A static segment, which is a segment that uses selection criteria that you specify and is based
     *        on endpoint definitions that you import from a file. Imported segments are static; they don't change over
     *        time.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SegmentType
     */

    public SegmentResponse withSegmentType(String segmentType) {
        setSegmentType(segmentType);
        return this;
    }

    /**
     * <p>
     * The segment type. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DIMENSIONAL - A dynamic segment, which is a segment that uses selection criteria that you specify and is based on
     * endpoint data that's reported by your app. Dynamic segments can change over time.
     * </p>
     * </li>
     * <li>
     * <p>
     * IMPORT - A static segment, which is a segment that uses selection criteria that you specify and is based on
     * endpoint definitions that you import from a file. Imported segments are static; they don't change over time.
     * </p>
     * </li>
     * </ul>
     * 
     * @param segmentType
     *        The segment type. Valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        DIMENSIONAL - A dynamic segment, which is a segment that uses selection criteria that you specify and is
     *        based on endpoint data that's reported by your app. Dynamic segments can change over time.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        IMPORT - A static segment, which is a segment that uses selection criteria that you specify and is based
     *        on endpoint definitions that you import from a file. Imported segments are static; they don't change over
     *        time.
     *        </p>
     *        </li>
     * @see SegmentType
     */

    public void setSegmentType(SegmentType segmentType) {
        withSegmentType(segmentType);
    }

    /**
     * <p>
     * The segment type. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DIMENSIONAL - A dynamic segment, which is a segment that uses selection criteria that you specify and is based on
     * endpoint data that's reported by your app. Dynamic segments can change over time.
     * </p>
     * </li>
     * <li>
     * <p>
     * IMPORT - A static segment, which is a segment that uses selection criteria that you specify and is based on
     * endpoint definitions that you import from a file. Imported segments are static; they don't change over time.
     * </p>
     * </li>
     * </ul>
     * 
     * @param segmentType
     *        The segment type. Valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        DIMENSIONAL - A dynamic segment, which is a segment that uses selection criteria that you specify and is
     *        based on endpoint data that's reported by your app. Dynamic segments can change over time.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        IMPORT - A static segment, which is a segment that uses selection criteria that you specify and is based
     *        on endpoint definitions that you import from a file. Imported segments are static; they don't change over
     *        time.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SegmentType
     */

    public SegmentResponse withSegmentType(SegmentType segmentType) {
        this.segmentType = segmentType.toString();
        return this;
    }

    /**
     * <p>
     * A string-to-string map of key-value pairs that identifies the tags that are associated with the segment. Each tag
     * consists of a required tag key and an associated tag value.
     * </p>
     * 
     * @return A string-to-string map of key-value pairs that identifies the tags that are associated with the segment.
     *         Each tag consists of a required tag key and an associated tag value.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A string-to-string map of key-value pairs that identifies the tags that are associated with the segment. Each tag
     * consists of a required tag key and an associated tag value.
     * </p>
     * 
     * @param tags
     *        A string-to-string map of key-value pairs that identifies the tags that are associated with the segment.
     *        Each tag consists of a required tag key and an associated tag value.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A string-to-string map of key-value pairs that identifies the tags that are associated with the segment. Each tag
     * consists of a required tag key and an associated tag value.
     * </p>
     * 
     * @param tags
     *        A string-to-string map of key-value pairs that identifies the tags that are associated with the segment.
     *        Each tag consists of a required tag key and an associated tag value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SegmentResponse withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see SegmentResponse#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

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
     * <p>
     * The version number of the segment.
     * </p>
     * 
     * @param version
     *        The version number of the segment.
     */

    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * <p>
     * The version number of the segment.
     * </p>
     * 
     * @return The version number of the segment.
     */

    public Integer getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version number of the segment.
     * </p>
     * 
     * @param version
     *        The version number of the segment.
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
