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
 * A request to update a channel.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/UpdateChannel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateChannelRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** channel ID */
    private String channelId;
    /** A list of output destinations for this channel. */
    private java.util.List<OutputDestination> destinations;
    /** The encoder settings for this channel. */
    private EncoderSettings encoderSettings;

    private java.util.List<InputAttachment> inputAttachments;
    /** Specification of input for this channel (max. bitrate, resolution, codec, etc.) */
    private InputSpecification inputSpecification;
    /** The log level to write to CloudWatch Logs. */
    private String logLevel;
    /** The name of the channel. */
    private String name;
    /**
     * An optional Amazon Resource Name (ARN) of the role to assume when running the Channel. If you do not specify this
     * on an update call but the role was previously set that role will be removed.
     */
    private String roleArn;

    /**
     * channel ID
     * 
     * @param channelId
     *        channel ID
     */

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    /**
     * channel ID
     * 
     * @return channel ID
     */

    public String getChannelId() {
        return this.channelId;
    }

    /**
     * channel ID
     * 
     * @param channelId
     *        channel ID
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateChannelRequest withChannelId(String channelId) {
        setChannelId(channelId);
        return this;
    }

    /**
     * A list of output destinations for this channel.
     * 
     * @return A list of output destinations for this channel.
     */

    public java.util.List<OutputDestination> getDestinations() {
        return destinations;
    }

    /**
     * A list of output destinations for this channel.
     * 
     * @param destinations
     *        A list of output destinations for this channel.
     */

    public void setDestinations(java.util.Collection<OutputDestination> destinations) {
        if (destinations == null) {
            this.destinations = null;
            return;
        }

        this.destinations = new java.util.ArrayList<OutputDestination>(destinations);
    }

    /**
     * A list of output destinations for this channel.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDestinations(java.util.Collection)} or {@link #withDestinations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param destinations
     *        A list of output destinations for this channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateChannelRequest withDestinations(OutputDestination... destinations) {
        if (this.destinations == null) {
            setDestinations(new java.util.ArrayList<OutputDestination>(destinations.length));
        }
        for (OutputDestination ele : destinations) {
            this.destinations.add(ele);
        }
        return this;
    }

    /**
     * A list of output destinations for this channel.
     * 
     * @param destinations
     *        A list of output destinations for this channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateChannelRequest withDestinations(java.util.Collection<OutputDestination> destinations) {
        setDestinations(destinations);
        return this;
    }

    /**
     * The encoder settings for this channel.
     * 
     * @param encoderSettings
     *        The encoder settings for this channel.
     */

    public void setEncoderSettings(EncoderSettings encoderSettings) {
        this.encoderSettings = encoderSettings;
    }

    /**
     * The encoder settings for this channel.
     * 
     * @return The encoder settings for this channel.
     */

    public EncoderSettings getEncoderSettings() {
        return this.encoderSettings;
    }

    /**
     * The encoder settings for this channel.
     * 
     * @param encoderSettings
     *        The encoder settings for this channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateChannelRequest withEncoderSettings(EncoderSettings encoderSettings) {
        setEncoderSettings(encoderSettings);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<InputAttachment> getInputAttachments() {
        return inputAttachments;
    }

    /**
     * @param inputAttachments
     */

    public void setInputAttachments(java.util.Collection<InputAttachment> inputAttachments) {
        if (inputAttachments == null) {
            this.inputAttachments = null;
            return;
        }

        this.inputAttachments = new java.util.ArrayList<InputAttachment>(inputAttachments);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInputAttachments(java.util.Collection)} or {@link #withInputAttachments(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param inputAttachments
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateChannelRequest withInputAttachments(InputAttachment... inputAttachments) {
        if (this.inputAttachments == null) {
            setInputAttachments(new java.util.ArrayList<InputAttachment>(inputAttachments.length));
        }
        for (InputAttachment ele : inputAttachments) {
            this.inputAttachments.add(ele);
        }
        return this;
    }

    /**
     * @param inputAttachments
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateChannelRequest withInputAttachments(java.util.Collection<InputAttachment> inputAttachments) {
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

    public UpdateChannelRequest withInputSpecification(InputSpecification inputSpecification) {
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

    public UpdateChannelRequest withLogLevel(String logLevel) {
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

    public UpdateChannelRequest withLogLevel(LogLevel logLevel) {
        this.logLevel = logLevel.toString();
        return this;
    }

    /**
     * The name of the channel.
     * 
     * @param name
     *        The name of the channel.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The name of the channel.
     * 
     * @return The name of the channel.
     */

    public String getName() {
        return this.name;
    }

    /**
     * The name of the channel.
     * 
     * @param name
     *        The name of the channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateChannelRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * An optional Amazon Resource Name (ARN) of the role to assume when running the Channel. If you do not specify this
     * on an update call but the role was previously set that role will be removed.
     * 
     * @param roleArn
     *        An optional Amazon Resource Name (ARN) of the role to assume when running the Channel. If you do not
     *        specify this on an update call but the role was previously set that role will be removed.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * An optional Amazon Resource Name (ARN) of the role to assume when running the Channel. If you do not specify this
     * on an update call but the role was previously set that role will be removed.
     * 
     * @return An optional Amazon Resource Name (ARN) of the role to assume when running the Channel. If you do not
     *         specify this on an update call but the role was previously set that role will be removed.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * An optional Amazon Resource Name (ARN) of the role to assume when running the Channel. If you do not specify this
     * on an update call but the role was previously set that role will be removed.
     * 
     * @param roleArn
     *        An optional Amazon Resource Name (ARN) of the role to assume when running the Channel. If you do not
     *        specify this on an update call but the role was previously set that role will be removed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateChannelRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
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
        if (getChannelId() != null)
            sb.append("ChannelId: ").append(getChannelId()).append(",");
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
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateChannelRequest == false)
            return false;
        UpdateChannelRequest other = (UpdateChannelRequest) obj;
        if (other.getChannelId() == null ^ this.getChannelId() == null)
            return false;
        if (other.getChannelId() != null && other.getChannelId().equals(this.getChannelId()) == false)
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
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelId() == null) ? 0 : getChannelId().hashCode());
        hashCode = prime * hashCode + ((getDestinations() == null) ? 0 : getDestinations().hashCode());
        hashCode = prime * hashCode + ((getEncoderSettings() == null) ? 0 : getEncoderSettings().hashCode());
        hashCode = prime * hashCode + ((getInputAttachments() == null) ? 0 : getInputAttachments().hashCode());
        hashCode = prime * hashCode + ((getInputSpecification() == null) ? 0 : getInputSpecification().hashCode());
        hashCode = prime * hashCode + ((getLogLevel() == null) ? 0 : getLogLevel().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public UpdateChannelRequest clone() {
        return (UpdateChannelRequest) super.clone();
    }

}
