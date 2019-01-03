/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The request to create a new streaming distribution with tags.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/CreateStreamingDistributionWithTags"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateStreamingDistributionWithTagsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The streaming distribution's configuration information.
     * </p>
     */
    private StreamingDistributionConfigWithTags streamingDistributionConfigWithTags;

    /**
     * <p>
     * The streaming distribution's configuration information.
     * </p>
     * 
     * @param streamingDistributionConfigWithTags
     *        The streaming distribution's configuration information.
     */

    public void setStreamingDistributionConfigWithTags(StreamingDistributionConfigWithTags streamingDistributionConfigWithTags) {
        this.streamingDistributionConfigWithTags = streamingDistributionConfigWithTags;
    }

    /**
     * <p>
     * The streaming distribution's configuration information.
     * </p>
     * 
     * @return The streaming distribution's configuration information.
     */

    public StreamingDistributionConfigWithTags getStreamingDistributionConfigWithTags() {
        return this.streamingDistributionConfigWithTags;
    }

    /**
     * <p>
     * The streaming distribution's configuration information.
     * </p>
     * 
     * @param streamingDistributionConfigWithTags
     *        The streaming distribution's configuration information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStreamingDistributionWithTagsRequest withStreamingDistributionConfigWithTags(
            StreamingDistributionConfigWithTags streamingDistributionConfigWithTags) {
        setStreamingDistributionConfigWithTags(streamingDistributionConfigWithTags);
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
        if (getStreamingDistributionConfigWithTags() != null)
            sb.append("StreamingDistributionConfigWithTags: ").append(getStreamingDistributionConfigWithTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateStreamingDistributionWithTagsRequest == false)
            return false;
        CreateStreamingDistributionWithTagsRequest other = (CreateStreamingDistributionWithTagsRequest) obj;
        if (other.getStreamingDistributionConfigWithTags() == null ^ this.getStreamingDistributionConfigWithTags() == null)
            return false;
        if (other.getStreamingDistributionConfigWithTags() != null
                && other.getStreamingDistributionConfigWithTags().equals(this.getStreamingDistributionConfigWithTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamingDistributionConfigWithTags() == null) ? 0 : getStreamingDistributionConfigWithTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateStreamingDistributionWithTagsRequest clone() {
        return (CreateStreamingDistributionWithTagsRequest) super.clone();
    }

}
