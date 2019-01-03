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

import com.amazonaws.services.licensemanager.model.*;

/**
 * Interface for accessing AWS License Manager asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.licensemanager.AbstractAWSLicenseManagerAsync} instead.
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
public interface AWSLicenseManagerAsync extends AWSLicenseManager {

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
     * @return A Java Future containing the result of the CreateLicenseConfiguration operation returned by the service.
     * @sample AWSLicenseManagerAsync.CreateLicenseConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/CreateLicenseConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateLicenseConfigurationResult> createLicenseConfigurationAsync(
            CreateLicenseConfigurationRequest createLicenseConfigurationRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateLicenseConfiguration operation returned by the service.
     * @sample AWSLicenseManagerAsyncHandler.CreateLicenseConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/CreateLicenseConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateLicenseConfigurationResult> createLicenseConfigurationAsync(
            CreateLicenseConfigurationRequest createLicenseConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateLicenseConfigurationRequest, CreateLicenseConfigurationResult> asyncHandler);

    /**
     * <p>
     * Deletes an existing license configuration. This action fails if the configuration is in use.
     * </p>
     * 
     * @param deleteLicenseConfigurationRequest
     * @return A Java Future containing the result of the DeleteLicenseConfiguration operation returned by the service.
     * @sample AWSLicenseManagerAsync.DeleteLicenseConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/DeleteLicenseConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteLicenseConfigurationResult> deleteLicenseConfigurationAsync(
            DeleteLicenseConfigurationRequest deleteLicenseConfigurationRequest);

    /**
     * <p>
     * Deletes an existing license configuration. This action fails if the configuration is in use.
     * </p>
     * 
     * @param deleteLicenseConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteLicenseConfiguration operation returned by the service.
     * @sample AWSLicenseManagerAsyncHandler.DeleteLicenseConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/DeleteLicenseConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteLicenseConfigurationResult> deleteLicenseConfigurationAsync(
            DeleteLicenseConfigurationRequest deleteLicenseConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteLicenseConfigurationRequest, DeleteLicenseConfigurationResult> asyncHandler);

    /**
     * <p>
     * Returns a detailed description of a license configuration.
     * </p>
     * 
     * @param getLicenseConfigurationRequest
     * @return A Java Future containing the result of the GetLicenseConfiguration operation returned by the service.
     * @sample AWSLicenseManagerAsync.GetLicenseConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/GetLicenseConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetLicenseConfigurationResult> getLicenseConfigurationAsync(GetLicenseConfigurationRequest getLicenseConfigurationRequest);

    /**
     * <p>
     * Returns a detailed description of a license configuration.
     * </p>
     * 
     * @param getLicenseConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetLicenseConfiguration operation returned by the service.
     * @sample AWSLicenseManagerAsyncHandler.GetLicenseConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/GetLicenseConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetLicenseConfigurationResult> getLicenseConfigurationAsync(GetLicenseConfigurationRequest getLicenseConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<GetLicenseConfigurationRequest, GetLicenseConfigurationResult> asyncHandler);

    /**
     * <p>
     * Gets License Manager settings for a region. Exposes the configured S3 bucket, SNS topic, etc., for inspection.
     * </p>
     * 
     * @param getServiceSettingsRequest
     * @return A Java Future containing the result of the GetServiceSettings operation returned by the service.
     * @sample AWSLicenseManagerAsync.GetServiceSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/GetServiceSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetServiceSettingsResult> getServiceSettingsAsync(GetServiceSettingsRequest getServiceSettingsRequest);

    /**
     * <p>
     * Gets License Manager settings for a region. Exposes the configured S3 bucket, SNS topic, etc., for inspection.
     * </p>
     * 
     * @param getServiceSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetServiceSettings operation returned by the service.
     * @sample AWSLicenseManagerAsyncHandler.GetServiceSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/GetServiceSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetServiceSettingsResult> getServiceSettingsAsync(GetServiceSettingsRequest getServiceSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<GetServiceSettingsRequest, GetServiceSettingsResult> asyncHandler);

    /**
     * <p>
     * Lists the resource associations for a license configuration. Resource associations need not consume licenses from
     * a license configuration. For example, an AMI or a stopped instance may not consume a license (depending on the
     * license rules). Use this operation to find all resources associated with a license configuration.
     * </p>
     * 
     * @param listAssociationsForLicenseConfigurationRequest
     * @return A Java Future containing the result of the ListAssociationsForLicenseConfiguration operation returned by
     *         the service.
     * @sample AWSLicenseManagerAsync.ListAssociationsForLicenseConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListAssociationsForLicenseConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAssociationsForLicenseConfigurationResult> listAssociationsForLicenseConfigurationAsync(
            ListAssociationsForLicenseConfigurationRequest listAssociationsForLicenseConfigurationRequest);

    /**
     * <p>
     * Lists the resource associations for a license configuration. Resource associations need not consume licenses from
     * a license configuration. For example, an AMI or a stopped instance may not consume a license (depending on the
     * license rules). Use this operation to find all resources associated with a license configuration.
     * </p>
     * 
     * @param listAssociationsForLicenseConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAssociationsForLicenseConfiguration operation returned by
     *         the service.
     * @sample AWSLicenseManagerAsyncHandler.ListAssociationsForLicenseConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListAssociationsForLicenseConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAssociationsForLicenseConfigurationResult> listAssociationsForLicenseConfigurationAsync(
            ListAssociationsForLicenseConfigurationRequest listAssociationsForLicenseConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<ListAssociationsForLicenseConfigurationRequest, ListAssociationsForLicenseConfigurationResult> asyncHandler);

    /**
     * <p>
     * Lists license configuration objects for an account, each containing the name, description, license type, and
     * other license terms modeled from a license agreement.
     * </p>
     * 
     * @param listLicenseConfigurationsRequest
     * @return A Java Future containing the result of the ListLicenseConfigurations operation returned by the service.
     * @sample AWSLicenseManagerAsync.ListLicenseConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListLicenseConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListLicenseConfigurationsResult> listLicenseConfigurationsAsync(
            ListLicenseConfigurationsRequest listLicenseConfigurationsRequest);

    /**
     * <p>
     * Lists license configuration objects for an account, each containing the name, description, license type, and
     * other license terms modeled from a license agreement.
     * </p>
     * 
     * @param listLicenseConfigurationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListLicenseConfigurations operation returned by the service.
     * @sample AWSLicenseManagerAsyncHandler.ListLicenseConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListLicenseConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListLicenseConfigurationsResult> listLicenseConfigurationsAsync(
            ListLicenseConfigurationsRequest listLicenseConfigurationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListLicenseConfigurationsRequest, ListLicenseConfigurationsResult> asyncHandler);

    /**
     * <p>
     * Returns the license configuration for a resource.
     * </p>
     * 
     * @param listLicenseSpecificationsForResourceRequest
     * @return A Java Future containing the result of the ListLicenseSpecificationsForResource operation returned by the
     *         service.
     * @sample AWSLicenseManagerAsync.ListLicenseSpecificationsForResource
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListLicenseSpecificationsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListLicenseSpecificationsForResourceResult> listLicenseSpecificationsForResourceAsync(
            ListLicenseSpecificationsForResourceRequest listLicenseSpecificationsForResourceRequest);

    /**
     * <p>
     * Returns the license configuration for a resource.
     * </p>
     * 
     * @param listLicenseSpecificationsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListLicenseSpecificationsForResource operation returned by the
     *         service.
     * @sample AWSLicenseManagerAsyncHandler.ListLicenseSpecificationsForResource
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListLicenseSpecificationsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListLicenseSpecificationsForResourceResult> listLicenseSpecificationsForResourceAsync(
            ListLicenseSpecificationsForResourceRequest listLicenseSpecificationsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListLicenseSpecificationsForResourceRequest, ListLicenseSpecificationsForResourceResult> asyncHandler);

    /**
     * <p>
     * Returns a detailed list of resources.
     * </p>
     * 
     * @param listResourceInventoryRequest
     * @return A Java Future containing the result of the ListResourceInventory operation returned by the service.
     * @sample AWSLicenseManagerAsync.ListResourceInventory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListResourceInventory"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListResourceInventoryResult> listResourceInventoryAsync(ListResourceInventoryRequest listResourceInventoryRequest);

    /**
     * <p>
     * Returns a detailed list of resources.
     * </p>
     * 
     * @param listResourceInventoryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListResourceInventory operation returned by the service.
     * @sample AWSLicenseManagerAsyncHandler.ListResourceInventory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListResourceInventory"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListResourceInventoryResult> listResourceInventoryAsync(ListResourceInventoryRequest listResourceInventoryRequest,
            com.amazonaws.handlers.AsyncHandler<ListResourceInventoryRequest, ListResourceInventoryResult> asyncHandler);

    /**
     * <p>
     * Lists tags attached to a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSLicenseManagerAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists tags attached to a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSLicenseManagerAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Lists all license usage records for a license configuration, displaying license consumption details by resource
     * at a selected point in time. Use this action to audit the current license consumption for any license inventory
     * and configuration.
     * </p>
     * 
     * @param listUsageForLicenseConfigurationRequest
     * @return A Java Future containing the result of the ListUsageForLicenseConfiguration operation returned by the
     *         service.
     * @sample AWSLicenseManagerAsync.ListUsageForLicenseConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListUsageForLicenseConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListUsageForLicenseConfigurationResult> listUsageForLicenseConfigurationAsync(
            ListUsageForLicenseConfigurationRequest listUsageForLicenseConfigurationRequest);

    /**
     * <p>
     * Lists all license usage records for a license configuration, displaying license consumption details by resource
     * at a selected point in time. Use this action to audit the current license consumption for any license inventory
     * and configuration.
     * </p>
     * 
     * @param listUsageForLicenseConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListUsageForLicenseConfiguration operation returned by the
     *         service.
     * @sample AWSLicenseManagerAsyncHandler.ListUsageForLicenseConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListUsageForLicenseConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListUsageForLicenseConfigurationResult> listUsageForLicenseConfigurationAsync(
            ListUsageForLicenseConfigurationRequest listUsageForLicenseConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<ListUsageForLicenseConfigurationRequest, ListUsageForLicenseConfigurationResult> asyncHandler);

    /**
     * <p>
     * Attach one of more tags to any resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSLicenseManagerAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Attach one of more tags to any resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSLicenseManagerAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Remove tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSLicenseManagerAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Remove tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSLicenseManagerAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Modifies the attributes of an existing license configuration object. A license configuration is an abstraction of
     * a customer license agreement that can be consumed and enforced by License Manager. Components include
     * specifications for the license type (Instances, cores, sockets, VCPUs), tenancy (shared or Dedicated Host), host
     * affinity (how long a VM is associated with a host), the number of licenses purchased and used.
     * </p>
     * 
     * @param updateLicenseConfigurationRequest
     * @return A Java Future containing the result of the UpdateLicenseConfiguration operation returned by the service.
     * @sample AWSLicenseManagerAsync.UpdateLicenseConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/UpdateLicenseConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateLicenseConfigurationResult> updateLicenseConfigurationAsync(
            UpdateLicenseConfigurationRequest updateLicenseConfigurationRequest);

    /**
     * <p>
     * Modifies the attributes of an existing license configuration object. A license configuration is an abstraction of
     * a customer license agreement that can be consumed and enforced by License Manager. Components include
     * specifications for the license type (Instances, cores, sockets, VCPUs), tenancy (shared or Dedicated Host), host
     * affinity (how long a VM is associated with a host), the number of licenses purchased and used.
     * </p>
     * 
     * @param updateLicenseConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateLicenseConfiguration operation returned by the service.
     * @sample AWSLicenseManagerAsyncHandler.UpdateLicenseConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/UpdateLicenseConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateLicenseConfigurationResult> updateLicenseConfigurationAsync(
            UpdateLicenseConfigurationRequest updateLicenseConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateLicenseConfigurationRequest, UpdateLicenseConfigurationResult> asyncHandler);

    /**
     * <p>
     * Adds or removes license configurations for a specified AWS resource. This operation currently supports updating
     * the license specifications of AMIs, instances, and hosts. Launch templates and AWS CloudFormation templates are
     * not managed from this operation as those resources send the license configurations directly to a resource
     * creation operation, such as <code>RunInstances</code>.
     * </p>
     * 
     * @param updateLicenseSpecificationsForResourceRequest
     * @return A Java Future containing the result of the UpdateLicenseSpecificationsForResource operation returned by
     *         the service.
     * @sample AWSLicenseManagerAsync.UpdateLicenseSpecificationsForResource
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/UpdateLicenseSpecificationsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateLicenseSpecificationsForResourceResult> updateLicenseSpecificationsForResourceAsync(
            UpdateLicenseSpecificationsForResourceRequest updateLicenseSpecificationsForResourceRequest);

    /**
     * <p>
     * Adds or removes license configurations for a specified AWS resource. This operation currently supports updating
     * the license specifications of AMIs, instances, and hosts. Launch templates and AWS CloudFormation templates are
     * not managed from this operation as those resources send the license configurations directly to a resource
     * creation operation, such as <code>RunInstances</code>.
     * </p>
     * 
     * @param updateLicenseSpecificationsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateLicenseSpecificationsForResource operation returned by
     *         the service.
     * @sample AWSLicenseManagerAsyncHandler.UpdateLicenseSpecificationsForResource
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/UpdateLicenseSpecificationsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateLicenseSpecificationsForResourceResult> updateLicenseSpecificationsForResourceAsync(
            UpdateLicenseSpecificationsForResourceRequest updateLicenseSpecificationsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateLicenseSpecificationsForResourceRequest, UpdateLicenseSpecificationsForResourceResult> asyncHandler);

    /**
     * <p>
     * Updates License Manager service settings.
     * </p>
     * 
     * @param updateServiceSettingsRequest
     * @return A Java Future containing the result of the UpdateServiceSettings operation returned by the service.
     * @sample AWSLicenseManagerAsync.UpdateServiceSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/UpdateServiceSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateServiceSettingsResult> updateServiceSettingsAsync(UpdateServiceSettingsRequest updateServiceSettingsRequest);

    /**
     * <p>
     * Updates License Manager service settings.
     * </p>
     * 
     * @param updateServiceSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateServiceSettings operation returned by the service.
     * @sample AWSLicenseManagerAsyncHandler.UpdateServiceSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/UpdateServiceSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateServiceSettingsResult> updateServiceSettingsAsync(UpdateServiceSettingsRequest updateServiceSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateServiceSettingsRequest, UpdateServiceSettingsResult> asyncHandler);

}
