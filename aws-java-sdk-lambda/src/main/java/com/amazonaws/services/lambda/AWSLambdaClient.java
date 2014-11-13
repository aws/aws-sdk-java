/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * This is the AWS Lambda API Reference. The AWS Lambda Developer Guide
 * provides additional information. For the service overview, go to
 * <a href="http://docs.aws.amazon.com/lambda/latest/dg/welcome.html"> What is AWS Lambda </a> , and for information about how the service works, go to <a href="http://docs.aws.amazon.com/lambda/latest/dg/lambda-introduction.html"> AWS LambdaL How it Works </a>
 * in the AWS Lambda Developer Guide.
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
        jsonErrorUnmarshallers.add(new ServiceExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidParameterValueExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidRequestContentExceptionUnmarshaller());
        
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
     * Returns configuration information for the specified event source
     * mapping (see AddEventSource).
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:GetEventSource</code> action.
     * </p>
     *
     * @param getEventSourceRequest Container for the necessary parameters to
     *           execute the GetEventSource service method on AWSLambda.
     * 
     * @return The response from the GetEventSource service method, as
     *         returned by AWSLambda.
     * 
     * @throws InvalidParameterValueException
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
    public GetEventSourceResult getEventSource(GetEventSourceRequest getEventSourceRequest) {
        ExecutionContext executionContext = createExecutionContext(getEventSourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetEventSourceRequest> request = null;
        Response<GetEventSourceResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetEventSourceRequestMarshaller().marshall(getEventSourceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetEventSourceResult, JsonUnmarshallerContext> unmarshaller =
                new GetEventSourceResultJsonUnmarshaller();
            JsonResponseHandler<GetEventSourceResult> responseHandler =
                new JsonResponseHandler<GetEventSourceResult>(unmarshaller);
            
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
     * This operation requires permission for the
     * <code>lambda:DeleteFunction</code> action.
     * </p>
     *
     * @param deleteFunctionRequest Container for the necessary parameters to
     *           execute the DeleteFunction service method on AWSLambda.
     * 
     * 
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
    public void deleteFunction(DeleteFunctionRequest deleteFunctionRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteFunctionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteFunctionRequest> request = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteFunctionRequestMarshaller().marshall(deleteFunctionRequest);
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
     * Returns a list of your Lambda functions. For each function, the
     * response includes the function configuration information. You must use
     * GetFunction to retrieve the code for your function.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:ListFunctions</code> action.
     * </p>
     *
     * @param listFunctionsRequest Container for the necessary parameters to
     *           execute the ListFunctions service method on AWSLambda.
     * 
     * @return The response from the ListFunctions service method, as
     *         returned by AWSLambda.
     * 
     * @throws ServiceException
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
                request = new ListFunctionsRequestMarshaller().marshall(listFunctionsRequest);
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
     * Identifies an Amazon Kinesis stream as the event source for an AWS
     * Lambda function. AWS Lambda invokes the specified function when
     * records are posted to the stream.
     * </p>
     * <p>
     * This is the pull model, where AWS Lambda invokes the function. For
     * more information, go to
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/lambda-introduction.html"> AWS LambdaL How it Works </a>
     * in the AWS Lambda Developer Guide.
     * </p>
     * <p>
     * This association between an Amazon Kinesis stream and an AWS Lambda
     * function is called the event source mapping. You provide the
     * configuration information (for example, which stream to read from and
     * which AWS Lambda function to invoke) for the event source mapping in
     * the request body.
     * </p>
     * <p>
     * This operation requires permission for the <code>iam:PassRole</code>
     * action for the IAM role. It also requires permission for the
     * <code>lambda:AddEventSource</code> action.
     * </p>
     *
     * @param addEventSourceRequest Container for the necessary parameters to
     *           execute the AddEventSource service method on AWSLambda.
     * 
     * @return The response from the AddEventSource service method, as
     *         returned by AWSLambda.
     * 
     * @throws InvalidParameterValueException
     * @throws ServiceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public AddEventSourceResult addEventSource(AddEventSourceRequest addEventSourceRequest) {
        ExecutionContext executionContext = createExecutionContext(addEventSourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddEventSourceRequest> request = null;
        Response<AddEventSourceResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddEventSourceRequestMarshaller().marshall(addEventSourceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AddEventSourceResult, JsonUnmarshallerContext> unmarshaller =
                new AddEventSourceResultJsonUnmarshaller();
            JsonResponseHandler<AddEventSourceResult> responseHandler =
                new JsonResponseHandler<AddEventSourceResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a new Lambda function or updates an existing function. The
     * function metadata is created from the request parameters, and the code
     * for the function is provided by a .zip file in the request body. If
     * the function name already exists, the existing Lambda function is
     * updated with the new code and metadata.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:UploadFunction</code> action.
     * </p>
     *
     * @param uploadFunctionRequest Container for the necessary parameters to
     *           execute the UploadFunction service method on AWSLambda.
     * 
     * @return The response from the UploadFunction service method, as
     *         returned by AWSLambda.
     * 
     * @throws InvalidParameterValueException
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
    public UploadFunctionResult uploadFunction(UploadFunctionRequest uploadFunctionRequest) {
        ExecutionContext executionContext = createExecutionContext(uploadFunctionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UploadFunctionRequest> request = null;
        Response<UploadFunctionResult> response = null;
        
        final InputStream isOrig = uploadFunctionRequest.getFunctionZip();
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UploadFunctionRequestMarshaller().marshall(uploadFunctionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UploadFunctionResult, JsonUnmarshallerContext> unmarshaller =
                new UploadFunctionResultJsonUnmarshaller();
            JsonResponseHandler<UploadFunctionResult> responseHandler =
                new JsonResponseHandler<UploadFunctionResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            
            // Restore the original input stream, so that the caller
            // (who is responsible) can close it
            uploadFunctionRequest.setFunctionZip(isOrig);
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns the configuration information of the Lambda function. This
     * the same information you provided as parameters when uploading the
     * function by using UploadFunction.
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
    public GetFunctionConfigurationResult getFunctionConfiguration(GetFunctionConfigurationRequest getFunctionConfigurationRequest) {
        ExecutionContext executionContext = createExecutionContext(getFunctionConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetFunctionConfigurationRequest> request = null;
        Response<GetFunctionConfigurationResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetFunctionConfigurationRequestMarshaller().marshall(getFunctionConfigurationRequest);
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
     * Submits an invocation request to AWS Lambda. Upon receiving the
     * request, Lambda executes the specified function asynchronously. To see
     * the logs generated by the Lambda function execution, see the
     * CloudWatch logs console.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:InvokeAsync</code> action.
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
                request = new InvokeAsyncRequestMarshaller().marshall(invokeAsyncRequest);
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
     * Returns a list of event source mappings. For each mapping, the API
     * returns configuration information (see AddEventSource). You can
     * optionally specify filters to retrieve specific event source mappings.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:ListEventSources</code> action.
     * </p>
     *
     * @param listEventSourcesRequest Container for the necessary parameters
     *           to execute the ListEventSources service method on AWSLambda.
     * 
     * @return The response from the ListEventSources service method, as
     *         returned by AWSLambda.
     * 
     * @throws InvalidParameterValueException
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
    public ListEventSourcesResult listEventSources(ListEventSourcesRequest listEventSourcesRequest) {
        ExecutionContext executionContext = createExecutionContext(listEventSourcesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListEventSourcesRequest> request = null;
        Response<ListEventSourcesResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListEventSourcesRequestMarshaller().marshall(listEventSourcesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListEventSourcesResult, JsonUnmarshallerContext> unmarshaller =
                new ListEventSourcesResultJsonUnmarshaller();
            JsonResponseHandler<ListEventSourcesResult> responseHandler =
                new JsonResponseHandler<ListEventSourcesResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns the configuration information of the Lambda function and a
     * presigned URL link to the .zip file you uploaded with UploadFunction
     * so you can download the .zip file. Note that the URL is valid for up
     * to 10 minutes. The configuration information is the same information
     * you provided as parameters when uploading the function.
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
    public GetFunctionResult getFunction(GetFunctionRequest getFunctionRequest) {
        ExecutionContext executionContext = createExecutionContext(getFunctionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetFunctionRequest> request = null;
        Response<GetFunctionResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetFunctionRequestMarshaller().marshall(getFunctionRequest);
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
     * Updates the configuration parameters for the specified Lambda
     * function by using the values provided in the request. You provide only
     * the parameters you want to change. This operation must only be used on
     * an existing Lambda function and cannot be used to update the
     * function's code.
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
                request = new UpdateFunctionConfigurationRequestMarshaller().marshall(updateFunctionConfigurationRequest);
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
     * Removes an event source mapping. This means AWS Lambda will no longer
     * invoke the function for events in the associated source.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:RemoveEventSource</code> action.
     * </p>
     *
     * @param removeEventSourceRequest Container for the necessary parameters
     *           to execute the RemoveEventSource service method on AWSLambda.
     * 
     * 
     * @throws InvalidParameterValueException
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
    public void removeEventSource(RemoveEventSourceRequest removeEventSourceRequest) {
        ExecutionContext executionContext = createExecutionContext(removeEventSourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveEventSourceRequest> request = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemoveEventSourceRequestMarshaller().marshall(removeEventSourceRequest);
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
     * Returns a list of your Lambda functions. For each function, the
     * response includes the function configuration information. You must use
     * GetFunction to retrieve the code for your function.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:ListFunctions</code> action.
     * </p>
     * 
     * @return The response from the ListFunctions service method, as
     *         returned by AWSLambda.
     * 
     * @throws ServiceException
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
     * Returns a list of event source mappings. For each mapping, the API
     * returns configuration information (see AddEventSource). You can
     * optionally specify filters to retrieve specific event source mappings.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:ListEventSources</code> action.
     * </p>
     * 
     * @return The response from the ListEventSources service method, as
     *         returned by AWSLambda.
     * 
     * @throws InvalidParameterValueException
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
    public ListEventSourcesResult listEventSources() throws AmazonServiceException, AmazonClientException {
        return listEventSources(new ListEventSourcesRequest());
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
        