/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.licensemanager;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.licensemanager.model.*;

/**
 * Interface for accessing AWS License Manager.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.licensemanager.AbstractAWSLicenseManager} instead.
 * </p>
 * <p>
 * <fullname> AWS License Manager </fullname>
 * <p>
 * AWS License Manager makes it easier to manage licenses from software vendors across multiple AWS accounts and
 * on-premises servers.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSLicenseManager {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "license-manager";

    /**
     * <p>
     * Creates a license configuration.
     * </p>
     * <p>
     * A license configuration is an abstraction of a customer license agreement that can be consumed and enforced by
     * License Manager. Components include specifications for the license type (licensing by instance, socket, CPU, or
     * vCPU), allowed tenancy (shared tenancy, Dedicated Instance, Dedicated Host, or all of these), host affinity (how
     * long a VM must be associated with a host), and the number of licenses purchased and used.
     * </p>
     * 
     * @param createLicenseConfigurationRequest
     * @return Result of the CreateLicenseConfiguration operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws ResourceLimitExceededException
     *         Your resource limits have been exceeded.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @sample AWSLicenseManager.CreateLicenseConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/CreateLicenseConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    CreateLicenseConfigurationResult createLicenseConfiguration(CreateLicenseConfigurationRequest createLicenseConfigurationRequest);

    /**
     * <p>
     * Deletes the specified license configuration.
     * </p>
     * <p>
     * You cannot delete a license configuration that is in use.
     * </p>
     * 
     * @param deleteLicenseConfigurationRequest
     * @return Result of the DeleteLicenseConfiguration operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @sample AWSLicenseManager.DeleteLicenseConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/DeleteLicenseConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteLicenseConfigurationResult deleteLicenseConfiguration(DeleteLicenseConfigurationRequest deleteLicenseConfigurationRequest);

    /**
     * <p>
     * Gets detailed information about the specified license configuration.
     * </p>
     * 
     * @param getLicenseConfigurationRequest
     * @return Result of the GetLicenseConfiguration operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @sample AWSLicenseManager.GetLicenseConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/GetLicenseConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    GetLicenseConfigurationResult getLicenseConfiguration(GetLicenseConfigurationRequest getLicenseConfigurationRequest);

    /**
     * <p>
     * Gets the License Manager settings for the current Region.
     * </p>
     * 
     * @param getServiceSettingsRequest
     * @return Result of the GetServiceSettings operation returned by the service.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @sample AWSLicenseManager.GetServiceSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/GetServiceSettings"
     *      target="_top">AWS API Documentation</a>
     */
    GetServiceSettingsResult getServiceSettings(GetServiceSettingsRequest getServiceSettingsRequest);

    /**
     * <p>
     * Lists the resource associations for the specified license configuration.
     * </p>
     * <p>
     * Resource associations need not consume licenses from a license configuration. For example, an AMI or a stopped
     * instance might not consume a license (depending on the license rules).
     * </p>
     * 
     * @param listAssociationsForLicenseConfigurationRequest
     * @return Result of the ListAssociationsForLicenseConfiguration operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws FilterLimitExceededException
     *         The request uses too many filters or too many filter values.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @sample AWSLicenseManager.ListAssociationsForLicenseConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListAssociationsForLicenseConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    ListAssociationsForLicenseConfigurationResult listAssociationsForLicenseConfiguration(
            ListAssociationsForLicenseConfigurationRequest listAssociationsForLicenseConfigurationRequest);

    /**
     * <p>
     * Lists the license configuration operations that failed.
     * </p>
     * 
     * @param listFailuresForLicenseConfigurationOperationsRequest
     * @return Result of the ListFailuresForLicenseConfigurationOperations operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @sample AWSLicenseManager.ListFailuresForLicenseConfigurationOperations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListFailuresForLicenseConfigurationOperations"
     *      target="_top">AWS API Documentation</a>
     */
    ListFailuresForLicenseConfigurationOperationsResult listFailuresForLicenseConfigurationOperations(
            ListFailuresForLicenseConfigurationOperationsRequest listFailuresForLicenseConfigurationOperationsRequest);

    /**
     * <p>
     * Lists the license configurations for your account.
     * </p>
     * 
     * @param listLicenseConfigurationsRequest
     * @return Result of the ListLicenseConfigurations operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws FilterLimitExceededException
     *         The request uses too many filters or too many filter values.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @sample AWSLicenseManager.ListLicenseConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListLicenseConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    ListLicenseConfigurationsResult listLicenseConfigurations(ListLicenseConfigurationsRequest listLicenseConfigurationsRequest);

    /**
     * <p>
     * Describes the license configurations for the specified resource.
     * </p>
     * 
     * @param listLicenseSpecificationsForResourceRequest
     * @return Result of the ListLicenseSpecificationsForResource operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @sample AWSLicenseManager.ListLicenseSpecificationsForResource
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListLicenseSpecificationsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListLicenseSpecificationsForResourceResult listLicenseSpecificationsForResource(
            ListLicenseSpecificationsForResourceRequest listLicenseSpecificationsForResourceRequest);

    /**
     * <p>
     * Lists resources managed using Systems Manager inventory.
     * </p>
     * 
     * @param listResourceInventoryRequest
     * @return Result of the ListResourceInventory operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws FilterLimitExceededException
     *         The request uses too many filters or too many filter values.
     * @throws FailedDependencyException
     *         A dependency required to run the API is missing.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @sample AWSLicenseManager.ListResourceInventory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListResourceInventory"
     *      target="_top">AWS API Documentation</a>
     */
    ListResourceInventoryResult listResourceInventory(ListResourceInventoryRequest listResourceInventoryRequest);

    /**
     * <p>
     * Lists the tags for the specified license configuration.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @sample AWSLicenseManager.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists all license usage records for a license configuration, displaying license consumption details by resource
     * at a selected point in time. Use this action to audit the current license consumption for any license inventory
     * and configuration.
     * </p>
     * 
     * @param listUsageForLicenseConfigurationRequest
     * @return Result of the ListUsageForLicenseConfiguration operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws FilterLimitExceededException
     *         The request uses too many filters or too many filter values.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @sample AWSLicenseManager.ListUsageForLicenseConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListUsageForLicenseConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    ListUsageForLicenseConfigurationResult listUsageForLicenseConfiguration(ListUsageForLicenseConfigurationRequest listUsageForLicenseConfigurationRequest);

    /**
     * <p>
     * Adds the specified tags to the specified license configuration.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @sample AWSLicenseManager.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes the specified tags from the specified license configuration.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @sample AWSLicenseManager.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Modifies the attributes of an existing license configuration.
     * </p>
     * <p>
     * A license configuration is an abstraction of a customer license agreement that can be consumed and enforced by
     * License Manager. Components include specifications for the license type (licensing by instance, socket, CPU, or
     * vCPU), allowed tenancy (shared tenancy, Dedicated Instance, Dedicated Host, or all of these), host affinity (how
     * long a VM must be associated with a host), and the number of licenses purchased and used.
     * </p>
     * 
     * @param updateLicenseConfigurationRequest
     * @return Result of the UpdateLicenseConfiguration operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @sample AWSLicenseManager.UpdateLicenseConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/UpdateLicenseConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateLicenseConfigurationResult updateLicenseConfiguration(UpdateLicenseConfigurationRequest updateLicenseConfigurationRequest);

    /**
     * <p>
     * Adds or removes the specified license configurations for the specified AWS resource.
     * </p>
     * <p>
     * You can update the license specifications of AMIs, instances, and hosts. You cannot update the license
     * specifications for launch templates and AWS CloudFormation templates, as they send license configurations to the
     * operation that creates the resource.
     * </p>
     * 
     * @param updateLicenseSpecificationsForResourceRequest
     * @return Result of the UpdateLicenseSpecificationsForResource operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws InvalidResourceStateException
     *         License Manager cannot allocate a license to a resource because of its state. </p>
     *         <p>
     *         For example, you cannot allocate a license to an instance in the process of shutting down.
     * @throws LicenseUsageException
     *         You do not have enough licenses available to support a new resource launch.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @sample AWSLicenseManager.UpdateLicenseSpecificationsForResource
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/UpdateLicenseSpecificationsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateLicenseSpecificationsForResourceResult updateLicenseSpecificationsForResource(
            UpdateLicenseSpecificationsForResourceRequest updateLicenseSpecificationsForResourceRequest);

    /**
     * <p>
     * Updates License Manager settings for the current Region.
     * </p>
     * 
     * @param updateServiceSettingsRequest
     * @return Result of the UpdateServiceSettings operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @sample AWSLicenseManager.UpdateServiceSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/UpdateServiceSettings"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateServiceSettingsResult updateServiceSettings(UpdateServiceSettingsRequest updateServiceSettingsRequest);

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
