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
package com.amazonaws.services.pinpointsmsvoicev2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The information for an opted out number in an Amazon Web Services account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/OptedOutNumberInformation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OptedOutNumberInformation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The phone number that is opted out.
     * </p>
     */
    private String optedOutNumber;
    /**
     * <p>
     * The time that the op tout occurred, in <a href="https://www.epochconverter.com/">UNIX epoch time</a> format.
     * </p>
     */
    private java.util.Date optedOutTimestamp;
    /**
     * <p>
     * This is set to true if it was the end recipient that opted out.
     * </p>
     */
    private Boolean endUserOptedOut;

    /**
     * <p>
     * The phone number that is opted out.
     * </p>
     * 
     * @param optedOutNumber
     *        The phone number that is opted out.
     */

    public void setOptedOutNumber(String optedOutNumber) {
        this.optedOutNumber = optedOutNumber;
    }

    /**
     * <p>
     * The phone number that is opted out.
     * </p>
     * 
     * @return The phone number that is opted out.
     */

    public String getOptedOutNumber() {
        return this.optedOutNumber;
    }

    /**
     * <p>
     * The phone number that is opted out.
     * </p>
     * 
     * @param optedOutNumber
     *        The phone number that is opted out.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OptedOutNumberInformation withOptedOutNumber(String optedOutNumber) {
        setOptedOutNumber(optedOutNumber);
        return this;
    }

    /**
     * <p>
     * The time that the op tout occurred, in <a href="https://www.epochconverter.com/">UNIX epoch time</a> format.
     * </p>
     * 
     * @param optedOutTimestamp
     *        The time that the op tout occurred, in <a href="https://www.epochconverter.com/">UNIX epoch time</a>
     *        format.
     */

    public void setOptedOutTimestamp(java.util.Date optedOutTimestamp) {
        this.optedOutTimestamp = optedOutTimestamp;
    }

    /**
     * <p>
     * The time that the op tout occurred, in <a href="https://www.epochconverter.com/">UNIX epoch time</a> format.
     * </p>
     * 
     * @return The time that the op tout occurred, in <a href="https://www.epochconverter.com/">UNIX epoch time</a>
     *         format.
     */

    public java.util.Date getOptedOutTimestamp() {
        return this.optedOutTimestamp;
    }

    /**
     * <p>
     * The time that the op tout occurred, in <a href="https://www.epochconverter.com/">UNIX epoch time</a> format.
     * </p>
     * 
     * @param optedOutTimestamp
     *        The time that the op tout occurred, in <a href="https://www.epochconverter.com/">UNIX epoch time</a>
     *        format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OptedOutNumberInformation withOptedOutTimestamp(java.util.Date optedOutTimestamp) {
        setOptedOutTimestamp(optedOutTimestamp);
        return this;
    }

    /**
     * <p>
     * This is set to true if it was the end recipient that opted out.
     * </p>
     * 
     * @param endUserOptedOut
     *        This is set to true if it was the end recipient that opted out.
     */

    public void setEndUserOptedOut(Boolean endUserOptedOut) {
        this.endUserOptedOut = endUserOptedOut;
    }

    /**
     * <p>
     * This is set to true if it was the end recipient that opted out.
     * </p>
     * 
     * @return This is set to true if it was the end recipient that opted out.
     */

    public Boolean getEndUserOptedOut() {
        return this.endUserOptedOut;
    }

    /**
     * <p>
     * This is set to true if it was the end recipient that opted out.
     * </p>
     * 
     * @param endUserOptedOut
     *        This is set to true if it was the end recipient that opted out.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OptedOutNumberInformation withEndUserOptedOut(Boolean endUserOptedOut) {
        setEndUserOptedOut(endUserOptedOut);
        return this;
    }

    /**
     * <p>
     * This is set to true if it was the end recipient that opted out.
     * </p>
     * 
     * @return This is set to true if it was the end recipient that opted out.
     */

    public Boolean isEndUserOptedOut() {
        return this.endUserOptedOut;
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
        if (getOptedOutNumber() != null)
            sb.append("OptedOutNumber: ").append(getOptedOutNumber()).append(",");
        if (getOptedOutTimestamp() != null)
            sb.append("OptedOutTimestamp: ").append(getOptedOutTimestamp()).append(",");
        if (getEndUserOptedOut() != null)
            sb.append("EndUserOptedOut: ").append(getEndUserOptedOut());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OptedOutNumberInformation == false)
            return false;
        OptedOutNumberInformation other = (OptedOutNumberInformation) obj;
        if (other.getOptedOutNumber() == null ^ this.getOptedOutNumber() == null)
            return false;
        if (other.getOptedOutNumber() != null && other.getOptedOutNumber().equals(this.getOptedOutNumber()) == false)
            return false;
        if (other.getOptedOutTimestamp() == null ^ this.getOptedOutTimestamp() == null)
            return false;
        if (other.getOptedOutTimestamp() != null && other.getOptedOutTimestamp().equals(this.getOptedOutTimestamp()) == false)
            return false;
        if (other.getEndUserOptedOut() == null ^ this.getEndUserOptedOut() == null)
            return false;
        if (other.getEndUserOptedOut() != null && other.getEndUserOptedOut().equals(this.getEndUserOptedOut()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOptedOutNumber() == null) ? 0 : getOptedOutNumber().hashCode());
        hashCode = prime * hashCode + ((getOptedOutTimestamp() == null) ? 0 : getOptedOutTimestamp().hashCode());
        hashCode = prime * hashCode + ((getEndUserOptedOut() == null) ? 0 : getEndUserOptedOut().hashCode());
        return hashCode;
    }

    @Override
    public OptedOutNumberInformation clone() {
        try {
            return (OptedOutNumberInformation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpointsmsvoicev2.model.transform.OptedOutNumberInformationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
