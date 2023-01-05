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
package com.amazonaws.services.chimesdkmediapipelines.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/CreateMediaLiveConnectorPipeline"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateMediaLiveConnectorPipelineRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The media pipeline's data sources.
     * </p>
     */
    private java.util.List<LiveConnectorSourceConfiguration> sources;
    /**
     * <p>
     * The media pipeline's data sinks.
     * </p>
     */
    private java.util.List<LiveConnectorSinkConfiguration> sinks;
    /**
     * <p>
     * The token assigned to the client making the request.
     * </p>
     */
    private String clientRequestToken;
    /**
     * <p>
     * The tags associated with the media pipeline.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The media pipeline's data sources.
     * </p>
     * 
     * @return The media pipeline's data sources.
     */

    public java.util.List<LiveConnectorSourceConfiguration> getSources() {
        return sources;
    }

    /**
     * <p>
     * The media pipeline's data sources.
     * </p>
     * 
     * @param sources
     *        The media pipeline's data sources.
     */

    public void setSources(java.util.Collection<LiveConnectorSourceConfiguration> sources) {
        if (sources == null) {
            this.sources = null;
            return;
        }

        this.sources = new java.util.ArrayList<LiveConnectorSourceConfiguration>(sources);
    }

    /**
     * <p>
     * The media pipeline's data sources.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSources(java.util.Collection)} or {@link #withSources(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param sources
     *        The media pipeline's data sources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMediaLiveConnectorPipelineRequest withSources(LiveConnectorSourceConfiguration... sources) {
        if (this.sources == null) {
            setSources(new java.util.ArrayList<LiveConnectorSourceConfiguration>(sources.length));
        }
        for (LiveConnectorSourceConfiguration ele : sources) {
            this.sources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The media pipeline's data sources.
     * </p>
     * 
     * @param sources
     *        The media pipeline's data sources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMediaLiveConnectorPipelineRequest withSources(java.util.Collection<LiveConnectorSourceConfiguration> sources) {
        setSources(sources);
        return this;
    }

    /**
     * <p>
     * The media pipeline's data sinks.
     * </p>
     * 
     * @return The media pipeline's data sinks.
     */

    public java.util.List<LiveConnectorSinkConfiguration> getSinks() {
        return sinks;
    }

    /**
     * <p>
     * The media pipeline's data sinks.
     * </p>
     * 
     * @param sinks
     *        The media pipeline's data sinks.
     */

    public void setSinks(java.util.Collection<LiveConnectorSinkConfiguration> sinks) {
        if (sinks == null) {
            this.sinks = null;
            return;
        }

        this.sinks = new java.util.ArrayList<LiveConnectorSinkConfiguration>(sinks);
    }

    /**
     * <p>
     * The media pipeline's data sinks.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSinks(java.util.Collection)} or {@link #withSinks(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param sinks
     *        The media pipeline's data sinks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMediaLiveConnectorPipelineRequest withSinks(LiveConnectorSinkConfiguration... sinks) {
        if (this.sinks == null) {
            setSinks(new java.util.ArrayList<LiveConnectorSinkConfiguration>(sinks.length));
        }
        for (LiveConnectorSinkConfiguration ele : sinks) {
            this.sinks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The media pipeline's data sinks.
     * </p>
     * 
     * @param sinks
     *        The media pipeline's data sinks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMediaLiveConnectorPipelineRequest withSinks(java.util.Collection<LiveConnectorSinkConfiguration> sinks) {
        setSinks(sinks);
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

    public CreateMediaLiveConnectorPipelineRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * The tags associated with the media pipeline.
     * </p>
     * 
     * @return The tags associated with the media pipeline.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags associated with the media pipeline.
     * </p>
     * 
     * @param tags
     *        The tags associated with the media pipeline.
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
     * The tags associated with the media pipeline.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags associated with the media pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMediaLiveConnectorPipelineRequest withTags(Tag... tags) {
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
     * The tags associated with the media pipeline.
     * </p>
     * 
     * @param tags
     *        The tags associated with the media pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMediaLiveConnectorPipelineRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getSources() != null)
            sb.append("Sources: ").append(getSources()).append(",");
        if (getSinks() != null)
            sb.append("Sinks: ").append(getSinks()).append(",");
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

        if (obj instanceof CreateMediaLiveConnectorPipelineRequest == false)
            return false;
        CreateMediaLiveConnectorPipelineRequest other = (CreateMediaLiveConnectorPipelineRequest) obj;
        if (other.getSources() == null ^ this.getSources() == null)
            return false;
        if (other.getSources() != null && other.getSources().equals(this.getSources()) == false)
            return false;
        if (other.getSinks() == null ^ this.getSinks() == null)
            return false;
        if (other.getSinks() != null && other.getSinks().equals(this.getSinks()) == false)
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

        hashCode = prime * hashCode + ((getSources() == null) ? 0 : getSources().hashCode());
        hashCode = prime * hashCode + ((getSinks() == null) ? 0 : getSinks().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateMediaLiveConnectorPipelineRequest clone() {
        return (CreateMediaLiveConnectorPipelineRequest) super.clone();
    }

}
