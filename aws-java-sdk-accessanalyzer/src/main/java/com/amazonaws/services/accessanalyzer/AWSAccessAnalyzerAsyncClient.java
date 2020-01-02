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
package com.amazonaws.services.accessanalyzer;

import javax.annotation.Generated;

import com.amazonaws.services.accessanalyzer.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Access Analyzer asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * AWS IAM Access Analyzer helps identify potential resource-access risks by enabling you to identify any policies that
 * grant access to an external principal. It does this by using logic-based reasoning to analyze resource-based policies
 * in your AWS environment. An external principal can be another AWS account, a root user, an IAM user or role, a
 * federated user, an AWS service, or an anonymous user. This guide describes the AWS IAM Access Analyzer operations
 * that you can call programmatically. For general information about Access Analyzer, see the <a
 * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/what-is-access-analyzer.html">AWS IAM Access Analyzer section
 * of the IAM User Guide</a>.
 * </p>
 * <p>
 * To start using Access Analyzer, you first need to create an analyzer.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSAccessAnalyzerAsyncClient extends AWSAccessAnalyzerClient implements AWSAccessAnalyzerAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSAccessAnalyzerAsyncClientBuilder asyncBuilder() {
        return AWSAccessAnalyzerAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Access Analyzer using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSAccessAnalyzerAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<CreateAnalyzerResult> createAnalyzerAsync(CreateAnalyzerRequest request) {

        return createAnalyzerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAnalyzerResult> createAnalyzerAsync(final CreateAnalyzerRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAnalyzerRequest, CreateAnalyzerResult> asyncHandler) {
        final CreateAnalyzerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateAnalyzerResult>() {
            @Override
            public CreateAnalyzerResult call() throws Exception {
                CreateAnalyzerResult result = null;

                try {
                    result = executeCreateAnalyzer(finalRequest);
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
    public java.util.concurrent.Future<CreateArchiveRuleResult> createArchiveRuleAsync(CreateArchiveRuleRequest request) {

        return createArchiveRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateArchiveRuleResult> createArchiveRuleAsync(final CreateArchiveRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateArchiveRuleRequest, CreateArchiveRuleResult> asyncHandler) {
        final CreateArchiveRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateArchiveRuleResult>() {
            @Override
            public CreateArchiveRuleResult call() throws Exception {
                CreateArchiveRuleResult result = null;

                try {
                    result = executeCreateArchiveRule(finalRequest);
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
    public java.util.concurrent.Future<DeleteAnalyzerResult> deleteAnalyzerAsync(DeleteAnalyzerRequest request) {

        return deleteAnalyzerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAnalyzerResult> deleteAnalyzerAsync(final DeleteAnalyzerRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAnalyzerRequest, DeleteAnalyzerResult> asyncHandler) {
        final DeleteAnalyzerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAnalyzerResult>() {
            @Override
            public DeleteAnalyzerResult call() throws Exception {
                DeleteAnalyzerResult result = null;

                try {
                    result = executeDeleteAnalyzer(finalRequest);
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
    public java.util.concurrent.Future<DeleteArchiveRuleResult> deleteArchiveRuleAsync(DeleteArchiveRuleRequest request) {

        return deleteArchiveRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteArchiveRuleResult> deleteArchiveRuleAsync(final DeleteArchiveRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteArchiveRuleRequest, DeleteArchiveRuleResult> asyncHandler) {
        final DeleteArchiveRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteArchiveRuleResult>() {
            @Override
            public DeleteArchiveRuleResult call() throws Exception {
                DeleteArchiveRuleResult result = null;

                try {
                    result = executeDeleteArchiveRule(finalRequest);
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
    public java.util.concurrent.Future<GetAnalyzedResourceResult> getAnalyzedResourceAsync(GetAnalyzedResourceRequest request) {

        return getAnalyzedResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAnalyzedResourceResult> getAnalyzedResourceAsync(final GetAnalyzedResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAnalyzedResourceRequest, GetAnalyzedResourceResult> asyncHandler) {
        final GetAnalyzedResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAnalyzedResourceResult>() {
            @Override
            public GetAnalyzedResourceResult call() throws Exception {
                GetAnalyzedResourceResult result = null;

                try {
                    result = executeGetAnalyzedResource(finalRequest);
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
    public java.util.concurrent.Future<GetAnalyzerResult> getAnalyzerAsync(GetAnalyzerRequest request) {

        return getAnalyzerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAnalyzerResult> getAnalyzerAsync(final GetAnalyzerRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAnalyzerRequest, GetAnalyzerResult> asyncHandler) {
        final GetAnalyzerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAnalyzerResult>() {
            @Override
            public GetAnalyzerResult call() throws Exception {
                GetAnalyzerResult result = null;

                try {
                    result = executeGetAnalyzer(finalRequest);
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
    public java.util.concurrent.Future<GetArchiveRuleResult> getArchiveRuleAsync(GetArchiveRuleRequest request) {

        return getArchiveRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetArchiveRuleResult> getArchiveRuleAsync(final GetArchiveRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetArchiveRuleRequest, GetArchiveRuleResult> asyncHandler) {
        final GetArchiveRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetArchiveRuleResult>() {
            @Override
            public GetArchiveRuleResult call() throws Exception {
                GetArchiveRuleResult result = null;

                try {
                    result = executeGetArchiveRule(finalRequest);
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
    public java.util.concurrent.Future<GetFindingResult> getFindingAsync(GetFindingRequest request) {

        return getFindingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetFindingResult> getFindingAsync(final GetFindingRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetFindingRequest, GetFindingResult> asyncHandler) {
        final GetFindingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetFindingResult>() {
            @Override
            public GetFindingResult call() throws Exception {
                GetFindingResult result = null;

                try {
                    result = executeGetFinding(finalRequest);
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
    public java.util.concurrent.Future<ListAnalyzedResourcesResult> listAnalyzedResourcesAsync(ListAnalyzedResourcesRequest request) {

        return listAnalyzedResourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAnalyzedResourcesResult> listAnalyzedResourcesAsync(final ListAnalyzedResourcesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAnalyzedResourcesRequest, ListAnalyzedResourcesResult> asyncHandler) {
        final ListAnalyzedResourcesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAnalyzedResourcesResult>() {
            @Override
            public ListAnalyzedResourcesResult call() throws Exception {
                ListAnalyzedResourcesResult result = null;

                try {
                    result = executeListAnalyzedResources(finalRequest);
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
    public java.util.concurrent.Future<ListAnalyzersResult> listAnalyzersAsync(ListAnalyzersRequest request) {

        return listAnalyzersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAnalyzersResult> listAnalyzersAsync(final ListAnalyzersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAnalyzersRequest, ListAnalyzersResult> asyncHandler) {
        final ListAnalyzersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAnalyzersResult>() {
            @Override
            public ListAnalyzersResult call() throws Exception {
                ListAnalyzersResult result = null;

                try {
                    result = executeListAnalyzers(finalRequest);
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
    public java.util.concurrent.Future<ListArchiveRulesResult> listArchiveRulesAsync(ListArchiveRulesRequest request) {

        return listArchiveRulesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListArchiveRulesResult> listArchiveRulesAsync(final ListArchiveRulesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListArchiveRulesRequest, ListArchiveRulesResult> asyncHandler) {
        final ListArchiveRulesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListArchiveRulesResult>() {
            @Override
            public ListArchiveRulesResult call() throws Exception {
                ListArchiveRulesResult result = null;

                try {
                    result = executeListArchiveRules(finalRequest);
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
    public java.util.concurrent.Future<ListFindingsResult> listFindingsAsync(ListFindingsRequest request) {

        return listFindingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFindingsResult> listFindingsAsync(final ListFindingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListFindingsRequest, ListFindingsResult> asyncHandler) {
        final ListFindingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListFindingsResult>() {
            @Override
            public ListFindingsResult call() throws Exception {
                ListFindingsResult result = null;

                try {
                    result = executeListFindings(finalRequest);
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
    public java.util.concurrent.Future<StartResourceScanResult> startResourceScanAsync(StartResourceScanRequest request) {

        return startResourceScanAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartResourceScanResult> startResourceScanAsync(final StartResourceScanRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartResourceScanRequest, StartResourceScanResult> asyncHandler) {
        final StartResourceScanRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartResourceScanResult>() {
            @Override
            public StartResourceScanResult call() throws Exception {
                StartResourceScanResult result = null;

                try {
                    result = executeStartResourceScan(finalRequest);
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
    public java.util.concurrent.Future<UpdateArchiveRuleResult> updateArchiveRuleAsync(UpdateArchiveRuleRequest request) {

        return updateArchiveRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateArchiveRuleResult> updateArchiveRuleAsync(final UpdateArchiveRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateArchiveRuleRequest, UpdateArchiveRuleResult> asyncHandler) {
        final UpdateArchiveRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateArchiveRuleResult>() {
            @Override
            public UpdateArchiveRuleResult call() throws Exception {
                UpdateArchiveRuleResult result = null;

                try {
                    result = executeUpdateArchiveRule(finalRequest);
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
    public java.util.concurrent.Future<UpdateFindingsResult> updateFindingsAsync(UpdateFindingsRequest request) {

        return updateFindingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateFindingsResult> updateFindingsAsync(final UpdateFindingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateFindingsRequest, UpdateFindingsResult> asyncHandler) {
        final UpdateFindingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateFindingsResult>() {
            @Override
            public UpdateFindingsResult call() throws Exception {
                UpdateFindingsResult result = null;

                try {
                    result = executeUpdateFindings(finalRequest);
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
