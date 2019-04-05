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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-video-media-2017-09-30/PutMedia" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutMediaRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * You pass this value as the <code>x-amzn-stream-name</code> HTTP header.
     * </p>
     * <p>
     * Name of the Kinesis video stream where you want to write the media content. If you don't specify the
     * <code>streamName</code>, you must specify the <code>streamARN</code>.
     * </p>
     */
    private String streamName;
    /**
     * <p>
     * You pass this value as the <code>x-amzn-stream-arn</code> HTTP header.
     * </p>
     * <p>
     * Amazon Resource Name (ARN) of the Kinesis video stream where you want to write the media content. If you don't
     * specify the <code>streamARN</code>, you must specify the <code>streamName</code>.
     * </p>
     */
    private String streamARN;
    /**
     * <p>
     * You pass this value as the <code>x-amzn-fragment-timecode-type</code> HTTP header.
     * </p>
     * <p>
     * Indicates whether timecodes in the fragments (payload, HTTP request body) are absolute or relative to
     * <code>producerStartTimestamp</code>. Kinesis Video Streams uses this information to compute the
     * <code>producer_timestamp</code> for the fragment received in the request, as described in the API overview.
     * </p>
     */
    private String fragmentTimecodeType;
    /**
     * <p>
     * You pass this value as the <code>x-amzn-producer-start-timestamp</code> HTTP header.
     * </p>
     * <p>
     * This is the producer time stamp at which the producer started recording the media (not the time stamp of the
     * specific fragments in the request).
     * </p>
     */
    private java.util.Date producerStartTimestamp;
    /**
     * <p>
     * The media content to write to the Kinesis video stream. In the current implementation, Kinesis Video Streams
     * supports only the Matroska (MKV) container format with a single MKV segment. A segment can contain one or more
     * clusters.
     * </p>
     * <note>
     * <p>
     * Each MKV cluster maps to a Kinesis video stream fragment. Whatever cluster duration you choose becomes the
     * fragment duration.
     * </p>
     * </note>
     */
    private java.io.InputStream payload;

    /**
     * <p>
     * You pass this value as the <code>x-amzn-stream-name</code> HTTP header.
     * </p>
     * <p>
     * Name of the Kinesis video stream where you want to write the media content. If you don't specify the
     * <code>streamName</code>, you must specify the <code>streamARN</code>.
     * </p>
     * 
     * @param streamName
     *        You pass this value as the <code>x-amzn-stream-name</code> HTTP header.</p>
     *        <p>
     *        Name of the Kinesis video stream where you want to write the media content. If you don't specify the
     *        <code>streamName</code>, you must specify the <code>streamARN</code>.
     */

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * <p>
     * You pass this value as the <code>x-amzn-stream-name</code> HTTP header.
     * </p>
     * <p>
     * Name of the Kinesis video stream where you want to write the media content. If you don't specify the
     * <code>streamName</code>, you must specify the <code>streamARN</code>.
     * </p>
     * 
     * @return You pass this value as the <code>x-amzn-stream-name</code> HTTP header.</p>
     *         <p>
     *         Name of the Kinesis video stream where you want to write the media content. If you don't specify the
     *         <code>streamName</code>, you must specify the <code>streamARN</code>.
     */

    public String getStreamName() {
        return this.streamName;
    }

    /**
     * <p>
     * You pass this value as the <code>x-amzn-stream-name</code> HTTP header.
     * </p>
     * <p>
     * Name of the Kinesis video stream where you want to write the media content. If you don't specify the
     * <code>streamName</code>, you must specify the <code>streamARN</code>.
     * </p>
     * 
     * @param streamName
     *        You pass this value as the <code>x-amzn-stream-name</code> HTTP header.</p>
     *        <p>
     *        Name of the Kinesis video stream where you want to write the media content. If you don't specify the
     *        <code>streamName</code>, you must specify the <code>streamARN</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMediaRequest withStreamName(String streamName) {
        setStreamName(streamName);
        return this;
    }

    /**
     * <p>
     * You pass this value as the <code>x-amzn-stream-arn</code> HTTP header.
     * </p>
     * <p>
     * Amazon Resource Name (ARN) of the Kinesis video stream where you want to write the media content. If you don't
     * specify the <code>streamARN</code>, you must specify the <code>streamName</code>.
     * </p>
     * 
     * @param streamARN
     *        You pass this value as the <code>x-amzn-stream-arn</code> HTTP header.</p>
     *        <p>
     *        Amazon Resource Name (ARN) of the Kinesis video stream where you want to write the media content. If you
     *        don't specify the <code>streamARN</code>, you must specify the <code>streamName</code>.
     */

    public void setStreamARN(String streamARN) {
        this.streamARN = streamARN;
    }

    /**
     * <p>
     * You pass this value as the <code>x-amzn-stream-arn</code> HTTP header.
     * </p>
     * <p>
     * Amazon Resource Name (ARN) of the Kinesis video stream where you want to write the media content. If you don't
     * specify the <code>streamARN</code>, you must specify the <code>streamName</code>.
     * </p>
     * 
     * @return You pass this value as the <code>x-amzn-stream-arn</code> HTTP header.</p>
     *         <p>
     *         Amazon Resource Name (ARN) of the Kinesis video stream where you want to write the media content. If you
     *         don't specify the <code>streamARN</code>, you must specify the <code>streamName</code>.
     */

    public String getStreamARN() {
        return this.streamARN;
    }

    /**
     * <p>
     * You pass this value as the <code>x-amzn-stream-arn</code> HTTP header.
     * </p>
     * <p>
     * Amazon Resource Name (ARN) of the Kinesis video stream where you want to write the media content. If you don't
     * specify the <code>streamARN</code>, you must specify the <code>streamName</code>.
     * </p>
     * 
     * @param streamARN
     *        You pass this value as the <code>x-amzn-stream-arn</code> HTTP header.</p>
     *        <p>
     *        Amazon Resource Name (ARN) of the Kinesis video stream where you want to write the media content. If you
     *        don't specify the <code>streamARN</code>, you must specify the <code>streamName</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMediaRequest withStreamARN(String streamARN) {
        setStreamARN(streamARN);
        return this;
    }

    /**
     * <p>
     * You pass this value as the <code>x-amzn-fragment-timecode-type</code> HTTP header.
     * </p>
     * <p>
     * Indicates whether timecodes in the fragments (payload, HTTP request body) are absolute or relative to
     * <code>producerStartTimestamp</code>. Kinesis Video Streams uses this information to compute the
     * <code>producer_timestamp</code> for the fragment received in the request, as described in the API overview.
     * </p>
     * 
     * @param fragmentTimecodeType
     *        You pass this value as the <code>x-amzn-fragment-timecode-type</code> HTTP header.</p>
     *        <p>
     *        Indicates whether timecodes in the fragments (payload, HTTP request body) are absolute or relative to
     *        <code>producerStartTimestamp</code>. Kinesis Video Streams uses this information to compute the
     *        <code>producer_timestamp</code> for the fragment received in the request, as described in the API
     *        overview.
     * @see FragmentTimecodeType
     */

    public void setFragmentTimecodeType(String fragmentTimecodeType) {
        this.fragmentTimecodeType = fragmentTimecodeType;
    }

    /**
     * <p>
     * You pass this value as the <code>x-amzn-fragment-timecode-type</code> HTTP header.
     * </p>
     * <p>
     * Indicates whether timecodes in the fragments (payload, HTTP request body) are absolute or relative to
     * <code>producerStartTimestamp</code>. Kinesis Video Streams uses this information to compute the
     * <code>producer_timestamp</code> for the fragment received in the request, as described in the API overview.
     * </p>
     * 
     * @return You pass this value as the <code>x-amzn-fragment-timecode-type</code> HTTP header.</p>
     *         <p>
     *         Indicates whether timecodes in the fragments (payload, HTTP request body) are absolute or relative to
     *         <code>producerStartTimestamp</code>. Kinesis Video Streams uses this information to compute the
     *         <code>producer_timestamp</code> for the fragment received in the request, as described in the API
     *         overview.
     * @see FragmentTimecodeType
     */

    public String getFragmentTimecodeType() {
        return this.fragmentTimecodeType;
    }

    /**
     * <p>
     * You pass this value as the <code>x-amzn-fragment-timecode-type</code> HTTP header.
     * </p>
     * <p>
     * Indicates whether timecodes in the fragments (payload, HTTP request body) are absolute or relative to
     * <code>producerStartTimestamp</code>. Kinesis Video Streams uses this information to compute the
     * <code>producer_timestamp</code> for the fragment received in the request, as described in the API overview.
     * </p>
     * 
     * @param fragmentTimecodeType
     *        You pass this value as the <code>x-amzn-fragment-timecode-type</code> HTTP header.</p>
     *        <p>
     *        Indicates whether timecodes in the fragments (payload, HTTP request body) are absolute or relative to
     *        <code>producerStartTimestamp</code>. Kinesis Video Streams uses this information to compute the
     *        <code>producer_timestamp</code> for the fragment received in the request, as described in the API
     *        overview.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FragmentTimecodeType
     */

    public PutMediaRequest withFragmentTimecodeType(String fragmentTimecodeType) {
        setFragmentTimecodeType(fragmentTimecodeType);
        return this;
    }

    /**
     * <p>
     * You pass this value as the <code>x-amzn-fragment-timecode-type</code> HTTP header.
     * </p>
     * <p>
     * Indicates whether timecodes in the fragments (payload, HTTP request body) are absolute or relative to
     * <code>producerStartTimestamp</code>. Kinesis Video Streams uses this information to compute the
     * <code>producer_timestamp</code> for the fragment received in the request, as described in the API overview.
     * </p>
     * 
     * @param fragmentTimecodeType
     *        You pass this value as the <code>x-amzn-fragment-timecode-type</code> HTTP header.</p>
     *        <p>
     *        Indicates whether timecodes in the fragments (payload, HTTP request body) are absolute or relative to
     *        <code>producerStartTimestamp</code>. Kinesis Video Streams uses this information to compute the
     *        <code>producer_timestamp</code> for the fragment received in the request, as described in the API
     *        overview.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FragmentTimecodeType
     */

    public PutMediaRequest withFragmentTimecodeType(FragmentTimecodeType fragmentTimecodeType) {
        this.fragmentTimecodeType = fragmentTimecodeType.toString();
        return this;
    }

    /**
     * <p>
     * You pass this value as the <code>x-amzn-producer-start-timestamp</code> HTTP header.
     * </p>
     * <p>
     * This is the producer time stamp at which the producer started recording the media (not the time stamp of the
     * specific fragments in the request).
     * </p>
     * 
     * @param producerStartTimestamp
     *        You pass this value as the <code>x-amzn-producer-start-timestamp</code> HTTP header.</p>
     *        <p>
     *        This is the producer time stamp at which the producer started recording the media (not the time stamp of
     *        the specific fragments in the request).
     */

    public void setProducerStartTimestamp(java.util.Date producerStartTimestamp) {
        this.producerStartTimestamp = producerStartTimestamp;
    }

    /**
     * <p>
     * You pass this value as the <code>x-amzn-producer-start-timestamp</code> HTTP header.
     * </p>
     * <p>
     * This is the producer time stamp at which the producer started recording the media (not the time stamp of the
     * specific fragments in the request).
     * </p>
     * 
     * @return You pass this value as the <code>x-amzn-producer-start-timestamp</code> HTTP header.</p>
     *         <p>
     *         This is the producer time stamp at which the producer started recording the media (not the time stamp of
     *         the specific fragments in the request).
     */

    public java.util.Date getProducerStartTimestamp() {
        return this.producerStartTimestamp;
    }

    /**
     * <p>
     * You pass this value as the <code>x-amzn-producer-start-timestamp</code> HTTP header.
     * </p>
     * <p>
     * This is the producer time stamp at which the producer started recording the media (not the time stamp of the
     * specific fragments in the request).
     * </p>
     * 
     * @param producerStartTimestamp
     *        You pass this value as the <code>x-amzn-producer-start-timestamp</code> HTTP header.</p>
     *        <p>
     *        This is the producer time stamp at which the producer started recording the media (not the time stamp of
     *        the specific fragments in the request).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMediaRequest withProducerStartTimestamp(java.util.Date producerStartTimestamp) {
        setProducerStartTimestamp(producerStartTimestamp);
        return this;
    }

    /**
     * <p>
     * The media content to write to the Kinesis video stream. In the current implementation, Kinesis Video Streams
     * supports only the Matroska (MKV) container format with a single MKV segment. A segment can contain one or more
     * clusters.
     * </p>
     * <note>
     * <p>
     * Each MKV cluster maps to a Kinesis video stream fragment. Whatever cluster duration you choose becomes the
     * fragment duration.
     * </p>
     * </note>
     * 
     * @param payload
     *        The media content to write to the Kinesis video stream. In the current implementation, Kinesis Video
     *        Streams supports only the Matroska (MKV) container format with a single MKV segment. A segment can contain
     *        one or more clusters. </p> <note>
     *        <p>
     *        Each MKV cluster maps to a Kinesis video stream fragment. Whatever cluster duration you choose becomes the
     *        fragment duration.
     *        </p>
     */

    public void setPayload(java.io.InputStream payload) {
        this.payload = payload;
    }

    /**
     * <p>
     * The media content to write to the Kinesis video stream. In the current implementation, Kinesis Video Streams
     * supports only the Matroska (MKV) container format with a single MKV segment. A segment can contain one or more
     * clusters.
     * </p>
     * <note>
     * <p>
     * Each MKV cluster maps to a Kinesis video stream fragment. Whatever cluster duration you choose becomes the
     * fragment duration.
     * </p>
     * </note>
     * 
     * @return The media content to write to the Kinesis video stream. In the current implementation, Kinesis Video
     *         Streams supports only the Matroska (MKV) container format with a single MKV segment. A segment can
     *         contain one or more clusters. </p> <note>
     *         <p>
     *         Each MKV cluster maps to a Kinesis video stream fragment. Whatever cluster duration you choose becomes
     *         the fragment duration.
     *         </p>
     */

    public java.io.InputStream getPayload() {
        return this.payload;
    }

    /**
     * <p>
     * The media content to write to the Kinesis video stream. In the current implementation, Kinesis Video Streams
     * supports only the Matroska (MKV) container format with a single MKV segment. A segment can contain one or more
     * clusters.
     * </p>
     * <note>
     * <p>
     * Each MKV cluster maps to a Kinesis video stream fragment. Whatever cluster duration you choose becomes the
     * fragment duration.
     * </p>
     * </note>
     * 
     * @param payload
     *        The media content to write to the Kinesis video stream. In the current implementation, Kinesis Video
     *        Streams supports only the Matroska (MKV) container format with a single MKV segment. A segment can contain
     *        one or more clusters. </p> <note>
     *        <p>
     *        Each MKV cluster maps to a Kinesis video stream fragment. Whatever cluster duration you choose becomes the
     *        fragment duration.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMediaRequest withPayload(java.io.InputStream payload) {
        setPayload(payload);
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
        if (getFragmentTimecodeType() != null)
            sb.append("FragmentTimecodeType: ").append(getFragmentTimecodeType()).append(",");
        if (getProducerStartTimestamp() != null)
            sb.append("ProducerStartTimestamp: ").append(getProducerStartTimestamp()).append(",");
        if (getPayload() != null)
            sb.append("Payload: ").append(getPayload());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutMediaRequest == false)
            return false;
        PutMediaRequest other = (PutMediaRequest) obj;
        if (other.getStreamName() == null ^ this.getStreamName() == null)
            return false;
        if (other.getStreamName() != null && other.getStreamName().equals(this.getStreamName()) == false)
            return false;
        if (other.getStreamARN() == null ^ this.getStreamARN() == null)
            return false;
        if (other.getStreamARN() != null && other.getStreamARN().equals(this.getStreamARN()) == false)
            return false;
        if (other.getFragmentTimecodeType() == null ^ this.getFragmentTimecodeType() == null)
            return false;
        if (other.getFragmentTimecodeType() != null && other.getFragmentTimecodeType().equals(this.getFragmentTimecodeType()) == false)
            return false;
        if (other.getProducerStartTimestamp() == null ^ this.getProducerStartTimestamp() == null)
            return false;
        if (other.getProducerStartTimestamp() != null && other.getProducerStartTimestamp().equals(this.getProducerStartTimestamp()) == false)
            return false;
        if (other.getPayload() == null ^ this.getPayload() == null)
            return false;
        if (other.getPayload() != null && other.getPayload().equals(this.getPayload()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode());
        hashCode = prime * hashCode + ((getStreamARN() == null) ? 0 : getStreamARN().hashCode());
        hashCode = prime * hashCode + ((getFragmentTimecodeType() == null) ? 0 : getFragmentTimecodeType().hashCode());
        hashCode = prime * hashCode + ((getProducerStartTimestamp() == null) ? 0 : getProducerStartTimestamp().hashCode());
        hashCode = prime * hashCode + ((getPayload() == null) ? 0 : getPayload().hashCode());
        return hashCode;
    }

    @Override
    public PutMediaRequest clone() {
        return (PutMediaRequest) super.clone();
    }

}
