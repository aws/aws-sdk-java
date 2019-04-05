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
package com.amazonaws.services.resourcegroups;

import javax.annotation.Generated;

import com.amazonaws.services.resourcegroups.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Resource Groups asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>AWS Resource Groups</fullname>
 * <p>
 * AWS Resource Groups lets you organize AWS resources such as Amazon EC2 instances, Amazon Relational Database Service
 * databases, and Amazon S3 buckets into groups using criteria that you define as tags. A resource group is a collection
 * of resources that match the resource types specified in a query, and share one or more tags or portions of tags. You
 * can create a group of resources based on their roles in your cloud infrastructure, lifecycle stages, regions,
 * application layers, or virtually any criteria. Resource groups enable you to automate management tasks, such as those
 * in AWS Systems Manager Automation documents, on tag-related resources in AWS Systems Manager. Groups of tagged
 * resources also let you quickly view a custom console in AWS Systems Manager that shows AWS Config compliance and
 * other monitoring data about member resources.
 * </p>
 * <p>
 * To create a resource group, build a resource query, and specify tags that identify the criteria that members of the
 * group have in common. Tags are key-value pairs.
 * </p>
 * <p>
 * For more information about Resource Groups, see the <a
 * href="https://docs.aws.amazon.com/ARG/latest/userguide/welcome.html">AWS Resource Groups User Guide</a>.
 * </p>
 * <p>
 * AWS Resource Groups uses a REST-compliant API that you can use to perform the following types of operations.
 * </p>
 * <ul>
 * <li>
 * <p>
 * Create, Read, Update, and Delete (CRUD) operations on resource groups and resource query entities
 * </p>
 * </li>
 * <li>
 * <p>
 * Applying, editing, and removing tags from resource groups
 * </p>
 * </li>
 * <li>
 * <p>
 * Resolving resource group member ARNs so they can be returned as search results
 * </p>
 * </li>
 * <li>
 * <p>
 * Getting data about resources that are members of a group
 * </p>
 * </li>
 * <li>
 * <p>
 * Searching AWS resources based on a resource query
 * </p>
 * </li>
 * </ul>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSResourceGroupsAsyncClient extends AWSResourceGroupsClient implements AWSResourceGroupsAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSResourceGroupsAsyncClientBuilder asyncBuilder() {
        return AWSResourceGroupsAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Resource Groups using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSResourceGroupsAsyncClient(AwsAsyncClientParams asyncClientParams) {
        super(asyncClientParams);
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
    public java.util.concurrent.Future<CreateGroupResult> createGroupAsync(CreateGroupRequest request) {

        return createGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateGroupResult> createGroupAsync(final CreateGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateGroupRequest, CreateGroupResult> asyncHandler) {
        final CreateGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateGroupResult>() {
            @Override
            public CreateGroupResult call() throws Exception {
                CreateGroupResult result = null;

                try {
                    result = executeCreateGroup(finalRequest);
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
    public java.util.concurrent.Future<DeleteGroupResult> deleteGroupAsync(DeleteGroupRequest request) {

        return deleteGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteGroupResult> deleteGroupAsync(final DeleteGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteGroupRequest, DeleteGroupResult> asyncHandler) {
        final DeleteGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteGroupResult>() {
            @Override
            public DeleteGroupResult call() throws Exception {
                DeleteGroupResult result = null;

                try {
                    result = executeDeleteGroup(finalRequest);
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
    public java.util.concurrent.Future<GetGroupResult> getGroupAsync(GetGroupRequest request) {

        return getGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetGroupResult> getGroupAsync(final GetGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetGroupRequest, GetGroupResult> asyncHandler) {
        final GetGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetGroupResult>() {
            @Override
            public GetGroupResult call() throws Exception {
                GetGroupResult result = null;

                try {
                    result = executeGetGroup(finalRequest);
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
    public java.util.concurrent.Future<GetGroupQueryResult> getGroupQueryAsync(GetGroupQueryRequest request) {

        return getGroupQueryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetGroupQueryResult> getGroupQueryAsync(final GetGroupQueryRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetGroupQueryRequest, GetGroupQueryResult> asyncHandler) {
        final GetGroupQueryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetGroupQueryResult>() {
            @Override
            public GetGroupQueryResult call() throws Exception {
                GetGroupQueryResult result = null;

                try {
                    result = executeGetGroupQuery(finalRequest);
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
    public java.util.concurrent.Future<GetTagsResult> getTagsAsync(GetTagsRequest request) {

        return getTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTagsResult> getTagsAsync(final GetTagsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetTagsRequest, GetTagsResult> asyncHandler) {
        final GetTagsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetTagsResult>() {
            @Override
            public GetTagsResult call() throws Exception {
                GetTagsResult result = null;

                try {
                    result = executeGetTags(finalRequest);
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
    public java.util.concurrent.Future<ListGroupResourcesResult> listGroupResourcesAsync(ListGroupResourcesRequest request) {

        return listGroupResourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListGroupResourcesResult> listGroupResourcesAsync(final ListGroupResourcesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListGroupResourcesRequest, ListGroupResourcesResult> asyncHandler) {
        final ListGroupResourcesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListGroupResourcesResult>() {
            @Override
            public ListGroupResourcesResult call() throws Exception {
                ListGroupResourcesResult result = null;

                try {
                    result = executeListGroupResources(finalRequest);
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
    public java.util.concurrent.Future<ListGroupsResult> listGroupsAsync(ListGroupsRequest request) {

        return listGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListGroupsResult> listGroupsAsync(final ListGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListGroupsRequest, ListGroupsResult> asyncHandler) {
        final ListGroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListGroupsResult>() {
            @Override
            public ListGroupsResult call() throws Exception {
                ListGroupsResult result = null;

                try {
                    result = executeListGroups(finalRequest);
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
    public java.util.concurrent.Future<SearchResourcesResult> searchResourcesAsync(SearchResourcesRequest request) {

        return searchResourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchResourcesResult> searchResourcesAsync(final SearchResourcesRequest request,
            final com.amazonaws.handlers.AsyncHandler<SearchResourcesRequest, SearchResourcesResult> asyncHandler) {
        final SearchResourcesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SearchResourcesResult>() {
            @Override
            public SearchResourcesResult call() throws Exception {
                SearchResourcesResult result = null;

                try {
                    result = executeSearchResources(finalRequest);
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
    public java.util.concurrent.Future<TagResult> tagAsync(TagRequest request) {

        return tagAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TagResult> tagAsync(final TagRequest request,
            final com.amazonaws.handlers.AsyncHandler<TagRequest, TagResult> asyncHandler) {
        final TagRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<TagResult>() {
            @Override
            public TagResult call() throws Exception {
                TagResult result = null;

                try {
                    result = executeTag(finalRequest);
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
    public java.util.concurrent.Future<UntagResult> untagAsync(UntagRequest request) {

        return untagAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagResult> untagAsync(final UntagRequest request,
            final com.amazonaws.handlers.AsyncHandler<UntagRequest, UntagResult> asyncHandler) {
        final UntagRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UntagResult>() {
            @Override
            public UntagResult call() throws Exception {
                UntagResult result = null;

                try {
                    result = executeUntag(finalRequest);
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
    public java.util.concurrent.Future<UpdateGroupResult> updateGroupAsync(UpdateGroupRequest request) {

        return updateGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateGroupResult> updateGroupAsync(final UpdateGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateGroupRequest, UpdateGroupResult> asyncHandler) {
        final UpdateGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateGroupResult>() {
            @Override
            public UpdateGroupResult call() throws Exception {
                UpdateGroupResult result = null;

                try {
                    result = executeUpdateGroup(finalRequest);
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
    public java.util.concurrent.Future<UpdateGroupQueryResult> updateGroupQueryAsync(UpdateGroupQueryRequest request) {

        return updateGroupQueryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateGroupQueryResult> updateGroupQueryAsync(final UpdateGroupQueryRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateGroupQueryRequest, UpdateGroupQueryResult> asyncHandler) {
        final UpdateGroupQueryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateGroupQueryResult>() {
            @Override
            public UpdateGroupQueryResult call() throws Exception {
                UpdateGroupQueryResult result = null;

                try {
                    result = executeUpdateGroupQuery(finalRequest);
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
