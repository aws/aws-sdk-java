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
 * Contains the results for the user turn by the test execution.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/UserTurnResult" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UserTurnResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Contains information about the user messages in the turn in the input.
     * </p>
     */
    private UserTurnInputSpecification input;
    /**
     * <p>
     * Contains information about the expected output for the user turn.
     * </p>
     */
    private UserTurnOutputSpecification expectedOutput;
    /**
     * <p>
     * Contains information about the actual output for the user turn.
     * </p>
     */
    private UserTurnOutputSpecification actualOutput;

    private ExecutionErrorDetails errorDetails;
    /**
     * <p>
     * Specifies whether the expected and actual outputs match or not, or if there is an error in execution.
     * </p>
     */
    private String endToEndResult;
    /**
     * <p>
     * Specifies whether the expected and actual intents match or not.
     * </p>
     */
    private String intentMatchResult;
    /**
     * <p>
     * Specifies whether the expected and actual slots match or not.
     * </p>
     */
    private String slotMatchResult;
    /**
     * <p>
     * Specifies whether the expected and actual speech transcriptions match or not, or if there is an error in
     * execution.
     * </p>
     */
    private String speechTranscriptionResult;
    /**
     * <p>
     * Contains information about the results related to the conversation associated with the user turn.
     * </p>
     */
    private ConversationLevelResultDetail conversationLevelResult;

    /**
     * <p>
     * Contains information about the user messages in the turn in the input.
     * </p>
     * 
     * @param input
     *        Contains information about the user messages in the turn in the input.
     */

    public void setInput(UserTurnInputSpecification input) {
        this.input = input;
    }

    /**
     * <p>
     * Contains information about the user messages in the turn in the input.
     * </p>
     * 
     * @return Contains information about the user messages in the turn in the input.
     */

    public UserTurnInputSpecification getInput() {
        return this.input;
    }

    /**
     * <p>
     * Contains information about the user messages in the turn in the input.
     * </p>
     * 
     * @param input
     *        Contains information about the user messages in the turn in the input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserTurnResult withInput(UserTurnInputSpecification input) {
        setInput(input);
        return this;
    }

    /**
     * <p>
     * Contains information about the expected output for the user turn.
     * </p>
     * 
     * @param expectedOutput
     *        Contains information about the expected output for the user turn.
     */

    public void setExpectedOutput(UserTurnOutputSpecification expectedOutput) {
        this.expectedOutput = expectedOutput;
    }

    /**
     * <p>
     * Contains information about the expected output for the user turn.
     * </p>
     * 
     * @return Contains information about the expected output for the user turn.
     */

    public UserTurnOutputSpecification getExpectedOutput() {
        return this.expectedOutput;
    }

    /**
     * <p>
     * Contains information about the expected output for the user turn.
     * </p>
     * 
     * @param expectedOutput
     *        Contains information about the expected output for the user turn.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserTurnResult withExpectedOutput(UserTurnOutputSpecification expectedOutput) {
        setExpectedOutput(expectedOutput);
        return this;
    }

    /**
     * <p>
     * Contains information about the actual output for the user turn.
     * </p>
     * 
     * @param actualOutput
     *        Contains information about the actual output for the user turn.
     */

    public void setActualOutput(UserTurnOutputSpecification actualOutput) {
        this.actualOutput = actualOutput;
    }

    /**
     * <p>
     * Contains information about the actual output for the user turn.
     * </p>
     * 
     * @return Contains information about the actual output for the user turn.
     */

    public UserTurnOutputSpecification getActualOutput() {
        return this.actualOutput;
    }

    /**
     * <p>
     * Contains information about the actual output for the user turn.
     * </p>
     * 
     * @param actualOutput
     *        Contains information about the actual output for the user turn.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserTurnResult withActualOutput(UserTurnOutputSpecification actualOutput) {
        setActualOutput(actualOutput);
        return this;
    }

    /**
     * @param errorDetails
     */

    public void setErrorDetails(ExecutionErrorDetails errorDetails) {
        this.errorDetails = errorDetails;
    }

    /**
     * @return
     */

    public ExecutionErrorDetails getErrorDetails() {
        return this.errorDetails;
    }

    /**
     * @param errorDetails
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserTurnResult withErrorDetails(ExecutionErrorDetails errorDetails) {
        setErrorDetails(errorDetails);
        return this;
    }

    /**
     * <p>
     * Specifies whether the expected and actual outputs match or not, or if there is an error in execution.
     * </p>
     * 
     * @param endToEndResult
     *        Specifies whether the expected and actual outputs match or not, or if there is an error in execution.
     * @see TestResultMatchStatus
     */

    public void setEndToEndResult(String endToEndResult) {
        this.endToEndResult = endToEndResult;
    }

    /**
     * <p>
     * Specifies whether the expected and actual outputs match or not, or if there is an error in execution.
     * </p>
     * 
     * @return Specifies whether the expected and actual outputs match or not, or if there is an error in execution.
     * @see TestResultMatchStatus
     */

    public String getEndToEndResult() {
        return this.endToEndResult;
    }

    /**
     * <p>
     * Specifies whether the expected and actual outputs match or not, or if there is an error in execution.
     * </p>
     * 
     * @param endToEndResult
     *        Specifies whether the expected and actual outputs match or not, or if there is an error in execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TestResultMatchStatus
     */

    public UserTurnResult withEndToEndResult(String endToEndResult) {
        setEndToEndResult(endToEndResult);
        return this;
    }

    /**
     * <p>
     * Specifies whether the expected and actual outputs match or not, or if there is an error in execution.
     * </p>
     * 
     * @param endToEndResult
     *        Specifies whether the expected and actual outputs match or not, or if there is an error in execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TestResultMatchStatus
     */

    public UserTurnResult withEndToEndResult(TestResultMatchStatus endToEndResult) {
        this.endToEndResult = endToEndResult.toString();
        return this;
    }

    /**
     * <p>
     * Specifies whether the expected and actual intents match or not.
     * </p>
     * 
     * @param intentMatchResult
     *        Specifies whether the expected and actual intents match or not.
     * @see TestResultMatchStatus
     */

    public void setIntentMatchResult(String intentMatchResult) {
        this.intentMatchResult = intentMatchResult;
    }

    /**
     * <p>
     * Specifies whether the expected and actual intents match or not.
     * </p>
     * 
     * @return Specifies whether the expected and actual intents match or not.
     * @see TestResultMatchStatus
     */

    public String getIntentMatchResult() {
        return this.intentMatchResult;
    }

    /**
     * <p>
     * Specifies whether the expected and actual intents match or not.
     * </p>
     * 
     * @param intentMatchResult
     *        Specifies whether the expected and actual intents match or not.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TestResultMatchStatus
     */

    public UserTurnResult withIntentMatchResult(String intentMatchResult) {
        setIntentMatchResult(intentMatchResult);
        return this;
    }

    /**
     * <p>
     * Specifies whether the expected and actual intents match or not.
     * </p>
     * 
     * @param intentMatchResult
     *        Specifies whether the expected and actual intents match or not.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TestResultMatchStatus
     */

    public UserTurnResult withIntentMatchResult(TestResultMatchStatus intentMatchResult) {
        this.intentMatchResult = intentMatchResult.toString();
        return this;
    }

    /**
     * <p>
     * Specifies whether the expected and actual slots match or not.
     * </p>
     * 
     * @param slotMatchResult
     *        Specifies whether the expected and actual slots match or not.
     * @see TestResultMatchStatus
     */

    public void setSlotMatchResult(String slotMatchResult) {
        this.slotMatchResult = slotMatchResult;
    }

    /**
     * <p>
     * Specifies whether the expected and actual slots match or not.
     * </p>
     * 
     * @return Specifies whether the expected and actual slots match or not.
     * @see TestResultMatchStatus
     */

    public String getSlotMatchResult() {
        return this.slotMatchResult;
    }

    /**
     * <p>
     * Specifies whether the expected and actual slots match or not.
     * </p>
     * 
     * @param slotMatchResult
     *        Specifies whether the expected and actual slots match or not.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TestResultMatchStatus
     */

    public UserTurnResult withSlotMatchResult(String slotMatchResult) {
        setSlotMatchResult(slotMatchResult);
        return this;
    }

    /**
     * <p>
     * Specifies whether the expected and actual slots match or not.
     * </p>
     * 
     * @param slotMatchResult
     *        Specifies whether the expected and actual slots match or not.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TestResultMatchStatus
     */

    public UserTurnResult withSlotMatchResult(TestResultMatchStatus slotMatchResult) {
        this.slotMatchResult = slotMatchResult.toString();
        return this;
    }

    /**
     * <p>
     * Specifies whether the expected and actual speech transcriptions match or not, or if there is an error in
     * execution.
     * </p>
     * 
     * @param speechTranscriptionResult
     *        Specifies whether the expected and actual speech transcriptions match or not, or if there is an error in
     *        execution.
     * @see TestResultMatchStatus
     */

    public void setSpeechTranscriptionResult(String speechTranscriptionResult) {
        this.speechTranscriptionResult = speechTranscriptionResult;
    }

    /**
     * <p>
     * Specifies whether the expected and actual speech transcriptions match or not, or if there is an error in
     * execution.
     * </p>
     * 
     * @return Specifies whether the expected and actual speech transcriptions match or not, or if there is an error in
     *         execution.
     * @see TestResultMatchStatus
     */

    public String getSpeechTranscriptionResult() {
        return this.speechTranscriptionResult;
    }

    /**
     * <p>
     * Specifies whether the expected and actual speech transcriptions match or not, or if there is an error in
     * execution.
     * </p>
     * 
     * @param speechTranscriptionResult
     *        Specifies whether the expected and actual speech transcriptions match or not, or if there is an error in
     *        execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TestResultMatchStatus
     */

    public UserTurnResult withSpeechTranscriptionResult(String speechTranscriptionResult) {
        setSpeechTranscriptionResult(speechTranscriptionResult);
        return this;
    }

    /**
     * <p>
     * Specifies whether the expected and actual speech transcriptions match or not, or if there is an error in
     * execution.
     * </p>
     * 
     * @param speechTranscriptionResult
     *        Specifies whether the expected and actual speech transcriptions match or not, or if there is an error in
     *        execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TestResultMatchStatus
     */

    public UserTurnResult withSpeechTranscriptionResult(TestResultMatchStatus speechTranscriptionResult) {
        this.speechTranscriptionResult = speechTranscriptionResult.toString();
        return this;
    }

    /**
     * <p>
     * Contains information about the results related to the conversation associated with the user turn.
     * </p>
     * 
     * @param conversationLevelResult
     *        Contains information about the results related to the conversation associated with the user turn.
     */

    public void setConversationLevelResult(ConversationLevelResultDetail conversationLevelResult) {
        this.conversationLevelResult = conversationLevelResult;
    }

    /**
     * <p>
     * Contains information about the results related to the conversation associated with the user turn.
     * </p>
     * 
     * @return Contains information about the results related to the conversation associated with the user turn.
     */

    public ConversationLevelResultDetail getConversationLevelResult() {
        return this.conversationLevelResult;
    }

    /**
     * <p>
     * Contains information about the results related to the conversation associated with the user turn.
     * </p>
     * 
     * @param conversationLevelResult
     *        Contains information about the results related to the conversation associated with the user turn.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserTurnResult withConversationLevelResult(ConversationLevelResultDetail conversationLevelResult) {
        setConversationLevelResult(conversationLevelResult);
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
        if (getInput() != null)
            sb.append("Input: ").append(getInput()).append(",");
        if (getExpectedOutput() != null)
            sb.append("ExpectedOutput: ").append(getExpectedOutput()).append(",");
        if (getActualOutput() != null)
            sb.append("ActualOutput: ").append(getActualOutput()).append(",");
        if (getErrorDetails() != null)
            sb.append("ErrorDetails: ").append(getErrorDetails()).append(",");
        if (getEndToEndResult() != null)
            sb.append("EndToEndResult: ").append(getEndToEndResult()).append(",");
        if (getIntentMatchResult() != null)
            sb.append("IntentMatchResult: ").append(getIntentMatchResult()).append(",");
        if (getSlotMatchResult() != null)
            sb.append("SlotMatchResult: ").append(getSlotMatchResult()).append(",");
        if (getSpeechTranscriptionResult() != null)
            sb.append("SpeechTranscriptionResult: ").append(getSpeechTranscriptionResult()).append(",");
        if (getConversationLevelResult() != null)
            sb.append("ConversationLevelResult: ").append(getConversationLevelResult());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UserTurnResult == false)
            return false;
        UserTurnResult other = (UserTurnResult) obj;
        if (other.getInput() == null ^ this.getInput() == null)
            return false;
        if (other.getInput() != null && other.getInput().equals(this.getInput()) == false)
            return false;
        if (other.getExpectedOutput() == null ^ this.getExpectedOutput() == null)
            return false;
        if (other.getExpectedOutput() != null && other.getExpectedOutput().equals(this.getExpectedOutput()) == false)
            return false;
        if (other.getActualOutput() == null ^ this.getActualOutput() == null)
            return false;
        if (other.getActualOutput() != null && other.getActualOutput().equals(this.getActualOutput()) == false)
            return false;
        if (other.getErrorDetails() == null ^ this.getErrorDetails() == null)
            return false;
        if (other.getErrorDetails() != null && other.getErrorDetails().equals(this.getErrorDetails()) == false)
            return false;
        if (other.getEndToEndResult() == null ^ this.getEndToEndResult() == null)
            return false;
        if (other.getEndToEndResult() != null && other.getEndToEndResult().equals(this.getEndToEndResult()) == false)
            return false;
        if (other.getIntentMatchResult() == null ^ this.getIntentMatchResult() == null)
            return false;
        if (other.getIntentMatchResult() != null && other.getIntentMatchResult().equals(this.getIntentMatchResult()) == false)
            return false;
        if (other.getSlotMatchResult() == null ^ this.getSlotMatchResult() == null)
            return false;
        if (other.getSlotMatchResult() != null && other.getSlotMatchResult().equals(this.getSlotMatchResult()) == false)
            return false;
        if (other.getSpeechTranscriptionResult() == null ^ this.getSpeechTranscriptionResult() == null)
            return false;
        if (other.getSpeechTranscriptionResult() != null && other.getSpeechTranscriptionResult().equals(this.getSpeechTranscriptionResult()) == false)
            return false;
        if (other.getConversationLevelResult() == null ^ this.getConversationLevelResult() == null)
            return false;
        if (other.getConversationLevelResult() != null && other.getConversationLevelResult().equals(this.getConversationLevelResult()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInput() == null) ? 0 : getInput().hashCode());
        hashCode = prime * hashCode + ((getExpectedOutput() == null) ? 0 : getExpectedOutput().hashCode());
        hashCode = prime * hashCode + ((getActualOutput() == null) ? 0 : getActualOutput().hashCode());
        hashCode = prime * hashCode + ((getErrorDetails() == null) ? 0 : getErrorDetails().hashCode());
        hashCode = prime * hashCode + ((getEndToEndResult() == null) ? 0 : getEndToEndResult().hashCode());
        hashCode = prime * hashCode + ((getIntentMatchResult() == null) ? 0 : getIntentMatchResult().hashCode());
        hashCode = prime * hashCode + ((getSlotMatchResult() == null) ? 0 : getSlotMatchResult().hashCode());
        hashCode = prime * hashCode + ((getSpeechTranscriptionResult() == null) ? 0 : getSpeechTranscriptionResult().hashCode());
        hashCode = prime * hashCode + ((getConversationLevelResult() == null) ? 0 : getConversationLevelResult().hashCode());
        return hashCode;
    }

    @Override
    public UserTurnResult clone() {
        try {
            return (UserTurnResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.UserTurnResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
