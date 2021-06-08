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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The text highlights for a single query suggestion.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/SuggestionHighlight" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SuggestionHighlight implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The zero-based location in the response string where the highlight starts.
     * </p>
     */
    private Integer beginOffset;
    /**
     * <p>
     * The zero-based location in the response string where the highlight ends.
     * </p>
     */
    private Integer endOffset;

    /**
     * <p>
     * The zero-based location in the response string where the highlight starts.
     * </p>
     * 
     * @param beginOffset
     *        The zero-based location in the response string where the highlight starts.
     */

    public void setBeginOffset(Integer beginOffset) {
        this.beginOffset = beginOffset;
    }

    /**
     * <p>
     * The zero-based location in the response string where the highlight starts.
     * </p>
     * 
     * @return The zero-based location in the response string where the highlight starts.
     */

    public Integer getBeginOffset() {
        return this.beginOffset;
    }

    /**
     * <p>
     * The zero-based location in the response string where the highlight starts.
     * </p>
     * 
     * @param beginOffset
     *        The zero-based location in the response string where the highlight starts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SuggestionHighlight withBeginOffset(Integer beginOffset) {
        setBeginOffset(beginOffset);
        return this;
    }

    /**
     * <p>
     * The zero-based location in the response string where the highlight ends.
     * </p>
     * 
     * @param endOffset
     *        The zero-based location in the response string where the highlight ends.
     */

    public void setEndOffset(Integer endOffset) {
        this.endOffset = endOffset;
    }

    /**
     * <p>
     * The zero-based location in the response string where the highlight ends.
     * </p>
     * 
     * @return The zero-based location in the response string where the highlight ends.
     */

    public Integer getEndOffset() {
        return this.endOffset;
    }

    /**
     * <p>
     * The zero-based location in the response string where the highlight ends.
     * </p>
     * 
     * @param endOffset
     *        The zero-based location in the response string where the highlight ends.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SuggestionHighlight withEndOffset(Integer endOffset) {
        setEndOffset(endOffset);
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
        if (getBeginOffset() != null)
            sb.append("BeginOffset: ").append(getBeginOffset()).append(",");
        if (getEndOffset() != null)
            sb.append("EndOffset: ").append(getEndOffset());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SuggestionHighlight == false)
            return false;
        SuggestionHighlight other = (SuggestionHighlight) obj;
        if (other.getBeginOffset() == null ^ this.getBeginOffset() == null)
            return false;
        if (other.getBeginOffset() != null && other.getBeginOffset().equals(this.getBeginOffset()) == false)
            return false;
        if (other.getEndOffset() == null ^ this.getEndOffset() == null)
            return false;
        if (other.getEndOffset() != null && other.getEndOffset().equals(this.getEndOffset()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBeginOffset() == null) ? 0 : getBeginOffset().hashCode());
        hashCode = prime * hashCode + ((getEndOffset() == null) ? 0 : getEndOffset().hashCode());
        return hashCode;
    }

    @Override
    public SuggestionHighlight clone() {
        try {
            return (SuggestionHighlight) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.SuggestionHighlightMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
