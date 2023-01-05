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
package com.amazonaws.services.iotfleetwise.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/GetRegisterAccountStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRegisterAccountStatusResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique ID of the Amazon Web Services account, provided at account creation.
     * </p>
     */
    private String customerAccountId;
    /**
     * <p>
     * The status of registering your account and resources. The status can be one of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>REGISTRATION_SUCCESS</code> - The Amazon Web Services resource is successfully registered.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REGISTRATION_PENDING</code> - Amazon Web Services IoT FleetWise is processing the registration request.
     * This process takes approximately five minutes to complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REGISTRATION_FAILURE</code> - Amazon Web Services IoT FleetWise can't register the AWS resource. Try again
     * later.
     * </p>
     * </li>
     * </ul>
     */
    private String accountStatus;
    /**
     * <p>
     * Information about the registered Amazon Timestream resources or errors, if any.
     * </p>
     */
    private TimestreamRegistrationResponse timestreamRegistrationResponse;
    /**
     * <p>
     * Information about the registered IAM resources or errors, if any.
     * </p>
     */
    private IamRegistrationResponse iamRegistrationResponse;
    /**
     * <p>
     * The time the account was registered, in seconds since epoch (January 1, 1970 at midnight UTC time).
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The time this registration was last updated, in seconds since epoch (January 1, 1970 at midnight UTC time).
     * </p>
     */
    private java.util.Date lastModificationTime;

    /**
     * <p>
     * The unique ID of the Amazon Web Services account, provided at account creation.
     * </p>
     * 
     * @param customerAccountId
     *        The unique ID of the Amazon Web Services account, provided at account creation.
     */

    public void setCustomerAccountId(String customerAccountId) {
        this.customerAccountId = customerAccountId;
    }

    /**
     * <p>
     * The unique ID of the Amazon Web Services account, provided at account creation.
     * </p>
     * 
     * @return The unique ID of the Amazon Web Services account, provided at account creation.
     */

    public String getCustomerAccountId() {
        return this.customerAccountId;
    }

    /**
     * <p>
     * The unique ID of the Amazon Web Services account, provided at account creation.
     * </p>
     * 
     * @param customerAccountId
     *        The unique ID of the Amazon Web Services account, provided at account creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRegisterAccountStatusResult withCustomerAccountId(String customerAccountId) {
        setCustomerAccountId(customerAccountId);
        return this;
    }

    /**
     * <p>
     * The status of registering your account and resources. The status can be one of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>REGISTRATION_SUCCESS</code> - The Amazon Web Services resource is successfully registered.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REGISTRATION_PENDING</code> - Amazon Web Services IoT FleetWise is processing the registration request.
     * This process takes approximately five minutes to complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REGISTRATION_FAILURE</code> - Amazon Web Services IoT FleetWise can't register the AWS resource. Try again
     * later.
     * </p>
     * </li>
     * </ul>
     * 
     * @param accountStatus
     *        The status of registering your account and resources. The status can be one of:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>REGISTRATION_SUCCESS</code> - The Amazon Web Services resource is successfully registered.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REGISTRATION_PENDING</code> - Amazon Web Services IoT FleetWise is processing the registration
     *        request. This process takes approximately five minutes to complete.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REGISTRATION_FAILURE</code> - Amazon Web Services IoT FleetWise can't register the AWS resource. Try
     *        again later.
     *        </p>
     *        </li>
     * @see RegistrationStatus
     */

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    /**
     * <p>
     * The status of registering your account and resources. The status can be one of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>REGISTRATION_SUCCESS</code> - The Amazon Web Services resource is successfully registered.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REGISTRATION_PENDING</code> - Amazon Web Services IoT FleetWise is processing the registration request.
     * This process takes approximately five minutes to complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REGISTRATION_FAILURE</code> - Amazon Web Services IoT FleetWise can't register the AWS resource. Try again
     * later.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of registering your account and resources. The status can be one of:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>REGISTRATION_SUCCESS</code> - The Amazon Web Services resource is successfully registered.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>REGISTRATION_PENDING</code> - Amazon Web Services IoT FleetWise is processing the registration
     *         request. This process takes approximately five minutes to complete.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>REGISTRATION_FAILURE</code> - Amazon Web Services IoT FleetWise can't register the AWS resource.
     *         Try again later.
     *         </p>
     *         </li>
     * @see RegistrationStatus
     */

    public String getAccountStatus() {
        return this.accountStatus;
    }

    /**
     * <p>
     * The status of registering your account and resources. The status can be one of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>REGISTRATION_SUCCESS</code> - The Amazon Web Services resource is successfully registered.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REGISTRATION_PENDING</code> - Amazon Web Services IoT FleetWise is processing the registration request.
     * This process takes approximately five minutes to complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REGISTRATION_FAILURE</code> - Amazon Web Services IoT FleetWise can't register the AWS resource. Try again
     * later.
     * </p>
     * </li>
     * </ul>
     * 
     * @param accountStatus
     *        The status of registering your account and resources. The status can be one of:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>REGISTRATION_SUCCESS</code> - The Amazon Web Services resource is successfully registered.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REGISTRATION_PENDING</code> - Amazon Web Services IoT FleetWise is processing the registration
     *        request. This process takes approximately five minutes to complete.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REGISTRATION_FAILURE</code> - Amazon Web Services IoT FleetWise can't register the AWS resource. Try
     *        again later.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RegistrationStatus
     */

    public GetRegisterAccountStatusResult withAccountStatus(String accountStatus) {
        setAccountStatus(accountStatus);
        return this;
    }

    /**
     * <p>
     * The status of registering your account and resources. The status can be one of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>REGISTRATION_SUCCESS</code> - The Amazon Web Services resource is successfully registered.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REGISTRATION_PENDING</code> - Amazon Web Services IoT FleetWise is processing the registration request.
     * This process takes approximately five minutes to complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REGISTRATION_FAILURE</code> - Amazon Web Services IoT FleetWise can't register the AWS resource. Try again
     * later.
     * </p>
     * </li>
     * </ul>
     * 
     * @param accountStatus
     *        The status of registering your account and resources. The status can be one of:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>REGISTRATION_SUCCESS</code> - The Amazon Web Services resource is successfully registered.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REGISTRATION_PENDING</code> - Amazon Web Services IoT FleetWise is processing the registration
     *        request. This process takes approximately five minutes to complete.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REGISTRATION_FAILURE</code> - Amazon Web Services IoT FleetWise can't register the AWS resource. Try
     *        again later.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RegistrationStatus
     */

    public GetRegisterAccountStatusResult withAccountStatus(RegistrationStatus accountStatus) {
        this.accountStatus = accountStatus.toString();
        return this;
    }

    /**
     * <p>
     * Information about the registered Amazon Timestream resources or errors, if any.
     * </p>
     * 
     * @param timestreamRegistrationResponse
     *        Information about the registered Amazon Timestream resources or errors, if any.
     */

    public void setTimestreamRegistrationResponse(TimestreamRegistrationResponse timestreamRegistrationResponse) {
        this.timestreamRegistrationResponse = timestreamRegistrationResponse;
    }

    /**
     * <p>
     * Information about the registered Amazon Timestream resources or errors, if any.
     * </p>
     * 
     * @return Information about the registered Amazon Timestream resources or errors, if any.
     */

    public TimestreamRegistrationResponse getTimestreamRegistrationResponse() {
        return this.timestreamRegistrationResponse;
    }

    /**
     * <p>
     * Information about the registered Amazon Timestream resources or errors, if any.
     * </p>
     * 
     * @param timestreamRegistrationResponse
     *        Information about the registered Amazon Timestream resources or errors, if any.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRegisterAccountStatusResult withTimestreamRegistrationResponse(TimestreamRegistrationResponse timestreamRegistrationResponse) {
        setTimestreamRegistrationResponse(timestreamRegistrationResponse);
        return this;
    }

    /**
     * <p>
     * Information about the registered IAM resources or errors, if any.
     * </p>
     * 
     * @param iamRegistrationResponse
     *        Information about the registered IAM resources or errors, if any.
     */

    public void setIamRegistrationResponse(IamRegistrationResponse iamRegistrationResponse) {
        this.iamRegistrationResponse = iamRegistrationResponse;
    }

    /**
     * <p>
     * Information about the registered IAM resources or errors, if any.
     * </p>
     * 
     * @return Information about the registered IAM resources or errors, if any.
     */

    public IamRegistrationResponse getIamRegistrationResponse() {
        return this.iamRegistrationResponse;
    }

    /**
     * <p>
     * Information about the registered IAM resources or errors, if any.
     * </p>
     * 
     * @param iamRegistrationResponse
     *        Information about the registered IAM resources or errors, if any.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRegisterAccountStatusResult withIamRegistrationResponse(IamRegistrationResponse iamRegistrationResponse) {
        setIamRegistrationResponse(iamRegistrationResponse);
        return this;
    }

    /**
     * <p>
     * The time the account was registered, in seconds since epoch (January 1, 1970 at midnight UTC time).
     * </p>
     * 
     * @param creationTime
     *        The time the account was registered, in seconds since epoch (January 1, 1970 at midnight UTC time).
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time the account was registered, in seconds since epoch (January 1, 1970 at midnight UTC time).
     * </p>
     * 
     * @return The time the account was registered, in seconds since epoch (January 1, 1970 at midnight UTC time).
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time the account was registered, in seconds since epoch (January 1, 1970 at midnight UTC time).
     * </p>
     * 
     * @param creationTime
     *        The time the account was registered, in seconds since epoch (January 1, 1970 at midnight UTC time).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRegisterAccountStatusResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The time this registration was last updated, in seconds since epoch (January 1, 1970 at midnight UTC time).
     * </p>
     * 
     * @param lastModificationTime
     *        The time this registration was last updated, in seconds since epoch (January 1, 1970 at midnight UTC
     *        time).
     */

    public void setLastModificationTime(java.util.Date lastModificationTime) {
        this.lastModificationTime = lastModificationTime;
    }

    /**
     * <p>
     * The time this registration was last updated, in seconds since epoch (January 1, 1970 at midnight UTC time).
     * </p>
     * 
     * @return The time this registration was last updated, in seconds since epoch (January 1, 1970 at midnight UTC
     *         time).
     */

    public java.util.Date getLastModificationTime() {
        return this.lastModificationTime;
    }

    /**
     * <p>
     * The time this registration was last updated, in seconds since epoch (January 1, 1970 at midnight UTC time).
     * </p>
     * 
     * @param lastModificationTime
     *        The time this registration was last updated, in seconds since epoch (January 1, 1970 at midnight UTC
     *        time).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRegisterAccountStatusResult withLastModificationTime(java.util.Date lastModificationTime) {
        setLastModificationTime(lastModificationTime);
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
        if (getCustomerAccountId() != null)
            sb.append("CustomerAccountId: ").append(getCustomerAccountId()).append(",");
        if (getAccountStatus() != null)
            sb.append("AccountStatus: ").append(getAccountStatus()).append(",");
        if (getTimestreamRegistrationResponse() != null)
            sb.append("TimestreamRegistrationResponse: ").append(getTimestreamRegistrationResponse()).append(",");
        if (getIamRegistrationResponse() != null)
            sb.append("IamRegistrationResponse: ").append(getIamRegistrationResponse()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastModificationTime() != null)
            sb.append("LastModificationTime: ").append(getLastModificationTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRegisterAccountStatusResult == false)
            return false;
        GetRegisterAccountStatusResult other = (GetRegisterAccountStatusResult) obj;
        if (other.getCustomerAccountId() == null ^ this.getCustomerAccountId() == null)
            return false;
        if (other.getCustomerAccountId() != null && other.getCustomerAccountId().equals(this.getCustomerAccountId()) == false)
            return false;
        if (other.getAccountStatus() == null ^ this.getAccountStatus() == null)
            return false;
        if (other.getAccountStatus() != null && other.getAccountStatus().equals(this.getAccountStatus()) == false)
            return false;
        if (other.getTimestreamRegistrationResponse() == null ^ this.getTimestreamRegistrationResponse() == null)
            return false;
        if (other.getTimestreamRegistrationResponse() != null
                && other.getTimestreamRegistrationResponse().equals(this.getTimestreamRegistrationResponse()) == false)
            return false;
        if (other.getIamRegistrationResponse() == null ^ this.getIamRegistrationResponse() == null)
            return false;
        if (other.getIamRegistrationResponse() != null && other.getIamRegistrationResponse().equals(this.getIamRegistrationResponse()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastModificationTime() == null ^ this.getLastModificationTime() == null)
            return false;
        if (other.getLastModificationTime() != null && other.getLastModificationTime().equals(this.getLastModificationTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCustomerAccountId() == null) ? 0 : getCustomerAccountId().hashCode());
        hashCode = prime * hashCode + ((getAccountStatus() == null) ? 0 : getAccountStatus().hashCode());
        hashCode = prime * hashCode + ((getTimestreamRegistrationResponse() == null) ? 0 : getTimestreamRegistrationResponse().hashCode());
        hashCode = prime * hashCode + ((getIamRegistrationResponse() == null) ? 0 : getIamRegistrationResponse().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModificationTime() == null) ? 0 : getLastModificationTime().hashCode());
        return hashCode;
    }

    @Override
    public GetRegisterAccountStatusResult clone() {
        try {
            return (GetRegisterAccountStatusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
