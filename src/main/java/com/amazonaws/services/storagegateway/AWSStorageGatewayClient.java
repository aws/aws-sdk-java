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
package com.amazonaws.services.storagegateway;

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

import com.amazonaws.services.storagegateway.model.*;
import com.amazonaws.services.storagegateway.model.transform.*;


/**
 * Client for accessing AWSStorageGateway.  All service calls made
 * using this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * AWS Storage Gateway Service <p>
 * AWS Storage Gateway is the service that connects an on-premises software appliance with cloud-based storage to provide seamless and secure integration
 * between an organization's on-premises IT environment and AWS's storage infrastructure. The service enables you to securely upload data to the AWS
 * cloud for cost effective backup and rapid disaster recovery.
 * </p>
 * <p>
 * Use the following links to get started using the <i>AWS Storage Gateway Service API Reference</i> :
 * </p>
 * 
 * <ul>
 * <li> <a href="http://docs.aws.amazon.com/storagegateway/latest/userguide/AWSStorageGatewayHTTPRequestsHeaders.html"> AWS Storage Gateway Required
 * Request Headers </a> : Describes the required headers that you must send with every POST request to AWS Storage Gateway.</li>
 * <li> <a href="http://docs.aws.amazon.com/storagegateway/latest/userguide/AWSStorageGatewaySigningRequests.html"> Signing Requests </a> : AWS Storage
 * Gateway requires that you authenticate every request you send; this topic describes how sign such a request.</li>
 * <li> <a href="http://docs.aws.amazon.com/storagegateway/latest/userguide/APIErrorResponses.html"> Error Responses </a> : Provides reference
 * information about AWS Storage Gateway errors.</li>
 * <li> <a href="http://docs.aws.amazon.com/storagegateway/latest/userguide/AWSStorageGatewayAPIOperations.html"> Operations in AWS Storage Gateway </a>
 * : Contains detailed descriptions of all AWS Storage Gateway operations, their request parameters, response elements, possible errors, and examples of
 * requests and responses.</li>
 * <li> <a href="http://docs.aws.amazon.com/general/latest/gr/index.html?rande.html"> AWS Storage Gateway Regions and Endpoints </a> : Provides a list
 * of each of the regions and endpoints available for use with AWS Storage Gateway. </li>
 * 
 * </ul>
 */
public class AWSStorageGatewayClient extends AmazonWebServiceClient implements AWSStorageGateway {

    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSStorageGateway.class);

    /**
     * List of exception unmarshallers for all AWSStorageGateway exceptions.
     */
    protected List<Unmarshaller<AmazonServiceException, JSONObject>> exceptionUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on
     * AWSStorageGateway.  A credentials provider chain will be used
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
    public AWSStorageGatewayClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSStorageGateway.  A credentials provider chain will be used
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
     *                       client connects to AWSStorageGateway
     *                       (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AWSStorageGatewayClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSStorageGateway using the specified AWS account credentials.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     */
    public AWSStorageGatewayClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSStorageGateway using the specified AWS account credentials
     * and client configuration options.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AWSStorageGateway
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AWSStorageGatewayClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        
        init();
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSStorageGateway using the specified AWS account credentials provider.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     */
    public AWSStorageGatewayClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSStorageGateway using the specified AWS account credentials
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
     *                       client connects to AWSStorageGateway
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AWSStorageGatewayClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        
        this.awsCredentialsProvider = awsCredentialsProvider;
        
        init();
    }


    private void init() {
        exceptionUnmarshallers = new ArrayList<Unmarshaller<AmazonServiceException, JSONObject>>();
        exceptionUnmarshallers.add(new InvalidGatewayRequestExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InternalServerErrorExceptionUnmarshaller());
        
        exceptionUnmarshallers.add(new JsonErrorUnmarshaller());
        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("storagegateway.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/storagegateway/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/storagegateway/request.handler2s"));

        
    }

    
    /**
     * <p>
     * This operation deletes a snapshot of a volume.
     * </p>
     * <p>
     * You can take snapshots of your gateway volumes on a scheduled or
     * ad-hoc basis. This API enables you to delete a snapshot schedule for a
     * volume. For more information, see <a
     * amazon.com/storagegateway/latest/userguide/WorkingWithSnapshots.html">
     * Working with Snapshots </a> . In the
     * <code>DeleteSnapshotSchedule</code> request, you identify the volume
     * by providing its Amazon Resource Name (ARN).
     * </p>
     * <p>
     * <b>NOTE:</b> To list or delete a snapshot, you must use the Amazon EC2
     * API. in Amazon Elastic Compute Cloud API Reference.
     * </p>
     *
     * @param deleteSnapshotScheduleRequest Container for the necessary
     *           parameters to execute the DeleteSnapshotSchedule service method on
     *           AWSStorageGateway.
     * 
     * @return The response from the DeleteSnapshotSchedule service method,
     *         as returned by AWSStorageGateway.
     * 
     * @throws InternalServerErrorException
     * @throws InvalidGatewayRequestException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteSnapshotScheduleResult deleteSnapshotSchedule(DeleteSnapshotScheduleRequest deleteSnapshotScheduleRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteSnapshotScheduleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSnapshotScheduleRequest> request = null;
        Response<DeleteSnapshotScheduleResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSnapshotScheduleRequestMarshaller().marshall(deleteSnapshotScheduleRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteSnapshotScheduleResult, JsonUnmarshallerContext> unmarshaller = new DeleteSnapshotScheduleResultJsonUnmarshaller();
            JsonResponseHandler<DeleteSnapshotScheduleResult> responseHandler = new JsonResponseHandler<DeleteSnapshotScheduleResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

   
    /**
     * <p>
     * This operation returns your gateway's weekly maintenance start time
     * including the day and time of the week. Note that values are in terms
     * of the gateway's time zone.
     * </p>
     *
     * @param describeMaintenanceStartTimeRequest Container for the necessary
     *           parameters to execute the DescribeMaintenanceStartTime service method
     *           on AWSStorageGateway.
     * 
     * @return The response from the DescribeMaintenanceStartTime service
     *         method, as returned by AWSStorageGateway.
     * 
     * @throws InternalServerErrorException
     * @throws InvalidGatewayRequestException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeMaintenanceStartTimeResult describeMaintenanceStartTime(DescribeMaintenanceStartTimeRequest describeMaintenanceStartTimeRequest) {
        ExecutionContext executionContext = createExecutionContext(describeMaintenanceStartTimeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeMaintenanceStartTimeRequest> request = null;
        Response<DescribeMaintenanceStartTimeResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeMaintenanceStartTimeRequestMarshaller().marshall(describeMaintenanceStartTimeRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeMaintenanceStartTimeResult, JsonUnmarshallerContext> unmarshaller = new DescribeMaintenanceStartTimeResultJsonUnmarshaller();
            JsonResponseHandler<DescribeMaintenanceStartTimeResult> responseHandler = new JsonResponseHandler<DescribeMaintenanceStartTimeResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

   
    /**
     * <p>
     * This operation creates a volume on a specified gateway. This operation
     * is supported only for the gateway-cached volume architecture.
     * </p>
     * <p>
     * The size of the volume to create is inferred from the disk size. You
     * can choose to preserve existing data on the disk, create volume from
     * an existing snapshot, or create an empty volume. If you choose to
     * create an empty gateway volume, then any existing data on the disk is
     * erased.
     * </p>
     * <p>
     * In the request you must specify the gateway and the disk information
     * on which you are creating the volume. In response, AWS Storage Gateway
     * creates the volume and returns volume information such as the volume
     * Amazon Resource Name (ARN), its size, and the iSCSI target ARN that
     * initiators can use to connect to the volume target.
     * </p>
     *
     * @param createStorediSCSIVolumeRequest Container for the necessary
     *           parameters to execute the CreateStorediSCSIVolume service method on
     *           AWSStorageGateway.
     * 
     * @return The response from the CreateStorediSCSIVolume service method,
     *         as returned by AWSStorageGateway.
     * 
     * @throws InternalServerErrorException
     * @throws InvalidGatewayRequestException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateStorediSCSIVolumeResult createStorediSCSIVolume(CreateStorediSCSIVolumeRequest createStorediSCSIVolumeRequest) {
        ExecutionContext executionContext = createExecutionContext(createStorediSCSIVolumeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateStorediSCSIVolumeRequest> request = null;
        Response<CreateStorediSCSIVolumeResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateStorediSCSIVolumeRequestMarshaller().marshall(createStorediSCSIVolumeRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateStorediSCSIVolumeResult, JsonUnmarshallerContext> unmarshaller = new CreateStorediSCSIVolumeResultJsonUnmarshaller();
            JsonResponseHandler<CreateStorediSCSIVolumeResult> responseHandler = new JsonResponseHandler<CreateStorediSCSIVolumeResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

   
    /**
     * <p>
     * This operation updates the gateway virtual machine (VM) software. The
     * request immediately triggers the software update.
     * </p>
     * <p>
     * <b>NOTE:</b>When you make this request, you get a 200 OK success
     * response immediately. However, it might take some time for the update
     * to complete. You can call DescribeGatewayInformation to verify the
     * gateway is in the STATE_RUNNING state.
     * </p>
     * <p>
     * <b>IMPORTANT:</b>A software update forces a system restart of your
     * gateway. You can minimize the chance of any disruption to your
     * applications by increasing your iSCSI Initiators' timeouts. For more
     * information about increasing iSCSI Initiator timeouts for Windows and
     * Linux, see Customizing Your Windows iSCSI Settings and Customizing
     * Your Linux iSCSI Settings, respectively.
     * </p>
     *
     * @param updateGatewaySoftwareNowRequest Container for the necessary
     *           parameters to execute the UpdateGatewaySoftwareNow service method on
     *           AWSStorageGateway.
     * 
     * @return The response from the UpdateGatewaySoftwareNow service method,
     *         as returned by AWSStorageGateway.
     * 
     * @throws InternalServerErrorException
     * @throws InvalidGatewayRequestException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateGatewaySoftwareNowResult updateGatewaySoftwareNow(UpdateGatewaySoftwareNowRequest updateGatewaySoftwareNowRequest) {
        ExecutionContext executionContext = createExecutionContext(updateGatewaySoftwareNowRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateGatewaySoftwareNowRequest> request = null;
        Response<UpdateGatewaySoftwareNowResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateGatewaySoftwareNowRequestMarshaller().marshall(updateGatewaySoftwareNowRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateGatewaySoftwareNowResult, JsonUnmarshallerContext> unmarshaller = new UpdateGatewaySoftwareNowResultJsonUnmarshaller();
            JsonResponseHandler<UpdateGatewaySoftwareNowResult> responseHandler = new JsonResponseHandler<UpdateGatewaySoftwareNowResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

   
    /**
     * <p>
     * This operation initiates a snapshot of a volume.
     * </p>
     * <p>
     * AWS Storage Gateway provides the ability to back up point-in-time
     * snapshots of your data to Amazon Simple Storage (S3) for durable
     * off-site recovery, as well as import the data to an Amazon Elastic
     * Block Store (EBS) volume in Amazon Elastic Compute Cloud (EC2). You
     * can take snapshots of your gateway volume on a scheduled or ad-hoc
     * basis. This API enables you to take ad-hoc snapshot. For more
     * information, see Working With Snapshots in the AWS Storage Gateway
     * Console.
     * </p>
     * <p>
     * In the CreateSnapshot request you identify the volume by providing its
     * Amazon Resource Name (ARN). You must also provide description for the
     * snapshot. When AWS Storage Gateway takes the snapshot of specified
     * volume, the snapshot and description appears in the AWS Storage
     * Gateway Console. In response, AWS Storage Gateway returns you a
     * snapshot ID. You can use this snapshot ID to check the snapshot
     * progress or later use it when you want to create a volume from a
     * snapshot.
     * </p>
     * <p>
     * <b>NOTE:</b>To list or delete a snapshot, you must use the Amazon EC2
     * API. For more information, .
     * </p>
     *
     * @param createSnapshotRequest Container for the necessary parameters to
     *           execute the CreateSnapshot service method on AWSStorageGateway.
     * 
     * @return The response from the CreateSnapshot service method, as
     *         returned by AWSStorageGateway.
     * 
     * @throws InternalServerErrorException
     * @throws InvalidGatewayRequestException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateSnapshotResult createSnapshot(CreateSnapshotRequest createSnapshotRequest) {
        ExecutionContext executionContext = createExecutionContext(createSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSnapshotRequest> request = null;
        Response<CreateSnapshotResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSnapshotRequestMarshaller().marshall(createSnapshotRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateSnapshotResult, JsonUnmarshallerContext> unmarshaller = new CreateSnapshotResultJsonUnmarshaller();
            JsonResponseHandler<CreateSnapshotResult> responseHandler = new JsonResponseHandler<CreateSnapshotResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

   
    /**
     * <p>
     * This operation configures one or more gateway local disks as working
     * storage for a gateway. This operation is supported only for the
     * gateway-stored volume architecture.
     * </p>
     * <p>
     * <b>NOTE:</b> Working storage is also referred to as upload buffer. You
     * can also use the AddUploadBuffer operation to add upload buffer to a
     * stored-volume gateway.
     * </p>
     * <p>
     * In the request, you specify the gateway Amazon Resource Name (ARN) to
     * which you want to add working storage, and one or more disk IDs that
     * you want to configure as working storage.
     * </p>
     *
     * @param addWorkingStorageRequest Container for the necessary parameters
     *           to execute the AddWorkingStorage service method on AWSStorageGateway.
     * 
     * @return The response from the AddWorkingStorage service method, as
     *         returned by AWSStorageGateway.
     * 
     * @throws InternalServerErrorException
     * @throws InvalidGatewayRequestException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public AddWorkingStorageResult addWorkingStorage(AddWorkingStorageRequest addWorkingStorageRequest) {
        ExecutionContext executionContext = createExecutionContext(addWorkingStorageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddWorkingStorageRequest> request = null;
        Response<AddWorkingStorageResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddWorkingStorageRequestMarshaller().marshall(addWorkingStorageRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AddWorkingStorageResult, JsonUnmarshallerContext> unmarshaller = new AddWorkingStorageResultJsonUnmarshaller();
            JsonResponseHandler<AddWorkingStorageResult> responseHandler = new JsonResponseHandler<AddWorkingStorageResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

   
    /**
     * <p>
     * Cancels retrieval of a virtual tape from the Virtual Tape Shelf (VTS)
     * to a gateway after the retrieval process is initiated. The virtual
     * tape is returned to the Virtual Tape Shelf.
     * </p>
     *
     * @param cancelRetrievalRequest Container for the necessary parameters
     *           to execute the CancelRetrieval service method on AWSStorageGateway.
     * 
     * @return The response from the CancelRetrieval service method, as
     *         returned by AWSStorageGateway.
     * 
     * @throws InternalServerErrorException
     * @throws InvalidGatewayRequestException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CancelRetrievalResult cancelRetrieval(CancelRetrievalRequest cancelRetrievalRequest) {
        ExecutionContext executionContext = createExecutionContext(cancelRetrievalRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelRetrievalRequest> request = null;
        Response<CancelRetrievalResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelRetrievalRequestMarshaller().marshall(cancelRetrievalRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CancelRetrievalResult, JsonUnmarshallerContext> unmarshaller = new CancelRetrievalResultJsonUnmarshaller();
            JsonResponseHandler<CancelRetrievalResult> responseHandler = new JsonResponseHandler<CancelRetrievalResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

   
    /**
     * <p>
     * This operation returns the bandwidth rate limits of a gateway. By
     * default, these limits are not set, which means no bandwidth rate
     * limiting is in effect.
     * </p>
     * <p>
     * This operation only returns a value for a bandwidth rate limit only if
     * the limit is set. If no limits are set for the gateway, then this
     * operation returns only the gateway ARN in the response body. To
     * specify which gateway to describe, use the Amazon Resource Name (ARN)
     * of the gateway in your request.
     * </p>
     *
     * @param describeBandwidthRateLimitRequest Container for the necessary
     *           parameters to execute the DescribeBandwidthRateLimit service method on
     *           AWSStorageGateway.
     * 
     * @return The response from the DescribeBandwidthRateLimit service
     *         method, as returned by AWSStorageGateway.
     * 
     * @throws InternalServerErrorException
     * @throws InvalidGatewayRequestException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeBandwidthRateLimitResult describeBandwidthRateLimit(DescribeBandwidthRateLimitRequest describeBandwidthRateLimitRequest) {
        ExecutionContext executionContext = createExecutionContext(describeBandwidthRateLimitRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeBandwidthRateLimitRequest> request = null;
        Response<DescribeBandwidthRateLimitResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeBandwidthRateLimitRequestMarshaller().marshall(describeBandwidthRateLimitRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeBandwidthRateLimitResult, JsonUnmarshallerContext> unmarshaller = new DescribeBandwidthRateLimitResultJsonUnmarshaller();
            JsonResponseHandler<DescribeBandwidthRateLimitResult> responseHandler = new JsonResponseHandler<DescribeBandwidthRateLimitResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

   
    /**
     * <p>
     * Returns a description of the specified Amazon Resource Name (ARN) of
     * virtual tapes. If a <code>TapeARN</code> is not specified, returns a
     * description of all virtual tapes associated with the specified
     * gateway.
     * </p>
     *
     * @param describeTapesRequest Container for the necessary parameters to
     *           execute the DescribeTapes service method on AWSStorageGateway.
     * 
     * @return The response from the DescribeTapes service method, as
     *         returned by AWSStorageGateway.
     * 
     * @throws InternalServerErrorException
     * @throws InvalidGatewayRequestException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeTapesResult describeTapes(DescribeTapesRequest describeTapesRequest) {
        ExecutionContext executionContext = createExecutionContext(describeTapesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTapesRequest> request = null;
        Response<DescribeTapesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTapesRequestMarshaller().marshall(describeTapesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeTapesResult, JsonUnmarshallerContext> unmarshaller = new DescribeTapesResultJsonUnmarshaller();
            JsonResponseHandler<DescribeTapesResult> responseHandler = new JsonResponseHandler<DescribeTapesResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

   
    /**
     * <p>
     * Retrieves the recovery point for the specified virtual tape.
     * </p>
     * <p>
     * A recovery point is a point in time view of a virtual tape at which
     * all the data on the tape is consistent. If your gateway crashes,
     * virtual tapes that have recovery points can be recovered to a new
     * gateway.
     * </p>
     * <p>
     * <b>NOTE:</b>The virtual tape can be retrieved to only one gateway. The
     * retrieved tape is read-only. The virtual tape can be retrieved to only
     * a Gateway-Virtual Tape Library. There is no charge for retrieving
     * recovery points.
     * </p>
     *
     * @param retrieveTapeRecoveryPointRequest Container for the necessary
     *           parameters to execute the RetrieveTapeRecoveryPoint service method on
     *           AWSStorageGateway.
     * 
     * @return The response from the RetrieveTapeRecoveryPoint service
     *         method, as returned by AWSStorageGateway.
     * 
     * @throws InternalServerErrorException
     * @throws InvalidGatewayRequestException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public RetrieveTapeRecoveryPointResult retrieveTapeRecoveryPoint(RetrieveTapeRecoveryPointRequest retrieveTapeRecoveryPointRequest) {
        ExecutionContext executionContext = createExecutionContext(retrieveTapeRecoveryPointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RetrieveTapeRecoveryPointRequest> request = null;
        Response<RetrieveTapeRecoveryPointResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RetrieveTapeRecoveryPointRequestMarshaller().marshall(retrieveTapeRecoveryPointRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<RetrieveTapeRecoveryPointResult, JsonUnmarshallerContext> unmarshaller = new RetrieveTapeRecoveryPointResultJsonUnmarshaller();
            JsonResponseHandler<RetrieveTapeRecoveryPointResult> responseHandler = new JsonResponseHandler<RetrieveTapeRecoveryPointResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

   
    /**
     * <p>
     * This operation updates the Challenge-Handshake Authentication Protocol
     * (CHAP) credentials for a specified iSCSI target. By default, a gateway
     * does not have CHAP enabled; however, for added security, you might use
     * it.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> When you update CHAP credentials, all existing
     * connections on the target are closed and initiators must reconnect
     * with the new credentials.
     * </p>
     *
     * @param updateChapCredentialsRequest Container for the necessary
     *           parameters to execute the UpdateChapCredentials service method on
     *           AWSStorageGateway.
     * 
     * @return The response from the UpdateChapCredentials service method, as
     *         returned by AWSStorageGateway.
     * 
     * @throws InternalServerErrorException
     * @throws InvalidGatewayRequestException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateChapCredentialsResult updateChapCredentials(UpdateChapCredentialsRequest updateChapCredentialsRequest) {
        ExecutionContext executionContext = createExecutionContext(updateChapCredentialsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateChapCredentialsRequest> request = null;
        Response<UpdateChapCredentialsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateChapCredentialsRequestMarshaller().marshall(updateChapCredentialsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateChapCredentialsResult, JsonUnmarshallerContext> unmarshaller = new UpdateChapCredentialsResultJsonUnmarshaller();
            JsonResponseHandler<UpdateChapCredentialsResult> responseHandler = new JsonResponseHandler<UpdateChapCredentialsResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

   
    /**
     * <p>
     * Creates one or more virtual tapes. You write data to the virtual tapes
     * and then archive the tapes.
     * </p>
     * <p>
     * <b>NOTE:</b>Cache storage must be allocated to the gateway before you
     * can create virtual tapes. Use the AddCache operation to add cache
     * storage to a gateway.
     * </p>
     *
     * @param createTapesRequest Container for the necessary parameters to
     *           execute the CreateTapes service method on AWSStorageGateway.
     * 
     * @return The response from the CreateTapes service method, as returned
     *         by AWSStorageGateway.
     * 
     * @throws InternalServerErrorException
     * @throws InvalidGatewayRequestException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateTapesResult createTapes(CreateTapesRequest createTapesRequest) {
        ExecutionContext executionContext = createExecutionContext(createTapesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTapesRequest> request = null;
        Response<CreateTapesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateTapesRequestMarshaller().marshall(createTapesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateTapesResult, JsonUnmarshallerContext> unmarshaller = new CreateTapesResultJsonUnmarshaller();
            JsonResponseHandler<CreateTapesResult> responseHandler = new JsonResponseHandler<CreateTapesResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

   
    /**
     * <p>
     * This operation returns information about the upload buffer of a
     * gateway. This operation is supported for both the gateway-stored and
     * gateway-cached volume architectures.
     * </p>
     * <p>
     * The response includes disk IDs that are configured as upload buffer
     * space, and it includes the amount of upload buffer space allocated and
     * used.
     * </p>
     *
     * @param describeUploadBufferRequest Container for the necessary
     *           parameters to execute the DescribeUploadBuffer service method on
     *           AWSStorageGateway.
     * 
     * @return The response from the DescribeUploadBuffer service method, as
     *         returned by AWSStorageGateway.
     * 
     * @throws InternalServerErrorException
     * @throws InvalidGatewayRequestException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeUploadBufferResult describeUploadBuffer(DescribeUploadBufferRequest describeUploadBufferRequest) {
        ExecutionContext executionContext = createExecutionContext(describeUploadBufferRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeUploadBufferRequest> request = null;
        Response<DescribeUploadBufferResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeUploadBufferRequestMarshaller().marshall(describeUploadBufferRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeUploadBufferResult, JsonUnmarshallerContext> unmarshaller = new DescribeUploadBufferResultJsonUnmarshaller();
            JsonResponseHandler<DescribeUploadBufferResult> responseHandler = new JsonResponseHandler<DescribeUploadBufferResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

   
    /**
     * <p>
     * This operation deletes Challenge-Handshake Authentication Protocol
     * (CHAP) credentials for a specified iSCSI target and initiator pair.
     * </p>
     *
     * @param deleteChapCredentialsRequest Container for the necessary
     *           parameters to execute the DeleteChapCredentials service method on
     *           AWSStorageGateway.
     * 
     * @return The response from the DeleteChapCredentials service method, as
     *         returned by AWSStorageGateway.
     * 
     * @throws InternalServerErrorException
     * @throws InvalidGatewayRequestException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteChapCredentialsResult deleteChapCredentials(DeleteChapCredentialsRequest deleteChapCredentialsRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteChapCredentialsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteChapCredentialsRequest> request = null;
        Response<DeleteChapCredentialsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteChapCredentialsRequestMarshaller().marshall(deleteChapCredentialsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteChapCredentialsResult, JsonUnmarshallerContext> unmarshaller = new DeleteChapCredentialsResultJsonUnmarshaller();
            JsonResponseHandler<DeleteChapCredentialsResult> responseHandler = new JsonResponseHandler<DeleteChapCredentialsResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

   
    /**
     * <p>
     * This operation configures one or more gateway local disks as cache for
     * a cached-volume gateway. This operation is supported only for the
     * gateway-cached volume architecture (see <a
     * azon.com/storagegateway/latest/userguide/StorageGatewayConcepts.html">
     * Storage Gateway Concepts </a> ).
     * </p>
     * <p>
     * In the request, you specify the gateway Amazon Resource Name (ARN) to
     * which you want to add cache, and one or more disk IDs that you want to
     * configure as cache.
     * </p>
     *
     * @param addCacheRequest Container for the necessary parameters to
     *           execute the AddCache service method on AWSStorageGateway.
     * 
     * @return The response from the AddCache service method, as returned by
     *         AWSStorageGateway.
     * 
     * @throws InternalServerErrorException
     * @throws InvalidGatewayRequestException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public AddCacheResult addCache(AddCacheRequest addCacheRequest) {
        ExecutionContext executionContext = createExecutionContext(addCacheRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddCacheRequest> request = null;
        Response<AddCacheResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddCacheRequestMarshaller().marshall(addCacheRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AddCacheResult, JsonUnmarshallerContext> unmarshaller = new AddCacheResultJsonUnmarshaller();
            JsonResponseHandler<AddCacheResult> responseHandler = new JsonResponseHandler<AddCacheResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

   
    /**
     * <p>
     * This operation returns metadata about a gateway such as its name,
     * network interfaces, configured time zone, and the state (whether the
     * gateway is running or not). To specify which gateway to describe, use
     * the Amazon Resource Name (ARN) of the gateway in your request.
     * </p>
     *
     * @param describeGatewayInformationRequest Container for the necessary
     *           parameters to execute the DescribeGatewayInformation service method on
     *           AWSStorageGateway.
     * 
     * @return The response from the DescribeGatewayInformation service
     *         method, as returned by AWSStorageGateway.
     * 
     * @throws InternalServerErrorException
     * @throws InvalidGatewayRequestException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeGatewayInformationResult describeGatewayInformation(DescribeGatewayInformationRequest describeGatewayInformationRequest) {
        ExecutionContext executionContext = createExecutionContext(describeGatewayInformationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeGatewayInformationRequest> request = null;
        Response<DescribeGatewayInformationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeGatewayInformationRequestMarshaller().marshall(describeGatewayInformationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeGatewayInformationResult, JsonUnmarshallerContext> unmarshaller = new DescribeGatewayInformationResultJsonUnmarshaller();
            JsonResponseHandler<DescribeGatewayInformationResult> responseHandler = new JsonResponseHandler<DescribeGatewayInformationResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

   
    /**
     * <p>
     * This operation activates the gateway you previously deployed on your
     * host. For more information, see <a
     * ws.amazon.com/storagegateway/latest/userguide/DownloadAndDeploy.html">
     * Downloading and Deploying AWS Storage Gateway VM </a> . In the
     * activation process you specify information such as the region you want
     * to use for storing snapshots, the time zone for scheduled snapshots
     * and the gateway schedule window, an activation key, and a name for
     * your gateway. The activation process also associates your gateway with
     * your account (see UpdateGatewayInformation).
     * </p>
     * <p>
     * <b>NOTE:</b>You must power on the gateway VM before you can activate
     * your gateway.
     * </p>
     *
     * @param activateGatewayRequest Container for the necessary parameters
     *           to execute the ActivateGateway service method on AWSStorageGateway.
     * 
     * @return The response from the ActivateGateway service method, as
     *         returned by AWSStorageGateway.
     * 
     * @throws InternalServerErrorException
     * @throws InvalidGatewayRequestException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ActivateGatewayResult activateGateway(ActivateGatewayRequest activateGatewayRequest) {
        ExecutionContext executionContext = createExecutionContext(activateGatewayRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ActivateGatewayRequest> request = null;
        Response<ActivateGatewayResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ActivateGatewayRequestMarshaller().marshall(activateGatewayRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ActivateGatewayResult, JsonUnmarshallerContext> unmarshaller = new ActivateGatewayResultJsonUnmarshaller();
            JsonResponseHandler<ActivateGatewayResult> responseHandler = new JsonResponseHandler<ActivateGatewayResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

   
    /**
     * <p>
     * Returns a description of specified virtual tapes in the Virtual Tape
     * Shelf (VTS).
     * </p>
     * <p>
     * If a specific <code>TapeARN</code> is not specified, AWS Storage
     * Gateway returns a description all virtual tapes found in the Virtual
     * Tape Shelf (VTS) associated with your account.
     * </p>
     *
     * @param describeTapeArchivesRequest Container for the necessary
     *           parameters to execute the DescribeTapeArchives service method on
     *           AWSStorageGateway.
     * 
     * @return The response from the DescribeTapeArchives service method, as
     *         returned by AWSStorageGateway.
     * 
     * @throws InternalServerErrorException
     * @throws InvalidGatewayRequestException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeTapeArchivesResult describeTapeArchives(DescribeTapeArchivesRequest describeTapeArchivesRequest) {
        ExecutionContext executionContext = createExecutionContext(describeTapeArchivesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTapeArchivesRequest> request = null;
        Response<DescribeTapeArchivesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTapeArchivesRequestMarshaller().marshall(describeTapeArchivesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeTapeArchivesResult, JsonUnmarshallerContext> unmarshaller = new DescribeTapeArchivesResultJsonUnmarshaller();
            JsonResponseHandler<DescribeTapeArchivesResult> responseHandler = new JsonResponseHandler<DescribeTapeArchivesResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

   
    /**
     * <p>
     * This operation updates a gateway's metadata, which includes the
     * gateway's name and time zone. To specify which gateway to update, use
     * the Amazon Resource Name (ARN) of the gateway in your request.
     * </p>
     *
     * @param updateGatewayInformationRequest Container for the necessary
     *           parameters to execute the UpdateGatewayInformation service method on
     *           AWSStorageGateway.
     * 
     * @return The response from the UpdateGatewayInformation service method,
     *         as returned by AWSStorageGateway.
     * 
     * @throws InternalServerErrorException
     * @throws InvalidGatewayRequestException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateGatewayInformationResult updateGatewayInformation(UpdateGatewayInformationRequest updateGatewayInformationRequest) {
        ExecutionContext executionContext = createExecutionContext(updateGatewayInformationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateGatewayInformationRequest> request = null;
        Response<UpdateGatewayInformationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateGatewayInformationRequestMarshaller().marshall(updateGatewayInformationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateGatewayInformationResult, JsonUnmarshallerContext> unmarshaller = new UpdateGatewayInformationResultJsonUnmarshaller();
            JsonResponseHandler<UpdateGatewayInformationResult> responseHandler = new JsonResponseHandler<UpdateGatewayInformationResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

   
    /**
     * <p>
     * This operation returns a list of the local disks of a gateway. To
     * specify which gateway to describe you use the Amazon Resource Name
     * (ARN) of the gateway in the body of the request.
     * </p>
     * <p>
     * The request returns all disks, specifying which are configured as
     * working storage, stored volume or not configured at all.
     * </p>
     *
     * @param listLocalDisksRequest Container for the necessary parameters to
     *           execute the ListLocalDisks service method on AWSStorageGateway.
     * 
     * @return The response from the ListLocalDisks service method, as
     *         returned by AWSStorageGateway.
     * 
     * @throws InternalServerErrorException
     * @throws InvalidGatewayRequestException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListLocalDisksResult listLocalDisks(ListLocalDisksRequest listLocalDisksRequest) {
        ExecutionContext executionContext = createExecutionContext(listLocalDisksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListLocalDisksRequest> request = null;
        Response<ListLocalDisksResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListLocalDisksRequestMarshaller().marshall(listLocalDisksRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListLocalDisksResult, JsonUnmarshallerContext> unmarshaller = new ListLocalDisksResultJsonUnmarshaller();
            JsonResponseHandler<ListLocalDisksResult> responseHandler = new JsonResponseHandler<ListLocalDisksResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

   
    /**
     * <p>
     * Deletes the specified virtual tape from the Virtual Tape Shelf (VTS).
     * </p>
     *
     * @param deleteTapeArchiveRequest Container for the necessary parameters
     *           to execute the DeleteTapeArchive service method on AWSStorageGateway.
     * 
     * @return The response from the DeleteTapeArchive service method, as
     *         returned by AWSStorageGateway.
     * 
     * @throws InternalServerErrorException
     * @throws InvalidGatewayRequestException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteTapeArchiveResult deleteTapeArchive(DeleteTapeArchiveRequest deleteTapeArchiveRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteTapeArchiveRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTapeArchiveRequest> request = null;
        Response<DeleteTapeArchiveResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTapeArchiveRequestMarshaller().marshall(deleteTapeArchiveRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteTapeArchiveResult, JsonUnmarshallerContext> unmarshaller = new DeleteTapeArchiveResultJsonUnmarshaller();
            JsonResponseHandler<DeleteTapeArchiveResult> responseHandler = new JsonResponseHandler<DeleteTapeArchiveResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

   
    /**
     * <p>
     * This operation returns information about the cache of a gateway. This
     * operation is supported only for the gateway-cached volume
     * architecture.
     * </p>
     * <p>
     * The response includes disk IDs that are configured as cache, and it
     * includes the amount of cache allocated and used.
     * </p>
     *
     * @param describeCacheRequest Container for the necessary parameters to
     *           execute the DescribeCache service method on AWSStorageGateway.
     * 
     * @return The response from the DescribeCache service method, as
     *         returned by AWSStorageGateway.
     * 
     * @throws InternalServerErrorException
     * @throws InvalidGatewayRequestException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeCacheResult describeCache(DescribeCacheRequest describeCacheRequest) {
        ExecutionContext executionContext = createExecutionContext(describeCacheRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCacheRequest> request = null;
        Response<DescribeCacheResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCacheRequestMarshaller().marshall(describeCacheRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeCacheResult, JsonUnmarshallerContext> unmarshaller = new DescribeCacheResultJsonUnmarshaller();
            JsonResponseHandler<DescribeCacheResult> responseHandler = new JsonResponseHandler<DescribeCacheResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

   
    /**
     * <p>
     * This operation updates the bandwidth rate limits of a gateway. You can
     * update both the upload and download bandwidth rate limit or specify
     * only one of the two. If you don't set a bandwidth rate limit, the
     * existing rate limit remains.
     * </p>
     * <p>
     * By default, a gateway's bandwidth rate limits are not set. If you
     * don't set any limit, the gateway does not have any limitations on its
     * bandwidth usage and could potentially use the maximum available
     * bandwidth.
     * </p>
     * <p>
     * To specify which gateway to update, use the Amazon Resource Name (ARN)
     * of the gateway in your request.
     * </p>
     *
     * @param updateBandwidthRateLimitRequest Container for the necessary
     *           parameters to execute the UpdateBandwidthRateLimit service method on
     *           AWSStorageGateway.
     * 
     * @return The response from the UpdateBandwidthRateLimit service method,
     *         as returned by AWSStorageGateway.
     * 
     * @throws InternalServerErrorException
     * @throws InvalidGatewayRequestException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateBandwidthRateLimitResult updateBandwidthRateLimit(UpdateBandwidthRateLimitRequest updateBandwidthRateLimitRequest) {
        ExecutionContext executionContext = createExecutionContext(updateBandwidthRateLimitRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateBandwidthRateLimitRequest> request = null;
        Response<UpdateBandwidthRateLimitResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateBandwidthRateLimitRequestMarshaller().marshall(updateBandwidthRateLimitRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateBandwidthRateLimitResult, JsonUnmarshallerContext> unmarshaller = new UpdateBandwidthRateLimitResultJsonUnmarshaller();
            JsonResponseHandler<UpdateBandwidthRateLimitResult> responseHandler = new JsonResponseHandler<UpdateBandwidthRateLimitResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

   
    /**
     * <p>
     * Disables a gateway when the gateway is no longer functioning. For
     * examples, if your gateway VM is damaged, you can disable the gateway
     * so you can recover virtual tapes.
     * </p>
     * <p>
     * Use this operation for a Gateway-Virtual Tape Library that is not
     * reachable or not functioning.
     * </p>
     * <p>
     * <b>IMPORTANT:</b>Once a gateway is disabled it cannot be enabled.
     * </p>
     *
     * @param disableGatewayRequest Container for the necessary parameters to
     *           execute the DisableGateway service method on AWSStorageGateway.
     * 
     * @return The response from the DisableGateway service method, as
     *         returned by AWSStorageGateway.
     * 
     * @throws InternalServerErrorException
     * @throws InvalidGatewayRequestException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DisableGatewayResult disableGateway(DisableGatewayRequest disableGatewayRequest) {
        ExecutionContext executionContext = createExecutionContext(disableGatewayRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisableGatewayRequest> request = null;
        Response<DisableGatewayResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisableGatewayRequestMarshaller().marshall(disableGatewayRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DisableGatewayResult, JsonUnmarshallerContext> unmarshaller = new DisableGatewayResultJsonUnmarshaller();
            JsonResponseHandler<DisableGatewayResult> responseHandler = new JsonResponseHandler<DisableGatewayResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

   
    /**
     * <p>
     * This operation returns information about the working storage of a
     * gateway. This operation is supported only for the gateway-stored
     * volume architecture.
     * </p>
     * <p>
     * <b>NOTE:</b> Working storage is also referred to as upload buffer. You
     * can also use the DescribeUploadBuffer operation to add upload buffer
     * to a stored-volume gateway.
     * </p>
     * <p>
     * The response includes disk IDs that are configured as working storage,
     * and it includes the amount of working storage allocated and used.
     * </p>
     *
     * @param describeWorkingStorageRequest Container for the necessary
     *           parameters to execute the DescribeWorkingStorage service method on
     *           AWSStorageGateway.
     * 
     * @return The response from the DescribeWorkingStorage service method,
     *         as returned by AWSStorageGateway.
     * 
     * @throws InternalServerErrorException
     * @throws InvalidGatewayRequestException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeWorkingStorageResult describeWorkingStorage(DescribeWorkingStorageRequest describeWorkingStorageRequest) {
        ExecutionContext executionContext = createExecutionContext(describeWorkingStorageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeWorkingStorageRequest> request = null;
        Response<DescribeWorkingStorageResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeWorkingStorageRequestMarshaller().marshall(describeWorkingStorageRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeWorkingStorageResult, JsonUnmarshallerContext> unmarshaller = new DescribeWorkingStorageResultJsonUnmarshaller();
            JsonResponseHandler<DescribeWorkingStorageResult> responseHandler = new JsonResponseHandler<DescribeWorkingStorageResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

   
    /**
     * <p>
     * This operation updates a gateway's weekly maintenance start time
     * information, including day and time of the week. The maintenance time
     * is the time in your gateway's time zone.
     * </p>
     *
     * @param updateMaintenanceStartTimeRequest Container for the necessary
     *           parameters to execute the UpdateMaintenanceStartTime service method on
     *           AWSStorageGateway.
     * 
     * @return The response from the UpdateMaintenanceStartTime service
     *         method, as returned by AWSStorageGateway.
     * 
     * @throws InternalServerErrorException
     * @throws InvalidGatewayRequestException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateMaintenanceStartTimeResult updateMaintenanceStartTime(UpdateMaintenanceStartTimeRequest updateMaintenanceStartTimeRequest) {
        ExecutionContext executionContext = createExecutionContext(updateMaintenanceStartTimeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateMaintenanceStartTimeRequest> request = null;
        Response<UpdateMaintenanceStartTimeResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateMaintenanceStartTimeRequestMarshaller().marshall(updateMaintenanceStartTimeRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateMaintenanceStartTimeResult, JsonUnmarshallerContext> unmarshaller = new UpdateMaintenanceStartTimeResultJsonUnmarshaller();
            JsonResponseHandler<UpdateMaintenanceStartTimeResult> responseHandler = new JsonResponseHandler<UpdateMaintenanceStartTimeResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

   
    /**
     * <p>
     * Deletes the specified virtual tape.
     * </p>
     *
     * @param deleteTapeRequest Container for the necessary parameters to
     *           execute the DeleteTape service method on AWSStorageGateway.
     * 
     * @return The response from the DeleteTape service method, as returned
     *         by AWSStorageGateway.
     * 
     * @throws InternalServerErrorException
     * @throws InvalidGatewayRequestException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteTapeResult deleteTape(DeleteTapeRequest deleteTapeRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteTapeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTapeRequest> request = null;
        Response<DeleteTapeResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTapeRequestMarshaller().marshall(deleteTapeRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteTapeResult, JsonUnmarshallerContext> unmarshaller = new DeleteTapeResultJsonUnmarshaller();
            JsonResponseHandler<DeleteTapeResult> responseHandler = new JsonResponseHandler<DeleteTapeResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

   
    /**
     * <p>
     * This operation starts a gateway that you previously shut down (see
     * ShutdownGateway). After the gateway starts, you can then make other
     * API calls, your applications can read from or write to the gateway's
     * storage volumes and you will be able to take snapshot backups.
     * </p>
     * <p>
     * <b>NOTE:</b>When you make a request, you will get a 200 OK success
     * response immediately. However, it might take some time for the gateway
     * to be ready. You should call DescribeGatewayInformation and check the
     * status before making any additional API calls. For more information,
     * see ActivateGateway.
     * </p>
     * <p>
     * To specify which gateway to start, use the Amazon Resource Name (ARN)
     * of the gateway in your request.
     * </p>
     *
     * @param startGatewayRequest Container for the necessary parameters to
     *           execute the StartGateway service method on AWSStorageGateway.
     * 
     * @return The response from the StartGateway service method, as returned
     *         by AWSStorageGateway.
     * 
     * @throws InternalServerErrorException
     * @throws InvalidGatewayRequestException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public StartGatewayResult startGateway(StartGatewayRequest startGatewayRequest) {
        ExecutionContext executionContext = createExecutionContext(startGatewayRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartGatewayRequest> request = null;
        Response<StartGatewayResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartGatewayRequestMarshaller().marshall(startGatewayRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StartGatewayResult, JsonUnmarshallerContext> unmarshaller = new StartGatewayResultJsonUnmarshaller();
            JsonResponseHandler<StartGatewayResult> responseHandler = new JsonResponseHandler<StartGatewayResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

   
    /**
     * <p>
     * This operation returns an array of Challenge-Handshake Authentication
     * Protocol (CHAP) credentials information for a specified iSCSI target,
     * one for each target-initiator pair.
     * </p>
     *
     * @param describeChapCredentialsRequest Container for the necessary
     *           parameters to execute the DescribeChapCredentials service method on
     *           AWSStorageGateway.
     * 
     * @return The response from the DescribeChapCredentials service method,
     *         as returned by AWSStorageGateway.
     * 
     * @throws InternalServerErrorException
     * @throws InvalidGatewayRequestException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeChapCredentialsResult describeChapCredentials(DescribeChapCredentialsRequest describeChapCredentialsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeChapCredentialsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeChapCredentialsRequest> request = null;
        Response<DescribeChapCredentialsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeChapCredentialsRequestMarshaller().marshall(describeChapCredentialsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeChapCredentialsResult, JsonUnmarshallerContext> unmarshaller = new DescribeChapCredentialsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeChapCredentialsResult> responseHandler = new JsonResponseHandler<DescribeChapCredentialsResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

   
    /**
     * <p>
     * This operation describes the snapshot schedule for the specified
     * gateway volume. The snapshot schedule information includes intervals
     * at which snapshots are automatically initiated on the volume.
     * </p>
     *
     * @param describeSnapshotScheduleRequest Container for the necessary
     *           parameters to execute the DescribeSnapshotSchedule service method on
     *           AWSStorageGateway.
     * 
     * @return The response from the DescribeSnapshotSchedule service method,
     *         as returned by AWSStorageGateway.
     * 
     * @throws InternalServerErrorException
     * @throws InvalidGatewayRequestException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeSnapshotScheduleResult describeSnapshotSchedule(DescribeSnapshotScheduleRequest describeSnapshotScheduleRequest) {
        ExecutionContext executionContext = createExecutionContext(describeSnapshotScheduleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSnapshotScheduleRequest> request = null;
        Response<DescribeSnapshotScheduleResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSnapshotScheduleRequestMarshaller().marshall(describeSnapshotScheduleRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeSnapshotScheduleResult, JsonUnmarshallerContext> unmarshaller = new DescribeSnapshotScheduleResultJsonUnmarshaller();
            JsonResponseHandler<DescribeSnapshotScheduleResult> responseHandler = new JsonResponseHandler<DescribeSnapshotScheduleResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

   
    /**
     * <p>
     * This operation delete the specified gateway volume that you previously
     * created using the CreateStorediSCSIVolume API. For gateway-stored
     * volumes, the local disk that was configured as the storage volume is
     * not deleted. You can reuse the local disk to create another storage
     * volume.
     * </p>
     * <p>
     * Before you delete a gateway volume, make sure there are no iSCSI
     * connections to the volume you are deleting. You should also make sure
     * there is no snapshot in progress. You can use the Amazon Elastic
     * Compute Cloud (Amazon EC2) API to query snapshots on the volume you
     * are deleting and check the snapshot status. For more information, go
     * to <a
     * AWSEC2/latest/APIReference/ApiReference-query-DescribeSnapshots.html">
     * DescribeSnapshots </a> in the <i>Amazon Elastic Compute Cloud API
     * Reference</i> .
     * </p>
     * <p>
     * In the request, you must provide the Amazon Resource Name (ARN) of the
     * storage volume you want to delete.
     * </p>
     *
     * @param deleteVolumeRequest Container for the necessary parameters to
     *           execute the DeleteVolume service method on AWSStorageGateway.
     * 
     * @return The response from the DeleteVolume service method, as returned
     *         by AWSStorageGateway.
     * 
     * @throws InternalServerErrorException
     * @throws InvalidGatewayRequestException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteVolumeResult deleteVolume(DeleteVolumeRequest deleteVolumeRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteVolumeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteVolumeRequest> request = null;
        Response<DeleteVolumeResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteVolumeRequestMarshaller().marshall(deleteVolumeRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteVolumeResult, JsonUnmarshallerContext> unmarshaller = new DeleteVolumeResultJsonUnmarshaller();
            JsonResponseHandler<DeleteVolumeResult> responseHandler = new JsonResponseHandler<DeleteVolumeResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

   
    /**
     * <p>
     * This operation initiates a snapshot of a gateway from a volume
     * recovery point. This operation is supported only for the
     * gateway-cached volume architecture (see ).
     * </p>
     * <p>
     * A volume recovery point is a point in time at which all data of the
     * volume is consistent and from which you can create a snapshot. To get
     * a list of volume recovery point for gateway-cached volumes, use
     * ListVolumeRecoveryPoints.
     * </p>
     * <p>
     * In the <code>CreateSnapshotFromVolumeRecoveryPoint</code> request, you
     * identify the volume by providing its Amazon Resource Name (ARN). You
     * must also provide a description for the snapshot. When AWS Storage
     * Gateway takes a snapshot of the specified volume, the snapshot and its
     * description appear in the AWS Storage Gateway console. In response,
     * AWS Storage Gateway returns you a snapshot ID. You can use this
     * snapshot ID to check the snapshot progress or later use it when you
     * want to create a volume from a snapshot.
     * </p>
     * <p>
     * <b>NOTE:</b> To list or delete a snapshot, you must use the Amazon EC2
     * API. For more information, in Amazon Elastic Compute Cloud API
     * Reference.
     * </p>
     *
     * @param createSnapshotFromVolumeRecoveryPointRequest Container for the
     *           necessary parameters to execute the
     *           CreateSnapshotFromVolumeRecoveryPoint service method on
     *           AWSStorageGateway.
     * 
     * @return The response from the CreateSnapshotFromVolumeRecoveryPoint
     *         service method, as returned by AWSStorageGateway.
     * 
     * @throws InternalServerErrorException
     * @throws InvalidGatewayRequestException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateSnapshotFromVolumeRecoveryPointResult createSnapshotFromVolumeRecoveryPoint(CreateSnapshotFromVolumeRecoveryPointRequest createSnapshotFromVolumeRecoveryPointRequest) {
        ExecutionContext executionContext = createExecutionContext(createSnapshotFromVolumeRecoveryPointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSnapshotFromVolumeRecoveryPointRequest> request = null;
        Response<CreateSnapshotFromVolumeRecoveryPointResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSnapshotFromVolumeRecoveryPointRequestMarshaller().marshall(createSnapshotFromVolumeRecoveryPointRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateSnapshotFromVolumeRecoveryPointResult, JsonUnmarshallerContext> unmarshaller = new CreateSnapshotFromVolumeRecoveryPointResultJsonUnmarshaller();
            JsonResponseHandler<CreateSnapshotFromVolumeRecoveryPointResult> responseHandler = new JsonResponseHandler<CreateSnapshotFromVolumeRecoveryPointResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

   
    /**
     * <p>
     * This operation deletes a gateway. To specify which gateway to delete,
     * use the Amazon Resource Name (ARN) of the gateway in your request. The
     * operation deletes the gateway; however, it does not delete the gateway
     * virtual machine (VM) from your host computer.
     * </p>
     * <p>
     * After you delete a gateway, you cannot reactivate it. Completed
     * snapshots of the gateway volumes are not deleted upon deleting the
     * gateway, however, pending snapshots will not complete. After you
     * delete a gateway, your next step is to remove it from your
     * environment.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> You no longer pay software charges after the gateway
     * is deleted; however, your existing Amazon EBS snapshots persist and
     * you will continue to be billed for these snapshots.??You can choose to
     * remove all remaining Amazon EBS snapshots by canceling your Amazon EC2
     * subscription.?? If you prefer not to cancel your Amazon EC2
     * subscription, you can delete your snapshots using the Amazon EC2
     * console. For more information, see the AWS Storage Gateway Detail
     * Page.
     * </p>
     *
     * @param deleteGatewayRequest Container for the necessary parameters to
     *           execute the DeleteGateway service method on AWSStorageGateway.
     * 
     * @return The response from the DeleteGateway service method, as
     *         returned by AWSStorageGateway.
     * 
     * @throws InternalServerErrorException
     * @throws InvalidGatewayRequestException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteGatewayResult deleteGateway(DeleteGatewayRequest deleteGatewayRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteGatewayRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteGatewayRequest> request = null;
        Response<DeleteGatewayResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteGatewayRequestMarshaller().marshall(deleteGatewayRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteGatewayResult, JsonUnmarshallerContext> unmarshaller = new DeleteGatewayResultJsonUnmarshaller();
            JsonResponseHandler<DeleteGatewayResult> responseHandler = new JsonResponseHandler<DeleteGatewayResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

   
    /**
     * <p>
     * This operation creates a cached volume on a specified cached gateway.
     * This operation is supported only for the gateway-cached volume
     * architecture.
     * </p>
     * <p>
     * <b>NOTE:</b>Cache storage must be allocated to the gateway before you
     * can create a cached volume. Use the AddCache operation to add cache
     * storage to a gateway.
     * </p>
     * <p>
     * In the request, you must specify the gateway, size of the volume in
     * bytes, the iSCSI target name, an IP address on which to expose the
     * target, and a unique client token. In response, AWS Storage Gateway
     * creates the volume and returns information about it such as the volume
     * Amazon Resource Name (ARN), its size, and the iSCSI target ARN that
     * initiators can use to connect to the volume target.
     * </p>
     *
     * @param createCachediSCSIVolumeRequest Container for the necessary
     *           parameters to execute the CreateCachediSCSIVolume service method on
     *           AWSStorageGateway.
     * 
     * @return The response from the CreateCachediSCSIVolume service method,
     *         as returned by AWSStorageGateway.
     * 
     * @throws InternalServerErrorException
     * @throws InvalidGatewayRequestException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateCachediSCSIVolumeResult createCachediSCSIVolume(CreateCachediSCSIVolumeRequest createCachediSCSIVolumeRequest) {
        ExecutionContext executionContext = createExecutionContext(createCachediSCSIVolumeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCachediSCSIVolumeRequest> request = null;
        Response<CreateCachediSCSIVolumeResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateCachediSCSIVolumeRequestMarshaller().marshall(createCachediSCSIVolumeRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateCachediSCSIVolumeResult, JsonUnmarshallerContext> unmarshaller = new CreateCachediSCSIVolumeResultJsonUnmarshaller();
            JsonResponseHandler<CreateCachediSCSIVolumeResult> responseHandler = new JsonResponseHandler<CreateCachediSCSIVolumeResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

   
    /**
     * <p>
     * This operation shuts down a gateway. To specify which gateway to shut
     * down, use the Amazon Resource Name (ARN) of the gateway in the body of
     * your request.
     * </p>
     * <p>
     * The operation shuts down the gateway service component running in the
     * storage gateway's virtual machine (VM) and not the VM.
     * </p>
     * <p>
     * <b>NOTE:</b>If you want to shut down the VM, it is recommended that
     * you first shut down the gateway component in the VM to avoid
     * unpredictable conditions.
     * </p>
     * <p>
     * After the gateway is shutdown, you cannot call any other API except
     * StartGateway, DescribeGatewayInformation, and ListGateways. For more
     * information, see ActivateGateway. Your applications cannot read from
     * or write to the gateway's storage volumes, and there are no snapshots
     * taken.
     * </p>
     * <p>
     * <b>NOTE:</b>When you make a shutdown request, you will get a 200 OK
     * success response immediately. However, it might take some time for the
     * gateway to shut down. You can call the DescribeGatewayInformation API
     * to check the status. For more information, see ActivateGateway.
     * </p>
     * <p>
     * If do not intend to use the gateway again, you must delete the gateway
     * (using DeleteGateway) to no longer pay software charges associated
     * with the gateway.
     * </p>
     *
     * @param shutdownGatewayRequest Container for the necessary parameters
     *           to execute the ShutdownGateway service method on AWSStorageGateway.
     * 
     * @return The response from the ShutdownGateway service method, as
     *         returned by AWSStorageGateway.
     * 
     * @throws InternalServerErrorException
     * @throws InvalidGatewayRequestException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ShutdownGatewayResult shutdownGateway(ShutdownGatewayRequest shutdownGatewayRequest) {
        ExecutionContext executionContext = createExecutionContext(shutdownGatewayRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ShutdownGatewayRequest> request = null;
        Response<ShutdownGatewayResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ShutdownGatewayRequestMarshaller().marshall(shutdownGatewayRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ShutdownGatewayResult, JsonUnmarshallerContext> unmarshaller = new ShutdownGatewayResultJsonUnmarshaller();
            JsonResponseHandler<ShutdownGatewayResult> responseHandler = new JsonResponseHandler<ShutdownGatewayResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

   
    /**
     * <p>
     * This operation deletes the bandwidth rate limits of a gateway. You can
     * delete either the upload and download bandwidth rate limit, or you can
     * delete both. If you delete only one of the limits, the other limit
     * remains unchanged. To specify which gateway to work with, use the
     * Amazon Resource Name (ARN) of the gateway in your request.
     * </p>
     *
     * @param deleteBandwidthRateLimitRequest Container for the necessary
     *           parameters to execute the DeleteBandwidthRateLimit service method on
     *           AWSStorageGateway.
     * 
     * @return The response from the DeleteBandwidthRateLimit service method,
     *         as returned by AWSStorageGateway.
     * 
     * @throws InternalServerErrorException
     * @throws InvalidGatewayRequestException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteBandwidthRateLimitResult deleteBandwidthRateLimit(DeleteBandwidthRateLimitRequest deleteBandwidthRateLimitRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteBandwidthRateLimitRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteBandwidthRateLimitRequest> request = null;
        Response<DeleteBandwidthRateLimitResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteBandwidthRateLimitRequestMarshaller().marshall(deleteBandwidthRateLimitRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteBandwidthRateLimitResult, JsonUnmarshallerContext> unmarshaller = new DeleteBandwidthRateLimitResultJsonUnmarshaller();
            JsonResponseHandler<DeleteBandwidthRateLimitResult> responseHandler = new JsonResponseHandler<DeleteBandwidthRateLimitResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

   
    /**
     * <p>
     * This operation lists the iSCSI stored volumes of a gateway. Results
     * are sorted by volume ARN. The response includes only the volume ARNs.
     * If you want additional volume information, use the
     * DescribeStorediSCSIVolumes API.
     * </p>
     * <p>
     * The operation supports pagination. By default, the operation returns a
     * maximum of up to 100 volumes. You can optionally specify the
     * <code>Limit</code> field in the body to limit the number of volumes in
     * the response. If the number of volumes returned in the response is
     * truncated, the response includes a Marker field. You can use this
     * Marker value in your subsequent request to retrieve the next set of
     * volumes.
     * </p>
     *
     * @param listVolumesRequest Container for the necessary parameters to
     *           execute the ListVolumes service method on AWSStorageGateway.
     * 
     * @return The response from the ListVolumes service method, as returned
     *         by AWSStorageGateway.
     * 
     * @throws InternalServerErrorException
     * @throws InvalidGatewayRequestException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListVolumesResult listVolumes(ListVolumesRequest listVolumesRequest) {
        ExecutionContext executionContext = createExecutionContext(listVolumesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListVolumesRequest> request = null;
        Response<ListVolumesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListVolumesRequestMarshaller().marshall(listVolumesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListVolumesResult, JsonUnmarshallerContext> unmarshaller = new ListVolumesResultJsonUnmarshaller();
            JsonResponseHandler<ListVolumesResult> responseHandler = new JsonResponseHandler<ListVolumesResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

   
    /**
     * <p>
     * Returns a list of virtual tape recovery points that are available for
     * the specified Gateway-Virtual Tape Library.
     * </p>
     * <p>
     * A recovery point is a point in time view of a virtual tape at which
     * all the data on the virtual tape is consistent. If your gateway
     * crashes, virtual tapes that have recovery points can be recovered to a
     * new gateway.
     * </p>
     *
     * @param describeTapeRecoveryPointsRequest Container for the necessary
     *           parameters to execute the DescribeTapeRecoveryPoints service method on
     *           AWSStorageGateway.
     * 
     * @return The response from the DescribeTapeRecoveryPoints service
     *         method, as returned by AWSStorageGateway.
     * 
     * @throws InternalServerErrorException
     * @throws InvalidGatewayRequestException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeTapeRecoveryPointsResult describeTapeRecoveryPoints(DescribeTapeRecoveryPointsRequest describeTapeRecoveryPointsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeTapeRecoveryPointsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTapeRecoveryPointsRequest> request = null;
        Response<DescribeTapeRecoveryPointsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTapeRecoveryPointsRequestMarshaller().marshall(describeTapeRecoveryPointsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeTapeRecoveryPointsResult, JsonUnmarshallerContext> unmarshaller = new DescribeTapeRecoveryPointsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeTapeRecoveryPointsResult> responseHandler = new JsonResponseHandler<DescribeTapeRecoveryPointsResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

   
    /**
     * <p>
     * This operation updates a snapshot schedule configured for a gateway
     * volume.
     * </p>
     * <p>
     * The default snapshot schedule for volume is once every 24 hours,
     * starting at the creation time of the volume. You can use this API to
     * change the snapshot schedule configured for the volume.
     * </p>
     * <p>
     * In the request you must identify the gateway volume whose snapshot
     * schedule you want to update, and the schedule information, including
     * when you want the snapshot to begin on a day and the frequency (in
     * hours) of snapshots.
     * </p>
     *
     * @param updateSnapshotScheduleRequest Container for the necessary
     *           parameters to execute the UpdateSnapshotSchedule service method on
     *           AWSStorageGateway.
     * 
     * @return The response from the UpdateSnapshotSchedule service method,
     *         as returned by AWSStorageGateway.
     * 
     * @throws InternalServerErrorException
     * @throws InvalidGatewayRequestException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateSnapshotScheduleResult updateSnapshotSchedule(UpdateSnapshotScheduleRequest updateSnapshotScheduleRequest) {
        ExecutionContext executionContext = createExecutionContext(updateSnapshotScheduleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateSnapshotScheduleRequest> request = null;
        Response<UpdateSnapshotScheduleResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateSnapshotScheduleRequestMarshaller().marshall(updateSnapshotScheduleRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateSnapshotScheduleResult, JsonUnmarshallerContext> unmarshaller = new UpdateSnapshotScheduleResultJsonUnmarshaller();
            JsonResponseHandler<UpdateSnapshotScheduleResult> responseHandler = new JsonResponseHandler<UpdateSnapshotScheduleResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

   
    /**
     * <p>
     * This operation lists gateways owned by an AWS account in a region
     * specified in the request. The returned list is ordered by gateway
     * Amazon Resource Name (ARN).
     * </p>
     * <p>
     * By default, the operation returns a maximum of 100 gateways. This
     * operation supports pagination that allows you to optionally reduce the
     * number of gateways returned in a response.
     * </p>
     * <p>
     * If you have more gateways than are returned in a response-that is, the
     * response returns only a truncated list of your gateways-the response
     * contains a marker that you can specify in your next request to fetch
     * the next page of gateways.
     * </p>
     *
     * @param listGatewaysRequest Container for the necessary parameters to
     *           execute the ListGateways service method on AWSStorageGateway.
     * 
     * @return The response from the ListGateways service method, as returned
     *         by AWSStorageGateway.
     * 
     * @throws InternalServerErrorException
     * @throws InvalidGatewayRequestException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListGatewaysResult listGateways(ListGatewaysRequest listGatewaysRequest) {
        ExecutionContext executionContext = createExecutionContext(listGatewaysRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListGatewaysRequest> request = null;
        Response<ListGatewaysResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListGatewaysRequestMarshaller().marshall(listGatewaysRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListGatewaysResult, JsonUnmarshallerContext> unmarshaller = new ListGatewaysResultJsonUnmarshaller();
            JsonResponseHandler<ListGatewaysResult> responseHandler = new JsonResponseHandler<ListGatewaysResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

   
    /**
     * <p>
     * This operation configures one or more gateway local disks as upload
     * buffer for a specified gateway. This operation is supported for both
     * the gateway-stored and gateway-cached volume architectures.
     * </p>
     * <p>
     * In the request, you specify the gateway Amazon Resource Name (ARN) to
     * which you want to add upload buffer, and one or more disk IDs that you
     * want to configure as upload buffer.
     * </p>
     *
     * @param addUploadBufferRequest Container for the necessary parameters
     *           to execute the AddUploadBuffer service method on AWSStorageGateway.
     * 
     * @return The response from the AddUploadBuffer service method, as
     *         returned by AWSStorageGateway.
     * 
     * @throws InternalServerErrorException
     * @throws InvalidGatewayRequestException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public AddUploadBufferResult addUploadBuffer(AddUploadBufferRequest addUploadBufferRequest) {
        ExecutionContext executionContext = createExecutionContext(addUploadBufferRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddUploadBufferRequest> request = null;
        Response<AddUploadBufferResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddUploadBufferRequestMarshaller().marshall(addUploadBufferRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AddUploadBufferResult, JsonUnmarshallerContext> unmarshaller = new AddUploadBufferResultJsonUnmarshaller();
            JsonResponseHandler<AddUploadBufferResult> responseHandler = new JsonResponseHandler<AddUploadBufferResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

   
    /**
     * <p>
     * This operation returns a description of the gateway volumes specified
     * in the request. This operation is supported only for the
     * gateway-cached volume architecture.
     * </p>
     * <p>
     * The list of gateway volumes in the request must be from one gateway.
     * In the response Amazon Storage Gateway returns volume information
     * sorted by volume Amazon Resource Name (ARN).
     * </p>
     *
     * @param describeCachediSCSIVolumesRequest Container for the necessary
     *           parameters to execute the DescribeCachediSCSIVolumes service method on
     *           AWSStorageGateway.
     * 
     * @return The response from the DescribeCachediSCSIVolumes service
     *         method, as returned by AWSStorageGateway.
     * 
     * @throws InternalServerErrorException
     * @throws InvalidGatewayRequestException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeCachediSCSIVolumesResult describeCachediSCSIVolumes(DescribeCachediSCSIVolumesRequest describeCachediSCSIVolumesRequest) {
        ExecutionContext executionContext = createExecutionContext(describeCachediSCSIVolumesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCachediSCSIVolumesRequest> request = null;
        Response<DescribeCachediSCSIVolumesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCachediSCSIVolumesRequestMarshaller().marshall(describeCachediSCSIVolumesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeCachediSCSIVolumesResult, JsonUnmarshallerContext> unmarshaller = new DescribeCachediSCSIVolumesResultJsonUnmarshaller();
            JsonResponseHandler<DescribeCachediSCSIVolumesResult> responseHandler = new JsonResponseHandler<DescribeCachediSCSIVolumesResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

   
    /**
     * <p>
     * This operation returns description of the gateway volumes specified in
     * the request. The list of gateway volumes in the request must be from
     * one gateway. In the response Amazon Storage Gateway returns volume
     * information sorted by volume ARNs.
     * </p>
     *
     * @param describeStorediSCSIVolumesRequest Container for the necessary
     *           parameters to execute the DescribeStorediSCSIVolumes service method on
     *           AWSStorageGateway.
     * 
     * @return The response from the DescribeStorediSCSIVolumes service
     *         method, as returned by AWSStorageGateway.
     * 
     * @throws InternalServerErrorException
     * @throws InvalidGatewayRequestException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeStorediSCSIVolumesResult describeStorediSCSIVolumes(DescribeStorediSCSIVolumesRequest describeStorediSCSIVolumesRequest) {
        ExecutionContext executionContext = createExecutionContext(describeStorediSCSIVolumesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeStorediSCSIVolumesRequest> request = null;
        Response<DescribeStorediSCSIVolumesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeStorediSCSIVolumesRequestMarshaller().marshall(describeStorediSCSIVolumesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeStorediSCSIVolumesResult, JsonUnmarshallerContext> unmarshaller = new DescribeStorediSCSIVolumesResultJsonUnmarshaller();
            JsonResponseHandler<DescribeStorediSCSIVolumesResult> responseHandler = new JsonResponseHandler<DescribeStorediSCSIVolumesResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

   
    /**
     * <p>
     * This operation lists the recovery points for a specified gateway. This
     * operation is supported only for the gateway-cached volume
     * architecture.
     * </p>
     * <p>
     * Each gateway-cached volume has one recovery point. A volume recovery
     * point is a point in time at which all data of the volume is consistent
     * and from which you can create a snapshot. To create a snapshot from a
     * volume recovery point use the CreateSnapshotFromVolumeRecoveryPoint
     * operation.
     * </p>
     *
     * @param listVolumeRecoveryPointsRequest Container for the necessary
     *           parameters to execute the ListVolumeRecoveryPoints service method on
     *           AWSStorageGateway.
     * 
     * @return The response from the ListVolumeRecoveryPoints service method,
     *         as returned by AWSStorageGateway.
     * 
     * @throws InternalServerErrorException
     * @throws InvalidGatewayRequestException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListVolumeRecoveryPointsResult listVolumeRecoveryPoints(ListVolumeRecoveryPointsRequest listVolumeRecoveryPointsRequest) {
        ExecutionContext executionContext = createExecutionContext(listVolumeRecoveryPointsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListVolumeRecoveryPointsRequest> request = null;
        Response<ListVolumeRecoveryPointsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListVolumeRecoveryPointsRequestMarshaller().marshall(listVolumeRecoveryPointsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListVolumeRecoveryPointsResult, JsonUnmarshallerContext> unmarshaller = new ListVolumeRecoveryPointsResultJsonUnmarshaller();
            JsonResponseHandler<ListVolumeRecoveryPointsResult> responseHandler = new JsonResponseHandler<ListVolumeRecoveryPointsResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

   
    /**
     * <p>
     * Returns a description of Virtual Tape Library (VTL) devices for the
     * gateway specified in the request. In the response, AWS Storage Gateway
     * returns Virtual Tape Library device information.
     * </p>
     * <p>
     * The list of Virtual Tape Library devices in the request must be from
     * one gateway.
     * </p>
     *
     * @param describeVTLDevicesRequest Container for the necessary
     *           parameters to execute the DescribeVTLDevices service method on
     *           AWSStorageGateway.
     * 
     * @return The response from the DescribeVTLDevices service method, as
     *         returned by AWSStorageGateway.
     * 
     * @throws InternalServerErrorException
     * @throws InvalidGatewayRequestException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeVTLDevicesResult describeVTLDevices(DescribeVTLDevicesRequest describeVTLDevicesRequest) {
        ExecutionContext executionContext = createExecutionContext(describeVTLDevicesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeVTLDevicesRequest> request = null;
        Response<DescribeVTLDevicesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeVTLDevicesRequestMarshaller().marshall(describeVTLDevicesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeVTLDevicesResult, JsonUnmarshallerContext> unmarshaller = new DescribeVTLDevicesResultJsonUnmarshaller();
            JsonResponseHandler<DescribeVTLDevicesResult> responseHandler = new JsonResponseHandler<DescribeVTLDevicesResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

   
    /**
     * <p>
     * Retrieves an archived virtual tape from the Virtual Tape Shelf (VTS)
     * to a Gateway-Virtual Tape Library. Virtual tapes archived in the
     * Virtual Tape Shelf (VTS) are not associated with any gateway. However
     * after a tape is retrieved, it is associated with a gateway though it
     * also listed in VTS.
     * </p>
     * <p>
     * Once a tape is successfully retrieved to a gateway, it cannot be
     * retrieved again to another gateway. You must archive the tape again
     * before you can retrieve it to another gateway.
     * </p>
     *
     * @param retrieveTapeArchiveRequest Container for the necessary
     *           parameters to execute the RetrieveTapeArchive service method on
     *           AWSStorageGateway.
     * 
     * @return The response from the RetrieveTapeArchive service method, as
     *         returned by AWSStorageGateway.
     * 
     * @throws InternalServerErrorException
     * @throws InvalidGatewayRequestException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public RetrieveTapeArchiveResult retrieveTapeArchive(RetrieveTapeArchiveRequest retrieveTapeArchiveRequest) {
        ExecutionContext executionContext = createExecutionContext(retrieveTapeArchiveRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RetrieveTapeArchiveRequest> request = null;
        Response<RetrieveTapeArchiveResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RetrieveTapeArchiveRequestMarshaller().marshall(retrieveTapeArchiveRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<RetrieveTapeArchiveResult, JsonUnmarshallerContext> unmarshaller = new RetrieveTapeArchiveResultJsonUnmarshaller();
            JsonResponseHandler<RetrieveTapeArchiveResult> responseHandler = new JsonResponseHandler<RetrieveTapeArchiveResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

   
    /**
     * <p>
     * Cancels archiving of a virtual tape to the Virtual Tape Shelf (VTS)
     * after archiving process is initiated.
     * </p>
     *
     * @param cancelArchivalRequest Container for the necessary parameters to
     *           execute the CancelArchival service method on AWSStorageGateway.
     * 
     * @return The response from the CancelArchival service method, as
     *         returned by AWSStorageGateway.
     * 
     * @throws InternalServerErrorException
     * @throws InvalidGatewayRequestException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CancelArchivalResult cancelArchival(CancelArchivalRequest cancelArchivalRequest) {
        ExecutionContext executionContext = createExecutionContext(cancelArchivalRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelArchivalRequest> request = null;
        Response<CancelArchivalResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelArchivalRequestMarshaller().marshall(cancelArchivalRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CancelArchivalResult, JsonUnmarshallerContext> unmarshaller = new CancelArchivalResultJsonUnmarshaller();
            JsonResponseHandler<CancelArchivalResult> responseHandler = new JsonResponseHandler<CancelArchivalResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

   
    /**
     * <p>
     * Returns a description of specified virtual tapes in the Virtual Tape
     * Shelf (VTS).
     * </p>
     * <p>
     * If a specific <code>TapeARN</code> is not specified, AWS Storage
     * Gateway returns a description all virtual tapes found in the Virtual
     * Tape Shelf (VTS) associated with your account.
     * </p>
     * 
     * @return The response from the DescribeTapeArchives service method, as
     *         returned by AWSStorageGateway.
     * 
     * @throws InternalServerErrorException
     * @throws InvalidGatewayRequestException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeTapeArchivesResult describeTapeArchives() throws AmazonServiceException, AmazonClientException {
        return describeTapeArchives(new DescribeTapeArchivesRequest());
    }
    
    /**
     * <p>
     * This operation lists gateways owned by an AWS account in a region
     * specified in the request. The returned list is ordered by gateway
     * Amazon Resource Name (ARN).
     * </p>
     * <p>
     * By default, the operation returns a maximum of 100 gateways. This
     * operation supports pagination that allows you to optionally reduce the
     * number of gateways returned in a response.
     * </p>
     * <p>
     * If you have more gateways than are returned in a response-that is, the
     * response returns only a truncated list of your gateways-the response
     * contains a marker that you can specify in your next request to fetch
     * the next page of gateways.
     * </p>
     * 
     * @return The response from the ListGateways service method, as returned
     *         by AWSStorageGateway.
     * 
     * @throws InternalServerErrorException
     * @throws InvalidGatewayRequestException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListGatewaysResult listGateways() throws AmazonServiceException, AmazonClientException {
        return listGateways(new ListGatewaysRequest());
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
        