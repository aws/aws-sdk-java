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
package com.amazonaws.services.cloudtraildata.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Includes the error code and error message for events that could not be ingested by CloudTrail.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-data-2021-08-11/ResultErrorEntry" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResultErrorEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The error code for events that could not be ingested by CloudTrail. Possible error codes include:
     * <code>FieldTooLong</code>, <code>FieldNotFound</code>, <code>InvalidChecksum</code>, <code>InvalidData</code>,
     * <code>InvalidRecipient</code>, <code>InvalidEventSource</code>, <code>AccountNotSubscribed</code>,
     * <code>Throttling</code>, and <code>InternalFailure</code>.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * The message that describes the error for events that could not be ingested by CloudTrail.
     * </p>
     */
    private String errorMessage;
    /**
     * <p>
     * The original event ID from the source event that could not be ingested by CloudTrail.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The error code for events that could not be ingested by CloudTrail. Possible error codes include:
     * <code>FieldTooLong</code>, <code>FieldNotFound</code>, <code>InvalidChecksum</code>, <code>InvalidData</code>,
     * <code>InvalidRecipient</code>, <code>InvalidEventSource</code>, <code>AccountNotSubscribed</code>,
     * <code>Throttling</code>, and <code>InternalFailure</code>.
     * </p>
     * 
     * @param errorCode
     *        The error code for events that could not be ingested by CloudTrail. Possible error codes include:
     *        <code>FieldTooLong</code>, <code>FieldNotFound</code>, <code>InvalidChecksum</code>,
     *        <code>InvalidData</code>, <code>InvalidRecipient</code>, <code>InvalidEventSource</code>,
     *        <code>AccountNotSubscribed</code>, <code>Throttling</code>, and <code>InternalFailure</code>.
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * The error code for events that could not be ingested by CloudTrail. Possible error codes include:
     * <code>FieldTooLong</code>, <code>FieldNotFound</code>, <code>InvalidChecksum</code>, <code>InvalidData</code>,
     * <code>InvalidRecipient</code>, <code>InvalidEventSource</code>, <code>AccountNotSubscribed</code>,
     * <code>Throttling</code>, and <code>InternalFailure</code>.
     * </p>
     * 
     * @return The error code for events that could not be ingested by CloudTrail. Possible error codes include:
     *         <code>FieldTooLong</code>, <code>FieldNotFound</code>, <code>InvalidChecksum</code>,
     *         <code>InvalidData</code>, <code>InvalidRecipient</code>, <code>InvalidEventSource</code>,
     *         <code>AccountNotSubscribed</code>, <code>Throttling</code>, and <code>InternalFailure</code>.
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * The error code for events that could not be ingested by CloudTrail. Possible error codes include:
     * <code>FieldTooLong</code>, <code>FieldNotFound</code>, <code>InvalidChecksum</code>, <code>InvalidData</code>,
     * <code>InvalidRecipient</code>, <code>InvalidEventSource</code>, <code>AccountNotSubscribed</code>,
     * <code>Throttling</code>, and <code>InternalFailure</code>.
     * </p>
     * 
     * @param errorCode
     *        The error code for events that could not be ingested by CloudTrail. Possible error codes include:
     *        <code>FieldTooLong</code>, <code>FieldNotFound</code>, <code>InvalidChecksum</code>,
     *        <code>InvalidData</code>, <code>InvalidRecipient</code>, <code>InvalidEventSource</code>,
     *        <code>AccountNotSubscribed</code>, <code>Throttling</code>, and <code>InternalFailure</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResultErrorEntry withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * The message that describes the error for events that could not be ingested by CloudTrail.
     * </p>
     * 
     * @param errorMessage
     *        The message that describes the error for events that could not be ingested by CloudTrail.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * The message that describes the error for events that could not be ingested by CloudTrail.
     * </p>
     * 
     * @return The message that describes the error for events that could not be ingested by CloudTrail.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * The message that describes the error for events that could not be ingested by CloudTrail.
     * </p>
     * 
     * @param errorMessage
     *        The message that describes the error for events that could not be ingested by CloudTrail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResultErrorEntry withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
        return this;
    }

    /**
     * <p>
     * The original event ID from the source event that could not be ingested by CloudTrail.
     * </p>
     * 
     * @param id
     *        The original event ID from the source event that could not be ingested by CloudTrail.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The original event ID from the source event that could not be ingested by CloudTrail.
     * </p>
     * 
     * @return The original event ID from the source event that could not be ingested by CloudTrail.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The original event ID from the source event that could not be ingested by CloudTrail.
     * </p>
     * 
     * @param id
     *        The original event ID from the source event that could not be ingested by CloudTrail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResultErrorEntry withId(String id) {
        setId(id);
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
        if (getId() != null)
            sb.append("Id: ").append(getId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResultErrorEntry == false)
            return false;
        ResultErrorEntry other = (ResultErrorEntry) obj;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        return hashCode;
    }

    @Override
    public ResultErrorEntry clone() {
        try {
            return (ResultErrorEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudtraildata.model.transform.ResultErrorEntryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
