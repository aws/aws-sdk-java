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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents a work in the input text that was recognized and assigned a part of speech. There is one syntax token
 * record for each word in the source text.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/SyntaxToken" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SyntaxToken implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique identifier for a token.
     * </p>
     */
    private Integer tokenId;
    /**
     * <p>
     * The word that was recognized in the source text.
     * </p>
     */
    private String text;
    /**
     * <p>
     * The zero-based offset from the beginning of the source text to the first character in the word.
     * </p>
     */
    private Integer beginOffset;
    /**
     * <p>
     * The zero-based offset from the beginning of the source text to the last character in the word.
     * </p>
     */
    private Integer endOffset;
    /**
     * <p>
     * Provides the part of speech label and the confidence level that Amazon Comprehend has that the part of speech was
     * correctly identified. For more information, see <a>how-syntax</a>.
     * </p>
     */
    private PartOfSpeechTag partOfSpeech;

    /**
     * <p>
     * A unique identifier for a token.
     * </p>
     * 
     * @param tokenId
     *        A unique identifier for a token.
     */

    public void setTokenId(Integer tokenId) {
        this.tokenId = tokenId;
    }

    /**
     * <p>
     * A unique identifier for a token.
     * </p>
     * 
     * @return A unique identifier for a token.
     */

    public Integer getTokenId() {
        return this.tokenId;
    }

    /**
     * <p>
     * A unique identifier for a token.
     * </p>
     * 
     * @param tokenId
     *        A unique identifier for a token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SyntaxToken withTokenId(Integer tokenId) {
        setTokenId(tokenId);
        return this;
    }

    /**
     * <p>
     * The word that was recognized in the source text.
     * </p>
     * 
     * @param text
     *        The word that was recognized in the source text.
     */

    public void setText(String text) {
        this.text = text;
    }

    /**
     * <p>
     * The word that was recognized in the source text.
     * </p>
     * 
     * @return The word that was recognized in the source text.
     */

    public String getText() {
        return this.text;
    }

    /**
     * <p>
     * The word that was recognized in the source text.
     * </p>
     * 
     * @param text
     *        The word that was recognized in the source text.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SyntaxToken withText(String text) {
        setText(text);
        return this;
    }

    /**
     * <p>
     * The zero-based offset from the beginning of the source text to the first character in the word.
     * </p>
     * 
     * @param beginOffset
     *        The zero-based offset from the beginning of the source text to the first character in the word.
     */

    public void setBeginOffset(Integer beginOffset) {
        this.beginOffset = beginOffset;
    }

    /**
     * <p>
     * The zero-based offset from the beginning of the source text to the first character in the word.
     * </p>
     * 
     * @return The zero-based offset from the beginning of the source text to the first character in the word.
     */

    public Integer getBeginOffset() {
        return this.beginOffset;
    }

    /**
     * <p>
     * The zero-based offset from the beginning of the source text to the first character in the word.
     * </p>
     * 
     * @param beginOffset
     *        The zero-based offset from the beginning of the source text to the first character in the word.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SyntaxToken withBeginOffset(Integer beginOffset) {
        setBeginOffset(beginOffset);
        return this;
    }

    /**
     * <p>
     * The zero-based offset from the beginning of the source text to the last character in the word.
     * </p>
     * 
     * @param endOffset
     *        The zero-based offset from the beginning of the source text to the last character in the word.
     */

    public void setEndOffset(Integer endOffset) {
        this.endOffset = endOffset;
    }

    /**
     * <p>
     * The zero-based offset from the beginning of the source text to the last character in the word.
     * </p>
     * 
     * @return The zero-based offset from the beginning of the source text to the last character in the word.
     */

    public Integer getEndOffset() {
        return this.endOffset;
    }

    /**
     * <p>
     * The zero-based offset from the beginning of the source text to the last character in the word.
     * </p>
     * 
     * @param endOffset
     *        The zero-based offset from the beginning of the source text to the last character in the word.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SyntaxToken withEndOffset(Integer endOffset) {
        setEndOffset(endOffset);
        return this;
    }

    /**
     * <p>
     * Provides the part of speech label and the confidence level that Amazon Comprehend has that the part of speech was
     * correctly identified. For more information, see <a>how-syntax</a>.
     * </p>
     * 
     * @param partOfSpeech
     *        Provides the part of speech label and the confidence level that Amazon Comprehend has that the part of
     *        speech was correctly identified. For more information, see <a>how-syntax</a>.
     */

    public void setPartOfSpeech(PartOfSpeechTag partOfSpeech) {
        this.partOfSpeech = partOfSpeech;
    }

    /**
     * <p>
     * Provides the part of speech label and the confidence level that Amazon Comprehend has that the part of speech was
     * correctly identified. For more information, see <a>how-syntax</a>.
     * </p>
     * 
     * @return Provides the part of speech label and the confidence level that Amazon Comprehend has that the part of
     *         speech was correctly identified. For more information, see <a>how-syntax</a>.
     */

    public PartOfSpeechTag getPartOfSpeech() {
        return this.partOfSpeech;
    }

    /**
     * <p>
     * Provides the part of speech label and the confidence level that Amazon Comprehend has that the part of speech was
     * correctly identified. For more information, see <a>how-syntax</a>.
     * </p>
     * 
     * @param partOfSpeech
     *        Provides the part of speech label and the confidence level that Amazon Comprehend has that the part of
     *        speech was correctly identified. For more information, see <a>how-syntax</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SyntaxToken withPartOfSpeech(PartOfSpeechTag partOfSpeech) {
        setPartOfSpeech(partOfSpeech);
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
        if (getTokenId() != null)
            sb.append("TokenId: ").append(getTokenId()).append(",");
        if (getText() != null)
            sb.append("Text: ").append(getText()).append(",");
        if (getBeginOffset() != null)
            sb.append("BeginOffset: ").append(getBeginOffset()).append(",");
        if (getEndOffset() != null)
            sb.append("EndOffset: ").append(getEndOffset()).append(",");
        if (getPartOfSpeech() != null)
            sb.append("PartOfSpeech: ").append(getPartOfSpeech());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SyntaxToken == false)
            return false;
        SyntaxToken other = (SyntaxToken) obj;
        if (other.getTokenId() == null ^ this.getTokenId() == null)
            return false;
        if (other.getTokenId() != null && other.getTokenId().equals(this.getTokenId()) == false)
            return false;
        if (other.getText() == null ^ this.getText() == null)
            return false;
        if (other.getText() != null && other.getText().equals(this.getText()) == false)
            return false;
        if (other.getBeginOffset() == null ^ this.getBeginOffset() == null)
            return false;
        if (other.getBeginOffset() != null && other.getBeginOffset().equals(this.getBeginOffset()) == false)
            return false;
        if (other.getEndOffset() == null ^ this.getEndOffset() == null)
            return false;
        if (other.getEndOffset() != null && other.getEndOffset().equals(this.getEndOffset()) == false)
            return false;
        if (other.getPartOfSpeech() == null ^ this.getPartOfSpeech() == null)
            return false;
        if (other.getPartOfSpeech() != null && other.getPartOfSpeech().equals(this.getPartOfSpeech()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTokenId() == null) ? 0 : getTokenId().hashCode());
        hashCode = prime * hashCode + ((getText() == null) ? 0 : getText().hashCode());
        hashCode = prime * hashCode + ((getBeginOffset() == null) ? 0 : getBeginOffset().hashCode());
        hashCode = prime * hashCode + ((getEndOffset() == null) ? 0 : getEndOffset().hashCode());
        hashCode = prime * hashCode + ((getPartOfSpeech() == null) ? 0 : getPartOfSpeech().hashCode());
        return hashCode;
    }

    @Override
    public SyntaxToken clone() {
        try {
            return (SyntaxToken) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.comprehend.model.transform.SyntaxTokenMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
