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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about a PII entity.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/PiiEntity" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PiiEntity implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The level of confidence that Amazon Comprehend has in the accuracy of the detection.
     * </p>
     */
    private Float score;
    /**
     * <p>
     * The entity's type.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The zero-based offset from the beginning of the source text to the first character in the entity.
     * </p>
     */
    private Integer beginOffset;
    /**
     * <p>
     * The zero-based offset from the beginning of the source text to the last character in the entity.
     * </p>
     */
    private Integer endOffset;

    /**
     * <p>
     * The level of confidence that Amazon Comprehend has in the accuracy of the detection.
     * </p>
     * 
     * @param score
     *        The level of confidence that Amazon Comprehend has in the accuracy of the detection.
     */

    public void setScore(Float score) {
        this.score = score;
    }

    /**
     * <p>
     * The level of confidence that Amazon Comprehend has in the accuracy of the detection.
     * </p>
     * 
     * @return The level of confidence that Amazon Comprehend has in the accuracy of the detection.
     */

    public Float getScore() {
        return this.score;
    }

    /**
     * <p>
     * The level of confidence that Amazon Comprehend has in the accuracy of the detection.
     * </p>
     * 
     * @param score
     *        The level of confidence that Amazon Comprehend has in the accuracy of the detection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PiiEntity withScore(Float score) {
        setScore(score);
        return this;
    }

    /**
     * <p>
     * The entity's type.
     * </p>
     * 
     * @param type
     *        The entity's type.
     * @see PiiEntityType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The entity's type.
     * </p>
     * 
     * @return The entity's type.
     * @see PiiEntityType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The entity's type.
     * </p>
     * 
     * @param type
     *        The entity's type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PiiEntityType
     */

    public PiiEntity withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The entity's type.
     * </p>
     * 
     * @param type
     *        The entity's type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PiiEntityType
     */

    public PiiEntity withType(PiiEntityType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The zero-based offset from the beginning of the source text to the first character in the entity.
     * </p>
     * 
     * @param beginOffset
     *        The zero-based offset from the beginning of the source text to the first character in the entity.
     */

    public void setBeginOffset(Integer beginOffset) {
        this.beginOffset = beginOffset;
    }

    /**
     * <p>
     * The zero-based offset from the beginning of the source text to the first character in the entity.
     * </p>
     * 
     * @return The zero-based offset from the beginning of the source text to the first character in the entity.
     */

    public Integer getBeginOffset() {
        return this.beginOffset;
    }

    /**
     * <p>
     * The zero-based offset from the beginning of the source text to the first character in the entity.
     * </p>
     * 
     * @param beginOffset
     *        The zero-based offset from the beginning of the source text to the first character in the entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PiiEntity withBeginOffset(Integer beginOffset) {
        setBeginOffset(beginOffset);
        return this;
    }

    /**
     * <p>
     * The zero-based offset from the beginning of the source text to the last character in the entity.
     * </p>
     * 
     * @param endOffset
     *        The zero-based offset from the beginning of the source text to the last character in the entity.
     */

    public void setEndOffset(Integer endOffset) {
        this.endOffset = endOffset;
    }

    /**
     * <p>
     * The zero-based offset from the beginning of the source text to the last character in the entity.
     * </p>
     * 
     * @return The zero-based offset from the beginning of the source text to the last character in the entity.
     */

    public Integer getEndOffset() {
        return this.endOffset;
    }

    /**
     * <p>
     * The zero-based offset from the beginning of the source text to the last character in the entity.
     * </p>
     * 
     * @param endOffset
     *        The zero-based offset from the beginning of the source text to the last character in the entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PiiEntity withEndOffset(Integer endOffset) {
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
        if (getScore() != null)
            sb.append("Score: ").append(getScore()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
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

        if (obj instanceof PiiEntity == false)
            return false;
        PiiEntity other = (PiiEntity) obj;
        if (other.getScore() == null ^ this.getScore() == null)
            return false;
        if (other.getScore() != null && other.getScore().equals(this.getScore()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getScore() == null) ? 0 : getScore().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getBeginOffset() == null) ? 0 : getBeginOffset().hashCode());
        hashCode = prime * hashCode + ((getEndOffset() == null) ? 0 : getEndOffset().hashCode());
        return hashCode;
    }

    @Override
    public PiiEntity clone() {
        try {
            return (PiiEntity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.comprehend.model.transform.PiiEntityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
