/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Represents the output of a <code>ListStreams</code> operation.
 * </p>
 */
public class ListStreamsResult implements Serializable {

    /**
     * The names of the streams that are associated with the AWS account
     * making the <code>ListStreams</code> request.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> streamNames;

    /**
     * If set to <code>true</code>, there are more streams available to list.
     */
    private Boolean hasMoreStreams;

    /**
     * The names of the streams that are associated with the AWS account
     * making the <code>ListStreams</code> request.
     *
     * @return The names of the streams that are associated with the AWS account
     *         making the <code>ListStreams</code> request.
     */
    public java.util.List<String> getStreamNames() {
        if (streamNames == null) {
              streamNames = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              streamNames.setAutoConstruct(true);
        }
        return streamNames;
    }
    
    /**
     * The names of the streams that are associated with the AWS account
     * making the <code>ListStreams</code> request.
     *
     * @param streamNames The names of the streams that are associated with the AWS account
     *         making the <code>ListStreams</code> request.
     */
    public void setStreamNames(java.util.Collection<String> streamNames) {
        if (streamNames == null) {
            this.streamNames = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> streamNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(streamNames.size());
        streamNamesCopy.addAll(streamNames);
        this.streamNames = streamNamesCopy;
    }
    
    /**
     * The names of the streams that are associated with the AWS account
     * making the <code>ListStreams</code> request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param streamNames The names of the streams that are associated with the AWS account
     *         making the <code>ListStreams</code> request.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListStreamsResult withStreamNames(String... streamNames) {
        if (getStreamNames() == null) setStreamNames(new java.util.ArrayList<String>(streamNames.length));
        for (String value : streamNames) {
            getStreamNames().add(value);
        }
        return this;
    }
    
    /**
     * The names of the streams that are associated with the AWS account
     * making the <code>ListStreams</code> request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param streamNames The names of the streams that are associated with the AWS account
     *         making the <code>ListStreams</code> request.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListStreamsResult withStreamNames(java.util.Collection<String> streamNames) {
        if (streamNames == null) {
            this.streamNames = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> streamNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(streamNames.size());
            streamNamesCopy.addAll(streamNames);
            this.streamNames = streamNamesCopy;
        }

        return this;
    }

    /**
     * If set to <code>true</code>, there are more streams available to list.
     *
     * @return If set to <code>true</code>, there are more streams available to list.
     */
    public Boolean isHasMoreStreams() {
        return hasMoreStreams;
    }
    
    /**
     * If set to <code>true</code>, there are more streams available to list.
     *
     * @param hasMoreStreams If set to <code>true</code>, there are more streams available to list.
     */
    public void setHasMoreStreams(Boolean hasMoreStreams) {
        this.hasMoreStreams = hasMoreStreams;
    }
    
    /**
     * If set to <code>true</code>, there are more streams available to list.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hasMoreStreams If set to <code>true</code>, there are more streams available to list.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListStreamsResult withHasMoreStreams(Boolean hasMoreStreams) {
        this.hasMoreStreams = hasMoreStreams;
        return this;
    }

    /**
     * If set to <code>true</code>, there are more streams available to list.
     *
     * @return If set to <code>true</code>, there are more streams available to list.
     */
    public Boolean getHasMoreStreams() {
        return hasMoreStreams;
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
        if (getStreamNames() != null) sb.append("StreamNames: " + getStreamNames() + ",");
        if (isHasMoreStreams() != null) sb.append("HasMoreStreams: " + isHasMoreStreams() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStreamNames() == null) ? 0 : getStreamNames().hashCode()); 
        hashCode = prime * hashCode + ((isHasMoreStreams() == null) ? 0 : isHasMoreStreams().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListStreamsResult == false) return false;
        ListStreamsResult other = (ListStreamsResult)obj;
        
        if (other.getStreamNames() == null ^ this.getStreamNames() == null) return false;
        if (other.getStreamNames() != null && other.getStreamNames().equals(this.getStreamNames()) == false) return false; 
        if (other.isHasMoreStreams() == null ^ this.isHasMoreStreams() == null) return false;
        if (other.isHasMoreStreams() != null && other.isHasMoreStreams().equals(this.isHasMoreStreams()) == false) return false; 
        return true;
    }
    
}
    