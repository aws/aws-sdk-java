/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DisassociatePhoneNumbersFromVoiceConnector"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociatePhoneNumbersFromVoiceConnectorResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * If the action fails for one or more of the phone numbers in the request, a list of the phone numbers is returned,
     * along with error codes and error messages.
     * </p>
     */
    private java.util.List<PhoneNumberError> phoneNumberErrors;

    /**
     * <p>
     * If the action fails for one or more of the phone numbers in the request, a list of the phone numbers is returned,
     * along with error codes and error messages.
     * </p>
     * 
     * @return If the action fails for one or more of the phone numbers in the request, a list of the phone numbers is
     *         returned, along with error codes and error messages.
     */

    public java.util.List<PhoneNumberError> getPhoneNumberErrors() {
        return phoneNumberErrors;
    }

    /**
     * <p>
     * If the action fails for one or more of the phone numbers in the request, a list of the phone numbers is returned,
     * along with error codes and error messages.
     * </p>
     * 
     * @param phoneNumberErrors
     *        If the action fails for one or more of the phone numbers in the request, a list of the phone numbers is
     *        returned, along with error codes and error messages.
     */

    public void setPhoneNumberErrors(java.util.Collection<PhoneNumberError> phoneNumberErrors) {
        if (phoneNumberErrors == null) {
            this.phoneNumberErrors = null;
            return;
        }

        this.phoneNumberErrors = new java.util.ArrayList<PhoneNumberError>(phoneNumberErrors);
    }

    /**
     * <p>
     * If the action fails for one or more of the phone numbers in the request, a list of the phone numbers is returned,
     * along with error codes and error messages.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPhoneNumberErrors(java.util.Collection)} or {@link #withPhoneNumberErrors(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param phoneNumberErrors
     *        If the action fails for one or more of the phone numbers in the request, a list of the phone numbers is
     *        returned, along with error codes and error messages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociatePhoneNumbersFromVoiceConnectorResult withPhoneNumberErrors(PhoneNumberError... phoneNumberErrors) {
        if (this.phoneNumberErrors == null) {
            setPhoneNumberErrors(new java.util.ArrayList<PhoneNumberError>(phoneNumberErrors.length));
        }
        for (PhoneNumberError ele : phoneNumberErrors) {
            this.phoneNumberErrors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * If the action fails for one or more of the phone numbers in the request, a list of the phone numbers is returned,
     * along with error codes and error messages.
     * </p>
     * 
     * @param phoneNumberErrors
     *        If the action fails for one or more of the phone numbers in the request, a list of the phone numbers is
     *        returned, along with error codes and error messages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociatePhoneNumbersFromVoiceConnectorResult withPhoneNumberErrors(java.util.Collection<PhoneNumberError> phoneNumberErrors) {
        setPhoneNumberErrors(phoneNumberErrors);
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
        if (getPhoneNumberErrors() != null)
            sb.append("PhoneNumberErrors: ").append(getPhoneNumberErrors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociatePhoneNumbersFromVoiceConnectorResult == false)
            return false;
        DisassociatePhoneNumbersFromVoiceConnectorResult other = (DisassociatePhoneNumbersFromVoiceConnectorResult) obj;
        if (other.getPhoneNumberErrors() == null ^ this.getPhoneNumberErrors() == null)
            return false;
        if (other.getPhoneNumberErrors() != null && other.getPhoneNumberErrors().equals(this.getPhoneNumberErrors()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPhoneNumberErrors() == null) ? 0 : getPhoneNumberErrors().hashCode());
        return hashCode;
    }

    @Override
    public DisassociatePhoneNumbersFromVoiceConnectorResult clone() {
        try {
            return (DisassociatePhoneNumbersFromVoiceConnectorResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
