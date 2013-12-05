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
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.util.AWSRequestMetrics.Field;
import com.amazonaws.util.json.*;

import com.amazonaws.services.opsworks.model.*;
import com.amazonaws.services.opsworks.model.transform.*;


/**
 * Client for accessing AWSOpsWorks.  All service calls made
 * using this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * AWS OpsWorks <p>
 * Welcome to the <i>AWS OpsWorks API Reference</i> . This guide provides descriptions, syntax, and usage examples about AWS OpsWorks actions and data
 * types, including common parameters and error codes.
 * </p>
 * <p>
 * AWS OpsWorks is an application management service that provides an integrated experience for overseeing the complete application lifecycle. For
 * information about this product, go to the <a href="http://aws.amazon.com/opsworks/"> AWS OpsWorks </a> details page.
 * </p>
 * <p>
 * <b>Endpoints</b>
 * </p>
 * <p>
 * AWS OpsWorks supports only one endpoint, opsworks.us-east-1.amazonaws.com (HTTPS), so you must connect to that endpoint. You can then use the API to
 * direct AWS OpsWorks to create stacks in any AWS Region.
 * </p>
 * <p>
 * <b>Chef Version</b>
 * </p>
 * <p>
 * When you call CreateStack, CloneStack, or UpdateStack we recommend you use the <code>ConfigurationManager</code> parameter to specify the Chef
 * version, 0.9 or 11.4. The default value is currently 0.9. However, we expect to change the default value to 11.4 in September 2013.
 * </p>
 */
public class AWSOpsWorksClient extends AmazonWebServiceClient implements AWSOpsWorks {

    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSOpsWorks.class);

    /**
     * List of exception unmarshallers for all AWSOpsWorks exceptions.
     */
    protected List<Unmarshaller<AmazonServiceException, JSONObject>> exceptionUnmarshallers;

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
     * @see DefaultAWSCredentialsProviderChain
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
     * @see DefaultAWSCredentialsProviderChain
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
        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("opsworks.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/opsworks/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/opsworks/request.handler2s"));

        
    }

    
    /**
     * <p>
     * Deregisters an Amazon EBS volume. The volume can then be registered by
     * another stack. For more information, see <a
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html">
     * </a> .
     * </p>
     *
     * @param deregisterVolumeRequest Container for the necessary parameters
     *           to execute the DeregisterVolume service method on AWSOpsWorks.
     * 
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
    public void deregisterVolume(DeregisterVolumeRequest deregisterVolumeRequest) {
        ExecutionContext executionContext = createExecutionContext(deregisterVolumeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeregisterVolumeRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new DeregisterVolumeRequestMarshaller().marshall(deregisterVolumeRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }
        JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
        invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Specifies a stack's permissions. For more information, see <a
     * //docs.aws.amazon.com/opsworks/latest/userguide/workingsecurity.html">
     * Security and Permissions </a> .
     * </p>
     *
     * @param setPermissionRequest Container for the necessary parameters to
     *           execute the SetPermission service method on AWSOpsWorks.
     * 
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
    public void setPermission(SetPermissionRequest setPermissionRequest) {
        ExecutionContext executionContext = createExecutionContext(setPermissionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<SetPermissionRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new SetPermissionRequestMarshaller().marshall(setPermissionRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }
        JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
        invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Requests a description of a set of instances.
     * </p>
     * <p>
     * <b>NOTE:</b>You must specify at least one of the parameters.
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
    public DescribeInstancesResult describeInstances(DescribeInstancesRequest describeInstancesRequest) {
        ExecutionContext executionContext = createExecutionContext(describeInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeInstancesRequest> request = null;
        Response<DescribeInstancesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeInstancesRequestMarshaller().marshall(describeInstancesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeInstancesResult, JsonUnmarshallerContext> unmarshaller = new DescribeInstancesResultJsonUnmarshaller();
            JsonResponseHandler<DescribeInstancesResult> responseHandler = new JsonResponseHandler<DescribeInstancesResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

   
    /**
     * <p>
     * Describes the permissions for a specified stack.
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
    public DescribePermissionsResult describePermissions(DescribePermissionsRequest describePermissionsRequest) {
        ExecutionContext executionContext = createExecutionContext(describePermissionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribePermissionsRequest> request = null;
        Response<DescribePermissionsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribePermissionsRequestMarshaller().marshall(describePermissionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribePermissionsResult, JsonUnmarshallerContext> unmarshaller = new DescribePermissionsResultJsonUnmarshaller();
            JsonResponseHandler<DescribePermissionsResult> responseHandler = new JsonResponseHandler<DescribePermissionsResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

   
    /**
     * <p>
     * Deletes a specified instance. You must stop an instance before you can
     * delete it. For more information, see <a
     * ws.amazon.com/opsworks/latest/userguide/workinginstances-delete.html">
     * Deleting Instances </a> .
     * </p>
     *
     * @param deleteInstanceRequest Container for the necessary parameters to
     *           execute the DeleteInstance service method on AWSOpsWorks.
     * 
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
    public void deleteInstance(DeleteInstanceRequest deleteInstanceRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeleteInstanceRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new DeleteInstanceRequestMarshaller().marshall(deleteInstanceRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }
        JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
        invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Creates a clone of a specified stack. For more information, see <a
     * .aws.amazon.com/opsworks/latest/userguide/workingstacks-cloning.html">
     * Clone a Stack </a> .
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
    public CloneStackResult cloneStack(CloneStackRequest cloneStackRequest) {
        ExecutionContext executionContext = createExecutionContext(cloneStackRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CloneStackRequest> request = null;
        Response<CloneStackResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CloneStackRequestMarshaller().marshall(cloneStackRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CloneStackResult, JsonUnmarshallerContext> unmarshaller = new CloneStackResultJsonUnmarshaller();
            JsonResponseHandler<CloneStackResult> responseHandler = new JsonResponseHandler<CloneStackResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

   
    /**
     * <p>
     * Detaches a specified Elastic Load Balancing instance from its layer.
     * </p>
     *
     * @param detachElasticLoadBalancerRequest Container for the necessary
     *           parameters to execute the DetachElasticLoadBalancer service method on
     *           AWSOpsWorks.
     * 
     * 
     * @throws ResourceNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void detachElasticLoadBalancer(DetachElasticLoadBalancerRequest detachElasticLoadBalancerRequest) {
        ExecutionContext executionContext = createExecutionContext(detachElasticLoadBalancerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DetachElasticLoadBalancerRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new DetachElasticLoadBalancerRequestMarshaller().marshall(detachElasticLoadBalancerRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }
        JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
        invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Stops a specified instance. When you stop a standard instance, the
     * data disappears and must be reinstalled when you restart the instance.
     * You can stop an Amazon EBS-backed instance without losing data. For
     * more information, see <a
     * .amazon.com/opsworks/latest/userguide/workinginstances-starting.html">
     * Starting, Stopping, and Rebooting Instances </a> .
     * </p>
     *
     * @param stopInstanceRequest Container for the necessary parameters to
     *           execute the StopInstance service method on AWSOpsWorks.
     * 
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
    public void stopInstance(StopInstanceRequest stopInstanceRequest) {
        ExecutionContext executionContext = createExecutionContext(stopInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<StopInstanceRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new StopInstanceRequestMarshaller().marshall(stopInstanceRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }
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
    public void updateApp(UpdateAppRequest updateAppRequest) {
        ExecutionContext executionContext = createExecutionContext(updateAppRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<UpdateAppRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new UpdateAppRequestMarshaller().marshall(updateAppRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }
        JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
        invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Describes the results of specified commands.
     * </p>
     * <p>
     * <b>NOTE:</b>You must specify at least one of the parameters.
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
    public DescribeCommandsResult describeCommands(DescribeCommandsRequest describeCommandsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeCommandsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCommandsRequest> request = null;
        Response<DescribeCommandsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCommandsRequestMarshaller().marshall(describeCommandsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeCommandsResult, JsonUnmarshallerContext> unmarshaller = new DescribeCommandsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeCommandsResult> responseHandler = new JsonResponseHandler<DescribeCommandsResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

   
    /**
     * <p>
     * Associates one of the stack's registered Elastic IP addresses with a
     * specified instance. The address must first be registered with the
     * stack by calling RegisterElasticIp. For more information, see <a
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html">
     * </a> .
     * </p>
     *
     * @param associateElasticIpRequest Container for the necessary
     *           parameters to execute the AssociateElasticIp service method on
     *           AWSOpsWorks.
     * 
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
    public void associateElasticIp(AssociateElasticIpRequest associateElasticIpRequest) {
        ExecutionContext executionContext = createExecutionContext(associateElasticIpRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<AssociateElasticIpRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new AssociateElasticIpRequestMarshaller().marshall(associateElasticIpRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }
        JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
        invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Unassigns an assigned Amazon EBS volume. The volume remains registered
     * with the stack. For more information, see <a
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html">
     * </a> .
     * </p>
     *
     * @param unassignVolumeRequest Container for the necessary parameters to
     *           execute the UnassignVolume service method on AWSOpsWorks.
     * 
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
    public void unassignVolume(UnassignVolumeRequest unassignVolumeRequest) {
        ExecutionContext executionContext = createExecutionContext(unassignVolumeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<UnassignVolumeRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new UnassignVolumeRequestMarshaller().marshall(unassignVolumeRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }
        JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
        invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Describe an instance's RAID arrays.
     * </p>
     * <p>
     * <b>NOTE:</b>You must specify at least one of the parameters.
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
    public DescribeRaidArraysResult describeRaidArrays(DescribeRaidArraysRequest describeRaidArraysRequest) {
        ExecutionContext executionContext = createExecutionContext(describeRaidArraysRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeRaidArraysRequest> request = null;
        Response<DescribeRaidArraysResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeRaidArraysRequestMarshaller().marshall(describeRaidArraysRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeRaidArraysResult, JsonUnmarshallerContext> unmarshaller = new DescribeRaidArraysResultJsonUnmarshaller();
            JsonResponseHandler<DescribeRaidArraysResult> responseHandler = new JsonResponseHandler<DescribeRaidArraysResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

   
    /**
     * <p>
     * Gets a generated host name for the specified layer, based on the
     * current host name theme.
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
    public GetHostnameSuggestionResult getHostnameSuggestion(GetHostnameSuggestionRequest getHostnameSuggestionRequest) {
        ExecutionContext executionContext = createExecutionContext(getHostnameSuggestionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetHostnameSuggestionRequest> request = null;
        Response<GetHostnameSuggestionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetHostnameSuggestionRequestMarshaller().marshall(getHostnameSuggestionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetHostnameSuggestionResult, JsonUnmarshallerContext> unmarshaller = new GetHostnameSuggestionResultJsonUnmarshaller();
            JsonResponseHandler<GetHostnameSuggestionResult> responseHandler = new JsonResponseHandler<GetHostnameSuggestionResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

   
    /**
     * <p>
     * Specify the load-based auto scaling configuration for a specified
     * layer. For more information, see <a
     * azon.com/opsworks/latest/userguide/workinginstances-autoscaling.html">
     * Managing Load with Time-based and Load-based Instances </a> .
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
    public void setLoadBasedAutoScaling(SetLoadBasedAutoScalingRequest setLoadBasedAutoScalingRequest) {
        ExecutionContext executionContext = createExecutionContext(setLoadBasedAutoScalingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<SetLoadBasedAutoScalingRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new SetLoadBasedAutoScalingRequestMarshaller().marshall(setLoadBasedAutoScalingRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }
        JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
        invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Describes an instance's Amazon EBS volumes.
     * </p>
     * <p>
     * <b>NOTE:</b>You must specify at least one of the parameters.
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
    public DescribeVolumesResult describeVolumes(DescribeVolumesRequest describeVolumesRequest) {
        ExecutionContext executionContext = createExecutionContext(describeVolumesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeVolumesRequest> request = null;
        Response<DescribeVolumesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeVolumesRequestMarshaller().marshall(describeVolumesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeVolumesResult, JsonUnmarshallerContext> unmarshaller = new DescribeVolumesResultJsonUnmarshaller();
            JsonResponseHandler<DescribeVolumesResult> responseHandler = new JsonResponseHandler<DescribeVolumesResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

   
    /**
     * <p>
     * Assigns one of the stack's registered Amazon EBS volumes to a
     * specified instance. The volume must first be registered with the stack
     * by calling RegisterVolume. For more information, see <a
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html">
     * </a> .
     * </p>
     *
     * @param assignVolumeRequest Container for the necessary parameters to
     *           execute the AssignVolume service method on AWSOpsWorks.
     * 
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
    public void assignVolume(AssignVolumeRequest assignVolumeRequest) {
        ExecutionContext executionContext = createExecutionContext(assignVolumeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<AssignVolumeRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new AssignVolumeRequestMarshaller().marshall(assignVolumeRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }
        JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
        invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Describes AWS OpsWorks service errors.
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
    public DescribeServiceErrorsResult describeServiceErrors(DescribeServiceErrorsRequest describeServiceErrorsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeServiceErrorsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeServiceErrorsRequest> request = null;
        Response<DescribeServiceErrorsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeServiceErrorsRequestMarshaller().marshall(describeServiceErrorsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeServiceErrorsResult, JsonUnmarshallerContext> unmarshaller = new DescribeServiceErrorsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeServiceErrorsResult> responseHandler = new JsonResponseHandler<DescribeServiceErrorsResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

   
    /**
     * <p>
     * Updates a specified layer.
     * </p>
     *
     * @param updateLayerRequest Container for the necessary parameters to
     *           execute the UpdateLayer service method on AWSOpsWorks.
     * 
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
    public void updateLayer(UpdateLayerRequest updateLayerRequest) {
        ExecutionContext executionContext = createExecutionContext(updateLayerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<UpdateLayerRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new UpdateLayerRequestMarshaller().marshall(updateLayerRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }
        JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
        invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Updates a registered Elastic IP address's name. For more information,
     * see <a
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html">
     * </a> .
     * </p>
     *
     * @param updateElasticIpRequest Container for the necessary parameters
     *           to execute the UpdateElasticIp service method on AWSOpsWorks.
     * 
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
    public void updateElasticIp(UpdateElasticIpRequest updateElasticIpRequest) {
        ExecutionContext executionContext = createExecutionContext(updateElasticIpRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<UpdateElasticIpRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new UpdateElasticIpRequestMarshaller().marshall(updateElasticIpRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }
        JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
        invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Starts a specified instance. For more information, see <a
     * .amazon.com/opsworks/latest/userguide/workinginstances-starting.html">
     * Starting, Stopping, and Rebooting Instances </a> .
     * </p>
     *
     * @param startInstanceRequest Container for the necessary parameters to
     *           execute the StartInstance service method on AWSOpsWorks.
     * 
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
    public void startInstance(StartInstanceRequest startInstanceRequest) {
        ExecutionContext executionContext = createExecutionContext(startInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<StartInstanceRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new StartInstanceRequestMarshaller().marshall(startInstanceRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }
        JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
        invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Creates a layer. For more information, see <a
     * mazon.com/opsworks/latest/userguide/workinglayers-basics-create.html">
     * How to Create a Layer </a> .
     * </p>
     * <p>
     * <b>NOTE:</b>You should use CreateLayer for noncustom layer types such
     * as PHP App Server only if the stack does not have an existing layer of
     * that type. A stack can have at most one instance of each noncustom
     * layer; if you attempt to create a second instance, CreateLayer fails.
     * A stack can have an arbitrary number of custom layers, so you can call
     * CreateLayer as many times as you like for that layer type.
     * </p>
     *
     * @param createLayerRequest Container for the necessary parameters to
     *           execute the CreateLayer service method on AWSOpsWorks.
     * 
     * @return The response from the CreateLayer service method, as returned
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
    public CreateLayerResult createLayer(CreateLayerRequest createLayerRequest) {
        ExecutionContext executionContext = createExecutionContext(createLayerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateLayerRequest> request = null;
        Response<CreateLayerResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateLayerRequestMarshaller().marshall(createLayerRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateLayerResult, JsonUnmarshallerContext> unmarshaller = new CreateLayerResultJsonUnmarshaller();
            JsonResponseHandler<CreateLayerResult> responseHandler = new JsonResponseHandler<CreateLayerResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

   
    /**
     * <p>
     * Disassociates an Elastic IP address from its instance. The address
     * remains registered with the stack. For more information, see <a
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html">
     * </a> .
     * </p>
     *
     * @param disassociateElasticIpRequest Container for the necessary
     *           parameters to execute the DisassociateElasticIp service method on
     *           AWSOpsWorks.
     * 
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
    public void disassociateElasticIp(DisassociateElasticIpRequest disassociateElasticIpRequest) {
        ExecutionContext executionContext = createExecutionContext(disassociateElasticIpRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DisassociateElasticIpRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new DisassociateElasticIpRequestMarshaller().marshall(disassociateElasticIpRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }
        JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
        invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Deletes a specified stack. You must first delete all instances,
     * layers, and apps. For more information, see <a
     * aws.amazon.com/opsworks/latest/userguide/workingstacks-shutting.html">
     * Shut Down a Stack </a> .
     * </p>
     *
     * @param deleteStackRequest Container for the necessary parameters to
     *           execute the DeleteStack service method on AWSOpsWorks.
     * 
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
    public void deleteStack(DeleteStackRequest deleteStackRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteStackRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeleteStackRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new DeleteStackRequestMarshaller().marshall(deleteStackRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }
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
    public void startStack(StartStackRequest startStackRequest) {
        ExecutionContext executionContext = createExecutionContext(startStackRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<StartStackRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new StartStackRequestMarshaller().marshall(startStackRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }
        JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
        invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Registers an Amazon EBS volume with a specified stack. A volume can be
     * registered with only one stack at a time. If the volume is already
     * registered, you must first deregister it by calling DeregisterVolume.
     * For more information, see <a
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html">
     * </a> .
     * </p>
     *
     * @param registerVolumeRequest Container for the necessary parameters to
     *           execute the RegisterVolume service method on AWSOpsWorks.
     * 
     * @return The response from the RegisterVolume service method, as
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
    public RegisterVolumeResult registerVolume(RegisterVolumeRequest registerVolumeRequest) {
        ExecutionContext executionContext = createExecutionContext(registerVolumeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterVolumeRequest> request = null;
        Response<RegisterVolumeResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterVolumeRequestMarshaller().marshall(registerVolumeRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<RegisterVolumeResult, JsonUnmarshallerContext> unmarshaller = new RegisterVolumeResultJsonUnmarshaller();
            JsonResponseHandler<RegisterVolumeResult> responseHandler = new JsonResponseHandler<RegisterVolumeResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

   
    /**
     * <p>
     * Updates a specified user profile.
     * </p>
     *
     * @param updateUserProfileRequest Container for the necessary parameters
     *           to execute the UpdateUserProfile service method on AWSOpsWorks.
     * 
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
    public void updateUserProfile(UpdateUserProfileRequest updateUserProfileRequest) {
        ExecutionContext executionContext = createExecutionContext(updateUserProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<UpdateUserProfileRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new UpdateUserProfileRequestMarshaller().marshall(updateUserProfileRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }
        JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
        invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Creates a new stack. For more information, see <a
     * ocs.aws.amazon.com/opsworks/latest/userguide/workingstacks-edit.html">
     * Create a New Stack </a> .
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
    public CreateStackResult createStack(CreateStackRequest createStackRequest) {
        ExecutionContext executionContext = createExecutionContext(createStackRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateStackRequest> request = null;
        Response<CreateStackResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateStackRequestMarshaller().marshall(createStackRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateStackResult, JsonUnmarshallerContext> unmarshaller = new CreateStackResultJsonUnmarshaller();
            JsonResponseHandler<CreateStackResult> responseHandler = new JsonResponseHandler<CreateStackResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

   
    /**
     * <p>
     * Reboots a specified instance. For more information, see <a
     * .amazon.com/opsworks/latest/userguide/workinginstances-starting.html">
     * Starting, Stopping, and Rebooting Instances </a> .
     * </p>
     *
     * @param rebootInstanceRequest Container for the necessary parameters to
     *           execute the RebootInstance service method on AWSOpsWorks.
     * 
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
    public void rebootInstance(RebootInstanceRequest rebootInstanceRequest) {
        ExecutionContext executionContext = createExecutionContext(rebootInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<RebootInstanceRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new RebootInstanceRequestMarshaller().marshall(rebootInstanceRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }
        JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
        invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Creates an instance in a specified stack. For more information, see <a
     * s.aws.amazon.com/opsworks/latest/userguide/workinginstances-add.html">
     * Adding an Instance to a Layer </a> .
     * </p>
     *
     * @param createInstanceRequest Container for the necessary parameters to
     *           execute the CreateInstance service method on AWSOpsWorks.
     * 
     * @return The response from the CreateInstance service method, as
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
    public CreateInstanceResult createInstance(CreateInstanceRequest createInstanceRequest) {
        ExecutionContext executionContext = createExecutionContext(createInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateInstanceRequest> request = null;
        Response<CreateInstanceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateInstanceRequestMarshaller().marshall(createInstanceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateInstanceResult, JsonUnmarshallerContext> unmarshaller = new CreateInstanceResultJsonUnmarshaller();
            JsonResponseHandler<CreateInstanceResult> responseHandler = new JsonResponseHandler<CreateInstanceResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

   
    /**
     * <p>
     * Deletes a specified app.
     * </p>
     *
     * @param deleteAppRequest Container for the necessary parameters to
     *           execute the DeleteApp service method on AWSOpsWorks.
     * 
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
    public void deleteApp(DeleteAppRequest deleteAppRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteAppRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeleteAppRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new DeleteAppRequestMarshaller().marshall(deleteAppRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }
        JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
        invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Deregisters a specified Elastic IP address. The address can then be
     * registered by another stack. For more information, see <a
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html">
     * </a> .
     * </p>
     *
     * @param deregisterElasticIpRequest Container for the necessary
     *           parameters to execute the DeregisterElasticIp service method on
     *           AWSOpsWorks.
     * 
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
    public void deregisterElasticIp(DeregisterElasticIpRequest deregisterElasticIpRequest) {
        ExecutionContext executionContext = createExecutionContext(deregisterElasticIpRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeregisterElasticIpRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new DeregisterElasticIpRequestMarshaller().marshall(deregisterElasticIpRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }
        JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
        invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Attaches an Elastic Load Balancing load balancer to a specified layer.
     * </p>
     * <p>
     * <b>NOTE:</b>You must create the Elastic Load Balancing instance
     * separately, by using the Elastic Load Balancing console, API, or CLI.
     * For more information, see Elastic Load Balancing Developer Guide.
     * </p>
     *
     * @param attachElasticLoadBalancerRequest Container for the necessary
     *           parameters to execute the AttachElasticLoadBalancer service method on
     *           AWSOpsWorks.
     * 
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
    public void attachElasticLoadBalancer(AttachElasticLoadBalancerRequest attachElasticLoadBalancerRequest) {
        ExecutionContext executionContext = createExecutionContext(attachElasticLoadBalancerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<AttachElasticLoadBalancerRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new AttachElasticLoadBalancerRequestMarshaller().marshall(attachElasticLoadBalancerRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }
        JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
        invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Updates a specified stack.
     * </p>
     *
     * @param updateStackRequest Container for the necessary parameters to
     *           execute the UpdateStack service method on AWSOpsWorks.
     * 
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
    public void updateStack(UpdateStackRequest updateStackRequest) {
        ExecutionContext executionContext = createExecutionContext(updateStackRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<UpdateStackRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new UpdateStackRequestMarshaller().marshall(updateStackRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }
        JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
        invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Creates a new user profile.
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
    public CreateUserProfileResult createUserProfile(CreateUserProfileRequest createUserProfileRequest) {
        ExecutionContext executionContext = createExecutionContext(createUserProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateUserProfileRequest> request = null;
        Response<CreateUserProfileResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateUserProfileRequestMarshaller().marshall(createUserProfileRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateUserProfileResult, JsonUnmarshallerContext> unmarshaller = new CreateUserProfileResultJsonUnmarshaller();
            JsonResponseHandler<CreateUserProfileResult> responseHandler = new JsonResponseHandler<CreateUserProfileResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

   
    /**
     * <p>
     * Requests a description of one or more layers in a specified stack.
     * </p>
     * <p>
     * <b>NOTE:</b>You must specify at least one of the parameters.
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
    public DescribeLayersResult describeLayers(DescribeLayersRequest describeLayersRequest) {
        ExecutionContext executionContext = createExecutionContext(describeLayersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeLayersRequest> request = null;
        Response<DescribeLayersResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeLayersRequestMarshaller().marshall(describeLayersRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeLayersResult, JsonUnmarshallerContext> unmarshaller = new DescribeLayersResultJsonUnmarshaller();
            JsonResponseHandler<DescribeLayersResult> responseHandler = new JsonResponseHandler<DescribeLayersResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

   
    /**
     * <p>
     * Describes load-based auto scaling configurations for specified layers.
     * </p>
     * <p>
     * <b>NOTE:</b>You must specify at least one of the parameters.
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
    public DescribeLoadBasedAutoScalingResult describeLoadBasedAutoScaling(DescribeLoadBasedAutoScalingRequest describeLoadBasedAutoScalingRequest) {
        ExecutionContext executionContext = createExecutionContext(describeLoadBasedAutoScalingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeLoadBasedAutoScalingRequest> request = null;
        Response<DescribeLoadBasedAutoScalingResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeLoadBasedAutoScalingRequestMarshaller().marshall(describeLoadBasedAutoScalingRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeLoadBasedAutoScalingResult, JsonUnmarshallerContext> unmarshaller = new DescribeLoadBasedAutoScalingResultJsonUnmarshaller();
            JsonResponseHandler<DescribeLoadBasedAutoScalingResult> responseHandler = new JsonResponseHandler<DescribeLoadBasedAutoScalingResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

   
    /**
     * <p>
     * Describes a stack's Elastic Load Balancing instances.
     * </p>
     * <p>
     * <b>NOTE:</b>You must specify at least one of the parameters.
     * </p>
     *
     * @param describeElasticLoadBalancersRequest Container for the necessary
     *           parameters to execute the DescribeElasticLoadBalancers service method
     *           on AWSOpsWorks.
     * 
     * @return The response from the DescribeElasticLoadBalancers service
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
    public DescribeElasticLoadBalancersResult describeElasticLoadBalancers(DescribeElasticLoadBalancersRequest describeElasticLoadBalancersRequest) {
        ExecutionContext executionContext = createExecutionContext(describeElasticLoadBalancersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeElasticLoadBalancersRequest> request = null;
        Response<DescribeElasticLoadBalancersResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeElasticLoadBalancersRequestMarshaller().marshall(describeElasticLoadBalancersRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeElasticLoadBalancersResult, JsonUnmarshallerContext> unmarshaller = new DescribeElasticLoadBalancersResultJsonUnmarshaller();
            JsonResponseHandler<DescribeElasticLoadBalancersResult> responseHandler = new JsonResponseHandler<DescribeElasticLoadBalancersResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

   
    /**
     * <p>
     * Deletes a specified layer. You must first stop and then delete all
     * associated instances. For more information, see <a
     * mazon.com/opsworks/latest/userguide/workinglayers-basics-delete.html">
     * How to Delete a Layer </a> .
     * </p>
     *
     * @param deleteLayerRequest Container for the necessary parameters to
     *           execute the DeleteLayer service method on AWSOpsWorks.
     * 
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
    public void deleteLayer(DeleteLayerRequest deleteLayerRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteLayerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeleteLayerRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new DeleteLayerRequestMarshaller().marshall(deleteLayerRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }
        JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
        invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Specify the time-based auto scaling configuration for a specified
     * instance. For more information, see <a
     * azon.com/opsworks/latest/userguide/workinginstances-autoscaling.html">
     * Managing Load with Time-based and Load-based Instances </a> .
     * </p>
     *
     * @param setTimeBasedAutoScalingRequest Container for the necessary
     *           parameters to execute the SetTimeBasedAutoScaling service method on
     *           AWSOpsWorks.
     * 
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
    public void setTimeBasedAutoScaling(SetTimeBasedAutoScalingRequest setTimeBasedAutoScalingRequest) {
        ExecutionContext executionContext = createExecutionContext(setTimeBasedAutoScalingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<SetTimeBasedAutoScalingRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new SetTimeBasedAutoScalingRequestMarshaller().marshall(setTimeBasedAutoScalingRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }
        JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
        invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Creates an app for a specified stack. For more information, see <a
     * s.aws.amazon.com/opsworks/latest/userguide/workingapps-creating.html">
     * Creating Apps </a> .
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
    public CreateAppResult createApp(CreateAppRequest createAppRequest) {
        ExecutionContext executionContext = createExecutionContext(createAppRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAppRequest> request = null;
        Response<CreateAppResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAppRequestMarshaller().marshall(createAppRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateAppResult, JsonUnmarshallerContext> unmarshaller = new CreateAppResultJsonUnmarshaller();
            JsonResponseHandler<CreateAppResult> responseHandler = new JsonResponseHandler<CreateAppResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

   
    /**
     * <p>
     * Deletes a user profile.
     * </p>
     *
     * @param deleteUserProfileRequest Container for the necessary parameters
     *           to execute the DeleteUserProfile service method on AWSOpsWorks.
     * 
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
    public void deleteUserProfile(DeleteUserProfileRequest deleteUserProfileRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteUserProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeleteUserProfileRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new DeleteUserProfileRequestMarshaller().marshall(deleteUserProfileRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }
        JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
        invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Describes time-based auto scaling configurations for specified
     * instances.
     * </p>
     * <p>
     * <b>NOTE:</b>You must specify at least one of the parameters.
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
    public DescribeTimeBasedAutoScalingResult describeTimeBasedAutoScaling(DescribeTimeBasedAutoScalingRequest describeTimeBasedAutoScalingRequest) {
        ExecutionContext executionContext = createExecutionContext(describeTimeBasedAutoScalingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTimeBasedAutoScalingRequest> request = null;
        Response<DescribeTimeBasedAutoScalingResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTimeBasedAutoScalingRequestMarshaller().marshall(describeTimeBasedAutoScalingRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeTimeBasedAutoScalingResult, JsonUnmarshallerContext> unmarshaller = new DescribeTimeBasedAutoScalingResultJsonUnmarshaller();
            JsonResponseHandler<DescribeTimeBasedAutoScalingResult> responseHandler = new JsonResponseHandler<DescribeTimeBasedAutoScalingResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

   
    /**
     * <p>
     * Updates an Amazon EBS volume's name or mount point. For more
     * information, see <a
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html">
     * </a> .
     * </p>
     *
     * @param updateVolumeRequest Container for the necessary parameters to
     *           execute the UpdateVolume service method on AWSOpsWorks.
     * 
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
    public void updateVolume(UpdateVolumeRequest updateVolumeRequest) {
        ExecutionContext executionContext = createExecutionContext(updateVolumeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<UpdateVolumeRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new UpdateVolumeRequestMarshaller().marshall(updateVolumeRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }
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
    public DescribeUserProfilesResult describeUserProfiles(DescribeUserProfilesRequest describeUserProfilesRequest) {
        ExecutionContext executionContext = createExecutionContext(describeUserProfilesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeUserProfilesRequest> request = null;
        Response<DescribeUserProfilesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeUserProfilesRequestMarshaller().marshall(describeUserProfilesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeUserProfilesResult, JsonUnmarshallerContext> unmarshaller = new DescribeUserProfilesResultJsonUnmarshaller();
            JsonResponseHandler<DescribeUserProfilesResult> responseHandler = new JsonResponseHandler<DescribeUserProfilesResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

   
    /**
     * <p>
     * Updates a specified instance.
     * </p>
     *
     * @param updateInstanceRequest Container for the necessary parameters to
     *           execute the UpdateInstance service method on AWSOpsWorks.
     * 
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
    public void updateInstance(UpdateInstanceRequest updateInstanceRequest) {
        ExecutionContext executionContext = createExecutionContext(updateInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<UpdateInstanceRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new UpdateInstanceRequestMarshaller().marshall(updateInstanceRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }
        JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
        invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Requests a description of a specified set of deployments.
     * </p>
     * <p>
     * <b>NOTE:</b>You must specify at least one of the parameters.
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
    public DescribeDeploymentsResult describeDeployments(DescribeDeploymentsRequest describeDeploymentsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeDeploymentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDeploymentsRequest> request = null;
        Response<DescribeDeploymentsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDeploymentsRequestMarshaller().marshall(describeDeploymentsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeDeploymentsResult, JsonUnmarshallerContext> unmarshaller = new DescribeDeploymentsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeDeploymentsResult> responseHandler = new JsonResponseHandler<DescribeDeploymentsResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

   
    /**
     * <p>
     * Registers an Elastic IP address with a specified stack. An address can
     * be registered with only one stack at a time. If the address is already
     * registered, you must first deregister it by calling
     * DeregisterElasticIp. For more information, see <a
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html">
     * </a> .
     * </p>
     *
     * @param registerElasticIpRequest Container for the necessary parameters
     *           to execute the RegisterElasticIp service method on AWSOpsWorks.
     * 
     * @return The response from the RegisterElasticIp service method, as
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
    public RegisterElasticIpResult registerElasticIp(RegisterElasticIpRequest registerElasticIpRequest) {
        ExecutionContext executionContext = createExecutionContext(registerElasticIpRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterElasticIpRequest> request = null;
        Response<RegisterElasticIpResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterElasticIpRequestMarshaller().marshall(registerElasticIpRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<RegisterElasticIpResult, JsonUnmarshallerContext> unmarshaller = new RegisterElasticIpResultJsonUnmarshaller();
            JsonResponseHandler<RegisterElasticIpResult> responseHandler = new JsonResponseHandler<RegisterElasticIpResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

   
    /**
     * <p>
     * Describes <a
     * aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html">
     * Elastic IP addresses </a> .
     * </p>
     * <p>
     * <b>NOTE:</b>You must specify at least one of the parameters.
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
    public DescribeElasticIpsResult describeElasticIps(DescribeElasticIpsRequest describeElasticIpsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeElasticIpsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeElasticIpsRequest> request = null;
        Response<DescribeElasticIpsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeElasticIpsRequestMarshaller().marshall(describeElasticIpsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeElasticIpsResult, JsonUnmarshallerContext> unmarshaller = new DescribeElasticIpsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeElasticIpsResult> responseHandler = new JsonResponseHandler<DescribeElasticIpsResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
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
    public DescribeStacksResult describeStacks(DescribeStacksRequest describeStacksRequest) {
        ExecutionContext executionContext = createExecutionContext(describeStacksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeStacksRequest> request = null;
        Response<DescribeStacksResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeStacksRequestMarshaller().marshall(describeStacksRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeStacksResult, JsonUnmarshallerContext> unmarshaller = new DescribeStacksResultJsonUnmarshaller();
            JsonResponseHandler<DescribeStacksResult> responseHandler = new JsonResponseHandler<DescribeStacksResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

   
    /**
     * <p>
     * Requests a description of a specified set of apps.
     * </p>
     * <p>
     * <b>NOTE:</b>You must specify at least one of the parameters.
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
    public DescribeAppsResult describeApps(DescribeAppsRequest describeAppsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeAppsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAppsRequest> request = null;
        Response<DescribeAppsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAppsRequestMarshaller().marshall(describeAppsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeAppsResult, JsonUnmarshallerContext> unmarshaller = new DescribeAppsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeAppsResult> responseHandler = new JsonResponseHandler<DescribeAppsResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

   
    /**
     * <p>
     * Stops a specified stack.
     * </p>
     *
     * @param stopStackRequest Container for the necessary parameters to
     *           execute the StopStack service method on AWSOpsWorks.
     * 
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
    public void stopStack(StopStackRequest stopStackRequest) {
        ExecutionContext executionContext = createExecutionContext(stopStackRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<StopStackRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new StopStackRequestMarshaller().marshall(stopStackRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }
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
     * <p>
     * For more information, see <a
     * .aws.amazon.com/opsworks/latest/userguide/workingapps-deploying.html">
     * Deploying Apps </a> and <a
     * aws.amazon.com/opsworks/latest/userguide/workingstacks-commands.html">
     * Run Stack Commands </a> .
     * </p>
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
    public CreateDeploymentResult createDeployment(CreateDeploymentRequest createDeploymentRequest) {
        ExecutionContext executionContext = createExecutionContext(createDeploymentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDeploymentRequest> request = null;
        Response<CreateDeploymentResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDeploymentRequestMarshaller().marshall(createDeploymentRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateDeploymentResult, JsonUnmarshallerContext> unmarshaller = new CreateDeploymentResultJsonUnmarshaller();
            JsonResponseHandler<CreateDeploymentResult> responseHandler = new JsonResponseHandler<CreateDeploymentResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
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

        executionContext.setSigner(getSigner());
        executionContext.setCredentials(credentials);

        JsonErrorResponseHandler errorResponseHandler = new JsonErrorResponseHandler(exceptionUnmarshallers);
        Response<X> result = client.execute(request, responseHandler,
                errorResponseHandler, executionContext);
        awsRequestMetrics.log();
        return result;
    }
}
        