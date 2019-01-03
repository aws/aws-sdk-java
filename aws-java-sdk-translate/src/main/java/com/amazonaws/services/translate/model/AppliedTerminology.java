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
 * The custom terminology applied to the input text by Amazon Translate for the translated text response. This is
 * optional in the response and will only be present if you specified terminology input in the request. Currently, only
 * one terminology can be applied per TranslateText request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/translate-2017-07-01/AppliedTerminology" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AppliedTerminology implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the custom terminology applied to the input text by Amazon Translate for the translated text
     * response.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The specific terms of the custom terminology applied to the input text by Amazon Translate for the translated
     * text response. A maximum of 250 terms will be returned, and the specific terms applied will be the first 250
     * terms in the source text.
     * </p>
     */
    private java.util.List<Term> terms;

    /**
     * <p>
     * The name of the custom terminology applied to the input text by Amazon Translate for the translated text
     * response.
     * </p>
     * 
     * @param name
     *        The name of the custom terminology applied to the input text by Amazon Translate for the translated text
     *        response.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the custom terminology applied to the input text by Amazon Translate for the translated text
     * response.
     * </p>
     * 
     * @return The name of the custom terminology applied to the input text by Amazon Translate for the translated text
     *         response.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the custom terminology applied to the input text by Amazon Translate for the translated text
     * response.
     * </p>
     * 
     * @param name
     *        The name of the custom terminology applied to the input text by Amazon Translate for the translated text
     *        response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppliedTerminology withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The specific terms of the custom terminology applied to the input text by Amazon Translate for the translated
     * text response. A maximum of 250 terms will be returned, and the specific terms applied will be the first 250
     * terms in the source text.
     * </p>
     * 
     * @return The specific terms of the custom terminology applied to the input text by Amazon Translate for the
     *         translated text response. A maximum of 250 terms will be returned, and the specific terms applied will be
     *         the first 250 terms in the source text.
     */

    public java.util.List<Term> getTerms() {
        return terms;
    }

    /**
     * <p>
     * The specific terms of the custom terminology applied to the input text by Amazon Translate for the translated
     * text response. A maximum of 250 terms will be returned, and the specific terms applied will be the first 250
     * terms in the source text.
     * </p>
     * 
     * @param terms
     *        The specific terms of the custom terminology applied to the input text by Amazon Translate for the
     *        translated text response. A maximum of 250 terms will be returned, and the specific terms applied will be
     *        the first 250 terms in the source text.
     */

    public void setTerms(java.util.Collection<Term> terms) {
        if (terms == null) {
            this.terms = null;
            return;
        }

        this.terms = new java.util.ArrayList<Term>(terms);
    }

    /**
     * <p>
     * The specific terms of the custom terminology applied to the input text by Amazon Translate for the translated
     * text response. A maximum of 250 terms will be returned, and the specific terms applied will be the first 250
     * terms in the source text.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTerms(java.util.Collection)} or {@link #withTerms(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param terms
     *        The specific terms of the custom terminology applied to the input text by Amazon Translate for the
     *        translated text response. A maximum of 250 terms will be returned, and the specific terms applied will be
     *        the first 250 terms in the source text.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppliedTerminology withTerms(Term... terms) {
        if (this.terms == null) {
            setTerms(new java.util.ArrayList<Term>(terms.length));
        }
        for (Term ele : terms) {
            this.terms.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The specific terms of the custom terminology applied to the input text by Amazon Translate for the translated
     * text response. A maximum of 250 terms will be returned, and the specific terms applied will be the first 250
     * terms in the source text.
     * </p>
     * 
     * @param terms
     *        The specific terms of the custom terminology applied to the input text by Amazon Translate for the
     *        translated text response. A maximum of 250 terms will be returned, and the specific terms applied will be
     *        the first 250 terms in the source text.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppliedTerminology withTerms(java.util.Collection<Term> terms) {
        setTerms(terms);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getTerms() != null)
            sb.append("Terms: ").append(getTerms());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AppliedTerminology == false)
            return false;
        AppliedTerminology other = (AppliedTerminology) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getTerms() == null ^ this.getTerms() == null)
            return false;
        if (other.getTerms() != null && other.getTerms().equals(this.getTerms()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTerms() == null) ? 0 : getTerms().hashCode());
        return hashCode;
    }

    @Override
    public AppliedTerminology clone() {
        try {
            return (AppliedTerminology) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.translate.model.transform.AppliedTerminologyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
