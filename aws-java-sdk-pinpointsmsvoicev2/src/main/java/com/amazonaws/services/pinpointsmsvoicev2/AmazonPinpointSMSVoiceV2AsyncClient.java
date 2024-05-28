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
package com.amazonaws.services.pinpointsmsvoicev2;

import javax.annotation.Generated;

import com.amazonaws.services.pinpointsmsvoicev2.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Amazon Pinpoint SMS Voice V2 asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Welcome to the <i>Amazon Pinpoint SMS and Voice, version 2 API Reference</i>. This guide provides information about
 * Amazon Pinpoint SMS and Voice, version 2 API resources, including supported HTTP methods, parameters, and schemas.
 * </p>
 * <p>
 * Amazon Pinpoint is an Amazon Web Services service that you can use to engage with your recipients across multiple
 * messaging channels. The Amazon Pinpoint SMS and Voice, version 2 API provides programmatic access to options that are
 * unique to the SMS and voice channels. Amazon Pinpoint SMS and Voice, version 2 resources such as phone numbers,
 * sender IDs, and opt-out lists can be used by the Amazon Pinpoint API.
 * </p>
 * <p>
 * If you're new to Amazon Pinpoint SMS, it's also helpful to review the <a
 * href="https://docs.aws.amazon.com/sms-voice/latest/userguide/what-is-service.html"> Amazon Pinpoint SMS User
 * Guide</a>. The <i>Amazon Pinpoint Developer Guide</i> provides tutorials, code samples, and procedures that
 * demonstrate how to use Amazon Pinpoint SMS features programmatically and how to integrate Amazon Pinpoint
 * functionality into mobile apps and other types of applications. The guide also provides key information, such as
 * Amazon Pinpoint integration with other Amazon Web Services services, and the quotas that apply to use of the service.
 * </p>
 * <p>
 * <b>Regional availability</b>
 * </p>
 * <p>
 * The <i>Amazon Pinpoint SMS and Voice, version 2 API Reference</i> is available in several Amazon Web Services Regions
 * and it provides an endpoint for each of these Regions. For a list of all the Regions and endpoints where the API is
 * currently available, see <a href="https://docs.aws.amazon.com/general/latest/gr/rande.html#pinpoint_region">Amazon
 * Web Services Service Endpoints</a> and <a href="https://docs.aws.amazon.com/general/latest/gr/pinpoint.html">Amazon
 * Pinpoint endpoints and quotas</a> in the Amazon Web Services General Reference. To learn more about Amazon Web
 * Services Regions, see <a href="https://docs.aws.amazon.com/general/latest/gr/rande-manage.html">Managing Amazon Web
 * Services Regions</a> in the Amazon Web Services General Reference.
 * </p>
 * <p>
 * In each Region, Amazon Web Services maintains multiple Availability Zones. These Availability Zones are physically
 * isolated from each other, but are united by private, low-latency, high-throughput, and highly redundant network
 * connections. These Availability Zones enable us to provide very high levels of availability and redundancy, while
 * also minimizing latency. To learn more about the number of Availability Zones that are available in each Region, see
 * <a href="https://aws.amazon.com/about-aws/global-infrastructure/">Amazon Web Services Global Infrastructure.</a>
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonPinpointSMSVoiceV2AsyncClient extends AmazonPinpointSMSVoiceV2Client implements AmazonPinpointSMSVoiceV2Async {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonPinpointSMSVoiceV2AsyncClientBuilder asyncBuilder() {
        return AmazonPinpointSMSVoiceV2AsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Pinpoint SMS Voice V2 using the
     * specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonPinpointSMSVoiceV2AsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Pinpoint SMS Voice V2 using the
     * specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonPinpointSMSVoiceV2AsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<AssociateOriginationIdentityResult> associateOriginationIdentityAsync(AssociateOriginationIdentityRequest request) {

        return associateOriginationIdentityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateOriginationIdentityResult> associateOriginationIdentityAsync(final AssociateOriginationIdentityRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateOriginationIdentityRequest, AssociateOriginationIdentityResult> asyncHandler) {
        final AssociateOriginationIdentityRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateOriginationIdentityResult>() {
            @Override
            public AssociateOriginationIdentityResult call() throws Exception {
                AssociateOriginationIdentityResult result = null;

                try {
                    result = executeAssociateOriginationIdentity(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<AssociateProtectConfigurationResult> associateProtectConfigurationAsync(AssociateProtectConfigurationRequest request) {

        return associateProtectConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateProtectConfigurationResult> associateProtectConfigurationAsync(
            final AssociateProtectConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateProtectConfigurationRequest, AssociateProtectConfigurationResult> asyncHandler) {
        final AssociateProtectConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateProtectConfigurationResult>() {
            @Override
            public AssociateProtectConfigurationResult call() throws Exception {
                AssociateProtectConfigurationResult result = null;

                try {
                    result = executeAssociateProtectConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateConfigurationSetResult> createConfigurationSetAsync(CreateConfigurationSetRequest request) {

        return createConfigurationSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateConfigurationSetResult> createConfigurationSetAsync(final CreateConfigurationSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateConfigurationSetRequest, CreateConfigurationSetResult> asyncHandler) {
        final CreateConfigurationSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateConfigurationSetResult>() {
            @Override
            public CreateConfigurationSetResult call() throws Exception {
                CreateConfigurationSetResult result = null;

                try {
                    result = executeCreateConfigurationSet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateEventDestinationResult> createEventDestinationAsync(CreateEventDestinationRequest request) {

        return createEventDestinationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateEventDestinationResult> createEventDestinationAsync(final CreateEventDestinationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateEventDestinationRequest, CreateEventDestinationResult> asyncHandler) {
        final CreateEventDestinationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateEventDestinationResult>() {
            @Override
            public CreateEventDestinationResult call() throws Exception {
                CreateEventDestinationResult result = null;

                try {
                    result = executeCreateEventDestination(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateOptOutListResult> createOptOutListAsync(CreateOptOutListRequest request) {

        return createOptOutListAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateOptOutListResult> createOptOutListAsync(final CreateOptOutListRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateOptOutListRequest, CreateOptOutListResult> asyncHandler) {
        final CreateOptOutListRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateOptOutListResult>() {
            @Override
            public CreateOptOutListResult call() throws Exception {
                CreateOptOutListResult result = null;

                try {
                    result = executeCreateOptOutList(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreatePoolResult> createPoolAsync(CreatePoolRequest request) {

        return createPoolAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePoolResult> createPoolAsync(final CreatePoolRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreatePoolRequest, CreatePoolResult> asyncHandler) {
        final CreatePoolRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreatePoolResult>() {
            @Override
            public CreatePoolResult call() throws Exception {
                CreatePoolResult result = null;

                try {
                    result = executeCreatePool(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateProtectConfigurationResult> createProtectConfigurationAsync(CreateProtectConfigurationRequest request) {

        return createProtectConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateProtectConfigurationResult> createProtectConfigurationAsync(final CreateProtectConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateProtectConfigurationRequest, CreateProtectConfigurationResult> asyncHandler) {
        final CreateProtectConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateProtectConfigurationResult>() {
            @Override
            public CreateProtectConfigurationResult call() throws Exception {
                CreateProtectConfigurationResult result = null;

                try {
                    result = executeCreateProtectConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateRegistrationResult> createRegistrationAsync(CreateRegistrationRequest request) {

        return createRegistrationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRegistrationResult> createRegistrationAsync(final CreateRegistrationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateRegistrationRequest, CreateRegistrationResult> asyncHandler) {
        final CreateRegistrationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateRegistrationResult>() {
            @Override
            public CreateRegistrationResult call() throws Exception {
                CreateRegistrationResult result = null;

                try {
                    result = executeCreateRegistration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateRegistrationAssociationResult> createRegistrationAssociationAsync(CreateRegistrationAssociationRequest request) {

        return createRegistrationAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRegistrationAssociationResult> createRegistrationAssociationAsync(
            final CreateRegistrationAssociationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateRegistrationAssociationRequest, CreateRegistrationAssociationResult> asyncHandler) {
        final CreateRegistrationAssociationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateRegistrationAssociationResult>() {
            @Override
            public CreateRegistrationAssociationResult call() throws Exception {
                CreateRegistrationAssociationResult result = null;

                try {
                    result = executeCreateRegistrationAssociation(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateRegistrationAttachmentResult> createRegistrationAttachmentAsync(CreateRegistrationAttachmentRequest request) {

        return createRegistrationAttachmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRegistrationAttachmentResult> createRegistrationAttachmentAsync(final CreateRegistrationAttachmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateRegistrationAttachmentRequest, CreateRegistrationAttachmentResult> asyncHandler) {
        final CreateRegistrationAttachmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateRegistrationAttachmentResult>() {
            @Override
            public CreateRegistrationAttachmentResult call() throws Exception {
                CreateRegistrationAttachmentResult result = null;

                try {
                    result = executeCreateRegistrationAttachment(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateRegistrationVersionResult> createRegistrationVersionAsync(CreateRegistrationVersionRequest request) {

        return createRegistrationVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRegistrationVersionResult> createRegistrationVersionAsync(final CreateRegistrationVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateRegistrationVersionRequest, CreateRegistrationVersionResult> asyncHandler) {
        final CreateRegistrationVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateRegistrationVersionResult>() {
            @Override
            public CreateRegistrationVersionResult call() throws Exception {
                CreateRegistrationVersionResult result = null;

                try {
                    result = executeCreateRegistrationVersion(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateVerifiedDestinationNumberResult> createVerifiedDestinationNumberAsync(
            CreateVerifiedDestinationNumberRequest request) {

        return createVerifiedDestinationNumberAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateVerifiedDestinationNumberResult> createVerifiedDestinationNumberAsync(
            final CreateVerifiedDestinationNumberRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateVerifiedDestinationNumberRequest, CreateVerifiedDestinationNumberResult> asyncHandler) {
        final CreateVerifiedDestinationNumberRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateVerifiedDestinationNumberResult>() {
            @Override
            public CreateVerifiedDestinationNumberResult call() throws Exception {
                CreateVerifiedDestinationNumberResult result = null;

                try {
                    result = executeCreateVerifiedDestinationNumber(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteAccountDefaultProtectConfigurationResult> deleteAccountDefaultProtectConfigurationAsync(
            DeleteAccountDefaultProtectConfigurationRequest request) {

        return deleteAccountDefaultProtectConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAccountDefaultProtectConfigurationResult> deleteAccountDefaultProtectConfigurationAsync(
            final DeleteAccountDefaultProtectConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAccountDefaultProtectConfigurationRequest, DeleteAccountDefaultProtectConfigurationResult> asyncHandler) {
        final DeleteAccountDefaultProtectConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAccountDefaultProtectConfigurationResult>() {
            @Override
            public DeleteAccountDefaultProtectConfigurationResult call() throws Exception {
                DeleteAccountDefaultProtectConfigurationResult result = null;

                try {
                    result = executeDeleteAccountDefaultProtectConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteConfigurationSetResult> deleteConfigurationSetAsync(DeleteConfigurationSetRequest request) {

        return deleteConfigurationSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteConfigurationSetResult> deleteConfigurationSetAsync(final DeleteConfigurationSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteConfigurationSetRequest, DeleteConfigurationSetResult> asyncHandler) {
        final DeleteConfigurationSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteConfigurationSetResult>() {
            @Override
            public DeleteConfigurationSetResult call() throws Exception {
                DeleteConfigurationSetResult result = null;

                try {
                    result = executeDeleteConfigurationSet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteDefaultMessageTypeResult> deleteDefaultMessageTypeAsync(DeleteDefaultMessageTypeRequest request) {

        return deleteDefaultMessageTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDefaultMessageTypeResult> deleteDefaultMessageTypeAsync(final DeleteDefaultMessageTypeRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDefaultMessageTypeRequest, DeleteDefaultMessageTypeResult> asyncHandler) {
        final DeleteDefaultMessageTypeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDefaultMessageTypeResult>() {
            @Override
            public DeleteDefaultMessageTypeResult call() throws Exception {
                DeleteDefaultMessageTypeResult result = null;

                try {
                    result = executeDeleteDefaultMessageType(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteDefaultSenderIdResult> deleteDefaultSenderIdAsync(DeleteDefaultSenderIdRequest request) {

        return deleteDefaultSenderIdAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDefaultSenderIdResult> deleteDefaultSenderIdAsync(final DeleteDefaultSenderIdRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDefaultSenderIdRequest, DeleteDefaultSenderIdResult> asyncHandler) {
        final DeleteDefaultSenderIdRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDefaultSenderIdResult>() {
            @Override
            public DeleteDefaultSenderIdResult call() throws Exception {
                DeleteDefaultSenderIdResult result = null;

                try {
                    result = executeDeleteDefaultSenderId(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteEventDestinationResult> deleteEventDestinationAsync(DeleteEventDestinationRequest request) {

        return deleteEventDestinationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteEventDestinationResult> deleteEventDestinationAsync(final DeleteEventDestinationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteEventDestinationRequest, DeleteEventDestinationResult> asyncHandler) {
        final DeleteEventDestinationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteEventDestinationResult>() {
            @Override
            public DeleteEventDestinationResult call() throws Exception {
                DeleteEventDestinationResult result = null;

                try {
                    result = executeDeleteEventDestination(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteKeywordResult> deleteKeywordAsync(DeleteKeywordRequest request) {

        return deleteKeywordAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteKeywordResult> deleteKeywordAsync(final DeleteKeywordRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteKeywordRequest, DeleteKeywordResult> asyncHandler) {
        final DeleteKeywordRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteKeywordResult>() {
            @Override
            public DeleteKeywordResult call() throws Exception {
                DeleteKeywordResult result = null;

                try {
                    result = executeDeleteKeyword(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteMediaMessageSpendLimitOverrideResult> deleteMediaMessageSpendLimitOverrideAsync(
            DeleteMediaMessageSpendLimitOverrideRequest request) {

        return deleteMediaMessageSpendLimitOverrideAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteMediaMessageSpendLimitOverrideResult> deleteMediaMessageSpendLimitOverrideAsync(
            final DeleteMediaMessageSpendLimitOverrideRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteMediaMessageSpendLimitOverrideRequest, DeleteMediaMessageSpendLimitOverrideResult> asyncHandler) {
        final DeleteMediaMessageSpendLimitOverrideRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteMediaMessageSpendLimitOverrideResult>() {
            @Override
            public DeleteMediaMessageSpendLimitOverrideResult call() throws Exception {
                DeleteMediaMessageSpendLimitOverrideResult result = null;

                try {
                    result = executeDeleteMediaMessageSpendLimitOverride(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteOptOutListResult> deleteOptOutListAsync(DeleteOptOutListRequest request) {

        return deleteOptOutListAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteOptOutListResult> deleteOptOutListAsync(final DeleteOptOutListRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteOptOutListRequest, DeleteOptOutListResult> asyncHandler) {
        final DeleteOptOutListRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteOptOutListResult>() {
            @Override
            public DeleteOptOutListResult call() throws Exception {
                DeleteOptOutListResult result = null;

                try {
                    result = executeDeleteOptOutList(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteOptedOutNumberResult> deleteOptedOutNumberAsync(DeleteOptedOutNumberRequest request) {

        return deleteOptedOutNumberAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteOptedOutNumberResult> deleteOptedOutNumberAsync(final DeleteOptedOutNumberRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteOptedOutNumberRequest, DeleteOptedOutNumberResult> asyncHandler) {
        final DeleteOptedOutNumberRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteOptedOutNumberResult>() {
            @Override
            public DeleteOptedOutNumberResult call() throws Exception {
                DeleteOptedOutNumberResult result = null;

                try {
                    result = executeDeleteOptedOutNumber(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeletePoolResult> deletePoolAsync(DeletePoolRequest request) {

        return deletePoolAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePoolResult> deletePoolAsync(final DeletePoolRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeletePoolRequest, DeletePoolResult> asyncHandler) {
        final DeletePoolRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeletePoolResult>() {
            @Override
            public DeletePoolResult call() throws Exception {
                DeletePoolResult result = null;

                try {
                    result = executeDeletePool(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteProtectConfigurationResult> deleteProtectConfigurationAsync(DeleteProtectConfigurationRequest request) {

        return deleteProtectConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteProtectConfigurationResult> deleteProtectConfigurationAsync(final DeleteProtectConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteProtectConfigurationRequest, DeleteProtectConfigurationResult> asyncHandler) {
        final DeleteProtectConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteProtectConfigurationResult>() {
            @Override
            public DeleteProtectConfigurationResult call() throws Exception {
                DeleteProtectConfigurationResult result = null;

                try {
                    result = executeDeleteProtectConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteRegistrationResult> deleteRegistrationAsync(DeleteRegistrationRequest request) {

        return deleteRegistrationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRegistrationResult> deleteRegistrationAsync(final DeleteRegistrationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteRegistrationRequest, DeleteRegistrationResult> asyncHandler) {
        final DeleteRegistrationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteRegistrationResult>() {
            @Override
            public DeleteRegistrationResult call() throws Exception {
                DeleteRegistrationResult result = null;

                try {
                    result = executeDeleteRegistration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteRegistrationAttachmentResult> deleteRegistrationAttachmentAsync(DeleteRegistrationAttachmentRequest request) {

        return deleteRegistrationAttachmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRegistrationAttachmentResult> deleteRegistrationAttachmentAsync(final DeleteRegistrationAttachmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteRegistrationAttachmentRequest, DeleteRegistrationAttachmentResult> asyncHandler) {
        final DeleteRegistrationAttachmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteRegistrationAttachmentResult>() {
            @Override
            public DeleteRegistrationAttachmentResult call() throws Exception {
                DeleteRegistrationAttachmentResult result = null;

                try {
                    result = executeDeleteRegistrationAttachment(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteRegistrationFieldValueResult> deleteRegistrationFieldValueAsync(DeleteRegistrationFieldValueRequest request) {

        return deleteRegistrationFieldValueAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRegistrationFieldValueResult> deleteRegistrationFieldValueAsync(final DeleteRegistrationFieldValueRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteRegistrationFieldValueRequest, DeleteRegistrationFieldValueResult> asyncHandler) {
        final DeleteRegistrationFieldValueRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteRegistrationFieldValueResult>() {
            @Override
            public DeleteRegistrationFieldValueResult call() throws Exception {
                DeleteRegistrationFieldValueResult result = null;

                try {
                    result = executeDeleteRegistrationFieldValue(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteTextMessageSpendLimitOverrideResult> deleteTextMessageSpendLimitOverrideAsync(
            DeleteTextMessageSpendLimitOverrideRequest request) {

        return deleteTextMessageSpendLimitOverrideAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTextMessageSpendLimitOverrideResult> deleteTextMessageSpendLimitOverrideAsync(
            final DeleteTextMessageSpendLimitOverrideRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteTextMessageSpendLimitOverrideRequest, DeleteTextMessageSpendLimitOverrideResult> asyncHandler) {
        final DeleteTextMessageSpendLimitOverrideRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteTextMessageSpendLimitOverrideResult>() {
            @Override
            public DeleteTextMessageSpendLimitOverrideResult call() throws Exception {
                DeleteTextMessageSpendLimitOverrideResult result = null;

                try {
                    result = executeDeleteTextMessageSpendLimitOverride(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteVerifiedDestinationNumberResult> deleteVerifiedDestinationNumberAsync(
            DeleteVerifiedDestinationNumberRequest request) {

        return deleteVerifiedDestinationNumberAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteVerifiedDestinationNumberResult> deleteVerifiedDestinationNumberAsync(
            final DeleteVerifiedDestinationNumberRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteVerifiedDestinationNumberRequest, DeleteVerifiedDestinationNumberResult> asyncHandler) {
        final DeleteVerifiedDestinationNumberRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteVerifiedDestinationNumberResult>() {
            @Override
            public DeleteVerifiedDestinationNumberResult call() throws Exception {
                DeleteVerifiedDestinationNumberResult result = null;

                try {
                    result = executeDeleteVerifiedDestinationNumber(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteVoiceMessageSpendLimitOverrideResult> deleteVoiceMessageSpendLimitOverrideAsync(
            DeleteVoiceMessageSpendLimitOverrideRequest request) {

        return deleteVoiceMessageSpendLimitOverrideAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteVoiceMessageSpendLimitOverrideResult> deleteVoiceMessageSpendLimitOverrideAsync(
            final DeleteVoiceMessageSpendLimitOverrideRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteVoiceMessageSpendLimitOverrideRequest, DeleteVoiceMessageSpendLimitOverrideResult> asyncHandler) {
        final DeleteVoiceMessageSpendLimitOverrideRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteVoiceMessageSpendLimitOverrideResult>() {
            @Override
            public DeleteVoiceMessageSpendLimitOverrideResult call() throws Exception {
                DeleteVoiceMessageSpendLimitOverrideResult result = null;

                try {
                    result = executeDeleteVoiceMessageSpendLimitOverride(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeAccountAttributesResult> describeAccountAttributesAsync(DescribeAccountAttributesRequest request) {

        return describeAccountAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAccountAttributesResult> describeAccountAttributesAsync(final DescribeAccountAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAccountAttributesRequest, DescribeAccountAttributesResult> asyncHandler) {
        final DescribeAccountAttributesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeAccountAttributesResult>() {
            @Override
            public DescribeAccountAttributesResult call() throws Exception {
                DescribeAccountAttributesResult result = null;

                try {
                    result = executeDescribeAccountAttributes(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeAccountLimitsResult> describeAccountLimitsAsync(DescribeAccountLimitsRequest request) {

        return describeAccountLimitsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAccountLimitsResult> describeAccountLimitsAsync(final DescribeAccountLimitsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAccountLimitsRequest, DescribeAccountLimitsResult> asyncHandler) {
        final DescribeAccountLimitsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeAccountLimitsResult>() {
            @Override
            public DescribeAccountLimitsResult call() throws Exception {
                DescribeAccountLimitsResult result = null;

                try {
                    result = executeDescribeAccountLimits(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeConfigurationSetsResult> describeConfigurationSetsAsync(DescribeConfigurationSetsRequest request) {

        return describeConfigurationSetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeConfigurationSetsResult> describeConfigurationSetsAsync(final DescribeConfigurationSetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeConfigurationSetsRequest, DescribeConfigurationSetsResult> asyncHandler) {
        final DescribeConfigurationSetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeConfigurationSetsResult>() {
            @Override
            public DescribeConfigurationSetsResult call() throws Exception {
                DescribeConfigurationSetsResult result = null;

                try {
                    result = executeDescribeConfigurationSets(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeKeywordsResult> describeKeywordsAsync(DescribeKeywordsRequest request) {

        return describeKeywordsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeKeywordsResult> describeKeywordsAsync(final DescribeKeywordsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeKeywordsRequest, DescribeKeywordsResult> asyncHandler) {
        final DescribeKeywordsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeKeywordsResult>() {
            @Override
            public DescribeKeywordsResult call() throws Exception {
                DescribeKeywordsResult result = null;

                try {
                    result = executeDescribeKeywords(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeOptOutListsResult> describeOptOutListsAsync(DescribeOptOutListsRequest request) {

        return describeOptOutListsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeOptOutListsResult> describeOptOutListsAsync(final DescribeOptOutListsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeOptOutListsRequest, DescribeOptOutListsResult> asyncHandler) {
        final DescribeOptOutListsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeOptOutListsResult>() {
            @Override
            public DescribeOptOutListsResult call() throws Exception {
                DescribeOptOutListsResult result = null;

                try {
                    result = executeDescribeOptOutLists(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeOptedOutNumbersResult> describeOptedOutNumbersAsync(DescribeOptedOutNumbersRequest request) {

        return describeOptedOutNumbersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeOptedOutNumbersResult> describeOptedOutNumbersAsync(final DescribeOptedOutNumbersRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeOptedOutNumbersRequest, DescribeOptedOutNumbersResult> asyncHandler) {
        final DescribeOptedOutNumbersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeOptedOutNumbersResult>() {
            @Override
            public DescribeOptedOutNumbersResult call() throws Exception {
                DescribeOptedOutNumbersResult result = null;

                try {
                    result = executeDescribeOptedOutNumbers(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribePhoneNumbersResult> describePhoneNumbersAsync(DescribePhoneNumbersRequest request) {

        return describePhoneNumbersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribePhoneNumbersResult> describePhoneNumbersAsync(final DescribePhoneNumbersRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribePhoneNumbersRequest, DescribePhoneNumbersResult> asyncHandler) {
        final DescribePhoneNumbersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribePhoneNumbersResult>() {
            @Override
            public DescribePhoneNumbersResult call() throws Exception {
                DescribePhoneNumbersResult result = null;

                try {
                    result = executeDescribePhoneNumbers(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribePoolsResult> describePoolsAsync(DescribePoolsRequest request) {

        return describePoolsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribePoolsResult> describePoolsAsync(final DescribePoolsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribePoolsRequest, DescribePoolsResult> asyncHandler) {
        final DescribePoolsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribePoolsResult>() {
            @Override
            public DescribePoolsResult call() throws Exception {
                DescribePoolsResult result = null;

                try {
                    result = executeDescribePools(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeProtectConfigurationsResult> describeProtectConfigurationsAsync(DescribeProtectConfigurationsRequest request) {

        return describeProtectConfigurationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeProtectConfigurationsResult> describeProtectConfigurationsAsync(
            final DescribeProtectConfigurationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeProtectConfigurationsRequest, DescribeProtectConfigurationsResult> asyncHandler) {
        final DescribeProtectConfigurationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeProtectConfigurationsResult>() {
            @Override
            public DescribeProtectConfigurationsResult call() throws Exception {
                DescribeProtectConfigurationsResult result = null;

                try {
                    result = executeDescribeProtectConfigurations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeRegistrationAttachmentsResult> describeRegistrationAttachmentsAsync(
            DescribeRegistrationAttachmentsRequest request) {

        return describeRegistrationAttachmentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRegistrationAttachmentsResult> describeRegistrationAttachmentsAsync(
            final DescribeRegistrationAttachmentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeRegistrationAttachmentsRequest, DescribeRegistrationAttachmentsResult> asyncHandler) {
        final DescribeRegistrationAttachmentsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeRegistrationAttachmentsResult>() {
            @Override
            public DescribeRegistrationAttachmentsResult call() throws Exception {
                DescribeRegistrationAttachmentsResult result = null;

                try {
                    result = executeDescribeRegistrationAttachments(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeRegistrationFieldDefinitionsResult> describeRegistrationFieldDefinitionsAsync(
            DescribeRegistrationFieldDefinitionsRequest request) {

        return describeRegistrationFieldDefinitionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRegistrationFieldDefinitionsResult> describeRegistrationFieldDefinitionsAsync(
            final DescribeRegistrationFieldDefinitionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeRegistrationFieldDefinitionsRequest, DescribeRegistrationFieldDefinitionsResult> asyncHandler) {
        final DescribeRegistrationFieldDefinitionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeRegistrationFieldDefinitionsResult>() {
            @Override
            public DescribeRegistrationFieldDefinitionsResult call() throws Exception {
                DescribeRegistrationFieldDefinitionsResult result = null;

                try {
                    result = executeDescribeRegistrationFieldDefinitions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeRegistrationFieldValuesResult> describeRegistrationFieldValuesAsync(
            DescribeRegistrationFieldValuesRequest request) {

        return describeRegistrationFieldValuesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRegistrationFieldValuesResult> describeRegistrationFieldValuesAsync(
            final DescribeRegistrationFieldValuesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeRegistrationFieldValuesRequest, DescribeRegistrationFieldValuesResult> asyncHandler) {
        final DescribeRegistrationFieldValuesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeRegistrationFieldValuesResult>() {
            @Override
            public DescribeRegistrationFieldValuesResult call() throws Exception {
                DescribeRegistrationFieldValuesResult result = null;

                try {
                    result = executeDescribeRegistrationFieldValues(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeRegistrationSectionDefinitionsResult> describeRegistrationSectionDefinitionsAsync(
            DescribeRegistrationSectionDefinitionsRequest request) {

        return describeRegistrationSectionDefinitionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRegistrationSectionDefinitionsResult> describeRegistrationSectionDefinitionsAsync(
            final DescribeRegistrationSectionDefinitionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeRegistrationSectionDefinitionsRequest, DescribeRegistrationSectionDefinitionsResult> asyncHandler) {
        final DescribeRegistrationSectionDefinitionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeRegistrationSectionDefinitionsResult>() {
            @Override
            public DescribeRegistrationSectionDefinitionsResult call() throws Exception {
                DescribeRegistrationSectionDefinitionsResult result = null;

                try {
                    result = executeDescribeRegistrationSectionDefinitions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeRegistrationTypeDefinitionsResult> describeRegistrationTypeDefinitionsAsync(
            DescribeRegistrationTypeDefinitionsRequest request) {

        return describeRegistrationTypeDefinitionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRegistrationTypeDefinitionsResult> describeRegistrationTypeDefinitionsAsync(
            final DescribeRegistrationTypeDefinitionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeRegistrationTypeDefinitionsRequest, DescribeRegistrationTypeDefinitionsResult> asyncHandler) {
        final DescribeRegistrationTypeDefinitionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeRegistrationTypeDefinitionsResult>() {
            @Override
            public DescribeRegistrationTypeDefinitionsResult call() throws Exception {
                DescribeRegistrationTypeDefinitionsResult result = null;

                try {
                    result = executeDescribeRegistrationTypeDefinitions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeRegistrationVersionsResult> describeRegistrationVersionsAsync(DescribeRegistrationVersionsRequest request) {

        return describeRegistrationVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRegistrationVersionsResult> describeRegistrationVersionsAsync(final DescribeRegistrationVersionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeRegistrationVersionsRequest, DescribeRegistrationVersionsResult> asyncHandler) {
        final DescribeRegistrationVersionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeRegistrationVersionsResult>() {
            @Override
            public DescribeRegistrationVersionsResult call() throws Exception {
                DescribeRegistrationVersionsResult result = null;

                try {
                    result = executeDescribeRegistrationVersions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeRegistrationsResult> describeRegistrationsAsync(DescribeRegistrationsRequest request) {

        return describeRegistrationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRegistrationsResult> describeRegistrationsAsync(final DescribeRegistrationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeRegistrationsRequest, DescribeRegistrationsResult> asyncHandler) {
        final DescribeRegistrationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeRegistrationsResult>() {
            @Override
            public DescribeRegistrationsResult call() throws Exception {
                DescribeRegistrationsResult result = null;

                try {
                    result = executeDescribeRegistrations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeSenderIdsResult> describeSenderIdsAsync(DescribeSenderIdsRequest request) {

        return describeSenderIdsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSenderIdsResult> describeSenderIdsAsync(final DescribeSenderIdsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeSenderIdsRequest, DescribeSenderIdsResult> asyncHandler) {
        final DescribeSenderIdsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeSenderIdsResult>() {
            @Override
            public DescribeSenderIdsResult call() throws Exception {
                DescribeSenderIdsResult result = null;

                try {
                    result = executeDescribeSenderIds(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeSpendLimitsResult> describeSpendLimitsAsync(DescribeSpendLimitsRequest request) {

        return describeSpendLimitsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSpendLimitsResult> describeSpendLimitsAsync(final DescribeSpendLimitsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeSpendLimitsRequest, DescribeSpendLimitsResult> asyncHandler) {
        final DescribeSpendLimitsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeSpendLimitsResult>() {
            @Override
            public DescribeSpendLimitsResult call() throws Exception {
                DescribeSpendLimitsResult result = null;

                try {
                    result = executeDescribeSpendLimits(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeVerifiedDestinationNumbersResult> describeVerifiedDestinationNumbersAsync(
            DescribeVerifiedDestinationNumbersRequest request) {

        return describeVerifiedDestinationNumbersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeVerifiedDestinationNumbersResult> describeVerifiedDestinationNumbersAsync(
            final DescribeVerifiedDestinationNumbersRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeVerifiedDestinationNumbersRequest, DescribeVerifiedDestinationNumbersResult> asyncHandler) {
        final DescribeVerifiedDestinationNumbersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeVerifiedDestinationNumbersResult>() {
            @Override
            public DescribeVerifiedDestinationNumbersResult call() throws Exception {
                DescribeVerifiedDestinationNumbersResult result = null;

                try {
                    result = executeDescribeVerifiedDestinationNumbers(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DisassociateOriginationIdentityResult> disassociateOriginationIdentityAsync(
            DisassociateOriginationIdentityRequest request) {

        return disassociateOriginationIdentityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateOriginationIdentityResult> disassociateOriginationIdentityAsync(
            final DisassociateOriginationIdentityRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateOriginationIdentityRequest, DisassociateOriginationIdentityResult> asyncHandler) {
        final DisassociateOriginationIdentityRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateOriginationIdentityResult>() {
            @Override
            public DisassociateOriginationIdentityResult call() throws Exception {
                DisassociateOriginationIdentityResult result = null;

                try {
                    result = executeDisassociateOriginationIdentity(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DisassociateProtectConfigurationResult> disassociateProtectConfigurationAsync(
            DisassociateProtectConfigurationRequest request) {

        return disassociateProtectConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateProtectConfigurationResult> disassociateProtectConfigurationAsync(
            final DisassociateProtectConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateProtectConfigurationRequest, DisassociateProtectConfigurationResult> asyncHandler) {
        final DisassociateProtectConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateProtectConfigurationResult>() {
            @Override
            public DisassociateProtectConfigurationResult call() throws Exception {
                DisassociateProtectConfigurationResult result = null;

                try {
                    result = executeDisassociateProtectConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DiscardRegistrationVersionResult> discardRegistrationVersionAsync(DiscardRegistrationVersionRequest request) {

        return discardRegistrationVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DiscardRegistrationVersionResult> discardRegistrationVersionAsync(final DiscardRegistrationVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DiscardRegistrationVersionRequest, DiscardRegistrationVersionResult> asyncHandler) {
        final DiscardRegistrationVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DiscardRegistrationVersionResult>() {
            @Override
            public DiscardRegistrationVersionResult call() throws Exception {
                DiscardRegistrationVersionResult result = null;

                try {
                    result = executeDiscardRegistrationVersion(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetProtectConfigurationCountryRuleSetResult> getProtectConfigurationCountryRuleSetAsync(
            GetProtectConfigurationCountryRuleSetRequest request) {

        return getProtectConfigurationCountryRuleSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetProtectConfigurationCountryRuleSetResult> getProtectConfigurationCountryRuleSetAsync(
            final GetProtectConfigurationCountryRuleSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetProtectConfigurationCountryRuleSetRequest, GetProtectConfigurationCountryRuleSetResult> asyncHandler) {
        final GetProtectConfigurationCountryRuleSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetProtectConfigurationCountryRuleSetResult>() {
            @Override
            public GetProtectConfigurationCountryRuleSetResult call() throws Exception {
                GetProtectConfigurationCountryRuleSetResult result = null;

                try {
                    result = executeGetProtectConfigurationCountryRuleSet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListPoolOriginationIdentitiesResult> listPoolOriginationIdentitiesAsync(ListPoolOriginationIdentitiesRequest request) {

        return listPoolOriginationIdentitiesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPoolOriginationIdentitiesResult> listPoolOriginationIdentitiesAsync(
            final ListPoolOriginationIdentitiesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPoolOriginationIdentitiesRequest, ListPoolOriginationIdentitiesResult> asyncHandler) {
        final ListPoolOriginationIdentitiesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPoolOriginationIdentitiesResult>() {
            @Override
            public ListPoolOriginationIdentitiesResult call() throws Exception {
                ListPoolOriginationIdentitiesResult result = null;

                try {
                    result = executeListPoolOriginationIdentities(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListRegistrationAssociationsResult> listRegistrationAssociationsAsync(ListRegistrationAssociationsRequest request) {

        return listRegistrationAssociationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRegistrationAssociationsResult> listRegistrationAssociationsAsync(final ListRegistrationAssociationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRegistrationAssociationsRequest, ListRegistrationAssociationsResult> asyncHandler) {
        final ListRegistrationAssociationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListRegistrationAssociationsResult>() {
            @Override
            public ListRegistrationAssociationsResult call() throws Exception {
                ListRegistrationAssociationsResult result = null;

                try {
                    result = executeListRegistrationAssociations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<PutKeywordResult> putKeywordAsync(PutKeywordRequest request) {

        return putKeywordAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutKeywordResult> putKeywordAsync(final PutKeywordRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutKeywordRequest, PutKeywordResult> asyncHandler) {
        final PutKeywordRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutKeywordResult>() {
            @Override
            public PutKeywordResult call() throws Exception {
                PutKeywordResult result = null;

                try {
                    result = executePutKeyword(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutOptedOutNumberResult> putOptedOutNumberAsync(PutOptedOutNumberRequest request) {

        return putOptedOutNumberAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutOptedOutNumberResult> putOptedOutNumberAsync(final PutOptedOutNumberRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutOptedOutNumberRequest, PutOptedOutNumberResult> asyncHandler) {
        final PutOptedOutNumberRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutOptedOutNumberResult>() {
            @Override
            public PutOptedOutNumberResult call() throws Exception {
                PutOptedOutNumberResult result = null;

                try {
                    result = executePutOptedOutNumber(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutRegistrationFieldValueResult> putRegistrationFieldValueAsync(PutRegistrationFieldValueRequest request) {

        return putRegistrationFieldValueAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutRegistrationFieldValueResult> putRegistrationFieldValueAsync(final PutRegistrationFieldValueRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutRegistrationFieldValueRequest, PutRegistrationFieldValueResult> asyncHandler) {
        final PutRegistrationFieldValueRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutRegistrationFieldValueResult>() {
            @Override
            public PutRegistrationFieldValueResult call() throws Exception {
                PutRegistrationFieldValueResult result = null;

                try {
                    result = executePutRegistrationFieldValue(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ReleasePhoneNumberResult> releasePhoneNumberAsync(ReleasePhoneNumberRequest request) {

        return releasePhoneNumberAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ReleasePhoneNumberResult> releasePhoneNumberAsync(final ReleasePhoneNumberRequest request,
            final com.amazonaws.handlers.AsyncHandler<ReleasePhoneNumberRequest, ReleasePhoneNumberResult> asyncHandler) {
        final ReleasePhoneNumberRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ReleasePhoneNumberResult>() {
            @Override
            public ReleasePhoneNumberResult call() throws Exception {
                ReleasePhoneNumberResult result = null;

                try {
                    result = executeReleasePhoneNumber(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ReleaseSenderIdResult> releaseSenderIdAsync(ReleaseSenderIdRequest request) {

        return releaseSenderIdAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ReleaseSenderIdResult> releaseSenderIdAsync(final ReleaseSenderIdRequest request,
            final com.amazonaws.handlers.AsyncHandler<ReleaseSenderIdRequest, ReleaseSenderIdResult> asyncHandler) {
        final ReleaseSenderIdRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ReleaseSenderIdResult>() {
            @Override
            public ReleaseSenderIdResult call() throws Exception {
                ReleaseSenderIdResult result = null;

                try {
                    result = executeReleaseSenderId(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<RequestPhoneNumberResult> requestPhoneNumberAsync(RequestPhoneNumberRequest request) {

        return requestPhoneNumberAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RequestPhoneNumberResult> requestPhoneNumberAsync(final RequestPhoneNumberRequest request,
            final com.amazonaws.handlers.AsyncHandler<RequestPhoneNumberRequest, RequestPhoneNumberResult> asyncHandler) {
        final RequestPhoneNumberRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RequestPhoneNumberResult>() {
            @Override
            public RequestPhoneNumberResult call() throws Exception {
                RequestPhoneNumberResult result = null;

                try {
                    result = executeRequestPhoneNumber(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<RequestSenderIdResult> requestSenderIdAsync(RequestSenderIdRequest request) {

        return requestSenderIdAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RequestSenderIdResult> requestSenderIdAsync(final RequestSenderIdRequest request,
            final com.amazonaws.handlers.AsyncHandler<RequestSenderIdRequest, RequestSenderIdResult> asyncHandler) {
        final RequestSenderIdRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RequestSenderIdResult>() {
            @Override
            public RequestSenderIdResult call() throws Exception {
                RequestSenderIdResult result = null;

                try {
                    result = executeRequestSenderId(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SendDestinationNumberVerificationCodeResult> sendDestinationNumberVerificationCodeAsync(
            SendDestinationNumberVerificationCodeRequest request) {

        return sendDestinationNumberVerificationCodeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SendDestinationNumberVerificationCodeResult> sendDestinationNumberVerificationCodeAsync(
            final SendDestinationNumberVerificationCodeRequest request,
            final com.amazonaws.handlers.AsyncHandler<SendDestinationNumberVerificationCodeRequest, SendDestinationNumberVerificationCodeResult> asyncHandler) {
        final SendDestinationNumberVerificationCodeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SendDestinationNumberVerificationCodeResult>() {
            @Override
            public SendDestinationNumberVerificationCodeResult call() throws Exception {
                SendDestinationNumberVerificationCodeResult result = null;

                try {
                    result = executeSendDestinationNumberVerificationCode(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SendMediaMessageResult> sendMediaMessageAsync(SendMediaMessageRequest request) {

        return sendMediaMessageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SendMediaMessageResult> sendMediaMessageAsync(final SendMediaMessageRequest request,
            final com.amazonaws.handlers.AsyncHandler<SendMediaMessageRequest, SendMediaMessageResult> asyncHandler) {
        final SendMediaMessageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SendMediaMessageResult>() {
            @Override
            public SendMediaMessageResult call() throws Exception {
                SendMediaMessageResult result = null;

                try {
                    result = executeSendMediaMessage(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SendTextMessageResult> sendTextMessageAsync(SendTextMessageRequest request) {

        return sendTextMessageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SendTextMessageResult> sendTextMessageAsync(final SendTextMessageRequest request,
            final com.amazonaws.handlers.AsyncHandler<SendTextMessageRequest, SendTextMessageResult> asyncHandler) {
        final SendTextMessageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SendTextMessageResult>() {
            @Override
            public SendTextMessageResult call() throws Exception {
                SendTextMessageResult result = null;

                try {
                    result = executeSendTextMessage(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SendVoiceMessageResult> sendVoiceMessageAsync(SendVoiceMessageRequest request) {

        return sendVoiceMessageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SendVoiceMessageResult> sendVoiceMessageAsync(final SendVoiceMessageRequest request,
            final com.amazonaws.handlers.AsyncHandler<SendVoiceMessageRequest, SendVoiceMessageResult> asyncHandler) {
        final SendVoiceMessageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SendVoiceMessageResult>() {
            @Override
            public SendVoiceMessageResult call() throws Exception {
                SendVoiceMessageResult result = null;

                try {
                    result = executeSendVoiceMessage(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SetAccountDefaultProtectConfigurationResult> setAccountDefaultProtectConfigurationAsync(
            SetAccountDefaultProtectConfigurationRequest request) {

        return setAccountDefaultProtectConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetAccountDefaultProtectConfigurationResult> setAccountDefaultProtectConfigurationAsync(
            final SetAccountDefaultProtectConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<SetAccountDefaultProtectConfigurationRequest, SetAccountDefaultProtectConfigurationResult> asyncHandler) {
        final SetAccountDefaultProtectConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SetAccountDefaultProtectConfigurationResult>() {
            @Override
            public SetAccountDefaultProtectConfigurationResult call() throws Exception {
                SetAccountDefaultProtectConfigurationResult result = null;

                try {
                    result = executeSetAccountDefaultProtectConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SetDefaultMessageTypeResult> setDefaultMessageTypeAsync(SetDefaultMessageTypeRequest request) {

        return setDefaultMessageTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetDefaultMessageTypeResult> setDefaultMessageTypeAsync(final SetDefaultMessageTypeRequest request,
            final com.amazonaws.handlers.AsyncHandler<SetDefaultMessageTypeRequest, SetDefaultMessageTypeResult> asyncHandler) {
        final SetDefaultMessageTypeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SetDefaultMessageTypeResult>() {
            @Override
            public SetDefaultMessageTypeResult call() throws Exception {
                SetDefaultMessageTypeResult result = null;

                try {
                    result = executeSetDefaultMessageType(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SetDefaultSenderIdResult> setDefaultSenderIdAsync(SetDefaultSenderIdRequest request) {

        return setDefaultSenderIdAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetDefaultSenderIdResult> setDefaultSenderIdAsync(final SetDefaultSenderIdRequest request,
            final com.amazonaws.handlers.AsyncHandler<SetDefaultSenderIdRequest, SetDefaultSenderIdResult> asyncHandler) {
        final SetDefaultSenderIdRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SetDefaultSenderIdResult>() {
            @Override
            public SetDefaultSenderIdResult call() throws Exception {
                SetDefaultSenderIdResult result = null;

                try {
                    result = executeSetDefaultSenderId(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SetMediaMessageSpendLimitOverrideResult> setMediaMessageSpendLimitOverrideAsync(
            SetMediaMessageSpendLimitOverrideRequest request) {

        return setMediaMessageSpendLimitOverrideAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetMediaMessageSpendLimitOverrideResult> setMediaMessageSpendLimitOverrideAsync(
            final SetMediaMessageSpendLimitOverrideRequest request,
            final com.amazonaws.handlers.AsyncHandler<SetMediaMessageSpendLimitOverrideRequest, SetMediaMessageSpendLimitOverrideResult> asyncHandler) {
        final SetMediaMessageSpendLimitOverrideRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SetMediaMessageSpendLimitOverrideResult>() {
            @Override
            public SetMediaMessageSpendLimitOverrideResult call() throws Exception {
                SetMediaMessageSpendLimitOverrideResult result = null;

                try {
                    result = executeSetMediaMessageSpendLimitOverride(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SetTextMessageSpendLimitOverrideResult> setTextMessageSpendLimitOverrideAsync(
            SetTextMessageSpendLimitOverrideRequest request) {

        return setTextMessageSpendLimitOverrideAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetTextMessageSpendLimitOverrideResult> setTextMessageSpendLimitOverrideAsync(
            final SetTextMessageSpendLimitOverrideRequest request,
            final com.amazonaws.handlers.AsyncHandler<SetTextMessageSpendLimitOverrideRequest, SetTextMessageSpendLimitOverrideResult> asyncHandler) {
        final SetTextMessageSpendLimitOverrideRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SetTextMessageSpendLimitOverrideResult>() {
            @Override
            public SetTextMessageSpendLimitOverrideResult call() throws Exception {
                SetTextMessageSpendLimitOverrideResult result = null;

                try {
                    result = executeSetTextMessageSpendLimitOverride(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SetVoiceMessageSpendLimitOverrideResult> setVoiceMessageSpendLimitOverrideAsync(
            SetVoiceMessageSpendLimitOverrideRequest request) {

        return setVoiceMessageSpendLimitOverrideAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetVoiceMessageSpendLimitOverrideResult> setVoiceMessageSpendLimitOverrideAsync(
            final SetVoiceMessageSpendLimitOverrideRequest request,
            final com.amazonaws.handlers.AsyncHandler<SetVoiceMessageSpendLimitOverrideRequest, SetVoiceMessageSpendLimitOverrideResult> asyncHandler) {
        final SetVoiceMessageSpendLimitOverrideRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SetVoiceMessageSpendLimitOverrideResult>() {
            @Override
            public SetVoiceMessageSpendLimitOverrideResult call() throws Exception {
                SetVoiceMessageSpendLimitOverrideResult result = null;

                try {
                    result = executeSetVoiceMessageSpendLimitOverride(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SubmitRegistrationVersionResult> submitRegistrationVersionAsync(SubmitRegistrationVersionRequest request) {

        return submitRegistrationVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SubmitRegistrationVersionResult> submitRegistrationVersionAsync(final SubmitRegistrationVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<SubmitRegistrationVersionRequest, SubmitRegistrationVersionResult> asyncHandler) {
        final SubmitRegistrationVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SubmitRegistrationVersionResult>() {
            @Override
            public SubmitRegistrationVersionResult call() throws Exception {
                SubmitRegistrationVersionResult result = null;

                try {
                    result = executeSubmitRegistrationVersion(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<UpdateEventDestinationResult> updateEventDestinationAsync(UpdateEventDestinationRequest request) {

        return updateEventDestinationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateEventDestinationResult> updateEventDestinationAsync(final UpdateEventDestinationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateEventDestinationRequest, UpdateEventDestinationResult> asyncHandler) {
        final UpdateEventDestinationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateEventDestinationResult>() {
            @Override
            public UpdateEventDestinationResult call() throws Exception {
                UpdateEventDestinationResult result = null;

                try {
                    result = executeUpdateEventDestination(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdatePhoneNumberResult> updatePhoneNumberAsync(UpdatePhoneNumberRequest request) {

        return updatePhoneNumberAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdatePhoneNumberResult> updatePhoneNumberAsync(final UpdatePhoneNumberRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdatePhoneNumberRequest, UpdatePhoneNumberResult> asyncHandler) {
        final UpdatePhoneNumberRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdatePhoneNumberResult>() {
            @Override
            public UpdatePhoneNumberResult call() throws Exception {
                UpdatePhoneNumberResult result = null;

                try {
                    result = executeUpdatePhoneNumber(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdatePoolResult> updatePoolAsync(UpdatePoolRequest request) {

        return updatePoolAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdatePoolResult> updatePoolAsync(final UpdatePoolRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdatePoolRequest, UpdatePoolResult> asyncHandler) {
        final UpdatePoolRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdatePoolResult>() {
            @Override
            public UpdatePoolResult call() throws Exception {
                UpdatePoolResult result = null;

                try {
                    result = executeUpdatePool(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateProtectConfigurationResult> updateProtectConfigurationAsync(UpdateProtectConfigurationRequest request) {

        return updateProtectConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateProtectConfigurationResult> updateProtectConfigurationAsync(final UpdateProtectConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateProtectConfigurationRequest, UpdateProtectConfigurationResult> asyncHandler) {
        final UpdateProtectConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateProtectConfigurationResult>() {
            @Override
            public UpdateProtectConfigurationResult call() throws Exception {
                UpdateProtectConfigurationResult result = null;

                try {
                    result = executeUpdateProtectConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateProtectConfigurationCountryRuleSetResult> updateProtectConfigurationCountryRuleSetAsync(
            UpdateProtectConfigurationCountryRuleSetRequest request) {

        return updateProtectConfigurationCountryRuleSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateProtectConfigurationCountryRuleSetResult> updateProtectConfigurationCountryRuleSetAsync(
            final UpdateProtectConfigurationCountryRuleSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateProtectConfigurationCountryRuleSetRequest, UpdateProtectConfigurationCountryRuleSetResult> asyncHandler) {
        final UpdateProtectConfigurationCountryRuleSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateProtectConfigurationCountryRuleSetResult>() {
            @Override
            public UpdateProtectConfigurationCountryRuleSetResult call() throws Exception {
                UpdateProtectConfigurationCountryRuleSetResult result = null;

                try {
                    result = executeUpdateProtectConfigurationCountryRuleSet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateSenderIdResult> updateSenderIdAsync(UpdateSenderIdRequest request) {

        return updateSenderIdAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSenderIdResult> updateSenderIdAsync(final UpdateSenderIdRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateSenderIdRequest, UpdateSenderIdResult> asyncHandler) {
        final UpdateSenderIdRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateSenderIdResult>() {
            @Override
            public UpdateSenderIdResult call() throws Exception {
                UpdateSenderIdResult result = null;

                try {
                    result = executeUpdateSenderId(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<VerifyDestinationNumberResult> verifyDestinationNumberAsync(VerifyDestinationNumberRequest request) {

        return verifyDestinationNumberAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<VerifyDestinationNumberResult> verifyDestinationNumberAsync(final VerifyDestinationNumberRequest request,
            final com.amazonaws.handlers.AsyncHandler<VerifyDestinationNumberRequest, VerifyDestinationNumberResult> asyncHandler) {
        final VerifyDestinationNumberRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<VerifyDestinationNumberResult>() {
            @Override
            public VerifyDestinationNumberResult call() throws Exception {
                VerifyDestinationNumberResult result = null;

                try {
                    result = executeVerifyDestinationNumber(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
