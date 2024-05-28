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
 * Placeholder documentation for DescribeThumbnailsRequest
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DescribeThumbnails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeThumbnailsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** Unique ID of the channel */
    private String channelId;
    /** Pipeline ID ("0" or "1") */
    private String pipelineId;
    /** thumbnail type */
    private String thumbnailType;

    /**
     * Unique ID of the channel
     * 
     * @param channelId
     *        Unique ID of the channel
     */

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    /**
     * Unique ID of the channel
     * 
     * @return Unique ID of the channel
     */

    public String getChannelId() {
        return this.channelId;
    }

    /**
     * Unique ID of the channel
     * 
     * @param channelId
     *        Unique ID of the channel
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeThumbnailsRequest withChannelId(String channelId) {
        setChannelId(channelId);
        return this;
    }

    /**
     * Pipeline ID ("0" or "1")
     * 
     * @param pipelineId
     *        Pipeline ID ("0" or "1")
     */

    public void setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
    }

    /**
     * Pipeline ID ("0" or "1")
     * 
     * @return Pipeline ID ("0" or "1")
     */

    public String getPipelineId() {
        return this.pipelineId;
    }

    /**
     * Pipeline ID ("0" or "1")
     * 
     * @param pipelineId
     *        Pipeline ID ("0" or "1")
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeThumbnailsRequest withPipelineId(String pipelineId) {
        setPipelineId(pipelineId);
        return this;
    }

    /**
     * thumbnail type
     * 
     * @param thumbnailType
     *        thumbnail type
     */

    public void setThumbnailType(String thumbnailType) {
        this.thumbnailType = thumbnailType;
    }

    /**
     * thumbnail type
     * 
     * @return thumbnail type
     */

    public String getThumbnailType() {
        return this.thumbnailType;
    }

    /**
     * thumbnail type
     * 
     * @param thumbnailType
     *        thumbnail type
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeThumbnailsRequest withThumbnailType(String thumbnailType) {
        setThumbnailType(thumbnailType);
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
        if (getPipelineId() != null)
            sb.append("PipelineId: ").append(getPipelineId()).append(",");
        if (getThumbnailType() != null)
            sb.append("ThumbnailType: ").append(getThumbnailType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeThumbnailsRequest == false)
            return false;
        DescribeThumbnailsRequest other = (DescribeThumbnailsRequest) obj;
        if (other.getChannelId() == null ^ this.getChannelId() == null)
            return false;
        if (other.getChannelId() != null && other.getChannelId().equals(this.getChannelId()) == false)
            return false;
        if (other.getPipelineId() == null ^ this.getPipelineId() == null)
            return false;
        if (other.getPipelineId() != null && other.getPipelineId().equals(this.getPipelineId()) == false)
            return false;
        if (other.getThumbnailType() == null ^ this.getThumbnailType() == null)
            return false;
        if (other.getThumbnailType() != null && other.getThumbnailType().equals(this.getThumbnailType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelId() == null) ? 0 : getChannelId().hashCode());
        hashCode = prime * hashCode + ((getPipelineId() == null) ? 0 : getPipelineId().hashCode());
        hashCode = prime * hashCode + ((getThumbnailType() == null) ? 0 : getThumbnailType().hashCode());
        return hashCode;
    }

    @Override
    public DescribeThumbnailsRequest clone() {
        return (DescribeThumbnailsRequest) super.clone();
    }

}
