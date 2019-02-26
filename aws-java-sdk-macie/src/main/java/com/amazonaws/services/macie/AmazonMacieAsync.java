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

import com.amazonaws.services.macie.model.*;

/**
 * Interface for accessing Amazon Macie asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.macie.AbstractAmazonMacieAsync} instead.
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
public interface AmazonMacieAsync extends AmazonMacie {

    /**
     * <p>
     * Associates a specified AWS account with Amazon Macie as a member account.
     * </p>
     * 
     * @param associateMemberAccountRequest
     * @return A Java Future containing the result of the AssociateMemberAccount operation returned by the service.
     * @sample AmazonMacieAsync.AssociateMemberAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie-2017-12-19/AssociateMemberAccount" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AssociateMemberAccountResult> associateMemberAccountAsync(AssociateMemberAccountRequest associateMemberAccountRequest);

    /**
     * <p>
     * Associates a specified AWS account with Amazon Macie as a member account.
     * </p>
     * 
     * @param associateMemberAccountRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateMemberAccount operation returned by the service.
     * @sample AmazonMacieAsyncHandler.AssociateMemberAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie-2017-12-19/AssociateMemberAccount" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AssociateMemberAccountResult> associateMemberAccountAsync(AssociateMemberAccountRequest associateMemberAccountRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateMemberAccountRequest, AssociateMemberAccountResult> asyncHandler);

    /**
     * <p>
     * Associates specified S3 resources with Amazon Macie for monitoring and data classification. If memberAccountId
     * isn't specified, the action associates specified S3 resources with Macie for the current master account. If
     * memberAccountId is specified, the action associates specified S3 resources with Macie for the specified member
     * account.
     * </p>
     * 
     * @param associateS3ResourcesRequest
     * @return A Java Future containing the result of the AssociateS3Resources operation returned by the service.
     * @sample AmazonMacieAsync.AssociateS3Resources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie-2017-12-19/AssociateS3Resources" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AssociateS3ResourcesResult> associateS3ResourcesAsync(AssociateS3ResourcesRequest associateS3ResourcesRequest);

    /**
     * <p>
     * Associates specified S3 resources with Amazon Macie for monitoring and data classification. If memberAccountId
     * isn't specified, the action associates specified S3 resources with Macie for the current master account. If
     * memberAccountId is specified, the action associates specified S3 resources with Macie for the specified member
     * account.
     * </p>
     * 
     * @param associateS3ResourcesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateS3Resources operation returned by the service.
     * @sample AmazonMacieAsyncHandler.AssociateS3Resources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie-2017-12-19/AssociateS3Resources" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AssociateS3ResourcesResult> associateS3ResourcesAsync(AssociateS3ResourcesRequest associateS3ResourcesRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateS3ResourcesRequest, AssociateS3ResourcesResult> asyncHandler);

    /**
     * <p>
     * Removes the specified member account from Amazon Macie.
     * </p>
     * 
     * @param disassociateMemberAccountRequest
     * @return A Java Future containing the result of the DisassociateMemberAccount operation returned by the service.
     * @sample AmazonMacieAsync.DisassociateMemberAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie-2017-12-19/DisassociateMemberAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateMemberAccountResult> disassociateMemberAccountAsync(
            DisassociateMemberAccountRequest disassociateMemberAccountRequest);

    /**
     * <p>
     * Removes the specified member account from Amazon Macie.
     * </p>
     * 
     * @param disassociateMemberAccountRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateMemberAccount operation returned by the service.
     * @sample AmazonMacieAsyncHandler.DisassociateMemberAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie-2017-12-19/DisassociateMemberAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateMemberAccountResult> disassociateMemberAccountAsync(
            DisassociateMemberAccountRequest disassociateMemberAccountRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateMemberAccountRequest, DisassociateMemberAccountResult> asyncHandler);

    /**
     * <p>
     * Removes specified S3 resources from being monitored by Amazon Macie. If memberAccountId isn't specified, the
     * action removes specified S3 resources from Macie for the current master account. If memberAccountId is specified,
     * the action removes specified S3 resources from Macie for the specified member account.
     * </p>
     * 
     * @param disassociateS3ResourcesRequest
     * @return A Java Future containing the result of the DisassociateS3Resources operation returned by the service.
     * @sample AmazonMacieAsync.DisassociateS3Resources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie-2017-12-19/DisassociateS3Resources" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateS3ResourcesResult> disassociateS3ResourcesAsync(DisassociateS3ResourcesRequest disassociateS3ResourcesRequest);

    /**
     * <p>
     * Removes specified S3 resources from being monitored by Amazon Macie. If memberAccountId isn't specified, the
     * action removes specified S3 resources from Macie for the current master account. If memberAccountId is specified,
     * the action removes specified S3 resources from Macie for the specified member account.
     * </p>
     * 
     * @param disassociateS3ResourcesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateS3Resources operation returned by the service.
     * @sample AmazonMacieAsyncHandler.DisassociateS3Resources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie-2017-12-19/DisassociateS3Resources" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateS3ResourcesResult> disassociateS3ResourcesAsync(DisassociateS3ResourcesRequest disassociateS3ResourcesRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateS3ResourcesRequest, DisassociateS3ResourcesResult> asyncHandler);

    /**
     * <p>
     * Lists all Amazon Macie member accounts for the current Amazon Macie master account.
     * </p>
     * 
     * @param listMemberAccountsRequest
     * @return A Java Future containing the result of the ListMemberAccounts operation returned by the service.
     * @sample AmazonMacieAsync.ListMemberAccounts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie-2017-12-19/ListMemberAccounts" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListMemberAccountsResult> listMemberAccountsAsync(ListMemberAccountsRequest listMemberAccountsRequest);

    /**
     * <p>
     * Lists all Amazon Macie member accounts for the current Amazon Macie master account.
     * </p>
     * 
     * @param listMemberAccountsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListMemberAccounts operation returned by the service.
     * @sample AmazonMacieAsyncHandler.ListMemberAccounts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie-2017-12-19/ListMemberAccounts" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListMemberAccountsResult> listMemberAccountsAsync(ListMemberAccountsRequest listMemberAccountsRequest,
            com.amazonaws.handlers.AsyncHandler<ListMemberAccountsRequest, ListMemberAccountsResult> asyncHandler);

    /**
     * <p>
     * Lists all the S3 resources associated with Amazon Macie. If memberAccountId isn't specified, the action lists the
     * S3 resources associated with Amazon Macie for the current master account. If memberAccountId is specified, the
     * action lists the S3 resources associated with Amazon Macie for the specified member account.
     * </p>
     * 
     * @param listS3ResourcesRequest
     * @return A Java Future containing the result of the ListS3Resources operation returned by the service.
     * @sample AmazonMacieAsync.ListS3Resources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie-2017-12-19/ListS3Resources" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListS3ResourcesResult> listS3ResourcesAsync(ListS3ResourcesRequest listS3ResourcesRequest);

    /**
     * <p>
     * Lists all the S3 resources associated with Amazon Macie. If memberAccountId isn't specified, the action lists the
     * S3 resources associated with Amazon Macie for the current master account. If memberAccountId is specified, the
     * action lists the S3 resources associated with Amazon Macie for the specified member account.
     * </p>
     * 
     * @param listS3ResourcesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListS3Resources operation returned by the service.
     * @sample AmazonMacieAsyncHandler.ListS3Resources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie-2017-12-19/ListS3Resources" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListS3ResourcesResult> listS3ResourcesAsync(ListS3ResourcesRequest listS3ResourcesRequest,
            com.amazonaws.handlers.AsyncHandler<ListS3ResourcesRequest, ListS3ResourcesResult> asyncHandler);

    /**
     * <p>
     * Updates the classification types for the specified S3 resources. If memberAccountId isn't specified, the action
     * updates the classification types of the S3 resources associated with Amazon Macie for the current master account.
     * If memberAccountId is specified, the action updates the classification types of the S3 resources associated with
     * Amazon Macie for the specified member account.
     * </p>
     * 
     * @param updateS3ResourcesRequest
     * @return A Java Future containing the result of the UpdateS3Resources operation returned by the service.
     * @sample AmazonMacieAsync.UpdateS3Resources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie-2017-12-19/UpdateS3Resources" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateS3ResourcesResult> updateS3ResourcesAsync(UpdateS3ResourcesRequest updateS3ResourcesRequest);

    /**
     * <p>
     * Updates the classification types for the specified S3 resources. If memberAccountId isn't specified, the action
     * updates the classification types of the S3 resources associated with Amazon Macie for the current master account.
     * If memberAccountId is specified, the action updates the classification types of the S3 resources associated with
     * Amazon Macie for the specified member account.
     * </p>
     * 
     * @param updateS3ResourcesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateS3Resources operation returned by the service.
     * @sample AmazonMacieAsyncHandler.UpdateS3Resources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie-2017-12-19/UpdateS3Resources" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateS3ResourcesResult> updateS3ResourcesAsync(UpdateS3ResourcesRequest updateS3ResourcesRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateS3ResourcesRequest, UpdateS3ResourcesResult> asyncHandler);

}
