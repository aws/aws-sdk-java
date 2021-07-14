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

import com.amazonaws.services.lightsail.model.*;

/**
 * Interface for accessing Amazon Lightsail asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.lightsail.AbstractAmazonLightsailAsync} instead.
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
public interface AmazonLightsailAsync extends AmazonLightsail {

    /**
     * <p>
     * Allocates a static IP address.
     * </p>
     * 
     * @param allocateStaticIpRequest
     * @return A Java Future containing the result of the AllocateStaticIp operation returned by the service.
     * @sample AmazonLightsailAsync.AllocateStaticIp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/AllocateStaticIp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AllocateStaticIpResult> allocateStaticIpAsync(AllocateStaticIpRequest allocateStaticIpRequest);

    /**
     * <p>
     * Allocates a static IP address.
     * </p>
     * 
     * @param allocateStaticIpRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AllocateStaticIp operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.AllocateStaticIp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/AllocateStaticIp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AllocateStaticIpResult> allocateStaticIpAsync(AllocateStaticIpRequest allocateStaticIpRequest,
            com.amazonaws.handlers.AsyncHandler<AllocateStaticIpRequest, AllocateStaticIpResult> asyncHandler);

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
     * @return A Java Future containing the result of the AttachCertificateToDistribution operation returned by the
     *         service.
     * @sample AmazonLightsailAsync.AttachCertificateToDistribution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/AttachCertificateToDistribution"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AttachCertificateToDistributionResult> attachCertificateToDistributionAsync(
            AttachCertificateToDistributionRequest attachCertificateToDistributionRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AttachCertificateToDistribution operation returned by the
     *         service.
     * @sample AmazonLightsailAsyncHandler.AttachCertificateToDistribution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/AttachCertificateToDistribution"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AttachCertificateToDistributionResult> attachCertificateToDistributionAsync(
            AttachCertificateToDistributionRequest attachCertificateToDistributionRequest,
            com.amazonaws.handlers.AsyncHandler<AttachCertificateToDistributionRequest, AttachCertificateToDistributionResult> asyncHandler);

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
     * @return A Java Future containing the result of the AttachDisk operation returned by the service.
     * @sample AmazonLightsailAsync.AttachDisk
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/AttachDisk" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AttachDiskResult> attachDiskAsync(AttachDiskRequest attachDiskRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AttachDisk operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.AttachDisk
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/AttachDisk" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AttachDiskResult> attachDiskAsync(AttachDiskRequest attachDiskRequest,
            com.amazonaws.handlers.AsyncHandler<AttachDiskRequest, AttachDiskResult> asyncHandler);

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
     * @return A Java Future containing the result of the AttachInstancesToLoadBalancer operation returned by the
     *         service.
     * @sample AmazonLightsailAsync.AttachInstancesToLoadBalancer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/AttachInstancesToLoadBalancer"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AttachInstancesToLoadBalancerResult> attachInstancesToLoadBalancerAsync(
            AttachInstancesToLoadBalancerRequest attachInstancesToLoadBalancerRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AttachInstancesToLoadBalancer operation returned by the
     *         service.
     * @sample AmazonLightsailAsyncHandler.AttachInstancesToLoadBalancer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/AttachInstancesToLoadBalancer"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AttachInstancesToLoadBalancerResult> attachInstancesToLoadBalancerAsync(
            AttachInstancesToLoadBalancerRequest attachInstancesToLoadBalancerRequest,
            com.amazonaws.handlers.AsyncHandler<AttachInstancesToLoadBalancerRequest, AttachInstancesToLoadBalancerResult> asyncHandler);

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
     * @return A Java Future containing the result of the AttachLoadBalancerTlsCertificate operation returned by the
     *         service.
     * @sample AmazonLightsailAsync.AttachLoadBalancerTlsCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/AttachLoadBalancerTlsCertificate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AttachLoadBalancerTlsCertificateResult> attachLoadBalancerTlsCertificateAsync(
            AttachLoadBalancerTlsCertificateRequest attachLoadBalancerTlsCertificateRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AttachLoadBalancerTlsCertificate operation returned by the
     *         service.
     * @sample AmazonLightsailAsyncHandler.AttachLoadBalancerTlsCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/AttachLoadBalancerTlsCertificate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AttachLoadBalancerTlsCertificateResult> attachLoadBalancerTlsCertificateAsync(
            AttachLoadBalancerTlsCertificateRequest attachLoadBalancerTlsCertificateRequest,
            com.amazonaws.handlers.AsyncHandler<AttachLoadBalancerTlsCertificateRequest, AttachLoadBalancerTlsCertificateResult> asyncHandler);

    /**
     * <p>
     * Attaches a static IP address to a specific Amazon Lightsail instance.
     * </p>
     * 
     * @param attachStaticIpRequest
     * @return A Java Future containing the result of the AttachStaticIp operation returned by the service.
     * @sample AmazonLightsailAsync.AttachStaticIp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/AttachStaticIp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AttachStaticIpResult> attachStaticIpAsync(AttachStaticIpRequest attachStaticIpRequest);

    /**
     * <p>
     * Attaches a static IP address to a specific Amazon Lightsail instance.
     * </p>
     * 
     * @param attachStaticIpRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AttachStaticIp operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.AttachStaticIp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/AttachStaticIp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AttachStaticIpResult> attachStaticIpAsync(AttachStaticIpRequest attachStaticIpRequest,
            com.amazonaws.handlers.AsyncHandler<AttachStaticIpRequest, AttachStaticIpResult> asyncHandler);

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
     * @return A Java Future containing the result of the CloseInstancePublicPorts operation returned by the service.
     * @sample AmazonLightsailAsync.CloseInstancePublicPorts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CloseInstancePublicPorts"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CloseInstancePublicPortsResult> closeInstancePublicPortsAsync(CloseInstancePublicPortsRequest closeInstancePublicPortsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CloseInstancePublicPorts operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.CloseInstancePublicPorts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CloseInstancePublicPorts"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CloseInstancePublicPortsResult> closeInstancePublicPortsAsync(CloseInstancePublicPortsRequest closeInstancePublicPortsRequest,
            com.amazonaws.handlers.AsyncHandler<CloseInstancePublicPortsRequest, CloseInstancePublicPortsResult> asyncHandler);

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
     * @return A Java Future containing the result of the CopySnapshot operation returned by the service.
     * @sample AmazonLightsailAsync.CopySnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CopySnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CopySnapshotResult> copySnapshotAsync(CopySnapshotRequest copySnapshotRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CopySnapshot operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.CopySnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CopySnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CopySnapshotResult> copySnapshotAsync(CopySnapshotRequest copySnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<CopySnapshotRequest, CopySnapshotResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateBucket operation returned by the service.
     * @sample AmazonLightsailAsync.CreateBucket
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateBucket" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateBucketResult> createBucketAsync(CreateBucketRequest createBucketRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateBucket operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.CreateBucket
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateBucket" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateBucketResult> createBucketAsync(CreateBucketRequest createBucketRequest,
            com.amazonaws.handlers.AsyncHandler<CreateBucketRequest, CreateBucketResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateBucketAccessKey operation returned by the service.
     * @sample AmazonLightsailAsync.CreateBucketAccessKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateBucketAccessKey"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateBucketAccessKeyResult> createBucketAccessKeyAsync(CreateBucketAccessKeyRequest createBucketAccessKeyRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateBucketAccessKey operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.CreateBucketAccessKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateBucketAccessKey"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateBucketAccessKeyResult> createBucketAccessKeyAsync(CreateBucketAccessKeyRequest createBucketAccessKeyRequest,
            com.amazonaws.handlers.AsyncHandler<CreateBucketAccessKeyRequest, CreateBucketAccessKeyResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateCertificate operation returned by the service.
     * @sample AmazonLightsailAsync.CreateCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateCertificate" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateCertificateResult> createCertificateAsync(CreateCertificateRequest createCertificateRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateCertificate operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.CreateCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateCertificate" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateCertificateResult> createCertificateAsync(CreateCertificateRequest createCertificateRequest,
            com.amazonaws.handlers.AsyncHandler<CreateCertificateRequest, CreateCertificateResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateCloudFormationStack operation returned by the service.
     * @sample AmazonLightsailAsync.CreateCloudFormationStack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateCloudFormationStack"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateCloudFormationStackResult> createCloudFormationStackAsync(
            CreateCloudFormationStackRequest createCloudFormationStackRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateCloudFormationStack operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.CreateCloudFormationStack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateCloudFormationStack"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateCloudFormationStackResult> createCloudFormationStackAsync(
            CreateCloudFormationStackRequest createCloudFormationStackRequest,
            com.amazonaws.handlers.AsyncHandler<CreateCloudFormationStackRequest, CreateCloudFormationStackResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateContactMethod operation returned by the service.
     * @sample AmazonLightsailAsync.CreateContactMethod
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateContactMethod" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateContactMethodResult> createContactMethodAsync(CreateContactMethodRequest createContactMethodRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateContactMethod operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.CreateContactMethod
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateContactMethod" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateContactMethodResult> createContactMethodAsync(CreateContactMethodRequest createContactMethodRequest,
            com.amazonaws.handlers.AsyncHandler<CreateContactMethodRequest, CreateContactMethodResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateContainerService operation returned by the service.
     * @sample AmazonLightsailAsync.CreateContainerService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateContainerService"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateContainerServiceResult> createContainerServiceAsync(CreateContainerServiceRequest createContainerServiceRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateContainerService operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.CreateContainerService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateContainerService"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateContainerServiceResult> createContainerServiceAsync(CreateContainerServiceRequest createContainerServiceRequest,
            com.amazonaws.handlers.AsyncHandler<CreateContainerServiceRequest, CreateContainerServiceResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateContainerServiceDeployment operation returned by the
     *         service.
     * @sample AmazonLightsailAsync.CreateContainerServiceDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateContainerServiceDeployment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateContainerServiceDeploymentResult> createContainerServiceDeploymentAsync(
            CreateContainerServiceDeploymentRequest createContainerServiceDeploymentRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateContainerServiceDeployment operation returned by the
     *         service.
     * @sample AmazonLightsailAsyncHandler.CreateContainerServiceDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateContainerServiceDeployment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateContainerServiceDeploymentResult> createContainerServiceDeploymentAsync(
            CreateContainerServiceDeploymentRequest createContainerServiceDeploymentRequest,
            com.amazonaws.handlers.AsyncHandler<CreateContainerServiceDeploymentRequest, CreateContainerServiceDeploymentResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateContainerServiceRegistryLogin operation returned by the
     *         service.
     * @sample AmazonLightsailAsync.CreateContainerServiceRegistryLogin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateContainerServiceRegistryLogin"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateContainerServiceRegistryLoginResult> createContainerServiceRegistryLoginAsync(
            CreateContainerServiceRegistryLoginRequest createContainerServiceRegistryLoginRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateContainerServiceRegistryLogin operation returned by the
     *         service.
     * @sample AmazonLightsailAsyncHandler.CreateContainerServiceRegistryLogin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateContainerServiceRegistryLogin"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateContainerServiceRegistryLoginResult> createContainerServiceRegistryLoginAsync(
            CreateContainerServiceRegistryLoginRequest createContainerServiceRegistryLoginRequest,
            com.amazonaws.handlers.AsyncHandler<CreateContainerServiceRegistryLoginRequest, CreateContainerServiceRegistryLoginResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateDisk operation returned by the service.
     * @sample AmazonLightsailAsync.CreateDisk
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateDisk" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateDiskResult> createDiskAsync(CreateDiskRequest createDiskRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDisk operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.CreateDisk
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateDisk" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateDiskResult> createDiskAsync(CreateDiskRequest createDiskRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDiskRequest, CreateDiskResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateDiskFromSnapshot operation returned by the service.
     * @sample AmazonLightsailAsync.CreateDiskFromSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateDiskFromSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateDiskFromSnapshotResult> createDiskFromSnapshotAsync(CreateDiskFromSnapshotRequest createDiskFromSnapshotRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDiskFromSnapshot operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.CreateDiskFromSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateDiskFromSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateDiskFromSnapshotResult> createDiskFromSnapshotAsync(CreateDiskFromSnapshotRequest createDiskFromSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDiskFromSnapshotRequest, CreateDiskFromSnapshotResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateDiskSnapshot operation returned by the service.
     * @sample AmazonLightsailAsync.CreateDiskSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateDiskSnapshot" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateDiskSnapshotResult> createDiskSnapshotAsync(CreateDiskSnapshotRequest createDiskSnapshotRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDiskSnapshot operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.CreateDiskSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateDiskSnapshot" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateDiskSnapshotResult> createDiskSnapshotAsync(CreateDiskSnapshotRequest createDiskSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDiskSnapshotRequest, CreateDiskSnapshotResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateDistribution operation returned by the service.
     * @sample AmazonLightsailAsync.CreateDistribution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateDistribution" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateDistributionResult> createDistributionAsync(CreateDistributionRequest createDistributionRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDistribution operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.CreateDistribution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateDistribution" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateDistributionResult> createDistributionAsync(CreateDistributionRequest createDistributionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDistributionRequest, CreateDistributionResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateDomain operation returned by the service.
     * @sample AmazonLightsailAsync.CreateDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateDomain" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateDomainResult> createDomainAsync(CreateDomainRequest createDomainRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDomain operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.CreateDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateDomain" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateDomainResult> createDomainAsync(CreateDomainRequest createDomainRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDomainRequest, CreateDomainResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateDomainEntry operation returned by the service.
     * @sample AmazonLightsailAsync.CreateDomainEntry
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateDomainEntry" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateDomainEntryResult> createDomainEntryAsync(CreateDomainEntryRequest createDomainEntryRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDomainEntry operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.CreateDomainEntry
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateDomainEntry" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateDomainEntryResult> createDomainEntryAsync(CreateDomainEntryRequest createDomainEntryRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDomainEntryRequest, CreateDomainEntryResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateInstanceSnapshot operation returned by the service.
     * @sample AmazonLightsailAsync.CreateInstanceSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateInstanceSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateInstanceSnapshotResult> createInstanceSnapshotAsync(CreateInstanceSnapshotRequest createInstanceSnapshotRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateInstanceSnapshot operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.CreateInstanceSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateInstanceSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateInstanceSnapshotResult> createInstanceSnapshotAsync(CreateInstanceSnapshotRequest createInstanceSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<CreateInstanceSnapshotRequest, CreateInstanceSnapshotResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateInstances operation returned by the service.
     * @sample AmazonLightsailAsync.CreateInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateInstances" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateInstancesResult> createInstancesAsync(CreateInstancesRequest createInstancesRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateInstances operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.CreateInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateInstances" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateInstancesResult> createInstancesAsync(CreateInstancesRequest createInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<CreateInstancesRequest, CreateInstancesResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateInstancesFromSnapshot operation returned by the service.
     * @sample AmazonLightsailAsync.CreateInstancesFromSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateInstancesFromSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateInstancesFromSnapshotResult> createInstancesFromSnapshotAsync(
            CreateInstancesFromSnapshotRequest createInstancesFromSnapshotRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateInstancesFromSnapshot operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.CreateInstancesFromSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateInstancesFromSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateInstancesFromSnapshotResult> createInstancesFromSnapshotAsync(
            CreateInstancesFromSnapshotRequest createInstancesFromSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<CreateInstancesFromSnapshotRequest, CreateInstancesFromSnapshotResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateKeyPair operation returned by the service.
     * @sample AmazonLightsailAsync.CreateKeyPair
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateKeyPair" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateKeyPairResult> createKeyPairAsync(CreateKeyPairRequest createKeyPairRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateKeyPair operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.CreateKeyPair
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateKeyPair" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateKeyPairResult> createKeyPairAsync(CreateKeyPairRequest createKeyPairRequest,
            com.amazonaws.handlers.AsyncHandler<CreateKeyPairRequest, CreateKeyPairResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateLoadBalancer operation returned by the service.
     * @sample AmazonLightsailAsync.CreateLoadBalancer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateLoadBalancer" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateLoadBalancerResult> createLoadBalancerAsync(CreateLoadBalancerRequest createLoadBalancerRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateLoadBalancer operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.CreateLoadBalancer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateLoadBalancer" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateLoadBalancerResult> createLoadBalancerAsync(CreateLoadBalancerRequest createLoadBalancerRequest,
            com.amazonaws.handlers.AsyncHandler<CreateLoadBalancerRequest, CreateLoadBalancerResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateLoadBalancerTlsCertificate operation returned by the
     *         service.
     * @sample AmazonLightsailAsync.CreateLoadBalancerTlsCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateLoadBalancerTlsCertificate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateLoadBalancerTlsCertificateResult> createLoadBalancerTlsCertificateAsync(
            CreateLoadBalancerTlsCertificateRequest createLoadBalancerTlsCertificateRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateLoadBalancerTlsCertificate operation returned by the
     *         service.
     * @sample AmazonLightsailAsyncHandler.CreateLoadBalancerTlsCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateLoadBalancerTlsCertificate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateLoadBalancerTlsCertificateResult> createLoadBalancerTlsCertificateAsync(
            CreateLoadBalancerTlsCertificateRequest createLoadBalancerTlsCertificateRequest,
            com.amazonaws.handlers.AsyncHandler<CreateLoadBalancerTlsCertificateRequest, CreateLoadBalancerTlsCertificateResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateRelationalDatabase operation returned by the service.
     * @sample AmazonLightsailAsync.CreateRelationalDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateRelationalDatabase"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateRelationalDatabaseResult> createRelationalDatabaseAsync(CreateRelationalDatabaseRequest createRelationalDatabaseRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateRelationalDatabase operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.CreateRelationalDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateRelationalDatabase"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateRelationalDatabaseResult> createRelationalDatabaseAsync(CreateRelationalDatabaseRequest createRelationalDatabaseRequest,
            com.amazonaws.handlers.AsyncHandler<CreateRelationalDatabaseRequest, CreateRelationalDatabaseResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateRelationalDatabaseFromSnapshot operation returned by the
     *         service.
     * @sample AmazonLightsailAsync.CreateRelationalDatabaseFromSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateRelationalDatabaseFromSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateRelationalDatabaseFromSnapshotResult> createRelationalDatabaseFromSnapshotAsync(
            CreateRelationalDatabaseFromSnapshotRequest createRelationalDatabaseFromSnapshotRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateRelationalDatabaseFromSnapshot operation returned by the
     *         service.
     * @sample AmazonLightsailAsyncHandler.CreateRelationalDatabaseFromSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateRelationalDatabaseFromSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateRelationalDatabaseFromSnapshotResult> createRelationalDatabaseFromSnapshotAsync(
            CreateRelationalDatabaseFromSnapshotRequest createRelationalDatabaseFromSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<CreateRelationalDatabaseFromSnapshotRequest, CreateRelationalDatabaseFromSnapshotResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateRelationalDatabaseSnapshot operation returned by the
     *         service.
     * @sample AmazonLightsailAsync.CreateRelationalDatabaseSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateRelationalDatabaseSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateRelationalDatabaseSnapshotResult> createRelationalDatabaseSnapshotAsync(
            CreateRelationalDatabaseSnapshotRequest createRelationalDatabaseSnapshotRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateRelationalDatabaseSnapshot operation returned by the
     *         service.
     * @sample AmazonLightsailAsyncHandler.CreateRelationalDatabaseSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateRelationalDatabaseSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateRelationalDatabaseSnapshotResult> createRelationalDatabaseSnapshotAsync(
            CreateRelationalDatabaseSnapshotRequest createRelationalDatabaseSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<CreateRelationalDatabaseSnapshotRequest, CreateRelationalDatabaseSnapshotResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteAlarm operation returned by the service.
     * @sample AmazonLightsailAsync.DeleteAlarm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteAlarm" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAlarmResult> deleteAlarmAsync(DeleteAlarmRequest deleteAlarmRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAlarm operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.DeleteAlarm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteAlarm" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAlarmResult> deleteAlarmAsync(DeleteAlarmRequest deleteAlarmRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAlarmRequest, DeleteAlarmResult> asyncHandler);

    /**
     * <p>
     * Deletes an automatic snapshot of an instance or disk. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-configuring-automatic-snapshots"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param deleteAutoSnapshotRequest
     * @return A Java Future containing the result of the DeleteAutoSnapshot operation returned by the service.
     * @sample AmazonLightsailAsync.DeleteAutoSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteAutoSnapshot" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAutoSnapshotResult> deleteAutoSnapshotAsync(DeleteAutoSnapshotRequest deleteAutoSnapshotRequest);

    /**
     * <p>
     * Deletes an automatic snapshot of an instance or disk. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-configuring-automatic-snapshots"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param deleteAutoSnapshotRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAutoSnapshot operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.DeleteAutoSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteAutoSnapshot" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAutoSnapshotResult> deleteAutoSnapshotAsync(DeleteAutoSnapshotRequest deleteAutoSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAutoSnapshotRequest, DeleteAutoSnapshotResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteBucket operation returned by the service.
     * @sample AmazonLightsailAsync.DeleteBucket
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteBucket" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteBucketResult> deleteBucketAsync(DeleteBucketRequest deleteBucketRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteBucket operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.DeleteBucket
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteBucket" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteBucketResult> deleteBucketAsync(DeleteBucketRequest deleteBucketRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteBucketRequest, DeleteBucketResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteBucketAccessKey operation returned by the service.
     * @sample AmazonLightsailAsync.DeleteBucketAccessKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteBucketAccessKey"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteBucketAccessKeyResult> deleteBucketAccessKeyAsync(DeleteBucketAccessKeyRequest deleteBucketAccessKeyRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteBucketAccessKey operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.DeleteBucketAccessKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteBucketAccessKey"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteBucketAccessKeyResult> deleteBucketAccessKeyAsync(DeleteBucketAccessKeyRequest deleteBucketAccessKeyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteBucketAccessKeyRequest, DeleteBucketAccessKeyResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteCertificate operation returned by the service.
     * @sample AmazonLightsailAsync.DeleteCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteCertificate" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteCertificateResult> deleteCertificateAsync(DeleteCertificateRequest deleteCertificateRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteCertificate operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.DeleteCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteCertificate" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteCertificateResult> deleteCertificateAsync(DeleteCertificateRequest deleteCertificateRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteCertificateRequest, DeleteCertificateResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteContactMethod operation returned by the service.
     * @sample AmazonLightsailAsync.DeleteContactMethod
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteContactMethod" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteContactMethodResult> deleteContactMethodAsync(DeleteContactMethodRequest deleteContactMethodRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteContactMethod operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.DeleteContactMethod
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteContactMethod" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteContactMethodResult> deleteContactMethodAsync(DeleteContactMethodRequest deleteContactMethodRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteContactMethodRequest, DeleteContactMethodResult> asyncHandler);

    /**
     * <p>
     * Deletes a container image that is registered to your Amazon Lightsail container service.
     * </p>
     * 
     * @param deleteContainerImageRequest
     * @return A Java Future containing the result of the DeleteContainerImage operation returned by the service.
     * @sample AmazonLightsailAsync.DeleteContainerImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteContainerImage" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteContainerImageResult> deleteContainerImageAsync(DeleteContainerImageRequest deleteContainerImageRequest);

    /**
     * <p>
     * Deletes a container image that is registered to your Amazon Lightsail container service.
     * </p>
     * 
     * @param deleteContainerImageRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteContainerImage operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.DeleteContainerImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteContainerImage" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteContainerImageResult> deleteContainerImageAsync(DeleteContainerImageRequest deleteContainerImageRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteContainerImageRequest, DeleteContainerImageResult> asyncHandler);

    /**
     * <p>
     * Deletes your Amazon Lightsail container service.
     * </p>
     * 
     * @param deleteContainerServiceRequest
     * @return A Java Future containing the result of the DeleteContainerService operation returned by the service.
     * @sample AmazonLightsailAsync.DeleteContainerService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteContainerService"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteContainerServiceResult> deleteContainerServiceAsync(DeleteContainerServiceRequest deleteContainerServiceRequest);

    /**
     * <p>
     * Deletes your Amazon Lightsail container service.
     * </p>
     * 
     * @param deleteContainerServiceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteContainerService operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.DeleteContainerService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteContainerService"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteContainerServiceResult> deleteContainerServiceAsync(DeleteContainerServiceRequest deleteContainerServiceRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteContainerServiceRequest, DeleteContainerServiceResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteDisk operation returned by the service.
     * @sample AmazonLightsailAsync.DeleteDisk
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteDisk" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteDiskResult> deleteDiskAsync(DeleteDiskRequest deleteDiskRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDisk operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.DeleteDisk
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteDisk" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteDiskResult> deleteDiskAsync(DeleteDiskRequest deleteDiskRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDiskRequest, DeleteDiskResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteDiskSnapshot operation returned by the service.
     * @sample AmazonLightsailAsync.DeleteDiskSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteDiskSnapshot" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDiskSnapshotResult> deleteDiskSnapshotAsync(DeleteDiskSnapshotRequest deleteDiskSnapshotRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDiskSnapshot operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.DeleteDiskSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteDiskSnapshot" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDiskSnapshotResult> deleteDiskSnapshotAsync(DeleteDiskSnapshotRequest deleteDiskSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDiskSnapshotRequest, DeleteDiskSnapshotResult> asyncHandler);

    /**
     * <p>
     * Deletes your Amazon Lightsail content delivery network (CDN) distribution.
     * </p>
     * 
     * @param deleteDistributionRequest
     * @return A Java Future containing the result of the DeleteDistribution operation returned by the service.
     * @sample AmazonLightsailAsync.DeleteDistribution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteDistribution" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDistributionResult> deleteDistributionAsync(DeleteDistributionRequest deleteDistributionRequest);

    /**
     * <p>
     * Deletes your Amazon Lightsail content delivery network (CDN) distribution.
     * </p>
     * 
     * @param deleteDistributionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDistribution operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.DeleteDistribution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteDistribution" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDistributionResult> deleteDistributionAsync(DeleteDistributionRequest deleteDistributionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDistributionRequest, DeleteDistributionResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteDomain operation returned by the service.
     * @sample AmazonLightsailAsync.DeleteDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteDomain" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteDomainResult> deleteDomainAsync(DeleteDomainRequest deleteDomainRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDomain operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.DeleteDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteDomain" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteDomainResult> deleteDomainAsync(DeleteDomainRequest deleteDomainRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDomainRequest, DeleteDomainResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteDomainEntry operation returned by the service.
     * @sample AmazonLightsailAsync.DeleteDomainEntry
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteDomainEntry" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDomainEntryResult> deleteDomainEntryAsync(DeleteDomainEntryRequest deleteDomainEntryRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDomainEntry operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.DeleteDomainEntry
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteDomainEntry" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDomainEntryResult> deleteDomainEntryAsync(DeleteDomainEntryRequest deleteDomainEntryRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDomainEntryRequest, DeleteDomainEntryResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteInstance operation returned by the service.
     * @sample AmazonLightsailAsync.DeleteInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteInstanceResult> deleteInstanceAsync(DeleteInstanceRequest deleteInstanceRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteInstance operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.DeleteInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteInstanceResult> deleteInstanceAsync(DeleteInstanceRequest deleteInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteInstanceRequest, DeleteInstanceResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteInstanceSnapshot operation returned by the service.
     * @sample AmazonLightsailAsync.DeleteInstanceSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteInstanceSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteInstanceSnapshotResult> deleteInstanceSnapshotAsync(DeleteInstanceSnapshotRequest deleteInstanceSnapshotRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteInstanceSnapshot operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.DeleteInstanceSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteInstanceSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteInstanceSnapshotResult> deleteInstanceSnapshotAsync(DeleteInstanceSnapshotRequest deleteInstanceSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteInstanceSnapshotRequest, DeleteInstanceSnapshotResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteKeyPair operation returned by the service.
     * @sample AmazonLightsailAsync.DeleteKeyPair
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteKeyPair" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteKeyPairResult> deleteKeyPairAsync(DeleteKeyPairRequest deleteKeyPairRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteKeyPair operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.DeleteKeyPair
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteKeyPair" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteKeyPairResult> deleteKeyPairAsync(DeleteKeyPairRequest deleteKeyPairRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteKeyPairRequest, DeleteKeyPairResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteKnownHostKeys operation returned by the service.
     * @sample AmazonLightsailAsync.DeleteKnownHostKeys
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteKnownHostKeys" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteKnownHostKeysResult> deleteKnownHostKeysAsync(DeleteKnownHostKeysRequest deleteKnownHostKeysRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteKnownHostKeys operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.DeleteKnownHostKeys
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteKnownHostKeys" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteKnownHostKeysResult> deleteKnownHostKeysAsync(DeleteKnownHostKeysRequest deleteKnownHostKeysRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteKnownHostKeysRequest, DeleteKnownHostKeysResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteLoadBalancer operation returned by the service.
     * @sample AmazonLightsailAsync.DeleteLoadBalancer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteLoadBalancer" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteLoadBalancerResult> deleteLoadBalancerAsync(DeleteLoadBalancerRequest deleteLoadBalancerRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteLoadBalancer operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.DeleteLoadBalancer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteLoadBalancer" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteLoadBalancerResult> deleteLoadBalancerAsync(DeleteLoadBalancerRequest deleteLoadBalancerRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteLoadBalancerRequest, DeleteLoadBalancerResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteLoadBalancerTlsCertificate operation returned by the
     *         service.
     * @sample AmazonLightsailAsync.DeleteLoadBalancerTlsCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteLoadBalancerTlsCertificate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteLoadBalancerTlsCertificateResult> deleteLoadBalancerTlsCertificateAsync(
            DeleteLoadBalancerTlsCertificateRequest deleteLoadBalancerTlsCertificateRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteLoadBalancerTlsCertificate operation returned by the
     *         service.
     * @sample AmazonLightsailAsyncHandler.DeleteLoadBalancerTlsCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteLoadBalancerTlsCertificate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteLoadBalancerTlsCertificateResult> deleteLoadBalancerTlsCertificateAsync(
            DeleteLoadBalancerTlsCertificateRequest deleteLoadBalancerTlsCertificateRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteLoadBalancerTlsCertificateRequest, DeleteLoadBalancerTlsCertificateResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteRelationalDatabase operation returned by the service.
     * @sample AmazonLightsailAsync.DeleteRelationalDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteRelationalDatabase"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRelationalDatabaseResult> deleteRelationalDatabaseAsync(DeleteRelationalDatabaseRequest deleteRelationalDatabaseRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRelationalDatabase operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.DeleteRelationalDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteRelationalDatabase"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRelationalDatabaseResult> deleteRelationalDatabaseAsync(DeleteRelationalDatabaseRequest deleteRelationalDatabaseRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRelationalDatabaseRequest, DeleteRelationalDatabaseResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteRelationalDatabaseSnapshot operation returned by the
     *         service.
     * @sample AmazonLightsailAsync.DeleteRelationalDatabaseSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteRelationalDatabaseSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRelationalDatabaseSnapshotResult> deleteRelationalDatabaseSnapshotAsync(
            DeleteRelationalDatabaseSnapshotRequest deleteRelationalDatabaseSnapshotRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRelationalDatabaseSnapshot operation returned by the
     *         service.
     * @sample AmazonLightsailAsyncHandler.DeleteRelationalDatabaseSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteRelationalDatabaseSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRelationalDatabaseSnapshotResult> deleteRelationalDatabaseSnapshotAsync(
            DeleteRelationalDatabaseSnapshotRequest deleteRelationalDatabaseSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRelationalDatabaseSnapshotRequest, DeleteRelationalDatabaseSnapshotResult> asyncHandler);

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
     * @return A Java Future containing the result of the DetachCertificateFromDistribution operation returned by the
     *         service.
     * @sample AmazonLightsailAsync.DetachCertificateFromDistribution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DetachCertificateFromDistribution"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DetachCertificateFromDistributionResult> detachCertificateFromDistributionAsync(
            DetachCertificateFromDistributionRequest detachCertificateFromDistributionRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DetachCertificateFromDistribution operation returned by the
     *         service.
     * @sample AmazonLightsailAsyncHandler.DetachCertificateFromDistribution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DetachCertificateFromDistribution"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DetachCertificateFromDistributionResult> detachCertificateFromDistributionAsync(
            DetachCertificateFromDistributionRequest detachCertificateFromDistributionRequest,
            com.amazonaws.handlers.AsyncHandler<DetachCertificateFromDistributionRequest, DetachCertificateFromDistributionResult> asyncHandler);

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
     * @return A Java Future containing the result of the DetachDisk operation returned by the service.
     * @sample AmazonLightsailAsync.DetachDisk
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DetachDisk" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DetachDiskResult> detachDiskAsync(DetachDiskRequest detachDiskRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DetachDisk operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.DetachDisk
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DetachDisk" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DetachDiskResult> detachDiskAsync(DetachDiskRequest detachDiskRequest,
            com.amazonaws.handlers.AsyncHandler<DetachDiskRequest, DetachDiskResult> asyncHandler);

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
     * @return A Java Future containing the result of the DetachInstancesFromLoadBalancer operation returned by the
     *         service.
     * @sample AmazonLightsailAsync.DetachInstancesFromLoadBalancer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DetachInstancesFromLoadBalancer"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DetachInstancesFromLoadBalancerResult> detachInstancesFromLoadBalancerAsync(
            DetachInstancesFromLoadBalancerRequest detachInstancesFromLoadBalancerRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DetachInstancesFromLoadBalancer operation returned by the
     *         service.
     * @sample AmazonLightsailAsyncHandler.DetachInstancesFromLoadBalancer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DetachInstancesFromLoadBalancer"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DetachInstancesFromLoadBalancerResult> detachInstancesFromLoadBalancerAsync(
            DetachInstancesFromLoadBalancerRequest detachInstancesFromLoadBalancerRequest,
            com.amazonaws.handlers.AsyncHandler<DetachInstancesFromLoadBalancerRequest, DetachInstancesFromLoadBalancerResult> asyncHandler);

    /**
     * <p>
     * Detaches a static IP from the Amazon Lightsail instance to which it is attached.
     * </p>
     * 
     * @param detachStaticIpRequest
     * @return A Java Future containing the result of the DetachStaticIp operation returned by the service.
     * @sample AmazonLightsailAsync.DetachStaticIp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DetachStaticIp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DetachStaticIpResult> detachStaticIpAsync(DetachStaticIpRequest detachStaticIpRequest);

    /**
     * <p>
     * Detaches a static IP from the Amazon Lightsail instance to which it is attached.
     * </p>
     * 
     * @param detachStaticIpRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DetachStaticIp operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.DetachStaticIp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DetachStaticIp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DetachStaticIpResult> detachStaticIpAsync(DetachStaticIpRequest detachStaticIpRequest,
            com.amazonaws.handlers.AsyncHandler<DetachStaticIpRequest, DetachStaticIpResult> asyncHandler);

    /**
     * <p>
     * Disables an add-on for an Amazon Lightsail resource. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-configuring-automatic-snapshots"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param disableAddOnRequest
     * @return A Java Future containing the result of the DisableAddOn operation returned by the service.
     * @sample AmazonLightsailAsync.DisableAddOn
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DisableAddOn" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DisableAddOnResult> disableAddOnAsync(DisableAddOnRequest disableAddOnRequest);

    /**
     * <p>
     * Disables an add-on for an Amazon Lightsail resource. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-configuring-automatic-snapshots"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param disableAddOnRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisableAddOn operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.DisableAddOn
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DisableAddOn" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DisableAddOnResult> disableAddOnAsync(DisableAddOnRequest disableAddOnRequest,
            com.amazonaws.handlers.AsyncHandler<DisableAddOnRequest, DisableAddOnResult> asyncHandler);

    /**
     * <p>
     * Downloads the default SSH key pair from the user's account.
     * </p>
     * 
     * @param downloadDefaultKeyPairRequest
     * @return A Java Future containing the result of the DownloadDefaultKeyPair operation returned by the service.
     * @sample AmazonLightsailAsync.DownloadDefaultKeyPair
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DownloadDefaultKeyPair"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DownloadDefaultKeyPairResult> downloadDefaultKeyPairAsync(DownloadDefaultKeyPairRequest downloadDefaultKeyPairRequest);

    /**
     * <p>
     * Downloads the default SSH key pair from the user's account.
     * </p>
     * 
     * @param downloadDefaultKeyPairRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DownloadDefaultKeyPair operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.DownloadDefaultKeyPair
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DownloadDefaultKeyPair"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DownloadDefaultKeyPairResult> downloadDefaultKeyPairAsync(DownloadDefaultKeyPairRequest downloadDefaultKeyPairRequest,
            com.amazonaws.handlers.AsyncHandler<DownloadDefaultKeyPairRequest, DownloadDefaultKeyPairResult> asyncHandler);

    /**
     * <p>
     * Enables or modifies an add-on for an Amazon Lightsail resource. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-configuring-automatic-snapshots"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param enableAddOnRequest
     * @return A Java Future containing the result of the EnableAddOn operation returned by the service.
     * @sample AmazonLightsailAsync.EnableAddOn
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/EnableAddOn" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<EnableAddOnResult> enableAddOnAsync(EnableAddOnRequest enableAddOnRequest);

    /**
     * <p>
     * Enables or modifies an add-on for an Amazon Lightsail resource. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-configuring-automatic-snapshots"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param enableAddOnRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the EnableAddOn operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.EnableAddOn
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/EnableAddOn" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<EnableAddOnResult> enableAddOnAsync(EnableAddOnRequest enableAddOnRequest,
            com.amazonaws.handlers.AsyncHandler<EnableAddOnRequest, EnableAddOnResult> asyncHandler);

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
     * @return A Java Future containing the result of the ExportSnapshot operation returned by the service.
     * @sample AmazonLightsailAsync.ExportSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/ExportSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ExportSnapshotResult> exportSnapshotAsync(ExportSnapshotRequest exportSnapshotRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ExportSnapshot operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.ExportSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/ExportSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ExportSnapshotResult> exportSnapshotAsync(ExportSnapshotRequest exportSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<ExportSnapshotRequest, ExportSnapshotResult> asyncHandler);

    /**
     * <p>
     * Returns the names of all active (not deleted) resources.
     * </p>
     * 
     * @param getActiveNamesRequest
     * @return A Java Future containing the result of the GetActiveNames operation returned by the service.
     * @sample AmazonLightsailAsync.GetActiveNames
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetActiveNames" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetActiveNamesResult> getActiveNamesAsync(GetActiveNamesRequest getActiveNamesRequest);

    /**
     * <p>
     * Returns the names of all active (not deleted) resources.
     * </p>
     * 
     * @param getActiveNamesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetActiveNames operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetActiveNames
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetActiveNames" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetActiveNamesResult> getActiveNamesAsync(GetActiveNamesRequest getActiveNamesRequest,
            com.amazonaws.handlers.AsyncHandler<GetActiveNamesRequest, GetActiveNamesResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetAlarms operation returned by the service.
     * @sample AmazonLightsailAsync.GetAlarms
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetAlarms" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAlarmsResult> getAlarmsAsync(GetAlarmsRequest getAlarmsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAlarms operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetAlarms
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetAlarms" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAlarmsResult> getAlarmsAsync(GetAlarmsRequest getAlarmsRequest,
            com.amazonaws.handlers.AsyncHandler<GetAlarmsRequest, GetAlarmsResult> asyncHandler);

    /**
     * <p>
     * Returns the available automatic snapshots for an instance or disk. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-configuring-automatic-snapshots"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param getAutoSnapshotsRequest
     * @return A Java Future containing the result of the GetAutoSnapshots operation returned by the service.
     * @sample AmazonLightsailAsync.GetAutoSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetAutoSnapshots" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAutoSnapshotsResult> getAutoSnapshotsAsync(GetAutoSnapshotsRequest getAutoSnapshotsRequest);

    /**
     * <p>
     * Returns the available automatic snapshots for an instance or disk. For more information, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-configuring-automatic-snapshots"
     * >Amazon Lightsail Developer Guide</a>.
     * </p>
     * 
     * @param getAutoSnapshotsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAutoSnapshots operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetAutoSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetAutoSnapshots" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAutoSnapshotsResult> getAutoSnapshotsAsync(GetAutoSnapshotsRequest getAutoSnapshotsRequest,
            com.amazonaws.handlers.AsyncHandler<GetAutoSnapshotsRequest, GetAutoSnapshotsResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetBlueprints operation returned by the service.
     * @sample AmazonLightsailAsync.GetBlueprints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetBlueprints" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetBlueprintsResult> getBlueprintsAsync(GetBlueprintsRequest getBlueprintsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetBlueprints operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetBlueprints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetBlueprints" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetBlueprintsResult> getBlueprintsAsync(GetBlueprintsRequest getBlueprintsRequest,
            com.amazonaws.handlers.AsyncHandler<GetBlueprintsRequest, GetBlueprintsResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetBucketAccessKeys operation returned by the service.
     * @sample AmazonLightsailAsync.GetBucketAccessKeys
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetBucketAccessKeys" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetBucketAccessKeysResult> getBucketAccessKeysAsync(GetBucketAccessKeysRequest getBucketAccessKeysRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetBucketAccessKeys operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetBucketAccessKeys
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetBucketAccessKeys" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetBucketAccessKeysResult> getBucketAccessKeysAsync(GetBucketAccessKeysRequest getBucketAccessKeysRequest,
            com.amazonaws.handlers.AsyncHandler<GetBucketAccessKeysRequest, GetBucketAccessKeysResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetBucketBundles operation returned by the service.
     * @sample AmazonLightsailAsync.GetBucketBundles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetBucketBundles" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetBucketBundlesResult> getBucketBundlesAsync(GetBucketBundlesRequest getBucketBundlesRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetBucketBundles operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetBucketBundles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetBucketBundles" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetBucketBundlesResult> getBucketBundlesAsync(GetBucketBundlesRequest getBucketBundlesRequest,
            com.amazonaws.handlers.AsyncHandler<GetBucketBundlesRequest, GetBucketBundlesResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetBucketMetricData operation returned by the service.
     * @sample AmazonLightsailAsync.GetBucketMetricData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetBucketMetricData" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetBucketMetricDataResult> getBucketMetricDataAsync(GetBucketMetricDataRequest getBucketMetricDataRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetBucketMetricData operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetBucketMetricData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetBucketMetricData" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetBucketMetricDataResult> getBucketMetricDataAsync(GetBucketMetricDataRequest getBucketMetricDataRequest,
            com.amazonaws.handlers.AsyncHandler<GetBucketMetricDataRequest, GetBucketMetricDataResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetBuckets operation returned by the service.
     * @sample AmazonLightsailAsync.GetBuckets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetBuckets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetBucketsResult> getBucketsAsync(GetBucketsRequest getBucketsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetBuckets operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetBuckets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetBuckets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetBucketsResult> getBucketsAsync(GetBucketsRequest getBucketsRequest,
            com.amazonaws.handlers.AsyncHandler<GetBucketsRequest, GetBucketsResult> asyncHandler);

    /**
     * <p>
     * Returns the list of bundles that are available for purchase. A bundle describes the specs for your virtual
     * private server (or <i>instance</i>).
     * </p>
     * 
     * @param getBundlesRequest
     * @return A Java Future containing the result of the GetBundles operation returned by the service.
     * @sample AmazonLightsailAsync.GetBundles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetBundles" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetBundlesResult> getBundlesAsync(GetBundlesRequest getBundlesRequest);

    /**
     * <p>
     * Returns the list of bundles that are available for purchase. A bundle describes the specs for your virtual
     * private server (or <i>instance</i>).
     * </p>
     * 
     * @param getBundlesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetBundles operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetBundles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetBundles" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetBundlesResult> getBundlesAsync(GetBundlesRequest getBundlesRequest,
            com.amazonaws.handlers.AsyncHandler<GetBundlesRequest, GetBundlesResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetCertificates operation returned by the service.
     * @sample AmazonLightsailAsync.GetCertificates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetCertificates" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetCertificatesResult> getCertificatesAsync(GetCertificatesRequest getCertificatesRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCertificates operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetCertificates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetCertificates" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetCertificatesResult> getCertificatesAsync(GetCertificatesRequest getCertificatesRequest,
            com.amazonaws.handlers.AsyncHandler<GetCertificatesRequest, GetCertificatesResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetCloudFormationStackRecords operation returned by the
     *         service.
     * @sample AmazonLightsailAsync.GetCloudFormationStackRecords
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetCloudFormationStackRecords"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetCloudFormationStackRecordsResult> getCloudFormationStackRecordsAsync(
            GetCloudFormationStackRecordsRequest getCloudFormationStackRecordsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCloudFormationStackRecords operation returned by the
     *         service.
     * @sample AmazonLightsailAsyncHandler.GetCloudFormationStackRecords
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetCloudFormationStackRecords"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetCloudFormationStackRecordsResult> getCloudFormationStackRecordsAsync(
            GetCloudFormationStackRecordsRequest getCloudFormationStackRecordsRequest,
            com.amazonaws.handlers.AsyncHandler<GetCloudFormationStackRecordsRequest, GetCloudFormationStackRecordsResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetContactMethods operation returned by the service.
     * @sample AmazonLightsailAsync.GetContactMethods
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetContactMethods" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetContactMethodsResult> getContactMethodsAsync(GetContactMethodsRequest getContactMethodsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetContactMethods operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetContactMethods
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetContactMethods" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetContactMethodsResult> getContactMethodsAsync(GetContactMethodsRequest getContactMethodsRequest,
            com.amazonaws.handlers.AsyncHandler<GetContactMethodsRequest, GetContactMethodsResult> asyncHandler);

    /**
     * <p>
     * Returns information about Amazon Lightsail containers, such as the current version of the Lightsail Control
     * (lightsailctl) plugin.
     * </p>
     * 
     * @param getContainerAPIMetadataRequest
     * @return A Java Future containing the result of the GetContainerAPIMetadata operation returned by the service.
     * @sample AmazonLightsailAsync.GetContainerAPIMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetContainerAPIMetadata"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetContainerAPIMetadataResult> getContainerAPIMetadataAsync(GetContainerAPIMetadataRequest getContainerAPIMetadataRequest);

    /**
     * <p>
     * Returns information about Amazon Lightsail containers, such as the current version of the Lightsail Control
     * (lightsailctl) plugin.
     * </p>
     * 
     * @param getContainerAPIMetadataRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetContainerAPIMetadata operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetContainerAPIMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetContainerAPIMetadata"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetContainerAPIMetadataResult> getContainerAPIMetadataAsync(GetContainerAPIMetadataRequest getContainerAPIMetadataRequest,
            com.amazonaws.handlers.AsyncHandler<GetContainerAPIMetadataRequest, GetContainerAPIMetadataResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetContainerImages operation returned by the service.
     * @sample AmazonLightsailAsync.GetContainerImages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetContainerImages" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetContainerImagesResult> getContainerImagesAsync(GetContainerImagesRequest getContainerImagesRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetContainerImages operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetContainerImages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetContainerImages" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetContainerImagesResult> getContainerImagesAsync(GetContainerImagesRequest getContainerImagesRequest,
            com.amazonaws.handlers.AsyncHandler<GetContainerImagesRequest, GetContainerImagesResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetContainerLog operation returned by the service.
     * @sample AmazonLightsailAsync.GetContainerLog
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetContainerLog" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetContainerLogResult> getContainerLogAsync(GetContainerLogRequest getContainerLogRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetContainerLog operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetContainerLog
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetContainerLog" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetContainerLogResult> getContainerLogAsync(GetContainerLogRequest getContainerLogRequest,
            com.amazonaws.handlers.AsyncHandler<GetContainerLogRequest, GetContainerLogResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetContainerServiceDeployments operation returned by the
     *         service.
     * @sample AmazonLightsailAsync.GetContainerServiceDeployments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetContainerServiceDeployments"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetContainerServiceDeploymentsResult> getContainerServiceDeploymentsAsync(
            GetContainerServiceDeploymentsRequest getContainerServiceDeploymentsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetContainerServiceDeployments operation returned by the
     *         service.
     * @sample AmazonLightsailAsyncHandler.GetContainerServiceDeployments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetContainerServiceDeployments"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetContainerServiceDeploymentsResult> getContainerServiceDeploymentsAsync(
            GetContainerServiceDeploymentsRequest getContainerServiceDeploymentsRequest,
            com.amazonaws.handlers.AsyncHandler<GetContainerServiceDeploymentsRequest, GetContainerServiceDeploymentsResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetContainerServiceMetricData operation returned by the
     *         service.
     * @sample AmazonLightsailAsync.GetContainerServiceMetricData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetContainerServiceMetricData"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetContainerServiceMetricDataResult> getContainerServiceMetricDataAsync(
            GetContainerServiceMetricDataRequest getContainerServiceMetricDataRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetContainerServiceMetricData operation returned by the
     *         service.
     * @sample AmazonLightsailAsyncHandler.GetContainerServiceMetricData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetContainerServiceMetricData"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetContainerServiceMetricDataResult> getContainerServiceMetricDataAsync(
            GetContainerServiceMetricDataRequest getContainerServiceMetricDataRequest,
            com.amazonaws.handlers.AsyncHandler<GetContainerServiceMetricDataRequest, GetContainerServiceMetricDataResult> asyncHandler);

    /**
     * <p>
     * Returns the list of powers that can be specified for your Amazon Lightsail container services.
     * </p>
     * <p>
     * The power specifies the amount of memory, the number of vCPUs, and the base price of the container service.
     * </p>
     * 
     * @param getContainerServicePowersRequest
     * @return A Java Future containing the result of the GetContainerServicePowers operation returned by the service.
     * @sample AmazonLightsailAsync.GetContainerServicePowers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetContainerServicePowers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetContainerServicePowersResult> getContainerServicePowersAsync(
            GetContainerServicePowersRequest getContainerServicePowersRequest);

    /**
     * <p>
     * Returns the list of powers that can be specified for your Amazon Lightsail container services.
     * </p>
     * <p>
     * The power specifies the amount of memory, the number of vCPUs, and the base price of the container service.
     * </p>
     * 
     * @param getContainerServicePowersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetContainerServicePowers operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetContainerServicePowers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetContainerServicePowers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetContainerServicePowersResult> getContainerServicePowersAsync(
            GetContainerServicePowersRequest getContainerServicePowersRequest,
            com.amazonaws.handlers.AsyncHandler<GetContainerServicePowersRequest, GetContainerServicePowersResult> asyncHandler);

    /**
     * <p>
     * Returns information about one or more of your Amazon Lightsail container services.
     * </p>
     * 
     * @param getContainerServicesRequest
     * @return A Java Future containing the result of the GetContainerServices operation returned by the service.
     * @sample AmazonLightsailAsync.GetContainerServices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetContainerServices" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetContainerServicesResult> getContainerServicesAsync(GetContainerServicesRequest getContainerServicesRequest);

    /**
     * <p>
     * Returns information about one or more of your Amazon Lightsail container services.
     * </p>
     * 
     * @param getContainerServicesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetContainerServices operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetContainerServices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetContainerServices" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetContainerServicesResult> getContainerServicesAsync(GetContainerServicesRequest getContainerServicesRequest,
            com.amazonaws.handlers.AsyncHandler<GetContainerServicesRequest, GetContainerServicesResult> asyncHandler);

    /**
     * <p>
     * Returns information about a specific block storage disk.
     * </p>
     * 
     * @param getDiskRequest
     * @return A Java Future containing the result of the GetDisk operation returned by the service.
     * @sample AmazonLightsailAsync.GetDisk
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetDisk" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDiskResult> getDiskAsync(GetDiskRequest getDiskRequest);

    /**
     * <p>
     * Returns information about a specific block storage disk.
     * </p>
     * 
     * @param getDiskRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDisk operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetDisk
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetDisk" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDiskResult> getDiskAsync(GetDiskRequest getDiskRequest,
            com.amazonaws.handlers.AsyncHandler<GetDiskRequest, GetDiskResult> asyncHandler);

    /**
     * <p>
     * Returns information about a specific block storage disk snapshot.
     * </p>
     * 
     * @param getDiskSnapshotRequest
     * @return A Java Future containing the result of the GetDiskSnapshot operation returned by the service.
     * @sample AmazonLightsailAsync.GetDiskSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetDiskSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDiskSnapshotResult> getDiskSnapshotAsync(GetDiskSnapshotRequest getDiskSnapshotRequest);

    /**
     * <p>
     * Returns information about a specific block storage disk snapshot.
     * </p>
     * 
     * @param getDiskSnapshotRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDiskSnapshot operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetDiskSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetDiskSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDiskSnapshotResult> getDiskSnapshotAsync(GetDiskSnapshotRequest getDiskSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<GetDiskSnapshotRequest, GetDiskSnapshotResult> asyncHandler);

    /**
     * <p>
     * Returns information about all block storage disk snapshots in your AWS account and region.
     * </p>
     * 
     * @param getDiskSnapshotsRequest
     * @return A Java Future containing the result of the GetDiskSnapshots operation returned by the service.
     * @sample AmazonLightsailAsync.GetDiskSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetDiskSnapshots" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDiskSnapshotsResult> getDiskSnapshotsAsync(GetDiskSnapshotsRequest getDiskSnapshotsRequest);

    /**
     * <p>
     * Returns information about all block storage disk snapshots in your AWS account and region.
     * </p>
     * 
     * @param getDiskSnapshotsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDiskSnapshots operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetDiskSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetDiskSnapshots" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDiskSnapshotsResult> getDiskSnapshotsAsync(GetDiskSnapshotsRequest getDiskSnapshotsRequest,
            com.amazonaws.handlers.AsyncHandler<GetDiskSnapshotsRequest, GetDiskSnapshotsResult> asyncHandler);

    /**
     * <p>
     * Returns information about all block storage disks in your AWS account and region.
     * </p>
     * 
     * @param getDisksRequest
     * @return A Java Future containing the result of the GetDisks operation returned by the service.
     * @sample AmazonLightsailAsync.GetDisks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetDisks" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDisksResult> getDisksAsync(GetDisksRequest getDisksRequest);

    /**
     * <p>
     * Returns information about all block storage disks in your AWS account and region.
     * </p>
     * 
     * @param getDisksRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDisks operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetDisks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetDisks" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDisksResult> getDisksAsync(GetDisksRequest getDisksRequest,
            com.amazonaws.handlers.AsyncHandler<GetDisksRequest, GetDisksResult> asyncHandler);

    /**
     * <p>
     * Returns the bundles that can be applied to your Amazon Lightsail content delivery network (CDN) distributions.
     * </p>
     * <p>
     * A distribution bundle specifies the monthly network transfer quota and monthly cost of your dsitribution.
     * </p>
     * 
     * @param getDistributionBundlesRequest
     * @return A Java Future containing the result of the GetDistributionBundles operation returned by the service.
     * @sample AmazonLightsailAsync.GetDistributionBundles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetDistributionBundles"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDistributionBundlesResult> getDistributionBundlesAsync(GetDistributionBundlesRequest getDistributionBundlesRequest);

    /**
     * <p>
     * Returns the bundles that can be applied to your Amazon Lightsail content delivery network (CDN) distributions.
     * </p>
     * <p>
     * A distribution bundle specifies the monthly network transfer quota and monthly cost of your dsitribution.
     * </p>
     * 
     * @param getDistributionBundlesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDistributionBundles operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetDistributionBundles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetDistributionBundles"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDistributionBundlesResult> getDistributionBundlesAsync(GetDistributionBundlesRequest getDistributionBundlesRequest,
            com.amazonaws.handlers.AsyncHandler<GetDistributionBundlesRequest, GetDistributionBundlesResult> asyncHandler);

    /**
     * <p>
     * Returns the timestamp and status of the last cache reset of a specific Amazon Lightsail content delivery network
     * (CDN) distribution.
     * </p>
     * 
     * @param getDistributionLatestCacheResetRequest
     * @return A Java Future containing the result of the GetDistributionLatestCacheReset operation returned by the
     *         service.
     * @sample AmazonLightsailAsync.GetDistributionLatestCacheReset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetDistributionLatestCacheReset"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDistributionLatestCacheResetResult> getDistributionLatestCacheResetAsync(
            GetDistributionLatestCacheResetRequest getDistributionLatestCacheResetRequest);

    /**
     * <p>
     * Returns the timestamp and status of the last cache reset of a specific Amazon Lightsail content delivery network
     * (CDN) distribution.
     * </p>
     * 
     * @param getDistributionLatestCacheResetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDistributionLatestCacheReset operation returned by the
     *         service.
     * @sample AmazonLightsailAsyncHandler.GetDistributionLatestCacheReset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetDistributionLatestCacheReset"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDistributionLatestCacheResetResult> getDistributionLatestCacheResetAsync(
            GetDistributionLatestCacheResetRequest getDistributionLatestCacheResetRequest,
            com.amazonaws.handlers.AsyncHandler<GetDistributionLatestCacheResetRequest, GetDistributionLatestCacheResetResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetDistributionMetricData operation returned by the service.
     * @sample AmazonLightsailAsync.GetDistributionMetricData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetDistributionMetricData"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDistributionMetricDataResult> getDistributionMetricDataAsync(
            GetDistributionMetricDataRequest getDistributionMetricDataRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDistributionMetricData operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetDistributionMetricData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetDistributionMetricData"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDistributionMetricDataResult> getDistributionMetricDataAsync(
            GetDistributionMetricDataRequest getDistributionMetricDataRequest,
            com.amazonaws.handlers.AsyncHandler<GetDistributionMetricDataRequest, GetDistributionMetricDataResult> asyncHandler);

    /**
     * <p>
     * Returns information about one or more of your Amazon Lightsail content delivery network (CDN) distributions.
     * </p>
     * 
     * @param getDistributionsRequest
     * @return A Java Future containing the result of the GetDistributions operation returned by the service.
     * @sample AmazonLightsailAsync.GetDistributions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetDistributions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDistributionsResult> getDistributionsAsync(GetDistributionsRequest getDistributionsRequest);

    /**
     * <p>
     * Returns information about one or more of your Amazon Lightsail content delivery network (CDN) distributions.
     * </p>
     * 
     * @param getDistributionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDistributions operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetDistributions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetDistributions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDistributionsResult> getDistributionsAsync(GetDistributionsRequest getDistributionsRequest,
            com.amazonaws.handlers.AsyncHandler<GetDistributionsRequest, GetDistributionsResult> asyncHandler);

    /**
     * <p>
     * Returns information about a specific domain recordset.
     * </p>
     * 
     * @param getDomainRequest
     * @return A Java Future containing the result of the GetDomain operation returned by the service.
     * @sample AmazonLightsailAsync.GetDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetDomain" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDomainResult> getDomainAsync(GetDomainRequest getDomainRequest);

    /**
     * <p>
     * Returns information about a specific domain recordset.
     * </p>
     * 
     * @param getDomainRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDomain operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetDomain" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDomainResult> getDomainAsync(GetDomainRequest getDomainRequest,
            com.amazonaws.handlers.AsyncHandler<GetDomainRequest, GetDomainResult> asyncHandler);

    /**
     * <p>
     * Returns a list of all domains in the user's account.
     * </p>
     * 
     * @param getDomainsRequest
     * @return A Java Future containing the result of the GetDomains operation returned by the service.
     * @sample AmazonLightsailAsync.GetDomains
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetDomains" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDomainsResult> getDomainsAsync(GetDomainsRequest getDomainsRequest);

    /**
     * <p>
     * Returns a list of all domains in the user's account.
     * </p>
     * 
     * @param getDomainsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDomains operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetDomains
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetDomains" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDomainsResult> getDomainsAsync(GetDomainsRequest getDomainsRequest,
            com.amazonaws.handlers.AsyncHandler<GetDomainsRequest, GetDomainsResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetExportSnapshotRecords operation returned by the service.
     * @sample AmazonLightsailAsync.GetExportSnapshotRecords
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetExportSnapshotRecords"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetExportSnapshotRecordsResult> getExportSnapshotRecordsAsync(GetExportSnapshotRecordsRequest getExportSnapshotRecordsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetExportSnapshotRecords operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetExportSnapshotRecords
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetExportSnapshotRecords"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetExportSnapshotRecordsResult> getExportSnapshotRecordsAsync(GetExportSnapshotRecordsRequest getExportSnapshotRecordsRequest,
            com.amazonaws.handlers.AsyncHandler<GetExportSnapshotRecordsRequest, GetExportSnapshotRecordsResult> asyncHandler);

    /**
     * <p>
     * Returns information about a specific Amazon Lightsail instance, which is a virtual private server.
     * </p>
     * 
     * @param getInstanceRequest
     * @return A Java Future containing the result of the GetInstance operation returned by the service.
     * @sample AmazonLightsailAsync.GetInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetInstanceResult> getInstanceAsync(GetInstanceRequest getInstanceRequest);

    /**
     * <p>
     * Returns information about a specific Amazon Lightsail instance, which is a virtual private server.
     * </p>
     * 
     * @param getInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetInstance operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetInstanceResult> getInstanceAsync(GetInstanceRequest getInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<GetInstanceRequest, GetInstanceResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetInstanceAccessDetails operation returned by the service.
     * @sample AmazonLightsailAsync.GetInstanceAccessDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetInstanceAccessDetails"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetInstanceAccessDetailsResult> getInstanceAccessDetailsAsync(GetInstanceAccessDetailsRequest getInstanceAccessDetailsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetInstanceAccessDetails operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetInstanceAccessDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetInstanceAccessDetails"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetInstanceAccessDetailsResult> getInstanceAccessDetailsAsync(GetInstanceAccessDetailsRequest getInstanceAccessDetailsRequest,
            com.amazonaws.handlers.AsyncHandler<GetInstanceAccessDetailsRequest, GetInstanceAccessDetailsResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetInstanceMetricData operation returned by the service.
     * @sample AmazonLightsailAsync.GetInstanceMetricData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetInstanceMetricData"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetInstanceMetricDataResult> getInstanceMetricDataAsync(GetInstanceMetricDataRequest getInstanceMetricDataRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetInstanceMetricData operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetInstanceMetricData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetInstanceMetricData"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetInstanceMetricDataResult> getInstanceMetricDataAsync(GetInstanceMetricDataRequest getInstanceMetricDataRequest,
            com.amazonaws.handlers.AsyncHandler<GetInstanceMetricDataRequest, GetInstanceMetricDataResult> asyncHandler);

    /**
     * <p>
     * Returns the firewall port states for a specific Amazon Lightsail instance, the IP addresses allowed to connect to
     * the instance through the ports, and the protocol.
     * </p>
     * 
     * @param getInstancePortStatesRequest
     * @return A Java Future containing the result of the GetInstancePortStates operation returned by the service.
     * @sample AmazonLightsailAsync.GetInstancePortStates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetInstancePortStates"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetInstancePortStatesResult> getInstancePortStatesAsync(GetInstancePortStatesRequest getInstancePortStatesRequest);

    /**
     * <p>
     * Returns the firewall port states for a specific Amazon Lightsail instance, the IP addresses allowed to connect to
     * the instance through the ports, and the protocol.
     * </p>
     * 
     * @param getInstancePortStatesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetInstancePortStates operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetInstancePortStates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetInstancePortStates"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetInstancePortStatesResult> getInstancePortStatesAsync(GetInstancePortStatesRequest getInstancePortStatesRequest,
            com.amazonaws.handlers.AsyncHandler<GetInstancePortStatesRequest, GetInstancePortStatesResult> asyncHandler);

    /**
     * <p>
     * Returns information about a specific instance snapshot.
     * </p>
     * 
     * @param getInstanceSnapshotRequest
     * @return A Java Future containing the result of the GetInstanceSnapshot operation returned by the service.
     * @sample AmazonLightsailAsync.GetInstanceSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetInstanceSnapshot" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetInstanceSnapshotResult> getInstanceSnapshotAsync(GetInstanceSnapshotRequest getInstanceSnapshotRequest);

    /**
     * <p>
     * Returns information about a specific instance snapshot.
     * </p>
     * 
     * @param getInstanceSnapshotRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetInstanceSnapshot operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetInstanceSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetInstanceSnapshot" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetInstanceSnapshotResult> getInstanceSnapshotAsync(GetInstanceSnapshotRequest getInstanceSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<GetInstanceSnapshotRequest, GetInstanceSnapshotResult> asyncHandler);

    /**
     * <p>
     * Returns all instance snapshots for the user's account.
     * </p>
     * 
     * @param getInstanceSnapshotsRequest
     * @return A Java Future containing the result of the GetInstanceSnapshots operation returned by the service.
     * @sample AmazonLightsailAsync.GetInstanceSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetInstanceSnapshots" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetInstanceSnapshotsResult> getInstanceSnapshotsAsync(GetInstanceSnapshotsRequest getInstanceSnapshotsRequest);

    /**
     * <p>
     * Returns all instance snapshots for the user's account.
     * </p>
     * 
     * @param getInstanceSnapshotsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetInstanceSnapshots operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetInstanceSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetInstanceSnapshots" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetInstanceSnapshotsResult> getInstanceSnapshotsAsync(GetInstanceSnapshotsRequest getInstanceSnapshotsRequest,
            com.amazonaws.handlers.AsyncHandler<GetInstanceSnapshotsRequest, GetInstanceSnapshotsResult> asyncHandler);

    /**
     * <p>
     * Returns the state of a specific instance. Works on one instance at a time.
     * </p>
     * 
     * @param getInstanceStateRequest
     * @return A Java Future containing the result of the GetInstanceState operation returned by the service.
     * @sample AmazonLightsailAsync.GetInstanceState
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetInstanceState" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetInstanceStateResult> getInstanceStateAsync(GetInstanceStateRequest getInstanceStateRequest);

    /**
     * <p>
     * Returns the state of a specific instance. Works on one instance at a time.
     * </p>
     * 
     * @param getInstanceStateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetInstanceState operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetInstanceState
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetInstanceState" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetInstanceStateResult> getInstanceStateAsync(GetInstanceStateRequest getInstanceStateRequest,
            com.amazonaws.handlers.AsyncHandler<GetInstanceStateRequest, GetInstanceStateResult> asyncHandler);

    /**
     * <p>
     * Returns information about all Amazon Lightsail virtual private servers, or <i>instances</i>.
     * </p>
     * 
     * @param getInstancesRequest
     * @return A Java Future containing the result of the GetInstances operation returned by the service.
     * @sample AmazonLightsailAsync.GetInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetInstances" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetInstancesResult> getInstancesAsync(GetInstancesRequest getInstancesRequest);

    /**
     * <p>
     * Returns information about all Amazon Lightsail virtual private servers, or <i>instances</i>.
     * </p>
     * 
     * @param getInstancesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetInstances operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetInstances" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetInstancesResult> getInstancesAsync(GetInstancesRequest getInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<GetInstancesRequest, GetInstancesResult> asyncHandler);

    /**
     * <p>
     * Returns information about a specific key pair.
     * </p>
     * 
     * @param getKeyPairRequest
     * @return A Java Future containing the result of the GetKeyPair operation returned by the service.
     * @sample AmazonLightsailAsync.GetKeyPair
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetKeyPair" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetKeyPairResult> getKeyPairAsync(GetKeyPairRequest getKeyPairRequest);

    /**
     * <p>
     * Returns information about a specific key pair.
     * </p>
     * 
     * @param getKeyPairRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetKeyPair operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetKeyPair
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetKeyPair" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetKeyPairResult> getKeyPairAsync(GetKeyPairRequest getKeyPairRequest,
            com.amazonaws.handlers.AsyncHandler<GetKeyPairRequest, GetKeyPairResult> asyncHandler);

    /**
     * <p>
     * Returns information about all key pairs in the user's account.
     * </p>
     * 
     * @param getKeyPairsRequest
     * @return A Java Future containing the result of the GetKeyPairs operation returned by the service.
     * @sample AmazonLightsailAsync.GetKeyPairs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetKeyPairs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetKeyPairsResult> getKeyPairsAsync(GetKeyPairsRequest getKeyPairsRequest);

    /**
     * <p>
     * Returns information about all key pairs in the user's account.
     * </p>
     * 
     * @param getKeyPairsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetKeyPairs operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetKeyPairs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetKeyPairs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetKeyPairsResult> getKeyPairsAsync(GetKeyPairsRequest getKeyPairsRequest,
            com.amazonaws.handlers.AsyncHandler<GetKeyPairsRequest, GetKeyPairsResult> asyncHandler);

    /**
     * <p>
     * Returns information about the specified Lightsail load balancer.
     * </p>
     * 
     * @param getLoadBalancerRequest
     * @return A Java Future containing the result of the GetLoadBalancer operation returned by the service.
     * @sample AmazonLightsailAsync.GetLoadBalancer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetLoadBalancer" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetLoadBalancerResult> getLoadBalancerAsync(GetLoadBalancerRequest getLoadBalancerRequest);

    /**
     * <p>
     * Returns information about the specified Lightsail load balancer.
     * </p>
     * 
     * @param getLoadBalancerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetLoadBalancer operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetLoadBalancer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetLoadBalancer" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetLoadBalancerResult> getLoadBalancerAsync(GetLoadBalancerRequest getLoadBalancerRequest,
            com.amazonaws.handlers.AsyncHandler<GetLoadBalancerRequest, GetLoadBalancerResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetLoadBalancerMetricData operation returned by the service.
     * @sample AmazonLightsailAsync.GetLoadBalancerMetricData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetLoadBalancerMetricData"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetLoadBalancerMetricDataResult> getLoadBalancerMetricDataAsync(
            GetLoadBalancerMetricDataRequest getLoadBalancerMetricDataRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetLoadBalancerMetricData operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetLoadBalancerMetricData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetLoadBalancerMetricData"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetLoadBalancerMetricDataResult> getLoadBalancerMetricDataAsync(
            GetLoadBalancerMetricDataRequest getLoadBalancerMetricDataRequest,
            com.amazonaws.handlers.AsyncHandler<GetLoadBalancerMetricDataRequest, GetLoadBalancerMetricDataResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetLoadBalancerTlsCertificates operation returned by the
     *         service.
     * @sample AmazonLightsailAsync.GetLoadBalancerTlsCertificates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetLoadBalancerTlsCertificates"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetLoadBalancerTlsCertificatesResult> getLoadBalancerTlsCertificatesAsync(
            GetLoadBalancerTlsCertificatesRequest getLoadBalancerTlsCertificatesRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetLoadBalancerTlsCertificates operation returned by the
     *         service.
     * @sample AmazonLightsailAsyncHandler.GetLoadBalancerTlsCertificates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetLoadBalancerTlsCertificates"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetLoadBalancerTlsCertificatesResult> getLoadBalancerTlsCertificatesAsync(
            GetLoadBalancerTlsCertificatesRequest getLoadBalancerTlsCertificatesRequest,
            com.amazonaws.handlers.AsyncHandler<GetLoadBalancerTlsCertificatesRequest, GetLoadBalancerTlsCertificatesResult> asyncHandler);

    /**
     * <p>
     * Returns information about all load balancers in an account.
     * </p>
     * 
     * @param getLoadBalancersRequest
     * @return A Java Future containing the result of the GetLoadBalancers operation returned by the service.
     * @sample AmazonLightsailAsync.GetLoadBalancers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetLoadBalancers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetLoadBalancersResult> getLoadBalancersAsync(GetLoadBalancersRequest getLoadBalancersRequest);

    /**
     * <p>
     * Returns information about all load balancers in an account.
     * </p>
     * 
     * @param getLoadBalancersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetLoadBalancers operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetLoadBalancers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetLoadBalancers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetLoadBalancersResult> getLoadBalancersAsync(GetLoadBalancersRequest getLoadBalancersRequest,
            com.amazonaws.handlers.AsyncHandler<GetLoadBalancersRequest, GetLoadBalancersResult> asyncHandler);

    /**
     * <p>
     * Returns information about a specific operation. Operations include events such as when you create an instance,
     * allocate a static IP, attach a static IP, and so on.
     * </p>
     * 
     * @param getOperationRequest
     * @return A Java Future containing the result of the GetOperation operation returned by the service.
     * @sample AmazonLightsailAsync.GetOperation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetOperation" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetOperationResult> getOperationAsync(GetOperationRequest getOperationRequest);

    /**
     * <p>
     * Returns information about a specific operation. Operations include events such as when you create an instance,
     * allocate a static IP, attach a static IP, and so on.
     * </p>
     * 
     * @param getOperationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetOperation operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetOperation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetOperation" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetOperationResult> getOperationAsync(GetOperationRequest getOperationRequest,
            com.amazonaws.handlers.AsyncHandler<GetOperationRequest, GetOperationResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetOperations operation returned by the service.
     * @sample AmazonLightsailAsync.GetOperations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetOperations" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetOperationsResult> getOperationsAsync(GetOperationsRequest getOperationsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetOperations operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetOperations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetOperations" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetOperationsResult> getOperationsAsync(GetOperationsRequest getOperationsRequest,
            com.amazonaws.handlers.AsyncHandler<GetOperationsRequest, GetOperationsResult> asyncHandler);

    /**
     * <p>
     * Gets operations for a specific resource (e.g., an instance or a static IP).
     * </p>
     * 
     * @param getOperationsForResourceRequest
     * @return A Java Future containing the result of the GetOperationsForResource operation returned by the service.
     * @sample AmazonLightsailAsync.GetOperationsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetOperationsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetOperationsForResourceResult> getOperationsForResourceAsync(GetOperationsForResourceRequest getOperationsForResourceRequest);

    /**
     * <p>
     * Gets operations for a specific resource (e.g., an instance or a static IP).
     * </p>
     * 
     * @param getOperationsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetOperationsForResource operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetOperationsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetOperationsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetOperationsForResourceResult> getOperationsForResourceAsync(GetOperationsForResourceRequest getOperationsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<GetOperationsForResourceRequest, GetOperationsForResourceResult> asyncHandler);

    /**
     * <p>
     * Returns a list of all valid regions for Amazon Lightsail. Use the <code>include availability zones</code>
     * parameter to also return the Availability Zones in a region.
     * </p>
     * 
     * @param getRegionsRequest
     * @return A Java Future containing the result of the GetRegions operation returned by the service.
     * @sample AmazonLightsailAsync.GetRegions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRegions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetRegionsResult> getRegionsAsync(GetRegionsRequest getRegionsRequest);

    /**
     * <p>
     * Returns a list of all valid regions for Amazon Lightsail. Use the <code>include availability zones</code>
     * parameter to also return the Availability Zones in a region.
     * </p>
     * 
     * @param getRegionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRegions operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetRegions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRegions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetRegionsResult> getRegionsAsync(GetRegionsRequest getRegionsRequest,
            com.amazonaws.handlers.AsyncHandler<GetRegionsRequest, GetRegionsResult> asyncHandler);

    /**
     * <p>
     * Returns information about a specific database in Amazon Lightsail.
     * </p>
     * 
     * @param getRelationalDatabaseRequest
     * @return A Java Future containing the result of the GetRelationalDatabase operation returned by the service.
     * @sample AmazonLightsailAsync.GetRelationalDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRelationalDatabase"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRelationalDatabaseResult> getRelationalDatabaseAsync(GetRelationalDatabaseRequest getRelationalDatabaseRequest);

    /**
     * <p>
     * Returns information about a specific database in Amazon Lightsail.
     * </p>
     * 
     * @param getRelationalDatabaseRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRelationalDatabase operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetRelationalDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRelationalDatabase"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRelationalDatabaseResult> getRelationalDatabaseAsync(GetRelationalDatabaseRequest getRelationalDatabaseRequest,
            com.amazonaws.handlers.AsyncHandler<GetRelationalDatabaseRequest, GetRelationalDatabaseResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetRelationalDatabaseBlueprints operation returned by the
     *         service.
     * @sample AmazonLightsailAsync.GetRelationalDatabaseBlueprints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRelationalDatabaseBlueprints"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRelationalDatabaseBlueprintsResult> getRelationalDatabaseBlueprintsAsync(
            GetRelationalDatabaseBlueprintsRequest getRelationalDatabaseBlueprintsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRelationalDatabaseBlueprints operation returned by the
     *         service.
     * @sample AmazonLightsailAsyncHandler.GetRelationalDatabaseBlueprints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRelationalDatabaseBlueprints"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRelationalDatabaseBlueprintsResult> getRelationalDatabaseBlueprintsAsync(
            GetRelationalDatabaseBlueprintsRequest getRelationalDatabaseBlueprintsRequest,
            com.amazonaws.handlers.AsyncHandler<GetRelationalDatabaseBlueprintsRequest, GetRelationalDatabaseBlueprintsResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetRelationalDatabaseBundles operation returned by the
     *         service.
     * @sample AmazonLightsailAsync.GetRelationalDatabaseBundles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRelationalDatabaseBundles"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRelationalDatabaseBundlesResult> getRelationalDatabaseBundlesAsync(
            GetRelationalDatabaseBundlesRequest getRelationalDatabaseBundlesRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRelationalDatabaseBundles operation returned by the
     *         service.
     * @sample AmazonLightsailAsyncHandler.GetRelationalDatabaseBundles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRelationalDatabaseBundles"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRelationalDatabaseBundlesResult> getRelationalDatabaseBundlesAsync(
            GetRelationalDatabaseBundlesRequest getRelationalDatabaseBundlesRequest,
            com.amazonaws.handlers.AsyncHandler<GetRelationalDatabaseBundlesRequest, GetRelationalDatabaseBundlesResult> asyncHandler);

    /**
     * <p>
     * Returns a list of events for a specific database in Amazon Lightsail.
     * </p>
     * 
     * @param getRelationalDatabaseEventsRequest
     * @return A Java Future containing the result of the GetRelationalDatabaseEvents operation returned by the service.
     * @sample AmazonLightsailAsync.GetRelationalDatabaseEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRelationalDatabaseEvents"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRelationalDatabaseEventsResult> getRelationalDatabaseEventsAsync(
            GetRelationalDatabaseEventsRequest getRelationalDatabaseEventsRequest);

    /**
     * <p>
     * Returns a list of events for a specific database in Amazon Lightsail.
     * </p>
     * 
     * @param getRelationalDatabaseEventsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRelationalDatabaseEvents operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetRelationalDatabaseEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRelationalDatabaseEvents"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRelationalDatabaseEventsResult> getRelationalDatabaseEventsAsync(
            GetRelationalDatabaseEventsRequest getRelationalDatabaseEventsRequest,
            com.amazonaws.handlers.AsyncHandler<GetRelationalDatabaseEventsRequest, GetRelationalDatabaseEventsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of log events for a database in Amazon Lightsail.
     * </p>
     * 
     * @param getRelationalDatabaseLogEventsRequest
     * @return A Java Future containing the result of the GetRelationalDatabaseLogEvents operation returned by the
     *         service.
     * @sample AmazonLightsailAsync.GetRelationalDatabaseLogEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRelationalDatabaseLogEvents"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRelationalDatabaseLogEventsResult> getRelationalDatabaseLogEventsAsync(
            GetRelationalDatabaseLogEventsRequest getRelationalDatabaseLogEventsRequest);

    /**
     * <p>
     * Returns a list of log events for a database in Amazon Lightsail.
     * </p>
     * 
     * @param getRelationalDatabaseLogEventsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRelationalDatabaseLogEvents operation returned by the
     *         service.
     * @sample AmazonLightsailAsyncHandler.GetRelationalDatabaseLogEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRelationalDatabaseLogEvents"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRelationalDatabaseLogEventsResult> getRelationalDatabaseLogEventsAsync(
            GetRelationalDatabaseLogEventsRequest getRelationalDatabaseLogEventsRequest,
            com.amazonaws.handlers.AsyncHandler<GetRelationalDatabaseLogEventsRequest, GetRelationalDatabaseLogEventsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of available log streams for a specific database in Amazon Lightsail.
     * </p>
     * 
     * @param getRelationalDatabaseLogStreamsRequest
     * @return A Java Future containing the result of the GetRelationalDatabaseLogStreams operation returned by the
     *         service.
     * @sample AmazonLightsailAsync.GetRelationalDatabaseLogStreams
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRelationalDatabaseLogStreams"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRelationalDatabaseLogStreamsResult> getRelationalDatabaseLogStreamsAsync(
            GetRelationalDatabaseLogStreamsRequest getRelationalDatabaseLogStreamsRequest);

    /**
     * <p>
     * Returns a list of available log streams for a specific database in Amazon Lightsail.
     * </p>
     * 
     * @param getRelationalDatabaseLogStreamsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRelationalDatabaseLogStreams operation returned by the
     *         service.
     * @sample AmazonLightsailAsyncHandler.GetRelationalDatabaseLogStreams
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRelationalDatabaseLogStreams"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRelationalDatabaseLogStreamsResult> getRelationalDatabaseLogStreamsAsync(
            GetRelationalDatabaseLogStreamsRequest getRelationalDatabaseLogStreamsRequest,
            com.amazonaws.handlers.AsyncHandler<GetRelationalDatabaseLogStreamsRequest, GetRelationalDatabaseLogStreamsResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetRelationalDatabaseMasterUserPassword operation returned by
     *         the service.
     * @sample AmazonLightsailAsync.GetRelationalDatabaseMasterUserPassword
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRelationalDatabaseMasterUserPassword"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRelationalDatabaseMasterUserPasswordResult> getRelationalDatabaseMasterUserPasswordAsync(
            GetRelationalDatabaseMasterUserPasswordRequest getRelationalDatabaseMasterUserPasswordRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRelationalDatabaseMasterUserPassword operation returned by
     *         the service.
     * @sample AmazonLightsailAsyncHandler.GetRelationalDatabaseMasterUserPassword
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRelationalDatabaseMasterUserPassword"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRelationalDatabaseMasterUserPasswordResult> getRelationalDatabaseMasterUserPasswordAsync(
            GetRelationalDatabaseMasterUserPasswordRequest getRelationalDatabaseMasterUserPasswordRequest,
            com.amazonaws.handlers.AsyncHandler<GetRelationalDatabaseMasterUserPasswordRequest, GetRelationalDatabaseMasterUserPasswordResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetRelationalDatabaseMetricData operation returned by the
     *         service.
     * @sample AmazonLightsailAsync.GetRelationalDatabaseMetricData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRelationalDatabaseMetricData"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRelationalDatabaseMetricDataResult> getRelationalDatabaseMetricDataAsync(
            GetRelationalDatabaseMetricDataRequest getRelationalDatabaseMetricDataRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRelationalDatabaseMetricData operation returned by the
     *         service.
     * @sample AmazonLightsailAsyncHandler.GetRelationalDatabaseMetricData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRelationalDatabaseMetricData"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRelationalDatabaseMetricDataResult> getRelationalDatabaseMetricDataAsync(
            GetRelationalDatabaseMetricDataRequest getRelationalDatabaseMetricDataRequest,
            com.amazonaws.handlers.AsyncHandler<GetRelationalDatabaseMetricDataRequest, GetRelationalDatabaseMetricDataResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetRelationalDatabaseParameters operation returned by the
     *         service.
     * @sample AmazonLightsailAsync.GetRelationalDatabaseParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRelationalDatabaseParameters"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRelationalDatabaseParametersResult> getRelationalDatabaseParametersAsync(
            GetRelationalDatabaseParametersRequest getRelationalDatabaseParametersRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRelationalDatabaseParameters operation returned by the
     *         service.
     * @sample AmazonLightsailAsyncHandler.GetRelationalDatabaseParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRelationalDatabaseParameters"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRelationalDatabaseParametersResult> getRelationalDatabaseParametersAsync(
            GetRelationalDatabaseParametersRequest getRelationalDatabaseParametersRequest,
            com.amazonaws.handlers.AsyncHandler<GetRelationalDatabaseParametersRequest, GetRelationalDatabaseParametersResult> asyncHandler);

    /**
     * <p>
     * Returns information about a specific database snapshot in Amazon Lightsail.
     * </p>
     * 
     * @param getRelationalDatabaseSnapshotRequest
     * @return A Java Future containing the result of the GetRelationalDatabaseSnapshot operation returned by the
     *         service.
     * @sample AmazonLightsailAsync.GetRelationalDatabaseSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRelationalDatabaseSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRelationalDatabaseSnapshotResult> getRelationalDatabaseSnapshotAsync(
            GetRelationalDatabaseSnapshotRequest getRelationalDatabaseSnapshotRequest);

    /**
     * <p>
     * Returns information about a specific database snapshot in Amazon Lightsail.
     * </p>
     * 
     * @param getRelationalDatabaseSnapshotRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRelationalDatabaseSnapshot operation returned by the
     *         service.
     * @sample AmazonLightsailAsyncHandler.GetRelationalDatabaseSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRelationalDatabaseSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRelationalDatabaseSnapshotResult> getRelationalDatabaseSnapshotAsync(
            GetRelationalDatabaseSnapshotRequest getRelationalDatabaseSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<GetRelationalDatabaseSnapshotRequest, GetRelationalDatabaseSnapshotResult> asyncHandler);

    /**
     * <p>
     * Returns information about all of your database snapshots in Amazon Lightsail.
     * </p>
     * 
     * @param getRelationalDatabaseSnapshotsRequest
     * @return A Java Future containing the result of the GetRelationalDatabaseSnapshots operation returned by the
     *         service.
     * @sample AmazonLightsailAsync.GetRelationalDatabaseSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRelationalDatabaseSnapshots"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRelationalDatabaseSnapshotsResult> getRelationalDatabaseSnapshotsAsync(
            GetRelationalDatabaseSnapshotsRequest getRelationalDatabaseSnapshotsRequest);

    /**
     * <p>
     * Returns information about all of your database snapshots in Amazon Lightsail.
     * </p>
     * 
     * @param getRelationalDatabaseSnapshotsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRelationalDatabaseSnapshots operation returned by the
     *         service.
     * @sample AmazonLightsailAsyncHandler.GetRelationalDatabaseSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRelationalDatabaseSnapshots"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRelationalDatabaseSnapshotsResult> getRelationalDatabaseSnapshotsAsync(
            GetRelationalDatabaseSnapshotsRequest getRelationalDatabaseSnapshotsRequest,
            com.amazonaws.handlers.AsyncHandler<GetRelationalDatabaseSnapshotsRequest, GetRelationalDatabaseSnapshotsResult> asyncHandler);

    /**
     * <p>
     * Returns information about all of your databases in Amazon Lightsail.
     * </p>
     * 
     * @param getRelationalDatabasesRequest
     * @return A Java Future containing the result of the GetRelationalDatabases operation returned by the service.
     * @sample AmazonLightsailAsync.GetRelationalDatabases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRelationalDatabases"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRelationalDatabasesResult> getRelationalDatabasesAsync(GetRelationalDatabasesRequest getRelationalDatabasesRequest);

    /**
     * <p>
     * Returns information about all of your databases in Amazon Lightsail.
     * </p>
     * 
     * @param getRelationalDatabasesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRelationalDatabases operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetRelationalDatabases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRelationalDatabases"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRelationalDatabasesResult> getRelationalDatabasesAsync(GetRelationalDatabasesRequest getRelationalDatabasesRequest,
            com.amazonaws.handlers.AsyncHandler<GetRelationalDatabasesRequest, GetRelationalDatabasesResult> asyncHandler);

    /**
     * <p>
     * Returns information about an Amazon Lightsail static IP.
     * </p>
     * 
     * @param getStaticIpRequest
     * @return A Java Future containing the result of the GetStaticIp operation returned by the service.
     * @sample AmazonLightsailAsync.GetStaticIp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetStaticIp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetStaticIpResult> getStaticIpAsync(GetStaticIpRequest getStaticIpRequest);

    /**
     * <p>
     * Returns information about an Amazon Lightsail static IP.
     * </p>
     * 
     * @param getStaticIpRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetStaticIp operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetStaticIp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetStaticIp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetStaticIpResult> getStaticIpAsync(GetStaticIpRequest getStaticIpRequest,
            com.amazonaws.handlers.AsyncHandler<GetStaticIpRequest, GetStaticIpResult> asyncHandler);

    /**
     * <p>
     * Returns information about all static IPs in the user's account.
     * </p>
     * 
     * @param getStaticIpsRequest
     * @return A Java Future containing the result of the GetStaticIps operation returned by the service.
     * @sample AmazonLightsailAsync.GetStaticIps
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetStaticIps" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetStaticIpsResult> getStaticIpsAsync(GetStaticIpsRequest getStaticIpsRequest);

    /**
     * <p>
     * Returns information about all static IPs in the user's account.
     * </p>
     * 
     * @param getStaticIpsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetStaticIps operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetStaticIps
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetStaticIps" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetStaticIpsResult> getStaticIpsAsync(GetStaticIpsRequest getStaticIpsRequest,
            com.amazonaws.handlers.AsyncHandler<GetStaticIpsRequest, GetStaticIpsResult> asyncHandler);

    /**
     * <p>
     * Imports a public SSH key from a specific key pair.
     * </p>
     * 
     * @param importKeyPairRequest
     * @return A Java Future containing the result of the ImportKeyPair operation returned by the service.
     * @sample AmazonLightsailAsync.ImportKeyPair
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/ImportKeyPair" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ImportKeyPairResult> importKeyPairAsync(ImportKeyPairRequest importKeyPairRequest);

    /**
     * <p>
     * Imports a public SSH key from a specific key pair.
     * </p>
     * 
     * @param importKeyPairRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ImportKeyPair operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.ImportKeyPair
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/ImportKeyPair" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ImportKeyPairResult> importKeyPairAsync(ImportKeyPairRequest importKeyPairRequest,
            com.amazonaws.handlers.AsyncHandler<ImportKeyPairRequest, ImportKeyPairResult> asyncHandler);

    /**
     * <p>
     * Returns a Boolean value indicating whether your Lightsail VPC is peered.
     * </p>
     * 
     * @param isVpcPeeredRequest
     * @return A Java Future containing the result of the IsVpcPeered operation returned by the service.
     * @sample AmazonLightsailAsync.IsVpcPeered
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/IsVpcPeered" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<IsVpcPeeredResult> isVpcPeeredAsync(IsVpcPeeredRequest isVpcPeeredRequest);

    /**
     * <p>
     * Returns a Boolean value indicating whether your Lightsail VPC is peered.
     * </p>
     * 
     * @param isVpcPeeredRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the IsVpcPeered operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.IsVpcPeered
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/IsVpcPeered" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<IsVpcPeeredResult> isVpcPeeredAsync(IsVpcPeeredRequest isVpcPeeredRequest,
            com.amazonaws.handlers.AsyncHandler<IsVpcPeeredRequest, IsVpcPeeredResult> asyncHandler);

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
     * @return A Java Future containing the result of the OpenInstancePublicPorts operation returned by the service.
     * @sample AmazonLightsailAsync.OpenInstancePublicPorts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/OpenInstancePublicPorts"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<OpenInstancePublicPortsResult> openInstancePublicPortsAsync(OpenInstancePublicPortsRequest openInstancePublicPortsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the OpenInstancePublicPorts operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.OpenInstancePublicPorts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/OpenInstancePublicPorts"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<OpenInstancePublicPortsResult> openInstancePublicPortsAsync(OpenInstancePublicPortsRequest openInstancePublicPortsRequest,
            com.amazonaws.handlers.AsyncHandler<OpenInstancePublicPortsRequest, OpenInstancePublicPortsResult> asyncHandler);

    /**
     * <p>
     * Peers the Lightsail VPC with the user's default VPC.
     * </p>
     * 
     * @param peerVpcRequest
     * @return A Java Future containing the result of the PeerVpc operation returned by the service.
     * @sample AmazonLightsailAsync.PeerVpc
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/PeerVpc" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PeerVpcResult> peerVpcAsync(PeerVpcRequest peerVpcRequest);

    /**
     * <p>
     * Peers the Lightsail VPC with the user's default VPC.
     * </p>
     * 
     * @param peerVpcRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PeerVpc operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.PeerVpc
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/PeerVpc" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PeerVpcResult> peerVpcAsync(PeerVpcRequest peerVpcRequest,
            com.amazonaws.handlers.AsyncHandler<PeerVpcRequest, PeerVpcResult> asyncHandler);

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
     * @return A Java Future containing the result of the PutAlarm operation returned by the service.
     * @sample AmazonLightsailAsync.PutAlarm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/PutAlarm" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutAlarmResult> putAlarmAsync(PutAlarmRequest putAlarmRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutAlarm operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.PutAlarm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/PutAlarm" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutAlarmResult> putAlarmAsync(PutAlarmRequest putAlarmRequest,
            com.amazonaws.handlers.AsyncHandler<PutAlarmRequest, PutAlarmResult> asyncHandler);

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
     * @return A Java Future containing the result of the PutInstancePublicPorts operation returned by the service.
     * @sample AmazonLightsailAsync.PutInstancePublicPorts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/PutInstancePublicPorts"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutInstancePublicPortsResult> putInstancePublicPortsAsync(PutInstancePublicPortsRequest putInstancePublicPortsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutInstancePublicPorts operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.PutInstancePublicPorts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/PutInstancePublicPorts"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutInstancePublicPortsResult> putInstancePublicPortsAsync(PutInstancePublicPortsRequest putInstancePublicPortsRequest,
            com.amazonaws.handlers.AsyncHandler<PutInstancePublicPortsRequest, PutInstancePublicPortsResult> asyncHandler);

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
     * @return A Java Future containing the result of the RebootInstance operation returned by the service.
     * @sample AmazonLightsailAsync.RebootInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/RebootInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RebootInstanceResult> rebootInstanceAsync(RebootInstanceRequest rebootInstanceRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RebootInstance operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.RebootInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/RebootInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RebootInstanceResult> rebootInstanceAsync(RebootInstanceRequest rebootInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<RebootInstanceRequest, RebootInstanceResult> asyncHandler);

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
     * @return A Java Future containing the result of the RebootRelationalDatabase operation returned by the service.
     * @sample AmazonLightsailAsync.RebootRelationalDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/RebootRelationalDatabase"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RebootRelationalDatabaseResult> rebootRelationalDatabaseAsync(RebootRelationalDatabaseRequest rebootRelationalDatabaseRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RebootRelationalDatabase operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.RebootRelationalDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/RebootRelationalDatabase"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RebootRelationalDatabaseResult> rebootRelationalDatabaseAsync(RebootRelationalDatabaseRequest rebootRelationalDatabaseRequest,
            com.amazonaws.handlers.AsyncHandler<RebootRelationalDatabaseRequest, RebootRelationalDatabaseResult> asyncHandler);

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
     * @return A Java Future containing the result of the RegisterContainerImage operation returned by the service.
     * @sample AmazonLightsailAsync.RegisterContainerImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/RegisterContainerImage"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RegisterContainerImageResult> registerContainerImageAsync(RegisterContainerImageRequest registerContainerImageRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RegisterContainerImage operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.RegisterContainerImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/RegisterContainerImage"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RegisterContainerImageResult> registerContainerImageAsync(RegisterContainerImageRequest registerContainerImageRequest,
            com.amazonaws.handlers.AsyncHandler<RegisterContainerImageRequest, RegisterContainerImageResult> asyncHandler);

    /**
     * <p>
     * Deletes a specific static IP from your account.
     * </p>
     * 
     * @param releaseStaticIpRequest
     * @return A Java Future containing the result of the ReleaseStaticIp operation returned by the service.
     * @sample AmazonLightsailAsync.ReleaseStaticIp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/ReleaseStaticIp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ReleaseStaticIpResult> releaseStaticIpAsync(ReleaseStaticIpRequest releaseStaticIpRequest);

    /**
     * <p>
     * Deletes a specific static IP from your account.
     * </p>
     * 
     * @param releaseStaticIpRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ReleaseStaticIp operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.ReleaseStaticIp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/ReleaseStaticIp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ReleaseStaticIpResult> releaseStaticIpAsync(ReleaseStaticIpRequest releaseStaticIpRequest,
            com.amazonaws.handlers.AsyncHandler<ReleaseStaticIpRequest, ReleaseStaticIpResult> asyncHandler);

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
     * @return A Java Future containing the result of the ResetDistributionCache operation returned by the service.
     * @sample AmazonLightsailAsync.ResetDistributionCache
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/ResetDistributionCache"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ResetDistributionCacheResult> resetDistributionCacheAsync(ResetDistributionCacheRequest resetDistributionCacheRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ResetDistributionCache operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.ResetDistributionCache
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/ResetDistributionCache"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ResetDistributionCacheResult> resetDistributionCacheAsync(ResetDistributionCacheRequest resetDistributionCacheRequest,
            com.amazonaws.handlers.AsyncHandler<ResetDistributionCacheRequest, ResetDistributionCacheResult> asyncHandler);

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
     * @return A Java Future containing the result of the SendContactMethodVerification operation returned by the
     *         service.
     * @sample AmazonLightsailAsync.SendContactMethodVerification
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/SendContactMethodVerification"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SendContactMethodVerificationResult> sendContactMethodVerificationAsync(
            SendContactMethodVerificationRequest sendContactMethodVerificationRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SendContactMethodVerification operation returned by the
     *         service.
     * @sample AmazonLightsailAsyncHandler.SendContactMethodVerification
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/SendContactMethodVerification"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SendContactMethodVerificationResult> sendContactMethodVerificationAsync(
            SendContactMethodVerificationRequest sendContactMethodVerificationRequest,
            com.amazonaws.handlers.AsyncHandler<SendContactMethodVerificationRequest, SendContactMethodVerificationResult> asyncHandler);

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
     * @return A Java Future containing the result of the SetIpAddressType operation returned by the service.
     * @sample AmazonLightsailAsync.SetIpAddressType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/SetIpAddressType" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SetIpAddressTypeResult> setIpAddressTypeAsync(SetIpAddressTypeRequest setIpAddressTypeRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SetIpAddressType operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.SetIpAddressType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/SetIpAddressType" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SetIpAddressTypeResult> setIpAddressTypeAsync(SetIpAddressTypeRequest setIpAddressTypeRequest,
            com.amazonaws.handlers.AsyncHandler<SetIpAddressTypeRequest, SetIpAddressTypeResult> asyncHandler);

    /**
     * <p>
     * Sets the Amazon Lightsail resources that can access the specified Lightsail bucket.
     * </p>
     * <p>
     * Lightsail buckets currently support setting access for Lightsail instances in the same AWS Region.
     * </p>
     * 
     * @param setResourceAccessForBucketRequest
     * @return A Java Future containing the result of the SetResourceAccessForBucket operation returned by the service.
     * @sample AmazonLightsailAsync.SetResourceAccessForBucket
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/SetResourceAccessForBucket"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SetResourceAccessForBucketResult> setResourceAccessForBucketAsync(
            SetResourceAccessForBucketRequest setResourceAccessForBucketRequest);

    /**
     * <p>
     * Sets the Amazon Lightsail resources that can access the specified Lightsail bucket.
     * </p>
     * <p>
     * Lightsail buckets currently support setting access for Lightsail instances in the same AWS Region.
     * </p>
     * 
     * @param setResourceAccessForBucketRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SetResourceAccessForBucket operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.SetResourceAccessForBucket
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/SetResourceAccessForBucket"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SetResourceAccessForBucketResult> setResourceAccessForBucketAsync(
            SetResourceAccessForBucketRequest setResourceAccessForBucketRequest,
            com.amazonaws.handlers.AsyncHandler<SetResourceAccessForBucketRequest, SetResourceAccessForBucketResult> asyncHandler);

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
     * @return A Java Future containing the result of the StartInstance operation returned by the service.
     * @sample AmazonLightsailAsync.StartInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/StartInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartInstanceResult> startInstanceAsync(StartInstanceRequest startInstanceRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartInstance operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.StartInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/StartInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartInstanceResult> startInstanceAsync(StartInstanceRequest startInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<StartInstanceRequest, StartInstanceResult> asyncHandler);

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
     * @return A Java Future containing the result of the StartRelationalDatabase operation returned by the service.
     * @sample AmazonLightsailAsync.StartRelationalDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/StartRelationalDatabase"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartRelationalDatabaseResult> startRelationalDatabaseAsync(StartRelationalDatabaseRequest startRelationalDatabaseRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartRelationalDatabase operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.StartRelationalDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/StartRelationalDatabase"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartRelationalDatabaseResult> startRelationalDatabaseAsync(StartRelationalDatabaseRequest startRelationalDatabaseRequest,
            com.amazonaws.handlers.AsyncHandler<StartRelationalDatabaseRequest, StartRelationalDatabaseResult> asyncHandler);

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
     * @return A Java Future containing the result of the StopInstance operation returned by the service.
     * @sample AmazonLightsailAsync.StopInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/StopInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopInstanceResult> stopInstanceAsync(StopInstanceRequest stopInstanceRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopInstance operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.StopInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/StopInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopInstanceResult> stopInstanceAsync(StopInstanceRequest stopInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<StopInstanceRequest, StopInstanceResult> asyncHandler);

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
     * @return A Java Future containing the result of the StopRelationalDatabase operation returned by the service.
     * @sample AmazonLightsailAsync.StopRelationalDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/StopRelationalDatabase"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StopRelationalDatabaseResult> stopRelationalDatabaseAsync(StopRelationalDatabaseRequest stopRelationalDatabaseRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopRelationalDatabase operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.StopRelationalDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/StopRelationalDatabase"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StopRelationalDatabaseResult> stopRelationalDatabaseAsync(StopRelationalDatabaseRequest stopRelationalDatabaseRequest,
            com.amazonaws.handlers.AsyncHandler<StopRelationalDatabaseRequest, StopRelationalDatabaseResult> asyncHandler);

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
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonLightsailAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

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
     * @return A Java Future containing the result of the TestAlarm operation returned by the service.
     * @sample AmazonLightsailAsync.TestAlarm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/TestAlarm" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TestAlarmResult> testAlarmAsync(TestAlarmRequest testAlarmRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TestAlarm operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.TestAlarm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/TestAlarm" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TestAlarmResult> testAlarmAsync(TestAlarmRequest testAlarmRequest,
            com.amazonaws.handlers.AsyncHandler<TestAlarmRequest, TestAlarmResult> asyncHandler);

    /**
     * <p>
     * Unpeers the Lightsail VPC from the user's default VPC.
     * </p>
     * 
     * @param unpeerVpcRequest
     * @return A Java Future containing the result of the UnpeerVpc operation returned by the service.
     * @sample AmazonLightsailAsync.UnpeerVpc
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/UnpeerVpc" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UnpeerVpcResult> unpeerVpcAsync(UnpeerVpcRequest unpeerVpcRequest);

    /**
     * <p>
     * Unpeers the Lightsail VPC from the user's default VPC.
     * </p>
     * 
     * @param unpeerVpcRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UnpeerVpc operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.UnpeerVpc
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/UnpeerVpc" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UnpeerVpcResult> unpeerVpcAsync(UnpeerVpcRequest unpeerVpcRequest,
            com.amazonaws.handlers.AsyncHandler<UnpeerVpcRequest, UnpeerVpcResult> asyncHandler);

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
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonLightsailAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

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
     * @return A Java Future containing the result of the UpdateBucket operation returned by the service.
     * @sample AmazonLightsailAsync.UpdateBucket
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/UpdateBucket" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateBucketResult> updateBucketAsync(UpdateBucketRequest updateBucketRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateBucket operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.UpdateBucket
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/UpdateBucket" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateBucketResult> updateBucketAsync(UpdateBucketRequest updateBucketRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateBucketRequest, UpdateBucketResult> asyncHandler);

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
     * @return A Java Future containing the result of the UpdateBucketBundle operation returned by the service.
     * @sample AmazonLightsailAsync.UpdateBucketBundle
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/UpdateBucketBundle" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateBucketBundleResult> updateBucketBundleAsync(UpdateBucketBundleRequest updateBucketBundleRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateBucketBundle operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.UpdateBucketBundle
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/UpdateBucketBundle" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateBucketBundleResult> updateBucketBundleAsync(UpdateBucketBundleRequest updateBucketBundleRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateBucketBundleRequest, UpdateBucketBundleResult> asyncHandler);

    /**
     * <p>
     * Updates the configuration of your Amazon Lightsail container service, such as its power, scale, and public domain
     * names.
     * </p>
     * 
     * @param updateContainerServiceRequest
     * @return A Java Future containing the result of the UpdateContainerService operation returned by the service.
     * @sample AmazonLightsailAsync.UpdateContainerService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/UpdateContainerService"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateContainerServiceResult> updateContainerServiceAsync(UpdateContainerServiceRequest updateContainerServiceRequest);

    /**
     * <p>
     * Updates the configuration of your Amazon Lightsail container service, such as its power, scale, and public domain
     * names.
     * </p>
     * 
     * @param updateContainerServiceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateContainerService operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.UpdateContainerService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/UpdateContainerService"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateContainerServiceResult> updateContainerServiceAsync(UpdateContainerServiceRequest updateContainerServiceRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateContainerServiceRequest, UpdateContainerServiceResult> asyncHandler);

    /**
     * <p>
     * Updates an existing Amazon Lightsail content delivery network (CDN) distribution.
     * </p>
     * <p>
     * Use this action to update the configuration of your existing distribution.
     * </p>
     * 
     * @param updateDistributionRequest
     * @return A Java Future containing the result of the UpdateDistribution operation returned by the service.
     * @sample AmazonLightsailAsync.UpdateDistribution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/UpdateDistribution" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDistributionResult> updateDistributionAsync(UpdateDistributionRequest updateDistributionRequest);

    /**
     * <p>
     * Updates an existing Amazon Lightsail content delivery network (CDN) distribution.
     * </p>
     * <p>
     * Use this action to update the configuration of your existing distribution.
     * </p>
     * 
     * @param updateDistributionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDistribution operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.UpdateDistribution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/UpdateDistribution" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDistributionResult> updateDistributionAsync(UpdateDistributionRequest updateDistributionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDistributionRequest, UpdateDistributionResult> asyncHandler);

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
     * @return A Java Future containing the result of the UpdateDistributionBundle operation returned by the service.
     * @sample AmazonLightsailAsync.UpdateDistributionBundle
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/UpdateDistributionBundle"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDistributionBundleResult> updateDistributionBundleAsync(UpdateDistributionBundleRequest updateDistributionBundleRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDistributionBundle operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.UpdateDistributionBundle
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/UpdateDistributionBundle"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDistributionBundleResult> updateDistributionBundleAsync(UpdateDistributionBundleRequest updateDistributionBundleRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDistributionBundleRequest, UpdateDistributionBundleResult> asyncHandler);

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
     * @return A Java Future containing the result of the UpdateDomainEntry operation returned by the service.
     * @sample AmazonLightsailAsync.UpdateDomainEntry
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/UpdateDomainEntry" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDomainEntryResult> updateDomainEntryAsync(UpdateDomainEntryRequest updateDomainEntryRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDomainEntry operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.UpdateDomainEntry
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/UpdateDomainEntry" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDomainEntryResult> updateDomainEntryAsync(UpdateDomainEntryRequest updateDomainEntryRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDomainEntryRequest, UpdateDomainEntryResult> asyncHandler);

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
     * @return A Java Future containing the result of the UpdateLoadBalancerAttribute operation returned by the service.
     * @sample AmazonLightsailAsync.UpdateLoadBalancerAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/UpdateLoadBalancerAttribute"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateLoadBalancerAttributeResult> updateLoadBalancerAttributeAsync(
            UpdateLoadBalancerAttributeRequest updateLoadBalancerAttributeRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateLoadBalancerAttribute operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.UpdateLoadBalancerAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/UpdateLoadBalancerAttribute"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateLoadBalancerAttributeResult> updateLoadBalancerAttributeAsync(
            UpdateLoadBalancerAttributeRequest updateLoadBalancerAttributeRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateLoadBalancerAttributeRequest, UpdateLoadBalancerAttributeResult> asyncHandler);

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
     * @return A Java Future containing the result of the UpdateRelationalDatabase operation returned by the service.
     * @sample AmazonLightsailAsync.UpdateRelationalDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/UpdateRelationalDatabase"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRelationalDatabaseResult> updateRelationalDatabaseAsync(UpdateRelationalDatabaseRequest updateRelationalDatabaseRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateRelationalDatabase operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.UpdateRelationalDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/UpdateRelationalDatabase"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRelationalDatabaseResult> updateRelationalDatabaseAsync(UpdateRelationalDatabaseRequest updateRelationalDatabaseRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateRelationalDatabaseRequest, UpdateRelationalDatabaseResult> asyncHandler);

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
     * @return A Java Future containing the result of the UpdateRelationalDatabaseParameters operation returned by the
     *         service.
     * @sample AmazonLightsailAsync.UpdateRelationalDatabaseParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/UpdateRelationalDatabaseParameters"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRelationalDatabaseParametersResult> updateRelationalDatabaseParametersAsync(
            UpdateRelationalDatabaseParametersRequest updateRelationalDatabaseParametersRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateRelationalDatabaseParameters operation returned by the
     *         service.
     * @sample AmazonLightsailAsyncHandler.UpdateRelationalDatabaseParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/UpdateRelationalDatabaseParameters"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRelationalDatabaseParametersResult> updateRelationalDatabaseParametersAsync(
            UpdateRelationalDatabaseParametersRequest updateRelationalDatabaseParametersRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateRelationalDatabaseParametersRequest, UpdateRelationalDatabaseParametersResult> asyncHandler);

}
