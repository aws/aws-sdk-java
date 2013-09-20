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
package com.amazonaws.services.elasticmapreduce;

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

import com.amazonaws.services.elasticmapreduce.model.*;
import com.amazonaws.services.elasticmapreduce.model.transform.*;


/**
 * Client for accessing AmazonElasticMapReduce.  All service calls made
 * using this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * <p>
 * This is the <i>Amazon Elastic MapReduce API Reference</i> . This guide provides descriptions and samples of the Amazon Elastic MapReduce APIs.
 * </p>
 * <p>
 * Amazon Elastic MapReduce is a web service that makes it easy to process large amounts of data efficiently. Elastic MapReduce uses Hadoop processing
 * combined with several AWS products to do tasks such as web indexing, data mining, log file analysis, machine learning, scientific simulation, and data
 * warehousing.
 * </p>
 */
public class AmazonElasticMapReduceClient extends AmazonWebServiceClient implements AmazonElasticMapReduce {

    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonElasticMapReduce.class);

    /**
     * List of exception unmarshallers for all AmazonElasticMapReduce exceptions.
     */
    protected List<Unmarshaller<AmazonServiceException, JSONObject>> exceptionUnmarshallers;

    
    /** AWS signer for authenticating requests. */
    private AWS4Signer signer;


    /**
     * Constructs a new client to invoke service methods on
     * AmazonElasticMapReduce.  A credentials provider chain will be used
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
    public AmazonElasticMapReduceClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonElasticMapReduce.  A credentials provider chain will be used
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
     *                       client connects to AmazonElasticMapReduce
     *                       (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonElasticMapReduceClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonElasticMapReduce using the specified AWS account credentials.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     */
    public AmazonElasticMapReduceClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonElasticMapReduce using the specified AWS account credentials
     * and client configuration options.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AmazonElasticMapReduce
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AmazonElasticMapReduceClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        
        init();
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonElasticMapReduce using the specified AWS account credentials provider.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     */
    public AmazonElasticMapReduceClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonElasticMapReduce using the specified AWS account credentials
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
     *                       client connects to AmazonElasticMapReduce
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AmazonElasticMapReduceClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        
        this.awsCredentialsProvider = awsCredentialsProvider;
        
        init();
    }


    private void init() {
        exceptionUnmarshallers = new ArrayList<Unmarshaller<AmazonServiceException, JSONObject>>();
        exceptionUnmarshallers.add(new InternalServerErrorExceptionUnmarshaller());
        
        exceptionUnmarshallers.add(new JsonErrorUnmarshaller());
        setEndpoint("elasticmapreduce.amazonaws.com");

        signer = new AWS4Signer();
        
        signer.setServiceName("elasticmapreduce");
        

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandlers.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/elasticmapreduce/request.handlers"));

        
    }

    
    /**
     * <p>
     * Sets whether all AWS Identity and Access Management (IAM) users under
     * your account can access the specifed job flows. This action works on
     * running job flows. You can also set the visibility of a job flow when
     * you launch it using the <code>VisibleToAllUsers</code> parameter of
     * RunJobFlow. The SetVisibleToAllUsers action can be called only by an
     * IAM user who created the job flow or the AWS account that owns the job
     * flow.
     * </p>
     *
     * @param setVisibleToAllUsersRequest Container for the necessary
     *           parameters to execute the SetVisibleToAllUsers service method on
     *           AmazonElasticMapReduce.
     * 
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void setVisibleToAllUsers(SetVisibleToAllUsersRequest setVisibleToAllUsersRequest) 
            throws AmazonServiceException, AmazonClientException {
                                     
        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext();
        
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<SetVisibleToAllUsersRequest> request = new SetVisibleToAllUsersRequestMarshaller().marshall(setVisibleToAllUsersRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
        invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * AddInstanceGroups adds an instance group to a running cluster.
     * </p>
     *
     * @param addInstanceGroupsRequest Container for the necessary parameters
     *           to execute the AddInstanceGroups service method on
     *           AmazonElasticMapReduce.
     * 
     * @return The response from the AddInstanceGroups service method, as
     *         returned by AmazonElasticMapReduce.
     * 
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public AddInstanceGroupsResult addInstanceGroups(AddInstanceGroupsRequest addInstanceGroupsRequest) 
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext();
        
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<AddInstanceGroupsRequest> request = new AddInstanceGroupsRequestMarshaller().marshall(addInstanceGroupsRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        Unmarshaller<AddInstanceGroupsResult, JsonUnmarshallerContext> unmarshaller = new AddInstanceGroupsResultJsonUnmarshaller();
        
        JsonResponseHandler<AddInstanceGroupsResult> responseHandler = new JsonResponseHandler<AddInstanceGroupsResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * AddJobFlowSteps adds new steps to a running job flow. A maximum of
     * 256 steps are allowed in each job flow.
     * </p>
     * <p>
     * If your job flow is long-running (such as a Hive data warehouse) or
     * complex, you may require more than 256 steps to process your data. You
     * can bypass the 256-step limitation in various ways, including using
     * the SSH shell to connect to the master node and submitting queries
     * directly to the software running on the master node, such as Hive and
     * Hadoop. For more information on how to do this, go to <a
     * .com/ElasticMapReduce/latest/DeveloperGuide/AddMoreThan256Steps.html">
     * Add More than 256 Steps to a Job Flow </a> in the <i>Amazon Elastic
     * MapReduce Developer's Guide</i> .
     * </p>
     * <p>
     * A step specifies the location of a JAR file stored either on the
     * master node of the job flow or in Amazon S3. Each step is performed by
     * the main function of the main class of the JAR file. The main class
     * can be specified either in the manifest of the JAR or by using the
     * MainFunction parameter of the step.
     * </p>
     * <p>
     * Elastic MapReduce executes each step in the order listed. For a step
     * to be considered complete, the main function must exit with a zero
     * exit code and all Hadoop jobs started while the step was running must
     * have completed and run successfully.
     * </p>
     * <p>
     * You can only add steps to a job flow that is in one of the following
     * states: STARTING, BOOTSTRAPPING, RUNNING, or WAITING.
     * </p>
     *
     * @param addJobFlowStepsRequest Container for the necessary parameters
     *           to execute the AddJobFlowSteps service method on
     *           AmazonElasticMapReduce.
     * 
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void addJobFlowSteps(AddJobFlowStepsRequest addJobFlowStepsRequest) 
            throws AmazonServiceException, AmazonClientException {
                                     
        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext();
        
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<AddJobFlowStepsRequest> request = new AddJobFlowStepsRequestMarshaller().marshall(addJobFlowStepsRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
        invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * TerminateJobFlows shuts a list of job flows down. When a job flow is
     * shut down, any step not yet completed is canceled and the EC2
     * instances on which the job flow is running are stopped. Any log files
     * not already saved are uploaded to Amazon S3 if a LogUri was specified
     * when the job flow was created.
     * </p>
     * <p>
     * The call to TerminateJobFlows is asynchronous. Depending on the
     * configuration of the job flow, it may take up to 5-20 minutes for the
     * job flow to completely terminate and release allocated resources, such
     * as Amazon EC2 instances.
     * </p>
     *
     * @param terminateJobFlowsRequest Container for the necessary parameters
     *           to execute the TerminateJobFlows service method on
     *           AmazonElasticMapReduce.
     * 
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void terminateJobFlows(TerminateJobFlowsRequest terminateJobFlowsRequest) 
            throws AmazonServiceException, AmazonClientException {
                                     
        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext();
        
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<TerminateJobFlowsRequest> request = new TerminateJobFlowsRequestMarshaller().marshall(terminateJobFlowsRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
        invoke(request, responseHandler, executionContext);
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
     * If no parameters are supplied, then job flows matching either of the
     * following criteria are returned:
     * </p>
     * 
     * <ul>
     * <li>Job flows created and completed in the last two weeks</li>
     * <li> Job flows created within the last two months that are in one of
     * the following states: <code>RUNNING</code> ,
     * <code>WAITING</code> ,
     * <code>SHUTTING_DOWN</code> ,
     * 
     * <code>STARTING</code> </li>
     * 
     * </ul>
     * <p>
     * Amazon Elastic MapReduce can return a maximum of 512 job flow
     * descriptions.
     * </p>
     *
     * @param describeJobFlowsRequest Container for the necessary parameters
     *           to execute the DescribeJobFlows service method on
     *           AmazonElasticMapReduce.
     * 
     * @return The response from the DescribeJobFlows service method, as
     *         returned by AmazonElasticMapReduce.
     * 
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeJobFlowsResult describeJobFlows(DescribeJobFlowsRequest describeJobFlowsRequest) 
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext();
        
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<DescribeJobFlowsRequest> request = new DescribeJobFlowsRequestMarshaller().marshall(describeJobFlowsRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        Unmarshaller<DescribeJobFlowsResult, JsonUnmarshallerContext> unmarshaller = new DescribeJobFlowsResultJsonUnmarshaller();
        
        JsonResponseHandler<DescribeJobFlowsResult> responseHandler = new JsonResponseHandler<DescribeJobFlowsResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * SetTerminationProtection locks a job flow so the Amazon EC2 instances
     * in the cluster cannot be terminated by user intervention, an API call,
     * or in the event of a job-flow error. The cluster still terminates upon
     * successful completion of the job flow. Calling
     * SetTerminationProtection on a job flow is analogous to calling the
     * Amazon EC2 DisableAPITermination API on all of the EC2 instances in a
     * cluster.
     * </p>
     * <p>
     * SetTerminationProtection is used to prevent accidental termination of
     * a job flow and to ensure that in the event of an error, the instances
     * will persist so you can recover any data stored in their ephemeral
     * instance storage.
     * </p>
     * <p>
     * To terminate a job flow that has been locked by setting
     * SetTerminationProtection to <code>true</code> ,
     * you must first unlock the job flow by a subsequent call to
     * SetTerminationProtection in which you set the value to
     * <code>false</code> .
     * </p>
     * <p>
     * For more information, go to <a
     * cMapReduce/latest/DeveloperGuide/UsingEMR_TerminationProtection.html">
     * Protecting a Job Flow from Termination </a> in the <i>Amazon Elastic
     * MapReduce Developer's Guide.</i>
     * </p>
     *
     * @param setTerminationProtectionRequest Container for the necessary
     *           parameters to execute the SetTerminationProtection service method on
     *           AmazonElasticMapReduce.
     * 
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void setTerminationProtection(SetTerminationProtectionRequest setTerminationProtectionRequest) 
            throws AmazonServiceException, AmazonClientException {
                                     
        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext();
        
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<SetTerminationProtectionRequest> request = new SetTerminationProtectionRequestMarshaller().marshall(setTerminationProtectionRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
        invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * RunJobFlow creates and starts running a new job flow. The job flow
     * will run the steps specified. Once the job flow completes, the cluster
     * is stopped and the HDFS partition is lost. To prevent loss of data,
     * configure the last step of the job flow to store results in Amazon S3.
     * If the JobFlowInstancesConfig <code>KeepJobFlowAliveWhenNoSteps</code>
     * parameter is set to <code>TRUE</code> , the job flow will transition
     * to the WAITING state rather than shutting down once the steps have
     * completed.
     * </p>
     * <p>
     * For additional protection, you can set the JobFlowInstancesConfig
     * <code>TerminationProtected</code> parameter to <code>TRUE</code> to
     * lock the job flow and prevent it from being terminated by API call,
     * user intervention, or in the event of a job flow error.
     * </p>
     * <p>
     * A maximum of 256 steps are allowed in each job flow.
     * </p>
     * <p>
     * If your job flow is long-running (such as a Hive data warehouse) or
     * complex, you may require more than 256 steps to process your data. You
     * can bypass the 256-step limitation in various ways, including using
     * the SSH shell to connect to the master node and submitting queries
     * directly to the software running on the master node, such as Hive and
     * Hadoop. For more information on how to do this, go to <a
     * .com/ElasticMapReduce/latest/DeveloperGuide/AddMoreThan256Steps.html">
     * Add More than 256 Steps to a Job Flow </a> in the <i>Amazon Elastic
     * MapReduce Developer's Guide</i> .
     * </p>
     * <p>
     * For long running job flows, we recommend that you periodically store
     * your results.
     * </p>
     *
     * @param runJobFlowRequest Container for the necessary parameters to
     *           execute the RunJobFlow service method on AmazonElasticMapReduce.
     * 
     * @return The response from the RunJobFlow service method, as returned
     *         by AmazonElasticMapReduce.
     * 
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public RunJobFlowResult runJobFlow(RunJobFlowRequest runJobFlowRequest) 
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext();
        
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<RunJobFlowRequest> request = new RunJobFlowRequestMarshaller().marshall(runJobFlowRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        Unmarshaller<RunJobFlowResult, JsonUnmarshallerContext> unmarshaller = new RunJobFlowResultJsonUnmarshaller();
        
        JsonResponseHandler<RunJobFlowResult> responseHandler = new JsonResponseHandler<RunJobFlowResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * ModifyInstanceGroups modifies the number of nodes and configuration
     * settings of an instance group. The input parameters include the new
     * target instance count for the group and the instance group ID. The
     * call will either succeed or fail atomically.
     * </p>
     *
     * @param modifyInstanceGroupsRequest Container for the necessary
     *           parameters to execute the ModifyInstanceGroups service method on
     *           AmazonElasticMapReduce.
     * 
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void modifyInstanceGroups(ModifyInstanceGroupsRequest modifyInstanceGroupsRequest) 
            throws AmazonServiceException, AmazonClientException {
                                     
        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext();
        
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<ModifyInstanceGroupsRequest> request = new ModifyInstanceGroupsRequestMarshaller().marshall(modifyInstanceGroupsRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
        invoke(request, responseHandler, executionContext);
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
     * If no parameters are supplied, then job flows matching either of the
     * following criteria are returned:
     * </p>
     * 
     * <ul>
     * <li>Job flows created and completed in the last two weeks</li>
     * <li> Job flows created within the last two months that are in one of
     * the following states: <code>RUNNING</code> ,
     * <code>WAITING</code> ,
     * <code>SHUTTING_DOWN</code> ,
     * 
     * <code>STARTING</code> </li>
     * 
     * </ul>
     * <p>
     * Amazon Elastic MapReduce can return a maximum of 512 job flow
     * descriptions.
     * </p>
     * 
     * @return The response from the DescribeJobFlows service method, as
     *         returned by AmazonElasticMapReduce.
     * 
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeJobFlowsResult describeJobFlows() throws AmazonServiceException, AmazonClientException {
        return describeJobFlows(new DescribeJobFlowsRequest());
    }
    
    /**
     * <p>
     * ModifyInstanceGroups modifies the number of nodes and configuration
     * settings of an instance group. The input parameters include the new
     * target instance count for the group and the instance group ID. The
     * call will either succeed or fail atomically.
     * </p>
     * 
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void modifyInstanceGroups() throws AmazonServiceException, AmazonClientException {
        modifyInstanceGroups(new ModifyInstanceGroupsRequest());
    }
    
    /**
     * Overrides the default endpoint for this client ("https://elasticmapreduce.amazonaws.com") and explicitly provides
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
     * Callers can pass in just the endpoint (ex: "elasticmapreduce.amazonaws.com") or a full
     * URL, including the protocol (ex: "https://elasticmapreduce.amazonaws.com"). If the
     * protocol is not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see:
     * <a href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     *
     * @param endpoint
     *            The endpoint (ex: "elasticmapreduce.amazonaws.com") or a full URL,
     *            including the protocol (ex: "https://elasticmapreduce.amazonaws.com") of
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
        return "elasticmapreduce";
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
        