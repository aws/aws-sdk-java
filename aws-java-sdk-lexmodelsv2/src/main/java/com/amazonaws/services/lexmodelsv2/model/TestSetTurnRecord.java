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
 * Contains information about a turn in a test set.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/TestSetTurnRecord" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TestSetTurnRecord implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The record number associated with the turn.
     * </p>
     */
    private Long recordNumber;
    /**
     * <p>
     * The unique identifier for the conversation associated with the turn.
     * </p>
     */
    private String conversationId;
    /**
     * <p>
     * The number of turns that has elapsed up to that turn.
     * </p>
     */
    private Integer turnNumber;
    /**
     * <p>
     * Contains information about the agent or user turn depending upon type of turn.
     * </p>
     */
    private TurnSpecification turnSpecification;

    /**
     * <p>
     * The record number associated with the turn.
     * </p>
     * 
     * @param recordNumber
     *        The record number associated with the turn.
     */

    public void setRecordNumber(Long recordNumber) {
        this.recordNumber = recordNumber;
    }

    /**
     * <p>
     * The record number associated with the turn.
     * </p>
     * 
     * @return The record number associated with the turn.
     */

    public Long getRecordNumber() {
        return this.recordNumber;
    }

    /**
     * <p>
     * The record number associated with the turn.
     * </p>
     * 
     * @param recordNumber
     *        The record number associated with the turn.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestSetTurnRecord withRecordNumber(Long recordNumber) {
        setRecordNumber(recordNumber);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the conversation associated with the turn.
     * </p>
     * 
     * @param conversationId
     *        The unique identifier for the conversation associated with the turn.
     */

    public void setConversationId(String conversationId) {
        this.conversationId = conversationId;
    }

    /**
     * <p>
     * The unique identifier for the conversation associated with the turn.
     * </p>
     * 
     * @return The unique identifier for the conversation associated with the turn.
     */

    public String getConversationId() {
        return this.conversationId;
    }

    /**
     * <p>
     * The unique identifier for the conversation associated with the turn.
     * </p>
     * 
     * @param conversationId
     *        The unique identifier for the conversation associated with the turn.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestSetTurnRecord withConversationId(String conversationId) {
        setConversationId(conversationId);
        return this;
    }

    /**
     * <p>
     * The number of turns that has elapsed up to that turn.
     * </p>
     * 
     * @param turnNumber
     *        The number of turns that has elapsed up to that turn.
     */

    public void setTurnNumber(Integer turnNumber) {
        this.turnNumber = turnNumber;
    }

    /**
     * <p>
     * The number of turns that has elapsed up to that turn.
     * </p>
     * 
     * @return The number of turns that has elapsed up to that turn.
     */

    public Integer getTurnNumber() {
        return this.turnNumber;
    }

    /**
     * <p>
     * The number of turns that has elapsed up to that turn.
     * </p>
     * 
     * @param turnNumber
     *        The number of turns that has elapsed up to that turn.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestSetTurnRecord withTurnNumber(Integer turnNumber) {
        setTurnNumber(turnNumber);
        return this;
    }

    /**
     * <p>
     * Contains information about the agent or user turn depending upon type of turn.
     * </p>
     * 
     * @param turnSpecification
     *        Contains information about the agent or user turn depending upon type of turn.
     */

    public void setTurnSpecification(TurnSpecification turnSpecification) {
        this.turnSpecification = turnSpecification;
    }

    /**
     * <p>
     * Contains information about the agent or user turn depending upon type of turn.
     * </p>
     * 
     * @return Contains information about the agent or user turn depending upon type of turn.
     */

    public TurnSpecification getTurnSpecification() {
        return this.turnSpecification;
    }

    /**
     * <p>
     * Contains information about the agent or user turn depending upon type of turn.
     * </p>
     * 
     * @param turnSpecification
     *        Contains information about the agent or user turn depending upon type of turn.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestSetTurnRecord withTurnSpecification(TurnSpecification turnSpecification) {
        setTurnSpecification(turnSpecification);
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
        if (getTurnNumber() != null)
            sb.append("TurnNumber: ").append(getTurnNumber()).append(",");
        if (getTurnSpecification() != null)
            sb.append("TurnSpecification: ").append(getTurnSpecification());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestSetTurnRecord == false)
            return false;
        TestSetTurnRecord other = (TestSetTurnRecord) obj;
        if (other.getRecordNumber() == null ^ this.getRecordNumber() == null)
            return false;
        if (other.getRecordNumber() != null && other.getRecordNumber().equals(this.getRecordNumber()) == false)
            return false;
        if (other.getConversationId() == null ^ this.getConversationId() == null)
            return false;
        if (other.getConversationId() != null && other.getConversationId().equals(this.getConversationId()) == false)
            return false;
        if (other.getTurnNumber() == null ^ this.getTurnNumber() == null)
            return false;
        if (other.getTurnNumber() != null && other.getTurnNumber().equals(this.getTurnNumber()) == false)
            return false;
        if (other.getTurnSpecification() == null ^ this.getTurnSpecification() == null)
            return false;
        if (other.getTurnSpecification() != null && other.getTurnSpecification().equals(this.getTurnSpecification()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecordNumber() == null) ? 0 : getRecordNumber().hashCode());
        hashCode = prime * hashCode + ((getConversationId() == null) ? 0 : getConversationId().hashCode());
        hashCode = prime * hashCode + ((getTurnNumber() == null) ? 0 : getTurnNumber().hashCode());
        hashCode = prime * hashCode + ((getTurnSpecification() == null) ? 0 : getTurnSpecification().hashCode());
        return hashCode;
    }

    @Override
    public TestSetTurnRecord clone() {
        try {
            return (TestSetTurnRecord) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.TestSetTurnRecordMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
