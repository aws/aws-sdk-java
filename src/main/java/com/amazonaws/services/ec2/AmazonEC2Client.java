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
package com.amazonaws.services.ec2;

import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;

import com.amazonaws.*;
import com.amazonaws.auth.*;
import com.amazonaws.handlers.HandlerChainFactory;
import com.amazonaws.handlers.RequestHandler;
import com.amazonaws.http.StaxResponseHandler;
import com.amazonaws.http.DefaultErrorResponseHandler;
import com.amazonaws.http.ExecutionContext;
import com.amazonaws.internal.StaticCredentialsProvider;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.LegacyErrorUnmarshaller;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.services.ec2.model.transform.*;


/**
 * Client for accessing AmazonEC2.  All service calls made
 * using this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * <p>
 * Amazon Elastic Compute Cloud (Amazon EC2) is a web service that
 * provides resizable compute capacity in the cloud. It is designed to
 * make web-scale computing easier for developers.
 * </p>
 * <p>
 * Amazon EC2's simple web service interface allows you to obtain and
 * configure capacity with minimal friction. It provides you with
 * complete control of your computing resources and lets you run on
 * Amazon's proven computing environment. Amazon EC2 reduces the time
 * required to obtain and boot new server instances to minutes, allowing
 * you to quickly scale capacity, both up and down, as your computing
 * requirements change. Amazon EC2 changes the economics of computing by
 * allowing you to pay only for capacity that you actually use. Amazon
 * EC2 provides developers the tools to build failure resilient
 * applications and isolate themselves from common failure scenarios.
 * </p>
 * <p>
 * Visit <a href="http://aws.amazon.com/ec2/">
 * http://aws.amazon.com/ec2/ </a> for more information.
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
    
    
    /** AWS signer for authenticating requests. */
    private QueryStringSigner signer;


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
        super(clientConfiguration);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
    }

    private void init() { 
        
        exceptionUnmarshallers.add(new LegacyErrorUnmarshaller());
        setEndpoint("ec2.amazonaws.com");

        signer = new QueryStringSigner();

        HandlerChainFactory chainFactory = new HandlerChainFactory();
		requestHandlers.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/ec2/request.handlers"));
    }
    
    
    /**
     * <p>
     * The RebootInstances operation requests a reboot of one or more
     * instances. This operation is asynchronous; it only queues a request to
     * reboot the specified instance(s). The operation will succeed if the
     * instances are valid and belong to the user. Requests to reboot
     * terminated instances are ignored.
     * </p>
     *
     * @param rebootInstancesRequest Container for the necessary parameters
     *           to execute the RebootInstances service method on AmazonEC2.
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
    public void rebootInstances(RebootInstancesRequest rebootInstancesRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<RebootInstancesRequest> request = new RebootInstancesRequestMarshaller().marshall(rebootInstancesRequest);
        invoke(request, null);
    }
    
    /**
     * <p>
     * The DescribeReservedInstances operation describes Reserved Instances
     * that were purchased for use with your account.
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
    public DescribeReservedInstancesResult describeReservedInstances(DescribeReservedInstancesRequest describeReservedInstancesRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeReservedInstancesRequest> request = new DescribeReservedInstancesRequestMarshaller().marshall(describeReservedInstancesRequest);
        return invoke(request, new DescribeReservedInstancesResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * The DescribeAvailabilityZones operation describes availability zones
     * that are currently available to the account and their states.
     * </p>
     * <p>
     * Availability zones are not the same across accounts. The availability
     * zone <code>us-east-1a</code> for account A is not necessarily the same
     * as <code>us-east-1a</code> for account B. Zone assignments are mapped
     * independently for each account.
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
    public DescribeAvailabilityZonesResult describeAvailabilityZones(DescribeAvailabilityZonesRequest describeAvailabilityZonesRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeAvailabilityZonesRequest> request = new DescribeAvailabilityZonesRequestMarshaller().marshall(describeAvailabilityZonesRequest);
        return invoke(request, new DescribeAvailabilityZonesResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Detach a previously attached volume from a running instance.
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
    public DetachVolumeResult detachVolume(DetachVolumeRequest detachVolumeRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DetachVolumeRequest> request = new DetachVolumeRequestMarshaller().marshall(detachVolumeRequest);
        return invoke(request, new DetachVolumeResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * The DeleteKeyPair operation deletes a key pair.
     * </p>
     *
     * @param deleteKeyPairRequest Container for the necessary parameters to
     *           execute the DeleteKeyPair service method on AmazonEC2.
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
    public void deleteKeyPair(DeleteKeyPairRequest deleteKeyPairRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DeleteKeyPairRequest> request = new DeleteKeyPairRequestMarshaller().marshall(deleteKeyPairRequest);
        invoke(request, null);
    }
    
    /**
     * <p>
     * Disables monitoring for a running instance.
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
    public UnmonitorInstancesResult unmonitorInstances(UnmonitorInstancesRequest unmonitorInstancesRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<UnmonitorInstancesRequest> request = new UnmonitorInstancesRequestMarshaller().marshall(unmonitorInstancesRequest);
        return invoke(request, new UnmonitorInstancesResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Attaches a VPN gateway to a VPC. This is the last step required to
     * get your VPC fully connected to your data center before launching
     * instances in it. For more information, go to Process for Using Amazon
     * VPC in the Amazon Virtual Private Cloud Developer Guide.
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
    public AttachVpnGatewayResult attachVpnGateway(AttachVpnGatewayRequest attachVpnGatewayRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<AttachVpnGatewayRequest> request = new AttachVpnGatewayRequestMarshaller().marshall(attachVpnGatewayRequest);
        return invoke(request, new AttachVpnGatewayResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Creates an Amazon EBS-backed AMI from a "running" or "stopped"
     * instance. AMIs that use an Amazon EBS root device boot faster than
     * AMIs that use instance stores. They can be up to 1 TiB in size, use
     * storage that persists on instance failure, and can be stopped and
     * started.
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
    public CreateImageResult createImage(CreateImageRequest createImageRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<CreateImageRequest> request = new CreateImageRequestMarshaller().marshall(createImageRequest);
        return invoke(request, new CreateImageResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * The DeleteSecurityGroup operation deletes a security group.
     * </p>
     * <p>
     * <b>NOTE:</b> If you attempt to delete a security group that contains
     * instances, a fault is returned. If you attempt to delete a security
     * group that is referenced by another security group, a fault is
     * returned. For example, if security group B has a rule that allows
     * access from security group A, security group A cannot be deleted until
     * the allow rule is removed.
     * </p>
     *
     * @param deleteSecurityGroupRequest Container for the necessary
     *           parameters to execute the DeleteSecurityGroup service method on
     *           AmazonEC2.
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
    public void deleteSecurityGroup(DeleteSecurityGroupRequest deleteSecurityGroupRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DeleteSecurityGroupRequest> request = new DeleteSecurityGroupRequestMarshaller().marshall(deleteSecurityGroupRequest);
        invoke(request, null);
    }
    
    /**
     * <p>
     * This action applies only to security groups in a VPC; it's not
     * supported for EC2 security groups. For information about Amazon
     * Virtual Private Cloud and VPC security groups, go to the Amazon
     * Virtual Private Cloud User Guide.
     * </p>
     * <p>
     * The action adds one or more egress rules to a VPC security group.
     * Specifically, this permits instances in a security group to send
     * traffic to either one or more destination CIDR IP address ranges, or
     * to one or more destination security groups in the same VPC.
     * </p>
     * <p>
     * Each rule consists of the protocol (e.g., TCP), plus either a CIDR
     * range, or a source group. For the TCP and UDP protocols, you must also
     * specify the destination port or port range. For the ICMP protocol, you
     * must also specify the ICMP type and code. You can use <code>-1</code>
     * as a wildcard for the ICMP type or code.
     * </p>
     * <p>
     * Rule changes are propagated to instances within the security group as
     * quickly as possible. However, a small delay might occur.
     * </p>
     * <p>
     * <b>Important:</b> For VPC security groups: You can have up to 50
     * rules total per group (covering both ingress and egress).
     * </p>
     *
     * @param authorizeSecurityGroupEgressRequest Container for the necessary
     *           parameters to execute the AuthorizeSecurityGroupEgress service method
     *           on AmazonEC2.
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
    public void authorizeSecurityGroupEgress(AuthorizeSecurityGroupEgressRequest authorizeSecurityGroupEgressRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<AuthorizeSecurityGroupEgressRequest> request = new AuthorizeSecurityGroupEgressRequestMarshaller().marshall(authorizeSecurityGroupEgressRequest);
        invoke(request, null);
    }
    
    /**
     * <p>
     * Retrieves the encrypted administrator password for the instances
     * running Windows.
     * </p>
     * <p>
     * <b>NOTE:</b> The Windows password is only generated the first time an
     * AMI is launched. It is not generated for rebundled AMIs or after the
     * password is changed on an instance. The password is encrypted using
     * the key pair that you provided.
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
    public GetPasswordDataResult getPasswordData(GetPasswordDataRequest getPasswordDataRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<GetPasswordDataRequest> request = new GetPasswordDataRequestMarshaller().marshall(getPasswordDataRequest);
        return invoke(request, new GetPasswordDataResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Associates a set of DHCP options (that you've previously created)
     * with the specified VPC. Or, associates the default DHCP options with
     * the VPC. The default set consists of the standard EC2 host name, no
     * domain name, no DNS server, no NTP server, and no NetBIOS server or
     * node type. After you associate the options with the VPC, any existing
     * instances and all new instances that you launch in that VPC use the
     * options. For more information about the supported DHCP options and
     * using them with Amazon VPC, go to Using DHCP Options in the Amazon
     * Virtual Private Cloud Developer Guide.
     * </p>
     *
     * @param associateDhcpOptionsRequest Container for the necessary
     *           parameters to execute the AssociateDhcpOptions service method on
     *           AmazonEC2.
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
    public void associateDhcpOptions(AssociateDhcpOptionsRequest associateDhcpOptionsRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<AssociateDhcpOptionsRequest> request = new AssociateDhcpOptionsRequestMarshaller().marshall(associateDhcpOptionsRequest);
        invoke(request, null);
    }
    
    /**
     * <p>
     * Stops an instance that uses an Amazon EBS volume as its root device.
     * Instances that use Amazon EBS volumes as their root devices can be
     * quickly stopped and started. When an instance is stopped, the compute
     * resources are released and you are not billed for hourly instance
     * usage. However, your root partition Amazon EBS volume remains,
     * continues to persist your data, and you are charged for Amazon EBS
     * volume usage. You can restart your instance at any time.
     * </p>
     * <p>
     * <b>NOTE:</b> Before stopping an instance, make sure it is in a state
     * from which it can be restarted. Stopping an instance does not preserve
     * data stored in RAM. Performing this operation on an instance that uses
     * an instance store as its root device returns an error.
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
    public StopInstancesResult stopInstances(StopInstancesRequest stopInstancesRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<StopInstancesRequest> request = new StopInstancesRequestMarshaller().marshall(stopInstancesRequest);
        return invoke(request, new StopInstancesResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Imports the public key from an RSA key pair created with a
     * third-party tool. This operation differs from CreateKeyPair as the
     * private key is never transferred between the caller and AWS servers.
     * </p>
     * <p>
     * RSA key pairs are easily created on Microsoft Windows and Linux OS
     * systems using the <code>ssh-keygen</code> command line tool provided
     * with the standard OpenSSH installation. Standard library support for
     * RSA key pair creation is also available for Java, Ruby, Python, and
     * many other programming languages.
     * </p>
     * <p>
     * The following formats are supported:
     * </p>
     * 
     * <ul>
     * <li> OpenSSH public key format, </li>
     * <li> Base64 encoded DER format. </li>
     * <li> SSH public key file format as specified in <a
     * href="http://tools.ietf.org/html/rfc4716"> RFC4716 </a> . </li>
     * 
     * </ul>
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
    public ImportKeyPairResult importKeyPair(ImportKeyPairRequest importKeyPairRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<ImportKeyPairRequest> request = new ImportKeyPairRequestMarshaller().marshall(importKeyPairRequest);
        return invoke(request, new ImportKeyPairResultStaxUnmarshaller());
    }
    
    /**
     *
     * @param deleteNetworkInterfaceRequest Container for the necessary
     *           parameters to execute the DeleteNetworkInterface service method on
     *           AmazonEC2.
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
    public void deleteNetworkInterface(DeleteNetworkInterfaceRequest deleteNetworkInterfaceRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DeleteNetworkInterfaceRequest> request = new DeleteNetworkInterfaceRequestMarshaller().marshall(deleteNetworkInterfaceRequest);
        invoke(request, null);
    }
    
    /**
     * <p>
     * The CreateSecurityGroup operation creates a new security group.
     * </p>
     * <p>
     * Every instance is launched in a security group. If no security group
     * is specified during launch, the instances are launched in the default
     * security group. Instances within the same security group have
     * unrestricted network access to each other. Instances will reject
     * network access attempts from other instances in a different security
     * group. As the owner of instances you can grant or revoke specific
     * permissions using the AuthorizeSecurityGroupIngress and
     * RevokeSecurityGroupIngress operations.
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
    public CreateSecurityGroupResult createSecurityGroup(CreateSecurityGroupRequest createSecurityGroupRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<CreateSecurityGroupRequest> request = new CreateSecurityGroupRequestMarshaller().marshall(createSecurityGroupRequest);
        return invoke(request, new CreateSecurityGroupResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Describes the Spot Price history.
     * </p>
     * <p>
     * Spot Instances are instances that Amazon EC2 starts on your behalf
     * when the maximum price that you specify exceeds the current Spot
     * Price. Amazon EC2 periodically sets the Spot Price based on available
     * Spot Instance capacity and current spot instance requests.
     * </p>
     * <p>
     * For conceptual information about Spot Instances, refer to the Amazon
     * Elastic Compute Cloud Developer Guide or Amazon Elastic Compute Cloud
     * User Guide .
     * 
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
    public DescribeSpotPriceHistoryResult describeSpotPriceHistory(DescribeSpotPriceHistoryRequest describeSpotPriceHistoryRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeSpotPriceHistoryRequest> request = new DescribeSpotPriceHistoryRequestMarshaller().marshall(describeSpotPriceHistoryRequest);
        return invoke(request, new DescribeSpotPriceHistoryResultStaxUnmarshaller());
    }
    
    /**
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
    public DescribeNetworkInterfacesResult describeNetworkInterfaces(DescribeNetworkInterfacesRequest describeNetworkInterfacesRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeNetworkInterfacesRequest> request = new DescribeNetworkInterfacesRequestMarshaller().marshall(describeNetworkInterfacesRequest);
        return invoke(request, new DescribeNetworkInterfacesResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * The DescribeRegions operation describes regions zones that are
     * currently available to the account.
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
    public DescribeRegionsResult describeRegions(DescribeRegionsRequest describeRegionsRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeRegionsRequest> request = new DescribeRegionsRequestMarshaller().marshall(describeRegionsRequest);
        return invoke(request, new DescribeRegionsResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Creates a set of DHCP options that you can then associate with one or
     * more VPCs, causing all existing and new instances that you launch in
     * those VPCs to use the set of DHCP options. The following table lists
     * the individual DHCP options you can specify. For more information
     * about the options, go to <a
     * href="http://www.ietf.org/rfc/rfc2132.txt">
     * http://www.ietf.org/rfc/rfc2132.txt </a>
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
    public CreateDhcpOptionsResult createDhcpOptions(CreateDhcpOptionsRequest createDhcpOptionsRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<CreateDhcpOptionsRequest> request = new CreateDhcpOptionsRequestMarshaller().marshall(createDhcpOptionsRequest);
        return invoke(request, new CreateDhcpOptionsResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Resets permission settings for the specified snapshot.
     * </p>
     *
     * @param resetSnapshotAttributeRequest Container for the necessary
     *           parameters to execute the ResetSnapshotAttribute service method on
     *           AmazonEC2.
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
    public void resetSnapshotAttribute(ResetSnapshotAttributeRequest resetSnapshotAttributeRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<ResetSnapshotAttributeRequest> request = new ResetSnapshotAttributeRequestMarshaller().marshall(resetSnapshotAttributeRequest);
        invoke(request, null);
    }
    
    /**
     * <p>
     * Deletes a route from a route table in a VPC. For more information
     * about route tables, go to <a
     * azonwebservices.com/AmazonVPC/latest/UserGuide/VPC_Route_Tables.html">
     * Route Tables </a> in the Amazon Virtual Private Cloud User Guide.
     * </p>
     *
     * @param deleteRouteRequest Container for the necessary parameters to
     *           execute the DeleteRoute service method on AmazonEC2.
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
    public void deleteRoute(DeleteRouteRequest deleteRouteRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DeleteRouteRequest> request = new DeleteRouteRequestMarshaller().marshall(deleteRouteRequest);
        invoke(request, null);
    }
    
    /**
     * <p>
     * Gives you information about your Internet gateways. You can filter
     * the results to return information only about Internet gateways that
     * match criteria you specify. For example, you could get information
     * only about gateways with particular tags. The Internet gateway must
     * match at least one of the specified values for it to be included in
     * the results.
     * </p>
     * <p>
     * You can specify multiple filters (e.g., the Internet gateway is
     * attached to a particular VPC and is tagged with a particular value).
     * The result includes information for a particular Internet gateway only
     * if the gateway matches all your filters. If there's no match, no
     * special message is returned; the response is simply empty.
     * </p>
     * <p>
     * You can use wildcards with the filter values: an asterisk matches
     * zero or more characters, and <code>?</code> matches exactly one
     * character. You can escape special characters using a backslash before
     * the character. For example, a value of <code>\*amazon\?\\</code>
     * searches for the literal string <code>*amazon?\</code> .
     * 
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
    public DescribeInternetGatewaysResult describeInternetGateways(DescribeInternetGatewaysRequest describeInternetGatewaysRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeInternetGatewaysRequest> request = new DescribeInternetGatewaysRequestMarshaller().marshall(describeInternetGatewaysRequest);
        return invoke(request, new DescribeInternetGatewaysResultStaxUnmarshaller());
    }
    
    /**
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
    public ImportVolumeResult importVolume(ImportVolumeRequest importVolumeRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<ImportVolumeRequest> request = new ImportVolumeRequestMarshaller().marshall(importVolumeRequest);
        return invoke(request, new ImportVolumeResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * The DescribeSecurityGroups operation returns information about
     * security groups that you own.
     * </p>
     * <p>
     * If you specify security group names, information about those security
     * group is returned. Otherwise, information for all security group is
     * returned. If you specify a group that does not exist, a fault is
     * returned.
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
    public DescribeSecurityGroupsResult describeSecurityGroups(DescribeSecurityGroupsRequest describeSecurityGroupsRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeSecurityGroupsRequest> request = new DescribeSecurityGroupsRequestMarshaller().marshall(describeSecurityGroupsRequest);
        return invoke(request, new DescribeSecurityGroupsResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Detaches a VPN gateway from a VPC. You do this if you're planning to
     * turn off the VPC and not use it anymore. You can confirm a VPN gateway
     * has been completely detached from a VPC by describing the VPN gateway
     * (any attachments to the VPN gateway are also described).
     * </p>
     * <p>
     * You must wait for the attachment's state to switch to detached before
     * you can delete the VPC or attach a different VPC to the VPN gateway.
     * </p>
     *
     * @param detachVpnGatewayRequest Container for the necessary parameters
     *           to execute the DetachVpnGateway service method on AmazonEC2.
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
    public void detachVpnGateway(DetachVpnGatewayRequest detachVpnGatewayRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DetachVpnGatewayRequest> request = new DetachVpnGatewayRequestMarshaller().marshall(detachVpnGatewayRequest);
        invoke(request, null);
    }
    
    /**
     * <p>
     * The DeregisterImage operation deregisters an AMI. Once deregistered,
     * instances of the AMI can no longer be launched.
     * </p>
     *
     * @param deregisterImageRequest Container for the necessary parameters
     *           to execute the DeregisterImage service method on AmazonEC2.
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
    public void deregisterImage(DeregisterImageRequest deregisterImageRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DeregisterImageRequest> request = new DeregisterImageRequestMarshaller().marshall(deregisterImageRequest);
        invoke(request, null);
    }
    
    /**
     * <p>
     * Describes the data feed for Spot Instances.
     * </p>
     * <p>
     * For conceptual information about Spot Instances, refer to the Amazon
     * Elastic Compute Cloud Developer Guide or Amazon Elastic Compute Cloud
     * User Guide .
     * 
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
    public DescribeSpotDatafeedSubscriptionResult describeSpotDatafeedSubscription(DescribeSpotDatafeedSubscriptionRequest describeSpotDatafeedSubscriptionRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeSpotDatafeedSubscriptionRequest> request = new DescribeSpotDatafeedSubscriptionRequestMarshaller().marshall(describeSpotDatafeedSubscriptionRequest);
        return invoke(request, new DescribeSpotDatafeedSubscriptionResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Deletes tags from the specified Amazon EC2 resources.
     * </p>
     *
     * @param deleteTagsRequest Container for the necessary parameters to
     *           execute the DeleteTags service method on AmazonEC2.
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
    public void deleteTags(DeleteTagsRequest deleteTagsRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DeleteTagsRequest> request = new DeleteTagsRequestMarshaller().marshall(deleteTagsRequest);
        invoke(request, null);
    }
    
    /**
     * <p>
     * Deletes a subnet from a VPC. You must terminate all running instances
     * in the subnet before deleting it, otherwise Amazon VPC returns an
     * error.
     * </p>
     *
     * @param deleteSubnetRequest Container for the necessary parameters to
     *           execute the DeleteSubnet service method on AmazonEC2.
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
    public void deleteSubnet(DeleteSubnetRequest deleteSubnetRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DeleteSubnetRequest> request = new DeleteSubnetRequestMarshaller().marshall(deleteSubnetRequest);
        invoke(request, null);
    }
    
    /**
     * <p>
     * Creates a new VPN gateway. A VPN gateway is the VPC-side endpoint for
     * your VPN connection. You can create a VPN gateway before creating the
     * VPC itself.
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
    public CreateVpnGatewayResult createVpnGateway(CreateVpnGatewayRequest createVpnGatewayRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<CreateVpnGatewayRequest> request = new CreateVpnGatewayRequestMarshaller().marshall(createVpnGatewayRequest);
        return invoke(request, new CreateVpnGatewayResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Deletes a VPN gateway. Use this when you want to delete a VPC and all
     * its associated components because you no longer need them. We
     * recommend that before you delete a VPN gateway, you detach it from the
     * VPC and delete the VPN connection. Note that you don't need to delete
     * the VPN gateway if you just want to delete and re-create the VPN
     * connection between your VPC and data center.
     * </p>
     *
     * @param deleteVpnGatewayRequest Container for the necessary parameters
     *           to execute the DeleteVpnGateway service method on AmazonEC2.
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
    public void deleteVpnGateway(DeleteVpnGatewayRequest deleteVpnGatewayRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DeleteVpnGatewayRequest> request = new DeleteVpnGatewayRequestMarshaller().marshall(deleteVpnGatewayRequest);
        invoke(request, null);
    }
    
    /**
     * <p>
     * Attach a previously created volume to a running instance.
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
    public AttachVolumeResult attachVolume(AttachVolumeRequest attachVolumeRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<AttachVolumeRequest> request = new AttachVolumeRequestMarshaller().marshall(attachVolumeRequest);
        return invoke(request, new AttachVolumeResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Provides details of a user's registered licenses. Zero or more IDs
     * may be specified on the call. When one or more license IDs are
     * specified, only data for the specified IDs are returned.
     * </p>
     *
     * @param describeLicensesRequest Container for the necessary parameters
     *           to execute the DescribeLicenses service method on AmazonEC2.
     * 
     * @return The response from the DescribeLicenses service method, as
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
    public DescribeLicensesResult describeLicenses(DescribeLicensesRequest describeLicensesRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeLicensesRequest> request = new DescribeLicensesRequestMarshaller().marshall(describeLicensesRequest);
        return invoke(request, new DescribeLicensesResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Activates a specific number of licenses for a 90-day period.
     * Activations can be done against a specific license ID.
     * </p>
     *
     * @param activateLicenseRequest Container for the necessary parameters
     *           to execute the ActivateLicense service method on AmazonEC2.
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
    public void activateLicense(ActivateLicenseRequest activateLicenseRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<ActivateLicenseRequest> request = new ActivateLicenseRequestMarshaller().marshall(activateLicenseRequest);
        invoke(request, null);
    }
    
    /**
     * <p>
     * The ResetImageAttribute operation resets an attribute of an AMI to
     * its default value.
     * </p>
     * <p>
     * <b>NOTE:</b> The productCodes attribute cannot be reset.
     * </p>
     *
     * @param resetImageAttributeRequest Container for the necessary
     *           parameters to execute the ResetImageAttribute service method on
     *           AmazonEC2.
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
    public void resetImageAttribute(ResetImageAttributeRequest resetImageAttributeRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<ResetImageAttributeRequest> request = new ResetImageAttributeRequestMarshaller().marshall(resetImageAttributeRequest);
        invoke(request, null);
    }
    
    /**
     * <p>
     * Gives you information about your VPN connections.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> We strongly recommend you use HTTPS when calling
     * this operation because the response contains sensitive cryptographic
     * information for configuring your customer gateway. You can filter the
     * results to return information only about VPN connections that match
     * criteria you specify. For example, you could ask to get information
     * about a particular VPN connection (or all) only if the VPN's state is
     * pending or available. You can specify multiple filters (e.g., the VPN
     * connection is associated with a particular VPN gateway, and the
     * gateway's state is pending or available). The result includes
     * information for a particular VPN connection only if the VPN connection
     * matches all your filters. If there's no match, no special message is
     * returned; the response is simply empty. The following table shows the
     * available filters.
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
    public DescribeVpnConnectionsResult describeVpnConnections(DescribeVpnConnectionsRequest describeVpnConnectionsRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeVpnConnectionsRequest> request = new DescribeVpnConnectionsRequestMarshaller().marshall(describeVpnConnectionsRequest);
        return invoke(request, new DescribeVpnConnectionsResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Create a snapshot of the volume identified by volume ID. A volume
     * does not have to be detached at the time the snapshot is taken.
     * </p>
     * <p>
     * <b>NOTE:</b> Snapshot creation requires that the system is in a
     * consistent state. For instance, this means that if taking a snapshot
     * of a database, the tables must be read-only locked to ensure that the
     * snapshot will not contain a corrupted version of the database.
     * Therefore, be careful when using this API to ensure that the system
     * remains in the consistent state until the create snapshot status has
     * returned.
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
    public CreateSnapshotResult createSnapshot(CreateSnapshotRequest createSnapshotRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<CreateSnapshotRequest> request = new CreateSnapshotRequestMarshaller().marshall(createSnapshotRequest);
        return invoke(request, new CreateSnapshotResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Deletes a previously created volume. Once successfully deleted, a
     * new volume can be created with the same name.
     * </p>
     *
     * @param deleteVolumeRequest Container for the necessary parameters to
     *           execute the DeleteVolume service method on AmazonEC2.
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
    public void deleteVolume(DeleteVolumeRequest deleteVolumeRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DeleteVolumeRequest> request = new DeleteVolumeRequestMarshaller().marshall(deleteVolumeRequest);
        invoke(request, null);
    }
    
    /**
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
    public CreateNetworkInterfaceResult createNetworkInterface(CreateNetworkInterfaceRequest createNetworkInterfaceRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<CreateNetworkInterfaceRequest> request = new CreateNetworkInterfaceRequestMarshaller().marshall(createNetworkInterfaceRequest);
        return invoke(request, new CreateNetworkInterfaceResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Gives you information about your VPCs. You can filter the results to
     * return information only about VPCs that match criteria you specify.
     * </p>
     * <p>
     * For example, you could ask to get information about a particular VPC
     * or VPCs (or all your VPCs) only if the VPC's state is available. You
     * can specify multiple filters (e.g., the VPC uses one of several sets
     * of DHCP options, and the VPC's state is available). The result
     * includes information for a particular VPC only if the VPC matches all
     * your filters.
     * </p>
     * <p>
     * If there's no match, no special message is returned; the response is
     * simply empty. The following table shows the available filters.
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
    public DescribeVpcsResult describeVpcs(DescribeVpcsRequest describeVpcsRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeVpcsRequest> request = new DescribeVpcsRequestMarshaller().marshall(describeVpcsRequest);
        return invoke(request, new DescribeVpcsResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Deactivates a specific number of licenses. Deactivations can be done
     * against a specific license ID after they have persisted for at least a
     * 90-day period.
     * </p>
     *
     * @param deactivateLicenseRequest Container for the necessary parameters
     *           to execute the DeactivateLicense service method on AmazonEC2.
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
    public void deactivateLicense(DeactivateLicenseRequest deactivateLicenseRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DeactivateLicenseRequest> request = new DeactivateLicenseRequestMarshaller().marshall(deactivateLicenseRequest);
        invoke(request, null);
    }
    
    /**
     * <p>
     * The AssociateAddress operation associates an elastic IP address with
     * an instance.
     * </p>
     * <p>
     * If the IP address is currently assigned to another instance, the IP
     * address is assigned to the new instance. This is an idempotent
     * operation. If you enter it more than once, Amazon EC2 does not return
     * an error.
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
    public AssociateAddressResult associateAddress(AssociateAddressRequest associateAddressRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<AssociateAddressRequest> request = new AssociateAddressRequestMarshaller().marshall(associateAddressRequest);
        return invoke(request, new AssociateAddressResultStaxUnmarshaller());
    }
    
    /**
     *
     * @param cancelConversionTaskRequest Container for the necessary
     *           parameters to execute the CancelConversionTask service method on
     *           AmazonEC2.
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
    public void cancelConversionTask(CancelConversionTaskRequest cancelConversionTaskRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<CancelConversionTaskRequest> request = new CancelConversionTaskRequestMarshaller().marshall(cancelConversionTaskRequest);
        invoke(request, null);
    }
    
    /**
     * <p>
     * Deletes a customer gateway. You must delete the VPN connection before
     * deleting the customer gateway.
     * </p>
     * <p>
     * You can have a single active customer gateway per AWS account (active
     * means that you've created a VPN connection with that customer
     * gateway). AWS might delete any customer gateway you leave inactive for
     * an extended period of time.
     * </p>
     *
     * @param deleteCustomerGatewayRequest Container for the necessary
     *           parameters to execute the DeleteCustomerGateway service method on
     *           AmazonEC2.
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
    public void deleteCustomerGateway(DeleteCustomerGatewayRequest deleteCustomerGatewayRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DeleteCustomerGatewayRequest> request = new DeleteCustomerGatewayRequestMarshaller().marshall(deleteCustomerGatewayRequest);
        invoke(request, null);
    }
    
    /**
     * <p>
     * Creates an entry (i.e., rule) in a network ACL with a rule number you
     * specify. Each network ACL has a set of numbered ingress rules and a
     * separate set of numbered egress rules. When determining whether a
     * packet should be allowed in or out of a subnet associated with the
     * ACL, Amazon VPC processes the entries in the ACL according to the rule
     * numbers, in ascending order.
     * </p>
     * <p>
     * <b>Important:</b> We recommend that you leave room between the rules
     * (e.g., 100, 110, 120, etc.), and not number them sequentially (101,
     * 102, 103, etc.). This allows you to easily add a new rule between
     * existing ones without having to renumber the rules.
     * </p>
     * <p>
     * After you add an entry, you can't modify it; you must either replace
     * it, or create a new entry and delete the old one.
     * </p>
     * <p>
     * For more information about network ACLs, go to Network ACLs in the
     * Amazon Virtual Private Cloud User Guide.
     * </p>
     *
     * @param createNetworkAclEntryRequest Container for the necessary
     *           parameters to execute the CreateNetworkAclEntry service method on
     *           AmazonEC2.
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
    public void createNetworkAclEntry(CreateNetworkAclEntryRequest createNetworkAclEntryRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<CreateNetworkAclEntryRequest> request = new CreateNetworkAclEntryRequestMarshaller().marshall(createNetworkAclEntryRequest);
        invoke(request, null);
    }
    
    /**
     * <p>
     * Detaches an Internet gateway from a VPC, disabling connectivity
     * between the Internet and the VPC. The VPC must not contain any running
     * instances with elastic IP addresses. For more information about your
     * VPC and Internet gateway, go to Amazon Virtual Private Cloud User
     * Guide.
     * </p>
     * <p>
     * For more information about Amazon Virtual Private Cloud and Internet
     * gateways, go to the Amazon Virtual Private Cloud User Guide.
     * </p>
     *
     * @param detachInternetGatewayRequest Container for the necessary
     *           parameters to execute the DetachInternetGateway service method on
     *           AmazonEC2.
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
    public void detachInternetGateway(DetachInternetGatewayRequest detachInternetGatewayRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DetachInternetGatewayRequest> request = new DetachInternetGatewayRequestMarshaller().marshall(detachInternetGatewayRequest);
        invoke(request, null);
    }
    
    /**
     * <p>
     * Creates a new route table within a VPC. After you create a new route
     * table, you can add routes and associate the table with a subnet. For
     * more information about route tables, go to <a
     * azonwebservices.com/AmazonVPC/latest/UserGuide/VPC_Route_Tables.html">
     * Route Tables </a> in the Amazon Virtual Private Cloud User Guide.
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
    public CreateRouteTableResult createRouteTable(CreateRouteTableRequest createRouteTableRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<CreateRouteTableRequest> request = new CreateRouteTableRequestMarshaller().marshall(createRouteTableRequest);
        return invoke(request, new CreateRouteTableResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Describes the status of the indicated volume or, in lieu of any
     * specified, all volumes belonging to the caller. Volumes that have been
     * deleted are not described.
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
    public DescribeVolumesResult describeVolumes(DescribeVolumesRequest describeVolumesRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeVolumesRequest> request = new DescribeVolumesRequestMarshaller().marshall(describeVolumesRequest);
        return invoke(request, new DescribeVolumesResultStaxUnmarshaller());
    }
    
    /**
     *
     * @param reportInstanceStatusRequest Container for the necessary
     *           parameters to execute the ReportInstanceStatus service method on
     *           AmazonEC2.
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
    public void reportInstanceStatus(ReportInstanceStatusRequest reportInstanceStatusRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<ReportInstanceStatusRequest> request = new ReportInstanceStatusRequestMarshaller().marshall(reportInstanceStatusRequest);
        invoke(request, null);
    }
    
    /**
     * <p>
     * Gives you information about your route tables. You can filter the
     * results to return information only about tables that match criteria
     * you specify. For example, you could get information only about a table
     * associated with a particular subnet. You can specify multiple values
     * for the filter. The table must match at least one of the specified
     * values for it to be included in the results.
     * </p>
     * <p>
     * You can specify multiple filters (e.g., the table has a particular
     * route, and is associated with a particular subnet). The result
     * includes information for a particular table only if it matches all
     * your filters. If there's no match, no special message is returned; the
     * response is simply empty.
     * </p>
     * <p>
     * You can use wildcards with the filter values: an asterisk matches
     * zero or more characters, and <code>?</code> matches exactly one
     * character. You can escape special characters using a backslash before
     * the character. For example, a value of <code>\*amazon\?\\</code>
     * searches for the literal string <code>*amazon?\</code> .
     * 
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
    public DescribeRouteTablesResult describeRouteTables(DescribeRouteTablesRequest describeRouteTablesRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeRouteTablesRequest> request = new DescribeRouteTablesRequestMarshaller().marshall(describeRouteTablesRequest);
        return invoke(request, new DescribeRouteTablesResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Gives you information about one or more sets of DHCP options. You can
     * specify one or more DHCP options set IDs, or no IDs (to describe all
     * your sets of DHCP options). The returned information consists of:
     * </p>
     * 
     * <ul>
     * <li> The DHCP options set ID </li>
     * <li> The options </li>
     * 
     * </ul>
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
    public DescribeDhcpOptionsResult describeDhcpOptions(DescribeDhcpOptionsRequest describeDhcpOptionsRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeDhcpOptionsRequest> request = new DescribeDhcpOptionsRequestMarshaller().marshall(describeDhcpOptionsRequest);
        return invoke(request, new DescribeDhcpOptionsResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Enables monitoring for a running instance.
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
    public MonitorInstancesResult monitorInstances(MonitorInstancesRequest monitorInstancesRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<MonitorInstancesRequest> request = new MonitorInstancesRequestMarshaller().marshall(monitorInstancesRequest);
        return invoke(request, new MonitorInstancesResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Gives you information about the network ACLs in your VPC. You can
     * filter the results to return information only about ACLs that match
     * criteria you specify. For example, you could get information only the
     * ACL associated with a particular subnet. The ACL must match at least
     * one of the specified values for it to be included in the results.
     * </p>
     * <p>
     * You can specify multiple filters (e.g., the ACL is associated with a
     * particular subnet and has an egress entry that denies traffic to a
     * particular port). The result includes information for a particular ACL
     * only if it matches all your filters. If there's no match, no special
     * message is returned; the response is simply empty.
     * </p>
     * <p>
     * You can use wildcards with the filter values: an asterisk matches
     * zero or more characters, and <code>?</code> matches exactly one
     * character. You can escape special characters using a backslash before
     * the character. For example, a value of <code>\*amazon\?\\</code>
     * searches for the literal string <code>*amazon?\</code> .
     * 
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
    public DescribeNetworkAclsResult describeNetworkAcls(DescribeNetworkAclsRequest describeNetworkAclsRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeNetworkAclsRequest> request = new DescribeNetworkAclsRequestMarshaller().marshall(describeNetworkAclsRequest);
        return invoke(request, new DescribeNetworkAclsResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * The DescribeBundleTasks operation describes in-progress and recent
     * bundle tasks. Complete and failed tasks are removed from the list a
     * short time after completion. If no bundle ids are given, all bundle
     * tasks are returned.
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
    public DescribeBundleTasksResult describeBundleTasks(DescribeBundleTasksRequest describeBundleTasksRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeBundleTasksRequest> request = new DescribeBundleTasksRequestMarshaller().marshall(describeBundleTasksRequest);
        return invoke(request, new DescribeBundleTasksResultStaxUnmarshaller());
    }
    
    /**
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
    public ImportInstanceResult importInstance(ImportInstanceRequest importInstanceRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<ImportInstanceRequest> request = new ImportInstanceRequestMarshaller().marshall(importInstanceRequest);
        return invoke(request, new ImportInstanceResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * The RevokeSecurityGroupIngress operation revokes permissions from a
     * security group. The permissions used to revoke must be specified using
     * the same values used to grant the permissions.
     * </p>
     * <p>
     * Permissions are specified by IP protocol (TCP, UDP, or ICMP), the
     * source of the request (by IP range or an Amazon EC2 user-group pair),
     * the source and destination port ranges (for TCP and UDP), and the ICMP
     * codes and types (for ICMP).
     * </p>
     * <p>
     * Permission changes are quickly propagated to instances within the
     * security group. However, depending on the number of instances in the
     * group, a small delay might occur.
     * </p>
     *
     * @param revokeSecurityGroupIngressRequest Container for the necessary
     *           parameters to execute the RevokeSecurityGroupIngress service method on
     *           AmazonEC2.
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
    public void revokeSecurityGroupIngress(RevokeSecurityGroupIngressRequest revokeSecurityGroupIngressRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<RevokeSecurityGroupIngressRequest> request = new RevokeSecurityGroupIngressRequestMarshaller().marshall(revokeSecurityGroupIngressRequest);
        invoke(request, null);
    }
    
    /**
     * <p>
     * The GetConsoleOutput operation retrieves console output for the
     * specified instance.
     * </p>
     * <p>
     * Instance console output is buffered and posted shortly after instance
     * boot, reboot, and termination. Amazon EC2 preserves the most recent 64
     * KB output which will be available for at least one hour after the most
     * recent post.
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
    public GetConsoleOutputResult getConsoleOutput(GetConsoleOutputRequest getConsoleOutputRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<GetConsoleOutputRequest> request = new GetConsoleOutputRequestMarshaller().marshall(getConsoleOutputRequest);
        return invoke(request, new GetConsoleOutputResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Creates a new Internet gateway in your AWS account. After creating
     * the Internet gateway, you then attach it to a VPC using
     * <code>AttachInternetGateway</code> . For more information about your
     * VPC and Internet gateway, go to Amazon Virtual Private Cloud User
     * Guide.
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
    public CreateInternetGatewayResult createInternetGateway(CreateInternetGatewayRequest createInternetGatewayRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<CreateInternetGatewayRequest> request = new CreateInternetGatewayRequestMarshaller().marshall(createInternetGatewayRequest);
        return invoke(request, new CreateInternetGatewayResultStaxUnmarshaller());
    }
    
    /**
     *
     * @param detachNetworkInterfaceRequest Container for the necessary
     *           parameters to execute the DetachNetworkInterface service method on
     *           AmazonEC2.
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
    public void detachNetworkInterface(DetachNetworkInterfaceRequest detachNetworkInterfaceRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DetachNetworkInterfaceRequest> request = new DetachNetworkInterfaceRequestMarshaller().marshall(detachNetworkInterfaceRequest);
        invoke(request, null);
    }
    
    /**
     * <p>
     * The ModifyImageAttribute operation modifies an attribute of an AMI.
     * </p>
     *
     * @param modifyImageAttributeRequest Container for the necessary
     *           parameters to execute the ModifyImageAttribute service method on
     *           AmazonEC2.
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
    public void modifyImageAttribute(ModifyImageAttributeRequest modifyImageAttributeRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<ModifyImageAttributeRequest> request = new ModifyImageAttributeRequestMarshaller().marshall(modifyImageAttributeRequest);
        invoke(request, null);
    }
    
    /**
     * <p>
     * Provides information to AWS about your customer gateway device. The
     * customer gateway is the appliance at your end of the VPN connection
     * (compared to the VPN gateway, which is the device at the AWS side of
     * the VPN connection). You can have a single active customer gateway per
     * AWS account (active means that you've created a VPN connection to use
     * with the customer gateway). AWS might delete any customer gateway that
     * you create with this operation if you leave it inactive for an
     * extended period of time.
     * </p>
     * <p>
     * You must provide the Internet-routable IP address of the customer
     * gateway's external interface. The IP address must be static.
     * </p>
     * <p>
     * You must also provide the device's Border Gateway Protocol (BGP)
     * Autonomous System Number (ASN). You can use an existing ASN assigned
     * to your network. If you don't have an ASN already, you can use a
     * private ASN (in the 64512 - 65534 range). For more information about
     * ASNs, go to <a
     * href="http://en.wikipedia.org/wiki/Autonomous_system_%28Internet%29">
     * http://en.wikipedia.org/wiki/Autonomous_system_%28Internet%29 </a> .
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
    public CreateCustomerGatewayResult createCustomerGateway(CreateCustomerGatewayRequest createCustomerGatewayRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<CreateCustomerGatewayRequest> request = new CreateCustomerGatewayRequestMarshaller().marshall(createCustomerGatewayRequest);
        return invoke(request, new CreateCustomerGatewayResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Creates the data feed for Spot Instances, enabling you to view Spot
     * Instance usage logs. You can create one data feed per account.
     * </p>
     * <p>
     * For conceptual information about Spot Instances, refer to the Amazon
     * Elastic Compute Cloud Developer Guide or Amazon Elastic Compute Cloud
     * User Guide .
     * 
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
    public CreateSpotDatafeedSubscriptionResult createSpotDatafeedSubscription(CreateSpotDatafeedSubscriptionRequest createSpotDatafeedSubscriptionRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<CreateSpotDatafeedSubscriptionRequest> request = new CreateSpotDatafeedSubscriptionRequestMarshaller().marshall(createSpotDatafeedSubscriptionRequest);
        return invoke(request, new CreateSpotDatafeedSubscriptionResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Attaches an Internet gateway to a VPC, enabling connectivity between
     * the Internet and the VPC. For more information about your VPC and
     * Internet gateway, go to the Amazon Virtual Private Cloud User Guide.
     * </p>
     *
     * @param attachInternetGatewayRequest Container for the necessary
     *           parameters to execute the AttachInternetGateway service method on
     *           AmazonEC2.
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
    public void attachInternetGateway(AttachInternetGatewayRequest attachInternetGatewayRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<AttachInternetGatewayRequest> request = new AttachInternetGatewayRequestMarshaller().marshall(attachInternetGatewayRequest);
        invoke(request, null);
    }
    
    /**
     * <p>
     * Deletes a VPN connection. Use this if you want to delete a VPC and
     * all its associated components. Another reason to use this operation is
     * if you believe the tunnel credentials for your VPN connection have
     * been compromised. In that situation, you can delete the VPN connection
     * and create a new one that has new keys, without needing to delete the
     * VPC or VPN gateway. If you create a new VPN connection, you must
     * reconfigure the customer gateway using the new configuration
     * information returned with the new VPN connection ID.
     * </p>
     * <p>
     * If you're deleting the VPC and all its associated parts, we recommend
     * you detach the VPN gateway from the VPC and delete the VPC before
     * deleting the VPN connection.
     * </p>
     *
     * @param deleteVpnConnectionRequest Container for the necessary
     *           parameters to execute the DeleteVpnConnection service method on
     *           AmazonEC2.
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
    public void deleteVpnConnection(DeleteVpnConnectionRequest deleteVpnConnectionRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DeleteVpnConnectionRequest> request = new DeleteVpnConnectionRequestMarshaller().marshall(deleteVpnConnectionRequest);
        invoke(request, null);
    }
    
    /**
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
    public DescribeConversionTasksResult describeConversionTasks(DescribeConversionTasksRequest describeConversionTasksRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeConversionTasksRequest> request = new DescribeConversionTasksRequestMarshaller().marshall(describeConversionTasksRequest);
        return invoke(request, new DescribeConversionTasksResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Creates a new VPN connection between an existing VPN gateway and
     * customer gateway. The only supported connection type is ipsec.1.
     * </p>
     * <p>
     * The response includes information that you need to configure your
     * customer gateway, in XML format. We recommend you use the command line
     * version of this operation ( <code>ec2-create-vpn-connection</code> ),
     * which takes an <code>-f</code> option (for format) and returns
     * configuration information formatted as expected by the vendor you
     * specified, or in a generic, human readable format. For information
     * about the command, go to <code>ec2-create-vpn-connection</code> in the
     * Amazon Virtual Private Cloud Command Line Reference.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> We strongly recommend you use HTTPS when calling
     * this operation because the response contains sensitive cryptographic
     * information for configuring your customer gateway. If you decide to
     * shut down your VPN connection for any reason and then create a new
     * one, you must re-configure your customer gateway with the new
     * information returned from this call.
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
    public CreateVpnConnectionResult createVpnConnection(CreateVpnConnectionRequest createVpnConnectionRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<CreateVpnConnectionRequest> request = new CreateVpnConnectionRequestMarshaller().marshall(createVpnConnectionRequest);
        return invoke(request, new CreateVpnConnectionResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Returns information about an attribute of an instance. Only one
     * attribute can be specified per call.
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
    public DescribeInstanceAttributeResult describeInstanceAttribute(DescribeInstanceAttributeRequest describeInstanceAttributeRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeInstanceAttributeRequest> request = new DescribeInstanceAttributeRequestMarshaller().marshall(describeInstanceAttributeRequest);
        return invoke(request, new DescribeInstanceAttributeResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Gives you information about your subnets. You can filter the results
     * to return information only about subnets that match criteria you
     * specify.
     * </p>
     * <p>
     * For example, you could ask to get information about a particular
     * subnet (or all) only if the subnet's state is available. You can
     * specify multiple filters (e.g., the subnet is in a particular VPC, and
     * the subnet's state is available).
     * </p>
     * <p>
     * The result includes information for a particular subnet only if the
     * subnet matches all your filters. If there's no match, no special
     * message is returned; the response is simply empty. The following table
     * shows the available filters.
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
    public DescribeSubnetsResult describeSubnets(DescribeSubnetsRequest describeSubnetsRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeSubnetsRequest> request = new DescribeSubnetsRequestMarshaller().marshall(describeSubnetsRequest);
        return invoke(request, new DescribeSubnetsResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * The RunInstances operation launches a specified number of instances.
     * </p>
     * <p>
     * If Amazon EC2 cannot launch the minimum number AMIs you request, no
     * instances launch. If there is insufficient capacity to launch the
     * maximum number of AMIs you request, Amazon EC2 launches as many as
     * possible to satisfy the requested maximum values.
     * </p>
     * <p>
     * Every instance is launched in a security group. If you do not specify
     * a security group at launch, the instances start in your default
     * security group. For more information on creating security groups, see
     * CreateSecurityGroup.
     * </p>
     * <p>
     * An optional instance type can be specified. For information about
     * instance types, see Instance Types.
     * </p>
     * <p>
     * You can provide an optional key pair ID for each image in the launch
     * request (for more information, see CreateKeyPair). All instances that
     * are created from images that use this key pair will have access to the
     * associated public key at boot. You can use this key to provide secure
     * access to an instance of an image on a per-instance basis. Amazon EC2
     * public images use this feature to provide secure access without
     * passwords.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> Launching public images without a key pair ID will
     * leave them inaccessible. The public key material is made available to
     * the instance at boot time by placing it in the openssh_id.pub file on
     * a logical device that is exposed to the instance as /dev/sda2 (the
     * ephemeral store). The format of this file is suitable for use as an
     * entry within ~/.ssh/authorized_keys (the OpenSSH format). This can be
     * done at boot (e.g., as part of rc.local) allowing for secure access
     * without passwords. Optional user data can be provided in the launch
     * request. All instances that collectively comprise the launch request
     * have access to this data For more information, see Instance Metadata.
     * </p>
     * <p>
     * <b>NOTE:</b> If any of the AMIs have a product code attached for which
     * the user has not subscribed, the RunInstances call will fail.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> We strongly recommend using the 2.6.18 Xen stock
     * kernel with the c1.medium and c1.xlarge instances. Although the
     * default Amazon EC2 kernels will work, the new kernels provide greater
     * stability and performance for these instance types. For more
     * information about kernels, see Kernels, RAM Disks, and Block Device
     * Mappings.
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
    public RunInstancesResult runInstances(RunInstancesRequest runInstancesRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<RunInstancesRequest> request = new RunInstancesRequestMarshaller().marshall(runInstancesRequest);
        return invoke(request, new RunInstancesResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Returns information about one or more PlacementGroup instances in a
     * user's account.
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
    public DescribePlacementGroupsResult describePlacementGroups(DescribePlacementGroupsRequest describePlacementGroupsRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DescribePlacementGroupsRequest> request = new DescribePlacementGroupsRequestMarshaller().marshall(describePlacementGroupsRequest);
        return invoke(request, new DescribePlacementGroupsResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Associates a subnet with a route table. The subnet and route table
     * must be in the same VPC. This association causes traffic originating
     * from the subnet to be routed according to the routes in the route
     * table. The action returns an association ID, which you need if you
     * want to disassociate the route table from the subnet later. A route
     * table can be associated with multiple subnets.
     * </p>
     * <p>
     * For more information about route tables, go to <a
     * azonwebservices.com/AmazonVPC/latest/UserGuide/VPC_Route_Tables.html">
     * Route Tables </a> in the Amazon Virtual Private Cloud User Guide.
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
    public AssociateRouteTableResult associateRouteTable(AssociateRouteTableRequest associateRouteTableRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<AssociateRouteTableRequest> request = new AssociateRouteTableRequestMarshaller().marshall(associateRouteTableRequest);
        return invoke(request, new AssociateRouteTableResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * The DescribeInstances operation returns information about instances
     * that you own.
     * </p>
     * <p>
     * If you specify one or more instance IDs, Amazon EC2 returns
     * information for those instances. If you do not specify instance IDs,
     * Amazon EC2 returns information for all relevant instances. If you
     * specify an invalid instance ID, a fault is returned. If you specify an
     * instance that you do not own, it will not be included in the returned
     * results.
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
    public DescribeInstancesResult describeInstances(DescribeInstancesRequest describeInstancesRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeInstancesRequest> request = new DescribeInstancesRequestMarshaller().marshall(describeInstancesRequest);
        return invoke(request, new DescribeInstancesResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Deletes a network ACL from a VPC. The ACL must not have any subnets
     * associated with it. You can't delete the default network ACL. For more
     * information about network ACLs, go to Network ACLs in the Amazon
     * Virtual Private Cloud User Guide.
     * </p>
     *
     * @param deleteNetworkAclRequest Container for the necessary parameters
     *           to execute the DeleteNetworkAcl service method on AmazonEC2.
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
    public void deleteNetworkAcl(DeleteNetworkAclRequest deleteNetworkAclRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DeleteNetworkAclRequest> request = new DeleteNetworkAclRequestMarshaller().marshall(deleteNetworkAclRequest);
        invoke(request, null);
    }
    
    /**
     * <p>
     * The DescribeImages operation returns information about AMIs, AKIs,
     * and ARIs available to the user. Information returned includes image
     * type, product codes, architecture, and kernel and RAM disk IDs. Images
     * available to the user include public images available for any user to
     * launch, private images owned by the user making the request, and
     * private images owned by other users for which the user has explicit
     * launch permissions.
     * </p>
     * <p>
     * Launch permissions fall into three categories:
     * </p>
     * 
     * <ul>
     * <li> <b>Public:</b> The owner of the AMI granted launch permissions
     * for the AMI to the all group. All users have launch permissions for
     * these AMIs. </li>
     * <li> <b>Explicit:</b> The owner of the AMI granted launch permissions
     * to a specific user. </li>
     * <li> <b>Implicit:</b> A user has implicit launch permissions for all
     * AMIs he or she owns. </li>
     * 
     * </ul>
     * <p>
     * The list of AMIs returned can be modified by specifying AMI IDs, AMI
     * owners, or users with launch permissions. If no options are specified,
     * Amazon EC2 returns all AMIs for which the user has launch permissions.
     * </p>
     * <p>
     * If you specify one or more AMI IDs, only AMIs that have the specified
     * IDs are returned. If you specify an invalid AMI ID, a fault is
     * returned. If you specify an AMI ID for which you do not have access,
     * it will not be included in the returned results.
     * </p>
     * <p>
     * If you specify one or more AMI owners, only AMIs from the specified
     * owners and for which you have access are returned. The results can
     * include the account IDs of the specified owners, amazon for AMIs owned
     * by Amazon or self for AMIs that you own.
     * </p>
     * <p>
     * If you specify a list of executable users, only users that have
     * launch permissions for the AMIs are returned. You can specify account
     * IDs (if you own the AMI(s)), self for AMIs for which you own or have
     * explicit permissions, or all for public AMIs.
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
    public DescribeImagesResult describeImages(DescribeImagesRequest describeImagesRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeImagesRequest> request = new DescribeImagesRequestMarshaller().marshall(describeImagesRequest);
        return invoke(request, new DescribeImagesResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Starts an instance that uses an Amazon EBS volume as its root device.
     * Instances that use Amazon EBS volumes as their root devices can be
     * quickly stopped and started. When an instance is stopped, the compute
     * resources are released and you are not billed for hourly instance
     * usage. However, your root partition Amazon EBS volume remains,
     * continues to persist your data, and you are charged for Amazon EBS
     * volume usage. You can restart your instance at any time.
     * </p>
     * <p>
     * <b>NOTE:</b> Performing this operation on an instance that uses an
     * instance store as its root device returns an error.
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
    public StartInstancesResult startInstances(StartInstancesRequest startInstancesRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<StartInstancesRequest> request = new StartInstancesRequestMarshaller().marshall(startInstancesRequest);
        return invoke(request, new StartInstancesResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Modifies an attribute of an instance.
     * </p>
     *
     * @param modifyInstanceAttributeRequest Container for the necessary
     *           parameters to execute the ModifyInstanceAttribute service method on
     *           AmazonEC2.
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
    public void modifyInstanceAttribute(ModifyInstanceAttributeRequest modifyInstanceAttributeRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<ModifyInstanceAttributeRequest> request = new ModifyInstanceAttributeRequestMarshaller().marshall(modifyInstanceAttributeRequest);
        invoke(request, null);
    }
    
    /**
     * <p>
     * Deletes a set of DHCP options that you specify. Amazon VPC returns an
     * error if the set of options you specify is currently associated with a
     * VPC. You can disassociate the set of options by associating either a
     * new set of options or the default options with the VPC.
     * </p>
     *
     * @param deleteDhcpOptionsRequest Container for the necessary parameters
     *           to execute the DeleteDhcpOptions service method on AmazonEC2.
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
    public void deleteDhcpOptions(DeleteDhcpOptionsRequest deleteDhcpOptionsRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DeleteDhcpOptionsRequest> request = new DeleteDhcpOptionsRequestMarshaller().marshall(deleteDhcpOptionsRequest);
        invoke(request, null);
    }
    
    /**
     * <p>
     * The AuthorizeSecurityGroupIngress operation adds permissions to a
     * security group.
     * </p>
     * <p>
     * Permissions are specified by the IP protocol (TCP, UDP or ICMP), the
     * source of the request (by IP range or an Amazon EC2 user-group pair),
     * the source and destination port ranges (for TCP and UDP), and the ICMP
     * codes and types (for ICMP). When authorizing ICMP, <code>-1</code> can
     * be used as a wildcard in the type and code fields.
     * </p>
     * <p>
     * Permission changes are propagated to instances within the security
     * group as quickly as possible. However, depending on the number of
     * instances, a small delay might occur.
     * </p>
     *
     * @param authorizeSecurityGroupIngressRequest Container for the
     *           necessary parameters to execute the AuthorizeSecurityGroupIngress
     *           service method on AmazonEC2.
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
    public void authorizeSecurityGroupIngress(AuthorizeSecurityGroupIngressRequest authorizeSecurityGroupIngressRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<AuthorizeSecurityGroupIngressRequest> request = new AuthorizeSecurityGroupIngressRequestMarshaller().marshall(authorizeSecurityGroupIngressRequest);
        invoke(request, null);
    }
    
    /**
     * <p>
     * Describes Spot Instance requests. Spot Instances are instances that
     * Amazon EC2 starts on your behalf when the maximum price that you
     * specify exceeds the current Spot Price. Amazon EC2 periodically sets
     * the Spot Price based on available Spot Instance capacity and current
     * spot instance requests. For conceptual information about Spot
     * Instances, refer to the <a
     * "http://docs.amazonwebservices.com/AWSEC2/2010-08-31/DeveloperGuide/">
     * Amazon Elastic Compute Cloud Developer Guide </a> or <a
     * href="http://docs.amazonwebservices.com/AWSEC2/2010-08-31/UserGuide/">
     * Amazon Elastic Compute Cloud User Guide </a> .
     * </p>
     * <p>
     * You can filter the results to return information only about Spot
     * Instance requests that match criteria you specify. For example, you
     * could get information about requests where the Spot Price you
     * specified is a certain value (you can't use greater than or less than
     * comparison, but you can use <code>*</code> and <code>?</code>
     * wildcards). You can specify multiple values for a filter. A Spot
     * Instance request must match at least one of the specified values for
     * it to be included in the results.
     * </p>
     * <p>
     * You can specify multiple filters (e.g., the Spot Price is equal to a
     * particular value, and the instance type is <code>m1.small</code> ).
     * The result includes information for a particular request only if it
     * matches all your filters. If there's no match, no special message is
     * returned; the response is simply empty.
     * </p>
     * <p>
     * You can use wildcards with the filter values: an asterisk matches
     * zero or more characters, and <code>?</code> matches exactly one
     * character. You can escape special characters using a backslash before
     * the character. For example, a value of <code>\*amazon\?\\</code>
     * searches for the literal string <code>*amazon?\</code> .
     * 
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
    public DescribeSpotInstanceRequestsResult describeSpotInstanceRequests(DescribeSpotInstanceRequestsRequest describeSpotInstanceRequestsRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeSpotInstanceRequestsRequest> request = new DescribeSpotInstanceRequestsRequestMarshaller().marshall(describeSpotInstanceRequestsRequest);
        return invoke(request, new DescribeSpotInstanceRequestsResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Creates a VPC with the CIDR block you specify. The smallest VPC you
     * can create uses a <code>/28</code> netmask (16 IP addresses), and the
     * largest uses a <code>/18</code> netmask (16,384 IP addresses). To help
     * you decide how big to make your VPC, go to the topic about creating
     * VPCs in the Amazon Virtual Private Cloud Developer Guide.
     * </p>
     * <p>
     * By default, each instance you launch in the VPC has the default DHCP
     * options (the standard EC2 host name, no domain name, no DNS server, no
     * NTP server, and no NetBIOS server or node type).
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
    public CreateVpcResult createVpc(CreateVpcRequest createVpcRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<CreateVpcRequest> request = new CreateVpcRequestMarshaller().marshall(createVpcRequest);
        return invoke(request, new CreateVpcResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Gives you information about your customer gateways. You can filter
     * the results to return information only about customer gateways that
     * match criteria you specify. For example, you could ask to get
     * information about a particular customer gateway (or all) only if the
     * gateway's state is pending or available. You can specify multiple
     * filters (e.g., the customer gateway has a particular IP address for
     * the Internet-routable external interface, and the gateway's state is
     * pending or available). The result includes information for a
     * particular customer gateway only if the gateway matches all your
     * filters. If there's no match, no special message is returned; the
     * response is simply empty. The following table shows the available
     * filters.
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
    public DescribeCustomerGatewaysResult describeCustomerGateways(DescribeCustomerGatewaysRequest describeCustomerGatewaysRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeCustomerGatewaysRequest> request = new DescribeCustomerGatewaysRequestMarshaller().marshall(describeCustomerGatewaysRequest);
        return invoke(request, new DescribeCustomerGatewaysResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Creates a new route in a route table within a VPC. The route's target
     * can be either a gateway attached to the VPC or a NAT instance in the
     * VPC.
     * </p>
     * <p>
     * When determining how to route traffic, we use the route with the most
     * specific match. For example, let's say the traffic is destined for
     * <code>192.0.2.3</code> , and the route table includes the following
     * two routes:
     * </p>
     * 
     * <ul>
     * <li> <code>192.0.2.0/24</code> (goes to some target A) </li>
     * <li> <code>192.0.2.0/28</code> (goes to some target B) </li>
     * 
     * </ul>
     * <p>
     * Both routes apply to the traffic destined for <code>192.0.2.3</code>
     * . However, the second route in the list is more specific, so we use
     * that route to determine where to target the traffic.
     * </p>
     * <p>
     * For more information about route tables, go to <a
     * azonwebservices.com/AmazonVPC/latest/UserGuide/VPC_Route_Tables.html">
     * Route Tables </a> in the Amazon Virtual Private Cloud User Guide.
     * </p>
     *
     * @param createRouteRequest Container for the necessary parameters to
     *           execute the CreateRoute service method on AmazonEC2.
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
    public void createRoute(CreateRouteRequest createRouteRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<CreateRouteRequest> request = new CreateRouteRequestMarshaller().marshall(createRouteRequest);
        invoke(request, null);
    }
    
    /**
     *
     * @param modifyNetworkInterfaceAttributeRequest Container for the
     *           necessary parameters to execute the ModifyNetworkInterfaceAttribute
     *           service method on AmazonEC2.
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
    public void modifyNetworkInterfaceAttribute(ModifyNetworkInterfaceAttributeRequest modifyNetworkInterfaceAttributeRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<ModifyNetworkInterfaceAttributeRequest> request = new ModifyNetworkInterfaceAttributeRequestMarshaller().marshall(modifyNetworkInterfaceAttributeRequest);
        invoke(request, null);
    }
    
    /**
     * <p>
     * Deletes a route table from a VPC. The route table must not be
     * associated with a subnet. You can't delete the main route table. For
     * more information about route tables, go to <a
     * azonwebservices.com/AmazonVPC/latest/UserGuide/VPC_Route_Tables.html">
     * Route Tables </a> in the Amazon Virtual Private Cloud User Guide.
     * </p>
     *
     * @param deleteRouteTableRequest Container for the necessary parameters
     *           to execute the DeleteRouteTable service method on AmazonEC2.
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
    public void deleteRouteTable(DeleteRouteTableRequest deleteRouteTableRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DeleteRouteTableRequest> request = new DeleteRouteTableRequestMarshaller().marshall(deleteRouteTableRequest);
        invoke(request, null);
    }
    
    /**
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
    public DescribeNetworkInterfaceAttributeResult describeNetworkInterfaceAttribute(DescribeNetworkInterfaceAttributeRequest describeNetworkInterfaceAttributeRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeNetworkInterfaceAttributeRequest> request = new DescribeNetworkInterfaceAttributeRequestMarshaller().marshall(describeNetworkInterfaceAttributeRequest);
        return invoke(request, new DescribeNetworkInterfaceAttributeResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Creates a Spot Instance request.
     * </p>
     * <p>
     * Spot Instances are instances that Amazon EC2 starts on your behalf
     * when the maximum price that you specify exceeds the current Spot
     * Price. Amazon EC2 periodically sets the Spot Price based on available
     * Spot Instance capacity and current spot instance requests.
     * </p>
     * <p>
     * For conceptual information about Spot Instances, refer to the Amazon
     * Elastic Compute Cloud Developer Guide or Amazon Elastic Compute Cloud
     * User Guide.
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
    public RequestSpotInstancesResult requestSpotInstances(RequestSpotInstancesRequest requestSpotInstancesRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<RequestSpotInstancesRequest> request = new RequestSpotInstancesRequestMarshaller().marshall(requestSpotInstancesRequest);
        return invoke(request, new RequestSpotInstancesResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Adds or overwrites tags for the specified resources. Each resource
     * can have a maximum of 10 tags. Each tag consists of a key-value pair.
     * Tag keys must be unique per resource.
     * </p>
     *
     * @param createTagsRequest Container for the necessary parameters to
     *           execute the CreateTags service method on AmazonEC2.
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
    public void createTags(CreateTagsRequest createTagsRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<CreateTagsRequest> request = new CreateTagsRequestMarshaller().marshall(createTagsRequest);
        invoke(request, null);
    }
    
    /**
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
    public AttachNetworkInterfaceResult attachNetworkInterface(AttachNetworkInterfaceRequest attachNetworkInterfaceRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<AttachNetworkInterfaceRequest> request = new AttachNetworkInterfaceRequestMarshaller().marshall(attachNetworkInterfaceRequest);
        return invoke(request, new AttachNetworkInterfaceResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Replaces an existing route within a route table in a VPC. For more
     * information about route tables, go to <a
     * azonwebservices.com/AmazonVPC/latest/UserGuide/VPC_Route_Tables.html">
     * Route Tables </a> in the Amazon Virtual Private Cloud User Guide.
     * </p>
     *
     * @param replaceRouteRequest Container for the necessary parameters to
     *           execute the ReplaceRoute service method on AmazonEC2.
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
    public void replaceRoute(ReplaceRouteRequest replaceRouteRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<ReplaceRouteRequest> request = new ReplaceRouteRequestMarshaller().marshall(replaceRouteRequest);
        invoke(request, null);
    }
    
    /**
     * <p>
     * Describes the tags for the specified resources.
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
    public DescribeTagsResult describeTags(DescribeTagsRequest describeTagsRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeTagsRequest> request = new DescribeTagsRequestMarshaller().marshall(describeTagsRequest);
        return invoke(request, new DescribeTagsResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * CancelBundleTask operation cancels a pending or in-progress bundling
     * task. This is an asynchronous call and it make take a while for the
     * task to be canceled. If a task is canceled while it is storing items,
     * there may be parts of the incomplete AMI stored in S3. It is up to the
     * caller to clean up these parts from S3.
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
    public CancelBundleTaskResult cancelBundleTask(CancelBundleTaskRequest cancelBundleTaskRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<CancelBundleTaskRequest> request = new CancelBundleTaskRequestMarshaller().marshall(cancelBundleTaskRequest);
        return invoke(request, new CancelBundleTaskResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Cancels one or more Spot Instance requests.
     * </p>
     * <p>
     * Spot Instances are instances that Amazon EC2 starts on your behalf
     * when the maximum price that you specify exceeds the current Spot
     * Price. Amazon EC2 periodically sets the Spot Price based on available
     * Spot Instance capacity and current spot instance requests.
     * </p>
     * <p>
     * For conceptual information about Spot Instances, refer to the Amazon
     * Elastic Compute Cloud Developer Guide or Amazon Elastic Compute Cloud
     * User Guide .
     * 
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
    public CancelSpotInstanceRequestsResult cancelSpotInstanceRequests(CancelSpotInstanceRequestsRequest cancelSpotInstanceRequestsRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<CancelSpotInstanceRequestsRequest> request = new CancelSpotInstanceRequestsRequestMarshaller().marshall(cancelSpotInstanceRequestsRequest);
        return invoke(request, new CancelSpotInstanceRequestsResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * The PurchaseReservedInstancesOffering operation purchases a Reserved
     * Instance for use with your account. With Amazon EC2 Reserved
     * Instances, you purchase the right to launch Amazon EC2 instances for a
     * period of time (without getting insufficient capacity errors) and pay
     * a lower usage rate for the actual time used.
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
    public PurchaseReservedInstancesOfferingResult purchaseReservedInstancesOffering(PurchaseReservedInstancesOfferingRequest purchaseReservedInstancesOfferingRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<PurchaseReservedInstancesOfferingRequest> request = new PurchaseReservedInstancesOfferingRequestMarshaller().marshall(purchaseReservedInstancesOfferingRequest);
        return invoke(request, new PurchaseReservedInstancesOfferingResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Adds or remove permission settings for the specified snapshot.
     * </p>
     *
     * @param modifySnapshotAttributeRequest Container for the necessary
     *           parameters to execute the ModifySnapshotAttribute service method on
     *           AmazonEC2.
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
    public void modifySnapshotAttribute(ModifySnapshotAttributeRequest modifySnapshotAttributeRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<ModifySnapshotAttributeRequest> request = new ModifySnapshotAttributeRequestMarshaller().marshall(modifySnapshotAttributeRequest);
        invoke(request, null);
    }
    
    /**
     * <p>
     * The TerminateInstances operation shuts down one or more instances.
     * This operation is idempotent; if you terminate an instance more than
     * once, each call will succeed.
     * </p>
     * <p>
     * Terminated instances will remain visible after termination
     * (approximately one hour).
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
    public TerminateInstancesResult terminateInstances(TerminateInstancesRequest terminateInstancesRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<TerminateInstancesRequest> request = new TerminateInstancesRequestMarshaller().marshall(terminateInstancesRequest);
        return invoke(request, new TerminateInstancesResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Deletes the data feed for Spot Instances.
     * </p>
     * <p>
     * For conceptual information about Spot Instances, refer to the Amazon
     * Elastic Compute Cloud Developer Guide or Amazon Elastic Compute Cloud
     * User Guide .
     * 
     * </p>
     *
     * @param deleteSpotDatafeedSubscriptionRequest Container for the
     *           necessary parameters to execute the DeleteSpotDatafeedSubscription
     *           service method on AmazonEC2.
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
    public void deleteSpotDatafeedSubscription(DeleteSpotDatafeedSubscriptionRequest deleteSpotDatafeedSubscriptionRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DeleteSpotDatafeedSubscriptionRequest> request = new DeleteSpotDatafeedSubscriptionRequestMarshaller().marshall(deleteSpotDatafeedSubscriptionRequest);
        invoke(request, null);
    }
    
    /**
     * <p>
     * Deletes an Internet gateway from your AWS account. The gateway must
     * not be attached to a VPC. For more information about your VPC and
     * Internet gateway, go to Amazon Virtual Private Cloud User Guide.
     * </p>
     *
     * @param deleteInternetGatewayRequest Container for the necessary
     *           parameters to execute the DeleteInternetGateway service method on
     *           AmazonEC2.
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
    public void deleteInternetGateway(DeleteInternetGatewayRequest deleteInternetGatewayRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DeleteInternetGatewayRequest> request = new DeleteInternetGatewayRequestMarshaller().marshall(deleteInternetGatewayRequest);
        invoke(request, null);
    }
    
    /**
     * <p>
     * Returns information about an attribute of a snapshot. Only one
     * attribute can be specified per call.
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
    public DescribeSnapshotAttributeResult describeSnapshotAttribute(DescribeSnapshotAttributeRequest describeSnapshotAttributeRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeSnapshotAttributeRequest> request = new DescribeSnapshotAttributeRequestMarshaller().marshall(describeSnapshotAttributeRequest);
        return invoke(request, new DescribeSnapshotAttributeResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Changes the route table associated with a given subnet in a VPC.
     * After you execute this action, the subnet uses the routes in the new
     * route table it's associated with. For more information about route
     * tables, go to <a
     * azonwebservices.com/AmazonVPC/latest/UserGuide/VPC_Route_Tables.html">
     * Route Tables </a> in the Amazon Virtual Private Cloud User Guide.
     * </p>
     * <p>
     * You can also use this to change which table is the main route table
     * in the VPC. You just specify the main route table's association ID and
     * the route table that you want to be the new main route table.
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
    public ReplaceRouteTableAssociationResult replaceRouteTableAssociation(ReplaceRouteTableAssociationRequest replaceRouteTableAssociationRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<ReplaceRouteTableAssociationRequest> request = new ReplaceRouteTableAssociationRequestMarshaller().marshall(replaceRouteTableAssociationRequest);
        return invoke(request, new ReplaceRouteTableAssociationResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * The DescribeAddresses operation lists elastic IP addresses assigned
     * to your account.
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
    public DescribeAddressesResult describeAddresses(DescribeAddressesRequest describeAddressesRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeAddressesRequest> request = new DescribeAddressesRequestMarshaller().marshall(describeAddressesRequest);
        return invoke(request, new DescribeAddressesResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * The DescribeImageAttribute operation returns information about an
     * attribute of an AMI. Only one attribute can be specified per call.
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
    public DescribeImageAttributeResult describeImageAttribute(DescribeImageAttributeRequest describeImageAttributeRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeImageAttributeRequest> request = new DescribeImageAttributeRequestMarshaller().marshall(describeImageAttributeRequest);
        return invoke(request, new DescribeImageAttributeResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * The DescribeKeyPairs operation returns information about key pairs
     * available to you. If you specify key pairs, information about those
     * key pairs is returned. Otherwise, information for all registered key
     * pairs is returned.
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
    public DescribeKeyPairsResult describeKeyPairs(DescribeKeyPairsRequest describeKeyPairsRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeKeyPairsRequest> request = new DescribeKeyPairsRequestMarshaller().marshall(describeKeyPairsRequest);
        return invoke(request, new DescribeKeyPairsResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * The ConfirmProductInstance operation returns true if the specified
     * product code is attached to the specified instance. The operation
     * returns false if the product code is not attached to the instance.
     * </p>
     * <p>
     * The ConfirmProductInstance operation can only be executed by the
     * owner of the AMI. This feature is useful when an AMI owner is
     * providing support and wants to verify whether a user's instance is
     * eligible.
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
    public ConfirmProductInstanceResult confirmProductInstance(ConfirmProductInstanceRequest confirmProductInstanceRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<ConfirmProductInstanceRequest> request = new ConfirmProductInstanceRequestMarshaller().marshall(confirmProductInstanceRequest);
        return invoke(request, new ConfirmProductInstanceResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Disassociates a subnet from a route table.
     * </p>
     * <p>
     * After you perform this action, the subnet no longer uses the routes
     * in the route table. Instead it uses the routes in the VPC's main route
     * table. For more information about route tables, go to <a
     * azonwebservices.com/AmazonVPC/latest/UserGuide/VPC_Route_Tables.html">
     * Route Tables </a> in the Amazon Virtual Private Cloud User Guide.
     * </p>
     *
     * @param disassociateRouteTableRequest Container for the necessary
     *           parameters to execute the DisassociateRouteTable service method on
     *           AmazonEC2.
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
    public void disassociateRouteTable(DisassociateRouteTableRequest disassociateRouteTableRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DisassociateRouteTableRequest> request = new DisassociateRouteTableRequestMarshaller().marshall(disassociateRouteTableRequest);
        invoke(request, null);
    }
    
    /**
     * <p>
     * This action applies only to security groups in a VPC. It doesn't work
     * with EC2 security groups. For information about Amazon Virtual Private
     * Cloud and VPC security groups, go to the Amazon Virtual Private Cloud
     * User Guide.
     * </p>
     * <p>
     * The action removes one or more egress rules from a VPC security
     * group. The values that you specify in the revoke request (e.g., ports,
     * etc.) must match the existing rule's values in order for the rule to
     * be revoked.
     * </p>
     * <p>
     * Each rule consists of the protocol, and the CIDR range or destination
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
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void revokeSecurityGroupEgress(RevokeSecurityGroupEgressRequest revokeSecurityGroupEgressRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<RevokeSecurityGroupEgressRequest> request = new RevokeSecurityGroupEgressRequestMarshaller().marshall(revokeSecurityGroupEgressRequest);
        invoke(request, null);
    }
    
    /**
     * <p>
     * Deletes an ingress or egress entry (i.e., rule) from a network ACL.
     * For more information about network ACLs, go to Network ACLs in the
     * Amazon Virtual Private Cloud User Guide.
     * </p>
     *
     * @param deleteNetworkAclEntryRequest Container for the necessary
     *           parameters to execute the DeleteNetworkAclEntry service method on
     *           AmazonEC2.
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
    public void deleteNetworkAclEntry(DeleteNetworkAclEntryRequest deleteNetworkAclEntryRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DeleteNetworkAclEntryRequest> request = new DeleteNetworkAclEntryRequestMarshaller().marshall(deleteNetworkAclEntryRequest);
        invoke(request, null);
    }
    
    /**
     * <p>
     * Initializes an empty volume of a given size.
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
    public CreateVolumeResult createVolume(CreateVolumeRequest createVolumeRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<CreateVolumeRequest> request = new CreateVolumeRequestMarshaller().marshall(createVolumeRequest);
        return invoke(request, new CreateVolumeResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Describes the status of an Amazon Elastic Compute Cloud (Amazon EC2)
     * instance. Instance status provides information about two types of
     * scheduled events for an instance that may require your attention:
     * </p>
     * 
     * <ul>
     * <li> Scheduled Reboot: When Amazon EC2 determines that an instance
     * must be rebooted, the instance's status will return one of two event
     * codes: <code>system-reboot</code> or <code>instance-reboot</code> .
     * System reboot commonly occurs if certain maintenance or upgrade
     * operations require a reboot of the underlying host that supports an
     * instance. Instance reboot commonly occurs if the instance must be
     * rebooted, rather than the underlying host. Rebooting events include a
     * scheduled start and end time. </li>
     * <li> Scheduled Retirement: When Amazon EC2 determines that an
     * instance must be shut down, the instance's status will return an event
     * code called <code>instance-retirement</code> . Retirement commonly
     * occurs when the underlying host is degraded and must be replaced.
     * Retirement events include a scheduled start and end time. You're also
     * notified by email if one of your instances is set to retiring. The
     * email message indicates when your instance will be permanently
     * retired. </li>
     * 
     * </ul>
     * <p>
     * If your instance is permanently retired, it will not be restarted.
     * You can avoid retirement by manually restarting your instance when its
     * event code is <code>instance-retirement</code> . This ensures that
     * your instance is started on a healthy host.
     * </p>
     * <p>
     * <code>DescribeInstanceStatus</code> returns information only for
     * instances in the running state.
     * </p>
     * <p>
     * You can filter the results to return information only about instances
     * that match criteria you specify. For example, you could get
     * information about instances in a specific Availability Zone. You can
     * specify multiple values for a filter (e.g., more than one Availability
     * Zone). An instance must match at least one of the specified values for
     * it to be included in the results.
     * </p>
     * <p>
     * You can specify multiple filters. An instance must match all the
     * filters for it to be included in the results. If there's no match, no
     * special message is returned; the response is simply empty.
     * </p>
     * <p>
     * You can use wildcards with the filter values: <code>*</code> matches
     * zero or more characters, and <code>?</code> matches exactly one
     * character. You can escape special characters using a backslash before
     * the character. For example, a value of <code>\*amazon\?\\</code>
     * searches for the literal string <code>*amazon?\</code> .
     * 
     * </p>
     * <p>
     * The following filters are available:
     * </p>
     * 
     * <ul>
     * <li> <code>availability-zone</code> - Filter on an instance's
     * availability zone. </li>
     * <li> <code>instance-state-name</code> - Filter on the intended state
     * of the instance, e.g., running. </li>
     * <li> <code>instance-state-code</code> - Filter on the intended state
     * code of the instance, e.g., 16. </li>
     * 
     * </ul>
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
    public DescribeInstanceStatusResult describeInstanceStatus(DescribeInstanceStatusRequest describeInstanceStatusRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeInstanceStatusRequest> request = new DescribeInstanceStatusRequestMarshaller().marshall(describeInstanceStatusRequest);
        return invoke(request, new DescribeInstanceStatusResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Gives you information about your VPN gateways. You can filter the
     * results to return information only about VPN gateways that match
     * criteria you specify.
     * </p>
     * <p>
     * For example, you could ask to get information about a particular VPN
     * gateway (or all) only if the gateway's state is pending or available.
     * You can specify multiple filters (e.g., the VPN gateway is in a
     * particular Availability Zone and the gateway's state is pending or
     * available).
     * </p>
     * <p>
     * The result includes information for a particular VPN gateway only if
     * the gateway matches all your filters. If there's no match, no special
     * message is returned; the response is simply empty. The following table
     * shows the available filters.
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
    public DescribeVpnGatewaysResult describeVpnGateways(DescribeVpnGatewaysRequest describeVpnGatewaysRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeVpnGatewaysRequest> request = new DescribeVpnGatewaysRequestMarshaller().marshall(describeVpnGatewaysRequest);
        return invoke(request, new DescribeVpnGatewaysResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Creates a subnet in an existing VPC. You can create up to 20 subnets
     * in a VPC. If you add more than one subnet to a VPC, they're set up in
     * a star topology with a logical router in the middle. When you create
     * each subnet, you provide the VPC ID and the CIDR block you want for
     * the subnet. Once you create a subnet, you can't change its CIDR block.
     * The subnet's CIDR block can be the same as the VPC's CIDR block
     * (assuming you want only a single subnet in the VPC), or a subset of
     * the VPC's CIDR block. If you create more than one subnet in a VPC, the
     * subnets' CIDR blocks must not overlap. The smallest subnet (and VPC)
     * you can create uses a <code>/28</code> netmask (16 IP addresses), and
     * the largest uses a <code>/18</code> netmask (16,384 IP addresses).
     * </p>
     * <p>
     * <b>IMPORTANT:</b> AWS reserves both the first four and the last IP
     * address in each subnet's CIDR block. They're not available for use.
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
    public CreateSubnetResult createSubnet(CreateSubnetRequest createSubnetRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<CreateSubnetRequest> request = new CreateSubnetRequestMarshaller().marshall(createSubnetRequest);
        return invoke(request, new CreateSubnetResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * The DescribeReservedInstancesOfferings operation describes Reserved
     * Instance offerings that are available for purchase. With Amazon EC2
     * Reserved Instances, you purchase the right to launch Amazon EC2
     * instances for a period of time (without getting insufficient capacity
     * errors) and pay a lower usage rate for the actual time used.
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
    public DescribeReservedInstancesOfferingsResult describeReservedInstancesOfferings(DescribeReservedInstancesOfferingsRequest describeReservedInstancesOfferingsRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeReservedInstancesOfferingsRequest> request = new DescribeReservedInstancesOfferingsRequestMarshaller().marshall(describeReservedInstancesOfferingsRequest);
        return invoke(request, new DescribeReservedInstancesOfferingsResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Deletes the snapshot identified by <code>snapshotId</code> .
     * 
     * </p>
     *
     * @param deleteSnapshotRequest Container for the necessary parameters to
     *           execute the DeleteSnapshot service method on AmazonEC2.
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
    public void deleteSnapshot(DeleteSnapshotRequest deleteSnapshotRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DeleteSnapshotRequest> request = new DeleteSnapshotRequestMarshaller().marshall(deleteSnapshotRequest);
        invoke(request, null);
    }
    
    /**
     * <p>
     * Changes which network ACL a subnet is associated with. By default
     * when you create a subnet, it's automatically associated with the
     * default network ACL. For more information about network ACLs, go to
     * Network ACLs in the Amazon Virtual Private Cloud User Guide.
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
    public ReplaceNetworkAclAssociationResult replaceNetworkAclAssociation(ReplaceNetworkAclAssociationRequest replaceNetworkAclAssociationRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<ReplaceNetworkAclAssociationRequest> request = new ReplaceNetworkAclAssociationRequestMarshaller().marshall(replaceNetworkAclAssociationRequest);
        return invoke(request, new ReplaceNetworkAclAssociationResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * The DisassociateAddress operation disassociates the specified elastic
     * IP address from the instance to which it is assigned. This is an
     * idempotent operation. If you enter it more than once, Amazon EC2 does
     * not return an error.
     * </p>
     *
     * @param disassociateAddressRequest Container for the necessary
     *           parameters to execute the DisassociateAddress service method on
     *           AmazonEC2.
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
    public void disassociateAddress(DisassociateAddressRequest disassociateAddressRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DisassociateAddressRequest> request = new DisassociateAddressRequestMarshaller().marshall(disassociateAddressRequest);
        invoke(request, null);
    }
    
    /**
     * <p>
     * Creates a PlacementGroup into which multiple Amazon EC2 instances can
     * be launched. Users must give the group a name unique within the scope
     * of the user account.
     * </p>
     *
     * @param createPlacementGroupRequest Container for the necessary
     *           parameters to execute the CreatePlacementGroup service method on
     *           AmazonEC2.
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
    public void createPlacementGroup(CreatePlacementGroupRequest createPlacementGroupRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<CreatePlacementGroupRequest> request = new CreatePlacementGroupRequestMarshaller().marshall(createPlacementGroupRequest);
        invoke(request, null);
    }
    
    /**
     * <p>
     * The BundleInstance operation request that an instance is bundled the
     * next time it boots. The bundling process creates a new image from a
     * running instance and stores the AMI data in S3. Once bundled, the
     * image must be registered in the normal way using the RegisterImage
     * API.
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
    public BundleInstanceResult bundleInstance(BundleInstanceRequest bundleInstanceRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<BundleInstanceRequest> request = new BundleInstanceRequestMarshaller().marshall(bundleInstanceRequest);
        return invoke(request, new BundleInstanceResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Deletes a PlacementGroup from a user's account. Terminate all Amazon
     * EC2 instances in the placement group before deletion.
     * </p>
     *
     * @param deletePlacementGroupRequest Container for the necessary
     *           parameters to execute the DeletePlacementGroup service method on
     *           AmazonEC2.
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
    public void deletePlacementGroup(DeletePlacementGroupRequest deletePlacementGroupRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DeletePlacementGroupRequest> request = new DeletePlacementGroupRequestMarshaller().marshall(deletePlacementGroupRequest);
        invoke(request, null);
    }
    
    /**
     * <p>
     * Deletes a VPC. You must detach or delete all gateways or other
     * objects that are dependent on the VPC first. For example, you must
     * terminate all running instances, delete all VPC security groups
     * (except the default), delete all the route tables (except the
     * default), etc.
     * </p>
     *
     * @param deleteVpcRequest Container for the necessary parameters to
     *           execute the DeleteVpc service method on AmazonEC2.
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
    public void deleteVpc(DeleteVpcRequest deleteVpcRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DeleteVpcRequest> request = new DeleteVpcRequestMarshaller().marshall(deleteVpcRequest);
        invoke(request, null);
    }
    
    /**
     * <p>
     * The AllocateAddress operation acquires an elastic IP address for use
     * with your account.
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
    public AllocateAddressResult allocateAddress(AllocateAddressRequest allocateAddressRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<AllocateAddressRequest> request = new AllocateAddressRequestMarshaller().marshall(allocateAddressRequest);
        return invoke(request, new AllocateAddressResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * The ReleaseAddress operation releases an elastic IP address
     * associated with your account.
     * </p>
     * <p>
     * <b>NOTE:</b> Releasing an IP address automatically disassociates it
     * from any instance with which it is associated. For more information,
     * see DisassociateAddress.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> After releasing an elastic IP address, it is
     * released to the IP address pool and might no longer be available to
     * your account. Make sure to update your DNS records and any servers or
     * devices that communicate with the address. If you run this operation
     * on an elastic IP address that is already released, the address might
     * be assigned to another account which will cause Amazon EC2 to return
     * an error.
     * </p>
     *
     * @param releaseAddressRequest Container for the necessary parameters to
     *           execute the ReleaseAddress service method on AmazonEC2.
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
    public void releaseAddress(ReleaseAddressRequest releaseAddressRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<ReleaseAddressRequest> request = new ReleaseAddressRequestMarshaller().marshall(releaseAddressRequest);
        invoke(request, null);
    }
    
    /**
     * <p>
     * Resets an attribute of an instance to its default value.
     * </p>
     *
     * @param resetInstanceAttributeRequest Container for the necessary
     *           parameters to execute the ResetInstanceAttribute service method on
     *           AmazonEC2.
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
    public void resetInstanceAttribute(ResetInstanceAttributeRequest resetInstanceAttributeRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<ResetInstanceAttributeRequest> request = new ResetInstanceAttributeRequestMarshaller().marshall(resetInstanceAttributeRequest);
        invoke(request, null);
    }
    
    /**
     * <p>
     * The CreateKeyPair operation creates a new 2048 bit RSA key pair and
     * returns a unique ID that can be used to reference this key pair when
     * launching new instances. For more information, see RunInstances.
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
    public CreateKeyPairResult createKeyPair(CreateKeyPairRequest createKeyPairRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<CreateKeyPairRequest> request = new CreateKeyPairRequestMarshaller().marshall(createKeyPairRequest);
        return invoke(request, new CreateKeyPairResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Replaces an entry (i.e., rule) in a network ACL. For more information
     * about network ACLs, go to Network ACLs in the Amazon Virtual Private
     * Cloud User Guide.
     * </p>
     *
     * @param replaceNetworkAclEntryRequest Container for the necessary
     *           parameters to execute the ReplaceNetworkAclEntry service method on
     *           AmazonEC2.
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
    public void replaceNetworkAclEntry(ReplaceNetworkAclEntryRequest replaceNetworkAclEntryRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<ReplaceNetworkAclEntryRequest> request = new ReplaceNetworkAclEntryRequestMarshaller().marshall(replaceNetworkAclEntryRequest);
        invoke(request, null);
    }
    
    /**
     * <p>
     * Returns information about the Amazon EBS snapshots available to you.
     * Snapshots available to you include public snapshots available for any
     * AWS account to launch, private snapshots you own, and private
     * snapshots owned by another AWS account but for which you've been given
     * explicit create volume permissions.
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
    public DescribeSnapshotsResult describeSnapshots(DescribeSnapshotsRequest describeSnapshotsRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeSnapshotsRequest> request = new DescribeSnapshotsRequestMarshaller().marshall(describeSnapshotsRequest);
        return invoke(request, new DescribeSnapshotsResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Creates a new network ACL in a VPC. Network ACLs provide an optional
     * layer of security (on top of security groups) for the instances in
     * your VPC. For more information about network ACLs, go to Network ACLs
     * in the Amazon Virtual Private Cloud User Guide.
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
    public CreateNetworkAclResult createNetworkAcl(CreateNetworkAclRequest createNetworkAclRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<CreateNetworkAclRequest> request = new CreateNetworkAclRequestMarshaller().marshall(createNetworkAclRequest);
        return invoke(request, new CreateNetworkAclResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * The RegisterImage operation registers an AMI with Amazon EC2. Images
     * must be registered before they can be launched. For more information,
     * see RunInstances.
     * </p>
     * <p>
     * Each AMI is associated with an unique ID which is provided by the
     * Amazon EC2 service through the RegisterImage operation. During
     * registration, Amazon EC2 retrieves the specified image manifest from
     * Amazon S3 and verifies that the image is owned by the user registering
     * the image.
     * </p>
     * <p>
     * The image manifest is retrieved once and stored within the Amazon
     * EC2. Any modifications to an image in Amazon S3 invalidates this
     * registration. If you make changes to an image, deregister the previous
     * image and register the new image. For more information, see
     * DeregisterImage.
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
    public RegisterImageResult registerImage(RegisterImageRequest registerImageRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<RegisterImageRequest> request = new RegisterImageRequestMarshaller().marshall(registerImageRequest);
        return invoke(request, new RegisterImageResultStaxUnmarshaller());
    }
    
    /**
     *
     * @param resetNetworkInterfaceAttributeRequest Container for the
     *           necessary parameters to execute the ResetNetworkInterfaceAttribute
     *           service method on AmazonEC2.
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
    public void resetNetworkInterfaceAttribute(ResetNetworkInterfaceAttributeRequest resetNetworkInterfaceAttributeRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<ResetNetworkInterfaceAttributeRequest> request = new ResetNetworkInterfaceAttributeRequestMarshaller().marshall(resetNetworkInterfaceAttributeRequest);
        invoke(request, null);
    }
    
    /**
     * <p>
     * The DescribeReservedInstances operation describes Reserved Instances
     * that were purchased for use with your account.
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
     * The DescribeAvailabilityZones operation describes availability zones
     * that are currently available to the account and their states.
     * </p>
     * <p>
     * Availability zones are not the same across accounts. The availability
     * zone <code>us-east-1a</code> for account A is not necessarily the same
     * as <code>us-east-1a</code> for account B. Zone assignments are mapped
     * independently for each account.
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
     * The DeleteSecurityGroup operation deletes a security group.
     * </p>
     * <p>
     * <b>NOTE:</b> If you attempt to delete a security group that contains
     * instances, a fault is returned. If you attempt to delete a security
     * group that is referenced by another security group, a fault is
     * returned. For example, if security group B has a rule that allows
     * access from security group A, security group A cannot be deleted until
     * the allow rule is removed.
     * </p>
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
    public void deleteSecurityGroup() throws AmazonServiceException, AmazonClientException {
        deleteSecurityGroup(new DeleteSecurityGroupRequest());
    }
    
    /**
     * <p>
     * Describes the Spot Price history.
     * </p>
     * <p>
     * Spot Instances are instances that Amazon EC2 starts on your behalf
     * when the maximum price that you specify exceeds the current Spot
     * Price. Amazon EC2 periodically sets the Spot Price based on available
     * Spot Instance capacity and current spot instance requests.
     * </p>
     * <p>
     * For conceptual information about Spot Instances, refer to the Amazon
     * Elastic Compute Cloud Developer Guide or Amazon Elastic Compute Cloud
     * User Guide .
     * 
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
     * The DescribeRegions operation describes regions zones that are
     * currently available to the account.
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
     * Gives you information about your Internet gateways. You can filter
     * the results to return information only about Internet gateways that
     * match criteria you specify. For example, you could get information
     * only about gateways with particular tags. The Internet gateway must
     * match at least one of the specified values for it to be included in
     * the results.
     * </p>
     * <p>
     * You can specify multiple filters (e.g., the Internet gateway is
     * attached to a particular VPC and is tagged with a particular value).
     * The result includes information for a particular Internet gateway only
     * if the gateway matches all your filters. If there's no match, no
     * special message is returned; the response is simply empty.
     * </p>
     * <p>
     * You can use wildcards with the filter values: an asterisk matches
     * zero or more characters, and <code>?</code> matches exactly one
     * character. You can escape special characters using a backslash before
     * the character. For example, a value of <code>\*amazon\?\\</code>
     * searches for the literal string <code>*amazon?\</code> .
     * 
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
    public ImportVolumeResult importVolume() throws AmazonServiceException, AmazonClientException {
        return importVolume(new ImportVolumeRequest());
    }
    
    /**
     * <p>
     * The DescribeSecurityGroups operation returns information about
     * security groups that you own.
     * </p>
     * <p>
     * If you specify security group names, information about those security
     * group is returned. Otherwise, information for all security group is
     * returned. If you specify a group that does not exist, a fault is
     * returned.
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
     * Describes the data feed for Spot Instances.
     * </p>
     * <p>
     * For conceptual information about Spot Instances, refer to the Amazon
     * Elastic Compute Cloud Developer Guide or Amazon Elastic Compute Cloud
     * User Guide .
     * 
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
     * Provides details of a user's registered licenses. Zero or more IDs
     * may be specified on the call. When one or more license IDs are
     * specified, only data for the specified IDs are returned.
     * </p>
     * 
     * @return The response from the DescribeLicenses service method, as
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
    public DescribeLicensesResult describeLicenses() throws AmazonServiceException, AmazonClientException {
        return describeLicenses(new DescribeLicensesRequest());
    }
    
    /**
     * <p>
     * Gives you information about your VPN connections.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> We strongly recommend you use HTTPS when calling
     * this operation because the response contains sensitive cryptographic
     * information for configuring your customer gateway. You can filter the
     * results to return information only about VPN connections that match
     * criteria you specify. For example, you could ask to get information
     * about a particular VPN connection (or all) only if the VPN's state is
     * pending or available. You can specify multiple filters (e.g., the VPN
     * connection is associated with a particular VPN gateway, and the
     * gateway's state is pending or available). The result includes
     * information for a particular VPN connection only if the VPN connection
     * matches all your filters. If there's no match, no special message is
     * returned; the response is simply empty. The following table shows the
     * available filters.
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
     * Gives you information about your VPCs. You can filter the results to
     * return information only about VPCs that match criteria you specify.
     * </p>
     * <p>
     * For example, you could ask to get information about a particular VPC
     * or VPCs (or all your VPCs) only if the VPC's state is available. You
     * can specify multiple filters (e.g., the VPC uses one of several sets
     * of DHCP options, and the VPC's state is available). The result
     * includes information for a particular VPC only if the VPC matches all
     * your filters.
     * </p>
     * <p>
     * If there's no match, no special message is returned; the response is
     * simply empty. The following table shows the available filters.
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
     * Describes the status of the indicated volume or, in lieu of any
     * specified, all volumes belonging to the caller. Volumes that have been
     * deleted are not described.
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
    public void reportInstanceStatus() throws AmazonServiceException, AmazonClientException {
        reportInstanceStatus(new ReportInstanceStatusRequest());
    }
    
    /**
     * <p>
     * Gives you information about your route tables. You can filter the
     * results to return information only about tables that match criteria
     * you specify. For example, you could get information only about a table
     * associated with a particular subnet. You can specify multiple values
     * for the filter. The table must match at least one of the specified
     * values for it to be included in the results.
     * </p>
     * <p>
     * You can specify multiple filters (e.g., the table has a particular
     * route, and is associated with a particular subnet). The result
     * includes information for a particular table only if it matches all
     * your filters. If there's no match, no special message is returned; the
     * response is simply empty.
     * </p>
     * <p>
     * You can use wildcards with the filter values: an asterisk matches
     * zero or more characters, and <code>?</code> matches exactly one
     * character. You can escape special characters using a backslash before
     * the character. For example, a value of <code>\*amazon\?\\</code>
     * searches for the literal string <code>*amazon?\</code> .
     * 
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
     * Gives you information about one or more sets of DHCP options. You can
     * specify one or more DHCP options set IDs, or no IDs (to describe all
     * your sets of DHCP options). The returned information consists of:
     * </p>
     * 
     * <ul>
     * <li> The DHCP options set ID </li>
     * <li> The options </li>
     * 
     * </ul>
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
     * Gives you information about the network ACLs in your VPC. You can
     * filter the results to return information only about ACLs that match
     * criteria you specify. For example, you could get information only the
     * ACL associated with a particular subnet. The ACL must match at least
     * one of the specified values for it to be included in the results.
     * </p>
     * <p>
     * You can specify multiple filters (e.g., the ACL is associated with a
     * particular subnet and has an egress entry that denies traffic to a
     * particular port). The result includes information for a particular ACL
     * only if it matches all your filters. If there's no match, no special
     * message is returned; the response is simply empty.
     * </p>
     * <p>
     * You can use wildcards with the filter values: an asterisk matches
     * zero or more characters, and <code>?</code> matches exactly one
     * character. You can escape special characters using a backslash before
     * the character. For example, a value of <code>\*amazon\?\\</code>
     * searches for the literal string <code>*amazon?\</code> .
     * 
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
     * The DescribeBundleTasks operation describes in-progress and recent
     * bundle tasks. Complete and failed tasks are removed from the list a
     * short time after completion. If no bundle ids are given, all bundle
     * tasks are returned.
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
     * The RevokeSecurityGroupIngress operation revokes permissions from a
     * security group. The permissions used to revoke must be specified using
     * the same values used to grant the permissions.
     * </p>
     * <p>
     * Permissions are specified by IP protocol (TCP, UDP, or ICMP), the
     * source of the request (by IP range or an Amazon EC2 user-group pair),
     * the source and destination port ranges (for TCP and UDP), and the ICMP
     * codes and types (for ICMP).
     * </p>
     * <p>
     * Permission changes are quickly propagated to instances within the
     * security group. However, depending on the number of instances in the
     * group, a small delay might occur.
     * </p>
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
     * Creates a new Internet gateway in your AWS account. After creating
     * the Internet gateway, you then attach it to a VPC using
     * <code>AttachInternetGateway</code> . For more information about your
     * VPC and Internet gateway, go to Amazon Virtual Private Cloud User
     * Guide.
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
     * Gives you information about your subnets. You can filter the results
     * to return information only about subnets that match criteria you
     * specify.
     * </p>
     * <p>
     * For example, you could ask to get information about a particular
     * subnet (or all) only if the subnet's state is available. You can
     * specify multiple filters (e.g., the subnet is in a particular VPC, and
     * the subnet's state is available).
     * </p>
     * <p>
     * The result includes information for a particular subnet only if the
     * subnet matches all your filters. If there's no match, no special
     * message is returned; the response is simply empty. The following table
     * shows the available filters.
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
     * Returns information about one or more PlacementGroup instances in a
     * user's account.
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
     * The DescribeInstances operation returns information about instances
     * that you own.
     * </p>
     * <p>
     * If you specify one or more instance IDs, Amazon EC2 returns
     * information for those instances. If you do not specify instance IDs,
     * Amazon EC2 returns information for all relevant instances. If you
     * specify an invalid instance ID, a fault is returned. If you specify an
     * instance that you do not own, it will not be included in the returned
     * results.
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
     * The DescribeImages operation returns information about AMIs, AKIs,
     * and ARIs available to the user. Information returned includes image
     * type, product codes, architecture, and kernel and RAM disk IDs. Images
     * available to the user include public images available for any user to
     * launch, private images owned by the user making the request, and
     * private images owned by other users for which the user has explicit
     * launch permissions.
     * </p>
     * <p>
     * Launch permissions fall into three categories:
     * </p>
     * 
     * <ul>
     * <li> <b>Public:</b> The owner of the AMI granted launch permissions
     * for the AMI to the all group. All users have launch permissions for
     * these AMIs. </li>
     * <li> <b>Explicit:</b> The owner of the AMI granted launch permissions
     * to a specific user. </li>
     * <li> <b>Implicit:</b> A user has implicit launch permissions for all
     * AMIs he or she owns. </li>
     * 
     * </ul>
     * <p>
     * The list of AMIs returned can be modified by specifying AMI IDs, AMI
     * owners, or users with launch permissions. If no options are specified,
     * Amazon EC2 returns all AMIs for which the user has launch permissions.
     * </p>
     * <p>
     * If you specify one or more AMI IDs, only AMIs that have the specified
     * IDs are returned. If you specify an invalid AMI ID, a fault is
     * returned. If you specify an AMI ID for which you do not have access,
     * it will not be included in the returned results.
     * </p>
     * <p>
     * If you specify one or more AMI owners, only AMIs from the specified
     * owners and for which you have access are returned. The results can
     * include the account IDs of the specified owners, amazon for AMIs owned
     * by Amazon or self for AMIs that you own.
     * </p>
     * <p>
     * If you specify a list of executable users, only users that have
     * launch permissions for the AMIs are returned. You can specify account
     * IDs (if you own the AMI(s)), self for AMIs for which you own or have
     * explicit permissions, or all for public AMIs.
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
     * The AuthorizeSecurityGroupIngress operation adds permissions to a
     * security group.
     * </p>
     * <p>
     * Permissions are specified by the IP protocol (TCP, UDP or ICMP), the
     * source of the request (by IP range or an Amazon EC2 user-group pair),
     * the source and destination port ranges (for TCP and UDP), and the ICMP
     * codes and types (for ICMP). When authorizing ICMP, <code>-1</code> can
     * be used as a wildcard in the type and code fields.
     * </p>
     * <p>
     * Permission changes are propagated to instances within the security
     * group as quickly as possible. However, depending on the number of
     * instances, a small delay might occur.
     * </p>
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
    public void authorizeSecurityGroupIngress() throws AmazonServiceException, AmazonClientException {
        authorizeSecurityGroupIngress(new AuthorizeSecurityGroupIngressRequest());
    }
    
    /**
     * <p>
     * Describes Spot Instance requests. Spot Instances are instances that
     * Amazon EC2 starts on your behalf when the maximum price that you
     * specify exceeds the current Spot Price. Amazon EC2 periodically sets
     * the Spot Price based on available Spot Instance capacity and current
     * spot instance requests. For conceptual information about Spot
     * Instances, refer to the <a
     * "http://docs.amazonwebservices.com/AWSEC2/2010-08-31/DeveloperGuide/">
     * Amazon Elastic Compute Cloud Developer Guide </a> or <a
     * href="http://docs.amazonwebservices.com/AWSEC2/2010-08-31/UserGuide/">
     * Amazon Elastic Compute Cloud User Guide </a> .
     * </p>
     * <p>
     * You can filter the results to return information only about Spot
     * Instance requests that match criteria you specify. For example, you
     * could get information about requests where the Spot Price you
     * specified is a certain value (you can't use greater than or less than
     * comparison, but you can use <code>*</code> and <code>?</code>
     * wildcards). You can specify multiple values for a filter. A Spot
     * Instance request must match at least one of the specified values for
     * it to be included in the results.
     * </p>
     * <p>
     * You can specify multiple filters (e.g., the Spot Price is equal to a
     * particular value, and the instance type is <code>m1.small</code> ).
     * The result includes information for a particular request only if it
     * matches all your filters. If there's no match, no special message is
     * returned; the response is simply empty.
     * </p>
     * <p>
     * You can use wildcards with the filter values: an asterisk matches
     * zero or more characters, and <code>?</code> matches exactly one
     * character. You can escape special characters using a backslash before
     * the character. For example, a value of <code>\*amazon\?\\</code>
     * searches for the literal string <code>*amazon?\</code> .
     * 
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
     * Gives you information about your customer gateways. You can filter
     * the results to return information only about customer gateways that
     * match criteria you specify. For example, you could ask to get
     * information about a particular customer gateway (or all) only if the
     * gateway's state is pending or available. You can specify multiple
     * filters (e.g., the customer gateway has a particular IP address for
     * the Internet-routable external interface, and the gateway's state is
     * pending or available). The result includes information for a
     * particular customer gateway only if the gateway matches all your
     * filters. If there's no match, no special message is returned; the
     * response is simply empty. The following table shows the available
     * filters.
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
     * Describes the tags for the specified resources.
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
     * Deletes the data feed for Spot Instances.
     * </p>
     * <p>
     * For conceptual information about Spot Instances, refer to the Amazon
     * Elastic Compute Cloud Developer Guide or Amazon Elastic Compute Cloud
     * User Guide .
     * 
     * </p>
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
     * The DescribeAddresses operation lists elastic IP addresses assigned
     * to your account.
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
     * The DescribeKeyPairs operation returns information about key pairs
     * available to you. If you specify key pairs, information about those
     * key pairs is returned. Otherwise, information for all registered key
     * pairs is returned.
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
     * Describes the status of an Amazon Elastic Compute Cloud (Amazon EC2)
     * instance. Instance status provides information about two types of
     * scheduled events for an instance that may require your attention:
     * </p>
     * 
     * <ul>
     * <li> Scheduled Reboot: When Amazon EC2 determines that an instance
     * must be rebooted, the instance's status will return one of two event
     * codes: <code>system-reboot</code> or <code>instance-reboot</code> .
     * System reboot commonly occurs if certain maintenance or upgrade
     * operations require a reboot of the underlying host that supports an
     * instance. Instance reboot commonly occurs if the instance must be
     * rebooted, rather than the underlying host. Rebooting events include a
     * scheduled start and end time. </li>
     * <li> Scheduled Retirement: When Amazon EC2 determines that an
     * instance must be shut down, the instance's status will return an event
     * code called <code>instance-retirement</code> . Retirement commonly
     * occurs when the underlying host is degraded and must be replaced.
     * Retirement events include a scheduled start and end time. You're also
     * notified by email if one of your instances is set to retiring. The
     * email message indicates when your instance will be permanently
     * retired. </li>
     * 
     * </ul>
     * <p>
     * If your instance is permanently retired, it will not be restarted.
     * You can avoid retirement by manually restarting your instance when its
     * event code is <code>instance-retirement</code> . This ensures that
     * your instance is started on a healthy host.
     * </p>
     * <p>
     * <code>DescribeInstanceStatus</code> returns information only for
     * instances in the running state.
     * </p>
     * <p>
     * You can filter the results to return information only about instances
     * that match criteria you specify. For example, you could get
     * information about instances in a specific Availability Zone. You can
     * specify multiple values for a filter (e.g., more than one Availability
     * Zone). An instance must match at least one of the specified values for
     * it to be included in the results.
     * </p>
     * <p>
     * You can specify multiple filters. An instance must match all the
     * filters for it to be included in the results. If there's no match, no
     * special message is returned; the response is simply empty.
     * </p>
     * <p>
     * You can use wildcards with the filter values: <code>*</code> matches
     * zero or more characters, and <code>?</code> matches exactly one
     * character. You can escape special characters using a backslash before
     * the character. For example, a value of <code>\*amazon\?\\</code>
     * searches for the literal string <code>*amazon?\</code> .
     * 
     * </p>
     * <p>
     * The following filters are available:
     * </p>
     * 
     * <ul>
     * <li> <code>availability-zone</code> - Filter on an instance's
     * availability zone. </li>
     * <li> <code>instance-state-name</code> - Filter on the intended state
     * of the instance, e.g., running. </li>
     * <li> <code>instance-state-code</code> - Filter on the intended state
     * code of the instance, e.g., 16. </li>
     * 
     * </ul>
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
     * Gives you information about your VPN gateways. You can filter the
     * results to return information only about VPN gateways that match
     * criteria you specify.
     * </p>
     * <p>
     * For example, you could ask to get information about a particular VPN
     * gateway (or all) only if the gateway's state is pending or available.
     * You can specify multiple filters (e.g., the VPN gateway is in a
     * particular Availability Zone and the gateway's state is pending or
     * available).
     * </p>
     * <p>
     * The result includes information for a particular VPN gateway only if
     * the gateway matches all your filters. If there's no match, no special
     * message is returned; the response is simply empty. The following table
     * shows the available filters.
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
     * The DescribeReservedInstancesOfferings operation describes Reserved
     * Instance offerings that are available for purchase. With Amazon EC2
     * Reserved Instances, you purchase the right to launch Amazon EC2
     * instances for a period of time (without getting insufficient capacity
     * errors) and pay a lower usage rate for the actual time used.
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
     * The AllocateAddress operation acquires an elastic IP address for use
     * with your account.
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
     * The ReleaseAddress operation releases an elastic IP address
     * associated with your account.
     * </p>
     * <p>
     * <b>NOTE:</b> Releasing an IP address automatically disassociates it
     * from any instance with which it is associated. For more information,
     * see DisassociateAddress.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> After releasing an elastic IP address, it is
     * released to the IP address pool and might no longer be available to
     * your account. Make sure to update your DNS records and any servers or
     * devices that communicate with the address. If you run this operation
     * on an elastic IP address that is already released, the address might
     * be assigned to another account which will cause Amazon EC2 to return
     * an error.
     * </p>
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
    public void releaseAddress() throws AmazonServiceException, AmazonClientException {
        releaseAddress(new ReleaseAddressRequest());
    }
    
    /**
     * <p>
     * Returns information about the Amazon EBS snapshots available to you.
     * Snapshots available to you include public snapshots available for any
     * AWS account to launch, private snapshots you own, and private
     * snapshots owned by another AWS account but for which you've been given
     * explicit create volume permissions.
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
     * <p>
     * The RegisterImage operation registers an AMI with Amazon EC2. Images
     * must be registered before they can be launched. For more information,
     * see RunInstances.
     * </p>
     * <p>
     * Each AMI is associated with an unique ID which is provided by the
     * Amazon EC2 service through the RegisterImage operation. During
     * registration, Amazon EC2 retrieves the specified image manifest from
     * Amazon S3 and verifies that the image is owned by the user registering
     * the image.
     * </p>
     * <p>
     * The image manifest is retrieved once and stored within the Amazon
     * EC2. Any modifications to an image in Amazon S3 invalidates this
     * registration. If you make changes to an image, deregister the previous
     * image and register the new image. For more information, see
     * DeregisterImage.
     * </p>
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
    public RegisterImageResult registerImage() throws AmazonServiceException, AmazonClientException {
        return registerImage(new RegisterImageRequest());
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

    private <X, Y extends AmazonWebServiceRequest> X invoke(Request<Y> request, Unmarshaller<X, StaxUnmarshallerContext> unmarshaller) {
        request.setEndpoint(endpoint);
        for (Entry<String, String> entry : request.getOriginalRequest().copyPrivateRequestParameters().entrySet()) {
            request.addParameter(entry.getKey(), entry.getValue());
        }

        AWSCredentials credentials = awsCredentialsProvider.getCredentials(); 
        AmazonWebServiceRequest originalRequest = request.getOriginalRequest();
        if (originalRequest != null && originalRequest.getRequestCredentials() != null) {
        	credentials = originalRequest.getRequestCredentials();
        }

        ExecutionContext executionContext = createExecutionContext();
        executionContext.setSigner(signer);
        executionContext.setCredentials(credentials);
        
        StaxResponseHandler<X> responseHandler = new StaxResponseHandler<X>(unmarshaller);
        DefaultErrorResponseHandler errorResponseHandler = new DefaultErrorResponseHandler(exceptionUnmarshallers);
        
        return (X)client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }
}
        