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
 * Information about intent-level slot resolution in a test result.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/IntentLevelSlotResolutionTestResultItem"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IntentLevelSlotResolutionTestResultItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the intent that was recognized.
     * </p>
     */
    private String intentName;
    /**
     * <p>
     * Indicates whether the conversation involves multiple turns or not.
     * </p>
     */
    private Boolean multiTurnConversation;
    /**
     * <p>
     * The results for the slot resolution in the test execution result.
     * </p>
     */
    private java.util.List<SlotResolutionTestResultItem> slotResolutionResults;

    /**
     * <p>
     * The name of the intent that was recognized.
     * </p>
     * 
     * @param intentName
     *        The name of the intent that was recognized.
     */

    public void setIntentName(String intentName) {
        this.intentName = intentName;
    }

    /**
     * <p>
     * The name of the intent that was recognized.
     * </p>
     * 
     * @return The name of the intent that was recognized.
     */

    public String getIntentName() {
        return this.intentName;
    }

    /**
     * <p>
     * The name of the intent that was recognized.
     * </p>
     * 
     * @param intentName
     *        The name of the intent that was recognized.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IntentLevelSlotResolutionTestResultItem withIntentName(String intentName) {
        setIntentName(intentName);
        return this;
    }

    /**
     * <p>
     * Indicates whether the conversation involves multiple turns or not.
     * </p>
     * 
     * @param multiTurnConversation
     *        Indicates whether the conversation involves multiple turns or not.
     */

    public void setMultiTurnConversation(Boolean multiTurnConversation) {
        this.multiTurnConversation = multiTurnConversation;
    }

    /**
     * <p>
     * Indicates whether the conversation involves multiple turns or not.
     * </p>
     * 
     * @return Indicates whether the conversation involves multiple turns or not.
     */

    public Boolean getMultiTurnConversation() {
        return this.multiTurnConversation;
    }

    /**
     * <p>
     * Indicates whether the conversation involves multiple turns or not.
     * </p>
     * 
     * @param multiTurnConversation
     *        Indicates whether the conversation involves multiple turns or not.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IntentLevelSlotResolutionTestResultItem withMultiTurnConversation(Boolean multiTurnConversation) {
        setMultiTurnConversation(multiTurnConversation);
        return this;
    }

    /**
     * <p>
     * Indicates whether the conversation involves multiple turns or not.
     * </p>
     * 
     * @return Indicates whether the conversation involves multiple turns or not.
     */

    public Boolean isMultiTurnConversation() {
        return this.multiTurnConversation;
    }

    /**
     * <p>
     * The results for the slot resolution in the test execution result.
     * </p>
     * 
     * @return The results for the slot resolution in the test execution result.
     */

    public java.util.List<SlotResolutionTestResultItem> getSlotResolutionResults() {
        return slotResolutionResults;
    }

    /**
     * <p>
     * The results for the slot resolution in the test execution result.
     * </p>
     * 
     * @param slotResolutionResults
     *        The results for the slot resolution in the test execution result.
     */

    public void setSlotResolutionResults(java.util.Collection<SlotResolutionTestResultItem> slotResolutionResults) {
        if (slotResolutionResults == null) {
            this.slotResolutionResults = null;
            return;
        }

        this.slotResolutionResults = new java.util.ArrayList<SlotResolutionTestResultItem>(slotResolutionResults);
    }

    /**
     * <p>
     * The results for the slot resolution in the test execution result.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSlotResolutionResults(java.util.Collection)} or
     * {@link #withSlotResolutionResults(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param slotResolutionResults
     *        The results for the slot resolution in the test execution result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IntentLevelSlotResolutionTestResultItem withSlotResolutionResults(SlotResolutionTestResultItem... slotResolutionResults) {
        if (this.slotResolutionResults == null) {
            setSlotResolutionResults(new java.util.ArrayList<SlotResolutionTestResultItem>(slotResolutionResults.length));
        }
        for (SlotResolutionTestResultItem ele : slotResolutionResults) {
            this.slotResolutionResults.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The results for the slot resolution in the test execution result.
     * </p>
     * 
     * @param slotResolutionResults
     *        The results for the slot resolution in the test execution result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IntentLevelSlotResolutionTestResultItem withSlotResolutionResults(java.util.Collection<SlotResolutionTestResultItem> slotResolutionResults) {
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
        if (getIntentName() != null)
            sb.append("IntentName: ").append(getIntentName()).append(",");
        if (getMultiTurnConversation() != null)
            sb.append("MultiTurnConversation: ").append(getMultiTurnConversation()).append(",");
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

        if (obj instanceof IntentLevelSlotResolutionTestResultItem == false)
            return false;
        IntentLevelSlotResolutionTestResultItem other = (IntentLevelSlotResolutionTestResultItem) obj;
        if (other.getIntentName() == null ^ this.getIntentName() == null)
            return false;
        if (other.getIntentName() != null && other.getIntentName().equals(this.getIntentName()) == false)
            return false;
        if (other.getMultiTurnConversation() == null ^ this.getMultiTurnConversation() == null)
            return false;
        if (other.getMultiTurnConversation() != null && other.getMultiTurnConversation().equals(this.getMultiTurnConversation()) == false)
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

        hashCode = prime * hashCode + ((getIntentName() == null) ? 0 : getIntentName().hashCode());
        hashCode = prime * hashCode + ((getMultiTurnConversation() == null) ? 0 : getMultiTurnConversation().hashCode());
        hashCode = prime * hashCode + ((getSlotResolutionResults() == null) ? 0 : getSlotResolutionResults().hashCode());
        return hashCode;
    }

    @Override
    public IntentLevelSlotResolutionTestResultItem clone() {
        try {
            return (IntentLevelSlotResolutionTestResultItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.IntentLevelSlotResolutionTestResultItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
