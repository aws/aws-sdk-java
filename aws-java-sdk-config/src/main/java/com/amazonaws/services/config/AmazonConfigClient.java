/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.config;

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

import com.amazonaws.services.config.model.*;
import com.amazonaws.services.config.model.transform.*;

/**
 * Client for accessing AmazonConfig.  All service calls made
 * using this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * AWS Config <p>
 * AWS Config provides a way to keep track of the configurations of all
 * the AWS resources associated with your AWS account. You can use AWS
 * Config to get the current and historical configurations of each AWS
 * resource and also to get information about the relationship between
 * the resources. An AWS resource can be an Amazon Compute Cloud (Amazon
 * EC2) instance, an Elastic Block Store (EBS) volume, an Elastic network
 * Interface (ENI), or a security group. For a complete list of resources
 * currently supported by AWS Config, see
 * <a href="http://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources"> Supported AWS Resources </a>
 * .
 * </p>
 * <p>
 * You can access and manage AWS Config through the AWS Management
 * Console, the AWS Command Line Interface (AWS CLI), the AWS Config API,
 * or the AWS SDKs for AWS Config
 * </p>
 * <p>
 * This reference guide contains documentation for the AWS Config API and
 * the AWS CLI commands that you can use to manage AWS Config.
 * </p>
 * <p>
 * The AWS Config API uses the Signature Version 4 protocol for signing
 * requests. For more information about how to sign a request with this
 * protocol, see
 * <a href="http://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"> Signature Version 4 Signing Process </a>
 * .
 * </p>
 * <p>
 * For detailed information about AWS Config features and their
 * associated actions or commands, as well as how to work with AWS
 * Management Console, see
 * <a href="http://docs.aws.amazon.com/config/latest/developerguide/WhatIsConfig.html"> What Is AWS Config? </a>
 * in the <i>AWS Config Developer Guide</i> .
 * </p>
 */
public class AmazonConfigClient extends AmazonWebServiceClient implements AmazonConfig {

    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonConfig.class);

    /**
     * List of exception unmarshallers for all AmazonConfig exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on
     * AmazonConfig.  A credentials provider chain will be used
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
    public AmazonConfigClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonConfig.  A credentials provider chain will be used
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
     *                       client connects to AmazonConfig
     *                       (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonConfigClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonConfig using the specified AWS account credentials.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     */
    public AmazonConfigClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonConfig using the specified AWS account credentials
     * and client configuration options.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AmazonConfig
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AmazonConfigClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(adjustClientConfiguration(clientConfiguration));
        
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        
        init();
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonConfig using the specified AWS account credentials provider.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     */
    public AmazonConfigClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonConfig using the specified AWS account credentials
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
     *                       client connects to AmazonConfig
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AmazonConfigClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonConfig using the specified AWS account credentials
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
     *                       client connects to AmazonConfig
     *                       (ex: proxy settings, retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    public AmazonConfigClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);
        
        this.awsCredentialsProvider = awsCredentialsProvider;
        
        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new MaxNumberOfDeliveryChannelsExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidTimeRangeExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceNotDiscoveredExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new NoSuchConfigurationRecorderExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new MaxNumberOfConfigurationRecordersExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidLimitExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new LastDeliveryChannelDeleteFailedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidSNSTopicARNExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidDeliveryChannelNameExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidConfigurationRecorderNameExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InsufficientDeliveryPolicyExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new NoAvailableConfigurationRecorderExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new NoRunningConfigurationRecorderExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new NoSuchBucketExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidNextTokenExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new NoSuchDeliveryChannelExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ValidationExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidS3KeyPrefixExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidRoleExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidRecordingGroupExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new NoAvailableDeliveryChannelExceptionUnmarshaller());
        
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());
        
        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("config.us-east-1.amazonaws.com/");
        
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/config/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/config/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;
        
        return config;
    }

    /**
     * <p>
     * Returns the current status of the specified delivery channel. If a
     * delivery channel is not specified, this action returns the current
     * status of all delivery channels associated with the account.
     * </p>
     * <p>
     * <b>NOTE:</b>Currently, you can specify only one delivery channel per
     * account.
     * </p>
     *
     * @param describeDeliveryChannelStatusRequest Container for the
     *           necessary parameters to execute the DescribeDeliveryChannelStatus
     *           service method on AmazonConfig.
     * 
     * @return The response from the DescribeDeliveryChannelStatus service
     *         method, as returned by AmazonConfig.
     * 
     * @throws NoSuchDeliveryChannelException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeDeliveryChannelStatusResult describeDeliveryChannelStatus(DescribeDeliveryChannelStatusRequest describeDeliveryChannelStatusRequest) {
        ExecutionContext executionContext = createExecutionContext(describeDeliveryChannelStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDeliveryChannelStatusRequest> request = null;
        Response<DescribeDeliveryChannelStatusResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDeliveryChannelStatusRequestMarshaller().marshall(super.beforeMarshalling(describeDeliveryChannelStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<DescribeDeliveryChannelStatusResult, JsonUnmarshallerContext> unmarshaller =
                new DescribeDeliveryChannelStatusResultJsonUnmarshaller();
            JsonResponseHandler<DescribeDeliveryChannelStatusResult> responseHandler =
                new JsonResponseHandler<DescribeDeliveryChannelStatusResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns the name of one or more specified configuration recorders.
     * If the recorder name is not specified, this action returns the names
     * of all the configuration recorders associated with the account.
     * </p>
     * <p>
     * <b>NOTE:</b> Currently, you can specify only one configuration
     * recorder per account.
     * </p>
     *
     * @param describeConfigurationRecordersRequest Container for the
     *           necessary parameters to execute the DescribeConfigurationRecorders
     *           service method on AmazonConfig.
     * 
     * @return The response from the DescribeConfigurationRecorders service
     *         method, as returned by AmazonConfig.
     * 
     * @throws NoSuchConfigurationRecorderException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeConfigurationRecordersResult describeConfigurationRecorders(DescribeConfigurationRecordersRequest describeConfigurationRecordersRequest) {
        ExecutionContext executionContext = createExecutionContext(describeConfigurationRecordersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeConfigurationRecordersRequest> request = null;
        Response<DescribeConfigurationRecordersResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeConfigurationRecordersRequestMarshaller().marshall(super.beforeMarshalling(describeConfigurationRecordersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<DescribeConfigurationRecordersResult, JsonUnmarshallerContext> unmarshaller =
                new DescribeConfigurationRecordersResultJsonUnmarshaller();
            JsonResponseHandler<DescribeConfigurationRecordersResult> responseHandler =
                new JsonResponseHandler<DescribeConfigurationRecordersResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Starts recording configurations of the AWS resources you have
     * selected to record in your AWS account.
     * </p>
     * <p>
     * You must have created at least one delivery channel to successfully
     * start the configuration recorder.
     * </p>
     *
     * @param startConfigurationRecorderRequest Container for the necessary
     *           parameters to execute the StartConfigurationRecorder service method on
     *           AmazonConfig.
     * 
     * 
     * @throws NoSuchConfigurationRecorderException
     * @throws NoAvailableDeliveryChannelException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void startConfigurationRecorder(StartConfigurationRecorderRequest startConfigurationRecorderRequest) {
        ExecutionContext executionContext = createExecutionContext(startConfigurationRecorderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartConfigurationRecorderRequest> request = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartConfigurationRecorderRequestMarshaller().marshall(super.beforeMarshalling(startConfigurationRecorderRequest));
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
     * Creates a new delivery channel object to deliver the configuration
     * information to an Amazon S3 bucket, and to an Amazon SNS topic.
     * </p>
     * <p>
     * You can use this action to change the Amazon S3 bucket or an Amazon
     * SNS topic of the existing delivery channel. To change the Amazon S3
     * bucket or an Amazon SNS topic, call this action and specify the
     * changed values for the S3 bucket and the SNS topic. If you specify a
     * different value for either the S3 bucket or the SNS topic, this action
     * will keep the existing value for the parameter that is not changed.
     * </p>
     * <p>
     * <b>NOTE:</b> Currently, you can specify only one delivery channel per
     * account.
     * </p>
     *
     * @param putDeliveryChannelRequest Container for the necessary
     *           parameters to execute the PutDeliveryChannel service method on
     *           AmazonConfig.
     * 
     * 
     * @throws InvalidDeliveryChannelNameException
     * @throws InvalidS3KeyPrefixException
     * @throws NoAvailableConfigurationRecorderException
     * @throws NoSuchBucketException
     * @throws InvalidSNSTopicARNException
     * @throws InsufficientDeliveryPolicyException
     * @throws MaxNumberOfDeliveryChannelsExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void putDeliveryChannel(PutDeliveryChannelRequest putDeliveryChannelRequest) {
        ExecutionContext executionContext = createExecutionContext(putDeliveryChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutDeliveryChannelRequest> request = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutDeliveryChannelRequestMarshaller().marshall(super.beforeMarshalling(putDeliveryChannelRequest));
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
     * Deletes the specified delivery channel.
     * </p>
     * <p>
     * The delivery channel cannot be deleted if it is the only delivery
     * channel and the configuration recorder is still running. To delete the
     * delivery channel, stop the running configuration recorder using the
     * StopConfigurationRecorder action.
     * </p>
     *
     * @param deleteDeliveryChannelRequest Container for the necessary
     *           parameters to execute the DeleteDeliveryChannel service method on
     *           AmazonConfig.
     * 
     * 
     * @throws NoSuchDeliveryChannelException
     * @throws LastDeliveryChannelDeleteFailedException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteDeliveryChannel(DeleteDeliveryChannelRequest deleteDeliveryChannelRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteDeliveryChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDeliveryChannelRequest> request = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDeliveryChannelRequestMarshaller().marshall(super.beforeMarshalling(deleteDeliveryChannelRequest));
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
     * Stops recording configurations of the AWS resources you have selected
     * to record in your AWS account.
     * </p>
     *
     * @param stopConfigurationRecorderRequest Container for the necessary
     *           parameters to execute the StopConfigurationRecorder service method on
     *           AmazonConfig.
     * 
     * 
     * @throws NoSuchConfigurationRecorderException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void stopConfigurationRecorder(StopConfigurationRecorderRequest stopConfigurationRecorderRequest) {
        ExecutionContext executionContext = createExecutionContext(stopConfigurationRecorderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopConfigurationRecorderRequest> request = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopConfigurationRecorderRequestMarshaller().marshall(super.beforeMarshalling(stopConfigurationRecorderRequest));
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
     * Schedules delivery of a configuration snapshot to the Amazon S3
     * bucket in the specified delivery channel. After the delivery has
     * started, AWS Config sends following notifications using an Amazon SNS
     * topic that you have specified.
     * </p>
     * 
     * <ul>
     * <li>Notification of starting the delivery.</li>
     * <li>Notification of delivery completed, if the delivery was
     * successfully completed.</li>
     * <li>Notification of delivery failure, if the delivery failed to
     * complete.</li>
     * 
     * </ul>
     *
     * @param deliverConfigSnapshotRequest Container for the necessary
     *           parameters to execute the DeliverConfigSnapshot service method on
     *           AmazonConfig.
     * 
     * @return The response from the DeliverConfigSnapshot service method, as
     *         returned by AmazonConfig.
     * 
     * @throws NoSuchDeliveryChannelException
     * @throws NoAvailableConfigurationRecorderException
     * @throws NoRunningConfigurationRecorderException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeliverConfigSnapshotResult deliverConfigSnapshot(DeliverConfigSnapshotRequest deliverConfigSnapshotRequest) {
        ExecutionContext executionContext = createExecutionContext(deliverConfigSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeliverConfigSnapshotRequest> request = null;
        Response<DeliverConfigSnapshotResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeliverConfigSnapshotRequestMarshaller().marshall(super.beforeMarshalling(deliverConfigSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<DeliverConfigSnapshotResult, JsonUnmarshallerContext> unmarshaller =
                new DeliverConfigSnapshotResultJsonUnmarshaller();
            JsonResponseHandler<DeliverConfigSnapshotResult> responseHandler =
                new JsonResponseHandler<DeliverConfigSnapshotResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a new configuration recorder to record the selected resource
     * configurations.
     * </p>
     * <p>
     * You can use this action to change the role <code>roleARN</code>
     * and/or the <code>recordingGroup</code> of an existing recorder. To
     * change the role, call the action on the existing configuration
     * recorder and specify a role.
     * </p>
     * <p>
     * <b>NOTE:</b> Currently, you can specify only one configuration
     * recorder per account. If ConfigurationRecorder does not have the
     * recordingGroup parameter specified, the default is to record all
     * supported resource types.
     * </p>
     *
     * @param putConfigurationRecorderRequest Container for the necessary
     *           parameters to execute the PutConfigurationRecorder service method on
     *           AmazonConfig.
     * 
     * 
     * @throws InvalidRoleException
     * @throws InvalidRecordingGroupException
     * @throws InvalidConfigurationRecorderNameException
     * @throws MaxNumberOfConfigurationRecordersExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void putConfigurationRecorder(PutConfigurationRecorderRequest putConfigurationRecorderRequest) {
        ExecutionContext executionContext = createExecutionContext(putConfigurationRecorderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutConfigurationRecorderRequest> request = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutConfigurationRecorderRequestMarshaller().marshall(super.beforeMarshalling(putConfigurationRecorderRequest));
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
     * Returns a list of configuration items for the specified resource. The
     * list contains details about each state of the resource during the
     * specified time interval. You can specify a <code>limit</code> on the
     * number of results returned on the page. If a limit is specified, a
     * <code>nextToken</code> is returned as part of the result that you can
     * use to continue this request.
     * </p>
     * <p>
     * <b>NOTE:</b> Each call to the API is limited to span a duration of
     * seven days. It is likely that the number of records returned is
     * smaller than the specified limit. In such cases, you can make another
     * call, using the nextToken .
     * </p>
     *
     * @param getResourceConfigHistoryRequest Container for the necessary
     *           parameters to execute the GetResourceConfigHistory service method on
     *           AmazonConfig.
     * 
     * @return The response from the GetResourceConfigHistory service method,
     *         as returned by AmazonConfig.
     * 
     * @throws InvalidNextTokenException
     * @throws NoAvailableConfigurationRecorderException
     * @throws ValidationException
     * @throws ResourceNotDiscoveredException
     * @throws InvalidTimeRangeException
     * @throws InvalidLimitException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetResourceConfigHistoryResult getResourceConfigHistory(GetResourceConfigHistoryRequest getResourceConfigHistoryRequest) {
        ExecutionContext executionContext = createExecutionContext(getResourceConfigHistoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetResourceConfigHistoryRequest> request = null;
        Response<GetResourceConfigHistoryResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetResourceConfigHistoryRequestMarshaller().marshall(super.beforeMarshalling(getResourceConfigHistoryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<GetResourceConfigHistoryResult, JsonUnmarshallerContext> unmarshaller =
                new GetResourceConfigHistoryResultJsonUnmarshaller();
            JsonResponseHandler<GetResourceConfigHistoryResult> responseHandler =
                new JsonResponseHandler<GetResourceConfigHistoryResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns details about the specified delivery channel. If a delivery
     * channel is not specified, this action returns the details of all
     * delivery channels associated with the account.
     * </p>
     * <p>
     * <b>NOTE:</b> Currently, you can specify only one delivery channel per
     * account.
     * </p>
     *
     * @param describeDeliveryChannelsRequest Container for the necessary
     *           parameters to execute the DescribeDeliveryChannels service method on
     *           AmazonConfig.
     * 
     * @return The response from the DescribeDeliveryChannels service method,
     *         as returned by AmazonConfig.
     * 
     * @throws NoSuchDeliveryChannelException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeDeliveryChannelsResult describeDeliveryChannels(DescribeDeliveryChannelsRequest describeDeliveryChannelsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeDeliveryChannelsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDeliveryChannelsRequest> request = null;
        Response<DescribeDeliveryChannelsResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDeliveryChannelsRequestMarshaller().marshall(super.beforeMarshalling(describeDeliveryChannelsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<DescribeDeliveryChannelsResult, JsonUnmarshallerContext> unmarshaller =
                new DescribeDeliveryChannelsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeDeliveryChannelsResult> responseHandler =
                new JsonResponseHandler<DescribeDeliveryChannelsResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns the current status of the specified configuration recorder.
     * If a configuration recorder is not specified, this action returns the
     * status of all configuration recorder associated with the account.
     * </p>
     * <p>
     * <b>NOTE:</b>Currently, you can specify only one configuration
     * recorder per account.
     * </p>
     *
     * @param describeConfigurationRecorderStatusRequest Container for the
     *           necessary parameters to execute the
     *           DescribeConfigurationRecorderStatus service method on AmazonConfig.
     * 
     * @return The response from the DescribeConfigurationRecorderStatus
     *         service method, as returned by AmazonConfig.
     * 
     * @throws NoSuchConfigurationRecorderException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeConfigurationRecorderStatusResult describeConfigurationRecorderStatus(DescribeConfigurationRecorderStatusRequest describeConfigurationRecorderStatusRequest) {
        ExecutionContext executionContext = createExecutionContext(describeConfigurationRecorderStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeConfigurationRecorderStatusRequest> request = null;
        Response<DescribeConfigurationRecorderStatusResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeConfigurationRecorderStatusRequestMarshaller().marshall(super.beforeMarshalling(describeConfigurationRecorderStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<DescribeConfigurationRecorderStatusResult, JsonUnmarshallerContext> unmarshaller =
                new DescribeConfigurationRecorderStatusResultJsonUnmarshaller();
            JsonResponseHandler<DescribeConfigurationRecorderStatusResult> responseHandler =
                new JsonResponseHandler<DescribeConfigurationRecorderStatusResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns the current status of the specified delivery channel. If a
     * delivery channel is not specified, this action returns the current
     * status of all delivery channels associated with the account.
     * </p>
     * <p>
     * <b>NOTE:</b>Currently, you can specify only one delivery channel per
     * account.
     * </p>
     * 
     * @return The response from the DescribeDeliveryChannelStatus service
     *         method, as returned by AmazonConfig.
     * 
     * @throws NoSuchDeliveryChannelException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeDeliveryChannelStatusResult describeDeliveryChannelStatus() throws AmazonServiceException, AmazonClientException {
        return describeDeliveryChannelStatus(new DescribeDeliveryChannelStatusRequest());
    }
    
    /**
     * <p>
     * Returns the name of one or more specified configuration recorders.
     * If the recorder name is not specified, this action returns the names
     * of all the configuration recorders associated with the account.
     * </p>
     * <p>
     * <b>NOTE:</b> Currently, you can specify only one configuration
     * recorder per account.
     * </p>
     * 
     * @return The response from the DescribeConfigurationRecorders service
     *         method, as returned by AmazonConfig.
     * 
     * @throws NoSuchConfigurationRecorderException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeConfigurationRecordersResult describeConfigurationRecorders() throws AmazonServiceException, AmazonClientException {
        return describeConfigurationRecorders(new DescribeConfigurationRecordersRequest());
    }
    
    /**
     * <p>
     * Returns details about the specified delivery channel. If a delivery
     * channel is not specified, this action returns the details of all
     * delivery channels associated with the account.
     * </p>
     * <p>
     * <b>NOTE:</b> Currently, you can specify only one delivery channel per
     * account.
     * </p>
     * 
     * @return The response from the DescribeDeliveryChannels service method,
     *         as returned by AmazonConfig.
     * 
     * @throws NoSuchDeliveryChannelException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeDeliveryChannelsResult describeDeliveryChannels() throws AmazonServiceException, AmazonClientException {
        return describeDeliveryChannels(new DescribeDeliveryChannelsRequest());
    }
    
    /**
     * <p>
     * Returns the current status of the specified configuration recorder.
     * If a configuration recorder is not specified, this action returns the
     * status of all configuration recorder associated with the account.
     * </p>
     * <p>
     * <b>NOTE:</b>Currently, you can specify only one configuration
     * recorder per account.
     * </p>
     * 
     * @return The response from the DescribeConfigurationRecorderStatus
     *         service method, as returned by AmazonConfig.
     * 
     * @throws NoSuchConfigurationRecorderException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeConfigurationRecorderStatusResult describeConfigurationRecorderStatus() throws AmazonServiceException, AmazonClientException {
        return describeConfigurationRecorderStatus(new DescribeConfigurationRecorderStatusRequest());
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
        