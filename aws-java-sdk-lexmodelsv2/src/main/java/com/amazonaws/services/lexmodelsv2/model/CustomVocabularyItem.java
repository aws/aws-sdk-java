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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The unique custom vocabulary item from the custom vocabulary list.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/CustomVocabularyItem" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomVocabularyItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique item identifer for the custom vocabulary item from the custom vocabulary list.
     * </p>
     */
    private String itemId;
    /**
     * <p>
     * The unique phrase for the custom vocabulary item from the custom vocabulary list.
     * </p>
     */
    private String phrase;
    /**
     * <p>
     * The weight assigned for the custom vocabulary item from the custom vocabulary list.
     * </p>
     */
    private Integer weight;
    /**
     * <p>
     * The display as value for the custom vocabulary item from the custom vocabulary list.
     * </p>
     */
    private String displayAs;

    /**
     * <p>
     * The unique item identifer for the custom vocabulary item from the custom vocabulary list.
     * </p>
     * 
     * @param itemId
     *        The unique item identifer for the custom vocabulary item from the custom vocabulary list.
     */

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    /**
     * <p>
     * The unique item identifer for the custom vocabulary item from the custom vocabulary list.
     * </p>
     * 
     * @return The unique item identifer for the custom vocabulary item from the custom vocabulary list.
     */

    public String getItemId() {
        return this.itemId;
    }

    /**
     * <p>
     * The unique item identifer for the custom vocabulary item from the custom vocabulary list.
     * </p>
     * 
     * @param itemId
     *        The unique item identifer for the custom vocabulary item from the custom vocabulary list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomVocabularyItem withItemId(String itemId) {
        setItemId(itemId);
        return this;
    }

    /**
     * <p>
     * The unique phrase for the custom vocabulary item from the custom vocabulary list.
     * </p>
     * 
     * @param phrase
     *        The unique phrase for the custom vocabulary item from the custom vocabulary list.
     */

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    /**
     * <p>
     * The unique phrase for the custom vocabulary item from the custom vocabulary list.
     * </p>
     * 
     * @return The unique phrase for the custom vocabulary item from the custom vocabulary list.
     */

    public String getPhrase() {
        return this.phrase;
    }

    /**
     * <p>
     * The unique phrase for the custom vocabulary item from the custom vocabulary list.
     * </p>
     * 
     * @param phrase
     *        The unique phrase for the custom vocabulary item from the custom vocabulary list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomVocabularyItem withPhrase(String phrase) {
        setPhrase(phrase);
        return this;
    }

    /**
     * <p>
     * The weight assigned for the custom vocabulary item from the custom vocabulary list.
     * </p>
     * 
     * @param weight
     *        The weight assigned for the custom vocabulary item from the custom vocabulary list.
     */

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    /**
     * <p>
     * The weight assigned for the custom vocabulary item from the custom vocabulary list.
     * </p>
     * 
     * @return The weight assigned for the custom vocabulary item from the custom vocabulary list.
     */

    public Integer getWeight() {
        return this.weight;
    }

    /**
     * <p>
     * The weight assigned for the custom vocabulary item from the custom vocabulary list.
     * </p>
     * 
     * @param weight
     *        The weight assigned for the custom vocabulary item from the custom vocabulary list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomVocabularyItem withWeight(Integer weight) {
        setWeight(weight);
        return this;
    }

    /**
     * <p>
     * The display as value for the custom vocabulary item from the custom vocabulary list.
     * </p>
     * 
     * @param displayAs
     *        The display as value for the custom vocabulary item from the custom vocabulary list.
     */

    public void setDisplayAs(String displayAs) {
        this.displayAs = displayAs;
    }

    /**
     * <p>
     * The display as value for the custom vocabulary item from the custom vocabulary list.
     * </p>
     * 
     * @return The display as value for the custom vocabulary item from the custom vocabulary list.
     */

    public String getDisplayAs() {
        return this.displayAs;
    }

    /**
     * <p>
     * The display as value for the custom vocabulary item from the custom vocabulary list.
     * </p>
     * 
     * @param displayAs
     *        The display as value for the custom vocabulary item from the custom vocabulary list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomVocabularyItem withDisplayAs(String displayAs) {
        setDisplayAs(displayAs);
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
        if (getItemId() != null)
            sb.append("ItemId: ").append(getItemId()).append(",");
        if (getPhrase() != null)
            sb.append("Phrase: ").append(getPhrase()).append(",");
        if (getWeight() != null)
            sb.append("Weight: ").append(getWeight()).append(",");
        if (getDisplayAs() != null)
            sb.append("DisplayAs: ").append(getDisplayAs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomVocabularyItem == false)
            return false;
        CustomVocabularyItem other = (CustomVocabularyItem) obj;
        if (other.getItemId() == null ^ this.getItemId() == null)
            return false;
        if (other.getItemId() != null && other.getItemId().equals(this.getItemId()) == false)
            return false;
        if (other.getPhrase() == null ^ this.getPhrase() == null)
            return false;
        if (other.getPhrase() != null && other.getPhrase().equals(this.getPhrase()) == false)
            return false;
        if (other.getWeight() == null ^ this.getWeight() == null)
            return false;
        if (other.getWeight() != null && other.getWeight().equals(this.getWeight()) == false)
            return false;
        if (other.getDisplayAs() == null ^ this.getDisplayAs() == null)
            return false;
        if (other.getDisplayAs() != null && other.getDisplayAs().equals(this.getDisplayAs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getItemId() == null) ? 0 : getItemId().hashCode());
        hashCode = prime * hashCode + ((getPhrase() == null) ? 0 : getPhrase().hashCode());
        hashCode = prime * hashCode + ((getWeight() == null) ? 0 : getWeight().hashCode());
        hashCode = prime * hashCode + ((getDisplayAs() == null) ? 0 : getDisplayAs().hashCode());
        return hashCode;
    }

    @Override
    public CustomVocabularyItem clone() {
        try {
            return (CustomVocabularyItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.CustomVocabularyItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
