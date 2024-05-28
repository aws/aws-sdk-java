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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The number of items in the intent classification test.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/IntentClassificationTestResultItemCounts"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IntentClassificationTestResultItemCounts implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The total number of results in the intent classification test.
     * </p>
     */
    private Integer totalResultCount;
    /**
     * <p>
     * The number of matched, mismatched, and execution error results for speech transcription for the intent.
     * </p>
     */
    private java.util.Map<String, Integer> speechTranscriptionResultCounts;
    /**
     * <p>
     * The number of matched and mismatched results for intent recognition for the intent.
     * </p>
     */
    private java.util.Map<String, Integer> intentMatchResultCounts;

    /**
     * <p>
     * The total number of results in the intent classification test.
     * </p>
     * 
     * @param totalResultCount
     *        The total number of results in the intent classification test.
     */

    public void setTotalResultCount(Integer totalResultCount) {
        this.totalResultCount = totalResultCount;
    }

    /**
     * <p>
     * The total number of results in the intent classification test.
     * </p>
     * 
     * @return The total number of results in the intent classification test.
     */

    public Integer getTotalResultCount() {
        return this.totalResultCount;
    }

    /**
     * <p>
     * The total number of results in the intent classification test.
     * </p>
     * 
     * @param totalResultCount
     *        The total number of results in the intent classification test.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IntentClassificationTestResultItemCounts withTotalResultCount(Integer totalResultCount) {
        setTotalResultCount(totalResultCount);
        return this;
    }

    /**
     * <p>
     * The number of matched, mismatched, and execution error results for speech transcription for the intent.
     * </p>
     * 
     * @return The number of matched, mismatched, and execution error results for speech transcription for the intent.
     */

    public java.util.Map<String, Integer> getSpeechTranscriptionResultCounts() {
        return speechTranscriptionResultCounts;
    }

    /**
     * <p>
     * The number of matched, mismatched, and execution error results for speech transcription for the intent.
     * </p>
     * 
     * @param speechTranscriptionResultCounts
     *        The number of matched, mismatched, and execution error results for speech transcription for the intent.
     */

    public void setSpeechTranscriptionResultCounts(java.util.Map<String, Integer> speechTranscriptionResultCounts) {
        this.speechTranscriptionResultCounts = speechTranscriptionResultCounts;
    }

    /**
     * <p>
     * The number of matched, mismatched, and execution error results for speech transcription for the intent.
     * </p>
     * 
     * @param speechTranscriptionResultCounts
     *        The number of matched, mismatched, and execution error results for speech transcription for the intent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IntentClassificationTestResultItemCounts withSpeechTranscriptionResultCounts(java.util.Map<String, Integer> speechTranscriptionResultCounts) {
        setSpeechTranscriptionResultCounts(speechTranscriptionResultCounts);
        return this;
    }

    /**
     * Add a single SpeechTranscriptionResultCounts entry
     *
     * @see IntentClassificationTestResultItemCounts#withSpeechTranscriptionResultCounts
     * @returns a reference to this object so that method calls can be chained together.
     */

    public IntentClassificationTestResultItemCounts addSpeechTranscriptionResultCountsEntry(String key, Integer value) {
        if (null == this.speechTranscriptionResultCounts) {
            this.speechTranscriptionResultCounts = new java.util.HashMap<String, Integer>();
        }
        if (this.speechTranscriptionResultCounts.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.speechTranscriptionResultCounts.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into SpeechTranscriptionResultCounts.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IntentClassificationTestResultItemCounts clearSpeechTranscriptionResultCountsEntries() {
        this.speechTranscriptionResultCounts = null;
        return this;
    }

    /**
     * <p>
     * The number of matched and mismatched results for intent recognition for the intent.
     * </p>
     * 
     * @return The number of matched and mismatched results for intent recognition for the intent.
     */

    public java.util.Map<String, Integer> getIntentMatchResultCounts() {
        return intentMatchResultCounts;
    }

    /**
     * <p>
     * The number of matched and mismatched results for intent recognition for the intent.
     * </p>
     * 
     * @param intentMatchResultCounts
     *        The number of matched and mismatched results for intent recognition for the intent.
     */

    public void setIntentMatchResultCounts(java.util.Map<String, Integer> intentMatchResultCounts) {
        this.intentMatchResultCounts = intentMatchResultCounts;
    }

    /**
     * <p>
     * The number of matched and mismatched results for intent recognition for the intent.
     * </p>
     * 
     * @param intentMatchResultCounts
     *        The number of matched and mismatched results for intent recognition for the intent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IntentClassificationTestResultItemCounts withIntentMatchResultCounts(java.util.Map<String, Integer> intentMatchResultCounts) {
        setIntentMatchResultCounts(intentMatchResultCounts);
        return this;
    }

    /**
     * Add a single IntentMatchResultCounts entry
     *
     * @see IntentClassificationTestResultItemCounts#withIntentMatchResultCounts
     * @returns a reference to this object so that method calls can be chained together.
     */

    public IntentClassificationTestResultItemCounts addIntentMatchResultCountsEntry(String key, Integer value) {
        if (null == this.intentMatchResultCounts) {
            this.intentMatchResultCounts = new java.util.HashMap<String, Integer>();
        }
        if (this.intentMatchResultCounts.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.intentMatchResultCounts.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into IntentMatchResultCounts.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IntentClassificationTestResultItemCounts clearIntentMatchResultCountsEntries() {
        this.intentMatchResultCounts = null;
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
        if (getTotalResultCount() != null)
            sb.append("TotalResultCount: ").append(getTotalResultCount()).append(",");
        if (getSpeechTranscriptionResultCounts() != null)
            sb.append("SpeechTranscriptionResultCounts: ").append(getSpeechTranscriptionResultCounts()).append(",");
        if (getIntentMatchResultCounts() != null)
            sb.append("IntentMatchResultCounts: ").append(getIntentMatchResultCounts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IntentClassificationTestResultItemCounts == false)
            return false;
        IntentClassificationTestResultItemCounts other = (IntentClassificationTestResultItemCounts) obj;
        if (other.getTotalResultCount() == null ^ this.getTotalResultCount() == null)
            return false;
        if (other.getTotalResultCount() != null && other.getTotalResultCount().equals(this.getTotalResultCount()) == false)
            return false;
        if (other.getSpeechTranscriptionResultCounts() == null ^ this.getSpeechTranscriptionResultCounts() == null)
            return false;
        if (other.getSpeechTranscriptionResultCounts() != null
                && other.getSpeechTranscriptionResultCounts().equals(this.getSpeechTranscriptionResultCounts()) == false)
            return false;
        if (other.getIntentMatchResultCounts() == null ^ this.getIntentMatchResultCounts() == null)
            return false;
        if (other.getIntentMatchResultCounts() != null && other.getIntentMatchResultCounts().equals(this.getIntentMatchResultCounts()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTotalResultCount() == null) ? 0 : getTotalResultCount().hashCode());
        hashCode = prime * hashCode + ((getSpeechTranscriptionResultCounts() == null) ? 0 : getSpeechTranscriptionResultCounts().hashCode());
        hashCode = prime * hashCode + ((getIntentMatchResultCounts() == null) ? 0 : getIntentMatchResultCounts().hashCode());
        return hashCode;
    }

    @Override
    public IntentClassificationTestResultItemCounts clone() {
        try {
            return (IntentClassificationTestResultItemCounts) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.IntentClassificationTestResultItemCountsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
