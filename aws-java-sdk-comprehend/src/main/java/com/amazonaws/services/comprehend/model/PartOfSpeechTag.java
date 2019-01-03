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
 * Identifies the part of speech represented by the token and gives the confidence that Amazon Comprehend has that the
 * part of speech was correctly identified. For more information about the parts of speech that Amazon Comprehend can
 * identify, see <a>how-syntax</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/PartOfSpeechTag" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PartOfSpeechTag implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Identifies the part of speech that the token represents.
     * </p>
     */
    private String tag;
    /**
     * <p>
     * The confidence that Amazon Comprehend has that the part of speech was correctly identified.
     * </p>
     */
    private Float score;

    /**
     * <p>
     * Identifies the part of speech that the token represents.
     * </p>
     * 
     * @param tag
     *        Identifies the part of speech that the token represents.
     * @see PartOfSpeechTagType
     */

    public void setTag(String tag) {
        this.tag = tag;
    }

    /**
     * <p>
     * Identifies the part of speech that the token represents.
     * </p>
     * 
     * @return Identifies the part of speech that the token represents.
     * @see PartOfSpeechTagType
     */

    public String getTag() {
        return this.tag;
    }

    /**
     * <p>
     * Identifies the part of speech that the token represents.
     * </p>
     * 
     * @param tag
     *        Identifies the part of speech that the token represents.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PartOfSpeechTagType
     */

    public PartOfSpeechTag withTag(String tag) {
        setTag(tag);
        return this;
    }

    /**
     * <p>
     * Identifies the part of speech that the token represents.
     * </p>
     * 
     * @param tag
     *        Identifies the part of speech that the token represents.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PartOfSpeechTagType
     */

    public PartOfSpeechTag withTag(PartOfSpeechTagType tag) {
        this.tag = tag.toString();
        return this;
    }

    /**
     * <p>
     * The confidence that Amazon Comprehend has that the part of speech was correctly identified.
     * </p>
     * 
     * @param score
     *        The confidence that Amazon Comprehend has that the part of speech was correctly identified.
     */

    public void setScore(Float score) {
        this.score = score;
    }

    /**
     * <p>
     * The confidence that Amazon Comprehend has that the part of speech was correctly identified.
     * </p>
     * 
     * @return The confidence that Amazon Comprehend has that the part of speech was correctly identified.
     */

    public Float getScore() {
        return this.score;
    }

    /**
     * <p>
     * The confidence that Amazon Comprehend has that the part of speech was correctly identified.
     * </p>
     * 
     * @param score
     *        The confidence that Amazon Comprehend has that the part of speech was correctly identified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PartOfSpeechTag withScore(Float score) {
        setScore(score);
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
        if (getTag() != null)
            sb.append("Tag: ").append(getTag()).append(",");
        if (getScore() != null)
            sb.append("Score: ").append(getScore());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PartOfSpeechTag == false)
            return false;
        PartOfSpeechTag other = (PartOfSpeechTag) obj;
        if (other.getTag() == null ^ this.getTag() == null)
            return false;
        if (other.getTag() != null && other.getTag().equals(this.getTag()) == false)
            return false;
        if (other.getScore() == null ^ this.getScore() == null)
            return false;
        if (other.getScore() != null && other.getScore().equals(this.getScore()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTag() == null) ? 0 : getTag().hashCode());
        hashCode = prime * hashCode + ((getScore() == null) ? 0 : getScore().hashCode());
        return hashCode;
    }

    @Override
    public PartOfSpeechTag clone() {
        try {
            return (PartOfSpeechTag) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.comprehend.model.transform.PartOfSpeechTagMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
