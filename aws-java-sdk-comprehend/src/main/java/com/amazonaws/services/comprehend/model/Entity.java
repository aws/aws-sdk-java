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
 * Provides information about an entity.
 * </p>
 * <p>
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/Entity" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Entity implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The level of confidence that Amazon Comprehend has in the accuracy of the detection.
     * </p>
     */
    private Float score;
    /**
     * <p>
     * The entity type. For entity detection using the built-in model, this field contains one of the standard entity
     * types listed below.
     * </p>
     * <p>
     * For custom entity detection, this field contains one of the entity types that you specified when you trained your
     * custom model.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The text of the entity.
     * </p>
     */
    private String text;
    /**
     * <p>
     * The zero-based offset from the beginning of the source text to the first character in the entity.
     * </p>
     * <p>
     * This field is empty for non-text input.
     * </p>
     */
    private Integer beginOffset;
    /**
     * <p>
     * The zero-based offset from the beginning of the source text to the last character in the entity.
     * </p>
     * <p>
     * This field is empty for non-text input.
     * </p>
     */
    private Integer endOffset;
    /**
     * <p>
     * A reference to each block for this entity. This field is empty for plain-text input.
     * </p>
     */
    private java.util.List<BlockReference> blockReferences;

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

    public Entity withScore(Float score) {
        setScore(score);
        return this;
    }

    /**
     * <p>
     * The entity type. For entity detection using the built-in model, this field contains one of the standard entity
     * types listed below.
     * </p>
     * <p>
     * For custom entity detection, this field contains one of the entity types that you specified when you trained your
     * custom model.
     * </p>
     * 
     * @param type
     *        The entity type. For entity detection using the built-in model, this field contains one of the standard
     *        entity types listed below.</p>
     *        <p>
     *        For custom entity detection, this field contains one of the entity types that you specified when you
     *        trained your custom model.
     * @see EntityType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The entity type. For entity detection using the built-in model, this field contains one of the standard entity
     * types listed below.
     * </p>
     * <p>
     * For custom entity detection, this field contains one of the entity types that you specified when you trained your
     * custom model.
     * </p>
     * 
     * @return The entity type. For entity detection using the built-in model, this field contains one of the standard
     *         entity types listed below.</p>
     *         <p>
     *         For custom entity detection, this field contains one of the entity types that you specified when you
     *         trained your custom model.
     * @see EntityType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The entity type. For entity detection using the built-in model, this field contains one of the standard entity
     * types listed below.
     * </p>
     * <p>
     * For custom entity detection, this field contains one of the entity types that you specified when you trained your
     * custom model.
     * </p>
     * 
     * @param type
     *        The entity type. For entity detection using the built-in model, this field contains one of the standard
     *        entity types listed below.</p>
     *        <p>
     *        For custom entity detection, this field contains one of the entity types that you specified when you
     *        trained your custom model.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EntityType
     */

    public Entity withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The entity type. For entity detection using the built-in model, this field contains one of the standard entity
     * types listed below.
     * </p>
     * <p>
     * For custom entity detection, this field contains one of the entity types that you specified when you trained your
     * custom model.
     * </p>
     * 
     * @param type
     *        The entity type. For entity detection using the built-in model, this field contains one of the standard
     *        entity types listed below.</p>
     *        <p>
     *        For custom entity detection, this field contains one of the entity types that you specified when you
     *        trained your custom model.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EntityType
     */

    public Entity withType(EntityType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The text of the entity.
     * </p>
     * 
     * @param text
     *        The text of the entity.
     */

    public void setText(String text) {
        this.text = text;
    }

    /**
     * <p>
     * The text of the entity.
     * </p>
     * 
     * @return The text of the entity.
     */

    public String getText() {
        return this.text;
    }

    /**
     * <p>
     * The text of the entity.
     * </p>
     * 
     * @param text
     *        The text of the entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Entity withText(String text) {
        setText(text);
        return this;
    }

    /**
     * <p>
     * The zero-based offset from the beginning of the source text to the first character in the entity.
     * </p>
     * <p>
     * This field is empty for non-text input.
     * </p>
     * 
     * @param beginOffset
     *        The zero-based offset from the beginning of the source text to the first character in the entity.</p>
     *        <p>
     *        This field is empty for non-text input.
     */

    public void setBeginOffset(Integer beginOffset) {
        this.beginOffset = beginOffset;
    }

    /**
     * <p>
     * The zero-based offset from the beginning of the source text to the first character in the entity.
     * </p>
     * <p>
     * This field is empty for non-text input.
     * </p>
     * 
     * @return The zero-based offset from the beginning of the source text to the first character in the entity.</p>
     *         <p>
     *         This field is empty for non-text input.
     */

    public Integer getBeginOffset() {
        return this.beginOffset;
    }

    /**
     * <p>
     * The zero-based offset from the beginning of the source text to the first character in the entity.
     * </p>
     * <p>
     * This field is empty for non-text input.
     * </p>
     * 
     * @param beginOffset
     *        The zero-based offset from the beginning of the source text to the first character in the entity.</p>
     *        <p>
     *        This field is empty for non-text input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Entity withBeginOffset(Integer beginOffset) {
        setBeginOffset(beginOffset);
        return this;
    }

    /**
     * <p>
     * The zero-based offset from the beginning of the source text to the last character in the entity.
     * </p>
     * <p>
     * This field is empty for non-text input.
     * </p>
     * 
     * @param endOffset
     *        The zero-based offset from the beginning of the source text to the last character in the entity.</p>
     *        <p>
     *        This field is empty for non-text input.
     */

    public void setEndOffset(Integer endOffset) {
        this.endOffset = endOffset;
    }

    /**
     * <p>
     * The zero-based offset from the beginning of the source text to the last character in the entity.
     * </p>
     * <p>
     * This field is empty for non-text input.
     * </p>
     * 
     * @return The zero-based offset from the beginning of the source text to the last character in the entity.</p>
     *         <p>
     *         This field is empty for non-text input.
     */

    public Integer getEndOffset() {
        return this.endOffset;
    }

    /**
     * <p>
     * The zero-based offset from the beginning of the source text to the last character in the entity.
     * </p>
     * <p>
     * This field is empty for non-text input.
     * </p>
     * 
     * @param endOffset
     *        The zero-based offset from the beginning of the source text to the last character in the entity.</p>
     *        <p>
     *        This field is empty for non-text input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Entity withEndOffset(Integer endOffset) {
        setEndOffset(endOffset);
        return this;
    }

    /**
     * <p>
     * A reference to each block for this entity. This field is empty for plain-text input.
     * </p>
     * 
     * @return A reference to each block for this entity. This field is empty for plain-text input.
     */

    public java.util.List<BlockReference> getBlockReferences() {
        return blockReferences;
    }

    /**
     * <p>
     * A reference to each block for this entity. This field is empty for plain-text input.
     * </p>
     * 
     * @param blockReferences
     *        A reference to each block for this entity. This field is empty for plain-text input.
     */

    public void setBlockReferences(java.util.Collection<BlockReference> blockReferences) {
        if (blockReferences == null) {
            this.blockReferences = null;
            return;
        }

        this.blockReferences = new java.util.ArrayList<BlockReference>(blockReferences);
    }

    /**
     * <p>
     * A reference to each block for this entity. This field is empty for plain-text input.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBlockReferences(java.util.Collection)} or {@link #withBlockReferences(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param blockReferences
     *        A reference to each block for this entity. This field is empty for plain-text input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Entity withBlockReferences(BlockReference... blockReferences) {
        if (this.blockReferences == null) {
            setBlockReferences(new java.util.ArrayList<BlockReference>(blockReferences.length));
        }
        for (BlockReference ele : blockReferences) {
            this.blockReferences.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A reference to each block for this entity. This field is empty for plain-text input.
     * </p>
     * 
     * @param blockReferences
     *        A reference to each block for this entity. This field is empty for plain-text input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Entity withBlockReferences(java.util.Collection<BlockReference> blockReferences) {
        setBlockReferences(blockReferences);
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
        if (getText() != null)
            sb.append("Text: ").append(getText()).append(",");
        if (getBeginOffset() != null)
            sb.append("BeginOffset: ").append(getBeginOffset()).append(",");
        if (getEndOffset() != null)
            sb.append("EndOffset: ").append(getEndOffset()).append(",");
        if (getBlockReferences() != null)
            sb.append("BlockReferences: ").append(getBlockReferences());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Entity == false)
            return false;
        Entity other = (Entity) obj;
        if (other.getScore() == null ^ this.getScore() == null)
            return false;
        if (other.getScore() != null && other.getScore().equals(this.getScore()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
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
        if (other.getBlockReferences() == null ^ this.getBlockReferences() == null)
            return false;
        if (other.getBlockReferences() != null && other.getBlockReferences().equals(this.getBlockReferences()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScore() == null) ? 0 : getScore().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getText() == null) ? 0 : getText().hashCode());
        hashCode = prime * hashCode + ((getBeginOffset() == null) ? 0 : getBeginOffset().hashCode());
        hashCode = prime * hashCode + ((getEndOffset() == null) ? 0 : getEndOffset().hashCode());
        hashCode = prime * hashCode + ((getBlockReferences() == null) ? 0 : getBlockReferences().hashCode());
        return hashCode;
    }

    @Override
    public Entity clone() {
        try {
            return (Entity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.comprehend.model.transform.EntityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
