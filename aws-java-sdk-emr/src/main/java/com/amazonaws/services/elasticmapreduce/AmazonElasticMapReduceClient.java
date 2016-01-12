/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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

import org.w3c.dom.*;

import java.net.*;
import java.util.*;
import java.util.Map.Entry;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.auth.*;
import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.metrics.*;
import com.amazonaws.regions.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.util.AWSRequestMetrics.Field;

import com.amazonaws.services.elasticmapreduce.model.*;
import com.amazonaws.services.elasticmapreduce.model.transform.*;

/**
 * Client for accessing Amazon EMR. All service calls made using this client are
 * blocking, and will not return until the service call completes.
 * <p>
 * <p>
 * Amazon Elastic MapReduce (Amazon EMR) is a web service that makes it easy to
 * process large amounts of data efficiently. Amazon EMR uses Hadoop processing
 * combined with several AWS products to do tasks such as web indexing, data
 * mining, log file analysis, machine learning, scientific simulation, and data
 * warehousing.
 * </p>
 */
public class AmazonElasticMapReduceClient extends AmazonWebServiceClient
        implements AmazonElasticMapReduce {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory
            .getLog(AmazonElasticMapReduce.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "elasticmapreduce";

    /** The region metadata service name for computing region endpoints. */
    private static final String DEFAULT_ENDPOINT_PREFIX = "elasticmapreduce";

    /**
     * List of exception unmarshallers for all Amazon EMR exceptions.
     */
    protected List<JsonErrorUnmarshallerV2> jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshallerV2>();

    /**
     * Constructs a new client to invoke service methods on Amazon EMR. A
     * credentials provider chain will be used that searches for credentials in
     * this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2
     * metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonElasticMapReduceClient() {
        this(new DefaultAWSCredentialsProviderChain(),
                com.amazonaws.PredefinedClientConfigurations.defaultConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon EMR. A
     * credentials provider chain will be used that searches for credentials in
     * this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2
     * metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param clientConfiguration
     *        The client configuration options controlling how this client
     *        connects to Amazon EMR (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonElasticMapReduceClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon EMR using the
     * specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when
     *        authenticating with AWS services.
     */
    public AmazonElasticMapReduceClient(AWSCredentials awsCredentials) {
        this(awsCredentials, com.amazonaws.PredefinedClientConfigurations
                .defaultConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon EMR using the
     * specified AWS account credentials and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when
     *        authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client
     *        connects to Amazon EMR (ex: proxy settings, retry counts, etc.).
     */
    public AmazonElasticMapReduceClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(
                awsCredentials);
        init();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon EMR using the
     * specified AWS account credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     */
    public AmazonElasticMapReduceClient(
            AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider,
                com.amazonaws.PredefinedClientConfigurations.defaultConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon EMR using the
     * specified AWS account credentials provider and client configuration
     * options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client
     *        connects to Amazon EMR (ex: proxy settings, retry counts, etc.).
     */
    public AmazonElasticMapReduceClient(
            AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon EMR using the
     * specified AWS account credentials provider, client configuration options,
     * and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client
     *        connects to Amazon EMR (ex: proxy settings, retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     */
    public AmazonElasticMapReduceClient(
            AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
    }

    private void init() {
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.elasticmapreduce.model.InternalServerException.class,
                        "InternalServerException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.elasticmapreduce.model.InternalServerErrorException.class,
                        "InternalServerError"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.elasticmapreduce.model.InvalidRequestException.class,
                        "InvalidRequestException"));
        jsonErrorUnmarshallers
                .add(JsonErrorUnmarshallerV2.DEFAULT_UNMARSHALLER);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("https://elasticmapreduce.amazonaws.com");
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(DEFAULT_ENDPOINT_PREFIX);
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s
                .addAll(chainFactory
                        .newRequestHandlerChain("/com/amazonaws/services/elasticmapreduce/request.handlers"));
        requestHandler2s
                .addAll(chainFactory
                        .newRequestHandler2Chain("/com/amazonaws/services/elasticmapreduce/request.handler2s"));
    }

    /**
     * <p>
     * AddInstanceGroups adds an instance group to a running cluster.
     * </p>
     * 
     * @param addInstanceGroupsRequest
     *        Input to an AddInstanceGroups call.
     * @return Result of the AddInstanceGroups operation returned by the
     *         service.
     * @throws InternalServerErrorException
     *         Indicates that an error occurred while processing the request and
     *         that the request was not completed.
     * @sample AmazonElasticMapReduce.AddInstanceGroups
     */
    @Override
    public AddInstanceGroupsResult addInstanceGroups(
            AddInstanceGroupsRequest addInstanceGroupsRequest) {
        ExecutionContext executionContext = createExecutionContext(addInstanceGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddInstanceGroupsRequest> request = null;
        Response<AddInstanceGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddInstanceGroupsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(addInstanceGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<AddInstanceGroupsResult> responseHandler = new JsonResponseHandler<AddInstanceGroupsResult>(
                    new AddInstanceGroupsResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * AddJobFlowSteps adds new steps to a running job flow. A maximum of 256
     * steps are allowed in each job flow.
     * </p>
     * <p>
     * If your job flow is long-running (such as a Hive data warehouse) or
     * complex, you may require more than 256 steps to process your data. You
     * can bypass the 256-step limitation in various ways, including using the
     * SSH shell to connect to the master node and submitting queries directly
     * to the software running on the master node, such as Hive and Hadoop. For
     * more information on how to do this, go to <a href=
     * "http://docs.aws.amazon.com/ElasticMapReduce/latest/DeveloperGuide/AddMoreThan256Steps.html"
     * >Add More than 256 Steps to a Job Flow</a> in the <i>Amazon Elastic
     * MapReduce Developer's Guide</i>.
     * </p>
     * <p>
     * A step specifies the location of a JAR file stored either on the master
     * node of the job flow or in Amazon S3. Each step is performed by the main
     * function of the main class of the JAR file. The main class can be
     * specified either in the manifest of the JAR or by using the MainFunction
     * parameter of the step.
     * </p>
     * <p>
     * Elastic MapReduce executes each step in the order listed. For a step to
     * be considered complete, the main function must exit with a zero exit code
     * and all Hadoop jobs started while the step was running must have
     * completed and run successfully.
     * </p>
     * <p>
     * You can only add steps to a job flow that is in one of the following
     * states: STARTING, BOOTSTRAPPING, RUNNING, or WAITING.
     * </p>
     * 
     * @param addJobFlowStepsRequest
     *        The input argument to the <a>AddJobFlowSteps</a> operation.
     * @return Result of the AddJobFlowSteps operation returned by the service.
     * @throws InternalServerErrorException
     *         Indicates that an error occurred while processing the request and
     *         that the request was not completed.
     * @sample AmazonElasticMapReduce.AddJobFlowSteps
     */
    @Override
    public AddJobFlowStepsResult addJobFlowSteps(
            AddJobFlowStepsRequest addJobFlowStepsRequest) {
        ExecutionContext executionContext = createExecutionContext(addJobFlowStepsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddJobFlowStepsRequest> request = null;
        Response<AddJobFlowStepsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddJobFlowStepsRequestMarshaller().marshall(super
                        .beforeMarshalling(addJobFlowStepsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<AddJobFlowStepsResult> responseHandler = new JsonResponseHandler<AddJobFlowStepsResult>(
                    new AddJobFlowStepsResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds tags to an Amazon EMR resource. Tags make it easier to associate
     * clusters in various ways, such as grouping clusters to track your Amazon
     * EMR resource allocation costs. For more information, see <a href=
     * "http://docs.aws.amazon.com/ElasticMapReduce/latest/DeveloperGuide/emr-plan-tags.html"
     * >Tagging Amazon EMR Resources</a>.
     * </p>
     * 
     * @param addTagsRequest
     *        This input identifies a cluster and a list of tags to attach.
     * @return Result of the AddTags operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the
     *         EMR service.
     * @throws InvalidRequestException
     *         This exception occurs when there is something wrong with user
     *         input.
     * @sample AmazonElasticMapReduce.AddTags
     */
    @Override
    public AddTagsResult addTags(AddTagsRequest addTagsRequest) {
        ExecutionContext executionContext = createExecutionContext(addTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddTagsRequest> request = null;
        Response<AddTagsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddTagsRequestMarshaller().marshall(super
                        .beforeMarshalling(addTagsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<AddTagsResult> responseHandler = new JsonResponseHandler<AddTagsResult>(
                    new AddTagsResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides cluster-level details including status, hardware and software
     * configuration, VPC settings, and so on. For information about the cluster
     * steps, see <a>ListSteps</a>.
     * </p>
     * 
     * @param describeClusterRequest
     *        This input determines which cluster to describe.
     * @return Result of the DescribeCluster operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the
     *         EMR service.
     * @throws InvalidRequestException
     *         This exception occurs when there is something wrong with user
     *         input.
     * @sample AmazonElasticMapReduce.DescribeCluster
     */
    @Override
    public DescribeClusterResult describeCluster(
            DescribeClusterRequest describeClusterRequest) {
        ExecutionContext executionContext = createExecutionContext(describeClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeClusterRequest> request = null;
        Response<DescribeClusterResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeClusterRequestMarshaller().marshall(super
                        .beforeMarshalling(describeClusterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeClusterResult> responseHandler = new JsonResponseHandler<DescribeClusterResult>(
                    new DescribeClusterResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This API is deprecated and will eventually be removed. We recommend you
     * use <a>ListClusters</a>, <a>DescribeCluster</a>, <a>ListSteps</a>,
     * <a>ListInstanceGroups</a> and <a>ListBootstrapActions</a> instead.
     * </p>
     * <p>
     * DescribeJobFlows returns a list of job flows that match all of the
     * supplied parameters. The parameters can include a list of job flow IDs,
     * job flow states, and restrictions on job flow creation date and time.
     * </p>
     * <p>
     * Regardless of supplied parameters, only job flows created within the last
     * two months are returned.
     * </p>
     * <p>
     * If no parameters are supplied, then job flows matching either of the
     * following criteria are returned:
     * </p>
     * <ul>
     * <li>Job flows created and completed in the last two weeks</li>
     * <li>Job flows created within the last two months that are in one of the
     * following states: <code>RUNNING</code>, <code>WAITING</code>,
     * <code>SHUTTING_DOWN</code>, <code>STARTING</code></li>
     * </ul>
     * <p>
     * Amazon Elastic MapReduce can return a maximum of 512 job flow
     * descriptions.
     * </p>
     * 
     * @param describeJobFlowsRequest
     *        The input for the <a>DescribeJobFlows</a> operation.
     * @return Result of the DescribeJobFlows operation returned by the service.
     * @throws InternalServerErrorException
     *         Indicates that an error occurred while processing the request and
     *         that the request was not completed.
     * @sample AmazonElasticMapReduce.DescribeJobFlows
     */
    @Override
    @Deprecated
    public DescribeJobFlowsResult describeJobFlows(
            DescribeJobFlowsRequest describeJobFlowsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeJobFlowsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeJobFlowsRequest> request = null;
        Response<DescribeJobFlowsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeJobFlowsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeJobFlowsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeJobFlowsResult> responseHandler = new JsonResponseHandler<DescribeJobFlowsResult>(
                    new DescribeJobFlowsResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    @Deprecated
    public DescribeJobFlowsResult describeJobFlows() {
        return describeJobFlows(new DescribeJobFlowsRequest());
    }

    /**
     * <p>
     * Provides more detail about the cluster step.
     * </p>
     * 
     * @param describeStepRequest
     *        This input determines which step to describe.
     * @return Result of the DescribeStep operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the
     *         EMR service.
     * @throws InvalidRequestException
     *         This exception occurs when there is something wrong with user
     *         input.
     * @sample AmazonElasticMapReduce.DescribeStep
     */
    @Override
    public DescribeStepResult describeStep(
            DescribeStepRequest describeStepRequest) {
        ExecutionContext executionContext = createExecutionContext(describeStepRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeStepRequest> request = null;
        Response<DescribeStepResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeStepRequestMarshaller().marshall(super
                        .beforeMarshalling(describeStepRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeStepResult> responseHandler = new JsonResponseHandler<DescribeStepResult>(
                    new DescribeStepResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides information about the bootstrap actions associated with a
     * cluster.
     * </p>
     * 
     * @param listBootstrapActionsRequest
     *        This input determines which bootstrap actions to retrieve.
     * @return Result of the ListBootstrapActions operation returned by the
     *         service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the
     *         EMR service.
     * @throws InvalidRequestException
     *         This exception occurs when there is something wrong with user
     *         input.
     * @sample AmazonElasticMapReduce.ListBootstrapActions
     */
    @Override
    public ListBootstrapActionsResult listBootstrapActions(
            ListBootstrapActionsRequest listBootstrapActionsRequest) {
        ExecutionContext executionContext = createExecutionContext(listBootstrapActionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListBootstrapActionsRequest> request = null;
        Response<ListBootstrapActionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListBootstrapActionsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(listBootstrapActionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ListBootstrapActionsResult> responseHandler = new JsonResponseHandler<ListBootstrapActionsResult>(
                    new ListBootstrapActionsResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides the status of all clusters visible to this AWS account. Allows
     * you to filter the list of clusters based on certain criteria; for
     * example, filtering by cluster creation date and time or by status. This
     * call returns a maximum of 50 clusters per call, but returns a marker to
     * track the paging of the cluster list across multiple ListClusters calls.
     * </p>
     * 
     * @param listClustersRequest
     *        This input determines how the ListClusters action filters the list
     *        of clusters that it returns.
     * @return Result of the ListClusters operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the
     *         EMR service.
     * @throws InvalidRequestException
     *         This exception occurs when there is something wrong with user
     *         input.
     * @sample AmazonElasticMapReduce.ListClusters
     */
    @Override
    public ListClustersResult listClusters(
            ListClustersRequest listClustersRequest) {
        ExecutionContext executionContext = createExecutionContext(listClustersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListClustersRequest> request = null;
        Response<ListClustersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListClustersRequestMarshaller().marshall(super
                        .beforeMarshalling(listClustersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ListClustersResult> responseHandler = new JsonResponseHandler<ListClustersResult>(
                    new ListClustersResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public ListClustersResult listClusters() {
        return listClusters(new ListClustersRequest());
    }

    /**
     * <p>
     * Provides all available details about the instance groups in a cluster.
     * </p>
     * 
     * @param listInstanceGroupsRequest
     *        This input determines which instance groups to retrieve.
     * @return Result of the ListInstanceGroups operation returned by the
     *         service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the
     *         EMR service.
     * @throws InvalidRequestException
     *         This exception occurs when there is something wrong with user
     *         input.
     * @sample AmazonElasticMapReduce.ListInstanceGroups
     */
    @Override
    public ListInstanceGroupsResult listInstanceGroups(
            ListInstanceGroupsRequest listInstanceGroupsRequest) {
        ExecutionContext executionContext = createExecutionContext(listInstanceGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListInstanceGroupsRequest> request = null;
        Response<ListInstanceGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListInstanceGroupsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(listInstanceGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ListInstanceGroupsResult> responseHandler = new JsonResponseHandler<ListInstanceGroupsResult>(
                    new ListInstanceGroupsResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides information about the cluster instances that Amazon EMR
     * provisions on behalf of a user when it creates the cluster. For example,
     * this operation indicates when the EC2 instances reach the Ready state,
     * when instances become available to Amazon EMR to use for jobs, and the IP
     * addresses for cluster instances, etc.
     * </p>
     * 
     * @param listInstancesRequest
     *        This input determines which instances to list.
     * @return Result of the ListInstances operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the
     *         EMR service.
     * @throws InvalidRequestException
     *         This exception occurs when there is something wrong with user
     *         input.
     * @sample AmazonElasticMapReduce.ListInstances
     */
    @Override
    public ListInstancesResult listInstances(
            ListInstancesRequest listInstancesRequest) {
        ExecutionContext executionContext = createExecutionContext(listInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListInstancesRequest> request = null;
        Response<ListInstancesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListInstancesRequestMarshaller().marshall(super
                        .beforeMarshalling(listInstancesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ListInstancesResult> responseHandler = new JsonResponseHandler<ListInstancesResult>(
                    new ListInstancesResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides a list of steps for the cluster.
     * </p>
     * 
     * @param listStepsRequest
     *        This input determines which steps to list.
     * @return Result of the ListSteps operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the
     *         EMR service.
     * @throws InvalidRequestException
     *         This exception occurs when there is something wrong with user
     *         input.
     * @sample AmazonElasticMapReduce.ListSteps
     */
    @Override
    public ListStepsResult listSteps(ListStepsRequest listStepsRequest) {
        ExecutionContext executionContext = createExecutionContext(listStepsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListStepsRequest> request = null;
        Response<ListStepsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListStepsRequestMarshaller().marshall(super
                        .beforeMarshalling(listStepsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ListStepsResult> responseHandler = new JsonResponseHandler<ListStepsResult>(
                    new ListStepsResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * ModifyInstanceGroups modifies the number of nodes and configuration
     * settings of an instance group. The input parameters include the new
     * target instance count for the group and the instance group ID. The call
     * will either succeed or fail atomically.
     * </p>
     * 
     * @param modifyInstanceGroupsRequest
     *        Change the size of some instance groups.
     * @throws InternalServerErrorException
     *         Indicates that an error occurred while processing the request and
     *         that the request was not completed.
     * @sample AmazonElasticMapReduce.ModifyInstanceGroups
     */
    @Override
    public void modifyInstanceGroups(
            ModifyInstanceGroupsRequest modifyInstanceGroupsRequest) {
        ExecutionContext executionContext = createExecutionContext(modifyInstanceGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyInstanceGroupsRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyInstanceGroupsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(modifyInstanceGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(
                    null);
            responseHandler.setIsPayloadJson(true);
            invoke(request, responseHandler, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public void modifyInstanceGroups() {
        modifyInstanceGroups(new ModifyInstanceGroupsRequest());
    }

    /**
     * <p>
     * Removes tags from an Amazon EMR resource. Tags make it easier to
     * associate clusters in various ways, such as grouping clusters to track
     * your Amazon EMR resource allocation costs. For more information, see <a
     * href=
     * "http://docs.aws.amazon.com/ElasticMapReduce/latest/DeveloperGuide/emr-plan-tags.html"
     * >Tagging Amazon EMR Resources</a>.
     * </p>
     * <p>
     * The following example removes the stack tag with value Prod from a
     * cluster:
     * </p>
     * 
     * @param removeTagsRequest
     *        This input identifies a cluster and a list of tags to remove.
     * @return Result of the RemoveTags operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the
     *         EMR service.
     * @throws InvalidRequestException
     *         This exception occurs when there is something wrong with user
     *         input.
     * @sample AmazonElasticMapReduce.RemoveTags
     */
    @Override
    public RemoveTagsResult removeTags(RemoveTagsRequest removeTagsRequest) {
        ExecutionContext executionContext = createExecutionContext(removeTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveTagsRequest> request = null;
        Response<RemoveTagsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemoveTagsRequestMarshaller().marshall(super
                        .beforeMarshalling(removeTagsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<RemoveTagsResult> responseHandler = new JsonResponseHandler<RemoveTagsResult>(
                    new RemoveTagsResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * RunJobFlow creates and starts running a new job flow. The job flow will
     * run the steps specified. Once the job flow completes, the cluster is
     * stopped and the HDFS partition is lost. To prevent loss of data,
     * configure the last step of the job flow to store results in Amazon S3. If
     * the <a>JobFlowInstancesConfig</a>
     * <code>KeepJobFlowAliveWhenNoSteps</code> parameter is set to
     * <code>TRUE</code>, the job flow will transition to the WAITING state
     * rather than shutting down once the steps have completed.
     * </p>
     * <p>
     * For additional protection, you can set the <a>JobFlowInstancesConfig</a>
     * <code>TerminationProtected</code> parameter to <code>TRUE</code> to lock
     * the job flow and prevent it from being terminated by API call, user
     * intervention, or in the event of a job flow error.
     * </p>
     * <p>
     * A maximum of 256 steps are allowed in each job flow.
     * </p>
     * <p>
     * If your job flow is long-running (such as a Hive data warehouse) or
     * complex, you may require more than 256 steps to process your data. You
     * can bypass the 256-step limitation in various ways, including using the
     * SSH shell to connect to the master node and submitting queries directly
     * to the software running on the master node, such as Hive and Hadoop. For
     * more information on how to do this, go to <a href=
     * "http://docs.aws.amazon.com/ElasticMapReduce/latest/DeveloperGuide/AddMoreThan256Steps.html"
     * >Add More than 256 Steps to a Job Flow</a> in the <i>Amazon Elastic
     * MapReduce Developer's Guide</i>.
     * </p>
     * <p>
     * For long running job flows, we recommend that you periodically store your
     * results.
     * </p>
     * 
     * @param runJobFlowRequest
     *        Input to the <a>RunJobFlow</a> operation.
     * @return Result of the RunJobFlow operation returned by the service.
     * @throws InternalServerErrorException
     *         Indicates that an error occurred while processing the request and
     *         that the request was not completed.
     * @sample AmazonElasticMapReduce.RunJobFlow
     */
    @Override
    public RunJobFlowResult runJobFlow(RunJobFlowRequest runJobFlowRequest) {
        ExecutionContext executionContext = createExecutionContext(runJobFlowRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RunJobFlowRequest> request = null;
        Response<RunJobFlowResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RunJobFlowRequestMarshaller().marshall(super
                        .beforeMarshalling(runJobFlowRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<RunJobFlowResult> responseHandler = new JsonResponseHandler<RunJobFlowResult>(
                    new RunJobFlowResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * SetTerminationProtection locks a job flow so the Amazon EC2 instances in
     * the cluster cannot be terminated by user intervention, an API call, or in
     * the event of a job-flow error. The cluster still terminates upon
     * successful completion of the job flow. Calling SetTerminationProtection
     * on a job flow is analogous to calling the Amazon EC2
     * DisableAPITermination API on all of the EC2 instances in a cluster.
     * </p>
     * <p>
     * SetTerminationProtection is used to prevent accidental termination of a
     * job flow and to ensure that in the event of an error, the instances will
     * persist so you can recover any data stored in their ephemeral instance
     * storage.
     * </p>
     * <p>
     * To terminate a job flow that has been locked by setting
     * SetTerminationProtection to <code>true</code>, you must first unlock the
     * job flow by a subsequent call to SetTerminationProtection in which you
     * set the value to <code>false</code>.
     * </p>
     * <p>
     * For more information, go to <a href=
     * "http://docs.aws.amazon.com/ElasticMapReduce/latest/DeveloperGuide/UsingEMR_TerminationProtection.html"
     * >Protecting a Job Flow from Termination</a> in the <i>Amazon Elastic
     * MapReduce Developer's Guide.</i>
     * </p>
     * 
     * @param setTerminationProtectionRequest
     *        The input argument to the <a>TerminationProtection</a> operation.
     * @throws InternalServerErrorException
     *         Indicates that an error occurred while processing the request and
     *         that the request was not completed.
     * @sample AmazonElasticMapReduce.SetTerminationProtection
     */
    @Override
    public void setTerminationProtection(
            SetTerminationProtectionRequest setTerminationProtectionRequest) {
        ExecutionContext executionContext = createExecutionContext(setTerminationProtectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetTerminationProtectionRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetTerminationProtectionRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(setTerminationProtectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(
                    null);
            responseHandler.setIsPayloadJson(true);
            invoke(request, responseHandler, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sets whether all AWS Identity and Access Management (IAM) users under
     * your account can access the specified job flows. This action works on
     * running job flows. You can also set the visibility of a job flow when you
     * launch it using the <code>VisibleToAllUsers</code> parameter of
     * <a>RunJobFlow</a>. The SetVisibleToAllUsers action can be called only by
     * an IAM user who created the job flow or the AWS account that owns the job
     * flow.
     * </p>
     * 
     * @param setVisibleToAllUsersRequest
     *        The input to the SetVisibleToAllUsers action.
     * @throws InternalServerErrorException
     *         Indicates that an error occurred while processing the request and
     *         that the request was not completed.
     * @sample AmazonElasticMapReduce.SetVisibleToAllUsers
     */
    @Override
    public void setVisibleToAllUsers(
            SetVisibleToAllUsersRequest setVisibleToAllUsersRequest) {
        ExecutionContext executionContext = createExecutionContext(setVisibleToAllUsersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetVisibleToAllUsersRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetVisibleToAllUsersRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(setVisibleToAllUsersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(
                    null);
            responseHandler.setIsPayloadJson(true);
            invoke(request, responseHandler, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * TerminateJobFlows shuts a list of job flows down. When a job flow is shut
     * down, any step not yet completed is canceled and the EC2 instances on
     * which the job flow is running are stopped. Any log files not already
     * saved are uploaded to Amazon S3 if a LogUri was specified when the job
     * flow was created.
     * </p>
     * <p>
     * The maximum number of JobFlows allowed is 10. The call to
     * TerminateJobFlows is asynchronous. Depending on the configuration of the
     * job flow, it may take up to 5-20 minutes for the job flow to completely
     * terminate and release allocated resources, such as Amazon EC2 instances.
     * </p>
     * 
     * @param terminateJobFlowsRequest
     *        Input to the <a>TerminateJobFlows</a> operation.
     * @throws InternalServerErrorException
     *         Indicates that an error occurred while processing the request and
     *         that the request was not completed.
     * @sample AmazonElasticMapReduce.TerminateJobFlows
     */
    @Override
    public void terminateJobFlows(
            TerminateJobFlowsRequest terminateJobFlowsRequest) {
        ExecutionContext executionContext = createExecutionContext(terminateJobFlowsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TerminateJobFlowsRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TerminateJobFlowsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(terminateJobFlowsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(
                    null);
            responseHandler.setIsPayloadJson(true);
            invoke(request, responseHandler, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns additional metadata for a previously executed successful,
     * request, typically used for debugging issues where a service isn't acting
     * as expected. This data isn't considered part of the result data returned
     * by an operation, so it's available through this separate, diagnostic
     * interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you
     * need to access this extra diagnostic information for an executed request,
     * you should use this method to retrieve it as soon as possible after
     * executing the request.
     *
     * @param request
     *        The originally executed request
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(
            AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(
            Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);

        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        AWSCredentials credentials;
        awsRequestMetrics.startEvent(Field.CredentialsRequestTime);
        try {
            credentials = awsCredentialsProvider.getCredentials();
        } finally {
            awsRequestMetrics.endEvent(Field.CredentialsRequestTime);
        }

        AmazonWebServiceRequest originalRequest = request.getOriginalRequest();
        if (originalRequest != null
                && originalRequest.getRequestCredentials() != null) {
            credentials = originalRequest.getRequestCredentials();
        }

        executionContext.setCredentials(credentials);

        JsonErrorResponseHandlerV2 errorResponseHandler = new JsonErrorResponseHandlerV2(
                jsonErrorUnmarshallers);

        return client.execute(request, responseHandler, errorResponseHandler,
                executionContext);
    }

}
