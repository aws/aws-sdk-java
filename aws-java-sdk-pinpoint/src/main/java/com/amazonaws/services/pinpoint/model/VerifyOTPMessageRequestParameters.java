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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Verify OTP message request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/VerifyOTPMessageRequestParameters"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VerifyOTPMessageRequestParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The destination identity to send OTP to.
     * </p>
     */
    private String destinationIdentity;
    /**
     * <p>
     * The OTP the end user provided for verification.
     * </p>
     */
    private String otp;
    /**
     * <p>
     * The reference identifier provided when the OTP was previously sent.
     * </p>
     */
    private String referenceId;

    /**
     * <p>
     * The destination identity to send OTP to.
     * </p>
     * 
     * @param destinationIdentity
     *        The destination identity to send OTP to.
     */

    public void setDestinationIdentity(String destinationIdentity) {
        this.destinationIdentity = destinationIdentity;
    }

    /**
     * <p>
     * The destination identity to send OTP to.
     * </p>
     * 
     * @return The destination identity to send OTP to.
     */

    public String getDestinationIdentity() {
        return this.destinationIdentity;
    }

    /**
     * <p>
     * The destination identity to send OTP to.
     * </p>
     * 
     * @param destinationIdentity
     *        The destination identity to send OTP to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifyOTPMessageRequestParameters withDestinationIdentity(String destinationIdentity) {
        setDestinationIdentity(destinationIdentity);
        return this;
    }

    /**
     * <p>
     * The OTP the end user provided for verification.
     * </p>
     * 
     * @param otp
     *        The OTP the end user provided for verification.
     */

    public void setOtp(String otp) {
        this.otp = otp;
    }

    /**
     * <p>
     * The OTP the end user provided for verification.
     * </p>
     * 
     * @return The OTP the end user provided for verification.
     */

    public String getOtp() {
        return this.otp;
    }

    /**
     * <p>
     * The OTP the end user provided for verification.
     * </p>
     * 
     * @param otp
     *        The OTP the end user provided for verification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifyOTPMessageRequestParameters withOtp(String otp) {
        setOtp(otp);
        return this;
    }

    /**
     * <p>
     * The reference identifier provided when the OTP was previously sent.
     * </p>
     * 
     * @param referenceId
     *        The reference identifier provided when the OTP was previously sent.
     */

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    /**
     * <p>
     * The reference identifier provided when the OTP was previously sent.
     * </p>
     * 
     * @return The reference identifier provided when the OTP was previously sent.
     */

    public String getReferenceId() {
        return this.referenceId;
    }

    /**
     * <p>
     * The reference identifier provided when the OTP was previously sent.
     * </p>
     * 
     * @param referenceId
     *        The reference identifier provided when the OTP was previously sent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifyOTPMessageRequestParameters withReferenceId(String referenceId) {
        setReferenceId(referenceId);
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
        if (getDestinationIdentity() != null)
            sb.append("DestinationIdentity: ").append(getDestinationIdentity()).append(",");
        if (getOtp() != null)
            sb.append("Otp: ").append(getOtp()).append(",");
        if (getReferenceId() != null)
            sb.append("ReferenceId: ").append(getReferenceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VerifyOTPMessageRequestParameters == false)
            return false;
        VerifyOTPMessageRequestParameters other = (VerifyOTPMessageRequestParameters) obj;
        if (other.getDestinationIdentity() == null ^ this.getDestinationIdentity() == null)
            return false;
        if (other.getDestinationIdentity() != null && other.getDestinationIdentity().equals(this.getDestinationIdentity()) == false)
            return false;
        if (other.getOtp() == null ^ this.getOtp() == null)
            return false;
        if (other.getOtp() != null && other.getOtp().equals(this.getOtp()) == false)
            return false;
        if (other.getReferenceId() == null ^ this.getReferenceId() == null)
            return false;
        if (other.getReferenceId() != null && other.getReferenceId().equals(this.getReferenceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDestinationIdentity() == null) ? 0 : getDestinationIdentity().hashCode());
        hashCode = prime * hashCode + ((getOtp() == null) ? 0 : getOtp().hashCode());
        hashCode = prime * hashCode + ((getReferenceId() == null) ? 0 : getReferenceId().hashCode());
        return hashCode;
    }

    @Override
    public VerifyOTPMessageRequestParameters clone() {
        try {
            return (VerifyOTPMessageRequestParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.VerifyOTPMessageRequestParametersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
