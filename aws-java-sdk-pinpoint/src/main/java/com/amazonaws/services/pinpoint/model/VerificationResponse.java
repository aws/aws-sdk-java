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
 * Verify OTP Message Response.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/VerificationResponse" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VerificationResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies whether the OTP is valid or not.
     * </p>
     */
    private Boolean valid;

    /**
     * <p>
     * Specifies whether the OTP is valid or not.
     * </p>
     * 
     * @param valid
     *        Specifies whether the OTP is valid or not.
     */

    public void setValid(Boolean valid) {
        this.valid = valid;
    }

    /**
     * <p>
     * Specifies whether the OTP is valid or not.
     * </p>
     * 
     * @return Specifies whether the OTP is valid or not.
     */

    public Boolean getValid() {
        return this.valid;
    }

    /**
     * <p>
     * Specifies whether the OTP is valid or not.
     * </p>
     * 
     * @param valid
     *        Specifies whether the OTP is valid or not.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerificationResponse withValid(Boolean valid) {
        setValid(valid);
        return this;
    }

    /**
     * <p>
     * Specifies whether the OTP is valid or not.
     * </p>
     * 
     * @return Specifies whether the OTP is valid or not.
     */

    public Boolean isValid() {
        return this.valid;
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
        if (getValid() != null)
            sb.append("Valid: ").append(getValid());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VerificationResponse == false)
            return false;
        VerificationResponse other = (VerificationResponse) obj;
        if (other.getValid() == null ^ this.getValid() == null)
            return false;
        if (other.getValid() != null && other.getValid().equals(this.getValid()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValid() == null) ? 0 : getValid().hashCode());
        return hashCode;
    }

    @Override
    public VerificationResponse clone() {
        try {
            return (VerificationResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.VerificationResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
