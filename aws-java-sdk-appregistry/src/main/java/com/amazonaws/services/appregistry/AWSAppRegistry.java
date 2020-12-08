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
package com.amazonaws.services.appregistry;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.appregistry.model.*;

/**
 * Interface for accessing AppRegistry.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.appregistry.AbstractAWSAppRegistry} instead.
 * </p>
 * <p>
 * <p>
 * AWS Service Catalog AppRegistry enables organizations to understand the application context of their AWS resources.
 * AppRegistry provides a repository of your applications, their resources, and the application metadata that you use
 * within your enterprise.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSAppRegistry {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "servicecatalog-appregistry";

    /**
     * <p>
     * Associates an attribute group with an application to augment the application's metadata with the group's
     * attributes. This feature enables applications to be described with user-defined details that are
     * machine-readable, such as third-party integrations.
     * </p>
     * 
     * @param associateAttributeGroupRequest
     * @return Result of the AssociateAttributeGroup operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws InternalServerException
     *         The service is experiencing internal problems.
     * @throws ServiceQuotaExceededException
     *         The maximum number of resources per account has been reached.
     * @sample AWSAppRegistry.AssociateAttributeGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry-2020-06-24/AssociateAttributeGroup"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateAttributeGroupResult associateAttributeGroup(AssociateAttributeGroupRequest associateAttributeGroupRequest);

    /**
     * <p>
     * Associates a resource with an application. Both the resource and the application can be specified either by ID or
     * name.
     * </p>
     * 
     * @param associateResourceRequest
     * @return Result of the AssociateResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InternalServerException
     *         The service is experiencing internal problems.
     * @throws ServiceQuotaExceededException
     *         The maximum number of resources per account has been reached.
     * @throws ConflictException
     *         There was a conflict when processing the request (for example, a resource with the given name already
     *         exists within the account).
     * @sample AWSAppRegistry.AssociateResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry-2020-06-24/AssociateResource"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateResourceResult associateResource(AssociateResourceRequest associateResourceRequest);

    /**
     * <p>
     * Creates a new application that is the top-level node in a hierarchy of related cloud resource abstractions.
     * </p>
     * 
     * @param createApplicationRequest
     * @return Result of the CreateApplication operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         The maximum number of resources per account has been reached.
     * @throws ConflictException
     *         There was a conflict when processing the request (for example, a resource with the given name already
     *         exists within the account).
     * @throws InternalServerException
     *         The service is experiencing internal problems.
     * @sample AWSAppRegistry.CreateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry-2020-06-24/CreateApplication"
     *      target="_top">AWS API Documentation</a>
     */
    CreateApplicationResult createApplication(CreateApplicationRequest createApplicationRequest);

    /**
     * <p>
     * Creates a new attribute group as a container for user-defined attributes. This feature enables users to have full
     * control over their cloud application's metadata in a rich machine-readable format to facilitate integration with
     * automated workflows and third-party tools.
     * </p>
     * 
     * @param createAttributeGroupRequest
     * @return Result of the CreateAttributeGroup operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         The maximum number of resources per account has been reached.
     * @throws ConflictException
     *         There was a conflict when processing the request (for example, a resource with the given name already
     *         exists within the account).
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws InternalServerException
     *         The service is experiencing internal problems.
     * @sample AWSAppRegistry.CreateAttributeGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry-2020-06-24/CreateAttributeGroup"
     *      target="_top">AWS API Documentation</a>
     */
    CreateAttributeGroupResult createAttributeGroup(CreateAttributeGroupRequest createAttributeGroupRequest);

    /**
     * <p>
     * Deletes an application that is specified either by its application ID or name. All associated attribute groups
     * and resources must be disassociated from it before deleting an application.
     * </p>
     * 
     * @param deleteApplicationRequest
     * @return Result of the DeleteApplication operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws InternalServerException
     *         The service is experiencing internal problems.
     * @sample AWSAppRegistry.DeleteApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry-2020-06-24/DeleteApplication"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteApplicationResult deleteApplication(DeleteApplicationRequest deleteApplicationRequest);

    /**
     * <p>
     * Deletes an attribute group, specified either by its attribute group ID or name.
     * </p>
     * 
     * @param deleteAttributeGroupRequest
     * @return Result of the DeleteAttributeGroup operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws InternalServerException
     *         The service is experiencing internal problems.
     * @sample AWSAppRegistry.DeleteAttributeGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry-2020-06-24/DeleteAttributeGroup"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteAttributeGroupResult deleteAttributeGroup(DeleteAttributeGroupRequest deleteAttributeGroupRequest);

    /**
     * <p>
     * Disassociates an attribute group from an application to remove the extra attributes contained in the attribute
     * group from the application's metadata. This operation reverts <code>AssociateAttributeGroup</code>.
     * </p>
     * 
     * @param disassociateAttributeGroupRequest
     * @return Result of the DisassociateAttributeGroup operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws InternalServerException
     *         The service is experiencing internal problems.
     * @sample AWSAppRegistry.DisassociateAttributeGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry-2020-06-24/DisassociateAttributeGroup"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateAttributeGroupResult disassociateAttributeGroup(DisassociateAttributeGroupRequest disassociateAttributeGroupRequest);

    /**
     * <p>
     * Disassociates a resource from application. Both the resource and the application can be specified either by ID or
     * name.
     * </p>
     * 
     * @param disassociateResourceRequest
     * @return Result of the DisassociateResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InternalServerException
     *         The service is experiencing internal problems.
     * @sample AWSAppRegistry.DisassociateResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry-2020-06-24/DisassociateResource"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateResourceResult disassociateResource(DisassociateResourceRequest disassociateResourceRequest);

    /**
     * <p>
     * Retrieves metadata information about one of your applications. The application can be specified either by its
     * unique ID or by its name (which is unique within one account in one region at a given point in time). Specify by
     * ID in automated workflows if you want to make sure that the exact same application is returned or a
     * <code>ResourceNotFoundException</code> is thrown, avoiding the ABA addressing problem.
     * </p>
     * 
     * @param getApplicationRequest
     * @return Result of the GetApplication operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws InternalServerException
     *         The service is experiencing internal problems.
     * @sample AWSAppRegistry.GetApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry-2020-06-24/GetApplication"
     *      target="_top">AWS API Documentation</a>
     */
    GetApplicationResult getApplication(GetApplicationRequest getApplicationRequest);

    /**
     * <p>
     * Retrieves an attribute group, either by its name or its ID. The attribute group can be specified either by its
     * unique ID or by its name.
     * </p>
     * 
     * @param getAttributeGroupRequest
     * @return Result of the GetAttributeGroup operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws InternalServerException
     *         The service is experiencing internal problems.
     * @sample AWSAppRegistry.GetAttributeGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry-2020-06-24/GetAttributeGroup"
     *      target="_top">AWS API Documentation</a>
     */
    GetAttributeGroupResult getAttributeGroup(GetAttributeGroupRequest getAttributeGroupRequest);

    /**
     * <p>
     * Retrieves a list of all of your applications. Results are paginated.
     * </p>
     * 
     * @param listApplicationsRequest
     * @return Result of the ListApplications operation returned by the service.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws InternalServerException
     *         The service is experiencing internal problems.
     * @sample AWSAppRegistry.ListApplications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry-2020-06-24/ListApplications"
     *      target="_top">AWS API Documentation</a>
     */
    ListApplicationsResult listApplications(ListApplicationsRequest listApplicationsRequest);

    /**
     * <p>
     * Lists all attribute groups that are associated with specified application. Results are paginated.
     * </p>
     * 
     * @param listAssociatedAttributeGroupsRequest
     * @return Result of the ListAssociatedAttributeGroups operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws InternalServerException
     *         The service is experiencing internal problems.
     * @sample AWSAppRegistry.ListAssociatedAttributeGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry-2020-06-24/ListAssociatedAttributeGroups"
     *      target="_top">AWS API Documentation</a>
     */
    ListAssociatedAttributeGroupsResult listAssociatedAttributeGroups(ListAssociatedAttributeGroupsRequest listAssociatedAttributeGroupsRequest);

    /**
     * <p>
     * Lists all resources that are associated with specified application. Results are paginated.
     * </p>
     * 
     * @param listAssociatedResourcesRequest
     * @return Result of the ListAssociatedResources operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws InternalServerException
     *         The service is experiencing internal problems.
     * @sample AWSAppRegistry.ListAssociatedResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry-2020-06-24/ListAssociatedResources"
     *      target="_top">AWS API Documentation</a>
     */
    ListAssociatedResourcesResult listAssociatedResources(ListAssociatedResourcesRequest listAssociatedResourcesRequest);

    /**
     * <p>
     * Lists all attribute groups which you have access to. Results are paginated.
     * </p>
     * 
     * @param listAttributeGroupsRequest
     * @return Result of the ListAttributeGroups operation returned by the service.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws InternalServerException
     *         The service is experiencing internal problems.
     * @sample AWSAppRegistry.ListAttributeGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry-2020-06-24/ListAttributeGroups"
     *      target="_top">AWS API Documentation</a>
     */
    ListAttributeGroupsResult listAttributeGroups(ListAttributeGroupsRequest listAttributeGroupsRequest);

    /**
     * <p>
     * Lists all of the tags on the resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InternalServerException
     *         The service is experiencing internal problems.
     * @sample AWSAppRegistry.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry-2020-06-24/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Assigns one or more tags (key-value pairs) to the specified resource.
     * </p>
     * <p>
     * Each tag consists of a key and an optional value. If a tag with the same key is already associated with the
     * resource, this action updates its value.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InternalServerException
     *         The service is experiencing internal problems.
     * @sample AWSAppRegistry.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry-2020-06-24/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InternalServerException
     *         The service is experiencing internal problems.
     * @sample AWSAppRegistry.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry-2020-06-24/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates an existing application with new attributes.
     * </p>
     * 
     * @param updateApplicationRequest
     * @return Result of the UpdateApplication operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ConflictException
     *         There was a conflict when processing the request (for example, a resource with the given name already
     *         exists within the account).
     * @throws InternalServerException
     *         The service is experiencing internal problems.
     * @sample AWSAppRegistry.UpdateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry-2020-06-24/UpdateApplication"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateApplicationResult updateApplication(UpdateApplicationRequest updateApplicationRequest);

    /**
     * <p>
     * Updates an existing attribute group with new details.
     * </p>
     * 
     * @param updateAttributeGroupRequest
     * @return Result of the UpdateAttributeGroup operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws ConflictException
     *         There was a conflict when processing the request (for example, a resource with the given name already
     *         exists within the account).
     * @throws InternalServerException
     *         The service is experiencing internal problems.
     * @sample AWSAppRegistry.UpdateAttributeGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry-2020-06-24/UpdateAttributeGroup"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateAttributeGroupResult updateAttributeGroup(UpdateAttributeGroupRequest updateAttributeGroupRequest);

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
