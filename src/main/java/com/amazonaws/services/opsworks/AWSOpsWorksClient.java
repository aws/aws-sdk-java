/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.opsworks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.auth.*;
import com.amazonaws.handlers.HandlerChainFactory;
import com.amazonaws.handlers.RequestHandler;
import com.amazonaws.http.HttpResponseHandler;
import com.amazonaws.http.JsonResponseHandler;
import com.amazonaws.http.JsonErrorResponseHandler;
import com.amazonaws.http.ExecutionContext;
import com.amazonaws.util.AWSRequestMetrics;
import com.amazonaws.util.AWSRequestMetrics.Field;
import com.amazonaws.internal.StaticCredentialsProvider;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.JsonErrorUnmarshaller;
import com.amazonaws.util.json.JSONObject;

import com.amazonaws.services.opsworks.model.*;
import com.amazonaws.services.opsworks.model.transform.*;


/**
 * Client for accessing AWSOpsWorks.  All service calls made
 * using this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * AWS OpsWorks
 */
public class AWSOpsWorksClient extends AmazonWebServiceClient implements AWSOpsWorks {

    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSOpsWorks.class);

    /**
     * List of exception unmarshallers for all AWSOpsWorks exceptions.
     */
    protected List<Unmarshaller<AmazonServiceException, JSONObject>> exceptionUnmarshallers;

    
    /** AWS signer for authenticating requests. */
    private AWS4Signer signer;


    /**
     * Constructs a new client to invoke service methods on
     * AWSOpsWorks.  A credentials provider chain will be used
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
     * @see DefaultAWSCredentialsProvider
     */
    public AWSOpsWorksClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSOpsWorks.  A credentials provider chain will be used
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
     *                       client connects to AWSOpsWorks
     *                       (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProvider
     */
    public AWSOpsWorksClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSOpsWorks using the specified AWS account credentials.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     */
    public AWSOpsWorksClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSOpsWorks using the specified AWS account credentials
     * and client configuration options.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AWSOpsWorks
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AWSOpsWorksClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        
        init();
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSOpsWorks using the specified AWS account credentials provider.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     */
    public AWSOpsWorksClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSOpsWorks using the specified AWS account credentials
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
     *                       client connects to AWSOpsWorks
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AWSOpsWorksClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        
        this.awsCredentialsProvider = awsCredentialsProvider;
        
        init();
    }


    private void init() {
        exceptionUnmarshallers = new ArrayList<Unmarshaller<AmazonServiceException, JSONObject>>();
        exceptionUnmarshallers.add(new ValidationExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ResourceNotFoundExceptionUnmarshaller());
        
        exceptionUnmarshallers.add(new JsonErrorUnmarshaller());
        setEndpoint("opsworks.us-east-1.amazonaws.com");

        signer = new AWS4Signer();
        
        signer.setServiceName("opsworks");
        

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandlers.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/opsworks/request.handlers"));

        
    }

    
    /**
     * <p>
     * Updates a specified user's SSH name and public key.
     * </p>
     *
     * @param updateUserProfileRequest Container for the necessary parameters
     *           to execute the UpdateUserProfile service method on AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void updateUserProfile(UpdateUserProfileRequest updateUserProfileRequest) 
            throws AmazonServiceException, AmazonClientException {
                                     
        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext();
        
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<UpdateUserProfileRequest> request = new UpdateUserProfileRequestMarshaller().marshall(updateUserProfileRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
        invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Creates a new stack.
     * </p>
     *
     * @param createStackRequest Container for the necessary parameters to
     *           execute the CreateStack service method on AWSOpsWorks.
     * 
     * @return The response from the CreateStack service method, as returned
     *         by AWSOpsWorks.
     * 
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateStackResult createStack(CreateStackRequest createStackRequest) 
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext();
        
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<CreateStackRequest> request = new CreateStackRequestMarshaller().marshall(createStackRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        Unmarshaller<CreateStackResult, JsonUnmarshallerContext> unmarshaller = new CreateStackResultJsonUnmarshaller();
        
        JsonResponseHandler<CreateStackResult> responseHandler = new JsonResponseHandler<CreateStackResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Reboots a specified instance.
     * </p>
     *
     * @param rebootInstanceRequest Container for the necessary parameters to
     *           execute the RebootInstance service method on AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void rebootInstance(RebootInstanceRequest rebootInstanceRequest) 
            throws AmazonServiceException, AmazonClientException {
                                     
        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext();
        
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<RebootInstanceRequest> request = new RebootInstanceRequestMarshaller().marshall(rebootInstanceRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
        invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Specifies a stack's permissions.
     * </p>
     *
     * @param setPermissionRequest Container for the necessary parameters to
     *           execute the SetPermission service method on AWSOpsWorks.
     * 
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void setPermission(SetPermissionRequest setPermissionRequest) 
            throws AmazonServiceException, AmazonClientException {
                                     
        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext();
        
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<SetPermissionRequest> request = new SetPermissionRequestMarshaller().marshall(setPermissionRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
        invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Requests a description of a set of instances associated with a
     * specified ID or IDs.
     * </p>
     *
     * @param describeInstancesRequest Container for the necessary parameters
     *           to execute the DescribeInstances service method on AWSOpsWorks.
     * 
     * @return The response from the DescribeInstances service method, as
     *         returned by AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeInstancesResult describeInstances(DescribeInstancesRequest describeInstancesRequest) 
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext();
        
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<DescribeInstancesRequest> request = new DescribeInstancesRequestMarshaller().marshall(describeInstancesRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        Unmarshaller<DescribeInstancesResult, JsonUnmarshallerContext> unmarshaller = new DescribeInstancesResultJsonUnmarshaller();
        
        JsonResponseHandler<DescribeInstancesResult> responseHandler = new JsonResponseHandler<DescribeInstancesResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Describes the permissions for a specified stack. You must specify at
     * least one of the two request values.
     * </p>
     *
     * @param describePermissionsRequest Container for the necessary
     *           parameters to execute the DescribePermissions service method on
     *           AWSOpsWorks.
     * 
     * @return The response from the DescribePermissions service method, as
     *         returned by AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribePermissionsResult describePermissions(DescribePermissionsRequest describePermissionsRequest) 
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext();
        
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<DescribePermissionsRequest> request = new DescribePermissionsRequestMarshaller().marshall(describePermissionsRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        Unmarshaller<DescribePermissionsResult, JsonUnmarshallerContext> unmarshaller = new DescribePermissionsResultJsonUnmarshaller();
        
        JsonResponseHandler<DescribePermissionsResult> responseHandler = new JsonResponseHandler<DescribePermissionsResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Deletes a specified instance.
     * </p>
     *
     * @param deleteInstanceRequest Container for the necessary parameters to
     *           execute the DeleteInstance service method on AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteInstance(DeleteInstanceRequest deleteInstanceRequest) 
            throws AmazonServiceException, AmazonClientException {
                                     
        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext();
        
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<DeleteInstanceRequest> request = new DeleteInstanceRequestMarshaller().marshall(deleteInstanceRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
        invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Creates a clone of a specified stack.
     * </p>
     *
     * @param cloneStackRequest Container for the necessary parameters to
     *           execute the CloneStack service method on AWSOpsWorks.
     * 
     * @return The response from the CloneStack service method, as returned
     *         by AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CloneStackResult cloneStack(CloneStackRequest cloneStackRequest) 
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext();
        
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<CloneStackRequest> request = new CloneStackRequestMarshaller().marshall(cloneStackRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        Unmarshaller<CloneStackResult, JsonUnmarshallerContext> unmarshaller = new CloneStackResultJsonUnmarshaller();
        
        JsonResponseHandler<CloneStackResult> responseHandler = new JsonResponseHandler<CloneStackResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Creates an instance in a specified stack.
     * </p>
     *
     * @param createInstanceRequest Container for the necessary parameters to
     *           execute the CreateInstance service method on AWSOpsWorks.
     * 
     * @return The response from the CreateInstance service method, as
     *         returned by AWSOpsWorks.
     * 
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateInstanceResult createInstance(CreateInstanceRequest createInstanceRequest) 
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext();
        
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<CreateInstanceRequest> request = new CreateInstanceRequestMarshaller().marshall(createInstanceRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        Unmarshaller<CreateInstanceResult, JsonUnmarshallerContext> unmarshaller = new CreateInstanceResultJsonUnmarshaller();
        
        JsonResponseHandler<CreateInstanceResult> responseHandler = new JsonResponseHandler<CreateInstanceResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Stops a specified instance. When you stop a standard instance, the
     * data disappears and must be reinstalled when you restart the instance.
     * You can stop an Amazon EBS-backed instance without losing data.
     * </p>
     *
     * @param stopInstanceRequest Container for the necessary parameters to
     *           execute the StopInstance service method on AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void stopInstance(StopInstanceRequest stopInstanceRequest) 
            throws AmazonServiceException, AmazonClientException {
                                     
        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext();
        
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<StopInstanceRequest> request = new StopInstanceRequestMarshaller().marshall(stopInstanceRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
        invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Updates a specified app.
     * </p>
     *
     * @param updateAppRequest Container for the necessary parameters to
     *           execute the UpdateApp service method on AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void updateApp(UpdateAppRequest updateAppRequest) 
            throws AmazonServiceException, AmazonClientException {
                                     
        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext();
        
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<UpdateAppRequest> request = new UpdateAppRequestMarshaller().marshall(updateAppRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
        invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Deletes a specified app.
     * </p>
     *
     * @param deleteAppRequest Container for the necessary parameters to
     *           execute the DeleteApp service method on AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteApp(DeleteAppRequest deleteAppRequest) 
            throws AmazonServiceException, AmazonClientException {
                                     
        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext();
        
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<DeleteAppRequest> request = new DeleteAppRequestMarshaller().marshall(deleteAppRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
        invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Describes the results of specified commands.
     * </p>
     *
     * @param describeCommandsRequest Container for the necessary parameters
     *           to execute the DescribeCommands service method on AWSOpsWorks.
     * 
     * @return The response from the DescribeCommands service method, as
     *         returned by AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeCommandsResult describeCommands(DescribeCommandsRequest describeCommandsRequest) 
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext();
        
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<DescribeCommandsRequest> request = new DescribeCommandsRequestMarshaller().marshall(describeCommandsRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        Unmarshaller<DescribeCommandsResult, JsonUnmarshallerContext> unmarshaller = new DescribeCommandsResultJsonUnmarshaller();
        
        JsonResponseHandler<DescribeCommandsResult> responseHandler = new JsonResponseHandler<DescribeCommandsResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Updates a specified stack.
     * </p>
     *
     * @param updateStackRequest Container for the necessary parameters to
     *           execute the UpdateStack service method on AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void updateStack(UpdateStackRequest updateStackRequest) 
            throws AmazonServiceException, AmazonClientException {
                                     
        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext();
        
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<UpdateStackRequest> request = new UpdateStackRequestMarshaller().marshall(updateStackRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
        invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Creates a new user.
     * </p>
     *
     * @param createUserProfileRequest Container for the necessary parameters
     *           to execute the CreateUserProfile service method on AWSOpsWorks.
     * 
     * @return The response from the CreateUserProfile service method, as
     *         returned by AWSOpsWorks.
     * 
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateUserProfileResult createUserProfile(CreateUserProfileRequest createUserProfileRequest) 
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext();
        
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<CreateUserProfileRequest> request = new CreateUserProfileRequestMarshaller().marshall(createUserProfileRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        Unmarshaller<CreateUserProfileResult, JsonUnmarshallerContext> unmarshaller = new CreateUserProfileResultJsonUnmarshaller();
        
        JsonResponseHandler<CreateUserProfileResult> responseHandler = new JsonResponseHandler<CreateUserProfileResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Gets a generated hostname for the specified layer, based on the
     * current hostname theme.
     * </p>
     *
     * @param getHostnameSuggestionRequest Container for the necessary
     *           parameters to execute the GetHostnameSuggestion service method on
     *           AWSOpsWorks.
     * 
     * @return The response from the GetHostnameSuggestion service method, as
     *         returned by AWSOpsWorks.
     * 
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetHostnameSuggestionResult getHostnameSuggestion(GetHostnameSuggestionRequest getHostnameSuggestionRequest) 
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext();
        
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<GetHostnameSuggestionRequest> request = new GetHostnameSuggestionRequestMarshaller().marshall(getHostnameSuggestionRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        Unmarshaller<GetHostnameSuggestionResult, JsonUnmarshallerContext> unmarshaller = new GetHostnameSuggestionResultJsonUnmarshaller();
        
        JsonResponseHandler<GetHostnameSuggestionResult> responseHandler = new JsonResponseHandler<GetHostnameSuggestionResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Describe an instance's RAID arrays.
     * </p>
     *
     * @param describeRaidArraysRequest Container for the necessary
     *           parameters to execute the DescribeRaidArrays service method on
     *           AWSOpsWorks.
     * 
     * @return The response from the DescribeRaidArrays service method, as
     *         returned by AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeRaidArraysResult describeRaidArrays(DescribeRaidArraysRequest describeRaidArraysRequest) 
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext();
        
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<DescribeRaidArraysRequest> request = new DescribeRaidArraysRequestMarshaller().marshall(describeRaidArraysRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        Unmarshaller<DescribeRaidArraysResult, JsonUnmarshallerContext> unmarshaller = new DescribeRaidArraysResultJsonUnmarshaller();
        
        JsonResponseHandler<DescribeRaidArraysResult> responseHandler = new JsonResponseHandler<DescribeRaidArraysResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Requests a description of one or more layers in a specified stack.
     * </p>
     *
     * @param describeLayersRequest Container for the necessary parameters to
     *           execute the DescribeLayers service method on AWSOpsWorks.
     * 
     * @return The response from the DescribeLayers service method, as
     *         returned by AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeLayersResult describeLayers(DescribeLayersRequest describeLayersRequest) 
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext();
        
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<DescribeLayersRequest> request = new DescribeLayersRequestMarshaller().marshall(describeLayersRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        Unmarshaller<DescribeLayersResult, JsonUnmarshallerContext> unmarshaller = new DescribeLayersResultJsonUnmarshaller();
        
        JsonResponseHandler<DescribeLayersResult> responseHandler = new JsonResponseHandler<DescribeLayersResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Describes load-based auto scaling configurations for specified layers.
     * </p>
     *
     * @param describeLoadBasedAutoScalingRequest Container for the necessary
     *           parameters to execute the DescribeLoadBasedAutoScaling service method
     *           on AWSOpsWorks.
     * 
     * @return The response from the DescribeLoadBasedAutoScaling service
     *         method, as returned by AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeLoadBasedAutoScalingResult describeLoadBasedAutoScaling(DescribeLoadBasedAutoScalingRequest describeLoadBasedAutoScalingRequest) 
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext();
        
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<DescribeLoadBasedAutoScalingRequest> request = new DescribeLoadBasedAutoScalingRequestMarshaller().marshall(describeLoadBasedAutoScalingRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        Unmarshaller<DescribeLoadBasedAutoScalingResult, JsonUnmarshallerContext> unmarshaller = new DescribeLoadBasedAutoScalingResultJsonUnmarshaller();
        
        JsonResponseHandler<DescribeLoadBasedAutoScalingResult> responseHandler = new JsonResponseHandler<DescribeLoadBasedAutoScalingResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Specify the load-based auto scaling configuration for a specified
     * layer.
     * </p>
     * <p>
     * <b>NOTE:</b>To use load-based auto scaling, you must create a set of
     * load-based auto scaling instances. Load-based auto scaling operates
     * only on the instances from that set, so you must ensure that you have
     * created enough instances to handle the maximum anticipated load.
     * </p>
     *
     * @param setLoadBasedAutoScalingRequest Container for the necessary
     *           parameters to execute the SetLoadBasedAutoScaling service method on
     *           AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void setLoadBasedAutoScaling(SetLoadBasedAutoScalingRequest setLoadBasedAutoScalingRequest) 
            throws AmazonServiceException, AmazonClientException {
                                     
        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext();
        
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<SetLoadBasedAutoScalingRequest> request = new SetLoadBasedAutoScalingRequestMarshaller().marshall(setLoadBasedAutoScalingRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
        invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Deletes a specified layer. You must first remove all associated
     * instances.
     * </p>
     *
     * @param deleteLayerRequest Container for the necessary parameters to
     *           execute the DeleteLayer service method on AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteLayer(DeleteLayerRequest deleteLayerRequest) 
            throws AmazonServiceException, AmazonClientException {
                                     
        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext();
        
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<DeleteLayerRequest> request = new DeleteLayerRequestMarshaller().marshall(deleteLayerRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
        invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Describes an instance's Amazon EBS volumes.
     * </p>
     *
     * @param describeVolumesRequest Container for the necessary parameters
     *           to execute the DescribeVolumes service method on AWSOpsWorks.
     * 
     * @return The response from the DescribeVolumes service method, as
     *         returned by AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeVolumesResult describeVolumes(DescribeVolumesRequest describeVolumesRequest) 
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext();
        
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<DescribeVolumesRequest> request = new DescribeVolumesRequestMarshaller().marshall(describeVolumesRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        Unmarshaller<DescribeVolumesResult, JsonUnmarshallerContext> unmarshaller = new DescribeVolumesResultJsonUnmarshaller();
        
        JsonResponseHandler<DescribeVolumesResult> responseHandler = new JsonResponseHandler<DescribeVolumesResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Specify the time-based auto scaling configuration for a specified
     * instance.
     * </p>
     *
     * @param setTimeBasedAutoScalingRequest Container for the necessary
     *           parameters to execute the SetTimeBasedAutoScaling service method on
     *           AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void setTimeBasedAutoScaling(SetTimeBasedAutoScalingRequest setTimeBasedAutoScalingRequest) 
            throws AmazonServiceException, AmazonClientException {
                                     
        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext();
        
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<SetTimeBasedAutoScalingRequest> request = new SetTimeBasedAutoScalingRequestMarshaller().marshall(setTimeBasedAutoScalingRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
        invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Creates an app for a specified stack.
     * </p>
     *
     * @param createAppRequest Container for the necessary parameters to
     *           execute the CreateApp service method on AWSOpsWorks.
     * 
     * @return The response from the CreateApp service method, as returned by
     *         AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateAppResult createApp(CreateAppRequest createAppRequest) 
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext();
        
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<CreateAppRequest> request = new CreateAppRequestMarshaller().marshall(createAppRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        Unmarshaller<CreateAppResult, JsonUnmarshallerContext> unmarshaller = new CreateAppResultJsonUnmarshaller();
        
        JsonResponseHandler<CreateAppResult> responseHandler = new JsonResponseHandler<CreateAppResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Describes time-based auto scaling configurations for specified
     * instances.
     * </p>
     *
     * @param describeTimeBasedAutoScalingRequest Container for the necessary
     *           parameters to execute the DescribeTimeBasedAutoScaling service method
     *           on AWSOpsWorks.
     * 
     * @return The response from the DescribeTimeBasedAutoScaling service
     *         method, as returned by AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeTimeBasedAutoScalingResult describeTimeBasedAutoScaling(DescribeTimeBasedAutoScalingRequest describeTimeBasedAutoScalingRequest) 
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext();
        
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<DescribeTimeBasedAutoScalingRequest> request = new DescribeTimeBasedAutoScalingRequestMarshaller().marshall(describeTimeBasedAutoScalingRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        Unmarshaller<DescribeTimeBasedAutoScalingResult, JsonUnmarshallerContext> unmarshaller = new DescribeTimeBasedAutoScalingResultJsonUnmarshaller();
        
        JsonResponseHandler<DescribeTimeBasedAutoScalingResult> responseHandler = new JsonResponseHandler<DescribeTimeBasedAutoScalingResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Deletes a user.
     * </p>
     *
     * @param deleteUserProfileRequest Container for the necessary parameters
     *           to execute the DeleteUserProfile service method on AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteUserProfile(DeleteUserProfileRequest deleteUserProfileRequest) 
            throws AmazonServiceException, AmazonClientException {
                                     
        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext();
        
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<DeleteUserProfileRequest> request = new DeleteUserProfileRequestMarshaller().marshall(deleteUserProfileRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
        invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Describe specified users.
     * </p>
     *
     * @param describeUserProfilesRequest Container for the necessary
     *           parameters to execute the DescribeUserProfiles service method on
     *           AWSOpsWorks.
     * 
     * @return The response from the DescribeUserProfiles service method, as
     *         returned by AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeUserProfilesResult describeUserProfiles(DescribeUserProfilesRequest describeUserProfilesRequest) 
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext();
        
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<DescribeUserProfilesRequest> request = new DescribeUserProfilesRequestMarshaller().marshall(describeUserProfilesRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        Unmarshaller<DescribeUserProfilesResult, JsonUnmarshallerContext> unmarshaller = new DescribeUserProfilesResultJsonUnmarshaller();
        
        JsonResponseHandler<DescribeUserProfilesResult> responseHandler = new JsonResponseHandler<DescribeUserProfilesResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Updates a specified instance.
     * </p>
     *
     * @param updateInstanceRequest Container for the necessary parameters to
     *           execute the UpdateInstance service method on AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void updateInstance(UpdateInstanceRequest updateInstanceRequest) 
            throws AmazonServiceException, AmazonClientException {
                                     
        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext();
        
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<UpdateInstanceRequest> request = new UpdateInstanceRequestMarshaller().marshall(updateInstanceRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
        invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Describes OpsWorks service errors.
     * </p>
     *
     * @param describeServiceErrorsRequest Container for the necessary
     *           parameters to execute the DescribeServiceErrors service method on
     *           AWSOpsWorks.
     * 
     * @return The response from the DescribeServiceErrors service method, as
     *         returned by AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeServiceErrorsResult describeServiceErrors(DescribeServiceErrorsRequest describeServiceErrorsRequest) 
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext();
        
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<DescribeServiceErrorsRequest> request = new DescribeServiceErrorsRequestMarshaller().marshall(describeServiceErrorsRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        Unmarshaller<DescribeServiceErrorsResult, JsonUnmarshallerContext> unmarshaller = new DescribeServiceErrorsResultJsonUnmarshaller();
        
        JsonResponseHandler<DescribeServiceErrorsResult> responseHandler = new JsonResponseHandler<DescribeServiceErrorsResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Requests a description of a specified set of deployments.
     * </p>
     *
     * @param describeDeploymentsRequest Container for the necessary
     *           parameters to execute the DescribeDeployments service method on
     *           AWSOpsWorks.
     * 
     * @return The response from the DescribeDeployments service method, as
     *         returned by AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeDeploymentsResult describeDeployments(DescribeDeploymentsRequest describeDeploymentsRequest) 
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext();
        
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<DescribeDeploymentsRequest> request = new DescribeDeploymentsRequestMarshaller().marshall(describeDeploymentsRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        Unmarshaller<DescribeDeploymentsResult, JsonUnmarshallerContext> unmarshaller = new DescribeDeploymentsResultJsonUnmarshaller();
        
        JsonResponseHandler<DescribeDeploymentsResult> responseHandler = new JsonResponseHandler<DescribeDeploymentsResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Updates a specified layer.
     * </p>
     *
     * @param updateLayerRequest Container for the necessary parameters to
     *           execute the UpdateLayer service method on AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void updateLayer(UpdateLayerRequest updateLayerRequest) 
            throws AmazonServiceException, AmazonClientException {
                                     
        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext();
        
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<UpdateLayerRequest> request = new UpdateLayerRequestMarshaller().marshall(updateLayerRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
        invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Starts a specified instance.
     * </p>
     *
     * @param startInstanceRequest Container for the necessary parameters to
     *           execute the StartInstance service method on AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void startInstance(StartInstanceRequest startInstanceRequest) 
            throws AmazonServiceException, AmazonClientException {
                                     
        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext();
        
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<StartInstanceRequest> request = new StartInstanceRequestMarshaller().marshall(startInstanceRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
        invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Describes an instance's <a
     * aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html">
     * Elastic IP addresses </a> .
     * </p>
     *
     * @param describeElasticIpsRequest Container for the necessary
     *           parameters to execute the DescribeElasticIps service method on
     *           AWSOpsWorks.
     * 
     * @return The response from the DescribeElasticIps service method, as
     *         returned by AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeElasticIpsResult describeElasticIps(DescribeElasticIpsRequest describeElasticIpsRequest) 
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext();
        
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<DescribeElasticIpsRequest> request = new DescribeElasticIpsRequestMarshaller().marshall(describeElasticIpsRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        Unmarshaller<DescribeElasticIpsResult, JsonUnmarshallerContext> unmarshaller = new DescribeElasticIpsResultJsonUnmarshaller();
        
        JsonResponseHandler<DescribeElasticIpsResult> responseHandler = new JsonResponseHandler<DescribeElasticIpsResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Requests a description of one or more stacks.
     * </p>
     *
     * @param describeStacksRequest Container for the necessary parameters to
     *           execute the DescribeStacks service method on AWSOpsWorks.
     * 
     * @return The response from the DescribeStacks service method, as
     *         returned by AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeStacksResult describeStacks(DescribeStacksRequest describeStacksRequest) 
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext();
        
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<DescribeStacksRequest> request = new DescribeStacksRequestMarshaller().marshall(describeStacksRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        Unmarshaller<DescribeStacksResult, JsonUnmarshallerContext> unmarshaller = new DescribeStacksResultJsonUnmarshaller();
        
        JsonResponseHandler<DescribeStacksResult> responseHandler = new JsonResponseHandler<DescribeStacksResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Requests a description of a specified set of apps.
     * </p>
     *
     * @param describeAppsRequest Container for the necessary parameters to
     *           execute the DescribeApps service method on AWSOpsWorks.
     * 
     * @return The response from the DescribeApps service method, as returned
     *         by AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeAppsResult describeApps(DescribeAppsRequest describeAppsRequest) 
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext();
        
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<DescribeAppsRequest> request = new DescribeAppsRequestMarshaller().marshall(describeAppsRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        Unmarshaller<DescribeAppsResult, JsonUnmarshallerContext> unmarshaller = new DescribeAppsResultJsonUnmarshaller();
        
        JsonResponseHandler<DescribeAppsResult> responseHandler = new JsonResponseHandler<DescribeAppsResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Creates a layer.
     * </p>
     *
     * @param createLayerRequest Container for the necessary parameters to
     *           execute the CreateLayer service method on AWSOpsWorks.
     * 
     * @return The response from the CreateLayer service method, as returned
     *         by AWSOpsWorks.
     * 
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateLayerResult createLayer(CreateLayerRequest createLayerRequest) 
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext();
        
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<CreateLayerRequest> request = new CreateLayerRequestMarshaller().marshall(createLayerRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        Unmarshaller<CreateLayerResult, JsonUnmarshallerContext> unmarshaller = new CreateLayerResultJsonUnmarshaller();
        
        JsonResponseHandler<CreateLayerResult> responseHandler = new JsonResponseHandler<CreateLayerResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Deletes a specified stack. You must first delete all instances and
     * layers.
     * </p>
     *
     * @param deleteStackRequest Container for the necessary parameters to
     *           execute the DeleteStack service method on AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteStack(DeleteStackRequest deleteStackRequest) 
            throws AmazonServiceException, AmazonClientException {
                                     
        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext();
        
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<DeleteStackRequest> request = new DeleteStackRequestMarshaller().marshall(deleteStackRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
        invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Starts stack's instances.
     * </p>
     *
     * @param startStackRequest Container for the necessary parameters to
     *           execute the StartStack service method on AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void startStack(StartStackRequest startStackRequest) 
            throws AmazonServiceException, AmazonClientException {
                                     
        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext();
        
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<StartStackRequest> request = new StartStackRequestMarshaller().marshall(startStackRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
        invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Stops a specified stack.
     * </p>
     *
     * @param stopStackRequest Container for the necessary parameters to
     *           execute the StopStack service method on AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void stopStack(StopStackRequest stopStackRequest) 
            throws AmazonServiceException, AmazonClientException {
                                     
        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext();
        
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<StopStackRequest> request = new StopStackRequestMarshaller().marshall(stopStackRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
        invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Deploys a stack or app.
     * </p>
     * 
     * <ul>
     * <li>App deployment generates a <code>deploy</code> event, which runs
     * the associated recipes and passes them a JSON stack configuration
     * object that includes information about the app. </li>
     * <li>Stack deployment runs the <code>deploy</code> recipes but does
     * not raise an event.</li>
     * 
     * </ul>
     *
     * @param createDeploymentRequest Container for the necessary parameters
     *           to execute the CreateDeployment service method on AWSOpsWorks.
     * 
     * @return The response from the CreateDeployment service method, as
     *         returned by AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateDeploymentResult createDeployment(CreateDeploymentRequest createDeploymentRequest) 
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext();
        
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<CreateDeploymentRequest> request = new CreateDeploymentRequestMarshaller().marshall(createDeploymentRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        Unmarshaller<CreateDeploymentResult, JsonUnmarshallerContext> unmarshaller = new CreateDeploymentResultJsonUnmarshaller();
        
        JsonResponseHandler<CreateDeploymentResult> responseHandler = new JsonResponseHandler<CreateDeploymentResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
    }
    
    /**
     * Overrides the default endpoint for this client ("https://opsworks.us-east-1.amazonaws.com") and explicitly provides
     * an AWS region ID and AWS service name to use when the client calculates a signature
     * for requests.  In almost all cases, this region ID and service name
     * are automatically determined from the endpoint, and callers should use the simpler
     * one-argument form of setEndpoint instead of this method.
     * <p>
     * <b>This method is not threadsafe. Endpoints should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit.</b>
     * <p>
     * Callers can pass in just the endpoint (ex: "opsworks.us-east-1.amazonaws.com") or a full
     * URL, including the protocol (ex: "https://opsworks.us-east-1.amazonaws.com"). If the
     * protocol is not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see:
     * <a href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     *
     * @param endpoint
     *            The endpoint (ex: "opsworks.us-east-1.amazonaws.com") or a full URL,
     *            including the protocol (ex: "https://opsworks.us-east-1.amazonaws.com") of
     *            the region specific AWS endpoint this client will communicate
     *            with.
     * @param serviceName
     *            The name of the AWS service to use when signing requests.
     * @param regionId
     *            The ID of the region in which this service resides.
     *
     * @throws IllegalArgumentException
     *             If any problems are detected with the specified endpoint.
     * @see AmazonDynamoDB#setRegion(Region)     
     */
    public void setEndpoint(String endpoint, String serviceName, String regionId) throws IllegalArgumentException {
        setEndpoint(endpoint);
        signer.setServiceName(serviceName);
        signer.setRegionName(regionId);
    }
    
    @Override
    protected String getServiceAbbreviation() {
        return "opsworks";
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

    private <X, Y extends AmazonWebServiceRequest> X invoke(Request<Y> request,
                                                                HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
                                                                ExecutionContext executionContext) throws AmazonClientException {

        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);

        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();

        awsRequestMetrics.startEvent(Field.CredentialsRequestTime.name());
        AWSCredentials credentials = awsCredentialsProvider.getCredentials();
        awsRequestMetrics.endEvent(Field.CredentialsRequestTime.name());

        AmazonWebServiceRequest originalRequest = request.getOriginalRequest();
        if (originalRequest != null && originalRequest.getRequestCredentials() != null) {
            credentials = originalRequest.getRequestCredentials();
        }

        executionContext.setSigner(signer);
        executionContext.setCredentials(credentials);

        
        JsonErrorResponseHandler errorResponseHandler = new JsonErrorResponseHandler(exceptionUnmarshallers);

        awsRequestMetrics.startEvent(Field.ClientExecuteTime.name());
        X result = (X) client.execute(request, responseHandler, errorResponseHandler, executionContext);
        awsRequestMetrics.endEvent(Field.ClientExecuteTime.name());

        awsRequestMetrics.log();

        return result;
    }
}
        