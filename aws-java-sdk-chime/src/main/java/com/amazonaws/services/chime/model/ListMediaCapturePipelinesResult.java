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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListMediaCapturePipelines" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListMediaCapturePipelinesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The media capture pipeline objects in the list.
     * </p>
     */
    private java.util.List<MediaCapturePipeline> mediaCapturePipelines;
    /**
     * <p>
     * The token used to retrieve the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The media capture pipeline objects in the list.
     * </p>
     * 
     * @return The media capture pipeline objects in the list.
     */

    public java.util.List<MediaCapturePipeline> getMediaCapturePipelines() {
        return mediaCapturePipelines;
    }

    /**
     * <p>
     * The media capture pipeline objects in the list.
     * </p>
     * 
     * @param mediaCapturePipelines
     *        The media capture pipeline objects in the list.
     */

    public void setMediaCapturePipelines(java.util.Collection<MediaCapturePipeline> mediaCapturePipelines) {
        if (mediaCapturePipelines == null) {
            this.mediaCapturePipelines = null;
            return;
        }

        this.mediaCapturePipelines = new java.util.ArrayList<MediaCapturePipeline>(mediaCapturePipelines);
    }

    /**
     * <p>
     * The media capture pipeline objects in the list.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMediaCapturePipelines(java.util.Collection)} or
     * {@link #withMediaCapturePipelines(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param mediaCapturePipelines
     *        The media capture pipeline objects in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMediaCapturePipelinesResult withMediaCapturePipelines(MediaCapturePipeline... mediaCapturePipelines) {
        if (this.mediaCapturePipelines == null) {
            setMediaCapturePipelines(new java.util.ArrayList<MediaCapturePipeline>(mediaCapturePipelines.length));
        }
        for (MediaCapturePipeline ele : mediaCapturePipelines) {
            this.mediaCapturePipelines.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The media capture pipeline objects in the list.
     * </p>
     * 
     * @param mediaCapturePipelines
     *        The media capture pipeline objects in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMediaCapturePipelinesResult withMediaCapturePipelines(java.util.Collection<MediaCapturePipeline> mediaCapturePipelines) {
        setMediaCapturePipelines(mediaCapturePipelines);
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

    public ListMediaCapturePipelinesResult withNextToken(String nextToken) {
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
        if (getMediaCapturePipelines() != null)
            sb.append("MediaCapturePipelines: ").append(getMediaCapturePipelines()).append(",");
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

        if (obj instanceof ListMediaCapturePipelinesResult == false)
            return false;
        ListMediaCapturePipelinesResult other = (ListMediaCapturePipelinesResult) obj;
        if (other.getMediaCapturePipelines() == null ^ this.getMediaCapturePipelines() == null)
            return false;
        if (other.getMediaCapturePipelines() != null && other.getMediaCapturePipelines().equals(this.getMediaCapturePipelines()) == false)
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

        hashCode = prime * hashCode + ((getMediaCapturePipelines() == null) ? 0 : getMediaCapturePipelines().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListMediaCapturePipelinesResult clone() {
        try {
            return (ListMediaCapturePipelinesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
