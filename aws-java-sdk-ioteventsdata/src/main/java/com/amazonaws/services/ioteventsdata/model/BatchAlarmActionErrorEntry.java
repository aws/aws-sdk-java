/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ioteventsdata.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains error messages associated with one of the following requests:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/iotevents/latest/apireference/API_iotevents-data_BatchAcknowledgeAlarm.html">
 * BatchAcknowledgeAlarm</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/iotevents/latest/apireference/API_iotevents-data_BatchDisableAlarm.html">
 * BatchDisableAlarm</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/iotevents/latest/apireference/API_iotevents-data_BatchEnableAlarm.html">
 * BatchEnableAlarm</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/iotevents/latest/apireference/API_iotevents-data_BatchResetAlarm.html">
 * BatchResetAlarm</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/iotevents/latest/apireference/API_iotevents-data_BatchSnoozeAlarm.html">
 * BatchSnoozeAlarm</a>
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-data-2018-10-23/BatchAlarmActionErrorEntry"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchAlarmActionErrorEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The request ID. Each ID must be unique within each batch.
     * </p>
     */
    private String requestId;
    /**
     * <p>
     * The error code.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * A message that describes the error.
     * </p>
     */
    private String errorMessage;

    /**
     * <p>
     * The request ID. Each ID must be unique within each batch.
     * </p>
     * 
     * @param requestId
     *        The request ID. Each ID must be unique within each batch.
     */

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * <p>
     * The request ID. Each ID must be unique within each batch.
     * </p>
     * 
     * @return The request ID. Each ID must be unique within each batch.
     */

    public String getRequestId() {
        return this.requestId;
    }

    /**
     * <p>
     * The request ID. Each ID must be unique within each batch.
     * </p>
     * 
     * @param requestId
     *        The request ID. Each ID must be unique within each batch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchAlarmActionErrorEntry withRequestId(String requestId) {
        setRequestId(requestId);
        return this;
    }

    /**
     * <p>
     * The error code.
     * </p>
     * 
     * @param errorCode
     *        The error code.
     * @see ErrorCode
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * The error code.
     * </p>
     * 
     * @return The error code.
     * @see ErrorCode
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * The error code.
     * </p>
     * 
     * @param errorCode
     *        The error code.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ErrorCode
     */

    public BatchAlarmActionErrorEntry withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * The error code.
     * </p>
     * 
     * @param errorCode
     *        The error code.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ErrorCode
     */

    public BatchAlarmActionErrorEntry withErrorCode(ErrorCode errorCode) {
        this.errorCode = errorCode.toString();
        return this;
    }

    /**
     * <p>
     * A message that describes the error.
     * </p>
     * 
     * @param errorMessage
     *        A message that describes the error.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * A message that describes the error.
     * </p>
     * 
     * @return A message that describes the error.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * A message that describes the error.
     * </p>
     * 
     * @param errorMessage
     *        A message that describes the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchAlarmActionErrorEntry withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
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
        if (getRequestId() != null)
            sb.append("RequestId: ").append(getRequestId()).append(",");
        if (getErrorCode() != null)
            sb.append("ErrorCode: ").append(getErrorCode()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchAlarmActionErrorEntry == false)
            return false;
        BatchAlarmActionErrorEntry other = (BatchAlarmActionErrorEntry) obj;
        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null && other.getRequestId().equals(this.getRequestId()) == false)
            return false;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        return hashCode;
    }

    @Override
    public BatchAlarmActionErrorEntry clone() {
        try {
            return (BatchAlarmActionErrorEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ioteventsdata.model.transform.BatchAlarmActionErrorEntryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
