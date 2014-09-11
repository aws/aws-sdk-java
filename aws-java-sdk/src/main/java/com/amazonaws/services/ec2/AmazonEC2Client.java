/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2;

import org.w3c.dom.*;

import java.net.*;
import java.util.*;
import java.util.Map.Entry;

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

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.services.ec2.model.transform.*;

/**
 * Client for accessing AmazonEC2.  All service calls made
 * using this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * Amazon Elastic Compute Cloud <p>
 * Amazon Elastic Compute Cloud (Amazon EC2) provides resizable computing
 * capacity in the Amazon Web Services (AWS) cloud. Using Amazon EC2
 * eliminates your need to invest in hardware up front, so you can
 * develop and deploy applications faster.
 * </p>
 */
public class AmazonEC2Client extends AmazonWebServiceClient implements AmazonEC2 {

    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all AmazonEC2 exceptions.
     */
    protected final List<Unmarshaller<AmazonServiceException, Node>> exceptionUnmarshallers
            = new ArrayList<Unmarshaller<AmazonServiceException, Node>>();

    /**
     * Constructs a new client to invoke service methods on
     * AmazonEC2.  A credentials provider chain will be used
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
    public AmazonEC2Client() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonEC2.  A credentials provider chain will be used
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
     *                       client connects to AmazonEC2
     *                       (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonEC2Client(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonEC2 using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     */
    public AmazonEC2Client(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonEC2 using the specified AWS account credentials
     * and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AmazonEC2
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AmazonEC2Client(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        init();
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonEC2 using the specified AWS account credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     */
    public AmazonEC2Client(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonEC2 using the specified AWS account credentials
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
     *                       client connects to AmazonEC2
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AmazonEC2Client(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonEC2 using the specified AWS account credentials
     * provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AmazonEC2
     *                       (ex: proxy settings, retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    public AmazonEC2Client(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
    }

    private void init() {
        
        exceptionUnmarshallers.add(new LegacyErrorUnmarshaller());
        
        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("ec2.us-east-1.amazonaws.com");
        
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/ec2/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/ec2/request.handler2s"));
    }

    /**
     * <p>
     * Requests a reboot of one or more instances. This operation is
     * asynchronous; it only queues a request to reboot the specified
     * instances. The operation succeeds if the instances are valid and
     * belong to you. Requests to reboot terminated instances are ignored.
     * </p>
     * <p>
     * If a Linux/Unix instance does not cleanly shut down within four
     * minutes, Amazon EC2 performs a hard reboot.
     * </p>
     * <p>
     * For more information about troubleshooting, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-console.html"> Getting Console Output and Rebooting Instances </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param rebootInstancesRequest Container for the necessary parameters
     *           to execute the RebootInstances service method on AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void rebootInstances(RebootInstancesRequest rebootInstancesRequest) {
        ExecutionContext executionContext = createExecutionContext(rebootInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<RebootInstancesRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new RebootInstancesRequestMarshaller().marshall(rebootInstancesRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Describes one or more of the Reserved Instances that you purchased.
     * </p>
     * <p>
     * For more information about Reserved Instances, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/concepts-on-demand-reserved-instances.html"> Reserved Instances </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param describeReservedInstancesRequest Container for the necessary
     *           parameters to execute the DescribeReservedInstances service method on
     *           AmazonEC2.
     * 
     * @return The response from the DescribeReservedInstances service
     *         method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeReservedInstancesResult describeReservedInstances(DescribeReservedInstancesRequest describeReservedInstancesRequest) {
        ExecutionContext executionContext = createExecutionContext(describeReservedInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeReservedInstancesRequest> request = null;
        Response<DescribeReservedInstancesResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeReservedInstancesRequestMarshaller().marshall(describeReservedInstancesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new DescribeReservedInstancesResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Describes one or more of the Availability Zones that are available to
     * you. The results include zones only for the region you're currently
     * using. If there is an event impacting an Availability Zone, you can
     * use this request to view the state and any provided message for that
     * Availability Zone.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html"> Regions and Availability Zones </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param describeAvailabilityZonesRequest Container for the necessary
     *           parameters to execute the DescribeAvailabilityZones service method on
     *           AmazonEC2.
     * 
     * @return The response from the DescribeAvailabilityZones service
     *         method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeAvailabilityZonesResult describeAvailabilityZones(DescribeAvailabilityZonesRequest describeAvailabilityZonesRequest) {
        ExecutionContext executionContext = createExecutionContext(describeAvailabilityZonesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAvailabilityZonesRequest> request = null;
        Response<DescribeAvailabilityZonesResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAvailabilityZonesRequestMarshaller().marshall(describeAvailabilityZonesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new DescribeAvailabilityZonesResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Detaches an Amazon EBS volume from an instance. Make sure to unmount
     * any file systems on the device within your operating system before
     * detaching the volume. Failure to do so results in the volume being
     * stuck in a busy state while detaching.
     * </p>
     * <p>
     * If an Amazon EBS volume is the root device of an instance, it can't
     * be detached while the instance is running. To detach the root volume,
     * stop the instance first.
     * </p>
     * <p>
     * If the root volume is detached from an instance with an AWS
     * Marketplace product code, then the AWS Marketplace product codes from
     * that volume are no longer associated with the instance.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-detaching-volume.html"> Detaching an Amazon EBS Volume </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param detachVolumeRequest Container for the necessary parameters to
     *           execute the DetachVolume service method on AmazonEC2.
     * 
     * @return The response from the DetachVolume service method, as returned
     *         by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DetachVolumeResult detachVolume(DetachVolumeRequest detachVolumeRequest) {
        ExecutionContext executionContext = createExecutionContext(detachVolumeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DetachVolumeRequest> request = null;
        Response<DetachVolumeResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DetachVolumeRequestMarshaller().marshall(detachVolumeRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new DetachVolumeResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Deletes the specified key pair, by removing the public key from
     * Amazon EC2.
     * </p>
     *
     * @param deleteKeyPairRequest Container for the necessary parameters to
     *           execute the DeleteKeyPair service method on AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteKeyPair(DeleteKeyPairRequest deleteKeyPairRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteKeyPairRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeleteKeyPairRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new DeleteKeyPairRequestMarshaller().marshall(deleteKeyPairRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Disables monitoring for a running instance. For more information
     * about monitoring instances, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-cloudwatch.html"> Monitoring Your Instances and Volumes </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param unmonitorInstancesRequest Container for the necessary
     *           parameters to execute the UnmonitorInstances service method on
     *           AmazonEC2.
     * 
     * @return The response from the UnmonitorInstances service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UnmonitorInstancesResult unmonitorInstances(UnmonitorInstancesRequest unmonitorInstancesRequest) {
        ExecutionContext executionContext = createExecutionContext(unmonitorInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UnmonitorInstancesRequest> request = null;
        Response<UnmonitorInstancesResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UnmonitorInstancesRequestMarshaller().marshall(unmonitorInstancesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new UnmonitorInstancesResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Attaches a virtual private gateway to a VPC. For more information,
     * see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_VPN.html"> Adding a Hardware Virtual Private Gateway to Your VPC </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param attachVpnGatewayRequest Container for the necessary parameters
     *           to execute the AttachVpnGateway service method on AmazonEC2.
     * 
     * @return The response from the AttachVpnGateway service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public AttachVpnGatewayResult attachVpnGateway(AttachVpnGatewayRequest attachVpnGatewayRequest) {
        ExecutionContext executionContext = createExecutionContext(attachVpnGatewayRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AttachVpnGatewayRequest> request = null;
        Response<AttachVpnGatewayResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AttachVpnGatewayRequestMarshaller().marshall(attachVpnGatewayRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new AttachVpnGatewayResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Creates an Amazon EBS-backed AMI from an Amazon EBS-backed instance
     * that is either running or stopped.
     * </p>
     * <p>
     * If you customized your instance with instance store volumes or EBS
     * volumes in addition to the root device volume, the new AMI contains
     * block device mapping information for those volumes. When you launch an
     * instance from this new AMI, the instance automatically launches with
     * those additional volumes.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/creating-an-ami-ebs.html"> Creating Amazon EBS-Backed Linux AMIs </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param createImageRequest Container for the necessary parameters to
     *           execute the CreateImage service method on AmazonEC2.
     * 
     * @return The response from the CreateImage service method, as returned
     *         by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateImageResult createImage(CreateImageRequest createImageRequest) {
        ExecutionContext executionContext = createExecutionContext(createImageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateImageRequest> request = null;
        Response<CreateImageResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateImageRequestMarshaller().marshall(createImageRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new CreateImageResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Deletes a security group.
     * </p>
     * <p>
     * If you attempt to delete a security group that is associated with an
     * instance, or is referenced by another security group, the operation
     * fails with <code>InvalidGroup.InUse</code> in EC2-Classic or
     * <code>DependencyViolation</code> in EC2-VPC.
     * </p>
     *
     * @param deleteSecurityGroupRequest Container for the necessary
     *           parameters to execute the DeleteSecurityGroup service method on
     *           AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteSecurityGroup(DeleteSecurityGroupRequest deleteSecurityGroupRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteSecurityGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeleteSecurityGroupRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new DeleteSecurityGroupRequestMarshaller().marshall(deleteSecurityGroupRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Exports a running or stopped instance to an Amazon S3 bucket.
     * </p>
     * <p>
     * For information about the supported operating systems, image formats,
     * and known limitations for the types of instances you can export, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ExportingEC2Instances.html"> Exporting EC2 Instances </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param createInstanceExportTaskRequest Container for the necessary
     *           parameters to execute the CreateInstanceExportTask service method on
     *           AmazonEC2.
     * 
     * @return The response from the CreateInstanceExportTask service method,
     *         as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateInstanceExportTaskResult createInstanceExportTask(CreateInstanceExportTaskRequest createInstanceExportTaskRequest) {
        ExecutionContext executionContext = createExecutionContext(createInstanceExportTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateInstanceExportTaskRequest> request = null;
        Response<CreateInstanceExportTaskResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateInstanceExportTaskRequestMarshaller().marshall(createInstanceExportTaskRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new CreateInstanceExportTaskResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Retrieves the encrypted administrator password for an instance
     * running Windows.
     * </p>
     * <p>
     * The Windows password is only generated the first time an AMI is
     * launched. It is not generated for rebundled AMIs or after the password
     * is changed on an instance.
     * </p>
     * <p>
     * The password is encrypted using the key pair that you specified when
     * you launched the instance. You must provide the corresponding key pair
     * file.
     * </p>
     * <p>
     * Password generation and encryption takes a few moments. We recommend
     * that you wait up to 15 minutes after launching an instance before
     * trying to retrieve the generated password.
     * </p>
     *
     * @param getPasswordDataRequest Container for the necessary parameters
     *           to execute the GetPasswordData service method on AmazonEC2.
     * 
     * @return The response from the GetPasswordData service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetPasswordDataResult getPasswordData(GetPasswordDataRequest getPasswordDataRequest) {
        ExecutionContext executionContext = createExecutionContext(getPasswordDataRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPasswordDataRequest> request = null;
        Response<GetPasswordDataResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPasswordDataRequestMarshaller().marshall(getPasswordDataRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new GetPasswordDataResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Associates a set of DHCP options (that you've previously created)
     * with the specified VPC, or associates no DHCP options with the VPC.
     * </p>
     * <p>
     * After you associate the options with the VPC, any existing instances
     * and all new instances that you launch in that VPC use the options. You
     * don't need to restart or relaunch the instances. They automatically
     * pick up the changes within a few hours, depending on how frequently
     * the instance renews its DHCP lease. You can explicitly renew the lease
     * using the operating system on the instance.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_DHCP_Options.html"> DHCP Options Sets </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param associateDhcpOptionsRequest Container for the necessary
     *           parameters to execute the AssociateDhcpOptions service method on
     *           AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void associateDhcpOptions(AssociateDhcpOptionsRequest associateDhcpOptionsRequest) {
        ExecutionContext executionContext = createExecutionContext(associateDhcpOptionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<AssociateDhcpOptionsRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new AssociateDhcpOptionsRequestMarshaller().marshall(associateDhcpOptionsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Adds one or more egress rules to a security group for use with a VPC.
     * Specifically, this action permits instances to send traffic to one or
     * more CIDR IP address ranges, or to one or more security groups for the
     * same VPC.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> You can have up to 50 rules per security group
     * (covering both ingress and egress rules).
     * </p>
     * <p>
     * A security group is for use with instances either in the EC2-Classic
     * platform or in a specific VPC. This action doesn't apply to security
     * groups for use in EC2-Classic. For more information, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_SecurityGroups.html"> Security Groups for Your VPC </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     * <p>
     * Each rule consists of the protocol (for example, TCP), plus either a
     * CIDR range or a source group. For the TCP and UDP protocols, you must
     * also specify the destination port or port range. For the ICMP
     * protocol, you must also specify the ICMP type and code. You can use -1
     * for the type or code to mean all types or all codes.
     * </p>
     * <p>
     * Rule changes are propagated to affected instances as quickly as
     * possible. However, a small delay might occur.
     * </p>
     *
     * @param authorizeSecurityGroupEgressRequest Container for the necessary
     *           parameters to execute the AuthorizeSecurityGroupEgress service method
     *           on AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void authorizeSecurityGroupEgress(AuthorizeSecurityGroupEgressRequest authorizeSecurityGroupEgressRequest) {
        ExecutionContext executionContext = createExecutionContext(authorizeSecurityGroupEgressRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<AuthorizeSecurityGroupEgressRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new AuthorizeSecurityGroupEgressRequestMarshaller().marshall(authorizeSecurityGroupEgressRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Stops an Amazon EBS-backed instance. Each time you transition an
     * instance from stopped to started, Amazon EC2 charges a full instance
     * hour, even if transitions happen multiple times within a single hour.
     * </p>
     * <p>
     * You can't start or stop Spot Instances.
     * </p>
     * <p>
     * Instances that use Amazon EBS volumes as their root devices can be
     * quickly stopped and started. When an instance is stopped, the compute
     * resources are released and you are not billed for hourly instance
     * usage. However, your root partition Amazon EBS volume remains,
     * continues to persist your data, and you are charged for Amazon EBS
     * volume usage. You can restart your instance at any time.
     * </p>
     * <p>
     * Before stopping an instance, make sure it is in a state from which it
     * can be restarted. Stopping an instance does not preserve data stored
     * in RAM.
     * </p>
     * <p>
     * Performing this operation on an instance that uses an instance store
     * as its root device returns an error.
     * </p>
     * <p>
     * You can stop, start, and terminate EBS-backed instances. You can only
     * terminate instance store-backed instances. What happens to an instance
     * differs if you stop it or terminate it. For example, when you stop an
     * instance, the root device and any other devices attached to the
     * instance persist. When you terminate an instance, the root device and
     * any other devices attached during the instance launch are
     * automatically deleted. For more information about the differences
     * between stopping and terminating instances, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-lifecycle.html"> Instance Lifecycle </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     * <p>
     * For more information about troubleshooting, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/TroubleshootingInstancesStopping.html"> Troubleshooting Stopping Your Instance </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param stopInstancesRequest Container for the necessary parameters to
     *           execute the StopInstances service method on AmazonEC2.
     * 
     * @return The response from the StopInstances service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public StopInstancesResult stopInstances(StopInstancesRequest stopInstancesRequest) {
        ExecutionContext executionContext = createExecutionContext(stopInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopInstancesRequest> request = null;
        Response<StopInstancesResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopInstancesRequestMarshaller().marshall(stopInstancesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new StopInstancesResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Imports the public key from an RSA key pair that you created with a
     * third-party tool. Compare this with CreateKeyPair, in which AWS
     * creates the key pair and gives the keys to you (AWS keeps a copy of
     * the public key). With ImportKeyPair, you create the key pair and give
     * AWS just the public key. The private key is never transferred between
     * you and AWS.
     * </p>
     * <p>
     * For more information about key pairs, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html"> Key Pairs </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param importKeyPairRequest Container for the necessary parameters to
     *           execute the ImportKeyPair service method on AmazonEC2.
     * 
     * @return The response from the ImportKeyPair service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ImportKeyPairResult importKeyPair(ImportKeyPairRequest importKeyPairRequest) {
        ExecutionContext executionContext = createExecutionContext(importKeyPairRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ImportKeyPairRequest> request = null;
        Response<ImportKeyPairResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ImportKeyPairRequestMarshaller().marshall(importKeyPairRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new ImportKeyPairResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Deletes the specified network interface. You must detach the network
     * interface before you can delete it.
     * </p>
     *
     * @param deleteNetworkInterfaceRequest Container for the necessary
     *           parameters to execute the DeleteNetworkInterface service method on
     *           AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteNetworkInterface(DeleteNetworkInterfaceRequest deleteNetworkInterfaceRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteNetworkInterfaceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeleteNetworkInterfaceRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new DeleteNetworkInterfaceRequestMarshaller().marshall(deleteNetworkInterfaceRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Modifies the specified attribute of the specified VPC.
     * </p>
     *
     * @param modifyVpcAttributeRequest Container for the necessary
     *           parameters to execute the ModifyVpcAttribute service method on
     *           AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void modifyVpcAttribute(ModifyVpcAttributeRequest modifyVpcAttributeRequest) {
        ExecutionContext executionContext = createExecutionContext(modifyVpcAttributeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<ModifyVpcAttributeRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new ModifyVpcAttributeRequestMarshaller().marshall(modifyVpcAttributeRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Creates a security group.
     * </p>
     * <p>
     * A security group is for use with instances either in the EC2-Classic
     * platform or in a specific VPC. For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-network-security.html"> Amazon EC2 Security Groups </a> in the <i>Amazon Elastic Compute Cloud User Guide</i> and <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_SecurityGroups.html"> Security Groups for Your VPC </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     * <p>
     * <b>IMPORTANT:</b> EC2-Classic: You can have up to 500 security
     * groups. EC2-VPC: You can create up to 100 security groups per VPC.
     * </p>
     * <p>
     * When you create a security group, you specify a friendly name of your
     * choice. You can have a security group for use in EC2-Classic with the
     * same name as a security group for use in a VPC. However, you can't
     * have two security groups for use in EC2-Classic with the same name or
     * two security groups for use in a VPC with the same name.
     * </p>
     * <p>
     * You have a default security group for use in EC2-Classic and a
     * default security group for use in your VPC. If you don't specify a
     * security group when you launch an instance, the instance is launched
     * into the appropriate default security group. A default security group
     * includes a default rule that grants instances unrestricted network
     * access to each other.
     * </p>
     * <p>
     * You can add or remove rules from your security groups using
     * AuthorizeSecurityGroupIngress, AuthorizeSecurityGroupEgress,
     * RevokeSecurityGroupIngress, and RevokeSecurityGroupEgress.
     * </p>
     *
     * @param createSecurityGroupRequest Container for the necessary
     *           parameters to execute the CreateSecurityGroup service method on
     *           AmazonEC2.
     * 
     * @return The response from the CreateSecurityGroup service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateSecurityGroupResult createSecurityGroup(CreateSecurityGroupRequest createSecurityGroupRequest) {
        ExecutionContext executionContext = createExecutionContext(createSecurityGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSecurityGroupRequest> request = null;
        Response<CreateSecurityGroupResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSecurityGroupRequestMarshaller().marshall(createSecurityGroupRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new CreateSecurityGroupResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Describes the Spot Price history. Spot Instances are instances that
     * Amazon EC2 starts on your behalf when the maximum price that you
     * specify exceeds the current Spot Price. Amazon EC2 periodically sets
     * the Spot Price based on available Spot Instance capacity and current
     * Spot Instance requests. For more information about Spot Instances, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-spot-instances.html"> Spot Instances </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     * <p>
     * When you specify an Availability Zone, this operation describes the
     * price history for the specified Availability Zone with the most recent
     * set of prices listed first. If you don't specify an Availability Zone,
     * you get the prices across all Availability Zones, starting with the
     * most recent set. However, if you're using an API version earlier than
     * 2011-05-15, you get the lowest price across the region for the
     * specified time period. The prices returned are listed in chronological
     * order, from the oldest to the most recent.
     * </p>
     *
     * @param describeSpotPriceHistoryRequest Container for the necessary
     *           parameters to execute the DescribeSpotPriceHistory service method on
     *           AmazonEC2.
     * 
     * @return The response from the DescribeSpotPriceHistory service method,
     *         as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeSpotPriceHistoryResult describeSpotPriceHistory(DescribeSpotPriceHistoryRequest describeSpotPriceHistoryRequest) {
        ExecutionContext executionContext = createExecutionContext(describeSpotPriceHistoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSpotPriceHistoryRequest> request = null;
        Response<DescribeSpotPriceHistoryResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSpotPriceHistoryRequestMarshaller().marshall(describeSpotPriceHistoryRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new DescribeSpotPriceHistoryResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Describes one or more of your network interfaces.
     * </p>
     *
     * @param describeNetworkInterfacesRequest Container for the necessary
     *           parameters to execute the DescribeNetworkInterfaces service method on
     *           AmazonEC2.
     * 
     * @return The response from the DescribeNetworkInterfaces service
     *         method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeNetworkInterfacesResult describeNetworkInterfaces(DescribeNetworkInterfacesRequest describeNetworkInterfacesRequest) {
        ExecutionContext executionContext = createExecutionContext(describeNetworkInterfacesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeNetworkInterfacesRequest> request = null;
        Response<DescribeNetworkInterfacesResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeNetworkInterfacesRequestMarshaller().marshall(describeNetworkInterfacesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new DescribeNetworkInterfacesResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Describes one or more regions that are currently available to you.
     * </p>
     * <p>
     * For a list of the regions supported by Amazon EC2, see
     * <a href="http://docs.aws.amazon.com/general/latest/gr/rande.html#ec2_region"> Regions and Endpoints </a>
     * .
     * </p>
     *
     * @param describeRegionsRequest Container for the necessary parameters
     *           to execute the DescribeRegions service method on AmazonEC2.
     * 
     * @return The response from the DescribeRegions service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeRegionsResult describeRegions(DescribeRegionsRequest describeRegionsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeRegionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeRegionsRequest> request = null;
        Response<DescribeRegionsResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeRegionsRequestMarshaller().marshall(describeRegionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new DescribeRegionsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Creates a listing for Amazon EC2 Reserved Instances to be sold in the
     * Reserved Instance Marketplace. You can submit one Reserved Instance
     * listing at a time.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ri-market-general.html"> Reserved Instance Marketplace </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param createReservedInstancesListingRequest Container for the
     *           necessary parameters to execute the CreateReservedInstancesListing
     *           service method on AmazonEC2.
     * 
     * @return The response from the CreateReservedInstancesListing service
     *         method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateReservedInstancesListingResult createReservedInstancesListing(CreateReservedInstancesListingRequest createReservedInstancesListingRequest) {
        ExecutionContext executionContext = createExecutionContext(createReservedInstancesListingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateReservedInstancesListingRequest> request = null;
        Response<CreateReservedInstancesListingResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateReservedInstancesListingRequestMarshaller().marshall(createReservedInstancesListingRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new CreateReservedInstancesListingResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Creates a set of DHCP options for your VPC. After creating the set,
     * you must associate it with the VPC, causing all existing and new
     * instances that you launch in the VPC to use this set of DHCP options.
     * The following are the individual DHCP options you can specify. For
     * more information about the options, see
     * <a href="http://www.ietf.org/rfc/rfc2132.txt"> RFC 2132 </a>
     * .
     * </p>
     * 
     * <ul>
     * <li> <code>domain-name-servers</code> - The IP addresses of up to
     * four domain name servers, or <code>AmazonProvidedDNS</code> . The
     * default DHCP option set specifies <code>AmazonProvidedDNS</code> . If
     * specifying more than one domain name server, specify the IP addresses
     * in a single parameter, separated by commas.</li>
     * <li> <code>domain-name</code> - If you're using AmazonProvidedDNS in
     * <code>us-east-1</code> , specify <code>ec2.internal</code> . If you're
     * using AmazonProvidedDNS in another region, specify
     * <code>region.compute.internal</code> (for example,
     * <code>ap-northeast-1.compute.internal</code> ). Otherwise, specify a
     * domain name (for example, <code>MyCompany.com</code> ). If specifying
     * more than one domain name, separate them with spaces.</li>
     * <li> <code>ntp-servers</code> - The IP addresses of up to four
     * Network Time Protocol (NTP) servers.</li>
     * <li> <code>netbios-name-servers</code> - The IP addresses of up to
     * four NetBIOS name servers.</li>
     * <li> <code>netbios-node-type</code> - The NetBIOS node type (1, 2, 4,
     * or 8). We recommend that you specify 2 (broadcast and multicast are
     * not currently supported). For more information about these node types,
     * see
     * <a href="http://www.ietf.org/rfc/rfc2132.txt"> RFC 2132 </a>
     * . </li>
     * 
     * </ul>
     * <p>
     * For more information about DHCP options, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_DHCP_Options.html"> DHCP Options Sets </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param createDhcpOptionsRequest Container for the necessary parameters
     *           to execute the CreateDhcpOptions service method on AmazonEC2.
     * 
     * @return The response from the CreateDhcpOptions service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateDhcpOptionsResult createDhcpOptions(CreateDhcpOptionsRequest createDhcpOptionsRequest) {
        ExecutionContext executionContext = createExecutionContext(createDhcpOptionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDhcpOptionsRequest> request = null;
        Response<CreateDhcpOptionsResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDhcpOptionsRequestMarshaller().marshall(createDhcpOptionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new CreateDhcpOptionsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Resets permission settings for the specified snapshot.
     * </p>
     * <p>
     * For more information on modifying snapshot permissions, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-modifying-snapshot-permissions.html"> Sharing Snapshots </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param resetSnapshotAttributeRequest Container for the necessary
     *           parameters to execute the ResetSnapshotAttribute service method on
     *           AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void resetSnapshotAttribute(ResetSnapshotAttributeRequest resetSnapshotAttributeRequest) {
        ExecutionContext executionContext = createExecutionContext(resetSnapshotAttributeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<ResetSnapshotAttributeRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new ResetSnapshotAttributeRequestMarshaller().marshall(resetSnapshotAttributeRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Deletes the specified route from the specified route table.
     * </p>
     *
     * @param deleteRouteRequest Container for the necessary parameters to
     *           execute the DeleteRoute service method on AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteRoute(DeleteRouteRequest deleteRouteRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteRouteRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeleteRouteRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new DeleteRouteRequestMarshaller().marshall(deleteRouteRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Describes one or more of your Internet gateways.
     * </p>
     *
     * @param describeInternetGatewaysRequest Container for the necessary
     *           parameters to execute the DescribeInternetGateways service method on
     *           AmazonEC2.
     * 
     * @return The response from the DescribeInternetGateways service method,
     *         as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeInternetGatewaysResult describeInternetGateways(DescribeInternetGatewaysRequest describeInternetGatewaysRequest) {
        ExecutionContext executionContext = createExecutionContext(describeInternetGatewaysRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeInternetGatewaysRequest> request = null;
        Response<DescribeInternetGatewaysResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeInternetGatewaysRequestMarshaller().marshall(describeInternetGatewaysRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new DescribeInternetGatewaysResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Creates an import volume task using metadata from the specified disk
     * image. After importing the image, you then upload it using the
     * ec2-import-volume command in the Amazon EC2 command-line interface
     * (CLI) tools. For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UploadingYourInstancesandVolumes.html"> Using the Command Line Tools to Import Your Virtual Machine to Amazon EC2 </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param importVolumeRequest Container for the necessary parameters to
     *           execute the ImportVolume service method on AmazonEC2.
     * 
     * @return The response from the ImportVolume service method, as returned
     *         by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ImportVolumeResult importVolume(ImportVolumeRequest importVolumeRequest) {
        ExecutionContext executionContext = createExecutionContext(importVolumeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ImportVolumeRequest> request = null;
        Response<ImportVolumeResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ImportVolumeRequestMarshaller().marshall(importVolumeRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new ImportVolumeResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Describes one or more of your security groups.
     * </p>
     * <p>
     * A security group is for use with instances either in the EC2-Classic
     * platform or in a specific VPC. For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-network-security.html"> Amazon EC2 Security Groups </a> in the <i>Amazon Elastic Compute Cloud User Guide</i> and <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_SecurityGroups.html"> Security Groups for Your VPC </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param describeSecurityGroupsRequest Container for the necessary
     *           parameters to execute the DescribeSecurityGroups service method on
     *           AmazonEC2.
     * 
     * @return The response from the DescribeSecurityGroups service method,
     *         as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeSecurityGroupsResult describeSecurityGroups(DescribeSecurityGroupsRequest describeSecurityGroupsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeSecurityGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSecurityGroupsRequest> request = null;
        Response<DescribeSecurityGroupsResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSecurityGroupsRequestMarshaller().marshall(describeSecurityGroupsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new DescribeSecurityGroupsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Rejects a VPC peering connection request. The VPC peering connection
     * must be in the <code>pending-acceptance</code> state. Use the
     * <code>DescribeVpcPeeringConnections</code> request to view your
     * outstanding VPC peering connection requests.
     * </p>
     *
     * @param rejectVpcPeeringConnectionRequest Container for the necessary
     *           parameters to execute the RejectVpcPeeringConnection service method on
     *           AmazonEC2.
     * 
     * @return The response from the RejectVpcPeeringConnection service
     *         method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public RejectVpcPeeringConnectionResult rejectVpcPeeringConnection(RejectVpcPeeringConnectionRequest rejectVpcPeeringConnectionRequest) {
        ExecutionContext executionContext = createExecutionContext(rejectVpcPeeringConnectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RejectVpcPeeringConnectionRequest> request = null;
        Response<RejectVpcPeeringConnectionResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RejectVpcPeeringConnectionRequestMarshaller().marshall(rejectVpcPeeringConnectionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new RejectVpcPeeringConnectionResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Detaches a virtual private gateway from a VPC. You do this if you're
     * planning to turn off the VPC and not use it anymore. You can confirm a
     * virtual private gateway has been completely detached from a VPC by
     * describing the virtual private gateway (any attachments to the virtual
     * private gateway are also described).
     * </p>
     * <p>
     * You must wait for the attachment's state to switch to
     * <code>detached</code> before you can delete the VPC or attach a
     * different VPC to the virtual private gateway.
     * </p>
     *
     * @param detachVpnGatewayRequest Container for the necessary parameters
     *           to execute the DetachVpnGateway service method on AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void detachVpnGateway(DetachVpnGatewayRequest detachVpnGatewayRequest) {
        ExecutionContext executionContext = createExecutionContext(detachVpnGatewayRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DetachVpnGatewayRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new DetachVpnGatewayRequestMarshaller().marshall(detachVpnGatewayRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Deregisters the specified AMI. After you deregister an AMI, it can't
     * be used to launch new instances.
     * </p>
     * <p>
     * This command does not delete the AMI.
     * </p>
     *
     * @param deregisterImageRequest Container for the necessary parameters
     *           to execute the DeregisterImage service method on AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deregisterImage(DeregisterImageRequest deregisterImageRequest) {
        ExecutionContext executionContext = createExecutionContext(deregisterImageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeregisterImageRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new DeregisterImageRequestMarshaller().marshall(deregisterImageRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Describes the datafeed for Spot Instances. For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-spot-instances.html"> Spot Instances </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param describeSpotDatafeedSubscriptionRequest Container for the
     *           necessary parameters to execute the DescribeSpotDatafeedSubscription
     *           service method on AmazonEC2.
     * 
     * @return The response from the DescribeSpotDatafeedSubscription service
     *         method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeSpotDatafeedSubscriptionResult describeSpotDatafeedSubscription(DescribeSpotDatafeedSubscriptionRequest describeSpotDatafeedSubscriptionRequest) {
        ExecutionContext executionContext = createExecutionContext(describeSpotDatafeedSubscriptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSpotDatafeedSubscriptionRequest> request = null;
        Response<DescribeSpotDatafeedSubscriptionResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSpotDatafeedSubscriptionRequestMarshaller().marshall(describeSpotDatafeedSubscriptionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new DescribeSpotDatafeedSubscriptionResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Deletes the specified set of tags from the specified set of
     * resources. This call is designed to follow a <code>DescribeTags</code>
     * request.
     * </p>
     * <p>
     * For more information about tags, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html"> Tagging Your Resources </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param deleteTagsRequest Container for the necessary parameters to
     *           execute the DeleteTags service method on AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteTags(DeleteTagsRequest deleteTagsRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeleteTagsRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new DeleteTagsRequestMarshaller().marshall(deleteTagsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Deletes the specified subnet. You must terminate all running
     * instances in the subnet before you can delete the subnet.
     * </p>
     *
     * @param deleteSubnetRequest Container for the necessary parameters to
     *           execute the DeleteSubnet service method on AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteSubnet(DeleteSubnetRequest deleteSubnetRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteSubnetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeleteSubnetRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new DeleteSubnetRequestMarshaller().marshall(deleteSubnetRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Describes the specified attribute of your AWS account.
     * </p>
     *
     * @param describeAccountAttributesRequest Container for the necessary
     *           parameters to execute the DescribeAccountAttributes service method on
     *           AmazonEC2.
     * 
     * @return The response from the DescribeAccountAttributes service
     *         method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeAccountAttributesResult describeAccountAttributes(DescribeAccountAttributesRequest describeAccountAttributesRequest) {
        ExecutionContext executionContext = createExecutionContext(describeAccountAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAccountAttributesRequest> request = null;
        Response<DescribeAccountAttributesResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAccountAttributesRequestMarshaller().marshall(describeAccountAttributesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new DescribeAccountAttributesResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Creates a virtual private gateway. A virtual private gateway is the
     * endpoint on the VPC side of your VPN connection. You can create a
     * virtual private gateway before creating the VPC itself.
     * </p>
     * <p>
     * For more information about virtual private gateways, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_VPN.html"> Adding a Hardware Virtual Private Gateway to Your VPC </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param createVpnGatewayRequest Container for the necessary parameters
     *           to execute the CreateVpnGateway service method on AmazonEC2.
     * 
     * @return The response from the CreateVpnGateway service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateVpnGatewayResult createVpnGateway(CreateVpnGatewayRequest createVpnGatewayRequest) {
        ExecutionContext executionContext = createExecutionContext(createVpnGatewayRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateVpnGatewayRequest> request = null;
        Response<CreateVpnGatewayResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateVpnGatewayRequestMarshaller().marshall(createVpnGatewayRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new CreateVpnGatewayResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Enables I/O operations for a volume that had I/O operations disabled
     * because the data on the volume was potentially inconsistent.
     * </p>
     *
     * @param enableVolumeIORequest Container for the necessary parameters to
     *           execute the EnableVolumeIO service method on AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void enableVolumeIO(EnableVolumeIORequest enableVolumeIORequest) {
        ExecutionContext executionContext = createExecutionContext(enableVolumeIORequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<EnableVolumeIORequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new EnableVolumeIORequestMarshaller().marshall(enableVolumeIORequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Deletes the specified virtual private gateway. We recommend that
     * before you delete a virtual private gateway, you detach it from the
     * VPC and delete the VPN connection. Note that you don't need to delete
     * the virtual private gateway if you plan to delete and recreate the VPN
     * connection between your VPC and your network.
     * </p>
     *
     * @param deleteVpnGatewayRequest Container for the necessary parameters
     *           to execute the DeleteVpnGateway service method on AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteVpnGateway(DeleteVpnGatewayRequest deleteVpnGatewayRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteVpnGatewayRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeleteVpnGatewayRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new DeleteVpnGatewayRequestMarshaller().marshall(deleteVpnGatewayRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Attaches an Amazon EBS volume to a running or stopped instance and
     * exposes it to the instance with the specified device name.
     * </p>
     * <p>
     * Encrypted Amazon EBS volumes may only be attached to instances that
     * support Amazon EBS encryption. For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html"> Amazon EBS Encryption </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     * <p>
     * For a list of supported device names, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-attaching-volume.html"> Attaching an Amazon EBS Volume to an Instance </a> . Any device names that aren't reserved for instance store volumes can be used for Amazon EBS volumes. For more information, see <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html"> Amazon EC2 Instance Store </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     * <p>
     * If a volume has an AWS Marketplace product code:
     * </p>
     * 
     * <ul>
     * <li>The volume can only be attached as the root device of a stopped
     * instance.</li>
     * <li>You must be subscribed to the AWS Marketplace code that is on the
     * volume.</li>
     * <li>The configuration (instance type, operating system) of the
     * instance must support that specific AWS Marketplace code. For example,
     * you cannot take a volume from a Windows instance and attach it to a
     * Linux instance.</li>
     * <li>AWS Marketplace product codes are copied from the volume to the
     * instance.</li>
     * 
     * </ul>
     * <p>
     * For an overview of the AWS Marketplace, see
     * <a href="https://aws.amazon.com/marketplace/help/200900000"> https://aws.amazon.com/marketplace/help/200900000 </a> . For more information about how to use the AWS Marketplace, see <a href="https://aws.amazon.com/marketplace"> AWS Marketplace </a>
     * .
     * </p>
     * <p>
     * For more information about Amazon EBS volumes, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-attaching-volume.html"> Attaching Amazon EBS Volumes </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param attachVolumeRequest Container for the necessary parameters to
     *           execute the AttachVolume service method on AmazonEC2.
     * 
     * @return The response from the AttachVolume service method, as returned
     *         by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public AttachVolumeResult attachVolume(AttachVolumeRequest attachVolumeRequest) {
        ExecutionContext executionContext = createExecutionContext(attachVolumeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AttachVolumeRequest> request = null;
        Response<AttachVolumeResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AttachVolumeRequestMarshaller().marshall(attachVolumeRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new AttachVolumeResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Describes the status of the specified volumes. Volume status provides
     * the result of the checks performed on your volumes to determine events
     * that can impair the performance of your volumes. The performance of a
     * volume can be affected if an issue occurs on the volume's underlying
     * host. If the volume's underlying host experiences a power outage or
     * system issue, after the system is restored, there could be data
     * inconsistencies on the volume. Volume events notify you if this
     * occurs. Volume actions notify you if any action needs to be taken in
     * response to the event.
     * </p>
     * <p>
     * The <code>DescribeVolumeStatus</code> operation provides the
     * following information about the specified volumes:
     * </p>
     * <p>
     * <i>Status</i> : Reflects the current status of the volume. The
     * possible values are <code>ok</code> , <code>impaired</code> ,
     * <code>warning</code> , or <code>insufficient-data</code> . If all
     * checks pass, the overall status of the volume is <code>ok</code> . If
     * the check fails, the overall status is <code>impaired</code> . If the
     * status is <code>insufficient-data</code> , then the checks may still
     * be taking place on your volume at the time. We recommend that you
     * retry the request. For more information on volume status, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/monitoring-volume-status.html"> Monitoring the Status of Your Volumes </a>
     * .
     * </p>
     * <p>
     * <i>Events</i> : Reflect the cause of a volume status and may require
     * you to take action. For example, if your volume returns an
     * <code>impaired</code> status, then the volume event might be
     * <code>potential-data-inconsistency</code> . This means that your
     * volume has been affected by an issue with the underlying host, has all
     * I/O operations disabled, and may have inconsistent data.
     * </p>
     * <p>
     * <i>Actions</i> : Reflect the actions you may have to take in response
     * to an event. For example, if the status of the volume is
     * <code>impaired</code> and the volume event shows
     * <code>potential-data-inconsistency</code> , then the action shows
     * <code>enable-volume-io</code> . This means that you may want to enable
     * the I/O operations for the volume by calling the EnableVolumeIO action
     * and then check the volume for data consistency.
     * </p>
     * <p>
     * <b>NOTE:</b> Volume status is based on the volume status checks, and
     * does not reflect the volume state. Therefore, volume status does not
     * indicate volumes in the error state (for example, when a volume is
     * incapable of accepting I/O.)
     * </p>
     *
     * @param describeVolumeStatusRequest Container for the necessary
     *           parameters to execute the DescribeVolumeStatus service method on
     *           AmazonEC2.
     * 
     * @return The response from the DescribeVolumeStatus service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeVolumeStatusResult describeVolumeStatus(DescribeVolumeStatusRequest describeVolumeStatusRequest) {
        ExecutionContext executionContext = createExecutionContext(describeVolumeStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeVolumeStatusRequest> request = null;
        Response<DescribeVolumeStatusResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeVolumeStatusRequestMarshaller().marshall(describeVolumeStatusRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new DescribeVolumeStatusResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Resets an attribute of an AMI to its default value.
     * </p>
     *
     * @param resetImageAttributeRequest Container for the necessary
     *           parameters to execute the ResetImageAttribute service method on
     *           AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void resetImageAttribute(ResetImageAttributeRequest resetImageAttributeRequest) {
        ExecutionContext executionContext = createExecutionContext(resetImageAttributeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<ResetImageAttributeRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new ResetImageAttributeRequestMarshaller().marshall(resetImageAttributeRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Describes one or more of your VPN connections.
     * </p>
     * <p>
     * For more information about VPN connections, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_VPN.html"> Adding a Hardware Virtual Private Gateway to Your VPC </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param describeVpnConnectionsRequest Container for the necessary
     *           parameters to execute the DescribeVpnConnections service method on
     *           AmazonEC2.
     * 
     * @return The response from the DescribeVpnConnections service method,
     *         as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeVpnConnectionsResult describeVpnConnections(DescribeVpnConnectionsRequest describeVpnConnectionsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeVpnConnectionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeVpnConnectionsRequest> request = null;
        Response<DescribeVpnConnectionsResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeVpnConnectionsRequestMarshaller().marshall(describeVpnConnectionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new DescribeVpnConnectionsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Enables a virtual private gateway (VGW) to propagate routes to the
     * routing tables of a VPC.
     * </p>
     *
     * @param enableVgwRoutePropagationRequest Container for the necessary
     *           parameters to execute the EnableVgwRoutePropagation service method on
     *           AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void enableVgwRoutePropagation(EnableVgwRoutePropagationRequest enableVgwRoutePropagationRequest) {
        ExecutionContext executionContext = createExecutionContext(enableVgwRoutePropagationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<EnableVgwRoutePropagationRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new EnableVgwRoutePropagationRequestMarshaller().marshall(enableVgwRoutePropagationRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Creates a snapshot of an Amazon EBS volume and stores it in Amazon
     * S3. You can use snapshots for backups, to make copies of Amazon EBS
     * volumes, and to save data before shutting down an instance.
     * </p>
     * <p>
     * When a snapshot is created, any AWS Marketplace product codes that
     * are associated with the source volume are propagated to the snapshot.
     * </p>
     * <p>
     * You can take a snapshot of an attached volume that is in use.
     * However, snapshots only capture data that has been written to your
     * Amazon EBS volume at the time the snapshot command is issued; this may
     * exclude any data that has been cached by any applications or the
     * operating system. If you can pause any file systems on the volume long
     * enough to take a snapshot, your snapshot should be complete. However,
     * if you cannot pause all file writes to the volume, you should unmount
     * the volume from within the instance, issue the snapshot command, and
     * then remount the volume to ensure a consistent and complete snapshot.
     * You may remount and use your volume while the snapshot status is
     * <code>pending</code> .
     * </p>
     * <p>
     * To create a snapshot for Amazon EBS volumes that serve as root
     * devices, you should stop the instance before taking the snapshot.
     * </p>
     * <p>
     * Snapshots that are taken from encrypted volumes are automatically
     * encrypted. Volumes that are created from encrypted snapshots are also
     * automatically encrypted. Your encrypted volumes and any associated
     * snapshots always remain protected.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/AmazonEBS.html"> Amazon Elastic Block Store </a> and <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html"> Amazon EBS Encryption </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param createSnapshotRequest Container for the necessary parameters to
     *           execute the CreateSnapshot service method on AmazonEC2.
     * 
     * @return The response from the CreateSnapshot service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
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
            response = invoke(request, new CreateSnapshotResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Deletes the specified Amazon EBS volume. The volume must be in the
     * <code>available</code> state (not attached to an instance).
     * </p>
     * <p>
     * <b>NOTE:</b> The volume may remain in the deleting state for several
     * minutes.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-deleting-volume.html"> Deleting an Amazon EBS Volume </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param deleteVolumeRequest Container for the necessary parameters to
     *           execute the DeleteVolume service method on AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteVolume(DeleteVolumeRequest deleteVolumeRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteVolumeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeleteVolumeRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new DeleteVolumeRequestMarshaller().marshall(deleteVolumeRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Creates a network interface in the specified subnet.
     * </p>
     * <p>
     * For more information about network interfaces, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-eni.html"> Elastic Network Interfaces </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param createNetworkInterfaceRequest Container for the necessary
     *           parameters to execute the CreateNetworkInterface service method on
     *           AmazonEC2.
     * 
     * @return The response from the CreateNetworkInterface service method,
     *         as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateNetworkInterfaceResult createNetworkInterface(CreateNetworkInterfaceRequest createNetworkInterfaceRequest) {
        ExecutionContext executionContext = createExecutionContext(createNetworkInterfaceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateNetworkInterfaceRequest> request = null;
        Response<CreateNetworkInterfaceResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateNetworkInterfaceRequestMarshaller().marshall(createNetworkInterfaceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new CreateNetworkInterfaceResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Modifies the Availability Zone, instance count, instance type, or
     * network platform (EC2-Classic or EC2-VPC) of your Reserved Instances.
     * The Reserved Instances to be modified must be identical, except for
     * Availability Zone, network platform, and instance type.
     * </p>
     *
     * @param modifyReservedInstancesRequest Container for the necessary
     *           parameters to execute the ModifyReservedInstances service method on
     *           AmazonEC2.
     * 
     * @return The response from the ModifyReservedInstances service method,
     *         as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ModifyReservedInstancesResult modifyReservedInstances(ModifyReservedInstancesRequest modifyReservedInstancesRequest) {
        ExecutionContext executionContext = createExecutionContext(modifyReservedInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyReservedInstancesRequest> request = null;
        Response<ModifyReservedInstancesResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyReservedInstancesRequestMarshaller().marshall(modifyReservedInstancesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new ModifyReservedInstancesResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Describes one or more of your VPCs.
     * </p>
     *
     * @param describeVpcsRequest Container for the necessary parameters to
     *           execute the DescribeVpcs service method on AmazonEC2.
     * 
     * @return The response from the DescribeVpcs service method, as returned
     *         by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeVpcsResult describeVpcs(DescribeVpcsRequest describeVpcsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeVpcsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeVpcsRequest> request = null;
        Response<DescribeVpcsResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeVpcsRequestMarshaller().marshall(describeVpcsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new DescribeVpcsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Unassigns one or more secondary private IP addresses from a network
     * interface.
     * </p>
     *
     * @param unassignPrivateIpAddressesRequest Container for the necessary
     *           parameters to execute the UnassignPrivateIpAddresses service method on
     *           AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void unassignPrivateIpAddresses(UnassignPrivateIpAddressesRequest unassignPrivateIpAddressesRequest) {
        ExecutionContext executionContext = createExecutionContext(unassignPrivateIpAddressesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<UnassignPrivateIpAddressesRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new UnassignPrivateIpAddressesRequestMarshaller().marshall(unassignPrivateIpAddressesRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Cancels an active conversion task. The task can be the import of an
     * instance or volume. The action removes all artifacts of the
     * conversion, including a partially uploaded volume or instance. If the
     * conversion is complete or is in the process of transferring the final
     * disk image, the command fails and returns an exception.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UploadingYourInstancesandVolumes.html"> Using the Command Line Tools to Import Your Virtual Machine to Amazon EC2 </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param cancelConversionTaskRequest Container for the necessary
     *           parameters to execute the CancelConversionTask service method on
     *           AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void cancelConversionTask(CancelConversionTaskRequest cancelConversionTaskRequest) {
        ExecutionContext executionContext = createExecutionContext(cancelConversionTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<CancelConversionTaskRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new CancelConversionTaskRequestMarshaller().marshall(cancelConversionTaskRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Associates an Elastic IP address with an instance or a network
     * interface.
     * </p>
     * <p>
     * An Elastic IP address is for use in either the EC2-Classic platform
     * or in a VPC. For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html"> Elastic IP Addresses </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     * <p>
     * [EC2-Classic, default VPC] If the Elastic IP address is already
     * associated with a different instance, it is disassociated from that
     * instance and associated with the specified instance.
     * </p>
     * <p>
     * [EC2-VPC] If you don't specify a private IP address, the Elastic IP
     * address is associated with the primary IP address. If the Elastic IP
     * address is already associated with a different instance or a network
     * interface, you get an error unless you allow reassociation.
     * </p>
     * <p>
     * This is an idempotent operation. If you perform the operation more
     * than once, Amazon EC2 doesn't return an error.
     * </p>
     *
     * @param associateAddressRequest Container for the necessary parameters
     *           to execute the AssociateAddress service method on AmazonEC2.
     * 
     * @return The response from the AssociateAddress service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public AssociateAddressResult associateAddress(AssociateAddressRequest associateAddressRequest) {
        ExecutionContext executionContext = createExecutionContext(associateAddressRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateAddressRequest> request = null;
        Response<AssociateAddressResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateAddressRequestMarshaller().marshall(associateAddressRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new AssociateAddressResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Deletes the specified customer gateway. You must delete the VPN
     * connection before you can delete the customer gateway.
     * </p>
     *
     * @param deleteCustomerGatewayRequest Container for the necessary
     *           parameters to execute the DeleteCustomerGateway service method on
     *           AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteCustomerGateway(DeleteCustomerGatewayRequest deleteCustomerGatewayRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteCustomerGatewayRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeleteCustomerGatewayRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new DeleteCustomerGatewayRequestMarshaller().marshall(deleteCustomerGatewayRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Creates an entry (a rule) in a network ACL with the specified rule
     * number. Each network ACL has a set of numbered ingress rules and a
     * separate set of numbered egress rules. When determining whether a
     * packet should be allowed in or out of a subnet associated with the
     * ACL, we process the entries in the ACL according to the rule numbers,
     * in ascending order. Each network ACL has a set of ingress rules and a
     * separate set of egress rules.
     * </p>
     * <p>
     * We recommend that you leave room between the rule numbers (for
     * example, 100, 110, 120, ...), and not number them one right after the
     * other (for example, 101, 102, 103, ...). This makes it easier to add a
     * rule between existing ones without having to renumber the rules.
     * </p>
     * <p>
     * After you add an entry, you can't modify it; you must either replace
     * it, or create an entry and delete the old one.
     * </p>
     * <p>
     * For more information about network ACLs, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_ACLs.html"> Network ACLs </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param createNetworkAclEntryRequest Container for the necessary
     *           parameters to execute the CreateNetworkAclEntry service method on
     *           AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void createNetworkAclEntry(CreateNetworkAclEntryRequest createNetworkAclEntryRequest) {
        ExecutionContext executionContext = createExecutionContext(createNetworkAclEntryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<CreateNetworkAclEntryRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new CreateNetworkAclEntryRequestMarshaller().marshall(createNetworkAclEntryRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Accept a VPC peering connection request. To accept a request, the VPC
     * peering connection must be in the <code>pending-acceptance</code>
     * state, and you must be the owner of the peer VPC. Use the
     * <code>DescribeVpcPeeringConnections</code> request to view your
     * outstanding VPC peering connection requests.
     * </p>
     *
     * @param acceptVpcPeeringConnectionRequest Container for the necessary
     *           parameters to execute the AcceptVpcPeeringConnection service method on
     *           AmazonEC2.
     * 
     * @return The response from the AcceptVpcPeeringConnection service
     *         method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public AcceptVpcPeeringConnectionResult acceptVpcPeeringConnection(AcceptVpcPeeringConnectionRequest acceptVpcPeeringConnectionRequest) {
        ExecutionContext executionContext = createExecutionContext(acceptVpcPeeringConnectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AcceptVpcPeeringConnectionRequest> request = null;
        Response<AcceptVpcPeeringConnectionResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AcceptVpcPeeringConnectionRequestMarshaller().marshall(acceptVpcPeeringConnectionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new AcceptVpcPeeringConnectionResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Describes one or more of your export tasks.
     * </p>
     *
     * @param describeExportTasksRequest Container for the necessary
     *           parameters to execute the DescribeExportTasks service method on
     *           AmazonEC2.
     * 
     * @return The response from the DescribeExportTasks service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeExportTasksResult describeExportTasks(DescribeExportTasksRequest describeExportTasksRequest) {
        ExecutionContext executionContext = createExecutionContext(describeExportTasksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeExportTasksRequest> request = null;
        Response<DescribeExportTasksResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeExportTasksRequestMarshaller().marshall(describeExportTasksRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new DescribeExportTasksResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Detaches an Internet gateway from a VPC, disabling connectivity
     * between the Internet and the VPC. The VPC must not contain any running
     * instances with Elastic IP addresses.
     * </p>
     *
     * @param detachInternetGatewayRequest Container for the necessary
     *           parameters to execute the DetachInternetGateway service method on
     *           AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void detachInternetGateway(DetachInternetGatewayRequest detachInternetGatewayRequest) {
        ExecutionContext executionContext = createExecutionContext(detachInternetGatewayRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DetachInternetGatewayRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new DetachInternetGatewayRequestMarshaller().marshall(detachInternetGatewayRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Requests a VPC peering connection between two VPCs: a requester VPC
     * that you own and a peer VPC with which to create the connection. The
     * peer VPC can belong to another AWS account. The requester VPC and peer
     * VPC cannot have overlapping CIDR blocks.
     * </p>
     * <p>
     * The owner of the peer VPC must accept the peering request to activate
     * the peering connection. The VPC peering connection request expires
     * after 7 days, after which it cannot be accepted or rejected.
     * </p>
     * <p>
     * A <code>CreateVpcPeeringConnection</code> request between VPCs with
     * overlapping CIDR blocks results in the VPC peering connection having a
     * status of <code>failed</code> .
     * </p>
     *
     * @param createVpcPeeringConnectionRequest Container for the necessary
     *           parameters to execute the CreateVpcPeeringConnection service method on
     *           AmazonEC2.
     * 
     * @return The response from the CreateVpcPeeringConnection service
     *         method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateVpcPeeringConnectionResult createVpcPeeringConnection(CreateVpcPeeringConnectionRequest createVpcPeeringConnectionRequest) {
        ExecutionContext executionContext = createExecutionContext(createVpcPeeringConnectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateVpcPeeringConnectionRequest> request = null;
        Response<CreateVpcPeeringConnectionResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateVpcPeeringConnectionRequestMarshaller().marshall(createVpcPeeringConnectionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new CreateVpcPeeringConnectionResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Creates a route table for the specified VPC. After you create a route
     * table, you can add routes and associate the table with a subnet.
     * </p>
     * <p>
     * For more information about route tables, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_Route_Tables.html"> Route Tables </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param createRouteTableRequest Container for the necessary parameters
     *           to execute the CreateRouteTable service method on AmazonEC2.
     * 
     * @return The response from the CreateRouteTable service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateRouteTableResult createRouteTable(CreateRouteTableRequest createRouteTableRequest) {
        ExecutionContext executionContext = createExecutionContext(createRouteTableRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateRouteTableRequest> request = null;
        Response<CreateRouteTableResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateRouteTableRequestMarshaller().marshall(createRouteTableRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new CreateRouteTableResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Describes the specified Amazon EBS volumes.
     * </p>
     * <p>
     * For more information about Amazon EBS volumes, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumes.html"> Amazon EBS Volumes </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param describeVolumesRequest Container for the necessary parameters
     *           to execute the DescribeVolumes service method on AmazonEC2.
     * 
     * @return The response from the DescribeVolumes service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeVolumesResult describeVolumes(DescribeVolumesRequest describeVolumesRequest) {
        ExecutionContext executionContext = createExecutionContext(describeVolumesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeVolumesRequest> request = null;
        Response<DescribeVolumesResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeVolumesRequestMarshaller().marshall(describeVolumesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new DescribeVolumesResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Describes your account's Reserved Instance listings in the Reserved
     * Instance Marketplace.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ri-market-general.html"> Reserved Instance Marketplace </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param describeReservedInstancesListingsRequest Container for the
     *           necessary parameters to execute the DescribeReservedInstancesListings
     *           service method on AmazonEC2.
     * 
     * @return The response from the DescribeReservedInstancesListings
     *         service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeReservedInstancesListingsResult describeReservedInstancesListings(DescribeReservedInstancesListingsRequest describeReservedInstancesListingsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeReservedInstancesListingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeReservedInstancesListingsRequest> request = null;
        Response<DescribeReservedInstancesListingsResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeReservedInstancesListingsRequestMarshaller().marshall(describeReservedInstancesListingsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new DescribeReservedInstancesListingsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Submits feedback about the status of an instance. The instance must
     * be in the <code>running</code> state. If your experience with the
     * instance differs from the instance status returned by
     * DescribeInstanceStatus, use ReportInstanceStatus to report your
     * experience with the instance. Amazon EC2 collects this information to
     * improve the accuracy of status checks.
     * </p>
     *
     * @param reportInstanceStatusRequest Container for the necessary
     *           parameters to execute the ReportInstanceStatus service method on
     *           AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void reportInstanceStatus(ReportInstanceStatusRequest reportInstanceStatusRequest) {
        ExecutionContext executionContext = createExecutionContext(reportInstanceStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<ReportInstanceStatusRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new ReportInstanceStatusRequestMarshaller().marshall(reportInstanceStatusRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Describes one or more of your route tables.
     * </p>
     * <p>
     * For more information about route tables, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_Route_Tables.html"> Route Tables </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param describeRouteTablesRequest Container for the necessary
     *           parameters to execute the DescribeRouteTables service method on
     *           AmazonEC2.
     * 
     * @return The response from the DescribeRouteTables service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeRouteTablesResult describeRouteTables(DescribeRouteTablesRequest describeRouteTablesRequest) {
        ExecutionContext executionContext = createExecutionContext(describeRouteTablesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeRouteTablesRequest> request = null;
        Response<DescribeRouteTablesResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeRouteTablesRequestMarshaller().marshall(describeRouteTablesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new DescribeRouteTablesResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Describes one or more of your DHCP options sets.
     * </p>
     * <p>
     * For more information about DHCP options sets, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_DHCP_Options.html"> DHCP Options Sets </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param describeDhcpOptionsRequest Container for the necessary
     *           parameters to execute the DescribeDhcpOptions service method on
     *           AmazonEC2.
     * 
     * @return The response from the DescribeDhcpOptions service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeDhcpOptionsResult describeDhcpOptions(DescribeDhcpOptionsRequest describeDhcpOptionsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeDhcpOptionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDhcpOptionsRequest> request = null;
        Response<DescribeDhcpOptionsResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDhcpOptionsRequestMarshaller().marshall(describeDhcpOptionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new DescribeDhcpOptionsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Enables monitoring for a running instance. For more information about
     * monitoring instances, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-cloudwatch.html"> Monitoring Your Instances and Volumes </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param monitorInstancesRequest Container for the necessary parameters
     *           to execute the MonitorInstances service method on AmazonEC2.
     * 
     * @return The response from the MonitorInstances service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public MonitorInstancesResult monitorInstances(MonitorInstancesRequest monitorInstancesRequest) {
        ExecutionContext executionContext = createExecutionContext(monitorInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<MonitorInstancesRequest> request = null;
        Response<MonitorInstancesResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new MonitorInstancesRequestMarshaller().marshall(monitorInstancesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new MonitorInstancesResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Describes one or more of your network ACLs.
     * </p>
     * <p>
     * For more information about network ACLs, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_ACLs.html"> Network ACLs </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param describeNetworkAclsRequest Container for the necessary
     *           parameters to execute the DescribeNetworkAcls service method on
     *           AmazonEC2.
     * 
     * @return The response from the DescribeNetworkAcls service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeNetworkAclsResult describeNetworkAcls(DescribeNetworkAclsRequest describeNetworkAclsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeNetworkAclsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeNetworkAclsRequest> request = null;
        Response<DescribeNetworkAclsResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeNetworkAclsRequestMarshaller().marshall(describeNetworkAclsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new DescribeNetworkAclsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Describes one or more of your bundling tasks.
     * </p>
     * <p>
     * <b>NOTE:</b> Completed bundle tasks are listed for only a limited
     * time. If your bundle task is no longer in the list, you can still
     * register an AMI from it. Just use RegisterImage with the Amazon S3
     * bucket name and image manifest name you provided to the bundle task.
     * </p>
     *
     * @param describeBundleTasksRequest Container for the necessary
     *           parameters to execute the DescribeBundleTasks service method on
     *           AmazonEC2.
     * 
     * @return The response from the DescribeBundleTasks service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeBundleTasksResult describeBundleTasks(DescribeBundleTasksRequest describeBundleTasksRequest) {
        ExecutionContext executionContext = createExecutionContext(describeBundleTasksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeBundleTasksRequest> request = null;
        Response<DescribeBundleTasksResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeBundleTasksRequestMarshaller().marshall(describeBundleTasksRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new DescribeBundleTasksResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Creates an import instance task using metadata from the specified
     * disk image. After importing the image, you then upload it using the
     * ec2-import-volume command in the EC2 command line tools. For more
     * information, see Using the Command Line Tools to Import Your Virtual
     * Machine to Amazon EC2 in the Amazon Elastic Compute Cloud User Guide.
     * </p>
     *
     * @param importInstanceRequest Container for the necessary parameters to
     *           execute the ImportInstance service method on AmazonEC2.
     * 
     * @return The response from the ImportInstance service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ImportInstanceResult importInstance(ImportInstanceRequest importInstanceRequest) {
        ExecutionContext executionContext = createExecutionContext(importInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ImportInstanceRequest> request = null;
        Response<ImportInstanceResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ImportInstanceRequestMarshaller().marshall(importInstanceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new ImportInstanceResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Removes one or more ingress rules from a security group. The values
     * that you specify in the revoke request (for example, ports) must match
     * the existing rule's values for the rule to be removed.
     * </p>
     * <p>
     * Each rule consists of the protocol and the CIDR range or source
     * security group. For the TCP and UDP protocols, you must also specify
     * the destination port or range of ports. For the ICMP protocol, you
     * must also specify the ICMP type and code.
     * </p>
     * <p>
     * Rule changes are propagated to instances within the security group as
     * quickly as possible. However, a small delay might occur.
     * </p>
     *
     * @param revokeSecurityGroupIngressRequest Container for the necessary
     *           parameters to execute the RevokeSecurityGroupIngress service method on
     *           AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void revokeSecurityGroupIngress(RevokeSecurityGroupIngressRequest revokeSecurityGroupIngressRequest) {
        ExecutionContext executionContext = createExecutionContext(revokeSecurityGroupIngressRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<RevokeSecurityGroupIngressRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new RevokeSecurityGroupIngressRequestMarshaller().marshall(revokeSecurityGroupIngressRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Deletes a VPC peering connection. Either the owner of the requester
     * VPC or the owner of the peer VPC can delete the VPC peering connection
     * if it's in the <code>active</code> state. The owner of the requester
     * VPC can delete a VPC peering connection in the
     * <code>pending-acceptance</code> state.
     * </p>
     *
     * @param deleteVpcPeeringConnectionRequest Container for the necessary
     *           parameters to execute the DeleteVpcPeeringConnection service method on
     *           AmazonEC2.
     * 
     * @return The response from the DeleteVpcPeeringConnection service
     *         method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteVpcPeeringConnectionResult deleteVpcPeeringConnection(DeleteVpcPeeringConnectionRequest deleteVpcPeeringConnectionRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteVpcPeeringConnectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteVpcPeeringConnectionRequest> request = null;
        Response<DeleteVpcPeeringConnectionResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteVpcPeeringConnectionRequestMarshaller().marshall(deleteVpcPeeringConnectionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new DeleteVpcPeeringConnectionResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Gets the console output for the specified instance.
     * </p>
     * <p>
     * Instances do not have a physical monitor through which you can view
     * their console output. They also lack physical controls that allow you
     * to power up, reboot, or shut them down. To allow these actions, we
     * provide them through the Amazon EC2 API and command line interface.
     * </p>
     * <p>
     * Instance console output is buffered and posted shortly after instance
     * boot, reboot, and termination. Amazon EC2 preserves the most recent 64
     * KB output which is available for at least one hour after the most
     * recent post.
     * </p>
     * <p>
     * For Linux/Unix instances, the instance console output displays the
     * exact console output that would normally be displayed on a physical
     * monitor attached to a machine. This output is buffered because the
     * instance produces it and then posts it to a store where the instance's
     * owner can retrieve it.
     * </p>
     * <p>
     * For Windows instances, the instance console output displays the last
     * three system event log errors.
     * </p>
     *
     * @param getConsoleOutputRequest Container for the necessary parameters
     *           to execute the GetConsoleOutput service method on AmazonEC2.
     * 
     * @return The response from the GetConsoleOutput service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetConsoleOutputResult getConsoleOutput(GetConsoleOutputRequest getConsoleOutputRequest) {
        ExecutionContext executionContext = createExecutionContext(getConsoleOutputRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetConsoleOutputRequest> request = null;
        Response<GetConsoleOutputResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetConsoleOutputRequestMarshaller().marshall(getConsoleOutputRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new GetConsoleOutputResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Creates an Internet gateway for use with a VPC. After creating the
     * Internet gateway, you attach it to a VPC using AttachInternetGateway.
     * </p>
     * <p>
     * For more information about your VPC and Internet gateway, see the
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/"> Amazon Virtual Private Cloud User Guide </a>
     * .
     * </p>
     *
     * @param createInternetGatewayRequest Container for the necessary
     *           parameters to execute the CreateInternetGateway service method on
     *           AmazonEC2.
     * 
     * @return The response from the CreateInternetGateway service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateInternetGatewayResult createInternetGateway(CreateInternetGatewayRequest createInternetGatewayRequest) {
        ExecutionContext executionContext = createExecutionContext(createInternetGatewayRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateInternetGatewayRequest> request = null;
        Response<CreateInternetGatewayResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateInternetGatewayRequestMarshaller().marshall(createInternetGatewayRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new CreateInternetGatewayResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Deletes the specified static route associated with a VPN connection
     * between an existing virtual private gateway and a VPN customer
     * gateway. The static route allows traffic to be routed from the virtual
     * private gateway to the VPN customer gateway.
     * </p>
     *
     * @param deleteVpnConnectionRouteRequest Container for the necessary
     *           parameters to execute the DeleteVpnConnectionRoute service method on
     *           AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteVpnConnectionRoute(DeleteVpnConnectionRouteRequest deleteVpnConnectionRouteRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteVpnConnectionRouteRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeleteVpnConnectionRouteRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new DeleteVpnConnectionRouteRequestMarshaller().marshall(deleteVpnConnectionRouteRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Detaches a network interface from an instance.
     * </p>
     *
     * @param detachNetworkInterfaceRequest Container for the necessary
     *           parameters to execute the DetachNetworkInterface service method on
     *           AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void detachNetworkInterface(DetachNetworkInterfaceRequest detachNetworkInterfaceRequest) {
        ExecutionContext executionContext = createExecutionContext(detachNetworkInterfaceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DetachNetworkInterfaceRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new DetachNetworkInterfaceRequestMarshaller().marshall(detachNetworkInterfaceRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Modifies the specified attribute of the specified AMI. You can
     * specify only one attribute at a time.
     * </p>
     * <p>
     * <b>NOTE:</b> AWS Marketplace product codes cannot be modified. Images
     * with an AWS Marketplace product code cannot be made public.
     * </p>
     *
     * @param modifyImageAttributeRequest Container for the necessary
     *           parameters to execute the ModifyImageAttribute service method on
     *           AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void modifyImageAttribute(ModifyImageAttributeRequest modifyImageAttributeRequest) {
        ExecutionContext executionContext = createExecutionContext(modifyImageAttributeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<ModifyImageAttributeRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new ModifyImageAttributeRequestMarshaller().marshall(modifyImageAttributeRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Provides information to AWS about your VPN customer gateway device.
     * The customer gateway is the appliance at your end of the VPN
     * connection. (The device on the AWS side of the VPN connection is the
     * virtual private gateway.) You must provide the Internet-routable IP
     * address of the customer gateway's external interface. The IP address
     * must be static and can't be behind a device performing network address
     * translation (NAT).
     * </p>
     * <p>
     * For devices that use Border Gateway Protocol (BGP), you can also
     * provide the device's BGP Autonomous System Number (ASN). You can use
     * an existing ASN assigned to your network. If you don't have an ASN
     * already, you can use a private ASN (in the 64512 - 65534 range).
     * </p>
     * <p>
     * <b>NOTE:</b> Amazon EC2 supports all 2-byte ASN numbers in the range
     * of 1 - 65534, with the exception of 7224, which is reserved in the
     * us-east-1 region, and 9059, which is reserved in the eu-west-1 region.
     * </p>
     * <p>
     * For more information about VPN customer gateways, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_VPN.html"> Adding a Hardware Virtual Private Gateway to Your VPC </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param createCustomerGatewayRequest Container for the necessary
     *           parameters to execute the CreateCustomerGateway service method on
     *           AmazonEC2.
     * 
     * @return The response from the CreateCustomerGateway service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateCustomerGatewayResult createCustomerGateway(CreateCustomerGatewayRequest createCustomerGatewayRequest) {
        ExecutionContext executionContext = createExecutionContext(createCustomerGatewayRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCustomerGatewayRequest> request = null;
        Response<CreateCustomerGatewayResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateCustomerGatewayRequestMarshaller().marshall(createCustomerGatewayRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new CreateCustomerGatewayResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Creates a datafeed for Spot Instances, enabling you to view Spot
     * Instance usage logs. You can create one data feed per AWS account. For
     * more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-spot-instances.html"> Spot Instances </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param createSpotDatafeedSubscriptionRequest Container for the
     *           necessary parameters to execute the CreateSpotDatafeedSubscription
     *           service method on AmazonEC2.
     * 
     * @return The response from the CreateSpotDatafeedSubscription service
     *         method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateSpotDatafeedSubscriptionResult createSpotDatafeedSubscription(CreateSpotDatafeedSubscriptionRequest createSpotDatafeedSubscriptionRequest) {
        ExecutionContext executionContext = createExecutionContext(createSpotDatafeedSubscriptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSpotDatafeedSubscriptionRequest> request = null;
        Response<CreateSpotDatafeedSubscriptionResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSpotDatafeedSubscriptionRequestMarshaller().marshall(createSpotDatafeedSubscriptionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new CreateSpotDatafeedSubscriptionResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Attaches an Internet gateway to a VPC, enabling connectivity between
     * the Internet and the VPC. For more information about your VPC and
     * Internet gateway, see the
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/"> Amazon Virtual Private Cloud User Guide </a>
     * .
     * </p>
     *
     * @param attachInternetGatewayRequest Container for the necessary
     *           parameters to execute the AttachInternetGateway service method on
     *           AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void attachInternetGateway(AttachInternetGatewayRequest attachInternetGatewayRequest) {
        ExecutionContext executionContext = createExecutionContext(attachInternetGatewayRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<AttachInternetGatewayRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new AttachInternetGatewayRequestMarshaller().marshall(attachInternetGatewayRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Deletes the specified VPN connection.
     * </p>
     * <p>
     * If you're deleting the VPC and its associated components, we
     * recommend that you detach the virtual private gateway from the VPC and
     * delete the VPC before deleting the VPN connection.
     * </p>
     *
     * @param deleteVpnConnectionRequest Container for the necessary
     *           parameters to execute the DeleteVpnConnection service method on
     *           AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteVpnConnection(DeleteVpnConnectionRequest deleteVpnConnectionRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteVpnConnectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeleteVpnConnectionRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new DeleteVpnConnectionRequestMarshaller().marshall(deleteVpnConnectionRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Describes one or more of your conversion tasks. For more information,
     * see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UploadingYourInstancesandVolumes.html"> Using the Command Line Tools to Import Your Virtual Machine to Amazon EC2 </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param describeConversionTasksRequest Container for the necessary
     *           parameters to execute the DescribeConversionTasks service method on
     *           AmazonEC2.
     * 
     * @return The response from the DescribeConversionTasks service method,
     *         as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeConversionTasksResult describeConversionTasks(DescribeConversionTasksRequest describeConversionTasksRequest) {
        ExecutionContext executionContext = createExecutionContext(describeConversionTasksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeConversionTasksRequest> request = null;
        Response<DescribeConversionTasksResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeConversionTasksRequestMarshaller().marshall(describeConversionTasksRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new DescribeConversionTasksResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Creates a VPN connection between an existing virtual private gateway
     * and a VPN customer gateway. The only supported connection type is
     * <code>ipsec.1</code> .
     * </p>
     * <p>
     * The response includes information that you need to give to your
     * network administrator to configure your customer gateway.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> We strongly recommend that you use HTTPS when
     * calling this operation because the response contains sensitive
     * cryptographic information for configuring your customer gateway.
     * </p>
     * <p>
     * If you decide to shut down your VPN connection for any reason and
     * later create a new VPN connection, you must reconfigure your customer
     * gateway with the new information returned from this call.
     * </p>
     * <p>
     * For more information about VPN connections, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_VPN.html"> Adding a Hardware Virtual Private Gateway to Your VPC </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param createVpnConnectionRequest Container for the necessary
     *           parameters to execute the CreateVpnConnection service method on
     *           AmazonEC2.
     * 
     * @return The response from the CreateVpnConnection service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateVpnConnectionResult createVpnConnection(CreateVpnConnectionRequest createVpnConnectionRequest) {
        ExecutionContext executionContext = createExecutionContext(createVpnConnectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateVpnConnectionRequest> request = null;
        Response<CreateVpnConnectionResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateVpnConnectionRequestMarshaller().marshall(createVpnConnectionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new CreateVpnConnectionResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Describes the specified attribute of the specified instance. You can
     * specify only one attribute at a time.
     * </p>
     *
     * @param describeInstanceAttributeRequest Container for the necessary
     *           parameters to execute the DescribeInstanceAttribute service method on
     *           AmazonEC2.
     * 
     * @return The response from the DescribeInstanceAttribute service
     *         method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeInstanceAttributeResult describeInstanceAttribute(DescribeInstanceAttributeRequest describeInstanceAttributeRequest) {
        ExecutionContext executionContext = createExecutionContext(describeInstanceAttributeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeInstanceAttributeRequest> request = null;
        Response<DescribeInstanceAttributeResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeInstanceAttributeRequestMarshaller().marshall(describeInstanceAttributeRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new DescribeInstanceAttributeResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Describes one or more of your VPC peering connections.
     * </p>
     *
     * @param describeVpcPeeringConnectionsRequest Container for the
     *           necessary parameters to execute the DescribeVpcPeeringConnections
     *           service method on AmazonEC2.
     * 
     * @return The response from the DescribeVpcPeeringConnections service
     *         method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeVpcPeeringConnectionsResult describeVpcPeeringConnections(DescribeVpcPeeringConnectionsRequest describeVpcPeeringConnectionsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeVpcPeeringConnectionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeVpcPeeringConnectionsRequest> request = null;
        Response<DescribeVpcPeeringConnectionsResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeVpcPeeringConnectionsRequestMarshaller().marshall(describeVpcPeeringConnectionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new DescribeVpcPeeringConnectionsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Describes one or more of your subnets.
     * </p>
     * <p>
     * For more information about subnets, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_Subnets.html"> Your VPC and Subnets </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param describeSubnetsRequest Container for the necessary parameters
     *           to execute the DescribeSubnets service method on AmazonEC2.
     * 
     * @return The response from the DescribeSubnets service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeSubnetsResult describeSubnets(DescribeSubnetsRequest describeSubnetsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeSubnetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSubnetsRequest> request = null;
        Response<DescribeSubnetsResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSubnetsRequestMarshaller().marshall(describeSubnetsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new DescribeSubnetsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Launches the specified number of instances using an AMI for which you
     * have permissions.
     * </p>
     * <p>
     * When you launch an instance, it enters the <code>pending</code>
     * state. After the instance is ready for you, it enters the
     * <code>running</code> state. To check the state of your instance, call
     * DescribeInstances.
     * </p>
     * <p>
     * If you don't specify a security group when launching an instance,
     * Amazon EC2 uses the default security group. For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-network-security.html"> Security Groups </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     * <p>
     * Linux instances have access to the public key of the key pair at
     * boot. You can use this key to provide secure access to the instance.
     * Amazon EC2 public images use this feature to provide secure access
     * without passwords. For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html"> Key Pairs </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     * <p>
     * You can provide optional user data when launching an instance. For
     * more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/AESDG-chapter-instancedata.html"> Instance Metadata </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     * <p>
     * If any of the AMIs have a product code attached for which the user
     * has not subscribed, <code>RunInstances</code> fails.
     * </p>
     * <p>
     * T2 instance types can only be launched into a VPC. If you do not have
     * a default VPC, or if you do not specify a subnet ID in the request,
     * <code>RunInstances</code> fails.
     * </p>
     * <p>
     * For more information about troubleshooting, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_InstanceStraightToTerminated.html"> What To Do If An Instance Immediately Terminates </a> , and <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/TroubleshootingInstancesConnecting.html"> Troubleshooting Connecting to Your Instance </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param runInstancesRequest Container for the necessary parameters to
     *           execute the RunInstances service method on AmazonEC2.
     * 
     * @return The response from the RunInstances service method, as returned
     *         by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public RunInstancesResult runInstances(RunInstancesRequest runInstancesRequest) {
        ExecutionContext executionContext = createExecutionContext(runInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RunInstancesRequest> request = null;
        Response<RunInstancesResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RunInstancesRequestMarshaller().marshall(runInstancesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new RunInstancesResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Describes one or more of your placement groups. For more information
     * about placement groups and cluster instances, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using_cluster_computing.html"> Cluster Instances </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param describePlacementGroupsRequest Container for the necessary
     *           parameters to execute the DescribePlacementGroups service method on
     *           AmazonEC2.
     * 
     * @return The response from the DescribePlacementGroups service method,
     *         as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribePlacementGroupsResult describePlacementGroups(DescribePlacementGroupsRequest describePlacementGroupsRequest) {
        ExecutionContext executionContext = createExecutionContext(describePlacementGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribePlacementGroupsRequest> request = null;
        Response<DescribePlacementGroupsResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribePlacementGroupsRequestMarshaller().marshall(describePlacementGroupsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new DescribePlacementGroupsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Associates a subnet with a route table. The subnet and route table
     * must be in the same VPC. This association causes traffic originating
     * from the subnet to be routed according to the routes in the route
     * table. The action returns an association ID, which you need in order
     * to disassociate the route table from the subnet later. A route table
     * can be associated with multiple subnets.
     * </p>
     * <p>
     * For more information about route tables, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_Route_Tables.html"> Route Tables </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param associateRouteTableRequest Container for the necessary
     *           parameters to execute the AssociateRouteTable service method on
     *           AmazonEC2.
     * 
     * @return The response from the AssociateRouteTable service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public AssociateRouteTableResult associateRouteTable(AssociateRouteTableRequest associateRouteTableRequest) {
        ExecutionContext executionContext = createExecutionContext(associateRouteTableRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateRouteTableRequest> request = null;
        Response<AssociateRouteTableResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateRouteTableRequestMarshaller().marshall(associateRouteTableRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new AssociateRouteTableResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Describes one or more of your instances.
     * </p>
     * <p>
     * If you specify one or more instance IDs, Amazon EC2 returns
     * information for those instances. If you do not specify instance IDs,
     * Amazon EC2 returns information for all relevant instances. If you
     * specify an instance ID that is not valid, an error is returned. If you
     * specify an instance that you do not own, it is not included in the
     * returned results.
     * </p>
     * <p>
     * Recently terminated instances might appear in the returned results.
     * This interval is usually less than one hour.
     * </p>
     *
     * @param describeInstancesRequest Container for the necessary parameters
     *           to execute the DescribeInstances service method on AmazonEC2.
     * 
     * @return The response from the DescribeInstances service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeInstancesResult describeInstances(DescribeInstancesRequest describeInstancesRequest) {
        ExecutionContext executionContext = createExecutionContext(describeInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeInstancesRequest> request = null;
        Response<DescribeInstancesResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeInstancesRequestMarshaller().marshall(describeInstancesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new DescribeInstancesResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Deletes the specified network ACL. You can't delete the ACL if it's
     * associated with any subnets. You can't delete the default network ACL.
     * </p>
     *
     * @param deleteNetworkAclRequest Container for the necessary parameters
     *           to execute the DeleteNetworkAcl service method on AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteNetworkAcl(DeleteNetworkAclRequest deleteNetworkAclRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteNetworkAclRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeleteNetworkAclRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new DeleteNetworkAclRequestMarshaller().marshall(deleteNetworkAclRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Modifies a volume attribute.
     * </p>
     * <p>
     * By default, all I/O operations for the volume are suspended when the
     * data on the volume is determined to be potentially inconsistent, to
     * prevent undetectable, latent data corruption. The I/O access to the
     * volume can be resumed by first enabling I/O access and then checking
     * the data consistency on your volume.
     * </p>
     * <p>
     * You can change the default behavior to resume I/O operations. We
     * recommend that you change this only for boot volumes or for volumes
     * that are stateless or disposable.
     * </p>
     *
     * @param modifyVolumeAttributeRequest Container for the necessary
     *           parameters to execute the ModifyVolumeAttribute service method on
     *           AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void modifyVolumeAttribute(ModifyVolumeAttributeRequest modifyVolumeAttributeRequest) {
        ExecutionContext executionContext = createExecutionContext(modifyVolumeAttributeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<ModifyVolumeAttributeRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new ModifyVolumeAttributeRequestMarshaller().marshall(modifyVolumeAttributeRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Describes one or more of the images (AMIs, AKIs, and ARIs) available
     * to you. Images available to you include public images, private images
     * that you own, and private images owned by other AWS accounts but for
     * which you have explicit launch permissions.
     * </p>
     * <p>
     * <b>NOTE:</b> Deregistered images are included in the returned results
     * for an unspecified interval after deregistration.
     * </p>
     *
     * @param describeImagesRequest Container for the necessary parameters to
     *           execute the DescribeImages service method on AmazonEC2.
     * 
     * @return The response from the DescribeImages service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeImagesResult describeImages(DescribeImagesRequest describeImagesRequest) {
        ExecutionContext executionContext = createExecutionContext(describeImagesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeImagesRequest> request = null;
        Response<DescribeImagesResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeImagesRequestMarshaller().marshall(describeImagesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new DescribeImagesResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Starts an Amazon EBS-backed AMI that you've previously stopped.
     * </p>
     * <p>
     * Instances that use Amazon EBS volumes as their root devices can be
     * quickly stopped and started. When an instance is stopped, the compute
     * resources are released and you are not billed for hourly instance
     * usage. However, your root partition Amazon EBS volume remains,
     * continues to persist your data, and you are charged for Amazon EBS
     * volume usage. You can restart your instance at any time. Each time you
     * transition an instance from stopped to started, Amazon EC2 charges a
     * full instance hour, even if transitions happen multiple times within a
     * single hour.
     * </p>
     * <p>
     * Before stopping an instance, make sure it is in a state from which it
     * can be restarted. Stopping an instance does not preserve data stored
     * in RAM.
     * </p>
     * <p>
     * Performing this operation on an instance that uses an instance store
     * as its root device returns an error.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Stop_Start.html"> Stopping Instances </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param startInstancesRequest Container for the necessary parameters to
     *           execute the StartInstances service method on AmazonEC2.
     * 
     * @return The response from the StartInstances service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public StartInstancesResult startInstances(StartInstancesRequest startInstancesRequest) {
        ExecutionContext executionContext = createExecutionContext(startInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartInstancesRequest> request = null;
        Response<StartInstancesResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartInstancesRequestMarshaller().marshall(startInstancesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new StartInstancesResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Cancels the specified Reserved Instance listing in the Reserved
     * Instance Marketplace.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ri-market-general.html"> Reserved Instance Marketplace </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param cancelReservedInstancesListingRequest Container for the
     *           necessary parameters to execute the CancelReservedInstancesListing
     *           service method on AmazonEC2.
     * 
     * @return The response from the CancelReservedInstancesListing service
     *         method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CancelReservedInstancesListingResult cancelReservedInstancesListing(CancelReservedInstancesListingRequest cancelReservedInstancesListingRequest) {
        ExecutionContext executionContext = createExecutionContext(cancelReservedInstancesListingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelReservedInstancesListingRequest> request = null;
        Response<CancelReservedInstancesListingResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelReservedInstancesListingRequestMarshaller().marshall(cancelReservedInstancesListingRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new CancelReservedInstancesListingResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Modifies the specified attribute of the specified instance. You can
     * specify only one attribute at a time.
     * </p>
     * <p>
     * To modify some attributes, the instance must be stopped. For more
     * information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_ChangingAttributesWhileInstanceStopped.html"> Modifying Attributes of a Stopped Instance </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param modifyInstanceAttributeRequest Container for the necessary
     *           parameters to execute the ModifyInstanceAttribute service method on
     *           AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void modifyInstanceAttribute(ModifyInstanceAttributeRequest modifyInstanceAttributeRequest) {
        ExecutionContext executionContext = createExecutionContext(modifyInstanceAttributeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<ModifyInstanceAttributeRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new ModifyInstanceAttributeRequestMarshaller().marshall(modifyInstanceAttributeRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Deletes the specified set of DHCP options. You must disassociate the
     * set of DHCP options before you can delete it. You can disassociate the
     * set of DHCP options by associating either a new set of options or the
     * default set of options with the VPC.
     * </p>
     *
     * @param deleteDhcpOptionsRequest Container for the necessary parameters
     *           to execute the DeleteDhcpOptions service method on AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteDhcpOptions(DeleteDhcpOptionsRequest deleteDhcpOptionsRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteDhcpOptionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeleteDhcpOptionsRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new DeleteDhcpOptionsRequestMarshaller().marshall(deleteDhcpOptionsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Adds one or more ingress rules to a security group.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> EC2-Classic: You can have up to 100 rules per
     * group. EC2-VPC: You can have up to 50 rules per group (covering both
     * ingress and egress rules).
     * </p>
     * <p>
     * Rule changes are propagated to instances within the security group as
     * quickly as possible. However, a small delay might occur.
     * </p>
     * <p>
     * [EC2-Classic] This action gives one or more CIDR IP address ranges
     * permission to access a security group in your account, or gives one or
     * more security groups (called the <i>source groups</i> ) permission to
     * access a security group for your account. A source group can be for
     * your own AWS account, or another.
     * </p>
     * <p>
     * [EC2-VPC] This action gives one or more CIDR IP address ranges
     * permission to access a security group in your VPC, or gives one or
     * more other security groups (called the <i>source groups</i> )
     * permission to access a security group for your VPC. The security
     * groups must all be for the same VPC.
     * </p>
     *
     * @param authorizeSecurityGroupIngressRequest Container for the
     *           necessary parameters to execute the AuthorizeSecurityGroupIngress
     *           service method on AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void authorizeSecurityGroupIngress(AuthorizeSecurityGroupIngressRequest authorizeSecurityGroupIngressRequest) {
        ExecutionContext executionContext = createExecutionContext(authorizeSecurityGroupIngressRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<AuthorizeSecurityGroupIngressRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new AuthorizeSecurityGroupIngressRequestMarshaller().marshall(authorizeSecurityGroupIngressRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Describes the Spot Instance requests that belong to your account.
     * Spot Instances are instances that Amazon EC2 starts on your behalf
     * when the maximum price that you specify exceeds the current Spot
     * Price. Amazon EC2 periodically sets the Spot Price based on available
     * Spot Instance capacity and current Spot Instance requests. For more
     * information about Spot Instances, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-spot-instances.html"> Spot Instances </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     * <p>
     * You can use <code>DescribeSpotInstanceRequests</code> to find a
     * running Spot Instance by examining the response. If the status of the
     * Spot Instance is <code>fulfilled</code> , the instance ID appears in
     * the response and contains the identifier of the instance.
     * Alternatively, you can use DescribeInstances with a filter to look for
     * instances where the instance lifecycle is <code>spot</code> .
     * </p>
     *
     * @param describeSpotInstanceRequestsRequest Container for the necessary
     *           parameters to execute the DescribeSpotInstanceRequests service method
     *           on AmazonEC2.
     * 
     * @return The response from the DescribeSpotInstanceRequests service
     *         method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeSpotInstanceRequestsResult describeSpotInstanceRequests(DescribeSpotInstanceRequestsRequest describeSpotInstanceRequestsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeSpotInstanceRequestsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSpotInstanceRequestsRequest> request = null;
        Response<DescribeSpotInstanceRequestsResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSpotInstanceRequestsRequestMarshaller().marshall(describeSpotInstanceRequestsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new DescribeSpotInstanceRequestsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Creates a VPC with the specified CIDR block.
     * </p>
     * <p>
     * The smallest VPC you can create uses a /28 netmask (16 IP addresses),
     * and the largest uses a /16 netmask (65,536 IP addresses). To help you
     * decide how big to make your VPC, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_Subnets.html"> Your VPC and Subnets </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     * <p>
     * By default, each instance you launch in the VPC has the default DHCP
     * options, which includes only a default DNS server that we provide
     * (AmazonProvidedDNS). For more information about DHCP options, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_DHCP_Options.html"> DHCP Options Sets </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param createVpcRequest Container for the necessary parameters to
     *           execute the CreateVpc service method on AmazonEC2.
     * 
     * @return The response from the CreateVpc service method, as returned by
     *         AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateVpcResult createVpc(CreateVpcRequest createVpcRequest) {
        ExecutionContext executionContext = createExecutionContext(createVpcRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateVpcRequest> request = null;
        Response<CreateVpcResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateVpcRequestMarshaller().marshall(createVpcRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new CreateVpcResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Describes one or more of your VPN customer gateways.
     * </p>
     * <p>
     * For more information about VPN customer gateways, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_VPN.html"> Adding a Hardware Virtual Private Gateway to Your VPC </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param describeCustomerGatewaysRequest Container for the necessary
     *           parameters to execute the DescribeCustomerGateways service method on
     *           AmazonEC2.
     * 
     * @return The response from the DescribeCustomerGateways service method,
     *         as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeCustomerGatewaysResult describeCustomerGateways(DescribeCustomerGatewaysRequest describeCustomerGatewaysRequest) {
        ExecutionContext executionContext = createExecutionContext(describeCustomerGatewaysRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCustomerGatewaysRequest> request = null;
        Response<DescribeCustomerGatewaysResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCustomerGatewaysRequestMarshaller().marshall(describeCustomerGatewaysRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new DescribeCustomerGatewaysResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Cancels an active export task. The request removes all artifacts of
     * the export, including any partially-created Amazon S3 objects. If the
     * export task is complete or is in the process of transferring the final
     * disk image, the command fails and returns an error.
     * </p>
     *
     * @param cancelExportTaskRequest Container for the necessary parameters
     *           to execute the CancelExportTask service method on AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void cancelExportTask(CancelExportTaskRequest cancelExportTaskRequest) {
        ExecutionContext executionContext = createExecutionContext(cancelExportTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<CancelExportTaskRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new CancelExportTaskRequestMarshaller().marshall(cancelExportTaskRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Creates a route in a route table within a VPC.
     * </p>
     * <p>
     * You must specify one of the following targets: Internet gateway, NAT
     * instance, VPC peering connection, or network interface.
     * </p>
     * <p>
     * When determining how to route traffic, we use the route with the most
     * specific match. For example, let's say the traffic is destined for
     * <code>192.0.2.3</code> , and the route table includes the following
     * two routes:
     * </p>
     * 
     * <ul>
     * <li> <p>
     * <code>192.0.2.0/24</code> (goes to some target A)
     * </p>
     * </li>
     * <li> <p>
     * <code>192.0.2.0/28</code> (goes to some target B)
     * </p>
     * </li>
     * 
     * </ul>
     * <p>
     * Both routes apply to the traffic destined for <code>192.0.2.3</code>
     * . However, the second route in the list covers a smaller number of IP
     * addresses and is therefore more specific, so we use that route to
     * determine where to target the traffic.
     * </p>
     * <p>
     * For more information about route tables, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_Route_Tables.html"> Route Tables </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param createRouteRequest Container for the necessary parameters to
     *           execute the CreateRoute service method on AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void createRoute(CreateRouteRequest createRouteRequest) {
        ExecutionContext executionContext = createExecutionContext(createRouteRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<CreateRouteRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new CreateRouteRequestMarshaller().marshall(createRouteRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Initiates the copy of an AMI from the specified source region to the
     * region in which the request was made. You specify the destination
     * region by using its endpoint when making the request. AMIs that use
     * encrypted Amazon EBS snapshots cannot be copied with this method.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/CopyingAMIs.html"> Copying AMIs </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param copyImageRequest Container for the necessary parameters to
     *           execute the CopyImage service method on AmazonEC2.
     * 
     * @return The response from the CopyImage service method, as returned by
     *         AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CopyImageResult copyImage(CopyImageRequest copyImageRequest) {
        ExecutionContext executionContext = createExecutionContext(copyImageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CopyImageRequest> request = null;
        Response<CopyImageResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CopyImageRequestMarshaller().marshall(copyImageRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new CopyImageResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Modifies the specified network interface attribute. You can specify
     * only one attribute at a time.
     * </p>
     *
     * @param modifyNetworkInterfaceAttributeRequest Container for the
     *           necessary parameters to execute the ModifyNetworkInterfaceAttribute
     *           service method on AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void modifyNetworkInterfaceAttribute(ModifyNetworkInterfaceAttributeRequest modifyNetworkInterfaceAttributeRequest) {
        ExecutionContext executionContext = createExecutionContext(modifyNetworkInterfaceAttributeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<ModifyNetworkInterfaceAttributeRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new ModifyNetworkInterfaceAttributeRequestMarshaller().marshall(modifyNetworkInterfaceAttributeRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Deletes the specified route table. You must disassociate the route
     * table from any subnets before you can delete it. You can't delete the
     * main route table.
     * </p>
     *
     * @param deleteRouteTableRequest Container for the necessary parameters
     *           to execute the DeleteRouteTable service method on AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteRouteTable(DeleteRouteTableRequest deleteRouteTableRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteRouteTableRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeleteRouteTableRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new DeleteRouteTableRequestMarshaller().marshall(deleteRouteTableRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Describes a network interface attribute. You can specify only one
     * attribute at a time.
     * </p>
     *
     * @param describeNetworkInterfaceAttributeRequest Container for the
     *           necessary parameters to execute the DescribeNetworkInterfaceAttribute
     *           service method on AmazonEC2.
     * 
     * @return The response from the DescribeNetworkInterfaceAttribute
     *         service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeNetworkInterfaceAttributeResult describeNetworkInterfaceAttribute(DescribeNetworkInterfaceAttributeRequest describeNetworkInterfaceAttributeRequest) {
        ExecutionContext executionContext = createExecutionContext(describeNetworkInterfaceAttributeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeNetworkInterfaceAttributeRequest> request = null;
        Response<DescribeNetworkInterfaceAttributeResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeNetworkInterfaceAttributeRequestMarshaller().marshall(describeNetworkInterfaceAttributeRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new DescribeNetworkInterfaceAttributeResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Creates a Spot Instance request. Spot Instances are instances that
     * Amazon EC2 starts on your behalf when the maximum price that you
     * specify exceeds the current Spot Price. Amazon EC2 periodically sets
     * the Spot Price based on available Spot Instance capacity and current
     * Spot Instance requests. For more information about Spot Instances, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-spot-instances.html"> Spot Instances </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param requestSpotInstancesRequest Container for the necessary
     *           parameters to execute the RequestSpotInstances service method on
     *           AmazonEC2.
     * 
     * @return The response from the RequestSpotInstances service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public RequestSpotInstancesResult requestSpotInstances(RequestSpotInstancesRequest requestSpotInstancesRequest) {
        ExecutionContext executionContext = createExecutionContext(requestSpotInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RequestSpotInstancesRequest> request = null;
        Response<RequestSpotInstancesResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RequestSpotInstancesRequestMarshaller().marshall(requestSpotInstancesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new RequestSpotInstancesResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Adds or overwrites one or more tags for the specified EC2 resource or
     * resources. Each resource can have a maximum of 10 tags. Each tag
     * consists of a key and optional value. Tag keys must be unique per
     * resource.
     * </p>
     * <p>
     * For more information about tags, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html"> Tagging Your Resources </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param createTagsRequest Container for the necessary parameters to
     *           execute the CreateTags service method on AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void createTags(CreateTagsRequest createTagsRequest) {
        ExecutionContext executionContext = createExecutionContext(createTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<CreateTagsRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new CreateTagsRequestMarshaller().marshall(createTagsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Describes the specified attribute of the specified volume. You can
     * specify only one attribute at a time.
     * </p>
     * <p>
     * For more information about Amazon EBS volumes, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumes.html"> Amazon EBS Volumes </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param describeVolumeAttributeRequest Container for the necessary
     *           parameters to execute the DescribeVolumeAttribute service method on
     *           AmazonEC2.
     * 
     * @return The response from the DescribeVolumeAttribute service method,
     *         as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeVolumeAttributeResult describeVolumeAttribute(DescribeVolumeAttributeRequest describeVolumeAttributeRequest) {
        ExecutionContext executionContext = createExecutionContext(describeVolumeAttributeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeVolumeAttributeRequest> request = null;
        Response<DescribeVolumeAttributeResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeVolumeAttributeRequestMarshaller().marshall(describeVolumeAttributeRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new DescribeVolumeAttributeResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Attaches a network interface to an instance.
     * </p>
     *
     * @param attachNetworkInterfaceRequest Container for the necessary
     *           parameters to execute the AttachNetworkInterface service method on
     *           AmazonEC2.
     * 
     * @return The response from the AttachNetworkInterface service method,
     *         as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public AttachNetworkInterfaceResult attachNetworkInterface(AttachNetworkInterfaceRequest attachNetworkInterfaceRequest) {
        ExecutionContext executionContext = createExecutionContext(attachNetworkInterfaceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AttachNetworkInterfaceRequest> request = null;
        Response<AttachNetworkInterfaceResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AttachNetworkInterfaceRequestMarshaller().marshall(attachNetworkInterfaceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new AttachNetworkInterfaceResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Replaces an existing route within a route table in a VPC. You must
     * provide only one of the following: Internet gateway, NAT instance, VPC
     * peering connection, or network interface.
     * </p>
     * <p>
     * For more information about route tables, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_Route_Tables.html"> Route Tables </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param replaceRouteRequest Container for the necessary parameters to
     *           execute the ReplaceRoute service method on AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void replaceRoute(ReplaceRouteRequest replaceRouteRequest) {
        ExecutionContext executionContext = createExecutionContext(replaceRouteRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<ReplaceRouteRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new ReplaceRouteRequestMarshaller().marshall(replaceRouteRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Describes one or more of the tags for your EC2 resources.
     * </p>
     * <p>
     * For more information about tags, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html"> Tagging Your Resources </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param describeTagsRequest Container for the necessary parameters to
     *           execute the DescribeTags service method on AmazonEC2.
     * 
     * @return The response from the DescribeTags service method, as returned
     *         by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeTagsResult describeTags(DescribeTagsRequest describeTagsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTagsRequest> request = null;
        Response<DescribeTagsResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTagsRequestMarshaller().marshall(describeTagsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new DescribeTagsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Cancels a bundling operation for an instance store-backed Windows
     * instance.
     * </p>
     *
     * @param cancelBundleTaskRequest Container for the necessary parameters
     *           to execute the CancelBundleTask service method on AmazonEC2.
     * 
     * @return The response from the CancelBundleTask service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CancelBundleTaskResult cancelBundleTask(CancelBundleTaskRequest cancelBundleTaskRequest) {
        ExecutionContext executionContext = createExecutionContext(cancelBundleTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelBundleTaskRequest> request = null;
        Response<CancelBundleTaskResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelBundleTaskRequestMarshaller().marshall(cancelBundleTaskRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new CancelBundleTaskResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Disables a virtual private gateway (VGW) from propagating routes to
     * the routing tables of a VPC.
     * </p>
     *
     * @param disableVgwRoutePropagationRequest Container for the necessary
     *           parameters to execute the DisableVgwRoutePropagation service method on
     *           AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void disableVgwRoutePropagation(DisableVgwRoutePropagationRequest disableVgwRoutePropagationRequest) {
        ExecutionContext executionContext = createExecutionContext(disableVgwRoutePropagationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DisableVgwRoutePropagationRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new DisableVgwRoutePropagationRequestMarshaller().marshall(disableVgwRoutePropagationRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Cancels one or more Spot Instance requests. Spot Instances are
     * instances that Amazon EC2 starts on your behalf when the maximum price
     * that you specify exceeds the current Spot Price. Amazon EC2
     * periodically sets the Spot Price based on available Spot Instance
     * capacity and current Spot Instance requests. For more information
     * about Spot Instances, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-spot-instances.html"> Spot Instances </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     * <p>
     * <b>IMPORTANT:</b> Canceling a Spot Instance request does not
     * terminate running Spot Instances associated with the request.
     * </p>
     *
     * @param cancelSpotInstanceRequestsRequest Container for the necessary
     *           parameters to execute the CancelSpotInstanceRequests service method on
     *           AmazonEC2.
     * 
     * @return The response from the CancelSpotInstanceRequests service
     *         method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CancelSpotInstanceRequestsResult cancelSpotInstanceRequests(CancelSpotInstanceRequestsRequest cancelSpotInstanceRequestsRequest) {
        ExecutionContext executionContext = createExecutionContext(cancelSpotInstanceRequestsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelSpotInstanceRequestsRequest> request = null;
        Response<CancelSpotInstanceRequestsResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelSpotInstanceRequestsRequestMarshaller().marshall(cancelSpotInstanceRequestsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new CancelSpotInstanceRequestsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Purchases a Reserved Instance for use with your account. With Amazon
     * EC2 Reserved Instances, you obtain a capacity reservation for a
     * certain instance configuration over a specified period of time. You
     * pay a lower usage rate than with On-Demand instances for the time that
     * you actually use the capacity reservation.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ri-market-general.html"> Reserved Instance Marketplace </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param purchaseReservedInstancesOfferingRequest Container for the
     *           necessary parameters to execute the PurchaseReservedInstancesOffering
     *           service method on AmazonEC2.
     * 
     * @return The response from the PurchaseReservedInstancesOffering
     *         service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public PurchaseReservedInstancesOfferingResult purchaseReservedInstancesOffering(PurchaseReservedInstancesOfferingRequest purchaseReservedInstancesOfferingRequest) {
        ExecutionContext executionContext = createExecutionContext(purchaseReservedInstancesOfferingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PurchaseReservedInstancesOfferingRequest> request = null;
        Response<PurchaseReservedInstancesOfferingResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PurchaseReservedInstancesOfferingRequestMarshaller().marshall(purchaseReservedInstancesOfferingRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new PurchaseReservedInstancesOfferingResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Adds or removes permission settings for the specified snapshot. You
     * may add or remove specified AWS account IDs from a snapshot's list of
     * create volume permissions, but you cannot do both in a single API
     * call. If you need to both add and remove account IDs for a snapshot,
     * you must use multiple API calls.
     * </p>
     * <p>
     * For more information on modifying snapshot permissions, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-modifying-snapshot-permissions.html"> Sharing Snapshots </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     * <p>
     * <b>NOTE:</b> Snapshots with AWS Marketplace product codes cannot be
     * made public.
     * </p>
     *
     * @param modifySnapshotAttributeRequest Container for the necessary
     *           parameters to execute the ModifySnapshotAttribute service method on
     *           AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void modifySnapshotAttribute(ModifySnapshotAttributeRequest modifySnapshotAttributeRequest) {
        ExecutionContext executionContext = createExecutionContext(modifySnapshotAttributeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<ModifySnapshotAttributeRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new ModifySnapshotAttributeRequestMarshaller().marshall(modifySnapshotAttributeRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Describes the modifications made to your Reserved Instances. If no
     * parameter is specified, information about all your Reserved Instances
     * modification requests is returned. If a modification ID is specified,
     * only information about the specific modification is returned.
     * </p>
     *
     * @param describeReservedInstancesModificationsRequest Container for the
     *           necessary parameters to execute the
     *           DescribeReservedInstancesModifications service method on AmazonEC2.
     * 
     * @return The response from the DescribeReservedInstancesModifications
     *         service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeReservedInstancesModificationsResult describeReservedInstancesModifications(DescribeReservedInstancesModificationsRequest describeReservedInstancesModificationsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeReservedInstancesModificationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeReservedInstancesModificationsRequest> request = null;
        Response<DescribeReservedInstancesModificationsResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeReservedInstancesModificationsRequestMarshaller().marshall(describeReservedInstancesModificationsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new DescribeReservedInstancesModificationsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Shuts down one or more instances. This operation is idempotent; if
     * you terminate an instance more than once, each call succeeds.
     * </p>
     * <p>
     * Terminated instances remain visible after termination (for
     * approximately one hour).
     * </p>
     * <p>
     * By default, Amazon EC2 deletes all Amazon EBS volumes that were
     * attached when the instance launched. Volumes attached after instance
     * launch continue running.
     * </p>
     * <p>
     * You can stop, start, and terminate EBS-backed instances. You can only
     * terminate instance store-backed instances. What happens to an instance
     * differs if you stop it or terminate it. For example, when you stop an
     * instance, the root device and any other devices attached to the
     * instance persist. When you terminate an instance, the root device and
     * any other devices attached during the instance launch are
     * automatically deleted. For more information about the differences
     * between stopping and terminating instances, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-lifecycle.html"> Instance Lifecycle </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     * <p>
     * For more information about troubleshooting, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/TroubleshootingInstancesShuttingDown.html"> Troubleshooting Terminating Your Instance </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param terminateInstancesRequest Container for the necessary
     *           parameters to execute the TerminateInstances service method on
     *           AmazonEC2.
     * 
     * @return The response from the TerminateInstances service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public TerminateInstancesResult terminateInstances(TerminateInstancesRequest terminateInstancesRequest) {
        ExecutionContext executionContext = createExecutionContext(terminateInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TerminateInstancesRequest> request = null;
        Response<TerminateInstancesResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TerminateInstancesRequestMarshaller().marshall(terminateInstancesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new TerminateInstancesResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Deletes the datafeed for Spot Instances. For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-spot-instances.html"> Spot Instances </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param deleteSpotDatafeedSubscriptionRequest Container for the
     *           necessary parameters to execute the DeleteSpotDatafeedSubscription
     *           service method on AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteSpotDatafeedSubscription(DeleteSpotDatafeedSubscriptionRequest deleteSpotDatafeedSubscriptionRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteSpotDatafeedSubscriptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeleteSpotDatafeedSubscriptionRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new DeleteSpotDatafeedSubscriptionRequestMarshaller().marshall(deleteSpotDatafeedSubscriptionRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Deletes the specified Internet gateway. You must detach the Internet
     * gateway from the VPC before you can delete it.
     * </p>
     *
     * @param deleteInternetGatewayRequest Container for the necessary
     *           parameters to execute the DeleteInternetGateway service method on
     *           AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteInternetGateway(DeleteInternetGatewayRequest deleteInternetGatewayRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteInternetGatewayRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeleteInternetGatewayRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new DeleteInternetGatewayRequestMarshaller().marshall(deleteInternetGatewayRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Describes the specified attribute of the specified snapshot. You can
     * specify only one attribute at a time.
     * </p>
     * <p>
     * For more information about Amazon EBS snapshots, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSSnapshots.html"> Amazon EBS Snapshots </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param describeSnapshotAttributeRequest Container for the necessary
     *           parameters to execute the DescribeSnapshotAttribute service method on
     *           AmazonEC2.
     * 
     * @return The response from the DescribeSnapshotAttribute service
     *         method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeSnapshotAttributeResult describeSnapshotAttribute(DescribeSnapshotAttributeRequest describeSnapshotAttributeRequest) {
        ExecutionContext executionContext = createExecutionContext(describeSnapshotAttributeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSnapshotAttributeRequest> request = null;
        Response<DescribeSnapshotAttributeResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSnapshotAttributeRequestMarshaller().marshall(describeSnapshotAttributeRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new DescribeSnapshotAttributeResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Changes the route table associated with a given subnet in a VPC.
     * After the operation completes, the subnet uses the routes in the new
     * route table it's associated with. For more information about route
     * tables, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_Route_Tables.html"> Route Tables </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     * <p>
     * You can also use ReplaceRouteTableAssociation to change which table
     * is the main route table in the VPC. You just specify the main route
     * table's association ID and the route table to be the new main route
     * table.
     * </p>
     *
     * @param replaceRouteTableAssociationRequest Container for the necessary
     *           parameters to execute the ReplaceRouteTableAssociation service method
     *           on AmazonEC2.
     * 
     * @return The response from the ReplaceRouteTableAssociation service
     *         method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ReplaceRouteTableAssociationResult replaceRouteTableAssociation(ReplaceRouteTableAssociationRequest replaceRouteTableAssociationRequest) {
        ExecutionContext executionContext = createExecutionContext(replaceRouteTableAssociationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ReplaceRouteTableAssociationRequest> request = null;
        Response<ReplaceRouteTableAssociationResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ReplaceRouteTableAssociationRequestMarshaller().marshall(replaceRouteTableAssociationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new ReplaceRouteTableAssociationResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Describes one or more of your Elastic IP addresses.
     * </p>
     * <p>
     * An Elastic IP address is for use in either the EC2-Classic platform
     * or in a VPC. For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html"> Elastic IP Addresses </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param describeAddressesRequest Container for the necessary parameters
     *           to execute the DescribeAddresses service method on AmazonEC2.
     * 
     * @return The response from the DescribeAddresses service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeAddressesResult describeAddresses(DescribeAddressesRequest describeAddressesRequest) {
        ExecutionContext executionContext = createExecutionContext(describeAddressesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAddressesRequest> request = null;
        Response<DescribeAddressesResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAddressesRequestMarshaller().marshall(describeAddressesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new DescribeAddressesResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Describes the specified attribute of the specified AMI. You can
     * specify only one attribute at a time.
     * </p>
     *
     * @param describeImageAttributeRequest Container for the necessary
     *           parameters to execute the DescribeImageAttribute service method on
     *           AmazonEC2.
     * 
     * @return The response from the DescribeImageAttribute service method,
     *         as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeImageAttributeResult describeImageAttribute(DescribeImageAttributeRequest describeImageAttributeRequest) {
        ExecutionContext executionContext = createExecutionContext(describeImageAttributeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeImageAttributeRequest> request = null;
        Response<DescribeImageAttributeResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeImageAttributeRequestMarshaller().marshall(describeImageAttributeRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new DescribeImageAttributeResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Describes one or more of your key pairs.
     * </p>
     * <p>
     * For more information about key pairs, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html"> Key Pairs </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param describeKeyPairsRequest Container for the necessary parameters
     *           to execute the DescribeKeyPairs service method on AmazonEC2.
     * 
     * @return The response from the DescribeKeyPairs service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeKeyPairsResult describeKeyPairs(DescribeKeyPairsRequest describeKeyPairsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeKeyPairsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeKeyPairsRequest> request = null;
        Response<DescribeKeyPairsResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeKeyPairsRequestMarshaller().marshall(describeKeyPairsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new DescribeKeyPairsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Determines whether a product code is associated with an instance.
     * This action can only be used by the owner of the product code. It is
     * useful when a product code owner needs to verify whether another
     * user's instance is eligible for support.
     * </p>
     *
     * @param confirmProductInstanceRequest Container for the necessary
     *           parameters to execute the ConfirmProductInstance service method on
     *           AmazonEC2.
     * 
     * @return The response from the ConfirmProductInstance service method,
     *         as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ConfirmProductInstanceResult confirmProductInstance(ConfirmProductInstanceRequest confirmProductInstanceRequest) {
        ExecutionContext executionContext = createExecutionContext(confirmProductInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ConfirmProductInstanceRequest> request = null;
        Response<ConfirmProductInstanceResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ConfirmProductInstanceRequestMarshaller().marshall(confirmProductInstanceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new ConfirmProductInstanceResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Disassociates a subnet from a route table.
     * </p>
     * <p>
     * After you perform this action, the subnet no longer uses the routes
     * in the route table. Instead, it uses the routes in the VPC's main
     * route table. For more information about route tables, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_Route_Tables.html"> Route Tables </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param disassociateRouteTableRequest Container for the necessary
     *           parameters to execute the DisassociateRouteTable service method on
     *           AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void disassociateRouteTable(DisassociateRouteTableRequest disassociateRouteTableRequest) {
        ExecutionContext executionContext = createExecutionContext(disassociateRouteTableRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DisassociateRouteTableRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new DisassociateRouteTableRequestMarshaller().marshall(disassociateRouteTableRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Describes the specified attribute of the specified VPC. You can
     * specify only one attribute at a time.
     * </p>
     *
     * @param describeVpcAttributeRequest Container for the necessary
     *           parameters to execute the DescribeVpcAttribute service method on
     *           AmazonEC2.
     * 
     * @return The response from the DescribeVpcAttribute service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeVpcAttributeResult describeVpcAttribute(DescribeVpcAttributeRequest describeVpcAttributeRequest) {
        ExecutionContext executionContext = createExecutionContext(describeVpcAttributeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeVpcAttributeRequest> request = null;
        Response<DescribeVpcAttributeResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeVpcAttributeRequestMarshaller().marshall(describeVpcAttributeRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new DescribeVpcAttributeResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Removes one or more egress rules from a security group for EC2-VPC.
     * The values that you specify in the revoke request (for example, ports)
     * must match the existing rule's values for the rule to be revoked.
     * </p>
     * <p>
     * Each rule consists of the protocol and the CIDR range or source
     * security group. For the TCP and UDP protocols, you must also specify
     * the destination port or range of ports. For the ICMP protocol, you
     * must also specify the ICMP type and code.
     * </p>
     * <p>
     * Rule changes are propagated to instances within the security group as
     * quickly as possible. However, a small delay might occur.
     * </p>
     *
     * @param revokeSecurityGroupEgressRequest Container for the necessary
     *           parameters to execute the RevokeSecurityGroupEgress service method on
     *           AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void revokeSecurityGroupEgress(RevokeSecurityGroupEgressRequest revokeSecurityGroupEgressRequest) {
        ExecutionContext executionContext = createExecutionContext(revokeSecurityGroupEgressRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<RevokeSecurityGroupEgressRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new RevokeSecurityGroupEgressRequestMarshaller().marshall(revokeSecurityGroupEgressRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Deletes the specified ingress or egress entry (rule) from the
     * specified network ACL.
     * </p>
     *
     * @param deleteNetworkAclEntryRequest Container for the necessary
     *           parameters to execute the DeleteNetworkAclEntry service method on
     *           AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteNetworkAclEntry(DeleteNetworkAclEntryRequest deleteNetworkAclEntryRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteNetworkAclEntryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeleteNetworkAclEntryRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new DeleteNetworkAclEntryRequestMarshaller().marshall(deleteNetworkAclEntryRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Creates an Amazon EBS volume that can be attached to an instance in
     * the same Availability Zone. The volume is created in the specified
     * region.
     * </p>
     * <p>
     * You can create a new empty volume or restore a volume from an Amazon
     * EBS snapshot. Any AWS Marketplace product codes from the snapshot are
     * propagated to the volume.
     * </p>
     * <p>
     * You can create encrypted volumes with the <code>Encrypted</code>
     * parameter. Encrypted volumes may only be attached to instances that
     * support Amazon EBS encryption. Volumes that are created from encrypted
     * snapshots are also automatically encrypted. For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html"> Amazon EBS Encryption </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-creating-volume.html"> Creating or Restoring an Amazon EBS Volume </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param createVolumeRequest Container for the necessary parameters to
     *           execute the CreateVolume service method on AmazonEC2.
     * 
     * @return The response from the CreateVolume service method, as returned
     *         by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateVolumeResult createVolume(CreateVolumeRequest createVolumeRequest) {
        ExecutionContext executionContext = createExecutionContext(createVolumeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateVolumeRequest> request = null;
        Response<CreateVolumeResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateVolumeRequestMarshaller().marshall(createVolumeRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new CreateVolumeResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Describes the status of one or more instances, including any
     * scheduled events.
     * </p>
     * <p>
     * Instance status has two main components:
     * </p>
     * 
     * <ul>
     * <li> <p>
     * System Status reports impaired functionality that stems from issues
     * related to the systems that support an instance, such as such as
     * hardware failures and network connectivity problems. This call reports
     * such problems as impaired reachability.
     * </p>
     * </li>
     * <li> <p>
     * Instance Status reports impaired functionality that arises from
     * problems internal to the instance. This call reports such problems as
     * impaired reachability.
     * </p>
     * </li>
     * 
     * </ul>
     * <p>
     * Instance status provides information about four types of scheduled
     * events for an instance that may require your attention:
     * </p>
     * 
     * <ul>
     * <li> <p>
     * Scheduled Reboot: When Amazon EC2 determines that an instance must be
     * rebooted, the instances status returns one of two event codes:
     * <code>system-reboot</code> or <code>instance-reboot</code> . System
     * reboot commonly occurs if certain maintenance or upgrade operations
     * require a reboot of the underlying host that supports an instance.
     * Instance reboot commonly occurs if the instance must be rebooted,
     * rather than the underlying host. Rebooting events include a scheduled
     * start and end time.
     * </p>
     * </li>
     * <li> <p>
     * System Maintenance: When Amazon EC2 determines that an instance
     * requires maintenance that requires power or network impact, the
     * instance status is the event code <code>system-maintenance</code> .
     * System maintenance is either power maintenance or network maintenance.
     * For power maintenance, your instance will be unavailable for a brief
     * period of time and then rebooted. For network maintenance, your
     * instance will experience a brief loss of network connectivity. System
     * maintenance events include a scheduled start and end time. You will
     * also be notified by email if one of your instances is set for system
     * maintenance. The email message indicates when your instance is
     * scheduled for maintenance.
     * </p>
     * </li>
     * <li> <p>
     * Scheduled Retirement: When Amazon EC2 determines that an instance
     * must be shut down, the instance status is the event code
     * <code>instance-retirement</code> . Retirement commonly occurs when the
     * underlying host is degraded and must be replaced. Retirement events
     * include a scheduled start and end time. You will also be notified by
     * email if one of your instances is set to retiring. The email message
     * indicates when your instance will be permanently retired.
     * </p>
     * </li>
     * <li> <p>
     * Scheduled Stop: When Amazon EC2 determines that an instance must be
     * shut down, the instances status returns an event code called
     * <code>instance-stop</code> . Stop events include a scheduled start and
     * end time. You will also be notified by email if one of your instances
     * is set to stop. The email message indicates when your instance will be
     * stopped.
     * </p>
     * </li>
     * 
     * </ul>
     * <p>
     * When your instance is retired, it will either be terminated (if its
     * root device type is the instance-store) or stopped (if its root device
     * type is an EBS volume). Instances stopped due to retirement will not
     * be restarted, but you can do so manually. You can also avoid
     * retirement of EBS-backed instances by manually restarting your
     * instance when its event code is <code>instance-retirement</code> .
     * This ensures that your instance is started on a different underlying
     * host.
     * </p>
     * <p>
     * For more information about failed status checks, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/TroubleshootingInstances.html"> Troubleshooting Instances with Failed Status Checks </a> in the <i>Amazon Elastic Compute Cloud User Guide</i> . For more information about working with scheduled events, see <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/monitoring-instances-status-check_sched.html#schedevents_actions"> Working with an Instance That Has a Scheduled Event </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param describeInstanceStatusRequest Container for the necessary
     *           parameters to execute the DescribeInstanceStatus service method on
     *           AmazonEC2.
     * 
     * @return The response from the DescribeInstanceStatus service method,
     *         as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeInstanceStatusResult describeInstanceStatus(DescribeInstanceStatusRequest describeInstanceStatusRequest) {
        ExecutionContext executionContext = createExecutionContext(describeInstanceStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeInstanceStatusRequest> request = null;
        Response<DescribeInstanceStatusResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeInstanceStatusRequestMarshaller().marshall(describeInstanceStatusRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new DescribeInstanceStatusResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Describes one or more of your virtual private gateways.
     * </p>
     * <p>
     * For more information about virtual private gateways, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_VPN.html"> Adding an IPsec Hardware VPN to Your VPC </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param describeVpnGatewaysRequest Container for the necessary
     *           parameters to execute the DescribeVpnGateways service method on
     *           AmazonEC2.
     * 
     * @return The response from the DescribeVpnGateways service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeVpnGatewaysResult describeVpnGateways(DescribeVpnGatewaysRequest describeVpnGatewaysRequest) {
        ExecutionContext executionContext = createExecutionContext(describeVpnGatewaysRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeVpnGatewaysRequest> request = null;
        Response<DescribeVpnGatewaysResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeVpnGatewaysRequestMarshaller().marshall(describeVpnGatewaysRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new DescribeVpnGatewaysResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Creates a subnet in an existing VPC.
     * </p>
     * <p>
     * When you create each subnet, you provide the VPC ID and the CIDR
     * block you want for the subnet. After you create a subnet, you can't
     * change its CIDR block. The subnet's CIDR block can be the same as the
     * VPC's CIDR block (assuming you want only a single subnet in the VPC),
     * or a subset of the VPC's CIDR block. If you create more than one
     * subnet in a VPC, the subnets' CIDR blocks must not overlap. The
     * smallest subnet (and VPC) you can create uses a /28 netmask (16 IP
     * addresses), and the largest uses a /16 netmask (65,536 IP addresses).
     * </p>
     * <p>
     * <b>IMPORTANT:</b> AWS reserves both the first four and the last IP
     * address in each subnet's CIDR block. They're not available for use.
     * </p>
     * <p>
     * If you add more than one subnet to a VPC, they're set up in a star
     * topology with a logical router in the middle.
     * </p>
     * <p>
     * For more information about subnets, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_Subnets.html"> Your VPC and Subnets </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param createSubnetRequest Container for the necessary parameters to
     *           execute the CreateSubnet service method on AmazonEC2.
     * 
     * @return The response from the CreateSubnet service method, as returned
     *         by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateSubnetResult createSubnet(CreateSubnetRequest createSubnetRequest) {
        ExecutionContext executionContext = createExecutionContext(createSubnetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSubnetRequest> request = null;
        Response<CreateSubnetResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSubnetRequestMarshaller().marshall(createSubnetRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new CreateSubnetResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Describes Reserved Instance offerings that are available for
     * purchase. With Reserved Instances, you purchase the right to launch
     * instances for a period of time. During that time period, you do not
     * receive insufficient capacity errors, and you pay a lower usage rate
     * than the rate charged for On-Demand instances for the actual time
     * used.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ri-market-general.html"> Reserved Instance Marketplace </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param describeReservedInstancesOfferingsRequest Container for the
     *           necessary parameters to execute the DescribeReservedInstancesOfferings
     *           service method on AmazonEC2.
     * 
     * @return The response from the DescribeReservedInstancesOfferings
     *         service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeReservedInstancesOfferingsResult describeReservedInstancesOfferings(DescribeReservedInstancesOfferingsRequest describeReservedInstancesOfferingsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeReservedInstancesOfferingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeReservedInstancesOfferingsRequest> request = null;
        Response<DescribeReservedInstancesOfferingsResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeReservedInstancesOfferingsRequestMarshaller().marshall(describeReservedInstancesOfferingsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new DescribeReservedInstancesOfferingsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Assigns one or more secondary private IP addresses to the specified
     * network interface. You can specify one or more specific secondary IP
     * addresses, or you can specify the number of secondary IP addresses to
     * be automatically assigned within the subnet's CIDR block range. The
     * number of secondary IP addresses that you can assign to an instance
     * varies by instance type. For information about instance types, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html"> Instance Types </a> in the <i>Amazon Elastic Compute Cloud User Guide</i> . For more information about Elastic IP addresses, see <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html"> Elastic IP Addresses </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     * <p>
     * AssignPrivateIpAddresses is available only in EC2-VPC.
     * </p>
     *
     * @param assignPrivateIpAddressesRequest Container for the necessary
     *           parameters to execute the AssignPrivateIpAddresses service method on
     *           AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void assignPrivateIpAddresses(AssignPrivateIpAddressesRequest assignPrivateIpAddressesRequest) {
        ExecutionContext executionContext = createExecutionContext(assignPrivateIpAddressesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<AssignPrivateIpAddressesRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new AssignPrivateIpAddressesRequestMarshaller().marshall(assignPrivateIpAddressesRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Deletes the specified snapshot.
     * </p>
     * <p>
     * When you make periodic snapshots of a volume, the snapshots are
     * incremental, and only the blocks on the device that have changed since
     * your last snapshot are saved in the new snapshot. When you delete a
     * snapshot, only the data not needed for any other snapshot is removed.
     * So regardless of which prior snapshots have been deleted, all active
     * snapshots will have access to all the information needed to restore
     * the volume.
     * </p>
     * <p>
     * You cannot delete a snapshot of the root device of an Amazon EBS
     * volume used by a registered AMI. You must first de-register the AMI
     * before you can delete the snapshot.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-deleting-snapshot.html"> Deleting an Amazon EBS Snapshot </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param deleteSnapshotRequest Container for the necessary parameters to
     *           execute the DeleteSnapshot service method on AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteSnapshot(DeleteSnapshotRequest deleteSnapshotRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeleteSnapshotRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new DeleteSnapshotRequestMarshaller().marshall(deleteSnapshotRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Changes which network ACL a subnet is associated with. By default
     * when you create a subnet, it's automatically associated with the
     * default network ACL. For more information about network ACLs, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_ACLs.html"> Network ACLs </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param replaceNetworkAclAssociationRequest Container for the necessary
     *           parameters to execute the ReplaceNetworkAclAssociation service method
     *           on AmazonEC2.
     * 
     * @return The response from the ReplaceNetworkAclAssociation service
     *         method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ReplaceNetworkAclAssociationResult replaceNetworkAclAssociation(ReplaceNetworkAclAssociationRequest replaceNetworkAclAssociationRequest) {
        ExecutionContext executionContext = createExecutionContext(replaceNetworkAclAssociationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ReplaceNetworkAclAssociationRequest> request = null;
        Response<ReplaceNetworkAclAssociationResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ReplaceNetworkAclAssociationRequestMarshaller().marshall(replaceNetworkAclAssociationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new ReplaceNetworkAclAssociationResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Disassociates an Elastic IP address from the instance or network
     * interface it's associated with.
     * </p>
     * <p>
     * This is an idempotent operation. If you perform the operation more
     * than once, Amazon EC2 doesn't return an error.
     * </p>
     *
     * @param disassociateAddressRequest Container for the necessary
     *           parameters to execute the DisassociateAddress service method on
     *           AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void disassociateAddress(DisassociateAddressRequest disassociateAddressRequest) {
        ExecutionContext executionContext = createExecutionContext(disassociateAddressRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DisassociateAddressRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new DisassociateAddressRequestMarshaller().marshall(disassociateAddressRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Creates a placement group that you launch cluster instances into. You
     * must give the group a name that's unique within the scope of your
     * account.
     * </p>
     * <p>
     * For more information about placement groups and cluster instances,
     * see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using_cluster_computing.html"> Cluster Instances </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param createPlacementGroupRequest Container for the necessary
     *           parameters to execute the CreatePlacementGroup service method on
     *           AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void createPlacementGroup(CreatePlacementGroupRequest createPlacementGroupRequest) {
        ExecutionContext executionContext = createExecutionContext(createPlacementGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<CreatePlacementGroupRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new CreatePlacementGroupRequestMarshaller().marshall(createPlacementGroupRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Bundles an Amazon instance store-backed Windows instance.
     * </p>
     * <p>
     * During bundling, only the root device volume (C:\) is bundled. Data
     * on other instance store volumes is not preserved.
     * </p>
     * <p>
     * <b>NOTE:</b> This procedure is not applicable for Linux/Unix
     * instances or Windows instances that are backed by Amazon EBS.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/Creating_InstanceStoreBacked_WinAMI.html"> Creating an Instance Store-Backed Windows AMI </a>
     * .
     * </p>
     *
     * @param bundleInstanceRequest Container for the necessary parameters to
     *           execute the BundleInstance service method on AmazonEC2.
     * 
     * @return The response from the BundleInstance service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public BundleInstanceResult bundleInstance(BundleInstanceRequest bundleInstanceRequest) {
        ExecutionContext executionContext = createExecutionContext(bundleInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BundleInstanceRequest> request = null;
        Response<BundleInstanceResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BundleInstanceRequestMarshaller().marshall(bundleInstanceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new BundleInstanceResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Deletes the specified placement group. You must terminate all
     * instances in the placement group before you can delete the placement
     * group. For more information about placement groups and cluster
     * instances, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using_cluster_computing.html"> Cluster Instances </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param deletePlacementGroupRequest Container for the necessary
     *           parameters to execute the DeletePlacementGroup service method on
     *           AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deletePlacementGroup(DeletePlacementGroupRequest deletePlacementGroupRequest) {
        ExecutionContext executionContext = createExecutionContext(deletePlacementGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeletePlacementGroupRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new DeletePlacementGroupRequestMarshaller().marshall(deletePlacementGroupRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Modifies a subnet attribute.
     * </p>
     *
     * @param modifySubnetAttributeRequest Container for the necessary
     *           parameters to execute the ModifySubnetAttribute service method on
     *           AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void modifySubnetAttribute(ModifySubnetAttributeRequest modifySubnetAttributeRequest) {
        ExecutionContext executionContext = createExecutionContext(modifySubnetAttributeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<ModifySubnetAttributeRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new ModifySubnetAttributeRequestMarshaller().marshall(modifySubnetAttributeRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Deletes the specified VPC. You must detach or delete all gateways and
     * resources that are associated with the VPC before you can delete it.
     * For example, you must terminate all instances running in the VPC,
     * delete all security groups associated with the VPC (except the default
     * one), delete all route tables associated with the VPC (except the
     * default one), and so on.
     * </p>
     *
     * @param deleteVpcRequest Container for the necessary parameters to
     *           execute the DeleteVpc service method on AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteVpc(DeleteVpcRequest deleteVpcRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteVpcRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeleteVpcRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new DeleteVpcRequestMarshaller().marshall(deleteVpcRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Copies a point-in-time snapshot of an Amazon EBS volume and stores it
     * in Amazon S3. You can copy the snapshot within the same region or from
     * one region to another. You can use the snapshot to create Amazon EBS
     * volumes or Amazon Machine Images (AMIs). The snapshot is copied to the
     * regional endpoint that you send the HTTP request to.
     * </p>
     * <p>
     * Copies of encrypted Amazon EBS snapshots remain encrypted. Copies of
     * unencrypted snapshots remain unencrypted.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-copy-snapshot.html"> Copying an Amazon EBS Snapshot </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param copySnapshotRequest Container for the necessary parameters to
     *           execute the CopySnapshot service method on AmazonEC2.
     * 
     * @return The response from the CopySnapshot service method, as returned
     *         by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CopySnapshotResult copySnapshot(CopySnapshotRequest copySnapshotRequest) {
        ExecutionContext executionContext = createExecutionContext(copySnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CopySnapshotRequest> request = null;
        Response<CopySnapshotResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CopySnapshotRequestMarshaller().marshall(copySnapshotRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new CopySnapshotResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Acquires an Elastic IP address.
     * </p>
     * <p>
     * An Elastic IP address is for use either in the EC2-Classic platform
     * or in a VPC. For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html"> Elastic IP Addresses </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param allocateAddressRequest Container for the necessary parameters
     *           to execute the AllocateAddress service method on AmazonEC2.
     * 
     * @return The response from the AllocateAddress service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public AllocateAddressResult allocateAddress(AllocateAddressRequest allocateAddressRequest) {
        ExecutionContext executionContext = createExecutionContext(allocateAddressRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AllocateAddressRequest> request = null;
        Response<AllocateAddressResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AllocateAddressRequestMarshaller().marshall(allocateAddressRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new AllocateAddressResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Releases the specified Elastic IP address.
     * </p>
     * <p>
     * After releasing an Elastic IP address, it is released to the IP
     * address pool and might be unavailable to you. Be sure to update your
     * DNS records and any servers or devices that communicate with the
     * address. If you attempt to release an Elastic IP address that you
     * already released, you'll get an <code>AuthFailure</code> error if the
     * address is already allocated to another AWS account.
     * </p>
     * <p>
     * [EC2-Classic, default VPC] Releasing an Elastic IP address
     * automatically disassociates it from any instance that it's associated
     * with. To disassociate an Elastic IP address without releasing it, use
     * DisassociateAddress.
     * </p>
     * <p>
     * [Nondefault VPC] You must use the DisassociateAddress to disassociate
     * the Elastic IP address before you try to release it. Otherwise, Amazon
     * EC2 returns an error ( <code>InvalidIPAddress.InUse</code> ).
     * </p>
     *
     * @param releaseAddressRequest Container for the necessary parameters to
     *           execute the ReleaseAddress service method on AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void releaseAddress(ReleaseAddressRequest releaseAddressRequest) {
        ExecutionContext executionContext = createExecutionContext(releaseAddressRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<ReleaseAddressRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new ReleaseAddressRequestMarshaller().marshall(releaseAddressRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Resets an attribute of an instance to its default value. To reset the
     * kernel or RAM disk, the instance must be in a stopped state. To reset
     * the <code>SourceDestCheck</code> , the instance can be either running
     * or stopped.
     * </p>
     * <p>
     * The <code>SourceDestCheck</code> attribute controls whether
     * source/destination checking is enabled. The default value is
     * <code>true</code> , which means checking is enabled. This value must
     * be <code>false</code> for a NAT instance to perform NAT. For more
     * information, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_NAT_Instance.html"> NAT Instances </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param resetInstanceAttributeRequest Container for the necessary
     *           parameters to execute the ResetInstanceAttribute service method on
     *           AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void resetInstanceAttribute(ResetInstanceAttributeRequest resetInstanceAttributeRequest) {
        ExecutionContext executionContext = createExecutionContext(resetInstanceAttributeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<ResetInstanceAttributeRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new ResetInstanceAttributeRequestMarshaller().marshall(resetInstanceAttributeRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Creates a 2048-bit RSA key pair with the specified name. Amazon EC2
     * stores the public key and displays the private key for you to save to
     * a file. The private key is returned as an unencrypted PEM encoded
     * PKCS#8 private key. If a key with the specified name already exists,
     * Amazon EC2 returns an error.
     * </p>
     * <p>
     * You can have up to five thousand key pairs per region.
     * </p>
     * <p>
     * For more information about key pairs, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html"> Key Pairs </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param createKeyPairRequest Container for the necessary parameters to
     *           execute the CreateKeyPair service method on AmazonEC2.
     * 
     * @return The response from the CreateKeyPair service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateKeyPairResult createKeyPair(CreateKeyPairRequest createKeyPairRequest) {
        ExecutionContext executionContext = createExecutionContext(createKeyPairRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateKeyPairRequest> request = null;
        Response<CreateKeyPairResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateKeyPairRequestMarshaller().marshall(createKeyPairRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new CreateKeyPairResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Replaces an entry (rule) in a network ACL. For more information about
     * network ACLs, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_ACLs.html"> Network ACLs </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param replaceNetworkAclEntryRequest Container for the necessary
     *           parameters to execute the ReplaceNetworkAclEntry service method on
     *           AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void replaceNetworkAclEntry(ReplaceNetworkAclEntryRequest replaceNetworkAclEntryRequest) {
        ExecutionContext executionContext = createExecutionContext(replaceNetworkAclEntryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<ReplaceNetworkAclEntryRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new ReplaceNetworkAclEntryRequestMarshaller().marshall(replaceNetworkAclEntryRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Describes one or more of the Amazon EBS snapshots available to you.
     * Available snapshots include public snapshots available for any AWS
     * account to launch, private snapshots that you own, and private
     * snapshots owned by another AWS account but for which you've been given
     * explicit create volume permissions.
     * </p>
     * <p>
     * The create volume permissions fall into the following categories:
     * </p>
     * 
     * <ul>
     * <li> <i>public</i> : The owner of the snapshot granted create volume
     * permissions for the snapshot to the <code>all</code> group. All AWS
     * accounts have create volume permissions for these snapshots.</li>
     * <li> <i>explicit</i> : The owner of the snapshot granted create
     * volume permissions to a specific AWS account.</li>
     * <li> <i>implicit</i> : An AWS account has implicit create volume
     * permissions for all snapshots it owns.</li>
     * 
     * </ul>
     * <p>
     * The list of snapshots returned can be modified by specifying snapshot
     * IDs, snapshot owners, or AWS accounts with create volume permissions.
     * If no options are specified, Amazon EC2 returns all snapshots for
     * which you have create volume permissions.
     * </p>
     * <p>
     * If you specify one or more snapshot IDs, only snapshots that have the
     * specified IDs are returned. If you specify an invalid snapshot ID, an
     * error is returned. If you specify a snapshot ID for which you do not
     * have access, it is not included in the returned results.
     * </p>
     * <p>
     * If you specify one or more snapshot owners, only snapshots from the
     * specified owners and for which you have access are returned. The
     * results can include the AWS account IDs of the specified owners,
     * <code>amazon</code> for snapshots owned by Amazon, or
     * <code>self</code> for snapshots that you own.
     * </p>
     * <p>
     * If you specify a list of restorable users, only snapshots with create
     * snapshot permissions for those users are returned. You can specify AWS
     * account IDs (if you own the snapshots), <code>self</code> for
     * snapshots for which you own or have explicit permissions, or
     * <code>all</code> for public snapshots.
     * </p>
     * <p>
     * For more information about Amazon EBS snapshots, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSSnapshots.html"> Amazon EBS Snapshots </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param describeSnapshotsRequest Container for the necessary parameters
     *           to execute the DescribeSnapshots service method on AmazonEC2.
     * 
     * @return The response from the DescribeSnapshots service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeSnapshotsResult describeSnapshots(DescribeSnapshotsRequest describeSnapshotsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeSnapshotsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSnapshotsRequest> request = null;
        Response<DescribeSnapshotsResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSnapshotsRequestMarshaller().marshall(describeSnapshotsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new DescribeSnapshotsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Creates a network ACL in a VPC. Network ACLs provide an optional
     * layer of security (in addition to security groups) for the instances
     * in your VPC.
     * </p>
     * <p>
     * For more information about network ACLs, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_ACLs.html"> Network ACLs </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param createNetworkAclRequest Container for the necessary parameters
     *           to execute the CreateNetworkAcl service method on AmazonEC2.
     * 
     * @return The response from the CreateNetworkAcl service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateNetworkAclResult createNetworkAcl(CreateNetworkAclRequest createNetworkAclRequest) {
        ExecutionContext executionContext = createExecutionContext(createNetworkAclRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateNetworkAclRequest> request = null;
        Response<CreateNetworkAclResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateNetworkAclRequestMarshaller().marshall(createNetworkAclRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new CreateNetworkAclResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Registers an AMI. When you're creating an AMI, this is the final step
     * you must complete before you can launch an instance from the AMI. For
     * more information about creating AMIs, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/creating-an-ami.html"> Creating Your Own AMIs </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     * <p>
     * <b>NOTE:</b> For Amazon EBS-backed instances, CreateImage creates and
     * registers the AMI in a single request, so you don't have to register
     * the AMI yourself.
     * </p>
     * <p>
     * You can also use <code>RegisterImage</code> to create an Amazon
     * EBS-backed AMI from a snapshot of a root device volume. For more
     * information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_LaunchingInstanceFromSnapshot.html"> Launching an Instance from a Snapshot </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     * <p>
     * If needed, you can deregister an AMI at any time. Any modifications
     * you make to an AMI backed by an instance store volume invalidates its
     * registration. If you make changes to an image, deregister the previous
     * image and register the new image.
     * </p>
     * <p>
     * <b>NOTE:</b> You can't register an image where a secondary (non-root)
     * snapshot has AWS Marketplace product codes.
     * </p>
     *
     * @param registerImageRequest Container for the necessary parameters to
     *           execute the RegisterImage service method on AmazonEC2.
     * 
     * @return The response from the RegisterImage service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public RegisterImageResult registerImage(RegisterImageRequest registerImageRequest) {
        ExecutionContext executionContext = createExecutionContext(registerImageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterImageRequest> request = null;
        Response<RegisterImageResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterImageRequestMarshaller().marshall(registerImageRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            response = invoke(request, new RegisterImageResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Resets a network interface attribute. You can specify only one
     * attribute at a time.
     * </p>
     *
     * @param resetNetworkInterfaceAttributeRequest Container for the
     *           necessary parameters to execute the ResetNetworkInterfaceAttribute
     *           service method on AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void resetNetworkInterfaceAttribute(ResetNetworkInterfaceAttributeRequest resetNetworkInterfaceAttributeRequest) {
        ExecutionContext executionContext = createExecutionContext(resetNetworkInterfaceAttributeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<ResetNetworkInterfaceAttributeRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new ResetNetworkInterfaceAttributeRequestMarshaller().marshall(resetNetworkInterfaceAttributeRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Creates a static route associated with a VPN connection between an
     * existing virtual private gateway and a VPN customer gateway. The
     * static route allows traffic to be routed from the virtual private
     * gateway to the VPN customer gateway.
     * </p>
     * <p>
     * For more information about VPN connections, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_VPN.html"> Adding a Hardware Virtual Private Gateway to Your VPC </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param createVpnConnectionRouteRequest Container for the necessary
     *           parameters to execute the CreateVpnConnectionRoute service method on
     *           AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void createVpnConnectionRoute(CreateVpnConnectionRouteRequest createVpnConnectionRouteRequest) {
        ExecutionContext executionContext = createExecutionContext(createVpnConnectionRouteRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<CreateVpnConnectionRouteRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new CreateVpnConnectionRouteRequestMarshaller().marshall(createVpnConnectionRouteRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Describes one or more of the Reserved Instances that you purchased.
     * </p>
     * <p>
     * For more information about Reserved Instances, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/concepts-on-demand-reserved-instances.html"> Reserved Instances </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     * 
     * @return The response from the DescribeReservedInstances service
     *         method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeReservedInstancesResult describeReservedInstances() throws AmazonServiceException, AmazonClientException {
        return describeReservedInstances(new DescribeReservedInstancesRequest());
    }
    
    /**
     * <p>
     * Describes one or more of the Availability Zones that are available to
     * you. The results include zones only for the region you're currently
     * using. If there is an event impacting an Availability Zone, you can
     * use this request to view the state and any provided message for that
     * Availability Zone.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html"> Regions and Availability Zones </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     * 
     * @return The response from the DescribeAvailabilityZones service
     *         method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeAvailabilityZonesResult describeAvailabilityZones() throws AmazonServiceException, AmazonClientException {
        return describeAvailabilityZones(new DescribeAvailabilityZonesRequest());
    }
    
    /**
     * <p>
     * Describes the Spot Price history. Spot Instances are instances that
     * Amazon EC2 starts on your behalf when the maximum price that you
     * specify exceeds the current Spot Price. Amazon EC2 periodically sets
     * the Spot Price based on available Spot Instance capacity and current
     * Spot Instance requests. For more information about Spot Instances, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-spot-instances.html"> Spot Instances </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     * <p>
     * When you specify an Availability Zone, this operation describes the
     * price history for the specified Availability Zone with the most recent
     * set of prices listed first. If you don't specify an Availability Zone,
     * you get the prices across all Availability Zones, starting with the
     * most recent set. However, if you're using an API version earlier than
     * 2011-05-15, you get the lowest price across the region for the
     * specified time period. The prices returned are listed in chronological
     * order, from the oldest to the most recent.
     * </p>
     * 
     * @return The response from the DescribeSpotPriceHistory service method,
     *         as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeSpotPriceHistoryResult describeSpotPriceHistory() throws AmazonServiceException, AmazonClientException {
        return describeSpotPriceHistory(new DescribeSpotPriceHistoryRequest());
    }
    
    /**
     * <p>
     * Describes one or more of your network interfaces.
     * </p>
     * 
     * @return The response from the DescribeNetworkInterfaces service
     *         method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeNetworkInterfacesResult describeNetworkInterfaces() throws AmazonServiceException, AmazonClientException {
        return describeNetworkInterfaces(new DescribeNetworkInterfacesRequest());
    }
    
    /**
     * <p>
     * Describes one or more regions that are currently available to you.
     * </p>
     * <p>
     * For a list of the regions supported by Amazon EC2, see
     * <a href="http://docs.aws.amazon.com/general/latest/gr/rande.html#ec2_region"> Regions and Endpoints </a>
     * .
     * </p>
     * 
     * @return The response from the DescribeRegions service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeRegionsResult describeRegions() throws AmazonServiceException, AmazonClientException {
        return describeRegions(new DescribeRegionsRequest());
    }
    
    /**
     * <p>
     * Describes one or more of your Internet gateways.
     * </p>
     * 
     * @return The response from the DescribeInternetGateways service method,
     *         as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeInternetGatewaysResult describeInternetGateways() throws AmazonServiceException, AmazonClientException {
        return describeInternetGateways(new DescribeInternetGatewaysRequest());
    }
    
    /**
     * <p>
     * Describes one or more of your security groups.
     * </p>
     * <p>
     * A security group is for use with instances either in the EC2-Classic
     * platform or in a specific VPC. For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-network-security.html"> Amazon EC2 Security Groups </a> in the <i>Amazon Elastic Compute Cloud User Guide</i> and <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_SecurityGroups.html"> Security Groups for Your VPC </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     * 
     * @return The response from the DescribeSecurityGroups service method,
     *         as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeSecurityGroupsResult describeSecurityGroups() throws AmazonServiceException, AmazonClientException {
        return describeSecurityGroups(new DescribeSecurityGroupsRequest());
    }
    
    /**
     * <p>
     * Describes the datafeed for Spot Instances. For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-spot-instances.html"> Spot Instances </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     * 
     * @return The response from the DescribeSpotDatafeedSubscription service
     *         method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeSpotDatafeedSubscriptionResult describeSpotDatafeedSubscription() throws AmazonServiceException, AmazonClientException {
        return describeSpotDatafeedSubscription(new DescribeSpotDatafeedSubscriptionRequest());
    }
    
    /**
     * <p>
     * Describes the specified attribute of your AWS account.
     * </p>
     * 
     * @return The response from the DescribeAccountAttributes service
     *         method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeAccountAttributesResult describeAccountAttributes() throws AmazonServiceException, AmazonClientException {
        return describeAccountAttributes(new DescribeAccountAttributesRequest());
    }
    
    /**
     * <p>
     * Describes the status of the specified volumes. Volume status provides
     * the result of the checks performed on your volumes to determine events
     * that can impair the performance of your volumes. The performance of a
     * volume can be affected if an issue occurs on the volume's underlying
     * host. If the volume's underlying host experiences a power outage or
     * system issue, after the system is restored, there could be data
     * inconsistencies on the volume. Volume events notify you if this
     * occurs. Volume actions notify you if any action needs to be taken in
     * response to the event.
     * </p>
     * <p>
     * The <code>DescribeVolumeStatus</code> operation provides the
     * following information about the specified volumes:
     * </p>
     * <p>
     * <i>Status</i> : Reflects the current status of the volume. The
     * possible values are <code>ok</code> , <code>impaired</code> ,
     * <code>warning</code> , or <code>insufficient-data</code> . If all
     * checks pass, the overall status of the volume is <code>ok</code> . If
     * the check fails, the overall status is <code>impaired</code> . If the
     * status is <code>insufficient-data</code> , then the checks may still
     * be taking place on your volume at the time. We recommend that you
     * retry the request. For more information on volume status, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/monitoring-volume-status.html"> Monitoring the Status of Your Volumes </a>
     * .
     * </p>
     * <p>
     * <i>Events</i> : Reflect the cause of a volume status and may require
     * you to take action. For example, if your volume returns an
     * <code>impaired</code> status, then the volume event might be
     * <code>potential-data-inconsistency</code> . This means that your
     * volume has been affected by an issue with the underlying host, has all
     * I/O operations disabled, and may have inconsistent data.
     * </p>
     * <p>
     * <i>Actions</i> : Reflect the actions you may have to take in response
     * to an event. For example, if the status of the volume is
     * <code>impaired</code> and the volume event shows
     * <code>potential-data-inconsistency</code> , then the action shows
     * <code>enable-volume-io</code> . This means that you may want to enable
     * the I/O operations for the volume by calling the EnableVolumeIO action
     * and then check the volume for data consistency.
     * </p>
     * <p>
     * <b>NOTE:</b> Volume status is based on the volume status checks, and
     * does not reflect the volume state. Therefore, volume status does not
     * indicate volumes in the error state (for example, when a volume is
     * incapable of accepting I/O.)
     * </p>
     * 
     * @return The response from the DescribeVolumeStatus service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeVolumeStatusResult describeVolumeStatus() throws AmazonServiceException, AmazonClientException {
        return describeVolumeStatus(new DescribeVolumeStatusRequest());
    }
    
    /**
     * <p>
     * Describes one or more of your VPN connections.
     * </p>
     * <p>
     * For more information about VPN connections, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_VPN.html"> Adding a Hardware Virtual Private Gateway to Your VPC </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     * 
     * @return The response from the DescribeVpnConnections service method,
     *         as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeVpnConnectionsResult describeVpnConnections() throws AmazonServiceException, AmazonClientException {
        return describeVpnConnections(new DescribeVpnConnectionsRequest());
    }
    
    /**
     * <p>
     * Describes one or more of your VPCs.
     * </p>
     * 
     * @return The response from the DescribeVpcs service method, as returned
     *         by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeVpcsResult describeVpcs() throws AmazonServiceException, AmazonClientException {
        return describeVpcs(new DescribeVpcsRequest());
    }
    
    /**
     * <p>
     * Accept a VPC peering connection request. To accept a request, the VPC
     * peering connection must be in the <code>pending-acceptance</code>
     * state, and you must be the owner of the peer VPC. Use the
     * <code>DescribeVpcPeeringConnections</code> request to view your
     * outstanding VPC peering connection requests.
     * </p>
     * 
     * @return The response from the AcceptVpcPeeringConnection service
     *         method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public AcceptVpcPeeringConnectionResult acceptVpcPeeringConnection() throws AmazonServiceException, AmazonClientException {
        return acceptVpcPeeringConnection(new AcceptVpcPeeringConnectionRequest());
    }
    
    /**
     * <p>
     * Describes one or more of your export tasks.
     * </p>
     * 
     * @return The response from the DescribeExportTasks service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeExportTasksResult describeExportTasks() throws AmazonServiceException, AmazonClientException {
        return describeExportTasks(new DescribeExportTasksRequest());
    }
    
    /**
     * <p>
     * Requests a VPC peering connection between two VPCs: a requester VPC
     * that you own and a peer VPC with which to create the connection. The
     * peer VPC can belong to another AWS account. The requester VPC and peer
     * VPC cannot have overlapping CIDR blocks.
     * </p>
     * <p>
     * The owner of the peer VPC must accept the peering request to activate
     * the peering connection. The VPC peering connection request expires
     * after 7 days, after which it cannot be accepted or rejected.
     * </p>
     * <p>
     * A <code>CreateVpcPeeringConnection</code> request between VPCs with
     * overlapping CIDR blocks results in the VPC peering connection having a
     * status of <code>failed</code> .
     * </p>
     * 
     * @return The response from the CreateVpcPeeringConnection service
     *         method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateVpcPeeringConnectionResult createVpcPeeringConnection() throws AmazonServiceException, AmazonClientException {
        return createVpcPeeringConnection(new CreateVpcPeeringConnectionRequest());
    }
    
    /**
     * <p>
     * Describes the specified Amazon EBS volumes.
     * </p>
     * <p>
     * For more information about Amazon EBS volumes, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumes.html"> Amazon EBS Volumes </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     * 
     * @return The response from the DescribeVolumes service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeVolumesResult describeVolumes() throws AmazonServiceException, AmazonClientException {
        return describeVolumes(new DescribeVolumesRequest());
    }
    
    /**
     * <p>
     * Describes your account's Reserved Instance listings in the Reserved
     * Instance Marketplace.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ri-market-general.html"> Reserved Instance Marketplace </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     * 
     * @return The response from the DescribeReservedInstancesListings
     *         service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeReservedInstancesListingsResult describeReservedInstancesListings() throws AmazonServiceException, AmazonClientException {
        return describeReservedInstancesListings(new DescribeReservedInstancesListingsRequest());
    }
    
    /**
     * <p>
     * Describes one or more of your route tables.
     * </p>
     * <p>
     * For more information about route tables, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_Route_Tables.html"> Route Tables </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     * 
     * @return The response from the DescribeRouteTables service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeRouteTablesResult describeRouteTables() throws AmazonServiceException, AmazonClientException {
        return describeRouteTables(new DescribeRouteTablesRequest());
    }
    
    /**
     * <p>
     * Describes one or more of your DHCP options sets.
     * </p>
     * <p>
     * For more information about DHCP options sets, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_DHCP_Options.html"> DHCP Options Sets </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     * 
     * @return The response from the DescribeDhcpOptions service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeDhcpOptionsResult describeDhcpOptions() throws AmazonServiceException, AmazonClientException {
        return describeDhcpOptions(new DescribeDhcpOptionsRequest());
    }
    
    /**
     * <p>
     * Describes one or more of your network ACLs.
     * </p>
     * <p>
     * For more information about network ACLs, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_ACLs.html"> Network ACLs </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     * 
     * @return The response from the DescribeNetworkAcls service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeNetworkAclsResult describeNetworkAcls() throws AmazonServiceException, AmazonClientException {
        return describeNetworkAcls(new DescribeNetworkAclsRequest());
    }
    
    /**
     * <p>
     * Describes one or more of your bundling tasks.
     * </p>
     * <p>
     * <b>NOTE:</b> Completed bundle tasks are listed for only a limited
     * time. If your bundle task is no longer in the list, you can still
     * register an AMI from it. Just use RegisterImage with the Amazon S3
     * bucket name and image manifest name you provided to the bundle task.
     * </p>
     * 
     * @return The response from the DescribeBundleTasks service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeBundleTasksResult describeBundleTasks() throws AmazonServiceException, AmazonClientException {
        return describeBundleTasks(new DescribeBundleTasksRequest());
    }
    
    /**
     * <p>
     * Removes one or more ingress rules from a security group. The values
     * that you specify in the revoke request (for example, ports) must match
     * the existing rule's values for the rule to be removed.
     * </p>
     * <p>
     * Each rule consists of the protocol and the CIDR range or source
     * security group. For the TCP and UDP protocols, you must also specify
     * the destination port or range of ports. For the ICMP protocol, you
     * must also specify the ICMP type and code.
     * </p>
     * <p>
     * Rule changes are propagated to instances within the security group as
     * quickly as possible. However, a small delay might occur.
     * </p>
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void revokeSecurityGroupIngress() throws AmazonServiceException, AmazonClientException {
        revokeSecurityGroupIngress(new RevokeSecurityGroupIngressRequest());
    }
    
    /**
     * <p>
     * Creates an Internet gateway for use with a VPC. After creating the
     * Internet gateway, you attach it to a VPC using AttachInternetGateway.
     * </p>
     * <p>
     * For more information about your VPC and Internet gateway, see the
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/"> Amazon Virtual Private Cloud User Guide </a>
     * .
     * </p>
     * 
     * @return The response from the CreateInternetGateway service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateInternetGatewayResult createInternetGateway() throws AmazonServiceException, AmazonClientException {
        return createInternetGateway(new CreateInternetGatewayRequest());
    }
    
    /**
     * <p>
     * Describes one or more of your conversion tasks. For more information,
     * see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UploadingYourInstancesandVolumes.html"> Using the Command Line Tools to Import Your Virtual Machine to Amazon EC2 </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     * 
     * @return The response from the DescribeConversionTasks service method,
     *         as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeConversionTasksResult describeConversionTasks() throws AmazonServiceException, AmazonClientException {
        return describeConversionTasks(new DescribeConversionTasksRequest());
    }
    
    /**
     * <p>
     * Describes one or more of your VPC peering connections.
     * </p>
     * 
     * @return The response from the DescribeVpcPeeringConnections service
     *         method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeVpcPeeringConnectionsResult describeVpcPeeringConnections() throws AmazonServiceException, AmazonClientException {
        return describeVpcPeeringConnections(new DescribeVpcPeeringConnectionsRequest());
    }
    
    /**
     * <p>
     * Describes one or more of your subnets.
     * </p>
     * <p>
     * For more information about subnets, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_Subnets.html"> Your VPC and Subnets </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     * 
     * @return The response from the DescribeSubnets service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeSubnetsResult describeSubnets() throws AmazonServiceException, AmazonClientException {
        return describeSubnets(new DescribeSubnetsRequest());
    }
    
    /**
     * <p>
     * Describes one or more of your placement groups. For more information
     * about placement groups and cluster instances, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using_cluster_computing.html"> Cluster Instances </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     * 
     * @return The response from the DescribePlacementGroups service method,
     *         as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribePlacementGroupsResult describePlacementGroups() throws AmazonServiceException, AmazonClientException {
        return describePlacementGroups(new DescribePlacementGroupsRequest());
    }
    
    /**
     * <p>
     * Describes one or more of your instances.
     * </p>
     * <p>
     * If you specify one or more instance IDs, Amazon EC2 returns
     * information for those instances. If you do not specify instance IDs,
     * Amazon EC2 returns information for all relevant instances. If you
     * specify an instance ID that is not valid, an error is returned. If you
     * specify an instance that you do not own, it is not included in the
     * returned results.
     * </p>
     * <p>
     * Recently terminated instances might appear in the returned results.
     * This interval is usually less than one hour.
     * </p>
     * 
     * @return The response from the DescribeInstances service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeInstancesResult describeInstances() throws AmazonServiceException, AmazonClientException {
        return describeInstances(new DescribeInstancesRequest());
    }
    
    /**
     * <p>
     * Describes one or more of the images (AMIs, AKIs, and ARIs) available
     * to you. Images available to you include public images, private images
     * that you own, and private images owned by other AWS accounts but for
     * which you have explicit launch permissions.
     * </p>
     * <p>
     * <b>NOTE:</b> Deregistered images are included in the returned results
     * for an unspecified interval after deregistration.
     * </p>
     * 
     * @return The response from the DescribeImages service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeImagesResult describeImages() throws AmazonServiceException, AmazonClientException {
        return describeImages(new DescribeImagesRequest());
    }
    
    /**
     * <p>
     * Describes the Spot Instance requests that belong to your account.
     * Spot Instances are instances that Amazon EC2 starts on your behalf
     * when the maximum price that you specify exceeds the current Spot
     * Price. Amazon EC2 periodically sets the Spot Price based on available
     * Spot Instance capacity and current Spot Instance requests. For more
     * information about Spot Instances, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-spot-instances.html"> Spot Instances </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     * <p>
     * You can use <code>DescribeSpotInstanceRequests</code> to find a
     * running Spot Instance by examining the response. If the status of the
     * Spot Instance is <code>fulfilled</code> , the instance ID appears in
     * the response and contains the identifier of the instance.
     * Alternatively, you can use DescribeInstances with a filter to look for
     * instances where the instance lifecycle is <code>spot</code> .
     * </p>
     * 
     * @return The response from the DescribeSpotInstanceRequests service
     *         method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeSpotInstanceRequestsResult describeSpotInstanceRequests() throws AmazonServiceException, AmazonClientException {
        return describeSpotInstanceRequests(new DescribeSpotInstanceRequestsRequest());
    }
    
    /**
     * <p>
     * Describes one or more of your VPN customer gateways.
     * </p>
     * <p>
     * For more information about VPN customer gateways, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_VPN.html"> Adding a Hardware Virtual Private Gateway to Your VPC </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     * 
     * @return The response from the DescribeCustomerGateways service method,
     *         as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeCustomerGatewaysResult describeCustomerGateways() throws AmazonServiceException, AmazonClientException {
        return describeCustomerGateways(new DescribeCustomerGatewaysRequest());
    }
    
    /**
     * <p>
     * Describes one or more of the tags for your EC2 resources.
     * </p>
     * <p>
     * For more information about tags, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html"> Tagging Your Resources </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     * 
     * @return The response from the DescribeTags service method, as returned
     *         by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeTagsResult describeTags() throws AmazonServiceException, AmazonClientException {
        return describeTags(new DescribeTagsRequest());
    }
    
    /**
     * <p>
     * Describes the modifications made to your Reserved Instances. If no
     * parameter is specified, information about all your Reserved Instances
     * modification requests is returned. If a modification ID is specified,
     * only information about the specific modification is returned.
     * </p>
     * 
     * @return The response from the DescribeReservedInstancesModifications
     *         service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeReservedInstancesModificationsResult describeReservedInstancesModifications() throws AmazonServiceException, AmazonClientException {
        return describeReservedInstancesModifications(new DescribeReservedInstancesModificationsRequest());
    }
    
    /**
     * <p>
     * Deletes the datafeed for Spot Instances. For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-spot-instances.html"> Spot Instances </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteSpotDatafeedSubscription() throws AmazonServiceException, AmazonClientException {
        deleteSpotDatafeedSubscription(new DeleteSpotDatafeedSubscriptionRequest());
    }
    
    /**
     * <p>
     * Describes one or more of your Elastic IP addresses.
     * </p>
     * <p>
     * An Elastic IP address is for use in either the EC2-Classic platform
     * or in a VPC. For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html"> Elastic IP Addresses </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     * 
     * @return The response from the DescribeAddresses service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeAddressesResult describeAddresses() throws AmazonServiceException, AmazonClientException {
        return describeAddresses(new DescribeAddressesRequest());
    }
    
    /**
     * <p>
     * Describes one or more of your key pairs.
     * </p>
     * <p>
     * For more information about key pairs, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html"> Key Pairs </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     * 
     * @return The response from the DescribeKeyPairs service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeKeyPairsResult describeKeyPairs() throws AmazonServiceException, AmazonClientException {
        return describeKeyPairs(new DescribeKeyPairsRequest());
    }
    
    /**
     * <p>
     * Describes the status of one or more instances, including any
     * scheduled events.
     * </p>
     * <p>
     * Instance status has two main components:
     * </p>
     * 
     * <ul>
     * <li> <p>
     * System Status reports impaired functionality that stems from issues
     * related to the systems that support an instance, such as such as
     * hardware failures and network connectivity problems. This call reports
     * such problems as impaired reachability.
     * </p>
     * </li>
     * <li> <p>
     * Instance Status reports impaired functionality that arises from
     * problems internal to the instance. This call reports such problems as
     * impaired reachability.
     * </p>
     * </li>
     * 
     * </ul>
     * <p>
     * Instance status provides information about four types of scheduled
     * events for an instance that may require your attention:
     * </p>
     * 
     * <ul>
     * <li> <p>
     * Scheduled Reboot: When Amazon EC2 determines that an instance must be
     * rebooted, the instances status returns one of two event codes:
     * <code>system-reboot</code> or <code>instance-reboot</code> . System
     * reboot commonly occurs if certain maintenance or upgrade operations
     * require a reboot of the underlying host that supports an instance.
     * Instance reboot commonly occurs if the instance must be rebooted,
     * rather than the underlying host. Rebooting events include a scheduled
     * start and end time.
     * </p>
     * </li>
     * <li> <p>
     * System Maintenance: When Amazon EC2 determines that an instance
     * requires maintenance that requires power or network impact, the
     * instance status is the event code <code>system-maintenance</code> .
     * System maintenance is either power maintenance or network maintenance.
     * For power maintenance, your instance will be unavailable for a brief
     * period of time and then rebooted. For network maintenance, your
     * instance will experience a brief loss of network connectivity. System
     * maintenance events include a scheduled start and end time. You will
     * also be notified by email if one of your instances is set for system
     * maintenance. The email message indicates when your instance is
     * scheduled for maintenance.
     * </p>
     * </li>
     * <li> <p>
     * Scheduled Retirement: When Amazon EC2 determines that an instance
     * must be shut down, the instance status is the event code
     * <code>instance-retirement</code> . Retirement commonly occurs when the
     * underlying host is degraded and must be replaced. Retirement events
     * include a scheduled start and end time. You will also be notified by
     * email if one of your instances is set to retiring. The email message
     * indicates when your instance will be permanently retired.
     * </p>
     * </li>
     * <li> <p>
     * Scheduled Stop: When Amazon EC2 determines that an instance must be
     * shut down, the instances status returns an event code called
     * <code>instance-stop</code> . Stop events include a scheduled start and
     * end time. You will also be notified by email if one of your instances
     * is set to stop. The email message indicates when your instance will be
     * stopped.
     * </p>
     * </li>
     * 
     * </ul>
     * <p>
     * When your instance is retired, it will either be terminated (if its
     * root device type is the instance-store) or stopped (if its root device
     * type is an EBS volume). Instances stopped due to retirement will not
     * be restarted, but you can do so manually. You can also avoid
     * retirement of EBS-backed instances by manually restarting your
     * instance when its event code is <code>instance-retirement</code> .
     * This ensures that your instance is started on a different underlying
     * host.
     * </p>
     * <p>
     * For more information about failed status checks, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/TroubleshootingInstances.html"> Troubleshooting Instances with Failed Status Checks </a> in the <i>Amazon Elastic Compute Cloud User Guide</i> . For more information about working with scheduled events, see <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/monitoring-instances-status-check_sched.html#schedevents_actions"> Working with an Instance That Has a Scheduled Event </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     * 
     * @return The response from the DescribeInstanceStatus service method,
     *         as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeInstanceStatusResult describeInstanceStatus() throws AmazonServiceException, AmazonClientException {
        return describeInstanceStatus(new DescribeInstanceStatusRequest());
    }
    
    /**
     * <p>
     * Describes one or more of your virtual private gateways.
     * </p>
     * <p>
     * For more information about virtual private gateways, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_VPN.html"> Adding an IPsec Hardware VPN to Your VPC </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     * 
     * @return The response from the DescribeVpnGateways service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeVpnGatewaysResult describeVpnGateways() throws AmazonServiceException, AmazonClientException {
        return describeVpnGateways(new DescribeVpnGatewaysRequest());
    }
    
    /**
     * <p>
     * Describes Reserved Instance offerings that are available for
     * purchase. With Reserved Instances, you purchase the right to launch
     * instances for a period of time. During that time period, you do not
     * receive insufficient capacity errors, and you pay a lower usage rate
     * than the rate charged for On-Demand instances for the actual time
     * used.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ri-market-general.html"> Reserved Instance Marketplace </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     * 
     * @return The response from the DescribeReservedInstancesOfferings
     *         service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeReservedInstancesOfferingsResult describeReservedInstancesOfferings() throws AmazonServiceException, AmazonClientException {
        return describeReservedInstancesOfferings(new DescribeReservedInstancesOfferingsRequest());
    }
    
    /**
     * <p>
     * Acquires an Elastic IP address.
     * </p>
     * <p>
     * An Elastic IP address is for use either in the EC2-Classic platform
     * or in a VPC. For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html"> Elastic IP Addresses </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     * 
     * @return The response from the AllocateAddress service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public AllocateAddressResult allocateAddress() throws AmazonServiceException, AmazonClientException {
        return allocateAddress(new AllocateAddressRequest());
    }
    
    /**
     * <p>
     * Describes one or more of the Amazon EBS snapshots available to you.
     * Available snapshots include public snapshots available for any AWS
     * account to launch, private snapshots that you own, and private
     * snapshots owned by another AWS account but for which you've been given
     * explicit create volume permissions.
     * </p>
     * <p>
     * The create volume permissions fall into the following categories:
     * </p>
     * 
     * <ul>
     * <li> <i>public</i> : The owner of the snapshot granted create volume
     * permissions for the snapshot to the <code>all</code> group. All AWS
     * accounts have create volume permissions for these snapshots.</li>
     * <li> <i>explicit</i> : The owner of the snapshot granted create
     * volume permissions to a specific AWS account.</li>
     * <li> <i>implicit</i> : An AWS account has implicit create volume
     * permissions for all snapshots it owns.</li>
     * 
     * </ul>
     * <p>
     * The list of snapshots returned can be modified by specifying snapshot
     * IDs, snapshot owners, or AWS accounts with create volume permissions.
     * If no options are specified, Amazon EC2 returns all snapshots for
     * which you have create volume permissions.
     * </p>
     * <p>
     * If you specify one or more snapshot IDs, only snapshots that have the
     * specified IDs are returned. If you specify an invalid snapshot ID, an
     * error is returned. If you specify a snapshot ID for which you do not
     * have access, it is not included in the returned results.
     * </p>
     * <p>
     * If you specify one or more snapshot owners, only snapshots from the
     * specified owners and for which you have access are returned. The
     * results can include the AWS account IDs of the specified owners,
     * <code>amazon</code> for snapshots owned by Amazon, or
     * <code>self</code> for snapshots that you own.
     * </p>
     * <p>
     * If you specify a list of restorable users, only snapshots with create
     * snapshot permissions for those users are returned. You can specify AWS
     * account IDs (if you own the snapshots), <code>self</code> for
     * snapshots for which you own or have explicit permissions, or
     * <code>all</code> for public snapshots.
     * </p>
     * <p>
     * For more information about Amazon EBS snapshots, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSSnapshots.html"> Amazon EBS Snapshots </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     * 
     * @return The response from the DescribeSnapshots service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeSnapshotsResult describeSnapshots() throws AmazonServiceException, AmazonClientException {
        return describeSnapshots(new DescribeSnapshotsRequest());
    }
    
    /**
     * Checks whether you have the required permissions for the provided
     * AmazonEC2 operation, without actually running it. The returned
     * DryRunResult object contains the information of whether the dry-run was
     * successful. This method will throw exception when the service response
     * does not clearly indicate whether you have the permission.
     *
     * @param request
     *            The request object for any AmazonEC2 operation supported with
     *            dry-run.
     *
     * @return A DryRunResult object that contains the information of whether
     *         the dry-run was successful.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client
     *             while attempting to make the request or handle the response.
     *             Or if the service response does not clearly indicate whether
     *             you have the permission.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server
     *             side issue.
     */
    public <X extends AmazonWebServiceRequest> DryRunResult<X> dryRun(DryRunSupportedRequest<X> request) throws AmazonServiceException, AmazonClientException {
        Request<X> dryRunRequest = request.getDryRunRequest();
        ExecutionContext executionContext = createExecutionContext(dryRunRequest);
        try {
            invoke(dryRunRequest, null, executionContext);
            throw new AmazonClientException("Unrecognized service response for the dry-run request.");
        } catch (AmazonServiceException ase) {
            if (ase.getErrorCode().equals("DryRunOperation") && ase.getStatusCode() == 412) {
                return new DryRunResult<X>(true, request, ase.getMessage(), ase);
            } else if (ase.getErrorCode().equals("UnauthorizedOperation") && ase.getStatusCode() == 403) {
                return new DryRunResult<X>(false, request, ase.getMessage(), ase);
            }
            throw new AmazonClientException("Unrecognized service response for the dry-run request.", ase);
        }
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
            Unmarshaller<X, StaxUnmarshallerContext> unmarshaller,
            ExecutionContext executionContext)
    {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);
        AmazonWebServiceRequest originalRequest = request.getOriginalRequest();
        for (Entry<String, String> entry : originalRequest.copyPrivateRequestParameters().entrySet()) {
            request.addParameter(entry.getKey(), entry.getValue());
        }

        AWSCredentials credentials = awsCredentialsProvider.getCredentials();
        if (originalRequest.getRequestCredentials() != null) {
            credentials = originalRequest.getRequestCredentials();
        }

        executionContext.setCredentials(credentials);
        
        StaxResponseHandler<X> responseHandler = new StaxResponseHandler<X>(unmarshaller);
        DefaultErrorResponseHandler errorResponseHandler = new DefaultErrorResponseHandler(exceptionUnmarshallers);
        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }
}
        