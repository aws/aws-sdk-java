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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-video-media-2017-09-30/GetMedia" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMediaRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Kinesis video stream name from where you want to get the media content. If you don't specify the
     * <code>streamName</code>, you must specify the <code>streamARN</code>.
     * </p>
     */
    private String streamName;
    /**
     * <p>
     * The ARN of the stream from where you want to get the media content. If you don't specify the
     * <code>streamARN</code>, you must specify the <code>streamName</code>.
     * </p>
     */
    private String streamARN;
    /**
     * <p>
     * Identifies the starting chunk to get from the specified stream.
     * </p>
     */
    private StartSelector startSelector;

    /**
     * <p>
     * The Kinesis video stream name from where you want to get the media content. If you don't specify the
     * <code>streamName</code>, you must specify the <code>streamARN</code>.
     * </p>
     * 
     * @param streamName
     *        The Kinesis video stream name from where you want to get the media content. If you don't specify the
     *        <code>streamName</code>, you must specify the <code>streamARN</code>.
     */

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * <p>
     * The Kinesis video stream name from where you want to get the media content. If you don't specify the
     * <code>streamName</code>, you must specify the <code>streamARN</code>.
     * </p>
     * 
     * @return The Kinesis video stream name from where you want to get the media content. If you don't specify the
     *         <code>streamName</code>, you must specify the <code>streamARN</code>.
     */

    public String getStreamName() {
        return this.streamName;
    }

    /**
     * <p>
     * The Kinesis video stream name from where you want to get the media content. If you don't specify the
     * <code>streamName</code>, you must specify the <code>streamARN</code>.
     * </p>
     * 
     * @param streamName
     *        The Kinesis video stream name from where you want to get the media content. If you don't specify the
     *        <code>streamName</code>, you must specify the <code>streamARN</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMediaRequest withStreamName(String streamName) {
        setStreamName(streamName);
        return this;
    }

    /**
     * <p>
     * The ARN of the stream from where you want to get the media content. If you don't specify the
     * <code>streamARN</code>, you must specify the <code>streamName</code>.
     * </p>
     * 
     * @param streamARN
     *        The ARN of the stream from where you want to get the media content. If you don't specify the
     *        <code>streamARN</code>, you must specify the <code>streamName</code>.
     */

    public void setStreamARN(String streamARN) {
        this.streamARN = streamARN;
    }

    /**
     * <p>
     * The ARN of the stream from where you want to get the media content. If you don't specify the
     * <code>streamARN</code>, you must specify the <code>streamName</code>.
     * </p>
     * 
     * @return The ARN of the stream from where you want to get the media content. If you don't specify the
     *         <code>streamARN</code>, you must specify the <code>streamName</code>.
     */

    public String getStreamARN() {
        return this.streamARN;
    }

    /**
     * <p>
     * The ARN of the stream from where you want to get the media content. If you don't specify the
     * <code>streamARN</code>, you must specify the <code>streamName</code>.
     * </p>
     * 
     * @param streamARN
     *        The ARN of the stream from where you want to get the media content. If you don't specify the
     *        <code>streamARN</code>, you must specify the <code>streamName</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMediaRequest withStreamARN(String streamARN) {
        setStreamARN(streamARN);
        return this;
    }

    /**
     * <p>
     * Identifies the starting chunk to get from the specified stream.
     * </p>
     * 
     * @param startSelector
     *        Identifies the starting chunk to get from the specified stream.
     */

    public void setStartSelector(StartSelector startSelector) {
        this.startSelector = startSelector;
    }

    /**
     * <p>
     * Identifies the starting chunk to get from the specified stream.
     * </p>
     * 
     * @return Identifies the starting chunk to get from the specified stream.
     */

    public StartSelector getStartSelector() {
        return this.startSelector;
    }

    /**
     * <p>
     * Identifies the starting chunk to get from the specified stream.
     * </p>
     * 
     * @param startSelector
     *        Identifies the starting chunk to get from the specified stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMediaRequest withStartSelector(StartSelector startSelector) {
        setStartSelector(startSelector);
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
        if (getStartSelector() != null)
            sb.append("StartSelector: ").append(getStartSelector());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMediaRequest == false)
            return false;
        GetMediaRequest other = (GetMediaRequest) obj;
        if (other.getStreamName() == null ^ this.getStreamName() == null)
            return false;
        if (other.getStreamName() != null && other.getStreamName().equals(this.getStreamName()) == false)
            return false;
        if (other.getStreamARN() == null ^ this.getStreamARN() == null)
            return false;
        if (other.getStreamARN() != null && other.getStreamARN().equals(this.getStreamARN()) == false)
            return false;
        if (other.getStartSelector() == null ^ this.getStartSelector() == null)
            return false;
        if (other.getStartSelector() != null && other.getStartSelector().equals(this.getStartSelector()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode());
        hashCode = prime * hashCode + ((getStreamARN() == null) ? 0 : getStreamARN().hashCode());
        hashCode = prime * hashCode + ((getStartSelector() == null) ? 0 : getStartSelector().hashCode());
        return hashCode;
    }

    @Override
    public GetMediaRequest clone() {
        return (GetMediaRequest) super.clone();
    }

}
