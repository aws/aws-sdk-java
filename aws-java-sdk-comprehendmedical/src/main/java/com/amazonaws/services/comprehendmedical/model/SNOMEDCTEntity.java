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
package com.amazonaws.services.comprehendmedical.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The collection of medical entities extracted from the input text and their associated information. For each entity,
 * the response provides the entity text, the entity category, where the entity text begins and ends, and the level of
 * confidence that Comprehend Medical has in the detection and analysis. Attributes and traits of the entity are also
 * returned.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehendmedical-2018-10-30/SNOMEDCTEntity" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SNOMEDCTEntity implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The numeric identifier for the entity. This is a monotonically increasing id unique within this response rather
     * than a global unique identifier.
     * </p>
     */
    private Integer id;
    /**
     * <p>
     * The segment of input text extracted as this entity.
     * </p>
     */
    private String text;
    /**
     * <p>
     * The category of the detected entity. Possible categories are MEDICAL_CONDITION, ANATOMY, or
     * TEST_TREATMENT_PROCEDURE.
     * </p>
     */
    private String category;
    /**
     * <p>
     * Describes the specific type of entity with category of entities. Possible types include DX_NAME, ACUITY,
     * DIRECTION, SYSTEM_ORGAN_SITE, TEST_NAME, TEST_VALUE, TEST_UNIT, PROCEDURE_NAME, or TREATMENT_NAME.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The level of confidence that Comprehend Medical has in the accuracy of the detected entity.
     * </p>
     */
    private Float score;
    /**
     * <p>
     * The 0-based character offset in the input text that shows where the entity begins. The offset returns the UTF-8
     * code point in the string.
     * </p>
     */
    private Integer beginOffset;
    /**
     * <p>
     * The 0-based character offset in the input text that shows where the entity ends. The offset returns the UTF-8
     * code point in the string.
     * </p>
     */
    private Integer endOffset;
    /**
     * <p>
     * An extracted segment of the text that is an attribute of an entity, or otherwise related to an entity, such as
     * the dosage of a medication taken.
     * </p>
     */
    private java.util.List<SNOMEDCTAttribute> attributes;
    /**
     * <p>
     * Contextual information for the entity.
     * </p>
     */
    private java.util.List<SNOMEDCTTrait> traits;
    /**
     * <p>
     * The SNOMED concepts that the entity could refer to, along with a score indicating the likelihood of the match.
     * </p>
     */
    private java.util.List<SNOMEDCTConcept> sNOMEDCTConcepts;

    /**
     * <p>
     * The numeric identifier for the entity. This is a monotonically increasing id unique within this response rather
     * than a global unique identifier.
     * </p>
     * 
     * @param id
     *        The numeric identifier for the entity. This is a monotonically increasing id unique within this response
     *        rather than a global unique identifier.
     */

    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * <p>
     * The numeric identifier for the entity. This is a monotonically increasing id unique within this response rather
     * than a global unique identifier.
     * </p>
     * 
     * @return The numeric identifier for the entity. This is a monotonically increasing id unique within this response
     *         rather than a global unique identifier.
     */

    public Integer getId() {
        return this.id;
    }

    /**
     * <p>
     * The numeric identifier for the entity. This is a monotonically increasing id unique within this response rather
     * than a global unique identifier.
     * </p>
     * 
     * @param id
     *        The numeric identifier for the entity. This is a monotonically increasing id unique within this response
     *        rather than a global unique identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SNOMEDCTEntity withId(Integer id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The segment of input text extracted as this entity.
     * </p>
     * 
     * @param text
     *        The segment of input text extracted as this entity.
     */

    public void setText(String text) {
        this.text = text;
    }

    /**
     * <p>
     * The segment of input text extracted as this entity.
     * </p>
     * 
     * @return The segment of input text extracted as this entity.
     */

    public String getText() {
        return this.text;
    }

    /**
     * <p>
     * The segment of input text extracted as this entity.
     * </p>
     * 
     * @param text
     *        The segment of input text extracted as this entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SNOMEDCTEntity withText(String text) {
        setText(text);
        return this;
    }

    /**
     * <p>
     * The category of the detected entity. Possible categories are MEDICAL_CONDITION, ANATOMY, or
     * TEST_TREATMENT_PROCEDURE.
     * </p>
     * 
     * @param category
     *        The category of the detected entity. Possible categories are MEDICAL_CONDITION, ANATOMY, or
     *        TEST_TREATMENT_PROCEDURE.
     * @see SNOMEDCTEntityCategory
     */

    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * <p>
     * The category of the detected entity. Possible categories are MEDICAL_CONDITION, ANATOMY, or
     * TEST_TREATMENT_PROCEDURE.
     * </p>
     * 
     * @return The category of the detected entity. Possible categories are MEDICAL_CONDITION, ANATOMY, or
     *         TEST_TREATMENT_PROCEDURE.
     * @see SNOMEDCTEntityCategory
     */

    public String getCategory() {
        return this.category;
    }

    /**
     * <p>
     * The category of the detected entity. Possible categories are MEDICAL_CONDITION, ANATOMY, or
     * TEST_TREATMENT_PROCEDURE.
     * </p>
     * 
     * @param category
     *        The category of the detected entity. Possible categories are MEDICAL_CONDITION, ANATOMY, or
     *        TEST_TREATMENT_PROCEDURE.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SNOMEDCTEntityCategory
     */

    public SNOMEDCTEntity withCategory(String category) {
        setCategory(category);
        return this;
    }

    /**
     * <p>
     * The category of the detected entity. Possible categories are MEDICAL_CONDITION, ANATOMY, or
     * TEST_TREATMENT_PROCEDURE.
     * </p>
     * 
     * @param category
     *        The category of the detected entity. Possible categories are MEDICAL_CONDITION, ANATOMY, or
     *        TEST_TREATMENT_PROCEDURE.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SNOMEDCTEntityCategory
     */

    public SNOMEDCTEntity withCategory(SNOMEDCTEntityCategory category) {
        this.category = category.toString();
        return this;
    }

    /**
     * <p>
     * Describes the specific type of entity with category of entities. Possible types include DX_NAME, ACUITY,
     * DIRECTION, SYSTEM_ORGAN_SITE, TEST_NAME, TEST_VALUE, TEST_UNIT, PROCEDURE_NAME, or TREATMENT_NAME.
     * </p>
     * 
     * @param type
     *        Describes the specific type of entity with category of entities. Possible types include DX_NAME, ACUITY,
     *        DIRECTION, SYSTEM_ORGAN_SITE, TEST_NAME, TEST_VALUE, TEST_UNIT, PROCEDURE_NAME, or TREATMENT_NAME.
     * @see SNOMEDCTEntityType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Describes the specific type of entity with category of entities. Possible types include DX_NAME, ACUITY,
     * DIRECTION, SYSTEM_ORGAN_SITE, TEST_NAME, TEST_VALUE, TEST_UNIT, PROCEDURE_NAME, or TREATMENT_NAME.
     * </p>
     * 
     * @return Describes the specific type of entity with category of entities. Possible types include DX_NAME, ACUITY,
     *         DIRECTION, SYSTEM_ORGAN_SITE, TEST_NAME, TEST_VALUE, TEST_UNIT, PROCEDURE_NAME, or TREATMENT_NAME.
     * @see SNOMEDCTEntityType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Describes the specific type of entity with category of entities. Possible types include DX_NAME, ACUITY,
     * DIRECTION, SYSTEM_ORGAN_SITE, TEST_NAME, TEST_VALUE, TEST_UNIT, PROCEDURE_NAME, or TREATMENT_NAME.
     * </p>
     * 
     * @param type
     *        Describes the specific type of entity with category of entities. Possible types include DX_NAME, ACUITY,
     *        DIRECTION, SYSTEM_ORGAN_SITE, TEST_NAME, TEST_VALUE, TEST_UNIT, PROCEDURE_NAME, or TREATMENT_NAME.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SNOMEDCTEntityType
     */

    public SNOMEDCTEntity withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Describes the specific type of entity with category of entities. Possible types include DX_NAME, ACUITY,
     * DIRECTION, SYSTEM_ORGAN_SITE, TEST_NAME, TEST_VALUE, TEST_UNIT, PROCEDURE_NAME, or TREATMENT_NAME.
     * </p>
     * 
     * @param type
     *        Describes the specific type of entity with category of entities. Possible types include DX_NAME, ACUITY,
     *        DIRECTION, SYSTEM_ORGAN_SITE, TEST_NAME, TEST_VALUE, TEST_UNIT, PROCEDURE_NAME, or TREATMENT_NAME.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SNOMEDCTEntityType
     */

    public SNOMEDCTEntity withType(SNOMEDCTEntityType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The level of confidence that Comprehend Medical has in the accuracy of the detected entity.
     * </p>
     * 
     * @param score
     *        The level of confidence that Comprehend Medical has in the accuracy of the detected entity.
     */

    public void setScore(Float score) {
        this.score = score;
    }

    /**
     * <p>
     * The level of confidence that Comprehend Medical has in the accuracy of the detected entity.
     * </p>
     * 
     * @return The level of confidence that Comprehend Medical has in the accuracy of the detected entity.
     */

    public Float getScore() {
        return this.score;
    }

    /**
     * <p>
     * The level of confidence that Comprehend Medical has in the accuracy of the detected entity.
     * </p>
     * 
     * @param score
     *        The level of confidence that Comprehend Medical has in the accuracy of the detected entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SNOMEDCTEntity withScore(Float score) {
        setScore(score);
        return this;
    }

    /**
     * <p>
     * The 0-based character offset in the input text that shows where the entity begins. The offset returns the UTF-8
     * code point in the string.
     * </p>
     * 
     * @param beginOffset
     *        The 0-based character offset in the input text that shows where the entity begins. The offset returns the
     *        UTF-8 code point in the string.
     */

    public void setBeginOffset(Integer beginOffset) {
        this.beginOffset = beginOffset;
    }

    /**
     * <p>
     * The 0-based character offset in the input text that shows where the entity begins. The offset returns the UTF-8
     * code point in the string.
     * </p>
     * 
     * @return The 0-based character offset in the input text that shows where the entity begins. The offset returns the
     *         UTF-8 code point in the string.
     */

    public Integer getBeginOffset() {
        return this.beginOffset;
    }

    /**
     * <p>
     * The 0-based character offset in the input text that shows where the entity begins. The offset returns the UTF-8
     * code point in the string.
     * </p>
     * 
     * @param beginOffset
     *        The 0-based character offset in the input text that shows where the entity begins. The offset returns the
     *        UTF-8 code point in the string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SNOMEDCTEntity withBeginOffset(Integer beginOffset) {
        setBeginOffset(beginOffset);
        return this;
    }

    /**
     * <p>
     * The 0-based character offset in the input text that shows where the entity ends. The offset returns the UTF-8
     * code point in the string.
     * </p>
     * 
     * @param endOffset
     *        The 0-based character offset in the input text that shows where the entity ends. The offset returns the
     *        UTF-8 code point in the string.
     */

    public void setEndOffset(Integer endOffset) {
        this.endOffset = endOffset;
    }

    /**
     * <p>
     * The 0-based character offset in the input text that shows where the entity ends. The offset returns the UTF-8
     * code point in the string.
     * </p>
     * 
     * @return The 0-based character offset in the input text that shows where the entity ends. The offset returns the
     *         UTF-8 code point in the string.
     */

    public Integer getEndOffset() {
        return this.endOffset;
    }

    /**
     * <p>
     * The 0-based character offset in the input text that shows where the entity ends. The offset returns the UTF-8
     * code point in the string.
     * </p>
     * 
     * @param endOffset
     *        The 0-based character offset in the input text that shows where the entity ends. The offset returns the
     *        UTF-8 code point in the string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SNOMEDCTEntity withEndOffset(Integer endOffset) {
        setEndOffset(endOffset);
        return this;
    }

    /**
     * <p>
     * An extracted segment of the text that is an attribute of an entity, or otherwise related to an entity, such as
     * the dosage of a medication taken.
     * </p>
     * 
     * @return An extracted segment of the text that is an attribute of an entity, or otherwise related to an entity,
     *         such as the dosage of a medication taken.
     */

    public java.util.List<SNOMEDCTAttribute> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * An extracted segment of the text that is an attribute of an entity, or otherwise related to an entity, such as
     * the dosage of a medication taken.
     * </p>
     * 
     * @param attributes
     *        An extracted segment of the text that is an attribute of an entity, or otherwise related to an entity,
     *        such as the dosage of a medication taken.
     */

    public void setAttributes(java.util.Collection<SNOMEDCTAttribute> attributes) {
        if (attributes == null) {
            this.attributes = null;
            return;
        }

        this.attributes = new java.util.ArrayList<SNOMEDCTAttribute>(attributes);
    }

    /**
     * <p>
     * An extracted segment of the text that is an attribute of an entity, or otherwise related to an entity, such as
     * the dosage of a medication taken.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttributes(java.util.Collection)} or {@link #withAttributes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param attributes
     *        An extracted segment of the text that is an attribute of an entity, or otherwise related to an entity,
     *        such as the dosage of a medication taken.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SNOMEDCTEntity withAttributes(SNOMEDCTAttribute... attributes) {
        if (this.attributes == null) {
            setAttributes(new java.util.ArrayList<SNOMEDCTAttribute>(attributes.length));
        }
        for (SNOMEDCTAttribute ele : attributes) {
            this.attributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An extracted segment of the text that is an attribute of an entity, or otherwise related to an entity, such as
     * the dosage of a medication taken.
     * </p>
     * 
     * @param attributes
     *        An extracted segment of the text that is an attribute of an entity, or otherwise related to an entity,
     *        such as the dosage of a medication taken.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SNOMEDCTEntity withAttributes(java.util.Collection<SNOMEDCTAttribute> attributes) {
        setAttributes(attributes);
        return this;
    }

    /**
     * <p>
     * Contextual information for the entity.
     * </p>
     * 
     * @return Contextual information for the entity.
     */

    public java.util.List<SNOMEDCTTrait> getTraits() {
        return traits;
    }

    /**
     * <p>
     * Contextual information for the entity.
     * </p>
     * 
     * @param traits
     *        Contextual information for the entity.
     */

    public void setTraits(java.util.Collection<SNOMEDCTTrait> traits) {
        if (traits == null) {
            this.traits = null;
            return;
        }

        this.traits = new java.util.ArrayList<SNOMEDCTTrait>(traits);
    }

    /**
     * <p>
     * Contextual information for the entity.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTraits(java.util.Collection)} or {@link #withTraits(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param traits
     *        Contextual information for the entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SNOMEDCTEntity withTraits(SNOMEDCTTrait... traits) {
        if (this.traits == null) {
            setTraits(new java.util.ArrayList<SNOMEDCTTrait>(traits.length));
        }
        for (SNOMEDCTTrait ele : traits) {
            this.traits.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contextual information for the entity.
     * </p>
     * 
     * @param traits
     *        Contextual information for the entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SNOMEDCTEntity withTraits(java.util.Collection<SNOMEDCTTrait> traits) {
        setTraits(traits);
        return this;
    }

    /**
     * <p>
     * The SNOMED concepts that the entity could refer to, along with a score indicating the likelihood of the match.
     * </p>
     * 
     * @return The SNOMED concepts that the entity could refer to, along with a score indicating the likelihood of the
     *         match.
     */

    public java.util.List<SNOMEDCTConcept> getSNOMEDCTConcepts() {
        return sNOMEDCTConcepts;
    }

    /**
     * <p>
     * The SNOMED concepts that the entity could refer to, along with a score indicating the likelihood of the match.
     * </p>
     * 
     * @param sNOMEDCTConcepts
     *        The SNOMED concepts that the entity could refer to, along with a score indicating the likelihood of the
     *        match.
     */

    public void setSNOMEDCTConcepts(java.util.Collection<SNOMEDCTConcept> sNOMEDCTConcepts) {
        if (sNOMEDCTConcepts == null) {
            this.sNOMEDCTConcepts = null;
            return;
        }

        this.sNOMEDCTConcepts = new java.util.ArrayList<SNOMEDCTConcept>(sNOMEDCTConcepts);
    }

    /**
     * <p>
     * The SNOMED concepts that the entity could refer to, along with a score indicating the likelihood of the match.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSNOMEDCTConcepts(java.util.Collection)} or {@link #withSNOMEDCTConcepts(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param sNOMEDCTConcepts
     *        The SNOMED concepts that the entity could refer to, along with a score indicating the likelihood of the
     *        match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SNOMEDCTEntity withSNOMEDCTConcepts(SNOMEDCTConcept... sNOMEDCTConcepts) {
        if (this.sNOMEDCTConcepts == null) {
            setSNOMEDCTConcepts(new java.util.ArrayList<SNOMEDCTConcept>(sNOMEDCTConcepts.length));
        }
        for (SNOMEDCTConcept ele : sNOMEDCTConcepts) {
            this.sNOMEDCTConcepts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The SNOMED concepts that the entity could refer to, along with a score indicating the likelihood of the match.
     * </p>
     * 
     * @param sNOMEDCTConcepts
     *        The SNOMED concepts that the entity could refer to, along with a score indicating the likelihood of the
     *        match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SNOMEDCTEntity withSNOMEDCTConcepts(java.util.Collection<SNOMEDCTConcept> sNOMEDCTConcepts) {
        setSNOMEDCTConcepts(sNOMEDCTConcepts);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getText() != null)
            sb.append("Text: ").append(getText()).append(",");
        if (getCategory() != null)
            sb.append("Category: ").append(getCategory()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getScore() != null)
            sb.append("Score: ").append(getScore()).append(",");
        if (getBeginOffset() != null)
            sb.append("BeginOffset: ").append(getBeginOffset()).append(",");
        if (getEndOffset() != null)
            sb.append("EndOffset: ").append(getEndOffset()).append(",");
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes()).append(",");
        if (getTraits() != null)
            sb.append("Traits: ").append(getTraits()).append(",");
        if (getSNOMEDCTConcepts() != null)
            sb.append("SNOMEDCTConcepts: ").append(getSNOMEDCTConcepts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SNOMEDCTEntity == false)
            return false;
        SNOMEDCTEntity other = (SNOMEDCTEntity) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getText() == null ^ this.getText() == null)
            return false;
        if (other.getText() != null && other.getText().equals(this.getText()) == false)
            return false;
        if (other.getCategory() == null ^ this.getCategory() == null)
            return false;
        if (other.getCategory() != null && other.getCategory().equals(this.getCategory()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getScore() == null ^ this.getScore() == null)
            return false;
        if (other.getScore() != null && other.getScore().equals(this.getScore()) == false)
            return false;
        if (other.getBeginOffset() == null ^ this.getBeginOffset() == null)
            return false;
        if (other.getBeginOffset() != null && other.getBeginOffset().equals(this.getBeginOffset()) == false)
            return false;
        if (other.getEndOffset() == null ^ this.getEndOffset() == null)
            return false;
        if (other.getEndOffset() != null && other.getEndOffset().equals(this.getEndOffset()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getTraits() == null ^ this.getTraits() == null)
            return false;
        if (other.getTraits() != null && other.getTraits().equals(this.getTraits()) == false)
            return false;
        if (other.getSNOMEDCTConcepts() == null ^ this.getSNOMEDCTConcepts() == null)
            return false;
        if (other.getSNOMEDCTConcepts() != null && other.getSNOMEDCTConcepts().equals(this.getSNOMEDCTConcepts()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getText() == null) ? 0 : getText().hashCode());
        hashCode = prime * hashCode + ((getCategory() == null) ? 0 : getCategory().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getScore() == null) ? 0 : getScore().hashCode());
        hashCode = prime * hashCode + ((getBeginOffset() == null) ? 0 : getBeginOffset().hashCode());
        hashCode = prime * hashCode + ((getEndOffset() == null) ? 0 : getEndOffset().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode + ((getTraits() == null) ? 0 : getTraits().hashCode());
        hashCode = prime * hashCode + ((getSNOMEDCTConcepts() == null) ? 0 : getSNOMEDCTConcepts().hashCode());
        return hashCode;
    }

    @Override
    public SNOMEDCTEntity clone() {
        try {
            return (SNOMEDCTEntity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.comprehendmedical.model.transform.SNOMEDCTEntityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
