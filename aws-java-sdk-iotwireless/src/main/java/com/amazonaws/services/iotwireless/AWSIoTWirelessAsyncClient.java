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
package com.amazonaws.services.iotwireless;

import javax.annotation.Generated;

import com.amazonaws.services.iotwireless.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AWS IoT Wireless asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * AWS IoT Wireless API documentation
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSIoTWirelessAsyncClient extends AWSIoTWirelessClient implements AWSIoTWirelessAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSIoTWirelessAsyncClientBuilder asyncBuilder() {
        return AWSIoTWirelessAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS IoT Wireless using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSIoTWirelessAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS IoT Wireless using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSIoTWirelessAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<AssociateAwsAccountWithPartnerAccountResult> associateAwsAccountWithPartnerAccountAsync(
            AssociateAwsAccountWithPartnerAccountRequest request) {

        return associateAwsAccountWithPartnerAccountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateAwsAccountWithPartnerAccountResult> associateAwsAccountWithPartnerAccountAsync(
            final AssociateAwsAccountWithPartnerAccountRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateAwsAccountWithPartnerAccountRequest, AssociateAwsAccountWithPartnerAccountResult> asyncHandler) {
        final AssociateAwsAccountWithPartnerAccountRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateAwsAccountWithPartnerAccountResult>() {
            @Override
            public AssociateAwsAccountWithPartnerAccountResult call() throws Exception {
                AssociateAwsAccountWithPartnerAccountResult result = null;

                try {
                    result = executeAssociateAwsAccountWithPartnerAccount(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<AssociateWirelessDeviceWithThingResult> associateWirelessDeviceWithThingAsync(
            AssociateWirelessDeviceWithThingRequest request) {

        return associateWirelessDeviceWithThingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateWirelessDeviceWithThingResult> associateWirelessDeviceWithThingAsync(
            final AssociateWirelessDeviceWithThingRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateWirelessDeviceWithThingRequest, AssociateWirelessDeviceWithThingResult> asyncHandler) {
        final AssociateWirelessDeviceWithThingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateWirelessDeviceWithThingResult>() {
            @Override
            public AssociateWirelessDeviceWithThingResult call() throws Exception {
                AssociateWirelessDeviceWithThingResult result = null;

                try {
                    result = executeAssociateWirelessDeviceWithThing(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<AssociateWirelessGatewayWithCertificateResult> associateWirelessGatewayWithCertificateAsync(
            AssociateWirelessGatewayWithCertificateRequest request) {

        return associateWirelessGatewayWithCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateWirelessGatewayWithCertificateResult> associateWirelessGatewayWithCertificateAsync(
            final AssociateWirelessGatewayWithCertificateRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateWirelessGatewayWithCertificateRequest, AssociateWirelessGatewayWithCertificateResult> asyncHandler) {
        final AssociateWirelessGatewayWithCertificateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateWirelessGatewayWithCertificateResult>() {
            @Override
            public AssociateWirelessGatewayWithCertificateResult call() throws Exception {
                AssociateWirelessGatewayWithCertificateResult result = null;

                try {
                    result = executeAssociateWirelessGatewayWithCertificate(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<AssociateWirelessGatewayWithThingResult> associateWirelessGatewayWithThingAsync(
            AssociateWirelessGatewayWithThingRequest request) {

        return associateWirelessGatewayWithThingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateWirelessGatewayWithThingResult> associateWirelessGatewayWithThingAsync(
            final AssociateWirelessGatewayWithThingRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateWirelessGatewayWithThingRequest, AssociateWirelessGatewayWithThingResult> asyncHandler) {
        final AssociateWirelessGatewayWithThingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateWirelessGatewayWithThingResult>() {
            @Override
            public AssociateWirelessGatewayWithThingResult call() throws Exception {
                AssociateWirelessGatewayWithThingResult result = null;

                try {
                    result = executeAssociateWirelessGatewayWithThing(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<CreateDestinationResult> createDestinationAsync(CreateDestinationRequest request) {

        return createDestinationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDestinationResult> createDestinationAsync(final CreateDestinationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDestinationRequest, CreateDestinationResult> asyncHandler) {
        final CreateDestinationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDestinationResult>() {
            @Override
            public CreateDestinationResult call() throws Exception {
                CreateDestinationResult result = null;

                try {
                    result = executeCreateDestination(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<CreateDeviceProfileResult> createDeviceProfileAsync(CreateDeviceProfileRequest request) {

        return createDeviceProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDeviceProfileResult> createDeviceProfileAsync(final CreateDeviceProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDeviceProfileRequest, CreateDeviceProfileResult> asyncHandler) {
        final CreateDeviceProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDeviceProfileResult>() {
            @Override
            public CreateDeviceProfileResult call() throws Exception {
                CreateDeviceProfileResult result = null;

                try {
                    result = executeCreateDeviceProfile(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<CreateServiceProfileResult> createServiceProfileAsync(CreateServiceProfileRequest request) {

        return createServiceProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateServiceProfileResult> createServiceProfileAsync(final CreateServiceProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateServiceProfileRequest, CreateServiceProfileResult> asyncHandler) {
        final CreateServiceProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateServiceProfileResult>() {
            @Override
            public CreateServiceProfileResult call() throws Exception {
                CreateServiceProfileResult result = null;

                try {
                    result = executeCreateServiceProfile(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<CreateWirelessDeviceResult> createWirelessDeviceAsync(CreateWirelessDeviceRequest request) {

        return createWirelessDeviceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateWirelessDeviceResult> createWirelessDeviceAsync(final CreateWirelessDeviceRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateWirelessDeviceRequest, CreateWirelessDeviceResult> asyncHandler) {
        final CreateWirelessDeviceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateWirelessDeviceResult>() {
            @Override
            public CreateWirelessDeviceResult call() throws Exception {
                CreateWirelessDeviceResult result = null;

                try {
                    result = executeCreateWirelessDevice(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<CreateWirelessGatewayResult> createWirelessGatewayAsync(CreateWirelessGatewayRequest request) {

        return createWirelessGatewayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateWirelessGatewayResult> createWirelessGatewayAsync(final CreateWirelessGatewayRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateWirelessGatewayRequest, CreateWirelessGatewayResult> asyncHandler) {
        final CreateWirelessGatewayRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateWirelessGatewayResult>() {
            @Override
            public CreateWirelessGatewayResult call() throws Exception {
                CreateWirelessGatewayResult result = null;

                try {
                    result = executeCreateWirelessGateway(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<CreateWirelessGatewayTaskResult> createWirelessGatewayTaskAsync(CreateWirelessGatewayTaskRequest request) {

        return createWirelessGatewayTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateWirelessGatewayTaskResult> createWirelessGatewayTaskAsync(final CreateWirelessGatewayTaskRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateWirelessGatewayTaskRequest, CreateWirelessGatewayTaskResult> asyncHandler) {
        final CreateWirelessGatewayTaskRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateWirelessGatewayTaskResult>() {
            @Override
            public CreateWirelessGatewayTaskResult call() throws Exception {
                CreateWirelessGatewayTaskResult result = null;

                try {
                    result = executeCreateWirelessGatewayTask(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<CreateWirelessGatewayTaskDefinitionResult> createWirelessGatewayTaskDefinitionAsync(
            CreateWirelessGatewayTaskDefinitionRequest request) {

        return createWirelessGatewayTaskDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateWirelessGatewayTaskDefinitionResult> createWirelessGatewayTaskDefinitionAsync(
            final CreateWirelessGatewayTaskDefinitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateWirelessGatewayTaskDefinitionRequest, CreateWirelessGatewayTaskDefinitionResult> asyncHandler) {
        final CreateWirelessGatewayTaskDefinitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateWirelessGatewayTaskDefinitionResult>() {
            @Override
            public CreateWirelessGatewayTaskDefinitionResult call() throws Exception {
                CreateWirelessGatewayTaskDefinitionResult result = null;

                try {
                    result = executeCreateWirelessGatewayTaskDefinition(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DeleteDestinationResult> deleteDestinationAsync(DeleteDestinationRequest request) {

        return deleteDestinationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDestinationResult> deleteDestinationAsync(final DeleteDestinationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDestinationRequest, DeleteDestinationResult> asyncHandler) {
        final DeleteDestinationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDestinationResult>() {
            @Override
            public DeleteDestinationResult call() throws Exception {
                DeleteDestinationResult result = null;

                try {
                    result = executeDeleteDestination(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DeleteDeviceProfileResult> deleteDeviceProfileAsync(DeleteDeviceProfileRequest request) {

        return deleteDeviceProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDeviceProfileResult> deleteDeviceProfileAsync(final DeleteDeviceProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDeviceProfileRequest, DeleteDeviceProfileResult> asyncHandler) {
        final DeleteDeviceProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDeviceProfileResult>() {
            @Override
            public DeleteDeviceProfileResult call() throws Exception {
                DeleteDeviceProfileResult result = null;

                try {
                    result = executeDeleteDeviceProfile(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DeleteServiceProfileResult> deleteServiceProfileAsync(DeleteServiceProfileRequest request) {

        return deleteServiceProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteServiceProfileResult> deleteServiceProfileAsync(final DeleteServiceProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteServiceProfileRequest, DeleteServiceProfileResult> asyncHandler) {
        final DeleteServiceProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteServiceProfileResult>() {
            @Override
            public DeleteServiceProfileResult call() throws Exception {
                DeleteServiceProfileResult result = null;

                try {
                    result = executeDeleteServiceProfile(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DeleteWirelessDeviceResult> deleteWirelessDeviceAsync(DeleteWirelessDeviceRequest request) {

        return deleteWirelessDeviceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteWirelessDeviceResult> deleteWirelessDeviceAsync(final DeleteWirelessDeviceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteWirelessDeviceRequest, DeleteWirelessDeviceResult> asyncHandler) {
        final DeleteWirelessDeviceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteWirelessDeviceResult>() {
            @Override
            public DeleteWirelessDeviceResult call() throws Exception {
                DeleteWirelessDeviceResult result = null;

                try {
                    result = executeDeleteWirelessDevice(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DeleteWirelessGatewayResult> deleteWirelessGatewayAsync(DeleteWirelessGatewayRequest request) {

        return deleteWirelessGatewayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteWirelessGatewayResult> deleteWirelessGatewayAsync(final DeleteWirelessGatewayRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteWirelessGatewayRequest, DeleteWirelessGatewayResult> asyncHandler) {
        final DeleteWirelessGatewayRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteWirelessGatewayResult>() {
            @Override
            public DeleteWirelessGatewayResult call() throws Exception {
                DeleteWirelessGatewayResult result = null;

                try {
                    result = executeDeleteWirelessGateway(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DeleteWirelessGatewayTaskResult> deleteWirelessGatewayTaskAsync(DeleteWirelessGatewayTaskRequest request) {

        return deleteWirelessGatewayTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteWirelessGatewayTaskResult> deleteWirelessGatewayTaskAsync(final DeleteWirelessGatewayTaskRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteWirelessGatewayTaskRequest, DeleteWirelessGatewayTaskResult> asyncHandler) {
        final DeleteWirelessGatewayTaskRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteWirelessGatewayTaskResult>() {
            @Override
            public DeleteWirelessGatewayTaskResult call() throws Exception {
                DeleteWirelessGatewayTaskResult result = null;

                try {
                    result = executeDeleteWirelessGatewayTask(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DeleteWirelessGatewayTaskDefinitionResult> deleteWirelessGatewayTaskDefinitionAsync(
            DeleteWirelessGatewayTaskDefinitionRequest request) {

        return deleteWirelessGatewayTaskDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteWirelessGatewayTaskDefinitionResult> deleteWirelessGatewayTaskDefinitionAsync(
            final DeleteWirelessGatewayTaskDefinitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteWirelessGatewayTaskDefinitionRequest, DeleteWirelessGatewayTaskDefinitionResult> asyncHandler) {
        final DeleteWirelessGatewayTaskDefinitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteWirelessGatewayTaskDefinitionResult>() {
            @Override
            public DeleteWirelessGatewayTaskDefinitionResult call() throws Exception {
                DeleteWirelessGatewayTaskDefinitionResult result = null;

                try {
                    result = executeDeleteWirelessGatewayTaskDefinition(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DisassociateAwsAccountFromPartnerAccountResult> disassociateAwsAccountFromPartnerAccountAsync(
            DisassociateAwsAccountFromPartnerAccountRequest request) {

        return disassociateAwsAccountFromPartnerAccountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateAwsAccountFromPartnerAccountResult> disassociateAwsAccountFromPartnerAccountAsync(
            final DisassociateAwsAccountFromPartnerAccountRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateAwsAccountFromPartnerAccountRequest, DisassociateAwsAccountFromPartnerAccountResult> asyncHandler) {
        final DisassociateAwsAccountFromPartnerAccountRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateAwsAccountFromPartnerAccountResult>() {
            @Override
            public DisassociateAwsAccountFromPartnerAccountResult call() throws Exception {
                DisassociateAwsAccountFromPartnerAccountResult result = null;

                try {
                    result = executeDisassociateAwsAccountFromPartnerAccount(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DisassociateWirelessDeviceFromThingResult> disassociateWirelessDeviceFromThingAsync(
            DisassociateWirelessDeviceFromThingRequest request) {

        return disassociateWirelessDeviceFromThingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateWirelessDeviceFromThingResult> disassociateWirelessDeviceFromThingAsync(
            final DisassociateWirelessDeviceFromThingRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateWirelessDeviceFromThingRequest, DisassociateWirelessDeviceFromThingResult> asyncHandler) {
        final DisassociateWirelessDeviceFromThingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateWirelessDeviceFromThingResult>() {
            @Override
            public DisassociateWirelessDeviceFromThingResult call() throws Exception {
                DisassociateWirelessDeviceFromThingResult result = null;

                try {
                    result = executeDisassociateWirelessDeviceFromThing(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DisassociateWirelessGatewayFromCertificateResult> disassociateWirelessGatewayFromCertificateAsync(
            DisassociateWirelessGatewayFromCertificateRequest request) {

        return disassociateWirelessGatewayFromCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateWirelessGatewayFromCertificateResult> disassociateWirelessGatewayFromCertificateAsync(
            final DisassociateWirelessGatewayFromCertificateRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateWirelessGatewayFromCertificateRequest, DisassociateWirelessGatewayFromCertificateResult> asyncHandler) {
        final DisassociateWirelessGatewayFromCertificateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateWirelessGatewayFromCertificateResult>() {
            @Override
            public DisassociateWirelessGatewayFromCertificateResult call() throws Exception {
                DisassociateWirelessGatewayFromCertificateResult result = null;

                try {
                    result = executeDisassociateWirelessGatewayFromCertificate(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DisassociateWirelessGatewayFromThingResult> disassociateWirelessGatewayFromThingAsync(
            DisassociateWirelessGatewayFromThingRequest request) {

        return disassociateWirelessGatewayFromThingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateWirelessGatewayFromThingResult> disassociateWirelessGatewayFromThingAsync(
            final DisassociateWirelessGatewayFromThingRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateWirelessGatewayFromThingRequest, DisassociateWirelessGatewayFromThingResult> asyncHandler) {
        final DisassociateWirelessGatewayFromThingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateWirelessGatewayFromThingResult>() {
            @Override
            public DisassociateWirelessGatewayFromThingResult call() throws Exception {
                DisassociateWirelessGatewayFromThingResult result = null;

                try {
                    result = executeDisassociateWirelessGatewayFromThing(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<GetDestinationResult> getDestinationAsync(GetDestinationRequest request) {

        return getDestinationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDestinationResult> getDestinationAsync(final GetDestinationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDestinationRequest, GetDestinationResult> asyncHandler) {
        final GetDestinationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDestinationResult>() {
            @Override
            public GetDestinationResult call() throws Exception {
                GetDestinationResult result = null;

                try {
                    result = executeGetDestination(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<GetDeviceProfileResult> getDeviceProfileAsync(GetDeviceProfileRequest request) {

        return getDeviceProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDeviceProfileResult> getDeviceProfileAsync(final GetDeviceProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDeviceProfileRequest, GetDeviceProfileResult> asyncHandler) {
        final GetDeviceProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDeviceProfileResult>() {
            @Override
            public GetDeviceProfileResult call() throws Exception {
                GetDeviceProfileResult result = null;

                try {
                    result = executeGetDeviceProfile(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<GetLogLevelsByResourceTypesResult> getLogLevelsByResourceTypesAsync(GetLogLevelsByResourceTypesRequest request) {

        return getLogLevelsByResourceTypesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetLogLevelsByResourceTypesResult> getLogLevelsByResourceTypesAsync(final GetLogLevelsByResourceTypesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetLogLevelsByResourceTypesRequest, GetLogLevelsByResourceTypesResult> asyncHandler) {
        final GetLogLevelsByResourceTypesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetLogLevelsByResourceTypesResult>() {
            @Override
            public GetLogLevelsByResourceTypesResult call() throws Exception {
                GetLogLevelsByResourceTypesResult result = null;

                try {
                    result = executeGetLogLevelsByResourceTypes(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<GetPartnerAccountResult> getPartnerAccountAsync(GetPartnerAccountRequest request) {

        return getPartnerAccountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPartnerAccountResult> getPartnerAccountAsync(final GetPartnerAccountRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetPartnerAccountRequest, GetPartnerAccountResult> asyncHandler) {
        final GetPartnerAccountRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetPartnerAccountResult>() {
            @Override
            public GetPartnerAccountResult call() throws Exception {
                GetPartnerAccountResult result = null;

                try {
                    result = executeGetPartnerAccount(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<GetResourceLogLevelResult> getResourceLogLevelAsync(GetResourceLogLevelRequest request) {

        return getResourceLogLevelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetResourceLogLevelResult> getResourceLogLevelAsync(final GetResourceLogLevelRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetResourceLogLevelRequest, GetResourceLogLevelResult> asyncHandler) {
        final GetResourceLogLevelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetResourceLogLevelResult>() {
            @Override
            public GetResourceLogLevelResult call() throws Exception {
                GetResourceLogLevelResult result = null;

                try {
                    result = executeGetResourceLogLevel(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<GetServiceEndpointResult> getServiceEndpointAsync(GetServiceEndpointRequest request) {

        return getServiceEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetServiceEndpointResult> getServiceEndpointAsync(final GetServiceEndpointRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetServiceEndpointRequest, GetServiceEndpointResult> asyncHandler) {
        final GetServiceEndpointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetServiceEndpointResult>() {
            @Override
            public GetServiceEndpointResult call() throws Exception {
                GetServiceEndpointResult result = null;

                try {
                    result = executeGetServiceEndpoint(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<GetServiceProfileResult> getServiceProfileAsync(GetServiceProfileRequest request) {

        return getServiceProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetServiceProfileResult> getServiceProfileAsync(final GetServiceProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetServiceProfileRequest, GetServiceProfileResult> asyncHandler) {
        final GetServiceProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetServiceProfileResult>() {
            @Override
            public GetServiceProfileResult call() throws Exception {
                GetServiceProfileResult result = null;

                try {
                    result = executeGetServiceProfile(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<GetWirelessDeviceResult> getWirelessDeviceAsync(GetWirelessDeviceRequest request) {

        return getWirelessDeviceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetWirelessDeviceResult> getWirelessDeviceAsync(final GetWirelessDeviceRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetWirelessDeviceRequest, GetWirelessDeviceResult> asyncHandler) {
        final GetWirelessDeviceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetWirelessDeviceResult>() {
            @Override
            public GetWirelessDeviceResult call() throws Exception {
                GetWirelessDeviceResult result = null;

                try {
                    result = executeGetWirelessDevice(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<GetWirelessDeviceStatisticsResult> getWirelessDeviceStatisticsAsync(GetWirelessDeviceStatisticsRequest request) {

        return getWirelessDeviceStatisticsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetWirelessDeviceStatisticsResult> getWirelessDeviceStatisticsAsync(final GetWirelessDeviceStatisticsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetWirelessDeviceStatisticsRequest, GetWirelessDeviceStatisticsResult> asyncHandler) {
        final GetWirelessDeviceStatisticsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetWirelessDeviceStatisticsResult>() {
            @Override
            public GetWirelessDeviceStatisticsResult call() throws Exception {
                GetWirelessDeviceStatisticsResult result = null;

                try {
                    result = executeGetWirelessDeviceStatistics(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<GetWirelessGatewayResult> getWirelessGatewayAsync(GetWirelessGatewayRequest request) {

        return getWirelessGatewayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetWirelessGatewayResult> getWirelessGatewayAsync(final GetWirelessGatewayRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetWirelessGatewayRequest, GetWirelessGatewayResult> asyncHandler) {
        final GetWirelessGatewayRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetWirelessGatewayResult>() {
            @Override
            public GetWirelessGatewayResult call() throws Exception {
                GetWirelessGatewayResult result = null;

                try {
                    result = executeGetWirelessGateway(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<GetWirelessGatewayCertificateResult> getWirelessGatewayCertificateAsync(GetWirelessGatewayCertificateRequest request) {

        return getWirelessGatewayCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetWirelessGatewayCertificateResult> getWirelessGatewayCertificateAsync(
            final GetWirelessGatewayCertificateRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetWirelessGatewayCertificateRequest, GetWirelessGatewayCertificateResult> asyncHandler) {
        final GetWirelessGatewayCertificateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetWirelessGatewayCertificateResult>() {
            @Override
            public GetWirelessGatewayCertificateResult call() throws Exception {
                GetWirelessGatewayCertificateResult result = null;

                try {
                    result = executeGetWirelessGatewayCertificate(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<GetWirelessGatewayFirmwareInformationResult> getWirelessGatewayFirmwareInformationAsync(
            GetWirelessGatewayFirmwareInformationRequest request) {

        return getWirelessGatewayFirmwareInformationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetWirelessGatewayFirmwareInformationResult> getWirelessGatewayFirmwareInformationAsync(
            final GetWirelessGatewayFirmwareInformationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetWirelessGatewayFirmwareInformationRequest, GetWirelessGatewayFirmwareInformationResult> asyncHandler) {
        final GetWirelessGatewayFirmwareInformationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetWirelessGatewayFirmwareInformationResult>() {
            @Override
            public GetWirelessGatewayFirmwareInformationResult call() throws Exception {
                GetWirelessGatewayFirmwareInformationResult result = null;

                try {
                    result = executeGetWirelessGatewayFirmwareInformation(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<GetWirelessGatewayStatisticsResult> getWirelessGatewayStatisticsAsync(GetWirelessGatewayStatisticsRequest request) {

        return getWirelessGatewayStatisticsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetWirelessGatewayStatisticsResult> getWirelessGatewayStatisticsAsync(final GetWirelessGatewayStatisticsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetWirelessGatewayStatisticsRequest, GetWirelessGatewayStatisticsResult> asyncHandler) {
        final GetWirelessGatewayStatisticsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetWirelessGatewayStatisticsResult>() {
            @Override
            public GetWirelessGatewayStatisticsResult call() throws Exception {
                GetWirelessGatewayStatisticsResult result = null;

                try {
                    result = executeGetWirelessGatewayStatistics(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<GetWirelessGatewayTaskResult> getWirelessGatewayTaskAsync(GetWirelessGatewayTaskRequest request) {

        return getWirelessGatewayTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetWirelessGatewayTaskResult> getWirelessGatewayTaskAsync(final GetWirelessGatewayTaskRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetWirelessGatewayTaskRequest, GetWirelessGatewayTaskResult> asyncHandler) {
        final GetWirelessGatewayTaskRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetWirelessGatewayTaskResult>() {
            @Override
            public GetWirelessGatewayTaskResult call() throws Exception {
                GetWirelessGatewayTaskResult result = null;

                try {
                    result = executeGetWirelessGatewayTask(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<GetWirelessGatewayTaskDefinitionResult> getWirelessGatewayTaskDefinitionAsync(
            GetWirelessGatewayTaskDefinitionRequest request) {

        return getWirelessGatewayTaskDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetWirelessGatewayTaskDefinitionResult> getWirelessGatewayTaskDefinitionAsync(
            final GetWirelessGatewayTaskDefinitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetWirelessGatewayTaskDefinitionRequest, GetWirelessGatewayTaskDefinitionResult> asyncHandler) {
        final GetWirelessGatewayTaskDefinitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetWirelessGatewayTaskDefinitionResult>() {
            @Override
            public GetWirelessGatewayTaskDefinitionResult call() throws Exception {
                GetWirelessGatewayTaskDefinitionResult result = null;

                try {
                    result = executeGetWirelessGatewayTaskDefinition(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<ListDestinationsResult> listDestinationsAsync(ListDestinationsRequest request) {

        return listDestinationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDestinationsResult> listDestinationsAsync(final ListDestinationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDestinationsRequest, ListDestinationsResult> asyncHandler) {
        final ListDestinationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDestinationsResult>() {
            @Override
            public ListDestinationsResult call() throws Exception {
                ListDestinationsResult result = null;

                try {
                    result = executeListDestinations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<ListDeviceProfilesResult> listDeviceProfilesAsync(ListDeviceProfilesRequest request) {

        return listDeviceProfilesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDeviceProfilesResult> listDeviceProfilesAsync(final ListDeviceProfilesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDeviceProfilesRequest, ListDeviceProfilesResult> asyncHandler) {
        final ListDeviceProfilesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDeviceProfilesResult>() {
            @Override
            public ListDeviceProfilesResult call() throws Exception {
                ListDeviceProfilesResult result = null;

                try {
                    result = executeListDeviceProfiles(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<ListPartnerAccountsResult> listPartnerAccountsAsync(ListPartnerAccountsRequest request) {

        return listPartnerAccountsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPartnerAccountsResult> listPartnerAccountsAsync(final ListPartnerAccountsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPartnerAccountsRequest, ListPartnerAccountsResult> asyncHandler) {
        final ListPartnerAccountsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPartnerAccountsResult>() {
            @Override
            public ListPartnerAccountsResult call() throws Exception {
                ListPartnerAccountsResult result = null;

                try {
                    result = executeListPartnerAccounts(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<ListServiceProfilesResult> listServiceProfilesAsync(ListServiceProfilesRequest request) {

        return listServiceProfilesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListServiceProfilesResult> listServiceProfilesAsync(final ListServiceProfilesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListServiceProfilesRequest, ListServiceProfilesResult> asyncHandler) {
        final ListServiceProfilesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListServiceProfilesResult>() {
            @Override
            public ListServiceProfilesResult call() throws Exception {
                ListServiceProfilesResult result = null;

                try {
                    result = executeListServiceProfiles(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<ListWirelessDevicesResult> listWirelessDevicesAsync(ListWirelessDevicesRequest request) {

        return listWirelessDevicesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListWirelessDevicesResult> listWirelessDevicesAsync(final ListWirelessDevicesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListWirelessDevicesRequest, ListWirelessDevicesResult> asyncHandler) {
        final ListWirelessDevicesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListWirelessDevicesResult>() {
            @Override
            public ListWirelessDevicesResult call() throws Exception {
                ListWirelessDevicesResult result = null;

                try {
                    result = executeListWirelessDevices(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<ListWirelessGatewayTaskDefinitionsResult> listWirelessGatewayTaskDefinitionsAsync(
            ListWirelessGatewayTaskDefinitionsRequest request) {

        return listWirelessGatewayTaskDefinitionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListWirelessGatewayTaskDefinitionsResult> listWirelessGatewayTaskDefinitionsAsync(
            final ListWirelessGatewayTaskDefinitionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListWirelessGatewayTaskDefinitionsRequest, ListWirelessGatewayTaskDefinitionsResult> asyncHandler) {
        final ListWirelessGatewayTaskDefinitionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListWirelessGatewayTaskDefinitionsResult>() {
            @Override
            public ListWirelessGatewayTaskDefinitionsResult call() throws Exception {
                ListWirelessGatewayTaskDefinitionsResult result = null;

                try {
                    result = executeListWirelessGatewayTaskDefinitions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<ListWirelessGatewaysResult> listWirelessGatewaysAsync(ListWirelessGatewaysRequest request) {

        return listWirelessGatewaysAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListWirelessGatewaysResult> listWirelessGatewaysAsync(final ListWirelessGatewaysRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListWirelessGatewaysRequest, ListWirelessGatewaysResult> asyncHandler) {
        final ListWirelessGatewaysRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListWirelessGatewaysResult>() {
            @Override
            public ListWirelessGatewaysResult call() throws Exception {
                ListWirelessGatewaysResult result = null;

                try {
                    result = executeListWirelessGateways(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<PutResourceLogLevelResult> putResourceLogLevelAsync(PutResourceLogLevelRequest request) {

        return putResourceLogLevelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutResourceLogLevelResult> putResourceLogLevelAsync(final PutResourceLogLevelRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutResourceLogLevelRequest, PutResourceLogLevelResult> asyncHandler) {
        final PutResourceLogLevelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutResourceLogLevelResult>() {
            @Override
            public PutResourceLogLevelResult call() throws Exception {
                PutResourceLogLevelResult result = null;

                try {
                    result = executePutResourceLogLevel(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<ResetAllResourceLogLevelsResult> resetAllResourceLogLevelsAsync(ResetAllResourceLogLevelsRequest request) {

        return resetAllResourceLogLevelsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ResetAllResourceLogLevelsResult> resetAllResourceLogLevelsAsync(final ResetAllResourceLogLevelsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ResetAllResourceLogLevelsRequest, ResetAllResourceLogLevelsResult> asyncHandler) {
        final ResetAllResourceLogLevelsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ResetAllResourceLogLevelsResult>() {
            @Override
            public ResetAllResourceLogLevelsResult call() throws Exception {
                ResetAllResourceLogLevelsResult result = null;

                try {
                    result = executeResetAllResourceLogLevels(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<ResetResourceLogLevelResult> resetResourceLogLevelAsync(ResetResourceLogLevelRequest request) {

        return resetResourceLogLevelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ResetResourceLogLevelResult> resetResourceLogLevelAsync(final ResetResourceLogLevelRequest request,
            final com.amazonaws.handlers.AsyncHandler<ResetResourceLogLevelRequest, ResetResourceLogLevelResult> asyncHandler) {
        final ResetResourceLogLevelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ResetResourceLogLevelResult>() {
            @Override
            public ResetResourceLogLevelResult call() throws Exception {
                ResetResourceLogLevelResult result = null;

                try {
                    result = executeResetResourceLogLevel(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<SendDataToWirelessDeviceResult> sendDataToWirelessDeviceAsync(SendDataToWirelessDeviceRequest request) {

        return sendDataToWirelessDeviceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SendDataToWirelessDeviceResult> sendDataToWirelessDeviceAsync(final SendDataToWirelessDeviceRequest request,
            final com.amazonaws.handlers.AsyncHandler<SendDataToWirelessDeviceRequest, SendDataToWirelessDeviceResult> asyncHandler) {
        final SendDataToWirelessDeviceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SendDataToWirelessDeviceResult>() {
            @Override
            public SendDataToWirelessDeviceResult call() throws Exception {
                SendDataToWirelessDeviceResult result = null;

                try {
                    result = executeSendDataToWirelessDevice(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<TestWirelessDeviceResult> testWirelessDeviceAsync(TestWirelessDeviceRequest request) {

        return testWirelessDeviceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TestWirelessDeviceResult> testWirelessDeviceAsync(final TestWirelessDeviceRequest request,
            final com.amazonaws.handlers.AsyncHandler<TestWirelessDeviceRequest, TestWirelessDeviceResult> asyncHandler) {
        final TestWirelessDeviceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<TestWirelessDeviceResult>() {
            @Override
            public TestWirelessDeviceResult call() throws Exception {
                TestWirelessDeviceResult result = null;

                try {
                    result = executeTestWirelessDevice(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<UpdateDestinationResult> updateDestinationAsync(UpdateDestinationRequest request) {

        return updateDestinationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDestinationResult> updateDestinationAsync(final UpdateDestinationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDestinationRequest, UpdateDestinationResult> asyncHandler) {
        final UpdateDestinationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateDestinationResult>() {
            @Override
            public UpdateDestinationResult call() throws Exception {
                UpdateDestinationResult result = null;

                try {
                    result = executeUpdateDestination(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<UpdateLogLevelsByResourceTypesResult> updateLogLevelsByResourceTypesAsync(UpdateLogLevelsByResourceTypesRequest request) {

        return updateLogLevelsByResourceTypesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateLogLevelsByResourceTypesResult> updateLogLevelsByResourceTypesAsync(
            final UpdateLogLevelsByResourceTypesRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateLogLevelsByResourceTypesRequest, UpdateLogLevelsByResourceTypesResult> asyncHandler) {
        final UpdateLogLevelsByResourceTypesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateLogLevelsByResourceTypesResult>() {
            @Override
            public UpdateLogLevelsByResourceTypesResult call() throws Exception {
                UpdateLogLevelsByResourceTypesResult result = null;

                try {
                    result = executeUpdateLogLevelsByResourceTypes(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<UpdatePartnerAccountResult> updatePartnerAccountAsync(UpdatePartnerAccountRequest request) {

        return updatePartnerAccountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdatePartnerAccountResult> updatePartnerAccountAsync(final UpdatePartnerAccountRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdatePartnerAccountRequest, UpdatePartnerAccountResult> asyncHandler) {
        final UpdatePartnerAccountRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdatePartnerAccountResult>() {
            @Override
            public UpdatePartnerAccountResult call() throws Exception {
                UpdatePartnerAccountResult result = null;

                try {
                    result = executeUpdatePartnerAccount(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<UpdateWirelessDeviceResult> updateWirelessDeviceAsync(UpdateWirelessDeviceRequest request) {

        return updateWirelessDeviceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateWirelessDeviceResult> updateWirelessDeviceAsync(final UpdateWirelessDeviceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateWirelessDeviceRequest, UpdateWirelessDeviceResult> asyncHandler) {
        final UpdateWirelessDeviceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateWirelessDeviceResult>() {
            @Override
            public UpdateWirelessDeviceResult call() throws Exception {
                UpdateWirelessDeviceResult result = null;

                try {
                    result = executeUpdateWirelessDevice(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<UpdateWirelessGatewayResult> updateWirelessGatewayAsync(UpdateWirelessGatewayRequest request) {

        return updateWirelessGatewayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateWirelessGatewayResult> updateWirelessGatewayAsync(final UpdateWirelessGatewayRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateWirelessGatewayRequest, UpdateWirelessGatewayResult> asyncHandler) {
        final UpdateWirelessGatewayRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateWirelessGatewayResult>() {
            @Override
            public UpdateWirelessGatewayResult call() throws Exception {
                UpdateWirelessGatewayResult result = null;

                try {
                    result = executeUpdateWirelessGateway(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
