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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.lakeformation.model.*;

/**
 * Interface for accessing AWS Lake Formation.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.lakeformation.AbstractAWSLakeFormation} instead.
 * </p>
 * <p>
 * <fullname>AWS Lake Formation</fullname>
 * <p>
 * Defines the public endpoint for the AWS Lake Formation service.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSLakeFormation {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "lakeformation";

    /**
     * <p>
     * Attaches one or more tags to an existing resource.
     * </p>
     * 
     * @param addLFTagsToResourceRequest
     * @return Result of the AddLFTagsToResource operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws AccessDeniedException
     *         Access to a resource was denied.
     * @throws ConcurrentModificationException
     *         Two processes are trying to modify a resource simultaneously.
     * @sample AWSLakeFormation.AddLFTagsToResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/AddLFTagsToResource"
     *      target="_top">AWS API Documentation</a>
     */
    AddLFTagsToResourceResult addLFTagsToResource(AddLFTagsToResourceRequest addLFTagsToResourceRequest);

    /**
     * <p>
     * Batch operation to grant permissions to the principal.
     * </p>
     * 
     * @param batchGrantPermissionsRequest
     * @return Result of the BatchGrantPermissions operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSLakeFormation.BatchGrantPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/BatchGrantPermissions"
     *      target="_top">AWS API Documentation</a>
     */
    BatchGrantPermissionsResult batchGrantPermissions(BatchGrantPermissionsRequest batchGrantPermissionsRequest);

    /**
     * <p>
     * Batch operation to revoke permissions from the principal.
     * </p>
     * 
     * @param batchRevokePermissionsRequest
     * @return Result of the BatchRevokePermissions operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSLakeFormation.BatchRevokePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/BatchRevokePermissions"
     *      target="_top">AWS API Documentation</a>
     */
    BatchRevokePermissionsResult batchRevokePermissions(BatchRevokePermissionsRequest batchRevokePermissionsRequest);

    /**
     * <p>
     * Creates a tag with the specified name and values.
     * </p>
     * 
     * @param createLFTagRequest
     * @return Result of the CreateLFTag operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws ResourceNumberLimitExceededException
     *         A resource numerical limit was exceeded.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws AccessDeniedException
     *         Access to a resource was denied.
     * @sample AWSLakeFormation.CreateLFTag
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/CreateLFTag" target="_top">AWS API
     *      Documentation</a>
     */
    CreateLFTagResult createLFTag(CreateLFTagRequest createLFTagRequest);

    /**
     * <p>
     * Deletes the specified tag key name. If the attribute key does not exist or the tag does not exist, then the
     * operation will not do anything. If the attribute key exists, then the operation checks if any resources are
     * tagged with this attribute key, if yes, the API throws a 400 Exception with the message "Delete not allowed" as
     * the tag key is still attached with resources. You can consider untagging resources with this tag key.
     * </p>
     * 
     * @param deleteLFTagRequest
     * @return Result of the DeleteLFTag operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws AccessDeniedException
     *         Access to a resource was denied.
     * @sample AWSLakeFormation.DeleteLFTag
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/DeleteLFTag" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteLFTagResult deleteLFTag(DeleteLFTagRequest deleteLFTagRequest);

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
     * @return Result of the DeregisterResource operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @sample AWSLakeFormation.DeregisterResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/DeregisterResource"
     *      target="_top">AWS API Documentation</a>
     */
    DeregisterResourceResult deregisterResource(DeregisterResourceRequest deregisterResourceRequest);

    /**
     * <p>
     * Retrieves the current data access role for the given resource registered in AWS Lake Formation.
     * </p>
     * 
     * @param describeResourceRequest
     * @return Result of the DescribeResource operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @sample AWSLakeFormation.DescribeResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/DescribeResource" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeResourceResult describeResource(DescribeResourceRequest describeResourceRequest);

    /**
     * <p>
     * Retrieves the list of the data lake administrators of a Lake Formation-managed data lake.
     * </p>
     * 
     * @param getDataLakeSettingsRequest
     * @return Result of the GetDataLakeSettings operation returned by the service.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @sample AWSLakeFormation.GetDataLakeSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/GetDataLakeSettings"
     *      target="_top">AWS API Documentation</a>
     */
    GetDataLakeSettingsResult getDataLakeSettings(GetDataLakeSettingsRequest getDataLakeSettingsRequest);

    /**
     * <p>
     * Returns the Lake Formation permissions for a specified table or database resource located at a path in Amazon S3.
     * <code>GetEffectivePermissionsForPath</code> will not return databases and tables if the catalog is encrypted.
     * </p>
     * 
     * @param getEffectivePermissionsForPathRequest
     * @return Result of the GetEffectivePermissionsForPath operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @sample AWSLakeFormation.GetEffectivePermissionsForPath
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/GetEffectivePermissionsForPath"
     *      target="_top">AWS API Documentation</a>
     */
    GetEffectivePermissionsForPathResult getEffectivePermissionsForPath(GetEffectivePermissionsForPathRequest getEffectivePermissionsForPathRequest);

    /**
     * <p>
     * Returns a tag definition.
     * </p>
     * 
     * @param getLFTagRequest
     * @return Result of the GetLFTag operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws AccessDeniedException
     *         Access to a resource was denied.
     * @sample AWSLakeFormation.GetLFTag
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/GetLFTag" target="_top">AWS API
     *      Documentation</a>
     */
    GetLFTagResult getLFTag(GetLFTagRequest getLFTagRequest);

    /**
     * <p>
     * Returns the tags applied to a resource.
     * </p>
     * 
     * @param getResourceLFTagsRequest
     * @return Result of the GetResourceLFTags operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws GlueEncryptionException
     *         An encryption operation failed.
     * @throws AccessDeniedException
     *         Access to a resource was denied.
     * @sample AWSLakeFormation.GetResourceLFTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/GetResourceLFTags"
     *      target="_top">AWS API Documentation</a>
     */
    GetResourceLFTagsResult getResourceLFTags(GetResourceLFTagsRequest getResourceLFTagsRequest);

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
     * @return Result of the GrantPermissions operation returned by the service.
     * @throws ConcurrentModificationException
     *         Two processes are trying to modify a resource simultaneously.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @sample AWSLakeFormation.GrantPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/GrantPermissions" target="_top">AWS
     *      API Documentation</a>
     */
    GrantPermissionsResult grantPermissions(GrantPermissionsRequest grantPermissionsRequest);

    /**
     * <p>
     * Lists tags that the requester has permission to view.
     * </p>
     * 
     * @param listLFTagsRequest
     * @return Result of the ListLFTags operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSLakeFormation.ListLFTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/ListLFTags" target="_top">AWS API
     *      Documentation</a>
     */
    ListLFTagsResult listLFTags(ListLFTagsRequest listLFTagsRequest);

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
     * @return Result of the ListPermissions operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @sample AWSLakeFormation.ListPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/ListPermissions" target="_top">AWS
     *      API Documentation</a>
     */
    ListPermissionsResult listPermissions(ListPermissionsRequest listPermissionsRequest);

    /**
     * <p>
     * Lists the resources registered to be managed by the Data Catalog.
     * </p>
     * 
     * @param listResourcesRequest
     * @return Result of the ListResources operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSLakeFormation.ListResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/ListResources" target="_top">AWS
     *      API Documentation</a>
     */
    ListResourcesResult listResources(ListResourcesRequest listResourcesRequest);

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
     * @return Result of the PutDataLakeSettings operation returned by the service.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @sample AWSLakeFormation.PutDataLakeSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/PutDataLakeSettings"
     *      target="_top">AWS API Documentation</a>
     */
    PutDataLakeSettingsResult putDataLakeSettings(PutDataLakeSettingsRequest putDataLakeSettingsRequest);

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
     * @return Result of the RegisterResource operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws AlreadyExistsException
     *         A resource to be created or added already exists.
     * @sample AWSLakeFormation.RegisterResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/RegisterResource" target="_top">AWS
     *      API Documentation</a>
     */
    RegisterResourceResult registerResource(RegisterResourceRequest registerResourceRequest);

    /**
     * <p>
     * Removes a tag from the resource. Only database, table, or tableWithColumns resource are allowed. To tag columns,
     * use the column inclusion list in <code>tableWithColumns</code> to specify column input.
     * </p>
     * 
     * @param removeLFTagsFromResourceRequest
     * @return Result of the RemoveLFTagsFromResource operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws GlueEncryptionException
     *         An encryption operation failed.
     * @throws AccessDeniedException
     *         Access to a resource was denied.
     * @throws ConcurrentModificationException
     *         Two processes are trying to modify a resource simultaneously.
     * @sample AWSLakeFormation.RemoveLFTagsFromResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/RemoveLFTagsFromResource"
     *      target="_top">AWS API Documentation</a>
     */
    RemoveLFTagsFromResourceResult removeLFTagsFromResource(RemoveLFTagsFromResourceRequest removeLFTagsFromResourceRequest);

    /**
     * <p>
     * Revokes permissions to the principal to access metadata in the Data Catalog and data organized in underlying data
     * storage such as Amazon S3.
     * </p>
     * 
     * @param revokePermissionsRequest
     * @return Result of the RevokePermissions operation returned by the service.
     * @throws ConcurrentModificationException
     *         Two processes are trying to modify a resource simultaneously.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @sample AWSLakeFormation.RevokePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/RevokePermissions"
     *      target="_top">AWS API Documentation</a>
     */
    RevokePermissionsResult revokePermissions(RevokePermissionsRequest revokePermissionsRequest);

    /**
     * <p>
     * This operation allows a search on <code>DATABASE</code> resources by <code>TagCondition</code>. This operation is
     * used by admins who want to grant user permissions on certain <code>TagConditions</code>. Before making a grant,
     * the admin can use <code>SearchDatabasesByTags</code> to find all resources where the given
     * <code>TagConditions</code> are valid to verify whether the returned resources can be shared.
     * </p>
     * 
     * @param searchDatabasesByLFTagsRequest
     * @return Result of the SearchDatabasesByLFTags operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws GlueEncryptionException
     *         An encryption operation failed.
     * @throws AccessDeniedException
     *         Access to a resource was denied.
     * @sample AWSLakeFormation.SearchDatabasesByLFTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/SearchDatabasesByLFTags"
     *      target="_top">AWS API Documentation</a>
     */
    SearchDatabasesByLFTagsResult searchDatabasesByLFTags(SearchDatabasesByLFTagsRequest searchDatabasesByLFTagsRequest);

    /**
     * <p>
     * This operation allows a search on <code>TABLE</code> resources by <code>LFTag</code>s. This will be used by
     * admins who want to grant user permissions on certain LFTags. Before making a grant, the admin can use
     * <code>SearchTablesByLFTags</code> to find all resources where the given <code>LFTag</code>s are valid to verify
     * whether the returned resources can be shared.
     * </p>
     * 
     * @param searchTablesByLFTagsRequest
     * @return Result of the SearchTablesByLFTags operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws GlueEncryptionException
     *         An encryption operation failed.
     * @throws AccessDeniedException
     *         Access to a resource was denied.
     * @sample AWSLakeFormation.SearchTablesByLFTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/SearchTablesByLFTags"
     *      target="_top">AWS API Documentation</a>
     */
    SearchTablesByLFTagsResult searchTablesByLFTags(SearchTablesByLFTagsRequest searchTablesByLFTagsRequest);

    /**
     * <p>
     * Updates the list of possible values for the specified tag key. If the tag does not exist, the operation throws an
     * EntityNotFoundException. The values in the delete key values will be deleted from list of possible values. If any
     * value in the delete key values is attached to a resource, then API errors out with a 400 Exception -
     * "Update not allowed". Untag the attribute before deleting the tag key's value.
     * </p>
     * 
     * @param updateLFTagRequest
     * @return Result of the UpdateLFTag operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws ConcurrentModificationException
     *         Two processes are trying to modify a resource simultaneously.
     * @throws AccessDeniedException
     *         Access to a resource was denied.
     * @sample AWSLakeFormation.UpdateLFTag
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/UpdateLFTag" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateLFTagResult updateLFTag(UpdateLFTagRequest updateLFTagRequest);

    /**
     * <p>
     * Updates the data access role used for vending access to the given (registered) resource in AWS Lake Formation.
     * </p>
     * 
     * @param updateResourceRequest
     * @return Result of the UpdateResource operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @sample AWSLakeFormation.UpdateResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/UpdateResource" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateResourceResult updateResource(UpdateResourceRequest updateResourceRequest);

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
