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

import com.amazonaws.services.appregistry.model.*;

/**
 * Interface for accessing AppRegistry asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.appregistry.AbstractAWSAppRegistryAsync} instead.
 * </p>
 * <p>
 * <p>
 * AWS Service Catalog AppRegistry enables organizations to understand the application context of their AWS resources.
 * AppRegistry provides a repository of your applications, their resources, and the application metadata that you use
 * within your enterprise.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSAppRegistryAsync extends AWSAppRegistry {

    /**
     * <p>
     * Associates an attribute group with an application to augment the application's metadata with the group's
     * attributes. This way applications can be described with user-defined details which are machine-readable (e.g. for
     * third-party integrations).
     * </p>
     * 
     * @param associateAttributeGroupRequest
     * @return A Java Future containing the result of the AssociateAttributeGroup operation returned by the service.
     * @sample AWSAppRegistryAsync.AssociateAttributeGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry/AssociateAttributeGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AssociateAttributeGroupResult> associateAttributeGroupAsync(AssociateAttributeGroupRequest associateAttributeGroupRequest);

    /**
     * <p>
     * Associates an attribute group with an application to augment the application's metadata with the group's
     * attributes. This way applications can be described with user-defined details which are machine-readable (e.g. for
     * third-party integrations).
     * </p>
     * 
     * @param associateAttributeGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateAttributeGroup operation returned by the service.
     * @sample AWSAppRegistryAsyncHandler.AssociateAttributeGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry/AssociateAttributeGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AssociateAttributeGroupResult> associateAttributeGroupAsync(AssociateAttributeGroupRequest associateAttributeGroupRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateAttributeGroupRequest, AssociateAttributeGroupResult> asyncHandler);

    /**
     * <p>
     * Associates a resource with an application. Both the resource and the application can be specified either by ID or
     * name.
     * </p>
     * 
     * @param associateResourceRequest
     * @return A Java Future containing the result of the AssociateResource operation returned by the service.
     * @sample AWSAppRegistryAsync.AssociateResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry/AssociateResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AssociateResourceResult> associateResourceAsync(AssociateResourceRequest associateResourceRequest);

    /**
     * <p>
     * Associates a resource with an application. Both the resource and the application can be specified either by ID or
     * name.
     * </p>
     * 
     * @param associateResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateResource operation returned by the service.
     * @sample AWSAppRegistryAsyncHandler.AssociateResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry/AssociateResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AssociateResourceResult> associateResourceAsync(AssociateResourceRequest associateResourceRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateResourceRequest, AssociateResourceResult> asyncHandler);

    /**
     * <p>
     * Creates a new application that is the top-level node in a hierarchy of related cloud resource abstractions.
     * </p>
     * 
     * @param createApplicationRequest
     * @return A Java Future containing the result of the CreateApplication operation returned by the service.
     * @sample AWSAppRegistryAsync.CreateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry/CreateApplication" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateApplicationResult> createApplicationAsync(CreateApplicationRequest createApplicationRequest);

    /**
     * <p>
     * Creates a new application that is the top-level node in a hierarchy of related cloud resource abstractions.
     * </p>
     * 
     * @param createApplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateApplication operation returned by the service.
     * @sample AWSAppRegistryAsyncHandler.CreateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry/CreateApplication" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateApplicationResult> createApplicationAsync(CreateApplicationRequest createApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateApplicationRequest, CreateApplicationResult> asyncHandler);

    /**
     * <p>
     * Creates a new attribute group as a container for user-defined attributes. This approach enables users to have
     * full control over their cloud application's metadata in a rich machine-readable format to facilitate integration
     * with automated workflows and third-party tools.
     * </p>
     * 
     * @param createAttributeGroupRequest
     * @return A Java Future containing the result of the CreateAttributeGroup operation returned by the service.
     * @sample AWSAppRegistryAsync.CreateAttributeGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry/CreateAttributeGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateAttributeGroupResult> createAttributeGroupAsync(CreateAttributeGroupRequest createAttributeGroupRequest);

    /**
     * <p>
     * Creates a new attribute group as a container for user-defined attributes. This approach enables users to have
     * full control over their cloud application's metadata in a rich machine-readable format to facilitate integration
     * with automated workflows and third-party tools.
     * </p>
     * 
     * @param createAttributeGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAttributeGroup operation returned by the service.
     * @sample AWSAppRegistryAsyncHandler.CreateAttributeGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry/CreateAttributeGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateAttributeGroupResult> createAttributeGroupAsync(CreateAttributeGroupRequest createAttributeGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAttributeGroupRequest, CreateAttributeGroupResult> asyncHandler);

    /**
     * <p>
     * Delete an application, specified either by its application ID or name.
     * </p>
     * 
     * @param deleteApplicationRequest
     * @return A Java Future containing the result of the DeleteApplication operation returned by the service.
     * @sample AWSAppRegistryAsync.DeleteApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry/DeleteApplication" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteApplicationResult> deleteApplicationAsync(DeleteApplicationRequest deleteApplicationRequest);

    /**
     * <p>
     * Delete an application, specified either by its application ID or name.
     * </p>
     * 
     * @param deleteApplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteApplication operation returned by the service.
     * @sample AWSAppRegistryAsyncHandler.DeleteApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry/DeleteApplication" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteApplicationResult> deleteApplicationAsync(DeleteApplicationRequest deleteApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteApplicationRequest, DeleteApplicationResult> asyncHandler);

    /**
     * <p>
     * Deletes an attribute group, specified either by its attribute group ID or name.
     * </p>
     * 
     * @param deleteAttributeGroupRequest
     * @return A Java Future containing the result of the DeleteAttributeGroup operation returned by the service.
     * @sample AWSAppRegistryAsync.DeleteAttributeGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry/DeleteAttributeGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAttributeGroupResult> deleteAttributeGroupAsync(DeleteAttributeGroupRequest deleteAttributeGroupRequest);

    /**
     * <p>
     * Deletes an attribute group, specified either by its attribute group ID or name.
     * </p>
     * 
     * @param deleteAttributeGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAttributeGroup operation returned by the service.
     * @sample AWSAppRegistryAsyncHandler.DeleteAttributeGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry/DeleteAttributeGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAttributeGroupResult> deleteAttributeGroupAsync(DeleteAttributeGroupRequest deleteAttributeGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAttributeGroupRequest, DeleteAttributeGroupResult> asyncHandler);

    /**
     * <p>
     * Disassociates an attribute group from an application to remove the extra attributes contained in the attribute
     * group from the application's metadata. This operation reverts AssociateAttributeGroup.
     * </p>
     * 
     * @param disassociateAttributeGroupRequest
     * @return A Java Future containing the result of the DisassociateAttributeGroup operation returned by the service.
     * @sample AWSAppRegistryAsync.DisassociateAttributeGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry/DisassociateAttributeGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateAttributeGroupResult> disassociateAttributeGroupAsync(
            DisassociateAttributeGroupRequest disassociateAttributeGroupRequest);

    /**
     * <p>
     * Disassociates an attribute group from an application to remove the extra attributes contained in the attribute
     * group from the application's metadata. This operation reverts AssociateAttributeGroup.
     * </p>
     * 
     * @param disassociateAttributeGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateAttributeGroup operation returned by the service.
     * @sample AWSAppRegistryAsyncHandler.DisassociateAttributeGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry/DisassociateAttributeGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateAttributeGroupResult> disassociateAttributeGroupAsync(
            DisassociateAttributeGroupRequest disassociateAttributeGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateAttributeGroupRequest, DisassociateAttributeGroupResult> asyncHandler);

    /**
     * <p>
     * Disassociates a resource from application. Both the resource and the application can be specified either by ID or
     * name.
     * </p>
     * 
     * @param disassociateResourceRequest
     * @return A Java Future containing the result of the DisassociateResource operation returned by the service.
     * @sample AWSAppRegistryAsync.DisassociateResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry/DisassociateResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateResourceResult> disassociateResourceAsync(DisassociateResourceRequest disassociateResourceRequest);

    /**
     * <p>
     * Disassociates a resource from application. Both the resource and the application can be specified either by ID or
     * name.
     * </p>
     * 
     * @param disassociateResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateResource operation returned by the service.
     * @sample AWSAppRegistryAsyncHandler.DisassociateResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry/DisassociateResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateResourceResult> disassociateResourceAsync(DisassociateResourceRequest disassociateResourceRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateResourceRequest, DisassociateResourceResult> asyncHandler);

    /**
     * <p>
     * Retrieves metadata information about one of your applications. The application can be specified either by its
     * unique ID or by its name (which is unique within one account in one region at a given point in time). Specify by
     * ID in automated workflows if you want to make sure that the exact same application is returned or a
     * ResourceNotFoundException is thrown, avoiding the ABA addressing problem.
     * </p>
     * 
     * @param getApplicationRequest
     * @return A Java Future containing the result of the GetApplication operation returned by the service.
     * @sample AWSAppRegistryAsync.GetApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry/GetApplication" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetApplicationResult> getApplicationAsync(GetApplicationRequest getApplicationRequest);

    /**
     * <p>
     * Retrieves metadata information about one of your applications. The application can be specified either by its
     * unique ID or by its name (which is unique within one account in one region at a given point in time). Specify by
     * ID in automated workflows if you want to make sure that the exact same application is returned or a
     * ResourceNotFoundException is thrown, avoiding the ABA addressing problem.
     * </p>
     * 
     * @param getApplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetApplication operation returned by the service.
     * @sample AWSAppRegistryAsyncHandler.GetApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry/GetApplication" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetApplicationResult> getApplicationAsync(GetApplicationRequest getApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<GetApplicationRequest, GetApplicationResult> asyncHandler);

    /**
     * <p>
     * Retrieves an attribute group, either by its name or its ID.
     * </p>
     * 
     * @param getAttributeGroupRequest
     * @return A Java Future containing the result of the GetAttributeGroup operation returned by the service.
     * @sample AWSAppRegistryAsync.GetAttributeGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry/GetAttributeGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAttributeGroupResult> getAttributeGroupAsync(GetAttributeGroupRequest getAttributeGroupRequest);

    /**
     * <p>
     * Retrieves an attribute group, either by its name or its ID.
     * </p>
     * 
     * @param getAttributeGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAttributeGroup operation returned by the service.
     * @sample AWSAppRegistryAsyncHandler.GetAttributeGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry/GetAttributeGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAttributeGroupResult> getAttributeGroupAsync(GetAttributeGroupRequest getAttributeGroupRequest,
            com.amazonaws.handlers.AsyncHandler<GetAttributeGroupRequest, GetAttributeGroupResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of all of your applications. Results are paginated.
     * </p>
     * 
     * @param listApplicationsRequest
     * @return A Java Future containing the result of the ListApplications operation returned by the service.
     * @sample AWSAppRegistryAsync.ListApplications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry/ListApplications" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListApplicationsResult> listApplicationsAsync(ListApplicationsRequest listApplicationsRequest);

    /**
     * <p>
     * Retrieves a list of all of your applications. Results are paginated.
     * </p>
     * 
     * @param listApplicationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListApplications operation returned by the service.
     * @sample AWSAppRegistryAsyncHandler.ListApplications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry/ListApplications" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListApplicationsResult> listApplicationsAsync(ListApplicationsRequest listApplicationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListApplicationsRequest, ListApplicationsResult> asyncHandler);

    /**
     * <p>
     * Lists all attribute groups that are associated with specified application. Results are paginated.
     * </p>
     * 
     * @param listAssociatedAttributeGroupsRequest
     * @return A Java Future containing the result of the ListAssociatedAttributeGroups operation returned by the
     *         service.
     * @sample AWSAppRegistryAsync.ListAssociatedAttributeGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry/ListAssociatedAttributeGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAssociatedAttributeGroupsResult> listAssociatedAttributeGroupsAsync(
            ListAssociatedAttributeGroupsRequest listAssociatedAttributeGroupsRequest);

    /**
     * <p>
     * Lists all attribute groups that are associated with specified application. Results are paginated.
     * </p>
     * 
     * @param listAssociatedAttributeGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAssociatedAttributeGroups operation returned by the
     *         service.
     * @sample AWSAppRegistryAsyncHandler.ListAssociatedAttributeGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry/ListAssociatedAttributeGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAssociatedAttributeGroupsResult> listAssociatedAttributeGroupsAsync(
            ListAssociatedAttributeGroupsRequest listAssociatedAttributeGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAssociatedAttributeGroupsRequest, ListAssociatedAttributeGroupsResult> asyncHandler);

    /**
     * <p>
     * Lists all resources that are associated with specified application. Results are paginated.
     * </p>
     * 
     * @param listAssociatedResourcesRequest
     * @return A Java Future containing the result of the ListAssociatedResources operation returned by the service.
     * @sample AWSAppRegistryAsync.ListAssociatedResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry/ListAssociatedResources" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListAssociatedResourcesResult> listAssociatedResourcesAsync(ListAssociatedResourcesRequest listAssociatedResourcesRequest);

    /**
     * <p>
     * Lists all resources that are associated with specified application. Results are paginated.
     * </p>
     * 
     * @param listAssociatedResourcesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAssociatedResources operation returned by the service.
     * @sample AWSAppRegistryAsyncHandler.ListAssociatedResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry/ListAssociatedResources" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListAssociatedResourcesResult> listAssociatedResourcesAsync(ListAssociatedResourcesRequest listAssociatedResourcesRequest,
            com.amazonaws.handlers.AsyncHandler<ListAssociatedResourcesRequest, ListAssociatedResourcesResult> asyncHandler);

    /**
     * <p>
     * Lists all attribute groups which you have access to. Results are paginated.
     * </p>
     * 
     * @param listAttributeGroupsRequest
     * @return A Java Future containing the result of the ListAttributeGroups operation returned by the service.
     * @sample AWSAppRegistryAsync.ListAttributeGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry/ListAttributeGroups" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAttributeGroupsResult> listAttributeGroupsAsync(ListAttributeGroupsRequest listAttributeGroupsRequest);

    /**
     * <p>
     * Lists all attribute groups which you have access to. Results are paginated.
     * </p>
     * 
     * @param listAttributeGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAttributeGroups operation returned by the service.
     * @sample AWSAppRegistryAsyncHandler.ListAttributeGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry/ListAttributeGroups" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAttributeGroupsResult> listAttributeGroupsAsync(ListAttributeGroupsRequest listAttributeGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAttributeGroupsRequest, ListAttributeGroupsResult> asyncHandler);

    /**
     * <p>
     * Updates an existing application with new attributes.
     * </p>
     * 
     * @param updateApplicationRequest
     * @return A Java Future containing the result of the UpdateApplication operation returned by the service.
     * @sample AWSAppRegistryAsync.UpdateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry/UpdateApplication" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateApplicationResult> updateApplicationAsync(UpdateApplicationRequest updateApplicationRequest);

    /**
     * <p>
     * Updates an existing application with new attributes.
     * </p>
     * 
     * @param updateApplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateApplication operation returned by the service.
     * @sample AWSAppRegistryAsyncHandler.UpdateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry/UpdateApplication" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateApplicationResult> updateApplicationAsync(UpdateApplicationRequest updateApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateApplicationRequest, UpdateApplicationResult> asyncHandler);

    /**
     * <p>
     * Updates an existing attribute group with new details.
     * </p>
     * 
     * @param updateAttributeGroupRequest
     * @return A Java Future containing the result of the UpdateAttributeGroup operation returned by the service.
     * @sample AWSAppRegistryAsync.UpdateAttributeGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry/UpdateAttributeGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAttributeGroupResult> updateAttributeGroupAsync(UpdateAttributeGroupRequest updateAttributeGroupRequest);

    /**
     * <p>
     * Updates an existing attribute group with new details.
     * </p>
     * 
     * @param updateAttributeGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAttributeGroup operation returned by the service.
     * @sample AWSAppRegistryAsyncHandler.UpdateAttributeGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry/UpdateAttributeGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAttributeGroupResult> updateAttributeGroupAsync(UpdateAttributeGroupRequest updateAttributeGroupRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAttributeGroupRequest, UpdateAttributeGroupResult> asyncHandler);

}
