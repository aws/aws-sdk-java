/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.elasticache;

import org.w3c.dom.*;

import java.net.*;
import java.util.*;
import java.util.Map.Entry;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.auth.*;
import com.amazonaws.auth.presign.PresignerParams;
import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.internal.auth.*;
import com.amazonaws.metrics.*;
import com.amazonaws.regions.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.protocol.json.*;
import com.amazonaws.util.AWSRequestMetrics.Field;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.client.AwsSyncClientParams;
import com.amazonaws.services.elasticache.waiters.AmazonElastiCacheWaiters;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.elasticache.model.*;
import com.amazonaws.services.elasticache.model.transform.*;

/**
 * Client for accessing Amazon ElastiCache. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <fullname>Amazon ElastiCache</fullname>
 * <p>
 * Amazon ElastiCache is a web service that makes it easier to set up, operate, and scale a distributed cache in the
 * cloud.
 * </p>
 * <p>
 * With ElastiCache, customers get all of the benefits of a high-performance, in-memory cache with less of the
 * administrative burden involved in launching and managing a distributed cache. The service makes setup, scaling, and
 * cluster failure handling much simpler than in a self-managed cache deployment.
 * </p>
 * <p>
 * In addition, through integration with Amazon CloudWatch, customers get enhanced visibility into the key performance
 * statistics associated with their cache and can receive alarms if a part of their cache runs hot.
 * </p>
 */
@ThreadSafe
public class AmazonElastiCacheClient extends AmazonWebServiceClient implements AmazonElastiCache {
    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonElastiCache.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "elasticache";

    private volatile AmazonElastiCacheWaiters waiters;

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    /**
     * List of exception unmarshallers for all modeled exceptions
     */
    protected final List<Unmarshaller<AmazonServiceException, Node>> exceptionUnmarshallers = new ArrayList<Unmarshaller<AmazonServiceException, Node>>();

    /**
     * Constructs a new client to invoke service methods on Amazon ElastiCache. A credentials provider chain will be
     * used that searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonElastiCacheClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon ElastiCache. A credentials provider chain will be
     * used that searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon ElastiCache (ex: proxy
     *        settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonElastiCacheClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon ElastiCache using the specified AWS account
     * credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     */
    public AmazonElastiCacheClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon ElastiCache using the specified AWS account
     * credentials and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon ElastiCache (ex: proxy
     *        settings, retry counts, etc.).
     */
    public AmazonElastiCacheClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        init();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon ElastiCache using the specified AWS account
     * credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     */
    public AmazonElastiCacheClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon ElastiCache using the specified AWS account
     * credentials provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon ElastiCache (ex: proxy
     *        settings, retry counts, etc.).
     */
    public AmazonElastiCacheClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon ElastiCache using the specified AWS account
     * credentials provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon ElastiCache (ex: proxy
     *        settings, retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     */
    public AmazonElastiCacheClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon ElastiCache using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonElastiCacheClient(AwsSyncClientParams clientParams) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        init();
    }

    private void init() {
        exceptionUnmarshallers.add(new ReservedCacheNodeAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CacheSubnetGroupNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CacheClusterNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SubnetInUseExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CacheClusterAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidParameterValueExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CacheSecurityGroupAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SnapshotAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidReplicationGroupStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidCacheSecurityGroupStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CacheSecurityGroupQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SnapshotQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CacheParameterGroupQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ReservedCacheNodesOfferingNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CacheParameterGroupAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NodeQuotaForCustomerExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CacheParameterGroupNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TagNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ClusterQuotaForCustomerExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NodeQuotaForClusterExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidCacheClusterStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidVPCNetworkStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CacheSubnetQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SnapshotFeatureNotSupportedExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidSnapshotStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CacheSubnetGroupAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CacheSubnetGroupQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ReplicationGroupAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InsufficientCacheClusterCapacityExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidParameterCombinationExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ReservedCacheNodeNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SnapshotNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CacheSubnetGroupInUseExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CacheSecurityGroupNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidCacheParameterGroupStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidARNExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TagQuotaPerResourceExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ReplicationGroupNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidSubnetExceptionUnmarshaller());
        exceptionUnmarshallers.add(new AuthorizationAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NodeGroupsPerReplicationGroupQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ReservedCacheNodeQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new AuthorizationNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new StandardErrorUnmarshaller(com.amazonaws.services.elasticache.model.AmazonElastiCacheException.class));

        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("elasticache.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/elasticache/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/elasticache/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Adds up to 10 cost allocation tags to the named resource. A cost allocation tag is a key-value pair where the key
     * and value are case-sensitive. You can use cost allocation tags to categorize and track your AWS costs.
     * </p>
     * <p>
     * When you apply tags to your ElastiCache resources, AWS generates a cost allocation report as a comma-separated
     * value (CSV) file with your usage and costs aggregated by your tags. You can apply tags that represent business
     * categories (such as cost centers, application names, or owners) to organize your costs across multiple services.
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/Tagging.html">Using Cost Allocation Tags in
     * Amazon ElastiCache</a> in the <i>ElastiCache User Guide</i>.
     * </p>
     * 
     * @param addTagsToResourceRequest
     *        Represents the input of an AddTagsToResource operation.
     * @return Result of the AddTagsToResource operation returned by the service.
     * @throws CacheClusterNotFoundException
     *         The requested cache cluster ID does not refer to an existing cache cluster.
     * @throws SnapshotNotFoundException
     *         The requested snapshot name does not refer to an existing snapshot.
     * @throws TagQuotaPerResourceExceededException
     *         The request cannot be processed because it would cause the resource to have more than the allowed number
     *         of tags. The maximum number of tags permitted on a resource is 10.
     * @throws InvalidARNException
     *         The requested Amazon Resource Name (ARN) does not refer to an existing resource.
     * @sample AmazonElastiCache.AddTagsToResource
     */
    @Override
    public AddTagsToResourceResult addTagsToResource(AddTagsToResourceRequest addTagsToResourceRequest) {
        ExecutionContext executionContext = createExecutionContext(addTagsToResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddTagsToResourceRequest> request = null;
        Response<AddTagsToResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddTagsToResourceRequestMarshaller().marshall(super.beforeMarshalling(addTagsToResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<AddTagsToResourceResult> responseHandler = new StaxResponseHandler<AddTagsToResourceResult>(
                    new AddTagsToResourceResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Allows network ingress to a cache security group. Applications using ElastiCache must be running on Amazon EC2,
     * and Amazon EC2 security groups are used as the authorization mechanism.
     * </p>
     * <note>
     * <p>
     * You cannot authorize ingress from an Amazon EC2 security group in one region to an ElastiCache cluster in another
     * region.
     * </p>
     * </note>
     * 
     * @param authorizeCacheSecurityGroupIngressRequest
     *        Represents the input of an AuthorizeCacheSecurityGroupIngress operation.
     * @return Result of the AuthorizeCacheSecurityGroupIngress operation returned by the service.
     * @throws CacheSecurityGroupNotFoundException
     *         The requested cache security group name does not refer to an existing cache security group.
     * @throws InvalidCacheSecurityGroupStateException
     *         The current state of the cache security group does not allow deletion.
     * @throws AuthorizationAlreadyExistsException
     *         The specified Amazon EC2 security group is already authorized for the specified cache security group.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.AuthorizeCacheSecurityGroupIngress
     */
    @Override
    public CacheSecurityGroup authorizeCacheSecurityGroupIngress(AuthorizeCacheSecurityGroupIngressRequest authorizeCacheSecurityGroupIngressRequest) {
        ExecutionContext executionContext = createExecutionContext(authorizeCacheSecurityGroupIngressRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AuthorizeCacheSecurityGroupIngressRequest> request = null;
        Response<CacheSecurityGroup> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AuthorizeCacheSecurityGroupIngressRequestMarshaller()
                        .marshall(super.beforeMarshalling(authorizeCacheSecurityGroupIngressRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CacheSecurityGroup> responseHandler = new StaxResponseHandler<CacheSecurityGroup>(new CacheSecurityGroupStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Makes a copy of an existing snapshot.
     * </p>
     * <note>
     * <p>
     * This operation is valid for Redis only.
     * </p>
     * </note> <important>
     * <p>
     * Users or groups that have permissions to use the <code>CopySnapshot</code> operation can create their own Amazon
     * S3 buckets and copy snapshots to it. To control access to your snapshots, use an IAM policy to control who has
     * the ability to use the <code>CopySnapshot</code> operation. For more information about using IAM to control the
     * use of ElastiCache operations, see <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/Snapshots.Exporting.html">Exporting
     * Snapshots</a> and <a href="http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/IAM.html">Authentication
     * &amp; Access Control</a>.
     * </p>
     * </important>
     * <p>
     * You could receive the following error messages.
     * </p>
     * <p class="title">
     * <b>Error Messages</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Error Message:</b> The S3 bucket %s is outside of the region.
     * </p>
     * <p>
     * <b>Solution:</b> Create an Amazon S3 bucket in the same region as your snapshot. For more information, see <a
     * href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/Snapshots.Exporting.html#Snapshots.Exporting.CreateBucket"
     * >Step 1: Create an Amazon S3 Bucket</a> in the ElastiCache User Guide.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Error Message:</b> The S3 bucket %s does not exist.
     * </p>
     * <p>
     * <b>Solution:</b> Create an Amazon S3 bucket in the same region as your snapshot. For more information, see <a
     * href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/Snapshots.Exporting.html#Snapshots.Exporting.CreateBucket"
     * >Step 1: Create an Amazon S3 Bucket</a> in the ElastiCache User Guide.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Error Message:</b> The S3 bucket %s is not owned by the authenticated user.
     * </p>
     * <p>
     * <b>Solution:</b> Create an Amazon S3 bucket in the same region as your snapshot. For more information, see <a
     * href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/Snapshots.Exporting.html#Snapshots.Exporting.CreateBucket"
     * >Step 1: Create an Amazon S3 Bucket</a> in the ElastiCache User Guide.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Error Message:</b> The authenticated user does not have sufficient permissions to perform the desired
     * activity.
     * </p>
     * <p>
     * <b>Solution:</b> Contact your system administrator to get the needed permissions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Error Message:</b> The S3 bucket %s already contains an object with key %s.
     * </p>
     * <p>
     * <b>Solution:</b> Give the <code>TargetSnapshotName</code> a new and unique value. If exporting a snapshot, you
     * could alternatively create a new Amazon S3 bucket and use this same value for <code>TargetSnapshotName</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Error Message: </b> ElastiCache has not been granted READ permissions %s on the S3 Bucket.
     * </p>
     * <p>
     * <b>Solution:</b> Add List and Read permissions on the bucket. For more information, see <a href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/Snapshots.Exporting.html#Snapshots.Exporting.GrantAccess"
     * >Step 2: Grant ElastiCache Access to Your Amazon S3 Bucket</a> in the ElastiCache User Guide.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Error Message: </b> ElastiCache has not been granted WRITE permissions %s on the S3 Bucket.
     * </p>
     * <p>
     * <b>Solution:</b> Add Upload/Delete permissions on the bucket. For more information, see <a href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/Snapshots.Exporting.html#Snapshots.Exporting.GrantAccess"
     * >Step 2: Grant ElastiCache Access to Your Amazon S3 Bucket</a> in the ElastiCache User Guide.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Error Message: </b> ElastiCache has not been granted READ_ACP permissions %s on the S3 Bucket.
     * </p>
     * <p>
     * <b>Solution:</b> Add View Permissions on the bucket. For more information, see <a href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/Snapshots.Exporting.html#Snapshots.Exporting.GrantAccess"
     * >Step 2: Grant ElastiCache Access to Your Amazon S3 Bucket</a> in the ElastiCache User Guide.
     * </p>
     * </li>
     * </ul>
     * 
     * @param copySnapshotRequest
     *        Represents the input of a <code>CopySnapshotMessage</code> operation.
     * @return Result of the CopySnapshot operation returned by the service.
     * @throws SnapshotAlreadyExistsException
     *         You already have a snapshot with the given name.
     * @throws SnapshotNotFoundException
     *         The requested snapshot name does not refer to an existing snapshot.
     * @throws SnapshotQuotaExceededException
     *         The request cannot be processed because it would exceed the maximum number of snapshots.
     * @throws InvalidSnapshotStateException
     *         The current state of the snapshot does not allow the requested operation to occur.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.CopySnapshot
     */
    @Override
    public Snapshot copySnapshot(CopySnapshotRequest copySnapshotRequest) {
        ExecutionContext executionContext = createExecutionContext(copySnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CopySnapshotRequest> request = null;
        Response<Snapshot> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CopySnapshotRequestMarshaller().marshall(super.beforeMarshalling(copySnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<Snapshot> responseHandler = new StaxResponseHandler<Snapshot>(new SnapshotStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a cache cluster. All nodes in the cache cluster run the same protocol-compliant cache engine software,
     * either Memcached or Redis.
     * </p>
     * <important>
     * <p>
     * Due to current limitations on Redis (cluster mode disabled), this operation or parameter is not supported on
     * Redis (cluster mode enabled) replication groups.
     * </p>
     * </important>
     * 
     * @param createCacheClusterRequest
     *        Represents the input of a CreateCacheCluster operation.
     * @return Result of the CreateCacheCluster operation returned by the service.
     * @throws ReplicationGroupNotFoundException
     *         The specified replication group does not exist.
     * @throws InvalidReplicationGroupStateException
     *         The requested replication group is not in the <code>available</code> state.
     * @throws CacheClusterAlreadyExistsException
     *         You already have a cache cluster with the given identifier.
     * @throws InsufficientCacheClusterCapacityException
     *         The requested cache node type is not available in the specified Availability Zone.
     * @throws CacheSecurityGroupNotFoundException
     *         The requested cache security group name does not refer to an existing cache security group.
     * @throws CacheSubnetGroupNotFoundException
     *         The requested cache subnet group name does not refer to an existing cache subnet group.
     * @throws ClusterQuotaForCustomerExceededException
     *         The request cannot be processed because it would exceed the allowed number of cache clusters per
     *         customer.
     * @throws NodeQuotaForClusterExceededException
     *         The request cannot be processed because it would exceed the allowed number of cache nodes in a single
     *         cache cluster.
     * @throws NodeQuotaForCustomerExceededException
     *         The request cannot be processed because it would exceed the allowed number of cache nodes per customer.
     * @throws CacheParameterGroupNotFoundException
     *         The requested cache parameter group name does not refer to an existing cache parameter group.
     * @throws InvalidVPCNetworkStateException
     *         The VPC network is in an invalid state.
     * @throws TagQuotaPerResourceExceededException
     *         The request cannot be processed because it would cause the resource to have more than the allowed number
     *         of tags. The maximum number of tags permitted on a resource is 10.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.CreateCacheCluster
     */
    @Override
    public CacheCluster createCacheCluster(CreateCacheClusterRequest createCacheClusterRequest) {
        ExecutionContext executionContext = createExecutionContext(createCacheClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCacheClusterRequest> request = null;
        Response<CacheCluster> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateCacheClusterRequestMarshaller().marshall(super.beforeMarshalling(createCacheClusterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CacheCluster> responseHandler = new StaxResponseHandler<CacheCluster>(new CacheClusterStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new cache parameter group. A cache parameter group is a collection of parameters that you apply to all
     * of the nodes in a cache cluster.
     * </p>
     * 
     * @param createCacheParameterGroupRequest
     *        Represents the input of a <code>CreateCacheParameterGroup</code> operation.
     * @return Result of the CreateCacheParameterGroup operation returned by the service.
     * @throws CacheParameterGroupQuotaExceededException
     *         The request cannot be processed because it would exceed the maximum number of cache security groups.
     * @throws CacheParameterGroupAlreadyExistsException
     *         A cache parameter group with the requested name already exists.
     * @throws InvalidCacheParameterGroupStateException
     *         The current state of the cache parameter group does not allow the requested operation to occur.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.CreateCacheParameterGroup
     */
    @Override
    public CacheParameterGroup createCacheParameterGroup(CreateCacheParameterGroupRequest createCacheParameterGroupRequest) {
        ExecutionContext executionContext = createExecutionContext(createCacheParameterGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCacheParameterGroupRequest> request = null;
        Response<CacheParameterGroup> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateCacheParameterGroupRequestMarshaller().marshall(super.beforeMarshalling(createCacheParameterGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CacheParameterGroup> responseHandler = new StaxResponseHandler<CacheParameterGroup>(new CacheParameterGroupStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new cache security group. Use a cache security group to control access to one or more cache clusters.
     * </p>
     * <p>
     * Cache security groups are only used when you are creating a cache cluster outside of an Amazon Virtual Private
     * Cloud (Amazon VPC). If you are creating a cache cluster inside of a VPC, use a cache subnet group instead. For
     * more information, see <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_CreateCacheSubnetGroup.html"
     * >CreateCacheSubnetGroup</a>.
     * </p>
     * 
     * @param createCacheSecurityGroupRequest
     *        Represents the input of a <code>CreateCacheSecurityGroup</code> operation.
     * @return Result of the CreateCacheSecurityGroup operation returned by the service.
     * @throws CacheSecurityGroupAlreadyExistsException
     *         A cache security group with the specified name already exists.
     * @throws CacheSecurityGroupQuotaExceededException
     *         The request cannot be processed because it would exceed the allowed number of cache security groups.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.CreateCacheSecurityGroup
     */
    @Override
    public CacheSecurityGroup createCacheSecurityGroup(CreateCacheSecurityGroupRequest createCacheSecurityGroupRequest) {
        ExecutionContext executionContext = createExecutionContext(createCacheSecurityGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCacheSecurityGroupRequest> request = null;
        Response<CacheSecurityGroup> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateCacheSecurityGroupRequestMarshaller().marshall(super.beforeMarshalling(createCacheSecurityGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CacheSecurityGroup> responseHandler = new StaxResponseHandler<CacheSecurityGroup>(new CacheSecurityGroupStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new cache subnet group.
     * </p>
     * <p>
     * Use this parameter only when you are creating a cluster in an Amazon Virtual Private Cloud (Amazon VPC).
     * </p>
     * 
     * @param createCacheSubnetGroupRequest
     *        Represents the input of a <code>CreateCacheSubnetGroup</code> operation.
     * @return Result of the CreateCacheSubnetGroup operation returned by the service.
     * @throws CacheSubnetGroupAlreadyExistsException
     *         The requested cache subnet group name is already in use by an existing cache subnet group.
     * @throws CacheSubnetGroupQuotaExceededException
     *         The request cannot be processed because it would exceed the allowed number of cache subnet groups.
     * @throws CacheSubnetQuotaExceededException
     *         The request cannot be processed because it would exceed the allowed number of subnets in a cache subnet
     *         group.
     * @throws InvalidSubnetException
     *         An invalid subnet identifier was specified.
     * @sample AmazonElastiCache.CreateCacheSubnetGroup
     */
    @Override
    public CacheSubnetGroup createCacheSubnetGroup(CreateCacheSubnetGroupRequest createCacheSubnetGroupRequest) {
        ExecutionContext executionContext = createExecutionContext(createCacheSubnetGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCacheSubnetGroupRequest> request = null;
        Response<CacheSubnetGroup> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateCacheSubnetGroupRequestMarshaller().marshall(super.beforeMarshalling(createCacheSubnetGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CacheSubnetGroup> responseHandler = new StaxResponseHandler<CacheSubnetGroup>(new CacheSubnetGroupStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a Redis (cluster mode disabled) or a Redis (cluster mode enabled) replication group.
     * </p>
     * <p>
     * A Redis (cluster mode disabled) replication group is a collection of cache clusters, where one of the cache
     * clusters is a read/write primary and the others are read-only replicas. Writes to the primary are asynchronously
     * propagated to the replicas.
     * </p>
     * <p>
     * A Redis (cluster mode enabled) replication group is a collection of 1 to 15 node groups (shards). Each node group
     * (shard) has one read/write primary node and up to 5 read-only replica nodes. Writes to the primary are
     * asynchronously propagated to the replicas. Redis (cluster mode enabled) replication groups partition the data
     * across node groups (shards).
     * </p>
     * <p>
     * When a Redis (cluster mode disabled) replication group has been successfully created, you can add one or more
     * read replicas to it, up to a total of 5 read replicas. You cannot alter a Redis (cluster mode enabled)
     * replication group after it has been created.
     * </p>
     * <note>
     * <p>
     * This operation is valid for Redis only.
     * </p>
     * </note>
     * 
     * @param createReplicationGroupRequest
     *        Represents the input of a <code>CreateReplicationGroup</code> operation.
     * @return Result of the CreateReplicationGroup operation returned by the service.
     * @throws CacheClusterNotFoundException
     *         The requested cache cluster ID does not refer to an existing cache cluster.
     * @throws InvalidCacheClusterStateException
     *         The requested cache cluster is not in the <code>available</code> state.
     * @throws ReplicationGroupAlreadyExistsException
     *         The specified replication group already exists.
     * @throws InsufficientCacheClusterCapacityException
     *         The requested cache node type is not available in the specified Availability Zone.
     * @throws CacheSecurityGroupNotFoundException
     *         The requested cache security group name does not refer to an existing cache security group.
     * @throws CacheSubnetGroupNotFoundException
     *         The requested cache subnet group name does not refer to an existing cache subnet group.
     * @throws ClusterQuotaForCustomerExceededException
     *         The request cannot be processed because it would exceed the allowed number of cache clusters per
     *         customer.
     * @throws NodeQuotaForClusterExceededException
     *         The request cannot be processed because it would exceed the allowed number of cache nodes in a single
     *         cache cluster.
     * @throws NodeQuotaForCustomerExceededException
     *         The request cannot be processed because it would exceed the allowed number of cache nodes per customer.
     * @throws CacheParameterGroupNotFoundException
     *         The requested cache parameter group name does not refer to an existing cache parameter group.
     * @throws InvalidVPCNetworkStateException
     *         The VPC network is in an invalid state.
     * @throws TagQuotaPerResourceExceededException
     *         The request cannot be processed because it would cause the resource to have more than the allowed number
     *         of tags. The maximum number of tags permitted on a resource is 10.
     * @throws NodeGroupsPerReplicationGroupQuotaExceededException
     *         The request cannot be processed because it would exceed the maximum of 15 node groups (shards) in a
     *         single replication group.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.CreateReplicationGroup
     */
    @Override
    public ReplicationGroup createReplicationGroup(CreateReplicationGroupRequest createReplicationGroupRequest) {
        ExecutionContext executionContext = createExecutionContext(createReplicationGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateReplicationGroupRequest> request = null;
        Response<ReplicationGroup> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateReplicationGroupRequestMarshaller().marshall(super.beforeMarshalling(createReplicationGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ReplicationGroup> responseHandler = new StaxResponseHandler<ReplicationGroup>(new ReplicationGroupStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a copy of an entire cache cluster or replication group at a specific moment in time.
     * </p>
     * <note>
     * <p>
     * This operation is valid for Redis only.
     * </p>
     * </note>
     * 
     * @param createSnapshotRequest
     *        Represents the input of a <code>CreateSnapshot</code> operation.
     * @return Result of the CreateSnapshot operation returned by the service.
     * @throws SnapshotAlreadyExistsException
     *         You already have a snapshot with the given name.
     * @throws CacheClusterNotFoundException
     *         The requested cache cluster ID does not refer to an existing cache cluster.
     * @throws ReplicationGroupNotFoundException
     *         The specified replication group does not exist.
     * @throws InvalidCacheClusterStateException
     *         The requested cache cluster is not in the <code>available</code> state.
     * @throws InvalidReplicationGroupStateException
     *         The requested replication group is not in the <code>available</code> state.
     * @throws SnapshotQuotaExceededException
     *         The request cannot be processed because it would exceed the maximum number of snapshots.
     * @throws SnapshotFeatureNotSupportedException
     *         You attempted one of the following operations:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Creating a snapshot of a Redis cache cluster running on a <code>cache.t1.micro</code> cache node.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Creating a snapshot of a cache cluster that is running Memcached rather than Redis.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Neither of these are supported by ElastiCache.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @sample AmazonElastiCache.CreateSnapshot
     */
    @Override
    public Snapshot createSnapshot(CreateSnapshotRequest createSnapshotRequest) {
        ExecutionContext executionContext = createExecutionContext(createSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSnapshotRequest> request = null;
        Response<Snapshot> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSnapshotRequestMarshaller().marshall(super.beforeMarshalling(createSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<Snapshot> responseHandler = new StaxResponseHandler<Snapshot>(new SnapshotStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a previously provisioned cache cluster. <code>DeleteCacheCluster</code> deletes all associated cache
     * nodes, node endpoints and the cache cluster itself. When you receive a successful response from this operation,
     * Amazon ElastiCache immediately begins deleting the cache cluster; you cannot cancel or revert this operation.
     * </p>
     * <p>
     * This operation cannot be used to delete a cache cluster that is the last read replica of a replication group or
     * node group (shard) that has Multi-AZ mode enabled or a cache cluster from a Redis (cluster mode enabled)
     * replication group.
     * </p>
     * <important>
     * <p>
     * Due to current limitations on Redis (cluster mode disabled), this operation or parameter is not supported on
     * Redis (cluster mode enabled) replication groups.
     * </p>
     * </important>
     * 
     * @param deleteCacheClusterRequest
     *        Represents the input of a <code>DeleteCacheCluster</code> operation.
     * @return Result of the DeleteCacheCluster operation returned by the service.
     * @throws CacheClusterNotFoundException
     *         The requested cache cluster ID does not refer to an existing cache cluster.
     * @throws InvalidCacheClusterStateException
     *         The requested cache cluster is not in the <code>available</code> state.
     * @throws SnapshotAlreadyExistsException
     *         You already have a snapshot with the given name.
     * @throws SnapshotFeatureNotSupportedException
     *         You attempted one of the following operations:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Creating a snapshot of a Redis cache cluster running on a <code>cache.t1.micro</code> cache node.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Creating a snapshot of a cache cluster that is running Memcached rather than Redis.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Neither of these are supported by ElastiCache.
     * @throws SnapshotQuotaExceededException
     *         The request cannot be processed because it would exceed the maximum number of snapshots.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.DeleteCacheCluster
     */
    @Override
    public CacheCluster deleteCacheCluster(DeleteCacheClusterRequest deleteCacheClusterRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteCacheClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteCacheClusterRequest> request = null;
        Response<CacheCluster> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteCacheClusterRequestMarshaller().marshall(super.beforeMarshalling(deleteCacheClusterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CacheCluster> responseHandler = new StaxResponseHandler<CacheCluster>(new CacheClusterStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified cache parameter group. You cannot delete a cache parameter group if it is associated with
     * any cache clusters.
     * </p>
     * 
     * @param deleteCacheParameterGroupRequest
     *        Represents the input of a <code>DeleteCacheParameterGroup</code> operation.
     * @return Result of the DeleteCacheParameterGroup operation returned by the service.
     * @throws InvalidCacheParameterGroupStateException
     *         The current state of the cache parameter group does not allow the requested operation to occur.
     * @throws CacheParameterGroupNotFoundException
     *         The requested cache parameter group name does not refer to an existing cache parameter group.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.DeleteCacheParameterGroup
     */
    @Override
    public DeleteCacheParameterGroupResult deleteCacheParameterGroup(DeleteCacheParameterGroupRequest deleteCacheParameterGroupRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteCacheParameterGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteCacheParameterGroupRequest> request = null;
        Response<DeleteCacheParameterGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteCacheParameterGroupRequestMarshaller().marshall(super.beforeMarshalling(deleteCacheParameterGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteCacheParameterGroupResult> responseHandler = new StaxResponseHandler<DeleteCacheParameterGroupResult>(
                    new DeleteCacheParameterGroupResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a cache security group.
     * </p>
     * <note>
     * <p>
     * You cannot delete a cache security group if it is associated with any cache clusters.
     * </p>
     * </note>
     * 
     * @param deleteCacheSecurityGroupRequest
     *        Represents the input of a <code>DeleteCacheSecurityGroup</code> operation.
     * @return Result of the DeleteCacheSecurityGroup operation returned by the service.
     * @throws InvalidCacheSecurityGroupStateException
     *         The current state of the cache security group does not allow deletion.
     * @throws CacheSecurityGroupNotFoundException
     *         The requested cache security group name does not refer to an existing cache security group.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.DeleteCacheSecurityGroup
     */
    @Override
    public DeleteCacheSecurityGroupResult deleteCacheSecurityGroup(DeleteCacheSecurityGroupRequest deleteCacheSecurityGroupRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteCacheSecurityGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteCacheSecurityGroupRequest> request = null;
        Response<DeleteCacheSecurityGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteCacheSecurityGroupRequestMarshaller().marshall(super.beforeMarshalling(deleteCacheSecurityGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteCacheSecurityGroupResult> responseHandler = new StaxResponseHandler<DeleteCacheSecurityGroupResult>(
                    new DeleteCacheSecurityGroupResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a cache subnet group.
     * </p>
     * <note>
     * <p>
     * You cannot delete a cache subnet group if it is associated with any cache clusters.
     * </p>
     * </note>
     * 
     * @param deleteCacheSubnetGroupRequest
     *        Represents the input of a <code>DeleteCacheSubnetGroup</code> operation.
     * @return Result of the DeleteCacheSubnetGroup operation returned by the service.
     * @throws CacheSubnetGroupInUseException
     *         The requested cache subnet group is currently in use.
     * @throws CacheSubnetGroupNotFoundException
     *         The requested cache subnet group name does not refer to an existing cache subnet group.
     * @sample AmazonElastiCache.DeleteCacheSubnetGroup
     */
    @Override
    public DeleteCacheSubnetGroupResult deleteCacheSubnetGroup(DeleteCacheSubnetGroupRequest deleteCacheSubnetGroupRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteCacheSubnetGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteCacheSubnetGroupRequest> request = null;
        Response<DeleteCacheSubnetGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteCacheSubnetGroupRequestMarshaller().marshall(super.beforeMarshalling(deleteCacheSubnetGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteCacheSubnetGroupResult> responseHandler = new StaxResponseHandler<DeleteCacheSubnetGroupResult>(
                    new DeleteCacheSubnetGroupResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an existing replication group. By default, this operation deletes the entire replication group, including
     * the primary/primaries and all of the read replicas. If the replication group has only one primary, you can
     * optionally delete only the read replicas, while retaining the primary by setting
     * <code>RetainPrimaryCluster=true</code>.
     * </p>
     * <p>
     * When you receive a successful response from this operation, Amazon ElastiCache immediately begins deleting the
     * selected resources; you cannot cancel or revert this operation.
     * </p>
     * <note>
     * <p>
     * This operation is valid for Redis only.
     * </p>
     * </note>
     * 
     * @param deleteReplicationGroupRequest
     *        Represents the input of a <code>DeleteReplicationGroup</code> operation.
     * @return Result of the DeleteReplicationGroup operation returned by the service.
     * @throws ReplicationGroupNotFoundException
     *         The specified replication group does not exist.
     * @throws InvalidReplicationGroupStateException
     *         The requested replication group is not in the <code>available</code> state.
     * @throws SnapshotAlreadyExistsException
     *         You already have a snapshot with the given name.
     * @throws SnapshotFeatureNotSupportedException
     *         You attempted one of the following operations:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Creating a snapshot of a Redis cache cluster running on a <code>cache.t1.micro</code> cache node.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Creating a snapshot of a cache cluster that is running Memcached rather than Redis.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Neither of these are supported by ElastiCache.
     * @throws SnapshotQuotaExceededException
     *         The request cannot be processed because it would exceed the maximum number of snapshots.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.DeleteReplicationGroup
     */
    @Override
    public ReplicationGroup deleteReplicationGroup(DeleteReplicationGroupRequest deleteReplicationGroupRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteReplicationGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteReplicationGroupRequest> request = null;
        Response<ReplicationGroup> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteReplicationGroupRequestMarshaller().marshall(super.beforeMarshalling(deleteReplicationGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ReplicationGroup> responseHandler = new StaxResponseHandler<ReplicationGroup>(new ReplicationGroupStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an existing snapshot. When you receive a successful response from this operation, ElastiCache immediately
     * begins deleting the snapshot; you cannot cancel or revert this operation.
     * </p>
     * <note>
     * <p>
     * This operation is valid for Redis only.
     * </p>
     * </note>
     * 
     * @param deleteSnapshotRequest
     *        Represents the input of a <code>DeleteSnapshot</code> operation.
     * @return Result of the DeleteSnapshot operation returned by the service.
     * @throws SnapshotNotFoundException
     *         The requested snapshot name does not refer to an existing snapshot.
     * @throws InvalidSnapshotStateException
     *         The current state of the snapshot does not allow the requested operation to occur.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.DeleteSnapshot
     */
    @Override
    public Snapshot deleteSnapshot(DeleteSnapshotRequest deleteSnapshotRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSnapshotRequest> request = null;
        Response<Snapshot> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSnapshotRequestMarshaller().marshall(super.beforeMarshalling(deleteSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<Snapshot> responseHandler = new StaxResponseHandler<Snapshot>(new SnapshotStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about all provisioned cache clusters if no cache cluster identifier is specified, or about a
     * specific cache cluster if a cache cluster identifier is supplied.
     * </p>
     * <p>
     * By default, abbreviated information about the cache clusters are returned. You can use the optional
     * <code>ShowDetails</code> flag to retrieve detailed information about the cache nodes associated with the cache
     * clusters. These details include the DNS address and port for the cache node endpoint.
     * </p>
     * <p>
     * If the cluster is in the CREATING state, only cluster-level information is displayed until all of the nodes are
     * successfully provisioned.
     * </p>
     * <p>
     * If the cluster is in the DELETING state, only cluster-level information is displayed.
     * </p>
     * <p>
     * If cache nodes are currently being added to the cache cluster, node endpoint information and creation time for
     * the additional nodes are not displayed until they are completely provisioned. When the cache cluster state is
     * <code>available</code>, the cluster is ready for use.
     * </p>
     * <p>
     * If cache nodes are currently being removed from the cache cluster, no endpoint information for the removed nodes
     * is displayed.
     * </p>
     * 
     * @param describeCacheClustersRequest
     *        Represents the input of a <code>DescribeCacheClusters</code> operation.
     * @return Result of the DescribeCacheClusters operation returned by the service.
     * @throws CacheClusterNotFoundException
     *         The requested cache cluster ID does not refer to an existing cache cluster.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.DescribeCacheClusters
     */
    @Override
    public DescribeCacheClustersResult describeCacheClusters(DescribeCacheClustersRequest describeCacheClustersRequest) {
        ExecutionContext executionContext = createExecutionContext(describeCacheClustersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCacheClustersRequest> request = null;
        Response<DescribeCacheClustersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCacheClustersRequestMarshaller().marshall(super.beforeMarshalling(describeCacheClustersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeCacheClustersResult> responseHandler = new StaxResponseHandler<DescribeCacheClustersResult>(
                    new DescribeCacheClustersResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeCacheClustersResult describeCacheClusters() {
        return describeCacheClusters(new DescribeCacheClustersRequest());
    }

    /**
     * <p>
     * Returns a list of the available cache engines and their versions.
     * </p>
     * 
     * @param describeCacheEngineVersionsRequest
     *        Represents the input of a <code>DescribeCacheEngineVersions</code> operation.
     * @return Result of the DescribeCacheEngineVersions operation returned by the service.
     * @sample AmazonElastiCache.DescribeCacheEngineVersions
     */
    @Override
    public DescribeCacheEngineVersionsResult describeCacheEngineVersions(DescribeCacheEngineVersionsRequest describeCacheEngineVersionsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeCacheEngineVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCacheEngineVersionsRequest> request = null;
        Response<DescribeCacheEngineVersionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCacheEngineVersionsRequestMarshaller().marshall(super.beforeMarshalling(describeCacheEngineVersionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeCacheEngineVersionsResult> responseHandler = new StaxResponseHandler<DescribeCacheEngineVersionsResult>(
                    new DescribeCacheEngineVersionsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeCacheEngineVersionsResult describeCacheEngineVersions() {
        return describeCacheEngineVersions(new DescribeCacheEngineVersionsRequest());
    }

    /**
     * <p>
     * Returns a list of cache parameter group descriptions. If a cache parameter group name is specified, the list
     * contains only the descriptions for that group.
     * </p>
     * 
     * @param describeCacheParameterGroupsRequest
     *        Represents the input of a <code>DescribeCacheParameterGroups</code> operation.
     * @return Result of the DescribeCacheParameterGroups operation returned by the service.
     * @throws CacheParameterGroupNotFoundException
     *         The requested cache parameter group name does not refer to an existing cache parameter group.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.DescribeCacheParameterGroups
     */
    @Override
    public DescribeCacheParameterGroupsResult describeCacheParameterGroups(DescribeCacheParameterGroupsRequest describeCacheParameterGroupsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeCacheParameterGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCacheParameterGroupsRequest> request = null;
        Response<DescribeCacheParameterGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCacheParameterGroupsRequestMarshaller().marshall(super.beforeMarshalling(describeCacheParameterGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeCacheParameterGroupsResult> responseHandler = new StaxResponseHandler<DescribeCacheParameterGroupsResult>(
                    new DescribeCacheParameterGroupsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeCacheParameterGroupsResult describeCacheParameterGroups() {
        return describeCacheParameterGroups(new DescribeCacheParameterGroupsRequest());
    }

    /**
     * <p>
     * Returns the detailed parameter list for a particular cache parameter group.
     * </p>
     * 
     * @param describeCacheParametersRequest
     *        Represents the input of a <code>DescribeCacheParameters</code> operation.
     * @return Result of the DescribeCacheParameters operation returned by the service.
     * @throws CacheParameterGroupNotFoundException
     *         The requested cache parameter group name does not refer to an existing cache parameter group.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.DescribeCacheParameters
     */
    @Override
    public DescribeCacheParametersResult describeCacheParameters(DescribeCacheParametersRequest describeCacheParametersRequest) {
        ExecutionContext executionContext = createExecutionContext(describeCacheParametersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCacheParametersRequest> request = null;
        Response<DescribeCacheParametersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCacheParametersRequestMarshaller().marshall(super.beforeMarshalling(describeCacheParametersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeCacheParametersResult> responseHandler = new StaxResponseHandler<DescribeCacheParametersResult>(
                    new DescribeCacheParametersResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of cache security group descriptions. If a cache security group name is specified, the list
     * contains only the description of that group.
     * </p>
     * 
     * @param describeCacheSecurityGroupsRequest
     *        Represents the input of a <code>DescribeCacheSecurityGroups</code> operation.
     * @return Result of the DescribeCacheSecurityGroups operation returned by the service.
     * @throws CacheSecurityGroupNotFoundException
     *         The requested cache security group name does not refer to an existing cache security group.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.DescribeCacheSecurityGroups
     */
    @Override
    public DescribeCacheSecurityGroupsResult describeCacheSecurityGroups(DescribeCacheSecurityGroupsRequest describeCacheSecurityGroupsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeCacheSecurityGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCacheSecurityGroupsRequest> request = null;
        Response<DescribeCacheSecurityGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCacheSecurityGroupsRequestMarshaller().marshall(super.beforeMarshalling(describeCacheSecurityGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeCacheSecurityGroupsResult> responseHandler = new StaxResponseHandler<DescribeCacheSecurityGroupsResult>(
                    new DescribeCacheSecurityGroupsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeCacheSecurityGroupsResult describeCacheSecurityGroups() {
        return describeCacheSecurityGroups(new DescribeCacheSecurityGroupsRequest());
    }

    /**
     * <p>
     * Returns a list of cache subnet group descriptions. If a subnet group name is specified, the list contains only
     * the description of that group.
     * </p>
     * 
     * @param describeCacheSubnetGroupsRequest
     *        Represents the input of a <code>DescribeCacheSubnetGroups</code> operation.
     * @return Result of the DescribeCacheSubnetGroups operation returned by the service.
     * @throws CacheSubnetGroupNotFoundException
     *         The requested cache subnet group name does not refer to an existing cache subnet group.
     * @sample AmazonElastiCache.DescribeCacheSubnetGroups
     */
    @Override
    public DescribeCacheSubnetGroupsResult describeCacheSubnetGroups(DescribeCacheSubnetGroupsRequest describeCacheSubnetGroupsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeCacheSubnetGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCacheSubnetGroupsRequest> request = null;
        Response<DescribeCacheSubnetGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCacheSubnetGroupsRequestMarshaller().marshall(super.beforeMarshalling(describeCacheSubnetGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeCacheSubnetGroupsResult> responseHandler = new StaxResponseHandler<DescribeCacheSubnetGroupsResult>(
                    new DescribeCacheSubnetGroupsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeCacheSubnetGroupsResult describeCacheSubnetGroups() {
        return describeCacheSubnetGroups(new DescribeCacheSubnetGroupsRequest());
    }

    /**
     * <p>
     * Returns the default engine and system parameter information for the specified cache engine.
     * </p>
     * 
     * @param describeEngineDefaultParametersRequest
     *        Represents the input of a <code>DescribeEngineDefaultParameters</code> operation.
     * @return Result of the DescribeEngineDefaultParameters operation returned by the service.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.DescribeEngineDefaultParameters
     */
    @Override
    public EngineDefaults describeEngineDefaultParameters(DescribeEngineDefaultParametersRequest describeEngineDefaultParametersRequest) {
        ExecutionContext executionContext = createExecutionContext(describeEngineDefaultParametersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEngineDefaultParametersRequest> request = null;
        Response<EngineDefaults> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEngineDefaultParametersRequestMarshaller().marshall(super.beforeMarshalling(describeEngineDefaultParametersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<EngineDefaults> responseHandler = new StaxResponseHandler<EngineDefaults>(new EngineDefaultsStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns events related to cache clusters, cache security groups, and cache parameter groups. You can obtain
     * events specific to a particular cache cluster, cache security group, or cache parameter group by providing the
     * name as a parameter.
     * </p>
     * <p>
     * By default, only the events occurring within the last hour are returned; however, you can retrieve up to 14 days'
     * worth of events if necessary.
     * </p>
     * 
     * @param describeEventsRequest
     *        Represents the input of a <code>DescribeEvents</code> operation.
     * @return Result of the DescribeEvents operation returned by the service.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.DescribeEvents
     */
    @Override
    public DescribeEventsResult describeEvents(DescribeEventsRequest describeEventsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeEventsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEventsRequest> request = null;
        Response<DescribeEventsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEventsRequestMarshaller().marshall(super.beforeMarshalling(describeEventsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeEventsResult> responseHandler = new StaxResponseHandler<DescribeEventsResult>(
                    new DescribeEventsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeEventsResult describeEvents() {
        return describeEvents(new DescribeEventsRequest());
    }

    /**
     * <p>
     * Returns information about a particular replication group. If no identifier is specified,
     * <code>DescribeReplicationGroups</code> returns information about all replication groups.
     * </p>
     * <note>
     * <p>
     * This operation is valid for Redis only.
     * </p>
     * </note>
     * 
     * @param describeReplicationGroupsRequest
     *        Represents the input of a <code>DescribeReplicationGroups</code> operation.
     * @return Result of the DescribeReplicationGroups operation returned by the service.
     * @throws ReplicationGroupNotFoundException
     *         The specified replication group does not exist.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.DescribeReplicationGroups
     */
    @Override
    public DescribeReplicationGroupsResult describeReplicationGroups(DescribeReplicationGroupsRequest describeReplicationGroupsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeReplicationGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeReplicationGroupsRequest> request = null;
        Response<DescribeReplicationGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeReplicationGroupsRequestMarshaller().marshall(super.beforeMarshalling(describeReplicationGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeReplicationGroupsResult> responseHandler = new StaxResponseHandler<DescribeReplicationGroupsResult>(
                    new DescribeReplicationGroupsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeReplicationGroupsResult describeReplicationGroups() {
        return describeReplicationGroups(new DescribeReplicationGroupsRequest());
    }

    /**
     * <p>
     * Returns information about reserved cache nodes for this account, or about a specified reserved cache node.
     * </p>
     * 
     * @param describeReservedCacheNodesRequest
     *        Represents the input of a <code>DescribeReservedCacheNodes</code> operation.
     * @return Result of the DescribeReservedCacheNodes operation returned by the service.
     * @throws ReservedCacheNodeNotFoundException
     *         The requested reserved cache node was not found.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.DescribeReservedCacheNodes
     */
    @Override
    public DescribeReservedCacheNodesResult describeReservedCacheNodes(DescribeReservedCacheNodesRequest describeReservedCacheNodesRequest) {
        ExecutionContext executionContext = createExecutionContext(describeReservedCacheNodesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeReservedCacheNodesRequest> request = null;
        Response<DescribeReservedCacheNodesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeReservedCacheNodesRequestMarshaller().marshall(super.beforeMarshalling(describeReservedCacheNodesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeReservedCacheNodesResult> responseHandler = new StaxResponseHandler<DescribeReservedCacheNodesResult>(
                    new DescribeReservedCacheNodesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeReservedCacheNodesResult describeReservedCacheNodes() {
        return describeReservedCacheNodes(new DescribeReservedCacheNodesRequest());
    }

    /**
     * <p>
     * Lists available reserved cache node offerings.
     * </p>
     * 
     * @param describeReservedCacheNodesOfferingsRequest
     *        Represents the input of a <code>DescribeReservedCacheNodesOfferings</code> operation.
     * @return Result of the DescribeReservedCacheNodesOfferings operation returned by the service.
     * @throws ReservedCacheNodesOfferingNotFoundException
     *         The requested cache node offering does not exist.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.DescribeReservedCacheNodesOfferings
     */
    @Override
    public DescribeReservedCacheNodesOfferingsResult describeReservedCacheNodesOfferings(
            DescribeReservedCacheNodesOfferingsRequest describeReservedCacheNodesOfferingsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeReservedCacheNodesOfferingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeReservedCacheNodesOfferingsRequest> request = null;
        Response<DescribeReservedCacheNodesOfferingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeReservedCacheNodesOfferingsRequestMarshaller().marshall(super
                        .beforeMarshalling(describeReservedCacheNodesOfferingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeReservedCacheNodesOfferingsResult> responseHandler = new StaxResponseHandler<DescribeReservedCacheNodesOfferingsResult>(
                    new DescribeReservedCacheNodesOfferingsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeReservedCacheNodesOfferingsResult describeReservedCacheNodesOfferings() {
        return describeReservedCacheNodesOfferings(new DescribeReservedCacheNodesOfferingsRequest());
    }

    /**
     * <p>
     * Returns information about cache cluster or replication group snapshots. By default,
     * <code>DescribeSnapshots</code> lists all of your snapshots; it can optionally describe a single snapshot, or just
     * the snapshots associated with a particular cache cluster.
     * </p>
     * <note>
     * <p>
     * This operation is valid for Redis only.
     * </p>
     * </note>
     * 
     * @param describeSnapshotsRequest
     *        Represents the input of a <code>DescribeSnapshotsMessage</code> operation.
     * @return Result of the DescribeSnapshots operation returned by the service.
     * @throws CacheClusterNotFoundException
     *         The requested cache cluster ID does not refer to an existing cache cluster.
     * @throws SnapshotNotFoundException
     *         The requested snapshot name does not refer to an existing snapshot.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.DescribeSnapshots
     */
    @Override
    public DescribeSnapshotsResult describeSnapshots(DescribeSnapshotsRequest describeSnapshotsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeSnapshotsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSnapshotsRequest> request = null;
        Response<DescribeSnapshotsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSnapshotsRequestMarshaller().marshall(super.beforeMarshalling(describeSnapshotsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeSnapshotsResult> responseHandler = new StaxResponseHandler<DescribeSnapshotsResult>(
                    new DescribeSnapshotsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeSnapshotsResult describeSnapshots() {
        return describeSnapshots(new DescribeSnapshotsRequest());
    }

    /**
     * <p>
     * Lists all available node types that you can scale your Redis cluster's or replication group's current node type
     * up to.
     * </p>
     * <p>
     * When you use the <code>ModifyCacheCluster</code> or <code>ModifyReplicationGroup</code> operations to scale up
     * your cluster or replication group, the value of the <code>CacheNodeType</code> parameter must be one of the node
     * types returned by this operation.
     * </p>
     * 
     * @param listAllowedNodeTypeModificationsRequest
     *        The input parameters for the <code>ListAllowedNodeTypeModifications</code> operation.
     * @return Result of the ListAllowedNodeTypeModifications operation returned by the service.
     * @throws CacheClusterNotFoundException
     *         The requested cache cluster ID does not refer to an existing cache cluster.
     * @throws ReplicationGroupNotFoundException
     *         The specified replication group does not exist.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @sample AmazonElastiCache.ListAllowedNodeTypeModifications
     */
    @Override
    public ListAllowedNodeTypeModificationsResult listAllowedNodeTypeModifications(
            ListAllowedNodeTypeModificationsRequest listAllowedNodeTypeModificationsRequest) {
        ExecutionContext executionContext = createExecutionContext(listAllowedNodeTypeModificationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAllowedNodeTypeModificationsRequest> request = null;
        Response<ListAllowedNodeTypeModificationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAllowedNodeTypeModificationsRequestMarshaller().marshall(super.beforeMarshalling(listAllowedNodeTypeModificationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListAllowedNodeTypeModificationsResult> responseHandler = new StaxResponseHandler<ListAllowedNodeTypeModificationsResult>(
                    new ListAllowedNodeTypeModificationsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public ListAllowedNodeTypeModificationsResult listAllowedNodeTypeModifications() {
        return listAllowedNodeTypeModifications(new ListAllowedNodeTypeModificationsRequest());
    }

    /**
     * <p>
     * Lists all cost allocation tags currently on the named resource. A <code>cost allocation tag</code> is a key-value
     * pair where the key is case-sensitive and the value is optional. You can use cost allocation tags to categorize
     * and track your AWS costs.
     * </p>
     * <p>
     * You can have a maximum of 10 cost allocation tags on an ElastiCache resource. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/BestPractices.html">Using Cost Allocation
     * Tags in Amazon ElastiCache</a>.
     * </p>
     * 
     * @param listTagsForResourceRequest
     *        The input parameters for the <code>ListTagsForResource</code> operation.
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws CacheClusterNotFoundException
     *         The requested cache cluster ID does not refer to an existing cache cluster.
     * @throws SnapshotNotFoundException
     *         The requested snapshot name does not refer to an existing snapshot.
     * @throws InvalidARNException
     *         The requested Amazon Resource Name (ARN) does not refer to an existing resource.
     * @sample AmazonElastiCache.ListTagsForResource
     */
    @Override
    public ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest) {
        ExecutionContext executionContext = createExecutionContext(listTagsForResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTagsForResourceRequest> request = null;
        Response<ListTagsForResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTagsForResourceRequestMarshaller().marshall(super.beforeMarshalling(listTagsForResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListTagsForResourceResult> responseHandler = new StaxResponseHandler<ListTagsForResourceResult>(
                    new ListTagsForResourceResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies the settings for a cache cluster. You can use this operation to change one or more cluster configuration
     * parameters by specifying the parameters and the new values.
     * </p>
     * 
     * @param modifyCacheClusterRequest
     *        Represents the input of a <code>ModifyCacheCluster</code> operation.
     * @return Result of the ModifyCacheCluster operation returned by the service.
     * @throws InvalidCacheClusterStateException
     *         The requested cache cluster is not in the <code>available</code> state.
     * @throws InvalidCacheSecurityGroupStateException
     *         The current state of the cache security group does not allow deletion.
     * @throws InsufficientCacheClusterCapacityException
     *         The requested cache node type is not available in the specified Availability Zone.
     * @throws CacheClusterNotFoundException
     *         The requested cache cluster ID does not refer to an existing cache cluster.
     * @throws NodeQuotaForClusterExceededException
     *         The request cannot be processed because it would exceed the allowed number of cache nodes in a single
     *         cache cluster.
     * @throws NodeQuotaForCustomerExceededException
     *         The request cannot be processed because it would exceed the allowed number of cache nodes per customer.
     * @throws CacheSecurityGroupNotFoundException
     *         The requested cache security group name does not refer to an existing cache security group.
     * @throws CacheParameterGroupNotFoundException
     *         The requested cache parameter group name does not refer to an existing cache parameter group.
     * @throws InvalidVPCNetworkStateException
     *         The VPC network is in an invalid state.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.ModifyCacheCluster
     */
    @Override
    public CacheCluster modifyCacheCluster(ModifyCacheClusterRequest modifyCacheClusterRequest) {
        ExecutionContext executionContext = createExecutionContext(modifyCacheClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyCacheClusterRequest> request = null;
        Response<CacheCluster> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyCacheClusterRequestMarshaller().marshall(super.beforeMarshalling(modifyCacheClusterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CacheCluster> responseHandler = new StaxResponseHandler<CacheCluster>(new CacheClusterStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies the parameters of a cache parameter group. You can modify up to 20 parameters in a single request by
     * submitting a list parameter name and value pairs.
     * </p>
     * 
     * @param modifyCacheParameterGroupRequest
     *        Represents the input of a <code>ModifyCacheParameterGroup</code> operation.
     * @return Result of the ModifyCacheParameterGroup operation returned by the service.
     * @throws CacheParameterGroupNotFoundException
     *         The requested cache parameter group name does not refer to an existing cache parameter group.
     * @throws InvalidCacheParameterGroupStateException
     *         The current state of the cache parameter group does not allow the requested operation to occur.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.ModifyCacheParameterGroup
     */
    @Override
    public ModifyCacheParameterGroupResult modifyCacheParameterGroup(ModifyCacheParameterGroupRequest modifyCacheParameterGroupRequest) {
        ExecutionContext executionContext = createExecutionContext(modifyCacheParameterGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyCacheParameterGroupRequest> request = null;
        Response<ModifyCacheParameterGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyCacheParameterGroupRequestMarshaller().marshall(super.beforeMarshalling(modifyCacheParameterGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ModifyCacheParameterGroupResult> responseHandler = new StaxResponseHandler<ModifyCacheParameterGroupResult>(
                    new ModifyCacheParameterGroupResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies an existing cache subnet group.
     * </p>
     * 
     * @param modifyCacheSubnetGroupRequest
     *        Represents the input of a <code>ModifyCacheSubnetGroup</code> operation.
     * @return Result of the ModifyCacheSubnetGroup operation returned by the service.
     * @throws CacheSubnetGroupNotFoundException
     *         The requested cache subnet group name does not refer to an existing cache subnet group.
     * @throws CacheSubnetQuotaExceededException
     *         The request cannot be processed because it would exceed the allowed number of subnets in a cache subnet
     *         group.
     * @throws SubnetInUseException
     *         The requested subnet is being used by another cache subnet group.
     * @throws InvalidSubnetException
     *         An invalid subnet identifier was specified.
     * @sample AmazonElastiCache.ModifyCacheSubnetGroup
     */
    @Override
    public CacheSubnetGroup modifyCacheSubnetGroup(ModifyCacheSubnetGroupRequest modifyCacheSubnetGroupRequest) {
        ExecutionContext executionContext = createExecutionContext(modifyCacheSubnetGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyCacheSubnetGroupRequest> request = null;
        Response<CacheSubnetGroup> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyCacheSubnetGroupRequestMarshaller().marshall(super.beforeMarshalling(modifyCacheSubnetGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CacheSubnetGroup> responseHandler = new StaxResponseHandler<CacheSubnetGroup>(new CacheSubnetGroupStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies the settings for a replication group.
     * </p>
     * <important>
     * <p>
     * Due to current limitations on Redis (cluster mode disabled), this operation or parameter is not supported on
     * Redis (cluster mode enabled) replication groups.
     * </p>
     * </important> <note>
     * <p>
     * This operation is valid for Redis only.
     * </p>
     * </note>
     * 
     * @param modifyReplicationGroupRequest
     *        Represents the input of a <code>ModifyReplicationGroups</code> operation.
     * @return Result of the ModifyReplicationGroup operation returned by the service.
     * @throws ReplicationGroupNotFoundException
     *         The specified replication group does not exist.
     * @throws InvalidReplicationGroupStateException
     *         The requested replication group is not in the <code>available</code> state.
     * @throws InvalidCacheClusterStateException
     *         The requested cache cluster is not in the <code>available</code> state.
     * @throws InvalidCacheSecurityGroupStateException
     *         The current state of the cache security group does not allow deletion.
     * @throws InsufficientCacheClusterCapacityException
     *         The requested cache node type is not available in the specified Availability Zone.
     * @throws CacheClusterNotFoundException
     *         The requested cache cluster ID does not refer to an existing cache cluster.
     * @throws NodeQuotaForClusterExceededException
     *         The request cannot be processed because it would exceed the allowed number of cache nodes in a single
     *         cache cluster.
     * @throws NodeQuotaForCustomerExceededException
     *         The request cannot be processed because it would exceed the allowed number of cache nodes per customer.
     * @throws CacheSecurityGroupNotFoundException
     *         The requested cache security group name does not refer to an existing cache security group.
     * @throws CacheParameterGroupNotFoundException
     *         The requested cache parameter group name does not refer to an existing cache parameter group.
     * @throws InvalidVPCNetworkStateException
     *         The VPC network is in an invalid state.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.ModifyReplicationGroup
     */
    @Override
    public ReplicationGroup modifyReplicationGroup(ModifyReplicationGroupRequest modifyReplicationGroupRequest) {
        ExecutionContext executionContext = createExecutionContext(modifyReplicationGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyReplicationGroupRequest> request = null;
        Response<ReplicationGroup> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyReplicationGroupRequestMarshaller().marshall(super.beforeMarshalling(modifyReplicationGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ReplicationGroup> responseHandler = new StaxResponseHandler<ReplicationGroup>(new ReplicationGroupStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Allows you to purchase a reserved cache node offering.
     * </p>
     * 
     * @param purchaseReservedCacheNodesOfferingRequest
     *        Represents the input of a <code>PurchaseReservedCacheNodesOffering</code> operation.
     * @return Result of the PurchaseReservedCacheNodesOffering operation returned by the service.
     * @throws ReservedCacheNodesOfferingNotFoundException
     *         The requested cache node offering does not exist.
     * @throws ReservedCacheNodeAlreadyExistsException
     *         You already have a reservation with the given identifier.
     * @throws ReservedCacheNodeQuotaExceededException
     *         The request cannot be processed because it would exceed the user's cache node quota.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.PurchaseReservedCacheNodesOffering
     */
    @Override
    public ReservedCacheNode purchaseReservedCacheNodesOffering(PurchaseReservedCacheNodesOfferingRequest purchaseReservedCacheNodesOfferingRequest) {
        ExecutionContext executionContext = createExecutionContext(purchaseReservedCacheNodesOfferingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PurchaseReservedCacheNodesOfferingRequest> request = null;
        Response<ReservedCacheNode> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PurchaseReservedCacheNodesOfferingRequestMarshaller()
                        .marshall(super.beforeMarshalling(purchaseReservedCacheNodesOfferingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ReservedCacheNode> responseHandler = new StaxResponseHandler<ReservedCacheNode>(new ReservedCacheNodeStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Reboots some, or all, of the cache nodes within a provisioned cache cluster. This operation applies any modified
     * cache parameter groups to the cache cluster. The reboot operation takes place as soon as possible, and results in
     * a momentary outage to the cache cluster. During the reboot, the cache cluster status is set to REBOOTING.
     * </p>
     * <p>
     * The reboot causes the contents of the cache (for each cache node being rebooted) to be lost.
     * </p>
     * <p>
     * When the reboot is complete, a cache cluster event is created.
     * </p>
     * 
     * @param rebootCacheClusterRequest
     *        Represents the input of a <code>RebootCacheCluster</code> operation.
     * @return Result of the RebootCacheCluster operation returned by the service.
     * @throws InvalidCacheClusterStateException
     *         The requested cache cluster is not in the <code>available</code> state.
     * @throws CacheClusterNotFoundException
     *         The requested cache cluster ID does not refer to an existing cache cluster.
     * @sample AmazonElastiCache.RebootCacheCluster
     */
    @Override
    public CacheCluster rebootCacheCluster(RebootCacheClusterRequest rebootCacheClusterRequest) {
        ExecutionContext executionContext = createExecutionContext(rebootCacheClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RebootCacheClusterRequest> request = null;
        Response<CacheCluster> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RebootCacheClusterRequestMarshaller().marshall(super.beforeMarshalling(rebootCacheClusterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CacheCluster> responseHandler = new StaxResponseHandler<CacheCluster>(new CacheClusterStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes the tags identified by the <code>TagKeys</code> list from the named resource.
     * </p>
     * 
     * @param removeTagsFromResourceRequest
     *        Represents the input of a <code>RemoveTagsFromResource</code> operation.
     * @return Result of the RemoveTagsFromResource operation returned by the service.
     * @throws CacheClusterNotFoundException
     *         The requested cache cluster ID does not refer to an existing cache cluster.
     * @throws SnapshotNotFoundException
     *         The requested snapshot name does not refer to an existing snapshot.
     * @throws InvalidARNException
     *         The requested Amazon Resource Name (ARN) does not refer to an existing resource.
     * @throws TagNotFoundException
     *         The requested tag was not found on this resource.
     * @sample AmazonElastiCache.RemoveTagsFromResource
     */
    @Override
    public RemoveTagsFromResourceResult removeTagsFromResource(RemoveTagsFromResourceRequest removeTagsFromResourceRequest) {
        ExecutionContext executionContext = createExecutionContext(removeTagsFromResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveTagsFromResourceRequest> request = null;
        Response<RemoveTagsFromResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemoveTagsFromResourceRequestMarshaller().marshall(super.beforeMarshalling(removeTagsFromResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<RemoveTagsFromResourceResult> responseHandler = new StaxResponseHandler<RemoveTagsFromResourceResult>(
                    new RemoveTagsFromResourceResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies the parameters of a cache parameter group to the engine or system default value. You can reset specific
     * parameters by submitting a list of parameter names. To reset the entire cache parameter group, specify the
     * <code>ResetAllParameters</code> and <code>CacheParameterGroupName</code> parameters.
     * </p>
     * 
     * @param resetCacheParameterGroupRequest
     *        Represents the input of a <code>ResetCacheParameterGroup</code> operation.
     * @return Result of the ResetCacheParameterGroup operation returned by the service.
     * @throws InvalidCacheParameterGroupStateException
     *         The current state of the cache parameter group does not allow the requested operation to occur.
     * @throws CacheParameterGroupNotFoundException
     *         The requested cache parameter group name does not refer to an existing cache parameter group.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.ResetCacheParameterGroup
     */
    @Override
    public ResetCacheParameterGroupResult resetCacheParameterGroup(ResetCacheParameterGroupRequest resetCacheParameterGroupRequest) {
        ExecutionContext executionContext = createExecutionContext(resetCacheParameterGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ResetCacheParameterGroupRequest> request = null;
        Response<ResetCacheParameterGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ResetCacheParameterGroupRequestMarshaller().marshall(super.beforeMarshalling(resetCacheParameterGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ResetCacheParameterGroupResult> responseHandler = new StaxResponseHandler<ResetCacheParameterGroupResult>(
                    new ResetCacheParameterGroupResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Revokes ingress from a cache security group. Use this operation to disallow access from an Amazon EC2 security
     * group that had been previously authorized.
     * </p>
     * 
     * @param revokeCacheSecurityGroupIngressRequest
     *        Represents the input of a <code>RevokeCacheSecurityGroupIngress</code> operation.
     * @return Result of the RevokeCacheSecurityGroupIngress operation returned by the service.
     * @throws CacheSecurityGroupNotFoundException
     *         The requested cache security group name does not refer to an existing cache security group.
     * @throws AuthorizationNotFoundException
     *         The specified Amazon EC2 security group is not authorized for the specified cache security group.
     * @throws InvalidCacheSecurityGroupStateException
     *         The current state of the cache security group does not allow deletion.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonElastiCache.RevokeCacheSecurityGroupIngress
     */
    @Override
    public CacheSecurityGroup revokeCacheSecurityGroupIngress(RevokeCacheSecurityGroupIngressRequest revokeCacheSecurityGroupIngressRequest) {
        ExecutionContext executionContext = createExecutionContext(revokeCacheSecurityGroupIngressRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RevokeCacheSecurityGroupIngressRequest> request = null;
        Response<CacheSecurityGroup> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RevokeCacheSecurityGroupIngressRequestMarshaller().marshall(super.beforeMarshalling(revokeCacheSecurityGroupIngressRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CacheSecurityGroup> responseHandler = new StaxResponseHandler<CacheSecurityGroup>(new CacheSecurityGroupStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns additional metadata for a previously executed successful, request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing the request.
     *
     * @param request
     *        The originally executed request
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    /**
     * Normal invoke with authentication. Credentials are required and may be overriden at the request level.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {

        executionContext.setCredentialsProvider(CredentialUtils.getCredentialsProvider(request.getOriginalRequest(), awsCredentialsProvider));

        return doInvoke(request, responseHandler, executionContext);
    }

    /**
     * Invoke with no authentication. Credentials are not required and any credentials set on the client or request will
     * be ignored for this operation.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> anonymousInvoke(Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler, ExecutionContext executionContext) {

        return doInvoke(request, responseHandler, executionContext);
    }

    /**
     * Invoke the request using the http client. Assumes credentials (or lack thereof) have been configured in the
     * ExecutionContext beforehand.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> doInvoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);

        DefaultErrorResponseHandler errorResponseHandler = new DefaultErrorResponseHandler(exceptionUnmarshallers);

        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }

    @Override
    public AmazonElastiCacheWaiters waiters() {
        if (waiters == null) {
            synchronized (this) {
                if (waiters == null) {
                    waiters = new AmazonElastiCacheWaiters(this);
                }
            }
        }
        return waiters;
    }

}
