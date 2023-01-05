/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ssmsap;

import javax.annotation.Generated;

import com.amazonaws.services.ssmsap.model.*;

/**
 * Interface for accessing SsmSap asynchronously. Each asynchronous method will return a Java Future object representing
 * the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive notification when
 * an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.ssmsap.AbstractAWSSsmSapAsync} instead.
 * </p>
 * <p>
 * <p>
 * This API reference provides descriptions, syntax, and other details about each of the actions and data types for AWS
 * Systems Manager for SAP. The topic for each action shows the API request parameters and responses.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSSsmSapAsync extends AWSSsmSap {

    /**
     * <p>
     * Removes permissions associated with the target database.
     * </p>
     * 
     * @param deleteResourcePermissionRequest
     * @return A Java Future containing the result of the DeleteResourcePermission operation returned by the service.
     * @sample AWSSsmSapAsync.DeleteResourcePermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/DeleteResourcePermission"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteResourcePermissionResult> deleteResourcePermissionAsync(DeleteResourcePermissionRequest deleteResourcePermissionRequest);

    /**
     * <p>
     * Removes permissions associated with the target database.
     * </p>
     * 
     * @param deleteResourcePermissionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteResourcePermission operation returned by the service.
     * @sample AWSSsmSapAsyncHandler.DeleteResourcePermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/DeleteResourcePermission"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteResourcePermissionResult> deleteResourcePermissionAsync(DeleteResourcePermissionRequest deleteResourcePermissionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteResourcePermissionRequest, DeleteResourcePermissionResult> asyncHandler);

    /**
     * <p>
     * Deregister an SAP application with AWS Systems Manager for SAP. This action does not aﬀect the existing setup of
     * your SAP workloads on Amazon EC2.
     * </p>
     * 
     * @param deregisterApplicationRequest
     * @return A Java Future containing the result of the DeregisterApplication operation returned by the service.
     * @sample AWSSsmSapAsync.DeregisterApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/DeregisterApplication" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeregisterApplicationResult> deregisterApplicationAsync(DeregisterApplicationRequest deregisterApplicationRequest);

    /**
     * <p>
     * Deregister an SAP application with AWS Systems Manager for SAP. This action does not aﬀect the existing setup of
     * your SAP workloads on Amazon EC2.
     * </p>
     * 
     * @param deregisterApplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeregisterApplication operation returned by the service.
     * @sample AWSSsmSapAsyncHandler.DeregisterApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/DeregisterApplication" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeregisterApplicationResult> deregisterApplicationAsync(DeregisterApplicationRequest deregisterApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<DeregisterApplicationRequest, DeregisterApplicationResult> asyncHandler);

    /**
     * <p>
     * Gets an application registered with AWS Systems Manager for SAP. It also returns the components of the
     * application.
     * </p>
     * 
     * @param getApplicationRequest
     * @return A Java Future containing the result of the GetApplication operation returned by the service.
     * @sample AWSSsmSapAsync.GetApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/GetApplication" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetApplicationResult> getApplicationAsync(GetApplicationRequest getApplicationRequest);

    /**
     * <p>
     * Gets an application registered with AWS Systems Manager for SAP. It also returns the components of the
     * application.
     * </p>
     * 
     * @param getApplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetApplication operation returned by the service.
     * @sample AWSSsmSapAsyncHandler.GetApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/GetApplication" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetApplicationResult> getApplicationAsync(GetApplicationRequest getApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<GetApplicationRequest, GetApplicationResult> asyncHandler);

    /**
     * <p>
     * Gets the component of an application registered with AWS Systems Manager for SAP.
     * </p>
     * 
     * @param getComponentRequest
     * @return A Java Future containing the result of the GetComponent operation returned by the service.
     * @sample AWSSsmSapAsync.GetComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/GetComponent" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetComponentResult> getComponentAsync(GetComponentRequest getComponentRequest);

    /**
     * <p>
     * Gets the component of an application registered with AWS Systems Manager for SAP.
     * </p>
     * 
     * @param getComponentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetComponent operation returned by the service.
     * @sample AWSSsmSapAsyncHandler.GetComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/GetComponent" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetComponentResult> getComponentAsync(GetComponentRequest getComponentRequest,
            com.amazonaws.handlers.AsyncHandler<GetComponentRequest, GetComponentResult> asyncHandler);

    /**
     * <p>
     * Gets the SAP HANA database of an application registered with AWS Systems Manager for SAP.
     * </p>
     * 
     * @param getDatabaseRequest
     * @return A Java Future containing the result of the GetDatabase operation returned by the service.
     * @sample AWSSsmSapAsync.GetDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/GetDatabase" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDatabaseResult> getDatabaseAsync(GetDatabaseRequest getDatabaseRequest);

    /**
     * <p>
     * Gets the SAP HANA database of an application registered with AWS Systems Manager for SAP.
     * </p>
     * 
     * @param getDatabaseRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDatabase operation returned by the service.
     * @sample AWSSsmSapAsyncHandler.GetDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/GetDatabase" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDatabaseResult> getDatabaseAsync(GetDatabaseRequest getDatabaseRequest,
            com.amazonaws.handlers.AsyncHandler<GetDatabaseRequest, GetDatabaseResult> asyncHandler);

    /**
     * <p>
     * Gets the details of an operation by specifying the operation ID.
     * </p>
     * 
     * @param getOperationRequest
     * @return A Java Future containing the result of the GetOperation operation returned by the service.
     * @sample AWSSsmSapAsync.GetOperation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/GetOperation" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetOperationResult> getOperationAsync(GetOperationRequest getOperationRequest);

    /**
     * <p>
     * Gets the details of an operation by specifying the operation ID.
     * </p>
     * 
     * @param getOperationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetOperation operation returned by the service.
     * @sample AWSSsmSapAsyncHandler.GetOperation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/GetOperation" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetOperationResult> getOperationAsync(GetOperationRequest getOperationRequest,
            com.amazonaws.handlers.AsyncHandler<GetOperationRequest, GetOperationResult> asyncHandler);

    /**
     * <p>
     * Gets permissions associated with the target database.
     * </p>
     * 
     * @param getResourcePermissionRequest
     * @return A Java Future containing the result of the GetResourcePermission operation returned by the service.
     * @sample AWSSsmSapAsync.GetResourcePermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/GetResourcePermission" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetResourcePermissionResult> getResourcePermissionAsync(GetResourcePermissionRequest getResourcePermissionRequest);

    /**
     * <p>
     * Gets permissions associated with the target database.
     * </p>
     * 
     * @param getResourcePermissionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetResourcePermission operation returned by the service.
     * @sample AWSSsmSapAsyncHandler.GetResourcePermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/GetResourcePermission" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetResourcePermissionResult> getResourcePermissionAsync(GetResourcePermissionRequest getResourcePermissionRequest,
            com.amazonaws.handlers.AsyncHandler<GetResourcePermissionRequest, GetResourcePermissionResult> asyncHandler);

    /**
     * <p>
     * Lists all the applications registered with AWS Systems Manager for SAP.
     * </p>
     * 
     * @param listApplicationsRequest
     * @return A Java Future containing the result of the ListApplications operation returned by the service.
     * @sample AWSSsmSapAsync.ListApplications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/ListApplications" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListApplicationsResult> listApplicationsAsync(ListApplicationsRequest listApplicationsRequest);

    /**
     * <p>
     * Lists all the applications registered with AWS Systems Manager for SAP.
     * </p>
     * 
     * @param listApplicationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListApplications operation returned by the service.
     * @sample AWSSsmSapAsyncHandler.ListApplications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/ListApplications" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListApplicationsResult> listApplicationsAsync(ListApplicationsRequest listApplicationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListApplicationsRequest, ListApplicationsResult> asyncHandler);

    /**
     * <p>
     * Lists all the components registered with AWS Systems Manager for SAP.
     * </p>
     * 
     * @param listComponentsRequest
     * @return A Java Future containing the result of the ListComponents operation returned by the service.
     * @sample AWSSsmSapAsync.ListComponents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/ListComponents" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListComponentsResult> listComponentsAsync(ListComponentsRequest listComponentsRequest);

    /**
     * <p>
     * Lists all the components registered with AWS Systems Manager for SAP.
     * </p>
     * 
     * @param listComponentsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListComponents operation returned by the service.
     * @sample AWSSsmSapAsyncHandler.ListComponents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/ListComponents" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListComponentsResult> listComponentsAsync(ListComponentsRequest listComponentsRequest,
            com.amazonaws.handlers.AsyncHandler<ListComponentsRequest, ListComponentsResult> asyncHandler);

    /**
     * <p>
     * Lists the SAP HANA databases of an application registered with AWS Systems Manager for SAP.
     * </p>
     * 
     * @param listDatabasesRequest
     * @return A Java Future containing the result of the ListDatabases operation returned by the service.
     * @sample AWSSsmSapAsync.ListDatabases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/ListDatabases" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDatabasesResult> listDatabasesAsync(ListDatabasesRequest listDatabasesRequest);

    /**
     * <p>
     * Lists the SAP HANA databases of an application registered with AWS Systems Manager for SAP.
     * </p>
     * 
     * @param listDatabasesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDatabases operation returned by the service.
     * @sample AWSSsmSapAsyncHandler.ListDatabases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/ListDatabases" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDatabasesResult> listDatabasesAsync(ListDatabasesRequest listDatabasesRequest,
            com.amazonaws.handlers.AsyncHandler<ListDatabasesRequest, ListDatabasesResult> asyncHandler);

    /**
     * <p>
     * Lists all tags on an SAP HANA application and/or database registered with AWS Systems Manager for SAP.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSSsmSapAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists all tags on an SAP HANA application and/or database registered with AWS Systems Manager for SAP.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSSsmSapAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Adds permissions to the target database.
     * </p>
     * 
     * @param putResourcePermissionRequest
     * @return A Java Future containing the result of the PutResourcePermission operation returned by the service.
     * @sample AWSSsmSapAsync.PutResourcePermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/PutResourcePermission" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutResourcePermissionResult> putResourcePermissionAsync(PutResourcePermissionRequest putResourcePermissionRequest);

    /**
     * <p>
     * Adds permissions to the target database.
     * </p>
     * 
     * @param putResourcePermissionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutResourcePermission operation returned by the service.
     * @sample AWSSsmSapAsyncHandler.PutResourcePermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/PutResourcePermission" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutResourcePermissionResult> putResourcePermissionAsync(PutResourcePermissionRequest putResourcePermissionRequest,
            com.amazonaws.handlers.AsyncHandler<PutResourcePermissionRequest, PutResourcePermissionResult> asyncHandler);

    /**
     * <p>
     * Register an SAP application with AWS Systems Manager for SAP. You must meet the following requirements before
     * registering.
     * </p>
     * <p>
     * The SAP application you want to register with AWS Systems Manager for SAP is running on Amazon EC2.
     * </p>
     * <p>
     * AWS Systems Manager Agent must be setup on an Amazon EC2 instance along with the required IAM permissions.
     * </p>
     * <p>
     * Amazon EC2 instance(s) must have access to the secrets created in AWS Secrets Manager to manage SAP applications
     * and components.
     * </p>
     * 
     * @param registerApplicationRequest
     * @return A Java Future containing the result of the RegisterApplication operation returned by the service.
     * @sample AWSSsmSapAsync.RegisterApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/RegisterApplication" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RegisterApplicationResult> registerApplicationAsync(RegisterApplicationRequest registerApplicationRequest);

    /**
     * <p>
     * Register an SAP application with AWS Systems Manager for SAP. You must meet the following requirements before
     * registering.
     * </p>
     * <p>
     * The SAP application you want to register with AWS Systems Manager for SAP is running on Amazon EC2.
     * </p>
     * <p>
     * AWS Systems Manager Agent must be setup on an Amazon EC2 instance along with the required IAM permissions.
     * </p>
     * <p>
     * Amazon EC2 instance(s) must have access to the secrets created in AWS Secrets Manager to manage SAP applications
     * and components.
     * </p>
     * 
     * @param registerApplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RegisterApplication operation returned by the service.
     * @sample AWSSsmSapAsyncHandler.RegisterApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/RegisterApplication" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RegisterApplicationResult> registerApplicationAsync(RegisterApplicationRequest registerApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<RegisterApplicationRequest, RegisterApplicationResult> asyncHandler);

    /**
     * <p>
     * Creates tag for a resource by specifying the ARN.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSSsmSapAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Creates tag for a resource by specifying the ARN.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSSsmSapAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Delete the tags for a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSSsmSapAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Delete the tags for a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSSsmSapAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p/>
     * 
     * @param updateApplicationSettingsRequest
     * @return A Java Future containing the result of the UpdateApplicationSettings operation returned by the service.
     * @sample AWSSsmSapAsync.UpdateApplicationSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/UpdateApplicationSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateApplicationSettingsResult> updateApplicationSettingsAsync(
            UpdateApplicationSettingsRequest updateApplicationSettingsRequest);

    /**
     * <p/>
     * 
     * @param updateApplicationSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateApplicationSettings operation returned by the service.
     * @sample AWSSsmSapAsyncHandler.UpdateApplicationSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/UpdateApplicationSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateApplicationSettingsResult> updateApplicationSettingsAsync(
            UpdateApplicationSettingsRequest updateApplicationSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateApplicationSettingsRequest, UpdateApplicationSettingsResult> asyncHandler);

}
