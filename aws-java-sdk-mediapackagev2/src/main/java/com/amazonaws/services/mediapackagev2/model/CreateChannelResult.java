/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mediapackagev2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/CreateChannel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateChannelResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) associated with the resource.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name that describes the channel. The name is the primary identifier for the channel, and must be unique for
     * your account in the AWS Region and channel group.
     * </p>
     */
    private String channelName;
    /**
     * <p>
     * The name that describes the channel group. The name is the primary identifier for the channel group, and must be
     * unique for your account in the AWS Region.
     * </p>
     */
    private String channelGroupName;
    /**
     * <p>
     * The date and time the channel was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The date and time the channel was modified.
     * </p>
     */
    private java.util.Date modifiedAt;
    /**
     * <p>
     * The description for your channel.
     * </p>
     */
    private String description;

    private java.util.List<IngestEndpoint> ingestEndpoints;
    /**
     * <p>
     * The current Entity Tag (ETag) associated with this resource. The entity tag can be used to safely make concurrent
     * updates to the resource.
     * </p>
     */
    private String eTag;
    /**
     * <p>
     * The comma-separated list of tag key:value pairs assigned to the channel.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) associated with the resource.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) associated with the resource.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) associated with the resource.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) associated with the resource.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) associated with the resource.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) associated with the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChannelResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name that describes the channel. The name is the primary identifier for the channel, and must be unique for
     * your account in the AWS Region and channel group.
     * </p>
     * 
     * @param channelName
     *        The name that describes the channel. The name is the primary identifier for the channel, and must be
     *        unique for your account in the AWS Region and channel group.
     */

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    /**
     * <p>
     * The name that describes the channel. The name is the primary identifier for the channel, and must be unique for
     * your account in the AWS Region and channel group.
     * </p>
     * 
     * @return The name that describes the channel. The name is the primary identifier for the channel, and must be
     *         unique for your account in the AWS Region and channel group.
     */

    public String getChannelName() {
        return this.channelName;
    }

    /**
     * <p>
     * The name that describes the channel. The name is the primary identifier for the channel, and must be unique for
     * your account in the AWS Region and channel group.
     * </p>
     * 
     * @param channelName
     *        The name that describes the channel. The name is the primary identifier for the channel, and must be
     *        unique for your account in the AWS Region and channel group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChannelResult withChannelName(String channelName) {
        setChannelName(channelName);
        return this;
    }

    /**
     * <p>
     * The name that describes the channel group. The name is the primary identifier for the channel group, and must be
     * unique for your account in the AWS Region.
     * </p>
     * 
     * @param channelGroupName
     *        The name that describes the channel group. The name is the primary identifier for the channel group, and
     *        must be unique for your account in the AWS Region.
     */

    public void setChannelGroupName(String channelGroupName) {
        this.channelGroupName = channelGroupName;
    }

    /**
     * <p>
     * The name that describes the channel group. The name is the primary identifier for the channel group, and must be
     * unique for your account in the AWS Region.
     * </p>
     * 
     * @return The name that describes the channel group. The name is the primary identifier for the channel group, and
     *         must be unique for your account in the AWS Region.
     */

    public String getChannelGroupName() {
        return this.channelGroupName;
    }

    /**
     * <p>
     * The name that describes the channel group. The name is the primary identifier for the channel group, and must be
     * unique for your account in the AWS Region.
     * </p>
     * 
     * @param channelGroupName
     *        The name that describes the channel group. The name is the primary identifier for the channel group, and
     *        must be unique for your account in the AWS Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChannelResult withChannelGroupName(String channelGroupName) {
        setChannelGroupName(channelGroupName);
        return this;
    }

    /**
     * <p>
     * The date and time the channel was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time the channel was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time the channel was created.
     * </p>
     * 
     * @return The date and time the channel was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and time the channel was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time the channel was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChannelResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The date and time the channel was modified.
     * </p>
     * 
     * @param modifiedAt
     *        The date and time the channel was modified.
     */

    public void setModifiedAt(java.util.Date modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    /**
     * <p>
     * The date and time the channel was modified.
     * </p>
     * 
     * @return The date and time the channel was modified.
     */

    public java.util.Date getModifiedAt() {
        return this.modifiedAt;
    }

    /**
     * <p>
     * The date and time the channel was modified.
     * </p>
     * 
     * @param modifiedAt
     *        The date and time the channel was modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChannelResult withModifiedAt(java.util.Date modifiedAt) {
        setModifiedAt(modifiedAt);
        return this;
    }

    /**
     * <p>
     * The description for your channel.
     * </p>
     * 
     * @param description
     *        The description for your channel.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description for your channel.
     * </p>
     * 
     * @return The description for your channel.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description for your channel.
     * </p>
     * 
     * @param description
     *        The description for your channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChannelResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<IngestEndpoint> getIngestEndpoints() {
        return ingestEndpoints;
    }

    /**
     * @param ingestEndpoints
     */

    public void setIngestEndpoints(java.util.Collection<IngestEndpoint> ingestEndpoints) {
        if (ingestEndpoints == null) {
            this.ingestEndpoints = null;
            return;
        }

        this.ingestEndpoints = new java.util.ArrayList<IngestEndpoint>(ingestEndpoints);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIngestEndpoints(java.util.Collection)} or {@link #withIngestEndpoints(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param ingestEndpoints
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChannelResult withIngestEndpoints(IngestEndpoint... ingestEndpoints) {
        if (this.ingestEndpoints == null) {
            setIngestEndpoints(new java.util.ArrayList<IngestEndpoint>(ingestEndpoints.length));
        }
        for (IngestEndpoint ele : ingestEndpoints) {
            this.ingestEndpoints.add(ele);
        }
        return this;
    }

    /**
     * @param ingestEndpoints
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChannelResult withIngestEndpoints(java.util.Collection<IngestEndpoint> ingestEndpoints) {
        setIngestEndpoints(ingestEndpoints);
        return this;
    }

    /**
     * <p>
     * The current Entity Tag (ETag) associated with this resource. The entity tag can be used to safely make concurrent
     * updates to the resource.
     * </p>
     * 
     * @param eTag
     *        The current Entity Tag (ETag) associated with this resource. The entity tag can be used to safely make
     *        concurrent updates to the resource.
     */

    public void setETag(String eTag) {
        this.eTag = eTag;
    }

    /**
     * <p>
     * The current Entity Tag (ETag) associated with this resource. The entity tag can be used to safely make concurrent
     * updates to the resource.
     * </p>
     * 
     * @return The current Entity Tag (ETag) associated with this resource. The entity tag can be used to safely make
     *         concurrent updates to the resource.
     */

    public String getETag() {
        return this.eTag;
    }

    /**
     * <p>
     * The current Entity Tag (ETag) associated with this resource. The entity tag can be used to safely make concurrent
     * updates to the resource.
     * </p>
     * 
     * @param eTag
     *        The current Entity Tag (ETag) associated with this resource. The entity tag can be used to safely make
     *        concurrent updates to the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChannelResult withETag(String eTag) {
        setETag(eTag);
        return this;
    }

    /**
     * <p>
     * The comma-separated list of tag key:value pairs assigned to the channel.
     * </p>
     * 
     * @return The comma-separated list of tag key:value pairs assigned to the channel.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The comma-separated list of tag key:value pairs assigned to the channel.
     * </p>
     * 
     * @param tags
     *        The comma-separated list of tag key:value pairs assigned to the channel.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The comma-separated list of tag key:value pairs assigned to the channel.
     * </p>
     * 
     * @param tags
     *        The comma-separated list of tag key:value pairs assigned to the channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChannelResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateChannelResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateChannelResult addTagsEntry(String key, String value) {
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

    public CreateChannelResult clearTagsEntries() {
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getChannelName() != null)
            sb.append("ChannelName: ").append(getChannelName()).append(",");
        if (getChannelGroupName() != null)
            sb.append("ChannelGroupName: ").append(getChannelGroupName()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getModifiedAt() != null)
            sb.append("ModifiedAt: ").append(getModifiedAt()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getIngestEndpoints() != null)
            sb.append("IngestEndpoints: ").append(getIngestEndpoints()).append(",");
        if (getETag() != null)
            sb.append("ETag: ").append(getETag()).append(",");
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

        if (obj instanceof CreateChannelResult == false)
            return false;
        CreateChannelResult other = (CreateChannelResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getChannelName() == null ^ this.getChannelName() == null)
            return false;
        if (other.getChannelName() != null && other.getChannelName().equals(this.getChannelName()) == false)
            return false;
        if (other.getChannelGroupName() == null ^ this.getChannelGroupName() == null)
            return false;
        if (other.getChannelGroupName() != null && other.getChannelGroupName().equals(this.getChannelGroupName()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getModifiedAt() == null ^ this.getModifiedAt() == null)
            return false;
        if (other.getModifiedAt() != null && other.getModifiedAt().equals(this.getModifiedAt()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getIngestEndpoints() == null ^ this.getIngestEndpoints() == null)
            return false;
        if (other.getIngestEndpoints() != null && other.getIngestEndpoints().equals(this.getIngestEndpoints()) == false)
            return false;
        if (other.getETag() == null ^ this.getETag() == null)
            return false;
        if (other.getETag() != null && other.getETag().equals(this.getETag()) == false)
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

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getChannelName() == null) ? 0 : getChannelName().hashCode());
        hashCode = prime * hashCode + ((getChannelGroupName() == null) ? 0 : getChannelGroupName().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getModifiedAt() == null) ? 0 : getModifiedAt().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getIngestEndpoints() == null) ? 0 : getIngestEndpoints().hashCode());
        hashCode = prime * hashCode + ((getETag() == null) ? 0 : getETag().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateChannelResult clone() {
        try {
            return (CreateChannelResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
