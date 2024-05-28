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
 * Contains information about multiple utterances in the results of a test set execution.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/UtteranceLevelTestResultItem"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UtteranceLevelTestResultItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The record number of the result.
     * </p>
     */
    private Long recordNumber;
    /**
     * <p>
     * The unique identifier for the conversation associated with the result.
     * </p>
     */
    private String conversationId;
    /**
     * <p>
     * Contains information about the turn associated with the result.
     * </p>
     */
    private TestSetTurnResult turnResult;

    /**
     * <p>
     * The record number of the result.
     * </p>
     * 
     * @param recordNumber
     *        The record number of the result.
     */

    public void setRecordNumber(Long recordNumber) {
        this.recordNumber = recordNumber;
    }

    /**
     * <p>
     * The record number of the result.
     * </p>
     * 
     * @return The record number of the result.
     */

    public Long getRecordNumber() {
        return this.recordNumber;
    }

    /**
     * <p>
     * The record number of the result.
     * </p>
     * 
     * @param recordNumber
     *        The record number of the result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UtteranceLevelTestResultItem withRecordNumber(Long recordNumber) {
        setRecordNumber(recordNumber);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the conversation associated with the result.
     * </p>
     * 
     * @param conversationId
     *        The unique identifier for the conversation associated with the result.
     */

    public void setConversationId(String conversationId) {
        this.conversationId = conversationId;
    }

    /**
     * <p>
     * The unique identifier for the conversation associated with the result.
     * </p>
     * 
     * @return The unique identifier for the conversation associated with the result.
     */

    public String getConversationId() {
        return this.conversationId;
    }

    /**
     * <p>
     * The unique identifier for the conversation associated with the result.
     * </p>
     * 
     * @param conversationId
     *        The unique identifier for the conversation associated with the result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UtteranceLevelTestResultItem withConversationId(String conversationId) {
        setConversationId(conversationId);
        return this;
    }

    /**
     * <p>
     * Contains information about the turn associated with the result.
     * </p>
     * 
     * @param turnResult
     *        Contains information about the turn associated with the result.
     */

    public void setTurnResult(TestSetTurnResult turnResult) {
        this.turnResult = turnResult;
    }

    /**
     * <p>
     * Contains information about the turn associated with the result.
     * </p>
     * 
     * @return Contains information about the turn associated with the result.
     */

    public TestSetTurnResult getTurnResult() {
        return this.turnResult;
    }

    /**
     * <p>
     * Contains information about the turn associated with the result.
     * </p>
     * 
     * @param turnResult
     *        Contains information about the turn associated with the result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UtteranceLevelTestResultItem withTurnResult(TestSetTurnResult turnResult) {
        setTurnResult(turnResult);
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
        if (getRecordNumber() != null)
            sb.append("RecordNumber: ").append(getRecordNumber()).append(",");
        if (getConversationId() != null)
            sb.append("ConversationId: ").append(getConversationId()).append(",");
        if (getTurnResult() != null)
            sb.append("TurnResult: ").append(getTurnResult());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UtteranceLevelTestResultItem == false)
            return false;
        UtteranceLevelTestResultItem other = (UtteranceLevelTestResultItem) obj;
        if (other.getRecordNumber() == null ^ this.getRecordNumber() == null)
            return false;
        if (other.getRecordNumber() != null && other.getRecordNumber().equals(this.getRecordNumber()) == false)
            return false;
        if (other.getConversationId() == null ^ this.getConversationId() == null)
            return false;
        if (other.getConversationId() != null && other.getConversationId().equals(this.getConversationId()) == false)
            return false;
        if (other.getTurnResult() == null ^ this.getTurnResult() == null)
            return false;
        if (other.getTurnResult() != null && other.getTurnResult().equals(this.getTurnResult()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecordNumber() == null) ? 0 : getRecordNumber().hashCode());
        hashCode = prime * hashCode + ((getConversationId() == null) ? 0 : getConversationId().hashCode());
        hashCode = prime * hashCode + ((getTurnResult() == null) ? 0 : getTurnResult().hashCode());
        return hashCode;
    }

    @Override
    public UtteranceLevelTestResultItem clone() {
        try {
            return (UtteranceLevelTestResultItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.UtteranceLevelTestResultItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
