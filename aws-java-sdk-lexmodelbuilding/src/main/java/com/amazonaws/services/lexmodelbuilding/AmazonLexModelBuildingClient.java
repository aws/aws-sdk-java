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
package com.amazonaws.services.lexmodelbuilding;

import org.w3c.dom.*;

import java.net.*;
import java.util.*;

import javax.annotation.Generated;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.auth.*;

import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.internal.auth.*;
import com.amazonaws.metrics.*;
import com.amazonaws.regions.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.protocol.json.*;
import com.amazonaws.util.AWSRequestMetrics.Field;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.client.AwsSyncClientParams;
import com.amazonaws.client.builder.AdvancedConfig;

import com.amazonaws.services.lexmodelbuilding.AmazonLexModelBuildingClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.lexmodelbuilding.model.*;
import com.amazonaws.services.lexmodelbuilding.model.transform.*;

/**
 * Client for accessing Amazon Lex Model Building Service. All service calls made using this client are blocking, and
 * will not return until the service call completes.
 * <p>
 * <fullname>Amazon Lex Build-Time Actions</fullname>
 * <p>
 * Amazon Lex is an AWS service for building conversational voice and text interfaces. Use these actions to create,
 * update, and delete conversational bots for new and existing client applications.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonLexModelBuildingClient extends AmazonWebServiceClient implements AmazonLexModelBuilding {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonLexModelBuilding.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "lex";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .withContentTypeOverride("")
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalFailureException").withModeledClass(
                                    com.amazonaws.services.lexmodelbuilding.model.InternalFailureException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceInUseException").withModeledClass(
                                    com.amazonaws.services.lexmodelbuilding.model.ResourceInUseException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NotFoundException").withModeledClass(
                                    com.amazonaws.services.lexmodelbuilding.model.NotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withModeledClass(
                                    com.amazonaws.services.lexmodelbuilding.model.LimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withModeledClass(
                                    com.amazonaws.services.lexmodelbuilding.model.ConflictException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("PreconditionFailedException").withModeledClass(
                                    com.amazonaws.services.lexmodelbuilding.model.PreconditionFailedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BadRequestException").withModeledClass(
                                    com.amazonaws.services.lexmodelbuilding.model.BadRequestException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.lexmodelbuilding.model.AmazonLexModelBuildingException.class));

    public static AmazonLexModelBuildingClientBuilder builder() {
        return AmazonLexModelBuildingClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Lex Model Building Service using the specified
     * parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonLexModelBuildingClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Lex Model Building Service using the specified
     * parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonLexModelBuildingClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("models.lex.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/lexmodelbuilding/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/lexmodelbuilding/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Creates a new version of the bot based on the <code>$LATEST</code> version. If the <code>$LATEST</code> version
     * of this resource hasn't changed since you created the last version, Amazon Lex doesn't create a new version. It
     * returns the last created version.
     * </p>
     * <note>
     * <p>
     * You can update only the <code>$LATEST</code> version of the bot. You can't update the numbered versions that you
     * create with the <code>CreateBotVersion</code> operation.
     * </p>
     * </note>
     * <p>
     * When you create the first version of a bot, Amazon Lex sets the version to 1. Subsequent versions increment by 1.
     * For more information, see <a>versioning-intro</a>.
     * </p>
     * <p>
     * This operation requires permission for the <code>lex:CreateBotVersion</code> action.
     * </p>
     * 
     * @param createBotVersionRequest
     * @return Result of the CreateBotVersion operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource and try again.
     * @throws ConflictException
     *         There was a conflict processing the request. Try your request again.
     * @throws LimitExceededException
     *         The request exceeded a limit. Try your request again.
     * @throws InternalFailureException
     *         An internal Amazon Lex error occurred. Try your request again.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and try again.
     * @throws PreconditionFailedException
     *         The checksum of the resource that you are trying to change does not match the checksum in the request.
     *         Check the resource's checksum and try again.
     * @sample AmazonLexModelBuilding.CreateBotVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/CreateBotVersion" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateBotVersionResult createBotVersion(CreateBotVersionRequest request) {
        request = beforeClientExecution(request);
        return executeCreateBotVersion(request);
    }

    @SdkInternalApi
    final CreateBotVersionResult executeCreateBotVersion(CreateBotVersionRequest createBotVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(createBotVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateBotVersionRequest> request = null;
        Response<CreateBotVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateBotVersionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createBotVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Model Building Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateBotVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateBotVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateBotVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new version of an intent based on the <code>$LATEST</code> version of the intent. If the
     * <code>$LATEST</code> version of this intent hasn't changed since you last updated it, Amazon Lex doesn't create a
     * new version. It returns the last version you created.
     * </p>
     * <note>
     * <p>
     * You can update only the <code>$LATEST</code> version of the intent. You can't update the numbered versions that
     * you create with the <code>CreateIntentVersion</code> operation.
     * </p>
     * </note>
     * <p>
     * When you create a version of an intent, Amazon Lex sets the version to 1. Subsequent versions increment by 1. For
     * more information, see <a>versioning-intro</a>.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>lex:CreateIntentVersion</code> action.
     * </p>
     * 
     * @param createIntentVersionRequest
     * @return Result of the CreateIntentVersion operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource and try again.
     * @throws ConflictException
     *         There was a conflict processing the request. Try your request again.
     * @throws LimitExceededException
     *         The request exceeded a limit. Try your request again.
     * @throws InternalFailureException
     *         An internal Amazon Lex error occurred. Try your request again.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and try again.
     * @throws PreconditionFailedException
     *         The checksum of the resource that you are trying to change does not match the checksum in the request.
     *         Check the resource's checksum and try again.
     * @sample AmazonLexModelBuilding.CreateIntentVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/CreateIntentVersion" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateIntentVersionResult createIntentVersion(CreateIntentVersionRequest request) {
        request = beforeClientExecution(request);
        return executeCreateIntentVersion(request);
    }

    @SdkInternalApi
    final CreateIntentVersionResult executeCreateIntentVersion(CreateIntentVersionRequest createIntentVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(createIntentVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateIntentVersionRequest> request = null;
        Response<CreateIntentVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateIntentVersionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createIntentVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Model Building Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateIntentVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateIntentVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateIntentVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new version of a slot type based on the <code>$LATEST</code> version of the specified slot type. If the
     * <code>$LATEST</code> version of this resource has not changed since the last version that you created, Amazon Lex
     * doesn't create a new version. It returns the last version that you created.
     * </p>
     * <note>
     * <p>
     * You can update only the <code>$LATEST</code> version of a slot type. You can't update the numbered versions that
     * you create with the <code>CreateSlotTypeVersion</code> operation.
     * </p>
     * </note>
     * <p>
     * When you create a version of a slot type, Amazon Lex sets the version to 1. Subsequent versions increment by 1.
     * For more information, see <a>versioning-intro</a>.
     * </p>
     * <p>
     * This operation requires permissions for the <code>lex:CreateSlotTypeVersion</code> action.
     * </p>
     * 
     * @param createSlotTypeVersionRequest
     * @return Result of the CreateSlotTypeVersion operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource and try again.
     * @throws ConflictException
     *         There was a conflict processing the request. Try your request again.
     * @throws LimitExceededException
     *         The request exceeded a limit. Try your request again.
     * @throws InternalFailureException
     *         An internal Amazon Lex error occurred. Try your request again.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and try again.
     * @throws PreconditionFailedException
     *         The checksum of the resource that you are trying to change does not match the checksum in the request.
     *         Check the resource's checksum and try again.
     * @sample AmazonLexModelBuilding.CreateSlotTypeVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/CreateSlotTypeVersion"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateSlotTypeVersionResult createSlotTypeVersion(CreateSlotTypeVersionRequest request) {
        request = beforeClientExecution(request);
        return executeCreateSlotTypeVersion(request);
    }

    @SdkInternalApi
    final CreateSlotTypeVersionResult executeCreateSlotTypeVersion(CreateSlotTypeVersionRequest createSlotTypeVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(createSlotTypeVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSlotTypeVersionRequest> request = null;
        Response<CreateSlotTypeVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSlotTypeVersionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createSlotTypeVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Model Building Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateSlotTypeVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateSlotTypeVersionResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new CreateSlotTypeVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes all versions of the bot, including the <code>$LATEST</code> version. To delete a specific version of the
     * bot, use the <a>DeleteBotVersion</a> operation.
     * </p>
     * <p>
     * If a bot has an alias, you can't delete it. Instead, the <code>DeleteBot</code> operation returns a
     * <code>ResourceInUseException</code> exception that includes a reference to the alias that refers to the bot. To
     * remove the reference to the bot, delete the alias. If you get the same exception again, delete the referring
     * alias until the <code>DeleteBot</code> operation is successful.
     * </p>
     * <p>
     * This operation requires permissions for the <code>lex:DeleteBot</code> action.
     * </p>
     * 
     * @param deleteBotRequest
     * @return Result of the DeleteBot operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource and try again.
     * @throws ConflictException
     *         There was a conflict processing the request. Try your request again.
     * @throws LimitExceededException
     *         The request exceeded a limit. Try your request again.
     * @throws InternalFailureException
     *         An internal Amazon Lex error occurred. Try your request again.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and try again.
     * @throws ResourceInUseException
     *         The resource that you are attempting to delete is referred to by another resource. Use this information
     *         to remove references to the resource that you are trying to delete.</p>
     *         <p>
     *         The body of the exception contains a JSON object that describes the resource.
     *         </p>
     *         <p>
     *         <code>{ "resourceType": BOT | BOTALIAS | BOTCHANNEL | INTENT,</code>
     *         </p>
     *         <p>
     *         <code>"resourceReference": {</code>
     *         </p>
     *         <p>
     *         <code>"name": <i>string</i>, "version": <i>string</i> } }</code>
     * @sample AmazonLexModelBuilding.DeleteBot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/DeleteBot" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteBotResult deleteBot(DeleteBotRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteBot(request);
    }

    @SdkInternalApi
    final DeleteBotResult executeDeleteBot(DeleteBotRequest deleteBotRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteBotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteBotRequest> request = null;
        Response<DeleteBotResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteBotRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteBotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Model Building Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteBot");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteBotResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteBotResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an alias for the specified bot.
     * </p>
     * <p>
     * You can't delete an alias that is used in the association between a bot and a messaging channel. If an alias is
     * used in a channel association, the <code>DeleteBot</code> operation returns a <code>ResourceInUseException</code>
     * exception that includes a reference to the channel association that refers to the bot. You can remove the
     * reference to the alias by deleting the channel association. If you get the same exception again, delete the
     * referring association until the <code>DeleteBotAlias</code> operation is successful.
     * </p>
     * 
     * @param deleteBotAliasRequest
     * @return Result of the DeleteBotAlias operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource and try again.
     * @throws ConflictException
     *         There was a conflict processing the request. Try your request again.
     * @throws LimitExceededException
     *         The request exceeded a limit. Try your request again.
     * @throws InternalFailureException
     *         An internal Amazon Lex error occurred. Try your request again.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and try again.
     * @throws ResourceInUseException
     *         The resource that you are attempting to delete is referred to by another resource. Use this information
     *         to remove references to the resource that you are trying to delete.</p>
     *         <p>
     *         The body of the exception contains a JSON object that describes the resource.
     *         </p>
     *         <p>
     *         <code>{ "resourceType": BOT | BOTALIAS | BOTCHANNEL | INTENT,</code>
     *         </p>
     *         <p>
     *         <code>"resourceReference": {</code>
     *         </p>
     *         <p>
     *         <code>"name": <i>string</i>, "version": <i>string</i> } }</code>
     * @sample AmazonLexModelBuilding.DeleteBotAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/DeleteBotAlias" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteBotAliasResult deleteBotAlias(DeleteBotAliasRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteBotAlias(request);
    }

    @SdkInternalApi
    final DeleteBotAliasResult executeDeleteBotAlias(DeleteBotAliasRequest deleteBotAliasRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteBotAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteBotAliasRequest> request = null;
        Response<DeleteBotAliasResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteBotAliasRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteBotAliasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Model Building Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteBotAlias");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteBotAliasResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteBotAliasResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the association between an Amazon Lex bot and a messaging platform.
     * </p>
     * <p>
     * This operation requires permission for the <code>lex:DeleteBotChannelAssociation</code> action.
     * </p>
     * 
     * @param deleteBotChannelAssociationRequest
     * @return Result of the DeleteBotChannelAssociation operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource and try again.
     * @throws ConflictException
     *         There was a conflict processing the request. Try your request again.
     * @throws LimitExceededException
     *         The request exceeded a limit. Try your request again.
     * @throws InternalFailureException
     *         An internal Amazon Lex error occurred. Try your request again.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and try again.
     * @sample AmazonLexModelBuilding.DeleteBotChannelAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/DeleteBotChannelAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteBotChannelAssociationResult deleteBotChannelAssociation(DeleteBotChannelAssociationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteBotChannelAssociation(request);
    }

    @SdkInternalApi
    final DeleteBotChannelAssociationResult executeDeleteBotChannelAssociation(DeleteBotChannelAssociationRequest deleteBotChannelAssociationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteBotChannelAssociationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteBotChannelAssociationRequest> request = null;
        Response<DeleteBotChannelAssociationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteBotChannelAssociationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteBotChannelAssociationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Model Building Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteBotChannelAssociation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteBotChannelAssociationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteBotChannelAssociationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a specific version of a bot. To delete all versions of a bot, use the <a>DeleteBot</a> operation.
     * </p>
     * <p>
     * This operation requires permissions for the <code>lex:DeleteBotVersion</code> action.
     * </p>
     * 
     * @param deleteBotVersionRequest
     * @return Result of the DeleteBotVersion operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource and try again.
     * @throws ConflictException
     *         There was a conflict processing the request. Try your request again.
     * @throws LimitExceededException
     *         The request exceeded a limit. Try your request again.
     * @throws InternalFailureException
     *         An internal Amazon Lex error occurred. Try your request again.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and try again.
     * @throws ResourceInUseException
     *         The resource that you are attempting to delete is referred to by another resource. Use this information
     *         to remove references to the resource that you are trying to delete.</p>
     *         <p>
     *         The body of the exception contains a JSON object that describes the resource.
     *         </p>
     *         <p>
     *         <code>{ "resourceType": BOT | BOTALIAS | BOTCHANNEL | INTENT,</code>
     *         </p>
     *         <p>
     *         <code>"resourceReference": {</code>
     *         </p>
     *         <p>
     *         <code>"name": <i>string</i>, "version": <i>string</i> } }</code>
     * @sample AmazonLexModelBuilding.DeleteBotVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/DeleteBotVersion" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteBotVersionResult deleteBotVersion(DeleteBotVersionRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteBotVersion(request);
    }

    @SdkInternalApi
    final DeleteBotVersionResult executeDeleteBotVersion(DeleteBotVersionRequest deleteBotVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteBotVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteBotVersionRequest> request = null;
        Response<DeleteBotVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteBotVersionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteBotVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Model Building Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteBotVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteBotVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteBotVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes all versions of the intent, including the <code>$LATEST</code> version. To delete a specific version of
     * the intent, use the <a>DeleteIntentVersion</a> operation.
     * </p>
     * <p>
     * You can delete a version of an intent only if it is not referenced. To delete an intent that is referred to in
     * one or more bots (see <a>how-it-works</a>), you must remove those references first.
     * </p>
     * <note>
     * <p>
     * If you get the <code>ResourceInUseException</code> exception, it provides an example reference that shows where
     * the intent is referenced. To remove the reference to the intent, either update the bot or delete it. If you get
     * the same exception when you attempt to delete the intent again, repeat until the intent has no references and the
     * call to <code>DeleteIntent</code> is successful.
     * </p>
     * </note>
     * <p>
     * This operation requires permission for the <code>lex:DeleteIntent</code> action.
     * </p>
     * 
     * @param deleteIntentRequest
     * @return Result of the DeleteIntent operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource and try again.
     * @throws ConflictException
     *         There was a conflict processing the request. Try your request again.
     * @throws LimitExceededException
     *         The request exceeded a limit. Try your request again.
     * @throws InternalFailureException
     *         An internal Amazon Lex error occurred. Try your request again.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and try again.
     * @throws ResourceInUseException
     *         The resource that you are attempting to delete is referred to by another resource. Use this information
     *         to remove references to the resource that you are trying to delete.</p>
     *         <p>
     *         The body of the exception contains a JSON object that describes the resource.
     *         </p>
     *         <p>
     *         <code>{ "resourceType": BOT | BOTALIAS | BOTCHANNEL | INTENT,</code>
     *         </p>
     *         <p>
     *         <code>"resourceReference": {</code>
     *         </p>
     *         <p>
     *         <code>"name": <i>string</i>, "version": <i>string</i> } }</code>
     * @sample AmazonLexModelBuilding.DeleteIntent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/DeleteIntent" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteIntentResult deleteIntent(DeleteIntentRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteIntent(request);
    }

    @SdkInternalApi
    final DeleteIntentResult executeDeleteIntent(DeleteIntentRequest deleteIntentRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteIntentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteIntentRequest> request = null;
        Response<DeleteIntentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteIntentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteIntentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Model Building Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteIntent");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteIntentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteIntentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a specific version of an intent. To delete all versions of a intent, use the <a>DeleteIntent</a>
     * operation.
     * </p>
     * <p>
     * This operation requires permissions for the <code>lex:DeleteIntentVersion</code> action.
     * </p>
     * 
     * @param deleteIntentVersionRequest
     * @return Result of the DeleteIntentVersion operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource and try again.
     * @throws ConflictException
     *         There was a conflict processing the request. Try your request again.
     * @throws LimitExceededException
     *         The request exceeded a limit. Try your request again.
     * @throws InternalFailureException
     *         An internal Amazon Lex error occurred. Try your request again.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and try again.
     * @throws ResourceInUseException
     *         The resource that you are attempting to delete is referred to by another resource. Use this information
     *         to remove references to the resource that you are trying to delete.</p>
     *         <p>
     *         The body of the exception contains a JSON object that describes the resource.
     *         </p>
     *         <p>
     *         <code>{ "resourceType": BOT | BOTALIAS | BOTCHANNEL | INTENT,</code>
     *         </p>
     *         <p>
     *         <code>"resourceReference": {</code>
     *         </p>
     *         <p>
     *         <code>"name": <i>string</i>, "version": <i>string</i> } }</code>
     * @sample AmazonLexModelBuilding.DeleteIntentVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/DeleteIntentVersion" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteIntentVersionResult deleteIntentVersion(DeleteIntentVersionRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteIntentVersion(request);
    }

    @SdkInternalApi
    final DeleteIntentVersionResult executeDeleteIntentVersion(DeleteIntentVersionRequest deleteIntentVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteIntentVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteIntentVersionRequest> request = null;
        Response<DeleteIntentVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteIntentVersionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteIntentVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Model Building Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteIntentVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteIntentVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteIntentVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes all versions of the slot type, including the <code>$LATEST</code> version. To delete a specific version
     * of the slot type, use the <a>DeleteSlotTypeVersion</a> operation.
     * </p>
     * <p>
     * You can delete a version of a slot type only if it is not referenced. To delete a slot type that is referred to
     * in one or more intents, you must remove those references first.
     * </p>
     * <note>
     * <p>
     * If you get the <code>ResourceInUseException</code> exception, the exception provides an example reference that
     * shows the intent where the slot type is referenced. To remove the reference to the slot type, either update the
     * intent or delete it. If you get the same exception when you attempt to delete the slot type again, repeat until
     * the slot type has no references and the <code>DeleteSlotType</code> call is successful.
     * </p>
     * </note>
     * <p>
     * This operation requires permission for the <code>lex:DeleteSlotType</code> action.
     * </p>
     * 
     * @param deleteSlotTypeRequest
     * @return Result of the DeleteSlotType operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource and try again.
     * @throws ConflictException
     *         There was a conflict processing the request. Try your request again.
     * @throws LimitExceededException
     *         The request exceeded a limit. Try your request again.
     * @throws InternalFailureException
     *         An internal Amazon Lex error occurred. Try your request again.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and try again.
     * @throws ResourceInUseException
     *         The resource that you are attempting to delete is referred to by another resource. Use this information
     *         to remove references to the resource that you are trying to delete.</p>
     *         <p>
     *         The body of the exception contains a JSON object that describes the resource.
     *         </p>
     *         <p>
     *         <code>{ "resourceType": BOT | BOTALIAS | BOTCHANNEL | INTENT,</code>
     *         </p>
     *         <p>
     *         <code>"resourceReference": {</code>
     *         </p>
     *         <p>
     *         <code>"name": <i>string</i>, "version": <i>string</i> } }</code>
     * @sample AmazonLexModelBuilding.DeleteSlotType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/DeleteSlotType" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteSlotTypeResult deleteSlotType(DeleteSlotTypeRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteSlotType(request);
    }

    @SdkInternalApi
    final DeleteSlotTypeResult executeDeleteSlotType(DeleteSlotTypeRequest deleteSlotTypeRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteSlotTypeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSlotTypeRequest> request = null;
        Response<DeleteSlotTypeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSlotTypeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteSlotTypeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Model Building Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteSlotType");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteSlotTypeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteSlotTypeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a specific version of a slot type. To delete all versions of a slot type, use the <a>DeleteSlotType</a>
     * operation.
     * </p>
     * <p>
     * This operation requires permissions for the <code>lex:DeleteSlotTypeVersion</code> action.
     * </p>
     * 
     * @param deleteSlotTypeVersionRequest
     * @return Result of the DeleteSlotTypeVersion operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource and try again.
     * @throws ConflictException
     *         There was a conflict processing the request. Try your request again.
     * @throws LimitExceededException
     *         The request exceeded a limit. Try your request again.
     * @throws InternalFailureException
     *         An internal Amazon Lex error occurred. Try your request again.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and try again.
     * @throws ResourceInUseException
     *         The resource that you are attempting to delete is referred to by another resource. Use this information
     *         to remove references to the resource that you are trying to delete.</p>
     *         <p>
     *         The body of the exception contains a JSON object that describes the resource.
     *         </p>
     *         <p>
     *         <code>{ "resourceType": BOT | BOTALIAS | BOTCHANNEL | INTENT,</code>
     *         </p>
     *         <p>
     *         <code>"resourceReference": {</code>
     *         </p>
     *         <p>
     *         <code>"name": <i>string</i>, "version": <i>string</i> } }</code>
     * @sample AmazonLexModelBuilding.DeleteSlotTypeVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/DeleteSlotTypeVersion"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteSlotTypeVersionResult deleteSlotTypeVersion(DeleteSlotTypeVersionRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteSlotTypeVersion(request);
    }

    @SdkInternalApi
    final DeleteSlotTypeVersionResult executeDeleteSlotTypeVersion(DeleteSlotTypeVersionRequest deleteSlotTypeVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteSlotTypeVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSlotTypeVersionRequest> request = null;
        Response<DeleteSlotTypeVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSlotTypeVersionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteSlotTypeVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Model Building Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteSlotTypeVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteSlotTypeVersionResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DeleteSlotTypeVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes stored utterances.
     * </p>
     * <p>
     * Amazon Lex stores the utterances that users send to your bot. Utterances are stored for 15 days for use with the
     * <a>GetUtterancesView</a> operation, and then stored indefinitely for use in improving the ability of your bot to
     * respond to user input.
     * </p>
     * <p>
     * Use the <code>DeleteStoredUtterances</code> operation to manually delete stored utterances for a specific user.
     * </p>
     * <p>
     * This operation requires permissions for the <code>lex:DeleteUtterances</code> action.
     * </p>
     * 
     * @param deleteUtterancesRequest
     * @return Result of the DeleteUtterances operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource and try again.
     * @throws LimitExceededException
     *         The request exceeded a limit. Try your request again.
     * @throws InternalFailureException
     *         An internal Amazon Lex error occurred. Try your request again.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and try again.
     * @sample AmazonLexModelBuilding.DeleteUtterances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/DeleteUtterances" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteUtterancesResult deleteUtterances(DeleteUtterancesRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteUtterances(request);
    }

    @SdkInternalApi
    final DeleteUtterancesResult executeDeleteUtterances(DeleteUtterancesRequest deleteUtterancesRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteUtterancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteUtterancesRequest> request = null;
        Response<DeleteUtterancesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteUtterancesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteUtterancesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Model Building Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteUtterances");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteUtterancesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteUtterancesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns metadata information for a specific bot. You must provide the bot name and the bot version or alias.
     * </p>
     * <p>
     * This operation requires permissions for the <code>lex:GetBot</code> action.
     * </p>
     * 
     * @param getBotRequest
     * @return Result of the GetBot operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource and try again.
     * @throws LimitExceededException
     *         The request exceeded a limit. Try your request again.
     * @throws InternalFailureException
     *         An internal Amazon Lex error occurred. Try your request again.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and try again.
     * @sample AmazonLexModelBuilding.GetBot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetBot" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetBotResult getBot(GetBotRequest request) {
        request = beforeClientExecution(request);
        return executeGetBot(request);
    }

    @SdkInternalApi
    final GetBotResult executeGetBot(GetBotRequest getBotRequest) {

        ExecutionContext executionContext = createExecutionContext(getBotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBotRequest> request = null;
        Response<GetBotResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetBotRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getBotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Model Building Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetBot");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetBotResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetBotResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about an Amazon Lex bot alias. For more information about aliases, see
     * <a>versioning-aliases</a>.
     * </p>
     * <p>
     * This operation requires permissions for the <code>lex:GetBotAlias</code> action.
     * </p>
     * 
     * @param getBotAliasRequest
     * @return Result of the GetBotAlias operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource and try again.
     * @throws LimitExceededException
     *         The request exceeded a limit. Try your request again.
     * @throws InternalFailureException
     *         An internal Amazon Lex error occurred. Try your request again.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and try again.
     * @sample AmazonLexModelBuilding.GetBotAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetBotAlias" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetBotAliasResult getBotAlias(GetBotAliasRequest request) {
        request = beforeClientExecution(request);
        return executeGetBotAlias(request);
    }

    @SdkInternalApi
    final GetBotAliasResult executeGetBotAlias(GetBotAliasRequest getBotAliasRequest) {

        ExecutionContext executionContext = createExecutionContext(getBotAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBotAliasRequest> request = null;
        Response<GetBotAliasResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetBotAliasRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getBotAliasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Model Building Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetBotAlias");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetBotAliasResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetBotAliasResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of aliases for a specified Amazon Lex bot.
     * </p>
     * <p>
     * This operation requires permissions for the <code>lex:GetBotAliases</code> action.
     * </p>
     * 
     * @param getBotAliasesRequest
     * @return Result of the GetBotAliases operation returned by the service.
     * @throws LimitExceededException
     *         The request exceeded a limit. Try your request again.
     * @throws InternalFailureException
     *         An internal Amazon Lex error occurred. Try your request again.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and try again.
     * @sample AmazonLexModelBuilding.GetBotAliases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetBotAliases" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetBotAliasesResult getBotAliases(GetBotAliasesRequest request) {
        request = beforeClientExecution(request);
        return executeGetBotAliases(request);
    }

    @SdkInternalApi
    final GetBotAliasesResult executeGetBotAliases(GetBotAliasesRequest getBotAliasesRequest) {

        ExecutionContext executionContext = createExecutionContext(getBotAliasesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBotAliasesRequest> request = null;
        Response<GetBotAliasesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetBotAliasesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getBotAliasesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Model Building Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetBotAliases");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetBotAliasesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetBotAliasesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about the association between an Amazon Lex bot and a messaging platform.
     * </p>
     * <p>
     * This operation requires permissions for the <code>lex:GetBotChannelAssociation</code> action.
     * </p>
     * 
     * @param getBotChannelAssociationRequest
     * @return Result of the GetBotChannelAssociation operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource and try again.
     * @throws LimitExceededException
     *         The request exceeded a limit. Try your request again.
     * @throws InternalFailureException
     *         An internal Amazon Lex error occurred. Try your request again.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and try again.
     * @sample AmazonLexModelBuilding.GetBotChannelAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetBotChannelAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetBotChannelAssociationResult getBotChannelAssociation(GetBotChannelAssociationRequest request) {
        request = beforeClientExecution(request);
        return executeGetBotChannelAssociation(request);
    }

    @SdkInternalApi
    final GetBotChannelAssociationResult executeGetBotChannelAssociation(GetBotChannelAssociationRequest getBotChannelAssociationRequest) {

        ExecutionContext executionContext = createExecutionContext(getBotChannelAssociationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBotChannelAssociationRequest> request = null;
        Response<GetBotChannelAssociationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetBotChannelAssociationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getBotChannelAssociationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Model Building Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetBotChannelAssociation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetBotChannelAssociationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetBotChannelAssociationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of all of the channels associated with the specified bot.
     * </p>
     * <p>
     * The <code>GetBotChannelAssociations</code> operation requires permissions for the
     * <code>lex:GetBotChannelAssociations</code> action.
     * </p>
     * 
     * @param getBotChannelAssociationsRequest
     * @return Result of the GetBotChannelAssociations operation returned by the service.
     * @throws LimitExceededException
     *         The request exceeded a limit. Try your request again.
     * @throws InternalFailureException
     *         An internal Amazon Lex error occurred. Try your request again.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and try again.
     * @sample AmazonLexModelBuilding.GetBotChannelAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetBotChannelAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetBotChannelAssociationsResult getBotChannelAssociations(GetBotChannelAssociationsRequest request) {
        request = beforeClientExecution(request);
        return executeGetBotChannelAssociations(request);
    }

    @SdkInternalApi
    final GetBotChannelAssociationsResult executeGetBotChannelAssociations(GetBotChannelAssociationsRequest getBotChannelAssociationsRequest) {

        ExecutionContext executionContext = createExecutionContext(getBotChannelAssociationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBotChannelAssociationsRequest> request = null;
        Response<GetBotChannelAssociationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetBotChannelAssociationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getBotChannelAssociationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Model Building Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetBotChannelAssociations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetBotChannelAssociationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetBotChannelAssociationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about all of the versions of a bot.
     * </p>
     * <p>
     * The <code>GetBotVersions</code> operation returns a <code>BotMetadata</code> object for each version of a bot.
     * For example, if a bot has three numbered versions, the <code>GetBotVersions</code> operation returns four
     * <code>BotMetadata</code> objects in the response, one for each numbered version and one for the
     * <code>$LATEST</code> version.
     * </p>
     * <p>
     * The <code>GetBotVersions</code> operation always returns at least one version, the <code>$LATEST</code> version.
     * </p>
     * <p>
     * This operation requires permissions for the <code>lex:GetBotVersions</code> action.
     * </p>
     * 
     * @param getBotVersionsRequest
     * @return Result of the GetBotVersions operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource and try again.
     * @throws LimitExceededException
     *         The request exceeded a limit. Try your request again.
     * @throws InternalFailureException
     *         An internal Amazon Lex error occurred. Try your request again.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and try again.
     * @sample AmazonLexModelBuilding.GetBotVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetBotVersions" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetBotVersionsResult getBotVersions(GetBotVersionsRequest request) {
        request = beforeClientExecution(request);
        return executeGetBotVersions(request);
    }

    @SdkInternalApi
    final GetBotVersionsResult executeGetBotVersions(GetBotVersionsRequest getBotVersionsRequest) {

        ExecutionContext executionContext = createExecutionContext(getBotVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBotVersionsRequest> request = null;
        Response<GetBotVersionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetBotVersionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getBotVersionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Model Building Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetBotVersions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetBotVersionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetBotVersionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns bot information as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you provide the <code>nameContains</code> field, the response includes information for the
     * <code>$LATEST</code> version of all bots whose name contains the specified string.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you don't specify the <code>nameContains</code> field, the operation returns information about the
     * <code>$LATEST</code> version of all of your bots.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This operation requires permission for the <code>lex:GetBots</code> action.
     * </p>
     * 
     * @param getBotsRequest
     * @return Result of the GetBots operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource and try again.
     * @throws LimitExceededException
     *         The request exceeded a limit. Try your request again.
     * @throws InternalFailureException
     *         An internal Amazon Lex error occurred. Try your request again.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and try again.
     * @sample AmazonLexModelBuilding.GetBots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetBots" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetBotsResult getBots(GetBotsRequest request) {
        request = beforeClientExecution(request);
        return executeGetBots(request);
    }

    @SdkInternalApi
    final GetBotsResult executeGetBots(GetBotsRequest getBotsRequest) {

        ExecutionContext executionContext = createExecutionContext(getBotsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBotsRequest> request = null;
        Response<GetBotsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetBotsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getBotsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Model Building Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetBots");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetBotsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetBotsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a built-in intent.
     * </p>
     * <p>
     * This operation requires permission for the <code>lex:GetBuiltinIntent</code> action.
     * </p>
     * 
     * @param getBuiltinIntentRequest
     * @return Result of the GetBuiltinIntent operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource and try again.
     * @throws LimitExceededException
     *         The request exceeded a limit. Try your request again.
     * @throws InternalFailureException
     *         An internal Amazon Lex error occurred. Try your request again.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and try again.
     * @sample AmazonLexModelBuilding.GetBuiltinIntent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetBuiltinIntent" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetBuiltinIntentResult getBuiltinIntent(GetBuiltinIntentRequest request) {
        request = beforeClientExecution(request);
        return executeGetBuiltinIntent(request);
    }

    @SdkInternalApi
    final GetBuiltinIntentResult executeGetBuiltinIntent(GetBuiltinIntentRequest getBuiltinIntentRequest) {

        ExecutionContext executionContext = createExecutionContext(getBuiltinIntentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBuiltinIntentRequest> request = null;
        Response<GetBuiltinIntentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetBuiltinIntentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getBuiltinIntentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Model Building Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetBuiltinIntent");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetBuiltinIntentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetBuiltinIntentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a list of built-in intents that meet the specified criteria.
     * </p>
     * <p>
     * This operation requires permission for the <code>lex:GetBuiltinIntents</code> action.
     * </p>
     * 
     * @param getBuiltinIntentsRequest
     * @return Result of the GetBuiltinIntents operation returned by the service.
     * @throws LimitExceededException
     *         The request exceeded a limit. Try your request again.
     * @throws InternalFailureException
     *         An internal Amazon Lex error occurred. Try your request again.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and try again.
     * @sample AmazonLexModelBuilding.GetBuiltinIntents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetBuiltinIntents" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetBuiltinIntentsResult getBuiltinIntents(GetBuiltinIntentsRequest request) {
        request = beforeClientExecution(request);
        return executeGetBuiltinIntents(request);
    }

    @SdkInternalApi
    final GetBuiltinIntentsResult executeGetBuiltinIntents(GetBuiltinIntentsRequest getBuiltinIntentsRequest) {

        ExecutionContext executionContext = createExecutionContext(getBuiltinIntentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBuiltinIntentsRequest> request = null;
        Response<GetBuiltinIntentsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetBuiltinIntentsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getBuiltinIntentsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Model Building Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetBuiltinIntents");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetBuiltinIntentsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetBuiltinIntentsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a list of built-in slot types that meet the specified criteria.
     * </p>
     * <p>
     * For a list of built-in slot types, see <a href=
     * "https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/slot-type-reference"
     * >Slot Type Reference</a> in the <i>Alexa Skills Kit</i>.
     * </p>
     * <p>
     * This operation requires permission for the <code>lex:GetBuiltInSlotTypes</code> action.
     * </p>
     * 
     * @param getBuiltinSlotTypesRequest
     * @return Result of the GetBuiltinSlotTypes operation returned by the service.
     * @throws LimitExceededException
     *         The request exceeded a limit. Try your request again.
     * @throws InternalFailureException
     *         An internal Amazon Lex error occurred. Try your request again.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and try again.
     * @sample AmazonLexModelBuilding.GetBuiltinSlotTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetBuiltinSlotTypes" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetBuiltinSlotTypesResult getBuiltinSlotTypes(GetBuiltinSlotTypesRequest request) {
        request = beforeClientExecution(request);
        return executeGetBuiltinSlotTypes(request);
    }

    @SdkInternalApi
    final GetBuiltinSlotTypesResult executeGetBuiltinSlotTypes(GetBuiltinSlotTypesRequest getBuiltinSlotTypesRequest) {

        ExecutionContext executionContext = createExecutionContext(getBuiltinSlotTypesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBuiltinSlotTypesRequest> request = null;
        Response<GetBuiltinSlotTypesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetBuiltinSlotTypesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getBuiltinSlotTypesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Model Building Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetBuiltinSlotTypes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetBuiltinSlotTypesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetBuiltinSlotTypesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Exports the contents of a Amazon Lex resource in a specified format.
     * </p>
     * 
     * @param getExportRequest
     * @return Result of the GetExport operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource and try again.
     * @throws LimitExceededException
     *         The request exceeded a limit. Try your request again.
     * @throws InternalFailureException
     *         An internal Amazon Lex error occurred. Try your request again.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and try again.
     * @sample AmazonLexModelBuilding.GetExport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetExport" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetExportResult getExport(GetExportRequest request) {
        request = beforeClientExecution(request);
        return executeGetExport(request);
    }

    @SdkInternalApi
    final GetExportResult executeGetExport(GetExportRequest getExportRequest) {

        ExecutionContext executionContext = createExecutionContext(getExportRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetExportRequest> request = null;
        Response<GetExportResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetExportRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getExportRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Model Building Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetExport");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetExportResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetExportResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about an import job started with the <code>StartImport</code> operation.
     * </p>
     * 
     * @param getImportRequest
     * @return Result of the GetImport operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource and try again.
     * @throws LimitExceededException
     *         The request exceeded a limit. Try your request again.
     * @throws InternalFailureException
     *         An internal Amazon Lex error occurred. Try your request again.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and try again.
     * @sample AmazonLexModelBuilding.GetImport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetImport" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetImportResult getImport(GetImportRequest request) {
        request = beforeClientExecution(request);
        return executeGetImport(request);
    }

    @SdkInternalApi
    final GetImportResult executeGetImport(GetImportRequest getImportRequest) {

        ExecutionContext executionContext = createExecutionContext(getImportRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetImportRequest> request = null;
        Response<GetImportResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetImportRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getImportRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Model Building Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetImport");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetImportResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetImportResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about an intent. In addition to the intent name, you must specify the intent version.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>lex:GetIntent</code> action.
     * </p>
     * 
     * @param getIntentRequest
     * @return Result of the GetIntent operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource and try again.
     * @throws LimitExceededException
     *         The request exceeded a limit. Try your request again.
     * @throws InternalFailureException
     *         An internal Amazon Lex error occurred. Try your request again.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and try again.
     * @sample AmazonLexModelBuilding.GetIntent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetIntent" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetIntentResult getIntent(GetIntentRequest request) {
        request = beforeClientExecution(request);
        return executeGetIntent(request);
    }

    @SdkInternalApi
    final GetIntentResult executeGetIntent(GetIntentRequest getIntentRequest) {

        ExecutionContext executionContext = createExecutionContext(getIntentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetIntentRequest> request = null;
        Response<GetIntentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetIntentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getIntentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Model Building Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetIntent");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetIntentResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetIntentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about all of the versions of an intent.
     * </p>
     * <p>
     * The <code>GetIntentVersions</code> operation returns an <code>IntentMetadata</code> object for each version of an
     * intent. For example, if an intent has three numbered versions, the <code>GetIntentVersions</code> operation
     * returns four <code>IntentMetadata</code> objects in the response, one for each numbered version and one for the
     * <code>$LATEST</code> version.
     * </p>
     * <p>
     * The <code>GetIntentVersions</code> operation always returns at least one version, the <code>$LATEST</code>
     * version.
     * </p>
     * <p>
     * This operation requires permissions for the <code>lex:GetIntentVersions</code> action.
     * </p>
     * 
     * @param getIntentVersionsRequest
     * @return Result of the GetIntentVersions operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource and try again.
     * @throws LimitExceededException
     *         The request exceeded a limit. Try your request again.
     * @throws InternalFailureException
     *         An internal Amazon Lex error occurred. Try your request again.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and try again.
     * @sample AmazonLexModelBuilding.GetIntentVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetIntentVersions" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetIntentVersionsResult getIntentVersions(GetIntentVersionsRequest request) {
        request = beforeClientExecution(request);
        return executeGetIntentVersions(request);
    }

    @SdkInternalApi
    final GetIntentVersionsResult executeGetIntentVersions(GetIntentVersionsRequest getIntentVersionsRequest) {

        ExecutionContext executionContext = createExecutionContext(getIntentVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetIntentVersionsRequest> request = null;
        Response<GetIntentVersionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetIntentVersionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getIntentVersionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Model Building Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetIntentVersions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetIntentVersionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetIntentVersionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns intent information as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify the <code>nameContains</code> field, returns the <code>$LATEST</code> version of all intents that
     * contain the specified string.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you don't specify the <code>nameContains</code> field, returns information about the <code>$LATEST</code>
     * version of all intents.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The operation requires permission for the <code>lex:GetIntents</code> action.
     * </p>
     * 
     * @param getIntentsRequest
     * @return Result of the GetIntents operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource and try again.
     * @throws LimitExceededException
     *         The request exceeded a limit. Try your request again.
     * @throws InternalFailureException
     *         An internal Amazon Lex error occurred. Try your request again.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and try again.
     * @sample AmazonLexModelBuilding.GetIntents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetIntents" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetIntentsResult getIntents(GetIntentsRequest request) {
        request = beforeClientExecution(request);
        return executeGetIntents(request);
    }

    @SdkInternalApi
    final GetIntentsResult executeGetIntents(GetIntentsRequest getIntentsRequest) {

        ExecutionContext executionContext = createExecutionContext(getIntentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetIntentsRequest> request = null;
        Response<GetIntentsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetIntentsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getIntentsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Model Building Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetIntents");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetIntentsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetIntentsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a specific version of a slot type. In addition to specifying the slot type name, you
     * must specify the slot type version.
     * </p>
     * <p>
     * This operation requires permissions for the <code>lex:GetSlotType</code> action.
     * </p>
     * 
     * @param getSlotTypeRequest
     * @return Result of the GetSlotType operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource and try again.
     * @throws LimitExceededException
     *         The request exceeded a limit. Try your request again.
     * @throws InternalFailureException
     *         An internal Amazon Lex error occurred. Try your request again.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and try again.
     * @sample AmazonLexModelBuilding.GetSlotType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetSlotType" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetSlotTypeResult getSlotType(GetSlotTypeRequest request) {
        request = beforeClientExecution(request);
        return executeGetSlotType(request);
    }

    @SdkInternalApi
    final GetSlotTypeResult executeGetSlotType(GetSlotTypeRequest getSlotTypeRequest) {

        ExecutionContext executionContext = createExecutionContext(getSlotTypeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSlotTypeRequest> request = null;
        Response<GetSlotTypeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSlotTypeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSlotTypeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Model Building Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSlotType");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSlotTypeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetSlotTypeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about all versions of a slot type.
     * </p>
     * <p>
     * The <code>GetSlotTypeVersions</code> operation returns a <code>SlotTypeMetadata</code> object for each version of
     * a slot type. For example, if a slot type has three numbered versions, the <code>GetSlotTypeVersions</code>
     * operation returns four <code>SlotTypeMetadata</code> objects in the response, one for each numbered version and
     * one for the <code>$LATEST</code> version.
     * </p>
     * <p>
     * The <code>GetSlotTypeVersions</code> operation always returns at least one version, the <code>$LATEST</code>
     * version.
     * </p>
     * <p>
     * This operation requires permissions for the <code>lex:GetSlotTypeVersions</code> action.
     * </p>
     * 
     * @param getSlotTypeVersionsRequest
     * @return Result of the GetSlotTypeVersions operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource and try again.
     * @throws LimitExceededException
     *         The request exceeded a limit. Try your request again.
     * @throws InternalFailureException
     *         An internal Amazon Lex error occurred. Try your request again.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and try again.
     * @sample AmazonLexModelBuilding.GetSlotTypeVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetSlotTypeVersions" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetSlotTypeVersionsResult getSlotTypeVersions(GetSlotTypeVersionsRequest request) {
        request = beforeClientExecution(request);
        return executeGetSlotTypeVersions(request);
    }

    @SdkInternalApi
    final GetSlotTypeVersionsResult executeGetSlotTypeVersions(GetSlotTypeVersionsRequest getSlotTypeVersionsRequest) {

        ExecutionContext executionContext = createExecutionContext(getSlotTypeVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSlotTypeVersionsRequest> request = null;
        Response<GetSlotTypeVersionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSlotTypeVersionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSlotTypeVersionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Model Building Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSlotTypeVersions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSlotTypeVersionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetSlotTypeVersionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns slot type information as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify the <code>nameContains</code> field, returns the <code>$LATEST</code> version of all slot types
     * that contain the specified string.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you don't specify the <code>nameContains</code> field, returns information about the <code>$LATEST</code>
     * version of all slot types.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The operation requires permission for the <code>lex:GetSlotTypes</code> action.
     * </p>
     * 
     * @param getSlotTypesRequest
     * @return Result of the GetSlotTypes operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource and try again.
     * @throws LimitExceededException
     *         The request exceeded a limit. Try your request again.
     * @throws InternalFailureException
     *         An internal Amazon Lex error occurred. Try your request again.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and try again.
     * @sample AmazonLexModelBuilding.GetSlotTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetSlotTypes" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetSlotTypesResult getSlotTypes(GetSlotTypesRequest request) {
        request = beforeClientExecution(request);
        return executeGetSlotTypes(request);
    }

    @SdkInternalApi
    final GetSlotTypesResult executeGetSlotTypes(GetSlotTypesRequest getSlotTypesRequest) {

        ExecutionContext executionContext = createExecutionContext(getSlotTypesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSlotTypesRequest> request = null;
        Response<GetSlotTypesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSlotTypesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSlotTypesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Model Building Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSlotTypes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSlotTypesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetSlotTypesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Use the <code>GetUtterancesView</code> operation to get information about the utterances that your users have
     * made to your bot. You can use this list to tune the utterances that your bot responds to.
     * </p>
     * <p>
     * For example, say that you have created a bot to order flowers. After your users have used your bot for a while,
     * use the <code>GetUtterancesView</code> operation to see the requests that they have made and whether they have
     * been successful. You might find that the utterance "I want flowers" is not being recognized. You could add this
     * utterance to the <code>OrderFlowers</code> intent so that your bot recognizes that utterance.
     * </p>
     * <p>
     * After you publish a new version of a bot, you can get information about the old version and the new so that you
     * can compare the performance across the two versions.
     * </p>
     * <note>
     * <p>
     * Utterance statistics are generated once a day. Data is available for the last 15 days. You can request
     * information for up to 5 versions in each request. The response contains information about a maximum of 100
     * utterances for each version.
     * </p>
     * </note>
     * <p>
     * This operation requires permissions for the <code>lex:GetUtterancesView</code> action.
     * </p>
     * 
     * @param getUtterancesViewRequest
     * @return Result of the GetUtterancesView operation returned by the service.
     * @throws LimitExceededException
     *         The request exceeded a limit. Try your request again.
     * @throws InternalFailureException
     *         An internal Amazon Lex error occurred. Try your request again.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and try again.
     * @sample AmazonLexModelBuilding.GetUtterancesView
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetUtterancesView" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetUtterancesViewResult getUtterancesView(GetUtterancesViewRequest request) {
        request = beforeClientExecution(request);
        return executeGetUtterancesView(request);
    }

    @SdkInternalApi
    final GetUtterancesViewResult executeGetUtterancesView(GetUtterancesViewRequest getUtterancesViewRequest) {

        ExecutionContext executionContext = createExecutionContext(getUtterancesViewRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetUtterancesViewRequest> request = null;
        Response<GetUtterancesViewResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetUtterancesViewRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getUtterancesViewRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Model Building Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetUtterancesView");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetUtterancesViewResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetUtterancesViewResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an Amazon Lex conversational bot or replaces an existing bot. When you create or update a bot you are
     * only required to specify a name, a locale, and whether the bot is directed toward children under age 13. You can
     * use this to add intents later, or to remove intents from an existing bot. When you create a bot with the minimum
     * information, the bot is created or updated but Amazon Lex returns the <code/> response <code>FAILED</code>. You
     * can build the bot after you add one or more intents. For more information about Amazon Lex bots, see
     * <a>how-it-works</a>.
     * </p>
     * <p>
     * If you specify the name of an existing bot, the fields in the request replace the existing values in the
     * <code>$LATEST</code> version of the bot. Amazon Lex removes any fields that you don't provide values for in the
     * request, except for the <code>idleTTLInSeconds</code> and <code>privacySettings</code> fields, which are set to
     * their default values. If you don't specify values for required fields, Amazon Lex throws an exception.
     * </p>
     * <p>
     * This operation requires permissions for the <code>lex:PutBot</code> action. For more information, see
     * <a>auth-and-access-control</a>.
     * </p>
     * 
     * @param putBotRequest
     * @return Result of the PutBot operation returned by the service.
     * @throws ConflictException
     *         There was a conflict processing the request. Try your request again.
     * @throws LimitExceededException
     *         The request exceeded a limit. Try your request again.
     * @throws InternalFailureException
     *         An internal Amazon Lex error occurred. Try your request again.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and try again.
     * @throws PreconditionFailedException
     *         The checksum of the resource that you are trying to change does not match the checksum in the request.
     *         Check the resource's checksum and try again.
     * @sample AmazonLexModelBuilding.PutBot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/PutBot" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutBotResult putBot(PutBotRequest request) {
        request = beforeClientExecution(request);
        return executePutBot(request);
    }

    @SdkInternalApi
    final PutBotResult executePutBot(PutBotRequest putBotRequest) {

        ExecutionContext executionContext = createExecutionContext(putBotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutBotRequest> request = null;
        Response<PutBotResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutBotRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putBotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Model Building Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutBot");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutBotResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutBotResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an alias for the specified version of the bot or replaces an alias for the specified bot. To change the
     * version of the bot that the alias points to, replace the alias. For more information about aliases, see
     * <a>versioning-aliases</a>.
     * </p>
     * <p>
     * This operation requires permissions for the <code>lex:PutBotAlias</code> action.
     * </p>
     * 
     * @param putBotAliasRequest
     * @return Result of the PutBotAlias operation returned by the service.
     * @throws ConflictException
     *         There was a conflict processing the request. Try your request again.
     * @throws LimitExceededException
     *         The request exceeded a limit. Try your request again.
     * @throws InternalFailureException
     *         An internal Amazon Lex error occurred. Try your request again.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and try again.
     * @throws PreconditionFailedException
     *         The checksum of the resource that you are trying to change does not match the checksum in the request.
     *         Check the resource's checksum and try again.
     * @sample AmazonLexModelBuilding.PutBotAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/PutBotAlias" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutBotAliasResult putBotAlias(PutBotAliasRequest request) {
        request = beforeClientExecution(request);
        return executePutBotAlias(request);
    }

    @SdkInternalApi
    final PutBotAliasResult executePutBotAlias(PutBotAliasRequest putBotAliasRequest) {

        ExecutionContext executionContext = createExecutionContext(putBotAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutBotAliasRequest> request = null;
        Response<PutBotAliasResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutBotAliasRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putBotAliasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Model Building Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutBotAlias");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutBotAliasResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutBotAliasResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an intent or replaces an existing intent.
     * </p>
     * <p>
     * To define the interaction between the user and your bot, you use one or more intents. For a pizza ordering bot,
     * for example, you would create an <code>OrderPizza</code> intent.
     * </p>
     * <p>
     * To create an intent or replace an existing intent, you must provide the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Intent name. For example, <code>OrderPizza</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Sample utterances. For example, "Can I order a pizza, please." and "I want to order a pizza."
     * </p>
     * </li>
     * <li>
     * <p>
     * Information to be gathered. You specify slot types for the information that your bot will request from the user.
     * You can specify standard slot types, such as a date or a time, or custom slot types such as the size and crust of
     * a pizza.
     * </p>
     * </li>
     * <li>
     * <p>
     * How the intent will be fulfilled. You can provide a Lambda function or configure the intent to return the intent
     * information to the client application. If you use a Lambda function, when all of the intent information is
     * available, Amazon Lex invokes your Lambda function. If you configure your intent to return the intent information
     * to the client application.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can specify other optional information in the request, such as:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A confirmation prompt to ask the user to confirm an intent. For example, "Shall I order your pizza?"
     * </p>
     * </li>
     * <li>
     * <p>
     * A conclusion statement to send to the user after the intent has been fulfilled. For example,
     * "I placed your pizza order."
     * </p>
     * </li>
     * <li>
     * <p>
     * A follow-up prompt that asks the user for additional activity. For example, asking
     * "Do you want to order a drink with your pizza?"
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify an existing intent name to update the intent, Amazon Lex replaces the values in the
     * <code>$LATEST</code> version of the intent with the values in the request. Amazon Lex removes fields that you
     * don't provide in the request. If you don't specify the required fields, Amazon Lex throws an exception. When you
     * update the <code>$LATEST</code> version of an intent, the <code>status</code> field of any bot that uses the
     * <code>$LATEST</code> version of the intent is set to <code>NOT_BUILT</code>.
     * </p>
     * <p>
     * For more information, see <a>how-it-works</a>.
     * </p>
     * <p>
     * This operation requires permissions for the <code>lex:PutIntent</code> action.
     * </p>
     * 
     * @param putIntentRequest
     * @return Result of the PutIntent operation returned by the service.
     * @throws ConflictException
     *         There was a conflict processing the request. Try your request again.
     * @throws LimitExceededException
     *         The request exceeded a limit. Try your request again.
     * @throws InternalFailureException
     *         An internal Amazon Lex error occurred. Try your request again.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and try again.
     * @throws PreconditionFailedException
     *         The checksum of the resource that you are trying to change does not match the checksum in the request.
     *         Check the resource's checksum and try again.
     * @sample AmazonLexModelBuilding.PutIntent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/PutIntent" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutIntentResult putIntent(PutIntentRequest request) {
        request = beforeClientExecution(request);
        return executePutIntent(request);
    }

    @SdkInternalApi
    final PutIntentResult executePutIntent(PutIntentRequest putIntentRequest) {

        ExecutionContext executionContext = createExecutionContext(putIntentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutIntentRequest> request = null;
        Response<PutIntentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutIntentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putIntentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Model Building Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutIntent");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutIntentResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutIntentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a custom slot type or replaces an existing custom slot type.
     * </p>
     * <p>
     * To create a custom slot type, specify a name for the slot type and a set of enumeration values, which are the
     * values that a slot of this type can assume. For more information, see <a>how-it-works</a>.
     * </p>
     * <p>
     * If you specify the name of an existing slot type, the fields in the request replace the existing values in the
     * <code>$LATEST</code> version of the slot type. Amazon Lex removes the fields that you don't provide in the
     * request. If you don't specify required fields, Amazon Lex throws an exception. When you update the
     * <code>$LATEST</code> version of a slot type, if a bot uses the <code>$LATEST</code> version of an intent that
     * contains the slot type, the bot's <code>status</code> field is set to <code>NOT_BUILT</code>.
     * </p>
     * <p>
     * This operation requires permissions for the <code>lex:PutSlotType</code> action.
     * </p>
     * 
     * @param putSlotTypeRequest
     * @return Result of the PutSlotType operation returned by the service.
     * @throws ConflictException
     *         There was a conflict processing the request. Try your request again.
     * @throws LimitExceededException
     *         The request exceeded a limit. Try your request again.
     * @throws InternalFailureException
     *         An internal Amazon Lex error occurred. Try your request again.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and try again.
     * @throws PreconditionFailedException
     *         The checksum of the resource that you are trying to change does not match the checksum in the request.
     *         Check the resource's checksum and try again.
     * @sample AmazonLexModelBuilding.PutSlotType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/PutSlotType" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutSlotTypeResult putSlotType(PutSlotTypeRequest request) {
        request = beforeClientExecution(request);
        return executePutSlotType(request);
    }

    @SdkInternalApi
    final PutSlotTypeResult executePutSlotType(PutSlotTypeRequest putSlotTypeRequest) {

        ExecutionContext executionContext = createExecutionContext(putSlotTypeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutSlotTypeRequest> request = null;
        Response<PutSlotTypeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutSlotTypeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putSlotTypeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Model Building Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutSlotType");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutSlotTypeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutSlotTypeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts a job to import a resource to Amazon Lex.
     * </p>
     * 
     * @param startImportRequest
     * @return Result of the StartImport operation returned by the service.
     * @throws LimitExceededException
     *         The request exceeded a limit. Try your request again.
     * @throws InternalFailureException
     *         An internal Amazon Lex error occurred. Try your request again.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and try again.
     * @sample AmazonLexModelBuilding.StartImport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/StartImport" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StartImportResult startImport(StartImportRequest request) {
        request = beforeClientExecution(request);
        return executeStartImport(request);
    }

    @SdkInternalApi
    final StartImportResult executeStartImport(StartImportRequest startImportRequest) {

        ExecutionContext executionContext = createExecutionContext(startImportRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartImportRequest> request = null;
        Response<StartImportResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartImportRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startImportRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Model Building Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartImport");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartImportResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartImportResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns additional metadata for a previously executed successful, request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing the request.
     *
     * @param request
     *        The originally executed request
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    /**
     * Normal invoke with authentication. Credentials are required and may be overriden at the request level.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {

        return invoke(request, responseHandler, executionContext, null, null);
    }

    /**
     * Normal invoke with authentication. Credentials are required and may be overriden at the request level.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext, URI cachedEndpoint, URI uriFromEndpointTrait) {

        executionContext.setCredentialsProvider(CredentialUtils.getCredentialsProvider(request.getOriginalRequest(), awsCredentialsProvider));

        return doInvoke(request, responseHandler, executionContext, cachedEndpoint, uriFromEndpointTrait);
    }

    /**
     * Invoke with no authentication. Credentials are not required and any credentials set on the client or request will
     * be ignored for this operation.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> anonymousInvoke(Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler, ExecutionContext executionContext) {

        return doInvoke(request, responseHandler, executionContext, null, null);
    }

    /**
     * Invoke the request using the http client. Assumes credentials (or lack thereof) have been configured in the
     * ExecutionContext beforehand.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> doInvoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext, URI discoveredEndpoint, URI uriFromEndpointTrait) {

        if (discoveredEndpoint != null) {
            request.setEndpoint(discoveredEndpoint);
            request.getOriginalRequest().getRequestClientOptions().appendUserAgent("endpoint-discovery");
        } else if (uriFromEndpointTrait != null) {
            request.setEndpoint(uriFromEndpointTrait);
        } else {
            request.setEndpoint(endpoint);
        }

        request.setTimeOffset(timeOffset);

        HttpResponseHandler<AmazonServiceException> errorResponseHandler = protocolFactory.createErrorResponseHandler(new JsonErrorResponseMetadata());

        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }

    @com.amazonaws.annotation.SdkInternalApi
    static com.amazonaws.protocol.json.SdkJsonProtocolFactory getProtocolFactory() {
        return protocolFactory;
    }

}
