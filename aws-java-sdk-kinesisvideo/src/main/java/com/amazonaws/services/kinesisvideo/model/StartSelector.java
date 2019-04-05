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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Identifies the chunk on the Kinesis video stream where you want the <code>GetMedia</code> API to start returning
 * media data. You have the following options to identify the starting chunk:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Choose the latest (or oldest) chunk.
 * </p>
 * </li>
 * <li>
 * <p>
 * Identify a specific chunk. You can identify a specific chunk either by providing a fragment number or timestamp
 * (server or producer).
 * </p>
 * </li>
 * <li>
 * <p>
 * Each chunk's metadata includes a continuation token as a Matroska (MKV) tag (
 * <code>AWS_KINESISVIDEO_CONTINUATION_TOKEN</code>). If your previous <code>GetMedia</code> request terminated, you can
 * use this tag value in your next <code>GetMedia</code> request. The API then starts returning chunks starting where
 * the last API ended.
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-video-media-2017-09-30/StartSelector" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartSelector implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Identifies the fragment on the Kinesis video stream where you want to start getting the data from.
     * </p>
     * <ul>
     * <li>
     * <p>
     * NOW - Start with the latest chunk on the stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * EARLIEST - Start with earliest available chunk on the stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * FRAGMENT_NUMBER - Start with the chunk containing the specific fragment. You must also specify the
     * <code>StartFragmentNumber</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * PRODUCER_TIMESTAMP or SERVER_TIMESTAMP - Start with the chunk containing a fragment with the specified producer
     * or server timestamp. You specify the timestamp by adding <code>StartTimestamp</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * CONTINUATION_TOKEN - Read using the specified continuation token.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * If you choose the NOW, EARLIEST, or CONTINUATION_TOKEN as the <code>startSelectorType</code>, you don't provide
     * any additional information in the <code>startSelector</code>.
     * </p>
     * </note>
     */
    private String startSelectorType;
    /**
     * <p>
     * Specifies the fragment number from where you want the <code>GetMedia</code> API to start returning the fragments.
     * </p>
     */
    private String afterFragmentNumber;
    /**
     * <p>
     * A timestamp value. This value is required if you choose the PRODUCER_TIMESTAMP or the SERVER_TIMESTAMP as the
     * <code>startSelectorType</code>. The <code>GetMedia</code> API then starts with the chunk containing the fragment
     * that has the specified timestamp.
     * </p>
     */
    private java.util.Date startTimestamp;
    /**
     * <p>
     * Continuation token that Kinesis Video Streams returned in the previous <code>GetMedia</code> response. The
     * <code>GetMedia</code> API then starts with the chunk identified by the continuation token.
     * </p>
     */
    private String continuationToken;

    /**
     * <p>
     * Identifies the fragment on the Kinesis video stream where you want to start getting the data from.
     * </p>
     * <ul>
     * <li>
     * <p>
     * NOW - Start with the latest chunk on the stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * EARLIEST - Start with earliest available chunk on the stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * FRAGMENT_NUMBER - Start with the chunk containing the specific fragment. You must also specify the
     * <code>StartFragmentNumber</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * PRODUCER_TIMESTAMP or SERVER_TIMESTAMP - Start with the chunk containing a fragment with the specified producer
     * or server timestamp. You specify the timestamp by adding <code>StartTimestamp</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * CONTINUATION_TOKEN - Read using the specified continuation token.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * If you choose the NOW, EARLIEST, or CONTINUATION_TOKEN as the <code>startSelectorType</code>, you don't provide
     * any additional information in the <code>startSelector</code>.
     * </p>
     * </note>
     * 
     * @param startSelectorType
     *        Identifies the fragment on the Kinesis video stream where you want to start getting the data from.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        NOW - Start with the latest chunk on the stream.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        EARLIEST - Start with earliest available chunk on the stream.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FRAGMENT_NUMBER - Start with the chunk containing the specific fragment. You must also specify the
     *        <code>StartFragmentNumber</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PRODUCER_TIMESTAMP or SERVER_TIMESTAMP - Start with the chunk containing a fragment with the specified
     *        producer or server timestamp. You specify the timestamp by adding <code>StartTimestamp</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CONTINUATION_TOKEN - Read using the specified continuation token.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        If you choose the NOW, EARLIEST, or CONTINUATION_TOKEN as the <code>startSelectorType</code>, you don't
     *        provide any additional information in the <code>startSelector</code>.
     *        </p>
     * @see StartSelectorType
     */

    public void setStartSelectorType(String startSelectorType) {
        this.startSelectorType = startSelectorType;
    }

    /**
     * <p>
     * Identifies the fragment on the Kinesis video stream where you want to start getting the data from.
     * </p>
     * <ul>
     * <li>
     * <p>
     * NOW - Start with the latest chunk on the stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * EARLIEST - Start with earliest available chunk on the stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * FRAGMENT_NUMBER - Start with the chunk containing the specific fragment. You must also specify the
     * <code>StartFragmentNumber</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * PRODUCER_TIMESTAMP or SERVER_TIMESTAMP - Start with the chunk containing a fragment with the specified producer
     * or server timestamp. You specify the timestamp by adding <code>StartTimestamp</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * CONTINUATION_TOKEN - Read using the specified continuation token.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * If you choose the NOW, EARLIEST, or CONTINUATION_TOKEN as the <code>startSelectorType</code>, you don't provide
     * any additional information in the <code>startSelector</code>.
     * </p>
     * </note>
     * 
     * @return Identifies the fragment on the Kinesis video stream where you want to start getting the data from.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         NOW - Start with the latest chunk on the stream.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         EARLIEST - Start with earliest available chunk on the stream.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         FRAGMENT_NUMBER - Start with the chunk containing the specific fragment. You must also specify the
     *         <code>StartFragmentNumber</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PRODUCER_TIMESTAMP or SERVER_TIMESTAMP - Start with the chunk containing a fragment with the specified
     *         producer or server timestamp. You specify the timestamp by adding <code>StartTimestamp</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CONTINUATION_TOKEN - Read using the specified continuation token.
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         If you choose the NOW, EARLIEST, or CONTINUATION_TOKEN as the <code>startSelectorType</code>, you don't
     *         provide any additional information in the <code>startSelector</code>.
     *         </p>
     * @see StartSelectorType
     */

    public String getStartSelectorType() {
        return this.startSelectorType;
    }

    /**
     * <p>
     * Identifies the fragment on the Kinesis video stream where you want to start getting the data from.
     * </p>
     * <ul>
     * <li>
     * <p>
     * NOW - Start with the latest chunk on the stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * EARLIEST - Start with earliest available chunk on the stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * FRAGMENT_NUMBER - Start with the chunk containing the specific fragment. You must also specify the
     * <code>StartFragmentNumber</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * PRODUCER_TIMESTAMP or SERVER_TIMESTAMP - Start with the chunk containing a fragment with the specified producer
     * or server timestamp. You specify the timestamp by adding <code>StartTimestamp</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * CONTINUATION_TOKEN - Read using the specified continuation token.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * If you choose the NOW, EARLIEST, or CONTINUATION_TOKEN as the <code>startSelectorType</code>, you don't provide
     * any additional information in the <code>startSelector</code>.
     * </p>
     * </note>
     * 
     * @param startSelectorType
     *        Identifies the fragment on the Kinesis video stream where you want to start getting the data from.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        NOW - Start with the latest chunk on the stream.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        EARLIEST - Start with earliest available chunk on the stream.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FRAGMENT_NUMBER - Start with the chunk containing the specific fragment. You must also specify the
     *        <code>StartFragmentNumber</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PRODUCER_TIMESTAMP or SERVER_TIMESTAMP - Start with the chunk containing a fragment with the specified
     *        producer or server timestamp. You specify the timestamp by adding <code>StartTimestamp</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CONTINUATION_TOKEN - Read using the specified continuation token.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        If you choose the NOW, EARLIEST, or CONTINUATION_TOKEN as the <code>startSelectorType</code>, you don't
     *        provide any additional information in the <code>startSelector</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StartSelectorType
     */

    public StartSelector withStartSelectorType(String startSelectorType) {
        setStartSelectorType(startSelectorType);
        return this;
    }

    /**
     * <p>
     * Identifies the fragment on the Kinesis video stream where you want to start getting the data from.
     * </p>
     * <ul>
     * <li>
     * <p>
     * NOW - Start with the latest chunk on the stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * EARLIEST - Start with earliest available chunk on the stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * FRAGMENT_NUMBER - Start with the chunk containing the specific fragment. You must also specify the
     * <code>StartFragmentNumber</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * PRODUCER_TIMESTAMP or SERVER_TIMESTAMP - Start with the chunk containing a fragment with the specified producer
     * or server timestamp. You specify the timestamp by adding <code>StartTimestamp</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * CONTINUATION_TOKEN - Read using the specified continuation token.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * If you choose the NOW, EARLIEST, or CONTINUATION_TOKEN as the <code>startSelectorType</code>, you don't provide
     * any additional information in the <code>startSelector</code>.
     * </p>
     * </note>
     * 
     * @param startSelectorType
     *        Identifies the fragment on the Kinesis video stream where you want to start getting the data from.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        NOW - Start with the latest chunk on the stream.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        EARLIEST - Start with earliest available chunk on the stream.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FRAGMENT_NUMBER - Start with the chunk containing the specific fragment. You must also specify the
     *        <code>StartFragmentNumber</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PRODUCER_TIMESTAMP or SERVER_TIMESTAMP - Start with the chunk containing a fragment with the specified
     *        producer or server timestamp. You specify the timestamp by adding <code>StartTimestamp</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CONTINUATION_TOKEN - Read using the specified continuation token.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        If you choose the NOW, EARLIEST, or CONTINUATION_TOKEN as the <code>startSelectorType</code>, you don't
     *        provide any additional information in the <code>startSelector</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StartSelectorType
     */

    public StartSelector withStartSelectorType(StartSelectorType startSelectorType) {
        this.startSelectorType = startSelectorType.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the fragment number from where you want the <code>GetMedia</code> API to start returning the fragments.
     * </p>
     * 
     * @param afterFragmentNumber
     *        Specifies the fragment number from where you want the <code>GetMedia</code> API to start returning the
     *        fragments.
     */

    public void setAfterFragmentNumber(String afterFragmentNumber) {
        this.afterFragmentNumber = afterFragmentNumber;
    }

    /**
     * <p>
     * Specifies the fragment number from where you want the <code>GetMedia</code> API to start returning the fragments.
     * </p>
     * 
     * @return Specifies the fragment number from where you want the <code>GetMedia</code> API to start returning the
     *         fragments.
     */

    public String getAfterFragmentNumber() {
        return this.afterFragmentNumber;
    }

    /**
     * <p>
     * Specifies the fragment number from where you want the <code>GetMedia</code> API to start returning the fragments.
     * </p>
     * 
     * @param afterFragmentNumber
     *        Specifies the fragment number from where you want the <code>GetMedia</code> API to start returning the
     *        fragments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSelector withAfterFragmentNumber(String afterFragmentNumber) {
        setAfterFragmentNumber(afterFragmentNumber);
        return this;
    }

    /**
     * <p>
     * A timestamp value. This value is required if you choose the PRODUCER_TIMESTAMP or the SERVER_TIMESTAMP as the
     * <code>startSelectorType</code>. The <code>GetMedia</code> API then starts with the chunk containing the fragment
     * that has the specified timestamp.
     * </p>
     * 
     * @param startTimestamp
     *        A timestamp value. This value is required if you choose the PRODUCER_TIMESTAMP or the SERVER_TIMESTAMP as
     *        the <code>startSelectorType</code>. The <code>GetMedia</code> API then starts with the chunk containing
     *        the fragment that has the specified timestamp.
     */

    public void setStartTimestamp(java.util.Date startTimestamp) {
        this.startTimestamp = startTimestamp;
    }

    /**
     * <p>
     * A timestamp value. This value is required if you choose the PRODUCER_TIMESTAMP or the SERVER_TIMESTAMP as the
     * <code>startSelectorType</code>. The <code>GetMedia</code> API then starts with the chunk containing the fragment
     * that has the specified timestamp.
     * </p>
     * 
     * @return A timestamp value. This value is required if you choose the PRODUCER_TIMESTAMP or the SERVER_TIMESTAMP as
     *         the <code>startSelectorType</code>. The <code>GetMedia</code> API then starts with the chunk containing
     *         the fragment that has the specified timestamp.
     */

    public java.util.Date getStartTimestamp() {
        return this.startTimestamp;
    }

    /**
     * <p>
     * A timestamp value. This value is required if you choose the PRODUCER_TIMESTAMP or the SERVER_TIMESTAMP as the
     * <code>startSelectorType</code>. The <code>GetMedia</code> API then starts with the chunk containing the fragment
     * that has the specified timestamp.
     * </p>
     * 
     * @param startTimestamp
     *        A timestamp value. This value is required if you choose the PRODUCER_TIMESTAMP or the SERVER_TIMESTAMP as
     *        the <code>startSelectorType</code>. The <code>GetMedia</code> API then starts with the chunk containing
     *        the fragment that has the specified timestamp.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSelector withStartTimestamp(java.util.Date startTimestamp) {
        setStartTimestamp(startTimestamp);
        return this;
    }

    /**
     * <p>
     * Continuation token that Kinesis Video Streams returned in the previous <code>GetMedia</code> response. The
     * <code>GetMedia</code> API then starts with the chunk identified by the continuation token.
     * </p>
     * 
     * @param continuationToken
     *        Continuation token that Kinesis Video Streams returned in the previous <code>GetMedia</code> response. The
     *        <code>GetMedia</code> API then starts with the chunk identified by the continuation token.
     */

    public void setContinuationToken(String continuationToken) {
        this.continuationToken = continuationToken;
    }

    /**
     * <p>
     * Continuation token that Kinesis Video Streams returned in the previous <code>GetMedia</code> response. The
     * <code>GetMedia</code> API then starts with the chunk identified by the continuation token.
     * </p>
     * 
     * @return Continuation token that Kinesis Video Streams returned in the previous <code>GetMedia</code> response.
     *         The <code>GetMedia</code> API then starts with the chunk identified by the continuation token.
     */

    public String getContinuationToken() {
        return this.continuationToken;
    }

    /**
     * <p>
     * Continuation token that Kinesis Video Streams returned in the previous <code>GetMedia</code> response. The
     * <code>GetMedia</code> API then starts with the chunk identified by the continuation token.
     * </p>
     * 
     * @param continuationToken
     *        Continuation token that Kinesis Video Streams returned in the previous <code>GetMedia</code> response. The
     *        <code>GetMedia</code> API then starts with the chunk identified by the continuation token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSelector withContinuationToken(String continuationToken) {
        setContinuationToken(continuationToken);
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
        if (getStartSelectorType() != null)
            sb.append("StartSelectorType: ").append(getStartSelectorType()).append(",");
        if (getAfterFragmentNumber() != null)
            sb.append("AfterFragmentNumber: ").append(getAfterFragmentNumber()).append(",");
        if (getStartTimestamp() != null)
            sb.append("StartTimestamp: ").append(getStartTimestamp()).append(",");
        if (getContinuationToken() != null)
            sb.append("ContinuationToken: ").append(getContinuationToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartSelector == false)
            return false;
        StartSelector other = (StartSelector) obj;
        if (other.getStartSelectorType() == null ^ this.getStartSelectorType() == null)
            return false;
        if (other.getStartSelectorType() != null && other.getStartSelectorType().equals(this.getStartSelectorType()) == false)
            return false;
        if (other.getAfterFragmentNumber() == null ^ this.getAfterFragmentNumber() == null)
            return false;
        if (other.getAfterFragmentNumber() != null && other.getAfterFragmentNumber().equals(this.getAfterFragmentNumber()) == false)
            return false;
        if (other.getStartTimestamp() == null ^ this.getStartTimestamp() == null)
            return false;
        if (other.getStartTimestamp() != null && other.getStartTimestamp().equals(this.getStartTimestamp()) == false)
            return false;
        if (other.getContinuationToken() == null ^ this.getContinuationToken() == null)
            return false;
        if (other.getContinuationToken() != null && other.getContinuationToken().equals(this.getContinuationToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStartSelectorType() == null) ? 0 : getStartSelectorType().hashCode());
        hashCode = prime * hashCode + ((getAfterFragmentNumber() == null) ? 0 : getAfterFragmentNumber().hashCode());
        hashCode = prime * hashCode + ((getStartTimestamp() == null) ? 0 : getStartTimestamp().hashCode());
        hashCode = prime * hashCode + ((getContinuationToken() == null) ? 0 : getContinuationToken().hashCode());
        return hashCode;
    }

    @Override
    public StartSelector clone() {
        try {
            return (StartSelector) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisvideo.model.transform.StartSelectorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
