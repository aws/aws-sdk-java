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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The status of the phone number.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>CLAIMED</code> means the previous <a
 * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_ClaimedPhoneNumber.html">ClaimedPhoneNumber</a> or
 * <a href="https://docs.aws.amazon.com/connect/latest/APIReference/API_UpdatePhoneNumber.html">UpdatePhoneNumber</a>
 * operation succeeded.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>IN_PROGRESS</code> means a <a
 * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_ClaimedPhoneNumber.html">ClaimedPhoneNumber</a> or
 * <a href="https://docs.aws.amazon.com/connect/latest/APIReference/API_UpdatePhoneNumber.html">UpdatePhoneNumber</a>
 * operation is still in progress and has not yet completed. You can call <a
 * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_DescribePhoneNumber.html">DescribePhoneNumber</a>
 * at a later time to verify if the previous operation has completed.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>FAILED</code> indicates that the previous <a
 * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_ClaimedPhoneNumber.html">ClaimedPhoneNumber</a> or
 * <a href="https://docs.aws.amazon.com/connect/latest/APIReference/API_UpdatePhoneNumber.html">UpdatePhoneNumber</a>
 * operation has failed. It will include a message indicating the failure reason. A common reason for a failure may be
 * that the <code>TargetArn</code> value you are claiming or updating a phone number to has reached its limit of total
 * claimed numbers. If you received a <code>FAILED</code> status from a <code>ClaimPhoneNumber</code> API call, you have
 * one day to retry claiming the phone number before the number is released back to the inventory for other customers to
 * claim.
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/PhoneNumberStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PhoneNumberStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The status.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The status message.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The status.
     * </p>
     * 
     * @param status
     *        The status.
     * @see PhoneNumberWorkflowStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status.
     * </p>
     * 
     * @return The status.
     * @see PhoneNumberWorkflowStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status.
     * </p>
     * 
     * @param status
     *        The status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PhoneNumberWorkflowStatus
     */

    public PhoneNumberStatus withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status.
     * </p>
     * 
     * @param status
     *        The status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PhoneNumberWorkflowStatus
     */

    public PhoneNumberStatus withStatus(PhoneNumberWorkflowStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The status message.
     * </p>
     * 
     * @param message
     *        The status message.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The status message.
     * </p>
     * 
     * @return The status message.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * The status message.
     * </p>
     * 
     * @param message
     *        The status message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PhoneNumberStatus withMessage(String message) {
        setMessage(message);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PhoneNumberStatus == false)
            return false;
        PhoneNumberStatus other = (PhoneNumberStatus) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public PhoneNumberStatus clone() {
        try {
            return (PhoneNumberStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.PhoneNumberStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
