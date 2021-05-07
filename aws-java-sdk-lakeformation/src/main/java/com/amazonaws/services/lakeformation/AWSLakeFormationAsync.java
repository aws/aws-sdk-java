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
package com.amazonaws.services.lakeformation;

import javax.annotation.Generated;

import com.amazonaws.services.lakeformation.model.*;

/**
 * Interface for accessing AWS Lake Formation asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.lakeformation.AbstractAWSLakeFormationAsync} instead.
 * </p>
 * <p>
 * <fullname>AWS Lake Formation</fullname>
 * <p>
 * Defines the public endpoint for the AWS Lake Formation service.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSLakeFormationAsync extends AWSLakeFormation {

    /**
     * <p>
     * Attaches one or more tags to an existing resource.
     * </p>
     * 
     * @param addLFTagsToResourceRequest
     * @return A Java Future containing the result of the AddLFTagsToResource operation returned by the service.
     * @sample AWSLakeFormationAsync.AddLFTagsToResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/AddLFTagsToResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AddLFTagsToResourceResult> addLFTagsToResourceAsync(AddLFTagsToResourceRequest addLFTagsToResourceRequest);

    /**
     * <p>
     * Attaches one or more tags to an existing resource.
     * </p>
     * 
     * @param addLFTagsToResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AddLFTagsToResource operation returned by the service.
     * @sample AWSLakeFormationAsyncHandler.AddLFTagsToResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/AddLFTagsToResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AddLFTagsToResourceResult> addLFTagsToResourceAsync(AddLFTagsToResourceRequest addLFTagsToResourceRequest,
            com.amazonaws.handlers.AsyncHandler<AddLFTagsToResourceRequest, AddLFTagsToResourceResult> asyncHandler);

    /**
     * <p>
     * Batch operation to grant permissions to the principal.
     * </p>
     * 
     * @param batchGrantPermissionsRequest
     * @return A Java Future containing the result of the BatchGrantPermissions operation returned by the service.
     * @sample AWSLakeFormationAsync.BatchGrantPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/BatchGrantPermissions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchGrantPermissionsResult> batchGrantPermissionsAsync(BatchGrantPermissionsRequest batchGrantPermissionsRequest);

    /**
     * <p>
     * Batch operation to grant permissions to the principal.
     * </p>
     * 
     * @param batchGrantPermissionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchGrantPermissions operation returned by the service.
     * @sample AWSLakeFormationAsyncHandler.BatchGrantPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/BatchGrantPermissions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchGrantPermissionsResult> batchGrantPermissionsAsync(BatchGrantPermissionsRequest batchGrantPermissionsRequest,
            com.amazonaws.handlers.AsyncHandler<BatchGrantPermissionsRequest, BatchGrantPermissionsResult> asyncHandler);

    /**
     * <p>
     * Batch operation to revoke permissions from the principal.
     * </p>
     * 
     * @param batchRevokePermissionsRequest
     * @return A Java Future containing the result of the BatchRevokePermissions operation returned by the service.
     * @sample AWSLakeFormationAsync.BatchRevokePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/BatchRevokePermissions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchRevokePermissionsResult> batchRevokePermissionsAsync(BatchRevokePermissionsRequest batchRevokePermissionsRequest);

    /**
     * <p>
     * Batch operation to revoke permissions from the principal.
     * </p>
     * 
     * @param batchRevokePermissionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchRevokePermissions operation returned by the service.
     * @sample AWSLakeFormationAsyncHandler.BatchRevokePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/BatchRevokePermissions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchRevokePermissionsResult> batchRevokePermissionsAsync(BatchRevokePermissionsRequest batchRevokePermissionsRequest,
            com.amazonaws.handlers.AsyncHandler<BatchRevokePermissionsRequest, BatchRevokePermissionsResult> asyncHandler);

    /**
     * <p>
     * Creates a tag with the specified name and values.
     * </p>
     * 
     * @param createLFTagRequest
     * @return A Java Future containing the result of the CreateLFTag operation returned by the service.
     * @sample AWSLakeFormationAsync.CreateLFTag
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/CreateLFTag" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateLFTagResult> createLFTagAsync(CreateLFTagRequest createLFTagRequest);

    /**
     * <p>
     * Creates a tag with the specified name and values.
     * </p>
     * 
     * @param createLFTagRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateLFTag operation returned by the service.
     * @sample AWSLakeFormationAsyncHandler.CreateLFTag
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/CreateLFTag" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateLFTagResult> createLFTagAsync(CreateLFTagRequest createLFTagRequest,
            com.amazonaws.handlers.AsyncHandler<CreateLFTagRequest, CreateLFTagResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified tag key name. If the attribute key does not exist or the tag does not exist, then the
     * operation will not do anything. If the attribute key exists, then the operation checks if any resources are
     * tagged with this attribute key, if yes, the API throws a 400 Exception with the message "Delete not allowed" as
     * the tag key is still attached with resources. You can consider untagging resources with this tag key.
     * </p>
     * 
     * @param deleteLFTagRequest
     * @return A Java Future containing the result of the DeleteLFTag operation returned by the service.
     * @sample AWSLakeFormationAsync.DeleteLFTag
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/DeleteLFTag" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteLFTagResult> deleteLFTagAsync(DeleteLFTagRequest deleteLFTagRequest);

    /**
     * <p>
     * Deletes the specified tag key name. If the attribute key does not exist or the tag does not exist, then the
     * operation will not do anything. If the attribute key exists, then the operation checks if any resources are
     * tagged with this attribute key, if yes, the API throws a 400 Exception with the message "Delete not allowed" as
     * the tag key is still attached with resources. You can consider untagging resources with this tag key.
     * </p>
     * 
     * @param deleteLFTagRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteLFTag operation returned by the service.
     * @sample AWSLakeFormationAsyncHandler.DeleteLFTag
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/DeleteLFTag" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteLFTagResult> deleteLFTagAsync(DeleteLFTagRequest deleteLFTagRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteLFTagRequest, DeleteLFTagResult> asyncHandler);

    /**
     * <p>
     * Deregisters the resource as managed by the Data Catalog.
     * </p>
     * <p>
     * When you deregister a path, Lake Formation removes the path from the inline policy attached to your
     * service-linked role.
     * </p>
     * 
     * @param deregisterResourceRequest
     * @return A Java Future containing the result of the DeregisterResource operation returned by the service.
     * @sample AWSLakeFormationAsync.DeregisterResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/DeregisterResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeregisterResourceResult> deregisterResourceAsync(DeregisterResourceRequest deregisterResourceRequest);

    /**
     * <p>
     * Deregisters the resource as managed by the Data Catalog.
     * </p>
     * <p>
     * When you deregister a path, Lake Formation removes the path from the inline policy attached to your
     * service-linked role.
     * </p>
     * 
     * @param deregisterResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeregisterResource operation returned by the service.
     * @sample AWSLakeFormationAsyncHandler.DeregisterResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/DeregisterResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeregisterResourceResult> deregisterResourceAsync(DeregisterResourceRequest deregisterResourceRequest,
            com.amazonaws.handlers.AsyncHandler<DeregisterResourceRequest, DeregisterResourceResult> asyncHandler);

    /**
     * <p>
     * Retrieves the current data access role for the given resource registered in AWS Lake Formation.
     * </p>
     * 
     * @param describeResourceRequest
     * @return A Java Future containing the result of the DescribeResource operation returned by the service.
     * @sample AWSLakeFormationAsync.DescribeResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/DescribeResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeResourceResult> describeResourceAsync(DescribeResourceRequest describeResourceRequest);

    /**
     * <p>
     * Retrieves the current data access role for the given resource registered in AWS Lake Formation.
     * </p>
     * 
     * @param describeResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeResource operation returned by the service.
     * @sample AWSLakeFormationAsyncHandler.DescribeResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/DescribeResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeResourceResult> describeResourceAsync(DescribeResourceRequest describeResourceRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeResourceRequest, DescribeResourceResult> asyncHandler);

    /**
     * <p>
     * Retrieves the list of the data lake administrators of a Lake Formation-managed data lake.
     * </p>
     * 
     * @param getDataLakeSettingsRequest
     * @return A Java Future containing the result of the GetDataLakeSettings operation returned by the service.
     * @sample AWSLakeFormationAsync.GetDataLakeSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/GetDataLakeSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDataLakeSettingsResult> getDataLakeSettingsAsync(GetDataLakeSettingsRequest getDataLakeSettingsRequest);

    /**
     * <p>
     * Retrieves the list of the data lake administrators of a Lake Formation-managed data lake.
     * </p>
     * 
     * @param getDataLakeSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDataLakeSettings operation returned by the service.
     * @sample AWSLakeFormationAsyncHandler.GetDataLakeSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/GetDataLakeSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDataLakeSettingsResult> getDataLakeSettingsAsync(GetDataLakeSettingsRequest getDataLakeSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<GetDataLakeSettingsRequest, GetDataLakeSettingsResult> asyncHandler);

    /**
     * <p>
     * Returns the Lake Formation permissions for a specified table or database resource located at a path in Amazon S3.
     * <code>GetEffectivePermissionsForPath</code> will not return databases and tables if the catalog is encrypted.
     * </p>
     * 
     * @param getEffectivePermissionsForPathRequest
     * @return A Java Future containing the result of the GetEffectivePermissionsForPath operation returned by the
     *         service.
     * @sample AWSLakeFormationAsync.GetEffectivePermissionsForPath
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/GetEffectivePermissionsForPath"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetEffectivePermissionsForPathResult> getEffectivePermissionsForPathAsync(
            GetEffectivePermissionsForPathRequest getEffectivePermissionsForPathRequest);

    /**
     * <p>
     * Returns the Lake Formation permissions for a specified table or database resource located at a path in Amazon S3.
     * <code>GetEffectivePermissionsForPath</code> will not return databases and tables if the catalog is encrypted.
     * </p>
     * 
     * @param getEffectivePermissionsForPathRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetEffectivePermissionsForPath operation returned by the
     *         service.
     * @sample AWSLakeFormationAsyncHandler.GetEffectivePermissionsForPath
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/GetEffectivePermissionsForPath"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetEffectivePermissionsForPathResult> getEffectivePermissionsForPathAsync(
            GetEffectivePermissionsForPathRequest getEffectivePermissionsForPathRequest,
            com.amazonaws.handlers.AsyncHandler<GetEffectivePermissionsForPathRequest, GetEffectivePermissionsForPathResult> asyncHandler);

    /**
     * <p>
     * Returns a tag definition.
     * </p>
     * 
     * @param getLFTagRequest
     * @return A Java Future containing the result of the GetLFTag operation returned by the service.
     * @sample AWSLakeFormationAsync.GetLFTag
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/GetLFTag" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetLFTagResult> getLFTagAsync(GetLFTagRequest getLFTagRequest);

    /**
     * <p>
     * Returns a tag definition.
     * </p>
     * 
     * @param getLFTagRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetLFTag operation returned by the service.
     * @sample AWSLakeFormationAsyncHandler.GetLFTag
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/GetLFTag" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetLFTagResult> getLFTagAsync(GetLFTagRequest getLFTagRequest,
            com.amazonaws.handlers.AsyncHandler<GetLFTagRequest, GetLFTagResult> asyncHandler);

    /**
     * <p>
     * Returns the tags applied to a resource.
     * </p>
     * 
     * @param getResourceLFTagsRequest
     * @return A Java Future containing the result of the GetResourceLFTags operation returned by the service.
     * @sample AWSLakeFormationAsync.GetResourceLFTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/GetResourceLFTags"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetResourceLFTagsResult> getResourceLFTagsAsync(GetResourceLFTagsRequest getResourceLFTagsRequest);

    /**
     * <p>
     * Returns the tags applied to a resource.
     * </p>
     * 
     * @param getResourceLFTagsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetResourceLFTags operation returned by the service.
     * @sample AWSLakeFormationAsyncHandler.GetResourceLFTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/GetResourceLFTags"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetResourceLFTagsResult> getResourceLFTagsAsync(GetResourceLFTagsRequest getResourceLFTagsRequest,
            com.amazonaws.handlers.AsyncHandler<GetResourceLFTagsRequest, GetResourceLFTagsResult> asyncHandler);

    /**
     * <p>
     * Grants permissions to the principal to access metadata in the Data Catalog and data organized in underlying data
     * storage such as Amazon S3.
     * </p>
     * <p>
     * For information about permissions, see <a
     * href="https://docs-aws.amazon.com/lake-formation/latest/dg/security-data-access.html">Security and Access Control
     * to Metadata and Data</a>.
     * </p>
     * 
     * @param grantPermissionsRequest
     * @return A Java Future containing the result of the GrantPermissions operation returned by the service.
     * @sample AWSLakeFormationAsync.GrantPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/GrantPermissions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GrantPermissionsResult> grantPermissionsAsync(GrantPermissionsRequest grantPermissionsRequest);

    /**
     * <p>
     * Grants permissions to the principal to access metadata in the Data Catalog and data organized in underlying data
     * storage such as Amazon S3.
     * </p>
     * <p>
     * For information about permissions, see <a
     * href="https://docs-aws.amazon.com/lake-formation/latest/dg/security-data-access.html">Security and Access Control
     * to Metadata and Data</a>.
     * </p>
     * 
     * @param grantPermissionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GrantPermissions operation returned by the service.
     * @sample AWSLakeFormationAsyncHandler.GrantPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/GrantPermissions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GrantPermissionsResult> grantPermissionsAsync(GrantPermissionsRequest grantPermissionsRequest,
            com.amazonaws.handlers.AsyncHandler<GrantPermissionsRequest, GrantPermissionsResult> asyncHandler);

    /**
     * <p>
     * Lists tags that the requester has permission to view.
     * </p>
     * 
     * @param listLFTagsRequest
     * @return A Java Future containing the result of the ListLFTags operation returned by the service.
     * @sample AWSLakeFormationAsync.ListLFTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/ListLFTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListLFTagsResult> listLFTagsAsync(ListLFTagsRequest listLFTagsRequest);

    /**
     * <p>
     * Lists tags that the requester has permission to view.
     * </p>
     * 
     * @param listLFTagsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListLFTags operation returned by the service.
     * @sample AWSLakeFormationAsyncHandler.ListLFTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/ListLFTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListLFTagsResult> listLFTagsAsync(ListLFTagsRequest listLFTagsRequest,
            com.amazonaws.handlers.AsyncHandler<ListLFTagsRequest, ListLFTagsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of the principal permissions on the resource, filtered by the permissions of the caller. For
     * example, if you are granted an ALTER permission, you are able to see only the principal permissions for ALTER.
     * </p>
     * <p>
     * This operation returns only those permissions that have been explicitly granted.
     * </p>
     * <p>
     * For information about permissions, see <a
     * href="https://docs-aws.amazon.com/lake-formation/latest/dg/security-data-access.html">Security and Access Control
     * to Metadata and Data</a>.
     * </p>
     * 
     * @param listPermissionsRequest
     * @return A Java Future containing the result of the ListPermissions operation returned by the service.
     * @sample AWSLakeFormationAsync.ListPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/ListPermissions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListPermissionsResult> listPermissionsAsync(ListPermissionsRequest listPermissionsRequest);

    /**
     * <p>
     * Returns a list of the principal permissions on the resource, filtered by the permissions of the caller. For
     * example, if you are granted an ALTER permission, you are able to see only the principal permissions for ALTER.
     * </p>
     * <p>
     * This operation returns only those permissions that have been explicitly granted.
     * </p>
     * <p>
     * For information about permissions, see <a
     * href="https://docs-aws.amazon.com/lake-formation/latest/dg/security-data-access.html">Security and Access Control
     * to Metadata and Data</a>.
     * </p>
     * 
     * @param listPermissionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPermissions operation returned by the service.
     * @sample AWSLakeFormationAsyncHandler.ListPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/ListPermissions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListPermissionsResult> listPermissionsAsync(ListPermissionsRequest listPermissionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListPermissionsRequest, ListPermissionsResult> asyncHandler);

    /**
     * <p>
     * Lists the resources registered to be managed by the Data Catalog.
     * </p>
     * 
     * @param listResourcesRequest
     * @return A Java Future containing the result of the ListResources operation returned by the service.
     * @sample AWSLakeFormationAsync.ListResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/ListResources" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListResourcesResult> listResourcesAsync(ListResourcesRequest listResourcesRequest);

    /**
     * <p>
     * Lists the resources registered to be managed by the Data Catalog.
     * </p>
     * 
     * @param listResourcesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListResources operation returned by the service.
     * @sample AWSLakeFormationAsyncHandler.ListResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/ListResources" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListResourcesResult> listResourcesAsync(ListResourcesRequest listResourcesRequest,
            com.amazonaws.handlers.AsyncHandler<ListResourcesRequest, ListResourcesResult> asyncHandler);

    /**
     * <p>
     * Sets the list of data lake administrators who have admin privileges on all resources managed by Lake Formation.
     * For more information on admin privileges, see <a
     * href="https://docs.aws.amazon.com/lake-formation/latest/dg/lake-formation-permissions.html">Granting Lake
     * Formation Permissions</a>.
     * </p>
     * <p>
     * This API replaces the current list of data lake admins with the new list being passed. To add an admin, fetch the
     * current list and add the new admin to that list and pass that list in this API.
     * </p>
     * 
     * @param putDataLakeSettingsRequest
     * @return A Java Future containing the result of the PutDataLakeSettings operation returned by the service.
     * @sample AWSLakeFormationAsync.PutDataLakeSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/PutDataLakeSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutDataLakeSettingsResult> putDataLakeSettingsAsync(PutDataLakeSettingsRequest putDataLakeSettingsRequest);

    /**
     * <p>
     * Sets the list of data lake administrators who have admin privileges on all resources managed by Lake Formation.
     * For more information on admin privileges, see <a
     * href="https://docs.aws.amazon.com/lake-formation/latest/dg/lake-formation-permissions.html">Granting Lake
     * Formation Permissions</a>.
     * </p>
     * <p>
     * This API replaces the current list of data lake admins with the new list being passed. To add an admin, fetch the
     * current list and add the new admin to that list and pass that list in this API.
     * </p>
     * 
     * @param putDataLakeSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutDataLakeSettings operation returned by the service.
     * @sample AWSLakeFormationAsyncHandler.PutDataLakeSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/PutDataLakeSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutDataLakeSettingsResult> putDataLakeSettingsAsync(PutDataLakeSettingsRequest putDataLakeSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<PutDataLakeSettingsRequest, PutDataLakeSettingsResult> asyncHandler);

    /**
     * <p>
     * Registers the resource as managed by the Data Catalog.
     * </p>
     * <p>
     * To add or update data, Lake Formation needs read/write access to the chosen Amazon S3 path. Choose a role that
     * you know has permission to do this, or choose the AWSServiceRoleForLakeFormationDataAccess service-linked role.
     * When you register the first Amazon S3 path, the service-linked role and a new inline policy are created on your
     * behalf. Lake Formation adds the first path to the inline policy and attaches it to the service-linked role. When
     * you register subsequent paths, Lake Formation adds the path to the existing policy.
     * </p>
     * <p>
     * The following request registers a new location and gives AWS Lake Formation permission to use the service-linked
     * role to access that location.
     * </p>
     * <p>
     * <code>ResourceArn = arn:aws:s3:::my-bucket UseServiceLinkedRole = true</code>
     * </p>
     * <p>
     * If <code>UseServiceLinkedRole</code> is not set to true, you must provide or set the <code>RoleArn</code>:
     * </p>
     * <p>
     * <code>arn:aws:iam::12345:role/my-data-access-role</code>
     * </p>
     * 
     * @param registerResourceRequest
     * @return A Java Future containing the result of the RegisterResource operation returned by the service.
     * @sample AWSLakeFormationAsync.RegisterResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/RegisterResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RegisterResourceResult> registerResourceAsync(RegisterResourceRequest registerResourceRequest);

    /**
     * <p>
     * Registers the resource as managed by the Data Catalog.
     * </p>
     * <p>
     * To add or update data, Lake Formation needs read/write access to the chosen Amazon S3 path. Choose a role that
     * you know has permission to do this, or choose the AWSServiceRoleForLakeFormationDataAccess service-linked role.
     * When you register the first Amazon S3 path, the service-linked role and a new inline policy are created on your
     * behalf. Lake Formation adds the first path to the inline policy and attaches it to the service-linked role. When
     * you register subsequent paths, Lake Formation adds the path to the existing policy.
     * </p>
     * <p>
     * The following request registers a new location and gives AWS Lake Formation permission to use the service-linked
     * role to access that location.
     * </p>
     * <p>
     * <code>ResourceArn = arn:aws:s3:::my-bucket UseServiceLinkedRole = true</code>
     * </p>
     * <p>
     * If <code>UseServiceLinkedRole</code> is not set to true, you must provide or set the <code>RoleArn</code>:
     * </p>
     * <p>
     * <code>arn:aws:iam::12345:role/my-data-access-role</code>
     * </p>
     * 
     * @param registerResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RegisterResource operation returned by the service.
     * @sample AWSLakeFormationAsyncHandler.RegisterResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/RegisterResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RegisterResourceResult> registerResourceAsync(RegisterResourceRequest registerResourceRequest,
            com.amazonaws.handlers.AsyncHandler<RegisterResourceRequest, RegisterResourceResult> asyncHandler);

    /**
     * <p>
     * Removes a tag from the resource. Only database, table, or tableWithColumns resource are allowed. To tag columns,
     * use the column inclusion list in <code>tableWithColumns</code> to specify column input.
     * </p>
     * 
     * @param removeLFTagsFromResourceRequest
     * @return A Java Future containing the result of the RemoveLFTagsFromResource operation returned by the service.
     * @sample AWSLakeFormationAsync.RemoveLFTagsFromResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/RemoveLFTagsFromResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RemoveLFTagsFromResourceResult> removeLFTagsFromResourceAsync(RemoveLFTagsFromResourceRequest removeLFTagsFromResourceRequest);

    /**
     * <p>
     * Removes a tag from the resource. Only database, table, or tableWithColumns resource are allowed. To tag columns,
     * use the column inclusion list in <code>tableWithColumns</code> to specify column input.
     * </p>
     * 
     * @param removeLFTagsFromResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RemoveLFTagsFromResource operation returned by the service.
     * @sample AWSLakeFormationAsyncHandler.RemoveLFTagsFromResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/RemoveLFTagsFromResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RemoveLFTagsFromResourceResult> removeLFTagsFromResourceAsync(RemoveLFTagsFromResourceRequest removeLFTagsFromResourceRequest,
            com.amazonaws.handlers.AsyncHandler<RemoveLFTagsFromResourceRequest, RemoveLFTagsFromResourceResult> asyncHandler);

    /**
     * <p>
     * Revokes permissions to the principal to access metadata in the Data Catalog and data organized in underlying data
     * storage such as Amazon S3.
     * </p>
     * 
     * @param revokePermissionsRequest
     * @return A Java Future containing the result of the RevokePermissions operation returned by the service.
     * @sample AWSLakeFormationAsync.RevokePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/RevokePermissions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RevokePermissionsResult> revokePermissionsAsync(RevokePermissionsRequest revokePermissionsRequest);

    /**
     * <p>
     * Revokes permissions to the principal to access metadata in the Data Catalog and data organized in underlying data
     * storage such as Amazon S3.
     * </p>
     * 
     * @param revokePermissionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RevokePermissions operation returned by the service.
     * @sample AWSLakeFormationAsyncHandler.RevokePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/RevokePermissions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RevokePermissionsResult> revokePermissionsAsync(RevokePermissionsRequest revokePermissionsRequest,
            com.amazonaws.handlers.AsyncHandler<RevokePermissionsRequest, RevokePermissionsResult> asyncHandler);

    /**
     * <p>
     * This operation allows a search on <code>DATABASE</code> resources by <code>TagCondition</code>. This operation is
     * used by admins who want to grant user permissions on certain <code>TagConditions</code>. Before making a grant,
     * the admin can use <code>SearchDatabasesByTags</code> to find all resources where the given
     * <code>TagConditions</code> are valid to verify whether the returned resources can be shared.
     * </p>
     * 
     * @param searchDatabasesByLFTagsRequest
     * @return A Java Future containing the result of the SearchDatabasesByLFTags operation returned by the service.
     * @sample AWSLakeFormationAsync.SearchDatabasesByLFTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/SearchDatabasesByLFTags"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SearchDatabasesByLFTagsResult> searchDatabasesByLFTagsAsync(SearchDatabasesByLFTagsRequest searchDatabasesByLFTagsRequest);

    /**
     * <p>
     * This operation allows a search on <code>DATABASE</code> resources by <code>TagCondition</code>. This operation is
     * used by admins who want to grant user permissions on certain <code>TagConditions</code>. Before making a grant,
     * the admin can use <code>SearchDatabasesByTags</code> to find all resources where the given
     * <code>TagConditions</code> are valid to verify whether the returned resources can be shared.
     * </p>
     * 
     * @param searchDatabasesByLFTagsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SearchDatabasesByLFTags operation returned by the service.
     * @sample AWSLakeFormationAsyncHandler.SearchDatabasesByLFTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/SearchDatabasesByLFTags"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SearchDatabasesByLFTagsResult> searchDatabasesByLFTagsAsync(SearchDatabasesByLFTagsRequest searchDatabasesByLFTagsRequest,
            com.amazonaws.handlers.AsyncHandler<SearchDatabasesByLFTagsRequest, SearchDatabasesByLFTagsResult> asyncHandler);

    /**
     * <p>
     * This operation allows a search on <code>TABLE</code> resources by <code>LFTag</code>s. This will be used by
     * admins who want to grant user permissions on certain LFTags. Before making a grant, the admin can use
     * <code>SearchTablesByLFTags</code> to find all resources where the given <code>LFTag</code>s are valid to verify
     * whether the returned resources can be shared.
     * </p>
     * 
     * @param searchTablesByLFTagsRequest
     * @return A Java Future containing the result of the SearchTablesByLFTags operation returned by the service.
     * @sample AWSLakeFormationAsync.SearchTablesByLFTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/SearchTablesByLFTags"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SearchTablesByLFTagsResult> searchTablesByLFTagsAsync(SearchTablesByLFTagsRequest searchTablesByLFTagsRequest);

    /**
     * <p>
     * This operation allows a search on <code>TABLE</code> resources by <code>LFTag</code>s. This will be used by
     * admins who want to grant user permissions on certain LFTags. Before making a grant, the admin can use
     * <code>SearchTablesByLFTags</code> to find all resources where the given <code>LFTag</code>s are valid to verify
     * whether the returned resources can be shared.
     * </p>
     * 
     * @param searchTablesByLFTagsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SearchTablesByLFTags operation returned by the service.
     * @sample AWSLakeFormationAsyncHandler.SearchTablesByLFTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/SearchTablesByLFTags"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SearchTablesByLFTagsResult> searchTablesByLFTagsAsync(SearchTablesByLFTagsRequest searchTablesByLFTagsRequest,
            com.amazonaws.handlers.AsyncHandler<SearchTablesByLFTagsRequest, SearchTablesByLFTagsResult> asyncHandler);

    /**
     * <p>
     * Updates the list of possible values for the specified tag key. If the tag does not exist, the operation throws an
     * EntityNotFoundException. The values in the delete key values will be deleted from list of possible values. If any
     * value in the delete key values is attached to a resource, then API errors out with a 400 Exception -
     * "Update not allowed". Untag the attribute before deleting the tag key's value.
     * </p>
     * 
     * @param updateLFTagRequest
     * @return A Java Future containing the result of the UpdateLFTag operation returned by the service.
     * @sample AWSLakeFormationAsync.UpdateLFTag
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/UpdateLFTag" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateLFTagResult> updateLFTagAsync(UpdateLFTagRequest updateLFTagRequest);

    /**
     * <p>
     * Updates the list of possible values for the specified tag key. If the tag does not exist, the operation throws an
     * EntityNotFoundException. The values in the delete key values will be deleted from list of possible values. If any
     * value in the delete key values is attached to a resource, then API errors out with a 400 Exception -
     * "Update not allowed". Untag the attribute before deleting the tag key's value.
     * </p>
     * 
     * @param updateLFTagRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateLFTag operation returned by the service.
     * @sample AWSLakeFormationAsyncHandler.UpdateLFTag
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/UpdateLFTag" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateLFTagResult> updateLFTagAsync(UpdateLFTagRequest updateLFTagRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateLFTagRequest, UpdateLFTagResult> asyncHandler);

    /**
     * <p>
     * Updates the data access role used for vending access to the given (registered) resource in AWS Lake Formation.
     * </p>
     * 
     * @param updateResourceRequest
     * @return A Java Future containing the result of the UpdateResource operation returned by the service.
     * @sample AWSLakeFormationAsync.UpdateResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/UpdateResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateResourceResult> updateResourceAsync(UpdateResourceRequest updateResourceRequest);

    /**
     * <p>
     * Updates the data access role used for vending access to the given (registered) resource in AWS Lake Formation.
     * </p>
     * 
     * @param updateResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateResource operation returned by the service.
     * @sample AWSLakeFormationAsyncHandler.UpdateResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/UpdateResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateResourceResult> updateResourceAsync(UpdateResourceRequest updateResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateResourceRequest, UpdateResourceResult> asyncHandler);

}
