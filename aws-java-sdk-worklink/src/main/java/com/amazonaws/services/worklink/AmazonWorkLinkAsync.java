/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.worklink;

import javax.annotation.Generated;

import com.amazonaws.services.worklink.model.*;

/**
 * Interface for accessing WorkLink asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.worklink.AbstractAmazonWorkLinkAsync} instead.
 * </p>
 * <p>
 * <p>
 * Amazon WorkLink is a cloud-based service that provides secure access to internal websites and web apps from iOS
 * phones. In a single step, your users, such as employees, can access internal websites as efficiently as they access
 * any other public website. They enter a URL in their web browser, or choose a link to an internal website in an email.
 * Amazon WorkLink authenticates the user's access and securely renders authorized internal web content in a secure
 * rendering service in the AWS cloud. Amazon WorkLink doesn't download or store any internal web content on mobile
 * devices.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonWorkLinkAsync extends AmazonWorkLink {

    /**
     * <p>
     * Specifies a domain to be associated to Amazon WorkLink.
     * </p>
     * 
     * @param associateDomainRequest
     * @return A Java Future containing the result of the AssociateDomain operation returned by the service.
     * @sample AmazonWorkLinkAsync.AssociateDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/AssociateDomain" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AssociateDomainResult> associateDomainAsync(AssociateDomainRequest associateDomainRequest);

    /**
     * <p>
     * Specifies a domain to be associated to Amazon WorkLink.
     * </p>
     * 
     * @param associateDomainRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateDomain operation returned by the service.
     * @sample AmazonWorkLinkAsyncHandler.AssociateDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/AssociateDomain" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AssociateDomainResult> associateDomainAsync(AssociateDomainRequest associateDomainRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateDomainRequest, AssociateDomainResult> asyncHandler);

    /**
     * <p>
     * Imports the root certificate of a certificate authority (CA) used to obtain TLS certificates used by associated
     * websites within the company network.
     * </p>
     * 
     * @param associateWebsiteCertificateAuthorityRequest
     * @return A Java Future containing the result of the AssociateWebsiteCertificateAuthority operation returned by the
     *         service.
     * @sample AmazonWorkLinkAsync.AssociateWebsiteCertificateAuthority
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/AssociateWebsiteCertificateAuthority"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateWebsiteCertificateAuthorityResult> associateWebsiteCertificateAuthorityAsync(
            AssociateWebsiteCertificateAuthorityRequest associateWebsiteCertificateAuthorityRequest);

    /**
     * <p>
     * Imports the root certificate of a certificate authority (CA) used to obtain TLS certificates used by associated
     * websites within the company network.
     * </p>
     * 
     * @param associateWebsiteCertificateAuthorityRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateWebsiteCertificateAuthority operation returned by the
     *         service.
     * @sample AmazonWorkLinkAsyncHandler.AssociateWebsiteCertificateAuthority
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/AssociateWebsiteCertificateAuthority"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateWebsiteCertificateAuthorityResult> associateWebsiteCertificateAuthorityAsync(
            AssociateWebsiteCertificateAuthorityRequest associateWebsiteCertificateAuthorityRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateWebsiteCertificateAuthorityRequest, AssociateWebsiteCertificateAuthorityResult> asyncHandler);

    /**
     * <p>
     * Creates a fleet. A fleet consists of resources and the configuration that delivers associated websites to
     * authorized users who download and set up the Amazon WorkLink app.
     * </p>
     * 
     * @param createFleetRequest
     * @return A Java Future containing the result of the CreateFleet operation returned by the service.
     * @sample AmazonWorkLinkAsync.CreateFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/CreateFleet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateFleetResult> createFleetAsync(CreateFleetRequest createFleetRequest);

    /**
     * <p>
     * Creates a fleet. A fleet consists of resources and the configuration that delivers associated websites to
     * authorized users who download and set up the Amazon WorkLink app.
     * </p>
     * 
     * @param createFleetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateFleet operation returned by the service.
     * @sample AmazonWorkLinkAsyncHandler.CreateFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/CreateFleet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateFleetResult> createFleetAsync(CreateFleetRequest createFleetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateFleetRequest, CreateFleetResult> asyncHandler);

    /**
     * <p>
     * Deletes a fleet. Prevents users from accessing previously associated websites.
     * </p>
     * 
     * @param deleteFleetRequest
     * @return A Java Future containing the result of the DeleteFleet operation returned by the service.
     * @sample AmazonWorkLinkAsync.DeleteFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/DeleteFleet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteFleetResult> deleteFleetAsync(DeleteFleetRequest deleteFleetRequest);

    /**
     * <p>
     * Deletes a fleet. Prevents users from accessing previously associated websites.
     * </p>
     * 
     * @param deleteFleetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteFleet operation returned by the service.
     * @sample AmazonWorkLinkAsyncHandler.DeleteFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/DeleteFleet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteFleetResult> deleteFleetAsync(DeleteFleetRequest deleteFleetRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteFleetRequest, DeleteFleetResult> asyncHandler);

    /**
     * <p>
     * Describes the configuration for delivering audit streams to the customer account.
     * </p>
     * 
     * @param describeAuditStreamConfigurationRequest
     * @return A Java Future containing the result of the DescribeAuditStreamConfiguration operation returned by the
     *         service.
     * @sample AmazonWorkLinkAsync.DescribeAuditStreamConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/DescribeAuditStreamConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAuditStreamConfigurationResult> describeAuditStreamConfigurationAsync(
            DescribeAuditStreamConfigurationRequest describeAuditStreamConfigurationRequest);

    /**
     * <p>
     * Describes the configuration for delivering audit streams to the customer account.
     * </p>
     * 
     * @param describeAuditStreamConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAuditStreamConfiguration operation returned by the
     *         service.
     * @sample AmazonWorkLinkAsyncHandler.DescribeAuditStreamConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/DescribeAuditStreamConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAuditStreamConfigurationResult> describeAuditStreamConfigurationAsync(
            DescribeAuditStreamConfigurationRequest describeAuditStreamConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAuditStreamConfigurationRequest, DescribeAuditStreamConfigurationResult> asyncHandler);

    /**
     * <p>
     * Describes the networking configuration to access the internal websites associated with the specified fleet.
     * </p>
     * 
     * @param describeCompanyNetworkConfigurationRequest
     * @return A Java Future containing the result of the DescribeCompanyNetworkConfiguration operation returned by the
     *         service.
     * @sample AmazonWorkLinkAsync.DescribeCompanyNetworkConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/DescribeCompanyNetworkConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeCompanyNetworkConfigurationResult> describeCompanyNetworkConfigurationAsync(
            DescribeCompanyNetworkConfigurationRequest describeCompanyNetworkConfigurationRequest);

    /**
     * <p>
     * Describes the networking configuration to access the internal websites associated with the specified fleet.
     * </p>
     * 
     * @param describeCompanyNetworkConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeCompanyNetworkConfiguration operation returned by the
     *         service.
     * @sample AmazonWorkLinkAsyncHandler.DescribeCompanyNetworkConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/DescribeCompanyNetworkConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeCompanyNetworkConfigurationResult> describeCompanyNetworkConfigurationAsync(
            DescribeCompanyNetworkConfigurationRequest describeCompanyNetworkConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeCompanyNetworkConfigurationRequest, DescribeCompanyNetworkConfigurationResult> asyncHandler);

    /**
     * <p>
     * Provides information about a user's device.
     * </p>
     * 
     * @param describeDeviceRequest
     * @return A Java Future containing the result of the DescribeDevice operation returned by the service.
     * @sample AmazonWorkLinkAsync.DescribeDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/DescribeDevice" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeDeviceResult> describeDeviceAsync(DescribeDeviceRequest describeDeviceRequest);

    /**
     * <p>
     * Provides information about a user's device.
     * </p>
     * 
     * @param describeDeviceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDevice operation returned by the service.
     * @sample AmazonWorkLinkAsyncHandler.DescribeDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/DescribeDevice" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeDeviceResult> describeDeviceAsync(DescribeDeviceRequest describeDeviceRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDeviceRequest, DescribeDeviceResult> asyncHandler);

    /**
     * <p>
     * Describes the device policy configuration for the specified fleet.
     * </p>
     * 
     * @param describeDevicePolicyConfigurationRequest
     * @return A Java Future containing the result of the DescribeDevicePolicyConfiguration operation returned by the
     *         service.
     * @sample AmazonWorkLinkAsync.DescribeDevicePolicyConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/DescribeDevicePolicyConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDevicePolicyConfigurationResult> describeDevicePolicyConfigurationAsync(
            DescribeDevicePolicyConfigurationRequest describeDevicePolicyConfigurationRequest);

    /**
     * <p>
     * Describes the device policy configuration for the specified fleet.
     * </p>
     * 
     * @param describeDevicePolicyConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDevicePolicyConfiguration operation returned by the
     *         service.
     * @sample AmazonWorkLinkAsyncHandler.DescribeDevicePolicyConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/DescribeDevicePolicyConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDevicePolicyConfigurationResult> describeDevicePolicyConfigurationAsync(
            DescribeDevicePolicyConfigurationRequest describeDevicePolicyConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDevicePolicyConfigurationRequest, DescribeDevicePolicyConfigurationResult> asyncHandler);

    /**
     * <p>
     * Provides information about the domain.
     * </p>
     * 
     * @param describeDomainRequest
     * @return A Java Future containing the result of the DescribeDomain operation returned by the service.
     * @sample AmazonWorkLinkAsync.DescribeDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/DescribeDomain" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeDomainResult> describeDomainAsync(DescribeDomainRequest describeDomainRequest);

    /**
     * <p>
     * Provides information about the domain.
     * </p>
     * 
     * @param describeDomainRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDomain operation returned by the service.
     * @sample AmazonWorkLinkAsyncHandler.DescribeDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/DescribeDomain" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeDomainResult> describeDomainAsync(DescribeDomainRequest describeDomainRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDomainRequest, DescribeDomainResult> asyncHandler);

    /**
     * <p>
     * Provides basic information for the specified fleet, excluding identity provider, networking, and device
     * configuration details.
     * </p>
     * 
     * @param describeFleetMetadataRequest
     * @return A Java Future containing the result of the DescribeFleetMetadata operation returned by the service.
     * @sample AmazonWorkLinkAsync.DescribeFleetMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/DescribeFleetMetadata" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeFleetMetadataResult> describeFleetMetadataAsync(DescribeFleetMetadataRequest describeFleetMetadataRequest);

    /**
     * <p>
     * Provides basic information for the specified fleet, excluding identity provider, networking, and device
     * configuration details.
     * </p>
     * 
     * @param describeFleetMetadataRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeFleetMetadata operation returned by the service.
     * @sample AmazonWorkLinkAsyncHandler.DescribeFleetMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/DescribeFleetMetadata" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeFleetMetadataResult> describeFleetMetadataAsync(DescribeFleetMetadataRequest describeFleetMetadataRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeFleetMetadataRequest, DescribeFleetMetadataResult> asyncHandler);

    /**
     * <p>
     * Describes the identity provider configuration of the specified fleet.
     * </p>
     * 
     * @param describeIdentityProviderConfigurationRequest
     * @return A Java Future containing the result of the DescribeIdentityProviderConfiguration operation returned by
     *         the service.
     * @sample AmazonWorkLinkAsync.DescribeIdentityProviderConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/DescribeIdentityProviderConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeIdentityProviderConfigurationResult> describeIdentityProviderConfigurationAsync(
            DescribeIdentityProviderConfigurationRequest describeIdentityProviderConfigurationRequest);

    /**
     * <p>
     * Describes the identity provider configuration of the specified fleet.
     * </p>
     * 
     * @param describeIdentityProviderConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeIdentityProviderConfiguration operation returned by
     *         the service.
     * @sample AmazonWorkLinkAsyncHandler.DescribeIdentityProviderConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/DescribeIdentityProviderConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeIdentityProviderConfigurationResult> describeIdentityProviderConfigurationAsync(
            DescribeIdentityProviderConfigurationRequest describeIdentityProviderConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeIdentityProviderConfigurationRequest, DescribeIdentityProviderConfigurationResult> asyncHandler);

    /**
     * <p>
     * Provides information about the certificate authority.
     * </p>
     * 
     * @param describeWebsiteCertificateAuthorityRequest
     * @return A Java Future containing the result of the DescribeWebsiteCertificateAuthority operation returned by the
     *         service.
     * @sample AmazonWorkLinkAsync.DescribeWebsiteCertificateAuthority
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/DescribeWebsiteCertificateAuthority"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeWebsiteCertificateAuthorityResult> describeWebsiteCertificateAuthorityAsync(
            DescribeWebsiteCertificateAuthorityRequest describeWebsiteCertificateAuthorityRequest);

    /**
     * <p>
     * Provides information about the certificate authority.
     * </p>
     * 
     * @param describeWebsiteCertificateAuthorityRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeWebsiteCertificateAuthority operation returned by the
     *         service.
     * @sample AmazonWorkLinkAsyncHandler.DescribeWebsiteCertificateAuthority
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/DescribeWebsiteCertificateAuthority"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeWebsiteCertificateAuthorityResult> describeWebsiteCertificateAuthorityAsync(
            DescribeWebsiteCertificateAuthorityRequest describeWebsiteCertificateAuthorityRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeWebsiteCertificateAuthorityRequest, DescribeWebsiteCertificateAuthorityResult> asyncHandler);

    /**
     * <p>
     * Disassociates a domain from Amazon WorkLink. End users lose the ability to access the domain with Amazon
     * WorkLink.
     * </p>
     * 
     * @param disassociateDomainRequest
     * @return A Java Future containing the result of the DisassociateDomain operation returned by the service.
     * @sample AmazonWorkLinkAsync.DisassociateDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/DisassociateDomain" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateDomainResult> disassociateDomainAsync(DisassociateDomainRequest disassociateDomainRequest);

    /**
     * <p>
     * Disassociates a domain from Amazon WorkLink. End users lose the ability to access the domain with Amazon
     * WorkLink.
     * </p>
     * 
     * @param disassociateDomainRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateDomain operation returned by the service.
     * @sample AmazonWorkLinkAsyncHandler.DisassociateDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/DisassociateDomain" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateDomainResult> disassociateDomainAsync(DisassociateDomainRequest disassociateDomainRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateDomainRequest, DisassociateDomainResult> asyncHandler);

    /**
     * <p>
     * Removes a certificate authority (CA).
     * </p>
     * 
     * @param disassociateWebsiteCertificateAuthorityRequest
     * @return A Java Future containing the result of the DisassociateWebsiteCertificateAuthority operation returned by
     *         the service.
     * @sample AmazonWorkLinkAsync.DisassociateWebsiteCertificateAuthority
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/DisassociateWebsiteCertificateAuthority"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateWebsiteCertificateAuthorityResult> disassociateWebsiteCertificateAuthorityAsync(
            DisassociateWebsiteCertificateAuthorityRequest disassociateWebsiteCertificateAuthorityRequest);

    /**
     * <p>
     * Removes a certificate authority (CA).
     * </p>
     * 
     * @param disassociateWebsiteCertificateAuthorityRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateWebsiteCertificateAuthority operation returned by
     *         the service.
     * @sample AmazonWorkLinkAsyncHandler.DisassociateWebsiteCertificateAuthority
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/DisassociateWebsiteCertificateAuthority"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateWebsiteCertificateAuthorityResult> disassociateWebsiteCertificateAuthorityAsync(
            DisassociateWebsiteCertificateAuthorityRequest disassociateWebsiteCertificateAuthorityRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateWebsiteCertificateAuthorityRequest, DisassociateWebsiteCertificateAuthorityResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of devices registered with the specified fleet.
     * </p>
     * 
     * @param listDevicesRequest
     * @return A Java Future containing the result of the ListDevices operation returned by the service.
     * @sample AmazonWorkLinkAsync.ListDevices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/ListDevices" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDevicesResult> listDevicesAsync(ListDevicesRequest listDevicesRequest);

    /**
     * <p>
     * Retrieves a list of devices registered with the specified fleet.
     * </p>
     * 
     * @param listDevicesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDevices operation returned by the service.
     * @sample AmazonWorkLinkAsyncHandler.ListDevices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/ListDevices" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDevicesResult> listDevicesAsync(ListDevicesRequest listDevicesRequest,
            com.amazonaws.handlers.AsyncHandler<ListDevicesRequest, ListDevicesResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of domains associated to a specified fleet.
     * </p>
     * 
     * @param listDomainsRequest
     * @return A Java Future containing the result of the ListDomains operation returned by the service.
     * @sample AmazonWorkLinkAsync.ListDomains
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/ListDomains" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDomainsResult> listDomainsAsync(ListDomainsRequest listDomainsRequest);

    /**
     * <p>
     * Retrieves a list of domains associated to a specified fleet.
     * </p>
     * 
     * @param listDomainsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDomains operation returned by the service.
     * @sample AmazonWorkLinkAsyncHandler.ListDomains
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/ListDomains" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDomainsResult> listDomainsAsync(ListDomainsRequest listDomainsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDomainsRequest, ListDomainsResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of fleets for the current account and Region.
     * </p>
     * 
     * @param listFleetsRequest
     * @return A Java Future containing the result of the ListFleets operation returned by the service.
     * @sample AmazonWorkLinkAsync.ListFleets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/ListFleets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListFleetsResult> listFleetsAsync(ListFleetsRequest listFleetsRequest);

    /**
     * <p>
     * Retrieves a list of fleets for the current account and Region.
     * </p>
     * 
     * @param listFleetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListFleets operation returned by the service.
     * @sample AmazonWorkLinkAsyncHandler.ListFleets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/ListFleets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListFleetsResult> listFleetsAsync(ListFleetsRequest listFleetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListFleetsRequest, ListFleetsResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of certificate authorities added for the current account and Region.
     * </p>
     * 
     * @param listWebsiteCertificateAuthoritiesRequest
     * @return A Java Future containing the result of the ListWebsiteCertificateAuthorities operation returned by the
     *         service.
     * @sample AmazonWorkLinkAsync.ListWebsiteCertificateAuthorities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/ListWebsiteCertificateAuthorities"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListWebsiteCertificateAuthoritiesResult> listWebsiteCertificateAuthoritiesAsync(
            ListWebsiteCertificateAuthoritiesRequest listWebsiteCertificateAuthoritiesRequest);

    /**
     * <p>
     * Retrieves a list of certificate authorities added for the current account and Region.
     * </p>
     * 
     * @param listWebsiteCertificateAuthoritiesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListWebsiteCertificateAuthorities operation returned by the
     *         service.
     * @sample AmazonWorkLinkAsyncHandler.ListWebsiteCertificateAuthorities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/ListWebsiteCertificateAuthorities"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListWebsiteCertificateAuthoritiesResult> listWebsiteCertificateAuthoritiesAsync(
            ListWebsiteCertificateAuthoritiesRequest listWebsiteCertificateAuthoritiesRequest,
            com.amazonaws.handlers.AsyncHandler<ListWebsiteCertificateAuthoritiesRequest, ListWebsiteCertificateAuthoritiesResult> asyncHandler);

    /**
     * <p>
     * Moves a domain to ACTIVE status if it was in the INACTIVE status.
     * </p>
     * 
     * @param restoreDomainAccessRequest
     * @return A Java Future containing the result of the RestoreDomainAccess operation returned by the service.
     * @sample AmazonWorkLinkAsync.RestoreDomainAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/RestoreDomainAccess" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RestoreDomainAccessResult> restoreDomainAccessAsync(RestoreDomainAccessRequest restoreDomainAccessRequest);

    /**
     * <p>
     * Moves a domain to ACTIVE status if it was in the INACTIVE status.
     * </p>
     * 
     * @param restoreDomainAccessRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RestoreDomainAccess operation returned by the service.
     * @sample AmazonWorkLinkAsyncHandler.RestoreDomainAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/RestoreDomainAccess" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RestoreDomainAccessResult> restoreDomainAccessAsync(RestoreDomainAccessRequest restoreDomainAccessRequest,
            com.amazonaws.handlers.AsyncHandler<RestoreDomainAccessRequest, RestoreDomainAccessResult> asyncHandler);

    /**
     * <p>
     * Moves a domain to INACTIVE status if it was in the ACTIVE status.
     * </p>
     * 
     * @param revokeDomainAccessRequest
     * @return A Java Future containing the result of the RevokeDomainAccess operation returned by the service.
     * @sample AmazonWorkLinkAsync.RevokeDomainAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/RevokeDomainAccess" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RevokeDomainAccessResult> revokeDomainAccessAsync(RevokeDomainAccessRequest revokeDomainAccessRequest);

    /**
     * <p>
     * Moves a domain to INACTIVE status if it was in the ACTIVE status.
     * </p>
     * 
     * @param revokeDomainAccessRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RevokeDomainAccess operation returned by the service.
     * @sample AmazonWorkLinkAsyncHandler.RevokeDomainAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/RevokeDomainAccess" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RevokeDomainAccessResult> revokeDomainAccessAsync(RevokeDomainAccessRequest revokeDomainAccessRequest,
            com.amazonaws.handlers.AsyncHandler<RevokeDomainAccessRequest, RevokeDomainAccessResult> asyncHandler);

    /**
     * <p>
     * Signs the user out from all of their devices. The user can sign in again if they have valid credentials.
     * </p>
     * 
     * @param signOutUserRequest
     * @return A Java Future containing the result of the SignOutUser operation returned by the service.
     * @sample AmazonWorkLinkAsync.SignOutUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/SignOutUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SignOutUserResult> signOutUserAsync(SignOutUserRequest signOutUserRequest);

    /**
     * <p>
     * Signs the user out from all of their devices. The user can sign in again if they have valid credentials.
     * </p>
     * 
     * @param signOutUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SignOutUser operation returned by the service.
     * @sample AmazonWorkLinkAsyncHandler.SignOutUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/SignOutUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SignOutUserResult> signOutUserAsync(SignOutUserRequest signOutUserRequest,
            com.amazonaws.handlers.AsyncHandler<SignOutUserRequest, SignOutUserResult> asyncHandler);

    /**
     * <p>
     * Updates the audit stream configuration for the fleet.
     * </p>
     * 
     * @param updateAuditStreamConfigurationRequest
     * @return A Java Future containing the result of the UpdateAuditStreamConfiguration operation returned by the
     *         service.
     * @sample AmazonWorkLinkAsync.UpdateAuditStreamConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/UpdateAuditStreamConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAuditStreamConfigurationResult> updateAuditStreamConfigurationAsync(
            UpdateAuditStreamConfigurationRequest updateAuditStreamConfigurationRequest);

    /**
     * <p>
     * Updates the audit stream configuration for the fleet.
     * </p>
     * 
     * @param updateAuditStreamConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAuditStreamConfiguration operation returned by the
     *         service.
     * @sample AmazonWorkLinkAsyncHandler.UpdateAuditStreamConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/UpdateAuditStreamConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAuditStreamConfigurationResult> updateAuditStreamConfigurationAsync(
            UpdateAuditStreamConfigurationRequest updateAuditStreamConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAuditStreamConfigurationRequest, UpdateAuditStreamConfigurationResult> asyncHandler);

    /**
     * <p>
     * Updates the company network configuration for the fleet.
     * </p>
     * 
     * @param updateCompanyNetworkConfigurationRequest
     * @return A Java Future containing the result of the UpdateCompanyNetworkConfiguration operation returned by the
     *         service.
     * @sample AmazonWorkLinkAsync.UpdateCompanyNetworkConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/UpdateCompanyNetworkConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateCompanyNetworkConfigurationResult> updateCompanyNetworkConfigurationAsync(
            UpdateCompanyNetworkConfigurationRequest updateCompanyNetworkConfigurationRequest);

    /**
     * <p>
     * Updates the company network configuration for the fleet.
     * </p>
     * 
     * @param updateCompanyNetworkConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateCompanyNetworkConfiguration operation returned by the
     *         service.
     * @sample AmazonWorkLinkAsyncHandler.UpdateCompanyNetworkConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/UpdateCompanyNetworkConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateCompanyNetworkConfigurationResult> updateCompanyNetworkConfigurationAsync(
            UpdateCompanyNetworkConfigurationRequest updateCompanyNetworkConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateCompanyNetworkConfigurationRequest, UpdateCompanyNetworkConfigurationResult> asyncHandler);

    /**
     * <p>
     * Updates the device policy configuration for the fleet.
     * </p>
     * 
     * @param updateDevicePolicyConfigurationRequest
     * @return A Java Future containing the result of the UpdateDevicePolicyConfiguration operation returned by the
     *         service.
     * @sample AmazonWorkLinkAsync.UpdateDevicePolicyConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/UpdateDevicePolicyConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDevicePolicyConfigurationResult> updateDevicePolicyConfigurationAsync(
            UpdateDevicePolicyConfigurationRequest updateDevicePolicyConfigurationRequest);

    /**
     * <p>
     * Updates the device policy configuration for the fleet.
     * </p>
     * 
     * @param updateDevicePolicyConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDevicePolicyConfiguration operation returned by the
     *         service.
     * @sample AmazonWorkLinkAsyncHandler.UpdateDevicePolicyConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/UpdateDevicePolicyConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDevicePolicyConfigurationResult> updateDevicePolicyConfigurationAsync(
            UpdateDevicePolicyConfigurationRequest updateDevicePolicyConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDevicePolicyConfigurationRequest, UpdateDevicePolicyConfigurationResult> asyncHandler);

    /**
     * <p>
     * Updates domain metadata, such as DisplayName.
     * </p>
     * 
     * @param updateDomainMetadataRequest
     * @return A Java Future containing the result of the UpdateDomainMetadata operation returned by the service.
     * @sample AmazonWorkLinkAsync.UpdateDomainMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/UpdateDomainMetadata" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDomainMetadataResult> updateDomainMetadataAsync(UpdateDomainMetadataRequest updateDomainMetadataRequest);

    /**
     * <p>
     * Updates domain metadata, such as DisplayName.
     * </p>
     * 
     * @param updateDomainMetadataRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDomainMetadata operation returned by the service.
     * @sample AmazonWorkLinkAsyncHandler.UpdateDomainMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/UpdateDomainMetadata" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDomainMetadataResult> updateDomainMetadataAsync(UpdateDomainMetadataRequest updateDomainMetadataRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDomainMetadataRequest, UpdateDomainMetadataResult> asyncHandler);

    /**
     * <p>
     * Updates fleet metadata, such as DisplayName.
     * </p>
     * 
     * @param updateFleetMetadataRequest
     * @return A Java Future containing the result of the UpdateFleetMetadata operation returned by the service.
     * @sample AmazonWorkLinkAsync.UpdateFleetMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/UpdateFleetMetadata" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateFleetMetadataResult> updateFleetMetadataAsync(UpdateFleetMetadataRequest updateFleetMetadataRequest);

    /**
     * <p>
     * Updates fleet metadata, such as DisplayName.
     * </p>
     * 
     * @param updateFleetMetadataRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateFleetMetadata operation returned by the service.
     * @sample AmazonWorkLinkAsyncHandler.UpdateFleetMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/UpdateFleetMetadata" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateFleetMetadataResult> updateFleetMetadataAsync(UpdateFleetMetadataRequest updateFleetMetadataRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateFleetMetadataRequest, UpdateFleetMetadataResult> asyncHandler);

    /**
     * <p>
     * Updates the identity provider configuration for the fleet.
     * </p>
     * 
     * @param updateIdentityProviderConfigurationRequest
     * @return A Java Future containing the result of the UpdateIdentityProviderConfiguration operation returned by the
     *         service.
     * @sample AmazonWorkLinkAsync.UpdateIdentityProviderConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/UpdateIdentityProviderConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateIdentityProviderConfigurationResult> updateIdentityProviderConfigurationAsync(
            UpdateIdentityProviderConfigurationRequest updateIdentityProviderConfigurationRequest);

    /**
     * <p>
     * Updates the identity provider configuration for the fleet.
     * </p>
     * 
     * @param updateIdentityProviderConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateIdentityProviderConfiguration operation returned by the
     *         service.
     * @sample AmazonWorkLinkAsyncHandler.UpdateIdentityProviderConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/UpdateIdentityProviderConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateIdentityProviderConfigurationResult> updateIdentityProviderConfigurationAsync(
            UpdateIdentityProviderConfigurationRequest updateIdentityProviderConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateIdentityProviderConfigurationRequest, UpdateIdentityProviderConfigurationResult> asyncHandler);

}
