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
 *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/CreateMediaConcatenationPipeline"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateMediaConcatenationPipelineRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An object that specifies the sources for the media concatenation pipeline.
     * </p>
     */
    private java.util.List<ConcatenationSource> sources;
    /**
     * <p>
     * An object that specifies the data sinks for the media concatenation pipeline.
     * </p>
     */
    private java.util.List<ConcatenationSink> sinks;
    /**
     * <p>
     * The unique identifier for the client request. The token makes the API request idempotent. Use a unique token for
     * each media concatenation pipeline request.
     * </p>
     */
    private String clientRequestToken;
    /**
     * <p>
     * The tags associated with the media concatenation pipeline.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * An object that specifies the sources for the media concatenation pipeline.
     * </p>
     * 
     * @return An object that specifies the sources for the media concatenation pipeline.
     */

    public java.util.List<ConcatenationSource> getSources() {
        return sources;
    }

    /**
     * <p>
     * An object that specifies the sources for the media concatenation pipeline.
     * </p>
     * 
     * @param sources
     *        An object that specifies the sources for the media concatenation pipeline.
     */

    public void setSources(java.util.Collection<ConcatenationSource> sources) {
        if (sources == null) {
            this.sources = null;
            return;
        }

        this.sources = new java.util.ArrayList<ConcatenationSource>(sources);
    }

    /**
     * <p>
     * An object that specifies the sources for the media concatenation pipeline.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSources(java.util.Collection)} or {@link #withSources(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param sources
     *        An object that specifies the sources for the media concatenation pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMediaConcatenationPipelineRequest withSources(ConcatenationSource... sources) {
        if (this.sources == null) {
            setSources(new java.util.ArrayList<ConcatenationSource>(sources.length));
        }
        for (ConcatenationSource ele : sources) {
            this.sources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An object that specifies the sources for the media concatenation pipeline.
     * </p>
     * 
     * @param sources
     *        An object that specifies the sources for the media concatenation pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMediaConcatenationPipelineRequest withSources(java.util.Collection<ConcatenationSource> sources) {
        setSources(sources);
        return this;
    }

    /**
     * <p>
     * An object that specifies the data sinks for the media concatenation pipeline.
     * </p>
     * 
     * @return An object that specifies the data sinks for the media concatenation pipeline.
     */

    public java.util.List<ConcatenationSink> getSinks() {
        return sinks;
    }

    /**
     * <p>
     * An object that specifies the data sinks for the media concatenation pipeline.
     * </p>
     * 
     * @param sinks
     *        An object that specifies the data sinks for the media concatenation pipeline.
     */

    public void setSinks(java.util.Collection<ConcatenationSink> sinks) {
        if (sinks == null) {
            this.sinks = null;
            return;
        }

        this.sinks = new java.util.ArrayList<ConcatenationSink>(sinks);
    }

    /**
     * <p>
     * An object that specifies the data sinks for the media concatenation pipeline.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSinks(java.util.Collection)} or {@link #withSinks(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param sinks
     *        An object that specifies the data sinks for the media concatenation pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMediaConcatenationPipelineRequest withSinks(ConcatenationSink... sinks) {
        if (this.sinks == null) {
            setSinks(new java.util.ArrayList<ConcatenationSink>(sinks.length));
        }
        for (ConcatenationSink ele : sinks) {
            this.sinks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An object that specifies the data sinks for the media concatenation pipeline.
     * </p>
     * 
     * @param sinks
     *        An object that specifies the data sinks for the media concatenation pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMediaConcatenationPipelineRequest withSinks(java.util.Collection<ConcatenationSink> sinks) {
        setSinks(sinks);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the client request. The token makes the API request idempotent. Use a unique token for
     * each media concatenation pipeline request.
     * </p>
     * 
     * @param clientRequestToken
     *        The unique identifier for the client request. The token makes the API request idempotent. Use a unique
     *        token for each media concatenation pipeline request.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * The unique identifier for the client request. The token makes the API request idempotent. Use a unique token for
     * each media concatenation pipeline request.
     * </p>
     * 
     * @return The unique identifier for the client request. The token makes the API request idempotent. Use a unique
     *         token for each media concatenation pipeline request.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * The unique identifier for the client request. The token makes the API request idempotent. Use a unique token for
     * each media concatenation pipeline request.
     * </p>
     * 
     * @param clientRequestToken
     *        The unique identifier for the client request. The token makes the API request idempotent. Use a unique
     *        token for each media concatenation pipeline request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMediaConcatenationPipelineRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * The tags associated with the media concatenation pipeline.
     * </p>
     * 
     * @return The tags associated with the media concatenation pipeline.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags associated with the media concatenation pipeline.
     * </p>
     * 
     * @param tags
     *        The tags associated with the media concatenation pipeline.
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
     * The tags associated with the media concatenation pipeline.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags associated with the media concatenation pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMediaConcatenationPipelineRequest withTags(Tag... tags) {
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
     * The tags associated with the media concatenation pipeline.
     * </p>
     * 
     * @param tags
     *        The tags associated with the media concatenation pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMediaConcatenationPipelineRequest withTags(java.util.Collection<Tag> tags) {
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

        if (obj instanceof CreateMediaConcatenationPipelineRequest == false)
            return false;
        CreateMediaConcatenationPipelineRequest other = (CreateMediaConcatenationPipelineRequest) obj;
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
    public CreateMediaConcatenationPipelineRequest clone() {
        return (CreateMediaConcatenationPipelineRequest) super.clone();
    }

}
