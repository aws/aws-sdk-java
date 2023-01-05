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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.ssmsap.model.*;

/**
 * Interface for accessing SsmSap.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.ssmsap.AbstractAWSSsmSap} instead.
 * </p>
 * <p>
 * <p>
 * This API reference provides descriptions, syntax, and other details about each of the actions and data types for AWS
 * Systems Manager for SAP. The topic for each action shows the API request parameters and responses.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSSsmSap {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "ssm-sap";

    /**
     * <p>
     * Removes permissions associated with the target database.
     * </p>
     * 
     * @param deleteResourcePermissionRequest
     * @return Result of the DeleteResourcePermission operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws InternalServerException
     * @sample AWSSsmSap.DeleteResourcePermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/DeleteResourcePermission"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteResourcePermissionResult deleteResourcePermission(DeleteResourcePermissionRequest deleteResourcePermissionRequest);

    /**
     * <p>
     * Deregister an SAP application with AWS Systems Manager for SAP. This action does not aﬀect the existing setup of
     * your SAP workloads on Amazon EC2.
     * </p>
     * 
     * @param deregisterApplicationRequest
     * @return Result of the DeregisterApplication operation returned by the service.
     * @throws ValidationException
     * @throws InternalServerException
     * @sample AWSSsmSap.DeregisterApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/DeregisterApplication" target="_top">AWS
     *      API Documentation</a>
     */
    DeregisterApplicationResult deregisterApplication(DeregisterApplicationRequest deregisterApplicationRequest);

    /**
     * <p>
     * Gets an application registered with AWS Systems Manager for SAP. It also returns the components of the
     * application.
     * </p>
     * 
     * @param getApplicationRequest
     * @return Result of the GetApplication operation returned by the service.
     * @throws ValidationException
     * @throws InternalServerException
     * @sample AWSSsmSap.GetApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/GetApplication" target="_top">AWS API
     *      Documentation</a>
     */
    GetApplicationResult getApplication(GetApplicationRequest getApplicationRequest);

    /**
     * <p>
     * Gets the component of an application registered with AWS Systems Manager for SAP.
     * </p>
     * 
     * @param getComponentRequest
     * @return Result of the GetComponent operation returned by the service.
     * @throws ValidationException
     * @throws InternalServerException
     * @sample AWSSsmSap.GetComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/GetComponent" target="_top">AWS API
     *      Documentation</a>
     */
    GetComponentResult getComponent(GetComponentRequest getComponentRequest);

    /**
     * <p>
     * Gets the SAP HANA database of an application registered with AWS Systems Manager for SAP.
     * </p>
     * 
     * @param getDatabaseRequest
     * @return Result of the GetDatabase operation returned by the service.
     * @throws ValidationException
     * @throws InternalServerException
     * @sample AWSSsmSap.GetDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/GetDatabase" target="_top">AWS API
     *      Documentation</a>
     */
    GetDatabaseResult getDatabase(GetDatabaseRequest getDatabaseRequest);

    /**
     * <p>
     * Gets the details of an operation by specifying the operation ID.
     * </p>
     * 
     * @param getOperationRequest
     * @return Result of the GetOperation operation returned by the service.
     * @throws ValidationException
     * @throws InternalServerException
     * @sample AWSSsmSap.GetOperation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/GetOperation" target="_top">AWS API
     *      Documentation</a>
     */
    GetOperationResult getOperation(GetOperationRequest getOperationRequest);

    /**
     * <p>
     * Gets permissions associated with the target database.
     * </p>
     * 
     * @param getResourcePermissionRequest
     * @return Result of the GetResourcePermission operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws InternalServerException
     * @sample AWSSsmSap.GetResourcePermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/GetResourcePermission" target="_top">AWS
     *      API Documentation</a>
     */
    GetResourcePermissionResult getResourcePermission(GetResourcePermissionRequest getResourcePermissionRequest);

    /**
     * <p>
     * Lists all the applications registered with AWS Systems Manager for SAP.
     * </p>
     * 
     * @param listApplicationsRequest
     * @return Result of the ListApplications operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws InternalServerException
     * @sample AWSSsmSap.ListApplications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/ListApplications" target="_top">AWS API
     *      Documentation</a>
     */
    ListApplicationsResult listApplications(ListApplicationsRequest listApplicationsRequest);

    /**
     * <p>
     * Lists all the components registered with AWS Systems Manager for SAP.
     * </p>
     * 
     * @param listComponentsRequest
     * @return Result of the ListComponents operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws InternalServerException
     * @sample AWSSsmSap.ListComponents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/ListComponents" target="_top">AWS API
     *      Documentation</a>
     */
    ListComponentsResult listComponents(ListComponentsRequest listComponentsRequest);

    /**
     * <p>
     * Lists the SAP HANA databases of an application registered with AWS Systems Manager for SAP.
     * </p>
     * 
     * @param listDatabasesRequest
     * @return Result of the ListDatabases operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws InternalServerException
     * @sample AWSSsmSap.ListDatabases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/ListDatabases" target="_top">AWS API
     *      Documentation</a>
     */
    ListDatabasesResult listDatabases(ListDatabasesRequest listDatabasesRequest);

    /**
     * <p>
     * Lists all tags on an SAP HANA application and/or database registered with AWS Systems Manager for SAP.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws ConflictException
     * @sample AWSSsmSap.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Adds permissions to the target database.
     * </p>
     * 
     * @param putResourcePermissionRequest
     * @return Result of the PutResourcePermission operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws InternalServerException
     * @sample AWSSsmSap.PutResourcePermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/PutResourcePermission" target="_top">AWS
     *      API Documentation</a>
     */
    PutResourcePermissionResult putResourcePermission(PutResourcePermissionRequest putResourcePermissionRequest);

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
     * @return Result of the RegisterApplication operation returned by the service.
     * @throws ValidationException
     * @throws ConflictException
     * @throws InternalServerException
     * @sample AWSSsmSap.RegisterApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/RegisterApplication" target="_top">AWS
     *      API Documentation</a>
     */
    RegisterApplicationResult registerApplication(RegisterApplicationRequest registerApplicationRequest);

    /**
     * <p>
     * Creates tag for a resource by specifying the ARN.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws ConflictException
     * @sample AWSSsmSap.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Delete the tags for a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws ConflictException
     * @sample AWSSsmSap.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p/>
     * 
     * @param updateApplicationSettingsRequest
     * @return Result of the UpdateApplicationSettings operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws InternalServerException
     * @sample AWSSsmSap.UpdateApplicationSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/UpdateApplicationSettings"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateApplicationSettingsResult updateApplicationSettings(UpdateApplicationSettingsRequest updateApplicationSettingsRequest);

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
