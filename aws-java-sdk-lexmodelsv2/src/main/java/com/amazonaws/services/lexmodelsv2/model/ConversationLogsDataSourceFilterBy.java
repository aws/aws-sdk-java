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
 * The selected data source to filter the conversation log.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ConversationLogsDataSourceFilterBy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConversationLogsDataSourceFilterBy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The start time for the conversation log.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The end time for the conversation log.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The selection to filter by input mode for the conversation logs.
     * </p>
     */
    private String inputMode;

    /**
     * <p>
     * The start time for the conversation log.
     * </p>
     * 
     * @param startTime
     *        The start time for the conversation log.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The start time for the conversation log.
     * </p>
     * 
     * @return The start time for the conversation log.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The start time for the conversation log.
     * </p>
     * 
     * @param startTime
     *        The start time for the conversation log.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConversationLogsDataSourceFilterBy withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The end time for the conversation log.
     * </p>
     * 
     * @param endTime
     *        The end time for the conversation log.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The end time for the conversation log.
     * </p>
     * 
     * @return The end time for the conversation log.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The end time for the conversation log.
     * </p>
     * 
     * @param endTime
     *        The end time for the conversation log.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConversationLogsDataSourceFilterBy withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The selection to filter by input mode for the conversation logs.
     * </p>
     * 
     * @param inputMode
     *        The selection to filter by input mode for the conversation logs.
     * @see ConversationLogsInputModeFilter
     */

    public void setInputMode(String inputMode) {
        this.inputMode = inputMode;
    }

    /**
     * <p>
     * The selection to filter by input mode for the conversation logs.
     * </p>
     * 
     * @return The selection to filter by input mode for the conversation logs.
     * @see ConversationLogsInputModeFilter
     */

    public String getInputMode() {
        return this.inputMode;
    }

    /**
     * <p>
     * The selection to filter by input mode for the conversation logs.
     * </p>
     * 
     * @param inputMode
     *        The selection to filter by input mode for the conversation logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConversationLogsInputModeFilter
     */

    public ConversationLogsDataSourceFilterBy withInputMode(String inputMode) {
        setInputMode(inputMode);
        return this;
    }

    /**
     * <p>
     * The selection to filter by input mode for the conversation logs.
     * </p>
     * 
     * @param inputMode
     *        The selection to filter by input mode for the conversation logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConversationLogsInputModeFilter
     */

    public ConversationLogsDataSourceFilterBy withInputMode(ConversationLogsInputModeFilter inputMode) {
        this.inputMode = inputMode.toString();
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
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getInputMode() != null)
            sb.append("InputMode: ").append(getInputMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConversationLogsDataSourceFilterBy == false)
            return false;
        ConversationLogsDataSourceFilterBy other = (ConversationLogsDataSourceFilterBy) obj;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getInputMode() == null ^ this.getInputMode() == null)
            return false;
        if (other.getInputMode() != null && other.getInputMode().equals(this.getInputMode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getInputMode() == null) ? 0 : getInputMode().hashCode());
        return hashCode;
    }

    @Override
    public ConversationLogsDataSourceFilterBy clone() {
        try {
            return (ConversationLogsDataSourceFilterBy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.ConversationLogsDataSourceFilterByMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
