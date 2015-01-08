/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kinesis.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.kinesis.AmazonKinesis#addTagsToStream(AddTagsToStreamRequest) AddTagsToStream operation}.
 * <p>
 * Adds or updates tags for the specified Amazon Kinesis stream. Each
 * stream can have up to 10 tags.
 * </p>
 * <p>
 * If tags have already been assigned to the stream,
 * <code>AddTagsToStream</code> overwrites any existing tags that
 * correspond to the specified tag keys.
 * </p>
 *
 * @see com.amazonaws.services.kinesis.AmazonKinesis#addTagsToStream(AddTagsToStreamRequest)
 */
public class AddTagsToStreamRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String streamName;

    /**
     * The set of key-value pairs to use to create the tags.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10<br/>
     */
    private java.util.Map<String,String> tags;

    /**
     * The name of the stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return The name of the stream.
     */
    public String getStreamName() {
        return streamName;
    }
    
    /**
     * The name of the stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param streamName The name of the stream.
     */
    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }
    
    /**
     * The name of the stream.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param streamName The name of the stream.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AddTagsToStreamRequest withStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * The set of key-value pairs to use to create the tags.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10<br/>
     *
     * @return The set of key-value pairs to use to create the tags.
     */
    public java.util.Map<String,String> getTags() {
        
        if (tags == null) {
            tags = new java.util.HashMap<String,String>();
        }
        return tags;
    }
    
    /**
     * The set of key-value pairs to use to create the tags.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10<br/>
     *
     * @param tags The set of key-value pairs to use to create the tags.
     */
    public void setTags(java.util.Map<String,String> tags) {
        this.tags = tags;
    }
    
    /**
     * The set of key-value pairs to use to create the tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10<br/>
     *
     * @param tags The set of key-value pairs to use to create the tags.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AddTagsToStreamRequest withTags(java.util.Map<String,String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * The set of key-value pairs to use to create the tags.
     * <p>
     * The method adds a new key-value pair into Tags parameter, and returns
     * a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10<br/>
     *
     * @param key The key of the entry to be added into Tags.
     * @param value The corresponding value of the entry to be added into Tags.
     */
    public AddTagsToStreamRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String,String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     */
    public AddTagsToStreamRequest clearTagsEntries() {
        this.tags = null;
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
        if (getStreamName() != null) sb.append("StreamName: " + getStreamName() + ",");
        if (getTags() != null) sb.append("Tags: " + getTags() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode()); 
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AddTagsToStreamRequest == false) return false;
        AddTagsToStreamRequest other = (AddTagsToStreamRequest)obj;
        
        if (other.getStreamName() == null ^ this.getStreamName() == null) return false;
        if (other.getStreamName() != null && other.getStreamName().equals(this.getStreamName()) == false) return false; 
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false; 
        return true;
    }
    
}
    