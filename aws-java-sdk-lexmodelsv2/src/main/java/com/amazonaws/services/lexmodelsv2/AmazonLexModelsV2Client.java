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
package com.amazonaws.services.lexmodelsv2;

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

import com.amazonaws.services.lexmodelsv2.AmazonLexModelsV2ClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.lexmodelsv2.model.*;
import com.amazonaws.services.lexmodelsv2.model.transform.*;

/**
 * Client for accessing Lex Models V2. All service calls made using this client are blocking, and will not return until
 * the service call completes.
 * <p>
 * <p/>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonLexModelsV2Client extends AmazonWebServiceClient implements AmazonLexModelsV2 {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonLexModelsV2.class);

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
                    .withContentTypeOverride("application/x-amz-json-1.1")
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.lexmodelsv2.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.lexmodelsv2.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.lexmodelsv2.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.lexmodelsv2.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("PreconditionFailedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.lexmodelsv2.model.transform.PreconditionFailedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.lexmodelsv2.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.lexmodelsv2.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.lexmodelsv2.model.AmazonLexModelsV2Exception.class));

    public static AmazonLexModelsV2ClientBuilder builder() {
        return AmazonLexModelsV2ClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Lex Models V2 using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonLexModelsV2Client(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Lex Models V2 using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonLexModelsV2Client(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("models-v2-lex.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/lexmodelsv2/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/lexmodelsv2/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Builds a bot, its intents, and its slot types into a specific locale. A bot can be built into multiple locales.
     * At runtime the locale is used to choose a specific build of the bot.
     * </p>
     * 
     * @param buildBotLocaleRequest
     * @return Result of the BuildBotLocale operation returned by the service.
     * @throws ThrottlingException
     * @throws ServiceQuotaExceededException
     * @throws ValidationException
     * @throws PreconditionFailedException
     * @throws ConflictException
     * @throws InternalServerException
     * @sample AmazonLexModelsV2.BuildBotLocale
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/BuildBotLocale" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public BuildBotLocaleResult buildBotLocale(BuildBotLocaleRequest request) {
        request = beforeClientExecution(request);
        return executeBuildBotLocale(request);
    }

    @SdkInternalApi
    final BuildBotLocaleResult executeBuildBotLocale(BuildBotLocaleRequest buildBotLocaleRequest) {

        ExecutionContext executionContext = createExecutionContext(buildBotLocaleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BuildBotLocaleRequest> request = null;
        Response<BuildBotLocaleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BuildBotLocaleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(buildBotLocaleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Models V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BuildBotLocale");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BuildBotLocaleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new BuildBotLocaleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an Amazon Lex conversational bot.
     * </p>
     * 
     * @param createBotRequest
     * @return Result of the CreateBot operation returned by the service.
     * @throws ThrottlingException
     * @throws ServiceQuotaExceededException
     * @throws ValidationException
     * @throws PreconditionFailedException
     * @throws ConflictException
     * @throws InternalServerException
     * @sample AmazonLexModelsV2.CreateBot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/CreateBot" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateBotResult createBot(CreateBotRequest request) {
        request = beforeClientExecution(request);
        return executeCreateBot(request);
    }

    @SdkInternalApi
    final CreateBotResult executeCreateBot(CreateBotRequest createBotRequest) {

        ExecutionContext executionContext = createExecutionContext(createBotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateBotRequest> request = null;
        Response<CreateBotResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateBotRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createBotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Models V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateBot");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateBotResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateBotResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an alias for the specified version of a bot. Use an alias to enable you to change the version of a bot
     * without updating applications that use the bot.
     * </p>
     * <p>
     * For example, you can create an alias called "PROD" that your applications use to call the Amazon Lex bot.
     * </p>
     * 
     * @param createBotAliasRequest
     * @return Result of the CreateBotAlias operation returned by the service.
     * @throws ThrottlingException
     * @throws ServiceQuotaExceededException
     * @throws ValidationException
     * @throws PreconditionFailedException
     * @throws ConflictException
     * @throws InternalServerException
     * @sample AmazonLexModelsV2.CreateBotAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/CreateBotAlias" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateBotAliasResult createBotAlias(CreateBotAliasRequest request) {
        request = beforeClientExecution(request);
        return executeCreateBotAlias(request);
    }

    @SdkInternalApi
    final CreateBotAliasResult executeCreateBotAlias(CreateBotAliasRequest createBotAliasRequest) {

        ExecutionContext executionContext = createExecutionContext(createBotAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateBotAliasRequest> request = null;
        Response<CreateBotAliasResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateBotAliasRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createBotAliasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Models V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateBotAlias");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateBotAliasResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateBotAliasResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a locale in the bot. The locale contains the intents and slot types that the bot uses in conversations
     * with users in the specified language and locale. You must add a locale to a bot before you can add intents and
     * slot types to the bot.
     * </p>
     * 
     * @param createBotLocaleRequest
     * @return Result of the CreateBotLocale operation returned by the service.
     * @throws ThrottlingException
     * @throws ServiceQuotaExceededException
     * @throws ValidationException
     * @throws PreconditionFailedException
     * @throws ConflictException
     * @throws InternalServerException
     * @sample AmazonLexModelsV2.CreateBotLocale
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/CreateBotLocale" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateBotLocaleResult createBotLocale(CreateBotLocaleRequest request) {
        request = beforeClientExecution(request);
        return executeCreateBotLocale(request);
    }

    @SdkInternalApi
    final CreateBotLocaleResult executeCreateBotLocale(CreateBotLocaleRequest createBotLocaleRequest) {

        ExecutionContext executionContext = createExecutionContext(createBotLocaleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateBotLocaleRequest> request = null;
        Response<CreateBotLocaleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateBotLocaleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createBotLocaleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Models V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateBotLocale");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateBotLocaleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateBotLocaleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new version of the bot based on the <code>DRAFT</code> version. If the <code>DRAFT</code> version of
     * this resource hasn't changed since you created the last version, Amazon Lex doesn't create a new version, it
     * returns the last created version.
     * </p>
     * <p>
     * When you create the first version of a bot, Amazon Lex sets the version to 1. Subsequent versions increment by 1.
     * </p>
     * 
     * @param createBotVersionRequest
     * @return Result of the CreateBotVersion operation returned by the service.
     * @throws ThrottlingException
     * @throws ServiceQuotaExceededException
     * @throws ValidationException
     * @throws PreconditionFailedException
     * @throws ConflictException
     * @throws InternalServerException
     * @sample AmazonLexModelsV2.CreateBotVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/CreateBotVersion" target="_top">AWS
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Models V2");
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
     * Creates a zip archive containing the contents of a bot or a bot locale. The archive contains a directory
     * structure that contains JSON files that define the bot.
     * </p>
     * <p>
     * You can create an archive that contains the complete definition of a bot, or you can specify that the archive
     * contain only the definition of a single bot locale.
     * </p>
     * <p>
     * For more information about exporting bots, and about the structure of the export archive, see <a
     * href="https://docs.aws.amazon.com/lexv2/latest/dg/importing-exporting.html"> Importing and exporting bots </a>
     * </p>
     * 
     * @param createExportRequest
     * @return Result of the CreateExport operation returned by the service.
     * @throws ThrottlingException
     * @throws ServiceQuotaExceededException
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws ConflictException
     * @throws InternalServerException
     * @sample AmazonLexModelsV2.CreateExport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/CreateExport" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateExportResult createExport(CreateExportRequest request) {
        request = beforeClientExecution(request);
        return executeCreateExport(request);
    }

    @SdkInternalApi
    final CreateExportResult executeCreateExport(CreateExportRequest createExportRequest) {

        ExecutionContext executionContext = createExecutionContext(createExportRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateExportRequest> request = null;
        Response<CreateExportResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateExportRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createExportRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Models V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateExport");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateExportResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateExportResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an intent.
     * </p>
     * <p>
     * To define the interaction between the user and your bot, you define one or more intents. For example, for a pizza
     * ordering bot you would create an <code>OrderPizza</code> intent.
     * </p>
     * <p>
     * When you create an intent, you must provide a name. You can optionally provide the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Sample utterances. For example, "I want to order a pizza" and "Can I order a pizza." You can't provide utterances
     * for built-in intents.
     * </p>
     * </li>
     * <li>
     * <p>
     * Information to be gathered. You specify slots for the information that you bot requests from the user. You can
     * specify standard slot types, such as date and time, or custom slot types for your application.
     * </p>
     * </li>
     * <li>
     * <p>
     * How the intent is fulfilled. You can provide a Lambda function or configure the intent to return the intent
     * information to your client application. If you use a Lambda function, Amazon Lex invokes the function when all of
     * the intent information is available.
     * </p>
     * </li>
     * <li>
     * <p>
     * A confirmation prompt to send to the user to confirm an intent. For example, "Shall I order your pizza?"
     * </p>
     * </li>
     * <li>
     * <p>
     * A conclusion statement to send to the user after the intent is fulfilled. For example, "I ordered your pizza."
     * </p>
     * </li>
     * <li>
     * <p>
     * A follow-up prompt that asks the user for additional activity. For example,
     * "Do you want a drink with your pizza?"
     * </p>
     * </li>
     * </ul>
     * 
     * @param createIntentRequest
     * @return Result of the CreateIntent operation returned by the service.
     * @throws ThrottlingException
     * @throws ServiceQuotaExceededException
     * @throws ValidationException
     * @throws PreconditionFailedException
     * @throws ConflictException
     * @throws InternalServerException
     * @sample AmazonLexModelsV2.CreateIntent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/CreateIntent" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateIntentResult createIntent(CreateIntentRequest request) {
        request = beforeClientExecution(request);
        return executeCreateIntent(request);
    }

    @SdkInternalApi
    final CreateIntentResult executeCreateIntent(CreateIntentRequest createIntentRequest) {

        ExecutionContext executionContext = createExecutionContext(createIntentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateIntentRequest> request = null;
        Response<CreateIntentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateIntentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createIntentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Models V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateIntent");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateIntentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateIntentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new resource policy with the specified policy statements.
     * </p>
     * 
     * @param createResourcePolicyRequest
     * @return Result of the CreateResourcePolicy operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ServiceQuotaExceededException
     * @throws PreconditionFailedException
     * @throws ValidationException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @sample AmazonLexModelsV2.CreateResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/CreateResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateResourcePolicyResult createResourcePolicy(CreateResourcePolicyRequest request) {
        request = beforeClientExecution(request);
        return executeCreateResourcePolicy(request);
    }

    @SdkInternalApi
    final CreateResourcePolicyResult executeCreateResourcePolicy(CreateResourcePolicyRequest createResourcePolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(createResourcePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateResourcePolicyRequest> request = null;
        Response<CreateResourcePolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateResourcePolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createResourcePolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Models V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateResourcePolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateResourcePolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateResourcePolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds a new resource policy statement to a bot or bot alias. If a resource policy exists, the statement is added
     * to the current resource policy. If a policy doesn't exist, a new policy is created.
     * </p>
     * <p>
     * You can't create a resource policy statement that allows cross-account access.
     * </p>
     * 
     * @param createResourcePolicyStatementRequest
     * @return Result of the CreateResourcePolicyStatement operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ConflictException
     * @throws ServiceQuotaExceededException
     * @throws PreconditionFailedException
     * @throws ValidationException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @sample AmazonLexModelsV2.CreateResourcePolicyStatement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/CreateResourcePolicyStatement"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateResourcePolicyStatementResult createResourcePolicyStatement(CreateResourcePolicyStatementRequest request) {
        request = beforeClientExecution(request);
        return executeCreateResourcePolicyStatement(request);
    }

    @SdkInternalApi
    final CreateResourcePolicyStatementResult executeCreateResourcePolicyStatement(CreateResourcePolicyStatementRequest createResourcePolicyStatementRequest) {

        ExecutionContext executionContext = createExecutionContext(createResourcePolicyStatementRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateResourcePolicyStatementRequest> request = null;
        Response<CreateResourcePolicyStatementResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateResourcePolicyStatementRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createResourcePolicyStatementRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Models V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateResourcePolicyStatement");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateResourcePolicyStatementResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateResourcePolicyStatementResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a slot in an intent. A slot is a variable needed to fulfill an intent. For example, an
     * <code>OrderPizza</code> intent might need slots for size, crust, and number of pizzas. For each slot, you define
     * one or more utterances that Amazon Lex uses to elicit a response from the user.
     * </p>
     * 
     * @param createSlotRequest
     * @return Result of the CreateSlot operation returned by the service.
     * @throws ThrottlingException
     * @throws ServiceQuotaExceededException
     * @throws ValidationException
     * @throws PreconditionFailedException
     * @throws ConflictException
     * @throws InternalServerException
     * @sample AmazonLexModelsV2.CreateSlot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/CreateSlot" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateSlotResult createSlot(CreateSlotRequest request) {
        request = beforeClientExecution(request);
        return executeCreateSlot(request);
    }

    @SdkInternalApi
    final CreateSlotResult executeCreateSlot(CreateSlotRequest createSlotRequest) {

        ExecutionContext executionContext = createExecutionContext(createSlotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSlotRequest> request = null;
        Response<CreateSlotResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSlotRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createSlotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Models V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateSlot");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateSlotResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateSlotResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a custom slot type
     * </p>
     * <p>
     * To create a custom slot type, specify a name for the slot type and a set of enumeration values, the values that a
     * slot of this type can assume.
     * </p>
     * 
     * @param createSlotTypeRequest
     * @return Result of the CreateSlotType operation returned by the service.
     * @throws ThrottlingException
     * @throws ServiceQuotaExceededException
     * @throws ValidationException
     * @throws PreconditionFailedException
     * @throws ConflictException
     * @throws InternalServerException
     * @sample AmazonLexModelsV2.CreateSlotType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/CreateSlotType" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateSlotTypeResult createSlotType(CreateSlotTypeRequest request) {
        request = beforeClientExecution(request);
        return executeCreateSlotType(request);
    }

    @SdkInternalApi
    final CreateSlotTypeResult executeCreateSlotType(CreateSlotTypeRequest createSlotTypeRequest) {

        ExecutionContext executionContext = createExecutionContext(createSlotTypeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSlotTypeRequest> request = null;
        Response<CreateSlotTypeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSlotTypeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createSlotTypeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Models V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateSlotType");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateSlotTypeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateSlotTypeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a pre-signed S3 write URL that you use to upload the zip archive when importing a bot or a bot locale.
     * </p>
     * 
     * @param createUploadUrlRequest
     * @return Result of the CreateUploadUrl operation returned by the service.
     * @throws ThrottlingException
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws ConflictException
     * @throws InternalServerException
     * @sample AmazonLexModelsV2.CreateUploadUrl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/CreateUploadUrl" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateUploadUrlResult createUploadUrl(CreateUploadUrlRequest request) {
        request = beforeClientExecution(request);
        return executeCreateUploadUrl(request);
    }

    @SdkInternalApi
    final CreateUploadUrlResult executeCreateUploadUrl(CreateUploadUrlRequest createUploadUrlRequest) {

        ExecutionContext executionContext = createExecutionContext(createUploadUrlRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateUploadUrlRequest> request = null;
        Response<CreateUploadUrlResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateUploadUrlRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createUploadUrlRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Models V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateUploadUrl");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateUploadUrlResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateUploadUrlResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes all versions of a bot, including the <code>Draft</code> version. To delete a specific version, use the
     * <code>DeleteBotVersion</code> operation.
     * </p>
     * <p>
     * When you delete a bot, all of the resources contained in the bot are also deleted. Deleting a bot removes all
     * locales, intents, slot, and slot types defined for the bot.
     * </p>
     * <p>
     * If a bot has an alias, the <code>DeleteBot</code> operation returns a <code>ResourceInUseException</code>
     * exception. If you want to delete the bot and the alias, set the <code>skipResourceInUseCheck</code> parameter to
     * <code>true</code>.
     * </p>
     * 
     * @param deleteBotRequest
     * @return Result of the DeleteBot operation returned by the service.
     * @throws ThrottlingException
     * @throws ServiceQuotaExceededException
     * @throws ValidationException
     * @throws ConflictException
     * @throws PreconditionFailedException
     * @throws InternalServerException
     * @sample AmazonLexModelsV2.DeleteBot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DeleteBot" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Models V2");
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
     * Deletes the specified bot alias.
     * </p>
     * 
     * @param deleteBotAliasRequest
     * @return Result of the DeleteBotAlias operation returned by the service.
     * @throws ThrottlingException
     * @throws ServiceQuotaExceededException
     * @throws ValidationException
     * @throws ConflictException
     * @throws PreconditionFailedException
     * @throws InternalServerException
     * @sample AmazonLexModelsV2.DeleteBotAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DeleteBotAlias" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Models V2");
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
     * Removes a locale from a bot.
     * </p>
     * <p>
     * When you delete a locale, all intents, slots, and slot types defined for the locale are also deleted.
     * </p>
     * 
     * @param deleteBotLocaleRequest
     * @return Result of the DeleteBotLocale operation returned by the service.
     * @throws ThrottlingException
     * @throws ServiceQuotaExceededException
     * @throws ValidationException
     * @throws PreconditionFailedException
     * @throws ConflictException
     * @throws InternalServerException
     * @sample AmazonLexModelsV2.DeleteBotLocale
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DeleteBotLocale" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteBotLocaleResult deleteBotLocale(DeleteBotLocaleRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteBotLocale(request);
    }

    @SdkInternalApi
    final DeleteBotLocaleResult executeDeleteBotLocale(DeleteBotLocaleRequest deleteBotLocaleRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteBotLocaleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteBotLocaleRequest> request = null;
        Response<DeleteBotLocaleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteBotLocaleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteBotLocaleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Models V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteBotLocale");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteBotLocaleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteBotLocaleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a specific version of a bot. To delete all version of a bot, use the <a>DeleteBot</a> operation.
     * </p>
     * 
     * @param deleteBotVersionRequest
     * @return Result of the DeleteBotVersion operation returned by the service.
     * @throws ThrottlingException
     * @throws ServiceQuotaExceededException
     * @throws ValidationException
     * @throws ConflictException
     * @throws PreconditionFailedException
     * @throws InternalServerException
     * @sample AmazonLexModelsV2.DeleteBotVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DeleteBotVersion" target="_top">AWS
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Models V2");
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
     * Removes a previous export and the associated files stored in an S3 bucket.
     * </p>
     * 
     * @param deleteExportRequest
     * @return Result of the DeleteExport operation returned by the service.
     * @throws ThrottlingException
     * @throws ServiceQuotaExceededException
     * @throws ValidationException
     * @throws PreconditionFailedException
     * @throws InternalServerException
     * @sample AmazonLexModelsV2.DeleteExport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DeleteExport" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteExportResult deleteExport(DeleteExportRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteExport(request);
    }

    @SdkInternalApi
    final DeleteExportResult executeDeleteExport(DeleteExportRequest deleteExportRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteExportRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteExportRequest> request = null;
        Response<DeleteExportResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteExportRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteExportRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Models V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteExport");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteExportResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteExportResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes a previous import and the associated file stored in an S3 bucket.
     * </p>
     * 
     * @param deleteImportRequest
     * @return Result of the DeleteImport operation returned by the service.
     * @throws ThrottlingException
     * @throws ServiceQuotaExceededException
     * @throws ValidationException
     * @throws PreconditionFailedException
     * @throws InternalServerException
     * @sample AmazonLexModelsV2.DeleteImport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DeleteImport" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteImportResult deleteImport(DeleteImportRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteImport(request);
    }

    @SdkInternalApi
    final DeleteImportResult executeDeleteImport(DeleteImportRequest deleteImportRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteImportRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteImportRequest> request = null;
        Response<DeleteImportResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteImportRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteImportRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Models V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteImport");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteImportResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteImportResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes the specified intent.
     * </p>
     * <p>
     * Deleting an intent also deletes the slots associated with the intent.
     * </p>
     * 
     * @param deleteIntentRequest
     * @return Result of the DeleteIntent operation returned by the service.
     * @throws ThrottlingException
     * @throws ServiceQuotaExceededException
     * @throws ValidationException
     * @throws ConflictException
     * @throws PreconditionFailedException
     * @throws InternalServerException
     * @sample AmazonLexModelsV2.DeleteIntent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DeleteIntent" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Models V2");
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
     * Removes an existing policy from a bot or bot alias. If the resource doesn't have a policy attached, Amazon Lex
     * returns an exception.
     * </p>
     * 
     * @param deleteResourcePolicyRequest
     * @return Result of the DeleteResourcePolicy operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws PreconditionFailedException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @sample AmazonLexModelsV2.DeleteResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DeleteResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteResourcePolicyResult deleteResourcePolicy(DeleteResourcePolicyRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteResourcePolicy(request);
    }

    @SdkInternalApi
    final DeleteResourcePolicyResult executeDeleteResourcePolicy(DeleteResourcePolicyRequest deleteResourcePolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteResourcePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteResourcePolicyRequest> request = null;
        Response<DeleteResourcePolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteResourcePolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteResourcePolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Models V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteResourcePolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteResourcePolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteResourcePolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a policy statement from a resource policy. If you delete the last statement from a policy, the policy is
     * deleted. If you specify a statement ID that doesn't exist in the policy, or if the bot or bot alias doesn't have
     * a policy attached, Amazon Lex returns an exception.
     * </p>
     * 
     * @param deleteResourcePolicyStatementRequest
     * @return Result of the DeleteResourcePolicyStatement operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws PreconditionFailedException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @sample AmazonLexModelsV2.DeleteResourcePolicyStatement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DeleteResourcePolicyStatement"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteResourcePolicyStatementResult deleteResourcePolicyStatement(DeleteResourcePolicyStatementRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteResourcePolicyStatement(request);
    }

    @SdkInternalApi
    final DeleteResourcePolicyStatementResult executeDeleteResourcePolicyStatement(DeleteResourcePolicyStatementRequest deleteResourcePolicyStatementRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteResourcePolicyStatementRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteResourcePolicyStatementRequest> request = null;
        Response<DeleteResourcePolicyStatementResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteResourcePolicyStatementRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteResourcePolicyStatementRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Models V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteResourcePolicyStatement");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteResourcePolicyStatementResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteResourcePolicyStatementResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified slot from an intent.
     * </p>
     * 
     * @param deleteSlotRequest
     * @return Result of the DeleteSlot operation returned by the service.
     * @throws ThrottlingException
     * @throws ServiceQuotaExceededException
     * @throws ValidationException
     * @throws ConflictException
     * @throws PreconditionFailedException
     * @throws InternalServerException
     * @sample AmazonLexModelsV2.DeleteSlot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DeleteSlot" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteSlotResult deleteSlot(DeleteSlotRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteSlot(request);
    }

    @SdkInternalApi
    final DeleteSlotResult executeDeleteSlot(DeleteSlotRequest deleteSlotRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteSlotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSlotRequest> request = null;
        Response<DeleteSlotResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSlotRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteSlotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Models V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteSlot");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteSlotResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteSlotResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a slot type from a bot locale.
     * </p>
     * <p>
     * If a slot is using the slot type, Amazon Lex throws a <code>ResourceInUseException</code> exception. To avoid the
     * exception, set the <code>skipResourceInUseCheck</code> parameter to <code>true</code>.
     * </p>
     * 
     * @param deleteSlotTypeRequest
     * @return Result of the DeleteSlotType operation returned by the service.
     * @throws ThrottlingException
     * @throws ServiceQuotaExceededException
     * @throws ValidationException
     * @throws ConflictException
     * @throws PreconditionFailedException
     * @throws InternalServerException
     * @sample AmazonLexModelsV2.DeleteSlotType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DeleteSlotType" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Models V2");
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
     * Provides metadata information about a bot.
     * </p>
     * 
     * @param describeBotRequest
     * @return Result of the DescribeBot operation returned by the service.
     * @throws ThrottlingException
     * @throws ServiceQuotaExceededException
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @sample AmazonLexModelsV2.DescribeBot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DescribeBot" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeBotResult describeBot(DescribeBotRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeBot(request);
    }

    @SdkInternalApi
    final DescribeBotResult executeDescribeBot(DescribeBotRequest describeBotRequest) {

        ExecutionContext executionContext = createExecutionContext(describeBotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeBotRequest> request = null;
        Response<DescribeBotResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeBotRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeBotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Models V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeBot");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeBotResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeBotResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get information about a specific bot alias.
     * </p>
     * 
     * @param describeBotAliasRequest
     * @return Result of the DescribeBotAlias operation returned by the service.
     * @throws ThrottlingException
     * @throws ServiceQuotaExceededException
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @sample AmazonLexModelsV2.DescribeBotAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DescribeBotAlias" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeBotAliasResult describeBotAlias(DescribeBotAliasRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeBotAlias(request);
    }

    @SdkInternalApi
    final DescribeBotAliasResult executeDescribeBotAlias(DescribeBotAliasRequest describeBotAliasRequest) {

        ExecutionContext executionContext = createExecutionContext(describeBotAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeBotAliasRequest> request = null;
        Response<DescribeBotAliasResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeBotAliasRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeBotAliasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Models V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeBotAlias");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeBotAliasResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeBotAliasResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the settings that a bot has for a specific locale.
     * </p>
     * 
     * @param describeBotLocaleRequest
     * @return Result of the DescribeBotLocale operation returned by the service.
     * @throws ThrottlingException
     * @throws ServiceQuotaExceededException
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @sample AmazonLexModelsV2.DescribeBotLocale
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DescribeBotLocale"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeBotLocaleResult describeBotLocale(DescribeBotLocaleRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeBotLocale(request);
    }

    @SdkInternalApi
    final DescribeBotLocaleResult executeDescribeBotLocale(DescribeBotLocaleRequest describeBotLocaleRequest) {

        ExecutionContext executionContext = createExecutionContext(describeBotLocaleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeBotLocaleRequest> request = null;
        Response<DescribeBotLocaleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeBotLocaleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeBotLocaleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Models V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeBotLocale");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeBotLocaleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeBotLocaleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides metadata about a version of a bot.
     * </p>
     * 
     * @param describeBotVersionRequest
     * @return Result of the DescribeBotVersion operation returned by the service.
     * @throws ThrottlingException
     * @throws ServiceQuotaExceededException
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @sample AmazonLexModelsV2.DescribeBotVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DescribeBotVersion"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeBotVersionResult describeBotVersion(DescribeBotVersionRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeBotVersion(request);
    }

    @SdkInternalApi
    final DescribeBotVersionResult executeDescribeBotVersion(DescribeBotVersionRequest describeBotVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(describeBotVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeBotVersionRequest> request = null;
        Response<DescribeBotVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeBotVersionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeBotVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Models V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeBotVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeBotVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeBotVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about a specific export.
     * </p>
     * 
     * @param describeExportRequest
     * @return Result of the DescribeExport operation returned by the service.
     * @throws ThrottlingException
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @sample AmazonLexModelsV2.DescribeExport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DescribeExport" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeExportResult describeExport(DescribeExportRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeExport(request);
    }

    @SdkInternalApi
    final DescribeExportResult executeDescribeExport(DescribeExportRequest describeExportRequest) {

        ExecutionContext executionContext = createExecutionContext(describeExportRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeExportRequest> request = null;
        Response<DescribeExportResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeExportRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeExportRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Models V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeExport");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeExportResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeExportResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about a specific import.
     * </p>
     * 
     * @param describeImportRequest
     * @return Result of the DescribeImport operation returned by the service.
     * @throws ThrottlingException
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @sample AmazonLexModelsV2.DescribeImport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DescribeImport" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeImportResult describeImport(DescribeImportRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeImport(request);
    }

    @SdkInternalApi
    final DescribeImportResult executeDescribeImport(DescribeImportRequest describeImportRequest) {

        ExecutionContext executionContext = createExecutionContext(describeImportRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeImportRequest> request = null;
        Response<DescribeImportResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeImportRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeImportRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Models V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeImport");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeImportResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeImportResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns metadata about an intent.
     * </p>
     * 
     * @param describeIntentRequest
     * @return Result of the DescribeIntent operation returned by the service.
     * @throws ThrottlingException
     * @throws ServiceQuotaExceededException
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @sample AmazonLexModelsV2.DescribeIntent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DescribeIntent" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeIntentResult describeIntent(DescribeIntentRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeIntent(request);
    }

    @SdkInternalApi
    final DescribeIntentResult executeDescribeIntent(DescribeIntentRequest describeIntentRequest) {

        ExecutionContext executionContext = createExecutionContext(describeIntentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeIntentRequest> request = null;
        Response<DescribeIntentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeIntentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeIntentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Models V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeIntent");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeIntentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeIntentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the resource policy and policy revision for a bot or bot alias.
     * </p>
     * 
     * @param describeResourcePolicyRequest
     * @return Result of the DescribeResourcePolicy operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @sample AmazonLexModelsV2.DescribeResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DescribeResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeResourcePolicyResult describeResourcePolicy(DescribeResourcePolicyRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeResourcePolicy(request);
    }

    @SdkInternalApi
    final DescribeResourcePolicyResult executeDescribeResourcePolicy(DescribeResourcePolicyRequest describeResourcePolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(describeResourcePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeResourcePolicyRequest> request = null;
        Response<DescribeResourcePolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeResourcePolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeResourcePolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Models V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeResourcePolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeResourcePolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeResourcePolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets metadata information about a slot.
     * </p>
     * 
     * @param describeSlotRequest
     * @return Result of the DescribeSlot operation returned by the service.
     * @throws ThrottlingException
     * @throws ServiceQuotaExceededException
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @sample AmazonLexModelsV2.DescribeSlot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DescribeSlot" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeSlotResult describeSlot(DescribeSlotRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeSlot(request);
    }

    @SdkInternalApi
    final DescribeSlotResult executeDescribeSlot(DescribeSlotRequest describeSlotRequest) {

        ExecutionContext executionContext = createExecutionContext(describeSlotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSlotRequest> request = null;
        Response<DescribeSlotResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSlotRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeSlotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Models V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeSlot");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeSlotResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeSlotResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets metadata information about a slot type.
     * </p>
     * 
     * @param describeSlotTypeRequest
     * @return Result of the DescribeSlotType operation returned by the service.
     * @throws ThrottlingException
     * @throws ServiceQuotaExceededException
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @sample AmazonLexModelsV2.DescribeSlotType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DescribeSlotType" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeSlotTypeResult describeSlotType(DescribeSlotTypeRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeSlotType(request);
    }

    @SdkInternalApi
    final DescribeSlotTypeResult executeDescribeSlotType(DescribeSlotTypeRequest describeSlotTypeRequest) {

        ExecutionContext executionContext = createExecutionContext(describeSlotTypeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSlotTypeRequest> request = null;
        Response<DescribeSlotTypeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSlotTypeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeSlotTypeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Models V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeSlotType");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeSlotTypeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeSlotTypeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a list of aliases for the specified bot.
     * </p>
     * 
     * @param listBotAliasesRequest
     * @return Result of the ListBotAliases operation returned by the service.
     * @throws ThrottlingException
     * @throws ServiceQuotaExceededException
     * @throws ValidationException
     * @throws InternalServerException
     * @sample AmazonLexModelsV2.ListBotAliases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListBotAliases" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListBotAliasesResult listBotAliases(ListBotAliasesRequest request) {
        request = beforeClientExecution(request);
        return executeListBotAliases(request);
    }

    @SdkInternalApi
    final ListBotAliasesResult executeListBotAliases(ListBotAliasesRequest listBotAliasesRequest) {

        ExecutionContext executionContext = createExecutionContext(listBotAliasesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListBotAliasesRequest> request = null;
        Response<ListBotAliasesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListBotAliasesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listBotAliasesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Models V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListBotAliases");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListBotAliasesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListBotAliasesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a list of locales for the specified bot.
     * </p>
     * 
     * @param listBotLocalesRequest
     * @return Result of the ListBotLocales operation returned by the service.
     * @throws ThrottlingException
     * @throws ServiceQuotaExceededException
     * @throws ValidationException
     * @throws InternalServerException
     * @sample AmazonLexModelsV2.ListBotLocales
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListBotLocales" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListBotLocalesResult listBotLocales(ListBotLocalesRequest request) {
        request = beforeClientExecution(request);
        return executeListBotLocales(request);
    }

    @SdkInternalApi
    final ListBotLocalesResult executeListBotLocales(ListBotLocalesRequest listBotLocalesRequest) {

        ExecutionContext executionContext = createExecutionContext(listBotLocalesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListBotLocalesRequest> request = null;
        Response<ListBotLocalesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListBotLocalesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listBotLocalesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Models V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListBotLocales");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListBotLocalesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListBotLocalesResultJsonUnmarshaller());
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
     * The <code>ListBotVersions</code> operation returns a summary of each version of a bot. For example, if a bot has
     * three numbered versions, the <code>ListBotVersions</code> operation returns for summaries, one for each numbered
     * version and one for the <code>DRAFT</code> version.
     * </p>
     * <p>
     * The <code>ListBotVersions</code> operation always returns at least one version, the <code>DRAFT</code> version.
     * </p>
     * 
     * @param listBotVersionsRequest
     * @return Result of the ListBotVersions operation returned by the service.
     * @throws ThrottlingException
     * @throws ServiceQuotaExceededException
     * @throws ValidationException
     * @throws InternalServerException
     * @sample AmazonLexModelsV2.ListBotVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListBotVersions" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListBotVersionsResult listBotVersions(ListBotVersionsRequest request) {
        request = beforeClientExecution(request);
        return executeListBotVersions(request);
    }

    @SdkInternalApi
    final ListBotVersionsResult executeListBotVersions(ListBotVersionsRequest listBotVersionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listBotVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListBotVersionsRequest> request = null;
        Response<ListBotVersionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListBotVersionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listBotVersionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Models V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListBotVersions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListBotVersionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListBotVersionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a list of available bots.
     * </p>
     * 
     * @param listBotsRequest
     * @return Result of the ListBots operation returned by the service.
     * @throws ThrottlingException
     * @throws ServiceQuotaExceededException
     * @throws ValidationException
     * @throws InternalServerException
     * @sample AmazonLexModelsV2.ListBots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListBots" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListBotsResult listBots(ListBotsRequest request) {
        request = beforeClientExecution(request);
        return executeListBots(request);
    }

    @SdkInternalApi
    final ListBotsResult executeListBots(ListBotsRequest listBotsRequest) {

        ExecutionContext executionContext = createExecutionContext(listBotsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListBotsRequest> request = null;
        Response<ListBotsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListBotsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listBotsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Models V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListBots");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListBotsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListBotsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a list of built-in intents provided by Amazon Lex that you can use in your bot.
     * </p>
     * <p>
     * To use a built-in intent as a the base for your own intent, include the built-in intent signature in the
     * <code>parentIntentSignature</code> parameter when you call the <code>CreateIntent</code> operation. For more
     * information, see <a>CreateIntent</a>.
     * </p>
     * 
     * @param listBuiltInIntentsRequest
     * @return Result of the ListBuiltInIntents operation returned by the service.
     * @throws ThrottlingException
     * @throws ServiceQuotaExceededException
     * @throws ValidationException
     * @throws InternalServerException
     * @sample AmazonLexModelsV2.ListBuiltInIntents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListBuiltInIntents"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListBuiltInIntentsResult listBuiltInIntents(ListBuiltInIntentsRequest request) {
        request = beforeClientExecution(request);
        return executeListBuiltInIntents(request);
    }

    @SdkInternalApi
    final ListBuiltInIntentsResult executeListBuiltInIntents(ListBuiltInIntentsRequest listBuiltInIntentsRequest) {

        ExecutionContext executionContext = createExecutionContext(listBuiltInIntentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListBuiltInIntentsRequest> request = null;
        Response<ListBuiltInIntentsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListBuiltInIntentsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listBuiltInIntentsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Models V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListBuiltInIntents");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListBuiltInIntentsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListBuiltInIntentsResultJsonUnmarshaller());
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
     * 
     * @param listBuiltInSlotTypesRequest
     * @return Result of the ListBuiltInSlotTypes operation returned by the service.
     * @throws ThrottlingException
     * @throws ServiceQuotaExceededException
     * @throws ValidationException
     * @throws InternalServerException
     * @sample AmazonLexModelsV2.ListBuiltInSlotTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListBuiltInSlotTypes"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListBuiltInSlotTypesResult listBuiltInSlotTypes(ListBuiltInSlotTypesRequest request) {
        request = beforeClientExecution(request);
        return executeListBuiltInSlotTypes(request);
    }

    @SdkInternalApi
    final ListBuiltInSlotTypesResult executeListBuiltInSlotTypes(ListBuiltInSlotTypesRequest listBuiltInSlotTypesRequest) {

        ExecutionContext executionContext = createExecutionContext(listBuiltInSlotTypesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListBuiltInSlotTypesRequest> request = null;
        Response<ListBuiltInSlotTypesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListBuiltInSlotTypesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listBuiltInSlotTypesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Models V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListBuiltInSlotTypes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListBuiltInSlotTypesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListBuiltInSlotTypesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the exports for a bot or bot locale. Exports are kept in the list for 7 days.
     * </p>
     * 
     * @param listExportsRequest
     * @return Result of the ListExports operation returned by the service.
     * @throws ThrottlingException
     * @throws ValidationException
     * @throws InternalServerException
     * @sample AmazonLexModelsV2.ListExports
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListExports" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListExportsResult listExports(ListExportsRequest request) {
        request = beforeClientExecution(request);
        return executeListExports(request);
    }

    @SdkInternalApi
    final ListExportsResult executeListExports(ListExportsRequest listExportsRequest) {

        ExecutionContext executionContext = createExecutionContext(listExportsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListExportsRequest> request = null;
        Response<ListExportsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListExportsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listExportsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Models V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListExports");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListExportsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListExportsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the imports for a bot or bot locale. Imports are kept in the list for 7 days.
     * </p>
     * 
     * @param listImportsRequest
     * @return Result of the ListImports operation returned by the service.
     * @throws ThrottlingException
     * @throws ValidationException
     * @throws InternalServerException
     * @sample AmazonLexModelsV2.ListImports
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListImports" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListImportsResult listImports(ListImportsRequest request) {
        request = beforeClientExecution(request);
        return executeListImports(request);
    }

    @SdkInternalApi
    final ListImportsResult executeListImports(ListImportsRequest listImportsRequest) {

        ExecutionContext executionContext = createExecutionContext(listImportsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListImportsRequest> request = null;
        Response<ListImportsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListImportsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listImportsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Models V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListImports");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListImportsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListImportsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get a list of intents that meet the specified criteria.
     * </p>
     * 
     * @param listIntentsRequest
     * @return Result of the ListIntents operation returned by the service.
     * @throws ThrottlingException
     * @throws ServiceQuotaExceededException
     * @throws ValidationException
     * @throws InternalServerException
     * @sample AmazonLexModelsV2.ListIntents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListIntents" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListIntentsResult listIntents(ListIntentsRequest request) {
        request = beforeClientExecution(request);
        return executeListIntents(request);
    }

    @SdkInternalApi
    final ListIntentsResult executeListIntents(ListIntentsRequest listIntentsRequest) {

        ExecutionContext executionContext = createExecutionContext(listIntentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListIntentsRequest> request = null;
        Response<ListIntentsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListIntentsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listIntentsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Models V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListIntents");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListIntentsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListIntentsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a list of slot types that match the specified criteria.
     * </p>
     * 
     * @param listSlotTypesRequest
     * @return Result of the ListSlotTypes operation returned by the service.
     * @throws ThrottlingException
     * @throws ServiceQuotaExceededException
     * @throws ValidationException
     * @throws InternalServerException
     * @sample AmazonLexModelsV2.ListSlotTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListSlotTypes" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListSlotTypesResult listSlotTypes(ListSlotTypesRequest request) {
        request = beforeClientExecution(request);
        return executeListSlotTypes(request);
    }

    @SdkInternalApi
    final ListSlotTypesResult executeListSlotTypes(ListSlotTypesRequest listSlotTypesRequest) {

        ExecutionContext executionContext = createExecutionContext(listSlotTypesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSlotTypesRequest> request = null;
        Response<ListSlotTypesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSlotTypesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listSlotTypesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Models V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSlotTypes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSlotTypesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListSlotTypesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a list of slots that match the specified criteria.
     * </p>
     * 
     * @param listSlotsRequest
     * @return Result of the ListSlots operation returned by the service.
     * @throws ThrottlingException
     * @throws ServiceQuotaExceededException
     * @throws ValidationException
     * @throws InternalServerException
     * @sample AmazonLexModelsV2.ListSlots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListSlots" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListSlotsResult listSlots(ListSlotsRequest request) {
        request = beforeClientExecution(request);
        return executeListSlots(request);
    }

    @SdkInternalApi
    final ListSlotsResult executeListSlots(ListSlotsRequest listSlotsRequest) {

        ExecutionContext executionContext = createExecutionContext(listSlotsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSlotsRequest> request = null;
        Response<ListSlotsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSlotsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listSlotsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Models V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSlots");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSlotsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListSlotsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a list of tags associated with a resource. Only bots, bot aliases, and bot channels can have tags associated
     * with them.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @sample AmazonLexModelsV2.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest request) {
        request = beforeClientExecution(request);
        return executeListTagsForResource(request);
    }

    @SdkInternalApi
    final ListTagsForResourceResult executeListTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(listTagsForResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTagsForResourceRequest> request = null;
        Response<ListTagsForResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTagsForResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTagsForResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Models V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTagsForResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTagsForResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTagsForResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts importing a bot or bot locale from a zip archive that you uploaded to an S3 bucket.
     * </p>
     * 
     * @param startImportRequest
     * @return Result of the StartImport operation returned by the service.
     * @throws ThrottlingException
     * @throws ServiceQuotaExceededException
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws ConflictException
     * @throws InternalServerException
     * @sample AmazonLexModelsV2.StartImport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/StartImport" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Models V2");
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
     * <p>
     * Adds the specified tags to the specified resource. If a tag key already exists, the existing value is replaced
     * with the new value.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @sample AmazonLexModelsV2.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public TagResourceResult tagResource(TagResourceRequest request) {
        request = beforeClientExecution(request);
        return executeTagResource(request);
    }

    @SdkInternalApi
    final TagResourceResult executeTagResource(TagResourceRequest tagResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(tagResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TagResourceRequest> request = null;
        Response<TagResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TagResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(tagResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Models V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "TagResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<TagResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new TagResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes tags from a bot, bot alias, or bot channel.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @sample AmazonLexModelsV2.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UntagResourceResult untagResource(UntagResourceRequest request) {
        request = beforeClientExecution(request);
        return executeUntagResource(request);
    }

    @SdkInternalApi
    final UntagResourceResult executeUntagResource(UntagResourceRequest untagResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(untagResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UntagResourceRequest> request = null;
        Response<UntagResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UntagResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(untagResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Models V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UntagResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UntagResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UntagResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the configuration of an existing bot.
     * </p>
     * 
     * @param updateBotRequest
     * @return Result of the UpdateBot operation returned by the service.
     * @throws ThrottlingException
     * @throws ServiceQuotaExceededException
     * @throws ValidationException
     * @throws PreconditionFailedException
     * @throws ConflictException
     * @throws InternalServerException
     * @sample AmazonLexModelsV2.UpdateBot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/UpdateBot" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateBotResult updateBot(UpdateBotRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateBot(request);
    }

    @SdkInternalApi
    final UpdateBotResult executeUpdateBot(UpdateBotRequest updateBotRequest) {

        ExecutionContext executionContext = createExecutionContext(updateBotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateBotRequest> request = null;
        Response<UpdateBotResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateBotRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateBotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Models V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateBot");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateBotResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateBotResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the configuration of an existing bot alias.
     * </p>
     * 
     * @param updateBotAliasRequest
     * @return Result of the UpdateBotAlias operation returned by the service.
     * @throws ThrottlingException
     * @throws ServiceQuotaExceededException
     * @throws ValidationException
     * @throws PreconditionFailedException
     * @throws ConflictException
     * @throws InternalServerException
     * @sample AmazonLexModelsV2.UpdateBotAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/UpdateBotAlias" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateBotAliasResult updateBotAlias(UpdateBotAliasRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateBotAlias(request);
    }

    @SdkInternalApi
    final UpdateBotAliasResult executeUpdateBotAlias(UpdateBotAliasRequest updateBotAliasRequest) {

        ExecutionContext executionContext = createExecutionContext(updateBotAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateBotAliasRequest> request = null;
        Response<UpdateBotAliasResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateBotAliasRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateBotAliasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Models V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateBotAlias");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateBotAliasResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateBotAliasResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the settings that a bot has for a specific locale.
     * </p>
     * 
     * @param updateBotLocaleRequest
     * @return Result of the UpdateBotLocale operation returned by the service.
     * @throws ThrottlingException
     * @throws ServiceQuotaExceededException
     * @throws ValidationException
     * @throws PreconditionFailedException
     * @throws ConflictException
     * @throws InternalServerException
     * @sample AmazonLexModelsV2.UpdateBotLocale
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/UpdateBotLocale" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateBotLocaleResult updateBotLocale(UpdateBotLocaleRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateBotLocale(request);
    }

    @SdkInternalApi
    final UpdateBotLocaleResult executeUpdateBotLocale(UpdateBotLocaleRequest updateBotLocaleRequest) {

        ExecutionContext executionContext = createExecutionContext(updateBotLocaleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateBotLocaleRequest> request = null;
        Response<UpdateBotLocaleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateBotLocaleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateBotLocaleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Models V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateBotLocale");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateBotLocaleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateBotLocaleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the password used to protect an export zip archive.
     * </p>
     * <p>
     * The password is not required. If you don't supply a password, Amazon Lex generates a zip file that is not
     * protected by a password. This is the archive that is available at the pre-signed S3 URL provided by the
     * operation.
     * </p>
     * 
     * @param updateExportRequest
     * @return Result of the UpdateExport operation returned by the service.
     * @throws ThrottlingException
     * @throws ServiceQuotaExceededException
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws ConflictException
     * @throws InternalServerException
     * @sample AmazonLexModelsV2.UpdateExport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/UpdateExport" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateExportResult updateExport(UpdateExportRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateExport(request);
    }

    @SdkInternalApi
    final UpdateExportResult executeUpdateExport(UpdateExportRequest updateExportRequest) {

        ExecutionContext executionContext = createExecutionContext(updateExportRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateExportRequest> request = null;
        Response<UpdateExportResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateExportRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateExportRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Models V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateExport");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateExportResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateExportResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the settings for an intent.
     * </p>
     * 
     * @param updateIntentRequest
     * @return Result of the UpdateIntent operation returned by the service.
     * @throws ThrottlingException
     * @throws ServiceQuotaExceededException
     * @throws ValidationException
     * @throws PreconditionFailedException
     * @throws ConflictException
     * @throws InternalServerException
     * @sample AmazonLexModelsV2.UpdateIntent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/UpdateIntent" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateIntentResult updateIntent(UpdateIntentRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateIntent(request);
    }

    @SdkInternalApi
    final UpdateIntentResult executeUpdateIntent(UpdateIntentRequest updateIntentRequest) {

        ExecutionContext executionContext = createExecutionContext(updateIntentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateIntentRequest> request = null;
        Response<UpdateIntentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateIntentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateIntentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Models V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateIntent");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateIntentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateIntentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Replaces the existing resource policy for a bot or bot alias with a new one. If the policy doesn't exist, Amazon
     * Lex returns an exception.
     * </p>
     * 
     * @param updateResourcePolicyRequest
     * @return Result of the UpdateResourcePolicy operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ServiceQuotaExceededException
     * @throws PreconditionFailedException
     * @throws ValidationException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @sample AmazonLexModelsV2.UpdateResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/UpdateResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateResourcePolicyResult updateResourcePolicy(UpdateResourcePolicyRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateResourcePolicy(request);
    }

    @SdkInternalApi
    final UpdateResourcePolicyResult executeUpdateResourcePolicy(UpdateResourcePolicyRequest updateResourcePolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(updateResourcePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateResourcePolicyRequest> request = null;
        Response<UpdateResourcePolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateResourcePolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateResourcePolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Models V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateResourcePolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateResourcePolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateResourcePolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the settings for a slot.
     * </p>
     * 
     * @param updateSlotRequest
     * @return Result of the UpdateSlot operation returned by the service.
     * @throws ThrottlingException
     * @throws ServiceQuotaExceededException
     * @throws ValidationException
     * @throws PreconditionFailedException
     * @throws ConflictException
     * @throws InternalServerException
     * @sample AmazonLexModelsV2.UpdateSlot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/UpdateSlot" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateSlotResult updateSlot(UpdateSlotRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateSlot(request);
    }

    @SdkInternalApi
    final UpdateSlotResult executeUpdateSlot(UpdateSlotRequest updateSlotRequest) {

        ExecutionContext executionContext = createExecutionContext(updateSlotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateSlotRequest> request = null;
        Response<UpdateSlotResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateSlotRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateSlotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Models V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateSlot");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateSlotResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateSlotResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the configuration of an existing slot type.
     * </p>
     * 
     * @param updateSlotTypeRequest
     * @return Result of the UpdateSlotType operation returned by the service.
     * @throws ThrottlingException
     * @throws ServiceQuotaExceededException
     * @throws ValidationException
     * @throws PreconditionFailedException
     * @throws ConflictException
     * @throws InternalServerException
     * @sample AmazonLexModelsV2.UpdateSlotType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/UpdateSlotType" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateSlotTypeResult updateSlotType(UpdateSlotTypeRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateSlotType(request);
    }

    @SdkInternalApi
    final UpdateSlotTypeResult executeUpdateSlotType(UpdateSlotTypeRequest updateSlotTypeRequest) {

        ExecutionContext executionContext = createExecutionContext(updateSlotTypeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateSlotTypeRequest> request = null;
        Response<UpdateSlotTypeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateSlotTypeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateSlotTypeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Lex Models V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateSlotType");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateSlotTypeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateSlotTypeResultJsonUnmarshaller());
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

    @Override
    public void shutdown() {
        super.shutdown();
    }

}
