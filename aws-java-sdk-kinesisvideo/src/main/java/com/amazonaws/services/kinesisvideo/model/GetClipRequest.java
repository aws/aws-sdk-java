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
package com.amazonaws.services.kinesisvideo.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-video-archived-media-2017-09-30/GetClip"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetClipRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the stream for which to retrieve the media clip.
     * </p>
     * <p>
     * You must specify either the StreamName or the StreamARN.
     * </p>
     */
    private String streamName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream for which to retrieve the media clip.
     * </p>
     * <p>
     * You must specify either the StreamName or the StreamARN.
     * </p>
     */
    private String streamARN;
    /**
     * <p>
     * The time range of the requested clip and the source of the timestamps.
     * </p>
     */
    private ClipFragmentSelector clipFragmentSelector;

    /**
     * <p>
     * The name of the stream for which to retrieve the media clip.
     * </p>
     * <p>
     * You must specify either the StreamName or the StreamARN.
     * </p>
     * 
     * @param streamName
     *        The name of the stream for which to retrieve the media clip. </p>
     *        <p>
     *        You must specify either the StreamName or the StreamARN.
     */

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * <p>
     * The name of the stream for which to retrieve the media clip.
     * </p>
     * <p>
     * You must specify either the StreamName or the StreamARN.
     * </p>
     * 
     * @return The name of the stream for which to retrieve the media clip. </p>
     *         <p>
     *         You must specify either the StreamName or the StreamARN.
     */

    public String getStreamName() {
        return this.streamName;
    }

    /**
     * <p>
     * The name of the stream for which to retrieve the media clip.
     * </p>
     * <p>
     * You must specify either the StreamName or the StreamARN.
     * </p>
     * 
     * @param streamName
     *        The name of the stream for which to retrieve the media clip. </p>
     *        <p>
     *        You must specify either the StreamName or the StreamARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetClipRequest withStreamName(String streamName) {
        setStreamName(streamName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream for which to retrieve the media clip.
     * </p>
     * <p>
     * You must specify either the StreamName or the StreamARN.
     * </p>
     * 
     * @param streamARN
     *        The Amazon Resource Name (ARN) of the stream for which to retrieve the media clip. </p>
     *        <p>
     *        You must specify either the StreamName or the StreamARN.
     */

    public void setStreamARN(String streamARN) {
        this.streamARN = streamARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream for which to retrieve the media clip.
     * </p>
     * <p>
     * You must specify either the StreamName or the StreamARN.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the stream for which to retrieve the media clip. </p>
     *         <p>
     *         You must specify either the StreamName or the StreamARN.
     */

    public String getStreamARN() {
        return this.streamARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream for which to retrieve the media clip.
     * </p>
     * <p>
     * You must specify either the StreamName or the StreamARN.
     * </p>
     * 
     * @param streamARN
     *        The Amazon Resource Name (ARN) of the stream for which to retrieve the media clip. </p>
     *        <p>
     *        You must specify either the StreamName or the StreamARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetClipRequest withStreamARN(String streamARN) {
        setStreamARN(streamARN);
        return this;
    }

    /**
     * <p>
     * The time range of the requested clip and the source of the timestamps.
     * </p>
     * 
     * @param clipFragmentSelector
     *        The time range of the requested clip and the source of the timestamps.
     */

    public void setClipFragmentSelector(ClipFragmentSelector clipFragmentSelector) {
        this.clipFragmentSelector = clipFragmentSelector;
    }

    /**
     * <p>
     * The time range of the requested clip and the source of the timestamps.
     * </p>
     * 
     * @return The time range of the requested clip and the source of the timestamps.
     */

    public ClipFragmentSelector getClipFragmentSelector() {
        return this.clipFragmentSelector;
    }

    /**
     * <p>
     * The time range of the requested clip and the source of the timestamps.
     * </p>
     * 
     * @param clipFragmentSelector
     *        The time range of the requested clip and the source of the timestamps.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetClipRequest withClipFragmentSelector(ClipFragmentSelector clipFragmentSelector) {
        setClipFragmentSelector(clipFragmentSelector);
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
        if (getStreamARN() != null)
            sb.append("StreamARN: ").append(getStreamARN()).append(",");
        if (getClipFragmentSelector() != null)
            sb.append("ClipFragmentSelector: ").append(getClipFragmentSelector());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetClipRequest == false)
            return false;
        GetClipRequest other = (GetClipRequest) obj;
        if (other.getStreamName() == null ^ this.getStreamName() == null)
            return false;
        if (other.getStreamName() != null && other.getStreamName().equals(this.getStreamName()) == false)
            return false;
        if (other.getStreamARN() == null ^ this.getStreamARN() == null)
            return false;
        if (other.getStreamARN() != null && other.getStreamARN().equals(this.getStreamARN()) == false)
            return false;
        if (other.getClipFragmentSelector() == null ^ this.getClipFragmentSelector() == null)
            return false;
        if (other.getClipFragmentSelector() != null && other.getClipFragmentSelector().equals(this.getClipFragmentSelector()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode());
        hashCode = prime * hashCode + ((getStreamARN() == null) ? 0 : getStreamARN().hashCode());
        hashCode = prime * hashCode + ((getClipFragmentSelector() == null) ? 0 : getClipFragmentSelector().hashCode());
        return hashCode;
    }

    @Override
    public GetClipRequest clone() {
        return (GetClipRequest) super.clone();
    }

}
