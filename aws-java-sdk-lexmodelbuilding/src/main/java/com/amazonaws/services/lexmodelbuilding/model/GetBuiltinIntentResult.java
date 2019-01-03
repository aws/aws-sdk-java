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
package com.amazonaws.services.lexmodelbuilding.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetBuiltinIntent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetBuiltinIntentResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier for a built-in intent.
     * </p>
     */
    private String signature;
    /**
     * <p>
     * A list of locales that the intent supports.
     * </p>
     */
    private java.util.List<String> supportedLocales;
    /**
     * <p>
     * An array of <code>BuiltinIntentSlot</code> objects, one entry for each slot type in the intent.
     * </p>
     */
    private java.util.List<BuiltinIntentSlot> slots;

    /**
     * <p>
     * The unique identifier for a built-in intent.
     * </p>
     * 
     * @param signature
     *        The unique identifier for a built-in intent.
     */

    public void setSignature(String signature) {
        this.signature = signature;
    }

    /**
     * <p>
     * The unique identifier for a built-in intent.
     * </p>
     * 
     * @return The unique identifier for a built-in intent.
     */

    public String getSignature() {
        return this.signature;
    }

    /**
     * <p>
     * The unique identifier for a built-in intent.
     * </p>
     * 
     * @param signature
     *        The unique identifier for a built-in intent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBuiltinIntentResult withSignature(String signature) {
        setSignature(signature);
        return this;
    }

    /**
     * <p>
     * A list of locales that the intent supports.
     * </p>
     * 
     * @return A list of locales that the intent supports.
     * @see Locale
     */

    public java.util.List<String> getSupportedLocales() {
        return supportedLocales;
    }

    /**
     * <p>
     * A list of locales that the intent supports.
     * </p>
     * 
     * @param supportedLocales
     *        A list of locales that the intent supports.
     * @see Locale
     */

    public void setSupportedLocales(java.util.Collection<String> supportedLocales) {
        if (supportedLocales == null) {
            this.supportedLocales = null;
            return;
        }

        this.supportedLocales = new java.util.ArrayList<String>(supportedLocales);
    }

    /**
     * <p>
     * A list of locales that the intent supports.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSupportedLocales(java.util.Collection)} or {@link #withSupportedLocales(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param supportedLocales
     *        A list of locales that the intent supports.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Locale
     */

    public GetBuiltinIntentResult withSupportedLocales(String... supportedLocales) {
        if (this.supportedLocales == null) {
            setSupportedLocales(new java.util.ArrayList<String>(supportedLocales.length));
        }
        for (String ele : supportedLocales) {
            this.supportedLocales.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of locales that the intent supports.
     * </p>
     * 
     * @param supportedLocales
     *        A list of locales that the intent supports.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Locale
     */

    public GetBuiltinIntentResult withSupportedLocales(java.util.Collection<String> supportedLocales) {
        setSupportedLocales(supportedLocales);
        return this;
    }

    /**
     * <p>
     * A list of locales that the intent supports.
     * </p>
     * 
     * @param supportedLocales
     *        A list of locales that the intent supports.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Locale
     */

    public GetBuiltinIntentResult withSupportedLocales(Locale... supportedLocales) {
        java.util.ArrayList<String> supportedLocalesCopy = new java.util.ArrayList<String>(supportedLocales.length);
        for (Locale value : supportedLocales) {
            supportedLocalesCopy.add(value.toString());
        }
        if (getSupportedLocales() == null) {
            setSupportedLocales(supportedLocalesCopy);
        } else {
            getSupportedLocales().addAll(supportedLocalesCopy);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>BuiltinIntentSlot</code> objects, one entry for each slot type in the intent.
     * </p>
     * 
     * @return An array of <code>BuiltinIntentSlot</code> objects, one entry for each slot type in the intent.
     */

    public java.util.List<BuiltinIntentSlot> getSlots() {
        return slots;
    }

    /**
     * <p>
     * An array of <code>BuiltinIntentSlot</code> objects, one entry for each slot type in the intent.
     * </p>
     * 
     * @param slots
     *        An array of <code>BuiltinIntentSlot</code> objects, one entry for each slot type in the intent.
     */

    public void setSlots(java.util.Collection<BuiltinIntentSlot> slots) {
        if (slots == null) {
            this.slots = null;
            return;
        }

        this.slots = new java.util.ArrayList<BuiltinIntentSlot>(slots);
    }

    /**
     * <p>
     * An array of <code>BuiltinIntentSlot</code> objects, one entry for each slot type in the intent.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSlots(java.util.Collection)} or {@link #withSlots(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param slots
     *        An array of <code>BuiltinIntentSlot</code> objects, one entry for each slot type in the intent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBuiltinIntentResult withSlots(BuiltinIntentSlot... slots) {
        if (this.slots == null) {
            setSlots(new java.util.ArrayList<BuiltinIntentSlot>(slots.length));
        }
        for (BuiltinIntentSlot ele : slots) {
            this.slots.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>BuiltinIntentSlot</code> objects, one entry for each slot type in the intent.
     * </p>
     * 
     * @param slots
     *        An array of <code>BuiltinIntentSlot</code> objects, one entry for each slot type in the intent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBuiltinIntentResult withSlots(java.util.Collection<BuiltinIntentSlot> slots) {
        setSlots(slots);
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
        if (getSignature() != null)
            sb.append("Signature: ").append(getSignature()).append(",");
        if (getSupportedLocales() != null)
            sb.append("SupportedLocales: ").append(getSupportedLocales()).append(",");
        if (getSlots() != null)
            sb.append("Slots: ").append(getSlots());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetBuiltinIntentResult == false)
            return false;
        GetBuiltinIntentResult other = (GetBuiltinIntentResult) obj;
        if (other.getSignature() == null ^ this.getSignature() == null)
            return false;
        if (other.getSignature() != null && other.getSignature().equals(this.getSignature()) == false)
            return false;
        if (other.getSupportedLocales() == null ^ this.getSupportedLocales() == null)
            return false;
        if (other.getSupportedLocales() != null && other.getSupportedLocales().equals(this.getSupportedLocales()) == false)
            return false;
        if (other.getSlots() == null ^ this.getSlots() == null)
            return false;
        if (other.getSlots() != null && other.getSlots().equals(this.getSlots()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSignature() == null) ? 0 : getSignature().hashCode());
        hashCode = prime * hashCode + ((getSupportedLocales() == null) ? 0 : getSupportedLocales().hashCode());
        hashCode = prime * hashCode + ((getSlots() == null) ? 0 : getSlots().hashCode());
        return hashCode;
    }

    @Override
    public GetBuiltinIntentResult clone() {
        try {
            return (GetBuiltinIntentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
