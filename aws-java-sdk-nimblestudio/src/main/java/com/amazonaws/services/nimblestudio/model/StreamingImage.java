/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.nimblestudio.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/StreamingImage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StreamingImage implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the resource.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * A human-readable description of the streaming image.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The ID of an EC2 machine image with which to create the streaming image.
     * </p>
     */
    private String ec2ImageId;
    /**
     * <p>
     * The encryption configuration.
     * </p>
     */
    private StreamingImageEncryptionConfiguration encryptionConfiguration;
    /**
     * <p>
     * The list of EULAs that must be accepted before a Streaming Session can be started using this streaming image.
     * </p>
     */
    private java.util.List<String> eulaIds;
    /**
     * <p>
     * A friendly name for a streaming image resource.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The owner of the streaming image, either the studioId that contains the streaming image, or 'amazon' for images
     * that are provided by Amazon Nimble Studio.
     * </p>
     */
    private String owner;
    /**
     * <p>
     * The platform of the streaming image, either WINDOWS or LINUX.
     * </p>
     */
    private String platform;
    /**
     * <p>
     * The current state.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The status code.
     * </p>
     */
    private String statusCode;
    /**
     * <p>
     * The status message for the streaming image.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * The ID of the streaming image.
     * </p>
     */
    private String streamingImageId;
    /**
     * <p>
     * A collection of labels, in the form of key:value pairs, that apply to this resource.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The ARN of the resource.
     * </p>
     * 
     * @param arn
     *        The ARN of the resource.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the resource.
     * </p>
     * 
     * @return The ARN of the resource.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the resource.
     * </p>
     * 
     * @param arn
     *        The ARN of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingImage withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * A human-readable description of the streaming image.
     * </p>
     * 
     * @param description
     *        A human-readable description of the streaming image.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A human-readable description of the streaming image.
     * </p>
     * 
     * @return A human-readable description of the streaming image.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A human-readable description of the streaming image.
     * </p>
     * 
     * @param description
     *        A human-readable description of the streaming image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingImage withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The ID of an EC2 machine image with which to create the streaming image.
     * </p>
     * 
     * @param ec2ImageId
     *        The ID of an EC2 machine image with which to create the streaming image.
     */

    public void setEc2ImageId(String ec2ImageId) {
        this.ec2ImageId = ec2ImageId;
    }

    /**
     * <p>
     * The ID of an EC2 machine image with which to create the streaming image.
     * </p>
     * 
     * @return The ID of an EC2 machine image with which to create the streaming image.
     */

    public String getEc2ImageId() {
        return this.ec2ImageId;
    }

    /**
     * <p>
     * The ID of an EC2 machine image with which to create the streaming image.
     * </p>
     * 
     * @param ec2ImageId
     *        The ID of an EC2 machine image with which to create the streaming image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingImage withEc2ImageId(String ec2ImageId) {
        setEc2ImageId(ec2ImageId);
        return this;
    }

    /**
     * <p>
     * The encryption configuration.
     * </p>
     * 
     * @param encryptionConfiguration
     *        The encryption configuration.
     */

    public void setEncryptionConfiguration(StreamingImageEncryptionConfiguration encryptionConfiguration) {
        this.encryptionConfiguration = encryptionConfiguration;
    }

    /**
     * <p>
     * The encryption configuration.
     * </p>
     * 
     * @return The encryption configuration.
     */

    public StreamingImageEncryptionConfiguration getEncryptionConfiguration() {
        return this.encryptionConfiguration;
    }

    /**
     * <p>
     * The encryption configuration.
     * </p>
     * 
     * @param encryptionConfiguration
     *        The encryption configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingImage withEncryptionConfiguration(StreamingImageEncryptionConfiguration encryptionConfiguration) {
        setEncryptionConfiguration(encryptionConfiguration);
        return this;
    }

    /**
     * <p>
     * The list of EULAs that must be accepted before a Streaming Session can be started using this streaming image.
     * </p>
     * 
     * @return The list of EULAs that must be accepted before a Streaming Session can be started using this streaming
     *         image.
     */

    public java.util.List<String> getEulaIds() {
        return eulaIds;
    }

    /**
     * <p>
     * The list of EULAs that must be accepted before a Streaming Session can be started using this streaming image.
     * </p>
     * 
     * @param eulaIds
     *        The list of EULAs that must be accepted before a Streaming Session can be started using this streaming
     *        image.
     */

    public void setEulaIds(java.util.Collection<String> eulaIds) {
        if (eulaIds == null) {
            this.eulaIds = null;
            return;
        }

        this.eulaIds = new java.util.ArrayList<String>(eulaIds);
    }

    /**
     * <p>
     * The list of EULAs that must be accepted before a Streaming Session can be started using this streaming image.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEulaIds(java.util.Collection)} or {@link #withEulaIds(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param eulaIds
     *        The list of EULAs that must be accepted before a Streaming Session can be started using this streaming
     *        image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingImage withEulaIds(String... eulaIds) {
        if (this.eulaIds == null) {
            setEulaIds(new java.util.ArrayList<String>(eulaIds.length));
        }
        for (String ele : eulaIds) {
            this.eulaIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of EULAs that must be accepted before a Streaming Session can be started using this streaming image.
     * </p>
     * 
     * @param eulaIds
     *        The list of EULAs that must be accepted before a Streaming Session can be started using this streaming
     *        image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingImage withEulaIds(java.util.Collection<String> eulaIds) {
        setEulaIds(eulaIds);
        return this;
    }

    /**
     * <p>
     * A friendly name for a streaming image resource.
     * </p>
     * 
     * @param name
     *        A friendly name for a streaming image resource.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A friendly name for a streaming image resource.
     * </p>
     * 
     * @return A friendly name for a streaming image resource.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A friendly name for a streaming image resource.
     * </p>
     * 
     * @param name
     *        A friendly name for a streaming image resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingImage withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The owner of the streaming image, either the studioId that contains the streaming image, or 'amazon' for images
     * that are provided by Amazon Nimble Studio.
     * </p>
     * 
     * @param owner
     *        The owner of the streaming image, either the studioId that contains the streaming image, or 'amazon' for
     *        images that are provided by Amazon Nimble Studio.
     */

    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * <p>
     * The owner of the streaming image, either the studioId that contains the streaming image, or 'amazon' for images
     * that are provided by Amazon Nimble Studio.
     * </p>
     * 
     * @return The owner of the streaming image, either the studioId that contains the streaming image, or 'amazon' for
     *         images that are provided by Amazon Nimble Studio.
     */

    public String getOwner() {
        return this.owner;
    }

    /**
     * <p>
     * The owner of the streaming image, either the studioId that contains the streaming image, or 'amazon' for images
     * that are provided by Amazon Nimble Studio.
     * </p>
     * 
     * @param owner
     *        The owner of the streaming image, either the studioId that contains the streaming image, or 'amazon' for
     *        images that are provided by Amazon Nimble Studio.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingImage withOwner(String owner) {
        setOwner(owner);
        return this;
    }

    /**
     * <p>
     * The platform of the streaming image, either WINDOWS or LINUX.
     * </p>
     * 
     * @param platform
     *        The platform of the streaming image, either WINDOWS or LINUX.
     */

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * <p>
     * The platform of the streaming image, either WINDOWS or LINUX.
     * </p>
     * 
     * @return The platform of the streaming image, either WINDOWS or LINUX.
     */

    public String getPlatform() {
        return this.platform;
    }

    /**
     * <p>
     * The platform of the streaming image, either WINDOWS or LINUX.
     * </p>
     * 
     * @param platform
     *        The platform of the streaming image, either WINDOWS or LINUX.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingImage withPlatform(String platform) {
        setPlatform(platform);
        return this;
    }

    /**
     * <p>
     * The current state.
     * </p>
     * 
     * @param state
     *        The current state.
     * @see StreamingImageState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state.
     * </p>
     * 
     * @return The current state.
     * @see StreamingImageState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The current state.
     * </p>
     * 
     * @param state
     *        The current state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StreamingImageState
     */

    public StreamingImage withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The current state.
     * </p>
     * 
     * @param state
     *        The current state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StreamingImageState
     */

    public StreamingImage withState(StreamingImageState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The status code.
     * </p>
     * 
     * @param statusCode
     *        The status code.
     * @see StreamingImageStatusCode
     */

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * <p>
     * The status code.
     * </p>
     * 
     * @return The status code.
     * @see StreamingImageStatusCode
     */

    public String getStatusCode() {
        return this.statusCode;
    }

    /**
     * <p>
     * The status code.
     * </p>
     * 
     * @param statusCode
     *        The status code.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StreamingImageStatusCode
     */

    public StreamingImage withStatusCode(String statusCode) {
        setStatusCode(statusCode);
        return this;
    }

    /**
     * <p>
     * The status code.
     * </p>
     * 
     * @param statusCode
     *        The status code.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StreamingImageStatusCode
     */

    public StreamingImage withStatusCode(StreamingImageStatusCode statusCode) {
        this.statusCode = statusCode.toString();
        return this;
    }

    /**
     * <p>
     * The status message for the streaming image.
     * </p>
     * 
     * @param statusMessage
     *        The status message for the streaming image.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * The status message for the streaming image.
     * </p>
     * 
     * @return The status message for the streaming image.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * The status message for the streaming image.
     * </p>
     * 
     * @param statusMessage
     *        The status message for the streaming image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingImage withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * The ID of the streaming image.
     * </p>
     * 
     * @param streamingImageId
     *        The ID of the streaming image.
     */

    public void setStreamingImageId(String streamingImageId) {
        this.streamingImageId = streamingImageId;
    }

    /**
     * <p>
     * The ID of the streaming image.
     * </p>
     * 
     * @return The ID of the streaming image.
     */

    public String getStreamingImageId() {
        return this.streamingImageId;
    }

    /**
     * <p>
     * The ID of the streaming image.
     * </p>
     * 
     * @param streamingImageId
     *        The ID of the streaming image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingImage withStreamingImageId(String streamingImageId) {
        setStreamingImageId(streamingImageId);
        return this;
    }

    /**
     * <p>
     * A collection of labels, in the form of key:value pairs, that apply to this resource.
     * </p>
     * 
     * @return A collection of labels, in the form of key:value pairs, that apply to this resource.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A collection of labels, in the form of key:value pairs, that apply to this resource.
     * </p>
     * 
     * @param tags
     *        A collection of labels, in the form of key:value pairs, that apply to this resource.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A collection of labels, in the form of key:value pairs, that apply to this resource.
     * </p>
     * 
     * @param tags
     *        A collection of labels, in the form of key:value pairs, that apply to this resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingImage withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see StreamingImage#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public StreamingImage addTagsEntry(String key, String value) {
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

    public StreamingImage clearTagsEntries() {
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getEc2ImageId() != null)
            sb.append("Ec2ImageId: ").append(getEc2ImageId()).append(",");
        if (getEncryptionConfiguration() != null)
            sb.append("EncryptionConfiguration: ").append(getEncryptionConfiguration()).append(",");
        if (getEulaIds() != null)
            sb.append("EulaIds: ").append(getEulaIds()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getOwner() != null)
            sb.append("Owner: ").append(getOwner()).append(",");
        if (getPlatform() != null)
            sb.append("Platform: ").append(getPlatform()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getStatusCode() != null)
            sb.append("StatusCode: ").append(getStatusCode()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getStreamingImageId() != null)
            sb.append("StreamingImageId: ").append(getStreamingImageId()).append(",");
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

        if (obj instanceof StreamingImage == false)
            return false;
        StreamingImage other = (StreamingImage) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEc2ImageId() == null ^ this.getEc2ImageId() == null)
            return false;
        if (other.getEc2ImageId() != null && other.getEc2ImageId().equals(this.getEc2ImageId()) == false)
            return false;
        if (other.getEncryptionConfiguration() == null ^ this.getEncryptionConfiguration() == null)
            return false;
        if (other.getEncryptionConfiguration() != null && other.getEncryptionConfiguration().equals(this.getEncryptionConfiguration()) == false)
            return false;
        if (other.getEulaIds() == null ^ this.getEulaIds() == null)
            return false;
        if (other.getEulaIds() != null && other.getEulaIds().equals(this.getEulaIds()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOwner() == null ^ this.getOwner() == null)
            return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false)
            return false;
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStatusCode() == null ^ this.getStatusCode() == null)
            return false;
        if (other.getStatusCode() != null && other.getStatusCode().equals(this.getStatusCode()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getStreamingImageId() == null ^ this.getStreamingImageId() == null)
            return false;
        if (other.getStreamingImageId() != null && other.getStreamingImageId().equals(this.getStreamingImageId()) == false)
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
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEc2ImageId() == null) ? 0 : getEc2ImageId().hashCode());
        hashCode = prime * hashCode + ((getEncryptionConfiguration() == null) ? 0 : getEncryptionConfiguration().hashCode());
        hashCode = prime * hashCode + ((getEulaIds() == null) ? 0 : getEulaIds().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getStatusCode() == null) ? 0 : getStatusCode().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getStreamingImageId() == null) ? 0 : getStreamingImageId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public StreamingImage clone() {
        try {
            return (StreamingImage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.nimblestudio.model.transform.StreamingImageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
