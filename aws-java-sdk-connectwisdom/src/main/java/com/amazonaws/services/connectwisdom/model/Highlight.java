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
package com.amazonaws.services.connectwisdom.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Offset specification to describe highlighting of document excerpts for rendering search results and recommendations.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/Highlight" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Highlight implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The offset for the start of the highlight.
     * </p>
     */
    private Integer beginOffsetInclusive;
    /**
     * <p>
     * The offset for the end of the highlight.
     * </p>
     */
    private Integer endOffsetExclusive;

    /**
     * <p>
     * The offset for the start of the highlight.
     * </p>
     * 
     * @param beginOffsetInclusive
     *        The offset for the start of the highlight.
     */

    public void setBeginOffsetInclusive(Integer beginOffsetInclusive) {
        this.beginOffsetInclusive = beginOffsetInclusive;
    }

    /**
     * <p>
     * The offset for the start of the highlight.
     * </p>
     * 
     * @return The offset for the start of the highlight.
     */

    public Integer getBeginOffsetInclusive() {
        return this.beginOffsetInclusive;
    }

    /**
     * <p>
     * The offset for the start of the highlight.
     * </p>
     * 
     * @param beginOffsetInclusive
     *        The offset for the start of the highlight.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Highlight withBeginOffsetInclusive(Integer beginOffsetInclusive) {
        setBeginOffsetInclusive(beginOffsetInclusive);
        return this;
    }

    /**
     * <p>
     * The offset for the end of the highlight.
     * </p>
     * 
     * @param endOffsetExclusive
     *        The offset for the end of the highlight.
     */

    public void setEndOffsetExclusive(Integer endOffsetExclusive) {
        this.endOffsetExclusive = endOffsetExclusive;
    }

    /**
     * <p>
     * The offset for the end of the highlight.
     * </p>
     * 
     * @return The offset for the end of the highlight.
     */

    public Integer getEndOffsetExclusive() {
        return this.endOffsetExclusive;
    }

    /**
     * <p>
     * The offset for the end of the highlight.
     * </p>
     * 
     * @param endOffsetExclusive
     *        The offset for the end of the highlight.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Highlight withEndOffsetExclusive(Integer endOffsetExclusive) {
        setEndOffsetExclusive(endOffsetExclusive);
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
        if (getBeginOffsetInclusive() != null)
            sb.append("BeginOffsetInclusive: ").append(getBeginOffsetInclusive()).append(",");
        if (getEndOffsetExclusive() != null)
            sb.append("EndOffsetExclusive: ").append(getEndOffsetExclusive());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Highlight == false)
            return false;
        Highlight other = (Highlight) obj;
        if (other.getBeginOffsetInclusive() == null ^ this.getBeginOffsetInclusive() == null)
            return false;
        if (other.getBeginOffsetInclusive() != null && other.getBeginOffsetInclusive().equals(this.getBeginOffsetInclusive()) == false)
            return false;
        if (other.getEndOffsetExclusive() == null ^ this.getEndOffsetExclusive() == null)
            return false;
        if (other.getEndOffsetExclusive() != null && other.getEndOffsetExclusive().equals(this.getEndOffsetExclusive()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBeginOffsetInclusive() == null) ? 0 : getBeginOffsetInclusive().hashCode());
        hashCode = prime * hashCode + ((getEndOffsetExclusive() == null) ? 0 : getEndOffsetExclusive().hashCode());
        return hashCode;
    }

    @Override
    public Highlight clone() {
        try {
            return (Highlight) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connectwisdom.model.transform.HighlightMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
