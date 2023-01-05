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
package com.amazonaws.services.account;

import javax.annotation.Generated;

import com.amazonaws.services.account.model.*;

/**
 * Interface for accessing AWS Account asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.account.AbstractAWSAccountAsync} instead.
 * </p>
 * <p>
 * <p>
 * Operations for Amazon Web Services Account Management
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSAccountAsync extends AWSAccount {

    /**
     * <p>
     * Deletes the specified alternate contact from an Amazon Web Services account.
     * </p>
     * <p>
     * For complete details about how to use the alternate contact operations, see <a
     * href="https://docs.aws.amazon.com/accounts/latest/reference/manage-acct-update-contact.html">Access or updating
     * the alternate contacts</a>.
     * </p>
     * <note>
     * <p>
     * Before you can update the alternate contact information for an Amazon Web Services account that is managed by
     * Organizations, you must first enable integration between Amazon Web Services Account Management and
     * Organizations. For more information, see <a
     * href="https://docs.aws.amazon.com/accounts/latest/reference/using-orgs-trusted-access.html">Enabling trusted
     * access for Amazon Web Services Account Management</a>.
     * </p>
     * </note>
     * 
     * @param deleteAlternateContactRequest
     * @return A Java Future containing the result of the DeleteAlternateContact operation returned by the service.
     * @sample AWSAccountAsync.DeleteAlternateContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/account-2021-02-01/DeleteAlternateContact" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAlternateContactResult> deleteAlternateContactAsync(DeleteAlternateContactRequest deleteAlternateContactRequest);

    /**
     * <p>
     * Deletes the specified alternate contact from an Amazon Web Services account.
     * </p>
     * <p>
     * For complete details about how to use the alternate contact operations, see <a
     * href="https://docs.aws.amazon.com/accounts/latest/reference/manage-acct-update-contact.html">Access or updating
     * the alternate contacts</a>.
     * </p>
     * <note>
     * <p>
     * Before you can update the alternate contact information for an Amazon Web Services account that is managed by
     * Organizations, you must first enable integration between Amazon Web Services Account Management and
     * Organizations. For more information, see <a
     * href="https://docs.aws.amazon.com/accounts/latest/reference/using-orgs-trusted-access.html">Enabling trusted
     * access for Amazon Web Services Account Management</a>.
     * </p>
     * </note>
     * 
     * @param deleteAlternateContactRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAlternateContact operation returned by the service.
     * @sample AWSAccountAsyncHandler.DeleteAlternateContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/account-2021-02-01/DeleteAlternateContact" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAlternateContactResult> deleteAlternateContactAsync(DeleteAlternateContactRequest deleteAlternateContactRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAlternateContactRequest, DeleteAlternateContactResult> asyncHandler);

    /**
     * <p>
     * Retrieves the specified alternate contact attached to an Amazon Web Services account.
     * </p>
     * <p>
     * For complete details about how to use the alternate contact operations, see <a
     * href="https://docs.aws.amazon.com/accounts/latest/reference/manage-acct-update-contact.html">Access or updating
     * the alternate contacts</a>.
     * </p>
     * <note>
     * <p>
     * Before you can update the alternate contact information for an Amazon Web Services account that is managed by
     * Organizations, you must first enable integration between Amazon Web Services Account Management and
     * Organizations. For more information, see <a
     * href="https://docs.aws.amazon.com/accounts/latest/reference/using-orgs-trusted-access.html">Enabling trusted
     * access for Amazon Web Services Account Management</a>.
     * </p>
     * </note>
     * 
     * @param getAlternateContactRequest
     * @return A Java Future containing the result of the GetAlternateContact operation returned by the service.
     * @sample AWSAccountAsync.GetAlternateContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/account-2021-02-01/GetAlternateContact" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetAlternateContactResult> getAlternateContactAsync(GetAlternateContactRequest getAlternateContactRequest);

    /**
     * <p>
     * Retrieves the specified alternate contact attached to an Amazon Web Services account.
     * </p>
     * <p>
     * For complete details about how to use the alternate contact operations, see <a
     * href="https://docs.aws.amazon.com/accounts/latest/reference/manage-acct-update-contact.html">Access or updating
     * the alternate contacts</a>.
     * </p>
     * <note>
     * <p>
     * Before you can update the alternate contact information for an Amazon Web Services account that is managed by
     * Organizations, you must first enable integration between Amazon Web Services Account Management and
     * Organizations. For more information, see <a
     * href="https://docs.aws.amazon.com/accounts/latest/reference/using-orgs-trusted-access.html">Enabling trusted
     * access for Amazon Web Services Account Management</a>.
     * </p>
     * </note>
     * 
     * @param getAlternateContactRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAlternateContact operation returned by the service.
     * @sample AWSAccountAsyncHandler.GetAlternateContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/account-2021-02-01/GetAlternateContact" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetAlternateContactResult> getAlternateContactAsync(GetAlternateContactRequest getAlternateContactRequest,
            com.amazonaws.handlers.AsyncHandler<GetAlternateContactRequest, GetAlternateContactResult> asyncHandler);

    /**
     * <p>
     * Retrieves the primary contact information of an Amazon Web Services account.
     * </p>
     * <p>
     * For complete details about how to use the primary contact operations, see <a
     * href="https://docs.aws.amazon.com/accounts/latest/reference/manage-acct-update-contact.html">Update the primary
     * and alternate contact information</a>.
     * </p>
     * 
     * @param getContactInformationRequest
     * @return A Java Future containing the result of the GetContactInformation operation returned by the service.
     * @sample AWSAccountAsync.GetContactInformation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/account-2021-02-01/GetContactInformation" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetContactInformationResult> getContactInformationAsync(GetContactInformationRequest getContactInformationRequest);

    /**
     * <p>
     * Retrieves the primary contact information of an Amazon Web Services account.
     * </p>
     * <p>
     * For complete details about how to use the primary contact operations, see <a
     * href="https://docs.aws.amazon.com/accounts/latest/reference/manage-acct-update-contact.html">Update the primary
     * and alternate contact information</a>.
     * </p>
     * 
     * @param getContactInformationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetContactInformation operation returned by the service.
     * @sample AWSAccountAsyncHandler.GetContactInformation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/account-2021-02-01/GetContactInformation" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetContactInformationResult> getContactInformationAsync(GetContactInformationRequest getContactInformationRequest,
            com.amazonaws.handlers.AsyncHandler<GetContactInformationRequest, GetContactInformationResult> asyncHandler);

    /**
     * <p>
     * Modifies the specified alternate contact attached to an Amazon Web Services account.
     * </p>
     * <p>
     * For complete details about how to use the alternate contact operations, see <a
     * href="https://docs.aws.amazon.com/accounts/latest/reference/manage-acct-update-contact.html">Access or updating
     * the alternate contacts</a>.
     * </p>
     * <note>
     * <p>
     * Before you can update the alternate contact information for an Amazon Web Services account that is managed by
     * Organizations, you must first enable integration between Amazon Web Services Account Management and
     * Organizations. For more information, see <a
     * href="https://docs.aws.amazon.com/accounts/latest/reference/using-orgs-trusted-access.html">Enabling trusted
     * access for Amazon Web Services Account Management</a>.
     * </p>
     * </note>
     * 
     * @param putAlternateContactRequest
     * @return A Java Future containing the result of the PutAlternateContact operation returned by the service.
     * @sample AWSAccountAsync.PutAlternateContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/account-2021-02-01/PutAlternateContact" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutAlternateContactResult> putAlternateContactAsync(PutAlternateContactRequest putAlternateContactRequest);

    /**
     * <p>
     * Modifies the specified alternate contact attached to an Amazon Web Services account.
     * </p>
     * <p>
     * For complete details about how to use the alternate contact operations, see <a
     * href="https://docs.aws.amazon.com/accounts/latest/reference/manage-acct-update-contact.html">Access or updating
     * the alternate contacts</a>.
     * </p>
     * <note>
     * <p>
     * Before you can update the alternate contact information for an Amazon Web Services account that is managed by
     * Organizations, you must first enable integration between Amazon Web Services Account Management and
     * Organizations. For more information, see <a
     * href="https://docs.aws.amazon.com/accounts/latest/reference/using-orgs-trusted-access.html">Enabling trusted
     * access for Amazon Web Services Account Management</a>.
     * </p>
     * </note>
     * 
     * @param putAlternateContactRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutAlternateContact operation returned by the service.
     * @sample AWSAccountAsyncHandler.PutAlternateContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/account-2021-02-01/PutAlternateContact" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutAlternateContactResult> putAlternateContactAsync(PutAlternateContactRequest putAlternateContactRequest,
            com.amazonaws.handlers.AsyncHandler<PutAlternateContactRequest, PutAlternateContactResult> asyncHandler);

    /**
     * <p>
     * Updates the primary contact information of an Amazon Web Services account.
     * </p>
     * <p>
     * For complete details about how to use the primary contact operations, see <a
     * href="https://docs.aws.amazon.com/accounts/latest/reference/manage-acct-update-contact.html">Update the primary
     * and alternate contact information</a>.
     * </p>
     * 
     * @param putContactInformationRequest
     * @return A Java Future containing the result of the PutContactInformation operation returned by the service.
     * @sample AWSAccountAsync.PutContactInformation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/account-2021-02-01/PutContactInformation" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutContactInformationResult> putContactInformationAsync(PutContactInformationRequest putContactInformationRequest);

    /**
     * <p>
     * Updates the primary contact information of an Amazon Web Services account.
     * </p>
     * <p>
     * For complete details about how to use the primary contact operations, see <a
     * href="https://docs.aws.amazon.com/accounts/latest/reference/manage-acct-update-contact.html">Update the primary
     * and alternate contact information</a>.
     * </p>
     * 
     * @param putContactInformationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutContactInformation operation returned by the service.
     * @sample AWSAccountAsyncHandler.PutContactInformation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/account-2021-02-01/PutContactInformation" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutContactInformationResult> putContactInformationAsync(PutContactInformationRequest putContactInformationRequest,
            com.amazonaws.handlers.AsyncHandler<PutContactInformationRequest, PutContactInformationResult> asyncHandler);

}
