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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A query with suggested spell corrections.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/SpellCorrectedQuery" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SpellCorrectedQuery implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The query with the suggested spell corrections.
     * </p>
     */
    private String suggestedQueryText;
    /**
     * <p>
     * The corrected misspelled word or words in a query.
     * </p>
     */
    private java.util.List<Correction> corrections;

    /**
     * <p>
     * The query with the suggested spell corrections.
     * </p>
     * 
     * @param suggestedQueryText
     *        The query with the suggested spell corrections.
     */

    public void setSuggestedQueryText(String suggestedQueryText) {
        this.suggestedQueryText = suggestedQueryText;
    }

    /**
     * <p>
     * The query with the suggested spell corrections.
     * </p>
     * 
     * @return The query with the suggested spell corrections.
     */

    public String getSuggestedQueryText() {
        return this.suggestedQueryText;
    }

    /**
     * <p>
     * The query with the suggested spell corrections.
     * </p>
     * 
     * @param suggestedQueryText
     *        The query with the suggested spell corrections.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpellCorrectedQuery withSuggestedQueryText(String suggestedQueryText) {
        setSuggestedQueryText(suggestedQueryText);
        return this;
    }

    /**
     * <p>
     * The corrected misspelled word or words in a query.
     * </p>
     * 
     * @return The corrected misspelled word or words in a query.
     */

    public java.util.List<Correction> getCorrections() {
        return corrections;
    }

    /**
     * <p>
     * The corrected misspelled word or words in a query.
     * </p>
     * 
     * @param corrections
     *        The corrected misspelled word or words in a query.
     */

    public void setCorrections(java.util.Collection<Correction> corrections) {
        if (corrections == null) {
            this.corrections = null;
            return;
        }

        this.corrections = new java.util.ArrayList<Correction>(corrections);
    }

    /**
     * <p>
     * The corrected misspelled word or words in a query.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCorrections(java.util.Collection)} or {@link #withCorrections(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param corrections
     *        The corrected misspelled word or words in a query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpellCorrectedQuery withCorrections(Correction... corrections) {
        if (this.corrections == null) {
            setCorrections(new java.util.ArrayList<Correction>(corrections.length));
        }
        for (Correction ele : corrections) {
            this.corrections.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The corrected misspelled word or words in a query.
     * </p>
     * 
     * @param corrections
     *        The corrected misspelled word or words in a query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpellCorrectedQuery withCorrections(java.util.Collection<Correction> corrections) {
        setCorrections(corrections);
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
        if (getSuggestedQueryText() != null)
            sb.append("SuggestedQueryText: ").append(getSuggestedQueryText()).append(",");
        if (getCorrections() != null)
            sb.append("Corrections: ").append(getCorrections());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SpellCorrectedQuery == false)
            return false;
        SpellCorrectedQuery other = (SpellCorrectedQuery) obj;
        if (other.getSuggestedQueryText() == null ^ this.getSuggestedQueryText() == null)
            return false;
        if (other.getSuggestedQueryText() != null && other.getSuggestedQueryText().equals(this.getSuggestedQueryText()) == false)
            return false;
        if (other.getCorrections() == null ^ this.getCorrections() == null)
            return false;
        if (other.getCorrections() != null && other.getCorrections().equals(this.getCorrections()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSuggestedQueryText() == null) ? 0 : getSuggestedQueryText().hashCode());
        hashCode = prime * hashCode + ((getCorrections() == null) ? 0 : getCorrections().hashCode());
        return hashCode;
    }

    @Override
    public SpellCorrectedQuery clone() {
        try {
            return (SpellCorrectedQuery) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.SpellCorrectedQueryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
