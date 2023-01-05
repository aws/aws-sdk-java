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
package com.amazonaws.services.amplifyuibuilder;

import javax.annotation.Generated;

import com.amazonaws.services.amplifyuibuilder.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AWS Amplify UI Builder asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * The Amplify UI Builder API provides a programmatic interface for creating and configuring user interface (UI)
 * component libraries and themes for use in your Amplify applications. You can then connect these UI components to an
 * application's backend Amazon Web Services resources.
 * </p>
 * <p>
 * You can also use the Amplify Studio visual designer to create UI components and model data for an app. For more
 * information, see <a href="https://docs.amplify.aws/console/adminui/intro">Introduction</a> in the <i>Amplify
 * Docs</i>.
 * </p>
 * <p>
 * The Amplify Framework is a comprehensive set of SDKs, libraries, tools, and documentation for client app development.
 * For more information, see the <a href="https://docs.amplify.aws/">Amplify Framework</a>. For more information about
 * deploying an Amplify application to Amazon Web Services, see the <a
 * href="https://docs.aws.amazon.com/amplify/latest/userguide/welcome.html">Amplify User Guide</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSAmplifyUIBuilderAsyncClient extends AWSAmplifyUIBuilderClient implements AWSAmplifyUIBuilderAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSAmplifyUIBuilderAsyncClientBuilder asyncBuilder() {
        return AWSAmplifyUIBuilderAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Amplify UI Builder using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSAmplifyUIBuilderAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Amplify UI Builder using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSAmplifyUIBuilderAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<CreateComponentResult> createComponentAsync(CreateComponentRequest request) {

        return createComponentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateComponentResult> createComponentAsync(final CreateComponentRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateComponentRequest, CreateComponentResult> asyncHandler) {
        final CreateComponentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateComponentResult>() {
            @Override
            public CreateComponentResult call() throws Exception {
                CreateComponentResult result = null;

                try {
                    result = executeCreateComponent(finalRequest);
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
    public java.util.concurrent.Future<CreateFormResult> createFormAsync(CreateFormRequest request) {

        return createFormAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateFormResult> createFormAsync(final CreateFormRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateFormRequest, CreateFormResult> asyncHandler) {
        final CreateFormRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateFormResult>() {
            @Override
            public CreateFormResult call() throws Exception {
                CreateFormResult result = null;

                try {
                    result = executeCreateForm(finalRequest);
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
    public java.util.concurrent.Future<CreateThemeResult> createThemeAsync(CreateThemeRequest request) {

        return createThemeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateThemeResult> createThemeAsync(final CreateThemeRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateThemeRequest, CreateThemeResult> asyncHandler) {
        final CreateThemeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateThemeResult>() {
            @Override
            public CreateThemeResult call() throws Exception {
                CreateThemeResult result = null;

                try {
                    result = executeCreateTheme(finalRequest);
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
    public java.util.concurrent.Future<DeleteComponentResult> deleteComponentAsync(DeleteComponentRequest request) {

        return deleteComponentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteComponentResult> deleteComponentAsync(final DeleteComponentRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteComponentRequest, DeleteComponentResult> asyncHandler) {
        final DeleteComponentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteComponentResult>() {
            @Override
            public DeleteComponentResult call() throws Exception {
                DeleteComponentResult result = null;

                try {
                    result = executeDeleteComponent(finalRequest);
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
    public java.util.concurrent.Future<DeleteFormResult> deleteFormAsync(DeleteFormRequest request) {

        return deleteFormAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteFormResult> deleteFormAsync(final DeleteFormRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteFormRequest, DeleteFormResult> asyncHandler) {
        final DeleteFormRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteFormResult>() {
            @Override
            public DeleteFormResult call() throws Exception {
                DeleteFormResult result = null;

                try {
                    result = executeDeleteForm(finalRequest);
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
    public java.util.concurrent.Future<DeleteThemeResult> deleteThemeAsync(DeleteThemeRequest request) {

        return deleteThemeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteThemeResult> deleteThemeAsync(final DeleteThemeRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteThemeRequest, DeleteThemeResult> asyncHandler) {
        final DeleteThemeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteThemeResult>() {
            @Override
            public DeleteThemeResult call() throws Exception {
                DeleteThemeResult result = null;

                try {
                    result = executeDeleteTheme(finalRequest);
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
    public java.util.concurrent.Future<ExchangeCodeForTokenResult> exchangeCodeForTokenAsync(ExchangeCodeForTokenRequest request) {

        return exchangeCodeForTokenAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ExchangeCodeForTokenResult> exchangeCodeForTokenAsync(final ExchangeCodeForTokenRequest request,
            final com.amazonaws.handlers.AsyncHandler<ExchangeCodeForTokenRequest, ExchangeCodeForTokenResult> asyncHandler) {
        final ExchangeCodeForTokenRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ExchangeCodeForTokenResult>() {
            @Override
            public ExchangeCodeForTokenResult call() throws Exception {
                ExchangeCodeForTokenResult result = null;

                try {
                    result = executeExchangeCodeForToken(finalRequest);
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
    public java.util.concurrent.Future<ExportComponentsResult> exportComponentsAsync(ExportComponentsRequest request) {

        return exportComponentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ExportComponentsResult> exportComponentsAsync(final ExportComponentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ExportComponentsRequest, ExportComponentsResult> asyncHandler) {
        final ExportComponentsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ExportComponentsResult>() {
            @Override
            public ExportComponentsResult call() throws Exception {
                ExportComponentsResult result = null;

                try {
                    result = executeExportComponents(finalRequest);
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
    public java.util.concurrent.Future<ExportFormsResult> exportFormsAsync(ExportFormsRequest request) {

        return exportFormsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ExportFormsResult> exportFormsAsync(final ExportFormsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ExportFormsRequest, ExportFormsResult> asyncHandler) {
        final ExportFormsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ExportFormsResult>() {
            @Override
            public ExportFormsResult call() throws Exception {
                ExportFormsResult result = null;

                try {
                    result = executeExportForms(finalRequest);
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
    public java.util.concurrent.Future<ExportThemesResult> exportThemesAsync(ExportThemesRequest request) {

        return exportThemesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ExportThemesResult> exportThemesAsync(final ExportThemesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ExportThemesRequest, ExportThemesResult> asyncHandler) {
        final ExportThemesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ExportThemesResult>() {
            @Override
            public ExportThemesResult call() throws Exception {
                ExportThemesResult result = null;

                try {
                    result = executeExportThemes(finalRequest);
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
    public java.util.concurrent.Future<GetComponentResult> getComponentAsync(GetComponentRequest request) {

        return getComponentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetComponentResult> getComponentAsync(final GetComponentRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetComponentRequest, GetComponentResult> asyncHandler) {
        final GetComponentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetComponentResult>() {
            @Override
            public GetComponentResult call() throws Exception {
                GetComponentResult result = null;

                try {
                    result = executeGetComponent(finalRequest);
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
    public java.util.concurrent.Future<GetFormResult> getFormAsync(GetFormRequest request) {

        return getFormAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetFormResult> getFormAsync(final GetFormRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetFormRequest, GetFormResult> asyncHandler) {
        final GetFormRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetFormResult>() {
            @Override
            public GetFormResult call() throws Exception {
                GetFormResult result = null;

                try {
                    result = executeGetForm(finalRequest);
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
    public java.util.concurrent.Future<GetMetadataResult> getMetadataAsync(GetMetadataRequest request) {

        return getMetadataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMetadataResult> getMetadataAsync(final GetMetadataRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetMetadataRequest, GetMetadataResult> asyncHandler) {
        final GetMetadataRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetMetadataResult>() {
            @Override
            public GetMetadataResult call() throws Exception {
                GetMetadataResult result = null;

                try {
                    result = executeGetMetadata(finalRequest);
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
    public java.util.concurrent.Future<GetThemeResult> getThemeAsync(GetThemeRequest request) {

        return getThemeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetThemeResult> getThemeAsync(final GetThemeRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetThemeRequest, GetThemeResult> asyncHandler) {
        final GetThemeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetThemeResult>() {
            @Override
            public GetThemeResult call() throws Exception {
                GetThemeResult result = null;

                try {
                    result = executeGetTheme(finalRequest);
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
    public java.util.concurrent.Future<ListComponentsResult> listComponentsAsync(ListComponentsRequest request) {

        return listComponentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListComponentsResult> listComponentsAsync(final ListComponentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListComponentsRequest, ListComponentsResult> asyncHandler) {
        final ListComponentsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListComponentsResult>() {
            @Override
            public ListComponentsResult call() throws Exception {
                ListComponentsResult result = null;

                try {
                    result = executeListComponents(finalRequest);
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
    public java.util.concurrent.Future<ListFormsResult> listFormsAsync(ListFormsRequest request) {

        return listFormsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFormsResult> listFormsAsync(final ListFormsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListFormsRequest, ListFormsResult> asyncHandler) {
        final ListFormsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListFormsResult>() {
            @Override
            public ListFormsResult call() throws Exception {
                ListFormsResult result = null;

                try {
                    result = executeListForms(finalRequest);
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
    public java.util.concurrent.Future<ListThemesResult> listThemesAsync(ListThemesRequest request) {

        return listThemesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListThemesResult> listThemesAsync(final ListThemesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListThemesRequest, ListThemesResult> asyncHandler) {
        final ListThemesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListThemesResult>() {
            @Override
            public ListThemesResult call() throws Exception {
                ListThemesResult result = null;

                try {
                    result = executeListThemes(finalRequest);
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
    public java.util.concurrent.Future<PutMetadataFlagResult> putMetadataFlagAsync(PutMetadataFlagRequest request) {

        return putMetadataFlagAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutMetadataFlagResult> putMetadataFlagAsync(final PutMetadataFlagRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutMetadataFlagRequest, PutMetadataFlagResult> asyncHandler) {
        final PutMetadataFlagRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutMetadataFlagResult>() {
            @Override
            public PutMetadataFlagResult call() throws Exception {
                PutMetadataFlagResult result = null;

                try {
                    result = executePutMetadataFlag(finalRequest);
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
    public java.util.concurrent.Future<RefreshTokenResult> refreshTokenAsync(RefreshTokenRequest request) {

        return refreshTokenAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RefreshTokenResult> refreshTokenAsync(final RefreshTokenRequest request,
            final com.amazonaws.handlers.AsyncHandler<RefreshTokenRequest, RefreshTokenResult> asyncHandler) {
        final RefreshTokenRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RefreshTokenResult>() {
            @Override
            public RefreshTokenResult call() throws Exception {
                RefreshTokenResult result = null;

                try {
                    result = executeRefreshToken(finalRequest);
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
    public java.util.concurrent.Future<UpdateComponentResult> updateComponentAsync(UpdateComponentRequest request) {

        return updateComponentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateComponentResult> updateComponentAsync(final UpdateComponentRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateComponentRequest, UpdateComponentResult> asyncHandler) {
        final UpdateComponentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateComponentResult>() {
            @Override
            public UpdateComponentResult call() throws Exception {
                UpdateComponentResult result = null;

                try {
                    result = executeUpdateComponent(finalRequest);
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
    public java.util.concurrent.Future<UpdateFormResult> updateFormAsync(UpdateFormRequest request) {

        return updateFormAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateFormResult> updateFormAsync(final UpdateFormRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateFormRequest, UpdateFormResult> asyncHandler) {
        final UpdateFormRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateFormResult>() {
            @Override
            public UpdateFormResult call() throws Exception {
                UpdateFormResult result = null;

                try {
                    result = executeUpdateForm(finalRequest);
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
    public java.util.concurrent.Future<UpdateThemeResult> updateThemeAsync(UpdateThemeRequest request) {

        return updateThemeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateThemeResult> updateThemeAsync(final UpdateThemeRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateThemeRequest, UpdateThemeResult> asyncHandler) {
        final UpdateThemeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateThemeResult>() {
            @Override
            public UpdateThemeResult call() throws Exception {
                UpdateThemeResult result = null;

                try {
                    result = executeUpdateTheme(finalRequest);
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
