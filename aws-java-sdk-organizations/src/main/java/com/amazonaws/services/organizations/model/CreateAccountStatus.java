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
package com.amazonaws.services.organizations.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the status about a <a>CreateAccount</a> or <a>CreateGovCloudAccount</a> request to create an AWS account or
 * an AWS GovCloud (US) account in an organization.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/CreateAccountStatus" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAccountStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier (ID) that references this request. You get this value from the response of the initial
     * <a>CreateAccount</a> request to create the account.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an create account request ID string requires
     * "car-" followed by from 8 to 32 lower-case letters or digits.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The account name given to the account when it was created.
     * </p>
     */
    private String accountName;
    /**
     * <p>
     * The status of the request.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The date and time that the request was made for the account creation.
     * </p>
     */
    private java.util.Date requestedTimestamp;
    /**
     * <p>
     * The date and time that the account was created and the request completed.
     * </p>
     */
    private java.util.Date completedTimestamp;
    /**
     * <p>
     * If the account was created successfully, the unique identifier (ID) of the new account.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an account ID string requires exactly 12
     * digits.
     * </p>
     */
    private String accountId;
    /** <p/> */
    private String govCloudAccountId;
    /**
     * <p>
     * If the request failed, a description of the reason for the failure.
     * </p>
     * <ul>
     * <li>
     * <p>
     * ACCOUNT_LIMIT_EXCEEDED: The account could not be created because you have reached the limit on the number of
     * accounts in your organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * EMAIL_ALREADY_EXISTS: The account could not be created because another AWS account with that email address
     * already exists.
     * </p>
     * </li>
     * <li>
     * <p>
     * INVALID_ADDRESS: The account could not be created because the address you provided is not valid.
     * </p>
     * </li>
     * <li>
     * <p>
     * INVALID_EMAIL: The account could not be created because the email address you provided is not valid.
     * </p>
     * </li>
     * <li>
     * <p>
     * INTERNAL_FAILURE: The account could not be created because of an internal failure. Try again later. If the
     * problem persists, contact Customer Support.
     * </p>
     * </li>
     * </ul>
     */
    private String failureReason;

    /**
     * <p>
     * The unique identifier (ID) that references this request. You get this value from the response of the initial
     * <a>CreateAccount</a> request to create the account.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an create account request ID string requires
     * "car-" followed by from 8 to 32 lower-case letters or digits.
     * </p>
     * 
     * @param id
     *        The unique identifier (ID) that references this request. You get this value from the response of the
     *        initial <a>CreateAccount</a> request to create the account.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an create account request ID string
     *        requires "car-" followed by from 8 to 32 lower-case letters or digits.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier (ID) that references this request. You get this value from the response of the initial
     * <a>CreateAccount</a> request to create the account.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an create account request ID string requires
     * "car-" followed by from 8 to 32 lower-case letters or digits.
     * </p>
     * 
     * @return The unique identifier (ID) that references this request. You get this value from the response of the
     *         initial <a>CreateAccount</a> request to create the account.</p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an create account request ID string
     *         requires "car-" followed by from 8 to 32 lower-case letters or digits.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier (ID) that references this request. You get this value from the response of the initial
     * <a>CreateAccount</a> request to create the account.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an create account request ID string requires
     * "car-" followed by from 8 to 32 lower-case letters or digits.
     * </p>
     * 
     * @param id
     *        The unique identifier (ID) that references this request. You get this value from the response of the
     *        initial <a>CreateAccount</a> request to create the account.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an create account request ID string
     *        requires "car-" followed by from 8 to 32 lower-case letters or digits.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccountStatus withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The account name given to the account when it was created.
     * </p>
     * 
     * @param accountName
     *        The account name given to the account when it was created.
     */

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    /**
     * <p>
     * The account name given to the account when it was created.
     * </p>
     * 
     * @return The account name given to the account when it was created.
     */

    public String getAccountName() {
        return this.accountName;
    }

    /**
     * <p>
     * The account name given to the account when it was created.
     * </p>
     * 
     * @param accountName
     *        The account name given to the account when it was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccountStatus withAccountName(String accountName) {
        setAccountName(accountName);
        return this;
    }

    /**
     * <p>
     * The status of the request.
     * </p>
     * 
     * @param state
     *        The status of the request.
     * @see CreateAccountState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The status of the request.
     * </p>
     * 
     * @return The status of the request.
     * @see CreateAccountState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The status of the request.
     * </p>
     * 
     * @param state
     *        The status of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CreateAccountState
     */

    public CreateAccountStatus withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The status of the request.
     * </p>
     * 
     * @param state
     *        The status of the request.
     * @see CreateAccountState
     */

    public void setState(CreateAccountState state) {
        withState(state);
    }

    /**
     * <p>
     * The status of the request.
     * </p>
     * 
     * @param state
     *        The status of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CreateAccountState
     */

    public CreateAccountStatus withState(CreateAccountState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The date and time that the request was made for the account creation.
     * </p>
     * 
     * @param requestedTimestamp
     *        The date and time that the request was made for the account creation.
     */

    public void setRequestedTimestamp(java.util.Date requestedTimestamp) {
        this.requestedTimestamp = requestedTimestamp;
    }

    /**
     * <p>
     * The date and time that the request was made for the account creation.
     * </p>
     * 
     * @return The date and time that the request was made for the account creation.
     */

    public java.util.Date getRequestedTimestamp() {
        return this.requestedTimestamp;
    }

    /**
     * <p>
     * The date and time that the request was made for the account creation.
     * </p>
     * 
     * @param requestedTimestamp
     *        The date and time that the request was made for the account creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccountStatus withRequestedTimestamp(java.util.Date requestedTimestamp) {
        setRequestedTimestamp(requestedTimestamp);
        return this;
    }

    /**
     * <p>
     * The date and time that the account was created and the request completed.
     * </p>
     * 
     * @param completedTimestamp
     *        The date and time that the account was created and the request completed.
     */

    public void setCompletedTimestamp(java.util.Date completedTimestamp) {
        this.completedTimestamp = completedTimestamp;
    }

    /**
     * <p>
     * The date and time that the account was created and the request completed.
     * </p>
     * 
     * @return The date and time that the account was created and the request completed.
     */

    public java.util.Date getCompletedTimestamp() {
        return this.completedTimestamp;
    }

    /**
     * <p>
     * The date and time that the account was created and the request completed.
     * </p>
     * 
     * @param completedTimestamp
     *        The date and time that the account was created and the request completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccountStatus withCompletedTimestamp(java.util.Date completedTimestamp) {
        setCompletedTimestamp(completedTimestamp);
        return this;
    }

    /**
     * <p>
     * If the account was created successfully, the unique identifier (ID) of the new account.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an account ID string requires exactly 12
     * digits.
     * </p>
     * 
     * @param accountId
     *        If the account was created successfully, the unique identifier (ID) of the new account.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an account ID string requires exactly
     *        12 digits.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * If the account was created successfully, the unique identifier (ID) of the new account.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an account ID string requires exactly 12
     * digits.
     * </p>
     * 
     * @return If the account was created successfully, the unique identifier (ID) of the new account.</p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an account ID string requires exactly
     *         12 digits.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * If the account was created successfully, the unique identifier (ID) of the new account.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an account ID string requires exactly 12
     * digits.
     * </p>
     * 
     * @param accountId
     *        If the account was created successfully, the unique identifier (ID) of the new account.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an account ID string requires exactly
     *        12 digits.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccountStatus withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p/>
     * 
     * @param govCloudAccountId
     */

    public void setGovCloudAccountId(String govCloudAccountId) {
        this.govCloudAccountId = govCloudAccountId;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getGovCloudAccountId() {
        return this.govCloudAccountId;
    }

    /**
     * <p/>
     * 
     * @param govCloudAccountId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccountStatus withGovCloudAccountId(String govCloudAccountId) {
        setGovCloudAccountId(govCloudAccountId);
        return this;
    }

    /**
     * <p>
     * If the request failed, a description of the reason for the failure.
     * </p>
     * <ul>
     * <li>
     * <p>
     * ACCOUNT_LIMIT_EXCEEDED: The account could not be created because you have reached the limit on the number of
     * accounts in your organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * EMAIL_ALREADY_EXISTS: The account could not be created because another AWS account with that email address
     * already exists.
     * </p>
     * </li>
     * <li>
     * <p>
     * INVALID_ADDRESS: The account could not be created because the address you provided is not valid.
     * </p>
     * </li>
     * <li>
     * <p>
     * INVALID_EMAIL: The account could not be created because the email address you provided is not valid.
     * </p>
     * </li>
     * <li>
     * <p>
     * INTERNAL_FAILURE: The account could not be created because of an internal failure. Try again later. If the
     * problem persists, contact Customer Support.
     * </p>
     * </li>
     * </ul>
     * 
     * @param failureReason
     *        If the request failed, a description of the reason for the failure.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        ACCOUNT_LIMIT_EXCEEDED: The account could not be created because you have reached the limit on the number
     *        of accounts in your organization.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        EMAIL_ALREADY_EXISTS: The account could not be created because another AWS account with that email address
     *        already exists.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INVALID_ADDRESS: The account could not be created because the address you provided is not valid.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INVALID_EMAIL: The account could not be created because the email address you provided is not valid.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INTERNAL_FAILURE: The account could not be created because of an internal failure. Try again later. If the
     *        problem persists, contact Customer Support.
     *        </p>
     *        </li>
     * @see CreateAccountFailureReason
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * If the request failed, a description of the reason for the failure.
     * </p>
     * <ul>
     * <li>
     * <p>
     * ACCOUNT_LIMIT_EXCEEDED: The account could not be created because you have reached the limit on the number of
     * accounts in your organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * EMAIL_ALREADY_EXISTS: The account could not be created because another AWS account with that email address
     * already exists.
     * </p>
     * </li>
     * <li>
     * <p>
     * INVALID_ADDRESS: The account could not be created because the address you provided is not valid.
     * </p>
     * </li>
     * <li>
     * <p>
     * INVALID_EMAIL: The account could not be created because the email address you provided is not valid.
     * </p>
     * </li>
     * <li>
     * <p>
     * INTERNAL_FAILURE: The account could not be created because of an internal failure. Try again later. If the
     * problem persists, contact Customer Support.
     * </p>
     * </li>
     * </ul>
     * 
     * @return If the request failed, a description of the reason for the failure.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         ACCOUNT_LIMIT_EXCEEDED: The account could not be created because you have reached the limit on the number
     *         of accounts in your organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         EMAIL_ALREADY_EXISTS: The account could not be created because another AWS account with that email
     *         address already exists.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_ADDRESS: The account could not be created because the address you provided is not valid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INVALID_EMAIL: The account could not be created because the email address you provided is not valid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INTERNAL_FAILURE: The account could not be created because of an internal failure. Try again later. If
     *         the problem persists, contact Customer Support.
     *         </p>
     *         </li>
     * @see CreateAccountFailureReason
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * If the request failed, a description of the reason for the failure.
     * </p>
     * <ul>
     * <li>
     * <p>
     * ACCOUNT_LIMIT_EXCEEDED: The account could not be created because you have reached the limit on the number of
     * accounts in your organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * EMAIL_ALREADY_EXISTS: The account could not be created because another AWS account with that email address
     * already exists.
     * </p>
     * </li>
     * <li>
     * <p>
     * INVALID_ADDRESS: The account could not be created because the address you provided is not valid.
     * </p>
     * </li>
     * <li>
     * <p>
     * INVALID_EMAIL: The account could not be created because the email address you provided is not valid.
     * </p>
     * </li>
     * <li>
     * <p>
     * INTERNAL_FAILURE: The account could not be created because of an internal failure. Try again later. If the
     * problem persists, contact Customer Support.
     * </p>
     * </li>
     * </ul>
     * 
     * @param failureReason
     *        If the request failed, a description of the reason for the failure.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        ACCOUNT_LIMIT_EXCEEDED: The account could not be created because you have reached the limit on the number
     *        of accounts in your organization.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        EMAIL_ALREADY_EXISTS: The account could not be created because another AWS account with that email address
     *        already exists.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INVALID_ADDRESS: The account could not be created because the address you provided is not valid.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INVALID_EMAIL: The account could not be created because the email address you provided is not valid.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INTERNAL_FAILURE: The account could not be created because of an internal failure. Try again later. If the
     *        problem persists, contact Customer Support.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CreateAccountFailureReason
     */

    public CreateAccountStatus withFailureReason(String failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * If the request failed, a description of the reason for the failure.
     * </p>
     * <ul>
     * <li>
     * <p>
     * ACCOUNT_LIMIT_EXCEEDED: The account could not be created because you have reached the limit on the number of
     * accounts in your organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * EMAIL_ALREADY_EXISTS: The account could not be created because another AWS account with that email address
     * already exists.
     * </p>
     * </li>
     * <li>
     * <p>
     * INVALID_ADDRESS: The account could not be created because the address you provided is not valid.
     * </p>
     * </li>
     * <li>
     * <p>
     * INVALID_EMAIL: The account could not be created because the email address you provided is not valid.
     * </p>
     * </li>
     * <li>
     * <p>
     * INTERNAL_FAILURE: The account could not be created because of an internal failure. Try again later. If the
     * problem persists, contact Customer Support.
     * </p>
     * </li>
     * </ul>
     * 
     * @param failureReason
     *        If the request failed, a description of the reason for the failure.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        ACCOUNT_LIMIT_EXCEEDED: The account could not be created because you have reached the limit on the number
     *        of accounts in your organization.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        EMAIL_ALREADY_EXISTS: The account could not be created because another AWS account with that email address
     *        already exists.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INVALID_ADDRESS: The account could not be created because the address you provided is not valid.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INVALID_EMAIL: The account could not be created because the email address you provided is not valid.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INTERNAL_FAILURE: The account could not be created because of an internal failure. Try again later. If the
     *        problem persists, contact Customer Support.
     *        </p>
     *        </li>
     * @see CreateAccountFailureReason
     */

    public void setFailureReason(CreateAccountFailureReason failureReason) {
        withFailureReason(failureReason);
    }

    /**
     * <p>
     * If the request failed, a description of the reason for the failure.
     * </p>
     * <ul>
     * <li>
     * <p>
     * ACCOUNT_LIMIT_EXCEEDED: The account could not be created because you have reached the limit on the number of
     * accounts in your organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * EMAIL_ALREADY_EXISTS: The account could not be created because another AWS account with that email address
     * already exists.
     * </p>
     * </li>
     * <li>
     * <p>
     * INVALID_ADDRESS: The account could not be created because the address you provided is not valid.
     * </p>
     * </li>
     * <li>
     * <p>
     * INVALID_EMAIL: The account could not be created because the email address you provided is not valid.
     * </p>
     * </li>
     * <li>
     * <p>
     * INTERNAL_FAILURE: The account could not be created because of an internal failure. Try again later. If the
     * problem persists, contact Customer Support.
     * </p>
     * </li>
     * </ul>
     * 
     * @param failureReason
     *        If the request failed, a description of the reason for the failure.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        ACCOUNT_LIMIT_EXCEEDED: The account could not be created because you have reached the limit on the number
     *        of accounts in your organization.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        EMAIL_ALREADY_EXISTS: The account could not be created because another AWS account with that email address
     *        already exists.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INVALID_ADDRESS: The account could not be created because the address you provided is not valid.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INVALID_EMAIL: The account could not be created because the email address you provided is not valid.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INTERNAL_FAILURE: The account could not be created because of an internal failure. Try again later. If the
     *        problem persists, contact Customer Support.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CreateAccountFailureReason
     */

    public CreateAccountStatus withFailureReason(CreateAccountFailureReason failureReason) {
        this.failureReason = failureReason.toString();
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getAccountName() != null)
            sb.append("AccountName: ").append("***Sensitive Data Redacted***").append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getRequestedTimestamp() != null)
            sb.append("RequestedTimestamp: ").append(getRequestedTimestamp()).append(",");
        if (getCompletedTimestamp() != null)
            sb.append("CompletedTimestamp: ").append(getCompletedTimestamp()).append(",");
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getGovCloudAccountId() != null)
            sb.append("GovCloudAccountId: ").append(getGovCloudAccountId()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAccountStatus == false)
            return false;
        CreateAccountStatus other = (CreateAccountStatus) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getAccountName() == null ^ this.getAccountName() == null)
            return false;
        if (other.getAccountName() != null && other.getAccountName().equals(this.getAccountName()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getRequestedTimestamp() == null ^ this.getRequestedTimestamp() == null)
            return false;
        if (other.getRequestedTimestamp() != null && other.getRequestedTimestamp().equals(this.getRequestedTimestamp()) == false)
            return false;
        if (other.getCompletedTimestamp() == null ^ this.getCompletedTimestamp() == null)
            return false;
        if (other.getCompletedTimestamp() != null && other.getCompletedTimestamp().equals(this.getCompletedTimestamp()) == false)
            return false;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getGovCloudAccountId() == null ^ this.getGovCloudAccountId() == null)
            return false;
        if (other.getGovCloudAccountId() != null && other.getGovCloudAccountId().equals(this.getGovCloudAccountId()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getAccountName() == null) ? 0 : getAccountName().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getRequestedTimestamp() == null) ? 0 : getRequestedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getCompletedTimestamp() == null) ? 0 : getCompletedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getGovCloudAccountId() == null) ? 0 : getGovCloudAccountId().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        return hashCode;
    }

    @Override
    public CreateAccountStatus clone() {
        try {
            return (CreateAccountStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.organizations.model.transform.CreateAccountStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
