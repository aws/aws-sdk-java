/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.services.connect.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Amazon Connect asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Amazon Connect is a cloud-based contact center solution that makes it easy to set up and manage a customer contact
 * center and provide reliable customer engagement at any scale.
 * </p>
 * <p>
 * Amazon Connect provides rich metrics and real-time reporting that allow you to optimize contact routing. You can also
 * resolve customer issues more efficiently by putting customers in touch with the right agents.
 * </p>
 * <p>
 * There are limits to the number of Amazon Connect resources that you can create and limits to the number of requests
 * that you can make per second. For more information, see <a
 * href="https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html">Amazon Connect
 * Service Quotas</a> in the <i>Amazon Connect Administrator Guide</i>.
 * </p>
 * <p>
 * To connect programmatically to an AWS service, you use an endpoint. For a list of Amazon Connect endpoints, see <a
 * href="https://docs.aws.amazon.com/general/latest/gr/connect_region.html">Amazon Connect Endpoints</a>.
 * </p>
 * <note>
 * <p>
 * Working with contact flows? Check out the <a
 * href="https://docs.aws.amazon.com/connect/latest/adminguide/flow-language.html">Amazon Connect Flow language</a>.
 * </p>
 * </note>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonConnectAsyncClient extends AmazonConnectClient implements AmazonConnectAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonConnectAsyncClientBuilder asyncBuilder() {
        return AmazonConnectAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Connect using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonConnectAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Connect using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonConnectAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<AssociateRoutingProfileQueuesResult> associateRoutingProfileQueuesAsync(AssociateRoutingProfileQueuesRequest request) {

        return associateRoutingProfileQueuesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateRoutingProfileQueuesResult> associateRoutingProfileQueuesAsync(
            final AssociateRoutingProfileQueuesRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateRoutingProfileQueuesRequest, AssociateRoutingProfileQueuesResult> asyncHandler) {
        final AssociateRoutingProfileQueuesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateRoutingProfileQueuesResult>() {
            @Override
            public AssociateRoutingProfileQueuesResult call() throws Exception {
                AssociateRoutingProfileQueuesResult result = null;

                try {
                    result = executeAssociateRoutingProfileQueues(finalRequest);
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
    public java.util.concurrent.Future<CreateContactFlowResult> createContactFlowAsync(CreateContactFlowRequest request) {

        return createContactFlowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateContactFlowResult> createContactFlowAsync(final CreateContactFlowRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateContactFlowRequest, CreateContactFlowResult> asyncHandler) {
        final CreateContactFlowRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateContactFlowResult>() {
            @Override
            public CreateContactFlowResult call() throws Exception {
                CreateContactFlowResult result = null;

                try {
                    result = executeCreateContactFlow(finalRequest);
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
    public java.util.concurrent.Future<CreateRoutingProfileResult> createRoutingProfileAsync(CreateRoutingProfileRequest request) {

        return createRoutingProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRoutingProfileResult> createRoutingProfileAsync(final CreateRoutingProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateRoutingProfileRequest, CreateRoutingProfileResult> asyncHandler) {
        final CreateRoutingProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateRoutingProfileResult>() {
            @Override
            public CreateRoutingProfileResult call() throws Exception {
                CreateRoutingProfileResult result = null;

                try {
                    result = executeCreateRoutingProfile(finalRequest);
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
    public java.util.concurrent.Future<CreateUserResult> createUserAsync(CreateUserRequest request) {

        return createUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateUserResult> createUserAsync(final CreateUserRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateUserRequest, CreateUserResult> asyncHandler) {
        final CreateUserRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateUserResult>() {
            @Override
            public CreateUserResult call() throws Exception {
                CreateUserResult result = null;

                try {
                    result = executeCreateUser(finalRequest);
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
    public java.util.concurrent.Future<CreateUserHierarchyGroupResult> createUserHierarchyGroupAsync(CreateUserHierarchyGroupRequest request) {

        return createUserHierarchyGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateUserHierarchyGroupResult> createUserHierarchyGroupAsync(final CreateUserHierarchyGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateUserHierarchyGroupRequest, CreateUserHierarchyGroupResult> asyncHandler) {
        final CreateUserHierarchyGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateUserHierarchyGroupResult>() {
            @Override
            public CreateUserHierarchyGroupResult call() throws Exception {
                CreateUserHierarchyGroupResult result = null;

                try {
                    result = executeCreateUserHierarchyGroup(finalRequest);
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
    public java.util.concurrent.Future<DeleteUserResult> deleteUserAsync(DeleteUserRequest request) {

        return deleteUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteUserResult> deleteUserAsync(final DeleteUserRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteUserRequest, DeleteUserResult> asyncHandler) {
        final DeleteUserRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteUserResult>() {
            @Override
            public DeleteUserResult call() throws Exception {
                DeleteUserResult result = null;

                try {
                    result = executeDeleteUser(finalRequest);
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
    public java.util.concurrent.Future<DeleteUserHierarchyGroupResult> deleteUserHierarchyGroupAsync(DeleteUserHierarchyGroupRequest request) {

        return deleteUserHierarchyGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteUserHierarchyGroupResult> deleteUserHierarchyGroupAsync(final DeleteUserHierarchyGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteUserHierarchyGroupRequest, DeleteUserHierarchyGroupResult> asyncHandler) {
        final DeleteUserHierarchyGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteUserHierarchyGroupResult>() {
            @Override
            public DeleteUserHierarchyGroupResult call() throws Exception {
                DeleteUserHierarchyGroupResult result = null;

                try {
                    result = executeDeleteUserHierarchyGroup(finalRequest);
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
    public java.util.concurrent.Future<DescribeContactFlowResult> describeContactFlowAsync(DescribeContactFlowRequest request) {

        return describeContactFlowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeContactFlowResult> describeContactFlowAsync(final DescribeContactFlowRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeContactFlowRequest, DescribeContactFlowResult> asyncHandler) {
        final DescribeContactFlowRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeContactFlowResult>() {
            @Override
            public DescribeContactFlowResult call() throws Exception {
                DescribeContactFlowResult result = null;

                try {
                    result = executeDescribeContactFlow(finalRequest);
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
    public java.util.concurrent.Future<DescribeRoutingProfileResult> describeRoutingProfileAsync(DescribeRoutingProfileRequest request) {

        return describeRoutingProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRoutingProfileResult> describeRoutingProfileAsync(final DescribeRoutingProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeRoutingProfileRequest, DescribeRoutingProfileResult> asyncHandler) {
        final DescribeRoutingProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeRoutingProfileResult>() {
            @Override
            public DescribeRoutingProfileResult call() throws Exception {
                DescribeRoutingProfileResult result = null;

                try {
                    result = executeDescribeRoutingProfile(finalRequest);
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
    public java.util.concurrent.Future<DescribeUserResult> describeUserAsync(DescribeUserRequest request) {

        return describeUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeUserResult> describeUserAsync(final DescribeUserRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeUserRequest, DescribeUserResult> asyncHandler) {
        final DescribeUserRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeUserResult>() {
            @Override
            public DescribeUserResult call() throws Exception {
                DescribeUserResult result = null;

                try {
                    result = executeDescribeUser(finalRequest);
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
    public java.util.concurrent.Future<DescribeUserHierarchyGroupResult> describeUserHierarchyGroupAsync(DescribeUserHierarchyGroupRequest request) {

        return describeUserHierarchyGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeUserHierarchyGroupResult> describeUserHierarchyGroupAsync(final DescribeUserHierarchyGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeUserHierarchyGroupRequest, DescribeUserHierarchyGroupResult> asyncHandler) {
        final DescribeUserHierarchyGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeUserHierarchyGroupResult>() {
            @Override
            public DescribeUserHierarchyGroupResult call() throws Exception {
                DescribeUserHierarchyGroupResult result = null;

                try {
                    result = executeDescribeUserHierarchyGroup(finalRequest);
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
    public java.util.concurrent.Future<DescribeUserHierarchyStructureResult> describeUserHierarchyStructureAsync(DescribeUserHierarchyStructureRequest request) {

        return describeUserHierarchyStructureAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeUserHierarchyStructureResult> describeUserHierarchyStructureAsync(
            final DescribeUserHierarchyStructureRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeUserHierarchyStructureRequest, DescribeUserHierarchyStructureResult> asyncHandler) {
        final DescribeUserHierarchyStructureRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeUserHierarchyStructureResult>() {
            @Override
            public DescribeUserHierarchyStructureResult call() throws Exception {
                DescribeUserHierarchyStructureResult result = null;

                try {
                    result = executeDescribeUserHierarchyStructure(finalRequest);
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
    public java.util.concurrent.Future<DisassociateRoutingProfileQueuesResult> disassociateRoutingProfileQueuesAsync(
            DisassociateRoutingProfileQueuesRequest request) {

        return disassociateRoutingProfileQueuesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateRoutingProfileQueuesResult> disassociateRoutingProfileQueuesAsync(
            final DisassociateRoutingProfileQueuesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateRoutingProfileQueuesRequest, DisassociateRoutingProfileQueuesResult> asyncHandler) {
        final DisassociateRoutingProfileQueuesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateRoutingProfileQueuesResult>() {
            @Override
            public DisassociateRoutingProfileQueuesResult call() throws Exception {
                DisassociateRoutingProfileQueuesResult result = null;

                try {
                    result = executeDisassociateRoutingProfileQueues(finalRequest);
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
    public java.util.concurrent.Future<GetContactAttributesResult> getContactAttributesAsync(GetContactAttributesRequest request) {

        return getContactAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetContactAttributesResult> getContactAttributesAsync(final GetContactAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetContactAttributesRequest, GetContactAttributesResult> asyncHandler) {
        final GetContactAttributesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetContactAttributesResult>() {
            @Override
            public GetContactAttributesResult call() throws Exception {
                GetContactAttributesResult result = null;

                try {
                    result = executeGetContactAttributes(finalRequest);
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
    public java.util.concurrent.Future<GetCurrentMetricDataResult> getCurrentMetricDataAsync(GetCurrentMetricDataRequest request) {

        return getCurrentMetricDataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCurrentMetricDataResult> getCurrentMetricDataAsync(final GetCurrentMetricDataRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCurrentMetricDataRequest, GetCurrentMetricDataResult> asyncHandler) {
        final GetCurrentMetricDataRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetCurrentMetricDataResult>() {
            @Override
            public GetCurrentMetricDataResult call() throws Exception {
                GetCurrentMetricDataResult result = null;

                try {
                    result = executeGetCurrentMetricData(finalRequest);
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
    public java.util.concurrent.Future<GetFederationTokenResult> getFederationTokenAsync(GetFederationTokenRequest request) {

        return getFederationTokenAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetFederationTokenResult> getFederationTokenAsync(final GetFederationTokenRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetFederationTokenRequest, GetFederationTokenResult> asyncHandler) {
        final GetFederationTokenRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetFederationTokenResult>() {
            @Override
            public GetFederationTokenResult call() throws Exception {
                GetFederationTokenResult result = null;

                try {
                    result = executeGetFederationToken(finalRequest);
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
    public java.util.concurrent.Future<GetMetricDataResult> getMetricDataAsync(GetMetricDataRequest request) {

        return getMetricDataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMetricDataResult> getMetricDataAsync(final GetMetricDataRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetMetricDataRequest, GetMetricDataResult> asyncHandler) {
        final GetMetricDataRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetMetricDataResult>() {
            @Override
            public GetMetricDataResult call() throws Exception {
                GetMetricDataResult result = null;

                try {
                    result = executeGetMetricData(finalRequest);
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
    public java.util.concurrent.Future<ListContactFlowsResult> listContactFlowsAsync(ListContactFlowsRequest request) {

        return listContactFlowsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListContactFlowsResult> listContactFlowsAsync(final ListContactFlowsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListContactFlowsRequest, ListContactFlowsResult> asyncHandler) {
        final ListContactFlowsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListContactFlowsResult>() {
            @Override
            public ListContactFlowsResult call() throws Exception {
                ListContactFlowsResult result = null;

                try {
                    result = executeListContactFlows(finalRequest);
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
    public java.util.concurrent.Future<ListHoursOfOperationsResult> listHoursOfOperationsAsync(ListHoursOfOperationsRequest request) {

        return listHoursOfOperationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListHoursOfOperationsResult> listHoursOfOperationsAsync(final ListHoursOfOperationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListHoursOfOperationsRequest, ListHoursOfOperationsResult> asyncHandler) {
        final ListHoursOfOperationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListHoursOfOperationsResult>() {
            @Override
            public ListHoursOfOperationsResult call() throws Exception {
                ListHoursOfOperationsResult result = null;

                try {
                    result = executeListHoursOfOperations(finalRequest);
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
    public java.util.concurrent.Future<ListPhoneNumbersResult> listPhoneNumbersAsync(ListPhoneNumbersRequest request) {

        return listPhoneNumbersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPhoneNumbersResult> listPhoneNumbersAsync(final ListPhoneNumbersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPhoneNumbersRequest, ListPhoneNumbersResult> asyncHandler) {
        final ListPhoneNumbersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPhoneNumbersResult>() {
            @Override
            public ListPhoneNumbersResult call() throws Exception {
                ListPhoneNumbersResult result = null;

                try {
                    result = executeListPhoneNumbers(finalRequest);
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
    public java.util.concurrent.Future<ListPromptsResult> listPromptsAsync(ListPromptsRequest request) {

        return listPromptsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPromptsResult> listPromptsAsync(final ListPromptsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPromptsRequest, ListPromptsResult> asyncHandler) {
        final ListPromptsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPromptsResult>() {
            @Override
            public ListPromptsResult call() throws Exception {
                ListPromptsResult result = null;

                try {
                    result = executeListPrompts(finalRequest);
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
    public java.util.concurrent.Future<ListQueuesResult> listQueuesAsync(ListQueuesRequest request) {

        return listQueuesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListQueuesResult> listQueuesAsync(final ListQueuesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListQueuesRequest, ListQueuesResult> asyncHandler) {
        final ListQueuesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListQueuesResult>() {
            @Override
            public ListQueuesResult call() throws Exception {
                ListQueuesResult result = null;

                try {
                    result = executeListQueues(finalRequest);
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
    public java.util.concurrent.Future<ListRoutingProfileQueuesResult> listRoutingProfileQueuesAsync(ListRoutingProfileQueuesRequest request) {

        return listRoutingProfileQueuesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRoutingProfileQueuesResult> listRoutingProfileQueuesAsync(final ListRoutingProfileQueuesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRoutingProfileQueuesRequest, ListRoutingProfileQueuesResult> asyncHandler) {
        final ListRoutingProfileQueuesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListRoutingProfileQueuesResult>() {
            @Override
            public ListRoutingProfileQueuesResult call() throws Exception {
                ListRoutingProfileQueuesResult result = null;

                try {
                    result = executeListRoutingProfileQueues(finalRequest);
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
    public java.util.concurrent.Future<ListRoutingProfilesResult> listRoutingProfilesAsync(ListRoutingProfilesRequest request) {

        return listRoutingProfilesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRoutingProfilesResult> listRoutingProfilesAsync(final ListRoutingProfilesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRoutingProfilesRequest, ListRoutingProfilesResult> asyncHandler) {
        final ListRoutingProfilesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListRoutingProfilesResult>() {
            @Override
            public ListRoutingProfilesResult call() throws Exception {
                ListRoutingProfilesResult result = null;

                try {
                    result = executeListRoutingProfiles(finalRequest);
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
    public java.util.concurrent.Future<ListSecurityProfilesResult> listSecurityProfilesAsync(ListSecurityProfilesRequest request) {

        return listSecurityProfilesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSecurityProfilesResult> listSecurityProfilesAsync(final ListSecurityProfilesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSecurityProfilesRequest, ListSecurityProfilesResult> asyncHandler) {
        final ListSecurityProfilesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSecurityProfilesResult>() {
            @Override
            public ListSecurityProfilesResult call() throws Exception {
                ListSecurityProfilesResult result = null;

                try {
                    result = executeListSecurityProfiles(finalRequest);
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
    public java.util.concurrent.Future<ListUserHierarchyGroupsResult> listUserHierarchyGroupsAsync(ListUserHierarchyGroupsRequest request) {

        return listUserHierarchyGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListUserHierarchyGroupsResult> listUserHierarchyGroupsAsync(final ListUserHierarchyGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListUserHierarchyGroupsRequest, ListUserHierarchyGroupsResult> asyncHandler) {
        final ListUserHierarchyGroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListUserHierarchyGroupsResult>() {
            @Override
            public ListUserHierarchyGroupsResult call() throws Exception {
                ListUserHierarchyGroupsResult result = null;

                try {
                    result = executeListUserHierarchyGroups(finalRequest);
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
    public java.util.concurrent.Future<ListUsersResult> listUsersAsync(ListUsersRequest request) {

        return listUsersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListUsersResult> listUsersAsync(final ListUsersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListUsersRequest, ListUsersResult> asyncHandler) {
        final ListUsersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListUsersResult>() {
            @Override
            public ListUsersResult call() throws Exception {
                ListUsersResult result = null;

                try {
                    result = executeListUsers(finalRequest);
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
    public java.util.concurrent.Future<ResumeContactRecordingResult> resumeContactRecordingAsync(ResumeContactRecordingRequest request) {

        return resumeContactRecordingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ResumeContactRecordingResult> resumeContactRecordingAsync(final ResumeContactRecordingRequest request,
            final com.amazonaws.handlers.AsyncHandler<ResumeContactRecordingRequest, ResumeContactRecordingResult> asyncHandler) {
        final ResumeContactRecordingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ResumeContactRecordingResult>() {
            @Override
            public ResumeContactRecordingResult call() throws Exception {
                ResumeContactRecordingResult result = null;

                try {
                    result = executeResumeContactRecording(finalRequest);
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
    public java.util.concurrent.Future<StartChatContactResult> startChatContactAsync(StartChatContactRequest request) {

        return startChatContactAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartChatContactResult> startChatContactAsync(final StartChatContactRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartChatContactRequest, StartChatContactResult> asyncHandler) {
        final StartChatContactRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartChatContactResult>() {
            @Override
            public StartChatContactResult call() throws Exception {
                StartChatContactResult result = null;

                try {
                    result = executeStartChatContact(finalRequest);
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
    public java.util.concurrent.Future<StartContactRecordingResult> startContactRecordingAsync(StartContactRecordingRequest request) {

        return startContactRecordingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartContactRecordingResult> startContactRecordingAsync(final StartContactRecordingRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartContactRecordingRequest, StartContactRecordingResult> asyncHandler) {
        final StartContactRecordingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartContactRecordingResult>() {
            @Override
            public StartContactRecordingResult call() throws Exception {
                StartContactRecordingResult result = null;

                try {
                    result = executeStartContactRecording(finalRequest);
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
    public java.util.concurrent.Future<StartOutboundVoiceContactResult> startOutboundVoiceContactAsync(StartOutboundVoiceContactRequest request) {

        return startOutboundVoiceContactAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartOutboundVoiceContactResult> startOutboundVoiceContactAsync(final StartOutboundVoiceContactRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartOutboundVoiceContactRequest, StartOutboundVoiceContactResult> asyncHandler) {
        final StartOutboundVoiceContactRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartOutboundVoiceContactResult>() {
            @Override
            public StartOutboundVoiceContactResult call() throws Exception {
                StartOutboundVoiceContactResult result = null;

                try {
                    result = executeStartOutboundVoiceContact(finalRequest);
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
    public java.util.concurrent.Future<StopContactResult> stopContactAsync(StopContactRequest request) {

        return stopContactAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopContactResult> stopContactAsync(final StopContactRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopContactRequest, StopContactResult> asyncHandler) {
        final StopContactRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopContactResult>() {
            @Override
            public StopContactResult call() throws Exception {
                StopContactResult result = null;

                try {
                    result = executeStopContact(finalRequest);
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
    public java.util.concurrent.Future<StopContactRecordingResult> stopContactRecordingAsync(StopContactRecordingRequest request) {

        return stopContactRecordingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopContactRecordingResult> stopContactRecordingAsync(final StopContactRecordingRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopContactRecordingRequest, StopContactRecordingResult> asyncHandler) {
        final StopContactRecordingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopContactRecordingResult>() {
            @Override
            public StopContactRecordingResult call() throws Exception {
                StopContactRecordingResult result = null;

                try {
                    result = executeStopContactRecording(finalRequest);
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
    public java.util.concurrent.Future<SuspendContactRecordingResult> suspendContactRecordingAsync(SuspendContactRecordingRequest request) {

        return suspendContactRecordingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SuspendContactRecordingResult> suspendContactRecordingAsync(final SuspendContactRecordingRequest request,
            final com.amazonaws.handlers.AsyncHandler<SuspendContactRecordingRequest, SuspendContactRecordingResult> asyncHandler) {
        final SuspendContactRecordingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SuspendContactRecordingResult>() {
            @Override
            public SuspendContactRecordingResult call() throws Exception {
                SuspendContactRecordingResult result = null;

                try {
                    result = executeSuspendContactRecording(finalRequest);
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
    public java.util.concurrent.Future<UpdateContactAttributesResult> updateContactAttributesAsync(UpdateContactAttributesRequest request) {

        return updateContactAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateContactAttributesResult> updateContactAttributesAsync(final UpdateContactAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateContactAttributesRequest, UpdateContactAttributesResult> asyncHandler) {
        final UpdateContactAttributesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateContactAttributesResult>() {
            @Override
            public UpdateContactAttributesResult call() throws Exception {
                UpdateContactAttributesResult result = null;

                try {
                    result = executeUpdateContactAttributes(finalRequest);
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
    public java.util.concurrent.Future<UpdateContactFlowContentResult> updateContactFlowContentAsync(UpdateContactFlowContentRequest request) {

        return updateContactFlowContentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateContactFlowContentResult> updateContactFlowContentAsync(final UpdateContactFlowContentRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateContactFlowContentRequest, UpdateContactFlowContentResult> asyncHandler) {
        final UpdateContactFlowContentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateContactFlowContentResult>() {
            @Override
            public UpdateContactFlowContentResult call() throws Exception {
                UpdateContactFlowContentResult result = null;

                try {
                    result = executeUpdateContactFlowContent(finalRequest);
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
    public java.util.concurrent.Future<UpdateContactFlowNameResult> updateContactFlowNameAsync(UpdateContactFlowNameRequest request) {

        return updateContactFlowNameAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateContactFlowNameResult> updateContactFlowNameAsync(final UpdateContactFlowNameRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateContactFlowNameRequest, UpdateContactFlowNameResult> asyncHandler) {
        final UpdateContactFlowNameRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateContactFlowNameResult>() {
            @Override
            public UpdateContactFlowNameResult call() throws Exception {
                UpdateContactFlowNameResult result = null;

                try {
                    result = executeUpdateContactFlowName(finalRequest);
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
    public java.util.concurrent.Future<UpdateRoutingProfileConcurrencyResult> updateRoutingProfileConcurrencyAsync(
            UpdateRoutingProfileConcurrencyRequest request) {

        return updateRoutingProfileConcurrencyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRoutingProfileConcurrencyResult> updateRoutingProfileConcurrencyAsync(
            final UpdateRoutingProfileConcurrencyRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateRoutingProfileConcurrencyRequest, UpdateRoutingProfileConcurrencyResult> asyncHandler) {
        final UpdateRoutingProfileConcurrencyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateRoutingProfileConcurrencyResult>() {
            @Override
            public UpdateRoutingProfileConcurrencyResult call() throws Exception {
                UpdateRoutingProfileConcurrencyResult result = null;

                try {
                    result = executeUpdateRoutingProfileConcurrency(finalRequest);
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
    public java.util.concurrent.Future<UpdateRoutingProfileDefaultOutboundQueueResult> updateRoutingProfileDefaultOutboundQueueAsync(
            UpdateRoutingProfileDefaultOutboundQueueRequest request) {

        return updateRoutingProfileDefaultOutboundQueueAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRoutingProfileDefaultOutboundQueueResult> updateRoutingProfileDefaultOutboundQueueAsync(
            final UpdateRoutingProfileDefaultOutboundQueueRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateRoutingProfileDefaultOutboundQueueRequest, UpdateRoutingProfileDefaultOutboundQueueResult> asyncHandler) {
        final UpdateRoutingProfileDefaultOutboundQueueRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateRoutingProfileDefaultOutboundQueueResult>() {
            @Override
            public UpdateRoutingProfileDefaultOutboundQueueResult call() throws Exception {
                UpdateRoutingProfileDefaultOutboundQueueResult result = null;

                try {
                    result = executeUpdateRoutingProfileDefaultOutboundQueue(finalRequest);
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
    public java.util.concurrent.Future<UpdateRoutingProfileNameResult> updateRoutingProfileNameAsync(UpdateRoutingProfileNameRequest request) {

        return updateRoutingProfileNameAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRoutingProfileNameResult> updateRoutingProfileNameAsync(final UpdateRoutingProfileNameRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateRoutingProfileNameRequest, UpdateRoutingProfileNameResult> asyncHandler) {
        final UpdateRoutingProfileNameRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateRoutingProfileNameResult>() {
            @Override
            public UpdateRoutingProfileNameResult call() throws Exception {
                UpdateRoutingProfileNameResult result = null;

                try {
                    result = executeUpdateRoutingProfileName(finalRequest);
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
    public java.util.concurrent.Future<UpdateRoutingProfileQueuesResult> updateRoutingProfileQueuesAsync(UpdateRoutingProfileQueuesRequest request) {

        return updateRoutingProfileQueuesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRoutingProfileQueuesResult> updateRoutingProfileQueuesAsync(final UpdateRoutingProfileQueuesRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateRoutingProfileQueuesRequest, UpdateRoutingProfileQueuesResult> asyncHandler) {
        final UpdateRoutingProfileQueuesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateRoutingProfileQueuesResult>() {
            @Override
            public UpdateRoutingProfileQueuesResult call() throws Exception {
                UpdateRoutingProfileQueuesResult result = null;

                try {
                    result = executeUpdateRoutingProfileQueues(finalRequest);
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
    public java.util.concurrent.Future<UpdateUserHierarchyResult> updateUserHierarchyAsync(UpdateUserHierarchyRequest request) {

        return updateUserHierarchyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateUserHierarchyResult> updateUserHierarchyAsync(final UpdateUserHierarchyRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateUserHierarchyRequest, UpdateUserHierarchyResult> asyncHandler) {
        final UpdateUserHierarchyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateUserHierarchyResult>() {
            @Override
            public UpdateUserHierarchyResult call() throws Exception {
                UpdateUserHierarchyResult result = null;

                try {
                    result = executeUpdateUserHierarchy(finalRequest);
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
    public java.util.concurrent.Future<UpdateUserHierarchyGroupNameResult> updateUserHierarchyGroupNameAsync(UpdateUserHierarchyGroupNameRequest request) {

        return updateUserHierarchyGroupNameAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateUserHierarchyGroupNameResult> updateUserHierarchyGroupNameAsync(final UpdateUserHierarchyGroupNameRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateUserHierarchyGroupNameRequest, UpdateUserHierarchyGroupNameResult> asyncHandler) {
        final UpdateUserHierarchyGroupNameRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateUserHierarchyGroupNameResult>() {
            @Override
            public UpdateUserHierarchyGroupNameResult call() throws Exception {
                UpdateUserHierarchyGroupNameResult result = null;

                try {
                    result = executeUpdateUserHierarchyGroupName(finalRequest);
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
    public java.util.concurrent.Future<UpdateUserHierarchyStructureResult> updateUserHierarchyStructureAsync(UpdateUserHierarchyStructureRequest request) {

        return updateUserHierarchyStructureAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateUserHierarchyStructureResult> updateUserHierarchyStructureAsync(final UpdateUserHierarchyStructureRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateUserHierarchyStructureRequest, UpdateUserHierarchyStructureResult> asyncHandler) {
        final UpdateUserHierarchyStructureRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateUserHierarchyStructureResult>() {
            @Override
            public UpdateUserHierarchyStructureResult call() throws Exception {
                UpdateUserHierarchyStructureResult result = null;

                try {
                    result = executeUpdateUserHierarchyStructure(finalRequest);
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
    public java.util.concurrent.Future<UpdateUserIdentityInfoResult> updateUserIdentityInfoAsync(UpdateUserIdentityInfoRequest request) {

        return updateUserIdentityInfoAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateUserIdentityInfoResult> updateUserIdentityInfoAsync(final UpdateUserIdentityInfoRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateUserIdentityInfoRequest, UpdateUserIdentityInfoResult> asyncHandler) {
        final UpdateUserIdentityInfoRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateUserIdentityInfoResult>() {
            @Override
            public UpdateUserIdentityInfoResult call() throws Exception {
                UpdateUserIdentityInfoResult result = null;

                try {
                    result = executeUpdateUserIdentityInfo(finalRequest);
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
    public java.util.concurrent.Future<UpdateUserPhoneConfigResult> updateUserPhoneConfigAsync(UpdateUserPhoneConfigRequest request) {

        return updateUserPhoneConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateUserPhoneConfigResult> updateUserPhoneConfigAsync(final UpdateUserPhoneConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateUserPhoneConfigRequest, UpdateUserPhoneConfigResult> asyncHandler) {
        final UpdateUserPhoneConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateUserPhoneConfigResult>() {
            @Override
            public UpdateUserPhoneConfigResult call() throws Exception {
                UpdateUserPhoneConfigResult result = null;

                try {
                    result = executeUpdateUserPhoneConfig(finalRequest);
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
    public java.util.concurrent.Future<UpdateUserRoutingProfileResult> updateUserRoutingProfileAsync(UpdateUserRoutingProfileRequest request) {

        return updateUserRoutingProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateUserRoutingProfileResult> updateUserRoutingProfileAsync(final UpdateUserRoutingProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateUserRoutingProfileRequest, UpdateUserRoutingProfileResult> asyncHandler) {
        final UpdateUserRoutingProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateUserRoutingProfileResult>() {
            @Override
            public UpdateUserRoutingProfileResult call() throws Exception {
                UpdateUserRoutingProfileResult result = null;

                try {
                    result = executeUpdateUserRoutingProfile(finalRequest);
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
    public java.util.concurrent.Future<UpdateUserSecurityProfilesResult> updateUserSecurityProfilesAsync(UpdateUserSecurityProfilesRequest request) {

        return updateUserSecurityProfilesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateUserSecurityProfilesResult> updateUserSecurityProfilesAsync(final UpdateUserSecurityProfilesRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateUserSecurityProfilesRequest, UpdateUserSecurityProfilesResult> asyncHandler) {
        final UpdateUserSecurityProfilesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateUserSecurityProfilesResult>() {
            @Override
            public UpdateUserSecurityProfilesResult call() throws Exception {
                UpdateUserSecurityProfilesResult result = null;

                try {
                    result = executeUpdateUserSecurityProfiles(finalRequest);
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
