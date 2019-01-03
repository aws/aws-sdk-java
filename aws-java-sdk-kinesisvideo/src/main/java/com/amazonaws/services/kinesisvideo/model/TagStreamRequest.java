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
package com.amazonaws.services.kinesisvideo.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/TagStream" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TagStreamRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource that you want to add the tag or tags to.
     * </p>
     */
    private String streamARN;
    /**
     * <p>
     * The name of the stream that you want to add the tag or tags to.
     * </p>
     */
    private String streamName;
    /**
     * <p>
     * A list of tags to associate with the specified stream. Each tag is a key-value pair (the value is optional).
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource that you want to add the tag or tags to.
     * </p>
     * 
     * @param streamARN
     *        The Amazon Resource Name (ARN) of the resource that you want to add the tag or tags to.
     */

    public void setStreamARN(String streamARN) {
        this.streamARN = streamARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource that you want to add the tag or tags to.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the resource that you want to add the tag or tags to.
     */

    public String getStreamARN() {
        return this.streamARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource that you want to add the tag or tags to.
     * </p>
     * 
     * @param streamARN
     *        The Amazon Resource Name (ARN) of the resource that you want to add the tag or tags to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagStreamRequest withStreamARN(String streamARN) {
        setStreamARN(streamARN);
        return this;
    }

    /**
     * <p>
     * The name of the stream that you want to add the tag or tags to.
     * </p>
     * 
     * @param streamName
     *        The name of the stream that you want to add the tag or tags to.
     */

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * <p>
     * The name of the stream that you want to add the tag or tags to.
     * </p>
     * 
     * @return The name of the stream that you want to add the tag or tags to.
     */

    public String getStreamName() {
        return this.streamName;
    }

    /**
     * <p>
     * The name of the stream that you want to add the tag or tags to.
     * </p>
     * 
     * @param streamName
     *        The name of the stream that you want to add the tag or tags to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagStreamRequest withStreamName(String streamName) {
        setStreamName(streamName);
        return this;
    }

    /**
     * <p>
     * A list of tags to associate with the specified stream. Each tag is a key-value pair (the value is optional).
     * </p>
     * 
     * @return A list of tags to associate with the specified stream. Each tag is a key-value pair (the value is
     *         optional).
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tags to associate with the specified stream. Each tag is a key-value pair (the value is optional).
     * </p>
     * 
     * @param tags
     *        A list of tags to associate with the specified stream. Each tag is a key-value pair (the value is
     *        optional).
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A list of tags to associate with the specified stream. Each tag is a key-value pair (the value is optional).
     * </p>
     * 
     * @param tags
     *        A list of tags to associate with the specified stream. Each tag is a key-value pair (the value is
     *        optional).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagStreamRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    public TagStreamRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagStreamRequest clearTagsEntries() {
        this.tags = null;
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
        if (getStreamARN() != null)
            sb.append("StreamARN: ").append(getStreamARN()).append(",");
        if (getStreamName() != null)
            sb.append("StreamName: ").append(getStreamName()).append(",");
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

        if (obj instanceof TagStreamRequest == false)
            return false;
        TagStreamRequest other = (TagStreamRequest) obj;
        if (other.getStreamARN() == null ^ this.getStreamARN() == null)
            return false;
        if (other.getStreamARN() != null && other.getStreamARN().equals(this.getStreamARN()) == false)
            return false;
        if (other.getStreamName() == null ^ this.getStreamName() == null)
            return false;
        if (other.getStreamName() != null && other.getStreamName().equals(this.getStreamName()) == false)
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

        hashCode = prime * hashCode + ((getStreamARN() == null) ? 0 : getStreamARN().hashCode());
        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public TagStreamRequest clone() {
        return (TagStreamRequest) super.clone();
    }

}
