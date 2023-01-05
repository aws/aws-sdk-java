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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The reason for the current status of a standard subscription.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/StandardsStatusReason" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StandardsStatusReason implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The reason code that represents the reason for the current status of a standard subscription.
     * </p>
     */
    private String statusReasonCode;

    /**
     * <p>
     * The reason code that represents the reason for the current status of a standard subscription.
     * </p>
     * 
     * @param statusReasonCode
     *        The reason code that represents the reason for the current status of a standard subscription.
     * @see StatusReasonCode
     */

    public void setStatusReasonCode(String statusReasonCode) {
        this.statusReasonCode = statusReasonCode;
    }

    /**
     * <p>
     * The reason code that represents the reason for the current status of a standard subscription.
     * </p>
     * 
     * @return The reason code that represents the reason for the current status of a standard subscription.
     * @see StatusReasonCode
     */

    public String getStatusReasonCode() {
        return this.statusReasonCode;
    }

    /**
     * <p>
     * The reason code that represents the reason for the current status of a standard subscription.
     * </p>
     * 
     * @param statusReasonCode
     *        The reason code that represents the reason for the current status of a standard subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StatusReasonCode
     */

    public StandardsStatusReason withStatusReasonCode(String statusReasonCode) {
        setStatusReasonCode(statusReasonCode);
        return this;
    }

    /**
     * <p>
     * The reason code that represents the reason for the current status of a standard subscription.
     * </p>
     * 
     * @param statusReasonCode
     *        The reason code that represents the reason for the current status of a standard subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StatusReasonCode
     */

    public StandardsStatusReason withStatusReasonCode(StatusReasonCode statusReasonCode) {
        this.statusReasonCode = statusReasonCode.toString();
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
        if (getStatusReasonCode() != null)
            sb.append("StatusReasonCode: ").append(getStatusReasonCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StandardsStatusReason == false)
            return false;
        StandardsStatusReason other = (StandardsStatusReason) obj;
        if (other.getStatusReasonCode() == null ^ this.getStatusReasonCode() == null)
            return false;
        if (other.getStatusReasonCode() != null && other.getStatusReasonCode().equals(this.getStatusReasonCode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatusReasonCode() == null) ? 0 : getStatusReasonCode().hashCode());
        return hashCode;
    }

    @Override
    public StandardsStatusReason clone() {
        try {
            return (StandardsStatusReason) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.StandardsStatusReasonMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
