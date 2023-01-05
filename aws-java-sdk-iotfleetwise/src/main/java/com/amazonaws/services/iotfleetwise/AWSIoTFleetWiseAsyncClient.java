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
package com.amazonaws.services.iotfleetwise;

import javax.annotation.Generated;

import com.amazonaws.services.iotfleetwise.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AWS IoT FleetWise asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Amazon Web Services IoT FleetWise is a fully managed service that you can use to collect, model, and transfer vehicle
 * data to the Amazon Web Services cloud at scale. With Amazon Web Services IoT FleetWise, you can standardize all of
 * your vehicle data models, independent of the in-vehicle communication architecture, and define data collection rules
 * to transfer only high-value data to the cloud.
 * </p>
 * <p>
 * For more information, see <a href="https://docs.aws.amazon.com/iot-fleetwise/latest/developerguide/">What is Amazon
 * Web Services IoT FleetWise?</a> in the <i>Amazon Web Services IoT FleetWise Developer Guide</i>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSIoTFleetWiseAsyncClient extends AWSIoTFleetWiseClient implements AWSIoTFleetWiseAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSIoTFleetWiseAsyncClientBuilder asyncBuilder() {
        return AWSIoTFleetWiseAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS IoT FleetWise using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSIoTFleetWiseAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS IoT FleetWise using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSIoTFleetWiseAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<AssociateVehicleFleetResult> associateVehicleFleetAsync(AssociateVehicleFleetRequest request) {

        return associateVehicleFleetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateVehicleFleetResult> associateVehicleFleetAsync(final AssociateVehicleFleetRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateVehicleFleetRequest, AssociateVehicleFleetResult> asyncHandler) {
        final AssociateVehicleFleetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateVehicleFleetResult>() {
            @Override
            public AssociateVehicleFleetResult call() throws Exception {
                AssociateVehicleFleetResult result = null;

                try {
                    result = executeAssociateVehicleFleet(finalRequest);
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
    public java.util.concurrent.Future<BatchCreateVehicleResult> batchCreateVehicleAsync(BatchCreateVehicleRequest request) {

        return batchCreateVehicleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchCreateVehicleResult> batchCreateVehicleAsync(final BatchCreateVehicleRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchCreateVehicleRequest, BatchCreateVehicleResult> asyncHandler) {
        final BatchCreateVehicleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchCreateVehicleResult>() {
            @Override
            public BatchCreateVehicleResult call() throws Exception {
                BatchCreateVehicleResult result = null;

                try {
                    result = executeBatchCreateVehicle(finalRequest);
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
    public java.util.concurrent.Future<BatchUpdateVehicleResult> batchUpdateVehicleAsync(BatchUpdateVehicleRequest request) {

        return batchUpdateVehicleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchUpdateVehicleResult> batchUpdateVehicleAsync(final BatchUpdateVehicleRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchUpdateVehicleRequest, BatchUpdateVehicleResult> asyncHandler) {
        final BatchUpdateVehicleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchUpdateVehicleResult>() {
            @Override
            public BatchUpdateVehicleResult call() throws Exception {
                BatchUpdateVehicleResult result = null;

                try {
                    result = executeBatchUpdateVehicle(finalRequest);
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
    public java.util.concurrent.Future<CreateCampaignResult> createCampaignAsync(CreateCampaignRequest request) {

        return createCampaignAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateCampaignResult> createCampaignAsync(final CreateCampaignRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateCampaignRequest, CreateCampaignResult> asyncHandler) {
        final CreateCampaignRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateCampaignResult>() {
            @Override
            public CreateCampaignResult call() throws Exception {
                CreateCampaignResult result = null;

                try {
                    result = executeCreateCampaign(finalRequest);
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
    public java.util.concurrent.Future<CreateDecoderManifestResult> createDecoderManifestAsync(CreateDecoderManifestRequest request) {

        return createDecoderManifestAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDecoderManifestResult> createDecoderManifestAsync(final CreateDecoderManifestRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDecoderManifestRequest, CreateDecoderManifestResult> asyncHandler) {
        final CreateDecoderManifestRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDecoderManifestResult>() {
            @Override
            public CreateDecoderManifestResult call() throws Exception {
                CreateDecoderManifestResult result = null;

                try {
                    result = executeCreateDecoderManifest(finalRequest);
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
    public java.util.concurrent.Future<CreateFleetResult> createFleetAsync(CreateFleetRequest request) {

        return createFleetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateFleetResult> createFleetAsync(final CreateFleetRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateFleetRequest, CreateFleetResult> asyncHandler) {
        final CreateFleetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateFleetResult>() {
            @Override
            public CreateFleetResult call() throws Exception {
                CreateFleetResult result = null;

                try {
                    result = executeCreateFleet(finalRequest);
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
    public java.util.concurrent.Future<CreateModelManifestResult> createModelManifestAsync(CreateModelManifestRequest request) {

        return createModelManifestAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateModelManifestResult> createModelManifestAsync(final CreateModelManifestRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateModelManifestRequest, CreateModelManifestResult> asyncHandler) {
        final CreateModelManifestRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateModelManifestResult>() {
            @Override
            public CreateModelManifestResult call() throws Exception {
                CreateModelManifestResult result = null;

                try {
                    result = executeCreateModelManifest(finalRequest);
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
    public java.util.concurrent.Future<CreateSignalCatalogResult> createSignalCatalogAsync(CreateSignalCatalogRequest request) {

        return createSignalCatalogAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSignalCatalogResult> createSignalCatalogAsync(final CreateSignalCatalogRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSignalCatalogRequest, CreateSignalCatalogResult> asyncHandler) {
        final CreateSignalCatalogRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateSignalCatalogResult>() {
            @Override
            public CreateSignalCatalogResult call() throws Exception {
                CreateSignalCatalogResult result = null;

                try {
                    result = executeCreateSignalCatalog(finalRequest);
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
    public java.util.concurrent.Future<CreateVehicleResult> createVehicleAsync(CreateVehicleRequest request) {

        return createVehicleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateVehicleResult> createVehicleAsync(final CreateVehicleRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateVehicleRequest, CreateVehicleResult> asyncHandler) {
        final CreateVehicleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateVehicleResult>() {
            @Override
            public CreateVehicleResult call() throws Exception {
                CreateVehicleResult result = null;

                try {
                    result = executeCreateVehicle(finalRequest);
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
    public java.util.concurrent.Future<DeleteCampaignResult> deleteCampaignAsync(DeleteCampaignRequest request) {

        return deleteCampaignAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteCampaignResult> deleteCampaignAsync(final DeleteCampaignRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteCampaignRequest, DeleteCampaignResult> asyncHandler) {
        final DeleteCampaignRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteCampaignResult>() {
            @Override
            public DeleteCampaignResult call() throws Exception {
                DeleteCampaignResult result = null;

                try {
                    result = executeDeleteCampaign(finalRequest);
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
    public java.util.concurrent.Future<DeleteDecoderManifestResult> deleteDecoderManifestAsync(DeleteDecoderManifestRequest request) {

        return deleteDecoderManifestAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDecoderManifestResult> deleteDecoderManifestAsync(final DeleteDecoderManifestRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDecoderManifestRequest, DeleteDecoderManifestResult> asyncHandler) {
        final DeleteDecoderManifestRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDecoderManifestResult>() {
            @Override
            public DeleteDecoderManifestResult call() throws Exception {
                DeleteDecoderManifestResult result = null;

                try {
                    result = executeDeleteDecoderManifest(finalRequest);
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
    public java.util.concurrent.Future<DeleteFleetResult> deleteFleetAsync(DeleteFleetRequest request) {

        return deleteFleetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteFleetResult> deleteFleetAsync(final DeleteFleetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteFleetRequest, DeleteFleetResult> asyncHandler) {
        final DeleteFleetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteFleetResult>() {
            @Override
            public DeleteFleetResult call() throws Exception {
                DeleteFleetResult result = null;

                try {
                    result = executeDeleteFleet(finalRequest);
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
    public java.util.concurrent.Future<DeleteModelManifestResult> deleteModelManifestAsync(DeleteModelManifestRequest request) {

        return deleteModelManifestAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteModelManifestResult> deleteModelManifestAsync(final DeleteModelManifestRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteModelManifestRequest, DeleteModelManifestResult> asyncHandler) {
        final DeleteModelManifestRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteModelManifestResult>() {
            @Override
            public DeleteModelManifestResult call() throws Exception {
                DeleteModelManifestResult result = null;

                try {
                    result = executeDeleteModelManifest(finalRequest);
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
    public java.util.concurrent.Future<DeleteSignalCatalogResult> deleteSignalCatalogAsync(DeleteSignalCatalogRequest request) {

        return deleteSignalCatalogAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSignalCatalogResult> deleteSignalCatalogAsync(final DeleteSignalCatalogRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSignalCatalogRequest, DeleteSignalCatalogResult> asyncHandler) {
        final DeleteSignalCatalogRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteSignalCatalogResult>() {
            @Override
            public DeleteSignalCatalogResult call() throws Exception {
                DeleteSignalCatalogResult result = null;

                try {
                    result = executeDeleteSignalCatalog(finalRequest);
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
    public java.util.concurrent.Future<DeleteVehicleResult> deleteVehicleAsync(DeleteVehicleRequest request) {

        return deleteVehicleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteVehicleResult> deleteVehicleAsync(final DeleteVehicleRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteVehicleRequest, DeleteVehicleResult> asyncHandler) {
        final DeleteVehicleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteVehicleResult>() {
            @Override
            public DeleteVehicleResult call() throws Exception {
                DeleteVehicleResult result = null;

                try {
                    result = executeDeleteVehicle(finalRequest);
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
    public java.util.concurrent.Future<DisassociateVehicleFleetResult> disassociateVehicleFleetAsync(DisassociateVehicleFleetRequest request) {

        return disassociateVehicleFleetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateVehicleFleetResult> disassociateVehicleFleetAsync(final DisassociateVehicleFleetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateVehicleFleetRequest, DisassociateVehicleFleetResult> asyncHandler) {
        final DisassociateVehicleFleetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateVehicleFleetResult>() {
            @Override
            public DisassociateVehicleFleetResult call() throws Exception {
                DisassociateVehicleFleetResult result = null;

                try {
                    result = executeDisassociateVehicleFleet(finalRequest);
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
    public java.util.concurrent.Future<GetCampaignResult> getCampaignAsync(GetCampaignRequest request) {

        return getCampaignAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCampaignResult> getCampaignAsync(final GetCampaignRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCampaignRequest, GetCampaignResult> asyncHandler) {
        final GetCampaignRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetCampaignResult>() {
            @Override
            public GetCampaignResult call() throws Exception {
                GetCampaignResult result = null;

                try {
                    result = executeGetCampaign(finalRequest);
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
    public java.util.concurrent.Future<GetDecoderManifestResult> getDecoderManifestAsync(GetDecoderManifestRequest request) {

        return getDecoderManifestAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDecoderManifestResult> getDecoderManifestAsync(final GetDecoderManifestRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDecoderManifestRequest, GetDecoderManifestResult> asyncHandler) {
        final GetDecoderManifestRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDecoderManifestResult>() {
            @Override
            public GetDecoderManifestResult call() throws Exception {
                GetDecoderManifestResult result = null;

                try {
                    result = executeGetDecoderManifest(finalRequest);
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
    public java.util.concurrent.Future<GetFleetResult> getFleetAsync(GetFleetRequest request) {

        return getFleetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetFleetResult> getFleetAsync(final GetFleetRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetFleetRequest, GetFleetResult> asyncHandler) {
        final GetFleetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetFleetResult>() {
            @Override
            public GetFleetResult call() throws Exception {
                GetFleetResult result = null;

                try {
                    result = executeGetFleet(finalRequest);
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
    public java.util.concurrent.Future<GetLoggingOptionsResult> getLoggingOptionsAsync(GetLoggingOptionsRequest request) {

        return getLoggingOptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetLoggingOptionsResult> getLoggingOptionsAsync(final GetLoggingOptionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetLoggingOptionsRequest, GetLoggingOptionsResult> asyncHandler) {
        final GetLoggingOptionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetLoggingOptionsResult>() {
            @Override
            public GetLoggingOptionsResult call() throws Exception {
                GetLoggingOptionsResult result = null;

                try {
                    result = executeGetLoggingOptions(finalRequest);
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
    public java.util.concurrent.Future<GetModelManifestResult> getModelManifestAsync(GetModelManifestRequest request) {

        return getModelManifestAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetModelManifestResult> getModelManifestAsync(final GetModelManifestRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetModelManifestRequest, GetModelManifestResult> asyncHandler) {
        final GetModelManifestRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetModelManifestResult>() {
            @Override
            public GetModelManifestResult call() throws Exception {
                GetModelManifestResult result = null;

                try {
                    result = executeGetModelManifest(finalRequest);
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
    public java.util.concurrent.Future<GetRegisterAccountStatusResult> getRegisterAccountStatusAsync(GetRegisterAccountStatusRequest request) {

        return getRegisterAccountStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRegisterAccountStatusResult> getRegisterAccountStatusAsync(final GetRegisterAccountStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRegisterAccountStatusRequest, GetRegisterAccountStatusResult> asyncHandler) {
        final GetRegisterAccountStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetRegisterAccountStatusResult>() {
            @Override
            public GetRegisterAccountStatusResult call() throws Exception {
                GetRegisterAccountStatusResult result = null;

                try {
                    result = executeGetRegisterAccountStatus(finalRequest);
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
    public java.util.concurrent.Future<GetSignalCatalogResult> getSignalCatalogAsync(GetSignalCatalogRequest request) {

        return getSignalCatalogAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSignalCatalogResult> getSignalCatalogAsync(final GetSignalCatalogRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSignalCatalogRequest, GetSignalCatalogResult> asyncHandler) {
        final GetSignalCatalogRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSignalCatalogResult>() {
            @Override
            public GetSignalCatalogResult call() throws Exception {
                GetSignalCatalogResult result = null;

                try {
                    result = executeGetSignalCatalog(finalRequest);
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
    public java.util.concurrent.Future<GetVehicleResult> getVehicleAsync(GetVehicleRequest request) {

        return getVehicleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetVehicleResult> getVehicleAsync(final GetVehicleRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetVehicleRequest, GetVehicleResult> asyncHandler) {
        final GetVehicleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetVehicleResult>() {
            @Override
            public GetVehicleResult call() throws Exception {
                GetVehicleResult result = null;

                try {
                    result = executeGetVehicle(finalRequest);
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
    public java.util.concurrent.Future<GetVehicleStatusResult> getVehicleStatusAsync(GetVehicleStatusRequest request) {

        return getVehicleStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetVehicleStatusResult> getVehicleStatusAsync(final GetVehicleStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetVehicleStatusRequest, GetVehicleStatusResult> asyncHandler) {
        final GetVehicleStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetVehicleStatusResult>() {
            @Override
            public GetVehicleStatusResult call() throws Exception {
                GetVehicleStatusResult result = null;

                try {
                    result = executeGetVehicleStatus(finalRequest);
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
    public java.util.concurrent.Future<ImportDecoderManifestResult> importDecoderManifestAsync(ImportDecoderManifestRequest request) {

        return importDecoderManifestAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ImportDecoderManifestResult> importDecoderManifestAsync(final ImportDecoderManifestRequest request,
            final com.amazonaws.handlers.AsyncHandler<ImportDecoderManifestRequest, ImportDecoderManifestResult> asyncHandler) {
        final ImportDecoderManifestRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ImportDecoderManifestResult>() {
            @Override
            public ImportDecoderManifestResult call() throws Exception {
                ImportDecoderManifestResult result = null;

                try {
                    result = executeImportDecoderManifest(finalRequest);
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
    public java.util.concurrent.Future<ImportSignalCatalogResult> importSignalCatalogAsync(ImportSignalCatalogRequest request) {

        return importSignalCatalogAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ImportSignalCatalogResult> importSignalCatalogAsync(final ImportSignalCatalogRequest request,
            final com.amazonaws.handlers.AsyncHandler<ImportSignalCatalogRequest, ImportSignalCatalogResult> asyncHandler) {
        final ImportSignalCatalogRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ImportSignalCatalogResult>() {
            @Override
            public ImportSignalCatalogResult call() throws Exception {
                ImportSignalCatalogResult result = null;

                try {
                    result = executeImportSignalCatalog(finalRequest);
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
    public java.util.concurrent.Future<ListCampaignsResult> listCampaignsAsync(ListCampaignsRequest request) {

        return listCampaignsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCampaignsResult> listCampaignsAsync(final ListCampaignsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListCampaignsRequest, ListCampaignsResult> asyncHandler) {
        final ListCampaignsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListCampaignsResult>() {
            @Override
            public ListCampaignsResult call() throws Exception {
                ListCampaignsResult result = null;

                try {
                    result = executeListCampaigns(finalRequest);
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
    public java.util.concurrent.Future<ListDecoderManifestNetworkInterfacesResult> listDecoderManifestNetworkInterfacesAsync(
            ListDecoderManifestNetworkInterfacesRequest request) {

        return listDecoderManifestNetworkInterfacesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDecoderManifestNetworkInterfacesResult> listDecoderManifestNetworkInterfacesAsync(
            final ListDecoderManifestNetworkInterfacesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDecoderManifestNetworkInterfacesRequest, ListDecoderManifestNetworkInterfacesResult> asyncHandler) {
        final ListDecoderManifestNetworkInterfacesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDecoderManifestNetworkInterfacesResult>() {
            @Override
            public ListDecoderManifestNetworkInterfacesResult call() throws Exception {
                ListDecoderManifestNetworkInterfacesResult result = null;

                try {
                    result = executeListDecoderManifestNetworkInterfaces(finalRequest);
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
    public java.util.concurrent.Future<ListDecoderManifestSignalsResult> listDecoderManifestSignalsAsync(ListDecoderManifestSignalsRequest request) {

        return listDecoderManifestSignalsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDecoderManifestSignalsResult> listDecoderManifestSignalsAsync(final ListDecoderManifestSignalsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDecoderManifestSignalsRequest, ListDecoderManifestSignalsResult> asyncHandler) {
        final ListDecoderManifestSignalsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDecoderManifestSignalsResult>() {
            @Override
            public ListDecoderManifestSignalsResult call() throws Exception {
                ListDecoderManifestSignalsResult result = null;

                try {
                    result = executeListDecoderManifestSignals(finalRequest);
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
    public java.util.concurrent.Future<ListDecoderManifestsResult> listDecoderManifestsAsync(ListDecoderManifestsRequest request) {

        return listDecoderManifestsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDecoderManifestsResult> listDecoderManifestsAsync(final ListDecoderManifestsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDecoderManifestsRequest, ListDecoderManifestsResult> asyncHandler) {
        final ListDecoderManifestsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDecoderManifestsResult>() {
            @Override
            public ListDecoderManifestsResult call() throws Exception {
                ListDecoderManifestsResult result = null;

                try {
                    result = executeListDecoderManifests(finalRequest);
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
    public java.util.concurrent.Future<ListFleetsResult> listFleetsAsync(ListFleetsRequest request) {

        return listFleetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFleetsResult> listFleetsAsync(final ListFleetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListFleetsRequest, ListFleetsResult> asyncHandler) {
        final ListFleetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListFleetsResult>() {
            @Override
            public ListFleetsResult call() throws Exception {
                ListFleetsResult result = null;

                try {
                    result = executeListFleets(finalRequest);
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
    public java.util.concurrent.Future<ListFleetsForVehicleResult> listFleetsForVehicleAsync(ListFleetsForVehicleRequest request) {

        return listFleetsForVehicleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFleetsForVehicleResult> listFleetsForVehicleAsync(final ListFleetsForVehicleRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListFleetsForVehicleRequest, ListFleetsForVehicleResult> asyncHandler) {
        final ListFleetsForVehicleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListFleetsForVehicleResult>() {
            @Override
            public ListFleetsForVehicleResult call() throws Exception {
                ListFleetsForVehicleResult result = null;

                try {
                    result = executeListFleetsForVehicle(finalRequest);
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
    public java.util.concurrent.Future<ListModelManifestNodesResult> listModelManifestNodesAsync(ListModelManifestNodesRequest request) {

        return listModelManifestNodesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListModelManifestNodesResult> listModelManifestNodesAsync(final ListModelManifestNodesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListModelManifestNodesRequest, ListModelManifestNodesResult> asyncHandler) {
        final ListModelManifestNodesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListModelManifestNodesResult>() {
            @Override
            public ListModelManifestNodesResult call() throws Exception {
                ListModelManifestNodesResult result = null;

                try {
                    result = executeListModelManifestNodes(finalRequest);
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
    public java.util.concurrent.Future<ListModelManifestsResult> listModelManifestsAsync(ListModelManifestsRequest request) {

        return listModelManifestsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListModelManifestsResult> listModelManifestsAsync(final ListModelManifestsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListModelManifestsRequest, ListModelManifestsResult> asyncHandler) {
        final ListModelManifestsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListModelManifestsResult>() {
            @Override
            public ListModelManifestsResult call() throws Exception {
                ListModelManifestsResult result = null;

                try {
                    result = executeListModelManifests(finalRequest);
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
    public java.util.concurrent.Future<ListSignalCatalogNodesResult> listSignalCatalogNodesAsync(ListSignalCatalogNodesRequest request) {

        return listSignalCatalogNodesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSignalCatalogNodesResult> listSignalCatalogNodesAsync(final ListSignalCatalogNodesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSignalCatalogNodesRequest, ListSignalCatalogNodesResult> asyncHandler) {
        final ListSignalCatalogNodesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSignalCatalogNodesResult>() {
            @Override
            public ListSignalCatalogNodesResult call() throws Exception {
                ListSignalCatalogNodesResult result = null;

                try {
                    result = executeListSignalCatalogNodes(finalRequest);
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
    public java.util.concurrent.Future<ListSignalCatalogsResult> listSignalCatalogsAsync(ListSignalCatalogsRequest request) {

        return listSignalCatalogsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSignalCatalogsResult> listSignalCatalogsAsync(final ListSignalCatalogsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSignalCatalogsRequest, ListSignalCatalogsResult> asyncHandler) {
        final ListSignalCatalogsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSignalCatalogsResult>() {
            @Override
            public ListSignalCatalogsResult call() throws Exception {
                ListSignalCatalogsResult result = null;

                try {
                    result = executeListSignalCatalogs(finalRequest);
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
    public java.util.concurrent.Future<ListVehiclesResult> listVehiclesAsync(ListVehiclesRequest request) {

        return listVehiclesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListVehiclesResult> listVehiclesAsync(final ListVehiclesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListVehiclesRequest, ListVehiclesResult> asyncHandler) {
        final ListVehiclesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListVehiclesResult>() {
            @Override
            public ListVehiclesResult call() throws Exception {
                ListVehiclesResult result = null;

                try {
                    result = executeListVehicles(finalRequest);
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
    public java.util.concurrent.Future<ListVehiclesInFleetResult> listVehiclesInFleetAsync(ListVehiclesInFleetRequest request) {

        return listVehiclesInFleetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListVehiclesInFleetResult> listVehiclesInFleetAsync(final ListVehiclesInFleetRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListVehiclesInFleetRequest, ListVehiclesInFleetResult> asyncHandler) {
        final ListVehiclesInFleetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListVehiclesInFleetResult>() {
            @Override
            public ListVehiclesInFleetResult call() throws Exception {
                ListVehiclesInFleetResult result = null;

                try {
                    result = executeListVehiclesInFleet(finalRequest);
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
    public java.util.concurrent.Future<PutLoggingOptionsResult> putLoggingOptionsAsync(PutLoggingOptionsRequest request) {

        return putLoggingOptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutLoggingOptionsResult> putLoggingOptionsAsync(final PutLoggingOptionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutLoggingOptionsRequest, PutLoggingOptionsResult> asyncHandler) {
        final PutLoggingOptionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutLoggingOptionsResult>() {
            @Override
            public PutLoggingOptionsResult call() throws Exception {
                PutLoggingOptionsResult result = null;

                try {
                    result = executePutLoggingOptions(finalRequest);
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
    public java.util.concurrent.Future<RegisterAccountResult> registerAccountAsync(RegisterAccountRequest request) {

        return registerAccountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterAccountResult> registerAccountAsync(final RegisterAccountRequest request,
            final com.amazonaws.handlers.AsyncHandler<RegisterAccountRequest, RegisterAccountResult> asyncHandler) {
        final RegisterAccountRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RegisterAccountResult>() {
            @Override
            public RegisterAccountResult call() throws Exception {
                RegisterAccountResult result = null;

                try {
                    result = executeRegisterAccount(finalRequest);
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
    public java.util.concurrent.Future<UpdateCampaignResult> updateCampaignAsync(UpdateCampaignRequest request) {

        return updateCampaignAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateCampaignResult> updateCampaignAsync(final UpdateCampaignRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateCampaignRequest, UpdateCampaignResult> asyncHandler) {
        final UpdateCampaignRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateCampaignResult>() {
            @Override
            public UpdateCampaignResult call() throws Exception {
                UpdateCampaignResult result = null;

                try {
                    result = executeUpdateCampaign(finalRequest);
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
    public java.util.concurrent.Future<UpdateDecoderManifestResult> updateDecoderManifestAsync(UpdateDecoderManifestRequest request) {

        return updateDecoderManifestAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDecoderManifestResult> updateDecoderManifestAsync(final UpdateDecoderManifestRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDecoderManifestRequest, UpdateDecoderManifestResult> asyncHandler) {
        final UpdateDecoderManifestRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateDecoderManifestResult>() {
            @Override
            public UpdateDecoderManifestResult call() throws Exception {
                UpdateDecoderManifestResult result = null;

                try {
                    result = executeUpdateDecoderManifest(finalRequest);
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
    public java.util.concurrent.Future<UpdateFleetResult> updateFleetAsync(UpdateFleetRequest request) {

        return updateFleetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateFleetResult> updateFleetAsync(final UpdateFleetRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateFleetRequest, UpdateFleetResult> asyncHandler) {
        final UpdateFleetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateFleetResult>() {
            @Override
            public UpdateFleetResult call() throws Exception {
                UpdateFleetResult result = null;

                try {
                    result = executeUpdateFleet(finalRequest);
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
    public java.util.concurrent.Future<UpdateModelManifestResult> updateModelManifestAsync(UpdateModelManifestRequest request) {

        return updateModelManifestAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateModelManifestResult> updateModelManifestAsync(final UpdateModelManifestRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateModelManifestRequest, UpdateModelManifestResult> asyncHandler) {
        final UpdateModelManifestRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateModelManifestResult>() {
            @Override
            public UpdateModelManifestResult call() throws Exception {
                UpdateModelManifestResult result = null;

                try {
                    result = executeUpdateModelManifest(finalRequest);
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
    public java.util.concurrent.Future<UpdateSignalCatalogResult> updateSignalCatalogAsync(UpdateSignalCatalogRequest request) {

        return updateSignalCatalogAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSignalCatalogResult> updateSignalCatalogAsync(final UpdateSignalCatalogRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateSignalCatalogRequest, UpdateSignalCatalogResult> asyncHandler) {
        final UpdateSignalCatalogRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateSignalCatalogResult>() {
            @Override
            public UpdateSignalCatalogResult call() throws Exception {
                UpdateSignalCatalogResult result = null;

                try {
                    result = executeUpdateSignalCatalog(finalRequest);
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
    public java.util.concurrent.Future<UpdateVehicleResult> updateVehicleAsync(UpdateVehicleRequest request) {

        return updateVehicleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateVehicleResult> updateVehicleAsync(final UpdateVehicleRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateVehicleRequest, UpdateVehicleResult> asyncHandler) {
        final UpdateVehicleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateVehicleResult>() {
            @Override
            public UpdateVehicleResult call() throws Exception {
                UpdateVehicleResult result = null;

                try {
                    result = executeUpdateVehicle(finalRequest);
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
