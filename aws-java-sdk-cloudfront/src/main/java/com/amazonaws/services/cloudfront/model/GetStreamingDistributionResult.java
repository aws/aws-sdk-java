/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;

/**
 * 
 */
public class GetStreamingDistributionResult implements Serializable, Cloneable {

    private StreamingDistribution streamingDistribution;

    private String eTag;

    /**
     * @param streamingDistribution
     */
    public void setStreamingDistribution(
            StreamingDistribution streamingDistribution) {
        this.streamingDistribution = streamingDistribution;
    }

    /**
     * @return
     */
    public StreamingDistribution getStreamingDistribution() {
        return this.streamingDistribution;
    }

    /**
     * @param streamingDistribution
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public GetStreamingDistributionResult withStreamingDistribution(
            StreamingDistribution streamingDistribution) {
        setStreamingDistribution(streamingDistribution);
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
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public GetStreamingDistributionResult withETag(String eTag) {
        setETag(eTag);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
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
            sb.append("StreamingDistribution: " + getStreamingDistribution()
                    + ",");
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

        if (obj instanceof GetStreamingDistributionResult == false)
            return false;
        GetStreamingDistributionResult other = (GetStreamingDistributionResult) obj;
        if (other.getStreamingDistribution() == null
                ^ this.getStreamingDistribution() == null)
            return false;
        if (other.getStreamingDistribution() != null
                && other.getStreamingDistribution().equals(
                        this.getStreamingDistribution()) == false)
            return false;
        if (other.getETag() == null ^ this.getETag() == null)
            return false;
        if (other.getETag() != null
                && other.getETag().equals(this.getETag()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getStreamingDistribution() == null) ? 0
                        : getStreamingDistribution().hashCode());
        hashCode = prime * hashCode
                + ((getETag() == null) ? 0 : getETag().hashCode());
        return hashCode;
    }

    @Override
    public GetStreamingDistributionResult clone() {
        try {
            return (GetStreamingDistributionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}