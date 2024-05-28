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
 * The slots used for the slot resolution in the conversation.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ConversationLevelSlotResolutionResultItem"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConversationLevelSlotResolutionResultItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The intents used in the slots list for the slot resolution details.
     * </p>
     */
    private String intentName;
    /**
     * <p>
     * The slot name in the slots list for the slot resolution details.
     * </p>
     */
    private String slotName;
    /**
     * <p>
     * The number of matching slots used in the slots listings for the slot resolution evaluation.
     * </p>
     */
    private String matchResult;

    /**
     * <p>
     * The intents used in the slots list for the slot resolution details.
     * </p>
     * 
     * @param intentName
     *        The intents used in the slots list for the slot resolution details.
     */

    public void setIntentName(String intentName) {
        this.intentName = intentName;
    }

    /**
     * <p>
     * The intents used in the slots list for the slot resolution details.
     * </p>
     * 
     * @return The intents used in the slots list for the slot resolution details.
     */

    public String getIntentName() {
        return this.intentName;
    }

    /**
     * <p>
     * The intents used in the slots list for the slot resolution details.
     * </p>
     * 
     * @param intentName
     *        The intents used in the slots list for the slot resolution details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConversationLevelSlotResolutionResultItem withIntentName(String intentName) {
        setIntentName(intentName);
        return this;
    }

    /**
     * <p>
     * The slot name in the slots list for the slot resolution details.
     * </p>
     * 
     * @param slotName
     *        The slot name in the slots list for the slot resolution details.
     */

    public void setSlotName(String slotName) {
        this.slotName = slotName;
    }

    /**
     * <p>
     * The slot name in the slots list for the slot resolution details.
     * </p>
     * 
     * @return The slot name in the slots list for the slot resolution details.
     */

    public String getSlotName() {
        return this.slotName;
    }

    /**
     * <p>
     * The slot name in the slots list for the slot resolution details.
     * </p>
     * 
     * @param slotName
     *        The slot name in the slots list for the slot resolution details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConversationLevelSlotResolutionResultItem withSlotName(String slotName) {
        setSlotName(slotName);
        return this;
    }

    /**
     * <p>
     * The number of matching slots used in the slots listings for the slot resolution evaluation.
     * </p>
     * 
     * @param matchResult
     *        The number of matching slots used in the slots listings for the slot resolution evaluation.
     * @see TestResultMatchStatus
     */

    public void setMatchResult(String matchResult) {
        this.matchResult = matchResult;
    }

    /**
     * <p>
     * The number of matching slots used in the slots listings for the slot resolution evaluation.
     * </p>
     * 
     * @return The number of matching slots used in the slots listings for the slot resolution evaluation.
     * @see TestResultMatchStatus
     */

    public String getMatchResult() {
        return this.matchResult;
    }

    /**
     * <p>
     * The number of matching slots used in the slots listings for the slot resolution evaluation.
     * </p>
     * 
     * @param matchResult
     *        The number of matching slots used in the slots listings for the slot resolution evaluation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TestResultMatchStatus
     */

    public ConversationLevelSlotResolutionResultItem withMatchResult(String matchResult) {
        setMatchResult(matchResult);
        return this;
    }

    /**
     * <p>
     * The number of matching slots used in the slots listings for the slot resolution evaluation.
     * </p>
     * 
     * @param matchResult
     *        The number of matching slots used in the slots listings for the slot resolution evaluation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TestResultMatchStatus
     */

    public ConversationLevelSlotResolutionResultItem withMatchResult(TestResultMatchStatus matchResult) {
        this.matchResult = matchResult.toString();
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
        if (getSlotName() != null)
            sb.append("SlotName: ").append(getSlotName()).append(",");
        if (getMatchResult() != null)
            sb.append("MatchResult: ").append(getMatchResult());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConversationLevelSlotResolutionResultItem == false)
            return false;
        ConversationLevelSlotResolutionResultItem other = (ConversationLevelSlotResolutionResultItem) obj;
        if (other.getIntentName() == null ^ this.getIntentName() == null)
            return false;
        if (other.getIntentName() != null && other.getIntentName().equals(this.getIntentName()) == false)
            return false;
        if (other.getSlotName() == null ^ this.getSlotName() == null)
            return false;
        if (other.getSlotName() != null && other.getSlotName().equals(this.getSlotName()) == false)
            return false;
        if (other.getMatchResult() == null ^ this.getMatchResult() == null)
            return false;
        if (other.getMatchResult() != null && other.getMatchResult().equals(this.getMatchResult()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIntentName() == null) ? 0 : getIntentName().hashCode());
        hashCode = prime * hashCode + ((getSlotName() == null) ? 0 : getSlotName().hashCode());
        hashCode = prime * hashCode + ((getMatchResult() == null) ? 0 : getMatchResult().hashCode());
        return hashCode;
    }

    @Override
    public ConversationLevelSlotResolutionResultItem clone() {
        try {
            return (ConversationLevelSlotResolutionResultItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.ConversationLevelSlotResolutionResultItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
