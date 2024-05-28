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
package com.amazonaws.services.qbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about a text extract in a chat response that can be attributed to a source document.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/TextSegment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TextSegment implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The zero-based location in the response string where the source attribution starts.
     * </p>
     */
    private Integer beginOffset;
    /**
     * <p>
     * The zero-based location in the response string where the source attribution ends.
     * </p>
     */
    private Integer endOffset;
    /**
     * <p>
     * The relevant text excerpt from a source that was used to generate a citation text segment in an Amazon Q Business
     * chat response.
     * </p>
     */
    private SnippetExcerpt snippetExcerpt;

    /**
     * <p>
     * The zero-based location in the response string where the source attribution starts.
     * </p>
     * 
     * @param beginOffset
     *        The zero-based location in the response string where the source attribution starts.
     */

    public void setBeginOffset(Integer beginOffset) {
        this.beginOffset = beginOffset;
    }

    /**
     * <p>
     * The zero-based location in the response string where the source attribution starts.
     * </p>
     * 
     * @return The zero-based location in the response string where the source attribution starts.
     */

    public Integer getBeginOffset() {
        return this.beginOffset;
    }

    /**
     * <p>
     * The zero-based location in the response string where the source attribution starts.
     * </p>
     * 
     * @param beginOffset
     *        The zero-based location in the response string where the source attribution starts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TextSegment withBeginOffset(Integer beginOffset) {
        setBeginOffset(beginOffset);
        return this;
    }

    /**
     * <p>
     * The zero-based location in the response string where the source attribution ends.
     * </p>
     * 
     * @param endOffset
     *        The zero-based location in the response string where the source attribution ends.
     */

    public void setEndOffset(Integer endOffset) {
        this.endOffset = endOffset;
    }

    /**
     * <p>
     * The zero-based location in the response string where the source attribution ends.
     * </p>
     * 
     * @return The zero-based location in the response string where the source attribution ends.
     */

    public Integer getEndOffset() {
        return this.endOffset;
    }

    /**
     * <p>
     * The zero-based location in the response string where the source attribution ends.
     * </p>
     * 
     * @param endOffset
     *        The zero-based location in the response string where the source attribution ends.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TextSegment withEndOffset(Integer endOffset) {
        setEndOffset(endOffset);
        return this;
    }

    /**
     * <p>
     * The relevant text excerpt from a source that was used to generate a citation text segment in an Amazon Q Business
     * chat response.
     * </p>
     * 
     * @param snippetExcerpt
     *        The relevant text excerpt from a source that was used to generate a citation text segment in an Amazon Q
     *        Business chat response.
     */

    public void setSnippetExcerpt(SnippetExcerpt snippetExcerpt) {
        this.snippetExcerpt = snippetExcerpt;
    }

    /**
     * <p>
     * The relevant text excerpt from a source that was used to generate a citation text segment in an Amazon Q Business
     * chat response.
     * </p>
     * 
     * @return The relevant text excerpt from a source that was used to generate a citation text segment in an Amazon Q
     *         Business chat response.
     */

    public SnippetExcerpt getSnippetExcerpt() {
        return this.snippetExcerpt;
    }

    /**
     * <p>
     * The relevant text excerpt from a source that was used to generate a citation text segment in an Amazon Q Business
     * chat response.
     * </p>
     * 
     * @param snippetExcerpt
     *        The relevant text excerpt from a source that was used to generate a citation text segment in an Amazon Q
     *        Business chat response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TextSegment withSnippetExcerpt(SnippetExcerpt snippetExcerpt) {
        setSnippetExcerpt(snippetExcerpt);
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
            sb.append("EndOffset: ").append(getEndOffset()).append(",");
        if (getSnippetExcerpt() != null)
            sb.append("SnippetExcerpt: ").append(getSnippetExcerpt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TextSegment == false)
            return false;
        TextSegment other = (TextSegment) obj;
        if (other.getBeginOffset() == null ^ this.getBeginOffset() == null)
            return false;
        if (other.getBeginOffset() != null && other.getBeginOffset().equals(this.getBeginOffset()) == false)
            return false;
        if (other.getEndOffset() == null ^ this.getEndOffset() == null)
            return false;
        if (other.getEndOffset() != null && other.getEndOffset().equals(this.getEndOffset()) == false)
            return false;
        if (other.getSnippetExcerpt() == null ^ this.getSnippetExcerpt() == null)
            return false;
        if (other.getSnippetExcerpt() != null && other.getSnippetExcerpt().equals(this.getSnippetExcerpt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBeginOffset() == null) ? 0 : getBeginOffset().hashCode());
        hashCode = prime * hashCode + ((getEndOffset() == null) ? 0 : getEndOffset().hashCode());
        hashCode = prime * hashCode + ((getSnippetExcerpt() == null) ? 0 : getSnippetExcerpt().hashCode());
        return hashCode;
    }

    @Override
    public TextSegment clone() {
        try {
            return (TextSegment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.qbusiness.model.transform.TextSegmentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
