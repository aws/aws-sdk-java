/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mediatailor.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Clip range configuration for the VOD source associated with the program.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/ClipRange" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClipRange implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The end offset of the clip range, in milliseconds, starting from the beginning of the VOD source associated with
     * the program.
     * </p>
     */
    private Long endOffsetMillis;
    /**
     * <p>
     * The start offset of the clip range, in milliseconds. This offset truncates the start at the number of
     * milliseconds into the duration of the VOD source.
     * </p>
     */
    private Long startOffsetMillis;

    /**
     * <p>
     * The end offset of the clip range, in milliseconds, starting from the beginning of the VOD source associated with
     * the program.
     * </p>
     * 
     * @param endOffsetMillis
     *        The end offset of the clip range, in milliseconds, starting from the beginning of the VOD source
     *        associated with the program.
     */

    public void setEndOffsetMillis(Long endOffsetMillis) {
        this.endOffsetMillis = endOffsetMillis;
    }

    /**
     * <p>
     * The end offset of the clip range, in milliseconds, starting from the beginning of the VOD source associated with
     * the program.
     * </p>
     * 
     * @return The end offset of the clip range, in milliseconds, starting from the beginning of the VOD source
     *         associated with the program.
     */

    public Long getEndOffsetMillis() {
        return this.endOffsetMillis;
    }

    /**
     * <p>
     * The end offset of the clip range, in milliseconds, starting from the beginning of the VOD source associated with
     * the program.
     * </p>
     * 
     * @param endOffsetMillis
     *        The end offset of the clip range, in milliseconds, starting from the beginning of the VOD source
     *        associated with the program.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClipRange withEndOffsetMillis(Long endOffsetMillis) {
        setEndOffsetMillis(endOffsetMillis);
        return this;
    }

    /**
     * <p>
     * The start offset of the clip range, in milliseconds. This offset truncates the start at the number of
     * milliseconds into the duration of the VOD source.
     * </p>
     * 
     * @param startOffsetMillis
     *        The start offset of the clip range, in milliseconds. This offset truncates the start at the number of
     *        milliseconds into the duration of the VOD source.
     */

    public void setStartOffsetMillis(Long startOffsetMillis) {
        this.startOffsetMillis = startOffsetMillis;
    }

    /**
     * <p>
     * The start offset of the clip range, in milliseconds. This offset truncates the start at the number of
     * milliseconds into the duration of the VOD source.
     * </p>
     * 
     * @return The start offset of the clip range, in milliseconds. This offset truncates the start at the number of
     *         milliseconds into the duration of the VOD source.
     */

    public Long getStartOffsetMillis() {
        return this.startOffsetMillis;
    }

    /**
     * <p>
     * The start offset of the clip range, in milliseconds. This offset truncates the start at the number of
     * milliseconds into the duration of the VOD source.
     * </p>
     * 
     * @param startOffsetMillis
     *        The start offset of the clip range, in milliseconds. This offset truncates the start at the number of
     *        milliseconds into the duration of the VOD source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClipRange withStartOffsetMillis(Long startOffsetMillis) {
        setStartOffsetMillis(startOffsetMillis);
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
        if (getEndOffsetMillis() != null)
            sb.append("EndOffsetMillis: ").append(getEndOffsetMillis()).append(",");
        if (getStartOffsetMillis() != null)
            sb.append("StartOffsetMillis: ").append(getStartOffsetMillis());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClipRange == false)
            return false;
        ClipRange other = (ClipRange) obj;
        if (other.getEndOffsetMillis() == null ^ this.getEndOffsetMillis() == null)
            return false;
        if (other.getEndOffsetMillis() != null && other.getEndOffsetMillis().equals(this.getEndOffsetMillis()) == false)
            return false;
        if (other.getStartOffsetMillis() == null ^ this.getStartOffsetMillis() == null)
            return false;
        if (other.getStartOffsetMillis() != null && other.getStartOffsetMillis().equals(this.getStartOffsetMillis()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndOffsetMillis() == null) ? 0 : getEndOffsetMillis().hashCode());
        hashCode = prime * hashCode + ((getStartOffsetMillis() == null) ? 0 : getStartOffsetMillis().hashCode());
        return hashCode;
    }

    @Override
    public ClipRange clone() {
        try {
            return (ClipRange) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediatailor.model.transform.ClipRangeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
