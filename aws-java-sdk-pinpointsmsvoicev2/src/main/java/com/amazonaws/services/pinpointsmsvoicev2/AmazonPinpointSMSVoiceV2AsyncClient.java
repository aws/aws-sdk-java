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
package com.amazonaws.services.pinpointsmsvoicev2;

import javax.annotation.Generated;

import com.amazonaws.services.pinpointsmsvoicev2.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Amazon Pinpoint SMS Voice V2 asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Welcome to the <i>Amazon Pinpoint SMS and Voice, version 2 API Reference</i>. This guide provides information about
 * Amazon Pinpoint SMS and Voice, version 2 API resources, including supported HTTP methods, parameters, and schemas.
 * </p>
 * <p>
 * Amazon Pinpoint is an Amazon Web Services service that you can use to engage with your recipients across multiple
 * messaging channels. The Amazon Pinpoint SMS and Voice, version 2 API provides programmatic access to options that are
 * unique to the SMS and voice channels and supplements the resources provided by the Amazon Pinpoint API.
 * </p>
 * <p>
 * If you're new to Amazon Pinpoint, it's also helpful to review the <a
 * href="https://docs.aws.amazon.com/pinpoint/latest/developerguide/welcome.html"> Amazon Pinpoint Developer Guide</a>.
 * The <i>Amazon Pinpoint Developer Guide</i> provides tutorials, code samples, and procedures that demonstrate how to
 * use Amazon Pinpoint features programmatically and how to integrate Amazon Pinpoint functionality into mobile apps and
 * other types of applications. The guide also provides key information, such as Amazon Pinpoint integration with other
 * Amazon Web Services services, and the quotas that apply to use of the service.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonPinpointSMSVoiceV2AsyncClient extends AmazonPinpointSMSVoiceV2Client implements AmazonPinpointSMSVoiceV2Async {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonPinpointSMSVoiceV2AsyncClientBuilder asyncBuilder() {
        return AmazonPinpointSMSVoiceV2AsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Pinpoint SMS Voice V2 using the
     * specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonPinpointSMSVoiceV2AsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Pinpoint SMS Voice V2 using the
     * specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonPinpointSMSVoiceV2AsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
        super(asyncClientParams, endpointDiscoveryEnabled);
        this.executorService = asyncClientParams.getExecutor();
    }

    /**
     * Returns the executor service used by this client to execute async requests.
     *
     * @return The executor service used by this client to execute async requests.
     */
    public ExecutorService getExecutorService() {
        return executorService;
    }

    @Override
    public java.util.concurrent.Future<AssociateOriginationIdentityResult> associateOriginationIdentityAsync(AssociateOriginationIdentityRequest request) {

        return associateOriginationIdentityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateOriginationIdentityResult> associateOriginationIdentityAsync(final AssociateOriginationIdentityRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateOriginationIdentityRequest, AssociateOriginationIdentityResult> asyncHandler) {
        final AssociateOriginationIdentityRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateOriginationIdentityResult>() {
            @Override
            public AssociateOriginationIdentityResult call() throws Exception {
                AssociateOriginationIdentityResult result = null;

                try {
                    result = executeAssociateOriginationIdentity(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateConfigurationSetResult> createConfigurationSetAsync(CreateConfigurationSetRequest request) {

        return createConfigurationSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateConfigurationSetResult> createConfigurationSetAsync(final CreateConfigurationSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateConfigurationSetRequest, CreateConfigurationSetResult> asyncHandler) {
        final CreateConfigurationSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateConfigurationSetResult>() {
            @Override
            public CreateConfigurationSetResult call() throws Exception {
                CreateConfigurationSetResult result = null;

                try {
                    result = executeCreateConfigurationSet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateEventDestinationResult> createEventDestinationAsync(CreateEventDestinationRequest request) {

        return createEventDestinationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateEventDestinationResult> createEventDestinationAsync(final CreateEventDestinationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateEventDestinationRequest, CreateEventDestinationResult> asyncHandler) {
        final CreateEventDestinationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateEventDestinationResult>() {
            @Override
            public CreateEventDestinationResult call() throws Exception {
                CreateEventDestinationResult result = null;

                try {
                    result = executeCreateEventDestination(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateOptOutListResult> createOptOutListAsync(CreateOptOutListRequest request) {

        return createOptOutListAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateOptOutListResult> createOptOutListAsync(final CreateOptOutListRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateOptOutListRequest, CreateOptOutListResult> asyncHandler) {
        final CreateOptOutListRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateOptOutListResult>() {
            @Override
            public CreateOptOutListResult call() throws Exception {
                CreateOptOutListResult result = null;

                try {
                    result = executeCreateOptOutList(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreatePoolResult> createPoolAsync(CreatePoolRequest request) {

        return createPoolAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePoolResult> createPoolAsync(final CreatePoolRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreatePoolRequest, CreatePoolResult> asyncHandler) {
        final CreatePoolRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreatePoolResult>() {
            @Override
            public CreatePoolResult call() throws Exception {
                CreatePoolResult result = null;

                try {
                    result = executeCreatePool(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteConfigurationSetResult> deleteConfigurationSetAsync(DeleteConfigurationSetRequest request) {

        return deleteConfigurationSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteConfigurationSetResult> deleteConfigurationSetAsync(final DeleteConfigurationSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteConfigurationSetRequest, DeleteConfigurationSetResult> asyncHandler) {
        final DeleteConfigurationSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteConfigurationSetResult>() {
            @Override
            public DeleteConfigurationSetResult call() throws Exception {
                DeleteConfigurationSetResult result = null;

                try {
                    result = executeDeleteConfigurationSet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteDefaultMessageTypeResult> deleteDefaultMessageTypeAsync(DeleteDefaultMessageTypeRequest request) {

        return deleteDefaultMessageTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDefaultMessageTypeResult> deleteDefaultMessageTypeAsync(final DeleteDefaultMessageTypeRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDefaultMessageTypeRequest, DeleteDefaultMessageTypeResult> asyncHandler) {
        final DeleteDefaultMessageTypeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDefaultMessageTypeResult>() {
            @Override
            public DeleteDefaultMessageTypeResult call() throws Exception {
                DeleteDefaultMessageTypeResult result = null;

                try {
                    result = executeDeleteDefaultMessageType(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteDefaultSenderIdResult> deleteDefaultSenderIdAsync(DeleteDefaultSenderIdRequest request) {

        return deleteDefaultSenderIdAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDefaultSenderIdResult> deleteDefaultSenderIdAsync(final DeleteDefaultSenderIdRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDefaultSenderIdRequest, DeleteDefaultSenderIdResult> asyncHandler) {
        final DeleteDefaultSenderIdRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDefaultSenderIdResult>() {
            @Override
            public DeleteDefaultSenderIdResult call() throws Exception {
                DeleteDefaultSenderIdResult result = null;

                try {
                    result = executeDeleteDefaultSenderId(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteEventDestinationResult> deleteEventDestinationAsync(DeleteEventDestinationRequest request) {

        return deleteEventDestinationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteEventDestinationResult> deleteEventDestinationAsync(final DeleteEventDestinationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteEventDestinationRequest, DeleteEventDestinationResult> asyncHandler) {
        final DeleteEventDestinationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteEventDestinationResult>() {
            @Override
            public DeleteEventDestinationResult call() throws Exception {
                DeleteEventDestinationResult result = null;

                try {
                    result = executeDeleteEventDestination(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteKeywordResult> deleteKeywordAsync(DeleteKeywordRequest request) {

        return deleteKeywordAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteKeywordResult> deleteKeywordAsync(final DeleteKeywordRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteKeywordRequest, DeleteKeywordResult> asyncHandler) {
        final DeleteKeywordRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteKeywordResult>() {
            @Override
            public DeleteKeywordResult call() throws Exception {
                DeleteKeywordResult result = null;

                try {
                    result = executeDeleteKeyword(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteOptOutListResult> deleteOptOutListAsync(DeleteOptOutListRequest request) {

        return deleteOptOutListAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteOptOutListResult> deleteOptOutListAsync(final DeleteOptOutListRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteOptOutListRequest, DeleteOptOutListResult> asyncHandler) {
        final DeleteOptOutListRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteOptOutListResult>() {
            @Override
            public DeleteOptOutListResult call() throws Exception {
                DeleteOptOutListResult result = null;

                try {
                    result = executeDeleteOptOutList(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteOptedOutNumberResult> deleteOptedOutNumberAsync(DeleteOptedOutNumberRequest request) {

        return deleteOptedOutNumberAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteOptedOutNumberResult> deleteOptedOutNumberAsync(final DeleteOptedOutNumberRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteOptedOutNumberRequest, DeleteOptedOutNumberResult> asyncHandler) {
        final DeleteOptedOutNumberRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteOptedOutNumberResult>() {
            @Override
            public DeleteOptedOutNumberResult call() throws Exception {
                DeleteOptedOutNumberResult result = null;

                try {
                    result = executeDeleteOptedOutNumber(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeletePoolResult> deletePoolAsync(DeletePoolRequest request) {

        return deletePoolAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePoolResult> deletePoolAsync(final DeletePoolRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeletePoolRequest, DeletePoolResult> asyncHandler) {
        final DeletePoolRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeletePoolResult>() {
            @Override
            public DeletePoolResult call() throws Exception {
                DeletePoolResult result = null;

                try {
                    result = executeDeletePool(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteTextMessageSpendLimitOverrideResult> deleteTextMessageSpendLimitOverrideAsync(
            DeleteTextMessageSpendLimitOverrideRequest request) {

        return deleteTextMessageSpendLimitOverrideAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTextMessageSpendLimitOverrideResult> deleteTextMessageSpendLimitOverrideAsync(
            final DeleteTextMessageSpendLimitOverrideRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteTextMessageSpendLimitOverrideRequest, DeleteTextMessageSpendLimitOverrideResult> asyncHandler) {
        final DeleteTextMessageSpendLimitOverrideRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteTextMessageSpendLimitOverrideResult>() {
            @Override
            public DeleteTextMessageSpendLimitOverrideResult call() throws Exception {
                DeleteTextMessageSpendLimitOverrideResult result = null;

                try {
                    result = executeDeleteTextMessageSpendLimitOverride(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteVoiceMessageSpendLimitOverrideResult> deleteVoiceMessageSpendLimitOverrideAsync(
            DeleteVoiceMessageSpendLimitOverrideRequest request) {

        return deleteVoiceMessageSpendLimitOverrideAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteVoiceMessageSpendLimitOverrideResult> deleteVoiceMessageSpendLimitOverrideAsync(
            final DeleteVoiceMessageSpendLimitOverrideRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteVoiceMessageSpendLimitOverrideRequest, DeleteVoiceMessageSpendLimitOverrideResult> asyncHandler) {
        final DeleteVoiceMessageSpendLimitOverrideRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteVoiceMessageSpendLimitOverrideResult>() {
            @Override
            public DeleteVoiceMessageSpendLimitOverrideResult call() throws Exception {
                DeleteVoiceMessageSpendLimitOverrideResult result = null;

                try {
                    result = executeDeleteVoiceMessageSpendLimitOverride(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeAccountAttributesResult> describeAccountAttributesAsync(DescribeAccountAttributesRequest request) {

        return describeAccountAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAccountAttributesResult> describeAccountAttributesAsync(final DescribeAccountAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAccountAttributesRequest, DescribeAccountAttributesResult> asyncHandler) {
        final DescribeAccountAttributesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeAccountAttributesResult>() {
            @Override
            public DescribeAccountAttributesResult call() throws Exception {
                DescribeAccountAttributesResult result = null;

                try {
                    result = executeDescribeAccountAttributes(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeAccountLimitsResult> describeAccountLimitsAsync(DescribeAccountLimitsRequest request) {

        return describeAccountLimitsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAccountLimitsResult> describeAccountLimitsAsync(final DescribeAccountLimitsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAccountLimitsRequest, DescribeAccountLimitsResult> asyncHandler) {
        final DescribeAccountLimitsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeAccountLimitsResult>() {
            @Override
            public DescribeAccountLimitsResult call() throws Exception {
                DescribeAccountLimitsResult result = null;

                try {
                    result = executeDescribeAccountLimits(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeConfigurationSetsResult> describeConfigurationSetsAsync(DescribeConfigurationSetsRequest request) {

        return describeConfigurationSetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeConfigurationSetsResult> describeConfigurationSetsAsync(final DescribeConfigurationSetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeConfigurationSetsRequest, DescribeConfigurationSetsResult> asyncHandler) {
        final DescribeConfigurationSetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeConfigurationSetsResult>() {
            @Override
            public DescribeConfigurationSetsResult call() throws Exception {
                DescribeConfigurationSetsResult result = null;

                try {
                    result = executeDescribeConfigurationSets(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeKeywordsResult> describeKeywordsAsync(DescribeKeywordsRequest request) {

        return describeKeywordsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeKeywordsResult> describeKeywordsAsync(final DescribeKeywordsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeKeywordsRequest, DescribeKeywordsResult> asyncHandler) {
        final DescribeKeywordsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeKeywordsResult>() {
            @Override
            public DescribeKeywordsResult call() throws Exception {
                DescribeKeywordsResult result = null;

                try {
                    result = executeDescribeKeywords(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeOptOutListsResult> describeOptOutListsAsync(DescribeOptOutListsRequest request) {

        return describeOptOutListsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeOptOutListsResult> describeOptOutListsAsync(final DescribeOptOutListsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeOptOutListsRequest, DescribeOptOutListsResult> asyncHandler) {
        final DescribeOptOutListsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeOptOutListsResult>() {
            @Override
            public DescribeOptOutListsResult call() throws Exception {
                DescribeOptOutListsResult result = null;

                try {
                    result = executeDescribeOptOutLists(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeOptedOutNumbersResult> describeOptedOutNumbersAsync(DescribeOptedOutNumbersRequest request) {

        return describeOptedOutNumbersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeOptedOutNumbersResult> describeOptedOutNumbersAsync(final DescribeOptedOutNumbersRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeOptedOutNumbersRequest, DescribeOptedOutNumbersResult> asyncHandler) {
        final DescribeOptedOutNumbersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeOptedOutNumbersResult>() {
            @Override
            public DescribeOptedOutNumbersResult call() throws Exception {
                DescribeOptedOutNumbersResult result = null;

                try {
                    result = executeDescribeOptedOutNumbers(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribePhoneNumbersResult> describePhoneNumbersAsync(DescribePhoneNumbersRequest request) {

        return describePhoneNumbersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribePhoneNumbersResult> describePhoneNumbersAsync(final DescribePhoneNumbersRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribePhoneNumbersRequest, DescribePhoneNumbersResult> asyncHandler) {
        final DescribePhoneNumbersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribePhoneNumbersResult>() {
            @Override
            public DescribePhoneNumbersResult call() throws Exception {
                DescribePhoneNumbersResult result = null;

                try {
                    result = executeDescribePhoneNumbers(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribePoolsResult> describePoolsAsync(DescribePoolsRequest request) {

        return describePoolsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribePoolsResult> describePoolsAsync(final DescribePoolsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribePoolsRequest, DescribePoolsResult> asyncHandler) {
        final DescribePoolsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribePoolsResult>() {
            @Override
            public DescribePoolsResult call() throws Exception {
                DescribePoolsResult result = null;

                try {
                    result = executeDescribePools(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeSenderIdsResult> describeSenderIdsAsync(DescribeSenderIdsRequest request) {

        return describeSenderIdsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSenderIdsResult> describeSenderIdsAsync(final DescribeSenderIdsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeSenderIdsRequest, DescribeSenderIdsResult> asyncHandler) {
        final DescribeSenderIdsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeSenderIdsResult>() {
            @Override
            public DescribeSenderIdsResult call() throws Exception {
                DescribeSenderIdsResult result = null;

                try {
                    result = executeDescribeSenderIds(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeSpendLimitsResult> describeSpendLimitsAsync(DescribeSpendLimitsRequest request) {

        return describeSpendLimitsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSpendLimitsResult> describeSpendLimitsAsync(final DescribeSpendLimitsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeSpendLimitsRequest, DescribeSpendLimitsResult> asyncHandler) {
        final DescribeSpendLimitsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeSpendLimitsResult>() {
            @Override
            public DescribeSpendLimitsResult call() throws Exception {
                DescribeSpendLimitsResult result = null;

                try {
                    result = executeDescribeSpendLimits(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DisassociateOriginationIdentityResult> disassociateOriginationIdentityAsync(
            DisassociateOriginationIdentityRequest request) {

        return disassociateOriginationIdentityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateOriginationIdentityResult> disassociateOriginationIdentityAsync(
            final DisassociateOriginationIdentityRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateOriginationIdentityRequest, DisassociateOriginationIdentityResult> asyncHandler) {
        final DisassociateOriginationIdentityRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateOriginationIdentityResult>() {
            @Override
            public DisassociateOriginationIdentityResult call() throws Exception {
                DisassociateOriginationIdentityResult result = null;

                try {
                    result = executeDisassociateOriginationIdentity(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListPoolOriginationIdentitiesResult> listPoolOriginationIdentitiesAsync(ListPoolOriginationIdentitiesRequest request) {

        return listPoolOriginationIdentitiesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPoolOriginationIdentitiesResult> listPoolOriginationIdentitiesAsync(
            final ListPoolOriginationIdentitiesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPoolOriginationIdentitiesRequest, ListPoolOriginationIdentitiesResult> asyncHandler) {
        final ListPoolOriginationIdentitiesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPoolOriginationIdentitiesResult>() {
            @Override
            public ListPoolOriginationIdentitiesResult call() throws Exception {
                ListPoolOriginationIdentitiesResult result = null;

                try {
                    result = executeListPoolOriginationIdentities(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request) {

        return listTagsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(final ListTagsForResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler) {
        final ListTagsForResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTagsForResourceResult>() {
            @Override
            public ListTagsForResourceResult call() throws Exception {
                ListTagsForResourceResult result = null;

                try {
                    result = executeListTagsForResource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutKeywordResult> putKeywordAsync(PutKeywordRequest request) {

        return putKeywordAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutKeywordResult> putKeywordAsync(final PutKeywordRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutKeywordRequest, PutKeywordResult> asyncHandler) {
        final PutKeywordRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutKeywordResult>() {
            @Override
            public PutKeywordResult call() throws Exception {
                PutKeywordResult result = null;

                try {
                    result = executePutKeyword(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutOptedOutNumberResult> putOptedOutNumberAsync(PutOptedOutNumberRequest request) {

        return putOptedOutNumberAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutOptedOutNumberResult> putOptedOutNumberAsync(final PutOptedOutNumberRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutOptedOutNumberRequest, PutOptedOutNumberResult> asyncHandler) {
        final PutOptedOutNumberRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutOptedOutNumberResult>() {
            @Override
            public PutOptedOutNumberResult call() throws Exception {
                PutOptedOutNumberResult result = null;

                try {
                    result = executePutOptedOutNumber(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ReleasePhoneNumberResult> releasePhoneNumberAsync(ReleasePhoneNumberRequest request) {

        return releasePhoneNumberAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ReleasePhoneNumberResult> releasePhoneNumberAsync(final ReleasePhoneNumberRequest request,
            final com.amazonaws.handlers.AsyncHandler<ReleasePhoneNumberRequest, ReleasePhoneNumberResult> asyncHandler) {
        final ReleasePhoneNumberRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ReleasePhoneNumberResult>() {
            @Override
            public ReleasePhoneNumberResult call() throws Exception {
                ReleasePhoneNumberResult result = null;

                try {
                    result = executeReleasePhoneNumber(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<RequestPhoneNumberResult> requestPhoneNumberAsync(RequestPhoneNumberRequest request) {

        return requestPhoneNumberAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RequestPhoneNumberResult> requestPhoneNumberAsync(final RequestPhoneNumberRequest request,
            final com.amazonaws.handlers.AsyncHandler<RequestPhoneNumberRequest, RequestPhoneNumberResult> asyncHandler) {
        final RequestPhoneNumberRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RequestPhoneNumberResult>() {
            @Override
            public RequestPhoneNumberResult call() throws Exception {
                RequestPhoneNumberResult result = null;

                try {
                    result = executeRequestPhoneNumber(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SendTextMessageResult> sendTextMessageAsync(SendTextMessageRequest request) {

        return sendTextMessageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SendTextMessageResult> sendTextMessageAsync(final SendTextMessageRequest request,
            final com.amazonaws.handlers.AsyncHandler<SendTextMessageRequest, SendTextMessageResult> asyncHandler) {
        final SendTextMessageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SendTextMessageResult>() {
            @Override
            public SendTextMessageResult call() throws Exception {
                SendTextMessageResult result = null;

                try {
                    result = executeSendTextMessage(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SendVoiceMessageResult> sendVoiceMessageAsync(SendVoiceMessageRequest request) {

        return sendVoiceMessageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SendVoiceMessageResult> sendVoiceMessageAsync(final SendVoiceMessageRequest request,
            final com.amazonaws.handlers.AsyncHandler<SendVoiceMessageRequest, SendVoiceMessageResult> asyncHandler) {
        final SendVoiceMessageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SendVoiceMessageResult>() {
            @Override
            public SendVoiceMessageResult call() throws Exception {
                SendVoiceMessageResult result = null;

                try {
                    result = executeSendVoiceMessage(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SetDefaultMessageTypeResult> setDefaultMessageTypeAsync(SetDefaultMessageTypeRequest request) {

        return setDefaultMessageTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetDefaultMessageTypeResult> setDefaultMessageTypeAsync(final SetDefaultMessageTypeRequest request,
            final com.amazonaws.handlers.AsyncHandler<SetDefaultMessageTypeRequest, SetDefaultMessageTypeResult> asyncHandler) {
        final SetDefaultMessageTypeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SetDefaultMessageTypeResult>() {
            @Override
            public SetDefaultMessageTypeResult call() throws Exception {
                SetDefaultMessageTypeResult result = null;

                try {
                    result = executeSetDefaultMessageType(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SetDefaultSenderIdResult> setDefaultSenderIdAsync(SetDefaultSenderIdRequest request) {

        return setDefaultSenderIdAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetDefaultSenderIdResult> setDefaultSenderIdAsync(final SetDefaultSenderIdRequest request,
            final com.amazonaws.handlers.AsyncHandler<SetDefaultSenderIdRequest, SetDefaultSenderIdResult> asyncHandler) {
        final SetDefaultSenderIdRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SetDefaultSenderIdResult>() {
            @Override
            public SetDefaultSenderIdResult call() throws Exception {
                SetDefaultSenderIdResult result = null;

                try {
                    result = executeSetDefaultSenderId(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SetTextMessageSpendLimitOverrideResult> setTextMessageSpendLimitOverrideAsync(
            SetTextMessageSpendLimitOverrideRequest request) {

        return setTextMessageSpendLimitOverrideAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetTextMessageSpendLimitOverrideResult> setTextMessageSpendLimitOverrideAsync(
            final SetTextMessageSpendLimitOverrideRequest request,
            final com.amazonaws.handlers.AsyncHandler<SetTextMessageSpendLimitOverrideRequest, SetTextMessageSpendLimitOverrideResult> asyncHandler) {
        final SetTextMessageSpendLimitOverrideRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SetTextMessageSpendLimitOverrideResult>() {
            @Override
            public SetTextMessageSpendLimitOverrideResult call() throws Exception {
                SetTextMessageSpendLimitOverrideResult result = null;

                try {
                    result = executeSetTextMessageSpendLimitOverride(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SetVoiceMessageSpendLimitOverrideResult> setVoiceMessageSpendLimitOverrideAsync(
            SetVoiceMessageSpendLimitOverrideRequest request) {

        return setVoiceMessageSpendLimitOverrideAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetVoiceMessageSpendLimitOverrideResult> setVoiceMessageSpendLimitOverrideAsync(
            final SetVoiceMessageSpendLimitOverrideRequest request,
            final com.amazonaws.handlers.AsyncHandler<SetVoiceMessageSpendLimitOverrideRequest, SetVoiceMessageSpendLimitOverrideResult> asyncHandler) {
        final SetVoiceMessageSpendLimitOverrideRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SetVoiceMessageSpendLimitOverrideResult>() {
            @Override
            public SetVoiceMessageSpendLimitOverrideResult call() throws Exception {
                SetVoiceMessageSpendLimitOverrideResult result = null;

                try {
                    result = executeSetVoiceMessageSpendLimitOverride(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request) {

        return tagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(final TagResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler) {
        final TagResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<TagResourceResult>() {
            @Override
            public TagResourceResult call() throws Exception {
                TagResourceResult result = null;

                try {
                    result = executeTagResource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request) {

        return untagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(final UntagResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler) {
        final UntagResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UntagResourceResult>() {
            @Override
            public UntagResourceResult call() throws Exception {
                UntagResourceResult result = null;

                try {
                    result = executeUntagResource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateEventDestinationResult> updateEventDestinationAsync(UpdateEventDestinationRequest request) {

        return updateEventDestinationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateEventDestinationResult> updateEventDestinationAsync(final UpdateEventDestinationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateEventDestinationRequest, UpdateEventDestinationResult> asyncHandler) {
        final UpdateEventDestinationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateEventDestinationResult>() {
            @Override
            public UpdateEventDestinationResult call() throws Exception {
                UpdateEventDestinationResult result = null;

                try {
                    result = executeUpdateEventDestination(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdatePhoneNumberResult> updatePhoneNumberAsync(UpdatePhoneNumberRequest request) {

        return updatePhoneNumberAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdatePhoneNumberResult> updatePhoneNumberAsync(final UpdatePhoneNumberRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdatePhoneNumberRequest, UpdatePhoneNumberResult> asyncHandler) {
        final UpdatePhoneNumberRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdatePhoneNumberResult>() {
            @Override
            public UpdatePhoneNumberResult call() throws Exception {
                UpdatePhoneNumberResult result = null;

                try {
                    result = executeUpdatePhoneNumber(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdatePoolResult> updatePoolAsync(UpdatePoolRequest request) {

        return updatePoolAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdatePoolResult> updatePoolAsync(final UpdatePoolRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdatePoolRequest, UpdatePoolResult> asyncHandler) {
        final UpdatePoolRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdatePoolResult>() {
            @Override
            public UpdatePoolResult call() throws Exception {
                UpdatePoolResult result = null;

                try {
                    result = executeUpdatePool(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    /**
     * Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
     * asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
     * call {@code getExecutorService().shutdown()} followed by {@code getExecutorService().awaitTermination()} prior to
     * calling this method.
     */
    @Override
    public void shutdown() {
        super.shutdown();
        executorService.shutdownNow();
    }
}
