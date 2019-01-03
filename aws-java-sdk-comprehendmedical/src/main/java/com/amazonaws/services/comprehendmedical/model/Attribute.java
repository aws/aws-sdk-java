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
package com.amazonaws.services.comprehendmedical.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An extracted segment of the text that is an attribute of an entity, or otherwise related to an entity, such as the
 * dosage of a medication taken. It contains information about the attribute such as id, begin and end offset within the
 * input text, and the segment of the input text.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehendmedical-2018-10-30/Attribute" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Attribute implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of attribute.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The level of confidence that Comprehend Medical has that the segment of text is correctly recognized as an
     * attribute.
     * </p>
     */
    private Float score;
    /**
     * <p>
     * The level of confidence that Comprehend Medical has that this attribute is correctly related to this entity.
     * </p>
     */
    private Float relationshipScore;
    /**
     * <p>
     * The numeric identifier for this attribute. This is a monotonically increasing id unique within this response
     * rather than a global unique identifier.
     * </p>
     */
    private Integer id;
    /**
     * <p>
     * The 0-based character offset in the input text that shows where the attribute begins. The offset returns the
     * UTF-8 code point in the string.
     * </p>
     */
    private Integer beginOffset;
    /**
     * <p>
     * The 0-based character offset in the input text that shows where the attribute ends. The offset returns the UTF-8
     * code point in the string.
     * </p>
     */
    private Integer endOffset;
    /**
     * <p>
     * The segment of input text extracted as this attribute.
     * </p>
     */
    private String text;
    /**
     * <p>
     * Contextual information for this attribute.
     * </p>
     */
    private java.util.List<Trait> traits;

    /**
     * <p>
     * The type of attribute.
     * </p>
     * 
     * @param type
     *        The type of attribute.
     * @see EntitySubType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of attribute.
     * </p>
     * 
     * @return The type of attribute.
     * @see EntitySubType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of attribute.
     * </p>
     * 
     * @param type
     *        The type of attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EntitySubType
     */

    public Attribute withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of attribute.
     * </p>
     * 
     * @param type
     *        The type of attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EntitySubType
     */

    public Attribute withType(EntitySubType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The level of confidence that Comprehend Medical has that the segment of text is correctly recognized as an
     * attribute.
     * </p>
     * 
     * @param score
     *        The level of confidence that Comprehend Medical has that the segment of text is correctly recognized as an
     *        attribute.
     */

    public void setScore(Float score) {
        this.score = score;
    }

    /**
     * <p>
     * The level of confidence that Comprehend Medical has that the segment of text is correctly recognized as an
     * attribute.
     * </p>
     * 
     * @return The level of confidence that Comprehend Medical has that the segment of text is correctly recognized as
     *         an attribute.
     */

    public Float getScore() {
        return this.score;
    }

    /**
     * <p>
     * The level of confidence that Comprehend Medical has that the segment of text is correctly recognized as an
     * attribute.
     * </p>
     * 
     * @param score
     *        The level of confidence that Comprehend Medical has that the segment of text is correctly recognized as an
     *        attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Attribute withScore(Float score) {
        setScore(score);
        return this;
    }

    /**
     * <p>
     * The level of confidence that Comprehend Medical has that this attribute is correctly related to this entity.
     * </p>
     * 
     * @param relationshipScore
     *        The level of confidence that Comprehend Medical has that this attribute is correctly related to this
     *        entity.
     */

    public void setRelationshipScore(Float relationshipScore) {
        this.relationshipScore = relationshipScore;
    }

    /**
     * <p>
     * The level of confidence that Comprehend Medical has that this attribute is correctly related to this entity.
     * </p>
     * 
     * @return The level of confidence that Comprehend Medical has that this attribute is correctly related to this
     *         entity.
     */

    public Float getRelationshipScore() {
        return this.relationshipScore;
    }

    /**
     * <p>
     * The level of confidence that Comprehend Medical has that this attribute is correctly related to this entity.
     * </p>
     * 
     * @param relationshipScore
     *        The level of confidence that Comprehend Medical has that this attribute is correctly related to this
     *        entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Attribute withRelationshipScore(Float relationshipScore) {
        setRelationshipScore(relationshipScore);
        return this;
    }

    /**
     * <p>
     * The numeric identifier for this attribute. This is a monotonically increasing id unique within this response
     * rather than a global unique identifier.
     * </p>
     * 
     * @param id
     *        The numeric identifier for this attribute. This is a monotonically increasing id unique within this
     *        response rather than a global unique identifier.
     */

    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * <p>
     * The numeric identifier for this attribute. This is a monotonically increasing id unique within this response
     * rather than a global unique identifier.
     * </p>
     * 
     * @return The numeric identifier for this attribute. This is a monotonically increasing id unique within this
     *         response rather than a global unique identifier.
     */

    public Integer getId() {
        return this.id;
    }

    /**
     * <p>
     * The numeric identifier for this attribute. This is a monotonically increasing id unique within this response
     * rather than a global unique identifier.
     * </p>
     * 
     * @param id
     *        The numeric identifier for this attribute. This is a monotonically increasing id unique within this
     *        response rather than a global unique identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Attribute withId(Integer id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The 0-based character offset in the input text that shows where the attribute begins. The offset returns the
     * UTF-8 code point in the string.
     * </p>
     * 
     * @param beginOffset
     *        The 0-based character offset in the input text that shows where the attribute begins. The offset returns
     *        the UTF-8 code point in the string.
     */

    public void setBeginOffset(Integer beginOffset) {
        this.beginOffset = beginOffset;
    }

    /**
     * <p>
     * The 0-based character offset in the input text that shows where the attribute begins. The offset returns the
     * UTF-8 code point in the string.
     * </p>
     * 
     * @return The 0-based character offset in the input text that shows where the attribute begins. The offset returns
     *         the UTF-8 code point in the string.
     */

    public Integer getBeginOffset() {
        return this.beginOffset;
    }

    /**
     * <p>
     * The 0-based character offset in the input text that shows where the attribute begins. The offset returns the
     * UTF-8 code point in the string.
     * </p>
     * 
     * @param beginOffset
     *        The 0-based character offset in the input text that shows where the attribute begins. The offset returns
     *        the UTF-8 code point in the string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Attribute withBeginOffset(Integer beginOffset) {
        setBeginOffset(beginOffset);
        return this;
    }

    /**
     * <p>
     * The 0-based character offset in the input text that shows where the attribute ends. The offset returns the UTF-8
     * code point in the string.
     * </p>
     * 
     * @param endOffset
     *        The 0-based character offset in the input text that shows where the attribute ends. The offset returns the
     *        UTF-8 code point in the string.
     */

    public void setEndOffset(Integer endOffset) {
        this.endOffset = endOffset;
    }

    /**
     * <p>
     * The 0-based character offset in the input text that shows where the attribute ends. The offset returns the UTF-8
     * code point in the string.
     * </p>
     * 
     * @return The 0-based character offset in the input text that shows where the attribute ends. The offset returns
     *         the UTF-8 code point in the string.
     */

    public Integer getEndOffset() {
        return this.endOffset;
    }

    /**
     * <p>
     * The 0-based character offset in the input text that shows where the attribute ends. The offset returns the UTF-8
     * code point in the string.
     * </p>
     * 
     * @param endOffset
     *        The 0-based character offset in the input text that shows where the attribute ends. The offset returns the
     *        UTF-8 code point in the string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Attribute withEndOffset(Integer endOffset) {
        setEndOffset(endOffset);
        return this;
    }

    /**
     * <p>
     * The segment of input text extracted as this attribute.
     * </p>
     * 
     * @param text
     *        The segment of input text extracted as this attribute.
     */

    public void setText(String text) {
        this.text = text;
    }

    /**
     * <p>
     * The segment of input text extracted as this attribute.
     * </p>
     * 
     * @return The segment of input text extracted as this attribute.
     */

    public String getText() {
        return this.text;
    }

    /**
     * <p>
     * The segment of input text extracted as this attribute.
     * </p>
     * 
     * @param text
     *        The segment of input text extracted as this attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Attribute withText(String text) {
        setText(text);
        return this;
    }

    /**
     * <p>
     * Contextual information for this attribute.
     * </p>
     * 
     * @return Contextual information for this attribute.
     */

    public java.util.List<Trait> getTraits() {
        return traits;
    }

    /**
     * <p>
     * Contextual information for this attribute.
     * </p>
     * 
     * @param traits
     *        Contextual information for this attribute.
     */

    public void setTraits(java.util.Collection<Trait> traits) {
        if (traits == null) {
            this.traits = null;
            return;
        }

        this.traits = new java.util.ArrayList<Trait>(traits);
    }

    /**
     * <p>
     * Contextual information for this attribute.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTraits(java.util.Collection)} or {@link #withTraits(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param traits
     *        Contextual information for this attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Attribute withTraits(Trait... traits) {
        if (this.traits == null) {
            setTraits(new java.util.ArrayList<Trait>(traits.length));
        }
        for (Trait ele : traits) {
            this.traits.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contextual information for this attribute.
     * </p>
     * 
     * @param traits
     *        Contextual information for this attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Attribute withTraits(java.util.Collection<Trait> traits) {
        setTraits(traits);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getScore() != null)
            sb.append("Score: ").append(getScore()).append(",");
        if (getRelationshipScore() != null)
            sb.append("RelationshipScore: ").append(getRelationshipScore()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getBeginOffset() != null)
            sb.append("BeginOffset: ").append(getBeginOffset()).append(",");
        if (getEndOffset() != null)
            sb.append("EndOffset: ").append(getEndOffset()).append(",");
        if (getText() != null)
            sb.append("Text: ").append(getText()).append(",");
        if (getTraits() != null)
            sb.append("Traits: ").append(getTraits());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Attribute == false)
            return false;
        Attribute other = (Attribute) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getScore() == null ^ this.getScore() == null)
            return false;
        if (other.getScore() != null && other.getScore().equals(this.getScore()) == false)
            return false;
        if (other.getRelationshipScore() == null ^ this.getRelationshipScore() == null)
            return false;
        if (other.getRelationshipScore() != null && other.getRelationshipScore().equals(this.getRelationshipScore()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getBeginOffset() == null ^ this.getBeginOffset() == null)
            return false;
        if (other.getBeginOffset() != null && other.getBeginOffset().equals(this.getBeginOffset()) == false)
            return false;
        if (other.getEndOffset() == null ^ this.getEndOffset() == null)
            return false;
        if (other.getEndOffset() != null && other.getEndOffset().equals(this.getEndOffset()) == false)
            return false;
        if (other.getText() == null ^ this.getText() == null)
            return false;
        if (other.getText() != null && other.getText().equals(this.getText()) == false)
            return false;
        if (other.getTraits() == null ^ this.getTraits() == null)
            return false;
        if (other.getTraits() != null && other.getTraits().equals(this.getTraits()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getScore() == null) ? 0 : getScore().hashCode());
        hashCode = prime * hashCode + ((getRelationshipScore() == null) ? 0 : getRelationshipScore().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getBeginOffset() == null) ? 0 : getBeginOffset().hashCode());
        hashCode = prime * hashCode + ((getEndOffset() == null) ? 0 : getEndOffset().hashCode());
        hashCode = prime * hashCode + ((getText() == null) ? 0 : getText().hashCode());
        hashCode = prime * hashCode + ((getTraits() == null) ? 0 : getTraits().hashCode());
        return hashCode;
    }

    @Override
    public Attribute clone() {
        try {
            return (Attribute) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.comprehendmedical.model.transform.AttributeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
