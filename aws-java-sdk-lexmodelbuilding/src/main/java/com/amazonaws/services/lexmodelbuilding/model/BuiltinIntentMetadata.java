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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides metadata for a built-in intent.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/BuiltinIntentMetadata" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BuiltinIntentMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique identifier for the built-in intent. To find the signature for an intent, see <a href=
     * "https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/standard-intents"
     * >Standard Built-in Intents</a> in the <i>Alexa Skills Kit</i>.
     * </p>
     */
    private String signature;
    /**
     * <p>
     * A list of identifiers for the locales that the intent supports.
     * </p>
     */
    private java.util.List<String> supportedLocales;

    /**
     * <p>
     * A unique identifier for the built-in intent. To find the signature for an intent, see <a href=
     * "https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/standard-intents"
     * >Standard Built-in Intents</a> in the <i>Alexa Skills Kit</i>.
     * </p>
     * 
     * @param signature
     *        A unique identifier for the built-in intent. To find the signature for an intent, see <a href=
     *        "https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/standard-intents"
     *        >Standard Built-in Intents</a> in the <i>Alexa Skills Kit</i>.
     */

    public void setSignature(String signature) {
        this.signature = signature;
    }

    /**
     * <p>
     * A unique identifier for the built-in intent. To find the signature for an intent, see <a href=
     * "https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/standard-intents"
     * >Standard Built-in Intents</a> in the <i>Alexa Skills Kit</i>.
     * </p>
     * 
     * @return A unique identifier for the built-in intent. To find the signature for an intent, see <a href=
     *         "https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/standard-intents"
     *         >Standard Built-in Intents</a> in the <i>Alexa Skills Kit</i>.
     */

    public String getSignature() {
        return this.signature;
    }

    /**
     * <p>
     * A unique identifier for the built-in intent. To find the signature for an intent, see <a href=
     * "https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/standard-intents"
     * >Standard Built-in Intents</a> in the <i>Alexa Skills Kit</i>.
     * </p>
     * 
     * @param signature
     *        A unique identifier for the built-in intent. To find the signature for an intent, see <a href=
     *        "https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/standard-intents"
     *        >Standard Built-in Intents</a> in the <i>Alexa Skills Kit</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BuiltinIntentMetadata withSignature(String signature) {
        setSignature(signature);
        return this;
    }

    /**
     * <p>
     * A list of identifiers for the locales that the intent supports.
     * </p>
     * 
     * @return A list of identifiers for the locales that the intent supports.
     * @see Locale
     */

    public java.util.List<String> getSupportedLocales() {
        return supportedLocales;
    }

    /**
     * <p>
     * A list of identifiers for the locales that the intent supports.
     * </p>
     * 
     * @param supportedLocales
     *        A list of identifiers for the locales that the intent supports.
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
     * A list of identifiers for the locales that the intent supports.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSupportedLocales(java.util.Collection)} or {@link #withSupportedLocales(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param supportedLocales
     *        A list of identifiers for the locales that the intent supports.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Locale
     */

    public BuiltinIntentMetadata withSupportedLocales(String... supportedLocales) {
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
     * A list of identifiers for the locales that the intent supports.
     * </p>
     * 
     * @param supportedLocales
     *        A list of identifiers for the locales that the intent supports.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Locale
     */

    public BuiltinIntentMetadata withSupportedLocales(java.util.Collection<String> supportedLocales) {
        setSupportedLocales(supportedLocales);
        return this;
    }

    /**
     * <p>
     * A list of identifiers for the locales that the intent supports.
     * </p>
     * 
     * @param supportedLocales
     *        A list of identifiers for the locales that the intent supports.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Locale
     */

    public BuiltinIntentMetadata withSupportedLocales(Locale... supportedLocales) {
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
            sb.append("SupportedLocales: ").append(getSupportedLocales());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BuiltinIntentMetadata == false)
            return false;
        BuiltinIntentMetadata other = (BuiltinIntentMetadata) obj;
        if (other.getSignature() == null ^ this.getSignature() == null)
            return false;
        if (other.getSignature() != null && other.getSignature().equals(this.getSignature()) == false)
            return false;
        if (other.getSupportedLocales() == null ^ this.getSupportedLocales() == null)
            return false;
        if (other.getSupportedLocales() != null && other.getSupportedLocales().equals(this.getSupportedLocales()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSignature() == null) ? 0 : getSignature().hashCode());
        hashCode = prime * hashCode + ((getSupportedLocales() == null) ? 0 : getSupportedLocales().hashCode());
        return hashCode;
    }

    @Override
    public BuiltinIntentMetadata clone() {
        try {
            return (BuiltinIntentMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelbuilding.model.transform.BuiltinIntentMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
