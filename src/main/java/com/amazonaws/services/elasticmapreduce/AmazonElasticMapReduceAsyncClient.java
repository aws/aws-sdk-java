/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticmapreduce;
            
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;

import com.amazonaws.services.elasticmapreduce.model.*;


/**
 * Client for accessing AmazonElasticMapReduce.  All calls made
 * using this client are non-blocking and will immediately return a Java Future.
 * Callers must use the Future object to determine when the service call has actually
 * completed.
 * <p>
 * This is the Amazon Elastic MapReduce API Reference Guide. This guide
 * is for programmers that need detailed information about the Amazon
 * Elastic MapReduce SOAP and Query APIs.
 * </p>
 * <p>
 * This document was last updated on May 5, 2010.
 * </p> 
 */       
public class AmazonElasticMapReduceAsyncClient extends AmazonElasticMapReduceClient
        implements AmazonElasticMapReduceAsync { 

    /**
     * Executor service for executing asynchronous requests.
     */
    private ExecutorService executorService;

    
    /**
     * Constructs a new asynchronous client to invoke service methods on 
     * AmazonElasticMapReduce using the specified AWS account credentials.
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
    public AmazonElasticMapReduceAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, Executors.newCachedThreadPool());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonElasticMapReduce using the specified AWS account credentials
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
    public AmazonElasticMapReduceAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {
        super(awsCredentials);
        this.executorService = executorService;
    }
     
    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonElasticMapReduce using the specified AWS account credentials,
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
    public AmazonElasticMapReduceAsyncClient(AWSCredentials awsCredentials,
                ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
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
     * <p>
     * AddJobFlowSteps adds new steps to a running job flow. The maximum
     * number of steps in a job flow is 256.
     * </p>
     * <p>
     * A step specifies the location of a JAR file stored either on the
     * master node of the job flow or in Amazon S3. Each step is performed by
     * the main function of the main class of the JAR file. The main class
     * can be specified either in the manifest of the JAR or by using the
     * MainFunction parameter of the step.
     * </p>
     * <p>
     * SElastic MapReduce executes each step in the order listed. For a step
     * to be considered complete, the main function must exit with a zero
     * exit code and all Hadoop jobs started while the step was running must
     * have completed and run successfully.
     * </p>
     * <p>
     * You can only add steps to a job flow that is in one of the following
     * states: STARTING, BOOTSTAPPING, RUNNING or WAITING.
     * </p>
     *
     * @param addJobFlowStepsRequest Container for the necessary parameters
     *           to execute the AddJobFlowSteps operation on AmazonElasticMapReduce.
     * 
     * @return A Java Future object containing the response from the
     *         AddJobFlowSteps service method, as returned by AmazonElasticMapReduce.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> addJobFlowStepsAsync(final AddJobFlowStepsRequest addJobFlowStepsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                addJobFlowSteps(addJobFlowStepsRequest);
                return null;
		    }
		});
    }
    
    /**
     * <p>
     * TerminateJobFlows shuts a list of job flows down. When a job flow is
     * shut down, any step not yet completed is canceled and the EC2
     * instances on which the job flow is running are stopped. Any log files
     * not already saved are uploaded to Amazon S3 if a LogUri was specified
     * when the job flow was created.
     * </p>
     *
     * @param terminateJobFlowsRequest Container for the necessary parameters
     *           to execute the TerminateJobFlows operation on AmazonElasticMapReduce.
     * 
     * @return A Java Future object containing the response from the
     *         TerminateJobFlows service method, as returned by
     *         AmazonElasticMapReduce.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> terminateJobFlowsAsync(final TerminateJobFlowsRequest terminateJobFlowsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                terminateJobFlows(terminateJobFlowsRequest);
                return null;
		    }
		});
    }
    
    /**
     * <p>
     * DescribeJobFlows returns a list of job flows that match all of the
     * supplied parameters. The parameters can include a list of job flow
     * IDs, job flow states, and restrictions on job flow creation date and
     * time.
     * </p>
     * <p>
     * Regardless of supplied parameters, only job flows created within the
     * last two months are returned.
     * </p>
     * <p>
     * If no parameters are supplied, then job flows matching either the
     * following criteria are returned:
     * </p>
     * 
     * <ul>
     * <li>Job flows created and completed in the last two weeks.</li>
     * <li> Job flows created within the last two months that are in one of
     * the following states: <code>RUNNING</code> ,
     * 
     * <code>WAITING</code> ,
     * 
     * <code>SHUTTING_DOWN</code> ,
     * 
     * <code>STARTING</code> .
     * </li>
     * 
     * </ul>
     * <p>
     * Amazon Elastic MapReduce can return a maximum of 512 job flow
     * descriptions.
     * </p>
     *
     * @param describeJobFlowsRequest Container for the necessary parameters
     *           to execute the DescribeJobFlows operation on AmazonElasticMapReduce.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeJobFlows service method, as returned by
     *         AmazonElasticMapReduce.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeJobFlowsResult> describeJobFlowsAsync(final DescribeJobFlowsRequest describeJobFlowsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeJobFlowsResult>() {
            public DescribeJobFlowsResult call() throws Exception {
                return describeJobFlows(describeJobFlowsRequest);
		    }
		});
    }
    
    /**
     * <p>
     * RunJobFlow creates and starts running a new job flow. The job flow
     * will run the steps specified. Once the job flow completes, the EC2
     * cluster is stopped and the HDFS partition is lost. To prevent loss of
     * data, configure the last step of the job flow to store results in
     * Amazon S3. If the JobFlowInstancesDetail : KeepJobFlowAliveWhenNoSteps
     * parameter is set to TRUE, the job flow will transition to the WAITING
     * state rather than shutting down once the steps have completed.
     * </p>
     * <p>
     * A maximum of 256 steps are allowed in each job flow.
     * </p>
     * <p>
     * For long running job flows, we recommended that you periodically store
     * your results.
     * </p>
     *
     * @param runJobFlowRequest Container for the necessary parameters to
     *           execute the RunJobFlow operation on AmazonElasticMapReduce.
     * 
     * @return A Java Future object containing the response from the
     *         RunJobFlow service method, as returned by AmazonElasticMapReduce.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<RunJobFlowResult> runJobFlowAsync(final RunJobFlowRequest runJobFlowRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<RunJobFlowResult>() {
            public RunJobFlowResult call() throws Exception {
                return runJobFlow(runJobFlowRequest);
		    }
		});
    }
    
}
        