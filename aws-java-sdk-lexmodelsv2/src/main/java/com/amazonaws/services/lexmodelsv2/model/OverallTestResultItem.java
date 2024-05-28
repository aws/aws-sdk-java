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
 * Information about the overall results for a test execution result.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/OverallTestResultItem"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OverallTestResultItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates whether the conversation contains multiple turns or not.
     * </p>
     */
    private Boolean multiTurnConversation;
    /**
     * <p>
     * The total number of overall results in the result of the test execution.
     * </p>
     */
    private Integer totalResultCount;
    /**
     * <p>
     * The number of speech transcription results in the overall test.
     * </p>
     */
    private java.util.Map<String, Integer> speechTranscriptionResultCounts;
    /**
     * <p>
     * The number of results that succeeded.
     * </p>
     */
    private java.util.Map<String, Integer> endToEndResultCounts;

    /**
     * <p>
     * Indicates whether the conversation contains multiple turns or not.
     * </p>
     * 
     * @param multiTurnConversation
     *        Indicates whether the conversation contains multiple turns or not.
     */

    public void setMultiTurnConversation(Boolean multiTurnConversation) {
        this.multiTurnConversation = multiTurnConversation;
    }

    /**
     * <p>
     * Indicates whether the conversation contains multiple turns or not.
     * </p>
     * 
     * @return Indicates whether the conversation contains multiple turns or not.
     */

    public Boolean getMultiTurnConversation() {
        return this.multiTurnConversation;
    }

    /**
     * <p>
     * Indicates whether the conversation contains multiple turns or not.
     * </p>
     * 
     * @param multiTurnConversation
     *        Indicates whether the conversation contains multiple turns or not.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OverallTestResultItem withMultiTurnConversation(Boolean multiTurnConversation) {
        setMultiTurnConversation(multiTurnConversation);
        return this;
    }

    /**
     * <p>
     * Indicates whether the conversation contains multiple turns or not.
     * </p>
     * 
     * @return Indicates whether the conversation contains multiple turns or not.
     */

    public Boolean isMultiTurnConversation() {
        return this.multiTurnConversation;
    }

    /**
     * <p>
     * The total number of overall results in the result of the test execution.
     * </p>
     * 
     * @param totalResultCount
     *        The total number of overall results in the result of the test execution.
     */

    public void setTotalResultCount(Integer totalResultCount) {
        this.totalResultCount = totalResultCount;
    }

    /**
     * <p>
     * The total number of overall results in the result of the test execution.
     * </p>
     * 
     * @return The total number of overall results in the result of the test execution.
     */

    public Integer getTotalResultCount() {
        return this.totalResultCount;
    }

    /**
     * <p>
     * The total number of overall results in the result of the test execution.
     * </p>
     * 
     * @param totalResultCount
     *        The total number of overall results in the result of the test execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OverallTestResultItem withTotalResultCount(Integer totalResultCount) {
        setTotalResultCount(totalResultCount);
        return this;
    }

    /**
     * <p>
     * The number of speech transcription results in the overall test.
     * </p>
     * 
     * @return The number of speech transcription results in the overall test.
     */

    public java.util.Map<String, Integer> getSpeechTranscriptionResultCounts() {
        return speechTranscriptionResultCounts;
    }

    /**
     * <p>
     * The number of speech transcription results in the overall test.
     * </p>
     * 
     * @param speechTranscriptionResultCounts
     *        The number of speech transcription results in the overall test.
     */

    public void setSpeechTranscriptionResultCounts(java.util.Map<String, Integer> speechTranscriptionResultCounts) {
        this.speechTranscriptionResultCounts = speechTranscriptionResultCounts;
    }

    /**
     * <p>
     * The number of speech transcription results in the overall test.
     * </p>
     * 
     * @param speechTranscriptionResultCounts
     *        The number of speech transcription results in the overall test.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OverallTestResultItem withSpeechTranscriptionResultCounts(java.util.Map<String, Integer> speechTranscriptionResultCounts) {
        setSpeechTranscriptionResultCounts(speechTranscriptionResultCounts);
        return this;
    }

    /**
     * Add a single SpeechTranscriptionResultCounts entry
     *
     * @see OverallTestResultItem#withSpeechTranscriptionResultCounts
     * @returns a reference to this object so that method calls can be chained together.
     */

    public OverallTestResultItem addSpeechTranscriptionResultCountsEntry(String key, Integer value) {
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

    public OverallTestResultItem clearSpeechTranscriptionResultCountsEntries() {
        this.speechTranscriptionResultCounts = null;
        return this;
    }

    /**
     * <p>
     * The number of results that succeeded.
     * </p>
     * 
     * @return The number of results that succeeded.
     */

    public java.util.Map<String, Integer> getEndToEndResultCounts() {
        return endToEndResultCounts;
    }

    /**
     * <p>
     * The number of results that succeeded.
     * </p>
     * 
     * @param endToEndResultCounts
     *        The number of results that succeeded.
     */

    public void setEndToEndResultCounts(java.util.Map<String, Integer> endToEndResultCounts) {
        this.endToEndResultCounts = endToEndResultCounts;
    }

    /**
     * <p>
     * The number of results that succeeded.
     * </p>
     * 
     * @param endToEndResultCounts
     *        The number of results that succeeded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OverallTestResultItem withEndToEndResultCounts(java.util.Map<String, Integer> endToEndResultCounts) {
        setEndToEndResultCounts(endToEndResultCounts);
        return this;
    }

    /**
     * Add a single EndToEndResultCounts entry
     *
     * @see OverallTestResultItem#withEndToEndResultCounts
     * @returns a reference to this object so that method calls can be chained together.
     */

    public OverallTestResultItem addEndToEndResultCountsEntry(String key, Integer value) {
        if (null == this.endToEndResultCounts) {
            this.endToEndResultCounts = new java.util.HashMap<String, Integer>();
        }
        if (this.endToEndResultCounts.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.endToEndResultCounts.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into EndToEndResultCounts.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OverallTestResultItem clearEndToEndResultCountsEntries() {
        this.endToEndResultCounts = null;
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
        if (getMultiTurnConversation() != null)
            sb.append("MultiTurnConversation: ").append(getMultiTurnConversation()).append(",");
        if (getTotalResultCount() != null)
            sb.append("TotalResultCount: ").append(getTotalResultCount()).append(",");
        if (getSpeechTranscriptionResultCounts() != null)
            sb.append("SpeechTranscriptionResultCounts: ").append(getSpeechTranscriptionResultCounts()).append(",");
        if (getEndToEndResultCounts() != null)
            sb.append("EndToEndResultCounts: ").append(getEndToEndResultCounts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OverallTestResultItem == false)
            return false;
        OverallTestResultItem other = (OverallTestResultItem) obj;
        if (other.getMultiTurnConversation() == null ^ this.getMultiTurnConversation() == null)
            return false;
        if (other.getMultiTurnConversation() != null && other.getMultiTurnConversation().equals(this.getMultiTurnConversation()) == false)
            return false;
        if (other.getTotalResultCount() == null ^ this.getTotalResultCount() == null)
            return false;
        if (other.getTotalResultCount() != null && other.getTotalResultCount().equals(this.getTotalResultCount()) == false)
            return false;
        if (other.getSpeechTranscriptionResultCounts() == null ^ this.getSpeechTranscriptionResultCounts() == null)
            return false;
        if (other.getSpeechTranscriptionResultCounts() != null
                && other.getSpeechTranscriptionResultCounts().equals(this.getSpeechTranscriptionResultCounts()) == false)
            return false;
        if (other.getEndToEndResultCounts() == null ^ this.getEndToEndResultCounts() == null)
            return false;
        if (other.getEndToEndResultCounts() != null && other.getEndToEndResultCounts().equals(this.getEndToEndResultCounts()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMultiTurnConversation() == null) ? 0 : getMultiTurnConversation().hashCode());
        hashCode = prime * hashCode + ((getTotalResultCount() == null) ? 0 : getTotalResultCount().hashCode());
        hashCode = prime * hashCode + ((getSpeechTranscriptionResultCounts() == null) ? 0 : getSpeechTranscriptionResultCounts().hashCode());
        hashCode = prime * hashCode + ((getEndToEndResultCounts() == null) ? 0 : getEndToEndResultCounts().hashCode());
        return hashCode;
    }

    @Override
    public OverallTestResultItem clone() {
        try {
            return (OverallTestResultItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.OverallTestResultItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
