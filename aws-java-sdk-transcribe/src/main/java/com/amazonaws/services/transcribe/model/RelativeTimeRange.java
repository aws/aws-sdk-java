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
 * A time range, in percentage, between two points in your media file.
 * </p>
 * <p>
 * You can use <code>StartPercentage</code> and <code>EndPercentage</code> to search a custom segment. For example,
 * setting <code>StartPercentage</code> to 10 and <code>EndPercentage</code> to 50 only searches for your specified
 * criteria in the audio contained between the 10 percent mark and the 50 percent mark of your media file.
 * </p>
 * <p>
 * You can use also <code>First</code> to search from the start of the media file until the time that you specify. Or
 * use <code>Last</code> to search from the time that you specify until the end of the media file. For example, setting
 * <code>First</code> to 10 only searches for your specified criteria in the audio contained in the first 10 percent of
 * the media file.
 * </p>
 * <p>
 * If you prefer to use milliseconds instead of percentage, see .
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/RelativeTimeRange" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RelativeTimeRange implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The time, in percentage, when Amazon Transcribe starts searching for the specified criteria in your media file.
     * If you include <code>StartPercentage</code> in your request, you must also include <code>EndPercentage</code>.
     * </p>
     */
    private Integer startPercentage;
    /**
     * <p>
     * The time, in percentage, when Amazon Transcribe stops searching for the specified criteria in your media file. If
     * you include <code>EndPercentage</code> in your request, you must also include <code>StartPercentage</code>.
     * </p>
     */
    private Integer endPercentage;
    /**
     * <p>
     * The time, in percentage, from the start of your media file until the specified value. Amazon Transcribe searches
     * for your specified criteria in this time segment.
     * </p>
     */
    private Integer first;
    /**
     * <p>
     * The time, in percentage, from the specified value until the end of your media file. Amazon Transcribe searches
     * for your specified criteria in this time segment.
     * </p>
     */
    private Integer last;

    /**
     * <p>
     * The time, in percentage, when Amazon Transcribe starts searching for the specified criteria in your media file.
     * If you include <code>StartPercentage</code> in your request, you must also include <code>EndPercentage</code>.
     * </p>
     * 
     * @param startPercentage
     *        The time, in percentage, when Amazon Transcribe starts searching for the specified criteria in your media
     *        file. If you include <code>StartPercentage</code> in your request, you must also include
     *        <code>EndPercentage</code>.
     */

    public void setStartPercentage(Integer startPercentage) {
        this.startPercentage = startPercentage;
    }

    /**
     * <p>
     * The time, in percentage, when Amazon Transcribe starts searching for the specified criteria in your media file.
     * If you include <code>StartPercentage</code> in your request, you must also include <code>EndPercentage</code>.
     * </p>
     * 
     * @return The time, in percentage, when Amazon Transcribe starts searching for the specified criteria in your media
     *         file. If you include <code>StartPercentage</code> in your request, you must also include
     *         <code>EndPercentage</code>.
     */

    public Integer getStartPercentage() {
        return this.startPercentage;
    }

    /**
     * <p>
     * The time, in percentage, when Amazon Transcribe starts searching for the specified criteria in your media file.
     * If you include <code>StartPercentage</code> in your request, you must also include <code>EndPercentage</code>.
     * </p>
     * 
     * @param startPercentage
     *        The time, in percentage, when Amazon Transcribe starts searching for the specified criteria in your media
     *        file. If you include <code>StartPercentage</code> in your request, you must also include
     *        <code>EndPercentage</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelativeTimeRange withStartPercentage(Integer startPercentage) {
        setStartPercentage(startPercentage);
        return this;
    }

    /**
     * <p>
     * The time, in percentage, when Amazon Transcribe stops searching for the specified criteria in your media file. If
     * you include <code>EndPercentage</code> in your request, you must also include <code>StartPercentage</code>.
     * </p>
     * 
     * @param endPercentage
     *        The time, in percentage, when Amazon Transcribe stops searching for the specified criteria in your media
     *        file. If you include <code>EndPercentage</code> in your request, you must also include
     *        <code>StartPercentage</code>.
     */

    public void setEndPercentage(Integer endPercentage) {
        this.endPercentage = endPercentage;
    }

    /**
     * <p>
     * The time, in percentage, when Amazon Transcribe stops searching for the specified criteria in your media file. If
     * you include <code>EndPercentage</code> in your request, you must also include <code>StartPercentage</code>.
     * </p>
     * 
     * @return The time, in percentage, when Amazon Transcribe stops searching for the specified criteria in your media
     *         file. If you include <code>EndPercentage</code> in your request, you must also include
     *         <code>StartPercentage</code>.
     */

    public Integer getEndPercentage() {
        return this.endPercentage;
    }

    /**
     * <p>
     * The time, in percentage, when Amazon Transcribe stops searching for the specified criteria in your media file. If
     * you include <code>EndPercentage</code> in your request, you must also include <code>StartPercentage</code>.
     * </p>
     * 
     * @param endPercentage
     *        The time, in percentage, when Amazon Transcribe stops searching for the specified criteria in your media
     *        file. If you include <code>EndPercentage</code> in your request, you must also include
     *        <code>StartPercentage</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelativeTimeRange withEndPercentage(Integer endPercentage) {
        setEndPercentage(endPercentage);
        return this;
    }

    /**
     * <p>
     * The time, in percentage, from the start of your media file until the specified value. Amazon Transcribe searches
     * for your specified criteria in this time segment.
     * </p>
     * 
     * @param first
     *        The time, in percentage, from the start of your media file until the specified value. Amazon Transcribe
     *        searches for your specified criteria in this time segment.
     */

    public void setFirst(Integer first) {
        this.first = first;
    }

    /**
     * <p>
     * The time, in percentage, from the start of your media file until the specified value. Amazon Transcribe searches
     * for your specified criteria in this time segment.
     * </p>
     * 
     * @return The time, in percentage, from the start of your media file until the specified value. Amazon Transcribe
     *         searches for your specified criteria in this time segment.
     */

    public Integer getFirst() {
        return this.first;
    }

    /**
     * <p>
     * The time, in percentage, from the start of your media file until the specified value. Amazon Transcribe searches
     * for your specified criteria in this time segment.
     * </p>
     * 
     * @param first
     *        The time, in percentage, from the start of your media file until the specified value. Amazon Transcribe
     *        searches for your specified criteria in this time segment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelativeTimeRange withFirst(Integer first) {
        setFirst(first);
        return this;
    }

    /**
     * <p>
     * The time, in percentage, from the specified value until the end of your media file. Amazon Transcribe searches
     * for your specified criteria in this time segment.
     * </p>
     * 
     * @param last
     *        The time, in percentage, from the specified value until the end of your media file. Amazon Transcribe
     *        searches for your specified criteria in this time segment.
     */

    public void setLast(Integer last) {
        this.last = last;
    }

    /**
     * <p>
     * The time, in percentage, from the specified value until the end of your media file. Amazon Transcribe searches
     * for your specified criteria in this time segment.
     * </p>
     * 
     * @return The time, in percentage, from the specified value until the end of your media file. Amazon Transcribe
     *         searches for your specified criteria in this time segment.
     */

    public Integer getLast() {
        return this.last;
    }

    /**
     * <p>
     * The time, in percentage, from the specified value until the end of your media file. Amazon Transcribe searches
     * for your specified criteria in this time segment.
     * </p>
     * 
     * @param last
     *        The time, in percentage, from the specified value until the end of your media file. Amazon Transcribe
     *        searches for your specified criteria in this time segment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelativeTimeRange withLast(Integer last) {
        setLast(last);
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
        if (getStartPercentage() != null)
            sb.append("StartPercentage: ").append(getStartPercentage()).append(",");
        if (getEndPercentage() != null)
            sb.append("EndPercentage: ").append(getEndPercentage()).append(",");
        if (getFirst() != null)
            sb.append("First: ").append(getFirst()).append(",");
        if (getLast() != null)
            sb.append("Last: ").append(getLast());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RelativeTimeRange == false)
            return false;
        RelativeTimeRange other = (RelativeTimeRange) obj;
        if (other.getStartPercentage() == null ^ this.getStartPercentage() == null)
            return false;
        if (other.getStartPercentage() != null && other.getStartPercentage().equals(this.getStartPercentage()) == false)
            return false;
        if (other.getEndPercentage() == null ^ this.getEndPercentage() == null)
            return false;
        if (other.getEndPercentage() != null && other.getEndPercentage().equals(this.getEndPercentage()) == false)
            return false;
        if (other.getFirst() == null ^ this.getFirst() == null)
            return false;
        if (other.getFirst() != null && other.getFirst().equals(this.getFirst()) == false)
            return false;
        if (other.getLast() == null ^ this.getLast() == null)
            return false;
        if (other.getLast() != null && other.getLast().equals(this.getLast()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStartPercentage() == null) ? 0 : getStartPercentage().hashCode());
        hashCode = prime * hashCode + ((getEndPercentage() == null) ? 0 : getEndPercentage().hashCode());
        hashCode = prime * hashCode + ((getFirst() == null) ? 0 : getFirst().hashCode());
        hashCode = prime * hashCode + ((getLast() == null) ? 0 : getLast().hashCode());
        return hashCode;
    }

    @Override
    public RelativeTimeRange clone() {
        try {
            return (RelativeTimeRange) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transcribe.model.transform.RelativeTimeRangeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
