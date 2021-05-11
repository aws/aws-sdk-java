/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ssmcontacts;

import javax.annotation.Generated;

import com.amazonaws.services.ssmcontacts.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing SSM Contacts asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p/>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSSSMContactsAsyncClient extends AWSSSMContactsClient implements AWSSSMContactsAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSSSMContactsAsyncClientBuilder asyncBuilder() {
        return AWSSSMContactsAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on SSM Contacts using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSSSMContactsAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on SSM Contacts using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSSSMContactsAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<AcceptPageResult> acceptPageAsync(AcceptPageRequest request) {

        return acceptPageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AcceptPageResult> acceptPageAsync(final AcceptPageRequest request,
            final com.amazonaws.handlers.AsyncHandler<AcceptPageRequest, AcceptPageResult> asyncHandler) {
        final AcceptPageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AcceptPageResult>() {
            @Override
            public AcceptPageResult call() throws Exception {
                AcceptPageResult result = null;

                try {
                    result = executeAcceptPage(finalRequest);
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
    public java.util.concurrent.Future<ActivateContactChannelResult> activateContactChannelAsync(ActivateContactChannelRequest request) {

        return activateContactChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ActivateContactChannelResult> activateContactChannelAsync(final ActivateContactChannelRequest request,
            final com.amazonaws.handlers.AsyncHandler<ActivateContactChannelRequest, ActivateContactChannelResult> asyncHandler) {
        final ActivateContactChannelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ActivateContactChannelResult>() {
            @Override
            public ActivateContactChannelResult call() throws Exception {
                ActivateContactChannelResult result = null;

                try {
                    result = executeActivateContactChannel(finalRequest);
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
    public java.util.concurrent.Future<CreateContactResult> createContactAsync(CreateContactRequest request) {

        return createContactAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateContactResult> createContactAsync(final CreateContactRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateContactRequest, CreateContactResult> asyncHandler) {
        final CreateContactRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateContactResult>() {
            @Override
            public CreateContactResult call() throws Exception {
                CreateContactResult result = null;

                try {
                    result = executeCreateContact(finalRequest);
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
    public java.util.concurrent.Future<CreateContactChannelResult> createContactChannelAsync(CreateContactChannelRequest request) {

        return createContactChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateContactChannelResult> createContactChannelAsync(final CreateContactChannelRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateContactChannelRequest, CreateContactChannelResult> asyncHandler) {
        final CreateContactChannelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateContactChannelResult>() {
            @Override
            public CreateContactChannelResult call() throws Exception {
                CreateContactChannelResult result = null;

                try {
                    result = executeCreateContactChannel(finalRequest);
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
    public java.util.concurrent.Future<DeactivateContactChannelResult> deactivateContactChannelAsync(DeactivateContactChannelRequest request) {

        return deactivateContactChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeactivateContactChannelResult> deactivateContactChannelAsync(final DeactivateContactChannelRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeactivateContactChannelRequest, DeactivateContactChannelResult> asyncHandler) {
        final DeactivateContactChannelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeactivateContactChannelResult>() {
            @Override
            public DeactivateContactChannelResult call() throws Exception {
                DeactivateContactChannelResult result = null;

                try {
                    result = executeDeactivateContactChannel(finalRequest);
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
    public java.util.concurrent.Future<DeleteContactResult> deleteContactAsync(DeleteContactRequest request) {

        return deleteContactAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteContactResult> deleteContactAsync(final DeleteContactRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteContactRequest, DeleteContactResult> asyncHandler) {
        final DeleteContactRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteContactResult>() {
            @Override
            public DeleteContactResult call() throws Exception {
                DeleteContactResult result = null;

                try {
                    result = executeDeleteContact(finalRequest);
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
    public java.util.concurrent.Future<DeleteContactChannelResult> deleteContactChannelAsync(DeleteContactChannelRequest request) {

        return deleteContactChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteContactChannelResult> deleteContactChannelAsync(final DeleteContactChannelRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteContactChannelRequest, DeleteContactChannelResult> asyncHandler) {
        final DeleteContactChannelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteContactChannelResult>() {
            @Override
            public DeleteContactChannelResult call() throws Exception {
                DeleteContactChannelResult result = null;

                try {
                    result = executeDeleteContactChannel(finalRequest);
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
    public java.util.concurrent.Future<DescribeEngagementResult> describeEngagementAsync(DescribeEngagementRequest request) {

        return describeEngagementAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEngagementResult> describeEngagementAsync(final DescribeEngagementRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeEngagementRequest, DescribeEngagementResult> asyncHandler) {
        final DescribeEngagementRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeEngagementResult>() {
            @Override
            public DescribeEngagementResult call() throws Exception {
                DescribeEngagementResult result = null;

                try {
                    result = executeDescribeEngagement(finalRequest);
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
    public java.util.concurrent.Future<DescribePageResult> describePageAsync(DescribePageRequest request) {

        return describePageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribePageResult> describePageAsync(final DescribePageRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribePageRequest, DescribePageResult> asyncHandler) {
        final DescribePageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribePageResult>() {
            @Override
            public DescribePageResult call() throws Exception {
                DescribePageResult result = null;

                try {
                    result = executeDescribePage(finalRequest);
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
    public java.util.concurrent.Future<GetContactResult> getContactAsync(GetContactRequest request) {

        return getContactAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetContactResult> getContactAsync(final GetContactRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetContactRequest, GetContactResult> asyncHandler) {
        final GetContactRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetContactResult>() {
            @Override
            public GetContactResult call() throws Exception {
                GetContactResult result = null;

                try {
                    result = executeGetContact(finalRequest);
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
    public java.util.concurrent.Future<GetContactChannelResult> getContactChannelAsync(GetContactChannelRequest request) {

        return getContactChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetContactChannelResult> getContactChannelAsync(final GetContactChannelRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetContactChannelRequest, GetContactChannelResult> asyncHandler) {
        final GetContactChannelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetContactChannelResult>() {
            @Override
            public GetContactChannelResult call() throws Exception {
                GetContactChannelResult result = null;

                try {
                    result = executeGetContactChannel(finalRequest);
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
    public java.util.concurrent.Future<GetContactPolicyResult> getContactPolicyAsync(GetContactPolicyRequest request) {

        return getContactPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetContactPolicyResult> getContactPolicyAsync(final GetContactPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetContactPolicyRequest, GetContactPolicyResult> asyncHandler) {
        final GetContactPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetContactPolicyResult>() {
            @Override
            public GetContactPolicyResult call() throws Exception {
                GetContactPolicyResult result = null;

                try {
                    result = executeGetContactPolicy(finalRequest);
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
    public java.util.concurrent.Future<ListContactChannelsResult> listContactChannelsAsync(ListContactChannelsRequest request) {

        return listContactChannelsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListContactChannelsResult> listContactChannelsAsync(final ListContactChannelsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListContactChannelsRequest, ListContactChannelsResult> asyncHandler) {
        final ListContactChannelsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListContactChannelsResult>() {
            @Override
            public ListContactChannelsResult call() throws Exception {
                ListContactChannelsResult result = null;

                try {
                    result = executeListContactChannels(finalRequest);
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
    public java.util.concurrent.Future<ListContactsResult> listContactsAsync(ListContactsRequest request) {

        return listContactsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListContactsResult> listContactsAsync(final ListContactsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListContactsRequest, ListContactsResult> asyncHandler) {
        final ListContactsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListContactsResult>() {
            @Override
            public ListContactsResult call() throws Exception {
                ListContactsResult result = null;

                try {
                    result = executeListContacts(finalRequest);
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
    public java.util.concurrent.Future<ListEngagementsResult> listEngagementsAsync(ListEngagementsRequest request) {

        return listEngagementsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEngagementsResult> listEngagementsAsync(final ListEngagementsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListEngagementsRequest, ListEngagementsResult> asyncHandler) {
        final ListEngagementsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListEngagementsResult>() {
            @Override
            public ListEngagementsResult call() throws Exception {
                ListEngagementsResult result = null;

                try {
                    result = executeListEngagements(finalRequest);
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
    public java.util.concurrent.Future<ListPageReceiptsResult> listPageReceiptsAsync(ListPageReceiptsRequest request) {

        return listPageReceiptsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPageReceiptsResult> listPageReceiptsAsync(final ListPageReceiptsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPageReceiptsRequest, ListPageReceiptsResult> asyncHandler) {
        final ListPageReceiptsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPageReceiptsResult>() {
            @Override
            public ListPageReceiptsResult call() throws Exception {
                ListPageReceiptsResult result = null;

                try {
                    result = executeListPageReceipts(finalRequest);
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
    public java.util.concurrent.Future<ListPagesByContactResult> listPagesByContactAsync(ListPagesByContactRequest request) {

        return listPagesByContactAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPagesByContactResult> listPagesByContactAsync(final ListPagesByContactRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPagesByContactRequest, ListPagesByContactResult> asyncHandler) {
        final ListPagesByContactRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPagesByContactResult>() {
            @Override
            public ListPagesByContactResult call() throws Exception {
                ListPagesByContactResult result = null;

                try {
                    result = executeListPagesByContact(finalRequest);
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
    public java.util.concurrent.Future<ListPagesByEngagementResult> listPagesByEngagementAsync(ListPagesByEngagementRequest request) {

        return listPagesByEngagementAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPagesByEngagementResult> listPagesByEngagementAsync(final ListPagesByEngagementRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPagesByEngagementRequest, ListPagesByEngagementResult> asyncHandler) {
        final ListPagesByEngagementRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPagesByEngagementResult>() {
            @Override
            public ListPagesByEngagementResult call() throws Exception {
                ListPagesByEngagementResult result = null;

                try {
                    result = executeListPagesByEngagement(finalRequest);
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
    public java.util.concurrent.Future<PutContactPolicyResult> putContactPolicyAsync(PutContactPolicyRequest request) {

        return putContactPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutContactPolicyResult> putContactPolicyAsync(final PutContactPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutContactPolicyRequest, PutContactPolicyResult> asyncHandler) {
        final PutContactPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutContactPolicyResult>() {
            @Override
            public PutContactPolicyResult call() throws Exception {
                PutContactPolicyResult result = null;

                try {
                    result = executePutContactPolicy(finalRequest);
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
    public java.util.concurrent.Future<SendActivationCodeResult> sendActivationCodeAsync(SendActivationCodeRequest request) {

        return sendActivationCodeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SendActivationCodeResult> sendActivationCodeAsync(final SendActivationCodeRequest request,
            final com.amazonaws.handlers.AsyncHandler<SendActivationCodeRequest, SendActivationCodeResult> asyncHandler) {
        final SendActivationCodeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SendActivationCodeResult>() {
            @Override
            public SendActivationCodeResult call() throws Exception {
                SendActivationCodeResult result = null;

                try {
                    result = executeSendActivationCode(finalRequest);
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
    public java.util.concurrent.Future<StartEngagementResult> startEngagementAsync(StartEngagementRequest request) {

        return startEngagementAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartEngagementResult> startEngagementAsync(final StartEngagementRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartEngagementRequest, StartEngagementResult> asyncHandler) {
        final StartEngagementRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartEngagementResult>() {
            @Override
            public StartEngagementResult call() throws Exception {
                StartEngagementResult result = null;

                try {
                    result = executeStartEngagement(finalRequest);
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
    public java.util.concurrent.Future<StopEngagementResult> stopEngagementAsync(StopEngagementRequest request) {

        return stopEngagementAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopEngagementResult> stopEngagementAsync(final StopEngagementRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopEngagementRequest, StopEngagementResult> asyncHandler) {
        final StopEngagementRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopEngagementResult>() {
            @Override
            public StopEngagementResult call() throws Exception {
                StopEngagementResult result = null;

                try {
                    result = executeStopEngagement(finalRequest);
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
    public java.util.concurrent.Future<UpdateContactResult> updateContactAsync(UpdateContactRequest request) {

        return updateContactAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateContactResult> updateContactAsync(final UpdateContactRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateContactRequest, UpdateContactResult> asyncHandler) {
        final UpdateContactRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateContactResult>() {
            @Override
            public UpdateContactResult call() throws Exception {
                UpdateContactResult result = null;

                try {
                    result = executeUpdateContact(finalRequest);
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
    public java.util.concurrent.Future<UpdateContactChannelResult> updateContactChannelAsync(UpdateContactChannelRequest request) {

        return updateContactChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateContactChannelResult> updateContactChannelAsync(final UpdateContactChannelRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateContactChannelRequest, UpdateContactChannelResult> asyncHandler) {
        final UpdateContactChannelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateContactChannelResult>() {
            @Override
            public UpdateContactChannelResult call() throws Exception {
                UpdateContactChannelResult result = null;

                try {
                    result = executeUpdateContactChannel(finalRequest);
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
