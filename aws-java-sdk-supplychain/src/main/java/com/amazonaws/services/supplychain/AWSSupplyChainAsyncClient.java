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
package com.amazonaws.services.supplychain;

import javax.annotation.Generated;

import com.amazonaws.services.supplychain.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AWS Supply Chain asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * AWS Supply Chain is a cloud-based application that works with your enterprise resource planning (ERP) and supply
 * chain management systems. Using AWS Supply Chain, you can connect and extract your inventory, supply, and demand
 * related data from existing ERP or supply chain systems into a single data model.
 * </p>
 * <p>
 * The AWS Supply Chain API supports configuration data import for Supply Planning.
 * </p>
 * <p>
 * All AWS Supply chain API operations are Amazon-authenticated and certificate-signed. They not only require the use of
 * the AWS SDK, but also allow for the exclusive use of AWS Identity and Access Management users and roles to help
 * facilitate access, trust, and permission policies.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSSupplyChainAsyncClient extends AWSSupplyChainClient implements AWSSupplyChainAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSSupplyChainAsyncClientBuilder asyncBuilder() {
        return AWSSupplyChainAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Supply Chain using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSSupplyChainAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Supply Chain using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSSupplyChainAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<CreateBillOfMaterialsImportJobResult> createBillOfMaterialsImportJobAsync(CreateBillOfMaterialsImportJobRequest request) {

        return createBillOfMaterialsImportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateBillOfMaterialsImportJobResult> createBillOfMaterialsImportJobAsync(
            final CreateBillOfMaterialsImportJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateBillOfMaterialsImportJobRequest, CreateBillOfMaterialsImportJobResult> asyncHandler) {
        final CreateBillOfMaterialsImportJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateBillOfMaterialsImportJobResult>() {
            @Override
            public CreateBillOfMaterialsImportJobResult call() throws Exception {
                CreateBillOfMaterialsImportJobResult result = null;

                try {
                    result = executeCreateBillOfMaterialsImportJob(finalRequest);
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
    public java.util.concurrent.Future<GetBillOfMaterialsImportJobResult> getBillOfMaterialsImportJobAsync(GetBillOfMaterialsImportJobRequest request) {

        return getBillOfMaterialsImportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetBillOfMaterialsImportJobResult> getBillOfMaterialsImportJobAsync(final GetBillOfMaterialsImportJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetBillOfMaterialsImportJobRequest, GetBillOfMaterialsImportJobResult> asyncHandler) {
        final GetBillOfMaterialsImportJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetBillOfMaterialsImportJobResult>() {
            @Override
            public GetBillOfMaterialsImportJobResult call() throws Exception {
                GetBillOfMaterialsImportJobResult result = null;

                try {
                    result = executeGetBillOfMaterialsImportJob(finalRequest);
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
    public java.util.concurrent.Future<SendDataIntegrationEventResult> sendDataIntegrationEventAsync(SendDataIntegrationEventRequest request) {

        return sendDataIntegrationEventAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SendDataIntegrationEventResult> sendDataIntegrationEventAsync(final SendDataIntegrationEventRequest request,
            final com.amazonaws.handlers.AsyncHandler<SendDataIntegrationEventRequest, SendDataIntegrationEventResult> asyncHandler) {
        final SendDataIntegrationEventRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SendDataIntegrationEventResult>() {
            @Override
            public SendDataIntegrationEventResult call() throws Exception {
                SendDataIntegrationEventResult result = null;

                try {
                    result = executeSendDataIntegrationEvent(finalRequest);
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
