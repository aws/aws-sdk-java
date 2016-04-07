/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.lambda;

import java.io.*;

import java.net.*;
import java.util.*;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.auth.*;
import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.regions.*;
import com.amazonaws.internal.*;
import com.amazonaws.metrics.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.util.AWSRequestMetrics.Field;
import com.amazonaws.util.json.*;

import com.amazonaws.services.lambda.model.*;
import com.amazonaws.services.lambda.model.transform.*;

/**
 * Client for accessing AWSLambda.  All service calls made
 * using this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * AWS Lambda <p>
 * <b>Overview</b>
 * </p>
 * <p>
 * This is the <i>AWS Lambda API Reference</i> .
 * The AWS Lambda Developer Guide provides additional information.
 * For the service overview, go to
 * <a href="http://docs.aws.amazon.com/lambda/latest/dg/welcome.html"> What is AWS Lambda </a> , and for information about how the service works, go to <a href="http://docs.aws.amazon.com/lambda/latest/dg/lambda-introduction.html"> AWS Lambda: How it Works </a>
 * in the <i>AWS Lambda Developer Guide</i> .
 * </p>
 */
public class AWSLambdaClient extends AmazonWebServiceClient implements AWSLambda {

    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSLambda.class);

    /**
     * List of exception unmarshallers for all AWSLambda exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on
     * AWSLambda.  A credentials provider chain will be used
     * that searches for credentials in this order:
     * <ul>
     *  <li> Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY </li>
     *  <li> Java System Properties - aws.accessKeyId and aws.secretKey </li>
     *  <li> Instance profile credentials delivered through the Amazon EC2 metadata service </li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AWSLambdaClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSLambda.  A credentials provider chain will be used
     * that searches for credentials in this order:
     * <ul>
     *  <li> Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY </li>
     *  <li> Java System Properties - aws.accessKeyId and aws.secretKey </li>
     *  <li> Instance profile credentials delivered through the Amazon EC2 metadata service </li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AWSLambda
     *                       (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AWSLambdaClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSLambda using the specified AWS account credentials.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     */
    public AWSLambdaClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSLambda using the specified AWS account credentials
     * and client configuration options.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AWSLambda
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AWSLambdaClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(adjustClientConfiguration(clientConfiguration));
        
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        
        init();
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSLambda using the specified AWS account credentials provider.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     */
    public AWSLambdaClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSLambda using the specified AWS account credentials
     * provider and client configuration options.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AWSLambda
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AWSLambdaClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSLambda using the specified AWS account credentials
     * provider, client configuration options and request metric collector.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AWSLambda
     *                       (ex: proxy settings, retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    public AWSLambdaClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);
        
        this.awsCredentialsProvider = awsCredentialsProvider;
        
        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new InvalidSubnetIDExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ServiceExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new RequestTooLargeExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new EC2AccessDeniedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new UnsupportedMediaTypeExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new EC2UnexpectedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new CodeStorageExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new TooManyRequestsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidRequestContentExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidParameterValueExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new SubnetIPAddressLimitReachedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new EC2ThrottledExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new PolicyLengthExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidSecurityGroupIDExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceConflictExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ENILimitReachedExceptionUnmarshaller());
        
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());
        
        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("lambda.us-east-1.amazonaws.com/");
        
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/lambda/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/lambda/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;
        
        return config;
    }

    /**
     * <p>
     * Using this API you can update the function version to which the alias
     * points and the alias description. For more information, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/aliases-intro.html"> Introduction to AWS Lambda Aliases </a>
     * .
     * </p>
     * <p>
     * This requires permission for the lambda:UpdateAlias action.
     * </p>
     *
     * @param updateAliasRequest Container for the necessary parameters to
     *           execute the UpdateAlias service method on AWSLambda.
     * 
     * @return The response from the UpdateAlias service method, as returned
     *         by AWSLambda.
     * 
     * @throws InvalidParameterValueException
     * @throws ServiceException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateAliasResult updateAlias(UpdateAliasRequest updateAliasRequest) {
        ExecutionContext executionContext = createExecutionContext(updateAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAliasRequest> request = null;
        Response<UpdateAliasResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAliasRequestMarshaller().marshall(super.beforeMarshalling(updateAliasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<UpdateAliasResult, JsonUnmarshallerContext> unmarshaller =
                new UpdateAliasResultJsonUnmarshaller();
            JsonResponseHandler<UpdateAliasResult> responseHandler =
                new JsonResponseHandler<UpdateAliasResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes the specified Lambda function code and configuration.
     * </p>
     * <p>
     * If you are using the versioning feature and you don't specify a
     * function version in your <code>DeleteFunction</code> request, AWS
     * Lambda will delete the function, including all its versions, and any
     * aliases pointing to the function versions. To delete a specific
     * function version, you must provide the function version via the
     * <code>Qualifier</code> parameter. For information about function
     * versioning, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html"> AWS Lambda Function Versioning and Aliases </a>
     * .
     * </p>
     * <p>
     * When you delete a function the associated resource policy is also
     * deleted. You will need to delete the event source mappings explicitly.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:DeleteFunction</code> action.
     * </p>
     *
     * @param deleteFunctionRequest Container for the necessary parameters to
     *           execute the DeleteFunction service method on AWSLambda.
     * 
     * 
     * @throws InvalidParameterValueException
     * @throws ServiceException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws ResourceConflictException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteFunction(DeleteFunctionRequest deleteFunctionRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteFunctionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteFunctionRequest> request = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteFunctionRequestMarshaller().marshall(super.beforeMarshalling(deleteFunctionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);

        } finally {
            
            endClientExecution(awsRequestMetrics, request, null, LOGGING_AWS_REQUEST_METRIC);
        }
    }
    
    /**
     * <p>
     * Adds a permission to the resource policy associated with the
     * specified AWS Lambda function. You use resource policies to grant
     * permissions to event sources that use <i>push</i> model. In a
     * <i>push</i> model, event sources (such as Amazon S3 and custom
     * applications) invoke your Lambda function. Each permission you add to
     * the resource policy allows an event source, permission to invoke the
     * Lambda function.
     * </p>
     * <p>
     * For information about the push model, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/lambda-introduction.html"> AWS Lambda: How it Works </a>
     * .
     * </p>
     * <p>
     * If you are using versioning, the permissions you add are specific to
     * the Lambda function version or alias you specify in the
     * <code>AddPermission</code> request via the <code>Qualifier</code>
     * parameter. For more information about versioning, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html"> AWS Lambda Function Versioning and Aliases </a>
     * .
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:AddPermission</code> action.
     * </p>
     *
     * @param addPermissionRequest Container for the necessary parameters to
     *           execute the AddPermission service method on AWSLambda.
     * 
     * @return The response from the AddPermission service method, as
     *         returned by AWSLambda.
     * 
     * @throws InvalidParameterValueException
     * @throws ServiceException
     * @throws ResourceNotFoundException
     * @throws PolicyLengthExceededException
     * @throws ResourceConflictException
     * @throws TooManyRequestsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public AddPermissionResult addPermission(AddPermissionRequest addPermissionRequest) {
        ExecutionContext executionContext = createExecutionContext(addPermissionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddPermissionRequest> request = null;
        Response<AddPermissionResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddPermissionRequestMarshaller().marshall(super.beforeMarshalling(addPermissionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<AddPermissionResult, JsonUnmarshallerContext> unmarshaller =
                new AddPermissionResultJsonUnmarshaller();
            JsonResponseHandler<AddPermissionResult> responseHandler =
                new JsonResponseHandler<AddPermissionResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns a list of your Lambda functions. For each function, the
     * response includes the function configuration information. You must use
     * GetFunction to retrieve the code for your function.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:ListFunctions</code> action.
     * </p>
     * <p>
     * If you are using versioning feature, the response returns list of
     * $LATEST versions of your functions. For information about the
     * versioning feature, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html"> AWS Lambda Function Versioning and Aliases </a>
     * .
     * </p>
     *
     * @param listFunctionsRequest Container for the necessary parameters to
     *           execute the ListFunctions service method on AWSLambda.
     * 
     * @return The response from the ListFunctions service method, as
     *         returned by AWSLambda.
     * 
     * @throws ServiceException
     * @throws TooManyRequestsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListFunctionsResult listFunctions(ListFunctionsRequest listFunctionsRequest) {
        ExecutionContext executionContext = createExecutionContext(listFunctionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListFunctionsRequest> request = null;
        Response<ListFunctionsResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListFunctionsRequestMarshaller().marshall(super.beforeMarshalling(listFunctionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<ListFunctionsResult, JsonUnmarshallerContext> unmarshaller =
                new ListFunctionsResultJsonUnmarshaller();
            JsonResponseHandler<ListFunctionsResult> responseHandler =
                new JsonResponseHandler<ListFunctionsResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns the specified alias information such as the alias ARN,
     * description, and function version it is pointing to. For more
     * information, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/aliases-intro.html"> Introduction to AWS Lambda Aliases </a>
     * .
     * </p>
     * <p>
     * This requires permission for the <code>lambda:GetAlias</code> action.
     * </p>
     *
     * @param getAliasRequest Container for the necessary parameters to
     *           execute the GetAlias service method on AWSLambda.
     * 
     * @return The response from the GetAlias service method, as returned by
     *         AWSLambda.
     * 
     * @throws InvalidParameterValueException
     * @throws ServiceException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetAliasResult getAlias(GetAliasRequest getAliasRequest) {
        ExecutionContext executionContext = createExecutionContext(getAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAliasRequest> request = null;
        Response<GetAliasResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAliasRequestMarshaller().marshall(super.beforeMarshalling(getAliasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<GetAliasResult, JsonUnmarshallerContext> unmarshaller =
                new GetAliasResultJsonUnmarshaller();
            JsonResponseHandler<GetAliasResult> responseHandler =
                new JsonResponseHandler<GetAliasResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * You can remove individual permissions from an resource policy
     * associated with a Lambda function by providing a statement ID that you
     * provided when you added the permission.
     * </p>
     * <p>
     * If you are using versioning, the permissions you remove are specific
     * to the Lambda function version or alias you specify in the
     * <code>AddPermission</code> request via the <code>Qualifier</code>
     * parameter. For more information about versioning, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html"> AWS Lambda Function Versioning and Aliases </a>
     * .
     * </p>
     * <p>
     * Note that removal of a permission will cause an active event source
     * to lose permission to the function.
     * </p>
     * <p>
     * You need permission for the <code>lambda:RemovePermission</code>
     * action.
     * </p>
     *
     * @param removePermissionRequest Container for the necessary parameters
     *           to execute the RemovePermission service method on AWSLambda.
     * 
     * 
     * @throws InvalidParameterValueException
     * @throws ServiceException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void removePermission(RemovePermissionRequest removePermissionRequest) {
        ExecutionContext executionContext = createExecutionContext(removePermissionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemovePermissionRequest> request = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemovePermissionRequestMarshaller().marshall(super.beforeMarshalling(removePermissionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);

        } finally {
            
            endClientExecution(awsRequestMetrics, request, null, LOGGING_AWS_REQUEST_METRIC);
        }
    }
    
    /**
     * <p>
     * Creates a new Lambda function. The function metadata is created from
     * the request parameters, and the code for the function is provided by a
     * .zip file in the request body. If the function name already exists,
     * the operation will fail. Note that the function name is
     * case-sensitive.
     * </p>
     * <p>
     * If you are using versioning, you can also publish a version of the
     * Lambda function you are creating using the <code>Publish</code>
     * parameter. For more information about versioning, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html"> AWS Lambda Function Versioning and Aliases </a>
     * .
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:CreateFunction</code> action.
     * </p>
     *
     * @param createFunctionRequest Container for the necessary parameters to
     *           execute the CreateFunction service method on AWSLambda.
     * 
     * @return The response from the CreateFunction service method, as
     *         returned by AWSLambda.
     * 
     * @throws InvalidParameterValueException
     * @throws ServiceException
     * @throws ResourceNotFoundException
     * @throws CodeStorageExceededException
     * @throws ResourceConflictException
     * @throws TooManyRequestsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateFunctionResult createFunction(CreateFunctionRequest createFunctionRequest) {
        ExecutionContext executionContext = createExecutionContext(createFunctionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateFunctionRequest> request = null;
        Response<CreateFunctionResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateFunctionRequestMarshaller().marshall(super.beforeMarshalling(createFunctionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<CreateFunctionResult, JsonUnmarshallerContext> unmarshaller =
                new CreateFunctionResultJsonUnmarshaller();
            JsonResponseHandler<CreateFunctionResult> responseHandler =
                new JsonResponseHandler<CreateFunctionResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * You can update an event source mapping. This is useful if you want to
     * change the parameters of the existing mapping without losing your
     * position in the stream. You can change which function will receive the
     * stream records, but to change the stream itself, you must create a new
     * mapping.
     * </p>
     * <p>
     * If you are using the versioning feature, you can update the event
     * source mapping to map to a specific Lambda function version or alias
     * as described in the <code>FunctionName</code> parameter. For
     * information about the versioning feature, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html"> AWS Lambda Function Versioning and Aliases </a>
     * .
     * </p>
     * <p>
     * If you disable the event source mapping, AWS Lambda stops polling. If
     * you enable again, it will resume polling from the time it had stopped
     * polling, so you don't lose processing of any records. However, if you
     * delete event source mapping and create it again, it will reset.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:UpdateEventSourceMapping</code> action.
     * </p>
     *
     * @param updateEventSourceMappingRequest Container for the necessary
     *           parameters to execute the UpdateEventSourceMapping service method on
     *           AWSLambda.
     * 
     * @return The response from the UpdateEventSourceMapping service method,
     *         as returned by AWSLambda.
     * 
     * @throws InvalidParameterValueException
     * @throws ServiceException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws ResourceConflictException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateEventSourceMappingResult updateEventSourceMapping(UpdateEventSourceMappingRequest updateEventSourceMappingRequest) {
        ExecutionContext executionContext = createExecutionContext(updateEventSourceMappingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateEventSourceMappingRequest> request = null;
        Response<UpdateEventSourceMappingResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateEventSourceMappingRequestMarshaller().marshall(super.beforeMarshalling(updateEventSourceMappingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<UpdateEventSourceMappingResult, JsonUnmarshallerContext> unmarshaller =
                new UpdateEventSourceMappingResultJsonUnmarshaller();
            JsonResponseHandler<UpdateEventSourceMappingResult> responseHandler =
                new JsonResponseHandler<UpdateEventSourceMappingResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Publishes a version of your function from the current snapshot of
     * $LATEST. That is, AWS Lambda takes a snapshot of the function code and
     * configuration information from $LATEST and publishes a new version.
     * The code and configuration cannot be modified after publication. For
     * information about the versioning feature, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html"> AWS Lambda Function Versioning and Aliases </a>
     * .
     * </p>
     *
     * @param publishVersionRequest Container for the necessary parameters to
     *           execute the PublishVersion service method on AWSLambda.
     * 
     * @return The response from the PublishVersion service method, as
     *         returned by AWSLambda.
     * 
     * @throws InvalidParameterValueException
     * @throws ServiceException
     * @throws ResourceNotFoundException
     * @throws CodeStorageExceededException
     * @throws TooManyRequestsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public PublishVersionResult publishVersion(PublishVersionRequest publishVersionRequest) {
        ExecutionContext executionContext = createExecutionContext(publishVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PublishVersionRequest> request = null;
        Response<PublishVersionResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PublishVersionRequestMarshaller().marshall(super.beforeMarshalling(publishVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<PublishVersionResult, JsonUnmarshallerContext> unmarshaller =
                new PublishVersionResultJsonUnmarshaller();
            JsonResponseHandler<PublishVersionResult> responseHandler =
                new JsonResponseHandler<PublishVersionResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * <b>IMPORTANT:</b>This API is deprecated. We recommend you use Invoke
     * API (see Invoke).
     * </p>
     * <p>
     * Submits an invocation request to AWS Lambda. Upon receiving the
     * request, Lambda executes the specified function asynchronously. To see
     * the logs generated by the Lambda function execution, see the
     * CloudWatch Logs console.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:InvokeFunction</code> action.
     * </p>
     *
     * @param invokeAsyncRequest Container for the necessary parameters to
     *           execute the InvokeAsync service method on AWSLambda.
     * 
     * @return The response from the InvokeAsync service method, as returned
     *         by AWSLambda.
     * 
     * @throws InvalidRequestContentException
     * @throws ServiceException
     * @throws ResourceNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    @Deprecated
    public InvokeAsyncResult invokeAsync(InvokeAsyncRequest invokeAsyncRequest) {
        ExecutionContext executionContext = createExecutionContext(invokeAsyncRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<InvokeAsyncRequest> request = null;
        Response<InvokeAsyncResult> response = null;
        
        final InputStream isOrig = invokeAsyncRequest.getInvokeArgs();
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new InvokeAsyncRequestMarshaller().marshall(super.beforeMarshalling(invokeAsyncRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<InvokeAsyncResult, JsonUnmarshallerContext> unmarshaller =
                new InvokeAsyncResultJsonUnmarshaller();
            JsonResponseHandler<InvokeAsyncResult> responseHandler =
                new JsonResponseHandler<InvokeAsyncResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            // Restore the original input stream, so that the caller
            // (who is responsible) can close it
            invokeAsyncRequest.setInvokeArgs(isOrig);
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Updates the configuration parameters for the specified Lambda
     * function by using the values provided in the request. You provide only
     * the parameters you want to change. This operation must only be used on
     * an existing Lambda function and cannot be used to update the
     * function's code.
     * </p>
     * <p>
     * If you are using the versioning feature, note this API will always
     * update the $LATEST version of your Lambda function. For information
     * about the versioning feature, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html"> AWS Lambda Function Versioning and Aliases </a>
     * .
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:UpdateFunctionConfiguration</code> action.
     * </p>
     *
     * @param updateFunctionConfigurationRequest Container for the necessary
     *           parameters to execute the UpdateFunctionConfiguration service method
     *           on AWSLambda.
     * 
     * @return The response from the UpdateFunctionConfiguration service
     *         method, as returned by AWSLambda.
     * 
     * @throws InvalidParameterValueException
     * @throws ServiceException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateFunctionConfigurationResult updateFunctionConfiguration(UpdateFunctionConfigurationRequest updateFunctionConfigurationRequest) {
        ExecutionContext executionContext = createExecutionContext(updateFunctionConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateFunctionConfigurationRequest> request = null;
        Response<UpdateFunctionConfigurationResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateFunctionConfigurationRequestMarshaller().marshall(super.beforeMarshalling(updateFunctionConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<UpdateFunctionConfigurationResult, JsonUnmarshallerContext> unmarshaller =
                new UpdateFunctionConfigurationResultJsonUnmarshaller();
            JsonResponseHandler<UpdateFunctionConfigurationResult> responseHandler =
                new JsonResponseHandler<UpdateFunctionConfigurationResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Invokes a specific Lambda function.
     * </p>
     * <p>
     * If you are using the versioning feature, you can invoke the specific
     * function version by providing function version or alias name that is
     * pointing to the function version using the <code>Qualifier</code>
     * parameter in the request. If you don't provide the
     * <code>Qualifier</code> parameter, the <code>$LATEST</code> version of
     * the Lambda function is invoked. For information about the versioning
     * feature, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html"> AWS Lambda Function Versioning and Aliases </a>
     * .
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:InvokeFunction</code> action.
     * </p>
     *
     * @param invokeRequest Container for the necessary parameters to execute
     *           the Invoke service method on AWSLambda.
     * 
     * @return The response from the Invoke service method, as returned by
     *         AWSLambda.
     * 
     * @throws InvalidRequestContentException
     * @throws InvalidSubnetIDException
     * @throws InvalidParameterValueException
     * @throws InvalidSecurityGroupIDException
     * @throws ServiceException
     * @throws RequestTooLargeException
     * @throws SubnetIPAddressLimitReachedException
     * @throws EC2ThrottledException
     * @throws ResourceNotFoundException
     * @throws EC2AccessDeniedException
     * @throws UnsupportedMediaTypeException
     * @throws EC2UnexpectedException
     * @throws TooManyRequestsException
     * @throws ENILimitReachedException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public InvokeResult invoke(InvokeRequest invokeRequest) {
        ExecutionContext executionContext = createExecutionContext(invokeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<InvokeRequest> request = null;
        Response<InvokeResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new InvokeRequestMarshaller().marshall(super.beforeMarshalling(invokeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<InvokeResult, JsonUnmarshallerContext> unmarshaller =
                new InvokeResultJsonUnmarshaller();
            JsonResponseHandler<InvokeResult> responseHandler =
                new JsonResponseHandler<InvokeResult>(unmarshaller);

            responseHandler.needsConnectionLeftOpen = true;

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns the resource policy associated with the specified Lambda
     * function.
     * </p>
     * <p>
     * If you are using the versioning feature, you can get the resource
     * policy associated with the specific Lambda function version or alias
     * by specifying the version or alias name using the
     * <code>Qualifier</code> parameter. For more information about
     * versioning, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html"> AWS Lambda Function Versioning and Aliases </a>
     * .
     * </p>
     * <p>
     * For information about adding permissions, see AddPermission.
     * </p>
     * <p>
     * You need permission for the <code>lambda:GetPolicy action.</code>
     * </p>
     *
     * @param getPolicyRequest Container for the necessary parameters to
     *           execute the GetPolicy service method on AWSLambda.
     * 
     * @return The response from the GetPolicy service method, as returned by
     *         AWSLambda.
     * 
     * @throws InvalidParameterValueException
     * @throws ServiceException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetPolicyResult getPolicy(GetPolicyRequest getPolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(getPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPolicyRequest> request = null;
        Response<GetPolicyResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPolicyRequestMarshaller().marshall(super.beforeMarshalling(getPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<GetPolicyResult, JsonUnmarshallerContext> unmarshaller =
                new GetPolicyResultJsonUnmarshaller();
            JsonResponseHandler<GetPolicyResult> responseHandler =
                new JsonResponseHandler<GetPolicyResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns configuration information for the specified event source
     * mapping (see CreateEventSourceMapping).
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:GetEventSourceMapping</code> action.
     * </p>
     *
     * @param getEventSourceMappingRequest Container for the necessary
     *           parameters to execute the GetEventSourceMapping service method on
     *           AWSLambda.
     * 
     * @return The response from the GetEventSourceMapping service method, as
     *         returned by AWSLambda.
     * 
     * @throws InvalidParameterValueException
     * @throws ServiceException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetEventSourceMappingResult getEventSourceMapping(GetEventSourceMappingRequest getEventSourceMappingRequest) {
        ExecutionContext executionContext = createExecutionContext(getEventSourceMappingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetEventSourceMappingRequest> request = null;
        Response<GetEventSourceMappingResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetEventSourceMappingRequestMarshaller().marshall(super.beforeMarshalling(getEventSourceMappingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<GetEventSourceMappingResult, JsonUnmarshallerContext> unmarshaller =
                new GetEventSourceMappingResultJsonUnmarshaller();
            JsonResponseHandler<GetEventSourceMappingResult> responseHandler =
                new JsonResponseHandler<GetEventSourceMappingResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns a list of event source mappings you created using the
     * <code>CreateEventSourceMapping</code> (see CreateEventSourceMapping).
     * </p>
     * <p>
     * For each mapping, the API returns configuration information. You can
     * optionally specify filters to retrieve specific event source mappings.
     * </p>
     * <p>
     * If you are using the versioning feature, you can get list of event
     * source mappings for a specific Lambda function version or an alias as
     * described in the <code>FunctionName</code> parameter. For information
     * about the versioning feature, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html"> AWS Lambda Function Versioning and Aliases </a>
     * .
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:ListEventSourceMappings</code> action.
     * </p>
     *
     * @param listEventSourceMappingsRequest Container for the necessary
     *           parameters to execute the ListEventSourceMappings service method on
     *           AWSLambda.
     * 
     * @return The response from the ListEventSourceMappings service method,
     *         as returned by AWSLambda.
     * 
     * @throws InvalidParameterValueException
     * @throws ServiceException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListEventSourceMappingsResult listEventSourceMappings(ListEventSourceMappingsRequest listEventSourceMappingsRequest) {
        ExecutionContext executionContext = createExecutionContext(listEventSourceMappingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListEventSourceMappingsRequest> request = null;
        Response<ListEventSourceMappingsResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListEventSourceMappingsRequestMarshaller().marshall(super.beforeMarshalling(listEventSourceMappingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<ListEventSourceMappingsResult, JsonUnmarshallerContext> unmarshaller =
                new ListEventSourceMappingsResultJsonUnmarshaller();
            JsonResponseHandler<ListEventSourceMappingsResult> responseHandler =
                new JsonResponseHandler<ListEventSourceMappingsResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes the specified Lambda function alias. For more information,
     * see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/aliases-intro.html"> Introduction to AWS Lambda Aliases </a>
     * .
     * </p>
     * <p>
     * This requires permission for the lambda:DeleteAlias action.
     * </p>
     *
     * @param deleteAliasRequest Container for the necessary parameters to
     *           execute the DeleteAlias service method on AWSLambda.
     * 
     * 
     * @throws InvalidParameterValueException
     * @throws ServiceException
     * @throws TooManyRequestsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteAlias(DeleteAliasRequest deleteAliasRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAliasRequest> request = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAliasRequestMarshaller().marshall(super.beforeMarshalling(deleteAliasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);

        } finally {
            
            endClientExecution(awsRequestMetrics, request, null, LOGGING_AWS_REQUEST_METRIC);
        }
    }
    
    /**
     * <p>
     * Returns the configuration information of the Lambda function. This
     * the same information you provided as parameters when uploading the
     * function by using CreateFunction.
     * </p>
     * <p>
     * If you are using the versioning feature, you can retrieve this
     * information for a specific function version by using the optional
     * <code>Qualifier</code> parameter and specifying the function version
     * or alias that points to it. If you don't provide it, the API returns
     * information about the $LATEST version of the function. For more
     * information about versioning, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html"> AWS Lambda Function Versioning and Aliases </a>
     * .
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:GetFunctionConfiguration</code> operation.
     * </p>
     *
     * @param getFunctionConfigurationRequest Container for the necessary
     *           parameters to execute the GetFunctionConfiguration service method on
     *           AWSLambda.
     * 
     * @return The response from the GetFunctionConfiguration service method,
     *         as returned by AWSLambda.
     * 
     * @throws InvalidParameterValueException
     * @throws ServiceException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetFunctionConfigurationResult getFunctionConfiguration(GetFunctionConfigurationRequest getFunctionConfigurationRequest) {
        ExecutionContext executionContext = createExecutionContext(getFunctionConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetFunctionConfigurationRequest> request = null;
        Response<GetFunctionConfigurationResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetFunctionConfigurationRequestMarshaller().marshall(super.beforeMarshalling(getFunctionConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<GetFunctionConfigurationResult, JsonUnmarshallerContext> unmarshaller =
                new GetFunctionConfigurationResultJsonUnmarshaller();
            JsonResponseHandler<GetFunctionConfigurationResult> responseHandler =
                new JsonResponseHandler<GetFunctionConfigurationResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Removes an event source mapping. This means AWS Lambda will no longer
     * invoke the function for events in the associated source.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:DeleteEventSourceMapping</code> action.
     * </p>
     *
     * @param deleteEventSourceMappingRequest Container for the necessary
     *           parameters to execute the DeleteEventSourceMapping service method on
     *           AWSLambda.
     * 
     * @return The response from the DeleteEventSourceMapping service method,
     *         as returned by AWSLambda.
     * 
     * @throws InvalidParameterValueException
     * @throws ServiceException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteEventSourceMappingResult deleteEventSourceMapping(DeleteEventSourceMappingRequest deleteEventSourceMappingRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteEventSourceMappingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteEventSourceMappingRequest> request = null;
        Response<DeleteEventSourceMappingResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteEventSourceMappingRequestMarshaller().marshall(super.beforeMarshalling(deleteEventSourceMappingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<DeleteEventSourceMappingResult, JsonUnmarshallerContext> unmarshaller =
                new DeleteEventSourceMappingResultJsonUnmarshaller();
            JsonResponseHandler<DeleteEventSourceMappingResult> responseHandler =
                new JsonResponseHandler<DeleteEventSourceMappingResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Identifies a stream as an event source for a Lambda function. It can
     * be either an Amazon Kinesis stream or an Amazon DynamoDB stream. AWS
     * Lambda invokes the specified function when records are posted to the
     * stream.
     * </p>
     * <p>
     * This association between a stream source and a Lambda function is
     * called the event source mapping.
     * </p>
     * <p>
     * <b>IMPORTANT:</b>This event source mapping is relevant only in the
     * AWS Lambda pull model, where AWS Lambda invokes the function. For more
     * information, go to AWS Lambda: How it Works in the AWS Lambda
     * Developer Guide.
     * </p>
     * <p>
     * You provide mapping information (for example, which stream to read
     * from and which Lambda function to invoke) in the request body.
     * </p>
     * <p>
     * Each event source, such as an Amazon Kinesis or a DynamoDB stream,
     * can be associated with multiple AWS Lambda function. A given Lambda
     * function can be associated with multiple AWS event sources.
     * </p>
     * <p>
     * <p>
     * If you are using versioning, you can specify a specific function
     * version or an alias via the function name parameter. For more
     * information about versioning, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html"> AWS Lambda Function Versioning and Aliases </a>
     * .
     * </p>
     * 
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:CreateEventSourceMapping</code> action.
     * </p>
     *
     * @param createEventSourceMappingRequest Container for the necessary
     *           parameters to execute the CreateEventSourceMapping service method on
     *           AWSLambda.
     * 
     * @return The response from the CreateEventSourceMapping service method,
     *         as returned by AWSLambda.
     * 
     * @throws InvalidParameterValueException
     * @throws ServiceException
     * @throws ResourceNotFoundException
     * @throws ResourceConflictException
     * @throws TooManyRequestsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateEventSourceMappingResult createEventSourceMapping(CreateEventSourceMappingRequest createEventSourceMappingRequest) {
        ExecutionContext executionContext = createExecutionContext(createEventSourceMappingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateEventSourceMappingRequest> request = null;
        Response<CreateEventSourceMappingResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateEventSourceMappingRequestMarshaller().marshall(super.beforeMarshalling(createEventSourceMappingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<CreateEventSourceMappingResult, JsonUnmarshallerContext> unmarshaller =
                new CreateEventSourceMappingResultJsonUnmarshaller();
            JsonResponseHandler<CreateEventSourceMappingResult> responseHandler =
                new JsonResponseHandler<CreateEventSourceMappingResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Updates the code for the specified Lambda function. This operation
     * must only be used on an existing Lambda function and cannot be used to
     * update the function configuration.
     * </p>
     * <p>
     * If you are using the versioning feature, note this API will always
     * update the $LATEST version of your Lambda function. For information
     * about the versioning feature, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html"> AWS Lambda Function Versioning and Aliases </a>
     * .
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:UpdateFunctionCode</code> action.
     * </p>
     *
     * @param updateFunctionCodeRequest Container for the necessary
     *           parameters to execute the UpdateFunctionCode service method on
     *           AWSLambda.
     * 
     * @return The response from the UpdateFunctionCode service method, as
     *         returned by AWSLambda.
     * 
     * @throws InvalidParameterValueException
     * @throws ServiceException
     * @throws ResourceNotFoundException
     * @throws CodeStorageExceededException
     * @throws TooManyRequestsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateFunctionCodeResult updateFunctionCode(UpdateFunctionCodeRequest updateFunctionCodeRequest) {
        ExecutionContext executionContext = createExecutionContext(updateFunctionCodeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateFunctionCodeRequest> request = null;
        Response<UpdateFunctionCodeResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateFunctionCodeRequestMarshaller().marshall(super.beforeMarshalling(updateFunctionCodeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<UpdateFunctionCodeResult, JsonUnmarshallerContext> unmarshaller =
                new UpdateFunctionCodeResultJsonUnmarshaller();
            JsonResponseHandler<UpdateFunctionCodeResult> responseHandler =
                new JsonResponseHandler<UpdateFunctionCodeResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns list of aliases created for a Lambda function. For each
     * alias, the response includes information such as the alias ARN,
     * description, alias name, and the function version to which it points.
     * For more information, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/aliases-intro.html"> Introduction to AWS Lambda Aliases </a>
     * .
     * </p>
     * <p>
     * This requires permission for the lambda:ListAliases action.
     * </p>
     *
     * @param listAliasesRequest Container for the necessary parameters to
     *           execute the ListAliases service method on AWSLambda.
     * 
     * @return The response from the ListAliases service method, as returned
     *         by AWSLambda.
     * 
     * @throws InvalidParameterValueException
     * @throws ServiceException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListAliasesResult listAliases(ListAliasesRequest listAliasesRequest) {
        ExecutionContext executionContext = createExecutionContext(listAliasesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAliasesRequest> request = null;
        Response<ListAliasesResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAliasesRequestMarshaller().marshall(super.beforeMarshalling(listAliasesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<ListAliasesResult, JsonUnmarshallerContext> unmarshaller =
                new ListAliasesResultJsonUnmarshaller();
            JsonResponseHandler<ListAliasesResult> responseHandler =
                new JsonResponseHandler<ListAliasesResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * List all versions of a function. For information about the versioning
     * feature, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html"> AWS Lambda Function Versioning and Aliases </a>
     * .
     * </p>
     *
     * @param listVersionsByFunctionRequest Container for the necessary
     *           parameters to execute the ListVersionsByFunction service method on
     *           AWSLambda.
     * 
     * @return The response from the ListVersionsByFunction service method,
     *         as returned by AWSLambda.
     * 
     * @throws InvalidParameterValueException
     * @throws ServiceException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListVersionsByFunctionResult listVersionsByFunction(ListVersionsByFunctionRequest listVersionsByFunctionRequest) {
        ExecutionContext executionContext = createExecutionContext(listVersionsByFunctionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListVersionsByFunctionRequest> request = null;
        Response<ListVersionsByFunctionResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListVersionsByFunctionRequestMarshaller().marshall(super.beforeMarshalling(listVersionsByFunctionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<ListVersionsByFunctionResult, JsonUnmarshallerContext> unmarshaller =
                new ListVersionsByFunctionResultJsonUnmarshaller();
            JsonResponseHandler<ListVersionsByFunctionResult> responseHandler =
                new JsonResponseHandler<ListVersionsByFunctionResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns the configuration information of the Lambda function and a
     * presigned URL link to the .zip file you uploaded with CreateFunction
     * so you can download the .zip file. Note that the URL is valid for up
     * to 10 minutes. The configuration information is the same information
     * you provided as parameters when uploading the function.
     * </p>
     * <p>
     * Using the optional <code>Qualifier</code> parameter, you can specify
     * a specific function version for which you want this information. If
     * you don't specify this parameter, the API uses unqualified function
     * ARN which return information about the <code>$LATEST</code> version of
     * the Lambda function. For more information, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html"> AWS Lambda Function Versioning and Aliases </a>
     * .
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:GetFunction</code> action.
     * </p>
     *
     * @param getFunctionRequest Container for the necessary parameters to
     *           execute the GetFunction service method on AWSLambda.
     * 
     * @return The response from the GetFunction service method, as returned
     *         by AWSLambda.
     * 
     * @throws InvalidParameterValueException
     * @throws ServiceException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetFunctionResult getFunction(GetFunctionRequest getFunctionRequest) {
        ExecutionContext executionContext = createExecutionContext(getFunctionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetFunctionRequest> request = null;
        Response<GetFunctionResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetFunctionRequestMarshaller().marshall(super.beforeMarshalling(getFunctionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<GetFunctionResult, JsonUnmarshallerContext> unmarshaller =
                new GetFunctionResultJsonUnmarshaller();
            JsonResponseHandler<GetFunctionResult> responseHandler =
                new JsonResponseHandler<GetFunctionResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates an alias that points to the specified Lambda function
     * version. For more information, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/aliases-intro.html"> Introduction to AWS Lambda Aliases </a>
     * .
     * </p>
     * <p>
     * Alias names are unique for a given function.
     * </p>
     * <p>
     * This requires permission for the lambda:CreateAlias action.
     * </p>
     *
     * @param createAliasRequest Container for the necessary parameters to
     *           execute the CreateAlias service method on AWSLambda.
     * 
     * @return The response from the CreateAlias service method, as returned
     *         by AWSLambda.
     * 
     * @throws InvalidParameterValueException
     * @throws ServiceException
     * @throws ResourceNotFoundException
     * @throws ResourceConflictException
     * @throws TooManyRequestsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateAliasResult createAlias(CreateAliasRequest createAliasRequest) {
        ExecutionContext executionContext = createExecutionContext(createAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAliasRequest> request = null;
        Response<CreateAliasResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAliasRequestMarshaller().marshall(super.beforeMarshalling(createAliasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<CreateAliasResult, JsonUnmarshallerContext> unmarshaller =
                new CreateAliasResultJsonUnmarshaller();
            JsonResponseHandler<CreateAliasResult> responseHandler =
                new JsonResponseHandler<CreateAliasResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns a list of your Lambda functions. For each function, the
     * response includes the function configuration information. You must use
     * GetFunction to retrieve the code for your function.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:ListFunctions</code> action.
     * </p>
     * <p>
     * If you are using versioning feature, the response returns list of
     * $LATEST versions of your functions. For information about the
     * versioning feature, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html"> AWS Lambda Function Versioning and Aliases </a>
     * .
     * </p>
     * 
     * @return The response from the ListFunctions service method, as
     *         returned by AWSLambda.
     * 
     * @throws ServiceException
     * @throws TooManyRequestsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListFunctionsResult listFunctions() throws AmazonServiceException, AmazonClientException {
        return listFunctions(new ListFunctionsRequest());
    }
    
    /**
     * <p>
     * Returns a list of event source mappings you created using the
     * <code>CreateEventSourceMapping</code> (see CreateEventSourceMapping).
     * </p>
     * <p>
     * For each mapping, the API returns configuration information. You can
     * optionally specify filters to retrieve specific event source mappings.
     * </p>
     * <p>
     * If you are using the versioning feature, you can get list of event
     * source mappings for a specific Lambda function version or an alias as
     * described in the <code>FunctionName</code> parameter. For information
     * about the versioning feature, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html"> AWS Lambda Function Versioning and Aliases </a>
     * .
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:ListEventSourceMappings</code> action.
     * </p>
     * 
     * @return The response from the ListEventSourceMappings service method,
     *         as returned by AWSLambda.
     * 
     * @throws InvalidParameterValueException
     * @throws ServiceException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListEventSourceMappingsResult listEventSourceMappings() throws AmazonServiceException, AmazonClientException {
        return listEventSourceMappings(new ListEventSourceMappingsRequest());
    }

    @Override
    public void setEndpoint(String endpoint) {
        super.setEndpoint(endpoint);
    }

    @Override
    public void setEndpoint(String endpoint, String serviceName, String regionId) throws IllegalArgumentException {
        super.setEndpoint(endpoint, serviceName, regionId);
    }

    /**
     * Returns additional metadata for a previously executed successful, request, typically used for
     * debugging issues where a service isn't acting as expected.  This data isn't considered part
     * of the result data returned by an operation, so it's available through this separate,
     * diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access
     * this extra diagnostic information for an executed request, you should use this method
     * to retrieve it as soon as possible after executing the request.
     *
     * @param request
     *            The originally executed request
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);

        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        AWSCredentials credentials;
        awsRequestMetrics.startEvent(Field.CredentialsRequestTime);
        try {
            credentials = awsCredentialsProvider.getCredentials();
        } finally {
            awsRequestMetrics.endEvent(Field.CredentialsRequestTime);
        }

        AmazonWebServiceRequest originalRequest = request.getOriginalRequest();
        if (originalRequest != null && originalRequest.getRequestCredentials() != null) {
            credentials = originalRequest.getRequestCredentials();
        }

        executionContext.setCredentials(credentials);
        JsonErrorResponseHandler errorResponseHandler = new JsonErrorResponseHandler(jsonErrorUnmarshallers);
        Response<X> result = client.execute(request, responseHandler,
                errorResponseHandler, executionContext);
        return result;
    }
}
        