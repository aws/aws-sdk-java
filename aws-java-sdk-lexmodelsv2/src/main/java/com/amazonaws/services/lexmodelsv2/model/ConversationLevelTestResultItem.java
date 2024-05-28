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
 * The test result evaluation item at the conversation level.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ConversationLevelTestResultItem"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConversationLevelTestResultItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The conversation Id of the test result evaluation item.
     * </p>
     */
    private String conversationId;
    /**
     * <p>
     * The end-to-end success or failure of the test result evaluation item.
     * </p>
     */
    private String endToEndResult;
    /**
     * <p>
     * The speech transcription success or failure of the test result evaluation item.
     * </p>
     */
    private String speechTranscriptionResult;
    /**
     * <p>
     * The intent classification of the test result evaluation item.
     * </p>
     */
    private java.util.List<ConversationLevelIntentClassificationResultItem> intentClassificationResults;
    /**
     * <p>
     * The slot success or failure of the test result evaluation item.
     * </p>
     */
    private java.util.List<ConversationLevelSlotResolutionResultItem> slotResolutionResults;

    /**
     * <p>
     * The conversation Id of the test result evaluation item.
     * </p>
     * 
     * @param conversationId
     *        The conversation Id of the test result evaluation item.
     */

    public void setConversationId(String conversationId) {
        this.conversationId = conversationId;
    }

    /**
     * <p>
     * The conversation Id of the test result evaluation item.
     * </p>
     * 
     * @return The conversation Id of the test result evaluation item.
     */

    public String getConversationId() {
        return this.conversationId;
    }

    /**
     * <p>
     * The conversation Id of the test result evaluation item.
     * </p>
     * 
     * @param conversationId
     *        The conversation Id of the test result evaluation item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConversationLevelTestResultItem withConversationId(String conversationId) {
        setConversationId(conversationId);
        return this;
    }

    /**
     * <p>
     * The end-to-end success or failure of the test result evaluation item.
     * </p>
     * 
     * @param endToEndResult
     *        The end-to-end success or failure of the test result evaluation item.
     * @see TestResultMatchStatus
     */

    public void setEndToEndResult(String endToEndResult) {
        this.endToEndResult = endToEndResult;
    }

    /**
     * <p>
     * The end-to-end success or failure of the test result evaluation item.
     * </p>
     * 
     * @return The end-to-end success or failure of the test result evaluation item.
     * @see TestResultMatchStatus
     */

    public String getEndToEndResult() {
        return this.endToEndResult;
    }

    /**
     * <p>
     * The end-to-end success or failure of the test result evaluation item.
     * </p>
     * 
     * @param endToEndResult
     *        The end-to-end success or failure of the test result evaluation item.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TestResultMatchStatus
     */

    public ConversationLevelTestResultItem withEndToEndResult(String endToEndResult) {
        setEndToEndResult(endToEndResult);
        return this;
    }

    /**
     * <p>
     * The end-to-end success or failure of the test result evaluation item.
     * </p>
     * 
     * @param endToEndResult
     *        The end-to-end success or failure of the test result evaluation item.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TestResultMatchStatus
     */

    public ConversationLevelTestResultItem withEndToEndResult(TestResultMatchStatus endToEndResult) {
        this.endToEndResult = endToEndResult.toString();
        return this;
    }

    /**
     * <p>
     * The speech transcription success or failure of the test result evaluation item.
     * </p>
     * 
     * @param speechTranscriptionResult
     *        The speech transcription success or failure of the test result evaluation item.
     * @see TestResultMatchStatus
     */

    public void setSpeechTranscriptionResult(String speechTranscriptionResult) {
        this.speechTranscriptionResult = speechTranscriptionResult;
    }

    /**
     * <p>
     * The speech transcription success or failure of the test result evaluation item.
     * </p>
     * 
     * @return The speech transcription success or failure of the test result evaluation item.
     * @see TestResultMatchStatus
     */

    public String getSpeechTranscriptionResult() {
        return this.speechTranscriptionResult;
    }

    /**
     * <p>
     * The speech transcription success or failure of the test result evaluation item.
     * </p>
     * 
     * @param speechTranscriptionResult
     *        The speech transcription success or failure of the test result evaluation item.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TestResultMatchStatus
     */

    public ConversationLevelTestResultItem withSpeechTranscriptionResult(String speechTranscriptionResult) {
        setSpeechTranscriptionResult(speechTranscriptionResult);
        return this;
    }

    /**
     * <p>
     * The speech transcription success or failure of the test result evaluation item.
     * </p>
     * 
     * @param speechTranscriptionResult
     *        The speech transcription success or failure of the test result evaluation item.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TestResultMatchStatus
     */

    public ConversationLevelTestResultItem withSpeechTranscriptionResult(TestResultMatchStatus speechTranscriptionResult) {
        this.speechTranscriptionResult = speechTranscriptionResult.toString();
        return this;
    }

    /**
     * <p>
     * The intent classification of the test result evaluation item.
     * </p>
     * 
     * @return The intent classification of the test result evaluation item.
     */

    public java.util.List<ConversationLevelIntentClassificationResultItem> getIntentClassificationResults() {
        return intentClassificationResults;
    }

    /**
     * <p>
     * The intent classification of the test result evaluation item.
     * </p>
     * 
     * @param intentClassificationResults
     *        The intent classification of the test result evaluation item.
     */

    public void setIntentClassificationResults(java.util.Collection<ConversationLevelIntentClassificationResultItem> intentClassificationResults) {
        if (intentClassificationResults == null) {
            this.intentClassificationResults = null;
            return;
        }

        this.intentClassificationResults = new java.util.ArrayList<ConversationLevelIntentClassificationResultItem>(intentClassificationResults);
    }

    /**
     * <p>
     * The intent classification of the test result evaluation item.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIntentClassificationResults(java.util.Collection)} or
     * {@link #withIntentClassificationResults(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param intentClassificationResults
     *        The intent classification of the test result evaluation item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConversationLevelTestResultItem withIntentClassificationResults(ConversationLevelIntentClassificationResultItem... intentClassificationResults) {
        if (this.intentClassificationResults == null) {
            setIntentClassificationResults(new java.util.ArrayList<ConversationLevelIntentClassificationResultItem>(intentClassificationResults.length));
        }
        for (ConversationLevelIntentClassificationResultItem ele : intentClassificationResults) {
            this.intentClassificationResults.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The intent classification of the test result evaluation item.
     * </p>
     * 
     * @param intentClassificationResults
     *        The intent classification of the test result evaluation item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConversationLevelTestResultItem withIntentClassificationResults(
            java.util.Collection<ConversationLevelIntentClassificationResultItem> intentClassificationResults) {
        setIntentClassificationResults(intentClassificationResults);
        return this;
    }

    /**
     * <p>
     * The slot success or failure of the test result evaluation item.
     * </p>
     * 
     * @return The slot success or failure of the test result evaluation item.
     */

    public java.util.List<ConversationLevelSlotResolutionResultItem> getSlotResolutionResults() {
        return slotResolutionResults;
    }

    /**
     * <p>
     * The slot success or failure of the test result evaluation item.
     * </p>
     * 
     * @param slotResolutionResults
     *        The slot success or failure of the test result evaluation item.
     */

    public void setSlotResolutionResults(java.util.Collection<ConversationLevelSlotResolutionResultItem> slotResolutionResults) {
        if (slotResolutionResults == null) {
            this.slotResolutionResults = null;
            return;
        }

        this.slotResolutionResults = new java.util.ArrayList<ConversationLevelSlotResolutionResultItem>(slotResolutionResults);
    }

    /**
     * <p>
     * The slot success or failure of the test result evaluation item.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSlotResolutionResults(java.util.Collection)} or
     * {@link #withSlotResolutionResults(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param slotResolutionResults
     *        The slot success or failure of the test result evaluation item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConversationLevelTestResultItem withSlotResolutionResults(ConversationLevelSlotResolutionResultItem... slotResolutionResults) {
        if (this.slotResolutionResults == null) {
            setSlotResolutionResults(new java.util.ArrayList<ConversationLevelSlotResolutionResultItem>(slotResolutionResults.length));
        }
        for (ConversationLevelSlotResolutionResultItem ele : slotResolutionResults) {
            this.slotResolutionResults.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The slot success or failure of the test result evaluation item.
     * </p>
     * 
     * @param slotResolutionResults
     *        The slot success or failure of the test result evaluation item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConversationLevelTestResultItem withSlotResolutionResults(java.util.Collection<ConversationLevelSlotResolutionResultItem> slotResolutionResults) {
        setSlotResolutionResults(slotResolutionResults);
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
        if (getConversationId() != null)
            sb.append("ConversationId: ").append(getConversationId()).append(",");
        if (getEndToEndResult() != null)
            sb.append("EndToEndResult: ").append(getEndToEndResult()).append(",");
        if (getSpeechTranscriptionResult() != null)
            sb.append("SpeechTranscriptionResult: ").append(getSpeechTranscriptionResult()).append(",");
        if (getIntentClassificationResults() != null)
            sb.append("IntentClassificationResults: ").append(getIntentClassificationResults()).append(",");
        if (getSlotResolutionResults() != null)
            sb.append("SlotResolutionResults: ").append(getSlotResolutionResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConversationLevelTestResultItem == false)
            return false;
        ConversationLevelTestResultItem other = (ConversationLevelTestResultItem) obj;
        if (other.getConversationId() == null ^ this.getConversationId() == null)
            return false;
        if (other.getConversationId() != null && other.getConversationId().equals(this.getConversationId()) == false)
            return false;
        if (other.getEndToEndResult() == null ^ this.getEndToEndResult() == null)
            return false;
        if (other.getEndToEndResult() != null && other.getEndToEndResult().equals(this.getEndToEndResult()) == false)
            return false;
        if (other.getSpeechTranscriptionResult() == null ^ this.getSpeechTranscriptionResult() == null)
            return false;
        if (other.getSpeechTranscriptionResult() != null && other.getSpeechTranscriptionResult().equals(this.getSpeechTranscriptionResult()) == false)
            return false;
        if (other.getIntentClassificationResults() == null ^ this.getIntentClassificationResults() == null)
            return false;
        if (other.getIntentClassificationResults() != null && other.getIntentClassificationResults().equals(this.getIntentClassificationResults()) == false)
            return false;
        if (other.getSlotResolutionResults() == null ^ this.getSlotResolutionResults() == null)
            return false;
        if (other.getSlotResolutionResults() != null && other.getSlotResolutionResults().equals(this.getSlotResolutionResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConversationId() == null) ? 0 : getConversationId().hashCode());
        hashCode = prime * hashCode + ((getEndToEndResult() == null) ? 0 : getEndToEndResult().hashCode());
        hashCode = prime * hashCode + ((getSpeechTranscriptionResult() == null) ? 0 : getSpeechTranscriptionResult().hashCode());
        hashCode = prime * hashCode + ((getIntentClassificationResults() == null) ? 0 : getIntentClassificationResults().hashCode());
        hashCode = prime * hashCode + ((getSlotResolutionResults() == null) ? 0 : getSlotResolutionResults().hashCode());
        return hashCode;
    }

    @Override
    public ConversationLevelTestResultItem clone() {
        try {
            return (ConversationLevelTestResultItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.ConversationLevelTestResultItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
