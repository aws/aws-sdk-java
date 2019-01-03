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
package com.amazonaws.services.translate.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The term being translated by the custom terminology.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/translate-2017-07-01/Term" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Term implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The source text of the term being translated by the custom terminology.
     * </p>
     */
    private String sourceText;
    /**
     * <p>
     * The target text of the term being translated by the custom terminology.
     * </p>
     */
    private String targetText;

    /**
     * <p>
     * The source text of the term being translated by the custom terminology.
     * </p>
     * 
     * @param sourceText
     *        The source text of the term being translated by the custom terminology.
     */

    public void setSourceText(String sourceText) {
        this.sourceText = sourceText;
    }

    /**
     * <p>
     * The source text of the term being translated by the custom terminology.
     * </p>
     * 
     * @return The source text of the term being translated by the custom terminology.
     */

    public String getSourceText() {
        return this.sourceText;
    }

    /**
     * <p>
     * The source text of the term being translated by the custom terminology.
     * </p>
     * 
     * @param sourceText
     *        The source text of the term being translated by the custom terminology.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Term withSourceText(String sourceText) {
        setSourceText(sourceText);
        return this;
    }

    /**
     * <p>
     * The target text of the term being translated by the custom terminology.
     * </p>
     * 
     * @param targetText
     *        The target text of the term being translated by the custom terminology.
     */

    public void setTargetText(String targetText) {
        this.targetText = targetText;
    }

    /**
     * <p>
     * The target text of the term being translated by the custom terminology.
     * </p>
     * 
     * @return The target text of the term being translated by the custom terminology.
     */

    public String getTargetText() {
        return this.targetText;
    }

    /**
     * <p>
     * The target text of the term being translated by the custom terminology.
     * </p>
     * 
     * @param targetText
     *        The target text of the term being translated by the custom terminology.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Term withTargetText(String targetText) {
        setTargetText(targetText);
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
        if (getSourceText() != null)
            sb.append("SourceText: ").append(getSourceText()).append(",");
        if (getTargetText() != null)
            sb.append("TargetText: ").append(getTargetText());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Term == false)
            return false;
        Term other = (Term) obj;
        if (other.getSourceText() == null ^ this.getSourceText() == null)
            return false;
        if (other.getSourceText() != null && other.getSourceText().equals(this.getSourceText()) == false)
            return false;
        if (other.getTargetText() == null ^ this.getTargetText() == null)
            return false;
        if (other.getTargetText() != null && other.getTargetText().equals(this.getTargetText()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceText() == null) ? 0 : getSourceText().hashCode());
        hashCode = prime * hashCode + ((getTargetText() == null) ? 0 : getTargetText().hashCode());
        return hashCode;
    }

    @Override
    public Term clone() {
        try {
            return (Term) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.translate.model.transform.TermMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
