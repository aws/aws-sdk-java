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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Pipelines to restart.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/RestartChannelPipelines" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RestartChannelPipelinesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** ID of channel */
    private String channelId;
    /** An array of pipelines to restart in this channel. Format PIPELINE_0 or PIPELINE_1. */
    private java.util.List<String> pipelineIds;

    /**
     * ID of channel
     * 
     * @param channelId
     *        ID of channel
     */

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    /**
     * ID of channel
     * 
     * @return ID of channel
     */

    public String getChannelId() {
        return this.channelId;
    }

    /**
     * ID of channel
     * 
     * @param channelId
     *        ID of channel
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestartChannelPipelinesRequest withChannelId(String channelId) {
        setChannelId(channelId);
        return this;
    }

    /**
     * An array of pipelines to restart in this channel. Format PIPELINE_0 or PIPELINE_1.
     * 
     * @return An array of pipelines to restart in this channel. Format PIPELINE_0 or PIPELINE_1.
     * @see ChannelPipelineIdToRestart
     */

    public java.util.List<String> getPipelineIds() {
        return pipelineIds;
    }

    /**
     * An array of pipelines to restart in this channel. Format PIPELINE_0 or PIPELINE_1.
     * 
     * @param pipelineIds
     *        An array of pipelines to restart in this channel. Format PIPELINE_0 or PIPELINE_1.
     * @see ChannelPipelineIdToRestart
     */

    public void setPipelineIds(java.util.Collection<String> pipelineIds) {
        if (pipelineIds == null) {
            this.pipelineIds = null;
            return;
        }

        this.pipelineIds = new java.util.ArrayList<String>(pipelineIds);
    }

    /**
     * An array of pipelines to restart in this channel. Format PIPELINE_0 or PIPELINE_1.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPipelineIds(java.util.Collection)} or {@link #withPipelineIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param pipelineIds
     *        An array of pipelines to restart in this channel. Format PIPELINE_0 or PIPELINE_1.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChannelPipelineIdToRestart
     */

    public RestartChannelPipelinesRequest withPipelineIds(String... pipelineIds) {
        if (this.pipelineIds == null) {
            setPipelineIds(new java.util.ArrayList<String>(pipelineIds.length));
        }
        for (String ele : pipelineIds) {
            this.pipelineIds.add(ele);
        }
        return this;
    }

    /**
     * An array of pipelines to restart in this channel. Format PIPELINE_0 or PIPELINE_1.
     * 
     * @param pipelineIds
     *        An array of pipelines to restart in this channel. Format PIPELINE_0 or PIPELINE_1.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChannelPipelineIdToRestart
     */

    public RestartChannelPipelinesRequest withPipelineIds(java.util.Collection<String> pipelineIds) {
        setPipelineIds(pipelineIds);
        return this;
    }

    /**
     * An array of pipelines to restart in this channel. Format PIPELINE_0 or PIPELINE_1.
     * 
     * @param pipelineIds
     *        An array of pipelines to restart in this channel. Format PIPELINE_0 or PIPELINE_1.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChannelPipelineIdToRestart
     */

    public RestartChannelPipelinesRequest withPipelineIds(ChannelPipelineIdToRestart... pipelineIds) {
        java.util.ArrayList<String> pipelineIdsCopy = new java.util.ArrayList<String>(pipelineIds.length);
        for (ChannelPipelineIdToRestart value : pipelineIds) {
            pipelineIdsCopy.add(value.toString());
        }
        if (getPipelineIds() == null) {
            setPipelineIds(pipelineIdsCopy);
        } else {
            getPipelineIds().addAll(pipelineIdsCopy);
        }
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
        if (getPipelineIds() != null)
            sb.append("PipelineIds: ").append(getPipelineIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RestartChannelPipelinesRequest == false)
            return false;
        RestartChannelPipelinesRequest other = (RestartChannelPipelinesRequest) obj;
        if (other.getChannelId() == null ^ this.getChannelId() == null)
            return false;
        if (other.getChannelId() != null && other.getChannelId().equals(this.getChannelId()) == false)
            return false;
        if (other.getPipelineIds() == null ^ this.getPipelineIds() == null)
            return false;
        if (other.getPipelineIds() != null && other.getPipelineIds().equals(this.getPipelineIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelId() == null) ? 0 : getChannelId().hashCode());
        hashCode = prime * hashCode + ((getPipelineIds() == null) ? 0 : getPipelineIds().hashCode());
        return hashCode;
    }

    @Override
    public RestartChannelPipelinesRequest clone() {
        return (RestartChannelPipelinesRequest) super.clone();
    }

}
