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
 * A streaming distribution Configuration and a list of tags to be associated with the streaming distribution.
 * </p>
 */
public class StreamingDistributionConfigWithTags implements Serializable, Cloneable {

    /**
     * <p>
     * A streaming distribution Configuration.
     * </p>
     */
    private StreamingDistributionConfig streamingDistributionConfig;
    /**
     * <p>
     * A complex type that contains zero or more <code>Tag</code> elements.
     * </p>
     */
    private Tags tags;

    /**
     * <p>
     * A streaming distribution Configuration.
     * </p>
     * 
     * @param streamingDistributionConfig
     *        A streaming distribution Configuration.
     */

    public void setStreamingDistributionConfig(StreamingDistributionConfig streamingDistributionConfig) {
        this.streamingDistributionConfig = streamingDistributionConfig;
    }

    /**
     * <p>
     * A streaming distribution Configuration.
     * </p>
     * 
     * @return A streaming distribution Configuration.
     */

    public StreamingDistributionConfig getStreamingDistributionConfig() {
        return this.streamingDistributionConfig;
    }

    /**
     * <p>
     * A streaming distribution Configuration.
     * </p>
     * 
     * @param streamingDistributionConfig
     *        A streaming distribution Configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingDistributionConfigWithTags withStreamingDistributionConfig(StreamingDistributionConfig streamingDistributionConfig) {
        setStreamingDistributionConfig(streamingDistributionConfig);
        return this;
    }

    /**
     * <p>
     * A complex type that contains zero or more <code>Tag</code> elements.
     * </p>
     * 
     * @param tags
     *        A complex type that contains zero or more <code>Tag</code> elements.
     */

    public void setTags(Tags tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A complex type that contains zero or more <code>Tag</code> elements.
     * </p>
     * 
     * @return A complex type that contains zero or more <code>Tag</code> elements.
     */

    public Tags getTags() {
        return this.tags;
    }

    /**
     * <p>
     * A complex type that contains zero or more <code>Tag</code> elements.
     * </p>
     * 
     * @param tags
     *        A complex type that contains zero or more <code>Tag</code> elements.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingDistributionConfigWithTags withTags(Tags tags) {
        setTags(tags);
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
        if (getStreamingDistributionConfig() != null)
            sb.append("StreamingDistributionConfig: " + getStreamingDistributionConfig() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StreamingDistributionConfigWithTags == false)
            return false;
        StreamingDistributionConfigWithTags other = (StreamingDistributionConfigWithTags) obj;
        if (other.getStreamingDistributionConfig() == null ^ this.getStreamingDistributionConfig() == null)
            return false;
        if (other.getStreamingDistributionConfig() != null && other.getStreamingDistributionConfig().equals(this.getStreamingDistributionConfig()) == false)
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

        hashCode = prime * hashCode + ((getStreamingDistributionConfig() == null) ? 0 : getStreamingDistributionConfig().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public StreamingDistributionConfigWithTags clone() {
        try {
            return (StreamingDistributionConfigWithTags) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
