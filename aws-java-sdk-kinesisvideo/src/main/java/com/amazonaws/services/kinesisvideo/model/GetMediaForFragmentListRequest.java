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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-video-archived-media-2017-09-30/GetMediaForFragmentList"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMediaForFragmentListRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the stream from which to retrieve fragment media.
     * </p>
     */
    private String streamName;
    /**
     * <p>
     * A list of the numbers of fragments for which to retrieve media. You retrieve these values with
     * <a>ListFragments</a>.
     * </p>
     */
    private java.util.List<String> fragments;

    /**
     * <p>
     * The name of the stream from which to retrieve fragment media.
     * </p>
     * 
     * @param streamName
     *        The name of the stream from which to retrieve fragment media.
     */

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * <p>
     * The name of the stream from which to retrieve fragment media.
     * </p>
     * 
     * @return The name of the stream from which to retrieve fragment media.
     */

    public String getStreamName() {
        return this.streamName;
    }

    /**
     * <p>
     * The name of the stream from which to retrieve fragment media.
     * </p>
     * 
     * @param streamName
     *        The name of the stream from which to retrieve fragment media.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMediaForFragmentListRequest withStreamName(String streamName) {
        setStreamName(streamName);
        return this;
    }

    /**
     * <p>
     * A list of the numbers of fragments for which to retrieve media. You retrieve these values with
     * <a>ListFragments</a>.
     * </p>
     * 
     * @return A list of the numbers of fragments for which to retrieve media. You retrieve these values with
     *         <a>ListFragments</a>.
     */

    public java.util.List<String> getFragments() {
        return fragments;
    }

    /**
     * <p>
     * A list of the numbers of fragments for which to retrieve media. You retrieve these values with
     * <a>ListFragments</a>.
     * </p>
     * 
     * @param fragments
     *        A list of the numbers of fragments for which to retrieve media. You retrieve these values with
     *        <a>ListFragments</a>.
     */

    public void setFragments(java.util.Collection<String> fragments) {
        if (fragments == null) {
            this.fragments = null;
            return;
        }

        this.fragments = new java.util.ArrayList<String>(fragments);
    }

    /**
     * <p>
     * A list of the numbers of fragments for which to retrieve media. You retrieve these values with
     * <a>ListFragments</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFragments(java.util.Collection)} or {@link #withFragments(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param fragments
     *        A list of the numbers of fragments for which to retrieve media. You retrieve these values with
     *        <a>ListFragments</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMediaForFragmentListRequest withFragments(String... fragments) {
        if (this.fragments == null) {
            setFragments(new java.util.ArrayList<String>(fragments.length));
        }
        for (String ele : fragments) {
            this.fragments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the numbers of fragments for which to retrieve media. You retrieve these values with
     * <a>ListFragments</a>.
     * </p>
     * 
     * @param fragments
     *        A list of the numbers of fragments for which to retrieve media. You retrieve these values with
     *        <a>ListFragments</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMediaForFragmentListRequest withFragments(java.util.Collection<String> fragments) {
        setFragments(fragments);
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
        if (getFragments() != null)
            sb.append("Fragments: ").append(getFragments());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMediaForFragmentListRequest == false)
            return false;
        GetMediaForFragmentListRequest other = (GetMediaForFragmentListRequest) obj;
        if (other.getStreamName() == null ^ this.getStreamName() == null)
            return false;
        if (other.getStreamName() != null && other.getStreamName().equals(this.getStreamName()) == false)
            return false;
        if (other.getFragments() == null ^ this.getFragments() == null)
            return false;
        if (other.getFragments() != null && other.getFragments().equals(this.getFragments()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode());
        hashCode = prime * hashCode + ((getFragments() == null) ? 0 : getFragments().hashCode());
        return hashCode;
    }

    @Override
    public GetMediaForFragmentListRequest clone() {
        return (GetMediaForFragmentListRequest) super.clone();
    }

}
