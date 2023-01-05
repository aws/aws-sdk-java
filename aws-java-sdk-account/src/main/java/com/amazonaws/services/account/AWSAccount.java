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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.account.model.*;

/**
 * Interface for accessing AWS Account.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.account.AbstractAWSAccount} instead.
 * </p>
 * <p>
 * <p>
 * Operations for Amazon Web Services Account Management
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSAccount {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "account";

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
     * @return Result of the DeleteAlternateContact operation returned by the service.
     * @throws ResourceNotFoundException
     *         The operation failed because it specified a resource that can't be found.
     * @throws ValidationException
     *         The operation failed because one of the input parameters was invalid.
     * @throws AccessDeniedException
     *         The operation failed because the calling identity doesn't have the minimum required permissions.
     * @throws TooManyRequestsException
     *         The operation failed because it was called too frequently and exceeded a throttle limit.
     * @throws InternalServerException
     *         The operation failed because of an error internal to Amazon Web Services. Try your operation again later.
     * @sample AWSAccount.DeleteAlternateContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/account-2021-02-01/DeleteAlternateContact" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteAlternateContactResult deleteAlternateContact(DeleteAlternateContactRequest deleteAlternateContactRequest);

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
     * @return Result of the GetAlternateContact operation returned by the service.
     * @throws ResourceNotFoundException
     *         The operation failed because it specified a resource that can't be found.
     * @throws ValidationException
     *         The operation failed because one of the input parameters was invalid.
     * @throws AccessDeniedException
     *         The operation failed because the calling identity doesn't have the minimum required permissions.
     * @throws TooManyRequestsException
     *         The operation failed because it was called too frequently and exceeded a throttle limit.
     * @throws InternalServerException
     *         The operation failed because of an error internal to Amazon Web Services. Try your operation again later.
     * @sample AWSAccount.GetAlternateContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/account-2021-02-01/GetAlternateContact" target="_top">AWS
     *      API Documentation</a>
     */
    GetAlternateContactResult getAlternateContact(GetAlternateContactRequest getAlternateContactRequest);

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
     * @return Result of the GetContactInformation operation returned by the service.
     * @throws ResourceNotFoundException
     *         The operation failed because it specified a resource that can't be found.
     * @throws ValidationException
     *         The operation failed because one of the input parameters was invalid.
     * @throws AccessDeniedException
     *         The operation failed because the calling identity doesn't have the minimum required permissions.
     * @throws TooManyRequestsException
     *         The operation failed because it was called too frequently and exceeded a throttle limit.
     * @throws InternalServerException
     *         The operation failed because of an error internal to Amazon Web Services. Try your operation again later.
     * @sample AWSAccount.GetContactInformation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/account-2021-02-01/GetContactInformation" target="_top">AWS
     *      API Documentation</a>
     */
    GetContactInformationResult getContactInformation(GetContactInformationRequest getContactInformationRequest);

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
     * @return Result of the PutAlternateContact operation returned by the service.
     * @throws ValidationException
     *         The operation failed because one of the input parameters was invalid.
     * @throws AccessDeniedException
     *         The operation failed because the calling identity doesn't have the minimum required permissions.
     * @throws TooManyRequestsException
     *         The operation failed because it was called too frequently and exceeded a throttle limit.
     * @throws InternalServerException
     *         The operation failed because of an error internal to Amazon Web Services. Try your operation again later.
     * @sample AWSAccount.PutAlternateContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/account-2021-02-01/PutAlternateContact" target="_top">AWS
     *      API Documentation</a>
     */
    PutAlternateContactResult putAlternateContact(PutAlternateContactRequest putAlternateContactRequest);

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
     * @return Result of the PutContactInformation operation returned by the service.
     * @throws ValidationException
     *         The operation failed because one of the input parameters was invalid.
     * @throws AccessDeniedException
     *         The operation failed because the calling identity doesn't have the minimum required permissions.
     * @throws TooManyRequestsException
     *         The operation failed because it was called too frequently and exceeded a throttle limit.
     * @throws InternalServerException
     *         The operation failed because of an error internal to Amazon Web Services. Try your operation again later.
     * @sample AWSAccount.PutContactInformation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/account-2021-02-01/PutContactInformation" target="_top">AWS
     *      API Documentation</a>
     */
    PutContactInformationResult putContactInformation(PutContactInformationRequest putContactInformationRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}
