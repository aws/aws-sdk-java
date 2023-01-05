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
package com.amazonaws.services.sagemakergeospatial.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object containing information about the output file.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/ListVectorEnrichmentJobOutputConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListVectorEnrichmentJobOutputConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the list of the Vector Enrichment jobs.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The creation time.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The duration of the session, in seconds.
     * </p>
     */
    private Integer durationInSeconds;
    /**
     * <p>
     * The names of the Vector Enrichment jobs in the list.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The status of the Vector Enrichment jobs list.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Each tag consists of a key and a value.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The type of the list of Vector Enrichment jobs.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the list of the Vector Enrichment jobs.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the list of the Vector Enrichment jobs.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the list of the Vector Enrichment jobs.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the list of the Vector Enrichment jobs.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the list of the Vector Enrichment jobs.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the list of the Vector Enrichment jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVectorEnrichmentJobOutputConfig withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The creation time.
     * </p>
     * 
     * @param creationTime
     *        The creation time.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The creation time.
     * </p>
     * 
     * @return The creation time.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The creation time.
     * </p>
     * 
     * @param creationTime
     *        The creation time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVectorEnrichmentJobOutputConfig withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The duration of the session, in seconds.
     * </p>
     * 
     * @param durationInSeconds
     *        The duration of the session, in seconds.
     */

    public void setDurationInSeconds(Integer durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
    }

    /**
     * <p>
     * The duration of the session, in seconds.
     * </p>
     * 
     * @return The duration of the session, in seconds.
     */

    public Integer getDurationInSeconds() {
        return this.durationInSeconds;
    }

    /**
     * <p>
     * The duration of the session, in seconds.
     * </p>
     * 
     * @param durationInSeconds
     *        The duration of the session, in seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVectorEnrichmentJobOutputConfig withDurationInSeconds(Integer durationInSeconds) {
        setDurationInSeconds(durationInSeconds);
        return this;
    }

    /**
     * <p>
     * The names of the Vector Enrichment jobs in the list.
     * </p>
     * 
     * @param name
     *        The names of the Vector Enrichment jobs in the list.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The names of the Vector Enrichment jobs in the list.
     * </p>
     * 
     * @return The names of the Vector Enrichment jobs in the list.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The names of the Vector Enrichment jobs in the list.
     * </p>
     * 
     * @param name
     *        The names of the Vector Enrichment jobs in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVectorEnrichmentJobOutputConfig withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The status of the Vector Enrichment jobs list.
     * </p>
     * 
     * @param status
     *        The status of the Vector Enrichment jobs list.
     * @see VectorEnrichmentJobStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the Vector Enrichment jobs list.
     * </p>
     * 
     * @return The status of the Vector Enrichment jobs list.
     * @see VectorEnrichmentJobStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the Vector Enrichment jobs list.
     * </p>
     * 
     * @param status
     *        The status of the Vector Enrichment jobs list.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VectorEnrichmentJobStatus
     */

    public ListVectorEnrichmentJobOutputConfig withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the Vector Enrichment jobs list.
     * </p>
     * 
     * @param status
     *        The status of the Vector Enrichment jobs list.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VectorEnrichmentJobStatus
     */

    public ListVectorEnrichmentJobOutputConfig withStatus(VectorEnrichmentJobStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Each tag consists of a key and a value.
     * </p>
     * 
     * @return Each tag consists of a key and a value.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Each tag consists of a key and a value.
     * </p>
     * 
     * @param tags
     *        Each tag consists of a key and a value.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Each tag consists of a key and a value.
     * </p>
     * 
     * @param tags
     *        Each tag consists of a key and a value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVectorEnrichmentJobOutputConfig withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see ListVectorEnrichmentJobOutputConfig#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ListVectorEnrichmentJobOutputConfig addTagsEntry(String key, String value) {
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

    public ListVectorEnrichmentJobOutputConfig clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The type of the list of Vector Enrichment jobs.
     * </p>
     * 
     * @param type
     *        The type of the list of Vector Enrichment jobs.
     * @see VectorEnrichmentJobType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the list of Vector Enrichment jobs.
     * </p>
     * 
     * @return The type of the list of Vector Enrichment jobs.
     * @see VectorEnrichmentJobType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the list of Vector Enrichment jobs.
     * </p>
     * 
     * @param type
     *        The type of the list of Vector Enrichment jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VectorEnrichmentJobType
     */

    public ListVectorEnrichmentJobOutputConfig withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the list of Vector Enrichment jobs.
     * </p>
     * 
     * @param type
     *        The type of the list of Vector Enrichment jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VectorEnrichmentJobType
     */

    public ListVectorEnrichmentJobOutputConfig withType(VectorEnrichmentJobType type) {
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getDurationInSeconds() != null)
            sb.append("DurationInSeconds: ").append(getDurationInSeconds()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
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

        if (obj instanceof ListVectorEnrichmentJobOutputConfig == false)
            return false;
        ListVectorEnrichmentJobOutputConfig other = (ListVectorEnrichmentJobOutputConfig) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getDurationInSeconds() == null ^ this.getDurationInSeconds() == null)
            return false;
        if (other.getDurationInSeconds() != null && other.getDurationInSeconds().equals(this.getDurationInSeconds()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
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

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getDurationInSeconds() == null) ? 0 : getDurationInSeconds().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public ListVectorEnrichmentJobOutputConfig clone() {
        try {
            return (ListVectorEnrichmentJobOutputConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemakergeospatial.model.transform.ListVectorEnrichmentJobOutputConfigMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
