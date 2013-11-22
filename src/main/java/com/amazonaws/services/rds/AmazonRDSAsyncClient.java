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
package com.amazonaws.services.rds;

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

import com.amazonaws.services.rds.model.*;


/**
 * Asynchronous client for accessing AmazonRDS.
 * All asynchronous calls made using this client are non-blocking. Callers could either
 * process the result and handle the exceptions in the worker thread by providing a callback handler
 * when making the call, or use the returned Future object to check the result of the call in the calling thread.
 * Amazon Relational Database Service <p>
 * Amazon Relational Database Service (Amazon RDS) is a web service that makes it easier to set up, operate, and scale a relational database in the
 * cloud. It provides cost-efficient, resizable capacity for an industry-standard relational database and manages common database administration tasks,
 * freeing up developers to focus on what makes their applications and businesses unique.
 * </p>
 * <p>
 * Amazon RDS gives you access to the capabilities of a familiar MySQL or Oracle database server. This means the code, applications, and tools you
 * already use today with your existing MySQL or Oracle databases work with Amazon RDS without modification. Amazon RDS automatically backs up your
 * database and maintains the database software that powers your DB instance. Amazon RDS is flexible: you can scale your database instance's compute
 * resources and storage capacity to meet your application's demand. As with all Amazon Web Services, there are no up-front investments, and you pay only
 * for the resources you use.
 * </p>
 * <p>
 * This is an interface reference for Amazon RDS. It contains documentation for a programming or command line interface you can use to manage Amazon
 * RDS. Note that Amazon RDS is asynchronous, which means that some interfaces may require techniques such as polling or callback functions to determine
 * when a command has been applied. In this reference, the parameter descriptions indicate whether a command is applied immediately, on the next instance
 * reboot, or during the maintenance window. For a summary of the Amazon RDS interfaces, go to <a
 * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Welcome.html#Welcome.Interfaces"> Available RDS Interfaces </a> .
 * </p>
 */
public class AmazonRDSAsyncClient extends AmazonRDSClient
        implements AmazonRDSAsync {

    /**
     * Executor service for executing asynchronous requests.
     */
    private ExecutorService executorService;


    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonRDS.  A credentials provider chain will be used
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
    public AmazonRDSAsyncClient() {
        this(new DefaultAWSCredentialsProviderChain());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonRDS.  A credentials provider chain will be used
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
     *                       client connects to AmazonRDS
     *                       (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonRDSAsyncClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration, Executors.newCachedThreadPool());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonRDS using the specified AWS account credentials.
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
    public AmazonRDSAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, Executors.newCachedThreadPool());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonRDS using the specified AWS account credentials
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
    public AmazonRDSAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {
        super(awsCredentials);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonRDS using the specified AWS account credentials,
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
    public AmazonRDSAsyncClient(AWSCredentials awsCredentials,
                ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonRDS using the specified AWS account credentials provider.
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
    public AmazonRDSAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, Executors.newCachedThreadPool());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonRDS using the specified AWS account credentials provider
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
    public AmazonRDSAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, new ClientConfiguration(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonRDS using the specified AWS account credentials
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
    public AmazonRDSAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
                ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, Executors.newCachedThreadPool());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonRDS using the specified AWS account credentials
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
    public AmazonRDSAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
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
     * Lists all the subscription descriptions for a customer account. The
     * description for a subscription includes SubscriptionName, SNSTopicARN,
     * CustomerID, SourceType, SourceID, CreationTime, and Status.
     * </p>
     * <p>
     * If you specify a SubscriptionName, lists the description for that
     * subscription.
     * </p>
     *
     * @param describeEventSubscriptionsRequest Container for the necessary
     *           parameters to execute the DescribeEventSubscriptions operation on
     *           AmazonRDS.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeEventSubscriptions service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeEventSubscriptionsResult> describeEventSubscriptionsAsync(final DescribeEventSubscriptionsRequest describeEventSubscriptionsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeEventSubscriptionsResult>() {
            public DescribeEventSubscriptionsResult call() throws Exception {
                return describeEventSubscriptions(describeEventSubscriptionsRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Lists all the subscription descriptions for a customer account. The
     * description for a subscription includes SubscriptionName, SNSTopicARN,
     * CustomerID, SourceType, SourceID, CreationTime, and Status.
     * </p>
     * <p>
     * If you specify a SubscriptionName, lists the description for that
     * subscription.
     * </p>
     *
     * @param describeEventSubscriptionsRequest Container for the necessary
     *           parameters to execute the DescribeEventSubscriptions operation on
     *           AmazonRDS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeEventSubscriptions service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeEventSubscriptionsResult> describeEventSubscriptionsAsync(
            final DescribeEventSubscriptionsRequest describeEventSubscriptionsRequest,
            final AsyncHandler<DescribeEventSubscriptionsRequest, DescribeEventSubscriptionsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeEventSubscriptionsResult>() {
            public DescribeEventSubscriptionsResult call() throws Exception {
            	DescribeEventSubscriptionsResult result;
                try {
            		result = describeEventSubscriptions(describeEventSubscriptionsRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeEventSubscriptionsRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * The DeleteDBInstance action deletes a previously provisioned DB
     * instance. A successful response from the web service indicates the
     * request was received correctly. When you delete a DB instance, all
     * automated backups for that instance are deleted and cannot be
     * recovered. Manual DB snapshots of the DB instance to be deleted are
     * not deleted.
     * </p>
     * <p>
     * If a final DB snapshot is requested the status of the RDS instance
     * will be "deleting" until the DB snapshot is created. The API action
     * <code>DescribeDBInstance</code> is used to monitor the status of this
     * operation. The action cannot be canceled or reverted once submitted.
     * </p>
     *
     * @param deleteDBInstanceRequest Container for the necessary parameters
     *           to execute the DeleteDBInstance operation on AmazonRDS.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteDBInstance service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DBInstance> deleteDBInstanceAsync(final DeleteDBInstanceRequest deleteDBInstanceRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DBInstance>() {
            public DBInstance call() throws Exception {
                return deleteDBInstance(deleteDBInstanceRequest);
		    }
		});
    }

    
    /**
     * <p>
     * The DeleteDBInstance action deletes a previously provisioned DB
     * instance. A successful response from the web service indicates the
     * request was received correctly. When you delete a DB instance, all
     * automated backups for that instance are deleted and cannot be
     * recovered. Manual DB snapshots of the DB instance to be deleted are
     * not deleted.
     * </p>
     * <p>
     * If a final DB snapshot is requested the status of the RDS instance
     * will be "deleting" until the DB snapshot is created. The API action
     * <code>DescribeDBInstance</code> is used to monitor the status of this
     * operation. The action cannot be canceled or reverted once submitted.
     * </p>
     *
     * @param deleteDBInstanceRequest Container for the necessary parameters
     *           to execute the DeleteDBInstance operation on AmazonRDS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteDBInstance service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DBInstance> deleteDBInstanceAsync(
            final DeleteDBInstanceRequest deleteDBInstanceRequest,
            final AsyncHandler<DeleteDBInstanceRequest, DBInstance> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DBInstance>() {
            public DBInstance call() throws Exception {
            	DBInstance result;
                try {
            		result = deleteDBInstance(deleteDBInstanceRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(deleteDBInstanceRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Creates a new DB instance.
     * </p>
     *
     * @param createDBInstanceRequest Container for the necessary parameters
     *           to execute the CreateDBInstance operation on AmazonRDS.
     * 
     * @return A Java Future object containing the response from the
     *         CreateDBInstance service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DBInstance> createDBInstanceAsync(final CreateDBInstanceRequest createDBInstanceRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DBInstance>() {
            public DBInstance call() throws Exception {
                return createDBInstance(createDBInstanceRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Creates a new DB instance.
     * </p>
     *
     * @param createDBInstanceRequest Container for the necessary parameters
     *           to execute the CreateDBInstance operation on AmazonRDS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateDBInstance service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DBInstance> createDBInstanceAsync(
            final CreateDBInstanceRequest createDBInstanceRequest,
            final AsyncHandler<CreateDBInstanceRequest, DBInstance> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DBInstance>() {
            public DBInstance call() throws Exception {
            	DBInstance result;
                try {
            		result = createDBInstance(createDBInstanceRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(createDBInstanceRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Returns events related to DB instances, DB security groups, DB
     * snapshots, and DB parameter groups for the past 14 days. Events
     * specific to a particular DB instance, DB security group, database
     * snapshot, or DB parameter group can be obtained by providing the name
     * as a parameter. By default, the past hour of events are returned.
     * </p>
     *
     * @param describeEventsRequest Container for the necessary parameters to
     *           execute the DescribeEvents operation on AmazonRDS.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeEvents service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeEventsResult> describeEventsAsync(final DescribeEventsRequest describeEventsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeEventsResult>() {
            public DescribeEventsResult call() throws Exception {
                return describeEvents(describeEventsRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Returns events related to DB instances, DB security groups, DB
     * snapshots, and DB parameter groups for the past 14 days. Events
     * specific to a particular DB instance, DB security group, database
     * snapshot, or DB parameter group can be obtained by providing the name
     * as a parameter. By default, the past hour of events are returned.
     * </p>
     *
     * @param describeEventsRequest Container for the necessary parameters to
     *           execute the DescribeEvents operation on AmazonRDS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeEvents service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeEventsResult> describeEventsAsync(
            final DescribeEventsRequest describeEventsRequest,
            final AsyncHandler<DescribeEventsRequest, DescribeEventsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeEventsResult>() {
            public DescribeEventsResult call() throws Exception {
            	DescribeEventsResult result;
                try {
            		result = describeEvents(describeEventsRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeEventsRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Deletes a specified DBParameterGroup. The DBParameterGroup cannot be
     * associated with any RDS instances to be deleted.
     * </p>
     * <p>
     * <b>NOTE:</b> The specified DB parameter group cannot be associated
     * with any DB instances.
     * </p>
     *
     * @param deleteDBParameterGroupRequest Container for the necessary
     *           parameters to execute the DeleteDBParameterGroup operation on
     *           AmazonRDS.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteDBParameterGroup service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteDBParameterGroupAsync(final DeleteDBParameterGroupRequest deleteDBParameterGroupRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteDBParameterGroup(deleteDBParameterGroupRequest);
                return null;
		    }
		});
    }

    
    /**
     * <p>
     * Deletes a specified DBParameterGroup. The DBParameterGroup cannot be
     * associated with any RDS instances to be deleted.
     * </p>
     * <p>
     * <b>NOTE:</b> The specified DB parameter group cannot be associated
     * with any DB instances.
     * </p>
     *
     * @param deleteDBParameterGroupRequest Container for the necessary
     *           parameters to execute the DeleteDBParameterGroup operation on
     *           AmazonRDS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteDBParameterGroup service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteDBParameterGroupAsync(
            final DeleteDBParameterGroupRequest deleteDBParameterGroupRequest,
            final AsyncHandler<DeleteDBParameterGroupRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
            	try {
            		deleteDBParameterGroup(deleteDBParameterGroupRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(deleteDBParameterGroupRequest, null);
               	return null;
		    }
		});
    }
    
    /**
     * <p>
     * Returns information about DB snapshots. This API supports pagination.
     * </p>
     *
     * @param describeDBSnapshotsRequest Container for the necessary
     *           parameters to execute the DescribeDBSnapshots operation on AmazonRDS.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeDBSnapshots service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeDBSnapshotsResult> describeDBSnapshotsAsync(final DescribeDBSnapshotsRequest describeDBSnapshotsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeDBSnapshotsResult>() {
            public DescribeDBSnapshotsResult call() throws Exception {
                return describeDBSnapshots(describeDBSnapshotsRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Returns information about DB snapshots. This API supports pagination.
     * </p>
     *
     * @param describeDBSnapshotsRequest Container for the necessary
     *           parameters to execute the DescribeDBSnapshots operation on AmazonRDS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeDBSnapshots service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeDBSnapshotsResult> describeDBSnapshotsAsync(
            final DescribeDBSnapshotsRequest describeDBSnapshotsRequest,
            final AsyncHandler<DescribeDBSnapshotsRequest, DescribeDBSnapshotsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeDBSnapshotsResult>() {
            public DescribeDBSnapshotsResult call() throws Exception {
            	DescribeDBSnapshotsResult result;
                try {
            		result = describeDBSnapshots(describeDBSnapshotsRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeDBSnapshotsRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Returns a list of <code>DBSecurityGroup</code> descriptions. If a
     * <code>DBSecurityGroupName</code> is specified, the list will contain
     * only the descriptions of the specified DB security group.
     * </p>
     *
     * @param describeDBSecurityGroupsRequest Container for the necessary
     *           parameters to execute the DescribeDBSecurityGroups operation on
     *           AmazonRDS.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeDBSecurityGroups service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeDBSecurityGroupsResult> describeDBSecurityGroupsAsync(final DescribeDBSecurityGroupsRequest describeDBSecurityGroupsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeDBSecurityGroupsResult>() {
            public DescribeDBSecurityGroupsResult call() throws Exception {
                return describeDBSecurityGroups(describeDBSecurityGroupsRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Returns a list of <code>DBSecurityGroup</code> descriptions. If a
     * <code>DBSecurityGroupName</code> is specified, the list will contain
     * only the descriptions of the specified DB security group.
     * </p>
     *
     * @param describeDBSecurityGroupsRequest Container for the necessary
     *           parameters to execute the DescribeDBSecurityGroups operation on
     *           AmazonRDS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeDBSecurityGroups service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeDBSecurityGroupsResult> describeDBSecurityGroupsAsync(
            final DescribeDBSecurityGroupsRequest describeDBSecurityGroupsRequest,
            final AsyncHandler<DescribeDBSecurityGroupsRequest, DescribeDBSecurityGroupsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeDBSecurityGroupsResult>() {
            public DescribeDBSecurityGroupsResult call() throws Exception {
            	DescribeDBSecurityGroupsResult result;
                try {
            		result = describeDBSecurityGroups(describeDBSecurityGroupsRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeDBSecurityGroupsRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Creates a new DB security group. DB security groups control access to
     * a DB instance.
     * </p>
     *
     * @param createDBSecurityGroupRequest Container for the necessary
     *           parameters to execute the CreateDBSecurityGroup operation on
     *           AmazonRDS.
     * 
     * @return A Java Future object containing the response from the
     *         CreateDBSecurityGroup service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DBSecurityGroup> createDBSecurityGroupAsync(final CreateDBSecurityGroupRequest createDBSecurityGroupRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DBSecurityGroup>() {
            public DBSecurityGroup call() throws Exception {
                return createDBSecurityGroup(createDBSecurityGroupRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Creates a new DB security group. DB security groups control access to
     * a DB instance.
     * </p>
     *
     * @param createDBSecurityGroupRequest Container for the necessary
     *           parameters to execute the CreateDBSecurityGroup operation on
     *           AmazonRDS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateDBSecurityGroup service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DBSecurityGroup> createDBSecurityGroupAsync(
            final CreateDBSecurityGroupRequest createDBSecurityGroupRequest,
            final AsyncHandler<CreateDBSecurityGroupRequest, DBSecurityGroup> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DBSecurityGroup>() {
            public DBSecurityGroup call() throws Exception {
            	DBSecurityGroup result;
                try {
            		result = createDBSecurityGroup(createDBSecurityGroupRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(createDBSecurityGroupRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Restores a DB instance to an arbitrary point-in-time. Users can
     * restore to any point in time before the latestRestorableTime for up to
     * backupRetentionPeriod days. The target database is created from the
     * source database with the same configuration as the original database
     * except that the DB instance is created with the default DB security
     * group.
     * </p>
     *
     * @param restoreDBInstanceToPointInTimeRequest Container for the
     *           necessary parameters to execute the RestoreDBInstanceToPointInTime
     *           operation on AmazonRDS.
     * 
     * @return A Java Future object containing the response from the
     *         RestoreDBInstanceToPointInTime service method, as returned by
     *         AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DBInstance> restoreDBInstanceToPointInTimeAsync(final RestoreDBInstanceToPointInTimeRequest restoreDBInstanceToPointInTimeRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DBInstance>() {
            public DBInstance call() throws Exception {
                return restoreDBInstanceToPointInTime(restoreDBInstanceToPointInTimeRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Restores a DB instance to an arbitrary point-in-time. Users can
     * restore to any point in time before the latestRestorableTime for up to
     * backupRetentionPeriod days. The target database is created from the
     * source database with the same configuration as the original database
     * except that the DB instance is created with the default DB security
     * group.
     * </p>
     *
     * @param restoreDBInstanceToPointInTimeRequest Container for the
     *           necessary parameters to execute the RestoreDBInstanceToPointInTime
     *           operation on AmazonRDS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         RestoreDBInstanceToPointInTime service method, as returned by
     *         AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DBInstance> restoreDBInstanceToPointInTimeAsync(
            final RestoreDBInstanceToPointInTimeRequest restoreDBInstanceToPointInTimeRequest,
            final AsyncHandler<RestoreDBInstanceToPointInTimeRequest, DBInstance> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DBInstance>() {
            public DBInstance call() throws Exception {
            	DBInstance result;
                try {
            		result = restoreDBInstanceToPointInTime(restoreDBInstanceToPointInTimeRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(restoreDBInstanceToPointInTimeRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Describes all available options.
     * </p>
     *
     * @param describeOptionGroupOptionsRequest Container for the necessary
     *           parameters to execute the DescribeOptionGroupOptions operation on
     *           AmazonRDS.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeOptionGroupOptions service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeOptionGroupOptionsResult> describeOptionGroupOptionsAsync(final DescribeOptionGroupOptionsRequest describeOptionGroupOptionsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeOptionGroupOptionsResult>() {
            public DescribeOptionGroupOptionsResult call() throws Exception {
                return describeOptionGroupOptions(describeOptionGroupOptionsRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Describes all available options.
     * </p>
     *
     * @param describeOptionGroupOptionsRequest Container for the necessary
     *           parameters to execute the DescribeOptionGroupOptions operation on
     *           AmazonRDS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeOptionGroupOptions service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeOptionGroupOptionsResult> describeOptionGroupOptionsAsync(
            final DescribeOptionGroupOptionsRequest describeOptionGroupOptionsRequest,
            final AsyncHandler<DescribeOptionGroupOptionsRequest, DescribeOptionGroupOptionsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeOptionGroupOptionsResult>() {
            public DescribeOptionGroupOptionsResult call() throws Exception {
            	DescribeOptionGroupOptionsResult result;
                try {
            		result = describeOptionGroupOptions(describeOptionGroupOptionsRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeOptionGroupOptionsRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Deletes an existing option group.
     * </p>
     *
     * @param deleteOptionGroupRequest Container for the necessary parameters
     *           to execute the DeleteOptionGroup operation on AmazonRDS.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteOptionGroup service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteOptionGroupAsync(final DeleteOptionGroupRequest deleteOptionGroupRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteOptionGroup(deleteOptionGroupRequest);
                return null;
		    }
		});
    }

    
    /**
     * <p>
     * Deletes an existing option group.
     * </p>
     *
     * @param deleteOptionGroupRequest Container for the necessary parameters
     *           to execute the DeleteOptionGroup operation on AmazonRDS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteOptionGroup service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteOptionGroupAsync(
            final DeleteOptionGroupRequest deleteOptionGroupRequest,
            final AsyncHandler<DeleteOptionGroupRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
            	try {
            		deleteOptionGroup(deleteOptionGroupRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(deleteOptionGroupRequest, null);
               	return null;
		    }
		});
    }
    
    /**
     * <p>
     * Returns a list of DBSubnetGroup descriptions. If a DBSubnetGroupName
     * is specified, the list will contain only the descriptions of the
     * specified DBSubnetGroup.
     * </p>
     * <p>
     * For an overview of CIDR ranges, go to the <a
     * href="http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing">
     * Wikipedia Tutorial </a> .
     * </p>
     *
     * @param describeDBSubnetGroupsRequest Container for the necessary
     *           parameters to execute the DescribeDBSubnetGroups operation on
     *           AmazonRDS.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeDBSubnetGroups service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeDBSubnetGroupsResult> describeDBSubnetGroupsAsync(final DescribeDBSubnetGroupsRequest describeDBSubnetGroupsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeDBSubnetGroupsResult>() {
            public DescribeDBSubnetGroupsResult call() throws Exception {
                return describeDBSubnetGroups(describeDBSubnetGroupsRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Returns a list of DBSubnetGroup descriptions. If a DBSubnetGroupName
     * is specified, the list will contain only the descriptions of the
     * specified DBSubnetGroup.
     * </p>
     * <p>
     * For an overview of CIDR ranges, go to the <a
     * href="http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing">
     * Wikipedia Tutorial </a> .
     * </p>
     *
     * @param describeDBSubnetGroupsRequest Container for the necessary
     *           parameters to execute the DescribeDBSubnetGroups operation on
     *           AmazonRDS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeDBSubnetGroups service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeDBSubnetGroupsResult> describeDBSubnetGroupsAsync(
            final DescribeDBSubnetGroupsRequest describeDBSubnetGroupsRequest,
            final AsyncHandler<DescribeDBSubnetGroupsRequest, DescribeDBSubnetGroupsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeDBSubnetGroupsResult>() {
            public DescribeDBSubnetGroupsResult call() throws Exception {
            	DescribeDBSubnetGroupsResult result;
                try {
            		result = describeDBSubnetGroups(describeDBSubnetGroupsRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeDBSubnetGroupsRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Removes metadata tags from an Amazon RDS resource.
     * </p>
     * <p>
     * For an overview on tagging an Amazon RDS resource, see <a
     * docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.Tagging.html">
     * Tagging Amazon RDS Resources </a> .
     * </p>
     *
     * @param removeTagsFromResourceRequest Container for the necessary
     *           parameters to execute the RemoveTagsFromResource operation on
     *           AmazonRDS.
     * 
     * @return A Java Future object containing the response from the
     *         RemoveTagsFromResource service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> removeTagsFromResourceAsync(final RemoveTagsFromResourceRequest removeTagsFromResourceRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                removeTagsFromResource(removeTagsFromResourceRequest);
                return null;
		    }
		});
    }

    
    /**
     * <p>
     * Removes metadata tags from an Amazon RDS resource.
     * </p>
     * <p>
     * For an overview on tagging an Amazon RDS resource, see <a
     * docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.Tagging.html">
     * Tagging Amazon RDS Resources </a> .
     * </p>
     *
     * @param removeTagsFromResourceRequest Container for the necessary
     *           parameters to execute the RemoveTagsFromResource operation on
     *           AmazonRDS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         RemoveTagsFromResource service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> removeTagsFromResourceAsync(
            final RemoveTagsFromResourceRequest removeTagsFromResourceRequest,
            final AsyncHandler<RemoveTagsFromResourceRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
            	try {
            		removeTagsFromResource(removeTagsFromResourceRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(removeTagsFromResourceRequest, null);
               	return null;
		    }
		});
    }
    
    /**
     * <p>
     * Returns the detailed parameter list for a particular DB parameter
     * group.
     * </p>
     *
     * @param describeDBParametersRequest Container for the necessary
     *           parameters to execute the DescribeDBParameters operation on AmazonRDS.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeDBParameters service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeDBParametersResult> describeDBParametersAsync(final DescribeDBParametersRequest describeDBParametersRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeDBParametersResult>() {
            public DescribeDBParametersResult call() throws Exception {
                return describeDBParameters(describeDBParametersRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Returns the detailed parameter list for a particular DB parameter
     * group.
     * </p>
     *
     * @param describeDBParametersRequest Container for the necessary
     *           parameters to execute the DescribeDBParameters operation on AmazonRDS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeDBParameters service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeDBParametersResult> describeDBParametersAsync(
            final DescribeDBParametersRequest describeDBParametersRequest,
            final AsyncHandler<DescribeDBParametersRequest, DescribeDBParametersResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeDBParametersResult>() {
            public DescribeDBParametersResult call() throws Exception {
            	DescribeDBParametersResult result;
                try {
            		result = describeDBParameters(describeDBParametersRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeDBParametersRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Deletes a DB security group.
     * </p>
     * <p>
     * <b>NOTE:</b>The specified DB security group must not be associated
     * with any DB instances.
     * </p>
     *
     * @param deleteDBSecurityGroupRequest Container for the necessary
     *           parameters to execute the DeleteDBSecurityGroup operation on
     *           AmazonRDS.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteDBSecurityGroup service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteDBSecurityGroupAsync(final DeleteDBSecurityGroupRequest deleteDBSecurityGroupRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteDBSecurityGroup(deleteDBSecurityGroupRequest);
                return null;
		    }
		});
    }

    
    /**
     * <p>
     * Deletes a DB security group.
     * </p>
     * <p>
     * <b>NOTE:</b>The specified DB security group must not be associated
     * with any DB instances.
     * </p>
     *
     * @param deleteDBSecurityGroupRequest Container for the necessary
     *           parameters to execute the DeleteDBSecurityGroup operation on
     *           AmazonRDS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteDBSecurityGroup service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteDBSecurityGroupAsync(
            final DeleteDBSecurityGroupRequest deleteDBSecurityGroupRequest,
            final AsyncHandler<DeleteDBSecurityGroupRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
            	try {
            		deleteDBSecurityGroup(deleteDBSecurityGroupRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(deleteDBSecurityGroupRequest, null);
               	return null;
		    }
		});
    }
    
    /**
     * <p>
     * Returns a list of orderable DB instance options for the specified
     * engine.
     * </p>
     *
     * @param describeOrderableDBInstanceOptionsRequest Container for the
     *           necessary parameters to execute the DescribeOrderableDBInstanceOptions
     *           operation on AmazonRDS.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeOrderableDBInstanceOptions service method, as returned by
     *         AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeOrderableDBInstanceOptionsResult> describeOrderableDBInstanceOptionsAsync(final DescribeOrderableDBInstanceOptionsRequest describeOrderableDBInstanceOptionsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeOrderableDBInstanceOptionsResult>() {
            public DescribeOrderableDBInstanceOptionsResult call() throws Exception {
                return describeOrderableDBInstanceOptions(describeOrderableDBInstanceOptionsRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Returns a list of orderable DB instance options for the specified
     * engine.
     * </p>
     *
     * @param describeOrderableDBInstanceOptionsRequest Container for the
     *           necessary parameters to execute the DescribeOrderableDBInstanceOptions
     *           operation on AmazonRDS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeOrderableDBInstanceOptions service method, as returned by
     *         AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeOrderableDBInstanceOptionsResult> describeOrderableDBInstanceOptionsAsync(
            final DescribeOrderableDBInstanceOptionsRequest describeOrderableDBInstanceOptionsRequest,
            final AsyncHandler<DescribeOrderableDBInstanceOptionsRequest, DescribeOrderableDBInstanceOptionsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeOrderableDBInstanceOptionsResult>() {
            public DescribeOrderableDBInstanceOptionsResult call() throws Exception {
            	DescribeOrderableDBInstanceOptionsResult result;
                try {
            		result = describeOrderableDBInstanceOptions(describeOrderableDBInstanceOptionsRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeOrderableDBInstanceOptionsRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Creates a new DB parameter group.
     * </p>
     * <p>
     * A DB parameter group is initially created with the default parameters
     * for the database engine used by the DB instance. To provide custom
     * values for any of the parameters, you must modify the group after
     * creating it using <i>ModifyDBParameterGroup</i> . Once you've created
     * a DB parameter group, you need to associate it with your DB instance
     * using <i>ModifyDBInstance</i> . When you associate a new DB parameter
     * group with a running DB instance, you need to reboot the DB Instance
     * for the new DB parameter group and associated settings to take effect.
     * </p>
     *
     * @param createDBParameterGroupRequest Container for the necessary
     *           parameters to execute the CreateDBParameterGroup operation on
     *           AmazonRDS.
     * 
     * @return A Java Future object containing the response from the
     *         CreateDBParameterGroup service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DBParameterGroup> createDBParameterGroupAsync(final CreateDBParameterGroupRequest createDBParameterGroupRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DBParameterGroup>() {
            public DBParameterGroup call() throws Exception {
                return createDBParameterGroup(createDBParameterGroupRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Creates a new DB parameter group.
     * </p>
     * <p>
     * A DB parameter group is initially created with the default parameters
     * for the database engine used by the DB instance. To provide custom
     * values for any of the parameters, you must modify the group after
     * creating it using <i>ModifyDBParameterGroup</i> . Once you've created
     * a DB parameter group, you need to associate it with your DB instance
     * using <i>ModifyDBInstance</i> . When you associate a new DB parameter
     * group with a running DB instance, you need to reboot the DB Instance
     * for the new DB parameter group and associated settings to take effect.
     * </p>
     *
     * @param createDBParameterGroupRequest Container for the necessary
     *           parameters to execute the CreateDBParameterGroup operation on
     *           AmazonRDS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateDBParameterGroup service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DBParameterGroup> createDBParameterGroupAsync(
            final CreateDBParameterGroupRequest createDBParameterGroupRequest,
            final AsyncHandler<CreateDBParameterGroupRequest, DBParameterGroup> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DBParameterGroup>() {
            public DBParameterGroup call() throws Exception {
            	DBParameterGroup result;
                try {
            		result = createDBParameterGroup(createDBParameterGroupRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(createDBParameterGroupRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Adds metadata tags to an Amazon RDS resource. These tags can also be
     * used with cost allocation reporting to track cost associated with
     * Amazon RDS resources, or used in Condition statement in IAM policy for
     * Amazon RDS.
     * </p>
     * <p>
     * For an overview on tagging Amazon RDS resources, see <a
     * docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.Tagging.html">
     * Tagging Amazon RDS Resources </a> .
     * </p>
     *
     * @param addTagsToResourceRequest Container for the necessary parameters
     *           to execute the AddTagsToResource operation on AmazonRDS.
     * 
     * @return A Java Future object containing the response from the
     *         AddTagsToResource service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> addTagsToResourceAsync(final AddTagsToResourceRequest addTagsToResourceRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                addTagsToResource(addTagsToResourceRequest);
                return null;
		    }
		});
    }

    
    /**
     * <p>
     * Adds metadata tags to an Amazon RDS resource. These tags can also be
     * used with cost allocation reporting to track cost associated with
     * Amazon RDS resources, or used in Condition statement in IAM policy for
     * Amazon RDS.
     * </p>
     * <p>
     * For an overview on tagging Amazon RDS resources, see <a
     * docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.Tagging.html">
     * Tagging Amazon RDS Resources </a> .
     * </p>
     *
     * @param addTagsToResourceRequest Container for the necessary parameters
     *           to execute the AddTagsToResource operation on AmazonRDS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         AddTagsToResource service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> addTagsToResourceAsync(
            final AddTagsToResourceRequest addTagsToResourceRequest,
            final AsyncHandler<AddTagsToResourceRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
            	try {
            		addTagsToResource(addTagsToResourceRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(addTagsToResourceRequest, null);
               	return null;
		    }
		});
    }
    
    /**
     * <p>
     * Lists all tags on an Amazon RDS resource.
     * </p>
     * <p>
     * For an overview on tagging an Amazon RDS resource, see <a
     * docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.Tagging.html">
     * Tagging Amazon RDS Resources </a> .
     * </p>
     *
     * @param listTagsForResourceRequest Container for the necessary
     *           parameters to execute the ListTagsForResource operation on AmazonRDS.
     * 
     * @return A Java Future object containing the response from the
     *         ListTagsForResource service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListTagsForResourceResult> listTagsForResourceAsync(final ListTagsForResourceRequest listTagsForResourceRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListTagsForResourceResult>() {
            public ListTagsForResourceResult call() throws Exception {
                return listTagsForResource(listTagsForResourceRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Lists all tags on an Amazon RDS resource.
     * </p>
     * <p>
     * For an overview on tagging an Amazon RDS resource, see <a
     * docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.Tagging.html">
     * Tagging Amazon RDS Resources </a> .
     * </p>
     *
     * @param listTagsForResourceRequest Container for the necessary
     *           parameters to execute the ListTagsForResource operation on AmazonRDS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListTagsForResource service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListTagsForResourceResult> listTagsForResourceAsync(
            final ListTagsForResourceRequest listTagsForResourceRequest,
            final AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListTagsForResourceResult>() {
            public ListTagsForResourceResult call() throws Exception {
            	ListTagsForResourceResult result;
                try {
            		result = listTagsForResource(listTagsForResourceRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(listTagsForResourceRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Deletes a DBSnapshot. If the snapshot is being copied, the copy
     * operation is terminated.
     * </p>
     * <p>
     * <b>NOTE:</b>The DBSnapshot must be in the available state to be
     * deleted.
     * </p>
     *
     * @param deleteDBSnapshotRequest Container for the necessary parameters
     *           to execute the DeleteDBSnapshot operation on AmazonRDS.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteDBSnapshot service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DBSnapshot> deleteDBSnapshotAsync(final DeleteDBSnapshotRequest deleteDBSnapshotRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DBSnapshot>() {
            public DBSnapshot call() throws Exception {
                return deleteDBSnapshot(deleteDBSnapshotRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Deletes a DBSnapshot. If the snapshot is being copied, the copy
     * operation is terminated.
     * </p>
     * <p>
     * <b>NOTE:</b>The DBSnapshot must be in the available state to be
     * deleted.
     * </p>
     *
     * @param deleteDBSnapshotRequest Container for the necessary parameters
     *           to execute the DeleteDBSnapshot operation on AmazonRDS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteDBSnapshot service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DBSnapshot> deleteDBSnapshotAsync(
            final DeleteDBSnapshotRequest deleteDBSnapshotRequest,
            final AsyncHandler<DeleteDBSnapshotRequest, DBSnapshot> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DBSnapshot>() {
            public DBSnapshot call() throws Exception {
            	DBSnapshot result;
                try {
            		result = deleteDBSnapshot(deleteDBSnapshotRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(deleteDBSnapshotRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Modifies an existing DB subnet group. DB subnet groups must contain
     * at least one subnet in at least two AZs in the region.
     * </p>
     *
     * @param modifyDBSubnetGroupRequest Container for the necessary
     *           parameters to execute the ModifyDBSubnetGroup operation on AmazonRDS.
     * 
     * @return A Java Future object containing the response from the
     *         ModifyDBSubnetGroup service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DBSubnetGroup> modifyDBSubnetGroupAsync(final ModifyDBSubnetGroupRequest modifyDBSubnetGroupRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DBSubnetGroup>() {
            public DBSubnetGroup call() throws Exception {
                return modifyDBSubnetGroup(modifyDBSubnetGroupRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Modifies an existing DB subnet group. DB subnet groups must contain
     * at least one subnet in at least two AZs in the region.
     * </p>
     *
     * @param modifyDBSubnetGroupRequest Container for the necessary
     *           parameters to execute the ModifyDBSubnetGroup operation on AmazonRDS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ModifyDBSubnetGroup service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DBSubnetGroup> modifyDBSubnetGroupAsync(
            final ModifyDBSubnetGroupRequest modifyDBSubnetGroupRequest,
            final AsyncHandler<ModifyDBSubnetGroupRequest, DBSubnetGroup> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DBSubnetGroup>() {
            public DBSubnetGroup call() throws Exception {
            	DBSubnetGroup result;
                try {
            		result = modifyDBSubnetGroup(modifyDBSubnetGroupRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(modifyDBSubnetGroupRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Creates a new option group. You can create up to 20 option groups.
     * </p>
     *
     * @param createOptionGroupRequest Container for the necessary parameters
     *           to execute the CreateOptionGroup operation on AmazonRDS.
     * 
     * @return A Java Future object containing the response from the
     *         CreateOptionGroup service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<OptionGroup> createOptionGroupAsync(final CreateOptionGroupRequest createOptionGroupRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<OptionGroup>() {
            public OptionGroup call() throws Exception {
                return createOptionGroup(createOptionGroupRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Creates a new option group. You can create up to 20 option groups.
     * </p>
     *
     * @param createOptionGroupRequest Container for the necessary parameters
     *           to execute the CreateOptionGroup operation on AmazonRDS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateOptionGroup service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<OptionGroup> createOptionGroupAsync(
            final CreateOptionGroupRequest createOptionGroupRequest,
            final AsyncHandler<CreateOptionGroupRequest, OptionGroup> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<OptionGroup>() {
            public OptionGroup call() throws Exception {
            	OptionGroup result;
                try {
            		result = createOptionGroup(createOptionGroupRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(createOptionGroupRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Returns a list of <code>DBParameterGroup</code> descriptions. If a
     * <code>DBParameterGroupName</code> is specified, the list will contain
     * only the description of the specified DB parameter group.
     * </p>
     *
     * @param describeDBParameterGroupsRequest Container for the necessary
     *           parameters to execute the DescribeDBParameterGroups operation on
     *           AmazonRDS.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeDBParameterGroups service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeDBParameterGroupsResult> describeDBParameterGroupsAsync(final DescribeDBParameterGroupsRequest describeDBParameterGroupsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeDBParameterGroupsResult>() {
            public DescribeDBParameterGroupsResult call() throws Exception {
                return describeDBParameterGroups(describeDBParameterGroupsRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Returns a list of <code>DBParameterGroup</code> descriptions. If a
     * <code>DBParameterGroupName</code> is specified, the list will contain
     * only the description of the specified DB parameter group.
     * </p>
     *
     * @param describeDBParameterGroupsRequest Container for the necessary
     *           parameters to execute the DescribeDBParameterGroups operation on
     *           AmazonRDS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeDBParameterGroups service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeDBParameterGroupsResult> describeDBParameterGroupsAsync(
            final DescribeDBParameterGroupsRequest describeDBParameterGroupsRequest,
            final AsyncHandler<DescribeDBParameterGroupsRequest, DescribeDBParameterGroupsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeDBParameterGroupsResult>() {
            public DescribeDBParameterGroupsResult call() throws Exception {
            	DescribeDBParameterGroupsResult result;
                try {
            		result = describeDBParameterGroups(describeDBParameterGroupsRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeDBParameterGroupsRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Revokes ingress from a DBSecurityGroup for previously authorized IP
     * ranges or EC2 or VPC Security Groups. Required parameters for this API
     * are one of CIDRIP, EC2SecurityGroupId for VPC, or
     * (EC2SecurityGroupOwnerId and either EC2SecurityGroupName or
     * EC2SecurityGroupId).
     * </p>
     *
     * @param revokeDBSecurityGroupIngressRequest Container for the necessary
     *           parameters to execute the RevokeDBSecurityGroupIngress operation on
     *           AmazonRDS.
     * 
     * @return A Java Future object containing the response from the
     *         RevokeDBSecurityGroupIngress service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DBSecurityGroup> revokeDBSecurityGroupIngressAsync(final RevokeDBSecurityGroupIngressRequest revokeDBSecurityGroupIngressRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DBSecurityGroup>() {
            public DBSecurityGroup call() throws Exception {
                return revokeDBSecurityGroupIngress(revokeDBSecurityGroupIngressRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Revokes ingress from a DBSecurityGroup for previously authorized IP
     * ranges or EC2 or VPC Security Groups. Required parameters for this API
     * are one of CIDRIP, EC2SecurityGroupId for VPC, or
     * (EC2SecurityGroupOwnerId and either EC2SecurityGroupName or
     * EC2SecurityGroupId).
     * </p>
     *
     * @param revokeDBSecurityGroupIngressRequest Container for the necessary
     *           parameters to execute the RevokeDBSecurityGroupIngress operation on
     *           AmazonRDS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         RevokeDBSecurityGroupIngress service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DBSecurityGroup> revokeDBSecurityGroupIngressAsync(
            final RevokeDBSecurityGroupIngressRequest revokeDBSecurityGroupIngressRequest,
            final AsyncHandler<RevokeDBSecurityGroupIngressRequest, DBSecurityGroup> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DBSecurityGroup>() {
            public DBSecurityGroup call() throws Exception {
            	DBSecurityGroup result;
                try {
            		result = revokeDBSecurityGroupIngress(revokeDBSecurityGroupIngressRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(revokeDBSecurityGroupIngressRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Lists available reserved DB instance offerings.
     * </p>
     *
     * @param describeReservedDBInstancesOfferingsRequest Container for the
     *           necessary parameters to execute the
     *           DescribeReservedDBInstancesOfferings operation on AmazonRDS.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeReservedDBInstancesOfferings service method, as returned by
     *         AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeReservedDBInstancesOfferingsResult> describeReservedDBInstancesOfferingsAsync(final DescribeReservedDBInstancesOfferingsRequest describeReservedDBInstancesOfferingsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeReservedDBInstancesOfferingsResult>() {
            public DescribeReservedDBInstancesOfferingsResult call() throws Exception {
                return describeReservedDBInstancesOfferings(describeReservedDBInstancesOfferingsRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Lists available reserved DB instance offerings.
     * </p>
     *
     * @param describeReservedDBInstancesOfferingsRequest Container for the
     *           necessary parameters to execute the
     *           DescribeReservedDBInstancesOfferings operation on AmazonRDS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeReservedDBInstancesOfferings service method, as returned by
     *         AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeReservedDBInstancesOfferingsResult> describeReservedDBInstancesOfferingsAsync(
            final DescribeReservedDBInstancesOfferingsRequest describeReservedDBInstancesOfferingsRequest,
            final AsyncHandler<DescribeReservedDBInstancesOfferingsRequest, DescribeReservedDBInstancesOfferingsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeReservedDBInstancesOfferingsResult>() {
            public DescribeReservedDBInstancesOfferingsResult call() throws Exception {
            	DescribeReservedDBInstancesOfferingsResult result;
                try {
            		result = describeReservedDBInstancesOfferings(describeReservedDBInstancesOfferingsRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeReservedDBInstancesOfferingsRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Creates a DB instance that acts as a read replica of a source DB
     * instance.
     * </p>
     * <p>
     * All read replica DB instances are created as Single-AZ deployments
     * with backups disabled. All other DB instance attributes (including DB
     * security groups and DB parameter groups) are inherited from the source
     * DB instance, except as specified below.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> The source DB instance must have backup retention
     * enabled.
     * </p>
     *
     * @param createDBInstanceReadReplicaRequest Container for the necessary
     *           parameters to execute the CreateDBInstanceReadReplica operation on
     *           AmazonRDS.
     * 
     * @return A Java Future object containing the response from the
     *         CreateDBInstanceReadReplica service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DBInstance> createDBInstanceReadReplicaAsync(final CreateDBInstanceReadReplicaRequest createDBInstanceReadReplicaRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DBInstance>() {
            public DBInstance call() throws Exception {
                return createDBInstanceReadReplica(createDBInstanceReadReplicaRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Creates a DB instance that acts as a read replica of a source DB
     * instance.
     * </p>
     * <p>
     * All read replica DB instances are created as Single-AZ deployments
     * with backups disabled. All other DB instance attributes (including DB
     * security groups and DB parameter groups) are inherited from the source
     * DB instance, except as specified below.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> The source DB instance must have backup retention
     * enabled.
     * </p>
     *
     * @param createDBInstanceReadReplicaRequest Container for the necessary
     *           parameters to execute the CreateDBInstanceReadReplica operation on
     *           AmazonRDS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateDBInstanceReadReplica service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DBInstance> createDBInstanceReadReplicaAsync(
            final CreateDBInstanceReadReplicaRequest createDBInstanceReadReplicaRequest,
            final AsyncHandler<CreateDBInstanceReadReplicaRequest, DBInstance> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DBInstance>() {
            public DBInstance call() throws Exception {
            	DBInstance result;
                try {
            		result = createDBInstanceReadReplica(createDBInstanceReadReplicaRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(createDBInstanceReadReplicaRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Returns information about provisioned RDS instances. This API
     * supports pagination.
     * </p>
     *
     * @param describeDBInstancesRequest Container for the necessary
     *           parameters to execute the DescribeDBInstances operation on AmazonRDS.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeDBInstances service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeDBInstancesResult> describeDBInstancesAsync(final DescribeDBInstancesRequest describeDBInstancesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeDBInstancesResult>() {
            public DescribeDBInstancesResult call() throws Exception {
                return describeDBInstances(describeDBInstancesRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Returns information about provisioned RDS instances. This API
     * supports pagination.
     * </p>
     *
     * @param describeDBInstancesRequest Container for the necessary
     *           parameters to execute the DescribeDBInstances operation on AmazonRDS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeDBInstances service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeDBInstancesResult> describeDBInstancesAsync(
            final DescribeDBInstancesRequest describeDBInstancesRequest,
            final AsyncHandler<DescribeDBInstancesRequest, DescribeDBInstancesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeDBInstancesResult>() {
            public DescribeDBInstancesResult call() throws Exception {
            	DescribeDBInstancesResult result;
                try {
            		result = describeDBInstances(describeDBInstancesRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeDBInstancesRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Purchases a reserved DB instance offering.
     * </p>
     *
     * @param purchaseReservedDBInstancesOfferingRequest Container for the
     *           necessary parameters to execute the
     *           PurchaseReservedDBInstancesOffering operation on AmazonRDS.
     * 
     * @return A Java Future object containing the response from the
     *         PurchaseReservedDBInstancesOffering service method, as returned by
     *         AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ReservedDBInstance> purchaseReservedDBInstancesOfferingAsync(final PurchaseReservedDBInstancesOfferingRequest purchaseReservedDBInstancesOfferingRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ReservedDBInstance>() {
            public ReservedDBInstance call() throws Exception {
                return purchaseReservedDBInstancesOffering(purchaseReservedDBInstancesOfferingRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Purchases a reserved DB instance offering.
     * </p>
     *
     * @param purchaseReservedDBInstancesOfferingRequest Container for the
     *           necessary parameters to execute the
     *           PurchaseReservedDBInstancesOffering operation on AmazonRDS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         PurchaseReservedDBInstancesOffering service method, as returned by
     *         AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ReservedDBInstance> purchaseReservedDBInstancesOfferingAsync(
            final PurchaseReservedDBInstancesOfferingRequest purchaseReservedDBInstancesOfferingRequest,
            final AsyncHandler<PurchaseReservedDBInstancesOfferingRequest, ReservedDBInstance> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ReservedDBInstance>() {
            public ReservedDBInstance call() throws Exception {
            	ReservedDBInstance result;
                try {
            		result = purchaseReservedDBInstancesOffering(purchaseReservedDBInstancesOfferingRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(purchaseReservedDBInstancesOfferingRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Removes a source identifier from an existing RDS event notification
     * subscription.
     * </p>
     *
     * @param removeSourceIdentifierFromSubscriptionRequest Container for the
     *           necessary parameters to execute the
     *           RemoveSourceIdentifierFromSubscription operation on AmazonRDS.
     * 
     * @return A Java Future object containing the response from the
     *         RemoveSourceIdentifierFromSubscription service method, as returned by
     *         AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<EventSubscription> removeSourceIdentifierFromSubscriptionAsync(final RemoveSourceIdentifierFromSubscriptionRequest removeSourceIdentifierFromSubscriptionRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<EventSubscription>() {
            public EventSubscription call() throws Exception {
                return removeSourceIdentifierFromSubscription(removeSourceIdentifierFromSubscriptionRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Removes a source identifier from an existing RDS event notification
     * subscription.
     * </p>
     *
     * @param removeSourceIdentifierFromSubscriptionRequest Container for the
     *           necessary parameters to execute the
     *           RemoveSourceIdentifierFromSubscription operation on AmazonRDS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         RemoveSourceIdentifierFromSubscription service method, as returned by
     *         AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<EventSubscription> removeSourceIdentifierFromSubscriptionAsync(
            final RemoveSourceIdentifierFromSubscriptionRequest removeSourceIdentifierFromSubscriptionRequest,
            final AsyncHandler<RemoveSourceIdentifierFromSubscriptionRequest, EventSubscription> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<EventSubscription>() {
            public EventSubscription call() throws Exception {
            	EventSubscription result;
                try {
            		result = removeSourceIdentifierFromSubscription(removeSourceIdentifierFromSubscriptionRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(removeSourceIdentifierFromSubscriptionRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Returns the default engine and system parameter information for the
     * specified database engine.
     * </p>
     *
     * @param describeEngineDefaultParametersRequest Container for the
     *           necessary parameters to execute the DescribeEngineDefaultParameters
     *           operation on AmazonRDS.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeEngineDefaultParameters service method, as returned by
     *         AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<EngineDefaults> describeEngineDefaultParametersAsync(final DescribeEngineDefaultParametersRequest describeEngineDefaultParametersRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<EngineDefaults>() {
            public EngineDefaults call() throws Exception {
                return describeEngineDefaultParameters(describeEngineDefaultParametersRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Returns the default engine and system parameter information for the
     * specified database engine.
     * </p>
     *
     * @param describeEngineDefaultParametersRequest Container for the
     *           necessary parameters to execute the DescribeEngineDefaultParameters
     *           operation on AmazonRDS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeEngineDefaultParameters service method, as returned by
     *         AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<EngineDefaults> describeEngineDefaultParametersAsync(
            final DescribeEngineDefaultParametersRequest describeEngineDefaultParametersRequest,
            final AsyncHandler<DescribeEngineDefaultParametersRequest, EngineDefaults> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<EngineDefaults>() {
            public EngineDefaults call() throws Exception {
            	EngineDefaults result;
                try {
            		result = describeEngineDefaultParameters(describeEngineDefaultParametersRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeEngineDefaultParametersRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Modify settings for a DB instance. You can change one or more
     * database configuration parameters by specifying these parameters and
     * the new values in the request.
     * </p>
     *
     * @param modifyDBInstanceRequest Container for the necessary parameters
     *           to execute the ModifyDBInstance operation on AmazonRDS.
     * 
     * @return A Java Future object containing the response from the
     *         ModifyDBInstance service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DBInstance> modifyDBInstanceAsync(final ModifyDBInstanceRequest modifyDBInstanceRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DBInstance>() {
            public DBInstance call() throws Exception {
                return modifyDBInstance(modifyDBInstanceRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Modify settings for a DB instance. You can change one or more
     * database configuration parameters by specifying these parameters and
     * the new values in the request.
     * </p>
     *
     * @param modifyDBInstanceRequest Container for the necessary parameters
     *           to execute the ModifyDBInstance operation on AmazonRDS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ModifyDBInstance service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DBInstance> modifyDBInstanceAsync(
            final ModifyDBInstanceRequest modifyDBInstanceRequest,
            final AsyncHandler<ModifyDBInstanceRequest, DBInstance> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DBInstance>() {
            public DBInstance call() throws Exception {
            	DBInstance result;
                try {
            		result = modifyDBInstance(modifyDBInstanceRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(modifyDBInstanceRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Modifies an existing option group.
     * </p>
     *
     * @param modifyOptionGroupRequest Container for the necessary parameters
     *           to execute the ModifyOptionGroup operation on AmazonRDS.
     * 
     * @return A Java Future object containing the response from the
     *         ModifyOptionGroup service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<OptionGroup> modifyOptionGroupAsync(final ModifyOptionGroupRequest modifyOptionGroupRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<OptionGroup>() {
            public OptionGroup call() throws Exception {
                return modifyOptionGroup(modifyOptionGroupRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Modifies an existing option group.
     * </p>
     *
     * @param modifyOptionGroupRequest Container for the necessary parameters
     *           to execute the ModifyOptionGroup operation on AmazonRDS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ModifyOptionGroup service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<OptionGroup> modifyOptionGroupAsync(
            final ModifyOptionGroupRequest modifyOptionGroupRequest,
            final AsyncHandler<ModifyOptionGroupRequest, OptionGroup> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<OptionGroup>() {
            public OptionGroup call() throws Exception {
            	OptionGroup result;
                try {
            		result = modifyOptionGroup(modifyOptionGroupRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(modifyOptionGroupRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Enables ingress to a DBSecurityGroup using one of two forms of
     * authorization. First, EC2 or VPC security groups can be added to the
     * DBSecurityGroup if the application using the database is running on
     * EC2 or VPC instances. Second, IP ranges are available if the
     * application accessing your database is running on the Internet.
     * Required parameters for this API are one of CIDR range,
     * EC2SecurityGroupId for VPC, or (EC2SecurityGroupOwnerId and either
     * EC2SecurityGroupName or EC2SecurityGroupId for non-VPC).
     * </p>
     * <p>
     * <b>NOTE:</b> You cannot authorize ingress from an EC2 security group
     * in one Region to an Amazon RDS DB instance in another. You cannot
     * authorize ingress from a VPC security group in one VPC to an Amazon
     * RDS DB instance in another.
     * </p>
     * <p>
     * For an overview of CIDR ranges, go to the <a
     * href="http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing">
     * Wikipedia Tutorial </a> .
     * </p>
     *
     * @param authorizeDBSecurityGroupIngressRequest Container for the
     *           necessary parameters to execute the AuthorizeDBSecurityGroupIngress
     *           operation on AmazonRDS.
     * 
     * @return A Java Future object containing the response from the
     *         AuthorizeDBSecurityGroupIngress service method, as returned by
     *         AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DBSecurityGroup> authorizeDBSecurityGroupIngressAsync(final AuthorizeDBSecurityGroupIngressRequest authorizeDBSecurityGroupIngressRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DBSecurityGroup>() {
            public DBSecurityGroup call() throws Exception {
                return authorizeDBSecurityGroupIngress(authorizeDBSecurityGroupIngressRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Enables ingress to a DBSecurityGroup using one of two forms of
     * authorization. First, EC2 or VPC security groups can be added to the
     * DBSecurityGroup if the application using the database is running on
     * EC2 or VPC instances. Second, IP ranges are available if the
     * application accessing your database is running on the Internet.
     * Required parameters for this API are one of CIDR range,
     * EC2SecurityGroupId for VPC, or (EC2SecurityGroupOwnerId and either
     * EC2SecurityGroupName or EC2SecurityGroupId for non-VPC).
     * </p>
     * <p>
     * <b>NOTE:</b> You cannot authorize ingress from an EC2 security group
     * in one Region to an Amazon RDS DB instance in another. You cannot
     * authorize ingress from a VPC security group in one VPC to an Amazon
     * RDS DB instance in another.
     * </p>
     * <p>
     * For an overview of CIDR ranges, go to the <a
     * href="http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing">
     * Wikipedia Tutorial </a> .
     * </p>
     *
     * @param authorizeDBSecurityGroupIngressRequest Container for the
     *           necessary parameters to execute the AuthorizeDBSecurityGroupIngress
     *           operation on AmazonRDS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         AuthorizeDBSecurityGroupIngress service method, as returned by
     *         AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DBSecurityGroup> authorizeDBSecurityGroupIngressAsync(
            final AuthorizeDBSecurityGroupIngressRequest authorizeDBSecurityGroupIngressRequest,
            final AsyncHandler<AuthorizeDBSecurityGroupIngressRequest, DBSecurityGroup> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DBSecurityGroup>() {
            public DBSecurityGroup call() throws Exception {
            	DBSecurityGroup result;
                try {
            		result = authorizeDBSecurityGroupIngress(authorizeDBSecurityGroupIngressRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(authorizeDBSecurityGroupIngressRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Adds a source identifier to an existing RDS event notification
     * subscription.
     * </p>
     *
     * @param addSourceIdentifierToSubscriptionRequest Container for the
     *           necessary parameters to execute the AddSourceIdentifierToSubscription
     *           operation on AmazonRDS.
     * 
     * @return A Java Future object containing the response from the
     *         AddSourceIdentifierToSubscription service method, as returned by
     *         AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<EventSubscription> addSourceIdentifierToSubscriptionAsync(final AddSourceIdentifierToSubscriptionRequest addSourceIdentifierToSubscriptionRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<EventSubscription>() {
            public EventSubscription call() throws Exception {
                return addSourceIdentifierToSubscription(addSourceIdentifierToSubscriptionRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Adds a source identifier to an existing RDS event notification
     * subscription.
     * </p>
     *
     * @param addSourceIdentifierToSubscriptionRequest Container for the
     *           necessary parameters to execute the AddSourceIdentifierToSubscription
     *           operation on AmazonRDS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         AddSourceIdentifierToSubscription service method, as returned by
     *         AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<EventSubscription> addSourceIdentifierToSubscriptionAsync(
            final AddSourceIdentifierToSubscriptionRequest addSourceIdentifierToSubscriptionRequest,
            final AsyncHandler<AddSourceIdentifierToSubscriptionRequest, EventSubscription> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<EventSubscription>() {
            public EventSubscription call() throws Exception {
            	EventSubscription result;
                try {
            		result = addSourceIdentifierToSubscription(addSourceIdentifierToSubscriptionRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(addSourceIdentifierToSubscriptionRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Modifies the parameters of a DB parameter group. To modify more than
     * one parameter, submit a list of the following:
     * <code>ParameterName</code> ,
     * <code>ParameterValue</code> , and
     * <code>ApplyMethod</code> . A maximum of 20 parameters can be modified
     * in a single request.
     * </p>
     * <p>
     * <b>NOTE:</b> The apply-immediate method can be used only for dynamic
     * parameters; the pending-reboot method can be used with MySQL and
     * Oracle DB instances for either dynamic or static parameters. For
     * Microsoft SQL Server DB instances, the pending-reboot method can be
     * used only for static parameters.
     * </p>
     *
     * @param modifyDBParameterGroupRequest Container for the necessary
     *           parameters to execute the ModifyDBParameterGroup operation on
     *           AmazonRDS.
     * 
     * @return A Java Future object containing the response from the
     *         ModifyDBParameterGroup service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ModifyDBParameterGroupResult> modifyDBParameterGroupAsync(final ModifyDBParameterGroupRequest modifyDBParameterGroupRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ModifyDBParameterGroupResult>() {
            public ModifyDBParameterGroupResult call() throws Exception {
                return modifyDBParameterGroup(modifyDBParameterGroupRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Modifies the parameters of a DB parameter group. To modify more than
     * one parameter, submit a list of the following:
     * <code>ParameterName</code> ,
     * <code>ParameterValue</code> , and
     * <code>ApplyMethod</code> . A maximum of 20 parameters can be modified
     * in a single request.
     * </p>
     * <p>
     * <b>NOTE:</b> The apply-immediate method can be used only for dynamic
     * parameters; the pending-reboot method can be used with MySQL and
     * Oracle DB instances for either dynamic or static parameters. For
     * Microsoft SQL Server DB instances, the pending-reboot method can be
     * used only for static parameters.
     * </p>
     *
     * @param modifyDBParameterGroupRequest Container for the necessary
     *           parameters to execute the ModifyDBParameterGroup operation on
     *           AmazonRDS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ModifyDBParameterGroup service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ModifyDBParameterGroupResult> modifyDBParameterGroupAsync(
            final ModifyDBParameterGroupRequest modifyDBParameterGroupRequest,
            final AsyncHandler<ModifyDBParameterGroupRequest, ModifyDBParameterGroupResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ModifyDBParameterGroupResult>() {
            public ModifyDBParameterGroupResult call() throws Exception {
            	ModifyDBParameterGroupResult result;
                try {
            		result = modifyDBParameterGroup(modifyDBParameterGroupRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(modifyDBParameterGroupRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Displays a list of categories for all event source types, or, if
     * specified, for a specified source type. You can see a list of the
     * event categories and source types in the <a
     * tp://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Events.html">
     * Events </a> topic in the Amazon RDS User Guide.
     * </p>
     *
     * @param describeEventCategoriesRequest Container for the necessary
     *           parameters to execute the DescribeEventCategories operation on
     *           AmazonRDS.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeEventCategories service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeEventCategoriesResult> describeEventCategoriesAsync(final DescribeEventCategoriesRequest describeEventCategoriesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeEventCategoriesResult>() {
            public DescribeEventCategoriesResult call() throws Exception {
                return describeEventCategories(describeEventCategoriesRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Displays a list of categories for all event source types, or, if
     * specified, for a specified source type. You can see a list of the
     * event categories and source types in the <a
     * tp://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Events.html">
     * Events </a> topic in the Amazon RDS User Guide.
     * </p>
     *
     * @param describeEventCategoriesRequest Container for the necessary
     *           parameters to execute the DescribeEventCategories operation on
     *           AmazonRDS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeEventCategories service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeEventCategoriesResult> describeEventCategoriesAsync(
            final DescribeEventCategoriesRequest describeEventCategoriesRequest,
            final AsyncHandler<DescribeEventCategoriesRequest, DescribeEventCategoriesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeEventCategoriesResult>() {
            public DescribeEventCategoriesResult call() throws Exception {
            	DescribeEventCategoriesResult result;
                try {
            		result = describeEventCategories(describeEventCategoriesRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeEventCategoriesRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Modifies the parameters of a DB parameter group to the engine/system
     * default value. To reset specific parameters submit a list of the
     * following: <code>ParameterName</code> and <code>ApplyMethod</code> .
     * To reset the entire DB parameter group, specify the
     * <code>DBParameterGroup</code> name and <code>ResetAllParameters</code>
     * parameters. When resetting the entire group, dynamic parameters are
     * updated immediately and static parameters are set to
     * <code>pending-reboot</code> to take effect on the next DB instance
     * restart or <code>RebootDBInstance</code> request.
     * </p>
     *
     * @param resetDBParameterGroupRequest Container for the necessary
     *           parameters to execute the ResetDBParameterGroup operation on
     *           AmazonRDS.
     * 
     * @return A Java Future object containing the response from the
     *         ResetDBParameterGroup service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ResetDBParameterGroupResult> resetDBParameterGroupAsync(final ResetDBParameterGroupRequest resetDBParameterGroupRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ResetDBParameterGroupResult>() {
            public ResetDBParameterGroupResult call() throws Exception {
                return resetDBParameterGroup(resetDBParameterGroupRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Modifies the parameters of a DB parameter group to the engine/system
     * default value. To reset specific parameters submit a list of the
     * following: <code>ParameterName</code> and <code>ApplyMethod</code> .
     * To reset the entire DB parameter group, specify the
     * <code>DBParameterGroup</code> name and <code>ResetAllParameters</code>
     * parameters. When resetting the entire group, dynamic parameters are
     * updated immediately and static parameters are set to
     * <code>pending-reboot</code> to take effect on the next DB instance
     * restart or <code>RebootDBInstance</code> request.
     * </p>
     *
     * @param resetDBParameterGroupRequest Container for the necessary
     *           parameters to execute the ResetDBParameterGroup operation on
     *           AmazonRDS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ResetDBParameterGroup service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ResetDBParameterGroupResult> resetDBParameterGroupAsync(
            final ResetDBParameterGroupRequest resetDBParameterGroupRequest,
            final AsyncHandler<ResetDBParameterGroupRequest, ResetDBParameterGroupResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ResetDBParameterGroupResult>() {
            public ResetDBParameterGroupResult call() throws Exception {
            	ResetDBParameterGroupResult result;
                try {
            		result = resetDBParameterGroup(resetDBParameterGroupRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(resetDBParameterGroupRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Creates a new DB subnet group. DB subnet groups must contain at least
     * one subnet in at least two AZs in the region.
     * </p>
     *
     * @param createDBSubnetGroupRequest Container for the necessary
     *           parameters to execute the CreateDBSubnetGroup operation on AmazonRDS.
     * 
     * @return A Java Future object containing the response from the
     *         CreateDBSubnetGroup service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DBSubnetGroup> createDBSubnetGroupAsync(final CreateDBSubnetGroupRequest createDBSubnetGroupRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DBSubnetGroup>() {
            public DBSubnetGroup call() throws Exception {
                return createDBSubnetGroup(createDBSubnetGroupRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Creates a new DB subnet group. DB subnet groups must contain at least
     * one subnet in at least two AZs in the region.
     * </p>
     *
     * @param createDBSubnetGroupRequest Container for the necessary
     *           parameters to execute the CreateDBSubnetGroup operation on AmazonRDS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateDBSubnetGroup service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DBSubnetGroup> createDBSubnetGroupAsync(
            final CreateDBSubnetGroupRequest createDBSubnetGroupRequest,
            final AsyncHandler<CreateDBSubnetGroupRequest, DBSubnetGroup> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DBSubnetGroup>() {
            public DBSubnetGroup call() throws Exception {
            	DBSubnetGroup result;
                try {
            		result = createDBSubnetGroup(createDBSubnetGroupRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(createDBSubnetGroupRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Returns a list of DB log files for the DB instance.
     * </p>
     *
     * @param describeDBLogFilesRequest Container for the necessary
     *           parameters to execute the DescribeDBLogFiles operation on AmazonRDS.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeDBLogFiles service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeDBLogFilesResult> describeDBLogFilesAsync(final DescribeDBLogFilesRequest describeDBLogFilesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeDBLogFilesResult>() {
            public DescribeDBLogFilesResult call() throws Exception {
                return describeDBLogFiles(describeDBLogFilesRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Returns a list of DB log files for the DB instance.
     * </p>
     *
     * @param describeDBLogFilesRequest Container for the necessary
     *           parameters to execute the DescribeDBLogFiles operation on AmazonRDS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeDBLogFiles service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeDBLogFilesResult> describeDBLogFilesAsync(
            final DescribeDBLogFilesRequest describeDBLogFilesRequest,
            final AsyncHandler<DescribeDBLogFilesRequest, DescribeDBLogFilesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeDBLogFilesResult>() {
            public DescribeDBLogFilesResult call() throws Exception {
            	DescribeDBLogFilesResult result;
                try {
            		result = describeDBLogFiles(describeDBLogFilesRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeDBLogFilesRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Creates an RDS event notification subscription. This action requires a
     * topic ARN (Amazon Resource Name) created by either the RDS console,
     * the SNS console, or the SNS API. To obtain an ARN with SNS, you must
     * create a topic in Amazon SNS and subscribe to the topic. The ARN is
     * displayed in the SNS console.
     * </p>
     * <p>
     * You can specify the type of source (SourceType) you want to be
     * notified of, provide a list of RDS sources (SourceIds) that triggers
     * the events, and provide a list of event categories (EventCategories)
     * for events you want to be notified of. For example, you can specify
     * SourceType = db-instance, SourceIds = mydbinstance1, mydbinstance2 and
     * EventCategories = Availability, Backup.
     * </p>
     * <p>
     * If you specify both the SourceType and SourceIds, such as SourceType =
     * db-instance and SourceIdentifier = myDBInstance1, you will be notified
     * of all the db-instance events for the specified source. If you specify
     * a SourceType but do not specify a SourceIdentifier, you will receive
     * notice of the events for that source type for all your RDS sources. If
     * you do not specify either the SourceType nor the SourceIdentifier, you
     * will be notified of events generated from all RDS sources belonging to
     * your customer account.
     * </p>
     *
     * @param createEventSubscriptionRequest Container for the necessary
     *           parameters to execute the CreateEventSubscription operation on
     *           AmazonRDS.
     * 
     * @return A Java Future object containing the response from the
     *         CreateEventSubscription service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<EventSubscription> createEventSubscriptionAsync(final CreateEventSubscriptionRequest createEventSubscriptionRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<EventSubscription>() {
            public EventSubscription call() throws Exception {
                return createEventSubscription(createEventSubscriptionRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Creates an RDS event notification subscription. This action requires a
     * topic ARN (Amazon Resource Name) created by either the RDS console,
     * the SNS console, or the SNS API. To obtain an ARN with SNS, you must
     * create a topic in Amazon SNS and subscribe to the topic. The ARN is
     * displayed in the SNS console.
     * </p>
     * <p>
     * You can specify the type of source (SourceType) you want to be
     * notified of, provide a list of RDS sources (SourceIds) that triggers
     * the events, and provide a list of event categories (EventCategories)
     * for events you want to be notified of. For example, you can specify
     * SourceType = db-instance, SourceIds = mydbinstance1, mydbinstance2 and
     * EventCategories = Availability, Backup.
     * </p>
     * <p>
     * If you specify both the SourceType and SourceIds, such as SourceType =
     * db-instance and SourceIdentifier = myDBInstance1, you will be notified
     * of all the db-instance events for the specified source. If you specify
     * a SourceType but do not specify a SourceIdentifier, you will receive
     * notice of the events for that source type for all your RDS sources. If
     * you do not specify either the SourceType nor the SourceIdentifier, you
     * will be notified of events generated from all RDS sources belonging to
     * your customer account.
     * </p>
     *
     * @param createEventSubscriptionRequest Container for the necessary
     *           parameters to execute the CreateEventSubscription operation on
     *           AmazonRDS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateEventSubscription service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<EventSubscription> createEventSubscriptionAsync(
            final CreateEventSubscriptionRequest createEventSubscriptionRequest,
            final AsyncHandler<CreateEventSubscriptionRequest, EventSubscription> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<EventSubscription>() {
            public EventSubscription call() throws Exception {
            	EventSubscription result;
                try {
            		result = createEventSubscription(createEventSubscriptionRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(createEventSubscriptionRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Copies the specified DBSnapshot. The source DBSnapshot must be in the
     * "available" state.
     * </p>
     *
     * @param copyDBSnapshotRequest Container for the necessary parameters to
     *           execute the CopyDBSnapshot operation on AmazonRDS.
     * 
     * @return A Java Future object containing the response from the
     *         CopyDBSnapshot service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DBSnapshot> copyDBSnapshotAsync(final CopyDBSnapshotRequest copyDBSnapshotRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DBSnapshot>() {
            public DBSnapshot call() throws Exception {
                return copyDBSnapshot(copyDBSnapshotRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Copies the specified DBSnapshot. The source DBSnapshot must be in the
     * "available" state.
     * </p>
     *
     * @param copyDBSnapshotRequest Container for the necessary parameters to
     *           execute the CopyDBSnapshot operation on AmazonRDS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CopyDBSnapshot service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DBSnapshot> copyDBSnapshotAsync(
            final CopyDBSnapshotRequest copyDBSnapshotRequest,
            final AsyncHandler<CopyDBSnapshotRequest, DBSnapshot> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DBSnapshot>() {
            public DBSnapshot call() throws Exception {
            	DBSnapshot result;
                try {
            		result = copyDBSnapshot(copyDBSnapshotRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(copyDBSnapshotRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Returns information about reserved DB instances for this account, or
     * about a specified reserved DB instance.
     * </p>
     *
     * @param describeReservedDBInstancesRequest Container for the necessary
     *           parameters to execute the DescribeReservedDBInstances operation on
     *           AmazonRDS.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeReservedDBInstances service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeReservedDBInstancesResult> describeReservedDBInstancesAsync(final DescribeReservedDBInstancesRequest describeReservedDBInstancesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeReservedDBInstancesResult>() {
            public DescribeReservedDBInstancesResult call() throws Exception {
                return describeReservedDBInstances(describeReservedDBInstancesRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Returns information about reserved DB instances for this account, or
     * about a specified reserved DB instance.
     * </p>
     *
     * @param describeReservedDBInstancesRequest Container for the necessary
     *           parameters to execute the DescribeReservedDBInstances operation on
     *           AmazonRDS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeReservedDBInstances service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeReservedDBInstancesResult> describeReservedDBInstancesAsync(
            final DescribeReservedDBInstancesRequest describeReservedDBInstancesRequest,
            final AsyncHandler<DescribeReservedDBInstancesRequest, DescribeReservedDBInstancesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeReservedDBInstancesResult>() {
            public DescribeReservedDBInstancesResult call() throws Exception {
            	DescribeReservedDBInstancesResult result;
                try {
            		result = describeReservedDBInstances(describeReservedDBInstancesRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeReservedDBInstancesRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Rebooting a DB instance restarts the database engine service. A
     * reboot also applies to the DB instance any modifications to the
     * associated DB parameter group that were pending. Rebooting a DB
     * instance results in a momentary outage of the instance, during which
     * the DB instance status is set to rebooting. If the RDS instance is
     * configured for MultiAZ, it is possible that the reboot will be
     * conducted through a failover. An Amazon RDS event is created when the
     * reboot is completed.
     * </p>
     * <p>
     * If your DB instance is deployed in multiple Availability Zones, you
     * can force a failover from one AZ to the other during the reboot. You
     * might force a failover to test the availability of your DB instance
     * deployment or to restore operations to the original AZ after a
     * failover occurs.
     * </p>
     * <p>
     * The time required to reboot is a function of the specific database
     * engine's crash recovery process. To improve the reboot time, we
     * recommend that you reduce database activities as much as possible
     * during the reboot process to reduce rollback activity for in-transit
     * transactions.
     * </p>
     *
     * @param rebootDBInstanceRequest Container for the necessary parameters
     *           to execute the RebootDBInstance operation on AmazonRDS.
     * 
     * @return A Java Future object containing the response from the
     *         RebootDBInstance service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DBInstance> rebootDBInstanceAsync(final RebootDBInstanceRequest rebootDBInstanceRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DBInstance>() {
            public DBInstance call() throws Exception {
                return rebootDBInstance(rebootDBInstanceRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Rebooting a DB instance restarts the database engine service. A
     * reboot also applies to the DB instance any modifications to the
     * associated DB parameter group that were pending. Rebooting a DB
     * instance results in a momentary outage of the instance, during which
     * the DB instance status is set to rebooting. If the RDS instance is
     * configured for MultiAZ, it is possible that the reboot will be
     * conducted through a failover. An Amazon RDS event is created when the
     * reboot is completed.
     * </p>
     * <p>
     * If your DB instance is deployed in multiple Availability Zones, you
     * can force a failover from one AZ to the other during the reboot. You
     * might force a failover to test the availability of your DB instance
     * deployment or to restore operations to the original AZ after a
     * failover occurs.
     * </p>
     * <p>
     * The time required to reboot is a function of the specific database
     * engine's crash recovery process. To improve the reboot time, we
     * recommend that you reduce database activities as much as possible
     * during the reboot process to reduce rollback activity for in-transit
     * transactions.
     * </p>
     *
     * @param rebootDBInstanceRequest Container for the necessary parameters
     *           to execute the RebootDBInstance operation on AmazonRDS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         RebootDBInstance service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DBInstance> rebootDBInstanceAsync(
            final RebootDBInstanceRequest rebootDBInstanceRequest,
            final AsyncHandler<RebootDBInstanceRequest, DBInstance> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DBInstance>() {
            public DBInstance call() throws Exception {
            	DBInstance result;
                try {
            		result = rebootDBInstance(rebootDBInstanceRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(rebootDBInstanceRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Deletes an RDS event notification subscription.
     * </p>
     *
     * @param deleteEventSubscriptionRequest Container for the necessary
     *           parameters to execute the DeleteEventSubscription operation on
     *           AmazonRDS.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteEventSubscription service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<EventSubscription> deleteEventSubscriptionAsync(final DeleteEventSubscriptionRequest deleteEventSubscriptionRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<EventSubscription>() {
            public EventSubscription call() throws Exception {
                return deleteEventSubscription(deleteEventSubscriptionRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Deletes an RDS event notification subscription.
     * </p>
     *
     * @param deleteEventSubscriptionRequest Container for the necessary
     *           parameters to execute the DeleteEventSubscription operation on
     *           AmazonRDS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteEventSubscription service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<EventSubscription> deleteEventSubscriptionAsync(
            final DeleteEventSubscriptionRequest deleteEventSubscriptionRequest,
            final AsyncHandler<DeleteEventSubscriptionRequest, EventSubscription> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<EventSubscription>() {
            public EventSubscription call() throws Exception {
            	EventSubscription result;
                try {
            		result = deleteEventSubscription(deleteEventSubscriptionRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(deleteEventSubscriptionRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Promotes a read replica DB instance to a standalone DB instance.
     * </p>
     *
     * @param promoteReadReplicaRequest Container for the necessary
     *           parameters to execute the PromoteReadReplica operation on AmazonRDS.
     * 
     * @return A Java Future object containing the response from the
     *         PromoteReadReplica service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DBInstance> promoteReadReplicaAsync(final PromoteReadReplicaRequest promoteReadReplicaRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DBInstance>() {
            public DBInstance call() throws Exception {
                return promoteReadReplica(promoteReadReplicaRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Promotes a read replica DB instance to a standalone DB instance.
     * </p>
     *
     * @param promoteReadReplicaRequest Container for the necessary
     *           parameters to execute the PromoteReadReplica operation on AmazonRDS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         PromoteReadReplica service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DBInstance> promoteReadReplicaAsync(
            final PromoteReadReplicaRequest promoteReadReplicaRequest,
            final AsyncHandler<PromoteReadReplicaRequest, DBInstance> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DBInstance>() {
            public DBInstance call() throws Exception {
            	DBInstance result;
                try {
            		result = promoteReadReplica(promoteReadReplicaRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(promoteReadReplicaRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Returns a list of the available DB engines.
     * </p>
     *
     * @param describeDBEngineVersionsRequest Container for the necessary
     *           parameters to execute the DescribeDBEngineVersions operation on
     *           AmazonRDS.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeDBEngineVersions service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeDBEngineVersionsResult> describeDBEngineVersionsAsync(final DescribeDBEngineVersionsRequest describeDBEngineVersionsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeDBEngineVersionsResult>() {
            public DescribeDBEngineVersionsResult call() throws Exception {
                return describeDBEngineVersions(describeDBEngineVersionsRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Returns a list of the available DB engines.
     * </p>
     *
     * @param describeDBEngineVersionsRequest Container for the necessary
     *           parameters to execute the DescribeDBEngineVersions operation on
     *           AmazonRDS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeDBEngineVersions service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeDBEngineVersionsResult> describeDBEngineVersionsAsync(
            final DescribeDBEngineVersionsRequest describeDBEngineVersionsRequest,
            final AsyncHandler<DescribeDBEngineVersionsRequest, DescribeDBEngineVersionsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeDBEngineVersionsResult>() {
            public DescribeDBEngineVersionsResult call() throws Exception {
            	DescribeDBEngineVersionsResult result;
                try {
            		result = describeDBEngineVersions(describeDBEngineVersionsRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeDBEngineVersionsRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Describes the available option groups.
     * </p>
     *
     * @param describeOptionGroupsRequest Container for the necessary
     *           parameters to execute the DescribeOptionGroups operation on AmazonRDS.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeOptionGroups service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeOptionGroupsResult> describeOptionGroupsAsync(final DescribeOptionGroupsRequest describeOptionGroupsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeOptionGroupsResult>() {
            public DescribeOptionGroupsResult call() throws Exception {
                return describeOptionGroups(describeOptionGroupsRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Describes the available option groups.
     * </p>
     *
     * @param describeOptionGroupsRequest Container for the necessary
     *           parameters to execute the DescribeOptionGroups operation on AmazonRDS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeOptionGroups service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeOptionGroupsResult> describeOptionGroupsAsync(
            final DescribeOptionGroupsRequest describeOptionGroupsRequest,
            final AsyncHandler<DescribeOptionGroupsRequest, DescribeOptionGroupsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeOptionGroupsResult>() {
            public DescribeOptionGroupsResult call() throws Exception {
            	DescribeOptionGroupsResult result;
                try {
            		result = describeOptionGroups(describeOptionGroupsRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeOptionGroupsRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Downloads the last line of the specified log file.
     * </p>
     *
     * @param downloadDBLogFilePortionRequest Container for the necessary
     *           parameters to execute the DownloadDBLogFilePortion operation on
     *           AmazonRDS.
     * 
     * @return A Java Future object containing the response from the
     *         DownloadDBLogFilePortion service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DownloadDBLogFilePortionResult> downloadDBLogFilePortionAsync(final DownloadDBLogFilePortionRequest downloadDBLogFilePortionRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DownloadDBLogFilePortionResult>() {
            public DownloadDBLogFilePortionResult call() throws Exception {
                return downloadDBLogFilePortion(downloadDBLogFilePortionRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Downloads the last line of the specified log file.
     * </p>
     *
     * @param downloadDBLogFilePortionRequest Container for the necessary
     *           parameters to execute the DownloadDBLogFilePortion operation on
     *           AmazonRDS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DownloadDBLogFilePortion service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DownloadDBLogFilePortionResult> downloadDBLogFilePortionAsync(
            final DownloadDBLogFilePortionRequest downloadDBLogFilePortionRequest,
            final AsyncHandler<DownloadDBLogFilePortionRequest, DownloadDBLogFilePortionResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DownloadDBLogFilePortionResult>() {
            public DownloadDBLogFilePortionResult call() throws Exception {
            	DownloadDBLogFilePortionResult result;
                try {
            		result = downloadDBLogFilePortion(downloadDBLogFilePortionRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(downloadDBLogFilePortionRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Modifies an existing RDS event notification subscription. Note that
     * you cannot modify the source identifiers using this call; to change
     * source identifiers for a subscription, use the
     * AddSourceIdentifierToSubscription and
     * RemoveSourceIdentifierFromSubscription calls.
     * </p>
     * <p>
     * You can see a list of the event categories for a given SourceType in
     * the <a
     * tp://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Events.html">
     * Events </a> topic in the Amazon RDS User Guide or by using the
     * <b>DescribeEventCategories</b> action.
     * </p>
     *
     * @param modifyEventSubscriptionRequest Container for the necessary
     *           parameters to execute the ModifyEventSubscription operation on
     *           AmazonRDS.
     * 
     * @return A Java Future object containing the response from the
     *         ModifyEventSubscription service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<EventSubscription> modifyEventSubscriptionAsync(final ModifyEventSubscriptionRequest modifyEventSubscriptionRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<EventSubscription>() {
            public EventSubscription call() throws Exception {
                return modifyEventSubscription(modifyEventSubscriptionRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Modifies an existing RDS event notification subscription. Note that
     * you cannot modify the source identifiers using this call; to change
     * source identifiers for a subscription, use the
     * AddSourceIdentifierToSubscription and
     * RemoveSourceIdentifierFromSubscription calls.
     * </p>
     * <p>
     * You can see a list of the event categories for a given SourceType in
     * the <a
     * tp://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Events.html">
     * Events </a> topic in the Amazon RDS User Guide or by using the
     * <b>DescribeEventCategories</b> action.
     * </p>
     *
     * @param modifyEventSubscriptionRequest Container for the necessary
     *           parameters to execute the ModifyEventSubscription operation on
     *           AmazonRDS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ModifyEventSubscription service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<EventSubscription> modifyEventSubscriptionAsync(
            final ModifyEventSubscriptionRequest modifyEventSubscriptionRequest,
            final AsyncHandler<ModifyEventSubscriptionRequest, EventSubscription> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<EventSubscription>() {
            public EventSubscription call() throws Exception {
            	EventSubscription result;
                try {
            		result = modifyEventSubscription(modifyEventSubscriptionRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(modifyEventSubscriptionRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Creates a new DB instance from a DB snapshot. The target database is
     * created from the source database restore point with the same
     * configuration as the original source database, except that the new RDS
     * instance is created with the default security group.
     * </p>
     *
     * @param restoreDBInstanceFromDBSnapshotRequest Container for the
     *           necessary parameters to execute the RestoreDBInstanceFromDBSnapshot
     *           operation on AmazonRDS.
     * 
     * @return A Java Future object containing the response from the
     *         RestoreDBInstanceFromDBSnapshot service method, as returned by
     *         AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DBInstance> restoreDBInstanceFromDBSnapshotAsync(final RestoreDBInstanceFromDBSnapshotRequest restoreDBInstanceFromDBSnapshotRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DBInstance>() {
            public DBInstance call() throws Exception {
                return restoreDBInstanceFromDBSnapshot(restoreDBInstanceFromDBSnapshotRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Creates a new DB instance from a DB snapshot. The target database is
     * created from the source database restore point with the same
     * configuration as the original source database, except that the new RDS
     * instance is created with the default security group.
     * </p>
     *
     * @param restoreDBInstanceFromDBSnapshotRequest Container for the
     *           necessary parameters to execute the RestoreDBInstanceFromDBSnapshot
     *           operation on AmazonRDS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         RestoreDBInstanceFromDBSnapshot service method, as returned by
     *         AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DBInstance> restoreDBInstanceFromDBSnapshotAsync(
            final RestoreDBInstanceFromDBSnapshotRequest restoreDBInstanceFromDBSnapshotRequest,
            final AsyncHandler<RestoreDBInstanceFromDBSnapshotRequest, DBInstance> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DBInstance>() {
            public DBInstance call() throws Exception {
            	DBInstance result;
                try {
            		result = restoreDBInstanceFromDBSnapshot(restoreDBInstanceFromDBSnapshotRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(restoreDBInstanceFromDBSnapshotRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Deletes a DB subnet group.
     * </p>
     * <p>
     * <b>NOTE:</b>The specified database subnet group must not be associated
     * with any DB instances.
     * </p>
     *
     * @param deleteDBSubnetGroupRequest Container for the necessary
     *           parameters to execute the DeleteDBSubnetGroup operation on AmazonRDS.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteDBSubnetGroup service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteDBSubnetGroupAsync(final DeleteDBSubnetGroupRequest deleteDBSubnetGroupRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteDBSubnetGroup(deleteDBSubnetGroupRequest);
                return null;
		    }
		});
    }

    
    /**
     * <p>
     * Deletes a DB subnet group.
     * </p>
     * <p>
     * <b>NOTE:</b>The specified database subnet group must not be associated
     * with any DB instances.
     * </p>
     *
     * @param deleteDBSubnetGroupRequest Container for the necessary
     *           parameters to execute the DeleteDBSubnetGroup operation on AmazonRDS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteDBSubnetGroup service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteDBSubnetGroupAsync(
            final DeleteDBSubnetGroupRequest deleteDBSubnetGroupRequest,
            final AsyncHandler<DeleteDBSubnetGroupRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
            	try {
            		deleteDBSubnetGroup(deleteDBSubnetGroupRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(deleteDBSubnetGroupRequest, null);
               	return null;
		    }
		});
    }
    
    /**
     * <p>
     * Creates a DBSnapshot. The source DBInstance must be in "available"
     * state.
     * </p>
     *
     * @param createDBSnapshotRequest Container for the necessary parameters
     *           to execute the CreateDBSnapshot operation on AmazonRDS.
     * 
     * @return A Java Future object containing the response from the
     *         CreateDBSnapshot service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DBSnapshot> createDBSnapshotAsync(final CreateDBSnapshotRequest createDBSnapshotRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DBSnapshot>() {
            public DBSnapshot call() throws Exception {
                return createDBSnapshot(createDBSnapshotRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Creates a DBSnapshot. The source DBInstance must be in "available"
     * state.
     * </p>
     *
     * @param createDBSnapshotRequest Container for the necessary parameters
     *           to execute the CreateDBSnapshot operation on AmazonRDS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateDBSnapshot service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DBSnapshot> createDBSnapshotAsync(
            final CreateDBSnapshotRequest createDBSnapshotRequest,
            final AsyncHandler<CreateDBSnapshotRequest, DBSnapshot> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DBSnapshot>() {
            public DBSnapshot call() throws Exception {
            	DBSnapshot result;
                try {
            		result = createDBSnapshot(createDBSnapshotRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(createDBSnapshotRequest, result);
               	return result;
		    }
		});
    }
    
}
        