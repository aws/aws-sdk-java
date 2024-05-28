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
package com.amazonaws.services.bedrock.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains details about the word policy configured for the guardrail.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/GuardrailWordPolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GuardrailWordPolicy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of words configured for the guardrail.
     * </p>
     */
    private java.util.List<GuardrailWord> words;
    /**
     * <p>
     * A list of managed words configured for the guardrail.
     * </p>
     */
    private java.util.List<GuardrailManagedWords> managedWordLists;

    /**
     * <p>
     * A list of words configured for the guardrail.
     * </p>
     * 
     * @return A list of words configured for the guardrail.
     */

    public java.util.List<GuardrailWord> getWords() {
        return words;
    }

    /**
     * <p>
     * A list of words configured for the guardrail.
     * </p>
     * 
     * @param words
     *        A list of words configured for the guardrail.
     */

    public void setWords(java.util.Collection<GuardrailWord> words) {
        if (words == null) {
            this.words = null;
            return;
        }

        this.words = new java.util.ArrayList<GuardrailWord>(words);
    }

    /**
     * <p>
     * A list of words configured for the guardrail.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWords(java.util.Collection)} or {@link #withWords(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param words
     *        A list of words configured for the guardrail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GuardrailWordPolicy withWords(GuardrailWord... words) {
        if (this.words == null) {
            setWords(new java.util.ArrayList<GuardrailWord>(words.length));
        }
        for (GuardrailWord ele : words) {
            this.words.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of words configured for the guardrail.
     * </p>
     * 
     * @param words
     *        A list of words configured for the guardrail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GuardrailWordPolicy withWords(java.util.Collection<GuardrailWord> words) {
        setWords(words);
        return this;
    }

    /**
     * <p>
     * A list of managed words configured for the guardrail.
     * </p>
     * 
     * @return A list of managed words configured for the guardrail.
     */

    public java.util.List<GuardrailManagedWords> getManagedWordLists() {
        return managedWordLists;
    }

    /**
     * <p>
     * A list of managed words configured for the guardrail.
     * </p>
     * 
     * @param managedWordLists
     *        A list of managed words configured for the guardrail.
     */

    public void setManagedWordLists(java.util.Collection<GuardrailManagedWords> managedWordLists) {
        if (managedWordLists == null) {
            this.managedWordLists = null;
            return;
        }

        this.managedWordLists = new java.util.ArrayList<GuardrailManagedWords>(managedWordLists);
    }

    /**
     * <p>
     * A list of managed words configured for the guardrail.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setManagedWordLists(java.util.Collection)} or {@link #withManagedWordLists(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param managedWordLists
     *        A list of managed words configured for the guardrail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GuardrailWordPolicy withManagedWordLists(GuardrailManagedWords... managedWordLists) {
        if (this.managedWordLists == null) {
            setManagedWordLists(new java.util.ArrayList<GuardrailManagedWords>(managedWordLists.length));
        }
        for (GuardrailManagedWords ele : managedWordLists) {
            this.managedWordLists.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of managed words configured for the guardrail.
     * </p>
     * 
     * @param managedWordLists
     *        A list of managed words configured for the guardrail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GuardrailWordPolicy withManagedWordLists(java.util.Collection<GuardrailManagedWords> managedWordLists) {
        setManagedWordLists(managedWordLists);
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
        if (getWords() != null)
            sb.append("Words: ").append(getWords()).append(",");
        if (getManagedWordLists() != null)
            sb.append("ManagedWordLists: ").append(getManagedWordLists());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GuardrailWordPolicy == false)
            return false;
        GuardrailWordPolicy other = (GuardrailWordPolicy) obj;
        if (other.getWords() == null ^ this.getWords() == null)
            return false;
        if (other.getWords() != null && other.getWords().equals(this.getWords()) == false)
            return false;
        if (other.getManagedWordLists() == null ^ this.getManagedWordLists() == null)
            return false;
        if (other.getManagedWordLists() != null && other.getManagedWordLists().equals(this.getManagedWordLists()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWords() == null) ? 0 : getWords().hashCode());
        hashCode = prime * hashCode + ((getManagedWordLists() == null) ? 0 : getManagedWordLists().hashCode());
        return hashCode;
    }

    @Override
    public GuardrailWordPolicy clone() {
        try {
            return (GuardrailWordPolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrock.model.transform.GuardrailWordPolicyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
