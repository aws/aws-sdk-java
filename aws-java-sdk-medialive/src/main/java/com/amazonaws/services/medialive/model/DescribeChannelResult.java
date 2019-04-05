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

/**
 * Placeholder documentation for DescribeChannelResponse
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DescribeChannel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeChannelResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** The unique arn of the channel. */
    private String arn;
    /**
     * The class for this channel. STANDARD for a channel with two pipelines or SINGLE_PIPELINE for a channel with one
     * pipeline.
     */
    private String channelClass;
    /**
     * A list of destinations of the channel. For UDP outputs, there is one destination per output. For other types
     * (HLS, for example), there is one destination per packager.
     */
    private java.util.List<OutputDestination> destinations;
    /** The endpoints where outgoing connections initiate from */
    private java.util.List<ChannelEgressEndpoint> egressEndpoints;

    private EncoderSettings encoderSettings;
    /** The unique id of the channel. */
    private String id;
    /** List of input attachments for channel. */
    private java.util.List<InputAttachment> inputAttachments;

    private InputSpecification inputSpecification;
    /** The log level being written to CloudWatch Logs. */
    private String logLevel;
    /** The name of the channel. (user-mutable) */
    private String name;
    /** The number of currently healthy pipelines. */
    private Integer pipelinesRunningCount;
    /** The Amazon Resource Name (ARN) of the role assumed when running the Channel. */
    private String roleArn;

    private String state;
    /** A collection of key-value pairs. */
    private java.util.Map<String, String> tags;

    /**
     * The unique arn of the channel.
     * 
     * @param arn
     *        The unique arn of the channel.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * The unique arn of the channel.
     * 
     * @return The unique arn of the channel.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * The unique arn of the channel.
     * 
     * @param arn
     *        The unique arn of the channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeChannelResult withArn(String arn) {
        setArn(arn);
        return this;
    }

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

    public DescribeChannelResult withChannelClass(String channelClass) {
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

    public DescribeChannelResult withChannelClass(ChannelClass channelClass) {
        this.channelClass = channelClass.toString();
        return this;
    }

    /**
     * A list of destinations of the channel. For UDP outputs, there is one destination per output. For other types
     * (HLS, for example), there is one destination per packager.
     * 
     * @return A list of destinations of the channel. For UDP outputs, there is one destination per output. For other
     *         types (HLS, for example), there is one destination per packager.
     */

    public java.util.List<OutputDestination> getDestinations() {
        return destinations;
    }

    /**
     * A list of destinations of the channel. For UDP outputs, there is one destination per output. For other types
     * (HLS, for example), there is one destination per packager.
     * 
     * @param destinations
     *        A list of destinations of the channel. For UDP outputs, there is one destination per output. For other
     *        types (HLS, for example), there is one destination per packager.
     */

    public void setDestinations(java.util.Collection<OutputDestination> destinations) {
        if (destinations == null) {
            this.destinations = null;
            return;
        }

        this.destinations = new java.util.ArrayList<OutputDestination>(destinations);
    }

    /**
     * A list of destinations of the channel. For UDP outputs, there is one destination per output. For other types
     * (HLS, for example), there is one destination per packager.
     * 
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDestinations(java.util.Collection)} or {@link #withDestinations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param destinations
     *        A list of destinations of the channel. For UDP outputs, there is one destination per output. For other
     *        types (HLS, for example), there is one destination per packager.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeChannelResult withDestinations(OutputDestination... destinations) {
        if (this.destinations == null) {
            setDestinations(new java.util.ArrayList<OutputDestination>(destinations.length));
        }
        for (OutputDestination ele : destinations) {
            this.destinations.add(ele);
        }
        return this;
    }

    /**
     * A list of destinations of the channel. For UDP outputs, there is one destination per output. For other types
     * (HLS, for example), there is one destination per packager.
     * 
     * @param destinations
     *        A list of destinations of the channel. For UDP outputs, there is one destination per output. For other
     *        types (HLS, for example), there is one destination per packager.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeChannelResult withDestinations(java.util.Collection<OutputDestination> destinations) {
        setDestinations(destinations);
        return this;
    }

    /**
     * The endpoints where outgoing connections initiate from
     * 
     * @return The endpoints where outgoing connections initiate from
     */

    public java.util.List<ChannelEgressEndpoint> getEgressEndpoints() {
        return egressEndpoints;
    }

    /**
     * The endpoints where outgoing connections initiate from
     * 
     * @param egressEndpoints
     *        The endpoints where outgoing connections initiate from
     */

    public void setEgressEndpoints(java.util.Collection<ChannelEgressEndpoint> egressEndpoints) {
        if (egressEndpoints == null) {
            this.egressEndpoints = null;
            return;
        }

        this.egressEndpoints = new java.util.ArrayList<ChannelEgressEndpoint>(egressEndpoints);
    }

    /**
     * The endpoints where outgoing connections initiate from
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEgressEndpoints(java.util.Collection)} or {@link #withEgressEndpoints(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param egressEndpoints
     *        The endpoints where outgoing connections initiate from
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeChannelResult withEgressEndpoints(ChannelEgressEndpoint... egressEndpoints) {
        if (this.egressEndpoints == null) {
            setEgressEndpoints(new java.util.ArrayList<ChannelEgressEndpoint>(egressEndpoints.length));
        }
        for (ChannelEgressEndpoint ele : egressEndpoints) {
            this.egressEndpoints.add(ele);
        }
        return this;
    }

    /**
     * The endpoints where outgoing connections initiate from
     * 
     * @param egressEndpoints
     *        The endpoints where outgoing connections initiate from
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeChannelResult withEgressEndpoints(java.util.Collection<ChannelEgressEndpoint> egressEndpoints) {
        setEgressEndpoints(egressEndpoints);
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

    public DescribeChannelResult withEncoderSettings(EncoderSettings encoderSettings) {
        setEncoderSettings(encoderSettings);
        return this;
    }

    /**
     * The unique id of the channel.
     * 
     * @param id
     *        The unique id of the channel.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * The unique id of the channel.
     * 
     * @return The unique id of the channel.
     */

    public String getId() {
        return this.id;
    }

    /**
     * The unique id of the channel.
     * 
     * @param id
     *        The unique id of the channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeChannelResult withId(String id) {
        setId(id);
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

    public DescribeChannelResult withInputAttachments(InputAttachment... inputAttachments) {
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

    public DescribeChannelResult withInputAttachments(java.util.Collection<InputAttachment> inputAttachments) {
        setInputAttachments(inputAttachments);
        return this;
    }

    /**
     * @param inputSpecification
     */

    public void setInputSpecification(InputSpecification inputSpecification) {
        this.inputSpecification = inputSpecification;
    }

    /**
     * @return
     */

    public InputSpecification getInputSpecification() {
        return this.inputSpecification;
    }

    /**
     * @param inputSpecification
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeChannelResult withInputSpecification(InputSpecification inputSpecification) {
        setInputSpecification(inputSpecification);
        return this;
    }

    /**
     * The log level being written to CloudWatch Logs.
     * 
     * @param logLevel
     *        The log level being written to CloudWatch Logs.
     * @see LogLevel
     */

    public void setLogLevel(String logLevel) {
        this.logLevel = logLevel;
    }

    /**
     * The log level being written to CloudWatch Logs.
     * 
     * @return The log level being written to CloudWatch Logs.
     * @see LogLevel
     */

    public String getLogLevel() {
        return this.logLevel;
    }

    /**
     * The log level being written to CloudWatch Logs.
     * 
     * @param logLevel
     *        The log level being written to CloudWatch Logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogLevel
     */

    public DescribeChannelResult withLogLevel(String logLevel) {
        setLogLevel(logLevel);
        return this;
    }

    /**
     * The log level being written to CloudWatch Logs.
     * 
     * @param logLevel
     *        The log level being written to CloudWatch Logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogLevel
     */

    public DescribeChannelResult withLogLevel(LogLevel logLevel) {
        this.logLevel = logLevel.toString();
        return this;
    }

    /**
     * The name of the channel. (user-mutable)
     * 
     * @param name
     *        The name of the channel. (user-mutable)
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The name of the channel. (user-mutable)
     * 
     * @return The name of the channel. (user-mutable)
     */

    public String getName() {
        return this.name;
    }

    /**
     * The name of the channel. (user-mutable)
     * 
     * @param name
     *        The name of the channel. (user-mutable)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeChannelResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * The number of currently healthy pipelines.
     * 
     * @param pipelinesRunningCount
     *        The number of currently healthy pipelines.
     */

    public void setPipelinesRunningCount(Integer pipelinesRunningCount) {
        this.pipelinesRunningCount = pipelinesRunningCount;
    }

    /**
     * The number of currently healthy pipelines.
     * 
     * @return The number of currently healthy pipelines.
     */

    public Integer getPipelinesRunningCount() {
        return this.pipelinesRunningCount;
    }

    /**
     * The number of currently healthy pipelines.
     * 
     * @param pipelinesRunningCount
     *        The number of currently healthy pipelines.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeChannelResult withPipelinesRunningCount(Integer pipelinesRunningCount) {
        setPipelinesRunningCount(pipelinesRunningCount);
        return this;
    }

    /**
     * The Amazon Resource Name (ARN) of the role assumed when running the Channel.
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the role assumed when running the Channel.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * The Amazon Resource Name (ARN) of the role assumed when running the Channel.
     * 
     * @return The Amazon Resource Name (ARN) of the role assumed when running the Channel.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * The Amazon Resource Name (ARN) of the role assumed when running the Channel.
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the role assumed when running the Channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeChannelResult withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * @param state
     * @see ChannelState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return
     * @see ChannelState
     */

    public String getState() {
        return this.state;
    }

    /**
     * @param state
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChannelState
     */

    public DescribeChannelResult withState(String state) {
        setState(state);
        return this;
    }

    /**
     * @param state
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChannelState
     */

    public DescribeChannelResult withState(ChannelState state) {
        this.state = state.toString();
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

    public DescribeChannelResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    public DescribeChannelResult addTagsEntry(String key, String value) {
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

    public DescribeChannelResult clearTagsEntries() {
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
        if (getChannelClass() != null)
            sb.append("ChannelClass: ").append(getChannelClass()).append(",");
        if (getDestinations() != null)
            sb.append("Destinations: ").append(getDestinations()).append(",");
        if (getEgressEndpoints() != null)
            sb.append("EgressEndpoints: ").append(getEgressEndpoints()).append(",");
        if (getEncoderSettings() != null)
            sb.append("EncoderSettings: ").append(getEncoderSettings()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getInputAttachments() != null)
            sb.append("InputAttachments: ").append(getInputAttachments()).append(",");
        if (getInputSpecification() != null)
            sb.append("InputSpecification: ").append(getInputSpecification()).append(",");
        if (getLogLevel() != null)
            sb.append("LogLevel: ").append(getLogLevel()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPipelinesRunningCount() != null)
            sb.append("PipelinesRunningCount: ").append(getPipelinesRunningCount()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
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

        if (obj instanceof DescribeChannelResult == false)
            return false;
        DescribeChannelResult other = (DescribeChannelResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getChannelClass() == null ^ this.getChannelClass() == null)
            return false;
        if (other.getChannelClass() != null && other.getChannelClass().equals(this.getChannelClass()) == false)
            return false;
        if (other.getDestinations() == null ^ this.getDestinations() == null)
            return false;
        if (other.getDestinations() != null && other.getDestinations().equals(this.getDestinations()) == false)
            return false;
        if (other.getEgressEndpoints() == null ^ this.getEgressEndpoints() == null)
            return false;
        if (other.getEgressEndpoints() != null && other.getEgressEndpoints().equals(this.getEgressEndpoints()) == false)
            return false;
        if (other.getEncoderSettings() == null ^ this.getEncoderSettings() == null)
            return false;
        if (other.getEncoderSettings() != null && other.getEncoderSettings().equals(this.getEncoderSettings()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
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
        if (other.getPipelinesRunningCount() == null ^ this.getPipelinesRunningCount() == null)
            return false;
        if (other.getPipelinesRunningCount() != null && other.getPipelinesRunningCount().equals(this.getPipelinesRunningCount()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
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
        hashCode = prime * hashCode + ((getChannelClass() == null) ? 0 : getChannelClass().hashCode());
        hashCode = prime * hashCode + ((getDestinations() == null) ? 0 : getDestinations().hashCode());
        hashCode = prime * hashCode + ((getEgressEndpoints() == null) ? 0 : getEgressEndpoints().hashCode());
        hashCode = prime * hashCode + ((getEncoderSettings() == null) ? 0 : getEncoderSettings().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getInputAttachments() == null) ? 0 : getInputAttachments().hashCode());
        hashCode = prime * hashCode + ((getInputSpecification() == null) ? 0 : getInputSpecification().hashCode());
        hashCode = prime * hashCode + ((getLogLevel() == null) ? 0 : getLogLevel().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPipelinesRunningCount() == null) ? 0 : getPipelinesRunningCount().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public DescribeChannelResult clone() {
        try {
            return (DescribeChannelResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
