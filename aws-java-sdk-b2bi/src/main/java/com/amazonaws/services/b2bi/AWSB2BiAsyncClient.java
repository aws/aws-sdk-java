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
package com.amazonaws.services.b2bi;

import javax.annotation.Generated;

import com.amazonaws.services.b2bi.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AWS B2BI asynchronously. Each asynchronous method will return a Java Future object representing
 * the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive notification when
 * an asynchronous operation completes.
 * <p>
 * <p>
 * This is the <i>Amazon Web Services B2B Data Interchange API Reference</i>. It provides descriptions, API request
 * parameters, and the XML response for each of the B2BI API actions.
 * </p>
 * <p>
 * B2BI enables automated exchange of EDI (electronic data interchange) based business-critical transactions at cloud
 * scale, with elasticity and pay-as-you-go pricing. Businesses use EDI documents to exchange transactional data with
 * trading partners, such as suppliers and end customers, using standardized formats such as X12.
 * </p>
 * <note>
 * <p>
 * Rather than actually running a command, you can use the <code>--generate-cli-skeleton</code> parameter with any API
 * call to generate and display a parameter template. You can then use the generated template to customize and use as
 * input on a later command. For details, see <a
 * href="https://docs.aws.amazon.com/cli/latest/userguide/cli-usage-skeleton.html#cli-usage-skeleton-generate">Generate
 * and use a parameter skeleton file</a>.
 * </p>
 * </note>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSB2BiAsyncClient extends AWSB2BiClient implements AWSB2BiAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSB2BiAsyncClientBuilder asyncBuilder() {
        return AWSB2BiAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS B2BI using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSB2BiAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS B2BI using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSB2BiAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<CreateCapabilityResult> createCapabilityAsync(CreateCapabilityRequest request) {

        return createCapabilityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateCapabilityResult> createCapabilityAsync(final CreateCapabilityRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateCapabilityRequest, CreateCapabilityResult> asyncHandler) {
        final CreateCapabilityRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateCapabilityResult>() {
            @Override
            public CreateCapabilityResult call() throws Exception {
                CreateCapabilityResult result = null;

                try {
                    result = executeCreateCapability(finalRequest);
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
    public java.util.concurrent.Future<CreatePartnershipResult> createPartnershipAsync(CreatePartnershipRequest request) {

        return createPartnershipAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePartnershipResult> createPartnershipAsync(final CreatePartnershipRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreatePartnershipRequest, CreatePartnershipResult> asyncHandler) {
        final CreatePartnershipRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreatePartnershipResult>() {
            @Override
            public CreatePartnershipResult call() throws Exception {
                CreatePartnershipResult result = null;

                try {
                    result = executeCreatePartnership(finalRequest);
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
    public java.util.concurrent.Future<CreateProfileResult> createProfileAsync(CreateProfileRequest request) {

        return createProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateProfileResult> createProfileAsync(final CreateProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateProfileRequest, CreateProfileResult> asyncHandler) {
        final CreateProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateProfileResult>() {
            @Override
            public CreateProfileResult call() throws Exception {
                CreateProfileResult result = null;

                try {
                    result = executeCreateProfile(finalRequest);
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
    public java.util.concurrent.Future<CreateTransformerResult> createTransformerAsync(CreateTransformerRequest request) {

        return createTransformerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTransformerResult> createTransformerAsync(final CreateTransformerRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateTransformerRequest, CreateTransformerResult> asyncHandler) {
        final CreateTransformerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateTransformerResult>() {
            @Override
            public CreateTransformerResult call() throws Exception {
                CreateTransformerResult result = null;

                try {
                    result = executeCreateTransformer(finalRequest);
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
    public java.util.concurrent.Future<DeleteCapabilityResult> deleteCapabilityAsync(DeleteCapabilityRequest request) {

        return deleteCapabilityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteCapabilityResult> deleteCapabilityAsync(final DeleteCapabilityRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteCapabilityRequest, DeleteCapabilityResult> asyncHandler) {
        final DeleteCapabilityRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteCapabilityResult>() {
            @Override
            public DeleteCapabilityResult call() throws Exception {
                DeleteCapabilityResult result = null;

                try {
                    result = executeDeleteCapability(finalRequest);
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
    public java.util.concurrent.Future<DeletePartnershipResult> deletePartnershipAsync(DeletePartnershipRequest request) {

        return deletePartnershipAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePartnershipResult> deletePartnershipAsync(final DeletePartnershipRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeletePartnershipRequest, DeletePartnershipResult> asyncHandler) {
        final DeletePartnershipRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeletePartnershipResult>() {
            @Override
            public DeletePartnershipResult call() throws Exception {
                DeletePartnershipResult result = null;

                try {
                    result = executeDeletePartnership(finalRequest);
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
    public java.util.concurrent.Future<DeleteProfileResult> deleteProfileAsync(DeleteProfileRequest request) {

        return deleteProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteProfileResult> deleteProfileAsync(final DeleteProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteProfileRequest, DeleteProfileResult> asyncHandler) {
        final DeleteProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteProfileResult>() {
            @Override
            public DeleteProfileResult call() throws Exception {
                DeleteProfileResult result = null;

                try {
                    result = executeDeleteProfile(finalRequest);
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
    public java.util.concurrent.Future<DeleteTransformerResult> deleteTransformerAsync(DeleteTransformerRequest request) {

        return deleteTransformerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTransformerResult> deleteTransformerAsync(final DeleteTransformerRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteTransformerRequest, DeleteTransformerResult> asyncHandler) {
        final DeleteTransformerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteTransformerResult>() {
            @Override
            public DeleteTransformerResult call() throws Exception {
                DeleteTransformerResult result = null;

                try {
                    result = executeDeleteTransformer(finalRequest);
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
    public java.util.concurrent.Future<GetCapabilityResult> getCapabilityAsync(GetCapabilityRequest request) {

        return getCapabilityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCapabilityResult> getCapabilityAsync(final GetCapabilityRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCapabilityRequest, GetCapabilityResult> asyncHandler) {
        final GetCapabilityRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetCapabilityResult>() {
            @Override
            public GetCapabilityResult call() throws Exception {
                GetCapabilityResult result = null;

                try {
                    result = executeGetCapability(finalRequest);
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
    public java.util.concurrent.Future<GetPartnershipResult> getPartnershipAsync(GetPartnershipRequest request) {

        return getPartnershipAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPartnershipResult> getPartnershipAsync(final GetPartnershipRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetPartnershipRequest, GetPartnershipResult> asyncHandler) {
        final GetPartnershipRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetPartnershipResult>() {
            @Override
            public GetPartnershipResult call() throws Exception {
                GetPartnershipResult result = null;

                try {
                    result = executeGetPartnership(finalRequest);
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
    public java.util.concurrent.Future<GetProfileResult> getProfileAsync(GetProfileRequest request) {

        return getProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetProfileResult> getProfileAsync(final GetProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetProfileRequest, GetProfileResult> asyncHandler) {
        final GetProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetProfileResult>() {
            @Override
            public GetProfileResult call() throws Exception {
                GetProfileResult result = null;

                try {
                    result = executeGetProfile(finalRequest);
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
    public java.util.concurrent.Future<GetTransformerResult> getTransformerAsync(GetTransformerRequest request) {

        return getTransformerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTransformerResult> getTransformerAsync(final GetTransformerRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetTransformerRequest, GetTransformerResult> asyncHandler) {
        final GetTransformerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetTransformerResult>() {
            @Override
            public GetTransformerResult call() throws Exception {
                GetTransformerResult result = null;

                try {
                    result = executeGetTransformer(finalRequest);
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
    public java.util.concurrent.Future<GetTransformerJobResult> getTransformerJobAsync(GetTransformerJobRequest request) {

        return getTransformerJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTransformerJobResult> getTransformerJobAsync(final GetTransformerJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetTransformerJobRequest, GetTransformerJobResult> asyncHandler) {
        final GetTransformerJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetTransformerJobResult>() {
            @Override
            public GetTransformerJobResult call() throws Exception {
                GetTransformerJobResult result = null;

                try {
                    result = executeGetTransformerJob(finalRequest);
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
    public java.util.concurrent.Future<ListCapabilitiesResult> listCapabilitiesAsync(ListCapabilitiesRequest request) {

        return listCapabilitiesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCapabilitiesResult> listCapabilitiesAsync(final ListCapabilitiesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListCapabilitiesRequest, ListCapabilitiesResult> asyncHandler) {
        final ListCapabilitiesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListCapabilitiesResult>() {
            @Override
            public ListCapabilitiesResult call() throws Exception {
                ListCapabilitiesResult result = null;

                try {
                    result = executeListCapabilities(finalRequest);
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
    public java.util.concurrent.Future<ListPartnershipsResult> listPartnershipsAsync(ListPartnershipsRequest request) {

        return listPartnershipsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPartnershipsResult> listPartnershipsAsync(final ListPartnershipsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPartnershipsRequest, ListPartnershipsResult> asyncHandler) {
        final ListPartnershipsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPartnershipsResult>() {
            @Override
            public ListPartnershipsResult call() throws Exception {
                ListPartnershipsResult result = null;

                try {
                    result = executeListPartnerships(finalRequest);
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
    public java.util.concurrent.Future<ListProfilesResult> listProfilesAsync(ListProfilesRequest request) {

        return listProfilesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListProfilesResult> listProfilesAsync(final ListProfilesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListProfilesRequest, ListProfilesResult> asyncHandler) {
        final ListProfilesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListProfilesResult>() {
            @Override
            public ListProfilesResult call() throws Exception {
                ListProfilesResult result = null;

                try {
                    result = executeListProfiles(finalRequest);
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
    public java.util.concurrent.Future<ListTransformersResult> listTransformersAsync(ListTransformersRequest request) {

        return listTransformersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTransformersResult> listTransformersAsync(final ListTransformersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTransformersRequest, ListTransformersResult> asyncHandler) {
        final ListTransformersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTransformersResult>() {
            @Override
            public ListTransformersResult call() throws Exception {
                ListTransformersResult result = null;

                try {
                    result = executeListTransformers(finalRequest);
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
    public java.util.concurrent.Future<StartTransformerJobResult> startTransformerJobAsync(StartTransformerJobRequest request) {

        return startTransformerJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartTransformerJobResult> startTransformerJobAsync(final StartTransformerJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartTransformerJobRequest, StartTransformerJobResult> asyncHandler) {
        final StartTransformerJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartTransformerJobResult>() {
            @Override
            public StartTransformerJobResult call() throws Exception {
                StartTransformerJobResult result = null;

                try {
                    result = executeStartTransformerJob(finalRequest);
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
    public java.util.concurrent.Future<TestMappingResult> testMappingAsync(TestMappingRequest request) {

        return testMappingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TestMappingResult> testMappingAsync(final TestMappingRequest request,
            final com.amazonaws.handlers.AsyncHandler<TestMappingRequest, TestMappingResult> asyncHandler) {
        final TestMappingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<TestMappingResult>() {
            @Override
            public TestMappingResult call() throws Exception {
                TestMappingResult result = null;

                try {
                    result = executeTestMapping(finalRequest);
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
    public java.util.concurrent.Future<TestParsingResult> testParsingAsync(TestParsingRequest request) {

        return testParsingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TestParsingResult> testParsingAsync(final TestParsingRequest request,
            final com.amazonaws.handlers.AsyncHandler<TestParsingRequest, TestParsingResult> asyncHandler) {
        final TestParsingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<TestParsingResult>() {
            @Override
            public TestParsingResult call() throws Exception {
                TestParsingResult result = null;

                try {
                    result = executeTestParsing(finalRequest);
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
    public java.util.concurrent.Future<UpdateCapabilityResult> updateCapabilityAsync(UpdateCapabilityRequest request) {

        return updateCapabilityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateCapabilityResult> updateCapabilityAsync(final UpdateCapabilityRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateCapabilityRequest, UpdateCapabilityResult> asyncHandler) {
        final UpdateCapabilityRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateCapabilityResult>() {
            @Override
            public UpdateCapabilityResult call() throws Exception {
                UpdateCapabilityResult result = null;

                try {
                    result = executeUpdateCapability(finalRequest);
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
    public java.util.concurrent.Future<UpdatePartnershipResult> updatePartnershipAsync(UpdatePartnershipRequest request) {

        return updatePartnershipAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdatePartnershipResult> updatePartnershipAsync(final UpdatePartnershipRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdatePartnershipRequest, UpdatePartnershipResult> asyncHandler) {
        final UpdatePartnershipRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdatePartnershipResult>() {
            @Override
            public UpdatePartnershipResult call() throws Exception {
                UpdatePartnershipResult result = null;

                try {
                    result = executeUpdatePartnership(finalRequest);
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
    public java.util.concurrent.Future<UpdateProfileResult> updateProfileAsync(UpdateProfileRequest request) {

        return updateProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateProfileResult> updateProfileAsync(final UpdateProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateProfileRequest, UpdateProfileResult> asyncHandler) {
        final UpdateProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateProfileResult>() {
            @Override
            public UpdateProfileResult call() throws Exception {
                UpdateProfileResult result = null;

                try {
                    result = executeUpdateProfile(finalRequest);
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
    public java.util.concurrent.Future<UpdateTransformerResult> updateTransformerAsync(UpdateTransformerRequest request) {

        return updateTransformerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateTransformerResult> updateTransformerAsync(final UpdateTransformerRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateTransformerRequest, UpdateTransformerResult> asyncHandler) {
        final UpdateTransformerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateTransformerResult>() {
            @Override
            public UpdateTransformerResult call() throws Exception {
                UpdateTransformerResult result = null;

                try {
                    result = executeUpdateTransformer(finalRequest);
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
