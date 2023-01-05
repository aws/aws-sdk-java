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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/ListMediaPipelines"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListMediaPipelinesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The media pipeline objects in the list.
     * </p>
     */
    private java.util.List<MediaPipelineSummary> mediaPipelines;
    /**
     * <p>
     * The token used to retrieve the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The media pipeline objects in the list.
     * </p>
     * 
     * @return The media pipeline objects in the list.
     */

    public java.util.List<MediaPipelineSummary> getMediaPipelines() {
        return mediaPipelines;
    }

    /**
     * <p>
     * The media pipeline objects in the list.
     * </p>
     * 
     * @param mediaPipelines
     *        The media pipeline objects in the list.
     */

    public void setMediaPipelines(java.util.Collection<MediaPipelineSummary> mediaPipelines) {
        if (mediaPipelines == null) {
            this.mediaPipelines = null;
            return;
        }

        this.mediaPipelines = new java.util.ArrayList<MediaPipelineSummary>(mediaPipelines);
    }

    /**
     * <p>
     * The media pipeline objects in the list.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMediaPipelines(java.util.Collection)} or {@link #withMediaPipelines(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param mediaPipelines
     *        The media pipeline objects in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMediaPipelinesResult withMediaPipelines(MediaPipelineSummary... mediaPipelines) {
        if (this.mediaPipelines == null) {
            setMediaPipelines(new java.util.ArrayList<MediaPipelineSummary>(mediaPipelines.length));
        }
        for (MediaPipelineSummary ele : mediaPipelines) {
            this.mediaPipelines.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The media pipeline objects in the list.
     * </p>
     * 
     * @param mediaPipelines
     *        The media pipeline objects in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMediaPipelinesResult withMediaPipelines(java.util.Collection<MediaPipelineSummary> mediaPipelines) {
        setMediaPipelines(mediaPipelines);
        return this;
    }

    /**
     * <p>
     * The token used to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token used to retrieve the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token used to retrieve the next page of results.
     * </p>
     * 
     * @return The token used to retrieve the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token used to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token used to retrieve the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMediaPipelinesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getMediaPipelines() != null)
            sb.append("MediaPipelines: ").append(getMediaPipelines()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListMediaPipelinesResult == false)
            return false;
        ListMediaPipelinesResult other = (ListMediaPipelinesResult) obj;
        if (other.getMediaPipelines() == null ^ this.getMediaPipelines() == null)
            return false;
        if (other.getMediaPipelines() != null && other.getMediaPipelines().equals(this.getMediaPipelines()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMediaPipelines() == null) ? 0 : getMediaPipelines().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListMediaPipelinesResult clone() {
        try {
            return (ListMediaPipelinesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
