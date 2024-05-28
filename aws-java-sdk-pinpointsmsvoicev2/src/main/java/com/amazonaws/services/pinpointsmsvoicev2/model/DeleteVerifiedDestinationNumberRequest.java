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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DeleteVerifiedDestinationNumber"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteVerifiedDestinationNumberRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier for the verified destination phone number.
     * </p>
     */
    private String verifiedDestinationNumberId;

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

    public DeleteVerifiedDestinationNumberRequest withVerifiedDestinationNumberId(String verifiedDestinationNumberId) {
        setVerifiedDestinationNumberId(verifiedDestinationNumberId);
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
        if (getVerifiedDestinationNumberId() != null)
            sb.append("VerifiedDestinationNumberId: ").append(getVerifiedDestinationNumberId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteVerifiedDestinationNumberRequest == false)
            return false;
        DeleteVerifiedDestinationNumberRequest other = (DeleteVerifiedDestinationNumberRequest) obj;
        if (other.getVerifiedDestinationNumberId() == null ^ this.getVerifiedDestinationNumberId() == null)
            return false;
        if (other.getVerifiedDestinationNumberId() != null && other.getVerifiedDestinationNumberId().equals(this.getVerifiedDestinationNumberId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVerifiedDestinationNumberId() == null) ? 0 : getVerifiedDestinationNumberId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteVerifiedDestinationNumberRequest clone() {
        return (DeleteVerifiedDestinationNumberRequest) super.clone();
    }

}
