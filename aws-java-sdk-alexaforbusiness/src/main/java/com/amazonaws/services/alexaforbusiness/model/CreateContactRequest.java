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
package com.amazonaws.services.alexaforbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/CreateContact" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateContactRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the contact to display on the console.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The first name of the contact that is used to call the contact on the device.
     * </p>
     */
    private String firstName;
    /**
     * <p>
     * The last name of the contact that is used to call the contact on the device.
     * </p>
     */
    private String lastName;
    /**
     * <p>
     * The phone number of the contact in E.164 format.
     * </p>
     */
    private String phoneNumber;
    /**
     * <p>
     * A unique, user-specified identifier for this request that ensures idempotency.
     * </p>
     */
    private String clientRequestToken;

    /**
     * <p>
     * The name of the contact to display on the console.
     * </p>
     * 
     * @param displayName
     *        The name of the contact to display on the console.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The name of the contact to display on the console.
     * </p>
     * 
     * @return The name of the contact to display on the console.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The name of the contact to display on the console.
     * </p>
     * 
     * @param displayName
     *        The name of the contact to display on the console.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContactRequest withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The first name of the contact that is used to call the contact on the device.
     * </p>
     * 
     * @param firstName
     *        The first name of the contact that is used to call the contact on the device.
     */

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * <p>
     * The first name of the contact that is used to call the contact on the device.
     * </p>
     * 
     * @return The first name of the contact that is used to call the contact on the device.
     */

    public String getFirstName() {
        return this.firstName;
    }

    /**
     * <p>
     * The first name of the contact that is used to call the contact on the device.
     * </p>
     * 
     * @param firstName
     *        The first name of the contact that is used to call the contact on the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContactRequest withFirstName(String firstName) {
        setFirstName(firstName);
        return this;
    }

    /**
     * <p>
     * The last name of the contact that is used to call the contact on the device.
     * </p>
     * 
     * @param lastName
     *        The last name of the contact that is used to call the contact on the device.
     */

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * <p>
     * The last name of the contact that is used to call the contact on the device.
     * </p>
     * 
     * @return The last name of the contact that is used to call the contact on the device.
     */

    public String getLastName() {
        return this.lastName;
    }

    /**
     * <p>
     * The last name of the contact that is used to call the contact on the device.
     * </p>
     * 
     * @param lastName
     *        The last name of the contact that is used to call the contact on the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContactRequest withLastName(String lastName) {
        setLastName(lastName);
        return this;
    }

    /**
     * <p>
     * The phone number of the contact in E.164 format.
     * </p>
     * 
     * @param phoneNumber
     *        The phone number of the contact in E.164 format.
     */

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * <p>
     * The phone number of the contact in E.164 format.
     * </p>
     * 
     * @return The phone number of the contact in E.164 format.
     */

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * <p>
     * The phone number of the contact in E.164 format.
     * </p>
     * 
     * @param phoneNumber
     *        The phone number of the contact in E.164 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContactRequest withPhoneNumber(String phoneNumber) {
        setPhoneNumber(phoneNumber);
        return this;
    }

    /**
     * <p>
     * A unique, user-specified identifier for this request that ensures idempotency.
     * </p>
     * 
     * @param clientRequestToken
     *        A unique, user-specified identifier for this request that ensures idempotency.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * A unique, user-specified identifier for this request that ensures idempotency.
     * </p>
     * 
     * @return A unique, user-specified identifier for this request that ensures idempotency.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * A unique, user-specified identifier for this request that ensures idempotency.
     * </p>
     * 
     * @param clientRequestToken
     *        A unique, user-specified identifier for this request that ensures idempotency.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContactRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
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
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getFirstName() != null)
            sb.append("FirstName: ").append(getFirstName()).append(",");
        if (getLastName() != null)
            sb.append("LastName: ").append(getLastName()).append(",");
        if (getPhoneNumber() != null)
            sb.append("PhoneNumber: ").append("***Sensitive Data Redacted***").append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateContactRequest == false)
            return false;
        CreateContactRequest other = (CreateContactRequest) obj;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getFirstName() == null ^ this.getFirstName() == null)
            return false;
        if (other.getFirstName() != null && other.getFirstName().equals(this.getFirstName()) == false)
            return false;
        if (other.getLastName() == null ^ this.getLastName() == null)
            return false;
        if (other.getLastName() != null && other.getLastName().equals(this.getLastName()) == false)
            return false;
        if (other.getPhoneNumber() == null ^ this.getPhoneNumber() == null)
            return false;
        if (other.getPhoneNumber() != null && other.getPhoneNumber().equals(this.getPhoneNumber()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getFirstName() == null) ? 0 : getFirstName().hashCode());
        hashCode = prime * hashCode + ((getLastName() == null) ? 0 : getLastName().hashCode());
        hashCode = prime * hashCode + ((getPhoneNumber() == null) ? 0 : getPhoneNumber().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateContactRequest clone() {
        return (CreateContactRequest) super.clone();
    }

}
