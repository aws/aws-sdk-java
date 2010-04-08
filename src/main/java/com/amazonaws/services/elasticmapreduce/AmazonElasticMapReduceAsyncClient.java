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
 * Elastic MapReduce is a web service that makes it easy to process vast
 * amounts of data using Amazon Simple Storage Service (Amazon S3), where
 * data is stored, and a cluster of Amazon Elastic Compute Cloud (EC2)
 * instances, where that data is processed. Elastic MapReduce uses Hadoop
 * processing to do such things as web indexing, data mining, log file
 * analysis, machine learning, scientific simulation, and bioinformatics
 * research.
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
     * Adds new steps to a job flow already loaded on an EC2 cluster. Each
     * step applies an algorithm to the data set, for the first step, or to
     * the data returned by the previous step in the job flow. If the job
     * flow isn't executing any other steps, execution begins from the first
     * added step. The maximum number of steps in a job flow is 256.
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
     * Terminates job flow processing, uploads data from EC2 to Amazon S3,
     * and terminates the EC2 cluster. Use this action to terminate a single
     * job flow or list of job flows. Job flows that complete successfully
     * terminate automatically unless the job flow's
     * <code>KeepJobFlowAliveWhenNoSteps</code> field is set to
     * <code>true</code> when provided to the RunJobFlows operation.
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
     * Returns extensive details about specified job flows. The client
     * specifies job flows by their ID, creation date, or state. Elastic
     * MapReduce returns descriptions of job flows that are up to two months
     * old. Specifying a date older than two months returns an error. The
     * maximum number of job flow descriptions that are returned is 512.
     * </p>
     * <p>
     * Each input parameter acts as a filter so that Elastic MapReduce
     * returns information about a more precise set of job flows with each
     * parameter that is used in the request. If parameters are not included
     * in a request, Elastic MapReduce returns descriptions of all job flows
     * that have:
     * </p>
     * 
     * <ul>
     * <li>Been created and completed in the last two weeks,</li>
     * <li>Not ended within the last two months. These jobs have one of the
     * following job flow states: <code>RUNNING</code> ,
     * 
     * <code>WAITING</code> ,
     * 
     * <code>SHUTTING_DOWN</code> ,
     * 
     * <code>STARTING</code> .</li>
     * 
     * </ul>
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
     * Creates a new job flow and EC2 cluster, and then executes the job flow
     * steps on the cluster. When the job flow finishes, depending on the
     * specified parameter values, RunJobFlow terminates the EC2 cluster and
     * uploads results to a specified Amazon S3 bucket.
     * </p>
     * <p>
     * <b>NOTE:</b> When running a new job flow, the following restrictions
     * apply: The maximum lifetime of a job flow is 2 weeks. The maximum
     * number of steps allowed in a job flow is 256.
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
        