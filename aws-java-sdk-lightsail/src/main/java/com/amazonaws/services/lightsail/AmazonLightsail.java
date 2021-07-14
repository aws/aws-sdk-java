/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lightsail;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.lightsail.model.*;

/**
 * Interface for accessing Amazon Lightsail.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.lightsail.AbstractAmazonLightsail} instead.
 * </p>
 * <p>
 * <p>
 * Amazon Lightsail is the easiest way to get started with Amazon Web Services (AWS) for developers who need to build
 * websites or web applications. It includes everything you need to launch your project quickly - instances (virtual
 * private servers), container services, storage buckets, managed databases, SSD-based block storage, static IP
 * addresses, load balancers, content delivery network (CDN) distributions, DNS management of registered domains, and
 * resource snapshots (backups) - for a low, predictable monthly price.
 * </p>
 * <p>
 * You can manage your Lightsail resources using the Lightsail console, Lightsail API, AWS Command Line Interface (AWS
 * CLI), or SDKs. For more information about Lightsail concepts and tasks, see the <a href=
 * "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/lightsail-how-to-set-up-access-keys-to-use-sdk-api-cli"
 * >Amazon Lightsail Developer Guide</a>.
 * </p>
 * <p>
 * This API Reference provides detailed information about the actions, data types, parameters, and errors of the
 * Lightsail service. For more information about the supported AWS Regions, endpoints, and service quotas of the
 * Lightsail service, see <a href="https://docs.aws.amazon.com/general/latest/gr/lightsail.html">Amazon Lightsail
 * Endpoints and Quotas</a> in the <i>AWS General Reference</i>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonLightsail {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "lightsail";

    /**
     * Overrides the default endpoint for this client ("lightsail.us-east-1.amazonaws.com"). Callers can use this method
     * to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "lightsail.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "lightsail.us-east-1.amazonaws.com"). If the protocol is not specified here, the default protocol
     * from this client's {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and a complete list of all available
     * endpoints for all AWS services, see: <a href=
     * "https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-choose-endpoint"
     * > https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-
     * choose-endpoint</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the client is created and before any
     * service requests are made. Changing it afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "lightsail.us-east-1.amazonaws.com") or a full URL, including the protocol (ex:
     *        "lightsail.us-east-1.amazonaws.com") of the region specific AWS endpoint this client will communicate
     *        with.
     * @deprecated use {@link AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration)} for
     *             example:
     *             {@code builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));}
     */
    @Deprecated
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AmazonLightsail#setEndpoint(String)}, sets the regional endpoint for this client's
     * service calls. Callers can use this method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol. To use http instead, specify it in the
     * {@link ClientConfiguration} supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the client is created and before any service
     * requests are made. Changing it afterwards creates inevitable race conditions for any service requests in transit
     * or retrying.</b>
     *
     * @param region
     *        The region this client will communicate with. See
     *        {@link com.amazonaws.regions.Region#getRegion(com.amazonaws.regions.Regions)} for accessing a given
     *        region. Must not be null and must be a region where the service is available.
     *
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     * @see com.amazonaws.regions.Region#isServiceSupported(String)
     * @deprecated use {@link AwsClientBuilder#setRegion(String)}
     */
    @Deprecated
    void setRegion(com.amazonaws.regions.Region region);

    /**
     * <p>
     * Allocates a static IP address.
     * </p>
     * 
     * @param allocateStaticIpRequest
     * @return Result of the AllocateStaticIp operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.AllocateStaticIp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/AllocateStaticIp" target="_top">AWS API
     *      Documentation</a>
     */
    AllocateStaticIpResult allocateStaticIp(AllocateStaticIpRequest allocateStaticIpRequest);

    /**
     * <p>
     * Attaches an SSL/TLS certificate to your Amazon Lightsail content delivery network (CDN) distribution.
     * </p>
     * <p>
     * After the certificate is attached, your distribution accepts HTTPS traffic for all of the domains that are
     * associated with the certificate.
     * </p>
     * <p>
     * Use the <code>CreateCertificate</code> action to create a certificate that you can attach to your distribution.
     * </p>
     * <important>
     * <p>
     * Only certificates created in the <code>us-east-1</code> AWS Region can be attached to Lightsail distributions.
     * Lightsail distributions are global resources that can reference an origin in any AWS Region, and distribute its
     * content globally. However, all distributions are located in the <code>us-east-1</code> Region.
     * </p>
     * </important>
     * 
     * @param attachCertificateToDistributionRequest
     * @return Result of the AttachCertificateToDistribution operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.AttachCertificateToDistribution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/AttachCertificateToDistribution"
     *      target="_top">AWS API Documentation</a>
     */
    AttachCertificateToDistributionResult attachCertificateToDistribution(AttachCertificateToDistributionRequest attachCertificateToDistributionRequest);

    /**
     * <p>
     * Attaches a block storage disk to a running or stopped Lightsail instance and exposes it to the instance with the
     * specified disk name.
     * </p>
     * <p>
     * The <code>attach disk</code> operation supports tag-based access control via resource tags applied to the
     * resource identified by <code>disk name</code>. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param attachDiskRequest
     * @return Result of the AttachDisk operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.AttachDisk
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/AttachDisk" target="_top">AWS API
     *      Documentation</a>
     */
    AttachDiskResult attachDisk(AttachDiskRequest attachDiskRequest);

    /**
     * <p>
     * Attaches one or more Lightsail instances to a load balancer.
     * </p>
     * <p>
     * After some time, the instances are attached to the load balancer and the health check status is available.
     * </p>
     * <p>
     * The <code>attach instances to load balancer</code> operation supports tag-based access control via resource tags
     * applied to the resource identified by <code>load balancer name</code>. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param attachInstancesToLoadBalancerRequest
     * @return Result of the AttachInstancesToLoadBalancer operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.AttachInstancesToLoadBalancer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/AttachInstancesToLoadBalancer"
     *      target="_top">AWS API Documentation</a>
     */
    AttachInstancesToLoadBalancerResult attachInstancesToLoadBalancer(AttachInstancesToLoadBalancerRequest attachInstancesToLoadBalancerRequest);

    /**
     * <p>
     * Attaches a Transport Layer Security (TLS) certificate to your load balancer. TLS is just an updated, more secure
     * version of Secure Socket Layer (SSL).
     * </p>
     * <p>
     * Once you create and validate your certificate, you can attach it to your load balancer. You can also use this API
     * to rotate the certificates on your account. Use the <code>AttachLoadBalancerTlsCertificate</code> action with the
     * non-attached certificate, and it will replace the existing one and become the attached certificate.
     * </p>
     * <p>
     * The <code>AttachLoadBalancerTlsCertificate</code> operation supports tag-based access control via resource tags
     * applied to the resource identified by <code>load balancer name</code>. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param attachLoadBalancerTlsCertificateRequest
     * @return Result of the AttachLoadBalancerTlsCertificate operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.AttachLoadBalancerTlsCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/AttachLoadBalancerTlsCertificate"
     *      target="_top">AWS API Documentation</a>
     */
    AttachLoadBalancerTlsCertificateResult attachLoadBalancerTlsCertificate(AttachLoadBalancerTlsCertificateRequest attachLoadBalancerTlsCertificateRequest);

    /**
     * <p>
     * Attaches a static IP address to a specific Amazon Lightsail instance.
     * </p>
     * 
     * @param attachStaticIpRequest
     * @return Result of the AttachStaticIp operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.AttachStaticIp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/AttachStaticIp" target="_top">AWS API
     *      Documentation</a>
     */
    AttachStaticIpResult attachStaticIp(AttachStaticIpRequest attachStaticIpRequest);

    /**
     * <p>
     * Closes ports for a specific Amazon Lightsail instance.
     * </p>
     * <p>
     * The <code>CloseInstancePublicPorts</code> action supports tag-based access control via resource tags applied to
     * the resource identified by <code>instanceName</code>. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param closeInstancePublicPortsRequest
     * @return Result of the CloseInstancePublicPorts operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.CloseInstancePublicPorts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CloseInstancePublicPorts"
     *      target="_top">AWS API Documentation</a>
     */
    CloseInstancePublicPortsResult closeInstancePublicPorts(CloseInstancePublicPortsRequest closeInstancePublicPortsRequest);

    /**
     * <p>
     * Copies a manual snapshot of an instance or disk as another manual snapshot, or copies an automatic snapshot of an
     * instance or disk as a manual snapshot. This operation can also be used to copy a manual or automatic snapshot of
     * an instance or a disk from one AWS Region to another in Amazon Lightsail.
     * </p>
     * <p>
     * When copying a <i>manual snapshot</i>, be sure to define the <code>source region</code>,
     * <code>source snapshot name</code>, and <code>target snapshot name</code> parameters.
     * </p>
     * <p>
     * When copying an <i>automatic snapshot</i>, be sure to define the <code>source region</code>,
     * <code>source resource name</code>, <code>target snapshot name</code>, and either the <code>restore date</code> or
     * the <code>use latest restorable auto snapshot</code> parameters.
     * </p>
     * 
     * @param copySnapshotRequest
     * @return Result of the CopySnapshot operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.CopySnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CopySnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    CopySnapshotResult copySnapshot(CopySnapshotRequest copySnapshotRequest);

    /**
     * <p>
     * Creates an Amazon Lightsail bucket.
     * </p>
     * <p>
     * A bucket is a cloud storage resource available in the Lightsail object storage service. Use buckets to store
     * objects such as data and its descriptive metadata. For more information about buckets, see <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/buckets-in-amazon-lightsail">Buckets in Amazon
     * Lightsail</a> in the <i>Amazon Lightsail Developer Guide</i>.
     * </p>
     * 
     * @param createBucketRequest
     * @return Result of the CreateBucket operation returned by the service.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws ServiceException
     *         A general service exception.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.CreateBucket
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateBucket" target="_top">AWS API
     *      Documentation</a>
     */
    CreateBucketResult createBucket(CreateBucketRequest createBucketRequest);

    /**
     * <p>
     * Creates a new access key for the specified Amazon Lightsail bucket. Access keys consist of an access key ID and
     * corresponding secret access key.
     * </p>
     * <p>
     * Access keys grant full programmatic access to the specified bucket and its objects. You can have a maximum of two
     * access keys per bucket. Use the <a>GetBucketAccessKeys</a> action to get a list of current access keys for a
     * specific bucket. For more information about access keys, see <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-creating-bucket-access-keys"
     * >Creating access keys for a bucket in Amazon Lightsail</a> in the <i>Amazon Lightsail Developer Guide</i>.
     * </p>
     * <important>
     * <p>
     * The <code>secretAccessKey</code> value is returned only in response to the <code>CreateBucketAccessKey</code>
     * action. You can get a secret access key only when you first create an access key; you cannot get the secret
     * access key later. If you lose the secret access key, you must create a new access key.
     * </p>
     * </important>
     * 
     * @param createBucketAccessKeyRequest
     * @return Result of the CreateBucketAccessKey operation returned by the service.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws ServiceException
     *         A general service exception.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.CreateBucketAccessKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateBucketAccessKey"
     *      target="_top">AWS API Documentation</a>
     */
    CreateBucketAccessKeyResult createBucketAccessKey(CreateBucketAccessKeyRequest createBucketAccessKeyRequest);

    /**
     * <p>
     * Creates an SSL/TLS certificate for an Amazon Lightsail content delivery network (CDN) distribution and a
     * container service.
     * </p>
     * <p>
     * After the certificate is valid, use the <code>AttachCertificateToDistribution</code> action to use the
     * certificate and its domains with your distribution. Or use the <code>UpdateContainerService</code> action to use
     * the certificate and its domains with your container service.
     * </p>
     * <important>
     * <p>
     * Only certificates created in the <code>us-east-1</code> AWS Region can be attached to Lightsail distributions.
     * Lightsail distributions are global resources that can reference an origin in any AWS Region, and distribute its
     * content globally. However, all distributions are located in the <code>us-east-1</code> Region.
     * </p>
     * </important>
     * 
     * @param createCertificateRequest
     * @return Result of the CreateCertificate operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.CreateCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateCertificate" target="_top">AWS
     *      API Documentation</a>
     */
    CreateCertificateResult createCertificate(CreateCertificateRequest createCertificateRequest);

    /**
     * <p>
     * Creates an AWS CloudFormation stack, which creates a new Amazon EC2 instance from an exported Amazon Lightsail
     * snapshot. This operation results in a CloudFormation stack record that can be used to track the AWS
     * CloudFormation stack created. Use the <code>get cloud formation stack records</code> operation to get a list of
     * the CloudFormation stacks created.
     * </p>
     * <important>
     * <p>
     * Wait until after your new Amazon EC2 instance is created before running the
     * <code>create cloud formation stack</code> operation again with the same export snapshot record.
     * </p>
     * </important>
     * 
     * @param createCloudFormationStackRequest
     * @return Result of the CreateCloudFormationStack operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.CreateCloudFormationStack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateCloudFormationStack"
     *      target="_top">AWS API Documentation</a>
     */
    CreateCloudFormationStackResult createCloudFormationStack(CreateCloudFormationStackRequest createCloudFormationStackRequest);

    /**
     * <p>
     * Creates an email or SMS text message contact method.
     * </p>
     * <p>
     * A contact method is used to send you notifications about your Amazon Lightsail resources. You can add one email
     * address and one mobile phone number contact method in each AWS Region. However, SMS text messaging is not
     * supported in some AWS Regions, and SMS text messages cannot be sent to some countries/regions. For more
     * information, see <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-notifications">Notifications in
     * Amazon Lightsail</a>.
     * </p>
     * 
     * @param createContactMethodRequest
     * @return Result of the CreateContactMethod operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.CreateContactMethod
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateContactMethod" target="_top">AWS
     *      API Documentation</a>
     */
    CreateContactMethodResult createContactMethod(CreateContactMethodRequest createContactMethodRequest);

    /**
     * <p>
     * Creates an Amazon Lightsail container service.
     * </p>
     * <p>
     * A Lightsail container service is a compute resource to which you can deploy containers. For more information, see
     * <a href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-container-services">Container
     * services in Amazon Lightsail</a> in the <i>Lightsail Dev Guide</i>.
     * </p>
     * 
     * @param createContainerServiceRequest
     * @return Result of the CreateContainerService operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.CreateContainerService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateContainerService"
     *      target="_top">AWS API Documentation</a>
     */
    CreateContainerServiceResult createContainerService(CreateContainerServiceRequest createContainerServiceRequest);

    /**
     * <p>
     * Creates a deployment for your Amazon Lightsail container service.
     * </p>
     * <p>
     * A deployment specifies the containers that will be launched on the container service and their settings, such as
     * the ports to open, the environment variables to apply, and the launch command to run. It also specifies the
     * container that will serve as the public endpoint of the deployment and its settings, such as the HTTP or HTTPS
     * port to use, and the health check configuration.
     * </p>
     * <p>
     * You can deploy containers to your container service using container images from a public registry like Docker
     * Hub, or from your local machine. For more information, see <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-creating-container-images"
     * >Creating container images for your Amazon Lightsail container services</a> in the <i>Amazon Lightsail Developer
     * Guide</i>.
     * </p>
     * 
     * @param createContainerServiceDeploymentRequest
     * @return Result of the CreateContainerServiceDeployment operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.CreateContainerServiceDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateContainerServiceDeployment"
     *      target="_top">AWS API Documentation</a>
     */
    CreateContainerServiceDeploymentResult createContainerServiceDeployment(CreateContainerServiceDeploymentRequest createContainerServiceDeploymentRequest);

    /**
     * <p>
     * Creates a temporary set of log in credentials that you can use to log in to the Docker process on your local
     * machine. After you're logged in, you can use the native Docker commands to push your local container images to
     * the container image registry of your Amazon Lightsail account so that you can use them with your Lightsail
     * container service. The log in credentials expire 12 hours after they are created, at which point you will need to
     * create a new set of log in credentials.
     * </p>
     * <note>
     * <p>
     * You can only push container images to the container service registry of your Lightsail account. You cannot pull
     * container images or perform any other container image management actions on the container service registry.
     * </p>
     * </note>
     * <p>
     * After you push your container images to the container image registry of your Lightsail account, use the
     * <code>RegisterContainerImage</code> action to register the pushed images to a specific Lightsail container
     * service.
     * </p>
     * <note>
     * <p>
     * This action is not required if you install and use the Lightsail Control (lightsailctl) plugin to push container
     * images to your Lightsail container service. For more information, see <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-pushing-container-images">Pushing
     * and managing container images on your Amazon Lightsail container services</a> in the <i>Amazon Lightsail
     * Developer Guide</i>.
     * </p>
     * </note>
     * 
     * @param createContainerServiceRegistryLoginRequest
     * @return Result of the CreateContainerServiceRegistryLogin operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.CreateContainerServiceRegistryLogin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateContainerServiceRegistryLogin"
     *      target="_top">AWS API Documentation</a>
     */
    CreateContainerServiceRegistryLoginResult createContainerServiceRegistryLogin(
            CreateContainerServiceRegistryLoginRequest createContainerServiceRegistryLoginRequest);

    /**
     * <p>
     * Creates a block storage disk that can be attached to an Amazon Lightsail instance in the same Availability Zone
     * (e.g., <code>us-east-2a</code>).
     * </p>
     * <p>
     * The <code>create disk</code> operation supports tag-based access control via request tags. For more information,
     * see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param createDiskRequest
     * @return Result of the CreateDisk operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.CreateDisk
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateDisk" target="_top">AWS API
     *      Documentation</a>
     */
    CreateDiskResult createDisk(CreateDiskRequest createDiskRequest);

    /**
     * <p>
     * Creates a block storage disk from a manual or automatic snapshot of a disk. The resulting disk can be attached to
     * an Amazon Lightsail instance in the same Availability Zone (e.g., <code>us-east-2a</code>).
     * </p>
     * <p>
     * The <code>create disk from snapshot</code> operation supports tag-based access control via request tags and
     * resource tags applied to the resource identified by <code>disk snapshot name</code>. For more information, see
     * the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param createDiskFromSnapshotRequest
     * @return Result of the CreateDiskFromSnapshot operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.CreateDiskFromSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateDiskFromSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    CreateDiskFromSnapshotResult createDiskFromSnapshot(CreateDiskFromSnapshotRequest createDiskFromSnapshotRequest);

    /**
     * <p>
     * Creates a snapshot of a block storage disk. You can use snapshots for backups, to make copies of disks, and to
     * save data before shutting down a Lightsail instance.
     * </p>
     * <p>
     * You can take a snapshot of an attached disk that is in use; however, snapshots only capture data that has been
     * written to your disk at the time the snapshot command is issued. This may exclude any data that has been cached
     * by any applications or the operating system. If you can pause any file systems on the disk long enough to take a
     * snapshot, your snapshot should be complete. Nevertheless, if you cannot pause all file writes to the disk, you
     * should unmount the disk from within the Lightsail instance, issue the create disk snapshot command, and then
     * remount the disk to ensure a consistent and complete snapshot. You may remount and use your disk while the
     * snapshot status is pending.
     * </p>
     * <p>
     * You can also use this operation to create a snapshot of an instance's system volume. You might want to do this,
     * for example, to recover data from the system volume of a botched instance or to create a backup of the system
     * volume like you would for a block storage disk. To create a snapshot of a system volume, just define the
     * <code>instance name</code> parameter when issuing the snapshot command, and a snapshot of the defined instance's
     * system volume will be created. After the snapshot is available, you can create a block storage disk from the
     * snapshot and attach it to a running instance to access the data on the disk.
     * </p>
     * <p>
     * The <code>create disk snapshot</code> operation supports tag-based access control via request tags. For more
     * information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param createDiskSnapshotRequest
     * @return Result of the CreateDiskSnapshot operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.CreateDiskSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateDiskSnapshot" target="_top">AWS
     *      API Documentation</a>
     */
    CreateDiskSnapshotResult createDiskSnapshot(CreateDiskSnapshotRequest createDiskSnapshotRequest);

    /**
     * <p>
     * Creates an Amazon Lightsail content delivery network (CDN) distribution.
     * </p>
     * <p>
     * A distribution is a globally distributed network of caching servers that improve the performance of your website
     * or web application hosted on a Lightsail instance. For more information, see <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-content-delivery-network-distributions"
     * >Content delivery networks in Amazon Lightsail</a>.
     * </p>
     * 
     * @param createDistributionRequest
     * @return Result of the CreateDistribution operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.CreateDistribution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateDistribution" target="_top">AWS
     *      API Documentation</a>
     */
    CreateDistributionResult createDistribution(CreateDistributionRequest createDistributionRequest);

    /**
     * <p>
     * Creates a domain resource for the specified domain (e.g., example.com).
     * </p>
     * <p>
     * The <code>create domain</code> operation supports tag-based access control via request tags. For more
     * information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param createDomainRequest
     * @return Result of the CreateDomain operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.CreateDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateDomain" target="_top">AWS API
     *      Documentation</a>
     */
    CreateDomainResult createDomain(CreateDomainRequest createDomainRequest);

    /**
     * <p>
     * Creates one of the following domain name system (DNS) records in a domain DNS zone: Address (A), canonical name
     * (CNAME), mail exchanger (MX), name server (NS), start of authority (SOA), service locator (SRV), or text (TXT).
     * </p>
     * <p>
     * The <code>create domain entry</code> operation supports tag-based access control via resource tags applied to the
     * resource identified by <code>domain name</code>. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param createDomainEntryRequest
     * @return Result of the CreateDomainEntry operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.CreateDomainEntry
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateDomainEntry" target="_top">AWS
     *      API Documentation</a>
     */
    CreateDomainEntryResult createDomainEntry(CreateDomainEntryRequest createDomainEntryRequest);

    /**
     * <p>
     * Creates a snapshot of a specific virtual private server, or <i>instance</i>. You can use a snapshot to create a
     * new instance that is based on that snapshot.
     * </p>
     * <p>
     * The <code>create instance snapshot</code> operation supports tag-based access control via request tags. For more
     * information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param createInstanceSnapshotRequest
     * @return Result of the CreateInstanceSnapshot operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.CreateInstanceSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateInstanceSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    CreateInstanceSnapshotResult createInstanceSnapshot(CreateInstanceSnapshotRequest createInstanceSnapshotRequest);

    /**
     * <p>
     * Creates one or more Amazon Lightsail instances.
     * </p>
     * <p>
     * The <code>create instances</code> operation supports tag-based access control via request tags. For more
     * information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param createInstancesRequest
     * @return Result of the CreateInstances operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.CreateInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateInstances" target="_top">AWS API
     *      Documentation</a>
     */
    CreateInstancesResult createInstances(CreateInstancesRequest createInstancesRequest);

    /**
     * <p>
     * Creates one or more new instances from a manual or automatic snapshot of an instance.
     * </p>
     * <p>
     * The <code>create instances from snapshot</code> operation supports tag-based access control via request tags and
     * resource tags applied to the resource identified by <code>instance snapshot name</code>. For more information,
     * see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param createInstancesFromSnapshotRequest
     * @return Result of the CreateInstancesFromSnapshot operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.CreateInstancesFromSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateInstancesFromSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    CreateInstancesFromSnapshotResult createInstancesFromSnapshot(CreateInstancesFromSnapshotRequest createInstancesFromSnapshotRequest);

    /**
     * <p>
     * Creates an SSH key pair.
     * </p>
     * <p>
     * The <code>create key pair</code> operation supports tag-based access control via request tags. For more
     * information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param createKeyPairRequest
     * @return Result of the CreateKeyPair operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.CreateKeyPair
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateKeyPair" target="_top">AWS API
     *      Documentation</a>
     */
    CreateKeyPairResult createKeyPair(CreateKeyPairRequest createKeyPairRequest);

    /**
     * <p>
     * Creates a Lightsail load balancer. To learn more about deciding whether to load balance your application, see <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/configure-lightsail-instances-for-load-balancing">
     * Configure your Lightsail instances for load balancing</a>. You can create up to 5 load balancers per AWS Region
     * in your account.
     * </p>
     * <p>
     * When you create a load balancer, you can specify a unique name and port settings. To change additional load
     * balancer settings, use the <code>UpdateLoadBalancerAttribute</code> operation.
     * </p>
     * <p>
     * The <code>create load balancer</code> operation supports tag-based access control via request tags. For more
     * information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param createLoadBalancerRequest
     * @return Result of the CreateLoadBalancer operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.CreateLoadBalancer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateLoadBalancer" target="_top">AWS
     *      API Documentation</a>
     */
    CreateLoadBalancerResult createLoadBalancer(CreateLoadBalancerRequest createLoadBalancerRequest);

    /**
     * <p>
     * Creates an SSL/TLS certificate for an Amazon Lightsail load balancer.
     * </p>
     * <p>
     * TLS is just an updated, more secure version of Secure Socket Layer (SSL).
     * </p>
     * <p>
     * The <code>CreateLoadBalancerTlsCertificate</code> operation supports tag-based access control via resource tags
     * applied to the resource identified by <code>load balancer name</code>. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param createLoadBalancerTlsCertificateRequest
     * @return Result of the CreateLoadBalancerTlsCertificate operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.CreateLoadBalancerTlsCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateLoadBalancerTlsCertificate"
     *      target="_top">AWS API Documentation</a>
     */
    CreateLoadBalancerTlsCertificateResult createLoadBalancerTlsCertificate(CreateLoadBalancerTlsCertificateRequest createLoadBalancerTlsCertificateRequest);

    /**
     * <p>
     * Creates a new database in Amazon Lightsail.
     * </p>
     * <p>
     * The <code>create relational database</code> operation supports tag-based access control via request tags. For
     * more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param createRelationalDatabaseRequest
     * @return Result of the CreateRelationalDatabase operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.CreateRelationalDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateRelationalDatabase"
     *      target="_top">AWS API Documentation</a>
     */
    CreateRelationalDatabaseResult createRelationalDatabase(CreateRelationalDatabaseRequest createRelationalDatabaseRequest);

    /**
     * <p>
     * Creates a new database from an existing database snapshot in Amazon Lightsail.
     * </p>
     * <p>
     * You can create a new database from a snapshot in if something goes wrong with your original database, or to
     * change it to a different plan, such as a high availability or standard plan.
     * </p>
     * <p>
     * The <code>create relational database from snapshot</code> operation supports tag-based access control via request
     * tags and resource tags applied to the resource identified by relationalDatabaseSnapshotName. For more
     * information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param createRelationalDatabaseFromSnapshotRequest
     * @return Result of the CreateRelationalDatabaseFromSnapshot operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.CreateRelationalDatabaseFromSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateRelationalDatabaseFromSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    CreateRelationalDatabaseFromSnapshotResult createRelationalDatabaseFromSnapshot(
            CreateRelationalDatabaseFromSnapshotRequest createRelationalDatabaseFromSnapshotRequest);

    /**
     * <p>
     * Creates a snapshot of your database in Amazon Lightsail. You can use snapshots for backups, to make copies of a
     * database, and to save data before deleting a database.
     * </p>
     * <p>
     * The <code>create relational database snapshot</code> operation supports tag-based access control via request
     * tags. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param createRelationalDatabaseSnapshotRequest
     * @return Result of the CreateRelationalDatabaseSnapshot operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.CreateRelationalDatabaseSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateRelationalDatabaseSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    CreateRelationalDatabaseSnapshotResult createRelationalDatabaseSnapshot(CreateRelationalDatabaseSnapshotRequest createRelationalDatabaseSnapshotRequest);

    /**
     * <p>
     * Deletes an alarm.
     * </p>
     * <p>
     * An alarm is used to monitor a single metric for one of your resources. When a metric condition is met, the alarm
     * can notify you by email, SMS text message, and a banner displayed on the Amazon Lightsail console. For more
     * information, see <a href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-alarms">Alarms
     * in Amazon Lightsail</a>.
     * </p>
     * 
     * @param deleteAlarmRequest
     * @return Result of the DeleteAlarm operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @sample AmazonLightsail.DeleteAlarm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteAlarm" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteAlarmResult deleteAlarm(DeleteAlarmRequest deleteAlarmRequest);

    /**
     * <p>
     * Deletes an automatic snapshot of an instance or disk. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-configuring-automatic-snapshots"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param deleteAutoSnapshotRequest
     * @return Result of the DeleteAutoSnapshot operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.DeleteAutoSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteAutoSnapshot" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteAutoSnapshotResult deleteAutoSnapshot(DeleteAutoSnapshotRequest deleteAutoSnapshotRequest);

    /**
     * <p>
     * Deletes a Amazon Lightsail bucket.
     * </p>
     * <note>
     * <p>
     * When you delete your bucket, the bucket name is released and can be reused for a new bucket in your account or
     * another AWS account.
     * </p>
     * </note>
     * 
     * @param deleteBucketRequest
     * @return Result of the DeleteBucket operation returned by the service.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws ServiceException
     *         A general service exception.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.DeleteBucket
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteBucket" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteBucketResult deleteBucket(DeleteBucketRequest deleteBucketRequest);

    /**
     * <p>
     * Deletes an access key for the specified Amazon Lightsail bucket.
     * </p>
     * <p>
     * We recommend that you delete an access key if the secret access key is compromised.
     * </p>
     * <p>
     * For more information about access keys, see <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-creating-bucket-access-keys"
     * >Creating access keys for a bucket in Amazon Lightsail</a> in the <i>Amazon Lightsail Developer Guide</i>.
     * </p>
     * 
     * @param deleteBucketAccessKeyRequest
     * @return Result of the DeleteBucketAccessKey operation returned by the service.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws ServiceException
     *         A general service exception.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.DeleteBucketAccessKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteBucketAccessKey"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteBucketAccessKeyResult deleteBucketAccessKey(DeleteBucketAccessKeyRequest deleteBucketAccessKeyRequest);

    /**
     * <p>
     * Deletes an SSL/TLS certificate for your Amazon Lightsail content delivery network (CDN) distribution.
     * </p>
     * <p>
     * Certificates that are currently attached to a distribution cannot be deleted. Use the
     * <code>DetachCertificateFromDistribution</code> action to detach a certificate from a distribution.
     * </p>
     * 
     * @param deleteCertificateRequest
     * @return Result of the DeleteCertificate operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.DeleteCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteCertificate" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteCertificateResult deleteCertificate(DeleteCertificateRequest deleteCertificateRequest);

    /**
     * <p>
     * Deletes a contact method.
     * </p>
     * <p>
     * A contact method is used to send you notifications about your Amazon Lightsail resources. You can add one email
     * address and one mobile phone number contact method in each AWS Region. However, SMS text messaging is not
     * supported in some AWS Regions, and SMS text messages cannot be sent to some countries/regions. For more
     * information, see <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-notifications">Notifications in
     * Amazon Lightsail</a>.
     * </p>
     * 
     * @param deleteContactMethodRequest
     * @return Result of the DeleteContactMethod operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @sample AmazonLightsail.DeleteContactMethod
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteContactMethod" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteContactMethodResult deleteContactMethod(DeleteContactMethodRequest deleteContactMethodRequest);

    /**
     * <p>
     * Deletes a container image that is registered to your Amazon Lightsail container service.
     * </p>
     * 
     * @param deleteContainerImageRequest
     * @return Result of the DeleteContainerImage operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.DeleteContainerImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteContainerImage" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteContainerImageResult deleteContainerImage(DeleteContainerImageRequest deleteContainerImageRequest);

    /**
     * <p>
     * Deletes your Amazon Lightsail container service.
     * </p>
     * 
     * @param deleteContainerServiceRequest
     * @return Result of the DeleteContainerService operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.DeleteContainerService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteContainerService"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteContainerServiceResult deleteContainerService(DeleteContainerServiceRequest deleteContainerServiceRequest);

    /**
     * <p>
     * Deletes the specified block storage disk. The disk must be in the <code>available</code> state (not attached to a
     * Lightsail instance).
     * </p>
     * <note>
     * <p>
     * The disk may remain in the <code>deleting</code> state for several minutes.
     * </p>
     * </note>
     * <p>
     * The <code>delete disk</code> operation supports tag-based access control via resource tags applied to the
     * resource identified by <code>disk name</code>. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param deleteDiskRequest
     * @return Result of the DeleteDisk operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.DeleteDisk
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteDisk" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteDiskResult deleteDisk(DeleteDiskRequest deleteDiskRequest);

    /**
     * <p>
     * Deletes the specified disk snapshot.
     * </p>
     * <p>
     * When you make periodic snapshots of a disk, the snapshots are incremental, and only the blocks on the device that
     * have changed since your last snapshot are saved in the new snapshot. When you delete a snapshot, only the data
     * not needed for any other snapshot is removed. So regardless of which prior snapshots have been deleted, all
     * active snapshots will have access to all the information needed to restore the disk.
     * </p>
     * <p>
     * The <code>delete disk snapshot</code> operation supports tag-based access control via resource tags applied to
     * the resource identified by <code>disk snapshot name</code>. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param deleteDiskSnapshotRequest
     * @return Result of the DeleteDiskSnapshot operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.DeleteDiskSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteDiskSnapshot" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteDiskSnapshotResult deleteDiskSnapshot(DeleteDiskSnapshotRequest deleteDiskSnapshotRequest);

    /**
     * <p>
     * Deletes your Amazon Lightsail content delivery network (CDN) distribution.
     * </p>
     * 
     * @param deleteDistributionRequest
     * @return Result of the DeleteDistribution operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.DeleteDistribution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteDistribution" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteDistributionResult deleteDistribution(DeleteDistributionRequest deleteDistributionRequest);

    /**
     * <p>
     * Deletes the specified domain recordset and all of its domain records.
     * </p>
     * <p>
     * The <code>delete domain</code> operation supports tag-based access control via resource tags applied to the
     * resource identified by <code>domain name</code>. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param deleteDomainRequest
     * @return Result of the DeleteDomain operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.DeleteDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteDomain" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteDomainResult deleteDomain(DeleteDomainRequest deleteDomainRequest);

    /**
     * <p>
     * Deletes a specific domain entry.
     * </p>
     * <p>
     * The <code>delete domain entry</code> operation supports tag-based access control via resource tags applied to the
     * resource identified by <code>domain name</code>. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param deleteDomainEntryRequest
     * @return Result of the DeleteDomainEntry operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.DeleteDomainEntry
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteDomainEntry" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteDomainEntryResult deleteDomainEntry(DeleteDomainEntryRequest deleteDomainEntryRequest);

    /**
     * <p>
     * Deletes an Amazon Lightsail instance.
     * </p>
     * <p>
     * The <code>delete instance</code> operation supports tag-based access control via resource tags applied to the
     * resource identified by <code>instance name</code>. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param deleteInstanceRequest
     * @return Result of the DeleteInstance operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.DeleteInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteInstance" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteInstanceResult deleteInstance(DeleteInstanceRequest deleteInstanceRequest);

    /**
     * <p>
     * Deletes a specific snapshot of a virtual private server (or <i>instance</i>).
     * </p>
     * <p>
     * The <code>delete instance snapshot</code> operation supports tag-based access control via resource tags applied
     * to the resource identified by <code>instance snapshot name</code>. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param deleteInstanceSnapshotRequest
     * @return Result of the DeleteInstanceSnapshot operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.DeleteInstanceSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteInstanceSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteInstanceSnapshotResult deleteInstanceSnapshot(DeleteInstanceSnapshotRequest deleteInstanceSnapshotRequest);

    /**
     * <p>
     * Deletes a specific SSH key pair.
     * </p>
     * <p>
     * The <code>delete key pair</code> operation supports tag-based access control via resource tags applied to the
     * resource identified by <code>key pair name</code>. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param deleteKeyPairRequest
     * @return Result of the DeleteKeyPair operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.DeleteKeyPair
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteKeyPair" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteKeyPairResult deleteKeyPair(DeleteKeyPairRequest deleteKeyPairRequest);

    /**
     * <p>
     * Deletes the known host key or certificate used by the Amazon Lightsail browser-based SSH or RDP clients to
     * authenticate an instance. This operation enables the Lightsail browser-based SSH or RDP clients to connect to the
     * instance after a host key mismatch.
     * </p>
     * <important>
     * <p>
     * Perform this operation only if you were expecting the host key or certificate mismatch or if you are familiar
     * with the new host key or certificate on the instance. For more information, see <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-troubleshooting-browser-based-ssh-rdp-client-connection"
     * >Troubleshooting connection issues when using the Amazon Lightsail browser-based SSH or RDP client</a>.
     * </p>
     * </important>
     * 
     * @param deleteKnownHostKeysRequest
     * @return Result of the DeleteKnownHostKeys operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.DeleteKnownHostKeys
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteKnownHostKeys" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteKnownHostKeysResult deleteKnownHostKeys(DeleteKnownHostKeysRequest deleteKnownHostKeysRequest);

    /**
     * <p>
     * Deletes a Lightsail load balancer and all its associated SSL/TLS certificates. Once the load balancer is deleted,
     * you will need to create a new load balancer, create a new certificate, and verify domain ownership again.
     * </p>
     * <p>
     * The <code>delete load balancer</code> operation supports tag-based access control via resource tags applied to
     * the resource identified by <code>load balancer name</code>. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param deleteLoadBalancerRequest
     * @return Result of the DeleteLoadBalancer operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.DeleteLoadBalancer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteLoadBalancer" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteLoadBalancerResult deleteLoadBalancer(DeleteLoadBalancerRequest deleteLoadBalancerRequest);

    /**
     * <p>
     * Deletes an SSL/TLS certificate associated with a Lightsail load balancer.
     * </p>
     * <p>
     * The <code>DeleteLoadBalancerTlsCertificate</code> operation supports tag-based access control via resource tags
     * applied to the resource identified by <code>load balancer name</code>. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param deleteLoadBalancerTlsCertificateRequest
     * @return Result of the DeleteLoadBalancerTlsCertificate operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.DeleteLoadBalancerTlsCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteLoadBalancerTlsCertificate"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteLoadBalancerTlsCertificateResult deleteLoadBalancerTlsCertificate(DeleteLoadBalancerTlsCertificateRequest deleteLoadBalancerTlsCertificateRequest);

    /**
     * <p>
     * Deletes a database in Amazon Lightsail.
     * </p>
     * <p>
     * The <code>delete relational database</code> operation supports tag-based access control via resource tags applied
     * to the resource identified by relationalDatabaseName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param deleteRelationalDatabaseRequest
     * @return Result of the DeleteRelationalDatabase operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.DeleteRelationalDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteRelationalDatabase"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteRelationalDatabaseResult deleteRelationalDatabase(DeleteRelationalDatabaseRequest deleteRelationalDatabaseRequest);

    /**
     * <p>
     * Deletes a database snapshot in Amazon Lightsail.
     * </p>
     * <p>
     * The <code>delete relational database snapshot</code> operation supports tag-based access control via resource
     * tags applied to the resource identified by relationalDatabaseName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param deleteRelationalDatabaseSnapshotRequest
     * @return Result of the DeleteRelationalDatabaseSnapshot operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.DeleteRelationalDatabaseSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteRelationalDatabaseSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteRelationalDatabaseSnapshotResult deleteRelationalDatabaseSnapshot(DeleteRelationalDatabaseSnapshotRequest deleteRelationalDatabaseSnapshotRequest);

    /**
     * <p>
     * Detaches an SSL/TLS certificate from your Amazon Lightsail content delivery network (CDN) distribution.
     * </p>
     * <p>
     * After the certificate is detached, your distribution stops accepting traffic for all of the domains that are
     * associated with the certificate.
     * </p>
     * 
     * @param detachCertificateFromDistributionRequest
     * @return Result of the DetachCertificateFromDistribution operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.DetachCertificateFromDistribution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DetachCertificateFromDistribution"
     *      target="_top">AWS API Documentation</a>
     */
    DetachCertificateFromDistributionResult detachCertificateFromDistribution(DetachCertificateFromDistributionRequest detachCertificateFromDistributionRequest);

    /**
     * <p>
     * Detaches a stopped block storage disk from a Lightsail instance. Make sure to unmount any file systems on the
     * device within your operating system before stopping the instance and detaching the disk.
     * </p>
     * <p>
     * The <code>detach disk</code> operation supports tag-based access control via resource tags applied to the
     * resource identified by <code>disk name</code>. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param detachDiskRequest
     * @return Result of the DetachDisk operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.DetachDisk
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DetachDisk" target="_top">AWS API
     *      Documentation</a>
     */
    DetachDiskResult detachDisk(DetachDiskRequest detachDiskRequest);

    /**
     * <p>
     * Detaches the specified instances from a Lightsail load balancer.
     * </p>
     * <p>
     * This operation waits until the instances are no longer needed before they are detached from the load balancer.
     * </p>
     * <p>
     * The <code>detach instances from load balancer</code> operation supports tag-based access control via resource
     * tags applied to the resource identified by <code>load balancer name</code>. For more information, see the <a
     * href=
     * "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags">Amazon
     * Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param detachInstancesFromLoadBalancerRequest
     * @return Result of the DetachInstancesFromLoadBalancer operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.DetachInstancesFromLoadBalancer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DetachInstancesFromLoadBalancer"
     *      target="_top">AWS API Documentation</a>
     */
    DetachInstancesFromLoadBalancerResult detachInstancesFromLoadBalancer(DetachInstancesFromLoadBalancerRequest detachInstancesFromLoadBalancerRequest);

    /**
     * <p>
     * Detaches a static IP from the Amazon Lightsail instance to which it is attached.
     * </p>
     * 
     * @param detachStaticIpRequest
     * @return Result of the DetachStaticIp operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.DetachStaticIp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DetachStaticIp" target="_top">AWS API
     *      Documentation</a>
     */
    DetachStaticIpResult detachStaticIp(DetachStaticIpRequest detachStaticIpRequest);

    /**
     * <p>
     * Disables an add-on for an Amazon Lightsail resource. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-configuring-automatic-snapshots"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param disableAddOnRequest
     * @return Result of the DisableAddOn operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.DisableAddOn
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DisableAddOn" target="_top">AWS API
     *      Documentation</a>
     */
    DisableAddOnResult disableAddOn(DisableAddOnRequest disableAddOnRequest);

    /**
     * <p>
     * Downloads the default SSH key pair from the user's account.
     * </p>
     * 
     * @param downloadDefaultKeyPairRequest
     * @return Result of the DownloadDefaultKeyPair operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.DownloadDefaultKeyPair
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DownloadDefaultKeyPair"
     *      target="_top">AWS API Documentation</a>
     */
    DownloadDefaultKeyPairResult downloadDefaultKeyPair(DownloadDefaultKeyPairRequest downloadDefaultKeyPairRequest);

    /**
     * <p>
     * Enables or modifies an add-on for an Amazon Lightsail resource. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-configuring-automatic-snapshots"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param enableAddOnRequest
     * @return Result of the EnableAddOn operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.EnableAddOn
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/EnableAddOn" target="_top">AWS API
     *      Documentation</a>
     */
    EnableAddOnResult enableAddOn(EnableAddOnRequest enableAddOnRequest);

    /**
     * <p>
     * Exports an Amazon Lightsail instance or block storage disk snapshot to Amazon Elastic Compute Cloud (Amazon EC2).
     * This operation results in an export snapshot record that can be used with the
     * <code>create cloud formation stack</code> operation to create new Amazon EC2 instances.
     * </p>
     * <p>
     * Exported instance snapshots appear in Amazon EC2 as Amazon Machine Images (AMIs), and the instance system disk
     * appears as an Amazon Elastic Block Store (Amazon EBS) volume. Exported disk snapshots appear in Amazon EC2 as
     * Amazon EBS volumes. Snapshots are exported to the same Amazon Web Services Region in Amazon EC2 as the source
     * Lightsail snapshot.
     * </p>
     * <p/>
     * <p>
     * The <code>export snapshot</code> operation supports tag-based access control via resource tags applied to the
     * resource identified by <code>source snapshot name</code>. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * <note>
     * <p>
     * Use the <code>get instance snapshots</code> or <code>get disk snapshots</code> operations to get a list of
     * snapshots that you can export to Amazon EC2.
     * </p>
     * </note>
     * 
     * @param exportSnapshotRequest
     * @return Result of the ExportSnapshot operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.ExportSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/ExportSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    ExportSnapshotResult exportSnapshot(ExportSnapshotRequest exportSnapshotRequest);

    /**
     * <p>
     * Returns the names of all active (not deleted) resources.
     * </p>
     * 
     * @param getActiveNamesRequest
     * @return Result of the GetActiveNames operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetActiveNames
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetActiveNames" target="_top">AWS API
     *      Documentation</a>
     */
    GetActiveNamesResult getActiveNames(GetActiveNamesRequest getActiveNamesRequest);

    /**
     * <p>
     * Returns information about the configured alarms. Specify an alarm name in your request to return information
     * about a specific alarm, or specify a monitored resource name to return information about all alarms for a
     * specific resource.
     * </p>
     * <p>
     * An alarm is used to monitor a single metric for one of your resources. When a metric condition is met, the alarm
     * can notify you by email, SMS text message, and a banner displayed on the Amazon Lightsail console. For more
     * information, see <a href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-alarms">Alarms
     * in Amazon Lightsail</a>.
     * </p>
     * 
     * @param getAlarmsRequest
     * @return Result of the GetAlarms operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @sample AmazonLightsail.GetAlarms
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetAlarms" target="_top">AWS API
     *      Documentation</a>
     */
    GetAlarmsResult getAlarms(GetAlarmsRequest getAlarmsRequest);

    /**
     * <p>
     * Returns the available automatic snapshots for an instance or disk. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-configuring-automatic-snapshots"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param getAutoSnapshotsRequest
     * @return Result of the GetAutoSnapshots operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetAutoSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetAutoSnapshots" target="_top">AWS API
     *      Documentation</a>
     */
    GetAutoSnapshotsResult getAutoSnapshots(GetAutoSnapshotsRequest getAutoSnapshotsRequest);

    /**
     * <p>
     * Returns the list of available instance images, or <i>blueprints</i>. You can use a blueprint to create a new
     * instance already running a specific operating system, as well as a preinstalled app or development stack. The
     * software each instance is running depends on the blueprint image you choose.
     * </p>
     * <note>
     * <p>
     * Use active blueprints when creating new instances. Inactive blueprints are listed to support customers with
     * existing instances and are not necessarily available to create new instances. Blueprints are marked inactive when
     * they become outdated due to operating system updates or new application releases.
     * </p>
     * </note>
     * 
     * @param getBlueprintsRequest
     * @return Result of the GetBlueprints operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetBlueprints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetBlueprints" target="_top">AWS API
     *      Documentation</a>
     */
    GetBlueprintsResult getBlueprints(GetBlueprintsRequest getBlueprintsRequest);

    /**
     * <p>
     * Returns the existing access key IDs for the specified Amazon Lightsail bucket.
     * </p>
     * <important>
     * <p>
     * This action does not return the secret access key value of an access key. You can get a secret access key only
     * when you create it from the response of the <a>CreateBucketAccessKey</a> action. If you lose the secret access
     * key, you must create a new access key.
     * </p>
     * </important>
     * 
     * @param getBucketAccessKeysRequest
     * @return Result of the GetBucketAccessKeys operation returned by the service.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws ServiceException
     *         A general service exception.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetBucketAccessKeys
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetBucketAccessKeys" target="_top">AWS
     *      API Documentation</a>
     */
    GetBucketAccessKeysResult getBucketAccessKeys(GetBucketAccessKeysRequest getBucketAccessKeysRequest);

    /**
     * <p>
     * Returns the bundles that you can apply to a Amazon Lightsail bucket.
     * </p>
     * <p>
     * The bucket bundle specifies the monthly cost, storage quota, and data transfer quota for a bucket.
     * </p>
     * <p>
     * Use the <a>UpdateBucketBundle</a> action to update the bundle for a bucket.
     * </p>
     * 
     * @param getBucketBundlesRequest
     * @return Result of the GetBucketBundles operation returned by the service.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws ServiceException
     *         A general service exception.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetBucketBundles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetBucketBundles" target="_top">AWS API
     *      Documentation</a>
     */
    GetBucketBundlesResult getBucketBundles(GetBucketBundlesRequest getBucketBundlesRequest);

    /**
     * <p>
     * Returns the data points of a specific metric for an Amazon Lightsail bucket.
     * </p>
     * <p>
     * Metrics report the utilization of a bucket. View and collect metric data regularly to monitor the number of
     * objects stored in a bucket (including object versions) and the storage space used by those objects.
     * </p>
     * 
     * @param getBucketMetricDataRequest
     * @return Result of the GetBucketMetricData operation returned by the service.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws ServiceException
     *         A general service exception.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetBucketMetricData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetBucketMetricData" target="_top">AWS
     *      API Documentation</a>
     */
    GetBucketMetricDataResult getBucketMetricData(GetBucketMetricDataRequest getBucketMetricDataRequest);

    /**
     * <p>
     * Returns information about one or more Amazon Lightsail buckets.
     * </p>
     * <p>
     * For more information about buckets, see <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/buckets-in-amazon-lightsail">Buckets in Amazon
     * Lightsail</a> in the <i>Amazon Lightsail Developer Guide</i>..
     * </p>
     * 
     * @param getBucketsRequest
     * @return Result of the GetBuckets operation returned by the service.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws ServiceException
     *         A general service exception.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetBuckets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetBuckets" target="_top">AWS API
     *      Documentation</a>
     */
    GetBucketsResult getBuckets(GetBucketsRequest getBucketsRequest);

    /**
     * <p>
     * Returns the list of bundles that are available for purchase. A bundle describes the specs for your virtual
     * private server (or <i>instance</i>).
     * </p>
     * 
     * @param getBundlesRequest
     * @return Result of the GetBundles operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetBundles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetBundles" target="_top">AWS API
     *      Documentation</a>
     */
    GetBundlesResult getBundles(GetBundlesRequest getBundlesRequest);

    /**
     * <p>
     * Returns information about one or more Amazon Lightsail SSL/TLS certificates.
     * </p>
     * <note>
     * <p>
     * To get a summary of a certificate, ommit <code>includeCertificateDetails</code> from your request. The response
     * will include only the certificate Amazon Resource Name (ARN), certificate name, domain name, and tags.
     * </p>
     * </note>
     * 
     * @param getCertificatesRequest
     * @return Result of the GetCertificates operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetCertificates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetCertificates" target="_top">AWS API
     *      Documentation</a>
     */
    GetCertificatesResult getCertificates(GetCertificatesRequest getCertificatesRequest);

    /**
     * <p>
     * Returns the CloudFormation stack record created as a result of the <code>create cloud formation stack</code>
     * operation.
     * </p>
     * <p>
     * An AWS CloudFormation stack is used to create a new Amazon EC2 instance from an exported Lightsail snapshot.
     * </p>
     * 
     * @param getCloudFormationStackRecordsRequest
     * @return Result of the GetCloudFormationStackRecords operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetCloudFormationStackRecords
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetCloudFormationStackRecords"
     *      target="_top">AWS API Documentation</a>
     */
    GetCloudFormationStackRecordsResult getCloudFormationStackRecords(GetCloudFormationStackRecordsRequest getCloudFormationStackRecordsRequest);

    /**
     * <p>
     * Returns information about the configured contact methods. Specify a protocol in your request to return
     * information about a specific contact method.
     * </p>
     * <p>
     * A contact method is used to send you notifications about your Amazon Lightsail resources. You can add one email
     * address and one mobile phone number contact method in each AWS Region. However, SMS text messaging is not
     * supported in some AWS Regions, and SMS text messages cannot be sent to some countries/regions. For more
     * information, see <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-notifications">Notifications in
     * Amazon Lightsail</a>.
     * </p>
     * 
     * @param getContactMethodsRequest
     * @return Result of the GetContactMethods operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetContactMethods
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetContactMethods" target="_top">AWS
     *      API Documentation</a>
     */
    GetContactMethodsResult getContactMethods(GetContactMethodsRequest getContactMethodsRequest);

    /**
     * <p>
     * Returns information about Amazon Lightsail containers, such as the current version of the Lightsail Control
     * (lightsailctl) plugin.
     * </p>
     * 
     * @param getContainerAPIMetadataRequest
     * @return Result of the GetContainerAPIMetadata operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetContainerAPIMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetContainerAPIMetadata"
     *      target="_top">AWS API Documentation</a>
     */
    GetContainerAPIMetadataResult getContainerAPIMetadata(GetContainerAPIMetadataRequest getContainerAPIMetadataRequest);

    /**
     * <p>
     * Returns the container images that are registered to your Amazon Lightsail container service.
     * </p>
     * <note>
     * <p>
     * If you created a deployment on your Lightsail container service that uses container images from a public registry
     * like Docker Hub, those images are not returned as part of this action. Those images are not registered to your
     * Lightsail container service.
     * </p>
     * </note>
     * 
     * @param getContainerImagesRequest
     * @return Result of the GetContainerImages operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetContainerImages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetContainerImages" target="_top">AWS
     *      API Documentation</a>
     */
    GetContainerImagesResult getContainerImages(GetContainerImagesRequest getContainerImagesRequest);

    /**
     * <p>
     * Returns the log events of a container of your Amazon Lightsail container service.
     * </p>
     * <p>
     * If your container service has more than one node (i.e., a scale greater than 1), then the log events that are
     * returned for the specified container are merged from all nodes on your container service.
     * </p>
     * <note>
     * <p>
     * Container logs are retained for a certain amount of time. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/lightsail.html">Amazon Lightsail endpoints and quotas</a> in
     * the <i>AWS General Reference</i>.
     * </p>
     * </note>
     * 
     * @param getContainerLogRequest
     * @return Result of the GetContainerLog operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetContainerLog
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetContainerLog" target="_top">AWS API
     *      Documentation</a>
     */
    GetContainerLogResult getContainerLog(GetContainerLogRequest getContainerLogRequest);

    /**
     * <p>
     * Returns the deployments for your Amazon Lightsail container service
     * </p>
     * <p>
     * A deployment specifies the settings, such as the ports and launch command, of containers that are deployed to
     * your container service.
     * </p>
     * <p>
     * The deployments are ordered by version in ascending order. The newest version is listed at the top of the
     * response.
     * </p>
     * <note>
     * <p>
     * A set number of deployments are kept before the oldest one is replaced with the newest one. For more information,
     * see <a href="https://docs.aws.amazon.com/general/latest/gr/lightsail.html">Amazon Lightsail endpoints and
     * quotas</a> in the <i>AWS General Reference</i>.
     * </p>
     * </note>
     * 
     * @param getContainerServiceDeploymentsRequest
     * @return Result of the GetContainerServiceDeployments operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetContainerServiceDeployments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetContainerServiceDeployments"
     *      target="_top">AWS API Documentation</a>
     */
    GetContainerServiceDeploymentsResult getContainerServiceDeployments(GetContainerServiceDeploymentsRequest getContainerServiceDeploymentsRequest);

    /**
     * <p>
     * Returns the data points of a specific metric of your Amazon Lightsail container service.
     * </p>
     * <p>
     * Metrics report the utilization of your resources. Monitor and collect metric data regularly to maintain the
     * reliability, availability, and performance of your resources.
     * </p>
     * 
     * @param getContainerServiceMetricDataRequest
     * @return Result of the GetContainerServiceMetricData operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetContainerServiceMetricData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetContainerServiceMetricData"
     *      target="_top">AWS API Documentation</a>
     */
    GetContainerServiceMetricDataResult getContainerServiceMetricData(GetContainerServiceMetricDataRequest getContainerServiceMetricDataRequest);

    /**
     * <p>
     * Returns the list of powers that can be specified for your Amazon Lightsail container services.
     * </p>
     * <p>
     * The power specifies the amount of memory, the number of vCPUs, and the base price of the container service.
     * </p>
     * 
     * @param getContainerServicePowersRequest
     * @return Result of the GetContainerServicePowers operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetContainerServicePowers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetContainerServicePowers"
     *      target="_top">AWS API Documentation</a>
     */
    GetContainerServicePowersResult getContainerServicePowers(GetContainerServicePowersRequest getContainerServicePowersRequest);

    /**
     * <p>
     * Returns information about one or more of your Amazon Lightsail container services.
     * </p>
     * 
     * @param getContainerServicesRequest
     * @return Result of the GetContainerServices operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetContainerServices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetContainerServices" target="_top">AWS
     *      API Documentation</a>
     */
    GetContainerServicesResult getContainerServices(GetContainerServicesRequest getContainerServicesRequest);

    /**
     * <p>
     * Returns information about a specific block storage disk.
     * </p>
     * 
     * @param getDiskRequest
     * @return Result of the GetDisk operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetDisk
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetDisk" target="_top">AWS API
     *      Documentation</a>
     */
    GetDiskResult getDisk(GetDiskRequest getDiskRequest);

    /**
     * <p>
     * Returns information about a specific block storage disk snapshot.
     * </p>
     * 
     * @param getDiskSnapshotRequest
     * @return Result of the GetDiskSnapshot operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetDiskSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetDiskSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    GetDiskSnapshotResult getDiskSnapshot(GetDiskSnapshotRequest getDiskSnapshotRequest);

    /**
     * <p>
     * Returns information about all block storage disk snapshots in your AWS account and region.
     * </p>
     * 
     * @param getDiskSnapshotsRequest
     * @return Result of the GetDiskSnapshots operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetDiskSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetDiskSnapshots" target="_top">AWS API
     *      Documentation</a>
     */
    GetDiskSnapshotsResult getDiskSnapshots(GetDiskSnapshotsRequest getDiskSnapshotsRequest);

    /**
     * <p>
     * Returns information about all block storage disks in your AWS account and region.
     * </p>
     * 
     * @param getDisksRequest
     * @return Result of the GetDisks operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetDisks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetDisks" target="_top">AWS API
     *      Documentation</a>
     */
    GetDisksResult getDisks(GetDisksRequest getDisksRequest);

    /**
     * <p>
     * Returns the bundles that can be applied to your Amazon Lightsail content delivery network (CDN) distributions.
     * </p>
     * <p>
     * A distribution bundle specifies the monthly network transfer quota and monthly cost of your dsitribution.
     * </p>
     * 
     * @param getDistributionBundlesRequest
     * @return Result of the GetDistributionBundles operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetDistributionBundles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetDistributionBundles"
     *      target="_top">AWS API Documentation</a>
     */
    GetDistributionBundlesResult getDistributionBundles(GetDistributionBundlesRequest getDistributionBundlesRequest);

    /**
     * <p>
     * Returns the timestamp and status of the last cache reset of a specific Amazon Lightsail content delivery network
     * (CDN) distribution.
     * </p>
     * 
     * @param getDistributionLatestCacheResetRequest
     * @return Result of the GetDistributionLatestCacheReset operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetDistributionLatestCacheReset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetDistributionLatestCacheReset"
     *      target="_top">AWS API Documentation</a>
     */
    GetDistributionLatestCacheResetResult getDistributionLatestCacheReset(GetDistributionLatestCacheResetRequest getDistributionLatestCacheResetRequest);

    /**
     * <p>
     * Returns the data points of a specific metric for an Amazon Lightsail content delivery network (CDN) distribution.
     * </p>
     * <p>
     * Metrics report the utilization of your resources, and the error counts generated by them. Monitor and collect
     * metric data regularly to maintain the reliability, availability, and performance of your resources.
     * </p>
     * 
     * @param getDistributionMetricDataRequest
     * @return Result of the GetDistributionMetricData operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetDistributionMetricData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetDistributionMetricData"
     *      target="_top">AWS API Documentation</a>
     */
    GetDistributionMetricDataResult getDistributionMetricData(GetDistributionMetricDataRequest getDistributionMetricDataRequest);

    /**
     * <p>
     * Returns information about one or more of your Amazon Lightsail content delivery network (CDN) distributions.
     * </p>
     * 
     * @param getDistributionsRequest
     * @return Result of the GetDistributions operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetDistributions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetDistributions" target="_top">AWS API
     *      Documentation</a>
     */
    GetDistributionsResult getDistributions(GetDistributionsRequest getDistributionsRequest);

    /**
     * <p>
     * Returns information about a specific domain recordset.
     * </p>
     * 
     * @param getDomainRequest
     * @return Result of the GetDomain operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetDomain" target="_top">AWS API
     *      Documentation</a>
     */
    GetDomainResult getDomain(GetDomainRequest getDomainRequest);

    /**
     * <p>
     * Returns a list of all domains in the user's account.
     * </p>
     * 
     * @param getDomainsRequest
     * @return Result of the GetDomains operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetDomains
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetDomains" target="_top">AWS API
     *      Documentation</a>
     */
    GetDomainsResult getDomains(GetDomainsRequest getDomainsRequest);

    /**
     * <p>
     * Returns all export snapshot records created as a result of the <code>export snapshot</code> operation.
     * </p>
     * <p>
     * An export snapshot record can be used to create a new Amazon EC2 instance and its related resources with the
     * <a>CreateCloudFormationStack</a> action.
     * </p>
     * 
     * @param getExportSnapshotRecordsRequest
     * @return Result of the GetExportSnapshotRecords operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetExportSnapshotRecords
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetExportSnapshotRecords"
     *      target="_top">AWS API Documentation</a>
     */
    GetExportSnapshotRecordsResult getExportSnapshotRecords(GetExportSnapshotRecordsRequest getExportSnapshotRecordsRequest);

    /**
     * <p>
     * Returns information about a specific Amazon Lightsail instance, which is a virtual private server.
     * </p>
     * 
     * @param getInstanceRequest
     * @return Result of the GetInstance operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetInstance" target="_top">AWS API
     *      Documentation</a>
     */
    GetInstanceResult getInstance(GetInstanceRequest getInstanceRequest);

    /**
     * <p>
     * Returns temporary SSH keys you can use to connect to a specific virtual private server, or <i>instance</i>.
     * </p>
     * <p>
     * The <code>get instance access details</code> operation supports tag-based access control via resource tags
     * applied to the resource identified by <code>instance name</code>. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param getInstanceAccessDetailsRequest
     * @return Result of the GetInstanceAccessDetails operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetInstanceAccessDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetInstanceAccessDetails"
     *      target="_top">AWS API Documentation</a>
     */
    GetInstanceAccessDetailsResult getInstanceAccessDetails(GetInstanceAccessDetailsRequest getInstanceAccessDetailsRequest);

    /**
     * <p>
     * Returns the data points for the specified Amazon Lightsail instance metric, given an instance name.
     * </p>
     * <p>
     * Metrics report the utilization of your resources, and the error counts generated by them. Monitor and collect
     * metric data regularly to maintain the reliability, availability, and performance of your resources.
     * </p>
     * 
     * @param getInstanceMetricDataRequest
     * @return Result of the GetInstanceMetricData operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetInstanceMetricData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetInstanceMetricData"
     *      target="_top">AWS API Documentation</a>
     */
    GetInstanceMetricDataResult getInstanceMetricData(GetInstanceMetricDataRequest getInstanceMetricDataRequest);

    /**
     * <p>
     * Returns the firewall port states for a specific Amazon Lightsail instance, the IP addresses allowed to connect to
     * the instance through the ports, and the protocol.
     * </p>
     * 
     * @param getInstancePortStatesRequest
     * @return Result of the GetInstancePortStates operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetInstancePortStates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetInstancePortStates"
     *      target="_top">AWS API Documentation</a>
     */
    GetInstancePortStatesResult getInstancePortStates(GetInstancePortStatesRequest getInstancePortStatesRequest);

    /**
     * <p>
     * Returns information about a specific instance snapshot.
     * </p>
     * 
     * @param getInstanceSnapshotRequest
     * @return Result of the GetInstanceSnapshot operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetInstanceSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetInstanceSnapshot" target="_top">AWS
     *      API Documentation</a>
     */
    GetInstanceSnapshotResult getInstanceSnapshot(GetInstanceSnapshotRequest getInstanceSnapshotRequest);

    /**
     * <p>
     * Returns all instance snapshots for the user's account.
     * </p>
     * 
     * @param getInstanceSnapshotsRequest
     * @return Result of the GetInstanceSnapshots operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetInstanceSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetInstanceSnapshots" target="_top">AWS
     *      API Documentation</a>
     */
    GetInstanceSnapshotsResult getInstanceSnapshots(GetInstanceSnapshotsRequest getInstanceSnapshotsRequest);

    /**
     * <p>
     * Returns the state of a specific instance. Works on one instance at a time.
     * </p>
     * 
     * @param getInstanceStateRequest
     * @return Result of the GetInstanceState operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetInstanceState
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetInstanceState" target="_top">AWS API
     *      Documentation</a>
     */
    GetInstanceStateResult getInstanceState(GetInstanceStateRequest getInstanceStateRequest);

    /**
     * <p>
     * Returns information about all Amazon Lightsail virtual private servers, or <i>instances</i>.
     * </p>
     * 
     * @param getInstancesRequest
     * @return Result of the GetInstances operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetInstances" target="_top">AWS API
     *      Documentation</a>
     */
    GetInstancesResult getInstances(GetInstancesRequest getInstancesRequest);

    /**
     * <p>
     * Returns information about a specific key pair.
     * </p>
     * 
     * @param getKeyPairRequest
     * @return Result of the GetKeyPair operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetKeyPair
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetKeyPair" target="_top">AWS API
     *      Documentation</a>
     */
    GetKeyPairResult getKeyPair(GetKeyPairRequest getKeyPairRequest);

    /**
     * <p>
     * Returns information about all key pairs in the user's account.
     * </p>
     * 
     * @param getKeyPairsRequest
     * @return Result of the GetKeyPairs operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetKeyPairs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetKeyPairs" target="_top">AWS API
     *      Documentation</a>
     */
    GetKeyPairsResult getKeyPairs(GetKeyPairsRequest getKeyPairsRequest);

    /**
     * <p>
     * Returns information about the specified Lightsail load balancer.
     * </p>
     * 
     * @param getLoadBalancerRequest
     * @return Result of the GetLoadBalancer operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetLoadBalancer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetLoadBalancer" target="_top">AWS API
     *      Documentation</a>
     */
    GetLoadBalancerResult getLoadBalancer(GetLoadBalancerRequest getLoadBalancerRequest);

    /**
     * <p>
     * Returns information about health metrics for your Lightsail load balancer.
     * </p>
     * <p>
     * Metrics report the utilization of your resources, and the error counts generated by them. Monitor and collect
     * metric data regularly to maintain the reliability, availability, and performance of your resources.
     * </p>
     * 
     * @param getLoadBalancerMetricDataRequest
     * @return Result of the GetLoadBalancerMetricData operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetLoadBalancerMetricData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetLoadBalancerMetricData"
     *      target="_top">AWS API Documentation</a>
     */
    GetLoadBalancerMetricDataResult getLoadBalancerMetricData(GetLoadBalancerMetricDataRequest getLoadBalancerMetricDataRequest);

    /**
     * <p>
     * Returns information about the TLS certificates that are associated with the specified Lightsail load balancer.
     * </p>
     * <p>
     * TLS is just an updated, more secure version of Secure Socket Layer (SSL).
     * </p>
     * <p>
     * You can have a maximum of 2 certificates associated with a Lightsail load balancer. One is active and the other
     * is inactive.
     * </p>
     * 
     * @param getLoadBalancerTlsCertificatesRequest
     * @return Result of the GetLoadBalancerTlsCertificates operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetLoadBalancerTlsCertificates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetLoadBalancerTlsCertificates"
     *      target="_top">AWS API Documentation</a>
     */
    GetLoadBalancerTlsCertificatesResult getLoadBalancerTlsCertificates(GetLoadBalancerTlsCertificatesRequest getLoadBalancerTlsCertificatesRequest);

    /**
     * <p>
     * Returns information about all load balancers in an account.
     * </p>
     * 
     * @param getLoadBalancersRequest
     * @return Result of the GetLoadBalancers operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetLoadBalancers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetLoadBalancers" target="_top">AWS API
     *      Documentation</a>
     */
    GetLoadBalancersResult getLoadBalancers(GetLoadBalancersRequest getLoadBalancersRequest);

    /**
     * <p>
     * Returns information about a specific operation. Operations include events such as when you create an instance,
     * allocate a static IP, attach a static IP, and so on.
     * </p>
     * 
     * @param getOperationRequest
     * @return Result of the GetOperation operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetOperation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetOperation" target="_top">AWS API
     *      Documentation</a>
     */
    GetOperationResult getOperation(GetOperationRequest getOperationRequest);

    /**
     * <p>
     * Returns information about all operations.
     * </p>
     * <p>
     * Results are returned from oldest to newest, up to a maximum of 200. Results can be paged by making each
     * subsequent call to <code>GetOperations</code> use the maximum (last) <code>statusChangedAt</code> value from the
     * previous request.
     * </p>
     * 
     * @param getOperationsRequest
     * @return Result of the GetOperations operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetOperations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetOperations" target="_top">AWS API
     *      Documentation</a>
     */
    GetOperationsResult getOperations(GetOperationsRequest getOperationsRequest);

    /**
     * <p>
     * Gets operations for a specific resource (e.g., an instance or a static IP).
     * </p>
     * 
     * @param getOperationsForResourceRequest
     * @return Result of the GetOperationsForResource operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetOperationsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetOperationsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    GetOperationsForResourceResult getOperationsForResource(GetOperationsForResourceRequest getOperationsForResourceRequest);

    /**
     * <p>
     * Returns a list of all valid regions for Amazon Lightsail. Use the <code>include availability zones</code>
     * parameter to also return the Availability Zones in a region.
     * </p>
     * 
     * @param getRegionsRequest
     * @return Result of the GetRegions operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetRegions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRegions" target="_top">AWS API
     *      Documentation</a>
     */
    GetRegionsResult getRegions(GetRegionsRequest getRegionsRequest);

    /**
     * <p>
     * Returns information about a specific database in Amazon Lightsail.
     * </p>
     * 
     * @param getRelationalDatabaseRequest
     * @return Result of the GetRelationalDatabase operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetRelationalDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRelationalDatabase"
     *      target="_top">AWS API Documentation</a>
     */
    GetRelationalDatabaseResult getRelationalDatabase(GetRelationalDatabaseRequest getRelationalDatabaseRequest);

    /**
     * <p>
     * Returns a list of available database blueprints in Amazon Lightsail. A blueprint describes the major engine
     * version of a database.
     * </p>
     * <p>
     * You can use a blueprint ID to create a new database that runs a specific database engine.
     * </p>
     * 
     * @param getRelationalDatabaseBlueprintsRequest
     * @return Result of the GetRelationalDatabaseBlueprints operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetRelationalDatabaseBlueprints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRelationalDatabaseBlueprints"
     *      target="_top">AWS API Documentation</a>
     */
    GetRelationalDatabaseBlueprintsResult getRelationalDatabaseBlueprints(GetRelationalDatabaseBlueprintsRequest getRelationalDatabaseBlueprintsRequest);

    /**
     * <p>
     * Returns the list of bundles that are available in Amazon Lightsail. A bundle describes the performance
     * specifications for a database.
     * </p>
     * <p>
     * You can use a bundle ID to create a new database with explicit performance specifications.
     * </p>
     * 
     * @param getRelationalDatabaseBundlesRequest
     * @return Result of the GetRelationalDatabaseBundles operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetRelationalDatabaseBundles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRelationalDatabaseBundles"
     *      target="_top">AWS API Documentation</a>
     */
    GetRelationalDatabaseBundlesResult getRelationalDatabaseBundles(GetRelationalDatabaseBundlesRequest getRelationalDatabaseBundlesRequest);

    /**
     * <p>
     * Returns a list of events for a specific database in Amazon Lightsail.
     * </p>
     * 
     * @param getRelationalDatabaseEventsRequest
     * @return Result of the GetRelationalDatabaseEvents operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetRelationalDatabaseEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRelationalDatabaseEvents"
     *      target="_top">AWS API Documentation</a>
     */
    GetRelationalDatabaseEventsResult getRelationalDatabaseEvents(GetRelationalDatabaseEventsRequest getRelationalDatabaseEventsRequest);

    /**
     * <p>
     * Returns a list of log events for a database in Amazon Lightsail.
     * </p>
     * 
     * @param getRelationalDatabaseLogEventsRequest
     * @return Result of the GetRelationalDatabaseLogEvents operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetRelationalDatabaseLogEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRelationalDatabaseLogEvents"
     *      target="_top">AWS API Documentation</a>
     */
    GetRelationalDatabaseLogEventsResult getRelationalDatabaseLogEvents(GetRelationalDatabaseLogEventsRequest getRelationalDatabaseLogEventsRequest);

    /**
     * <p>
     * Returns a list of available log streams for a specific database in Amazon Lightsail.
     * </p>
     * 
     * @param getRelationalDatabaseLogStreamsRequest
     * @return Result of the GetRelationalDatabaseLogStreams operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetRelationalDatabaseLogStreams
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRelationalDatabaseLogStreams"
     *      target="_top">AWS API Documentation</a>
     */
    GetRelationalDatabaseLogStreamsResult getRelationalDatabaseLogStreams(GetRelationalDatabaseLogStreamsRequest getRelationalDatabaseLogStreamsRequest);

    /**
     * <p>
     * Returns the current, previous, or pending versions of the master user password for a Lightsail database.
     * </p>
     * <p>
     * The <code>GetRelationalDatabaseMasterUserPassword</code> operation supports tag-based access control via resource
     * tags applied to the resource identified by relationalDatabaseName.
     * </p>
     * 
     * @param getRelationalDatabaseMasterUserPasswordRequest
     * @return Result of the GetRelationalDatabaseMasterUserPassword operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetRelationalDatabaseMasterUserPassword
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRelationalDatabaseMasterUserPassword"
     *      target="_top">AWS API Documentation</a>
     */
    GetRelationalDatabaseMasterUserPasswordResult getRelationalDatabaseMasterUserPassword(
            GetRelationalDatabaseMasterUserPasswordRequest getRelationalDatabaseMasterUserPasswordRequest);

    /**
     * <p>
     * Returns the data points of the specified metric for a database in Amazon Lightsail.
     * </p>
     * <p>
     * Metrics report the utilization of your resources, and the error counts generated by them. Monitor and collect
     * metric data regularly to maintain the reliability, availability, and performance of your resources.
     * </p>
     * 
     * @param getRelationalDatabaseMetricDataRequest
     * @return Result of the GetRelationalDatabaseMetricData operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetRelationalDatabaseMetricData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRelationalDatabaseMetricData"
     *      target="_top">AWS API Documentation</a>
     */
    GetRelationalDatabaseMetricDataResult getRelationalDatabaseMetricData(GetRelationalDatabaseMetricDataRequest getRelationalDatabaseMetricDataRequest);

    /**
     * <p>
     * Returns all of the runtime parameters offered by the underlying database software, or engine, for a specific
     * database in Amazon Lightsail.
     * </p>
     * <p>
     * In addition to the parameter names and values, this operation returns other information about each parameter.
     * This information includes whether changes require a reboot, whether the parameter is modifiable, the allowed
     * values, and the data types.
     * </p>
     * 
     * @param getRelationalDatabaseParametersRequest
     * @return Result of the GetRelationalDatabaseParameters operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetRelationalDatabaseParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRelationalDatabaseParameters"
     *      target="_top">AWS API Documentation</a>
     */
    GetRelationalDatabaseParametersResult getRelationalDatabaseParameters(GetRelationalDatabaseParametersRequest getRelationalDatabaseParametersRequest);

    /**
     * <p>
     * Returns information about a specific database snapshot in Amazon Lightsail.
     * </p>
     * 
     * @param getRelationalDatabaseSnapshotRequest
     * @return Result of the GetRelationalDatabaseSnapshot operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetRelationalDatabaseSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRelationalDatabaseSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    GetRelationalDatabaseSnapshotResult getRelationalDatabaseSnapshot(GetRelationalDatabaseSnapshotRequest getRelationalDatabaseSnapshotRequest);

    /**
     * <p>
     * Returns information about all of your database snapshots in Amazon Lightsail.
     * </p>
     * 
     * @param getRelationalDatabaseSnapshotsRequest
     * @return Result of the GetRelationalDatabaseSnapshots operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetRelationalDatabaseSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRelationalDatabaseSnapshots"
     *      target="_top">AWS API Documentation</a>
     */
    GetRelationalDatabaseSnapshotsResult getRelationalDatabaseSnapshots(GetRelationalDatabaseSnapshotsRequest getRelationalDatabaseSnapshotsRequest);

    /**
     * <p>
     * Returns information about all of your databases in Amazon Lightsail.
     * </p>
     * 
     * @param getRelationalDatabasesRequest
     * @return Result of the GetRelationalDatabases operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetRelationalDatabases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRelationalDatabases"
     *      target="_top">AWS API Documentation</a>
     */
    GetRelationalDatabasesResult getRelationalDatabases(GetRelationalDatabasesRequest getRelationalDatabasesRequest);

    /**
     * <p>
     * Returns information about an Amazon Lightsail static IP.
     * </p>
     * 
     * @param getStaticIpRequest
     * @return Result of the GetStaticIp operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetStaticIp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetStaticIp" target="_top">AWS API
     *      Documentation</a>
     */
    GetStaticIpResult getStaticIp(GetStaticIpRequest getStaticIpRequest);

    /**
     * <p>
     * Returns information about all static IPs in the user's account.
     * </p>
     * 
     * @param getStaticIpsRequest
     * @return Result of the GetStaticIps operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetStaticIps
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetStaticIps" target="_top">AWS API
     *      Documentation</a>
     */
    GetStaticIpsResult getStaticIps(GetStaticIpsRequest getStaticIpsRequest);

    /**
     * <p>
     * Imports a public SSH key from a specific key pair.
     * </p>
     * 
     * @param importKeyPairRequest
     * @return Result of the ImportKeyPair operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.ImportKeyPair
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/ImportKeyPair" target="_top">AWS API
     *      Documentation</a>
     */
    ImportKeyPairResult importKeyPair(ImportKeyPairRequest importKeyPairRequest);

    /**
     * <p>
     * Returns a Boolean value indicating whether your Lightsail VPC is peered.
     * </p>
     * 
     * @param isVpcPeeredRequest
     * @return Result of the IsVpcPeered operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.IsVpcPeered
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/IsVpcPeered" target="_top">AWS API
     *      Documentation</a>
     */
    IsVpcPeeredResult isVpcPeered(IsVpcPeeredRequest isVpcPeeredRequest);

    /**
     * <p>
     * Opens ports for a specific Amazon Lightsail instance, and specifies the IP addresses allowed to connect to the
     * instance through the ports, and the protocol.
     * </p>
     * <p>
     * The <code>OpenInstancePublicPorts</code> action supports tag-based access control via resource tags applied to
     * the resource identified by <code>instanceName</code>. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param openInstancePublicPortsRequest
     * @return Result of the OpenInstancePublicPorts operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.OpenInstancePublicPorts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/OpenInstancePublicPorts"
     *      target="_top">AWS API Documentation</a>
     */
    OpenInstancePublicPortsResult openInstancePublicPorts(OpenInstancePublicPortsRequest openInstancePublicPortsRequest);

    /**
     * <p>
     * Peers the Lightsail VPC with the user's default VPC.
     * </p>
     * 
     * @param peerVpcRequest
     * @return Result of the PeerVpc operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.PeerVpc
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/PeerVpc" target="_top">AWS API
     *      Documentation</a>
     */
    PeerVpcResult peerVpc(PeerVpcRequest peerVpcRequest);

    /**
     * <p>
     * Creates or updates an alarm, and associates it with the specified metric.
     * </p>
     * <p>
     * An alarm is used to monitor a single metric for one of your resources. When a metric condition is met, the alarm
     * can notify you by email, SMS text message, and a banner displayed on the Amazon Lightsail console. For more
     * information, see <a href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-alarms">Alarms
     * in Amazon Lightsail</a>.
     * </p>
     * <p>
     * When this action creates an alarm, the alarm state is immediately set to <code>INSUFFICIENT_DATA</code>. The
     * alarm is then evaluated and its state is set appropriately. Any actions associated with the new state are then
     * executed.
     * </p>
     * <p>
     * When you update an existing alarm, its state is left unchanged, but the update completely overwrites the previous
     * configuration of the alarm. The alarm is then evaluated with the updated configuration.
     * </p>
     * 
     * @param putAlarmRequest
     * @return Result of the PutAlarm operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @sample AmazonLightsail.PutAlarm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/PutAlarm" target="_top">AWS API
     *      Documentation</a>
     */
    PutAlarmResult putAlarm(PutAlarmRequest putAlarmRequest);

    /**
     * <p>
     * Opens ports for a specific Amazon Lightsail instance, and specifies the IP addresses allowed to connect to the
     * instance through the ports, and the protocol. This action also closes all currently open ports that are not
     * included in the request. Include all of the ports and the protocols you want to open in your
     * <code>PutInstancePublicPorts</code>request. Or use the <code>OpenInstancePublicPorts</code> action to open ports
     * without closing currently open ports.
     * </p>
     * <p>
     * The <code>PutInstancePublicPorts</code> action supports tag-based access control via resource tags applied to the
     * resource identified by <code>instanceName</code>. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param putInstancePublicPortsRequest
     * @return Result of the PutInstancePublicPorts operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.PutInstancePublicPorts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/PutInstancePublicPorts"
     *      target="_top">AWS API Documentation</a>
     */
    PutInstancePublicPortsResult putInstancePublicPorts(PutInstancePublicPortsRequest putInstancePublicPortsRequest);

    /**
     * <p>
     * Restarts a specific instance.
     * </p>
     * <p>
     * The <code>reboot instance</code> operation supports tag-based access control via resource tags applied to the
     * resource identified by <code>instance name</code>. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param rebootInstanceRequest
     * @return Result of the RebootInstance operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.RebootInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/RebootInstance" target="_top">AWS API
     *      Documentation</a>
     */
    RebootInstanceResult rebootInstance(RebootInstanceRequest rebootInstanceRequest);

    /**
     * <p>
     * Restarts a specific database in Amazon Lightsail.
     * </p>
     * <p>
     * The <code>reboot relational database</code> operation supports tag-based access control via resource tags applied
     * to the resource identified by relationalDatabaseName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param rebootRelationalDatabaseRequest
     * @return Result of the RebootRelationalDatabase operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.RebootRelationalDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/RebootRelationalDatabase"
     *      target="_top">AWS API Documentation</a>
     */
    RebootRelationalDatabaseResult rebootRelationalDatabase(RebootRelationalDatabaseRequest rebootRelationalDatabaseRequest);

    /**
     * <p>
     * Registers a container image to your Amazon Lightsail container service.
     * </p>
     * <note>
     * <p>
     * This action is not required if you install and use the Lightsail Control (lightsailctl) plugin to push container
     * images to your Lightsail container service. For more information, see <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-pushing-container-images">Pushing
     * and managing container images on your Amazon Lightsail container services</a> in the <i>Amazon Lightsail
     * Developer Guide</i>.
     * </p>
     * </note>
     * 
     * @param registerContainerImageRequest
     * @return Result of the RegisterContainerImage operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.RegisterContainerImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/RegisterContainerImage"
     *      target="_top">AWS API Documentation</a>
     */
    RegisterContainerImageResult registerContainerImage(RegisterContainerImageRequest registerContainerImageRequest);

    /**
     * <p>
     * Deletes a specific static IP from your account.
     * </p>
     * 
     * @param releaseStaticIpRequest
     * @return Result of the ReleaseStaticIp operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.ReleaseStaticIp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/ReleaseStaticIp" target="_top">AWS API
     *      Documentation</a>
     */
    ReleaseStaticIpResult releaseStaticIp(ReleaseStaticIpRequest releaseStaticIpRequest);

    /**
     * <p>
     * Deletes currently cached content from your Amazon Lightsail content delivery network (CDN) distribution.
     * </p>
     * <p>
     * After resetting the cache, the next time a content request is made, your distribution pulls, serves, and caches
     * it from the origin.
     * </p>
     * 
     * @param resetDistributionCacheRequest
     * @return Result of the ResetDistributionCache operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.ResetDistributionCache
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/ResetDistributionCache"
     *      target="_top">AWS API Documentation</a>
     */
    ResetDistributionCacheResult resetDistributionCache(ResetDistributionCacheRequest resetDistributionCacheRequest);

    /**
     * <p>
     * Sends a verification request to an email contact method to ensure it's owned by the requester. SMS contact
     * methods don't need to be verified.
     * </p>
     * <p>
     * A contact method is used to send you notifications about your Amazon Lightsail resources. You can add one email
     * address and one mobile phone number contact method in each AWS Region. However, SMS text messaging is not
     * supported in some AWS Regions, and SMS text messages cannot be sent to some countries/regions. For more
     * information, see <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-notifications">Notifications in
     * Amazon Lightsail</a>.
     * </p>
     * <p>
     * A verification request is sent to the contact method when you initially create it. Use this action to send
     * another verification request if a previous verification request was deleted, or has expired.
     * </p>
     * <important>
     * <p>
     * Notifications are not sent to an email contact method until after it is verified, and confirmed as valid.
     * </p>
     * </important>
     * 
     * @param sendContactMethodVerificationRequest
     * @return Result of the SendContactMethodVerification operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @sample AmazonLightsail.SendContactMethodVerification
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/SendContactMethodVerification"
     *      target="_top">AWS API Documentation</a>
     */
    SendContactMethodVerificationResult sendContactMethodVerification(SendContactMethodVerificationRequest sendContactMethodVerificationRequest);

    /**
     * <p>
     * Sets the IP address type for an Amazon Lightsail resource.
     * </p>
     * <p>
     * Use this action to enable dual-stack for a resource, which enables IPv4 and IPv6 for the specified resource.
     * Alternately, you can use this action to disable dual-stack, and enable IPv4 only.
     * </p>
     * 
     * @param setIpAddressTypeRequest
     * @return Result of the SetIpAddressType operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.SetIpAddressType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/SetIpAddressType" target="_top">AWS API
     *      Documentation</a>
     */
    SetIpAddressTypeResult setIpAddressType(SetIpAddressTypeRequest setIpAddressTypeRequest);

    /**
     * <p>
     * Sets the Amazon Lightsail resources that can access the specified Lightsail bucket.
     * </p>
     * <p>
     * Lightsail buckets currently support setting access for Lightsail instances in the same AWS Region.
     * </p>
     * 
     * @param setResourceAccessForBucketRequest
     * @return Result of the SetResourceAccessForBucket operation returned by the service.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws ServiceException
     *         A general service exception.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.SetResourceAccessForBucket
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/SetResourceAccessForBucket"
     *      target="_top">AWS API Documentation</a>
     */
    SetResourceAccessForBucketResult setResourceAccessForBucket(SetResourceAccessForBucketRequest setResourceAccessForBucketRequest);

    /**
     * <p>
     * Starts a specific Amazon Lightsail instance from a stopped state. To restart an instance, use the
     * <code>reboot instance</code> operation.
     * </p>
     * <note>
     * <p>
     * When you start a stopped instance, Lightsail assigns a new public IP address to the instance. To use the same IP
     * address after stopping and starting an instance, create a static IP address and attach it to the instance. For
     * more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/lightsail-create-static-ip">Amazon Lightsail
     * Developer Guide</a>.
     * </p>
     * </note>
     * <p>
     * The <code>start instance</code> operation supports tag-based access control via resource tags applied to the
     * resource identified by <code>instance name</code>. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param startInstanceRequest
     * @return Result of the StartInstance operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.StartInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/StartInstance" target="_top">AWS API
     *      Documentation</a>
     */
    StartInstanceResult startInstance(StartInstanceRequest startInstanceRequest);

    /**
     * <p>
     * Starts a specific database from a stopped state in Amazon Lightsail. To restart a database, use the
     * <code>reboot relational database</code> operation.
     * </p>
     * <p>
     * The <code>start relational database</code> operation supports tag-based access control via resource tags applied
     * to the resource identified by relationalDatabaseName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param startRelationalDatabaseRequest
     * @return Result of the StartRelationalDatabase operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.StartRelationalDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/StartRelationalDatabase"
     *      target="_top">AWS API Documentation</a>
     */
    StartRelationalDatabaseResult startRelationalDatabase(StartRelationalDatabaseRequest startRelationalDatabaseRequest);

    /**
     * <p>
     * Stops a specific Amazon Lightsail instance that is currently running.
     * </p>
     * <note>
     * <p>
     * When you start a stopped instance, Lightsail assigns a new public IP address to the instance. To use the same IP
     * address after stopping and starting an instance, create a static IP address and attach it to the instance. For
     * more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/lightsail-create-static-ip">Amazon Lightsail
     * Developer Guide</a>.
     * </p>
     * </note>
     * <p>
     * The <code>stop instance</code> operation supports tag-based access control via resource tags applied to the
     * resource identified by <code>instance name</code>. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param stopInstanceRequest
     * @return Result of the StopInstance operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.StopInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/StopInstance" target="_top">AWS API
     *      Documentation</a>
     */
    StopInstanceResult stopInstance(StopInstanceRequest stopInstanceRequest);

    /**
     * <p>
     * Stops a specific database that is currently running in Amazon Lightsail.
     * </p>
     * <p>
     * The <code>stop relational database</code> operation supports tag-based access control via resource tags applied
     * to the resource identified by relationalDatabaseName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param stopRelationalDatabaseRequest
     * @return Result of the StopRelationalDatabase operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.StopRelationalDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/StopRelationalDatabase"
     *      target="_top">AWS API Documentation</a>
     */
    StopRelationalDatabaseResult stopRelationalDatabase(StopRelationalDatabaseRequest stopRelationalDatabaseRequest);

    /**
     * <p>
     * Adds one or more tags to the specified Amazon Lightsail resource. Each resource can have a maximum of 50 tags.
     * Each tag consists of a key and an optional value. Tag keys must be unique per resource. For more information
     * about tags, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-tags">Amazon Lightsail Developer
     * Guide</a>.
     * </p>
     * <p>
     * The <code>tag resource</code> operation supports tag-based access control via request tags and resource tags
     * applied to the resource identified by <code>resource name</code>. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Tests an alarm by displaying a banner on the Amazon Lightsail console. If a notification trigger is configured
     * for the specified alarm, the test also sends a notification to the notification protocol (<code>Email</code>
     * and/or <code>SMS</code>) configured for the alarm.
     * </p>
     * <p>
     * An alarm is used to monitor a single metric for one of your resources. When a metric condition is met, the alarm
     * can notify you by email, SMS text message, and a banner displayed on the Amazon Lightsail console. For more
     * information, see <a href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-alarms">Alarms
     * in Amazon Lightsail</a>.
     * </p>
     * 
     * @param testAlarmRequest
     * @return Result of the TestAlarm operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @sample AmazonLightsail.TestAlarm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/TestAlarm" target="_top">AWS API
     *      Documentation</a>
     */
    TestAlarmResult testAlarm(TestAlarmRequest testAlarmRequest);

    /**
     * <p>
     * Unpeers the Lightsail VPC from the user's default VPC.
     * </p>
     * 
     * @param unpeerVpcRequest
     * @return Result of the UnpeerVpc operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.UnpeerVpc
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/UnpeerVpc" target="_top">AWS API
     *      Documentation</a>
     */
    UnpeerVpcResult unpeerVpc(UnpeerVpcRequest unpeerVpcRequest);

    /**
     * <p>
     * Deletes the specified set of tag keys and their values from the specified Amazon Lightsail resource.
     * </p>
     * <p>
     * The <code>untag resource</code> operation supports tag-based access control via request tags and resource tags
     * applied to the resource identified by <code>resource name</code>. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates an existing Amazon Lightsail bucket.
     * </p>
     * <p>
     * Use this action to update the configuration of an existing bucket, such as versioning, public accessibility, and
     * the AWS accounts that can access the bucket.
     * </p>
     * 
     * @param updateBucketRequest
     * @return Result of the UpdateBucket operation returned by the service.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws ServiceException
     *         A general service exception.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.UpdateBucket
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/UpdateBucket" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateBucketResult updateBucket(UpdateBucketRequest updateBucketRequest);

    /**
     * <p>
     * Updates the bundle, or storage plan, of an existing Amazon Lightsail bucket.
     * </p>
     * <p>
     * A bucket bundle specifies the monthly cost, storage space, and data transfer quota for a bucket. You can update a
     * bucket's bundle only one time within a monthly AWS billing cycle. To determine if you can update a bucket's
     * bundle, use the <a>GetBuckets</a> action. The <code>ableToUpdateBundle</code> parameter in the response will
     * indicate whether you can currently update a bucket's bundle.
     * </p>
     * <p>
     * Update a bucket's bundle if it's consistently going over its storage space or data transfer quota, or if a
     * bucket's usage is consistently in the lower range of its storage space or data transfer quota. Due to the
     * unpredictable usage fluctuations that a bucket might experience, we strongly recommend that you update a bucket's
     * bundle only as a long-term strategy, instead of as a short-term, monthly cost-cutting measure. Choose a bucket
     * bundle that will provide the bucket with ample storage space and data transfer for a long time to come.
     * </p>
     * 
     * @param updateBucketBundleRequest
     * @return Result of the UpdateBucketBundle operation returned by the service.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws ServiceException
     *         A general service exception.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.UpdateBucketBundle
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/UpdateBucketBundle" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateBucketBundleResult updateBucketBundle(UpdateBucketBundleRequest updateBucketBundleRequest);

    /**
     * <p>
     * Updates the configuration of your Amazon Lightsail container service, such as its power, scale, and public domain
     * names.
     * </p>
     * 
     * @param updateContainerServiceRequest
     * @return Result of the UpdateContainerService operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.UpdateContainerService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/UpdateContainerService"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateContainerServiceResult updateContainerService(UpdateContainerServiceRequest updateContainerServiceRequest);

    /**
     * <p>
     * Updates an existing Amazon Lightsail content delivery network (CDN) distribution.
     * </p>
     * <p>
     * Use this action to update the configuration of your existing distribution.
     * </p>
     * 
     * @param updateDistributionRequest
     * @return Result of the UpdateDistribution operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.UpdateDistribution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/UpdateDistribution" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateDistributionResult updateDistribution(UpdateDistributionRequest updateDistributionRequest);

    /**
     * <p>
     * Updates the bundle of your Amazon Lightsail content delivery network (CDN) distribution.
     * </p>
     * <p>
     * A distribution bundle specifies the monthly network transfer quota and monthly cost of your dsitribution.
     * </p>
     * <p>
     * Update your distribution's bundle if your distribution is going over its monthly network transfer quota and is
     * incurring an overage fee.
     * </p>
     * <p>
     * You can update your distribution's bundle only one time within your monthly AWS billing cycle. To determine if
     * you can update your distribution's bundle, use the <code>GetDistributions</code> action. The
     * <code>ableToUpdateBundle</code> parameter in the result will indicate whether you can currently update your
     * distribution's bundle.
     * </p>
     * 
     * @param updateDistributionBundleRequest
     * @return Result of the UpdateDistributionBundle operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.UpdateDistributionBundle
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/UpdateDistributionBundle"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateDistributionBundleResult updateDistributionBundle(UpdateDistributionBundleRequest updateDistributionBundleRequest);

    /**
     * <p>
     * Updates a domain recordset after it is created.
     * </p>
     * <p>
     * The <code>update domain entry</code> operation supports tag-based access control via resource tags applied to the
     * resource identified by <code>domain name</code>. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param updateDomainEntryRequest
     * @return Result of the UpdateDomainEntry operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.UpdateDomainEntry
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/UpdateDomainEntry" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateDomainEntryResult updateDomainEntry(UpdateDomainEntryRequest updateDomainEntryRequest);

    /**
     * <p>
     * Updates the specified attribute for a load balancer. You can only update one attribute at a time.
     * </p>
     * <p>
     * The <code>update load balancer attribute</code> operation supports tag-based access control via resource tags
     * applied to the resource identified by <code>load balancer name</code>. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param updateLoadBalancerAttributeRequest
     * @return Result of the UpdateLoadBalancerAttribute operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.UpdateLoadBalancerAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/UpdateLoadBalancerAttribute"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateLoadBalancerAttributeResult updateLoadBalancerAttribute(UpdateLoadBalancerAttributeRequest updateLoadBalancerAttributeRequest);

    /**
     * <p>
     * Allows the update of one or more attributes of a database in Amazon Lightsail.
     * </p>
     * <p>
     * Updates are applied immediately, or in cases where the updates could result in an outage, are applied during the
     * database's predefined maintenance window.
     * </p>
     * <p>
     * The <code>update relational database</code> operation supports tag-based access control via resource tags applied
     * to the resource identified by relationalDatabaseName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param updateRelationalDatabaseRequest
     * @return Result of the UpdateRelationalDatabase operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.UpdateRelationalDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/UpdateRelationalDatabase"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateRelationalDatabaseResult updateRelationalDatabase(UpdateRelationalDatabaseRequest updateRelationalDatabaseRequest);

    /**
     * <p>
     * Allows the update of one or more parameters of a database in Amazon Lightsail.
     * </p>
     * <p>
     * Parameter updates don't cause outages; therefore, their application is not subject to the preferred maintenance
     * window. However, there are two ways in which parameter updates are applied: <code>dynamic</code> or
     * <code>pending-reboot</code>. Parameters marked with a <code>dynamic</code> apply type are applied immediately.
     * Parameters marked with a <code>pending-reboot</code> apply type are applied only after the database is rebooted
     * using the <code>reboot relational database</code> operation.
     * </p>
     * <p>
     * The <code>update relational database parameters</code> operation supports tag-based access control via resource
     * tags applied to the resource identified by relationalDatabaseName. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-controlling-access-using-tags"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param updateRelationalDatabaseParametersRequest
     * @return Result of the UpdateRelationalDatabaseParameters operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.</p> <note>
     *         <p>
     *         Domain and distribution APIs are only available in the N. Virginia (<code>us-east-1</code>) AWS Region.
     *         Please set your AWS Region configuration to <code>us-east-1</code> to create, view, or edit these
     *         resources.
     *         </p>
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.UpdateRelationalDatabaseParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/UpdateRelationalDatabaseParameters"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateRelationalDatabaseParametersResult updateRelationalDatabaseParameters(
            UpdateRelationalDatabaseParametersRequest updateRelationalDatabaseParametersRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}
