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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.worklink.model.*;

/**
 * Interface for accessing WorkLink.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.worklink.AbstractAmazonWorkLink} instead.
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
public interface AmazonWorkLink {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "worklink";

    /**
     * <p>
     * Specifies a domain to be associated to Amazon WorkLink.
     * </p>
     * 
     * @param associateDomainRequest
     * @return Result of the AssociateDomain operation returned by the service.
     * @throws UnauthorizedException
     *         You are not authorized to perform this action.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws ResourceAlreadyExistsException
     *         The resource already exists.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit.
     * @sample AmazonWorkLink.AssociateDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/AssociateDomain" target="_top">AWS API
     *      Documentation</a>
     */
    AssociateDomainResult associateDomain(AssociateDomainRequest associateDomainRequest);

    /**
     * <p>
     * Imports the root certificate of a certificate authority (CA) used to obtain TLS certificates used by associated
     * websites within the company network.
     * </p>
     * 
     * @param associateWebsiteCertificateAuthorityRequest
     * @return Result of the AssociateWebsiteCertificateAuthority operation returned by the service.
     * @throws UnauthorizedException
     *         You are not authorized to perform this action.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws ResourceAlreadyExistsException
     *         The resource already exists.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit.
     * @sample AmazonWorkLink.AssociateWebsiteCertificateAuthority
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/AssociateWebsiteCertificateAuthority"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateWebsiteCertificateAuthorityResult associateWebsiteCertificateAuthority(
            AssociateWebsiteCertificateAuthorityRequest associateWebsiteCertificateAuthorityRequest);

    /**
     * <p>
     * Creates a fleet. A fleet consists of resources and the configuration that delivers associated websites to
     * authorized users who download and set up the Amazon WorkLink app.
     * </p>
     * 
     * @param createFleetRequest
     * @return Result of the CreateFleet operation returned by the service.
     * @throws UnauthorizedException
     *         You are not authorized to perform this action.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws ResourceAlreadyExistsException
     *         The resource already exists.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit.
     * @sample AmazonWorkLink.CreateFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/CreateFleet" target="_top">AWS API
     *      Documentation</a>
     */
    CreateFleetResult createFleet(CreateFleetRequest createFleetRequest);

    /**
     * <p>
     * Deletes a fleet. Prevents users from accessing previously associated websites.
     * </p>
     * 
     * @param deleteFleetRequest
     * @return Result of the DeleteFleet operation returned by the service.
     * @throws UnauthorizedException
     *         You are not authorized to perform this action.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit.
     * @sample AmazonWorkLink.DeleteFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/DeleteFleet" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteFleetResult deleteFleet(DeleteFleetRequest deleteFleetRequest);

    /**
     * <p>
     * Describes the configuration for delivering audit streams to the customer account.
     * </p>
     * 
     * @param describeAuditStreamConfigurationRequest
     * @return Result of the DescribeAuditStreamConfiguration operation returned by the service.
     * @throws UnauthorizedException
     *         You are not authorized to perform this action.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit.
     * @sample AmazonWorkLink.DescribeAuditStreamConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/DescribeAuditStreamConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeAuditStreamConfigurationResult describeAuditStreamConfiguration(DescribeAuditStreamConfigurationRequest describeAuditStreamConfigurationRequest);

    /**
     * <p>
     * Describes the networking configuration to access the internal websites associated with the specified fleet.
     * </p>
     * 
     * @param describeCompanyNetworkConfigurationRequest
     * @return Result of the DescribeCompanyNetworkConfiguration operation returned by the service.
     * @throws UnauthorizedException
     *         You are not authorized to perform this action.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit.
     * @sample AmazonWorkLink.DescribeCompanyNetworkConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/DescribeCompanyNetworkConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeCompanyNetworkConfigurationResult describeCompanyNetworkConfiguration(
            DescribeCompanyNetworkConfigurationRequest describeCompanyNetworkConfigurationRequest);

    /**
     * <p>
     * Provides information about a user's device.
     * </p>
     * 
     * @param describeDeviceRequest
     * @return Result of the DescribeDevice operation returned by the service.
     * @throws UnauthorizedException
     *         You are not authorized to perform this action.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit.
     * @sample AmazonWorkLink.DescribeDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/DescribeDevice" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeDeviceResult describeDevice(DescribeDeviceRequest describeDeviceRequest);

    /**
     * <p>
     * Describes the device policy configuration for the specified fleet.
     * </p>
     * 
     * @param describeDevicePolicyConfigurationRequest
     * @return Result of the DescribeDevicePolicyConfiguration operation returned by the service.
     * @throws UnauthorizedException
     *         You are not authorized to perform this action.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit.
     * @sample AmazonWorkLink.DescribeDevicePolicyConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/DescribeDevicePolicyConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeDevicePolicyConfigurationResult describeDevicePolicyConfiguration(DescribeDevicePolicyConfigurationRequest describeDevicePolicyConfigurationRequest);

    /**
     * <p>
     * Provides information about the domain.
     * </p>
     * 
     * @param describeDomainRequest
     * @return Result of the DescribeDomain operation returned by the service.
     * @throws UnauthorizedException
     *         You are not authorized to perform this action.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit.
     * @sample AmazonWorkLink.DescribeDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/DescribeDomain" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeDomainResult describeDomain(DescribeDomainRequest describeDomainRequest);

    /**
     * <p>
     * Provides basic information for the specified fleet, excluding identity provider, networking, and device
     * configuration details.
     * </p>
     * 
     * @param describeFleetMetadataRequest
     * @return Result of the DescribeFleetMetadata operation returned by the service.
     * @throws UnauthorizedException
     *         You are not authorized to perform this action.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit.
     * @sample AmazonWorkLink.DescribeFleetMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/DescribeFleetMetadata" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeFleetMetadataResult describeFleetMetadata(DescribeFleetMetadataRequest describeFleetMetadataRequest);

    /**
     * <p>
     * Describes the identity provider configuration of the specified fleet.
     * </p>
     * 
     * @param describeIdentityProviderConfigurationRequest
     * @return Result of the DescribeIdentityProviderConfiguration operation returned by the service.
     * @throws UnauthorizedException
     *         You are not authorized to perform this action.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit.
     * @sample AmazonWorkLink.DescribeIdentityProviderConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/DescribeIdentityProviderConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeIdentityProviderConfigurationResult describeIdentityProviderConfiguration(
            DescribeIdentityProviderConfigurationRequest describeIdentityProviderConfigurationRequest);

    /**
     * <p>
     * Provides information about the certificate authority.
     * </p>
     * 
     * @param describeWebsiteCertificateAuthorityRequest
     * @return Result of the DescribeWebsiteCertificateAuthority operation returned by the service.
     * @throws UnauthorizedException
     *         You are not authorized to perform this action.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit.
     * @sample AmazonWorkLink.DescribeWebsiteCertificateAuthority
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/DescribeWebsiteCertificateAuthority"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeWebsiteCertificateAuthorityResult describeWebsiteCertificateAuthority(
            DescribeWebsiteCertificateAuthorityRequest describeWebsiteCertificateAuthorityRequest);

    /**
     * <p>
     * Disassociates a domain from Amazon WorkLink. End users lose the ability to access the domain with Amazon
     * WorkLink.
     * </p>
     * 
     * @param disassociateDomainRequest
     * @return Result of the DisassociateDomain operation returned by the service.
     * @throws UnauthorizedException
     *         You are not authorized to perform this action.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit.
     * @sample AmazonWorkLink.DisassociateDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/DisassociateDomain" target="_top">AWS
     *      API Documentation</a>
     */
    DisassociateDomainResult disassociateDomain(DisassociateDomainRequest disassociateDomainRequest);

    /**
     * <p>
     * Removes a certificate authority (CA).
     * </p>
     * 
     * @param disassociateWebsiteCertificateAuthorityRequest
     * @return Result of the DisassociateWebsiteCertificateAuthority operation returned by the service.
     * @throws UnauthorizedException
     *         You are not authorized to perform this action.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit.
     * @sample AmazonWorkLink.DisassociateWebsiteCertificateAuthority
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/DisassociateWebsiteCertificateAuthority"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateWebsiteCertificateAuthorityResult disassociateWebsiteCertificateAuthority(
            DisassociateWebsiteCertificateAuthorityRequest disassociateWebsiteCertificateAuthorityRequest);

    /**
     * <p>
     * Retrieves a list of devices registered with the specified fleet.
     * </p>
     * 
     * @param listDevicesRequest
     * @return Result of the ListDevices operation returned by the service.
     * @throws UnauthorizedException
     *         You are not authorized to perform this action.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit.
     * @sample AmazonWorkLink.ListDevices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/ListDevices" target="_top">AWS API
     *      Documentation</a>
     */
    ListDevicesResult listDevices(ListDevicesRequest listDevicesRequest);

    /**
     * <p>
     * Retrieves a list of domains associated to a specified fleet.
     * </p>
     * 
     * @param listDomainsRequest
     * @return Result of the ListDomains operation returned by the service.
     * @throws UnauthorizedException
     *         You are not authorized to perform this action.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit.
     * @sample AmazonWorkLink.ListDomains
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/ListDomains" target="_top">AWS API
     *      Documentation</a>
     */
    ListDomainsResult listDomains(ListDomainsRequest listDomainsRequest);

    /**
     * <p>
     * Retrieves a list of fleets for the current account and Region.
     * </p>
     * 
     * @param listFleetsRequest
     * @return Result of the ListFleets operation returned by the service.
     * @throws UnauthorizedException
     *         You are not authorized to perform this action.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit.
     * @sample AmazonWorkLink.ListFleets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/ListFleets" target="_top">AWS API
     *      Documentation</a>
     */
    ListFleetsResult listFleets(ListFleetsRequest listFleetsRequest);

    /**
     * <p>
     * Retrieves a list of certificate authorities added for the current account and Region.
     * </p>
     * 
     * @param listWebsiteCertificateAuthoritiesRequest
     * @return Result of the ListWebsiteCertificateAuthorities operation returned by the service.
     * @throws UnauthorizedException
     *         You are not authorized to perform this action.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit.
     * @sample AmazonWorkLink.ListWebsiteCertificateAuthorities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/ListWebsiteCertificateAuthorities"
     *      target="_top">AWS API Documentation</a>
     */
    ListWebsiteCertificateAuthoritiesResult listWebsiteCertificateAuthorities(ListWebsiteCertificateAuthoritiesRequest listWebsiteCertificateAuthoritiesRequest);

    /**
     * <p>
     * Moves a domain to ACTIVE status if it was in the INACTIVE status.
     * </p>
     * 
     * @param restoreDomainAccessRequest
     * @return Result of the RestoreDomainAccess operation returned by the service.
     * @throws UnauthorizedException
     *         You are not authorized to perform this action.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit.
     * @sample AmazonWorkLink.RestoreDomainAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/RestoreDomainAccess" target="_top">AWS
     *      API Documentation</a>
     */
    RestoreDomainAccessResult restoreDomainAccess(RestoreDomainAccessRequest restoreDomainAccessRequest);

    /**
     * <p>
     * Moves a domain to INACTIVE status if it was in the ACTIVE status.
     * </p>
     * 
     * @param revokeDomainAccessRequest
     * @return Result of the RevokeDomainAccess operation returned by the service.
     * @throws UnauthorizedException
     *         You are not authorized to perform this action.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit.
     * @sample AmazonWorkLink.RevokeDomainAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/RevokeDomainAccess" target="_top">AWS
     *      API Documentation</a>
     */
    RevokeDomainAccessResult revokeDomainAccess(RevokeDomainAccessRequest revokeDomainAccessRequest);

    /**
     * <p>
     * Signs the user out from all of their devices. The user can sign in again if they have valid credentials.
     * </p>
     * 
     * @param signOutUserRequest
     * @return Result of the SignOutUser operation returned by the service.
     * @throws UnauthorizedException
     *         You are not authorized to perform this action.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit.
     * @sample AmazonWorkLink.SignOutUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/SignOutUser" target="_top">AWS API
     *      Documentation</a>
     */
    SignOutUserResult signOutUser(SignOutUserRequest signOutUserRequest);

    /**
     * <p>
     * Updates the audit stream configuration for the fleet.
     * </p>
     * 
     * @param updateAuditStreamConfigurationRequest
     * @return Result of the UpdateAuditStreamConfiguration operation returned by the service.
     * @throws UnauthorizedException
     *         You are not authorized to perform this action.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit.
     * @sample AmazonWorkLink.UpdateAuditStreamConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/UpdateAuditStreamConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateAuditStreamConfigurationResult updateAuditStreamConfiguration(UpdateAuditStreamConfigurationRequest updateAuditStreamConfigurationRequest);

    /**
     * <p>
     * Updates the company network configuration for the fleet.
     * </p>
     * 
     * @param updateCompanyNetworkConfigurationRequest
     * @return Result of the UpdateCompanyNetworkConfiguration operation returned by the service.
     * @throws UnauthorizedException
     *         You are not authorized to perform this action.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit.
     * @sample AmazonWorkLink.UpdateCompanyNetworkConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/UpdateCompanyNetworkConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateCompanyNetworkConfigurationResult updateCompanyNetworkConfiguration(UpdateCompanyNetworkConfigurationRequest updateCompanyNetworkConfigurationRequest);

    /**
     * <p>
     * Updates the device policy configuration for the fleet.
     * </p>
     * 
     * @param updateDevicePolicyConfigurationRequest
     * @return Result of the UpdateDevicePolicyConfiguration operation returned by the service.
     * @throws UnauthorizedException
     *         You are not authorized to perform this action.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit.
     * @sample AmazonWorkLink.UpdateDevicePolicyConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/UpdateDevicePolicyConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateDevicePolicyConfigurationResult updateDevicePolicyConfiguration(UpdateDevicePolicyConfigurationRequest updateDevicePolicyConfigurationRequest);

    /**
     * <p>
     * Updates domain metadata, such as DisplayName.
     * </p>
     * 
     * @param updateDomainMetadataRequest
     * @return Result of the UpdateDomainMetadata operation returned by the service.
     * @throws UnauthorizedException
     *         You are not authorized to perform this action.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit.
     * @sample AmazonWorkLink.UpdateDomainMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/UpdateDomainMetadata" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateDomainMetadataResult updateDomainMetadata(UpdateDomainMetadataRequest updateDomainMetadataRequest);

    /**
     * <p>
     * Updates fleet metadata, such as DisplayName.
     * </p>
     * 
     * @param updateFleetMetadataRequest
     * @return Result of the UpdateFleetMetadata operation returned by the service.
     * @throws UnauthorizedException
     *         You are not authorized to perform this action.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit.
     * @sample AmazonWorkLink.UpdateFleetMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/UpdateFleetMetadata" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateFleetMetadataResult updateFleetMetadata(UpdateFleetMetadataRequest updateFleetMetadataRequest);

    /**
     * <p>
     * Updates the identity provider configuration for the fleet.
     * </p>
     * 
     * @param updateIdentityProviderConfigurationRequest
     * @return Result of the UpdateIdentityProviderConfiguration operation returned by the service.
     * @throws UnauthorizedException
     *         You are not authorized to perform this action.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit.
     * @sample AmazonWorkLink.UpdateIdentityProviderConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/UpdateIdentityProviderConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateIdentityProviderConfigurationResult updateIdentityProviderConfiguration(
            UpdateIdentityProviderConfigurationRequest updateIdentityProviderConfigurationRequest);

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
