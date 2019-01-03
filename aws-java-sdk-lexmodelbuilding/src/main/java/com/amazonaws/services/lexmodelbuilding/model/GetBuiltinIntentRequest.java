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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetBuiltinIntent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetBuiltinIntentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier for a built-in intent. To find the signature for an intent, see <a href=
     * "https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/standard-intents"
     * >Standard Built-in Intents</a> in the <i>Alexa Skills Kit</i>.
     * </p>
     */
    private String signature;

    /**
     * <p>
     * The unique identifier for a built-in intent. To find the signature for an intent, see <a href=
     * "https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/standard-intents"
     * >Standard Built-in Intents</a> in the <i>Alexa Skills Kit</i>.
     * </p>
     * 
     * @param signature
     *        The unique identifier for a built-in intent. To find the signature for an intent, see <a href=
     *        "https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/standard-intents"
     *        >Standard Built-in Intents</a> in the <i>Alexa Skills Kit</i>.
     */

    public void setSignature(String signature) {
        this.signature = signature;
    }

    /**
     * <p>
     * The unique identifier for a built-in intent. To find the signature for an intent, see <a href=
     * "https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/standard-intents"
     * >Standard Built-in Intents</a> in the <i>Alexa Skills Kit</i>.
     * </p>
     * 
     * @return The unique identifier for a built-in intent. To find the signature for an intent, see <a href=
     *         "https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/standard-intents"
     *         >Standard Built-in Intents</a> in the <i>Alexa Skills Kit</i>.
     */

    public String getSignature() {
        return this.signature;
    }

    /**
     * <p>
     * The unique identifier for a built-in intent. To find the signature for an intent, see <a href=
     * "https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/standard-intents"
     * >Standard Built-in Intents</a> in the <i>Alexa Skills Kit</i>.
     * </p>
     * 
     * @param signature
     *        The unique identifier for a built-in intent. To find the signature for an intent, see <a href=
     *        "https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/standard-intents"
     *        >Standard Built-in Intents</a> in the <i>Alexa Skills Kit</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBuiltinIntentRequest withSignature(String signature) {
        setSignature(signature);
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
            sb.append("Signature: ").append(getSignature());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetBuiltinIntentRequest == false)
            return false;
        GetBuiltinIntentRequest other = (GetBuiltinIntentRequest) obj;
        if (other.getSignature() == null ^ this.getSignature() == null)
            return false;
        if (other.getSignature() != null && other.getSignature().equals(this.getSignature()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSignature() == null) ? 0 : getSignature().hashCode());
        return hashCode;
    }

    @Override
    public GetBuiltinIntentRequest clone() {
        return (GetBuiltinIntentRequest) super.clone();
    }

}
