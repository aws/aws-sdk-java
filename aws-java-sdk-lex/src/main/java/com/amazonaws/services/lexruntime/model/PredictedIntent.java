/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lexruntime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An intent that Amazon Lex suggests satisfies the user's intent. Includes the name of the intent, the confidence that
 * Amazon Lex has that the user's intent is satisfied, and the slots defined for the intent.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/runtime.lex-2016-11-28/PredictedIntent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PredictedIntent implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the intent that Amazon Lex suggests satisfies the user's intent.
     * </p>
     */
    private String intentName;
    /**
     * <p>
     * Indicates how confident Amazon Lex is that an intent satisfies the user's intent.
     * </p>
     */
    private IntentConfidence nluIntentConfidence;
    /**
     * <p>
     * The slot and slot values associated with the predicted intent.
     * </p>
     */
    private java.util.Map<String, String> slots;

    /**
     * <p>
     * The name of the intent that Amazon Lex suggests satisfies the user's intent.
     * </p>
     * 
     * @param intentName
     *        The name of the intent that Amazon Lex suggests satisfies the user's intent.
     */

    public void setIntentName(String intentName) {
        this.intentName = intentName;
    }

    /**
     * <p>
     * The name of the intent that Amazon Lex suggests satisfies the user's intent.
     * </p>
     * 
     * @return The name of the intent that Amazon Lex suggests satisfies the user's intent.
     */

    public String getIntentName() {
        return this.intentName;
    }

    /**
     * <p>
     * The name of the intent that Amazon Lex suggests satisfies the user's intent.
     * </p>
     * 
     * @param intentName
     *        The name of the intent that Amazon Lex suggests satisfies the user's intent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PredictedIntent withIntentName(String intentName) {
        setIntentName(intentName);
        return this;
    }

    /**
     * <p>
     * Indicates how confident Amazon Lex is that an intent satisfies the user's intent.
     * </p>
     * 
     * @param nluIntentConfidence
     *        Indicates how confident Amazon Lex is that an intent satisfies the user's intent.
     */

    public void setNluIntentConfidence(IntentConfidence nluIntentConfidence) {
        this.nluIntentConfidence = nluIntentConfidence;
    }

    /**
     * <p>
     * Indicates how confident Amazon Lex is that an intent satisfies the user's intent.
     * </p>
     * 
     * @return Indicates how confident Amazon Lex is that an intent satisfies the user's intent.
     */

    public IntentConfidence getNluIntentConfidence() {
        return this.nluIntentConfidence;
    }

    /**
     * <p>
     * Indicates how confident Amazon Lex is that an intent satisfies the user's intent.
     * </p>
     * 
     * @param nluIntentConfidence
     *        Indicates how confident Amazon Lex is that an intent satisfies the user's intent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PredictedIntent withNluIntentConfidence(IntentConfidence nluIntentConfidence) {
        setNluIntentConfidence(nluIntentConfidence);
        return this;
    }

    /**
     * <p>
     * The slot and slot values associated with the predicted intent.
     * </p>
     * 
     * @return The slot and slot values associated with the predicted intent.
     */

    public java.util.Map<String, String> getSlots() {
        return slots;
    }

    /**
     * <p>
     * The slot and slot values associated with the predicted intent.
     * </p>
     * 
     * @param slots
     *        The slot and slot values associated with the predicted intent.
     */

    public void setSlots(java.util.Map<String, String> slots) {
        this.slots = slots;
    }

    /**
     * <p>
     * The slot and slot values associated with the predicted intent.
     * </p>
     * 
     * @param slots
     *        The slot and slot values associated with the predicted intent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PredictedIntent withSlots(java.util.Map<String, String> slots) {
        setSlots(slots);
        return this;
    }

    /**
     * Add a single Slots entry
     *
     * @see PredictedIntent#withSlots
     * @returns a reference to this object so that method calls can be chained together.
     */

    public PredictedIntent addSlotsEntry(String key, String value) {
        if (null == this.slots) {
            this.slots = new java.util.HashMap<String, String>();
        }
        if (this.slots.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.slots.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Slots.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PredictedIntent clearSlotsEntries() {
        this.slots = null;
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
        if (getIntentName() != null)
            sb.append("IntentName: ").append(getIntentName()).append(",");
        if (getNluIntentConfidence() != null)
            sb.append("NluIntentConfidence: ").append(getNluIntentConfidence()).append(",");
        if (getSlots() != null)
            sb.append("Slots: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PredictedIntent == false)
            return false;
        PredictedIntent other = (PredictedIntent) obj;
        if (other.getIntentName() == null ^ this.getIntentName() == null)
            return false;
        if (other.getIntentName() != null && other.getIntentName().equals(this.getIntentName()) == false)
            return false;
        if (other.getNluIntentConfidence() == null ^ this.getNluIntentConfidence() == null)
            return false;
        if (other.getNluIntentConfidence() != null && other.getNluIntentConfidence().equals(this.getNluIntentConfidence()) == false)
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

        hashCode = prime * hashCode + ((getIntentName() == null) ? 0 : getIntentName().hashCode());
        hashCode = prime * hashCode + ((getNluIntentConfidence() == null) ? 0 : getNluIntentConfidence().hashCode());
        hashCode = prime * hashCode + ((getSlots() == null) ? 0 : getSlots().hashCode());
        return hashCode;
    }

    @Override
    public PredictedIntent clone() {
        try {
            return (PredictedIntent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexruntime.model.transform.PredictedIntentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
