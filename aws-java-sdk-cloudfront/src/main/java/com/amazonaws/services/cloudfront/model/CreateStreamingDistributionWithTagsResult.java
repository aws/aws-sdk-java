/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;

/**
 * <p>
 * The returned result of the corresponding request.
 * </p>
 */
public class CreateStreamingDistributionWithTagsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The streaming distribution's information.
     * </p>
     */
    private StreamingDistribution streamingDistribution;
    /**
     * <p>
     * The fully qualified URI of the new streaming distribution resource just created. For example:
     * <code> https://cloudfront.amazonaws.com/2010-11-01/streaming-distribution/EGTXBD79H29TRA8</code>.
     * </p>
     */
    private String location;

    private String eTag;

    /**
     * <p>
     * The streaming distribution's information.
     * </p>
     * 
     * @param streamingDistribution
     *        The streaming distribution's information.
     */

    public void setStreamingDistribution(StreamingDistribution streamingDistribution) {
        this.streamingDistribution = streamingDistribution;
    }

    /**
     * <p>
     * The streaming distribution's information.
     * </p>
     * 
     * @return The streaming distribution's information.
     */

    public StreamingDistribution getStreamingDistribution() {
        return this.streamingDistribution;
    }

    /**
     * <p>
     * The streaming distribution's information.
     * </p>
     * 
     * @param streamingDistribution
     *        The streaming distribution's information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStreamingDistributionWithTagsResult withStreamingDistribution(StreamingDistribution streamingDistribution) {
        setStreamingDistribution(streamingDistribution);
        return this;
    }

    /**
     * <p>
     * The fully qualified URI of the new streaming distribution resource just created. For example:
     * <code> https://cloudfront.amazonaws.com/2010-11-01/streaming-distribution/EGTXBD79H29TRA8</code>.
     * </p>
     * 
     * @param location
     *        The fully qualified URI of the new streaming distribution resource just created. For example:
     *        <code> https://cloudfront.amazonaws.com/2010-11-01/streaming-distribution/EGTXBD79H29TRA8</code>.
     */

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * The fully qualified URI of the new streaming distribution resource just created. For example:
     * <code> https://cloudfront.amazonaws.com/2010-11-01/streaming-distribution/EGTXBD79H29TRA8</code>.
     * </p>
     * 
     * @return The fully qualified URI of the new streaming distribution resource just created. For example:
     *         <code> https://cloudfront.amazonaws.com/2010-11-01/streaming-distribution/EGTXBD79H29TRA8</code>.
     */

    public String getLocation() {
        return this.location;
    }

    /**
     * <p>
     * The fully qualified URI of the new streaming distribution resource just created. For example:
     * <code> https://cloudfront.amazonaws.com/2010-11-01/streaming-distribution/EGTXBD79H29TRA8</code>.
     * </p>
     * 
     * @param location
     *        The fully qualified URI of the new streaming distribution resource just created. For example:
     *        <code> https://cloudfront.amazonaws.com/2010-11-01/streaming-distribution/EGTXBD79H29TRA8</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStreamingDistributionWithTagsResult withLocation(String location) {
        setLocation(location);
        return this;
    }

    /**
     * @param eTag
     */

    public void setETag(String eTag) {
        this.eTag = eTag;
    }

    /**
     * @return
     */

    public String getETag() {
        return this.eTag;
    }

    /**
     * @param eTag
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStreamingDistributionWithTagsResult withETag(String eTag) {
        setETag(eTag);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getStreamingDistribution() != null)
            sb.append("StreamingDistribution: " + getStreamingDistribution() + ",");
        if (getLocation() != null)
            sb.append("Location: " + getLocation() + ",");
        if (getETag() != null)
            sb.append("ETag: " + getETag());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateStreamingDistributionWithTagsResult == false)
            return false;
        CreateStreamingDistributionWithTagsResult other = (CreateStreamingDistributionWithTagsResult) obj;
        if (other.getStreamingDistribution() == null ^ this.getStreamingDistribution() == null)
            return false;
        if (other.getStreamingDistribution() != null && other.getStreamingDistribution().equals(this.getStreamingDistribution()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getETag() == null ^ this.getETag() == null)
            return false;
        if (other.getETag() != null && other.getETag().equals(this.getETag()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamingDistribution() == null) ? 0 : getStreamingDistribution().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getETag() == null) ? 0 : getETag().hashCode());
        return hashCode;
    }

    @Override
    public CreateStreamingDistributionWithTagsResult clone() {
        try {
            return (CreateStreamingDistributionWithTagsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
