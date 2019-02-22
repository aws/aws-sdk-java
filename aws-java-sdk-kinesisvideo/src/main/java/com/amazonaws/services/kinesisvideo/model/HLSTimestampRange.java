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
 * The start and end of the timestamp range for the requested media.
 * </p>
 * <p>
 * This value should not be present if <code>PlaybackType</code> is <code>LIVE</code>.
 * </p>
 * <note>
 * <p>
 * The values in the <code>HLSTimestampRange</code> are inclusive. Fragments that begin before the start time but
 * continue past it, or fragments that begin before the end time but continue past it, are included in the session.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-video-archived-media-2017-09-30/HLSTimestampRange"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HLSTimestampRange implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The start of the timestamp range for the requested media.
     * </p>
     * <p>
     * If the <code>HLSTimestampRange</code> value is specified, the <code>StartTimestamp</code> value is required.
     * </p>
     * <note>
     * <p>
     * This value is inclusive. Fragments that start before the <code>StartTimestamp</code> and continue past it are
     * included in the session. If <code>FragmentSelectorType</code> is <code>SERVER_TIMESTAMP</code>, the
     * <code>StartTimestamp</code> must be later than the stream head.
     * </p>
     * </note>
     */
    private java.util.Date startTimestamp;
    /**
     * <p>
     * The end of the timestamp range for the requested media. This value must be within 3 hours of the specified
     * <code>StartTimestamp</code>, and it must be later than the <code>StartTimestamp</code> value.
     * </p>
     * <p>
     * If <code>FragmentSelectorType</code> for the request is <code>SERVER_TIMESTAMP</code>, this value must be in the
     * past.
     * </p>
     * <p>
     * If the <code>HLSTimestampRange</code> value is specified, the <code>EndTimestamp</code> value is required.
     * </p>
     * <note>
     * <p>
     * This value is inclusive. The <code>EndTimestamp</code> is compared to the (starting) timestamp of the fragment.
     * Fragments that start before the <code>EndTimestamp</code> value and continue past it are included in the session.
     * </p>
     * </note>
     */
    private java.util.Date endTimestamp;

    /**
     * <p>
     * The start of the timestamp range for the requested media.
     * </p>
     * <p>
     * If the <code>HLSTimestampRange</code> value is specified, the <code>StartTimestamp</code> value is required.
     * </p>
     * <note>
     * <p>
     * This value is inclusive. Fragments that start before the <code>StartTimestamp</code> and continue past it are
     * included in the session. If <code>FragmentSelectorType</code> is <code>SERVER_TIMESTAMP</code>, the
     * <code>StartTimestamp</code> must be later than the stream head.
     * </p>
     * </note>
     * 
     * @param startTimestamp
     *        The start of the timestamp range for the requested media.</p>
     *        <p>
     *        If the <code>HLSTimestampRange</code> value is specified, the <code>StartTimestamp</code> value is
     *        required.
     *        </p>
     *        <note>
     *        <p>
     *        This value is inclusive. Fragments that start before the <code>StartTimestamp</code> and continue past it
     *        are included in the session. If <code>FragmentSelectorType</code> is <code>SERVER_TIMESTAMP</code>, the
     *        <code>StartTimestamp</code> must be later than the stream head.
     *        </p>
     */

    public void setStartTimestamp(java.util.Date startTimestamp) {
        this.startTimestamp = startTimestamp;
    }

    /**
     * <p>
     * The start of the timestamp range for the requested media.
     * </p>
     * <p>
     * If the <code>HLSTimestampRange</code> value is specified, the <code>StartTimestamp</code> value is required.
     * </p>
     * <note>
     * <p>
     * This value is inclusive. Fragments that start before the <code>StartTimestamp</code> and continue past it are
     * included in the session. If <code>FragmentSelectorType</code> is <code>SERVER_TIMESTAMP</code>, the
     * <code>StartTimestamp</code> must be later than the stream head.
     * </p>
     * </note>
     * 
     * @return The start of the timestamp range for the requested media.</p>
     *         <p>
     *         If the <code>HLSTimestampRange</code> value is specified, the <code>StartTimestamp</code> value is
     *         required.
     *         </p>
     *         <note>
     *         <p>
     *         This value is inclusive. Fragments that start before the <code>StartTimestamp</code> and continue past it
     *         are included in the session. If <code>FragmentSelectorType</code> is <code>SERVER_TIMESTAMP</code>, the
     *         <code>StartTimestamp</code> must be later than the stream head.
     *         </p>
     */

    public java.util.Date getStartTimestamp() {
        return this.startTimestamp;
    }

    /**
     * <p>
     * The start of the timestamp range for the requested media.
     * </p>
     * <p>
     * If the <code>HLSTimestampRange</code> value is specified, the <code>StartTimestamp</code> value is required.
     * </p>
     * <note>
     * <p>
     * This value is inclusive. Fragments that start before the <code>StartTimestamp</code> and continue past it are
     * included in the session. If <code>FragmentSelectorType</code> is <code>SERVER_TIMESTAMP</code>, the
     * <code>StartTimestamp</code> must be later than the stream head.
     * </p>
     * </note>
     * 
     * @param startTimestamp
     *        The start of the timestamp range for the requested media.</p>
     *        <p>
     *        If the <code>HLSTimestampRange</code> value is specified, the <code>StartTimestamp</code> value is
     *        required.
     *        </p>
     *        <note>
     *        <p>
     *        This value is inclusive. Fragments that start before the <code>StartTimestamp</code> and continue past it
     *        are included in the session. If <code>FragmentSelectorType</code> is <code>SERVER_TIMESTAMP</code>, the
     *        <code>StartTimestamp</code> must be later than the stream head.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HLSTimestampRange withStartTimestamp(java.util.Date startTimestamp) {
        setStartTimestamp(startTimestamp);
        return this;
    }

    /**
     * <p>
     * The end of the timestamp range for the requested media. This value must be within 3 hours of the specified
     * <code>StartTimestamp</code>, and it must be later than the <code>StartTimestamp</code> value.
     * </p>
     * <p>
     * If <code>FragmentSelectorType</code> for the request is <code>SERVER_TIMESTAMP</code>, this value must be in the
     * past.
     * </p>
     * <p>
     * If the <code>HLSTimestampRange</code> value is specified, the <code>EndTimestamp</code> value is required.
     * </p>
     * <note>
     * <p>
     * This value is inclusive. The <code>EndTimestamp</code> is compared to the (starting) timestamp of the fragment.
     * Fragments that start before the <code>EndTimestamp</code> value and continue past it are included in the session.
     * </p>
     * </note>
     * 
     * @param endTimestamp
     *        The end of the timestamp range for the requested media. This value must be within 3 hours of the specified
     *        <code>StartTimestamp</code>, and it must be later than the <code>StartTimestamp</code> value.</p>
     *        <p>
     *        If <code>FragmentSelectorType</code> for the request is <code>SERVER_TIMESTAMP</code>, this value must be
     *        in the past.
     *        </p>
     *        <p>
     *        If the <code>HLSTimestampRange</code> value is specified, the <code>EndTimestamp</code> value is required.
     *        </p>
     *        <note>
     *        <p>
     *        This value is inclusive. The <code>EndTimestamp</code> is compared to the (starting) timestamp of the
     *        fragment. Fragments that start before the <code>EndTimestamp</code> value and continue past it are
     *        included in the session.
     *        </p>
     */

    public void setEndTimestamp(java.util.Date endTimestamp) {
        this.endTimestamp = endTimestamp;
    }

    /**
     * <p>
     * The end of the timestamp range for the requested media. This value must be within 3 hours of the specified
     * <code>StartTimestamp</code>, and it must be later than the <code>StartTimestamp</code> value.
     * </p>
     * <p>
     * If <code>FragmentSelectorType</code> for the request is <code>SERVER_TIMESTAMP</code>, this value must be in the
     * past.
     * </p>
     * <p>
     * If the <code>HLSTimestampRange</code> value is specified, the <code>EndTimestamp</code> value is required.
     * </p>
     * <note>
     * <p>
     * This value is inclusive. The <code>EndTimestamp</code> is compared to the (starting) timestamp of the fragment.
     * Fragments that start before the <code>EndTimestamp</code> value and continue past it are included in the session.
     * </p>
     * </note>
     * 
     * @return The end of the timestamp range for the requested media. This value must be within 3 hours of the
     *         specified <code>StartTimestamp</code>, and it must be later than the <code>StartTimestamp</code>
     *         value.</p>
     *         <p>
     *         If <code>FragmentSelectorType</code> for the request is <code>SERVER_TIMESTAMP</code>, this value must be
     *         in the past.
     *         </p>
     *         <p>
     *         If the <code>HLSTimestampRange</code> value is specified, the <code>EndTimestamp</code> value is
     *         required.
     *         </p>
     *         <note>
     *         <p>
     *         This value is inclusive. The <code>EndTimestamp</code> is compared to the (starting) timestamp of the
     *         fragment. Fragments that start before the <code>EndTimestamp</code> value and continue past it are
     *         included in the session.
     *         </p>
     */

    public java.util.Date getEndTimestamp() {
        return this.endTimestamp;
    }

    /**
     * <p>
     * The end of the timestamp range for the requested media. This value must be within 3 hours of the specified
     * <code>StartTimestamp</code>, and it must be later than the <code>StartTimestamp</code> value.
     * </p>
     * <p>
     * If <code>FragmentSelectorType</code> for the request is <code>SERVER_TIMESTAMP</code>, this value must be in the
     * past.
     * </p>
     * <p>
     * If the <code>HLSTimestampRange</code> value is specified, the <code>EndTimestamp</code> value is required.
     * </p>
     * <note>
     * <p>
     * This value is inclusive. The <code>EndTimestamp</code> is compared to the (starting) timestamp of the fragment.
     * Fragments that start before the <code>EndTimestamp</code> value and continue past it are included in the session.
     * </p>
     * </note>
     * 
     * @param endTimestamp
     *        The end of the timestamp range for the requested media. This value must be within 3 hours of the specified
     *        <code>StartTimestamp</code>, and it must be later than the <code>StartTimestamp</code> value.</p>
     *        <p>
     *        If <code>FragmentSelectorType</code> for the request is <code>SERVER_TIMESTAMP</code>, this value must be
     *        in the past.
     *        </p>
     *        <p>
     *        If the <code>HLSTimestampRange</code> value is specified, the <code>EndTimestamp</code> value is required.
     *        </p>
     *        <note>
     *        <p>
     *        This value is inclusive. The <code>EndTimestamp</code> is compared to the (starting) timestamp of the
     *        fragment. Fragments that start before the <code>EndTimestamp</code> value and continue past it are
     *        included in the session.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HLSTimestampRange withEndTimestamp(java.util.Date endTimestamp) {
        setEndTimestamp(endTimestamp);
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
        if (getStartTimestamp() != null)
            sb.append("StartTimestamp: ").append(getStartTimestamp()).append(",");
        if (getEndTimestamp() != null)
            sb.append("EndTimestamp: ").append(getEndTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HLSTimestampRange == false)
            return false;
        HLSTimestampRange other = (HLSTimestampRange) obj;
        if (other.getStartTimestamp() == null ^ this.getStartTimestamp() == null)
            return false;
        if (other.getStartTimestamp() != null && other.getStartTimestamp().equals(this.getStartTimestamp()) == false)
            return false;
        if (other.getEndTimestamp() == null ^ this.getEndTimestamp() == null)
            return false;
        if (other.getEndTimestamp() != null && other.getEndTimestamp().equals(this.getEndTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStartTimestamp() == null) ? 0 : getStartTimestamp().hashCode());
        hashCode = prime * hashCode + ((getEndTimestamp() == null) ? 0 : getEndTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public HLSTimestampRange clone() {
        try {
            return (HLSTimestampRange) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisvideo.model.transform.HLSTimestampRangeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
