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
package com.amazonaws.services.connect;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.connect.model.*;

/**
 * Interface for accessing Amazon Connect.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.connect.AbstractAmazonConnect} instead.
 * </p>
 * <p>
 * <p>
 * Amazon Connect is a cloud-based contact center solution that you use to set up and manage a customer contact center
 * and provide reliable customer engagement at any scale.
 * </p>
 * <p>
 * Amazon Connect provides metrics and real-time reporting that enable you to optimize contact routing. You can also
 * resolve customer issues more efficiently by getting customers in touch with the appropriate agents.
 * </p>
 * <p>
 * There are limits to the number of Amazon Connect resources that you can create. There are also limits to the number
 * of requests that you can make per second. For more information, see <a
 * href="https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html">Amazon Connect
 * Service Quotas</a> in the <i>Amazon Connect Administrator Guide</i>.
 * </p>
 * <p>
 * You can connect programmatically to an Amazon Web Services service by using an endpoint. For a list of Amazon Connect
 * endpoints, see <a href="https://docs.aws.amazon.com/general/latest/gr/connect_region.html">Amazon Connect
 * Endpoints</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonConnect {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "connect";

    /**
     * <p>
     * Activates an evaluation form in the specified Amazon Connect instance. After the evaluation form is activated, it
     * is available to start new evaluations based on the form.
     * </p>
     * 
     * @param activateEvaluationFormRequest
     * @return Result of the ActivateEvaluationForm operation returned by the service.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ResourceConflictException
     *         A resource already has that name.
     * @sample AmazonConnect.ActivateEvaluationForm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ActivateEvaluationForm" target="_top">AWS
     *      API Documentation</a>
     */
    ActivateEvaluationFormResult activateEvaluationForm(ActivateEvaluationFormRequest activateEvaluationFormRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Associates the specified dataset for a Amazon Connect instance with the target account. You can associate only
     * one dataset in a single call.
     * </p>
     * 
     * @param associateAnalyticsDataSetRequest
     * @return Result of the AssociateAnalyticsDataSet operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.AssociateAnalyticsDataSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/AssociateAnalyticsDataSet"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateAnalyticsDataSetResult associateAnalyticsDataSet(AssociateAnalyticsDataSetRequest associateAnalyticsDataSetRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Associates an approved origin to an Amazon Connect instance.
     * </p>
     * 
     * @param associateApprovedOriginRequest
     * @return Result of the AssociateApprovedOrigin operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ResourceConflictException
     *         A resource already has that name.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.AssociateApprovedOrigin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/AssociateApprovedOrigin"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateApprovedOriginResult associateApprovedOrigin(AssociateApprovedOriginRequest associateApprovedOriginRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Allows the specified Amazon Connect instance to access the specified Amazon Lex or Amazon Lex V2 bot.
     * </p>
     * 
     * @param associateBotRequest
     * @return Result of the AssociateBot operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ResourceConflictException
     *         A resource already has that name.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws LimitExceededException
     *         The allowed limit for the resource has been exceeded.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.AssociateBot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/AssociateBot" target="_top">AWS API
     *      Documentation</a>
     */
    AssociateBotResult associateBot(AssociateBotRequest associateBotRequest);

    /**
     * <p>
     * Associates an existing vocabulary as the default. Contact Lens for Amazon Connect uses the vocabulary in
     * post-call and real-time analysis sessions for the given language.
     * </p>
     * 
     * @param associateDefaultVocabularyRequest
     * @return Result of the AssociateDefaultVocabulary operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonConnect.AssociateDefaultVocabulary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/AssociateDefaultVocabulary"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateDefaultVocabularyResult associateDefaultVocabulary(AssociateDefaultVocabularyRequest associateDefaultVocabularyRequest);

    /**
     * <p>
     * Associates a connect resource to a flow.
     * </p>
     * 
     * @param associateFlowRequest
     * @return Result of the AssociateFlow operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.AssociateFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/AssociateFlow" target="_top">AWS API
     *      Documentation</a>
     */
    AssociateFlowResult associateFlow(AssociateFlowRequest associateFlowRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Associates a storage resource type for the first time. You can only associate one type of storage configuration
     * in a single call. This means, for example, that you can't define an instance with multiple S3 buckets for storing
     * chat transcripts.
     * </p>
     * <p>
     * This API does not create a resource that doesn't exist. It only associates it to the instance. Ensure that the
     * resource being specified in the storage configuration, like an S3 bucket, exists when being used for association.
     * </p>
     * 
     * @param associateInstanceStorageConfigRequest
     * @return Result of the AssociateInstanceStorageConfig operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ResourceConflictException
     *         A resource already has that name.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.AssociateInstanceStorageConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/AssociateInstanceStorageConfig"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateInstanceStorageConfigResult associateInstanceStorageConfig(AssociateInstanceStorageConfigRequest associateInstanceStorageConfigRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Allows the specified Amazon Connect instance to access the specified Lambda function.
     * </p>
     * 
     * @param associateLambdaFunctionRequest
     * @return Result of the AssociateLambdaFunction operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ResourceConflictException
     *         A resource already has that name.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.AssociateLambdaFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/AssociateLambdaFunction"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateLambdaFunctionResult associateLambdaFunction(AssociateLambdaFunctionRequest associateLambdaFunctionRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Allows the specified Amazon Connect instance to access the specified Amazon Lex V1 bot. This API only supports
     * the association of Amazon Lex V1 bots.
     * </p>
     * 
     * @param associateLexBotRequest
     * @return Result of the AssociateLexBot operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ResourceConflictException
     *         A resource already has that name.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.AssociateLexBot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/AssociateLexBot" target="_top">AWS API
     *      Documentation</a>
     */
    AssociateLexBotResult associateLexBot(AssociateLexBotRequest associateLexBotRequest);

    /**
     * <p>
     * Associates a flow with a phone number claimed to your Amazon Connect instance.
     * </p>
     * <important>
     * <p>
     * If the number is claimed to a traffic distribution group, and you are calling this API using an instance in the
     * Amazon Web Services Region where the traffic distribution group was created, you can use either a full phone
     * number ARN or UUID value for the <code>PhoneNumberId</code> URI request parameter. However, if the number is
     * claimed to a traffic distribution group and you are calling this API using an instance in the alternate Amazon
     * Web Services Region associated with the traffic distribution group, you must provide a full phone number ARN. If
     * a UUID is provided in this scenario, you will receive a <code>ResourceNotFoundException</code>.
     * </p>
     * </important>
     * 
     * @param associatePhoneNumberContactFlowRequest
     * @return Result of the AssociatePhoneNumberContactFlow operation returned by the service.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonConnect.AssociatePhoneNumberContactFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/AssociatePhoneNumberContactFlow"
     *      target="_top">AWS API Documentation</a>
     */
    AssociatePhoneNumberContactFlowResult associatePhoneNumberContactFlow(AssociatePhoneNumberContactFlowRequest associatePhoneNumberContactFlowRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Associates a set of quick connects with a queue.
     * </p>
     * 
     * @param associateQueueQuickConnectsRequest
     * @return Result of the AssociateQueueQuickConnects operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws LimitExceededException
     *         The allowed limit for the resource has been exceeded.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.AssociateQueueQuickConnects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/AssociateQueueQuickConnects"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateQueueQuickConnectsResult associateQueueQuickConnects(AssociateQueueQuickConnectsRequest associateQueueQuickConnectsRequest);

    /**
     * <p>
     * Associates a set of queues with a routing profile.
     * </p>
     * 
     * @param associateRoutingProfileQueuesRequest
     * @return Result of the AssociateRoutingProfileQueues operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.AssociateRoutingProfileQueues
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/AssociateRoutingProfileQueues"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateRoutingProfileQueuesResult associateRoutingProfileQueues(AssociateRoutingProfileQueuesRequest associateRoutingProfileQueuesRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Associates a security key to the instance.
     * </p>
     * 
     * @param associateSecurityKeyRequest
     * @return Result of the AssociateSecurityKey operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ResourceConflictException
     *         A resource already has that name.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.AssociateSecurityKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/AssociateSecurityKey" target="_top">AWS
     *      API Documentation</a>
     */
    AssociateSecurityKeyResult associateSecurityKey(AssociateSecurityKeyRequest associateSecurityKeyRequest);

    /**
     * <p>
     * Associates an agent with a traffic distribution group.
     * </p>
     * 
     * @param associateTrafficDistributionGroupUserRequest
     * @return Result of the AssociateTrafficDistributionGroupUser operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ResourceConflictException
     *         A resource already has that name.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.AssociateTrafficDistributionGroupUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/AssociateTrafficDistributionGroupUser"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateTrafficDistributionGroupUserResult associateTrafficDistributionGroupUser(
            AssociateTrafficDistributionGroupUserRequest associateTrafficDistributionGroupUserRequest);

    /**
     * <p>
     * &gt;Associates a set of proficiencies with a user.
     * </p>
     * 
     * @param associateUserProficienciesRequest
     * @return Result of the AssociateUserProficiencies operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.AssociateUserProficiencies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/AssociateUserProficiencies"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateUserProficienciesResult associateUserProficiencies(AssociateUserProficienciesRequest associateUserProficienciesRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Associates a list of analytics datasets for a given Amazon Connect instance to a target account. You can
     * associate multiple datasets in a single call.
     * </p>
     * 
     * @param batchAssociateAnalyticsDataSetRequest
     * @return Result of the BatchAssociateAnalyticsDataSet operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.BatchAssociateAnalyticsDataSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/BatchAssociateAnalyticsDataSet"
     *      target="_top">AWS API Documentation</a>
     */
    BatchAssociateAnalyticsDataSetResult batchAssociateAnalyticsDataSet(BatchAssociateAnalyticsDataSetRequest batchAssociateAnalyticsDataSetRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Removes a list of analytics datasets associated with a given Amazon Connect instance. You can disassociate
     * multiple datasets in a single call.
     * </p>
     * 
     * @param batchDisassociateAnalyticsDataSetRequest
     * @return Result of the BatchDisassociateAnalyticsDataSet operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.BatchDisassociateAnalyticsDataSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/BatchDisassociateAnalyticsDataSet"
     *      target="_top">AWS API Documentation</a>
     */
    BatchDisassociateAnalyticsDataSetResult batchDisassociateAnalyticsDataSet(BatchDisassociateAnalyticsDataSetRequest batchDisassociateAnalyticsDataSetRequest);

    /**
     * <p>
     * Allows you to retrieve metadata about multiple attached files on an associated resource. Each attached file
     * provided in the input list must be associated with the input AssociatedResourceArn.
     * </p>
     * 
     * @param batchGetAttachedFileMetadataRequest
     * @return Result of the BatchGetAttachedFileMetadata operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.BatchGetAttachedFileMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/BatchGetAttachedFileMetadata"
     *      target="_top">AWS API Documentation</a>
     */
    BatchGetAttachedFileMetadataResult batchGetAttachedFileMetadata(BatchGetAttachedFileMetadataRequest batchGetAttachedFileMetadataRequest);

    /**
     * <p>
     * Retrieve the flow associations for the given resources.
     * </p>
     * 
     * @param batchGetFlowAssociationRequest
     * @return Result of the BatchGetFlowAssociation operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.BatchGetFlowAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/BatchGetFlowAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    BatchGetFlowAssociationResult batchGetFlowAssociation(BatchGetFlowAssociationRequest batchGetFlowAssociationRequest);

    /**
     * <note>
     * <p>
     * Only the Amazon Connect outbound campaigns service principal is allowed to assume a role in your account and call
     * this API.
     * </p>
     * </note>
     * <p>
     * Allows you to create a batch of contacts in Amazon Connect. The outbound campaigns capability ingests dial
     * requests via the <a
     * href="https://docs.aws.amazon.com/connect-outbound/latest/APIReference/API_PutDialRequestBatch.html"
     * >PutDialRequestBatch</a> API. It then uses BatchPutContact to create contacts corresponding to those dial
     * requests. If agents are available, the dial requests are dialed out, which results in a voice call. The resulting
     * voice call uses the same contactId that was created by BatchPutContact.
     * </p>
     * 
     * @param batchPutContactRequest
     * @return Result of the BatchPutContact operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws LimitExceededException
     *         The allowed limit for the resource has been exceeded.
     * @throws IdempotencyException
     *         An entity with the same name already exists.
     * @sample AmazonConnect.BatchPutContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/BatchPutContact" target="_top">AWS API
     *      Documentation</a>
     */
    BatchPutContactResult batchPutContact(BatchPutContactRequest batchPutContactRequest);

    /**
     * <p>
     * Claims an available phone number to your Amazon Connect instance or traffic distribution group. You can call this
     * API only in the same Amazon Web Services Region where the Amazon Connect instance or traffic distribution group
     * was created.
     * </p>
     * <p>
     * For more information about how to use this operation, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/claim-phone-number.html">Claim a phone number in your
     * country</a> and <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/claim-phone-numbers-traffic-distribution-groups.html"
     * >Claim phone numbers to traffic distribution groups</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * <important>
     * <p>
     * You can call the <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_SearchAvailablePhoneNumbers.html"
     * >SearchAvailablePhoneNumbers</a> API for available phone numbers that you can claim. Call the <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_DescribePhoneNumber.html"
     * >DescribePhoneNumber</a> API to verify the status of a previous <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_ClaimPhoneNumber.html">ClaimPhoneNumber</a>
     * operation.
     * </p>
     * </important>
     * <p>
     * If you plan to claim and release numbers frequently during a 30 day period, contact us for a service quota
     * exception. Otherwise, it is possible you will be blocked from claiming and releasing any more numbers until 30
     * days past the oldest number released has expired.
     * </p>
     * <p>
     * By default you can claim and release up to 200% of your maximum number of active phone numbers during any 30 day
     * period. If you claim and release phone numbers using the UI or API during a rolling 30 day cycle that exceeds
     * 200% of your phone number service level quota, you will be blocked from claiming any more numbers until 30 days
     * past the oldest number released has expired.
     * </p>
     * <p>
     * For example, if you already have 99 claimed numbers and a service level quota of 99 phone numbers, and in any 30
     * day period you release 99, claim 99, and then release 99, you will have exceeded the 200% limit. At that point
     * you are blocked from claiming any more numbers until you open an Amazon Web Services support ticket.
     * </p>
     * 
     * @param claimPhoneNumberRequest
     * @return Result of the ClaimPhoneNumber operation returned by the service.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws IdempotencyException
     *         An entity with the same name already exists.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonConnect.ClaimPhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ClaimPhoneNumber" target="_top">AWS API
     *      Documentation</a>
     */
    ClaimPhoneNumberResult claimPhoneNumber(ClaimPhoneNumberRequest claimPhoneNumberRequest);

    /**
     * <p>
     * Allows you to confirm that the attached file has been uploaded using the pre-signed URL provided in the
     * StartAttachedFileUpload API.
     * </p>
     * 
     * @param completeAttachedFileUploadRequest
     *        Request to CompleteAttachedFileUpload API
     * @return Result of the CompleteAttachedFileUpload operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.CompleteAttachedFileUpload
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CompleteAttachedFileUpload"
     *      target="_top">AWS API Documentation</a>
     */
    CompleteAttachedFileUploadResult completeAttachedFileUpload(CompleteAttachedFileUploadRequest completeAttachedFileUploadRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Creates an agent status for the specified Amazon Connect instance.
     * </p>
     * 
     * @param createAgentStatusRequest
     * @return Result of the CreateAgentStatus operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws DuplicateResourceException
     *         A resource with the specified name already exists.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws LimitExceededException
     *         The allowed limit for the resource has been exceeded.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.CreateAgentStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateAgentStatus" target="_top">AWS API
     *      Documentation</a>
     */
    CreateAgentStatusResult createAgentStatus(CreateAgentStatusRequest createAgentStatusRequest);

    /**
     * <p>
     * Creates a flow for the specified Amazon Connect instance.
     * </p>
     * <p>
     * You can also create and update flows using the <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/flow-language.html">Amazon Connect Flow
     * language</a>.
     * </p>
     * 
     * @param createContactFlowRequest
     * @return Result of the CreateContactFlow operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidContactFlowException
     *         The flow is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws DuplicateResourceException
     *         A resource with the specified name already exists.
     * @throws LimitExceededException
     *         The allowed limit for the resource has been exceeded.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.CreateContactFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateContactFlow" target="_top">AWS API
     *      Documentation</a>
     */
    CreateContactFlowResult createContactFlow(CreateContactFlowRequest createContactFlowRequest);

    /**
     * <p>
     * Creates a flow module for the specified Amazon Connect instance.
     * </p>
     * 
     * @param createContactFlowModuleRequest
     * @return Result of the CreateContactFlowModule operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidContactFlowModuleException
     *         The problems with the module. Please fix before trying again.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws DuplicateResourceException
     *         A resource with the specified name already exists.
     * @throws LimitExceededException
     *         The allowed limit for the resource has been exceeded.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws IdempotencyException
     *         An entity with the same name already exists.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.CreateContactFlowModule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateContactFlowModule"
     *      target="_top">AWS API Documentation</a>
     */
    CreateContactFlowModuleResult createContactFlowModule(CreateContactFlowModuleRequest createContactFlowModuleRequest);

    /**
     * <p>
     * Creates an evaluation form in the specified Amazon Connect instance. The form can be used to define questions
     * related to agent performance, and create sections to organize such questions. Question and section identifiers
     * cannot be duplicated within the same evaluation form.
     * </p>
     * 
     * @param createEvaluationFormRequest
     * @return Result of the CreateEvaluationForm operation returned by the service.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded.
     * @throws ResourceConflictException
     *         A resource already has that name.
     * @sample AmazonConnect.CreateEvaluationForm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateEvaluationForm" target="_top">AWS
     *      API Documentation</a>
     */
    CreateEvaluationFormResult createEvaluationForm(CreateEvaluationFormRequest createEvaluationFormRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Creates hours of operation.
     * </p>
     * 
     * @param createHoursOfOperationRequest
     * @return Result of the CreateHoursOfOperation operation returned by the service.
     * @throws DuplicateResourceException
     *         A resource with the specified name already exists.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws LimitExceededException
     *         The allowed limit for the resource has been exceeded.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.CreateHoursOfOperation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateHoursOfOperation" target="_top">AWS
     *      API Documentation</a>
     */
    CreateHoursOfOperationResult createHoursOfOperation(CreateHoursOfOperationRequest createHoursOfOperationRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Initiates an Amazon Connect instance with all the supported channels enabled. It does not attach any storage,
     * such as Amazon Simple Storage Service (Amazon S3) or Amazon Kinesis. It also does not allow for any
     * configurations on features, such as Contact Lens for Amazon Connect.
     * </p>
     * <p>
     * Amazon Connect enforces a limit on the total number of instances that you can create or delete in 30 days. If you
     * exceed this limit, you will get an error message indicating there has been an excessive number of attempts at
     * creating or deleting instances. You must wait 30 days before you can restart creating and deleting instances in
     * your account.
     * </p>
     * 
     * @param createInstanceRequest
     * @return Result of the CreateInstance operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.CreateInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateInstance" target="_top">AWS API
     *      Documentation</a>
     */
    CreateInstanceResult createInstance(CreateInstanceRequest createInstanceRequest);

    /**
     * <p>
     * Creates an Amazon Web Services resource association with an Amazon Connect instance.
     * </p>
     * 
     * @param createIntegrationAssociationRequest
     * @return Result of the CreateIntegrationAssociation operation returned by the service.
     * @throws DuplicateResourceException
     *         A resource with the specified name already exists.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.CreateIntegrationAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateIntegrationAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    CreateIntegrationAssociationResult createIntegrationAssociation(CreateIntegrationAssociationRequest createIntegrationAssociationRequest);

    /**
     * <p>
     * Adds a new participant into an on-going chat contact. For more information, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/chat-customize-flow.html">Customize chat flow
     * experiences by integrating custom participants</a>.
     * </p>
     * 
     * @param createParticipantRequest
     * @return Result of the CreateParticipant operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.CreateParticipant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateParticipant" target="_top">AWS API
     *      Documentation</a>
     */
    CreateParticipantResult createParticipant(CreateParticipantRequest createParticipantRequest);

    /**
     * <p>
     * Enables rehydration of chats for the lifespan of a contact. For more information about chat rehydration, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/chat-persistence.html">Enable persistent chat</a> in
     * the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param createPersistentContactAssociationRequest
     * @return Result of the CreatePersistentContactAssociation operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.CreatePersistentContactAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreatePersistentContactAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    CreatePersistentContactAssociationResult createPersistentContactAssociation(
            CreatePersistentContactAssociationRequest createPersistentContactAssociationRequest);

    /**
     * <p>
     * Creates a new predefined attribute for the specified Amazon Connect instance.
     * </p>
     * 
     * @param createPredefinedAttributeRequest
     * @return Result of the CreatePredefinedAttribute operation returned by the service.
     * @throws DuplicateResourceException
     *         A resource with the specified name already exists.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws LimitExceededException
     *         The allowed limit for the resource has been exceeded.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.CreatePredefinedAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreatePredefinedAttribute"
     *      target="_top">AWS API Documentation</a>
     */
    CreatePredefinedAttributeResult createPredefinedAttribute(CreatePredefinedAttributeRequest createPredefinedAttributeRequest);

    /**
     * <p>
     * Creates a prompt. For more information about prompts, such as supported file types and maximum length, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/prompts.html">Create prompts</a> in the <i>Amazon
     * Connect Administrator Guide</i>.
     * </p>
     * 
     * @param createPromptRequest
     * @return Result of the CreatePrompt operation returned by the service.
     * @throws DuplicateResourceException
     *         A resource with the specified name already exists.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws LimitExceededException
     *         The allowed limit for the resource has been exceeded.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.CreatePrompt
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreatePrompt" target="_top">AWS API
     *      Documentation</a>
     */
    CreatePromptResult createPrompt(CreatePromptRequest createPromptRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Creates a new queue for the specified Amazon Connect instance.
     * </p>
     * <important>
     * <ul>
     * <li>
     * <p>
     * If the phone number is claimed to a traffic distribution group that was created in the same Region as the Amazon
     * Connect instance where you are calling this API, then you can use a full phone number ARN or a UUID for
     * <code>OutboundCallerIdNumberId</code>. However, if the phone number is claimed to a traffic distribution group
     * that is in one Region, and you are calling this API from an instance in another Amazon Web Services Region that
     * is associated with the traffic distribution group, you must provide a full phone number ARN. If a UUID is
     * provided in this scenario, you will receive a <code>ResourceNotFoundException</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Only use the phone number ARN format that doesn't contain <code>instance</code> in the path, for example,
     * <code>arn:aws:connect:us-east-1:1234567890:phone-number/uuid</code>. This is the same ARN format that is returned
     * when you call the <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_ListPhoneNumbersV2.html">ListPhoneNumbersV2</a>
     * API.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you plan to use IAM policies to allow/deny access to this API for phone number resources claimed to a traffic
     * distribution group, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/security_iam_resource-level-policy-examples.html#allow-deny-queue-actions-replica-region"
     * >Allow or Deny queue API actions for phone numbers in a replica Region</a>.
     * </p>
     * </li>
     * </ul>
     * </important>
     * 
     * @param createQueueRequest
     * @return Result of the CreateQueue operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws DuplicateResourceException
     *         A resource with the specified name already exists.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws LimitExceededException
     *         The allowed limit for the resource has been exceeded.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.CreateQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateQueue" target="_top">AWS API
     *      Documentation</a>
     */
    CreateQueueResult createQueue(CreateQueueRequest createQueueRequest);

    /**
     * <p>
     * Creates a quick connect for the specified Amazon Connect instance.
     * </p>
     * 
     * @param createQuickConnectRequest
     * @return Result of the CreateQuickConnect operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws DuplicateResourceException
     *         A resource with the specified name already exists.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws LimitExceededException
     *         The allowed limit for the resource has been exceeded.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.CreateQuickConnect
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateQuickConnect" target="_top">AWS API
     *      Documentation</a>
     */
    CreateQuickConnectResult createQuickConnect(CreateQuickConnectRequest createQuickConnectRequest);

    /**
     * <p>
     * Creates a new routing profile.
     * </p>
     * 
     * @param createRoutingProfileRequest
     * @return Result of the CreateRoutingProfile operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws DuplicateResourceException
     *         A resource with the specified name already exists.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws LimitExceededException
     *         The allowed limit for the resource has been exceeded.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.CreateRoutingProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateRoutingProfile" target="_top">AWS
     *      API Documentation</a>
     */
    CreateRoutingProfileResult createRoutingProfile(CreateRoutingProfileRequest createRoutingProfileRequest);

    /**
     * <p>
     * Creates a rule for the specified Amazon Connect instance.
     * </p>
     * <p>
     * Use the <a href="https://docs.aws.amazon.com/connect/latest/APIReference/connect-rules-language.html">Rules
     * Function language</a> to code conditions for the rule.
     * </p>
     * 
     * @param createRuleRequest
     * @return Result of the CreateRule operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws ResourceConflictException
     *         A resource already has that name.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded.
     * @sample AmazonConnect.CreateRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateRule" target="_top">AWS API
     *      Documentation</a>
     */
    CreateRuleResult createRule(CreateRuleRequest createRuleRequest);

    /**
     * <p>
     * Creates a security profile.
     * </p>
     * 
     * @param createSecurityProfileRequest
     * @return Result of the CreateSecurityProfile operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws LimitExceededException
     *         The allowed limit for the resource has been exceeded.
     * @throws DuplicateResourceException
     *         A resource with the specified name already exists.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.CreateSecurityProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateSecurityProfile" target="_top">AWS
     *      API Documentation</a>
     */
    CreateSecurityProfileResult createSecurityProfile(CreateSecurityProfileRequest createSecurityProfileRequest);

    /**
     * <p>
     * Creates a new task template in the specified Amazon Connect instance.
     * </p>
     * 
     * @param createTaskTemplateRequest
     * @return Result of the CreateTaskTemplate operation returned by the service.
     * @throws PropertyValidationException
     *         The property is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.CreateTaskTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateTaskTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    CreateTaskTemplateResult createTaskTemplate(CreateTaskTemplateRequest createTaskTemplateRequest);

    /**
     * <p>
     * Creates a traffic distribution group given an Amazon Connect instance that has been replicated.
     * </p>
     * <note>
     * <p>
     * The <code>SignInConfig</code> distribution is available only on a default <code>TrafficDistributionGroup</code>
     * (see the <code>IsDefault</code> parameter in the <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_TrafficDistributionGroup.html"
     * >TrafficDistributionGroup</a> data type). If you call <code>UpdateTrafficDistribution</code> with a modified
     * <code>SignInConfig</code> and a non-default <code>TrafficDistributionGroup</code>, an
     * <code>InvalidRequestException</code> is returned.
     * </p>
     * </note>
     * <p>
     * For more information about creating traffic distribution groups, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/setup-traffic-distribution-groups.html">Set up
     * traffic distribution groups</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param createTrafficDistributionGroupRequest
     * @return Result of the CreateTrafficDistributionGroup operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ResourceConflictException
     *         A resource already has that name.
     * @throws ResourceNotReadyException
     *         The resource is not ready.
     * @sample AmazonConnect.CreateTrafficDistributionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateTrafficDistributionGroup"
     *      target="_top">AWS API Documentation</a>
     */
    CreateTrafficDistributionGroupResult createTrafficDistributionGroup(CreateTrafficDistributionGroupRequest createTrafficDistributionGroupRequest);

    /**
     * <p>
     * Creates a use case for an integration association.
     * </p>
     * 
     * @param createUseCaseRequest
     * @return Result of the CreateUseCase operation returned by the service.
     * @throws DuplicateResourceException
     *         A resource with the specified name already exists.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.CreateUseCase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateUseCase" target="_top">AWS API
     *      Documentation</a>
     */
    CreateUseCaseResult createUseCase(CreateUseCaseRequest createUseCaseRequest);

    /**
     * <p>
     * Creates a user account for the specified Amazon Connect instance.
     * </p>
     * <important>
     * <p>
     * Certain <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_UserIdentityInfo.html">UserIdentityInfo</a>
     * parameters are required in some situations. For example, <code>Email</code> is required if you are using SAML for
     * identity management. <code>FirstName</code> and <code>LastName</code> are required if you are using Amazon
     * Connect or SAML for identity management.
     * </p>
     * </important>
     * <p>
     * For information about how to create users using the Amazon Connect admin website, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/user-management.html">Add Users</a> in the <i>Amazon
     * Connect Administrator Guide</i>.
     * </p>
     * 
     * @param createUserRequest
     * @return Result of the CreateUser operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws LimitExceededException
     *         The allowed limit for the resource has been exceeded.
     * @throws DuplicateResourceException
     *         A resource with the specified name already exists.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.CreateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateUser" target="_top">AWS API
     *      Documentation</a>
     */
    CreateUserResult createUser(CreateUserRequest createUserRequest);

    /**
     * <p>
     * Creates a new user hierarchy group.
     * </p>
     * 
     * @param createUserHierarchyGroupRequest
     * @return Result of the CreateUserHierarchyGroup operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws DuplicateResourceException
     *         A resource with the specified name already exists.
     * @throws LimitExceededException
     *         The allowed limit for the resource has been exceeded.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.CreateUserHierarchyGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateUserHierarchyGroup"
     *      target="_top">AWS API Documentation</a>
     */
    CreateUserHierarchyGroupResult createUserHierarchyGroup(CreateUserHierarchyGroupRequest createUserHierarchyGroupRequest);

    /**
     * <p>
     * Creates a new view with the possible status of <code>SAVED</code> or <code>PUBLISHED</code>.
     * </p>
     * <p>
     * The views will have a unique name for each connect instance.
     * </p>
     * <p>
     * It performs basic content validation if the status is <code>SAVED</code> or full content validation if the status
     * is set to <code>PUBLISHED</code>. An error is returned if validation fails. It associates either the
     * <code>$SAVED</code> qualifier or both of the <code>$SAVED</code> and <code>$LATEST</code> qualifiers with the
     * provided view content based on the status. The view is idempotent if ClientToken is provided.
     * </p>
     * 
     * @param createViewRequest
     * @return Result of the CreateView operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws DuplicateResourceException
     *         A resource with the specified name already exists.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded.
     * @throws TooManyRequestsException
     *         Displayed when rate-related API limits are exceeded.
     * @throws ResourceInUseException
     *         That resource is already in use. Please try another.
     * @sample AmazonConnect.CreateView
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateView" target="_top">AWS API
     *      Documentation</a>
     */
    CreateViewResult createView(CreateViewRequest createViewRequest);

    /**
     * <p>
     * Publishes a new version of the view identifier.
     * </p>
     * <p>
     * Versions are immutable and monotonically increasing.
     * </p>
     * <p>
     * It returns the highest version if there is no change in content compared to that version. An error is displayed
     * if the supplied ViewContentSha256 is different from the ViewContentSha256 of the <code>$LATEST</code> alias.
     * </p>
     * 
     * @param createViewVersionRequest
     * @return Result of the CreateViewVersion operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws TooManyRequestsException
     *         Displayed when rate-related API limits are exceeded.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded.
     * @throws ResourceInUseException
     *         That resource is already in use. Please try another.
     * @sample AmazonConnect.CreateViewVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateViewVersion" target="_top">AWS API
     *      Documentation</a>
     */
    CreateViewVersionResult createViewVersion(CreateViewVersionRequest createViewVersionRequest);

    /**
     * <p>
     * Creates a custom vocabulary associated with your Amazon Connect instance. You can set a custom vocabulary to be
     * your default vocabulary for a given language. Contact Lens for Amazon Connect uses the default vocabulary in
     * post-call and real-time contact analysis sessions for that language.
     * </p>
     * 
     * @param createVocabularyRequest
     * @return Result of the CreateVocabulary operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws ResourceConflictException
     *         A resource already has that name.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded.
     * @sample AmazonConnect.CreateVocabulary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateVocabulary" target="_top">AWS API
     *      Documentation</a>
     */
    CreateVocabularyResult createVocabulary(CreateVocabularyRequest createVocabularyRequest);

    /**
     * <p>
     * Deactivates an evaluation form in the specified Amazon Connect instance. After a form is deactivated, it is no
     * longer available for users to start new evaluations based on the form.
     * </p>
     * 
     * @param deactivateEvaluationFormRequest
     * @return Result of the DeactivateEvaluationForm operation returned by the service.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ResourceConflictException
     *         A resource already has that name.
     * @sample AmazonConnect.DeactivateEvaluationForm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DeactivateEvaluationForm"
     *      target="_top">AWS API Documentation</a>
     */
    DeactivateEvaluationFormResult deactivateEvaluationForm(DeactivateEvaluationFormRequest deactivateEvaluationFormRequest);

    /**
     * <p>
     * Deletes an attached file along with the underlying S3 Object.
     * </p>
     * <important>
     * <p>
     * The attached file is <b>permanently deleted</b> if S3 bucket versioning is not enabled.
     * </p>
     * </important>
     * 
     * @param deleteAttachedFileRequest
     *        Request to DeleteAttachedFile API
     * @return Result of the DeleteAttachedFile operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.DeleteAttachedFile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DeleteAttachedFile" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteAttachedFileResult deleteAttachedFile(DeleteAttachedFileRequest deleteAttachedFileRequest);

    /**
     * <p>
     * Deletes a contact evaluation in the specified Amazon Connect instance.
     * </p>
     * 
     * @param deleteContactEvaluationRequest
     * @return Result of the DeleteContactEvaluation operation returned by the service.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ResourceConflictException
     *         A resource already has that name.
     * @sample AmazonConnect.DeleteContactEvaluation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DeleteContactEvaluation"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteContactEvaluationResult deleteContactEvaluation(DeleteContactEvaluationRequest deleteContactEvaluationRequest);

    /**
     * <p>
     * Deletes a flow for the specified Amazon Connect instance.
     * </p>
     * 
     * @param deleteContactFlowRequest
     * @return Result of the DeleteContactFlow operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.DeleteContactFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DeleteContactFlow" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteContactFlowResult deleteContactFlow(DeleteContactFlowRequest deleteContactFlowRequest);

    /**
     * <p>
     * Deletes the specified flow module.
     * </p>
     * 
     * @param deleteContactFlowModuleRequest
     * @return Result of the DeleteContactFlowModule operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.DeleteContactFlowModule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DeleteContactFlowModule"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteContactFlowModuleResult deleteContactFlowModule(DeleteContactFlowModuleRequest deleteContactFlowModuleRequest);

    /**
     * <p>
     * Deletes an evaluation form in the specified Amazon Connect instance.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the version property is provided, only the specified version of the evaluation form is deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * If no version is provided, then the full form (all versions) is deleted.
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteEvaluationFormRequest
     * @return Result of the DeleteEvaluationForm operation returned by the service.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ResourceConflictException
     *         A resource already has that name.
     * @sample AmazonConnect.DeleteEvaluationForm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DeleteEvaluationForm" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteEvaluationFormResult deleteEvaluationForm(DeleteEvaluationFormRequest deleteEvaluationFormRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Deletes an hours of operation.
     * </p>
     * 
     * @param deleteHoursOfOperationRequest
     * @return Result of the DeleteHoursOfOperation operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.DeleteHoursOfOperation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DeleteHoursOfOperation" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteHoursOfOperationResult deleteHoursOfOperation(DeleteHoursOfOperationRequest deleteHoursOfOperationRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Deletes the Amazon Connect instance.
     * </p>
     * <p>
     * Amazon Connect enforces a limit on the total number of instances that you can create or delete in 30 days. If you
     * exceed this limit, you will get an error message indicating there has been an excessive number of attempts at
     * creating or deleting instances. You must wait 30 days before you can restart creating and deleting instances in
     * your account.
     * </p>
     * 
     * @param deleteInstanceRequest
     * @return Result of the DeleteInstance operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @sample AmazonConnect.DeleteInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DeleteInstance" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteInstanceResult deleteInstance(DeleteInstanceRequest deleteInstanceRequest);

    /**
     * <p>
     * Deletes an Amazon Web Services resource association from an Amazon Connect instance. The association must not
     * have any use cases associated with it.
     * </p>
     * 
     * @param deleteIntegrationAssociationRequest
     * @return Result of the DeleteIntegrationAssociation operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.DeleteIntegrationAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DeleteIntegrationAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteIntegrationAssociationResult deleteIntegrationAssociation(DeleteIntegrationAssociationRequest deleteIntegrationAssociationRequest);

    /**
     * <p>
     * Deletes a predefined attribute from the specified Amazon Connect instance.
     * </p>
     * 
     * @param deletePredefinedAttributeRequest
     * @return Result of the DeletePredefinedAttribute operation returned by the service.
     * @throws ResourceInUseException
     *         That resource is already in use. Please try another.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.DeletePredefinedAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DeletePredefinedAttribute"
     *      target="_top">AWS API Documentation</a>
     */
    DeletePredefinedAttributeResult deletePredefinedAttribute(DeletePredefinedAttributeRequest deletePredefinedAttributeRequest);

    /**
     * <p>
     * Deletes a prompt.
     * </p>
     * 
     * @param deletePromptRequest
     * @return Result of the DeletePrompt operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.DeletePrompt
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DeletePrompt" target="_top">AWS API
     *      Documentation</a>
     */
    DeletePromptResult deletePrompt(DeletePromptRequest deletePromptRequest);

    /**
     * <p>
     * Deletes a queue.
     * </p>
     * 
     * @param deleteQueueRequest
     * @return Result of the DeleteQueue operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ResourceInUseException
     *         That resource is already in use. Please try another.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.DeleteQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DeleteQueue" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteQueueResult deleteQueue(DeleteQueueRequest deleteQueueRequest);

    /**
     * <p>
     * Deletes a quick connect.
     * </p>
     * <important>
     * <p>
     * After calling <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_DeleteUser.html">DeleteUser</a>, it's important
     * to call <code>DeleteQuickConnect</code> to delete any records related to the deleted users. This will help you:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Avoid dangling resources that impact your service quotas.
     * </p>
     * </li>
     * <li>
     * <p>
     * Remove deleted users so they don't appear to agents as transfer options.
     * </p>
     * </li>
     * <li>
     * <p>
     * Avoid the disruption of other Amazon Connect processes, such as instance replication and syncing if you're using
     * <a href="https://docs.aws.amazon.com/connect/latest/adminguide/setup-connect-global-resiliency.html">Amazon
     * Connect Global Resiliency</a>.
     * </p>
     * </li>
     * </ul>
     * </important>
     * 
     * @param deleteQuickConnectRequest
     * @return Result of the DeleteQuickConnect operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.DeleteQuickConnect
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DeleteQuickConnect" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteQuickConnectResult deleteQuickConnect(DeleteQuickConnectRequest deleteQuickConnectRequest);

    /**
     * <p>
     * Deletes a routing profile.
     * </p>
     * 
     * @param deleteRoutingProfileRequest
     * @return Result of the DeleteRoutingProfile operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ResourceInUseException
     *         That resource is already in use. Please try another.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.DeleteRoutingProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DeleteRoutingProfile" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteRoutingProfileResult deleteRoutingProfile(DeleteRoutingProfileRequest deleteRoutingProfileRequest);

    /**
     * <p>
     * Deletes a rule for the specified Amazon Connect instance.
     * </p>
     * 
     * @param deleteRuleRequest
     * @return Result of the DeleteRule operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonConnect.DeleteRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DeleteRule" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteRuleResult deleteRule(DeleteRuleRequest deleteRuleRequest);

    /**
     * <p>
     * Deletes a security profile.
     * </p>
     * 
     * @param deleteSecurityProfileRequest
     * @return Result of the DeleteSecurityProfile operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws ResourceInUseException
     *         That resource is already in use. Please try another.
     * @sample AmazonConnect.DeleteSecurityProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DeleteSecurityProfile" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteSecurityProfileResult deleteSecurityProfile(DeleteSecurityProfileRequest deleteSecurityProfileRequest);

    /**
     * <p>
     * Deletes the task template.
     * </p>
     * 
     * @param deleteTaskTemplateRequest
     * @return Result of the DeleteTaskTemplate operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.DeleteTaskTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DeleteTaskTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteTaskTemplateResult deleteTaskTemplate(DeleteTaskTemplateRequest deleteTaskTemplateRequest);

    /**
     * <p>
     * Deletes a traffic distribution group. This API can be called only in the Region where the traffic distribution
     * group is created.
     * </p>
     * <p>
     * For more information about deleting traffic distribution groups, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/delete-traffic-distribution-groups.html">Delete
     * traffic distribution groups</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param deleteTrafficDistributionGroupRequest
     * @return Result of the DeleteTrafficDistributionGroup operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws ResourceInUseException
     *         That resource is already in use. Please try another.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.DeleteTrafficDistributionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DeleteTrafficDistributionGroup"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteTrafficDistributionGroupResult deleteTrafficDistributionGroup(DeleteTrafficDistributionGroupRequest deleteTrafficDistributionGroupRequest);

    /**
     * <p>
     * Deletes a use case from an integration association.
     * </p>
     * 
     * @param deleteUseCaseRequest
     * @return Result of the DeleteUseCase operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.DeleteUseCase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DeleteUseCase" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteUseCaseResult deleteUseCase(DeleteUseCaseRequest deleteUseCaseRequest);

    /**
     * <p>
     * Deletes a user account from the specified Amazon Connect instance.
     * </p>
     * <p>
     * For information about what happens to a user's data when their account is deleted, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/delete-users.html">Delete Users from Your Amazon
     * Connect Instance</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * <important>
     * <p>
     * After calling DeleteUser, call <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_DeleteQuickConnect.html">DeleteQuickConnect</a>
     * to delete any records related to the deleted users. This will help you:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Avoid dangling resources that impact your service quotas.
     * </p>
     * </li>
     * <li>
     * <p>
     * Remove deleted users so they don't appear to agents as transfer options.
     * </p>
     * </li>
     * <li>
     * <p>
     * Avoid the disruption of other Amazon Connect processes, such as instance replication and syncing if you're using
     * <a href="https://docs.aws.amazon.com/connect/latest/adminguide/setup-connect-global-resiliency.html">Amazon
     * Connect Global Resiliency</a>.
     * </p>
     * </li>
     * </ul>
     * </important>
     * 
     * @param deleteUserRequest
     * @return Result of the DeleteUser operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.DeleteUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DeleteUser" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteUserResult deleteUser(DeleteUserRequest deleteUserRequest);

    /**
     * <p>
     * Deletes an existing user hierarchy group. It must not be associated with any agents or have any active child
     * groups.
     * </p>
     * 
     * @param deleteUserHierarchyGroupRequest
     * @return Result of the DeleteUserHierarchyGroup operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ResourceInUseException
     *         That resource is already in use. Please try another.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.DeleteUserHierarchyGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DeleteUserHierarchyGroup"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteUserHierarchyGroupResult deleteUserHierarchyGroup(DeleteUserHierarchyGroupRequest deleteUserHierarchyGroupRequest);

    /**
     * <p>
     * Deletes the view entirely. It deletes the view and all associated qualifiers (versions and aliases).
     * </p>
     * 
     * @param deleteViewRequest
     * @return Result of the DeleteView operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws TooManyRequestsException
     *         Displayed when rate-related API limits are exceeded.
     * @throws ResourceInUseException
     *         That resource is already in use. Please try another.
     * @sample AmazonConnect.DeleteView
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DeleteView" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteViewResult deleteView(DeleteViewRequest deleteViewRequest);

    /**
     * <p>
     * Deletes the particular version specified in <code>ViewVersion</code> identifier.
     * </p>
     * 
     * @param deleteViewVersionRequest
     * @return Result of the DeleteViewVersion operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws TooManyRequestsException
     *         Displayed when rate-related API limits are exceeded.
     * @throws ResourceInUseException
     *         That resource is already in use. Please try another.
     * @sample AmazonConnect.DeleteViewVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DeleteViewVersion" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteViewVersionResult deleteViewVersion(DeleteViewVersionRequest deleteViewVersionRequest);

    /**
     * <p>
     * Deletes the vocabulary that has the given identifier.
     * </p>
     * 
     * @param deleteVocabularyRequest
     * @return Result of the DeleteVocabulary operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws ResourceInUseException
     *         That resource is already in use. Please try another.
     * @sample AmazonConnect.DeleteVocabulary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DeleteVocabulary" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteVocabularyResult deleteVocabulary(DeleteVocabularyRequest deleteVocabularyRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Describes an agent status.
     * </p>
     * 
     * @param describeAgentStatusRequest
     * @return Result of the DescribeAgentStatus operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.DescribeAgentStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeAgentStatus" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeAgentStatusResult describeAgentStatus(DescribeAgentStatusRequest describeAgentStatusRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Describes the specified contact.
     * </p>
     * <important>
     * <p>
     * Contact information remains available in Amazon Connect for 24 months, and then it is deleted.
     * </p>
     * <p>
     * Only data from November 12, 2021, and later is returned by this API.
     * </p>
     * </important>
     * 
     * @param describeContactRequest
     * @return Result of the DescribeContact operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.DescribeContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeContact" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeContactResult describeContact(DescribeContactRequest describeContactRequest);

    /**
     * <p>
     * Describes a contact evaluation in the specified Amazon Connect instance.
     * </p>
     * 
     * @param describeContactEvaluationRequest
     * @return Result of the DescribeContactEvaluation operation returned by the service.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.DescribeContactEvaluation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeContactEvaluation"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeContactEvaluationResult describeContactEvaluation(DescribeContactEvaluationRequest describeContactEvaluationRequest);

    /**
     * <p>
     * Describes the specified flow.
     * </p>
     * <p>
     * You can also create and update flows using the <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/flow-language.html">Amazon Connect Flow
     * language</a>.
     * </p>
     * <p>
     * Use the <code>$SAVED</code> alias in the request to describe the <code>SAVED</code> content of a Flow. For
     * example, <code>arn:aws:.../contact-flow/{id}:$SAVED</code>. Once a contact flow is published, <code>$SAVED</code>
     * needs to be supplied to view saved content that has not been published.
     * </p>
     * <p>
     * In the response, <b>Status</b> indicates the flow status as either <code>SAVED</code> or <code>PUBLISHED</code>.
     * The <code>PUBLISHED</code> status will initiate validation on the content. <code>SAVED</code> does not initiate
     * validation of the content. <code>SAVED</code> | <code>PUBLISHED</code>
     * </p>
     * 
     * @param describeContactFlowRequest
     * @return Result of the DescribeContactFlow operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ContactFlowNotPublishedException
     *         The flow has not been published.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.DescribeContactFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeContactFlow" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeContactFlowResult describeContactFlow(DescribeContactFlowRequest describeContactFlowRequest);

    /**
     * <p>
     * Describes the specified flow module.
     * </p>
     * <p>
     * Use the <code>$SAVED</code> alias in the request to describe the <code>SAVED</code> content of a Flow. For
     * example, <code>arn:aws:.../contact-flow/{id}:$SAVED</code>. Once a contact flow is published, <code>$SAVED</code>
     * needs to be supplied to view saved content that has not been published.
     * </p>
     * 
     * @param describeContactFlowModuleRequest
     * @return Result of the DescribeContactFlowModule operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.DescribeContactFlowModule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeContactFlowModule"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeContactFlowModuleResult describeContactFlowModule(DescribeContactFlowModuleRequest describeContactFlowModuleRequest);

    /**
     * <p>
     * Describes an evaluation form in the specified Amazon Connect instance. If the version property is not provided,
     * the latest version of the evaluation form is described.
     * </p>
     * 
     * @param describeEvaluationFormRequest
     * @return Result of the DescribeEvaluationForm operation returned by the service.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.DescribeEvaluationForm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeEvaluationForm" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeEvaluationFormResult describeEvaluationForm(DescribeEvaluationFormRequest describeEvaluationFormRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Describes the hours of operation.
     * </p>
     * 
     * @param describeHoursOfOperationRequest
     * @return Result of the DescribeHoursOfOperation operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.DescribeHoursOfOperation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeHoursOfOperation"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeHoursOfOperationResult describeHoursOfOperation(DescribeHoursOfOperationRequest describeHoursOfOperationRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Returns the current state of the specified instance identifier. It tracks the instance while it is being created
     * and returns an error status, if applicable.
     * </p>
     * <p>
     * If an instance is not created successfully, the instance status reason field returns details relevant to the
     * reason. The instance in a failed state is returned only for 24 hours after the CreateInstance API was invoked.
     * </p>
     * 
     * @param describeInstanceRequest
     * @return Result of the DescribeInstance operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.DescribeInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeInstance" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeInstanceResult describeInstance(DescribeInstanceRequest describeInstanceRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Describes the specified instance attribute.
     * </p>
     * 
     * @param describeInstanceAttributeRequest
     * @return Result of the DescribeInstanceAttribute operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.DescribeInstanceAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeInstanceAttribute"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeInstanceAttributeResult describeInstanceAttribute(DescribeInstanceAttributeRequest describeInstanceAttributeRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Retrieves the current storage configurations for the specified resource type, association ID, and instance ID.
     * </p>
     * 
     * @param describeInstanceStorageConfigRequest
     * @return Result of the DescribeInstanceStorageConfig operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.DescribeInstanceStorageConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeInstanceStorageConfig"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeInstanceStorageConfigResult describeInstanceStorageConfig(DescribeInstanceStorageConfigRequest describeInstanceStorageConfigRequest);

    /**
     * <p>
     * Gets details and status of a phone number that’s claimed to your Amazon Connect instance or traffic distribution
     * group.
     * </p>
     * <important>
     * <p>
     * If the number is claimed to a traffic distribution group, and you are calling in the Amazon Web Services Region
     * where the traffic distribution group was created, you can use either a phone number ARN or UUID value for the
     * <code>PhoneNumberId</code> URI request parameter. However, if the number is claimed to a traffic distribution
     * group and you are calling this API in the alternate Amazon Web Services Region associated with the traffic
     * distribution group, you must provide a full phone number ARN. If a UUID is provided in this scenario, you will
     * receive a <code>ResourceNotFoundException</code>.
     * </p>
     * </important>
     * 
     * @param describePhoneNumberRequest
     * @return Result of the DescribePhoneNumber operation returned by the service.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonConnect.DescribePhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribePhoneNumber" target="_top">AWS
     *      API Documentation</a>
     */
    DescribePhoneNumberResult describePhoneNumber(DescribePhoneNumberRequest describePhoneNumberRequest);

    /**
     * <p>
     * Describes a predefined attribute for the specified Amazon Connect instance.
     * </p>
     * 
     * @param describePredefinedAttributeRequest
     * @return Result of the DescribePredefinedAttribute operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.DescribePredefinedAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribePredefinedAttribute"
     *      target="_top">AWS API Documentation</a>
     */
    DescribePredefinedAttributeResult describePredefinedAttribute(DescribePredefinedAttributeRequest describePredefinedAttributeRequest);

    /**
     * <p>
     * Describes the prompt.
     * </p>
     * 
     * @param describePromptRequest
     * @return Result of the DescribePrompt operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.DescribePrompt
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribePrompt" target="_top">AWS API
     *      Documentation</a>
     */
    DescribePromptResult describePrompt(DescribePromptRequest describePromptRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Describes the specified queue.
     * </p>
     * 
     * @param describeQueueRequest
     * @return Result of the DescribeQueue operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.DescribeQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeQueue" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeQueueResult describeQueue(DescribeQueueRequest describeQueueRequest);

    /**
     * <p>
     * Describes the quick connect.
     * </p>
     * 
     * @param describeQuickConnectRequest
     * @return Result of the DescribeQuickConnect operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.DescribeQuickConnect
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeQuickConnect" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeQuickConnectResult describeQuickConnect(DescribeQuickConnectRequest describeQuickConnectRequest);

    /**
     * <p>
     * Describes the specified routing profile.
     * </p>
     * 
     * @param describeRoutingProfileRequest
     * @return Result of the DescribeRoutingProfile operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.DescribeRoutingProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeRoutingProfile" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeRoutingProfileResult describeRoutingProfile(DescribeRoutingProfileRequest describeRoutingProfileRequest);

    /**
     * <p>
     * Describes a rule for the specified Amazon Connect instance.
     * </p>
     * 
     * @param describeRuleRequest
     * @return Result of the DescribeRule operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonConnect.DescribeRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeRule" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeRuleResult describeRule(DescribeRuleRequest describeRuleRequest);

    /**
     * <p>
     * Gets basic information about the security profle.
     * </p>
     * 
     * @param describeSecurityProfileRequest
     * @return Result of the DescribeSecurityProfile operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.DescribeSecurityProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeSecurityProfile"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeSecurityProfileResult describeSecurityProfile(DescribeSecurityProfileRequest describeSecurityProfileRequest);

    /**
     * <p>
     * Gets details and status of a traffic distribution group.
     * </p>
     * 
     * @param describeTrafficDistributionGroupRequest
     * @return Result of the DescribeTrafficDistributionGroup operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.DescribeTrafficDistributionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeTrafficDistributionGroup"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeTrafficDistributionGroupResult describeTrafficDistributionGroup(DescribeTrafficDistributionGroupRequest describeTrafficDistributionGroupRequest);

    /**
     * <p>
     * Describes the specified user. You can <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance ID in the
     * Amazon Connect console</a> (it’s the final part of the ARN). The console does not display the user IDs. Instead,
     * list the users and note the IDs provided in the output.
     * </p>
     * 
     * @param describeUserRequest
     * @return Result of the DescribeUser operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.DescribeUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeUser" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeUserResult describeUser(DescribeUserRequest describeUserRequest);

    /**
     * <p>
     * Describes the specified hierarchy group.
     * </p>
     * 
     * @param describeUserHierarchyGroupRequest
     * @return Result of the DescribeUserHierarchyGroup operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.DescribeUserHierarchyGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeUserHierarchyGroup"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeUserHierarchyGroupResult describeUserHierarchyGroup(DescribeUserHierarchyGroupRequest describeUserHierarchyGroupRequest);

    /**
     * <p>
     * Describes the hierarchy structure of the specified Amazon Connect instance.
     * </p>
     * 
     * @param describeUserHierarchyStructureRequest
     * @return Result of the DescribeUserHierarchyStructure operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.DescribeUserHierarchyStructure
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeUserHierarchyStructure"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeUserHierarchyStructureResult describeUserHierarchyStructure(DescribeUserHierarchyStructureRequest describeUserHierarchyStructureRequest);

    /**
     * <p>
     * Retrieves the view for the specified Amazon Connect instance and view identifier.
     * </p>
     * <p>
     * The view identifier can be supplied as a ViewId or ARN.
     * </p>
     * <p>
     * <code>$SAVED</code> needs to be supplied if a view is unpublished.
     * </p>
     * <p>
     * The view identifier can contain an optional qualifier, for example, <code>&lt;view-id&gt;:$SAVED</code>, which is
     * either an actual version number or an Amazon Connect managed qualifier <code>$SAVED | $LATEST</code>. If it is
     * not supplied, then <code>$LATEST</code> is assumed for customer managed views and an error is returned if there
     * is no published content available. Version 1 is assumed for Amazon Web Services managed views.
     * </p>
     * 
     * @param describeViewRequest
     * @return Result of the DescribeView operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws TooManyRequestsException
     *         Displayed when rate-related API limits are exceeded.
     * @sample AmazonConnect.DescribeView
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeView" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeViewResult describeView(DescribeViewRequest describeViewRequest);

    /**
     * <p>
     * Describes the specified vocabulary.
     * </p>
     * 
     * @param describeVocabularyRequest
     * @return Result of the DescribeVocabulary operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonConnect.DescribeVocabulary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeVocabulary" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeVocabularyResult describeVocabulary(DescribeVocabularyRequest describeVocabularyRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Removes the dataset ID associated with a given Amazon Connect instance.
     * </p>
     * 
     * @param disassociateAnalyticsDataSetRequest
     * @return Result of the DisassociateAnalyticsDataSet operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.DisassociateAnalyticsDataSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DisassociateAnalyticsDataSet"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateAnalyticsDataSetResult disassociateAnalyticsDataSet(DisassociateAnalyticsDataSetRequest disassociateAnalyticsDataSetRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Revokes access to integrated applications from Amazon Connect.
     * </p>
     * 
     * @param disassociateApprovedOriginRequest
     * @return Result of the DisassociateApprovedOrigin operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.DisassociateApprovedOrigin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DisassociateApprovedOrigin"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateApprovedOriginResult disassociateApprovedOrigin(DisassociateApprovedOriginRequest disassociateApprovedOriginRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Revokes authorization from the specified instance to access the specified Amazon Lex or Amazon Lex V2 bot.
     * </p>
     * 
     * @param disassociateBotRequest
     * @return Result of the DisassociateBot operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.DisassociateBot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DisassociateBot" target="_top">AWS API
     *      Documentation</a>
     */
    DisassociateBotResult disassociateBot(DisassociateBotRequest disassociateBotRequest);

    /**
     * <p>
     * Disassociates a connect resource from a flow.
     * </p>
     * 
     * @param disassociateFlowRequest
     * @return Result of the DisassociateFlow operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.DisassociateFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DisassociateFlow" target="_top">AWS API
     *      Documentation</a>
     */
    DisassociateFlowResult disassociateFlow(DisassociateFlowRequest disassociateFlowRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Removes the storage type configurations for the specified resource type and association ID.
     * </p>
     * 
     * @param disassociateInstanceStorageConfigRequest
     * @return Result of the DisassociateInstanceStorageConfig operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.DisassociateInstanceStorageConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DisassociateInstanceStorageConfig"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateInstanceStorageConfigResult disassociateInstanceStorageConfig(DisassociateInstanceStorageConfigRequest disassociateInstanceStorageConfigRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Remove the Lambda function from the dropdown options available in the relevant flow blocks.
     * </p>
     * 
     * @param disassociateLambdaFunctionRequest
     * @return Result of the DisassociateLambdaFunction operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.DisassociateLambdaFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DisassociateLambdaFunction"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateLambdaFunctionResult disassociateLambdaFunction(DisassociateLambdaFunctionRequest disassociateLambdaFunctionRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Revokes authorization from the specified instance to access the specified Amazon Lex bot.
     * </p>
     * 
     * @param disassociateLexBotRequest
     * @return Result of the DisassociateLexBot operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.DisassociateLexBot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DisassociateLexBot" target="_top">AWS API
     *      Documentation</a>
     */
    DisassociateLexBotResult disassociateLexBot(DisassociateLexBotRequest disassociateLexBotRequest);

    /**
     * <p>
     * Removes the flow association from a phone number claimed to your Amazon Connect instance.
     * </p>
     * <important>
     * <p>
     * If the number is claimed to a traffic distribution group, and you are calling this API using an instance in the
     * Amazon Web Services Region where the traffic distribution group was created, you can use either a full phone
     * number ARN or UUID value for the <code>PhoneNumberId</code> URI request parameter. However, if the number is
     * claimed to a traffic distribution group and you are calling this API using an instance in the alternate Amazon
     * Web Services Region associated with the traffic distribution group, you must provide a full phone number ARN. If
     * a UUID is provided in this scenario, you will receive a <code>ResourceNotFoundException</code>.
     * </p>
     * </important>
     * 
     * @param disassociatePhoneNumberContactFlowRequest
     * @return Result of the DisassociatePhoneNumberContactFlow operation returned by the service.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonConnect.DisassociatePhoneNumberContactFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DisassociatePhoneNumberContactFlow"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociatePhoneNumberContactFlowResult disassociatePhoneNumberContactFlow(
            DisassociatePhoneNumberContactFlowRequest disassociatePhoneNumberContactFlowRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Disassociates a set of quick connects from a queue.
     * </p>
     * 
     * @param disassociateQueueQuickConnectsRequest
     * @return Result of the DisassociateQueueQuickConnects operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.DisassociateQueueQuickConnects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DisassociateQueueQuickConnects"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateQueueQuickConnectsResult disassociateQueueQuickConnects(DisassociateQueueQuickConnectsRequest disassociateQueueQuickConnectsRequest);

    /**
     * <p>
     * Disassociates a set of queues from a routing profile.
     * </p>
     * 
     * @param disassociateRoutingProfileQueuesRequest
     * @return Result of the DisassociateRoutingProfileQueues operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.DisassociateRoutingProfileQueues
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DisassociateRoutingProfileQueues"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateRoutingProfileQueuesResult disassociateRoutingProfileQueues(DisassociateRoutingProfileQueuesRequest disassociateRoutingProfileQueuesRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Deletes the specified security key.
     * </p>
     * 
     * @param disassociateSecurityKeyRequest
     * @return Result of the DisassociateSecurityKey operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.DisassociateSecurityKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DisassociateSecurityKey"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateSecurityKeyResult disassociateSecurityKey(DisassociateSecurityKeyRequest disassociateSecurityKeyRequest);

    /**
     * <p>
     * Disassociates an agent from a traffic distribution group.
     * </p>
     * 
     * @param disassociateTrafficDistributionGroupUserRequest
     * @return Result of the DisassociateTrafficDistributionGroupUser operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ResourceConflictException
     *         A resource already has that name.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.DisassociateTrafficDistributionGroupUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DisassociateTrafficDistributionGroupUser"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateTrafficDistributionGroupUserResult disassociateTrafficDistributionGroupUser(
            DisassociateTrafficDistributionGroupUserRequest disassociateTrafficDistributionGroupUserRequest);

    /**
     * <p>
     * Disassociates a set of proficiencies from a user.
     * </p>
     * 
     * @param disassociateUserProficienciesRequest
     * @return Result of the DisassociateUserProficiencies operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.DisassociateUserProficiencies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DisassociateUserProficiencies"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateUserProficienciesResult disassociateUserProficiencies(DisassociateUserProficienciesRequest disassociateUserProficienciesRequest);

    /**
     * <p>
     * Dismisses contacts from an agent’s CCP and returns the agent to an available state, which allows the agent to
     * receive a new routed contact. Contacts can only be dismissed if they are in a <code>MISSED</code>,
     * <code>ERROR</code>, <code>ENDED</code>, or <code>REJECTED</code> state in the <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/about-contact-states.html">Agent Event Stream</a>.
     * </p>
     * 
     * @param dismissUserContactRequest
     * @return Result of the DismissUserContact operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.DismissUserContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DismissUserContact" target="_top">AWS API
     *      Documentation</a>
     */
    DismissUserContactResult dismissUserContact(DismissUserContactRequest dismissUserContactRequest);

    /**
     * <p>
     * Provides a pre-signed URL for download of an approved attached file. This API also returns metadata about the
     * attached file. It will only return a downloadURL if the status of the attached file is <code>APPROVED</code>.
     * </p>
     * 
     * @param getAttachedFileRequest
     *        Request to GetAttachedFile API.
     * @return Result of the GetAttachedFile operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.GetAttachedFile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/GetAttachedFile" target="_top">AWS API
     *      Documentation</a>
     */
    GetAttachedFileResult getAttachedFile(GetAttachedFileRequest getAttachedFileRequest);

    /**
     * <p>
     * Retrieves the contact attributes for the specified contact.
     * </p>
     * 
     * @param getContactAttributesRequest
     * @return Result of the GetContactAttributes operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.GetContactAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/GetContactAttributes" target="_top">AWS
     *      API Documentation</a>
     */
    GetContactAttributesResult getContactAttributes(GetContactAttributesRequest getContactAttributesRequest);

    /**
     * <p>
     * Gets the real-time metric data from the specified Amazon Connect instance.
     * </p>
     * <p>
     * For a description of each metric, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html">Real-time Metrics
     * Definitions</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param getCurrentMetricDataRequest
     * @return Result of the GetCurrentMetricData operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AmazonConnect.GetCurrentMetricData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/GetCurrentMetricData" target="_top">AWS
     *      API Documentation</a>
     */
    GetCurrentMetricDataResult getCurrentMetricData(GetCurrentMetricDataRequest getCurrentMetricDataRequest);

    /**
     * <p>
     * Gets the real-time active user data from the specified Amazon Connect instance.
     * </p>
     * 
     * @param getCurrentUserDataRequest
     * @return Result of the GetCurrentUserData operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AmazonConnect.GetCurrentUserData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/GetCurrentUserData" target="_top">AWS API
     *      Documentation</a>
     */
    GetCurrentUserDataResult getCurrentUserData(GetCurrentUserDataRequest getCurrentUserDataRequest);

    /**
     * <p>
     * Supports SAML sign-in for Amazon Connect. Retrieves a token for federation. The token is for the Amazon Connect
     * user which corresponds to the IAM credentials that were used to invoke this action.
     * </p>
     * <p>
     * For more information about how SAML sign-in works in Amazon Connect, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/configure-saml.html ">Configure SAML with IAM for
     * Amazon Connect in the <i>Amazon Connect Administrator Guide</i>.</a>
     * </p>
     * <note>
     * <p>
     * This API doesn't support root users. If you try to invoke GetFederationToken with root credentials, an error
     * message similar to the following one appears:
     * </p>
     * <p>
     * <code>Provided identity: Principal: .... User: .... cannot be used for federation with Amazon Connect</code>
     * </p>
     * </note>
     * 
     * @param getFederationTokenRequest
     * @return Result of the GetFederationToken operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws UserNotFoundException
     *         No user with the specified credentials was found in the Amazon Connect instance.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws DuplicateResourceException
     *         A resource with the specified name already exists.
     * @sample AmazonConnect.GetFederationToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/GetFederationToken" target="_top">AWS API
     *      Documentation</a>
     */
    GetFederationTokenResult getFederationToken(GetFederationTokenRequest getFederationTokenRequest);

    /**
     * <p>
     * Retrieves the flow associated for a given resource.
     * </p>
     * 
     * @param getFlowAssociationRequest
     * @return Result of the GetFlowAssociation operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.GetFlowAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/GetFlowAssociation" target="_top">AWS API
     *      Documentation</a>
     */
    GetFlowAssociationResult getFlowAssociation(GetFlowAssociationRequest getFlowAssociationRequest);

    /**
     * <p>
     * Gets historical metric data from the specified Amazon Connect instance.
     * </p>
     * <p>
     * For a description of each historical metric, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/historical-metrics-definitions.html">Historical
     * Metrics Definitions</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * <note>
     * <p>
     * We recommend using the <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_GetMetricDataV2.html">GetMetricDataV2</a> API.
     * It provides more flexibility, features, and the ability to query longer time ranges than
     * <code>GetMetricData</code>. Use it to retrieve historical agent and contact metrics for the last 3 months, at
     * varying intervals. You can also use it to build custom dashboards to measure historical queue and agent
     * performance. For example, you can track the number of incoming contacts for the last 7 days, with data split by
     * day, to see how contact volume changed per day of the week.
     * </p>
     * </note>
     * 
     * @param getMetricDataRequest
     * @return Result of the GetMetricData operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AmazonConnect.GetMetricData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/GetMetricData" target="_top">AWS API
     *      Documentation</a>
     */
    GetMetricDataResult getMetricData(GetMetricDataRequest getMetricDataRequest);

    /**
     * <p>
     * Gets metric data from the specified Amazon Connect instance.
     * </p>
     * <p>
     * <code>GetMetricDataV2</code> offers more features than <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_GetMetricData.html">GetMetricData</a>, the
     * previous version of this API. It has new metrics, offers filtering at a metric level, and offers the ability to
     * filter and group data by channels, queues, routing profiles, agents, and agent hierarchy levels. It can retrieve
     * historical data for the last 3 months, at varying intervals.
     * </p>
     * <p>
     * For a description of the historical metrics that are supported by <code>GetMetricDataV2</code> and
     * <code>GetMetricData</code>, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/historical-metrics-definitions.html">Historical
     * metrics definitions</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param getMetricDataV2Request
     * @return Result of the GetMetricDataV2 operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AmazonConnect.GetMetricDataV2
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/GetMetricDataV2" target="_top">AWS API
     *      Documentation</a>
     */
    GetMetricDataV2Result getMetricDataV2(GetMetricDataV2Request getMetricDataV2Request);

    /**
     * <p>
     * Gets the prompt file.
     * </p>
     * 
     * @param getPromptFileRequest
     * @return Result of the GetPromptFile operation returned by the service.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.GetPromptFile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/GetPromptFile" target="_top">AWS API
     *      Documentation</a>
     */
    GetPromptFileResult getPromptFile(GetPromptFileRequest getPromptFileRequest);

    /**
     * <p>
     * Gets details about a specific task template in the specified Amazon Connect instance.
     * </p>
     * 
     * @param getTaskTemplateRequest
     * @return Result of the GetTaskTemplate operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.GetTaskTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/GetTaskTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    GetTaskTemplateResult getTaskTemplate(GetTaskTemplateRequest getTaskTemplateRequest);

    /**
     * <p>
     * Retrieves the current traffic distribution for a given traffic distribution group.
     * </p>
     * 
     * @param getTrafficDistributionRequest
     * @return Result of the GetTrafficDistribution operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.GetTrafficDistribution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/GetTrafficDistribution" target="_top">AWS
     *      API Documentation</a>
     */
    GetTrafficDistributionResult getTrafficDistribution(GetTrafficDistributionRequest getTrafficDistributionRequest);

    /**
     * <p>
     * Imports a claimed phone number from an external service, such as Amazon Pinpoint, into an Amazon Connect
     * instance. You can call this API only in the same Amazon Web Services Region where the Amazon Connect instance was
     * created.
     * </p>
     * 
     * @param importPhoneNumberRequest
     * @return Result of the ImportPhoneNumber operation returned by the service.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws IdempotencyException
     *         An entity with the same name already exists.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonConnect.ImportPhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ImportPhoneNumber" target="_top">AWS API
     *      Documentation</a>
     */
    ImportPhoneNumberResult importPhoneNumber(ImportPhoneNumberRequest importPhoneNumberRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Lists agent statuses.
     * </p>
     * 
     * @param listAgentStatusesRequest
     * @return Result of the ListAgentStatuses operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.ListAgentStatuses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListAgentStatuses" target="_top">AWS API
     *      Documentation</a>
     */
    ListAgentStatusesResult listAgentStatuses(ListAgentStatusesRequest listAgentStatusesRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Lists the association status of requested dataset ID for a given Amazon Connect instance.
     * </p>
     * 
     * @param listAnalyticsDataAssociationsRequest
     * @return Result of the ListAnalyticsDataAssociations operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.ListAnalyticsDataAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListAnalyticsDataAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    ListAnalyticsDataAssociationsResult listAnalyticsDataAssociations(ListAnalyticsDataAssociationsRequest listAnalyticsDataAssociationsRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Returns a paginated list of all approved origins associated with the instance.
     * </p>
     * 
     * @param listApprovedOriginsRequest
     * @return Result of the ListApprovedOrigins operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.ListApprovedOrigins
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListApprovedOrigins" target="_top">AWS
     *      API Documentation</a>
     */
    ListApprovedOriginsResult listApprovedOrigins(ListApprovedOriginsRequest listApprovedOriginsRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * For the specified version of Amazon Lex, returns a paginated list of all the Amazon Lex bots currently associated
     * with the instance. Use this API to returns both Amazon Lex V1 and V2 bots.
     * </p>
     * 
     * @param listBotsRequest
     * @return Result of the ListBots operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.ListBots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListBots" target="_top">AWS API
     *      Documentation</a>
     */
    ListBotsResult listBots(ListBotsRequest listBotsRequest);

    /**
     * <p>
     * Lists contact evaluations in the specified Amazon Connect instance.
     * </p>
     * 
     * @param listContactEvaluationsRequest
     * @return Result of the ListContactEvaluations operation returned by the service.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.ListContactEvaluations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListContactEvaluations" target="_top">AWS
     *      API Documentation</a>
     */
    ListContactEvaluationsResult listContactEvaluations(ListContactEvaluationsRequest listContactEvaluationsRequest);

    /**
     * <p>
     * Provides information about the flow modules for the specified Amazon Connect instance.
     * </p>
     * 
     * @param listContactFlowModulesRequest
     * @return Result of the ListContactFlowModules operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.ListContactFlowModules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListContactFlowModules" target="_top">AWS
     *      API Documentation</a>
     */
    ListContactFlowModulesResult listContactFlowModules(ListContactFlowModulesRequest listContactFlowModulesRequest);

    /**
     * <p>
     * Provides information about the flows for the specified Amazon Connect instance.
     * </p>
     * <p>
     * You can also create and update flows using the <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/flow-language.html">Amazon Connect Flow
     * language</a>.
     * </p>
     * <p>
     * For more information about flows, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/concepts-contact-flows.html">Flows</a> in the
     * <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param listContactFlowsRequest
     * @return Result of the ListContactFlows operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.ListContactFlows
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListContactFlows" target="_top">AWS API
     *      Documentation</a>
     */
    ListContactFlowsResult listContactFlows(ListContactFlowsRequest listContactFlowsRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * For the specified <code>referenceTypes</code>, returns a list of references associated with the contact.
     * <i>References</i> are links to documents that are related to a contact, such as emails, attachments, or URLs.
     * </p>
     * 
     * @param listContactReferencesRequest
     * @return Result of the ListContactReferences operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.ListContactReferences
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListContactReferences" target="_top">AWS
     *      API Documentation</a>
     */
    ListContactReferencesResult listContactReferences(ListContactReferencesRequest listContactReferencesRequest);

    /**
     * <p>
     * Lists the default vocabularies for the specified Amazon Connect instance.
     * </p>
     * 
     * @param listDefaultVocabulariesRequest
     * @return Result of the ListDefaultVocabularies operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonConnect.ListDefaultVocabularies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListDefaultVocabularies"
     *      target="_top">AWS API Documentation</a>
     */
    ListDefaultVocabulariesResult listDefaultVocabularies(ListDefaultVocabulariesRequest listDefaultVocabulariesRequest);

    /**
     * <p>
     * Lists versions of an evaluation form in the specified Amazon Connect instance.
     * </p>
     * 
     * @param listEvaluationFormVersionsRequest
     * @return Result of the ListEvaluationFormVersions operation returned by the service.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.ListEvaluationFormVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListEvaluationFormVersions"
     *      target="_top">AWS API Documentation</a>
     */
    ListEvaluationFormVersionsResult listEvaluationFormVersions(ListEvaluationFormVersionsRequest listEvaluationFormVersionsRequest);

    /**
     * <p>
     * Lists evaluation forms in the specified Amazon Connect instance.
     * </p>
     * 
     * @param listEvaluationFormsRequest
     * @return Result of the ListEvaluationForms operation returned by the service.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.ListEvaluationForms
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListEvaluationForms" target="_top">AWS
     *      API Documentation</a>
     */
    ListEvaluationFormsResult listEvaluationForms(ListEvaluationFormsRequest listEvaluationFormsRequest);

    /**
     * <p>
     * List the flow association based on the filters.
     * </p>
     * 
     * @param listFlowAssociationsRequest
     * @return Result of the ListFlowAssociations operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.ListFlowAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListFlowAssociations" target="_top">AWS
     *      API Documentation</a>
     */
    ListFlowAssociationsResult listFlowAssociations(ListFlowAssociationsRequest listFlowAssociationsRequest);

    /**
     * <p>
     * Provides information about the hours of operation for the specified Amazon Connect instance.
     * </p>
     * <p>
     * For more information about hours of operation, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/set-hours-operation.html">Set the Hours of Operation
     * for a Queue</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param listHoursOfOperationsRequest
     * @return Result of the ListHoursOfOperations operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.ListHoursOfOperations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListHoursOfOperations" target="_top">AWS
     *      API Documentation</a>
     */
    ListHoursOfOperationsResult listHoursOfOperations(ListHoursOfOperationsRequest listHoursOfOperationsRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Returns a paginated list of all attribute types for the given instance.
     * </p>
     * 
     * @param listInstanceAttributesRequest
     * @return Result of the ListInstanceAttributes operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.ListInstanceAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListInstanceAttributes" target="_top">AWS
     *      API Documentation</a>
     */
    ListInstanceAttributesResult listInstanceAttributes(ListInstanceAttributesRequest listInstanceAttributesRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Returns a paginated list of storage configs for the identified instance and resource type.
     * </p>
     * 
     * @param listInstanceStorageConfigsRequest
     * @return Result of the ListInstanceStorageConfigs operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.ListInstanceStorageConfigs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListInstanceStorageConfigs"
     *      target="_top">AWS API Documentation</a>
     */
    ListInstanceStorageConfigsResult listInstanceStorageConfigs(ListInstanceStorageConfigsRequest listInstanceStorageConfigsRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Return a list of instances which are in active state, creation-in-progress state, and failed state. Instances
     * that aren't successfully created (they are in a failed state) are returned only for 24 hours after the
     * CreateInstance API was invoked.
     * </p>
     * 
     * @param listInstancesRequest
     * @return Result of the ListInstances operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.ListInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListInstances" target="_top">AWS API
     *      Documentation</a>
     */
    ListInstancesResult listInstances(ListInstancesRequest listInstancesRequest);

    /**
     * <p>
     * Provides summary information about the Amazon Web Services resource associations for the specified Amazon Connect
     * instance.
     * </p>
     * 
     * @param listIntegrationAssociationsRequest
     * @return Result of the ListIntegrationAssociations operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.ListIntegrationAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListIntegrationAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    ListIntegrationAssociationsResult listIntegrationAssociations(ListIntegrationAssociationsRequest listIntegrationAssociationsRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Returns a paginated list of all Lambda functions that display in the dropdown options in the relevant flow
     * blocks.
     * </p>
     * 
     * @param listLambdaFunctionsRequest
     * @return Result of the ListLambdaFunctions operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.ListLambdaFunctions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListLambdaFunctions" target="_top">AWS
     *      API Documentation</a>
     */
    ListLambdaFunctionsResult listLambdaFunctions(ListLambdaFunctionsRequest listLambdaFunctionsRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Returns a paginated list of all the Amazon Lex V1 bots currently associated with the instance. To return both
     * Amazon Lex V1 and V2 bots, use the <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_ListBots.html">ListBots</a> API.
     * </p>
     * 
     * @param listLexBotsRequest
     * @return Result of the ListLexBots operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.ListLexBots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListLexBots" target="_top">AWS API
     *      Documentation</a>
     */
    ListLexBotsResult listLexBots(ListLexBotsRequest listLexBotsRequest);

    /**
     * <p>
     * Provides information about the phone numbers for the specified Amazon Connect instance.
     * </p>
     * <p>
     * For more information about phone numbers, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/contact-center-phone-number.html">Set Up Phone
     * Numbers for Your Contact Center</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * <important>
     * <ul>
     * <li>
     * <p>
     * We recommend using <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_ListPhoneNumbersV2.html">ListPhoneNumbersV2</a>
     * to return phone number types. ListPhoneNumbers doesn't support number types <code>UIFN</code>,
     * <code>SHARED</code>, <code>THIRD_PARTY_TF</code>, and <code>THIRD_PARTY_DID</code>. While it returns numbers of
     * those types, it incorrectly lists them as <code>TOLL_FREE</code> or <code>DID</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The phone number <code>Arn</code> value that is returned from each of the items in the <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_ListPhoneNumbers.html#connect-ListPhoneNumbers-response-PhoneNumberSummaryList"
     * >PhoneNumberSummaryList</a> cannot be used to tag phone number resources. It will fail with a
     * <code>ResourceNotFoundException</code>. Instead, use the <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_ListPhoneNumbersV2.html">ListPhoneNumbersV2</a>
     * API. It returns the new phone number ARN that can be used to tag phone number resources.
     * </p>
     * </li>
     * </ul>
     * </important>
     * 
     * @param listPhoneNumbersRequest
     * @return Result of the ListPhoneNumbers operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.ListPhoneNumbers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListPhoneNumbers" target="_top">AWS API
     *      Documentation</a>
     */
    ListPhoneNumbersResult listPhoneNumbers(ListPhoneNumbersRequest listPhoneNumbersRequest);

    /**
     * <p>
     * Lists phone numbers claimed to your Amazon Connect instance or traffic distribution group. If the provided
     * <code>TargetArn</code> is a traffic distribution group, you can call this API in both Amazon Web Services Regions
     * associated with traffic distribution group.
     * </p>
     * <p>
     * For more information about phone numbers, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/contact-center-phone-number.html">Set Up Phone
     * Numbers for Your Contact Center</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * When given an instance ARN, <code>ListPhoneNumbersV2</code> returns only the phone numbers claimed to the
     * instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * When given a traffic distribution group ARN <code>ListPhoneNumbersV2</code> returns only the phone numbers
     * claimed to the traffic distribution group.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param listPhoneNumbersV2Request
     * @return Result of the ListPhoneNumbersV2 operation returned by the service.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonConnect.ListPhoneNumbersV2
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListPhoneNumbersV2" target="_top">AWS API
     *      Documentation</a>
     */
    ListPhoneNumbersV2Result listPhoneNumbersV2(ListPhoneNumbersV2Request listPhoneNumbersV2Request);

    /**
     * <p>
     * Lists predefined attributes for the specified Amazon Connect instance.
     * </p>
     * 
     * @param listPredefinedAttributesRequest
     * @return Result of the ListPredefinedAttributes operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.ListPredefinedAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListPredefinedAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    ListPredefinedAttributesResult listPredefinedAttributes(ListPredefinedAttributesRequest listPredefinedAttributesRequest);

    /**
     * <p>
     * Provides information about the prompts for the specified Amazon Connect instance.
     * </p>
     * 
     * @param listPromptsRequest
     * @return Result of the ListPrompts operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.ListPrompts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListPrompts" target="_top">AWS API
     *      Documentation</a>
     */
    ListPromptsResult listPrompts(ListPromptsRequest listPromptsRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Lists the quick connects associated with a queue.
     * </p>
     * 
     * @param listQueueQuickConnectsRequest
     * @return Result of the ListQueueQuickConnects operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.ListQueueQuickConnects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListQueueQuickConnects" target="_top">AWS
     *      API Documentation</a>
     */
    ListQueueQuickConnectsResult listQueueQuickConnects(ListQueueQuickConnectsRequest listQueueQuickConnectsRequest);

    /**
     * <p>
     * Provides information about the queues for the specified Amazon Connect instance.
     * </p>
     * <p>
     * If you do not specify a <code>QueueTypes</code> parameter, both standard and agent queues are returned. This
     * might cause an unexpected truncation of results if you have more than 1000 agents and you limit the number of
     * results of the API call in code.
     * </p>
     * <p>
     * For more information about queues, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/concepts-queues-standard-and-agent.html">Queues:
     * Standard and Agent</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param listQueuesRequest
     * @return Result of the ListQueues operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.ListQueues
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListQueues" target="_top">AWS API
     *      Documentation</a>
     */
    ListQueuesResult listQueues(ListQueuesRequest listQueuesRequest);

    /**
     * <p>
     * Provides information about the quick connects for the specified Amazon Connect instance.
     * </p>
     * 
     * @param listQuickConnectsRequest
     * @return Result of the ListQuickConnects operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.ListQuickConnects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListQuickConnects" target="_top">AWS API
     *      Documentation</a>
     */
    ListQuickConnectsResult listQuickConnects(ListQuickConnectsRequest listQuickConnectsRequest);

    /**
     * <p>
     * Provides a list of analysis segments for a real-time analysis session.
     * </p>
     * 
     * @param listRealtimeContactAnalysisSegmentsV2Request
     * @return Result of the ListRealtimeContactAnalysisSegmentsV2 operation returned by the service.
     * @throws OutputTypeNotFoundException
     *         Thrown for analyzed content when requested OutputType was not enabled for a given contact. For example,
     *         if an OutputType.Raw was requested for a contact that had `RedactedOnly` Redaction policy set in Contact
     *         flow.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.ListRealtimeContactAnalysisSegmentsV2
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListRealtimeContactAnalysisSegmentsV2"
     *      target="_top">AWS API Documentation</a>
     */
    ListRealtimeContactAnalysisSegmentsV2Result listRealtimeContactAnalysisSegmentsV2(
            ListRealtimeContactAnalysisSegmentsV2Request listRealtimeContactAnalysisSegmentsV2Request);

    /**
     * <p>
     * Lists the queues associated with a routing profile.
     * </p>
     * 
     * @param listRoutingProfileQueuesRequest
     * @return Result of the ListRoutingProfileQueues operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.ListRoutingProfileQueues
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListRoutingProfileQueues"
     *      target="_top">AWS API Documentation</a>
     */
    ListRoutingProfileQueuesResult listRoutingProfileQueues(ListRoutingProfileQueuesRequest listRoutingProfileQueuesRequest);

    /**
     * <p>
     * Provides summary information about the routing profiles for the specified Amazon Connect instance.
     * </p>
     * <p>
     * For more information about routing profiles, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/concepts-routing.html">Routing Profiles</a> and <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/routing-profiles.html">Create a Routing Profile</a>
     * in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param listRoutingProfilesRequest
     * @return Result of the ListRoutingProfiles operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.ListRoutingProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListRoutingProfiles" target="_top">AWS
     *      API Documentation</a>
     */
    ListRoutingProfilesResult listRoutingProfiles(ListRoutingProfilesRequest listRoutingProfilesRequest);

    /**
     * <p>
     * List all rules for the specified Amazon Connect instance.
     * </p>
     * 
     * @param listRulesRequest
     * @return Result of the ListRules operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AmazonConnect.ListRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListRules" target="_top">AWS API
     *      Documentation</a>
     */
    ListRulesResult listRules(ListRulesRequest listRulesRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Returns a paginated list of all security keys associated with the instance.
     * </p>
     * 
     * @param listSecurityKeysRequest
     * @return Result of the ListSecurityKeys operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.ListSecurityKeys
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListSecurityKeys" target="_top">AWS API
     *      Documentation</a>
     */
    ListSecurityKeysResult listSecurityKeys(ListSecurityKeysRequest listSecurityKeysRequest);

    /**
     * <p>
     * Returns a list of third-party applications in a specific security profile.
     * </p>
     * 
     * @param listSecurityProfileApplicationsRequest
     * @return Result of the ListSecurityProfileApplications operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.ListSecurityProfileApplications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListSecurityProfileApplications"
     *      target="_top">AWS API Documentation</a>
     */
    ListSecurityProfileApplicationsResult listSecurityProfileApplications(ListSecurityProfileApplicationsRequest listSecurityProfileApplicationsRequest);

    /**
     * <p>
     * Lists the permissions granted to a security profile.
     * </p>
     * 
     * @param listSecurityProfilePermissionsRequest
     * @return Result of the ListSecurityProfilePermissions operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.ListSecurityProfilePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListSecurityProfilePermissions"
     *      target="_top">AWS API Documentation</a>
     */
    ListSecurityProfilePermissionsResult listSecurityProfilePermissions(ListSecurityProfilePermissionsRequest listSecurityProfilePermissionsRequest);

    /**
     * <p>
     * Provides summary information about the security profiles for the specified Amazon Connect instance.
     * </p>
     * <p>
     * For more information about security profiles, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/connect-security-profiles.html">Security Profiles</a>
     * in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param listSecurityProfilesRequest
     * @return Result of the ListSecurityProfiles operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.ListSecurityProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListSecurityProfiles" target="_top">AWS
     *      API Documentation</a>
     */
    ListSecurityProfilesResult listSecurityProfiles(ListSecurityProfilesRequest listSecurityProfilesRequest);

    /**
     * <p>
     * Lists the tags for the specified resource.
     * </p>
     * <p>
     * For sample policies that use tags, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/security_iam_id-based-policy-examples.html">Amazon
     * Connect Identity-Based Policy Examples</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists task templates for the specified Amazon Connect instance.
     * </p>
     * 
     * @param listTaskTemplatesRequest
     * @return Result of the ListTaskTemplates operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.ListTaskTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListTaskTemplates" target="_top">AWS API
     *      Documentation</a>
     */
    ListTaskTemplatesResult listTaskTemplates(ListTaskTemplatesRequest listTaskTemplatesRequest);

    /**
     * <p>
     * Lists traffic distribution group users.
     * </p>
     * 
     * @param listTrafficDistributionGroupUsersRequest
     * @return Result of the ListTrafficDistributionGroupUsers operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.ListTrafficDistributionGroupUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListTrafficDistributionGroupUsers"
     *      target="_top">AWS API Documentation</a>
     */
    ListTrafficDistributionGroupUsersResult listTrafficDistributionGroupUsers(ListTrafficDistributionGroupUsersRequest listTrafficDistributionGroupUsersRequest);

    /**
     * <p>
     * Lists traffic distribution groups.
     * </p>
     * 
     * @param listTrafficDistributionGroupsRequest
     * @return Result of the ListTrafficDistributionGroups operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.ListTrafficDistributionGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListTrafficDistributionGroups"
     *      target="_top">AWS API Documentation</a>
     */
    ListTrafficDistributionGroupsResult listTrafficDistributionGroups(ListTrafficDistributionGroupsRequest listTrafficDistributionGroupsRequest);

    /**
     * <p>
     * Lists the use cases for the integration association.
     * </p>
     * 
     * @param listUseCasesRequest
     *        Provides summary information about the use cases for the specified integration association.
     * @return Result of the ListUseCases operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.ListUseCases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListUseCases" target="_top">AWS API
     *      Documentation</a>
     */
    ListUseCasesResult listUseCases(ListUseCasesRequest listUseCasesRequest);

    /**
     * <p>
     * Provides summary information about the hierarchy groups for the specified Amazon Connect instance.
     * </p>
     * <p>
     * For more information about agent hierarchies, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/agent-hierarchy.html">Set Up Agent Hierarchies</a> in
     * the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param listUserHierarchyGroupsRequest
     * @return Result of the ListUserHierarchyGroups operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.ListUserHierarchyGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListUserHierarchyGroups"
     *      target="_top">AWS API Documentation</a>
     */
    ListUserHierarchyGroupsResult listUserHierarchyGroups(ListUserHierarchyGroupsRequest listUserHierarchyGroupsRequest);

    /**
     * <p>
     * Lists proficiencies associated with a user.
     * </p>
     * 
     * @param listUserProficienciesRequest
     * @return Result of the ListUserProficiencies operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.ListUserProficiencies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListUserProficiencies" target="_top">AWS
     *      API Documentation</a>
     */
    ListUserProficienciesResult listUserProficiencies(ListUserProficienciesRequest listUserProficienciesRequest);

    /**
     * <p>
     * Provides summary information about the users for the specified Amazon Connect instance.
     * </p>
     * 
     * @param listUsersRequest
     * @return Result of the ListUsers operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.ListUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListUsers" target="_top">AWS API
     *      Documentation</a>
     */
    ListUsersResult listUsers(ListUsersRequest listUsersRequest);

    /**
     * <p>
     * Returns all the available versions for the specified Amazon Connect instance and view identifier.
     * </p>
     * <p>
     * Results will be sorted from highest to lowest.
     * </p>
     * 
     * @param listViewVersionsRequest
     * @return Result of the ListViewVersions operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws TooManyRequestsException
     *         Displayed when rate-related API limits are exceeded.
     * @sample AmazonConnect.ListViewVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListViewVersions" target="_top">AWS API
     *      Documentation</a>
     */
    ListViewVersionsResult listViewVersions(ListViewVersionsRequest listViewVersionsRequest);

    /**
     * <p>
     * Returns views in the given instance.
     * </p>
     * <p>
     * Results are sorted primarily by type, and secondarily by name.
     * </p>
     * 
     * @param listViewsRequest
     * @return Result of the ListViews operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws TooManyRequestsException
     *         Displayed when rate-related API limits are exceeded.
     * @sample AmazonConnect.ListViews
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListViews" target="_top">AWS API
     *      Documentation</a>
     */
    ListViewsResult listViews(ListViewsRequest listViewsRequest);

    /**
     * <p>
     * Initiates silent monitoring of a contact. The Contact Control Panel (CCP) of the user specified by <i>userId</i>
     * will be set to silent monitoring mode on the contact.
     * </p>
     * 
     * @param monitorContactRequest
     * @return Result of the MonitorContact operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws IdempotencyException
     *         An entity with the same name already exists.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.MonitorContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/MonitorContact" target="_top">AWS API
     *      Documentation</a>
     */
    MonitorContactResult monitorContact(MonitorContactRequest monitorContactRequest);

    /**
     * <p>
     * Allows pausing an ongoing task contact.
     * </p>
     * 
     * @param pauseContactRequest
     * @return Result of the PauseContact operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws LimitExceededException
     *         The allowed limit for the resource has been exceeded.
     * @throws ConflictException
     *         Operation cannot be performed at this time as there is a conflict with another operation or contact
     *         state.
     * @sample AmazonConnect.PauseContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/PauseContact" target="_top">AWS API
     *      Documentation</a>
     */
    PauseContactResult pauseContact(PauseContactRequest pauseContactRequest);

    /**
     * <p>
     * Changes the current status of a user or agent in Amazon Connect. If the agent is currently handling a contact,
     * this sets the agent's next status.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/metrics-agent-status.html">Agent status</a> and <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/set-next-status.html">Set your next status</a> in the
     * <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param putUserStatusRequest
     * @return Result of the PutUserStatus operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.PutUserStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/PutUserStatus" target="_top">AWS API
     *      Documentation</a>
     */
    PutUserStatusResult putUserStatus(PutUserStatusRequest putUserStatusRequest);

    /**
     * <p>
     * Releases a phone number previously claimed to an Amazon Connect instance or traffic distribution group. You can
     * call this API only in the Amazon Web Services Region where the number was claimed.
     * </p>
     * <important>
     * <p>
     * To release phone numbers from a traffic distribution group, use the <code>ReleasePhoneNumber</code> API, not the
     * Amazon Connect admin website.
     * </p>
     * <p>
     * After releasing a phone number, the phone number enters into a cooldown period of 30 days. It cannot be searched
     * for or claimed again until the period has ended. If you accidentally release a phone number, contact Amazon Web
     * Services Support.
     * </p>
     * </important>
     * <p>
     * If you plan to claim and release numbers frequently during a 30 day period, contact us for a service quota
     * exception. Otherwise, it is possible you will be blocked from claiming and releasing any more numbers until 30
     * days past the oldest number released has expired.
     * </p>
     * <p>
     * By default you can claim and release up to 200% of your maximum number of active phone numbers during any 30 day
     * period. If you claim and release phone numbers using the UI or API during a rolling 30 day cycle that exceeds
     * 200% of your phone number service level quota, you will be blocked from claiming any more numbers until 30 days
     * past the oldest number released has expired.
     * </p>
     * <p>
     * For example, if you already have 99 claimed numbers and a service level quota of 99 phone numbers, and in any 30
     * day period you release 99, claim 99, and then release 99, you will have exceeded the 200% limit. At that point
     * you are blocked from claiming any more numbers until you open an Amazon Web Services support ticket.
     * </p>
     * 
     * @param releasePhoneNumberRequest
     * @return Result of the ReleasePhoneNumber operation returned by the service.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ResourceInUseException
     *         That resource is already in use. Please try another.
     * @throws IdempotencyException
     *         An entity with the same name already exists.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonConnect.ReleasePhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ReleasePhoneNumber" target="_top">AWS API
     *      Documentation</a>
     */
    ReleasePhoneNumberResult releasePhoneNumber(ReleasePhoneNumberRequest releasePhoneNumberRequest);

    /**
     * <p>
     * Replicates an Amazon Connect instance in the specified Amazon Web Services Region and copies configuration
     * information for Amazon Connect resources across Amazon Web Services Regions.
     * </p>
     * <p>
     * For more information about replicating an Amazon Connect instance, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/create-replica-connect-instance.html">Create a
     * replica of your existing Amazon Connect instance</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param replicateInstanceRequest
     * @return Result of the ReplicateInstance operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ResourceNotReadyException
     *         The resource is not ready.
     * @throws ResourceConflictException
     *         A resource already has that name.
     * @sample AmazonConnect.ReplicateInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ReplicateInstance" target="_top">AWS API
     *      Documentation</a>
     */
    ReplicateInstanceResult replicateInstance(ReplicateInstanceRequest replicateInstanceRequest);

    /**
     * <p>
     * Allows resuming a task contact in a paused state.
     * </p>
     * 
     * @param resumeContactRequest
     * @return Result of the ResumeContact operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws ConflictException
     *         Operation cannot be performed at this time as there is a conflict with another operation or contact
     *         state.
     * @sample AmazonConnect.ResumeContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ResumeContact" target="_top">AWS API
     *      Documentation</a>
     */
    ResumeContactResult resumeContact(ResumeContactRequest resumeContactRequest);

    /**
     * <p>
     * When a contact is being recorded, and the recording has been suspended using SuspendContactRecording, this API
     * resumes recording whatever recording is selected in the flow configuration: call, screen, or both. If only call
     * recording or only screen recording is enabled, then it would resume.
     * </p>
     * <p>
     * Voice and screen recordings are supported.
     * </p>
     * 
     * @param resumeContactRecordingRequest
     * @return Result of the ResumeContactRecording operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.ResumeContactRecording
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ResumeContactRecording" target="_top">AWS
     *      API Documentation</a>
     */
    ResumeContactRecordingResult resumeContactRecording(ResumeContactRecordingRequest resumeContactRecordingRequest);

    /**
     * <p>
     * Searches for available phone numbers that you can claim to your Amazon Connect instance or traffic distribution
     * group. If the provided <code>TargetArn</code> is a traffic distribution group, you can call this API in both
     * Amazon Web Services Regions associated with the traffic distribution group.
     * </p>
     * 
     * @param searchAvailablePhoneNumbersRequest
     * @return Result of the SearchAvailablePhoneNumbers operation returned by the service.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonConnect.SearchAvailablePhoneNumbers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/SearchAvailablePhoneNumbers"
     *      target="_top">AWS API Documentation</a>
     */
    SearchAvailablePhoneNumbersResult searchAvailablePhoneNumbers(SearchAvailablePhoneNumbersRequest searchAvailablePhoneNumbersRequest);

    /**
     * <p>
     * Searches the flow modules in an Amazon Connect instance, with optional filtering.
     * </p>
     * 
     * @param searchContactFlowModulesRequest
     * @return Result of the SearchContactFlowModules operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.SearchContactFlowModules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/SearchContactFlowModules"
     *      target="_top">AWS API Documentation</a>
     */
    SearchContactFlowModulesResult searchContactFlowModules(SearchContactFlowModulesRequest searchContactFlowModulesRequest);

    /**
     * <p>
     * Searches the contact flows in an Amazon Connect instance, with optional filtering.
     * </p>
     * 
     * @param searchContactFlowsRequest
     * @return Result of the SearchContactFlows operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.SearchContactFlows
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/SearchContactFlows" target="_top">AWS API
     *      Documentation</a>
     */
    SearchContactFlowsResult searchContactFlows(SearchContactFlowsRequest searchContactFlowsRequest);

    /**
     * <p>
     * Searches contacts in an Amazon Connect instance.
     * </p>
     * 
     * @param searchContactsRequest
     * @return Result of the SearchContacts operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.SearchContacts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/SearchContacts" target="_top">AWS API
     *      Documentation</a>
     */
    SearchContactsResult searchContacts(SearchContactsRequest searchContactsRequest);

    /**
     * <p>
     * Searches the hours of operation in an Amazon Connect instance, with optional filtering.
     * </p>
     * 
     * @param searchHoursOfOperationsRequest
     * @return Result of the SearchHoursOfOperations operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.SearchHoursOfOperations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/SearchHoursOfOperations"
     *      target="_top">AWS API Documentation</a>
     */
    SearchHoursOfOperationsResult searchHoursOfOperations(SearchHoursOfOperationsRequest searchHoursOfOperationsRequest);

    /**
     * <p>
     * Predefined attributes that meet certain criteria.
     * </p>
     * 
     * @param searchPredefinedAttributesRequest
     * @return Result of the SearchPredefinedAttributes operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.SearchPredefinedAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/SearchPredefinedAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    SearchPredefinedAttributesResult searchPredefinedAttributes(SearchPredefinedAttributesRequest searchPredefinedAttributesRequest);

    /**
     * <p>
     * Searches prompts in an Amazon Connect instance, with optional filtering.
     * </p>
     * 
     * @param searchPromptsRequest
     * @return Result of the SearchPrompts operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.SearchPrompts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/SearchPrompts" target="_top">AWS API
     *      Documentation</a>
     */
    SearchPromptsResult searchPrompts(SearchPromptsRequest searchPromptsRequest);

    /**
     * <p>
     * Searches queues in an Amazon Connect instance, with optional filtering.
     * </p>
     * 
     * @param searchQueuesRequest
     * @return Result of the SearchQueues operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.SearchQueues
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/SearchQueues" target="_top">AWS API
     *      Documentation</a>
     */
    SearchQueuesResult searchQueues(SearchQueuesRequest searchQueuesRequest);

    /**
     * <p>
     * Searches quick connects in an Amazon Connect instance, with optional filtering.
     * </p>
     * 
     * @param searchQuickConnectsRequest
     * @return Result of the SearchQuickConnects operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.SearchQuickConnects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/SearchQuickConnects" target="_top">AWS
     *      API Documentation</a>
     */
    SearchQuickConnectsResult searchQuickConnects(SearchQuickConnectsRequest searchQuickConnectsRequest);

    /**
     * <p>
     * Searches tags used in an Amazon Connect instance using optional search criteria.
     * </p>
     * 
     * @param searchResourceTagsRequest
     * @return Result of the SearchResourceTags operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws MaximumResultReturnedException
     *         Maximum number (1000) of tags have been returned with current request. Consider changing request
     *         parameters to get more tags.
     * @sample AmazonConnect.SearchResourceTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/SearchResourceTags" target="_top">AWS API
     *      Documentation</a>
     */
    SearchResourceTagsResult searchResourceTags(SearchResourceTagsRequest searchResourceTagsRequest);

    /**
     * <p>
     * Searches routing profiles in an Amazon Connect instance, with optional filtering.
     * </p>
     * 
     * @param searchRoutingProfilesRequest
     * @return Result of the SearchRoutingProfiles operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.SearchRoutingProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/SearchRoutingProfiles" target="_top">AWS
     *      API Documentation</a>
     */
    SearchRoutingProfilesResult searchRoutingProfiles(SearchRoutingProfilesRequest searchRoutingProfilesRequest);

    /**
     * <p>
     * Searches security profiles in an Amazon Connect instance, with optional filtering.
     * </p>
     * 
     * @param searchSecurityProfilesRequest
     * @return Result of the SearchSecurityProfiles operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.SearchSecurityProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/SearchSecurityProfiles" target="_top">AWS
     *      API Documentation</a>
     */
    SearchSecurityProfilesResult searchSecurityProfiles(SearchSecurityProfilesRequest searchSecurityProfilesRequest);

    /**
     * <p>
     * Searches users in an Amazon Connect instance, with optional filtering.
     * </p>
     * <note>
     * <p>
     * <code>AfterContactWorkTimeLimit</code> is returned in milliseconds.
     * </p>
     * </note>
     * 
     * @param searchUsersRequest
     * @return Result of the SearchUsers operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.SearchUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/SearchUsers" target="_top">AWS API
     *      Documentation</a>
     */
    SearchUsersResult searchUsers(SearchUsersRequest searchUsersRequest);

    /**
     * <p>
     * Searches for vocabularies within a specific Amazon Connect instance using <code>State</code>,
     * <code>NameStartsWith</code>, and <code>LanguageCode</code>.
     * </p>
     * 
     * @param searchVocabulariesRequest
     * @return Result of the SearchVocabularies operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonConnect.SearchVocabularies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/SearchVocabularies" target="_top">AWS API
     *      Documentation</a>
     */
    SearchVocabulariesResult searchVocabularies(SearchVocabulariesRequest searchVocabulariesRequest);

    /**
     * <p>
     * Processes chat integration events from Amazon Web Services or external integrations to Amazon Connect. A chat
     * integration event includes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * SourceId, DestinationId, and Subtype: a set of identifiers, uniquely representing a chat
     * </p>
     * </li>
     * <li>
     * <p>
     * ChatEvent: details of the chat action to perform such as sending a message, event, or disconnecting from a chat
     * </p>
     * </li>
     * </ul>
     * <p>
     * When a chat integration event is sent with chat identifiers that do not map to an active chat contact, a new chat
     * contact is also created before handling chat action.
     * </p>
     * <p>
     * Access to this API is currently restricted to Amazon Pinpoint for supporting SMS integration.
     * </p>
     * 
     * @param sendChatIntegrationEventRequest
     * @return Result of the SendChatIntegrationEvent operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonConnect.SendChatIntegrationEvent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/SendChatIntegrationEvent"
     *      target="_top">AWS API Documentation</a>
     */
    SendChatIntegrationEventResult sendChatIntegrationEvent(SendChatIntegrationEventRequest sendChatIntegrationEventRequest);

    /**
     * <p>
     * Provides a pre-signed Amazon S3 URL in response for uploading your content.
     * </p>
     * <important>
     * <p>
     * You may only use this API to upload attachments to a <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_connect-cases_CreateCase.html">Connect
     * Case</a>.
     * </p>
     * </important>
     * 
     * @param startAttachedFileUploadRequest
     * @return Result of the StartAttachedFileUpload operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws ResourceConflictException
     *         A resource already has that name.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded.
     * @sample AmazonConnect.StartAttachedFileUpload
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/StartAttachedFileUpload"
     *      target="_top">AWS API Documentation</a>
     */
    StartAttachedFileUploadResult startAttachedFileUpload(StartAttachedFileUploadRequest startAttachedFileUploadRequest);

    /**
     * <p>
     * Initiates a flow to start a new chat for the customer. Response of this API provides a token required to obtain
     * credentials from the <a
     * href="https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_CreateParticipantConnection.html"
     * >CreateParticipantConnection</a> API in the Amazon Connect Participant Service.
     * </p>
     * <p>
     * When a new chat contact is successfully created, clients must subscribe to the participant’s connection for the
     * created chat within 5 minutes. This is achieved by invoking <a
     * href="https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_CreateParticipantConnection.html"
     * >CreateParticipantConnection</a> with WEBSOCKET and CONNECTION_CREDENTIALS.
     * </p>
     * <p>
     * A 429 error occurs in the following situations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * API rate limit is exceeded. API TPS throttling returns a <code>TooManyRequests</code> exception.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <a href="https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html">quota for
     * concurrent active chats</a> is exceeded. Active chat throttling returns a <code>LimitExceededException</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you use the <code>ChatDurationInMinutes</code> parameter and receive a 400 error, your account may not support
     * the ability to configure custom chat durations. For more information, contact Amazon Web Services Support.
     * </p>
     * <p>
     * For more information about chat, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/chat.html">Chat</a> in the <i>Amazon Connect
     * Administrator Guide</i>.
     * </p>
     * 
     * @param startChatContactRequest
     * @return Result of the StartChatContact operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws LimitExceededException
     *         The allowed limit for the resource has been exceeded.
     * @sample AmazonConnect.StartChatContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/StartChatContact" target="_top">AWS API
     *      Documentation</a>
     */
    StartChatContactResult startChatContact(StartChatContactRequest startChatContactRequest);

    /**
     * <p>
     * Starts an empty evaluation in the specified Amazon Connect instance, using the given evaluation form for the
     * particular contact. The evaluation form version used for the contact evaluation corresponds to the currently
     * activated version. If no version is activated for the evaluation form, the contact evaluation cannot be started.
     * </p>
     * <note>
     * <p>
     * Evaluations created through the public API do not contain answer values suggested from automation.
     * </p>
     * </note>
     * 
     * @param startContactEvaluationRequest
     * @return Result of the StartContactEvaluation operation returned by the service.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded.
     * @throws ResourceConflictException
     *         A resource already has that name.
     * @sample AmazonConnect.StartContactEvaluation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/StartContactEvaluation" target="_top">AWS
     *      API Documentation</a>
     */
    StartContactEvaluationResult startContactEvaluation(StartContactEvaluationRequest startContactEvaluationRequest);

    /**
     * <p>
     * Starts recording the contact:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the API is called <i>before</i> the agent joins the call, recording starts when the agent joins the call.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the API is called <i>after</i> the agent joins the call, recording starts at the time of the API call.
     * </p>
     * </li>
     * </ul>
     * <p>
     * StartContactRecording is a one-time action. For example, if you use StopContactRecording to stop recording an
     * ongoing call, you can't use StartContactRecording to restart it. For scenarios where the recording has started
     * and you want to suspend and resume it, such as when collecting sensitive information (for example, a credit card
     * number), use SuspendContactRecording and ResumeContactRecording.
     * </p>
     * <p>
     * You can use this API to override the recording behavior configured in the <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/set-recording-behavior.html">Set recording
     * behavior</a> block.
     * </p>
     * <p>
     * Only voice recordings are supported at this time.
     * </p>
     * 
     * @param startContactRecordingRequest
     * @return Result of the StartContactRecording operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.StartContactRecording
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/StartContactRecording" target="_top">AWS
     *      API Documentation</a>
     */
    StartContactRecordingResult startContactRecording(StartContactRecordingRequest startContactRecordingRequest);

    /**
     * <p>
     * Initiates real-time message streaming for a new chat contact.
     * </p>
     * <p>
     * For more information about message streaming, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/chat-message-streaming.html">Enable real-time chat
     * message streaming</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param startContactStreamingRequest
     * @return Result of the StartContactStreaming operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws LimitExceededException
     *         The allowed limit for the resource has been exceeded.
     * @sample AmazonConnect.StartContactStreaming
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/StartContactStreaming" target="_top">AWS
     *      API Documentation</a>
     */
    StartContactStreamingResult startContactStreaming(StartContactStreamingRequest startContactStreamingRequest);

    /**
     * <p>
     * Places an outbound call to a contact, and then initiates the flow. It performs the actions in the flow that's
     * specified (in <code>ContactFlowId</code>).
     * </p>
     * <p>
     * Agents do not initiate the outbound API, which means that they do not dial the contact. If the flow places an
     * outbound call to a contact, and then puts the contact in queue, the call is then routed to the agent, like any
     * other inbound case.
     * </p>
     * <p>
     * There is a 60-second dialing timeout for this operation. If the call is not connected after 60 seconds, it fails.
     * </p>
     * <note>
     * <p>
     * UK numbers with a 447 prefix are not allowed by default. Before you can dial these UK mobile numbers, you must
     * submit a service quota increase request. For more information, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html">Amazon Connect
     * Service Quotas</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * </note> <note>
     * <p>
     * Campaign calls are not allowed by default. Before you can make a call with <code>TrafficType</code> =
     * <code>CAMPAIGN</code>, you must submit a service quota increase request to the quota <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html#outbound-communications-quotas"
     * >Amazon Connect campaigns</a>.
     * </p>
     * </note>
     * 
     * @param startOutboundVoiceContactRequest
     * @return Result of the StartOutboundVoiceContact operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws LimitExceededException
     *         The allowed limit for the resource has been exceeded.
     * @throws DestinationNotAllowedException
     *         Outbound calls to the destination number are not allowed.
     * @throws OutboundContactNotPermittedException
     *         The contact is not permitted.
     * @sample AmazonConnect.StartOutboundVoiceContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/StartOutboundVoiceContact"
     *      target="_top">AWS API Documentation</a>
     */
    StartOutboundVoiceContactResult startOutboundVoiceContact(StartOutboundVoiceContactRequest startOutboundVoiceContactRequest);

    /**
     * <p>
     * Initiates a flow to start a new task contact. For more information about task contacts, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/tasks.html">Concepts: Tasks in Amazon Connect</a> in
     * the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * <p>
     * When using <code>PreviousContactId</code> and <code>RelatedContactId</code> input parameters, note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PreviousContactId</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * Any updates to user-defined task contact attributes on any contact linked through the same
     * <code>PreviousContactId</code> will affect every contact in the chain.
     * </p>
     * </li>
     * <li>
     * <p>
     * There can be a maximum of 12 linked task contacts in a chain. That is, 12 task contacts can be created that share
     * the same <code>PreviousContactId</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>RelatedContactId</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * Copies contact attributes from the related task contact to the new contact.
     * </p>
     * </li>
     * <li>
     * <p>
     * Any update on attributes in a new task contact does not update attributes on previous contact.
     * </p>
     * </li>
     * <li>
     * <p>
     * There’s no limit on the number of task contacts that can be created that use the same
     * <code>RelatedContactId</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * In addition, when calling StartTaskContact include only one of these parameters: <code>ContactFlowID</code>,
     * <code>QuickConnectID</code>, or <code>TaskTemplateID</code>. Only one parameter is required as long as the task
     * template has a flow configured to run it. If more than one parameter is specified, or only the
     * <code>TaskTemplateID</code> is specified but it does not have a flow configured, the request returns an error
     * because Amazon Connect cannot identify the unique flow to run when the task is created.
     * </p>
     * <p>
     * A <code>ServiceQuotaExceededException</code> occurs when the number of open tasks exceeds the active tasks quota
     * or there are already 12 tasks referencing the same <code>PreviousContactId</code>. For more information about
     * service quotas for task contacts, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html">Amazon Connect
     * service quotas</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param startTaskContactRequest
     * @return Result of the StartTaskContact operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.StartTaskContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/StartTaskContact" target="_top">AWS API
     *      Documentation</a>
     */
    StartTaskContactResult startTaskContact(StartTaskContactRequest startTaskContactRequest);

    /**
     * <p>
     * Places an inbound in-app, web, or video call to a contact, and then initiates the flow. It performs the actions
     * in the flow that are specified (in ContactFlowId) and present in the Amazon Connect instance (specified as
     * InstanceId).
     * </p>
     * 
     * @param startWebRTCContactRequest
     * @return Result of the StartWebRTCContact operation returned by the service.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws LimitExceededException
     *         The allowed limit for the resource has been exceeded.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AmazonConnect.StartWebRTCContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/StartWebRTCContact" target="_top">AWS API
     *      Documentation</a>
     */
    StartWebRTCContactResult startWebRTCContact(StartWebRTCContactRequest startWebRTCContactRequest);

    /**
     * <p>
     * Ends the specified contact. Use this API to stop queued callbacks. It does not work for voice contacts that use
     * the following initiation methods:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DISCONNECT
     * </p>
     * </li>
     * <li>
     * <p>
     * TRANSFER
     * </p>
     * </li>
     * <li>
     * <p>
     * QUEUE_TRANSFER
     * </p>
     * </li>
     * </ul>
     * <p>
     * Chat and task contacts can be terminated in any state, regardless of initiation method.
     * </p>
     * 
     * @param stopContactRequest
     * @return Result of the StopContact operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ContactNotFoundException
     *         The contact with the specified ID is not active or does not exist. Applies to Voice calls only, not to
     *         Chat or Task contacts.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.StopContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/StopContact" target="_top">AWS API
     *      Documentation</a>
     */
    StopContactResult stopContact(StopContactRequest stopContactRequest);

    /**
     * <p>
     * Stops recording a call when a contact is being recorded. StopContactRecording is a one-time action. If you use
     * StopContactRecording to stop recording an ongoing call, you can't use StartContactRecording to restart it. For
     * scenarios where the recording has started and you want to suspend it for sensitive information (for example, to
     * collect a credit card number), and then restart it, use SuspendContactRecording and ResumeContactRecording.
     * </p>
     * <p>
     * Only voice recordings are supported at this time.
     * </p>
     * 
     * @param stopContactRecordingRequest
     * @return Result of the StopContactRecording operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.StopContactRecording
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/StopContactRecording" target="_top">AWS
     *      API Documentation</a>
     */
    StopContactRecordingResult stopContactRecording(StopContactRecordingRequest stopContactRecordingRequest);

    /**
     * <p>
     * Ends message streaming on a specified contact. To restart message streaming on that contact, call the <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_StartContactStreaming.html"
     * >StartContactStreaming</a> API.
     * </p>
     * 
     * @param stopContactStreamingRequest
     * @return Result of the StopContactStreaming operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.StopContactStreaming
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/StopContactStreaming" target="_top">AWS
     *      API Documentation</a>
     */
    StopContactStreamingResult stopContactStreaming(StopContactStreamingRequest stopContactStreamingRequest);

    /**
     * <p>
     * Submits a contact evaluation in the specified Amazon Connect instance. Answers included in the request are merged
     * with existing answers for the given evaluation. If no answers or notes are passed, the evaluation is submitted
     * with the existing answers and notes. You can delete an answer or note by passing an empty object (<code>{}</code>
     * ) to the question identifier.
     * </p>
     * <p>
     * If a contact evaluation is already in submitted state, this operation will trigger a resubmission.
     * </p>
     * 
     * @param submitContactEvaluationRequest
     * @return Result of the SubmitContactEvaluation operation returned by the service.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ResourceConflictException
     *         A resource already has that name.
     * @sample AmazonConnect.SubmitContactEvaluation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/SubmitContactEvaluation"
     *      target="_top">AWS API Documentation</a>
     */
    SubmitContactEvaluationResult submitContactEvaluation(SubmitContactEvaluationRequest submitContactEvaluationRequest);

    /**
     * <p>
     * When a contact is being recorded, this API suspends recording whatever is selected in the flow configuration:
     * call, screen, or both. If only call recording or only screen recording is enabled, then it would be suspended.
     * For example, you might suspend the screen recording while collecting sensitive information, such as a credit card
     * number. Then use ResumeContactRecording to restart recording the screen.
     * </p>
     * <p>
     * The period of time that the recording is suspended is filled with silence in the final recording.
     * </p>
     * <p>
     * Voice and screen recordings are supported.
     * </p>
     * 
     * @param suspendContactRecordingRequest
     * @return Result of the SuspendContactRecording operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.SuspendContactRecording
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/SuspendContactRecording"
     *      target="_top">AWS API Documentation</a>
     */
    SuspendContactRecordingResult suspendContactRecording(SuspendContactRecordingRequest suspendContactRecordingRequest);

    /**
     * <p>
     * Adds the specified tags to the contact resource. For more information about this API is used, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/granular-billing.html">Set up granular billing for a
     * detailed view of your Amazon Connect usage</a>.
     * </p>
     * 
     * @param tagContactRequest
     * @return Result of the TagContact operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.TagContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/TagContact" target="_top">AWS API
     *      Documentation</a>
     */
    TagContactResult tagContact(TagContactRequest tagContactRequest);

    /**
     * <p>
     * Adds the specified tags to the specified resource.
     * </p>
     * <p>
     * Some of the supported resource types are agents, routing profiles, queues, quick connects, contact flows, agent
     * statuses, hours of operation, phone numbers, security profiles, and task templates. For a complete list, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/tagging.html">Tagging resources in Amazon
     * Connect</a>.
     * </p>
     * <p>
     * For sample policies that use tags, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/security_iam_id-based-policy-examples.html">Amazon
     * Connect Identity-Based Policy Examples</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Transfers contacts from one agent or queue to another agent or queue at any point after a contact is created. You
     * can transfer a contact to another queue by providing the flow which orchestrates the contact to the destination
     * queue. This gives you more control over contact handling and helps you adhere to the service level agreement
     * (SLA) guaranteed to your customers.
     * </p>
     * <p>
     * Note the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Transfer is supported for only <code>TASK</code> contacts.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do not use both <code>QueueId</code> and <code>UserId</code> in the same call.
     * </p>
     * </li>
     * <li>
     * <p>
     * The following flow types are supported: Inbound flow, Transfer to agent flow, and Transfer to queue flow.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>TransferContact</code> API can be called only on active contacts.
     * </p>
     * </li>
     * <li>
     * <p>
     * A contact cannot be transferred more than 11 times.
     * </p>
     * </li>
     * </ul>
     * 
     * @param transferContactRequest
     * @return Result of the TransferContact operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws IdempotencyException
     *         An entity with the same name already exists.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.TransferContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/TransferContact" target="_top">AWS API
     *      Documentation</a>
     */
    TransferContactResult transferContact(TransferContactRequest transferContactRequest);

    /**
     * <p>
     * Removes the specified tags from the contact resource. For more information about this API is used, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/granular-billing.html">Set up granular billing for a
     * detailed view of your Amazon Connect usage</a>.
     * </p>
     * 
     * @param untagContactRequest
     * @return Result of the UntagContact operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.UntagContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UntagContact" target="_top">AWS API
     *      Documentation</a>
     */
    UntagContactResult untagContact(UntagContactRequest untagContactRequest);

    /**
     * <p>
     * Removes the specified tags from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Updates agent status.
     * </p>
     * 
     * @param updateAgentStatusRequest
     * @return Result of the UpdateAgentStatus operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws DuplicateResourceException
     *         A resource with the specified name already exists.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws LimitExceededException
     *         The allowed limit for the resource has been exceeded.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.UpdateAgentStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateAgentStatus" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateAgentStatusResult updateAgentStatus(UpdateAgentStatusRequest updateAgentStatusRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Adds or updates user-defined contact information associated with the specified contact. At least one field to be
     * updated must be present in the request.
     * </p>
     * <important>
     * <p>
     * You can add or update user-defined contact information for both ongoing and completed contacts.
     * </p>
     * </important>
     * 
     * @param updateContactRequest
     * @return Result of the UpdateContact operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.UpdateContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateContact" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateContactResult updateContact(UpdateContactRequest updateContactRequest);

    /**
     * <p>
     * Creates or updates user-defined contact attributes associated with the specified contact.
     * </p>
     * <p>
     * You can create or update user-defined attributes for both ongoing and completed contacts. For example, while the
     * call is active, you can update the customer's name or the reason the customer called. You can add notes about
     * steps that the agent took during the call that display to the next agent that takes the call. You can also update
     * attributes for a contact using data from your CRM application and save the data with the contact in Amazon
     * Connect. You could also flag calls for additional analysis, such as legal review or to identify abusive callers.
     * </p>
     * <p>
     * Contact attributes are available in Amazon Connect for 24 months, and are then deleted. For information about
     * contact record retention and the maximum size of the contact record attributes section, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html#feature-limits"
     * >Feature specifications</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param updateContactAttributesRequest
     * @return Result of the UpdateContactAttributes operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.UpdateContactAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateContactAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateContactAttributesResult updateContactAttributes(UpdateContactAttributesRequest updateContactAttributesRequest);

    /**
     * <p>
     * Updates details about a contact evaluation in the specified Amazon Connect instance. A contact evaluation must be
     * in draft state. Answers included in the request are merged with existing answers for the given evaluation. An
     * answer or note can be deleted by passing an empty object (<code>{}</code>) to the question identifier.
     * </p>
     * 
     * @param updateContactEvaluationRequest
     * @return Result of the UpdateContactEvaluation operation returned by the service.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ResourceConflictException
     *         A resource already has that name.
     * @sample AmazonConnect.UpdateContactEvaluation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateContactEvaluation"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateContactEvaluationResult updateContactEvaluation(UpdateContactEvaluationRequest updateContactEvaluationRequest);

    /**
     * <p>
     * Updates the specified flow.
     * </p>
     * <p>
     * You can also create and update flows using the <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/flow-language.html">Amazon Connect Flow
     * language</a>.
     * </p>
     * <p>
     * Use the <code>$SAVED</code> alias in the request to describe the <code>SAVED</code> content of a Flow. For
     * example, <code>arn:aws:.../contact-flow/{id}:$SAVED</code>. Once a contact flow is published, <code>$SAVED</code>
     * needs to be supplied to view saved content that has not been published.
     * </p>
     * 
     * @param updateContactFlowContentRequest
     * @return Result of the UpdateContactFlowContent operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidContactFlowException
     *         The flow is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.UpdateContactFlowContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateContactFlowContent"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateContactFlowContentResult updateContactFlowContent(UpdateContactFlowContentRequest updateContactFlowContentRequest);

    /**
     * <p>
     * Updates metadata about specified flow.
     * </p>
     * 
     * @param updateContactFlowMetadataRequest
     * @return Result of the UpdateContactFlowMetadata operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws DuplicateResourceException
     *         A resource with the specified name already exists.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.UpdateContactFlowMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateContactFlowMetadata"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateContactFlowMetadataResult updateContactFlowMetadata(UpdateContactFlowMetadataRequest updateContactFlowMetadataRequest);

    /**
     * <p>
     * Updates specified flow module for the specified Amazon Connect instance.
     * </p>
     * <p>
     * Use the <code>$SAVED</code> alias in the request to describe the <code>SAVED</code> content of a Flow. For
     * example, <code>arn:aws:.../contact-flow/{id}:$SAVED</code>. Once a contact flow is published, <code>$SAVED</code>
     * needs to be supplied to view saved content that has not been published.
     * </p>
     * 
     * @param updateContactFlowModuleContentRequest
     * @return Result of the UpdateContactFlowModuleContent operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidContactFlowModuleException
     *         The problems with the module. Please fix before trying again.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.UpdateContactFlowModuleContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateContactFlowModuleContent"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateContactFlowModuleContentResult updateContactFlowModuleContent(UpdateContactFlowModuleContentRequest updateContactFlowModuleContentRequest);

    /**
     * <p>
     * Updates metadata about specified flow module.
     * </p>
     * 
     * @param updateContactFlowModuleMetadataRequest
     * @return Result of the UpdateContactFlowModuleMetadata operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws DuplicateResourceException
     *         A resource with the specified name already exists.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.UpdateContactFlowModuleMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateContactFlowModuleMetadata"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateContactFlowModuleMetadataResult updateContactFlowModuleMetadata(UpdateContactFlowModuleMetadataRequest updateContactFlowModuleMetadataRequest);

    /**
     * <p>
     * The name of the flow.
     * </p>
     * <p>
     * You can also create and update flows using the <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/flow-language.html">Amazon Connect Flow
     * language</a>.
     * </p>
     * 
     * @param updateContactFlowNameRequest
     * @return Result of the UpdateContactFlowName operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws DuplicateResourceException
     *         A resource with the specified name already exists.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.UpdateContactFlowName
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateContactFlowName" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateContactFlowNameResult updateContactFlowName(UpdateContactFlowNameRequest updateContactFlowNameRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Updates routing priority and age on the contact (<b>QueuePriority</b> and <b>QueueTimeAdjustmentInSeconds</b>).
     * These properties can be used to change a customer's position in the queue. For example, you can move a contact to
     * the back of the queue by setting a lower routing priority relative to other contacts in queue; or you can move a
     * contact to the front of the queue by increasing the routing age which will make the contact look artificially
     * older and therefore higher up in the first-in-first-out routing order. Note that adjusting the routing age of a
     * contact affects only its position in queue, and not its actual queue wait time as reported through metrics. These
     * properties can also be updated by using <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/change-routing-priority.html">the Set routing
     * priority / age flow block</a>.
     * </p>
     * 
     * @param updateContactRoutingDataRequest
     * @return Result of the UpdateContactRoutingData operation returned by the service.
     * @throws ResourceConflictException
     *         A resource already has that name.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonConnect.UpdateContactRoutingData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateContactRoutingData"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateContactRoutingDataResult updateContactRoutingData(UpdateContactRoutingDataRequest updateContactRoutingDataRequest);

    /**
     * <p>
     * Updates the scheduled time of a task contact that is already scheduled.
     * </p>
     * 
     * @param updateContactScheduleRequest
     * @return Result of the UpdateContactSchedule operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws LimitExceededException
     *         The allowed limit for the resource has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.UpdateContactSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateContactSchedule" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateContactScheduleResult updateContactSchedule(UpdateContactScheduleRequest updateContactScheduleRequest);

    /**
     * <p>
     * Updates details about a specific evaluation form version in the specified Amazon Connect instance. Question and
     * section identifiers cannot be duplicated within the same evaluation form.
     * </p>
     * <p>
     * This operation does not support partial updates. Instead it does a full update of evaluation form content.
     * </p>
     * 
     * @param updateEvaluationFormRequest
     * @return Result of the UpdateEvaluationForm operation returned by the service.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded.
     * @throws ResourceConflictException
     *         A resource already has that name.
     * @sample AmazonConnect.UpdateEvaluationForm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateEvaluationForm" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateEvaluationFormResult updateEvaluationForm(UpdateEvaluationFormRequest updateEvaluationFormRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Updates the hours of operation.
     * </p>
     * 
     * @param updateHoursOfOperationRequest
     * @return Result of the UpdateHoursOfOperation operation returned by the service.
     * @throws DuplicateResourceException
     *         A resource with the specified name already exists.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.UpdateHoursOfOperation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateHoursOfOperation" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateHoursOfOperationResult updateHoursOfOperation(UpdateHoursOfOperationRequest updateHoursOfOperationRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Updates the value for the specified attribute type.
     * </p>
     * 
     * @param updateInstanceAttributeRequest
     * @return Result of the UpdateInstanceAttribute operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.UpdateInstanceAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateInstanceAttribute"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateInstanceAttributeResult updateInstanceAttribute(UpdateInstanceAttributeRequest updateInstanceAttributeRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Updates an existing configuration for a resource type. This API is idempotent.
     * </p>
     * 
     * @param updateInstanceStorageConfigRequest
     * @return Result of the UpdateInstanceStorageConfig operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.UpdateInstanceStorageConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateInstanceStorageConfig"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateInstanceStorageConfigResult updateInstanceStorageConfig(UpdateInstanceStorageConfigRequest updateInstanceStorageConfigRequest);

    /**
     * <p>
     * Updates timeouts for when human chat participants are to be considered idle, and when agents are automatically
     * disconnected from a chat due to idleness. You can set four timers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Customer idle timeout
     * </p>
     * </li>
     * <li>
     * <p>
     * Customer auto-disconnect timeout
     * </p>
     * </li>
     * <li>
     * <p>
     * Agent idle timeout
     * </p>
     * </li>
     * <li>
     * <p>
     * Agent auto-disconnect timeout
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about how chat timeouts work, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/setup-chat-timeouts.html">Set up chat timeouts for
     * human participants</a>.
     * </p>
     * 
     * @param updateParticipantRoleConfigRequest
     * @return Result of the UpdateParticipantRoleConfig operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.UpdateParticipantRoleConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateParticipantRoleConfig"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateParticipantRoleConfigResult updateParticipantRoleConfig(UpdateParticipantRoleConfigRequest updateParticipantRoleConfigRequest);

    /**
     * <p>
     * Updates your claimed phone number from its current Amazon Connect instance or traffic distribution group to
     * another Amazon Connect instance or traffic distribution group in the same Amazon Web Services Region.
     * </p>
     * <important>
     * <p>
     * After using this API, you must verify that the phone number is attached to the correct flow in the target
     * instance or traffic distribution group. You need to do this because the API switches only the phone number to a
     * new instance or traffic distribution group. It doesn't migrate the flow configuration of the phone number, too.
     * </p>
     * <p>
     * You can call <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_DescribePhoneNumber.html">DescribePhoneNumber
     * </a> API to verify the status of a previous <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_UpdatePhoneNumber.html">UpdatePhoneNumber</a>
     * operation.
     * </p>
     * </important>
     * 
     * @param updatePhoneNumberRequest
     * @return Result of the UpdatePhoneNumber operation returned by the service.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ResourceInUseException
     *         That resource is already in use. Please try another.
     * @throws IdempotencyException
     *         An entity with the same name already exists.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonConnect.UpdatePhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdatePhoneNumber" target="_top">AWS API
     *      Documentation</a>
     */
    UpdatePhoneNumberResult updatePhoneNumber(UpdatePhoneNumberRequest updatePhoneNumberRequest);

    /**
     * <p>
     * Updates a phone number’s metadata.
     * </p>
     * <important>
     * <p>
     * To verify the status of a previous UpdatePhoneNumberMetadata operation, call the <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_DescribePhoneNumber.html"
     * >DescribePhoneNumber</a> API.
     * </p>
     * </important>
     * 
     * @param updatePhoneNumberMetadataRequest
     * @return Result of the UpdatePhoneNumberMetadata operation returned by the service.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ResourceInUseException
     *         That resource is already in use. Please try another.
     * @throws IdempotencyException
     *         An entity with the same name already exists.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.UpdatePhoneNumberMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdatePhoneNumberMetadata"
     *      target="_top">AWS API Documentation</a>
     */
    UpdatePhoneNumberMetadataResult updatePhoneNumberMetadata(UpdatePhoneNumberMetadataRequest updatePhoneNumberMetadataRequest);

    /**
     * <p>
     * Updates a predefined attribute for the specified Amazon Connect instance.
     * </p>
     * 
     * @param updatePredefinedAttributeRequest
     * @return Result of the UpdatePredefinedAttribute operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.UpdatePredefinedAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdatePredefinedAttribute"
     *      target="_top">AWS API Documentation</a>
     */
    UpdatePredefinedAttributeResult updatePredefinedAttribute(UpdatePredefinedAttributeRequest updatePredefinedAttributeRequest);

    /**
     * <p>
     * Updates a prompt.
     * </p>
     * 
     * @param updatePromptRequest
     * @return Result of the UpdatePrompt operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.UpdatePrompt
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdatePrompt" target="_top">AWS API
     *      Documentation</a>
     */
    UpdatePromptResult updatePrompt(UpdatePromptRequest updatePromptRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Updates the hours of operation for the specified queue.
     * </p>
     * 
     * @param updateQueueHoursOfOperationRequest
     * @return Result of the UpdateQueueHoursOfOperation operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.UpdateQueueHoursOfOperation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateQueueHoursOfOperation"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateQueueHoursOfOperationResult updateQueueHoursOfOperation(UpdateQueueHoursOfOperationRequest updateQueueHoursOfOperationRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Updates the maximum number of contacts allowed in a queue before it is considered full.
     * </p>
     * 
     * @param updateQueueMaxContactsRequest
     * @return Result of the UpdateQueueMaxContacts operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.UpdateQueueMaxContacts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateQueueMaxContacts" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateQueueMaxContactsResult updateQueueMaxContacts(UpdateQueueMaxContactsRequest updateQueueMaxContactsRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Updates the name and description of a queue. At least <code>Name</code> or <code>Description</code> must be
     * provided.
     * </p>
     * 
     * @param updateQueueNameRequest
     * @return Result of the UpdateQueueName operation returned by the service.
     * @throws DuplicateResourceException
     *         A resource with the specified name already exists.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.UpdateQueueName
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateQueueName" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateQueueNameResult updateQueueName(UpdateQueueNameRequest updateQueueNameRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Updates the outbound caller ID name, number, and outbound whisper flow for a specified queue.
     * </p>
     * <important>
     * <ul>
     * <li>
     * <p>
     * If the phone number is claimed to a traffic distribution group that was created in the same Region as the Amazon
     * Connect instance where you are calling this API, then you can use a full phone number ARN or a UUID for
     * <code>OutboundCallerIdNumberId</code>. However, if the phone number is claimed to a traffic distribution group
     * that is in one Region, and you are calling this API from an instance in another Amazon Web Services Region that
     * is associated with the traffic distribution group, you must provide a full phone number ARN. If a UUID is
     * provided in this scenario, you will receive a <code>ResourceNotFoundException</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Only use the phone number ARN format that doesn't contain <code>instance</code> in the path, for example,
     * <code>arn:aws:connect:us-east-1:1234567890:phone-number/uuid</code>. This is the same ARN format that is returned
     * when you call the <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_ListPhoneNumbersV2.html">ListPhoneNumbersV2</a>
     * API.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you plan to use IAM policies to allow/deny access to this API for phone number resources claimed to a traffic
     * distribution group, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/security_iam_resource-level-policy-examples.html#allow-deny-queue-actions-replica-region"
     * >Allow or Deny queue API actions for phone numbers in a replica Region</a>.
     * </p>
     * </li>
     * </ul>
     * </important>
     * 
     * @param updateQueueOutboundCallerConfigRequest
     * @return Result of the UpdateQueueOutboundCallerConfig operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.UpdateQueueOutboundCallerConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateQueueOutboundCallerConfig"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateQueueOutboundCallerConfigResult updateQueueOutboundCallerConfig(UpdateQueueOutboundCallerConfigRequest updateQueueOutboundCallerConfigRequest);

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Updates the status of the queue.
     * </p>
     * 
     * @param updateQueueStatusRequest
     * @return Result of the UpdateQueueStatus operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.UpdateQueueStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateQueueStatus" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateQueueStatusResult updateQueueStatus(UpdateQueueStatusRequest updateQueueStatusRequest);

    /**
     * <p>
     * Updates the configuration settings for the specified quick connect.
     * </p>
     * 
     * @param updateQuickConnectConfigRequest
     * @return Result of the UpdateQuickConnectConfig operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.UpdateQuickConnectConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateQuickConnectConfig"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateQuickConnectConfigResult updateQuickConnectConfig(UpdateQuickConnectConfigRequest updateQuickConnectConfigRequest);

    /**
     * <p>
     * Updates the name and description of a quick connect. The request accepts the following data in JSON format. At
     * least <code>Name</code> or <code>Description</code> must be provided.
     * </p>
     * 
     * @param updateQuickConnectNameRequest
     * @return Result of the UpdateQuickConnectName operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.UpdateQuickConnectName
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateQuickConnectName" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateQuickConnectNameResult updateQuickConnectName(UpdateQuickConnectNameRequest updateQuickConnectNameRequest);

    /**
     * <p>
     * Whether agents with this routing profile will have their routing order calculated based on <i>time since their
     * last inbound contact</i> or <i>longest idle time</i>.
     * </p>
     * 
     * @param updateRoutingProfileAgentAvailabilityTimerRequest
     * @return Result of the UpdateRoutingProfileAgentAvailabilityTimer operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.UpdateRoutingProfileAgentAvailabilityTimer
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateRoutingProfileAgentAvailabilityTimer"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateRoutingProfileAgentAvailabilityTimerResult updateRoutingProfileAgentAvailabilityTimer(
            UpdateRoutingProfileAgentAvailabilityTimerRequest updateRoutingProfileAgentAvailabilityTimerRequest);

    /**
     * <p>
     * Updates the channels that agents can handle in the Contact Control Panel (CCP) for a routing profile.
     * </p>
     * 
     * @param updateRoutingProfileConcurrencyRequest
     * @return Result of the UpdateRoutingProfileConcurrency operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.UpdateRoutingProfileConcurrency
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateRoutingProfileConcurrency"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateRoutingProfileConcurrencyResult updateRoutingProfileConcurrency(UpdateRoutingProfileConcurrencyRequest updateRoutingProfileConcurrencyRequest);

    /**
     * <p>
     * Updates the default outbound queue of a routing profile.
     * </p>
     * 
     * @param updateRoutingProfileDefaultOutboundQueueRequest
     * @return Result of the UpdateRoutingProfileDefaultOutboundQueue operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.UpdateRoutingProfileDefaultOutboundQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateRoutingProfileDefaultOutboundQueue"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateRoutingProfileDefaultOutboundQueueResult updateRoutingProfileDefaultOutboundQueue(
            UpdateRoutingProfileDefaultOutboundQueueRequest updateRoutingProfileDefaultOutboundQueueRequest);

    /**
     * <p>
     * Updates the name and description of a routing profile. The request accepts the following data in JSON format. At
     * least <code>Name</code> or <code>Description</code> must be provided.
     * </p>
     * 
     * @param updateRoutingProfileNameRequest
     * @return Result of the UpdateRoutingProfileName operation returned by the service.
     * @throws DuplicateResourceException
     *         A resource with the specified name already exists.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.UpdateRoutingProfileName
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateRoutingProfileName"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateRoutingProfileNameResult updateRoutingProfileName(UpdateRoutingProfileNameRequest updateRoutingProfileNameRequest);

    /**
     * <p>
     * Updates the properties associated with a set of queues for a routing profile.
     * </p>
     * 
     * @param updateRoutingProfileQueuesRequest
     * @return Result of the UpdateRoutingProfileQueues operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.UpdateRoutingProfileQueues
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateRoutingProfileQueues"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateRoutingProfileQueuesResult updateRoutingProfileQueues(UpdateRoutingProfileQueuesRequest updateRoutingProfileQueuesRequest);

    /**
     * <p>
     * Updates a rule for the specified Amazon Connect instance.
     * </p>
     * <p>
     * Use the <a href="https://docs.aws.amazon.com/connect/latest/APIReference/connect-rules-language.html">Rules
     * Function language</a> to code conditions for the rule.
     * </p>
     * 
     * @param updateRuleRequest
     * @return Result of the UpdateRule operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws ResourceConflictException
     *         A resource already has that name.
     * @sample AmazonConnect.UpdateRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateRule" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateRuleResult updateRule(UpdateRuleRequest updateRuleRequest);

    /**
     * <p>
     * Updates a security profile.
     * </p>
     * 
     * @param updateSecurityProfileRequest
     * @return Result of the UpdateSecurityProfile operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.UpdateSecurityProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateSecurityProfile" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateSecurityProfileResult updateSecurityProfile(UpdateSecurityProfileRequest updateSecurityProfileRequest);

    /**
     * <p>
     * Updates details about a specific task template in the specified Amazon Connect instance. This operation does not
     * support partial updates. Instead it does a full update of template content.
     * </p>
     * 
     * @param updateTaskTemplateRequest
     * @return Result of the UpdateTaskTemplate operation returned by the service.
     * @throws PropertyValidationException
     *         The property is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.UpdateTaskTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateTaskTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateTaskTemplateResult updateTaskTemplate(UpdateTaskTemplateRequest updateTaskTemplateRequest);

    /**
     * <p>
     * Updates the traffic distribution for a given traffic distribution group.
     * </p>
     * <note>
     * <p>
     * The <code>SignInConfig</code> distribution is available only on a default <code>TrafficDistributionGroup</code>
     * (see the <code>IsDefault</code> parameter in the <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_TrafficDistributionGroup.html"
     * >TrafficDistributionGroup</a> data type). If you call <code>UpdateTrafficDistribution</code> with a modified
     * <code>SignInConfig</code> and a non-default <code>TrafficDistributionGroup</code>, an
     * <code>InvalidRequestException</code> is returned.
     * </p>
     * </note>
     * <p>
     * For more information about updating a traffic distribution group, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/update-telephony-traffic-distribution.html">Update
     * telephony traffic distribution across Amazon Web Services Regions </a> in the <i>Amazon Connect Administrator
     * Guide</i>.
     * </p>
     * 
     * @param updateTrafficDistributionRequest
     * @return Result of the UpdateTrafficDistribution operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ResourceConflictException
     *         A resource already has that name.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.UpdateTrafficDistribution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateTrafficDistribution"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateTrafficDistributionResult updateTrafficDistribution(UpdateTrafficDistributionRequest updateTrafficDistributionRequest);

    /**
     * <p>
     * Assigns the specified hierarchy group to the specified user.
     * </p>
     * 
     * @param updateUserHierarchyRequest
     * @return Result of the UpdateUserHierarchy operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.UpdateUserHierarchy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateUserHierarchy" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateUserHierarchyResult updateUserHierarchy(UpdateUserHierarchyRequest updateUserHierarchyRequest);

    /**
     * <p>
     * Updates the name of the user hierarchy group.
     * </p>
     * 
     * @param updateUserHierarchyGroupNameRequest
     * @return Result of the UpdateUserHierarchyGroupName operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws DuplicateResourceException
     *         A resource with the specified name already exists.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.UpdateUserHierarchyGroupName
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateUserHierarchyGroupName"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateUserHierarchyGroupNameResult updateUserHierarchyGroupName(UpdateUserHierarchyGroupNameRequest updateUserHierarchyGroupNameRequest);

    /**
     * <p>
     * Updates the user hierarchy structure: add, remove, and rename user hierarchy levels.
     * </p>
     * 
     * @param updateUserHierarchyStructureRequest
     * @return Result of the UpdateUserHierarchyStructure operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ResourceInUseException
     *         That resource is already in use. Please try another.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.UpdateUserHierarchyStructure
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateUserHierarchyStructure"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateUserHierarchyStructureResult updateUserHierarchyStructure(UpdateUserHierarchyStructureRequest updateUserHierarchyStructureRequest);

    /**
     * <p>
     * Updates the identity information for the specified user.
     * </p>
     * <important>
     * <p>
     * We strongly recommend limiting who has the ability to invoke <code>UpdateUserIdentityInfo</code>. Someone with
     * that ability can change the login credentials of other users by changing their email address. This poses a
     * security risk to your organization. They can change the email address of a user to the attacker's email address,
     * and then reset the password through email. For more information, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/security-profile-best-practices.html">Best Practices
     * for Security Profiles</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * </important>
     * 
     * @param updateUserIdentityInfoRequest
     * @return Result of the UpdateUserIdentityInfo operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.UpdateUserIdentityInfo
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateUserIdentityInfo" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateUserIdentityInfoResult updateUserIdentityInfo(UpdateUserIdentityInfoRequest updateUserIdentityInfoRequest);

    /**
     * <p>
     * Updates the phone configuration settings for the specified user.
     * </p>
     * 
     * @param updateUserPhoneConfigRequest
     * @return Result of the UpdateUserPhoneConfig operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.UpdateUserPhoneConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateUserPhoneConfig" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateUserPhoneConfigResult updateUserPhoneConfig(UpdateUserPhoneConfigRequest updateUserPhoneConfigRequest);

    /**
     * <p>
     * Updates the properties associated with the proficiencies of a user.
     * </p>
     * 
     * @param updateUserProficienciesRequest
     * @return Result of the UpdateUserProficiencies operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.UpdateUserProficiencies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateUserProficiencies"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateUserProficienciesResult updateUserProficiencies(UpdateUserProficienciesRequest updateUserProficienciesRequest);

    /**
     * <p>
     * Assigns the specified routing profile to the specified user.
     * </p>
     * 
     * @param updateUserRoutingProfileRequest
     * @return Result of the UpdateUserRoutingProfile operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.UpdateUserRoutingProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateUserRoutingProfile"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateUserRoutingProfileResult updateUserRoutingProfile(UpdateUserRoutingProfileRequest updateUserRoutingProfileRequest);

    /**
     * <p>
     * Assigns the specified security profiles to the specified user.
     * </p>
     * 
     * @param updateUserSecurityProfilesRequest
     * @return Result of the UpdateUserSecurityProfiles operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.UpdateUserSecurityProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateUserSecurityProfiles"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateUserSecurityProfilesResult updateUserSecurityProfiles(UpdateUserSecurityProfilesRequest updateUserSecurityProfilesRequest);

    /**
     * <p>
     * Updates the view content of the given view identifier in the specified Amazon Connect instance.
     * </p>
     * <p>
     * It performs content validation if <code>Status</code> is set to <code>SAVED</code> and performs full content
     * validation if <code>Status</code> is <code>PUBLISHED</code>. Note that the <code>$SAVED</code> alias' content
     * will always be updated, but the <code>$LATEST</code> alias' content will only be updated if <code>Status</code>
     * is <code>PUBLISHED</code>.
     * </p>
     * 
     * @param updateViewContentRequest
     * @return Result of the UpdateViewContent operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws TooManyRequestsException
     *         Displayed when rate-related API limits are exceeded.
     * @throws ResourceInUseException
     *         That resource is already in use. Please try another.
     * @sample AmazonConnect.UpdateViewContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateViewContent" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateViewContentResult updateViewContent(UpdateViewContentRequest updateViewContentRequest);

    /**
     * <p>
     * Updates the view metadata. Note that either <code>Name</code> or <code>Description</code> must be provided.
     * </p>
     * 
     * @param updateViewMetadataRequest
     * @return Result of the UpdateViewMetadata operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws TooManyRequestsException
     *         Displayed when rate-related API limits are exceeded.
     * @throws DuplicateResourceException
     *         A resource with the specified name already exists.
     * @throws ResourceInUseException
     *         That resource is already in use. Please try another.
     * @sample AmazonConnect.UpdateViewMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateViewMetadata" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateViewMetadataResult updateViewMetadata(UpdateViewMetadataRequest updateViewMetadataRequest);

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
