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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ClaimPhoneNumber" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClaimPhoneNumberResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the phone number.
     * </p>
     */
    private String phoneNumberId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the phone number.
     * </p>
     */
    private String phoneNumberArn;

    /**
     * <p>
     * A unique identifier for the phone number.
     * </p>
     * 
     * @param phoneNumberId
     *        A unique identifier for the phone number.
     */

    public void setPhoneNumberId(String phoneNumberId) {
        this.phoneNumberId = phoneNumberId;
    }

    /**
     * <p>
     * A unique identifier for the phone number.
     * </p>
     * 
     * @return A unique identifier for the phone number.
     */

    public String getPhoneNumberId() {
        return this.phoneNumberId;
    }

    /**
     * <p>
     * A unique identifier for the phone number.
     * </p>
     * 
     * @param phoneNumberId
     *        A unique identifier for the phone number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClaimPhoneNumberResult withPhoneNumberId(String phoneNumberId) {
        setPhoneNumberId(phoneNumberId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the phone number.
     * </p>
     * 
     * @param phoneNumberArn
     *        The Amazon Resource Name (ARN) of the phone number.
     */

    public void setPhoneNumberArn(String phoneNumberArn) {
        this.phoneNumberArn = phoneNumberArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the phone number.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the phone number.
     */

    public String getPhoneNumberArn() {
        return this.phoneNumberArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the phone number.
     * </p>
     * 
     * @param phoneNumberArn
     *        The Amazon Resource Name (ARN) of the phone number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClaimPhoneNumberResult withPhoneNumberArn(String phoneNumberArn) {
        setPhoneNumberArn(phoneNumberArn);
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
        if (getPhoneNumberId() != null)
            sb.append("PhoneNumberId: ").append(getPhoneNumberId()).append(",");
        if (getPhoneNumberArn() != null)
            sb.append("PhoneNumberArn: ").append(getPhoneNumberArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClaimPhoneNumberResult == false)
            return false;
        ClaimPhoneNumberResult other = (ClaimPhoneNumberResult) obj;
        if (other.getPhoneNumberId() == null ^ this.getPhoneNumberId() == null)
            return false;
        if (other.getPhoneNumberId() != null && other.getPhoneNumberId().equals(this.getPhoneNumberId()) == false)
            return false;
        if (other.getPhoneNumberArn() == null ^ this.getPhoneNumberArn() == null)
            return false;
        if (other.getPhoneNumberArn() != null && other.getPhoneNumberArn().equals(this.getPhoneNumberArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPhoneNumberId() == null) ? 0 : getPhoneNumberId().hashCode());
        hashCode = prime * hashCode + ((getPhoneNumberArn() == null) ? 0 : getPhoneNumberArn().hashCode());
        return hashCode;
    }

    @Override
    public ClaimPhoneNumberResult clone() {
        try {
            return (ClaimPhoneNumberResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
