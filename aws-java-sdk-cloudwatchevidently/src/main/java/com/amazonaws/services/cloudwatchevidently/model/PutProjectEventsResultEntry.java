/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudwatchevidently.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that contains Evidently's response to the sent events, including an event ID and error codes, if any.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/PutProjectEventsResultEntry"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutProjectEventsResultEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * If the <code>PutProjectEvents</code> operation has an error, the error code is returned here.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * If the <code>PutProjectEvents</code> operation has an error, the error message is returned here.
     * </p>
     */
    private String errorMessage;
    /**
     * <p>
     * A unique ID assigned to this <code>PutProjectEvents</code> operation.
     * </p>
     */
    private String eventId;

    /**
     * <p>
     * If the <code>PutProjectEvents</code> operation has an error, the error code is returned here.
     * </p>
     * 
     * @param errorCode
     *        If the <code>PutProjectEvents</code> operation has an error, the error code is returned here.
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * If the <code>PutProjectEvents</code> operation has an error, the error code is returned here.
     * </p>
     * 
     * @return If the <code>PutProjectEvents</code> operation has an error, the error code is returned here.
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * If the <code>PutProjectEvents</code> operation has an error, the error code is returned here.
     * </p>
     * 
     * @param errorCode
     *        If the <code>PutProjectEvents</code> operation has an error, the error code is returned here.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutProjectEventsResultEntry withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * If the <code>PutProjectEvents</code> operation has an error, the error message is returned here.
     * </p>
     * 
     * @param errorMessage
     *        If the <code>PutProjectEvents</code> operation has an error, the error message is returned here.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * If the <code>PutProjectEvents</code> operation has an error, the error message is returned here.
     * </p>
     * 
     * @return If the <code>PutProjectEvents</code> operation has an error, the error message is returned here.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * If the <code>PutProjectEvents</code> operation has an error, the error message is returned here.
     * </p>
     * 
     * @param errorMessage
     *        If the <code>PutProjectEvents</code> operation has an error, the error message is returned here.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutProjectEventsResultEntry withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
        return this;
    }

    /**
     * <p>
     * A unique ID assigned to this <code>PutProjectEvents</code> operation.
     * </p>
     * 
     * @param eventId
     *        A unique ID assigned to this <code>PutProjectEvents</code> operation.
     */

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    /**
     * <p>
     * A unique ID assigned to this <code>PutProjectEvents</code> operation.
     * </p>
     * 
     * @return A unique ID assigned to this <code>PutProjectEvents</code> operation.
     */

    public String getEventId() {
        return this.eventId;
    }

    /**
     * <p>
     * A unique ID assigned to this <code>PutProjectEvents</code> operation.
     * </p>
     * 
     * @param eventId
     *        A unique ID assigned to this <code>PutProjectEvents</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutProjectEventsResultEntry withEventId(String eventId) {
        setEventId(eventId);
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
        if (getErrorCode() != null)
            sb.append("ErrorCode: ").append(getErrorCode()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage()).append(",");
        if (getEventId() != null)
            sb.append("EventId: ").append(getEventId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutProjectEventsResultEntry == false)
            return false;
        PutProjectEventsResultEntry other = (PutProjectEventsResultEntry) obj;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        if (other.getEventId() == null ^ this.getEventId() == null)
            return false;
        if (other.getEventId() != null && other.getEventId().equals(this.getEventId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getEventId() == null) ? 0 : getEventId().hashCode());
        return hashCode;
    }

    @Override
    public PutProjectEventsResultEntry clone() {
        try {
            return (PutProjectEventsResultEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudwatchevidently.model.transform.PutProjectEventsResultEntryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
