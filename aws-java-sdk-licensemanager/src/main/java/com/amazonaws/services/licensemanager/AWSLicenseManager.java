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
 * <i>This is the AWS License Manager API Reference.</i> It provides descriptions, syntax, and usage examples for each
 * of the actions and data types for License Manager. The topic for each action shows the Query API request parameters
 * and the XML response. You can also view the XML request elements in the WSDL.
 * </p>
 * <p>
 * Alternatively, you can use one of the AWS SDKs to access an API that's tailored to the programming language or
 * platform that you're using. For more information, see <a href="http://aws.amazon.com/tools/#SDKs">AWS SDKs</a>.
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
     * Creates a new license configuration object. A license configuration is an abstraction of a customer license
     * agreement that can be consumed and enforced by License Manager. Components include specifications for the license
     * type (licensing by instance, socket, CPU, or VCPU), tenancy (shared tenancy, Amazon EC2 Dedicated Instance,
     * Amazon EC2 Dedicated Host, or any of these), host affinity (how long a VM must be associated with a host), the
     * number of licenses purchased and used.
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
     * Deletes an existing license configuration. This action fails if the configuration is in use.
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
     * Returns a detailed description of a license configuration.
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
     * Gets License Manager settings for a region. Exposes the configured S3 bucket, SNS topic, etc., for inspection.
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
     * Lists the resource associations for a license configuration. Resource associations need not consume licenses from
     * a license configuration. For example, an AMI or a stopped instance may not consume a license (depending on the
     * license rules). Use this operation to find all resources associated with a license configuration.
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
     * Lists license configuration objects for an account, each containing the name, description, license type, and
     * other license terms modeled from a license agreement.
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
     * Returns the license configuration for a resource.
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
     * Returns a detailed list of resources.
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
     * Lists tags attached to a resource.
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
     * Attach one of more tags to any resource.
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
     * Remove tags from a resource.
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
     * Modifies the attributes of an existing license configuration object. A license configuration is an abstraction of
     * a customer license agreement that can be consumed and enforced by License Manager. Components include
     * specifications for the license type (Instances, cores, sockets, VCPUs), tenancy (shared or Dedicated Host), host
     * affinity (how long a VM is associated with a host), the number of licenses purchased and used.
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
     * Adds or removes license configurations for a specified AWS resource. This operation currently supports updating
     * the license specifications of AMIs, instances, and hosts. Launch templates and AWS CloudFormation templates are
     * not managed from this operation as those resources send the license configurations directly to a resource
     * creation operation, such as <code>RunInstances</code>.
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
     * Updates License Manager service settings.
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
