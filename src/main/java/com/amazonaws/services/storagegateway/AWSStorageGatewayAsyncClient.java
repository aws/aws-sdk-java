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

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.handlers.AsyncHandler;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

import com.amazonaws.services.storagegateway.model.*;


/**
 * Asynchronous client for accessing AWSStorageGateway.
 * All asynchronous calls made using this client are non-blocking. Callers could either
 * process the result and handle the exceptions in the worker thread by providing a callback handler
 * when making the call, or use the returned Future object to check the result of the call in the calling thread.
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
public class AWSStorageGatewayAsyncClient extends AWSStorageGatewayClient
        implements AWSStorageGatewayAsync {

    /**
     * Executor service for executing asynchronous requests.
     */
    private ExecutorService executorService;


    /**
     * Constructs a new asynchronous client to invoke service methods on
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
    public AWSStorageGatewayAsyncClient() {
        this(new DefaultAWSCredentialsProviderChain());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
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
    public AWSStorageGatewayAsyncClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration, Executors.newCachedThreadPool());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSStorageGateway using the specified AWS account credentials.
     * Default client settings will be used, and a default cached thread pool will be
     * created for executing the asynchronous tasks.
     *
     * <p>
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     */
    public AWSStorageGatewayAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, Executors.newCachedThreadPool());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSStorageGateway using the specified AWS account credentials
     * and executor service.  Default client settings will be used.
     *
     * <p>
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     *
     * @param awsCredentials
     *            The AWS credentials (access key ID and secret key) to use
     *            when authenticating with AWS services.
     * @param executorService
     *            The executor service by which all asynchronous requests will
     *            be executed.
     */
    public AWSStorageGatewayAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {
        super(awsCredentials);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSStorageGateway using the specified AWS account credentials,
     * executor service, and client configuration options.
     *
     * <p>
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     *
     * @param awsCredentials
     *            The AWS credentials (access key ID and secret key) to use
     *            when authenticating with AWS services.
     * @param clientConfiguration
     *            Client configuration options (ex: max retry limit, proxy
     *            settings, etc).
     * @param executorService
     *            The executor service by which all asynchronous requests will
     *            be executed.
     */
    public AWSStorageGatewayAsyncClient(AWSCredentials awsCredentials,
                ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSStorageGateway using the specified AWS account credentials provider.
     * Default client settings will be used, and a default cached thread pool will be
     * created for executing the asynchronous tasks.
     *
     * <p>
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     */
    public AWSStorageGatewayAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, Executors.newCachedThreadPool());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSStorageGateway using the specified AWS account credentials provider
     * and executor service.  Default client settings will be used.
     *
     * <p>
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param executorService
     *            The executor service by which all asynchronous requests will
     *            be executed.
     */
    public AWSStorageGatewayAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, new ClientConfiguration(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSStorageGateway using the specified AWS account credentials
     * provider and client configuration options.
     *
     * <p>
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param clientConfiguration
     *            Client configuration options (ex: max retry limit, proxy
     *            settings, etc).
     */
    public AWSStorageGatewayAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
                ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, Executors.newCachedThreadPool());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSStorageGateway using the specified AWS account credentials
     * provider, executor service, and client configuration options.
     *
     * <p>
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param clientConfiguration
     *            Client configuration options (ex: max retry limit, proxy
     *            settings, etc).
     * @param executorService
     *            The executor service by which all asynchronous requests will
     *            be executed.
     */
    public AWSStorageGatewayAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
                ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }


    /**
     * Returns the executor service used by this async client to execute
     * requests.
     *
     * @return The executor service used by this async client to execute
     *         requests.
     */
    public ExecutorService getExecutorService() {
        return executorService;
    }

    /**
     * Shuts down the client, releasing all managed resources. This includes
     * forcibly terminating all pending asynchronous service calls. Clients who
     * wish to give pending asynchronous service calls time to complete should
     * call getExecutorService().shutdown() prior to calling this method.
     */
    @Override
    public void shutdown() {
        super.shutdown();
        executorService.shutdownNow();
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
     *           parameters to execute the DeleteSnapshotSchedule operation on
     *           AWSStorageGateway.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteSnapshotSchedule service method, as returned by
     *         AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteSnapshotScheduleResult> deleteSnapshotScheduleAsync(final DeleteSnapshotScheduleRequest deleteSnapshotScheduleRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteSnapshotScheduleResult>() {
            public DeleteSnapshotScheduleResult call() throws Exception {
                return deleteSnapshotSchedule(deleteSnapshotScheduleRequest);
		    }
		});
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
     *           parameters to execute the DeleteSnapshotSchedule operation on
     *           AWSStorageGateway.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteSnapshotSchedule service method, as returned by
     *         AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteSnapshotScheduleResult> deleteSnapshotScheduleAsync(
            final DeleteSnapshotScheduleRequest deleteSnapshotScheduleRequest,
            final AsyncHandler<DeleteSnapshotScheduleRequest, DeleteSnapshotScheduleResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteSnapshotScheduleResult>() {
            public DeleteSnapshotScheduleResult call() throws Exception {
            	DeleteSnapshotScheduleResult result;
                try {
            		result = deleteSnapshotSchedule(deleteSnapshotScheduleRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(deleteSnapshotScheduleRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * This operation returns your gateway's weekly maintenance start time
     * including the day and time of the week. Note that values are in terms
     * of the gateway's time zone.
     * </p>
     *
     * @param describeMaintenanceStartTimeRequest Container for the necessary
     *           parameters to execute the DescribeMaintenanceStartTime operation on
     *           AWSStorageGateway.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeMaintenanceStartTime service method, as returned by
     *         AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeMaintenanceStartTimeResult> describeMaintenanceStartTimeAsync(final DescribeMaintenanceStartTimeRequest describeMaintenanceStartTimeRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeMaintenanceStartTimeResult>() {
            public DescribeMaintenanceStartTimeResult call() throws Exception {
                return describeMaintenanceStartTime(describeMaintenanceStartTimeRequest);
		    }
		});
    }

    
    /**
     * <p>
     * This operation returns your gateway's weekly maintenance start time
     * including the day and time of the week. Note that values are in terms
     * of the gateway's time zone.
     * </p>
     *
     * @param describeMaintenanceStartTimeRequest Container for the necessary
     *           parameters to execute the DescribeMaintenanceStartTime operation on
     *           AWSStorageGateway.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeMaintenanceStartTime service method, as returned by
     *         AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeMaintenanceStartTimeResult> describeMaintenanceStartTimeAsync(
            final DescribeMaintenanceStartTimeRequest describeMaintenanceStartTimeRequest,
            final AsyncHandler<DescribeMaintenanceStartTimeRequest, DescribeMaintenanceStartTimeResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeMaintenanceStartTimeResult>() {
            public DescribeMaintenanceStartTimeResult call() throws Exception {
            	DescribeMaintenanceStartTimeResult result;
                try {
            		result = describeMaintenanceStartTime(describeMaintenanceStartTimeRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeMaintenanceStartTimeRequest, result);
               	return result;
		    }
		});
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
     *           parameters to execute the CreateStorediSCSIVolume operation on
     *           AWSStorageGateway.
     * 
     * @return A Java Future object containing the response from the
     *         CreateStorediSCSIVolume service method, as returned by
     *         AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateStorediSCSIVolumeResult> createStorediSCSIVolumeAsync(final CreateStorediSCSIVolumeRequest createStorediSCSIVolumeRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateStorediSCSIVolumeResult>() {
            public CreateStorediSCSIVolumeResult call() throws Exception {
                return createStorediSCSIVolume(createStorediSCSIVolumeRequest);
		    }
		});
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
     *           parameters to execute the CreateStorediSCSIVolume operation on
     *           AWSStorageGateway.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateStorediSCSIVolume service method, as returned by
     *         AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateStorediSCSIVolumeResult> createStorediSCSIVolumeAsync(
            final CreateStorediSCSIVolumeRequest createStorediSCSIVolumeRequest,
            final AsyncHandler<CreateStorediSCSIVolumeRequest, CreateStorediSCSIVolumeResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateStorediSCSIVolumeResult>() {
            public CreateStorediSCSIVolumeResult call() throws Exception {
            	CreateStorediSCSIVolumeResult result;
                try {
            		result = createStorediSCSIVolume(createStorediSCSIVolumeRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(createStorediSCSIVolumeRequest, result);
               	return result;
		    }
		});
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
     *           parameters to execute the UpdateGatewaySoftwareNow operation on
     *           AWSStorageGateway.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateGatewaySoftwareNow service method, as returned by
     *         AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateGatewaySoftwareNowResult> updateGatewaySoftwareNowAsync(final UpdateGatewaySoftwareNowRequest updateGatewaySoftwareNowRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateGatewaySoftwareNowResult>() {
            public UpdateGatewaySoftwareNowResult call() throws Exception {
                return updateGatewaySoftwareNow(updateGatewaySoftwareNowRequest);
		    }
		});
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
     *           parameters to execute the UpdateGatewaySoftwareNow operation on
     *           AWSStorageGateway.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateGatewaySoftwareNow service method, as returned by
     *         AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateGatewaySoftwareNowResult> updateGatewaySoftwareNowAsync(
            final UpdateGatewaySoftwareNowRequest updateGatewaySoftwareNowRequest,
            final AsyncHandler<UpdateGatewaySoftwareNowRequest, UpdateGatewaySoftwareNowResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateGatewaySoftwareNowResult>() {
            public UpdateGatewaySoftwareNowResult call() throws Exception {
            	UpdateGatewaySoftwareNowResult result;
                try {
            		result = updateGatewaySoftwareNow(updateGatewaySoftwareNowRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(updateGatewaySoftwareNowRequest, result);
               	return result;
		    }
		});
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
     *           execute the CreateSnapshot operation on AWSStorageGateway.
     * 
     * @return A Java Future object containing the response from the
     *         CreateSnapshot service method, as returned by AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateSnapshotResult> createSnapshotAsync(final CreateSnapshotRequest createSnapshotRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateSnapshotResult>() {
            public CreateSnapshotResult call() throws Exception {
                return createSnapshot(createSnapshotRequest);
		    }
		});
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
     *           execute the CreateSnapshot operation on AWSStorageGateway.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateSnapshot service method, as returned by AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateSnapshotResult> createSnapshotAsync(
            final CreateSnapshotRequest createSnapshotRequest,
            final AsyncHandler<CreateSnapshotRequest, CreateSnapshotResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateSnapshotResult>() {
            public CreateSnapshotResult call() throws Exception {
            	CreateSnapshotResult result;
                try {
            		result = createSnapshot(createSnapshotRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(createSnapshotRequest, result);
               	return result;
		    }
		});
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
     *           to execute the AddWorkingStorage operation on AWSStorageGateway.
     * 
     * @return A Java Future object containing the response from the
     *         AddWorkingStorage service method, as returned by AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<AddWorkingStorageResult> addWorkingStorageAsync(final AddWorkingStorageRequest addWorkingStorageRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<AddWorkingStorageResult>() {
            public AddWorkingStorageResult call() throws Exception {
                return addWorkingStorage(addWorkingStorageRequest);
		    }
		});
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
     *           to execute the AddWorkingStorage operation on AWSStorageGateway.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         AddWorkingStorage service method, as returned by AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<AddWorkingStorageResult> addWorkingStorageAsync(
            final AddWorkingStorageRequest addWorkingStorageRequest,
            final AsyncHandler<AddWorkingStorageRequest, AddWorkingStorageResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<AddWorkingStorageResult>() {
            public AddWorkingStorageResult call() throws Exception {
            	AddWorkingStorageResult result;
                try {
            		result = addWorkingStorage(addWorkingStorageRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(addWorkingStorageRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Cancels retrieval of a virtual tape from the Virtual Tape Shelf (VTS)
     * to a gateway after the retrieval process is initiated. The virtual
     * tape is returned to the Virtual Tape Shelf.
     * </p>
     *
     * @param cancelRetrievalRequest Container for the necessary parameters
     *           to execute the CancelRetrieval operation on AWSStorageGateway.
     * 
     * @return A Java Future object containing the response from the
     *         CancelRetrieval service method, as returned by AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CancelRetrievalResult> cancelRetrievalAsync(final CancelRetrievalRequest cancelRetrievalRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CancelRetrievalResult>() {
            public CancelRetrievalResult call() throws Exception {
                return cancelRetrieval(cancelRetrievalRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Cancels retrieval of a virtual tape from the Virtual Tape Shelf (VTS)
     * to a gateway after the retrieval process is initiated. The virtual
     * tape is returned to the Virtual Tape Shelf.
     * </p>
     *
     * @param cancelRetrievalRequest Container for the necessary parameters
     *           to execute the CancelRetrieval operation on AWSStorageGateway.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CancelRetrieval service method, as returned by AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CancelRetrievalResult> cancelRetrievalAsync(
            final CancelRetrievalRequest cancelRetrievalRequest,
            final AsyncHandler<CancelRetrievalRequest, CancelRetrievalResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CancelRetrievalResult>() {
            public CancelRetrievalResult call() throws Exception {
            	CancelRetrievalResult result;
                try {
            		result = cancelRetrieval(cancelRetrievalRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(cancelRetrievalRequest, result);
               	return result;
		    }
		});
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
     *           parameters to execute the DescribeBandwidthRateLimit operation on
     *           AWSStorageGateway.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeBandwidthRateLimit service method, as returned by
     *         AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeBandwidthRateLimitResult> describeBandwidthRateLimitAsync(final DescribeBandwidthRateLimitRequest describeBandwidthRateLimitRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeBandwidthRateLimitResult>() {
            public DescribeBandwidthRateLimitResult call() throws Exception {
                return describeBandwidthRateLimit(describeBandwidthRateLimitRequest);
		    }
		});
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
     *           parameters to execute the DescribeBandwidthRateLimit operation on
     *           AWSStorageGateway.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeBandwidthRateLimit service method, as returned by
     *         AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeBandwidthRateLimitResult> describeBandwidthRateLimitAsync(
            final DescribeBandwidthRateLimitRequest describeBandwidthRateLimitRequest,
            final AsyncHandler<DescribeBandwidthRateLimitRequest, DescribeBandwidthRateLimitResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeBandwidthRateLimitResult>() {
            public DescribeBandwidthRateLimitResult call() throws Exception {
            	DescribeBandwidthRateLimitResult result;
                try {
            		result = describeBandwidthRateLimit(describeBandwidthRateLimitRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeBandwidthRateLimitRequest, result);
               	return result;
		    }
		});
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
     *           execute the DescribeTapes operation on AWSStorageGateway.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeTapes service method, as returned by AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeTapesResult> describeTapesAsync(final DescribeTapesRequest describeTapesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeTapesResult>() {
            public DescribeTapesResult call() throws Exception {
                return describeTapes(describeTapesRequest);
		    }
		});
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
     *           execute the DescribeTapes operation on AWSStorageGateway.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeTapes service method, as returned by AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeTapesResult> describeTapesAsync(
            final DescribeTapesRequest describeTapesRequest,
            final AsyncHandler<DescribeTapesRequest, DescribeTapesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeTapesResult>() {
            public DescribeTapesResult call() throws Exception {
            	DescribeTapesResult result;
                try {
            		result = describeTapes(describeTapesRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeTapesRequest, result);
               	return result;
		    }
		});
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
     *           parameters to execute the RetrieveTapeRecoveryPoint operation on
     *           AWSStorageGateway.
     * 
     * @return A Java Future object containing the response from the
     *         RetrieveTapeRecoveryPoint service method, as returned by
     *         AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<RetrieveTapeRecoveryPointResult> retrieveTapeRecoveryPointAsync(final RetrieveTapeRecoveryPointRequest retrieveTapeRecoveryPointRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<RetrieveTapeRecoveryPointResult>() {
            public RetrieveTapeRecoveryPointResult call() throws Exception {
                return retrieveTapeRecoveryPoint(retrieveTapeRecoveryPointRequest);
		    }
		});
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
     *           parameters to execute the RetrieveTapeRecoveryPoint operation on
     *           AWSStorageGateway.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         RetrieveTapeRecoveryPoint service method, as returned by
     *         AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<RetrieveTapeRecoveryPointResult> retrieveTapeRecoveryPointAsync(
            final RetrieveTapeRecoveryPointRequest retrieveTapeRecoveryPointRequest,
            final AsyncHandler<RetrieveTapeRecoveryPointRequest, RetrieveTapeRecoveryPointResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<RetrieveTapeRecoveryPointResult>() {
            public RetrieveTapeRecoveryPointResult call() throws Exception {
            	RetrieveTapeRecoveryPointResult result;
                try {
            		result = retrieveTapeRecoveryPoint(retrieveTapeRecoveryPointRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(retrieveTapeRecoveryPointRequest, result);
               	return result;
		    }
		});
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
     *           parameters to execute the UpdateChapCredentials operation on
     *           AWSStorageGateway.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateChapCredentials service method, as returned by
     *         AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateChapCredentialsResult> updateChapCredentialsAsync(final UpdateChapCredentialsRequest updateChapCredentialsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateChapCredentialsResult>() {
            public UpdateChapCredentialsResult call() throws Exception {
                return updateChapCredentials(updateChapCredentialsRequest);
		    }
		});
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
     *           parameters to execute the UpdateChapCredentials operation on
     *           AWSStorageGateway.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateChapCredentials service method, as returned by
     *         AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateChapCredentialsResult> updateChapCredentialsAsync(
            final UpdateChapCredentialsRequest updateChapCredentialsRequest,
            final AsyncHandler<UpdateChapCredentialsRequest, UpdateChapCredentialsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateChapCredentialsResult>() {
            public UpdateChapCredentialsResult call() throws Exception {
            	UpdateChapCredentialsResult result;
                try {
            		result = updateChapCredentials(updateChapCredentialsRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(updateChapCredentialsRequest, result);
               	return result;
		    }
		});
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
     *           execute the CreateTapes operation on AWSStorageGateway.
     * 
     * @return A Java Future object containing the response from the
     *         CreateTapes service method, as returned by AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateTapesResult> createTapesAsync(final CreateTapesRequest createTapesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateTapesResult>() {
            public CreateTapesResult call() throws Exception {
                return createTapes(createTapesRequest);
		    }
		});
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
     *           execute the CreateTapes operation on AWSStorageGateway.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateTapes service method, as returned by AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateTapesResult> createTapesAsync(
            final CreateTapesRequest createTapesRequest,
            final AsyncHandler<CreateTapesRequest, CreateTapesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateTapesResult>() {
            public CreateTapesResult call() throws Exception {
            	CreateTapesResult result;
                try {
            		result = createTapes(createTapesRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(createTapesRequest, result);
               	return result;
		    }
		});
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
     *           parameters to execute the DescribeUploadBuffer operation on
     *           AWSStorageGateway.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeUploadBuffer service method, as returned by AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeUploadBufferResult> describeUploadBufferAsync(final DescribeUploadBufferRequest describeUploadBufferRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeUploadBufferResult>() {
            public DescribeUploadBufferResult call() throws Exception {
                return describeUploadBuffer(describeUploadBufferRequest);
		    }
		});
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
     *           parameters to execute the DescribeUploadBuffer operation on
     *           AWSStorageGateway.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeUploadBuffer service method, as returned by AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeUploadBufferResult> describeUploadBufferAsync(
            final DescribeUploadBufferRequest describeUploadBufferRequest,
            final AsyncHandler<DescribeUploadBufferRequest, DescribeUploadBufferResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeUploadBufferResult>() {
            public DescribeUploadBufferResult call() throws Exception {
            	DescribeUploadBufferResult result;
                try {
            		result = describeUploadBuffer(describeUploadBufferRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeUploadBufferRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * This operation deletes Challenge-Handshake Authentication Protocol
     * (CHAP) credentials for a specified iSCSI target and initiator pair.
     * </p>
     *
     * @param deleteChapCredentialsRequest Container for the necessary
     *           parameters to execute the DeleteChapCredentials operation on
     *           AWSStorageGateway.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteChapCredentials service method, as returned by
     *         AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteChapCredentialsResult> deleteChapCredentialsAsync(final DeleteChapCredentialsRequest deleteChapCredentialsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteChapCredentialsResult>() {
            public DeleteChapCredentialsResult call() throws Exception {
                return deleteChapCredentials(deleteChapCredentialsRequest);
		    }
		});
    }

    
    /**
     * <p>
     * This operation deletes Challenge-Handshake Authentication Protocol
     * (CHAP) credentials for a specified iSCSI target and initiator pair.
     * </p>
     *
     * @param deleteChapCredentialsRequest Container for the necessary
     *           parameters to execute the DeleteChapCredentials operation on
     *           AWSStorageGateway.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteChapCredentials service method, as returned by
     *         AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteChapCredentialsResult> deleteChapCredentialsAsync(
            final DeleteChapCredentialsRequest deleteChapCredentialsRequest,
            final AsyncHandler<DeleteChapCredentialsRequest, DeleteChapCredentialsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteChapCredentialsResult>() {
            public DeleteChapCredentialsResult call() throws Exception {
            	DeleteChapCredentialsResult result;
                try {
            		result = deleteChapCredentials(deleteChapCredentialsRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(deleteChapCredentialsRequest, result);
               	return result;
		    }
		});
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
     *           execute the AddCache operation on AWSStorageGateway.
     * 
     * @return A Java Future object containing the response from the AddCache
     *         service method, as returned by AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<AddCacheResult> addCacheAsync(final AddCacheRequest addCacheRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<AddCacheResult>() {
            public AddCacheResult call() throws Exception {
                return addCache(addCacheRequest);
		    }
		});
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
     *           execute the AddCache operation on AWSStorageGateway.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the AddCache
     *         service method, as returned by AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<AddCacheResult> addCacheAsync(
            final AddCacheRequest addCacheRequest,
            final AsyncHandler<AddCacheRequest, AddCacheResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<AddCacheResult>() {
            public AddCacheResult call() throws Exception {
            	AddCacheResult result;
                try {
            		result = addCache(addCacheRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(addCacheRequest, result);
               	return result;
		    }
		});
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
     *           parameters to execute the DescribeGatewayInformation operation on
     *           AWSStorageGateway.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeGatewayInformation service method, as returned by
     *         AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeGatewayInformationResult> describeGatewayInformationAsync(final DescribeGatewayInformationRequest describeGatewayInformationRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeGatewayInformationResult>() {
            public DescribeGatewayInformationResult call() throws Exception {
                return describeGatewayInformation(describeGatewayInformationRequest);
		    }
		});
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
     *           parameters to execute the DescribeGatewayInformation operation on
     *           AWSStorageGateway.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeGatewayInformation service method, as returned by
     *         AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeGatewayInformationResult> describeGatewayInformationAsync(
            final DescribeGatewayInformationRequest describeGatewayInformationRequest,
            final AsyncHandler<DescribeGatewayInformationRequest, DescribeGatewayInformationResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeGatewayInformationResult>() {
            public DescribeGatewayInformationResult call() throws Exception {
            	DescribeGatewayInformationResult result;
                try {
            		result = describeGatewayInformation(describeGatewayInformationRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeGatewayInformationRequest, result);
               	return result;
		    }
		});
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
     *           to execute the ActivateGateway operation on AWSStorageGateway.
     * 
     * @return A Java Future object containing the response from the
     *         ActivateGateway service method, as returned by AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ActivateGatewayResult> activateGatewayAsync(final ActivateGatewayRequest activateGatewayRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ActivateGatewayResult>() {
            public ActivateGatewayResult call() throws Exception {
                return activateGateway(activateGatewayRequest);
		    }
		});
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
     *           to execute the ActivateGateway operation on AWSStorageGateway.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ActivateGateway service method, as returned by AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ActivateGatewayResult> activateGatewayAsync(
            final ActivateGatewayRequest activateGatewayRequest,
            final AsyncHandler<ActivateGatewayRequest, ActivateGatewayResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ActivateGatewayResult>() {
            public ActivateGatewayResult call() throws Exception {
            	ActivateGatewayResult result;
                try {
            		result = activateGateway(activateGatewayRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(activateGatewayRequest, result);
               	return result;
		    }
		});
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
     *           parameters to execute the DescribeTapeArchives operation on
     *           AWSStorageGateway.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeTapeArchives service method, as returned by AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeTapeArchivesResult> describeTapeArchivesAsync(final DescribeTapeArchivesRequest describeTapeArchivesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeTapeArchivesResult>() {
            public DescribeTapeArchivesResult call() throws Exception {
                return describeTapeArchives(describeTapeArchivesRequest);
		    }
		});
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
     *           parameters to execute the DescribeTapeArchives operation on
     *           AWSStorageGateway.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeTapeArchives service method, as returned by AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeTapeArchivesResult> describeTapeArchivesAsync(
            final DescribeTapeArchivesRequest describeTapeArchivesRequest,
            final AsyncHandler<DescribeTapeArchivesRequest, DescribeTapeArchivesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeTapeArchivesResult>() {
            public DescribeTapeArchivesResult call() throws Exception {
            	DescribeTapeArchivesResult result;
                try {
            		result = describeTapeArchives(describeTapeArchivesRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeTapeArchivesRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * This operation updates a gateway's metadata, which includes the
     * gateway's name and time zone. To specify which gateway to update, use
     * the Amazon Resource Name (ARN) of the gateway in your request.
     * </p>
     *
     * @param updateGatewayInformationRequest Container for the necessary
     *           parameters to execute the UpdateGatewayInformation operation on
     *           AWSStorageGateway.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateGatewayInformation service method, as returned by
     *         AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateGatewayInformationResult> updateGatewayInformationAsync(final UpdateGatewayInformationRequest updateGatewayInformationRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateGatewayInformationResult>() {
            public UpdateGatewayInformationResult call() throws Exception {
                return updateGatewayInformation(updateGatewayInformationRequest);
		    }
		});
    }

    
    /**
     * <p>
     * This operation updates a gateway's metadata, which includes the
     * gateway's name and time zone. To specify which gateway to update, use
     * the Amazon Resource Name (ARN) of the gateway in your request.
     * </p>
     *
     * @param updateGatewayInformationRequest Container for the necessary
     *           parameters to execute the UpdateGatewayInformation operation on
     *           AWSStorageGateway.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateGatewayInformation service method, as returned by
     *         AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateGatewayInformationResult> updateGatewayInformationAsync(
            final UpdateGatewayInformationRequest updateGatewayInformationRequest,
            final AsyncHandler<UpdateGatewayInformationRequest, UpdateGatewayInformationResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateGatewayInformationResult>() {
            public UpdateGatewayInformationResult call() throws Exception {
            	UpdateGatewayInformationResult result;
                try {
            		result = updateGatewayInformation(updateGatewayInformationRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(updateGatewayInformationRequest, result);
               	return result;
		    }
		});
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
     *           execute the ListLocalDisks operation on AWSStorageGateway.
     * 
     * @return A Java Future object containing the response from the
     *         ListLocalDisks service method, as returned by AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListLocalDisksResult> listLocalDisksAsync(final ListLocalDisksRequest listLocalDisksRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListLocalDisksResult>() {
            public ListLocalDisksResult call() throws Exception {
                return listLocalDisks(listLocalDisksRequest);
		    }
		});
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
     *           execute the ListLocalDisks operation on AWSStorageGateway.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListLocalDisks service method, as returned by AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListLocalDisksResult> listLocalDisksAsync(
            final ListLocalDisksRequest listLocalDisksRequest,
            final AsyncHandler<ListLocalDisksRequest, ListLocalDisksResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListLocalDisksResult>() {
            public ListLocalDisksResult call() throws Exception {
            	ListLocalDisksResult result;
                try {
            		result = listLocalDisks(listLocalDisksRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(listLocalDisksRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Deletes the specified virtual tape from the Virtual Tape Shelf (VTS).
     * </p>
     *
     * @param deleteTapeArchiveRequest Container for the necessary parameters
     *           to execute the DeleteTapeArchive operation on AWSStorageGateway.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteTapeArchive service method, as returned by AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteTapeArchiveResult> deleteTapeArchiveAsync(final DeleteTapeArchiveRequest deleteTapeArchiveRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteTapeArchiveResult>() {
            public DeleteTapeArchiveResult call() throws Exception {
                return deleteTapeArchive(deleteTapeArchiveRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Deletes the specified virtual tape from the Virtual Tape Shelf (VTS).
     * </p>
     *
     * @param deleteTapeArchiveRequest Container for the necessary parameters
     *           to execute the DeleteTapeArchive operation on AWSStorageGateway.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteTapeArchive service method, as returned by AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteTapeArchiveResult> deleteTapeArchiveAsync(
            final DeleteTapeArchiveRequest deleteTapeArchiveRequest,
            final AsyncHandler<DeleteTapeArchiveRequest, DeleteTapeArchiveResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteTapeArchiveResult>() {
            public DeleteTapeArchiveResult call() throws Exception {
            	DeleteTapeArchiveResult result;
                try {
            		result = deleteTapeArchive(deleteTapeArchiveRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(deleteTapeArchiveRequest, result);
               	return result;
		    }
		});
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
     *           execute the DescribeCache operation on AWSStorageGateway.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeCache service method, as returned by AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeCacheResult> describeCacheAsync(final DescribeCacheRequest describeCacheRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeCacheResult>() {
            public DescribeCacheResult call() throws Exception {
                return describeCache(describeCacheRequest);
		    }
		});
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
     *           execute the DescribeCache operation on AWSStorageGateway.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeCache service method, as returned by AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeCacheResult> describeCacheAsync(
            final DescribeCacheRequest describeCacheRequest,
            final AsyncHandler<DescribeCacheRequest, DescribeCacheResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeCacheResult>() {
            public DescribeCacheResult call() throws Exception {
            	DescribeCacheResult result;
                try {
            		result = describeCache(describeCacheRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeCacheRequest, result);
               	return result;
		    }
		});
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
     *           parameters to execute the UpdateBandwidthRateLimit operation on
     *           AWSStorageGateway.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateBandwidthRateLimit service method, as returned by
     *         AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateBandwidthRateLimitResult> updateBandwidthRateLimitAsync(final UpdateBandwidthRateLimitRequest updateBandwidthRateLimitRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateBandwidthRateLimitResult>() {
            public UpdateBandwidthRateLimitResult call() throws Exception {
                return updateBandwidthRateLimit(updateBandwidthRateLimitRequest);
		    }
		});
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
     *           parameters to execute the UpdateBandwidthRateLimit operation on
     *           AWSStorageGateway.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateBandwidthRateLimit service method, as returned by
     *         AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateBandwidthRateLimitResult> updateBandwidthRateLimitAsync(
            final UpdateBandwidthRateLimitRequest updateBandwidthRateLimitRequest,
            final AsyncHandler<UpdateBandwidthRateLimitRequest, UpdateBandwidthRateLimitResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateBandwidthRateLimitResult>() {
            public UpdateBandwidthRateLimitResult call() throws Exception {
            	UpdateBandwidthRateLimitResult result;
                try {
            		result = updateBandwidthRateLimit(updateBandwidthRateLimitRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(updateBandwidthRateLimitRequest, result);
               	return result;
		    }
		});
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
     *           execute the DisableGateway operation on AWSStorageGateway.
     * 
     * @return A Java Future object containing the response from the
     *         DisableGateway service method, as returned by AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DisableGatewayResult> disableGatewayAsync(final DisableGatewayRequest disableGatewayRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DisableGatewayResult>() {
            public DisableGatewayResult call() throws Exception {
                return disableGateway(disableGatewayRequest);
		    }
		});
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
     *           execute the DisableGateway operation on AWSStorageGateway.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DisableGateway service method, as returned by AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DisableGatewayResult> disableGatewayAsync(
            final DisableGatewayRequest disableGatewayRequest,
            final AsyncHandler<DisableGatewayRequest, DisableGatewayResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DisableGatewayResult>() {
            public DisableGatewayResult call() throws Exception {
            	DisableGatewayResult result;
                try {
            		result = disableGateway(disableGatewayRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(disableGatewayRequest, result);
               	return result;
		    }
		});
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
     *           parameters to execute the DescribeWorkingStorage operation on
     *           AWSStorageGateway.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeWorkingStorage service method, as returned by
     *         AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeWorkingStorageResult> describeWorkingStorageAsync(final DescribeWorkingStorageRequest describeWorkingStorageRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeWorkingStorageResult>() {
            public DescribeWorkingStorageResult call() throws Exception {
                return describeWorkingStorage(describeWorkingStorageRequest);
		    }
		});
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
     *           parameters to execute the DescribeWorkingStorage operation on
     *           AWSStorageGateway.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeWorkingStorage service method, as returned by
     *         AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeWorkingStorageResult> describeWorkingStorageAsync(
            final DescribeWorkingStorageRequest describeWorkingStorageRequest,
            final AsyncHandler<DescribeWorkingStorageRequest, DescribeWorkingStorageResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeWorkingStorageResult>() {
            public DescribeWorkingStorageResult call() throws Exception {
            	DescribeWorkingStorageResult result;
                try {
            		result = describeWorkingStorage(describeWorkingStorageRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeWorkingStorageRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * This operation updates a gateway's weekly maintenance start time
     * information, including day and time of the week. The maintenance time
     * is the time in your gateway's time zone.
     * </p>
     *
     * @param updateMaintenanceStartTimeRequest Container for the necessary
     *           parameters to execute the UpdateMaintenanceStartTime operation on
     *           AWSStorageGateway.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateMaintenanceStartTime service method, as returned by
     *         AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateMaintenanceStartTimeResult> updateMaintenanceStartTimeAsync(final UpdateMaintenanceStartTimeRequest updateMaintenanceStartTimeRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateMaintenanceStartTimeResult>() {
            public UpdateMaintenanceStartTimeResult call() throws Exception {
                return updateMaintenanceStartTime(updateMaintenanceStartTimeRequest);
		    }
		});
    }

    
    /**
     * <p>
     * This operation updates a gateway's weekly maintenance start time
     * information, including day and time of the week. The maintenance time
     * is the time in your gateway's time zone.
     * </p>
     *
     * @param updateMaintenanceStartTimeRequest Container for the necessary
     *           parameters to execute the UpdateMaintenanceStartTime operation on
     *           AWSStorageGateway.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateMaintenanceStartTime service method, as returned by
     *         AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateMaintenanceStartTimeResult> updateMaintenanceStartTimeAsync(
            final UpdateMaintenanceStartTimeRequest updateMaintenanceStartTimeRequest,
            final AsyncHandler<UpdateMaintenanceStartTimeRequest, UpdateMaintenanceStartTimeResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateMaintenanceStartTimeResult>() {
            public UpdateMaintenanceStartTimeResult call() throws Exception {
            	UpdateMaintenanceStartTimeResult result;
                try {
            		result = updateMaintenanceStartTime(updateMaintenanceStartTimeRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(updateMaintenanceStartTimeRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Deletes the specified virtual tape.
     * </p>
     *
     * @param deleteTapeRequest Container for the necessary parameters to
     *           execute the DeleteTape operation on AWSStorageGateway.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteTape service method, as returned by AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteTapeResult> deleteTapeAsync(final DeleteTapeRequest deleteTapeRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteTapeResult>() {
            public DeleteTapeResult call() throws Exception {
                return deleteTape(deleteTapeRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Deletes the specified virtual tape.
     * </p>
     *
     * @param deleteTapeRequest Container for the necessary parameters to
     *           execute the DeleteTape operation on AWSStorageGateway.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteTape service method, as returned by AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteTapeResult> deleteTapeAsync(
            final DeleteTapeRequest deleteTapeRequest,
            final AsyncHandler<DeleteTapeRequest, DeleteTapeResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteTapeResult>() {
            public DeleteTapeResult call() throws Exception {
            	DeleteTapeResult result;
                try {
            		result = deleteTape(deleteTapeRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(deleteTapeRequest, result);
               	return result;
		    }
		});
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
     *           execute the StartGateway operation on AWSStorageGateway.
     * 
     * @return A Java Future object containing the response from the
     *         StartGateway service method, as returned by AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<StartGatewayResult> startGatewayAsync(final StartGatewayRequest startGatewayRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<StartGatewayResult>() {
            public StartGatewayResult call() throws Exception {
                return startGateway(startGatewayRequest);
		    }
		});
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
     *           execute the StartGateway operation on AWSStorageGateway.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         StartGateway service method, as returned by AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<StartGatewayResult> startGatewayAsync(
            final StartGatewayRequest startGatewayRequest,
            final AsyncHandler<StartGatewayRequest, StartGatewayResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<StartGatewayResult>() {
            public StartGatewayResult call() throws Exception {
            	StartGatewayResult result;
                try {
            		result = startGateway(startGatewayRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(startGatewayRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * This operation returns an array of Challenge-Handshake Authentication
     * Protocol (CHAP) credentials information for a specified iSCSI target,
     * one for each target-initiator pair.
     * </p>
     *
     * @param describeChapCredentialsRequest Container for the necessary
     *           parameters to execute the DescribeChapCredentials operation on
     *           AWSStorageGateway.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeChapCredentials service method, as returned by
     *         AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeChapCredentialsResult> describeChapCredentialsAsync(final DescribeChapCredentialsRequest describeChapCredentialsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeChapCredentialsResult>() {
            public DescribeChapCredentialsResult call() throws Exception {
                return describeChapCredentials(describeChapCredentialsRequest);
		    }
		});
    }

    
    /**
     * <p>
     * This operation returns an array of Challenge-Handshake Authentication
     * Protocol (CHAP) credentials information for a specified iSCSI target,
     * one for each target-initiator pair.
     * </p>
     *
     * @param describeChapCredentialsRequest Container for the necessary
     *           parameters to execute the DescribeChapCredentials operation on
     *           AWSStorageGateway.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeChapCredentials service method, as returned by
     *         AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeChapCredentialsResult> describeChapCredentialsAsync(
            final DescribeChapCredentialsRequest describeChapCredentialsRequest,
            final AsyncHandler<DescribeChapCredentialsRequest, DescribeChapCredentialsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeChapCredentialsResult>() {
            public DescribeChapCredentialsResult call() throws Exception {
            	DescribeChapCredentialsResult result;
                try {
            		result = describeChapCredentials(describeChapCredentialsRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeChapCredentialsRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * This operation describes the snapshot schedule for the specified
     * gateway volume. The snapshot schedule information includes intervals
     * at which snapshots are automatically initiated on the volume.
     * </p>
     *
     * @param describeSnapshotScheduleRequest Container for the necessary
     *           parameters to execute the DescribeSnapshotSchedule operation on
     *           AWSStorageGateway.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeSnapshotSchedule service method, as returned by
     *         AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeSnapshotScheduleResult> describeSnapshotScheduleAsync(final DescribeSnapshotScheduleRequest describeSnapshotScheduleRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeSnapshotScheduleResult>() {
            public DescribeSnapshotScheduleResult call() throws Exception {
                return describeSnapshotSchedule(describeSnapshotScheduleRequest);
		    }
		});
    }

    
    /**
     * <p>
     * This operation describes the snapshot schedule for the specified
     * gateway volume. The snapshot schedule information includes intervals
     * at which snapshots are automatically initiated on the volume.
     * </p>
     *
     * @param describeSnapshotScheduleRequest Container for the necessary
     *           parameters to execute the DescribeSnapshotSchedule operation on
     *           AWSStorageGateway.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeSnapshotSchedule service method, as returned by
     *         AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeSnapshotScheduleResult> describeSnapshotScheduleAsync(
            final DescribeSnapshotScheduleRequest describeSnapshotScheduleRequest,
            final AsyncHandler<DescribeSnapshotScheduleRequest, DescribeSnapshotScheduleResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeSnapshotScheduleResult>() {
            public DescribeSnapshotScheduleResult call() throws Exception {
            	DescribeSnapshotScheduleResult result;
                try {
            		result = describeSnapshotSchedule(describeSnapshotScheduleRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeSnapshotScheduleRequest, result);
               	return result;
		    }
		});
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
     *           execute the DeleteVolume operation on AWSStorageGateway.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteVolume service method, as returned by AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteVolumeResult> deleteVolumeAsync(final DeleteVolumeRequest deleteVolumeRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteVolumeResult>() {
            public DeleteVolumeResult call() throws Exception {
                return deleteVolume(deleteVolumeRequest);
		    }
		});
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
     *           execute the DeleteVolume operation on AWSStorageGateway.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteVolume service method, as returned by AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteVolumeResult> deleteVolumeAsync(
            final DeleteVolumeRequest deleteVolumeRequest,
            final AsyncHandler<DeleteVolumeRequest, DeleteVolumeResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteVolumeResult>() {
            public DeleteVolumeResult call() throws Exception {
            	DeleteVolumeResult result;
                try {
            		result = deleteVolume(deleteVolumeRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(deleteVolumeRequest, result);
               	return result;
		    }
		});
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
     *           CreateSnapshotFromVolumeRecoveryPoint operation on AWSStorageGateway.
     * 
     * @return A Java Future object containing the response from the
     *         CreateSnapshotFromVolumeRecoveryPoint service method, as returned by
     *         AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateSnapshotFromVolumeRecoveryPointResult> createSnapshotFromVolumeRecoveryPointAsync(final CreateSnapshotFromVolumeRecoveryPointRequest createSnapshotFromVolumeRecoveryPointRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateSnapshotFromVolumeRecoveryPointResult>() {
            public CreateSnapshotFromVolumeRecoveryPointResult call() throws Exception {
                return createSnapshotFromVolumeRecoveryPoint(createSnapshotFromVolumeRecoveryPointRequest);
		    }
		});
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
     *           CreateSnapshotFromVolumeRecoveryPoint operation on AWSStorageGateway.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateSnapshotFromVolumeRecoveryPoint service method, as returned by
     *         AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateSnapshotFromVolumeRecoveryPointResult> createSnapshotFromVolumeRecoveryPointAsync(
            final CreateSnapshotFromVolumeRecoveryPointRequest createSnapshotFromVolumeRecoveryPointRequest,
            final AsyncHandler<CreateSnapshotFromVolumeRecoveryPointRequest, CreateSnapshotFromVolumeRecoveryPointResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateSnapshotFromVolumeRecoveryPointResult>() {
            public CreateSnapshotFromVolumeRecoveryPointResult call() throws Exception {
            	CreateSnapshotFromVolumeRecoveryPointResult result;
                try {
            		result = createSnapshotFromVolumeRecoveryPoint(createSnapshotFromVolumeRecoveryPointRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(createSnapshotFromVolumeRecoveryPointRequest, result);
               	return result;
		    }
		});
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
     *           execute the DeleteGateway operation on AWSStorageGateway.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteGateway service method, as returned by AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteGatewayResult> deleteGatewayAsync(final DeleteGatewayRequest deleteGatewayRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteGatewayResult>() {
            public DeleteGatewayResult call() throws Exception {
                return deleteGateway(deleteGatewayRequest);
		    }
		});
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
     *           execute the DeleteGateway operation on AWSStorageGateway.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteGateway service method, as returned by AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteGatewayResult> deleteGatewayAsync(
            final DeleteGatewayRequest deleteGatewayRequest,
            final AsyncHandler<DeleteGatewayRequest, DeleteGatewayResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteGatewayResult>() {
            public DeleteGatewayResult call() throws Exception {
            	DeleteGatewayResult result;
                try {
            		result = deleteGateway(deleteGatewayRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(deleteGatewayRequest, result);
               	return result;
		    }
		});
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
     *           parameters to execute the CreateCachediSCSIVolume operation on
     *           AWSStorageGateway.
     * 
     * @return A Java Future object containing the response from the
     *         CreateCachediSCSIVolume service method, as returned by
     *         AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateCachediSCSIVolumeResult> createCachediSCSIVolumeAsync(final CreateCachediSCSIVolumeRequest createCachediSCSIVolumeRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateCachediSCSIVolumeResult>() {
            public CreateCachediSCSIVolumeResult call() throws Exception {
                return createCachediSCSIVolume(createCachediSCSIVolumeRequest);
		    }
		});
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
     *           parameters to execute the CreateCachediSCSIVolume operation on
     *           AWSStorageGateway.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateCachediSCSIVolume service method, as returned by
     *         AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateCachediSCSIVolumeResult> createCachediSCSIVolumeAsync(
            final CreateCachediSCSIVolumeRequest createCachediSCSIVolumeRequest,
            final AsyncHandler<CreateCachediSCSIVolumeRequest, CreateCachediSCSIVolumeResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateCachediSCSIVolumeResult>() {
            public CreateCachediSCSIVolumeResult call() throws Exception {
            	CreateCachediSCSIVolumeResult result;
                try {
            		result = createCachediSCSIVolume(createCachediSCSIVolumeRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(createCachediSCSIVolumeRequest, result);
               	return result;
		    }
		});
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
     *           to execute the ShutdownGateway operation on AWSStorageGateway.
     * 
     * @return A Java Future object containing the response from the
     *         ShutdownGateway service method, as returned by AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ShutdownGatewayResult> shutdownGatewayAsync(final ShutdownGatewayRequest shutdownGatewayRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ShutdownGatewayResult>() {
            public ShutdownGatewayResult call() throws Exception {
                return shutdownGateway(shutdownGatewayRequest);
		    }
		});
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
     *           to execute the ShutdownGateway operation on AWSStorageGateway.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ShutdownGateway service method, as returned by AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ShutdownGatewayResult> shutdownGatewayAsync(
            final ShutdownGatewayRequest shutdownGatewayRequest,
            final AsyncHandler<ShutdownGatewayRequest, ShutdownGatewayResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ShutdownGatewayResult>() {
            public ShutdownGatewayResult call() throws Exception {
            	ShutdownGatewayResult result;
                try {
            		result = shutdownGateway(shutdownGatewayRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(shutdownGatewayRequest, result);
               	return result;
		    }
		});
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
     *           parameters to execute the DeleteBandwidthRateLimit operation on
     *           AWSStorageGateway.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteBandwidthRateLimit service method, as returned by
     *         AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteBandwidthRateLimitResult> deleteBandwidthRateLimitAsync(final DeleteBandwidthRateLimitRequest deleteBandwidthRateLimitRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteBandwidthRateLimitResult>() {
            public DeleteBandwidthRateLimitResult call() throws Exception {
                return deleteBandwidthRateLimit(deleteBandwidthRateLimitRequest);
		    }
		});
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
     *           parameters to execute the DeleteBandwidthRateLimit operation on
     *           AWSStorageGateway.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteBandwidthRateLimit service method, as returned by
     *         AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteBandwidthRateLimitResult> deleteBandwidthRateLimitAsync(
            final DeleteBandwidthRateLimitRequest deleteBandwidthRateLimitRequest,
            final AsyncHandler<DeleteBandwidthRateLimitRequest, DeleteBandwidthRateLimitResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteBandwidthRateLimitResult>() {
            public DeleteBandwidthRateLimitResult call() throws Exception {
            	DeleteBandwidthRateLimitResult result;
                try {
            		result = deleteBandwidthRateLimit(deleteBandwidthRateLimitRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(deleteBandwidthRateLimitRequest, result);
               	return result;
		    }
		});
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
     *           execute the ListVolumes operation on AWSStorageGateway.
     * 
     * @return A Java Future object containing the response from the
     *         ListVolumes service method, as returned by AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListVolumesResult> listVolumesAsync(final ListVolumesRequest listVolumesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListVolumesResult>() {
            public ListVolumesResult call() throws Exception {
                return listVolumes(listVolumesRequest);
		    }
		});
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
     *           execute the ListVolumes operation on AWSStorageGateway.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListVolumes service method, as returned by AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListVolumesResult> listVolumesAsync(
            final ListVolumesRequest listVolumesRequest,
            final AsyncHandler<ListVolumesRequest, ListVolumesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListVolumesResult>() {
            public ListVolumesResult call() throws Exception {
            	ListVolumesResult result;
                try {
            		result = listVolumes(listVolumesRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(listVolumesRequest, result);
               	return result;
		    }
		});
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
     *           parameters to execute the DescribeTapeRecoveryPoints operation on
     *           AWSStorageGateway.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeTapeRecoveryPoints service method, as returned by
     *         AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeTapeRecoveryPointsResult> describeTapeRecoveryPointsAsync(final DescribeTapeRecoveryPointsRequest describeTapeRecoveryPointsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeTapeRecoveryPointsResult>() {
            public DescribeTapeRecoveryPointsResult call() throws Exception {
                return describeTapeRecoveryPoints(describeTapeRecoveryPointsRequest);
		    }
		});
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
     *           parameters to execute the DescribeTapeRecoveryPoints operation on
     *           AWSStorageGateway.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeTapeRecoveryPoints service method, as returned by
     *         AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeTapeRecoveryPointsResult> describeTapeRecoveryPointsAsync(
            final DescribeTapeRecoveryPointsRequest describeTapeRecoveryPointsRequest,
            final AsyncHandler<DescribeTapeRecoveryPointsRequest, DescribeTapeRecoveryPointsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeTapeRecoveryPointsResult>() {
            public DescribeTapeRecoveryPointsResult call() throws Exception {
            	DescribeTapeRecoveryPointsResult result;
                try {
            		result = describeTapeRecoveryPoints(describeTapeRecoveryPointsRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeTapeRecoveryPointsRequest, result);
               	return result;
		    }
		});
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
     *           parameters to execute the UpdateSnapshotSchedule operation on
     *           AWSStorageGateway.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateSnapshotSchedule service method, as returned by
     *         AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateSnapshotScheduleResult> updateSnapshotScheduleAsync(final UpdateSnapshotScheduleRequest updateSnapshotScheduleRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateSnapshotScheduleResult>() {
            public UpdateSnapshotScheduleResult call() throws Exception {
                return updateSnapshotSchedule(updateSnapshotScheduleRequest);
		    }
		});
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
     *           parameters to execute the UpdateSnapshotSchedule operation on
     *           AWSStorageGateway.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateSnapshotSchedule service method, as returned by
     *         AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateSnapshotScheduleResult> updateSnapshotScheduleAsync(
            final UpdateSnapshotScheduleRequest updateSnapshotScheduleRequest,
            final AsyncHandler<UpdateSnapshotScheduleRequest, UpdateSnapshotScheduleResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateSnapshotScheduleResult>() {
            public UpdateSnapshotScheduleResult call() throws Exception {
            	UpdateSnapshotScheduleResult result;
                try {
            		result = updateSnapshotSchedule(updateSnapshotScheduleRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(updateSnapshotScheduleRequest, result);
               	return result;
		    }
		});
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
     *           execute the ListGateways operation on AWSStorageGateway.
     * 
     * @return A Java Future object containing the response from the
     *         ListGateways service method, as returned by AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListGatewaysResult> listGatewaysAsync(final ListGatewaysRequest listGatewaysRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListGatewaysResult>() {
            public ListGatewaysResult call() throws Exception {
                return listGateways(listGatewaysRequest);
		    }
		});
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
     *           execute the ListGateways operation on AWSStorageGateway.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListGateways service method, as returned by AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListGatewaysResult> listGatewaysAsync(
            final ListGatewaysRequest listGatewaysRequest,
            final AsyncHandler<ListGatewaysRequest, ListGatewaysResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListGatewaysResult>() {
            public ListGatewaysResult call() throws Exception {
            	ListGatewaysResult result;
                try {
            		result = listGateways(listGatewaysRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(listGatewaysRequest, result);
               	return result;
		    }
		});
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
     *           to execute the AddUploadBuffer operation on AWSStorageGateway.
     * 
     * @return A Java Future object containing the response from the
     *         AddUploadBuffer service method, as returned by AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<AddUploadBufferResult> addUploadBufferAsync(final AddUploadBufferRequest addUploadBufferRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<AddUploadBufferResult>() {
            public AddUploadBufferResult call() throws Exception {
                return addUploadBuffer(addUploadBufferRequest);
		    }
		});
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
     *           to execute the AddUploadBuffer operation on AWSStorageGateway.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         AddUploadBuffer service method, as returned by AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<AddUploadBufferResult> addUploadBufferAsync(
            final AddUploadBufferRequest addUploadBufferRequest,
            final AsyncHandler<AddUploadBufferRequest, AddUploadBufferResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<AddUploadBufferResult>() {
            public AddUploadBufferResult call() throws Exception {
            	AddUploadBufferResult result;
                try {
            		result = addUploadBuffer(addUploadBufferRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(addUploadBufferRequest, result);
               	return result;
		    }
		});
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
     *           parameters to execute the DescribeCachediSCSIVolumes operation on
     *           AWSStorageGateway.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeCachediSCSIVolumes service method, as returned by
     *         AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeCachediSCSIVolumesResult> describeCachediSCSIVolumesAsync(final DescribeCachediSCSIVolumesRequest describeCachediSCSIVolumesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeCachediSCSIVolumesResult>() {
            public DescribeCachediSCSIVolumesResult call() throws Exception {
                return describeCachediSCSIVolumes(describeCachediSCSIVolumesRequest);
		    }
		});
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
     *           parameters to execute the DescribeCachediSCSIVolumes operation on
     *           AWSStorageGateway.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeCachediSCSIVolumes service method, as returned by
     *         AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeCachediSCSIVolumesResult> describeCachediSCSIVolumesAsync(
            final DescribeCachediSCSIVolumesRequest describeCachediSCSIVolumesRequest,
            final AsyncHandler<DescribeCachediSCSIVolumesRequest, DescribeCachediSCSIVolumesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeCachediSCSIVolumesResult>() {
            public DescribeCachediSCSIVolumesResult call() throws Exception {
            	DescribeCachediSCSIVolumesResult result;
                try {
            		result = describeCachediSCSIVolumes(describeCachediSCSIVolumesRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeCachediSCSIVolumesRequest, result);
               	return result;
		    }
		});
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
     *           parameters to execute the DescribeStorediSCSIVolumes operation on
     *           AWSStorageGateway.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeStorediSCSIVolumes service method, as returned by
     *         AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeStorediSCSIVolumesResult> describeStorediSCSIVolumesAsync(final DescribeStorediSCSIVolumesRequest describeStorediSCSIVolumesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeStorediSCSIVolumesResult>() {
            public DescribeStorediSCSIVolumesResult call() throws Exception {
                return describeStorediSCSIVolumes(describeStorediSCSIVolumesRequest);
		    }
		});
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
     *           parameters to execute the DescribeStorediSCSIVolumes operation on
     *           AWSStorageGateway.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeStorediSCSIVolumes service method, as returned by
     *         AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeStorediSCSIVolumesResult> describeStorediSCSIVolumesAsync(
            final DescribeStorediSCSIVolumesRequest describeStorediSCSIVolumesRequest,
            final AsyncHandler<DescribeStorediSCSIVolumesRequest, DescribeStorediSCSIVolumesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeStorediSCSIVolumesResult>() {
            public DescribeStorediSCSIVolumesResult call() throws Exception {
            	DescribeStorediSCSIVolumesResult result;
                try {
            		result = describeStorediSCSIVolumes(describeStorediSCSIVolumesRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeStorediSCSIVolumesRequest, result);
               	return result;
		    }
		});
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
     *           parameters to execute the ListVolumeRecoveryPoints operation on
     *           AWSStorageGateway.
     * 
     * @return A Java Future object containing the response from the
     *         ListVolumeRecoveryPoints service method, as returned by
     *         AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListVolumeRecoveryPointsResult> listVolumeRecoveryPointsAsync(final ListVolumeRecoveryPointsRequest listVolumeRecoveryPointsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListVolumeRecoveryPointsResult>() {
            public ListVolumeRecoveryPointsResult call() throws Exception {
                return listVolumeRecoveryPoints(listVolumeRecoveryPointsRequest);
		    }
		});
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
     *           parameters to execute the ListVolumeRecoveryPoints operation on
     *           AWSStorageGateway.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListVolumeRecoveryPoints service method, as returned by
     *         AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListVolumeRecoveryPointsResult> listVolumeRecoveryPointsAsync(
            final ListVolumeRecoveryPointsRequest listVolumeRecoveryPointsRequest,
            final AsyncHandler<ListVolumeRecoveryPointsRequest, ListVolumeRecoveryPointsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListVolumeRecoveryPointsResult>() {
            public ListVolumeRecoveryPointsResult call() throws Exception {
            	ListVolumeRecoveryPointsResult result;
                try {
            		result = listVolumeRecoveryPoints(listVolumeRecoveryPointsRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(listVolumeRecoveryPointsRequest, result);
               	return result;
		    }
		});
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
     *           parameters to execute the DescribeVTLDevices operation on
     *           AWSStorageGateway.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeVTLDevices service method, as returned by AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeVTLDevicesResult> describeVTLDevicesAsync(final DescribeVTLDevicesRequest describeVTLDevicesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeVTLDevicesResult>() {
            public DescribeVTLDevicesResult call() throws Exception {
                return describeVTLDevices(describeVTLDevicesRequest);
		    }
		});
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
     *           parameters to execute the DescribeVTLDevices operation on
     *           AWSStorageGateway.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeVTLDevices service method, as returned by AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeVTLDevicesResult> describeVTLDevicesAsync(
            final DescribeVTLDevicesRequest describeVTLDevicesRequest,
            final AsyncHandler<DescribeVTLDevicesRequest, DescribeVTLDevicesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeVTLDevicesResult>() {
            public DescribeVTLDevicesResult call() throws Exception {
            	DescribeVTLDevicesResult result;
                try {
            		result = describeVTLDevices(describeVTLDevicesRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeVTLDevicesRequest, result);
               	return result;
		    }
		});
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
     *           parameters to execute the RetrieveTapeArchive operation on
     *           AWSStorageGateway.
     * 
     * @return A Java Future object containing the response from the
     *         RetrieveTapeArchive service method, as returned by AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<RetrieveTapeArchiveResult> retrieveTapeArchiveAsync(final RetrieveTapeArchiveRequest retrieveTapeArchiveRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<RetrieveTapeArchiveResult>() {
            public RetrieveTapeArchiveResult call() throws Exception {
                return retrieveTapeArchive(retrieveTapeArchiveRequest);
		    }
		});
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
     *           parameters to execute the RetrieveTapeArchive operation on
     *           AWSStorageGateway.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         RetrieveTapeArchive service method, as returned by AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<RetrieveTapeArchiveResult> retrieveTapeArchiveAsync(
            final RetrieveTapeArchiveRequest retrieveTapeArchiveRequest,
            final AsyncHandler<RetrieveTapeArchiveRequest, RetrieveTapeArchiveResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<RetrieveTapeArchiveResult>() {
            public RetrieveTapeArchiveResult call() throws Exception {
            	RetrieveTapeArchiveResult result;
                try {
            		result = retrieveTapeArchive(retrieveTapeArchiveRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(retrieveTapeArchiveRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Cancels archiving of a virtual tape to the Virtual Tape Shelf (VTS)
     * after archiving process is initiated.
     * </p>
     *
     * @param cancelArchivalRequest Container for the necessary parameters to
     *           execute the CancelArchival operation on AWSStorageGateway.
     * 
     * @return A Java Future object containing the response from the
     *         CancelArchival service method, as returned by AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CancelArchivalResult> cancelArchivalAsync(final CancelArchivalRequest cancelArchivalRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CancelArchivalResult>() {
            public CancelArchivalResult call() throws Exception {
                return cancelArchival(cancelArchivalRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Cancels archiving of a virtual tape to the Virtual Tape Shelf (VTS)
     * after archiving process is initiated.
     * </p>
     *
     * @param cancelArchivalRequest Container for the necessary parameters to
     *           execute the CancelArchival operation on AWSStorageGateway.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CancelArchival service method, as returned by AWSStorageGateway.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CancelArchivalResult> cancelArchivalAsync(
            final CancelArchivalRequest cancelArchivalRequest,
            final AsyncHandler<CancelArchivalRequest, CancelArchivalResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CancelArchivalResult>() {
            public CancelArchivalResult call() throws Exception {
            	CancelArchivalResult result;
                try {
            		result = cancelArchival(cancelArchivalRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(cancelArchivalRequest, result);
               	return result;
		    }
		});
    }
    
}
        