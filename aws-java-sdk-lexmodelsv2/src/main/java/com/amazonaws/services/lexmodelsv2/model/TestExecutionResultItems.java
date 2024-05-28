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
 * Contains the results of the test execution, grouped by type of results. See <a
 * href="https://docs.aws.amazon.com/lexv2/latest/dg/test-results-details-test-set.html">Test result details"&gt;Test
 * results details</a> for details about different types of results.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/TestExecutionResultItems"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TestExecutionResultItems implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Overall results for the test execution, including the breakdown of conversations and single-input utterances.
     * </p>
     */
    private OverallTestResults overallTestResults;
    /**
     * <p>
     * Results related to conversations in the test set, including metrics about success and failure of conversations
     * and intent and slot failures.
     * </p>
     */
    private ConversationLevelTestResults conversationLevelTestResults;
    /**
     * <p>
     * Intent recognition results aggregated by intent name. The aggregated results contain success and failure rates of
     * intent recognition, speech transcriptions, and end-to-end conversations.
     * </p>
     */
    private IntentClassificationTestResults intentClassificationTestResults;
    /**
     * <p>
     * Slot resolution results aggregated by intent and slot name. The aggregated results contain success and failure
     * rates of slot resolution, speech transcriptions, and end-to-end conversations
     * </p>
     */
    private IntentLevelSlotResolutionTestResults intentLevelSlotResolutionTestResults;
    /**
     * <p>
     * Results related to utterances in the test set.
     * </p>
     */
    private UtteranceLevelTestResults utteranceLevelTestResults;

    /**
     * <p>
     * Overall results for the test execution, including the breakdown of conversations and single-input utterances.
     * </p>
     * 
     * @param overallTestResults
     *        Overall results for the test execution, including the breakdown of conversations and single-input
     *        utterances.
     */

    public void setOverallTestResults(OverallTestResults overallTestResults) {
        this.overallTestResults = overallTestResults;
    }

    /**
     * <p>
     * Overall results for the test execution, including the breakdown of conversations and single-input utterances.
     * </p>
     * 
     * @return Overall results for the test execution, including the breakdown of conversations and single-input
     *         utterances.
     */

    public OverallTestResults getOverallTestResults() {
        return this.overallTestResults;
    }

    /**
     * <p>
     * Overall results for the test execution, including the breakdown of conversations and single-input utterances.
     * </p>
     * 
     * @param overallTestResults
     *        Overall results for the test execution, including the breakdown of conversations and single-input
     *        utterances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestExecutionResultItems withOverallTestResults(OverallTestResults overallTestResults) {
        setOverallTestResults(overallTestResults);
        return this;
    }

    /**
     * <p>
     * Results related to conversations in the test set, including metrics about success and failure of conversations
     * and intent and slot failures.
     * </p>
     * 
     * @param conversationLevelTestResults
     *        Results related to conversations in the test set, including metrics about success and failure of
     *        conversations and intent and slot failures.
     */

    public void setConversationLevelTestResults(ConversationLevelTestResults conversationLevelTestResults) {
        this.conversationLevelTestResults = conversationLevelTestResults;
    }

    /**
     * <p>
     * Results related to conversations in the test set, including metrics about success and failure of conversations
     * and intent and slot failures.
     * </p>
     * 
     * @return Results related to conversations in the test set, including metrics about success and failure of
     *         conversations and intent and slot failures.
     */

    public ConversationLevelTestResults getConversationLevelTestResults() {
        return this.conversationLevelTestResults;
    }

    /**
     * <p>
     * Results related to conversations in the test set, including metrics about success and failure of conversations
     * and intent and slot failures.
     * </p>
     * 
     * @param conversationLevelTestResults
     *        Results related to conversations in the test set, including metrics about success and failure of
     *        conversations and intent and slot failures.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestExecutionResultItems withConversationLevelTestResults(ConversationLevelTestResults conversationLevelTestResults) {
        setConversationLevelTestResults(conversationLevelTestResults);
        return this;
    }

    /**
     * <p>
     * Intent recognition results aggregated by intent name. The aggregated results contain success and failure rates of
     * intent recognition, speech transcriptions, and end-to-end conversations.
     * </p>
     * 
     * @param intentClassificationTestResults
     *        Intent recognition results aggregated by intent name. The aggregated results contain success and failure
     *        rates of intent recognition, speech transcriptions, and end-to-end conversations.
     */

    public void setIntentClassificationTestResults(IntentClassificationTestResults intentClassificationTestResults) {
        this.intentClassificationTestResults = intentClassificationTestResults;
    }

    /**
     * <p>
     * Intent recognition results aggregated by intent name. The aggregated results contain success and failure rates of
     * intent recognition, speech transcriptions, and end-to-end conversations.
     * </p>
     * 
     * @return Intent recognition results aggregated by intent name. The aggregated results contain success and failure
     *         rates of intent recognition, speech transcriptions, and end-to-end conversations.
     */

    public IntentClassificationTestResults getIntentClassificationTestResults() {
        return this.intentClassificationTestResults;
    }

    /**
     * <p>
     * Intent recognition results aggregated by intent name. The aggregated results contain success and failure rates of
     * intent recognition, speech transcriptions, and end-to-end conversations.
     * </p>
     * 
     * @param intentClassificationTestResults
     *        Intent recognition results aggregated by intent name. The aggregated results contain success and failure
     *        rates of intent recognition, speech transcriptions, and end-to-end conversations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestExecutionResultItems withIntentClassificationTestResults(IntentClassificationTestResults intentClassificationTestResults) {
        setIntentClassificationTestResults(intentClassificationTestResults);
        return this;
    }

    /**
     * <p>
     * Slot resolution results aggregated by intent and slot name. The aggregated results contain success and failure
     * rates of slot resolution, speech transcriptions, and end-to-end conversations
     * </p>
     * 
     * @param intentLevelSlotResolutionTestResults
     *        Slot resolution results aggregated by intent and slot name. The aggregated results contain success and
     *        failure rates of slot resolution, speech transcriptions, and end-to-end conversations
     */

    public void setIntentLevelSlotResolutionTestResults(IntentLevelSlotResolutionTestResults intentLevelSlotResolutionTestResults) {
        this.intentLevelSlotResolutionTestResults = intentLevelSlotResolutionTestResults;
    }

    /**
     * <p>
     * Slot resolution results aggregated by intent and slot name. The aggregated results contain success and failure
     * rates of slot resolution, speech transcriptions, and end-to-end conversations
     * </p>
     * 
     * @return Slot resolution results aggregated by intent and slot name. The aggregated results contain success and
     *         failure rates of slot resolution, speech transcriptions, and end-to-end conversations
     */

    public IntentLevelSlotResolutionTestResults getIntentLevelSlotResolutionTestResults() {
        return this.intentLevelSlotResolutionTestResults;
    }

    /**
     * <p>
     * Slot resolution results aggregated by intent and slot name. The aggregated results contain success and failure
     * rates of slot resolution, speech transcriptions, and end-to-end conversations
     * </p>
     * 
     * @param intentLevelSlotResolutionTestResults
     *        Slot resolution results aggregated by intent and slot name. The aggregated results contain success and
     *        failure rates of slot resolution, speech transcriptions, and end-to-end conversations
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestExecutionResultItems withIntentLevelSlotResolutionTestResults(IntentLevelSlotResolutionTestResults intentLevelSlotResolutionTestResults) {
        setIntentLevelSlotResolutionTestResults(intentLevelSlotResolutionTestResults);
        return this;
    }

    /**
     * <p>
     * Results related to utterances in the test set.
     * </p>
     * 
     * @param utteranceLevelTestResults
     *        Results related to utterances in the test set.
     */

    public void setUtteranceLevelTestResults(UtteranceLevelTestResults utteranceLevelTestResults) {
        this.utteranceLevelTestResults = utteranceLevelTestResults;
    }

    /**
     * <p>
     * Results related to utterances in the test set.
     * </p>
     * 
     * @return Results related to utterances in the test set.
     */

    public UtteranceLevelTestResults getUtteranceLevelTestResults() {
        return this.utteranceLevelTestResults;
    }

    /**
     * <p>
     * Results related to utterances in the test set.
     * </p>
     * 
     * @param utteranceLevelTestResults
     *        Results related to utterances in the test set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestExecutionResultItems withUtteranceLevelTestResults(UtteranceLevelTestResults utteranceLevelTestResults) {
        setUtteranceLevelTestResults(utteranceLevelTestResults);
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
        if (getOverallTestResults() != null)
            sb.append("OverallTestResults: ").append(getOverallTestResults()).append(",");
        if (getConversationLevelTestResults() != null)
            sb.append("ConversationLevelTestResults: ").append(getConversationLevelTestResults()).append(",");
        if (getIntentClassificationTestResults() != null)
            sb.append("IntentClassificationTestResults: ").append(getIntentClassificationTestResults()).append(",");
        if (getIntentLevelSlotResolutionTestResults() != null)
            sb.append("IntentLevelSlotResolutionTestResults: ").append(getIntentLevelSlotResolutionTestResults()).append(",");
        if (getUtteranceLevelTestResults() != null)
            sb.append("UtteranceLevelTestResults: ").append(getUtteranceLevelTestResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestExecutionResultItems == false)
            return false;
        TestExecutionResultItems other = (TestExecutionResultItems) obj;
        if (other.getOverallTestResults() == null ^ this.getOverallTestResults() == null)
            return false;
        if (other.getOverallTestResults() != null && other.getOverallTestResults().equals(this.getOverallTestResults()) == false)
            return false;
        if (other.getConversationLevelTestResults() == null ^ this.getConversationLevelTestResults() == null)
            return false;
        if (other.getConversationLevelTestResults() != null && other.getConversationLevelTestResults().equals(this.getConversationLevelTestResults()) == false)
            return false;
        if (other.getIntentClassificationTestResults() == null ^ this.getIntentClassificationTestResults() == null)
            return false;
        if (other.getIntentClassificationTestResults() != null
                && other.getIntentClassificationTestResults().equals(this.getIntentClassificationTestResults()) == false)
            return false;
        if (other.getIntentLevelSlotResolutionTestResults() == null ^ this.getIntentLevelSlotResolutionTestResults() == null)
            return false;
        if (other.getIntentLevelSlotResolutionTestResults() != null
                && other.getIntentLevelSlotResolutionTestResults().equals(this.getIntentLevelSlotResolutionTestResults()) == false)
            return false;
        if (other.getUtteranceLevelTestResults() == null ^ this.getUtteranceLevelTestResults() == null)
            return false;
        if (other.getUtteranceLevelTestResults() != null && other.getUtteranceLevelTestResults().equals(this.getUtteranceLevelTestResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOverallTestResults() == null) ? 0 : getOverallTestResults().hashCode());
        hashCode = prime * hashCode + ((getConversationLevelTestResults() == null) ? 0 : getConversationLevelTestResults().hashCode());
        hashCode = prime * hashCode + ((getIntentClassificationTestResults() == null) ? 0 : getIntentClassificationTestResults().hashCode());
        hashCode = prime * hashCode + ((getIntentLevelSlotResolutionTestResults() == null) ? 0 : getIntentLevelSlotResolutionTestResults().hashCode());
        hashCode = prime * hashCode + ((getUtteranceLevelTestResults() == null) ? 0 : getUtteranceLevelTestResults().hashCode());
        return hashCode;
    }

    @Override
    public TestExecutionResultItems clone() {
        try {
            return (TestExecutionResultItems) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.TestExecutionResultItemsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
