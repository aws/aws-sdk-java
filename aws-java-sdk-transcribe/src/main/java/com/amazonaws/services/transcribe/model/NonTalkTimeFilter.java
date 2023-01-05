/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.transcribe.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Flag the presence or absence of periods of silence in your Call Analytics transcription output.
 * </p>
 * <p>
 * Rules using <code>NonTalkTimeFilter</code> are designed to match:
 * </p>
 * <ul>
 * <li>
 * <p>
 * The presence of silence at specified periods throughout the call
 * </p>
 * </li>
 * <li>
 * <p>
 * The presence of speech at specified periods throughout the call
 * </p>
 * </li>
 * </ul>
 * <p>
 * See <a href="https://docs.aws.amazon.com/transcribe/latest/dg/tca-categories-batch.html#tca-rules-batch">Rule
 * criteria for batch categories</a> for usage examples.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/NonTalkTimeFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NonTalkTimeFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specify the duration, in milliseconds, of the period of silence that you want to flag. For example, you can flag
     * a silent period that lasts 30,000 milliseconds.
     * </p>
     */
    private Long threshold;
    /**
     * <p>
     * Makes it possible to specify a time range (in milliseconds) in your audio, during which you want to search for a
     * period of silence. See for more detail.
     * </p>
     */
    private AbsoluteTimeRange absoluteTimeRange;
    /**
     * <p>
     * Makes it possible to specify a time range (in percentage) in your media file, during which you want to search for
     * a period of silence. See for more detail.
     * </p>
     */
    private RelativeTimeRange relativeTimeRange;
    /**
     * <p>
     * Set to <code>TRUE</code> to flag periods of speech. Set to <code>FALSE</code> to flag periods of silence
     * </p>
     */
    private Boolean negate;

    /**
     * <p>
     * Specify the duration, in milliseconds, of the period of silence that you want to flag. For example, you can flag
     * a silent period that lasts 30,000 milliseconds.
     * </p>
     * 
     * @param threshold
     *        Specify the duration, in milliseconds, of the period of silence that you want to flag. For example, you
     *        can flag a silent period that lasts 30,000 milliseconds.
     */

    public void setThreshold(Long threshold) {
        this.threshold = threshold;
    }

    /**
     * <p>
     * Specify the duration, in milliseconds, of the period of silence that you want to flag. For example, you can flag
     * a silent period that lasts 30,000 milliseconds.
     * </p>
     * 
     * @return Specify the duration, in milliseconds, of the period of silence that you want to flag. For example, you
     *         can flag a silent period that lasts 30,000 milliseconds.
     */

    public Long getThreshold() {
        return this.threshold;
    }

    /**
     * <p>
     * Specify the duration, in milliseconds, of the period of silence that you want to flag. For example, you can flag
     * a silent period that lasts 30,000 milliseconds.
     * </p>
     * 
     * @param threshold
     *        Specify the duration, in milliseconds, of the period of silence that you want to flag. For example, you
     *        can flag a silent period that lasts 30,000 milliseconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NonTalkTimeFilter withThreshold(Long threshold) {
        setThreshold(threshold);
        return this;
    }

    /**
     * <p>
     * Makes it possible to specify a time range (in milliseconds) in your audio, during which you want to search for a
     * period of silence. See for more detail.
     * </p>
     * 
     * @param absoluteTimeRange
     *        Makes it possible to specify a time range (in milliseconds) in your audio, during which you want to search
     *        for a period of silence. See for more detail.
     */

    public void setAbsoluteTimeRange(AbsoluteTimeRange absoluteTimeRange) {
        this.absoluteTimeRange = absoluteTimeRange;
    }

    /**
     * <p>
     * Makes it possible to specify a time range (in milliseconds) in your audio, during which you want to search for a
     * period of silence. See for more detail.
     * </p>
     * 
     * @return Makes it possible to specify a time range (in milliseconds) in your audio, during which you want to
     *         search for a period of silence. See for more detail.
     */

    public AbsoluteTimeRange getAbsoluteTimeRange() {
        return this.absoluteTimeRange;
    }

    /**
     * <p>
     * Makes it possible to specify a time range (in milliseconds) in your audio, during which you want to search for a
     * period of silence. See for more detail.
     * </p>
     * 
     * @param absoluteTimeRange
     *        Makes it possible to specify a time range (in milliseconds) in your audio, during which you want to search
     *        for a period of silence. See for more detail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NonTalkTimeFilter withAbsoluteTimeRange(AbsoluteTimeRange absoluteTimeRange) {
        setAbsoluteTimeRange(absoluteTimeRange);
        return this;
    }

    /**
     * <p>
     * Makes it possible to specify a time range (in percentage) in your media file, during which you want to search for
     * a period of silence. See for more detail.
     * </p>
     * 
     * @param relativeTimeRange
     *        Makes it possible to specify a time range (in percentage) in your media file, during which you want to
     *        search for a period of silence. See for more detail.
     */

    public void setRelativeTimeRange(RelativeTimeRange relativeTimeRange) {
        this.relativeTimeRange = relativeTimeRange;
    }

    /**
     * <p>
     * Makes it possible to specify a time range (in percentage) in your media file, during which you want to search for
     * a period of silence. See for more detail.
     * </p>
     * 
     * @return Makes it possible to specify a time range (in percentage) in your media file, during which you want to
     *         search for a period of silence. See for more detail.
     */

    public RelativeTimeRange getRelativeTimeRange() {
        return this.relativeTimeRange;
    }

    /**
     * <p>
     * Makes it possible to specify a time range (in percentage) in your media file, during which you want to search for
     * a period of silence. See for more detail.
     * </p>
     * 
     * @param relativeTimeRange
     *        Makes it possible to specify a time range (in percentage) in your media file, during which you want to
     *        search for a period of silence. See for more detail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NonTalkTimeFilter withRelativeTimeRange(RelativeTimeRange relativeTimeRange) {
        setRelativeTimeRange(relativeTimeRange);
        return this;
    }

    /**
     * <p>
     * Set to <code>TRUE</code> to flag periods of speech. Set to <code>FALSE</code> to flag periods of silence
     * </p>
     * 
     * @param negate
     *        Set to <code>TRUE</code> to flag periods of speech. Set to <code>FALSE</code> to flag periods of silence
     */

    public void setNegate(Boolean negate) {
        this.negate = negate;
    }

    /**
     * <p>
     * Set to <code>TRUE</code> to flag periods of speech. Set to <code>FALSE</code> to flag periods of silence
     * </p>
     * 
     * @return Set to <code>TRUE</code> to flag periods of speech. Set to <code>FALSE</code> to flag periods of silence
     */

    public Boolean getNegate() {
        return this.negate;
    }

    /**
     * <p>
     * Set to <code>TRUE</code> to flag periods of speech. Set to <code>FALSE</code> to flag periods of silence
     * </p>
     * 
     * @param negate
     *        Set to <code>TRUE</code> to flag periods of speech. Set to <code>FALSE</code> to flag periods of silence
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NonTalkTimeFilter withNegate(Boolean negate) {
        setNegate(negate);
        return this;
    }

    /**
     * <p>
     * Set to <code>TRUE</code> to flag periods of speech. Set to <code>FALSE</code> to flag periods of silence
     * </p>
     * 
     * @return Set to <code>TRUE</code> to flag periods of speech. Set to <code>FALSE</code> to flag periods of silence
     */

    public Boolean isNegate() {
        return this.negate;
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
        if (getThreshold() != null)
            sb.append("Threshold: ").append(getThreshold()).append(",");
        if (getAbsoluteTimeRange() != null)
            sb.append("AbsoluteTimeRange: ").append(getAbsoluteTimeRange()).append(",");
        if (getRelativeTimeRange() != null)
            sb.append("RelativeTimeRange: ").append(getRelativeTimeRange()).append(",");
        if (getNegate() != null)
            sb.append("Negate: ").append(getNegate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NonTalkTimeFilter == false)
            return false;
        NonTalkTimeFilter other = (NonTalkTimeFilter) obj;
        if (other.getThreshold() == null ^ this.getThreshold() == null)
            return false;
        if (other.getThreshold() != null && other.getThreshold().equals(this.getThreshold()) == false)
            return false;
        if (other.getAbsoluteTimeRange() == null ^ this.getAbsoluteTimeRange() == null)
            return false;
        if (other.getAbsoluteTimeRange() != null && other.getAbsoluteTimeRange().equals(this.getAbsoluteTimeRange()) == false)
            return false;
        if (other.getRelativeTimeRange() == null ^ this.getRelativeTimeRange() == null)
            return false;
        if (other.getRelativeTimeRange() != null && other.getRelativeTimeRange().equals(this.getRelativeTimeRange()) == false)
            return false;
        if (other.getNegate() == null ^ this.getNegate() == null)
            return false;
        if (other.getNegate() != null && other.getNegate().equals(this.getNegate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getThreshold() == null) ? 0 : getThreshold().hashCode());
        hashCode = prime * hashCode + ((getAbsoluteTimeRange() == null) ? 0 : getAbsoluteTimeRange().hashCode());
        hashCode = prime * hashCode + ((getRelativeTimeRange() == null) ? 0 : getRelativeTimeRange().hashCode());
        hashCode = prime * hashCode + ((getNegate() == null) ? 0 : getNegate().hashCode());
        return hashCode;
    }

    @Override
    public NonTalkTimeFilter clone() {
        try {
            return (NonTalkTimeFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transcribe.model.transform.NonTalkTimeFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
