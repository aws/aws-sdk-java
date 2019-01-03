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
package com.amazonaws.services.resourcegroupstaggingapi;

import javax.annotation.Generated;

import com.amazonaws.services.resourcegroupstaggingapi.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AWS Resource Groups Tagging API asynchronously. Each asynchronous method will return a Java
 * Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to
 * receive notification when an asynchronous operation completes.
 * <p>
 * <fullname>Resource Groups Tagging API</fullname>
 * <p>
 * This guide describes the API operations for the resource groups tagging.
 * </p>
 * <p>
 * A tag is a label that you assign to an AWS resource. A tag consists of a key and a value, both of which you define.
 * For example, if you have two Amazon EC2 instances, you might assign both a tag key of "Stack." But the value of
 * "Stack" might be "Testing" for one and "Production" for the other.
 * </p>
 * <p>
 * Tagging can help you organize your resources and enables you to simplify resource management, access management and
 * cost allocation. For more information about tagging, see <a
 * href="http://docs.aws.amazon.com/awsconsolehelpdocs/latest/gsg/tag-editor.html">Working with Tag Editor</a> and <a
 * href="http://docs.aws.amazon.com/awsconsolehelpdocs/latest/gsg/resource-groups.html">Working with Resource
 * Groups</a>. For more information about permissions you need to use the resource groups tagging APIs, see <a
 * href="http://docs.aws.amazon.com/awsconsolehelpdocs/latest/gsg/obtaining-permissions-for-resource-groups.html"
 * >Obtaining Permissions for Resource Groups </a> and <a
 * href="http://docs.aws.amazon.com/awsconsolehelpdocs/latest/gsg/obtaining-permissions-for-tagging.html">Obtaining
 * Permissions for Tagging </a>.
 * </p>
 * <p>
 * You can use the resource groups tagging APIs to complete the following tasks:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Tag and untag supported resources located in the specified region for the AWS account
 * </p>
 * </li>
 * <li>
 * <p>
 * Use tag-based filters to search for resources located in the specified region for the AWS account
 * </p>
 * </li>
 * <li>
 * <p>
 * List all existing tag keys in the specified region for the AWS account
 * </p>
 * </li>
 * <li>
 * <p>
 * List all existing values for the specified key in the specified region for the AWS account
 * </p>
 * </li>
 * </ul>
 * <p>
 * Not all resources can have tags. For a lists of resources that you can tag, see <a
 * href="http://docs.aws.amazon.com/awsconsolehelpdocs/latest/gsg/supported-resources.html">Supported Resources</a> in
 * the <i>AWS Resource Groups and Tag Editor User Guide</i>.
 * </p>
 * <p>
 * To make full use of the resource groups tagging APIs, you might need additional IAM permissions, including permission
 * to access the resources of individual services as well as permission to view and apply tags to those resources. For
 * more information, see <a
 * href="http://docs.aws.amazon.com/awsconsolehelpdocs/latest/gsg/obtaining-permissions-for-tagging.html">Obtaining
 * Permissions for Tagging</a> in the <i>AWS Resource Groups and Tag Editor User Guide</i>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSResourceGroupsTaggingAPIAsyncClient extends AWSResourceGroupsTaggingAPIClient implements AWSResourceGroupsTaggingAPIAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSResourceGroupsTaggingAPIAsyncClientBuilder asyncBuilder() {
        return AWSResourceGroupsTaggingAPIAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Resource Groups Tagging API using the
     * specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSResourceGroupsTaggingAPIAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<GetResourcesResult> getResourcesAsync(GetResourcesRequest request) {

        return getResourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetResourcesResult> getResourcesAsync(final GetResourcesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetResourcesRequest, GetResourcesResult> asyncHandler) {
        final GetResourcesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetResourcesResult>() {
            @Override
            public GetResourcesResult call() throws Exception {
                GetResourcesResult result = null;

                try {
                    result = executeGetResources(finalRequest);
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
    public java.util.concurrent.Future<GetTagKeysResult> getTagKeysAsync(GetTagKeysRequest request) {

        return getTagKeysAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTagKeysResult> getTagKeysAsync(final GetTagKeysRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetTagKeysRequest, GetTagKeysResult> asyncHandler) {
        final GetTagKeysRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetTagKeysResult>() {
            @Override
            public GetTagKeysResult call() throws Exception {
                GetTagKeysResult result = null;

                try {
                    result = executeGetTagKeys(finalRequest);
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
    public java.util.concurrent.Future<GetTagValuesResult> getTagValuesAsync(GetTagValuesRequest request) {

        return getTagValuesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTagValuesResult> getTagValuesAsync(final GetTagValuesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetTagValuesRequest, GetTagValuesResult> asyncHandler) {
        final GetTagValuesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetTagValuesResult>() {
            @Override
            public GetTagValuesResult call() throws Exception {
                GetTagValuesResult result = null;

                try {
                    result = executeGetTagValues(finalRequest);
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
    public java.util.concurrent.Future<TagResourcesResult> tagResourcesAsync(TagResourcesRequest request) {

        return tagResourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TagResourcesResult> tagResourcesAsync(final TagResourcesRequest request,
            final com.amazonaws.handlers.AsyncHandler<TagResourcesRequest, TagResourcesResult> asyncHandler) {
        final TagResourcesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<TagResourcesResult>() {
            @Override
            public TagResourcesResult call() throws Exception {
                TagResourcesResult result = null;

                try {
                    result = executeTagResources(finalRequest);
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
    public java.util.concurrent.Future<UntagResourcesResult> untagResourcesAsync(UntagResourcesRequest request) {

        return untagResourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagResourcesResult> untagResourcesAsync(final UntagResourcesRequest request,
            final com.amazonaws.handlers.AsyncHandler<UntagResourcesRequest, UntagResourcesResult> asyncHandler) {
        final UntagResourcesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UntagResourcesResult>() {
            @Override
            public UntagResourcesResult call() throws Exception {
                UntagResourcesResult result = null;

                try {
                    result = executeUntagResources(finalRequest);
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
