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
package com.amazonaws.services.chimesdkmediapipelines.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/CreateMediaPipelineKinesisVideoStreamPool"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateMediaPipelineKinesisVideoStreamPoolRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The configuration settings for the video stream.
     * </p>
     */
    private KinesisVideoStreamConfiguration streamConfiguration;
    /**
     * <p>
     * The name of the video stream pool.
     * </p>
     */
    private String poolName;
    /**
     * <p>
     * The token assigned to the client making the request.
     * </p>
     */
    private String clientRequestToken;
    /**
     * <p>
     * The tags assigned to the video stream pool.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The configuration settings for the video stream.
     * </p>
     * 
     * @param streamConfiguration
     *        The configuration settings for the video stream.
     */

    public void setStreamConfiguration(KinesisVideoStreamConfiguration streamConfiguration) {
        this.streamConfiguration = streamConfiguration;
    }

    /**
     * <p>
     * The configuration settings for the video stream.
     * </p>
     * 
     * @return The configuration settings for the video stream.
     */

    public KinesisVideoStreamConfiguration getStreamConfiguration() {
        return this.streamConfiguration;
    }

    /**
     * <p>
     * The configuration settings for the video stream.
     * </p>
     * 
     * @param streamConfiguration
     *        The configuration settings for the video stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMediaPipelineKinesisVideoStreamPoolRequest withStreamConfiguration(KinesisVideoStreamConfiguration streamConfiguration) {
        setStreamConfiguration(streamConfiguration);
        return this;
    }

    /**
     * <p>
     * The name of the video stream pool.
     * </p>
     * 
     * @param poolName
     *        The name of the video stream pool.
     */

    public void setPoolName(String poolName) {
        this.poolName = poolName;
    }

    /**
     * <p>
     * The name of the video stream pool.
     * </p>
     * 
     * @return The name of the video stream pool.
     */

    public String getPoolName() {
        return this.poolName;
    }

    /**
     * <p>
     * The name of the video stream pool.
     * </p>
     * 
     * @param poolName
     *        The name of the video stream pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMediaPipelineKinesisVideoStreamPoolRequest withPoolName(String poolName) {
        setPoolName(poolName);
        return this;
    }

    /**
     * <p>
     * The token assigned to the client making the request.
     * </p>
     * 
     * @param clientRequestToken
     *        The token assigned to the client making the request.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * The token assigned to the client making the request.
     * </p>
     * 
     * @return The token assigned to the client making the request.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * The token assigned to the client making the request.
     * </p>
     * 
     * @param clientRequestToken
     *        The token assigned to the client making the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMediaPipelineKinesisVideoStreamPoolRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * The tags assigned to the video stream pool.
     * </p>
     * 
     * @return The tags assigned to the video stream pool.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags assigned to the video stream pool.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the video stream pool.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The tags assigned to the video stream pool.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the video stream pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMediaPipelineKinesisVideoStreamPoolRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags assigned to the video stream pool.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the video stream pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMediaPipelineKinesisVideoStreamPoolRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getStreamConfiguration() != null)
            sb.append("StreamConfiguration: ").append(getStreamConfiguration()).append(",");
        if (getPoolName() != null)
            sb.append("PoolName: ").append(getPoolName()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append("***Sensitive Data Redacted***").append(",");
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

        if (obj instanceof CreateMediaPipelineKinesisVideoStreamPoolRequest == false)
            return false;
        CreateMediaPipelineKinesisVideoStreamPoolRequest other = (CreateMediaPipelineKinesisVideoStreamPoolRequest) obj;
        if (other.getStreamConfiguration() == null ^ this.getStreamConfiguration() == null)
            return false;
        if (other.getStreamConfiguration() != null && other.getStreamConfiguration().equals(this.getStreamConfiguration()) == false)
            return false;
        if (other.getPoolName() == null ^ this.getPoolName() == null)
            return false;
        if (other.getPoolName() != null && other.getPoolName().equals(this.getPoolName()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
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

        hashCode = prime * hashCode + ((getStreamConfiguration() == null) ? 0 : getStreamConfiguration().hashCode());
        hashCode = prime * hashCode + ((getPoolName() == null) ? 0 : getPoolName().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateMediaPipelineKinesisVideoStreamPoolRequest clone() {
        return (CreateMediaPipelineKinesisVideoStreamPoolRequest) super.clone();
    }

}
