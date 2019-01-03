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
package com.amazonaws.services.macie;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.macie.model.*;

/**
 * Interface for accessing Amazon Macie.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.macie.AbstractAmazonMacie} instead.
 * </p>
 * <p>
 * <fullname>Amazon Macie</fullname>
 * <p>
 * Amazon Macie is a security service that uses machine learning to automatically discover, classify, and protect
 * sensitive data in AWS. Macie recognizes sensitive data such as personally identifiable information (PII) or
 * intellectual property, and provides you with dashboards and alerts that give visibility into how this data is being
 * accessed or moved. For more information, see the <a
 * href="https://docs.aws.amazon.com/macie/latest/userguide/what-is-macie.html">Macie User Guide</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonMacie {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "macie";

    /**
     * <p>
     * Associates a specified AWS account with Amazon Macie as a member account.
     * </p>
     * 
     * @param associateMemberAccountRequest
     * @return Result of the AssociateMemberAccount operation returned by the service.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @throws InternalException
     *         Internal server error.
     * @sample AmazonMacie.AssociateMemberAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie-2017-12-19/AssociateMemberAccount" target="_top">AWS
     *      API Documentation</a>
     */
    AssociateMemberAccountResult associateMemberAccount(AssociateMemberAccountRequest associateMemberAccountRequest);

    /**
     * <p>
     * Associates specified S3 resources with Amazon Macie for monitoring and data classification. If memberAccountId
     * isn't specified, the action associates specified S3 resources with Macie for the current master account. If
     * memberAccountId is specified, the action associates specified S3 resources with Macie for the specified member
     * account.
     * </p>
     * 
     * @param associateS3ResourcesRequest
     * @return Result of the AssociateS3Resources operation returned by the service.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @throws InternalException
     *         Internal server error.
     * @sample AmazonMacie.AssociateS3Resources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie-2017-12-19/AssociateS3Resources" target="_top">AWS API
     *      Documentation</a>
     */
    AssociateS3ResourcesResult associateS3Resources(AssociateS3ResourcesRequest associateS3ResourcesRequest);

    /**
     * <p>
     * Removes the specified member account from Amazon Macie.
     * </p>
     * 
     * @param disassociateMemberAccountRequest
     * @return Result of the DisassociateMemberAccount operation returned by the service.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws InternalException
     *         Internal server error.
     * @sample AmazonMacie.DisassociateMemberAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie-2017-12-19/DisassociateMemberAccount"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateMemberAccountResult disassociateMemberAccount(DisassociateMemberAccountRequest disassociateMemberAccountRequest);

    /**
     * <p>
     * Removes specified S3 resources from being monitored by Amazon Macie. If memberAccountId isn't specified, the
     * action removes specified S3 resources from Macie for the current master account. If memberAccountId is specified,
     * the action removes specified S3 resources from Macie for the specified member account.
     * </p>
     * 
     * @param disassociateS3ResourcesRequest
     * @return Result of the DisassociateS3Resources operation returned by the service.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @throws InternalException
     *         Internal server error.
     * @sample AmazonMacie.DisassociateS3Resources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie-2017-12-19/DisassociateS3Resources" target="_top">AWS
     *      API Documentation</a>
     */
    DisassociateS3ResourcesResult disassociateS3Resources(DisassociateS3ResourcesRequest disassociateS3ResourcesRequest);

    /**
     * <p>
     * Lists all Amazon Macie member accounts for the current Amazon Macie master account.
     * </p>
     * 
     * @param listMemberAccountsRequest
     * @return Result of the ListMemberAccounts operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @sample AmazonMacie.ListMemberAccounts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie-2017-12-19/ListMemberAccounts" target="_top">AWS API
     *      Documentation</a>
     */
    ListMemberAccountsResult listMemberAccounts(ListMemberAccountsRequest listMemberAccountsRequest);

    /**
     * <p>
     * Lists all the S3 resources associated with Amazon Macie. If memberAccountId isn't specified, the action lists the
     * S3 resources associated with Amazon Macie for the current master account. If memberAccountId is specified, the
     * action lists the S3 resources associated with Amazon Macie for the specified member account.
     * </p>
     * 
     * @param listS3ResourcesRequest
     * @return Result of the ListS3Resources operation returned by the service.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @throws InternalException
     *         Internal server error.
     * @sample AmazonMacie.ListS3Resources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie-2017-12-19/ListS3Resources" target="_top">AWS API
     *      Documentation</a>
     */
    ListS3ResourcesResult listS3Resources(ListS3ResourcesRequest listS3ResourcesRequest);

    /**
     * <p>
     * Updates the classification types for the specified S3 resources. If memberAccountId isn't specified, the action
     * updates the classification types of the S3 resources associated with Amazon Macie for the current master account.
     * If memberAccountId is specified, the action updates the classification types of the S3 resources associated with
     * Amazon Macie for the specified member account.
     * </p>
     * 
     * @param updateS3ResourcesRequest
     * @return Result of the UpdateS3Resources operation returned by the service.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @throws InternalException
     *         Internal server error.
     * @sample AmazonMacie.UpdateS3Resources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie-2017-12-19/UpdateS3Resources" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateS3ResourcesResult updateS3Resources(UpdateS3ResourcesRequest updateS3ResourcesRequest);

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
