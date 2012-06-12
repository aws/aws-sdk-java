/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.amazonaws.*;
import com.amazonaws.auth.*;
import com.amazonaws.handlers.HandlerChainFactory;
import com.amazonaws.handlers.RequestHandler;
import com.amazonaws.http.HttpResponseHandler;
import com.amazonaws.http.JsonResponseHandler;
import com.amazonaws.http.JsonErrorResponseHandler;
import com.amazonaws.http.ExecutionContext;
import com.amazonaws.internal.StaticCredentialsProvider;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.JsonErrorUnmarshaller;
import com.amazonaws.util.json.JSONObject;

import com.amazonaws.services.storagegateway.model.*;
import com.amazonaws.services.storagegateway.model.transform.*;


/**
 * Client for accessing AWSStorageGateway.  All service calls made
 * using this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * AWS Storage Gateway Service <p>
 * AWS Storage Gateway is a service that connects an on-premises software appliance with cloud-based storage to provide seamless and secure integration
 * between an organization's on-premises IT environment and AWS's storage infrastructure. The service enables you to securely upload data to the AWS
 * cloud for cost effective backup and rapid disaster recovery.
 * </p>
 * <p>
 * Use the following links to get started using the <i>AWS Storage Gateway Service API Reference</i> :
 * </p>
 * 
 * <ul>
 * <li> <a href="http://docs.amazonwebservices.com/storagegateway/latest/userguide/AWSStorageGatewayHTTPRequestsHeaders.html"> AWS Storage Gateway
 * Required Request Headers </a> : Describes the required headers that you must send with every POST request to AWS Storage Gateway.</li>
 * <li> <a href="http://docs.amazonwebservices.com/storagegateway/latest/userguide/AWSStorageGatewaySigningRequests.html"> Signing Requests </a> : AWS
 * Storage Gateway requires that you authenticate every request you send; this topic describes how sign such a request.</li>
 * <li> <a href="http://docs.amazonwebservices.com/storagegateway/latest/userguide/APIErrorResponses.html"> Error Responses </a> : Provides reference
 * information about AWS Storage Gateway errors.</li>
 * <li> <a href="http://docs.amazonwebservices.com/storagegateway/latest/userguide/AWSStorageGatewayAPIOperations.html"> Operations in AWS Storage
 * Gateway </a> : Contains detailed descriptions of all AWS Storage Gateway operations, their request parameters, response elements, possible errors, and
 * examples of requests and responses.</li>
 * <li> <a href="http://docs.amazonwebservices.com/general/latest/gr/index.html?rande.html"> AWS Storage Gateway Regions and Endpoints </a> : Provides a
 * list of each of the regions and endpoints available for use with AWS Storage Gateway. </li>
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

    
    /** AWS signer for authenticating requests. */
    private AWS4Signer signer;


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
     * @see DefaultAWSCredentialsProvider
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
     * @see DefaultAWSCredentialsProvider
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
        setEndpoint("storagegateway.us-east-1.amazonaws.com");

        signer = new AWS4Signer();
        

        HandlerChainFactory chainFactory = new HandlerChainFactory();
		requestHandlers.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/storagegateway/request.handlers"));

        
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
    public DescribeBandwidthRateLimitResult describeBandwidthRateLimit(DescribeBandwidthRateLimitRequest describeBandwidthRateLimitRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeBandwidthRateLimitRequest> request = new DescribeBandwidthRateLimitRequestMarshaller().marshall(describeBandwidthRateLimitRequest);

		Unmarshaller<DescribeBandwidthRateLimitResult, JsonUnmarshallerContext> unmarshaller = new DescribeBandwidthRateLimitResultJsonUnmarshaller();
        JsonResponseHandler<DescribeBandwidthRateLimitResult> responseHandler = new JsonResponseHandler<DescribeBandwidthRateLimitResult>(unmarshaller);

		

        return invoke(request, responseHandler);
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
    public ShutdownGatewayResult shutdownGateway(ShutdownGatewayRequest shutdownGatewayRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<ShutdownGatewayRequest> request = new ShutdownGatewayRequestMarshaller().marshall(shutdownGatewayRequest);

		Unmarshaller<ShutdownGatewayResult, JsonUnmarshallerContext> unmarshaller = new ShutdownGatewayResultJsonUnmarshaller();
        JsonResponseHandler<ShutdownGatewayResult> responseHandler = new JsonResponseHandler<ShutdownGatewayResult>(unmarshaller);

		

        return invoke(request, responseHandler);
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
     * In the CreateSnapshot request you identify the volume by providing
     * it's Amazon Resource Name (ARN). You must also provide description for
     * the snapshot. When AWS Storage Gateway takes the snapshot of specified
     * volume, the snapshot and description appears in the AWS Storage
     * Gateway Console. In response, AWS Storage Gateway returns you a
     * snapshot ID. You can use this snapshot ID to check the snapshot
     * progress or later use it when you want to create a volume from a
     * snapshot.
     * </p>
     * <p>
     * <b>NOTE:</b>To list or delete a snapshot, you must use the Amazon EC2
     * API. For more information, go to DeleteSnapshot and DescribeSnapshots
     * in the Amazon Elastic Compute Cloud API Reference.
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
    public CreateSnapshotResult createSnapshot(CreateSnapshotRequest createSnapshotRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<CreateSnapshotRequest> request = new CreateSnapshotRequestMarshaller().marshall(createSnapshotRequest);

		Unmarshaller<CreateSnapshotResult, JsonUnmarshallerContext> unmarshaller = new CreateSnapshotResultJsonUnmarshaller();
        JsonResponseHandler<CreateSnapshotResult> responseHandler = new JsonResponseHandler<CreateSnapshotResult>(unmarshaller);

		

        return invoke(request, responseHandler);
    }
    
    /**
     * <p>
     * This operation delete the specified gateway volume that you previously
     * created using the CreateStorediSCSIVolume API. The gateway local disk
     * that was configured as the storage volume is not deleted. You can
     * reuse the local disk to create another storage volume.
     * </p>
     * <p>
     * Before you delete a gateway volume, make sure there are no iSCSI
     * connections to the volume you are deleting. You should also make sure
     * there is no snapshot in progress. You can use the Amazon Elastic
     * Compute Cloud (EC2) API to query snapshots on the volume you are
     * deleting and check the snapshot status. For more information, go to <a
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
    public DeleteVolumeResult deleteVolume(DeleteVolumeRequest deleteVolumeRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DeleteVolumeRequest> request = new DeleteVolumeRequestMarshaller().marshall(deleteVolumeRequest);

		Unmarshaller<DeleteVolumeResult, JsonUnmarshallerContext> unmarshaller = new DeleteVolumeResultJsonUnmarshaller();
        JsonResponseHandler<DeleteVolumeResult> responseHandler = new JsonResponseHandler<DeleteVolumeResult>(unmarshaller);

		

        return invoke(request, responseHandler);
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
    public UpdateMaintenanceStartTimeResult updateMaintenanceStartTime(UpdateMaintenanceStartTimeRequest updateMaintenanceStartTimeRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<UpdateMaintenanceStartTimeRequest> request = new UpdateMaintenanceStartTimeRequestMarshaller().marshall(updateMaintenanceStartTimeRequest);

		Unmarshaller<UpdateMaintenanceStartTimeResult, JsonUnmarshallerContext> unmarshaller = new UpdateMaintenanceStartTimeResultJsonUnmarshaller();
        JsonResponseHandler<UpdateMaintenanceStartTimeResult> responseHandler = new JsonResponseHandler<UpdateMaintenanceStartTimeResult>(unmarshaller);

		

        return invoke(request, responseHandler);
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
    public DescribeGatewayInformationResult describeGatewayInformation(DescribeGatewayInformationRequest describeGatewayInformationRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeGatewayInformationRequest> request = new DescribeGatewayInformationRequestMarshaller().marshall(describeGatewayInformationRequest);

		Unmarshaller<DescribeGatewayInformationResult, JsonUnmarshallerContext> unmarshaller = new DescribeGatewayInformationResultJsonUnmarshaller();
        JsonResponseHandler<DescribeGatewayInformationResult> responseHandler = new JsonResponseHandler<DescribeGatewayInformationResult>(unmarshaller);

		

        return invoke(request, responseHandler);
    }
    
    /**
     * <p>
     * This operation creates a volume on a specified gateway. The size of
     * the volume is inferred from the disk size. You can choose to preserve
     * existing data on the disk, create volume from an existing snapshot, or
     * create an empty volume. If you choose to create an empty gateway
     * volume, then any existing data on the disk is erased.
     * </p>
     * <p>
     * In the request you must specify the gateway and the disk information
     * on which you are creating the volume. In response, AWS Storage Gateway
     * creates the volume and returns volume information such as the volume
     * ARN, size and the iSCSI target ARN that initiators can use to connect
     * to the volume target.
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
    public CreateStorediSCSIVolumeResult createStorediSCSIVolume(CreateStorediSCSIVolumeRequest createStorediSCSIVolumeRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<CreateStorediSCSIVolumeRequest> request = new CreateStorediSCSIVolumeRequestMarshaller().marshall(createStorediSCSIVolumeRequest);

		Unmarshaller<CreateStorediSCSIVolumeResult, JsonUnmarshallerContext> unmarshaller = new CreateStorediSCSIVolumeResultJsonUnmarshaller();
        JsonResponseHandler<CreateStorediSCSIVolumeResult> responseHandler = new JsonResponseHandler<CreateStorediSCSIVolumeResult>(unmarshaller);

		

        return invoke(request, responseHandler);
    }
    
    /**
     * <p>
     * This operation updates the Challenge-Handshake Authentication Protocol
     * (CHAP) credentials for a specified iSCSI target. By default, a gateway
     * does not have CHAP enabled; however, for added security, you might use
     * it.
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
    public UpdateChapCredentialsResult updateChapCredentials(UpdateChapCredentialsRequest updateChapCredentialsRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<UpdateChapCredentialsRequest> request = new UpdateChapCredentialsRequestMarshaller().marshall(updateChapCredentialsRequest);

		Unmarshaller<UpdateChapCredentialsResult, JsonUnmarshallerContext> unmarshaller = new UpdateChapCredentialsResultJsonUnmarshaller();
        JsonResponseHandler<UpdateChapCredentialsResult> responseHandler = new JsonResponseHandler<UpdateChapCredentialsResult>(unmarshaller);

		

        return invoke(request, responseHandler);
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
    public StartGatewayResult startGateway(StartGatewayRequest startGatewayRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<StartGatewayRequest> request = new StartGatewayRequestMarshaller().marshall(startGatewayRequest);

		Unmarshaller<StartGatewayResult, JsonUnmarshallerContext> unmarshaller = new StartGatewayResultJsonUnmarshaller();
        JsonResponseHandler<StartGatewayResult> responseHandler = new JsonResponseHandler<StartGatewayResult>(unmarshaller);

		

        return invoke(request, responseHandler);
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
    public DeleteBandwidthRateLimitResult deleteBandwidthRateLimit(DeleteBandwidthRateLimitRequest deleteBandwidthRateLimitRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DeleteBandwidthRateLimitRequest> request = new DeleteBandwidthRateLimitRequestMarshaller().marshall(deleteBandwidthRateLimitRequest);

		Unmarshaller<DeleteBandwidthRateLimitResult, JsonUnmarshallerContext> unmarshaller = new DeleteBandwidthRateLimitResultJsonUnmarshaller();
        JsonResponseHandler<DeleteBandwidthRateLimitResult> responseHandler = new JsonResponseHandler<DeleteBandwidthRateLimitResult>(unmarshaller);

		

        return invoke(request, responseHandler);
    }
    
    /**
     * <p>
     * This operation updates a snapshot schedule configured for a gateway
     * volume.
     * </p>
     * <p>
     * The default snapshot schedule for volume is once every 24 hours,
     * starting at the creation time of the volume. You can use this API to
     * change the shapshot schedule configured for the volume.
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
    public UpdateSnapshotScheduleResult updateSnapshotSchedule(UpdateSnapshotScheduleRequest updateSnapshotScheduleRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<UpdateSnapshotScheduleRequest> request = new UpdateSnapshotScheduleRequestMarshaller().marshall(updateSnapshotScheduleRequest);

		Unmarshaller<UpdateSnapshotScheduleResult, JsonUnmarshallerContext> unmarshaller = new UpdateSnapshotScheduleResultJsonUnmarshaller();
        JsonResponseHandler<UpdateSnapshotScheduleResult> responseHandler = new JsonResponseHandler<UpdateSnapshotScheduleResult>(unmarshaller);

		

        return invoke(request, responseHandler);
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
    public DescribeMaintenanceStartTimeResult describeMaintenanceStartTime(DescribeMaintenanceStartTimeRequest describeMaintenanceStartTimeRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeMaintenanceStartTimeRequest> request = new DescribeMaintenanceStartTimeRequestMarshaller().marshall(describeMaintenanceStartTimeRequest);

		Unmarshaller<DescribeMaintenanceStartTimeResult, JsonUnmarshallerContext> unmarshaller = new DescribeMaintenanceStartTimeResultJsonUnmarshaller();
        JsonResponseHandler<DescribeMaintenanceStartTimeResult> responseHandler = new JsonResponseHandler<DescribeMaintenanceStartTimeResult>(unmarshaller);

		

        return invoke(request, responseHandler);
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
    public DescribeSnapshotScheduleResult describeSnapshotSchedule(DescribeSnapshotScheduleRequest describeSnapshotScheduleRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeSnapshotScheduleRequest> request = new DescribeSnapshotScheduleRequestMarshaller().marshall(describeSnapshotScheduleRequest);

		Unmarshaller<DescribeSnapshotScheduleResult, JsonUnmarshallerContext> unmarshaller = new DescribeSnapshotScheduleResultJsonUnmarshaller();
        JsonResponseHandler<DescribeSnapshotScheduleResult> responseHandler = new JsonResponseHandler<DescribeSnapshotScheduleResult>(unmarshaller);

		

        return invoke(request, responseHandler);
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
    public UpdateBandwidthRateLimitResult updateBandwidthRateLimit(UpdateBandwidthRateLimitRequest updateBandwidthRateLimitRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<UpdateBandwidthRateLimitRequest> request = new UpdateBandwidthRateLimitRequestMarshaller().marshall(updateBandwidthRateLimitRequest);

		Unmarshaller<UpdateBandwidthRateLimitResult, JsonUnmarshallerContext> unmarshaller = new UpdateBandwidthRateLimitResultJsonUnmarshaller();
        JsonResponseHandler<UpdateBandwidthRateLimitResult> responseHandler = new JsonResponseHandler<UpdateBandwidthRateLimitResult>(unmarshaller);

		

        return invoke(request, responseHandler);
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
    public DeleteChapCredentialsResult deleteChapCredentials(DeleteChapCredentialsRequest deleteChapCredentialsRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DeleteChapCredentialsRequest> request = new DeleteChapCredentialsRequestMarshaller().marshall(deleteChapCredentialsRequest);

		Unmarshaller<DeleteChapCredentialsResult, JsonUnmarshallerContext> unmarshaller = new DeleteChapCredentialsResultJsonUnmarshaller();
        JsonResponseHandler<DeleteChapCredentialsResult> responseHandler = new JsonResponseHandler<DeleteChapCredentialsResult>(unmarshaller);

		

        return invoke(request, responseHandler);
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
    public DescribeStorediSCSIVolumesResult describeStorediSCSIVolumes(DescribeStorediSCSIVolumesRequest describeStorediSCSIVolumesRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeStorediSCSIVolumesRequest> request = new DescribeStorediSCSIVolumesRequestMarshaller().marshall(describeStorediSCSIVolumesRequest);

		Unmarshaller<DescribeStorediSCSIVolumesResult, JsonUnmarshallerContext> unmarshaller = new DescribeStorediSCSIVolumesResultJsonUnmarshaller();
        JsonResponseHandler<DescribeStorediSCSIVolumesResult> responseHandler = new JsonResponseHandler<DescribeStorediSCSIVolumesResult>(unmarshaller);

		

        return invoke(request, responseHandler);
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
    public UpdateGatewayInformationResult updateGatewayInformation(UpdateGatewayInformationRequest updateGatewayInformationRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<UpdateGatewayInformationRequest> request = new UpdateGatewayInformationRequestMarshaller().marshall(updateGatewayInformationRequest);

		Unmarshaller<UpdateGatewayInformationResult, JsonUnmarshallerContext> unmarshaller = new UpdateGatewayInformationResultJsonUnmarshaller();
        JsonResponseHandler<UpdateGatewayInformationResult> responseHandler = new JsonResponseHandler<UpdateGatewayInformationResult>(unmarshaller);

		

        return invoke(request, responseHandler);
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
    public DeleteGatewayResult deleteGateway(DeleteGatewayRequest deleteGatewayRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DeleteGatewayRequest> request = new DeleteGatewayRequestMarshaller().marshall(deleteGatewayRequest);

		Unmarshaller<DeleteGatewayResult, JsonUnmarshallerContext> unmarshaller = new DeleteGatewayResultJsonUnmarshaller();
        JsonResponseHandler<DeleteGatewayResult> responseHandler = new JsonResponseHandler<DeleteGatewayResult>(unmarshaller);

		

        return invoke(request, responseHandler);
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
    public ListVolumesResult listVolumes(ListVolumesRequest listVolumesRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<ListVolumesRequest> request = new ListVolumesRequestMarshaller().marshall(listVolumesRequest);

		Unmarshaller<ListVolumesResult, JsonUnmarshallerContext> unmarshaller = new ListVolumesResultJsonUnmarshaller();
        JsonResponseHandler<ListVolumesResult> responseHandler = new JsonResponseHandler<ListVolumesResult>(unmarshaller);

		

        return invoke(request, responseHandler);
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
    public ListLocalDisksResult listLocalDisks(ListLocalDisksRequest listLocalDisksRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<ListLocalDisksRequest> request = new ListLocalDisksRequestMarshaller().marshall(listLocalDisksRequest);

		Unmarshaller<ListLocalDisksResult, JsonUnmarshallerContext> unmarshaller = new ListLocalDisksResultJsonUnmarshaller();
        JsonResponseHandler<ListLocalDisksResult> responseHandler = new JsonResponseHandler<ListLocalDisksResult>(unmarshaller);

		

        return invoke(request, responseHandler);
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
    public DescribeChapCredentialsResult describeChapCredentials(DescribeChapCredentialsRequest describeChapCredentialsRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeChapCredentialsRequest> request = new DescribeChapCredentialsRequestMarshaller().marshall(describeChapCredentialsRequest);

		Unmarshaller<DescribeChapCredentialsResult, JsonUnmarshallerContext> unmarshaller = new DescribeChapCredentialsResultJsonUnmarshaller();
        JsonResponseHandler<DescribeChapCredentialsResult> responseHandler = new JsonResponseHandler<DescribeChapCredentialsResult>(unmarshaller);

		

        return invoke(request, responseHandler);
    }
    
    /**
     * <p>
     * This operation updates the gateway virtual machine (VM) software. The
     * request immediately triggers the software update. Before initiating
     * this update, make sure there is no traffic to the gateway.
     * </p>
     * <p>
     * Before sending this request, you should make sure all your
     * applications have finished writing to your gateway's storage volumes
     * in order to avoid data loss. During the update, applications cannot
     * use the gateway's storage volumes.
     * </p>
     * <p>
     * <b>NOTE:</b>When you make this request, you get a 200 OK success
     * response immediately. However, it might take some time for the update
     * to complete. You can call DescribeGatewayInformation to verify the
     * gateway is in the STATE_RUNNING state.
     * </p>
     * <p>
     * <b>NOTE:</b>A software update forces a system restart of your gateway.
     * You can minimize the chance of any disruption to your applications by
     * increasing your iSCSI Initiators' timeouts. For more information about
     * increasing iSCSI Initiator timeouts for Windows and Linux, see
     * Customizing Your Windows iSCSI Settings and Customizing Your Linux
     * iSCSI Settings, respectively.
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
    public UpdateGatewaySoftwareNowResult updateGatewaySoftwareNow(UpdateGatewaySoftwareNowRequest updateGatewaySoftwareNowRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<UpdateGatewaySoftwareNowRequest> request = new UpdateGatewaySoftwareNowRequestMarshaller().marshall(updateGatewaySoftwareNowRequest);

		Unmarshaller<UpdateGatewaySoftwareNowResult, JsonUnmarshallerContext> unmarshaller = new UpdateGatewaySoftwareNowResultJsonUnmarshaller();
        JsonResponseHandler<UpdateGatewaySoftwareNowResult> responseHandler = new JsonResponseHandler<UpdateGatewaySoftwareNowResult>(unmarshaller);

		

        return invoke(request, responseHandler);
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
    public ListGatewaysResult listGateways(ListGatewaysRequest listGatewaysRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<ListGatewaysRequest> request = new ListGatewaysRequestMarshaller().marshall(listGatewaysRequest);

		Unmarshaller<ListGatewaysResult, JsonUnmarshallerContext> unmarshaller = new ListGatewaysResultJsonUnmarshaller();
        JsonResponseHandler<ListGatewaysResult> responseHandler = new JsonResponseHandler<ListGatewaysResult>(unmarshaller);

		

        return invoke(request, responseHandler);
    }
    
    /**
     * <p>
     * This operation returns information about the working storage of a
     * gateway. The response includes disk IDs that are configured as working
     * storage, and it includes the amount of working storage allocated and
     * used.
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
    public DescribeWorkingStorageResult describeWorkingStorage(DescribeWorkingStorageRequest describeWorkingStorageRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeWorkingStorageRequest> request = new DescribeWorkingStorageRequestMarshaller().marshall(describeWorkingStorageRequest);

		Unmarshaller<DescribeWorkingStorageResult, JsonUnmarshallerContext> unmarshaller = new DescribeWorkingStorageResultJsonUnmarshaller();
        JsonResponseHandler<DescribeWorkingStorageResult> responseHandler = new JsonResponseHandler<DescribeWorkingStorageResult>(unmarshaller);

		

        return invoke(request, responseHandler);
    }
    
    /**
     * <p>
     * This operation configures one or more gateway local disks as working
     * storage.
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
    public AddWorkingStorageResult addWorkingStorage(AddWorkingStorageRequest addWorkingStorageRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<AddWorkingStorageRequest> request = new AddWorkingStorageRequestMarshaller().marshall(addWorkingStorageRequest);

		Unmarshaller<AddWorkingStorageResult, JsonUnmarshallerContext> unmarshaller = new AddWorkingStorageResultJsonUnmarshaller();
        JsonResponseHandler<AddWorkingStorageResult> responseHandler = new JsonResponseHandler<AddWorkingStorageResult>(unmarshaller);

		

        return invoke(request, responseHandler);
    }
    
    /**
     * <p>
     * This operation activates the gateway you previously deployed on your
     * VMware host. For more information, see DownloadAndDeploy. In the
     * activation process you specify information such as the region you want
     * to use for storing snapshots, the time zone for scheduled snapshots
     * and the gateway schedule window, an activation key, and a name for
     * your gateway. The activation process also associates your gateway with
     * your account.
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
    public ActivateGatewayResult activateGateway(ActivateGatewayRequest activateGatewayRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<ActivateGatewayRequest> request = new ActivateGatewayRequestMarshaller().marshall(activateGatewayRequest);

		Unmarshaller<ActivateGatewayResult, JsonUnmarshallerContext> unmarshaller = new ActivateGatewayResultJsonUnmarshaller();
        JsonResponseHandler<ActivateGatewayResult> responseHandler = new JsonResponseHandler<ActivateGatewayResult>(unmarshaller);

		

        return invoke(request, responseHandler);
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
    
    /**
     * Overrides the default endpoint for this client and explicitly provides
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
     * Callers can pass in just the endpoint (ex: "ec2.amazonaws.com") or a full
     * URL, including the protocol (ex: "https://ec2.amazonaws.com"). If the
     * protocol is not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see:
     * <a href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     *
     * @param endpoint
     *            The endpoint (ex: "ec2.amazonaws.com") or a full URL,
     *            including the protocol (ex: "https://ec2.amazonaws.com") of
     *            the region specific AWS endpoint this client will communicate
     *            with.
     * @param serviceName
     *            The name of the AWS service to use when signing requests.
     * @param regionId
     *            The ID of the region in which this service resides.
     *
     * @throws IllegalArgumentException
     *             If any problems are detected with the specified endpoint.
     */
    public void setEndpoint(String endpoint, String serviceName, String regionId) throws IllegalArgumentException {
        setEndpoint(endpoint);
        signer.setServiceName(serviceName);
        signer.setRegionName(regionId);
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

    private <X, Y extends AmazonWebServiceRequest> X invoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler) {
        request.setEndpoint(endpoint);

        AWSCredentials credentials = awsCredentialsProvider.getCredentials();
        AmazonWebServiceRequest originalRequest = request.getOriginalRequest();
        if (originalRequest != null && originalRequest.getRequestCredentials() != null) {
        	credentials = originalRequest.getRequestCredentials();
        }

        ExecutionContext executionContext = createExecutionContext();
        executionContext.setSigner(signer);
        executionContext.setCredentials(credentials);
        
        JsonErrorResponseHandler errorResponseHandler = new JsonErrorResponseHandler(exceptionUnmarshallers);

        return (X)client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }

}
        