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
package com.amazonaws.services.pinpointsmsvoicev2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DeleteVerifiedDestinationNumber"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteVerifiedDestinationNumberResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the verified destination phone number.
     * </p>
     */
    private String verifiedDestinationNumberArn;
    /**
     * <p>
     * The unique identifier for the verified destination phone number.
     * </p>
     */
    private String verifiedDestinationNumberId;
    /**
     * <p>
     * The verified destination phone number, in E.164 format.
     * </p>
     */
    private String destinationPhoneNumber;
    /**
     * <p>
     * The time when the destination phone number was created, in <a href="https://www.epochconverter.com/">UNIX epoch
     * time</a> format.
     * </p>
     */
    private java.util.Date createdTimestamp;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the verified destination phone number.
     * </p>
     * 
     * @param verifiedDestinationNumberArn
     *        The Amazon Resource Name (ARN) for the verified destination phone number.
     */

    public void setVerifiedDestinationNumberArn(String verifiedDestinationNumberArn) {
        this.verifiedDestinationNumberArn = verifiedDestinationNumberArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the verified destination phone number.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the verified destination phone number.
     */

    public String getVerifiedDestinationNumberArn() {
        return this.verifiedDestinationNumberArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the verified destination phone number.
     * </p>
     * 
     * @param verifiedDestinationNumberArn
     *        The Amazon Resource Name (ARN) for the verified destination phone number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteVerifiedDestinationNumberResult withVerifiedDestinationNumberArn(String verifiedDestinationNumberArn) {
        setVerifiedDestinationNumberArn(verifiedDestinationNumberArn);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the verified destination phone number.
     * </p>
     * 
     * @param verifiedDestinationNumberId
     *        The unique identifier for the verified destination phone number.
     */

    public void setVerifiedDestinationNumberId(String verifiedDestinationNumberId) {
        this.verifiedDestinationNumberId = verifiedDestinationNumberId;
    }

    /**
     * <p>
     * The unique identifier for the verified destination phone number.
     * </p>
     * 
     * @return The unique identifier for the verified destination phone number.
     */

    public String getVerifiedDestinationNumberId() {
        return this.verifiedDestinationNumberId;
    }

    /**
     * <p>
     * The unique identifier for the verified destination phone number.
     * </p>
     * 
     * @param verifiedDestinationNumberId
     *        The unique identifier for the verified destination phone number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteVerifiedDestinationNumberResult withVerifiedDestinationNumberId(String verifiedDestinationNumberId) {
        setVerifiedDestinationNumberId(verifiedDestinationNumberId);
        return this;
    }

    /**
     * <p>
     * The verified destination phone number, in E.164 format.
     * </p>
     * 
     * @param destinationPhoneNumber
     *        The verified destination phone number, in E.164 format.
     */

    public void setDestinationPhoneNumber(String destinationPhoneNumber) {
        this.destinationPhoneNumber = destinationPhoneNumber;
    }

    /**
     * <p>
     * The verified destination phone number, in E.164 format.
     * </p>
     * 
     * @return The verified destination phone number, in E.164 format.
     */

    public String getDestinationPhoneNumber() {
        return this.destinationPhoneNumber;
    }

    /**
     * <p>
     * The verified destination phone number, in E.164 format.
     * </p>
     * 
     * @param destinationPhoneNumber
     *        The verified destination phone number, in E.164 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteVerifiedDestinationNumberResult withDestinationPhoneNumber(String destinationPhoneNumber) {
        setDestinationPhoneNumber(destinationPhoneNumber);
        return this;
    }

    /**
     * <p>
     * The time when the destination phone number was created, in <a href="https://www.epochconverter.com/">UNIX epoch
     * time</a> format.
     * </p>
     * 
     * @param createdTimestamp
     *        The time when the destination phone number was created, in <a href="https://www.epochconverter.com/">UNIX
     *        epoch time</a> format.
     */

    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * <p>
     * The time when the destination phone number was created, in <a href="https://www.epochconverter.com/">UNIX epoch
     * time</a> format.
     * </p>
     * 
     * @return The time when the destination phone number was created, in <a href="https://www.epochconverter.com/">UNIX
     *         epoch time</a> format.
     */

    public java.util.Date getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    /**
     * <p>
     * The time when the destination phone number was created, in <a href="https://www.epochconverter.com/">UNIX epoch
     * time</a> format.
     * </p>
     * 
     * @param createdTimestamp
     *        The time when the destination phone number was created, in <a href="https://www.epochconverter.com/">UNIX
     *        epoch time</a> format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteVerifiedDestinationNumberResult withCreatedTimestamp(java.util.Date createdTimestamp) {
        setCreatedTimestamp(createdTimestamp);
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
        if (getVerifiedDestinationNumberArn() != null)
            sb.append("VerifiedDestinationNumberArn: ").append(getVerifiedDestinationNumberArn()).append(",");
        if (getVerifiedDestinationNumberId() != null)
            sb.append("VerifiedDestinationNumberId: ").append(getVerifiedDestinationNumberId()).append(",");
        if (getDestinationPhoneNumber() != null)
            sb.append("DestinationPhoneNumber: ").append(getDestinationPhoneNumber()).append(",");
        if (getCreatedTimestamp() != null)
            sb.append("CreatedTimestamp: ").append(getCreatedTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteVerifiedDestinationNumberResult == false)
            return false;
        DeleteVerifiedDestinationNumberResult other = (DeleteVerifiedDestinationNumberResult) obj;
        if (other.getVerifiedDestinationNumberArn() == null ^ this.getVerifiedDestinationNumberArn() == null)
            return false;
        if (other.getVerifiedDestinationNumberArn() != null && other.getVerifiedDestinationNumberArn().equals(this.getVerifiedDestinationNumberArn()) == false)
            return false;
        if (other.getVerifiedDestinationNumberId() == null ^ this.getVerifiedDestinationNumberId() == null)
            return false;
        if (other.getVerifiedDestinationNumberId() != null && other.getVerifiedDestinationNumberId().equals(this.getVerifiedDestinationNumberId()) == false)
            return false;
        if (other.getDestinationPhoneNumber() == null ^ this.getDestinationPhoneNumber() == null)
            return false;
        if (other.getDestinationPhoneNumber() != null && other.getDestinationPhoneNumber().equals(this.getDestinationPhoneNumber()) == false)
            return false;
        if (other.getCreatedTimestamp() == null ^ this.getCreatedTimestamp() == null)
            return false;
        if (other.getCreatedTimestamp() != null && other.getCreatedTimestamp().equals(this.getCreatedTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVerifiedDestinationNumberArn() == null) ? 0 : getVerifiedDestinationNumberArn().hashCode());
        hashCode = prime * hashCode + ((getVerifiedDestinationNumberId() == null) ? 0 : getVerifiedDestinationNumberId().hashCode());
        hashCode = prime * hashCode + ((getDestinationPhoneNumber() == null) ? 0 : getDestinationPhoneNumber().hashCode());
        hashCode = prime * hashCode + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public DeleteVerifiedDestinationNumberResult clone() {
        try {
            return (DeleteVerifiedDestinationNumberResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
