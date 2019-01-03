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
package com.amazonaws.services.kinesis.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input for <code>ListTagsForStream</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-2013-12-02/ListTagsForStream" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTagsForStreamRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the stream.
     * </p>
     */
    private String streamName;
    /**
     * <p>
     * The key to use as the starting point for the list of tags. If this parameter is set,
     * <code>ListTagsForStream</code> gets all tags that occur after <code>ExclusiveStartTagKey</code>.
     * </p>
     */
    private String exclusiveStartTagKey;
    /**
     * <p>
     * The number of tags to return. If this number is less than the total number of tags associated with the stream,
     * <code>HasMoreTags</code> is set to <code>true</code>. To list additional tags, set
     * <code>ExclusiveStartTagKey</code> to the last key in the response.
     * </p>
     */
    private Integer limit;

    /**
     * <p>
     * The name of the stream.
     * </p>
     * 
     * @param streamName
     *        The name of the stream.
     */

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * <p>
     * The name of the stream.
     * </p>
     * 
     * @return The name of the stream.
     */

    public String getStreamName() {
        return this.streamName;
    }

    /**
     * <p>
     * The name of the stream.
     * </p>
     * 
     * @param streamName
     *        The name of the stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsForStreamRequest withStreamName(String streamName) {
        setStreamName(streamName);
        return this;
    }

    /**
     * <p>
     * The key to use as the starting point for the list of tags. If this parameter is set,
     * <code>ListTagsForStream</code> gets all tags that occur after <code>ExclusiveStartTagKey</code>.
     * </p>
     * 
     * @param exclusiveStartTagKey
     *        The key to use as the starting point for the list of tags. If this parameter is set,
     *        <code>ListTagsForStream</code> gets all tags that occur after <code>ExclusiveStartTagKey</code>.
     */

    public void setExclusiveStartTagKey(String exclusiveStartTagKey) {
        this.exclusiveStartTagKey = exclusiveStartTagKey;
    }

    /**
     * <p>
     * The key to use as the starting point for the list of tags. If this parameter is set,
     * <code>ListTagsForStream</code> gets all tags that occur after <code>ExclusiveStartTagKey</code>.
     * </p>
     * 
     * @return The key to use as the starting point for the list of tags. If this parameter is set,
     *         <code>ListTagsForStream</code> gets all tags that occur after <code>ExclusiveStartTagKey</code>.
     */

    public String getExclusiveStartTagKey() {
        return this.exclusiveStartTagKey;
    }

    /**
     * <p>
     * The key to use as the starting point for the list of tags. If this parameter is set,
     * <code>ListTagsForStream</code> gets all tags that occur after <code>ExclusiveStartTagKey</code>.
     * </p>
     * 
     * @param exclusiveStartTagKey
     *        The key to use as the starting point for the list of tags. If this parameter is set,
     *        <code>ListTagsForStream</code> gets all tags that occur after <code>ExclusiveStartTagKey</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsForStreamRequest withExclusiveStartTagKey(String exclusiveStartTagKey) {
        setExclusiveStartTagKey(exclusiveStartTagKey);
        return this;
    }

    /**
     * <p>
     * The number of tags to return. If this number is less than the total number of tags associated with the stream,
     * <code>HasMoreTags</code> is set to <code>true</code>. To list additional tags, set
     * <code>ExclusiveStartTagKey</code> to the last key in the response.
     * </p>
     * 
     * @param limit
     *        The number of tags to return. If this number is less than the total number of tags associated with the
     *        stream, <code>HasMoreTags</code> is set to <code>true</code>. To list additional tags, set
     *        <code>ExclusiveStartTagKey</code> to the last key in the response.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The number of tags to return. If this number is less than the total number of tags associated with the stream,
     * <code>HasMoreTags</code> is set to <code>true</code>. To list additional tags, set
     * <code>ExclusiveStartTagKey</code> to the last key in the response.
     * </p>
     * 
     * @return The number of tags to return. If this number is less than the total number of tags associated with the
     *         stream, <code>HasMoreTags</code> is set to <code>true</code>. To list additional tags, set
     *         <code>ExclusiveStartTagKey</code> to the last key in the response.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The number of tags to return. If this number is less than the total number of tags associated with the stream,
     * <code>HasMoreTags</code> is set to <code>true</code>. To list additional tags, set
     * <code>ExclusiveStartTagKey</code> to the last key in the response.
     * </p>
     * 
     * @param limit
     *        The number of tags to return. If this number is less than the total number of tags associated with the
     *        stream, <code>HasMoreTags</code> is set to <code>true</code>. To list additional tags, set
     *        <code>ExclusiveStartTagKey</code> to the last key in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsForStreamRequest withLimit(Integer limit) {
        setLimit(limit);
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
        if (getStreamName() != null)
            sb.append("StreamName: ").append(getStreamName()).append(",");
        if (getExclusiveStartTagKey() != null)
            sb.append("ExclusiveStartTagKey: ").append(getExclusiveStartTagKey()).append(",");
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTagsForStreamRequest == false)
            return false;
        ListTagsForStreamRequest other = (ListTagsForStreamRequest) obj;
        if (other.getStreamName() == null ^ this.getStreamName() == null)
            return false;
        if (other.getStreamName() != null && other.getStreamName().equals(this.getStreamName()) == false)
            return false;
        if (other.getExclusiveStartTagKey() == null ^ this.getExclusiveStartTagKey() == null)
            return false;
        if (other.getExclusiveStartTagKey() != null && other.getExclusiveStartTagKey().equals(this.getExclusiveStartTagKey()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode());
        hashCode = prime * hashCode + ((getExclusiveStartTagKey() == null) ? 0 : getExclusiveStartTagKey().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        return hashCode;
    }

    @Override
    public ListTagsForStreamRequest clone() {
        return (ListTagsForStreamRequest) super.clone();
    }

}
