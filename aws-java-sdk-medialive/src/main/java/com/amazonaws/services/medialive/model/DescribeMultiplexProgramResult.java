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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * Placeholder documentation for DescribeMultiplexProgramResponse
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DescribeMultiplexProgram" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeMultiplexProgramResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** The MediaLive channel associated with the program. */
    private String channelId;
    /** The settings for this multiplex program. */
    private MultiplexProgramSettings multiplexProgramSettings;
    /** The packet identifier map for this multiplex program. */
    private MultiplexProgramPacketIdentifiersMap packetIdentifiersMap;
    /**
     * Contains information about the current sources for the specified program in the specified multiplex. Keep in mind
     * that each multiplex pipeline connects to both pipelines in a given source channel (the channel identified by the
     * program). But only one of those channel pipelines is ever active at one time.
     */
    private java.util.List<MultiplexProgramPipelineDetail> pipelineDetails;
    /** The name of the multiplex program. */
    private String programName;

    /**
     * The MediaLive channel associated with the program.
     * 
     * @param channelId
     *        The MediaLive channel associated with the program.
     */

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    /**
     * The MediaLive channel associated with the program.
     * 
     * @return The MediaLive channel associated with the program.
     */

    public String getChannelId() {
        return this.channelId;
    }

    /**
     * The MediaLive channel associated with the program.
     * 
     * @param channelId
     *        The MediaLive channel associated with the program.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMultiplexProgramResult withChannelId(String channelId) {
        setChannelId(channelId);
        return this;
    }

    /**
     * The settings for this multiplex program.
     * 
     * @param multiplexProgramSettings
     *        The settings for this multiplex program.
     */

    public void setMultiplexProgramSettings(MultiplexProgramSettings multiplexProgramSettings) {
        this.multiplexProgramSettings = multiplexProgramSettings;
    }

    /**
     * The settings for this multiplex program.
     * 
     * @return The settings for this multiplex program.
     */

    public MultiplexProgramSettings getMultiplexProgramSettings() {
        return this.multiplexProgramSettings;
    }

    /**
     * The settings for this multiplex program.
     * 
     * @param multiplexProgramSettings
     *        The settings for this multiplex program.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMultiplexProgramResult withMultiplexProgramSettings(MultiplexProgramSettings multiplexProgramSettings) {
        setMultiplexProgramSettings(multiplexProgramSettings);
        return this;
    }

    /**
     * The packet identifier map for this multiplex program.
     * 
     * @param packetIdentifiersMap
     *        The packet identifier map for this multiplex program.
     */

    public void setPacketIdentifiersMap(MultiplexProgramPacketIdentifiersMap packetIdentifiersMap) {
        this.packetIdentifiersMap = packetIdentifiersMap;
    }

    /**
     * The packet identifier map for this multiplex program.
     * 
     * @return The packet identifier map for this multiplex program.
     */

    public MultiplexProgramPacketIdentifiersMap getPacketIdentifiersMap() {
        return this.packetIdentifiersMap;
    }

    /**
     * The packet identifier map for this multiplex program.
     * 
     * @param packetIdentifiersMap
     *        The packet identifier map for this multiplex program.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMultiplexProgramResult withPacketIdentifiersMap(MultiplexProgramPacketIdentifiersMap packetIdentifiersMap) {
        setPacketIdentifiersMap(packetIdentifiersMap);
        return this;
    }

    /**
     * Contains information about the current sources for the specified program in the specified multiplex. Keep in mind
     * that each multiplex pipeline connects to both pipelines in a given source channel (the channel identified by the
     * program). But only one of those channel pipelines is ever active at one time.
     * 
     * @return Contains information about the current sources for the specified program in the specified multiplex. Keep
     *         in mind that each multiplex pipeline connects to both pipelines in a given source channel (the channel
     *         identified by the program). But only one of those channel pipelines is ever active at one time.
     */

    public java.util.List<MultiplexProgramPipelineDetail> getPipelineDetails() {
        return pipelineDetails;
    }

    /**
     * Contains information about the current sources for the specified program in the specified multiplex. Keep in mind
     * that each multiplex pipeline connects to both pipelines in a given source channel (the channel identified by the
     * program). But only one of those channel pipelines is ever active at one time.
     * 
     * @param pipelineDetails
     *        Contains information about the current sources for the specified program in the specified multiplex. Keep
     *        in mind that each multiplex pipeline connects to both pipelines in a given source channel (the channel
     *        identified by the program). But only one of those channel pipelines is ever active at one time.
     */

    public void setPipelineDetails(java.util.Collection<MultiplexProgramPipelineDetail> pipelineDetails) {
        if (pipelineDetails == null) {
            this.pipelineDetails = null;
            return;
        }

        this.pipelineDetails = new java.util.ArrayList<MultiplexProgramPipelineDetail>(pipelineDetails);
    }

    /**
     * Contains information about the current sources for the specified program in the specified multiplex. Keep in mind
     * that each multiplex pipeline connects to both pipelines in a given source channel (the channel identified by the
     * program). But only one of those channel pipelines is ever active at one time.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPipelineDetails(java.util.Collection)} or {@link #withPipelineDetails(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param pipelineDetails
     *        Contains information about the current sources for the specified program in the specified multiplex. Keep
     *        in mind that each multiplex pipeline connects to both pipelines in a given source channel (the channel
     *        identified by the program). But only one of those channel pipelines is ever active at one time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMultiplexProgramResult withPipelineDetails(MultiplexProgramPipelineDetail... pipelineDetails) {
        if (this.pipelineDetails == null) {
            setPipelineDetails(new java.util.ArrayList<MultiplexProgramPipelineDetail>(pipelineDetails.length));
        }
        for (MultiplexProgramPipelineDetail ele : pipelineDetails) {
            this.pipelineDetails.add(ele);
        }
        return this;
    }

    /**
     * Contains information about the current sources for the specified program in the specified multiplex. Keep in mind
     * that each multiplex pipeline connects to both pipelines in a given source channel (the channel identified by the
     * program). But only one of those channel pipelines is ever active at one time.
     * 
     * @param pipelineDetails
     *        Contains information about the current sources for the specified program in the specified multiplex. Keep
     *        in mind that each multiplex pipeline connects to both pipelines in a given source channel (the channel
     *        identified by the program). But only one of those channel pipelines is ever active at one time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMultiplexProgramResult withPipelineDetails(java.util.Collection<MultiplexProgramPipelineDetail> pipelineDetails) {
        setPipelineDetails(pipelineDetails);
        return this;
    }

    /**
     * The name of the multiplex program.
     * 
     * @param programName
     *        The name of the multiplex program.
     */

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    /**
     * The name of the multiplex program.
     * 
     * @return The name of the multiplex program.
     */

    public String getProgramName() {
        return this.programName;
    }

    /**
     * The name of the multiplex program.
     * 
     * @param programName
     *        The name of the multiplex program.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMultiplexProgramResult withProgramName(String programName) {
        setProgramName(programName);
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
        if (getMultiplexProgramSettings() != null)
            sb.append("MultiplexProgramSettings: ").append(getMultiplexProgramSettings()).append(",");
        if (getPacketIdentifiersMap() != null)
            sb.append("PacketIdentifiersMap: ").append(getPacketIdentifiersMap()).append(",");
        if (getPipelineDetails() != null)
            sb.append("PipelineDetails: ").append(getPipelineDetails()).append(",");
        if (getProgramName() != null)
            sb.append("ProgramName: ").append(getProgramName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeMultiplexProgramResult == false)
            return false;
        DescribeMultiplexProgramResult other = (DescribeMultiplexProgramResult) obj;
        if (other.getChannelId() == null ^ this.getChannelId() == null)
            return false;
        if (other.getChannelId() != null && other.getChannelId().equals(this.getChannelId()) == false)
            return false;
        if (other.getMultiplexProgramSettings() == null ^ this.getMultiplexProgramSettings() == null)
            return false;
        if (other.getMultiplexProgramSettings() != null && other.getMultiplexProgramSettings().equals(this.getMultiplexProgramSettings()) == false)
            return false;
        if (other.getPacketIdentifiersMap() == null ^ this.getPacketIdentifiersMap() == null)
            return false;
        if (other.getPacketIdentifiersMap() != null && other.getPacketIdentifiersMap().equals(this.getPacketIdentifiersMap()) == false)
            return false;
        if (other.getPipelineDetails() == null ^ this.getPipelineDetails() == null)
            return false;
        if (other.getPipelineDetails() != null && other.getPipelineDetails().equals(this.getPipelineDetails()) == false)
            return false;
        if (other.getProgramName() == null ^ this.getProgramName() == null)
            return false;
        if (other.getProgramName() != null && other.getProgramName().equals(this.getProgramName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelId() == null) ? 0 : getChannelId().hashCode());
        hashCode = prime * hashCode + ((getMultiplexProgramSettings() == null) ? 0 : getMultiplexProgramSettings().hashCode());
        hashCode = prime * hashCode + ((getPacketIdentifiersMap() == null) ? 0 : getPacketIdentifiersMap().hashCode());
        hashCode = prime * hashCode + ((getPipelineDetails() == null) ? 0 : getPipelineDetails().hashCode());
        hashCode = prime * hashCode + ((getProgramName() == null) ? 0 : getProgramName().hashCode());
        return hashCode;
    }

    @Override
    public DescribeMultiplexProgramResult clone() {
        try {
            return (DescribeMultiplexProgramResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
