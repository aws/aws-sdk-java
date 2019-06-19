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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * A request to create a channel
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/CreateChannel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateChannelRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The class for this channel. STANDARD for a channel with two pipelines or SINGLE_PIPELINE for a channel with one
     * pipeline.
     */
    private String channelClass;

    private java.util.List<OutputDestination> destinations;

    private EncoderSettings encoderSettings;
    /** List of input attachments for channel. */
    private java.util.List<InputAttachment> inputAttachments;
    /** Specification of input for this channel (max. bitrate, resolution, codec, etc.) */
    private InputSpecification inputSpecification;
    /** The log level to write to CloudWatch Logs. */
    private String logLevel;
    /** Name of channel. */
    private String name;
    /**
     * Unique request ID to be specified. This is needed to prevent retries from creating multiple resources.
     */
    private String requestId;
    /** Deprecated field that's only usable by whitelisted customers. */
    @Deprecated
    private String reserved;
    /** An optional Amazon Resource Name (ARN) of the role to assume when running the Channel. */
    private String roleArn;
    /** A collection of key-value pairs. */
    private java.util.Map<String, String> tags;

    /**
     * The class for this channel. STANDARD for a channel with two pipelines or SINGLE_PIPELINE for a channel with one
     * pipeline.
     * 
     * @param channelClass
     *        The class for this channel. STANDARD for a channel with two pipelines or SINGLE_PIPELINE for a channel
     *        with one pipeline.
     * @see ChannelClass
     */

    public void setChannelClass(String channelClass) {
        this.channelClass = channelClass;
    }

    /**
     * The class for this channel. STANDARD for a channel with two pipelines or SINGLE_PIPELINE for a channel with one
     * pipeline.
     * 
     * @return The class for this channel. STANDARD for a channel with two pipelines or SINGLE_PIPELINE for a channel
     *         with one pipeline.
     * @see ChannelClass
     */

    public String getChannelClass() {
        return this.channelClass;
    }

    /**
     * The class for this channel. STANDARD for a channel with two pipelines or SINGLE_PIPELINE for a channel with one
     * pipeline.
     * 
     * @param channelClass
     *        The class for this channel. STANDARD for a channel with two pipelines or SINGLE_PIPELINE for a channel
     *        with one pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChannelClass
     */

    public CreateChannelRequest withChannelClass(String channelClass) {
        setChannelClass(channelClass);
        return this;
    }

    /**
     * The class for this channel. STANDARD for a channel with two pipelines or SINGLE_PIPELINE for a channel with one
     * pipeline.
     * 
     * @param channelClass
     *        The class for this channel. STANDARD for a channel with two pipelines or SINGLE_PIPELINE for a channel
     *        with one pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChannelClass
     */

    public CreateChannelRequest withChannelClass(ChannelClass channelClass) {
        this.channelClass = channelClass.toString();
        return this;
    }

    /**
     * @return
     */

    public java.util.List<OutputDestination> getDestinations() {
        return destinations;
    }

    /**
     * @param destinations
     */

    public void setDestinations(java.util.Collection<OutputDestination> destinations) {
        if (destinations == null) {
            this.destinations = null;
            return;
        }

        this.destinations = new java.util.ArrayList<OutputDestination>(destinations);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDestinations(java.util.Collection)} or {@link #withDestinations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param destinations
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChannelRequest withDestinations(OutputDestination... destinations) {
        if (this.destinations == null) {
            setDestinations(new java.util.ArrayList<OutputDestination>(destinations.length));
        }
        for (OutputDestination ele : destinations) {
            this.destinations.add(ele);
        }
        return this;
    }

    /**
     * @param destinations
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChannelRequest withDestinations(java.util.Collection<OutputDestination> destinations) {
        setDestinations(destinations);
        return this;
    }

    /**
     * @param encoderSettings
     */

    public void setEncoderSettings(EncoderSettings encoderSettings) {
        this.encoderSettings = encoderSettings;
    }

    /**
     * @return
     */

    public EncoderSettings getEncoderSettings() {
        return this.encoderSettings;
    }

    /**
     * @param encoderSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChannelRequest withEncoderSettings(EncoderSettings encoderSettings) {
        setEncoderSettings(encoderSettings);
        return this;
    }

    /**
     * List of input attachments for channel.
     * 
     * @return List of input attachments for channel.
     */

    public java.util.List<InputAttachment> getInputAttachments() {
        return inputAttachments;
    }

    /**
     * List of input attachments for channel.
     * 
     * @param inputAttachments
     *        List of input attachments for channel.
     */

    public void setInputAttachments(java.util.Collection<InputAttachment> inputAttachments) {
        if (inputAttachments == null) {
            this.inputAttachments = null;
            return;
        }

        this.inputAttachments = new java.util.ArrayList<InputAttachment>(inputAttachments);
    }

    /**
     * List of input attachments for channel.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInputAttachments(java.util.Collection)} or {@link #withInputAttachments(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param inputAttachments
     *        List of input attachments for channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChannelRequest withInputAttachments(InputAttachment... inputAttachments) {
        if (this.inputAttachments == null) {
            setInputAttachments(new java.util.ArrayList<InputAttachment>(inputAttachments.length));
        }
        for (InputAttachment ele : inputAttachments) {
            this.inputAttachments.add(ele);
        }
        return this;
    }

    /**
     * List of input attachments for channel.
     * 
     * @param inputAttachments
     *        List of input attachments for channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChannelRequest withInputAttachments(java.util.Collection<InputAttachment> inputAttachments) {
        setInputAttachments(inputAttachments);
        return this;
    }

    /**
     * Specification of input for this channel (max. bitrate, resolution, codec, etc.)
     * 
     * @param inputSpecification
     *        Specification of input for this channel (max. bitrate, resolution, codec, etc.)
     */

    public void setInputSpecification(InputSpecification inputSpecification) {
        this.inputSpecification = inputSpecification;
    }

    /**
     * Specification of input for this channel (max. bitrate, resolution, codec, etc.)
     * 
     * @return Specification of input for this channel (max. bitrate, resolution, codec, etc.)
     */

    public InputSpecification getInputSpecification() {
        return this.inputSpecification;
    }

    /**
     * Specification of input for this channel (max. bitrate, resolution, codec, etc.)
     * 
     * @param inputSpecification
     *        Specification of input for this channel (max. bitrate, resolution, codec, etc.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChannelRequest withInputSpecification(InputSpecification inputSpecification) {
        setInputSpecification(inputSpecification);
        return this;
    }

    /**
     * The log level to write to CloudWatch Logs.
     * 
     * @param logLevel
     *        The log level to write to CloudWatch Logs.
     * @see LogLevel
     */

    public void setLogLevel(String logLevel) {
        this.logLevel = logLevel;
    }

    /**
     * The log level to write to CloudWatch Logs.
     * 
     * @return The log level to write to CloudWatch Logs.
     * @see LogLevel
     */

    public String getLogLevel() {
        return this.logLevel;
    }

    /**
     * The log level to write to CloudWatch Logs.
     * 
     * @param logLevel
     *        The log level to write to CloudWatch Logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogLevel
     */

    public CreateChannelRequest withLogLevel(String logLevel) {
        setLogLevel(logLevel);
        return this;
    }

    /**
     * The log level to write to CloudWatch Logs.
     * 
     * @param logLevel
     *        The log level to write to CloudWatch Logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogLevel
     */

    public CreateChannelRequest withLogLevel(LogLevel logLevel) {
        this.logLevel = logLevel.toString();
        return this;
    }

    /**
     * Name of channel.
     * 
     * @param name
     *        Name of channel.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Name of channel.
     * 
     * @return Name of channel.
     */

    public String getName() {
        return this.name;
    }

    /**
     * Name of channel.
     * 
     * @param name
     *        Name of channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChannelRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * Unique request ID to be specified. This is needed to prevent retries from creating multiple resources.
     * 
     * @param requestId
     *        Unique request ID to be specified. This is needed to prevent retries from creating multiple resources.
     */

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * Unique request ID to be specified. This is needed to prevent retries from creating multiple resources.
     * 
     * @return Unique request ID to be specified. This is needed to prevent retries from creating multiple resources.
     */

    public String getRequestId() {
        return this.requestId;
    }

    /**
     * Unique request ID to be specified. This is needed to prevent retries from creating multiple resources.
     * 
     * @param requestId
     *        Unique request ID to be specified. This is needed to prevent retries from creating multiple resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChannelRequest withRequestId(String requestId) {
        setRequestId(requestId);
        return this;
    }

    /**
     * Deprecated field that's only usable by whitelisted customers.
     * 
     * @param reserved
     *        Deprecated field that's only usable by whitelisted customers.
     */
    @Deprecated
    public void setReserved(String reserved) {
        this.reserved = reserved;
    }

    /**
     * Deprecated field that's only usable by whitelisted customers.
     * 
     * @return Deprecated field that's only usable by whitelisted customers.
     */
    @Deprecated
    public String getReserved() {
        return this.reserved;
    }

    /**
     * Deprecated field that's only usable by whitelisted customers.
     * 
     * @param reserved
     *        Deprecated field that's only usable by whitelisted customers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public CreateChannelRequest withReserved(String reserved) {
        setReserved(reserved);
        return this;
    }

    /**
     * An optional Amazon Resource Name (ARN) of the role to assume when running the Channel.
     * 
     * @param roleArn
     *        An optional Amazon Resource Name (ARN) of the role to assume when running the Channel.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * An optional Amazon Resource Name (ARN) of the role to assume when running the Channel.
     * 
     * @return An optional Amazon Resource Name (ARN) of the role to assume when running the Channel.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * An optional Amazon Resource Name (ARN) of the role to assume when running the Channel.
     * 
     * @param roleArn
     *        An optional Amazon Resource Name (ARN) of the role to assume when running the Channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChannelRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * A collection of key-value pairs.
     * 
     * @return A collection of key-value pairs.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * A collection of key-value pairs.
     * 
     * @param tags
     *        A collection of key-value pairs.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * A collection of key-value pairs.
     * 
     * @param tags
     *        A collection of key-value pairs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChannelRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    public CreateChannelRequest addTagsEntry(String key, String value) {
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

    public CreateChannelRequest clearTagsEntries() {
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
        if (getChannelClass() != null)
            sb.append("ChannelClass: ").append(getChannelClass()).append(",");
        if (getDestinations() != null)
            sb.append("Destinations: ").append(getDestinations()).append(",");
        if (getEncoderSettings() != null)
            sb.append("EncoderSettings: ").append(getEncoderSettings()).append(",");
        if (getInputAttachments() != null)
            sb.append("InputAttachments: ").append(getInputAttachments()).append(",");
        if (getInputSpecification() != null)
            sb.append("InputSpecification: ").append(getInputSpecification()).append(",");
        if (getLogLevel() != null)
            sb.append("LogLevel: ").append(getLogLevel()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getRequestId() != null)
            sb.append("RequestId: ").append(getRequestId()).append(",");
        if (getReserved() != null)
            sb.append("Reserved: ").append(getReserved()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
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

        if (obj instanceof CreateChannelRequest == false)
            return false;
        CreateChannelRequest other = (CreateChannelRequest) obj;
        if (other.getChannelClass() == null ^ this.getChannelClass() == null)
            return false;
        if (other.getChannelClass() != null && other.getChannelClass().equals(this.getChannelClass()) == false)
            return false;
        if (other.getDestinations() == null ^ this.getDestinations() == null)
            return false;
        if (other.getDestinations() != null && other.getDestinations().equals(this.getDestinations()) == false)
            return false;
        if (other.getEncoderSettings() == null ^ this.getEncoderSettings() == null)
            return false;
        if (other.getEncoderSettings() != null && other.getEncoderSettings().equals(this.getEncoderSettings()) == false)
            return false;
        if (other.getInputAttachments() == null ^ this.getInputAttachments() == null)
            return false;
        if (other.getInputAttachments() != null && other.getInputAttachments().equals(this.getInputAttachments()) == false)
            return false;
        if (other.getInputSpecification() == null ^ this.getInputSpecification() == null)
            return false;
        if (other.getInputSpecification() != null && other.getInputSpecification().equals(this.getInputSpecification()) == false)
            return false;
        if (other.getLogLevel() == null ^ this.getLogLevel() == null)
            return false;
        if (other.getLogLevel() != null && other.getLogLevel().equals(this.getLogLevel()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null && other.getRequestId().equals(this.getRequestId()) == false)
            return false;
        if (other.getReserved() == null ^ this.getReserved() == null)
            return false;
        if (other.getReserved() != null && other.getReserved().equals(this.getReserved()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
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

        hashCode = prime * hashCode + ((getChannelClass() == null) ? 0 : getChannelClass().hashCode());
        hashCode = prime * hashCode + ((getDestinations() == null) ? 0 : getDestinations().hashCode());
        hashCode = prime * hashCode + ((getEncoderSettings() == null) ? 0 : getEncoderSettings().hashCode());
        hashCode = prime * hashCode + ((getInputAttachments() == null) ? 0 : getInputAttachments().hashCode());
        hashCode = prime * hashCode + ((getInputSpecification() == null) ? 0 : getInputSpecification().hashCode());
        hashCode = prime * hashCode + ((getLogLevel() == null) ? 0 : getLogLevel().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        hashCode = prime * hashCode + ((getReserved() == null) ? 0 : getReserved().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateChannelRequest clone() {
        return (CreateChannelRequest) super.clone();
    }

}
