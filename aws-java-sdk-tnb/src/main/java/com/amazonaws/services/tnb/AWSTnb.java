/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.tnb;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.tnb.model.*;

/**
 * Interface for accessing AWS Telco Network Builder.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.tnb.AbstractAWSTnb} instead.
 * </p>
 * <p>
 * <p>
 * Amazon Web Services Telco Network Builder (TNB) is a network automation service that helps you deploy and manage
 * telecom networks. AWS TNB helps you with the lifecycle management of your telecommunication network functions
 * throughout planning, deployment, and post-deployment activities.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSTnb {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "tnb";

    /**
     * <p>
     * Cancels a network operation.
     * </p>
     * <p>
     * A network operation is any operation that is done to your network, such as network instance instantiation or
     * termination.
     * </p>
     * 
     * @param cancelSolNetworkOperationRequest
     * @return Result of the CancelSolNetworkOperation operation returned by the service.
     * @throws InternalServerException
     *         Unexpected error occurred. Problem on the server.
     * @throws ThrottlingException
     *         Exception caused by throttling.
     * @throws ValidationException
     *         Unable to process the request because the client provided input failed to satisfy request constraints.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws AccessDeniedException
     *         Insufficient permissions to make request.
     * @sample AWSTnb.CancelSolNetworkOperation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/CancelSolNetworkOperation" target="_top">AWS
     *      API Documentation</a>
     */
    CancelSolNetworkOperationResult cancelSolNetworkOperation(CancelSolNetworkOperationRequest cancelSolNetworkOperationRequest);

    /**
     * <p>
     * Creates a function package.
     * </p>
     * <p>
     * A function package is a .zip file in CSAR (Cloud Service Archive) format that contains a network function (an
     * ETSI standard telecommunication application) and function package descriptor that uses the TOSCA standard to
     * describe how the network functions should run on your network. For more information, see <a
     * href="https://docs.aws.amazon.com/tnb/latest/ug/function-packages.html">Function packages</a> in the <i>Amazon
     * Web Services Telco Network Builder User Guide</i>.
     * </p>
     * <p>
     * Creating a function package is the first step for creating a network in AWS TNB. This request creates an empty
     * container with an ID. The next step is to upload the actual CSAR zip file into that empty container. To upload
     * function package content, see <a
     * href="https://docs.aws.amazon.com/tnb/latest/APIReference/API_PutSolFunctionPackageContent.html"
     * >PutSolFunctionPackageContent</a>.
     * </p>
     * 
     * @param createSolFunctionPackageRequest
     * @return Result of the CreateSolFunctionPackage operation returned by the service.
     * @throws InternalServerException
     *         Unexpected error occurred. Problem on the server.
     * @throws ServiceQuotaExceededException
     *         Service quotas have been exceeded.
     * @throws ThrottlingException
     *         Exception caused by throttling.
     * @throws ValidationException
     *         Unable to process the request because the client provided input failed to satisfy request constraints.
     * @throws AccessDeniedException
     *         Insufficient permissions to make request.
     * @sample AWSTnb.CreateSolFunctionPackage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/CreateSolFunctionPackage" target="_top">AWS
     *      API Documentation</a>
     */
    CreateSolFunctionPackageResult createSolFunctionPackage(CreateSolFunctionPackageRequest createSolFunctionPackageRequest);

    /**
     * <p>
     * Creates a network instance.
     * </p>
     * <p>
     * A network instance is a single network created in Amazon Web Services TNB that can be deployed and on which
     * life-cycle operations (like terminate, update, and delete) can be performed. Creating a network instance is the
     * third step after creating a network package. For more information about network instances, <a
     * href="https://docs.aws.amazon.com/tnb/latest/ug/network-instances.html">Network instances</a> in the <i>Amazon
     * Web Services Telco Network Builder User Guide</i>.
     * </p>
     * <p>
     * Once you create a network instance, you can instantiate it. To instantiate a network, see <a
     * href="https://docs.aws.amazon.com/tnb/latest/APIReference/API_InstantiateSolNetworkInstance.html"
     * >InstantiateSolNetworkInstance</a>.
     * </p>
     * 
     * @param createSolNetworkInstanceRequest
     * @return Result of the CreateSolNetworkInstance operation returned by the service.
     * @throws InternalServerException
     *         Unexpected error occurred. Problem on the server.
     * @throws ServiceQuotaExceededException
     *         Service quotas have been exceeded.
     * @throws ThrottlingException
     *         Exception caused by throttling.
     * @throws ValidationException
     *         Unable to process the request because the client provided input failed to satisfy request constraints.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws AccessDeniedException
     *         Insufficient permissions to make request.
     * @sample AWSTnb.CreateSolNetworkInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/CreateSolNetworkInstance" target="_top">AWS
     *      API Documentation</a>
     */
    CreateSolNetworkInstanceResult createSolNetworkInstance(CreateSolNetworkInstanceRequest createSolNetworkInstanceRequest);

    /**
     * <p>
     * Creates a network package.
     * </p>
     * <p>
     * A network package is a .zip file in CSAR (Cloud Service Archive) format defines the function packages you want to
     * deploy and the Amazon Web Services infrastructure you want to deploy them on. For more information, see <a
     * href="https://docs.aws.amazon.com/tnb/latest/ug/network-instances.html">Network instances</a> in the <i>Amazon
     * Web Services Telco Network Builder User Guide</i>.
     * </p>
     * <p>
     * A network package consists of a network service descriptor (NSD) file (required) and any additional files
     * (optional), such as scripts specific to your needs. For example, if you have multiple function packages in your
     * network package, you can use the NSD to define which network functions should run in certain VPCs, subnets, or
     * EKS clusters.
     * </p>
     * <p>
     * This request creates an empty network package container with an ID. Once you create a network package, you can
     * upload the network package content using <a
     * href="https://docs.aws.amazon.com/tnb/latest/APIReference/API_PutSolNetworkPackageContent.html"
     * >PutSolNetworkPackageContent</a>.
     * </p>
     * 
     * @param createSolNetworkPackageRequest
     * @return Result of the CreateSolNetworkPackage operation returned by the service.
     * @throws InternalServerException
     *         Unexpected error occurred. Problem on the server.
     * @throws ServiceQuotaExceededException
     *         Service quotas have been exceeded.
     * @throws ThrottlingException
     *         Exception caused by throttling.
     * @throws ValidationException
     *         Unable to process the request because the client provided input failed to satisfy request constraints.
     * @throws AccessDeniedException
     *         Insufficient permissions to make request.
     * @sample AWSTnb.CreateSolNetworkPackage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/CreateSolNetworkPackage" target="_top">AWS
     *      API Documentation</a>
     */
    CreateSolNetworkPackageResult createSolNetworkPackage(CreateSolNetworkPackageRequest createSolNetworkPackageRequest);

    /**
     * <p>
     * Deletes a function package.
     * </p>
     * <p>
     * A function package is a .zip file in CSAR (Cloud Service Archive) format that contains a network function (an
     * ETSI standard telecommunication application) and function package descriptor that uses the TOSCA standard to
     * describe how the network functions should run on your network.
     * </p>
     * <p>
     * To delete a function package, the package must be in a disabled state. To disable a function package, see <a
     * href=
     * "https://docs.aws.amazon.com/tnb/latest/APIReference/API_UpdateSolFunctionPackage.html">UpdateSolFunctionPackage
     * </a>.
     * </p>
     * 
     * @param deleteSolFunctionPackageRequest
     * @return Result of the DeleteSolFunctionPackage operation returned by the service.
     * @throws InternalServerException
     *         Unexpected error occurred. Problem on the server.
     * @throws ThrottlingException
     *         Exception caused by throttling.
     * @throws ValidationException
     *         Unable to process the request because the client provided input failed to satisfy request constraints.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws AccessDeniedException
     *         Insufficient permissions to make request.
     * @sample AWSTnb.DeleteSolFunctionPackage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/DeleteSolFunctionPackage" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteSolFunctionPackageResult deleteSolFunctionPackage(DeleteSolFunctionPackageRequest deleteSolFunctionPackageRequest);

    /**
     * <p>
     * Deletes a network instance.
     * </p>
     * <p>
     * A network instance is a single network created in Amazon Web Services TNB that can be deployed and on which
     * life-cycle operations (like terminate, update, and delete) can be performed.
     * </p>
     * <p>
     * To delete a network instance, the instance must be in a stopped or terminated state. To terminate a network
     * instance, see <a href="https://docs.aws.amazon.com/tnb/latest/APIReference/API_TerminateSolNetworkInstance.html">
     * TerminateSolNetworkInstance</a>.
     * </p>
     * 
     * @param deleteSolNetworkInstanceRequest
     * @return Result of the DeleteSolNetworkInstance operation returned by the service.
     * @throws InternalServerException
     *         Unexpected error occurred. Problem on the server.
     * @throws ThrottlingException
     *         Exception caused by throttling.
     * @throws ValidationException
     *         Unable to process the request because the client provided input failed to satisfy request constraints.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws AccessDeniedException
     *         Insufficient permissions to make request.
     * @sample AWSTnb.DeleteSolNetworkInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/DeleteSolNetworkInstance" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteSolNetworkInstanceResult deleteSolNetworkInstance(DeleteSolNetworkInstanceRequest deleteSolNetworkInstanceRequest);

    /**
     * <p>
     * Deletes network package.
     * </p>
     * <p>
     * A network package is a .zip file in CSAR (Cloud Service Archive) format defines the function packages you want to
     * deploy and the Amazon Web Services infrastructure you want to deploy them on.
     * </p>
     * <p>
     * To delete a network package, the package must be in a disable state. To disable a network package, see <a
     * href="https://docs.aws.amazon.com/tnb/latest/APIReference/API_UpdateSolNetworkPackage.html"
     * >UpdateSolNetworkPackage</a>.
     * </p>
     * 
     * @param deleteSolNetworkPackageRequest
     * @return Result of the DeleteSolNetworkPackage operation returned by the service.
     * @throws InternalServerException
     *         Unexpected error occurred. Problem on the server.
     * @throws ThrottlingException
     *         Exception caused by throttling.
     * @throws ValidationException
     *         Unable to process the request because the client provided input failed to satisfy request constraints.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws AccessDeniedException
     *         Insufficient permissions to make request.
     * @sample AWSTnb.DeleteSolNetworkPackage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/DeleteSolNetworkPackage" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteSolNetworkPackageResult deleteSolNetworkPackage(DeleteSolNetworkPackageRequest deleteSolNetworkPackageRequest);

    /**
     * <p>
     * Gets the details of a network function instance, including the instantation state and metadata from the function
     * package descriptor in the network function package.
     * </p>
     * <p>
     * A network function instance is a function in a function package .
     * </p>
     * 
     * @param getSolFunctionInstanceRequest
     * @return Result of the GetSolFunctionInstance operation returned by the service.
     * @throws InternalServerException
     *         Unexpected error occurred. Problem on the server.
     * @throws ThrottlingException
     *         Exception caused by throttling.
     * @throws ValidationException
     *         Unable to process the request because the client provided input failed to satisfy request constraints.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws AccessDeniedException
     *         Insufficient permissions to make request.
     * @sample AWSTnb.GetSolFunctionInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/GetSolFunctionInstance" target="_top">AWS API
     *      Documentation</a>
     */
    GetSolFunctionInstanceResult getSolFunctionInstance(GetSolFunctionInstanceRequest getSolFunctionInstanceRequest);

    /**
     * <p>
     * Gets the details of an individual function package, such as the operational state and whether the package is in
     * use.
     * </p>
     * <p>
     * A function package is a .zip file in CSAR (Cloud Service Archive) format that contains a network function (an
     * ETSI standard telecommunication application) and function package descriptor that uses the TOSCA standard to
     * describe how the network functions should run on your network..
     * </p>
     * 
     * @param getSolFunctionPackageRequest
     * @return Result of the GetSolFunctionPackage operation returned by the service.
     * @throws InternalServerException
     *         Unexpected error occurred. Problem on the server.
     * @throws ThrottlingException
     *         Exception caused by throttling.
     * @throws ValidationException
     *         Unable to process the request because the client provided input failed to satisfy request constraints.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws AccessDeniedException
     *         Insufficient permissions to make request.
     * @sample AWSTnb.GetSolFunctionPackage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/GetSolFunctionPackage" target="_top">AWS API
     *      Documentation</a>
     */
    GetSolFunctionPackageResult getSolFunctionPackage(GetSolFunctionPackageRequest getSolFunctionPackageRequest);

    /**
     * <p>
     * Gets the contents of a function package.
     * </p>
     * <p>
     * A function package is a .zip file in CSAR (Cloud Service Archive) format that contains a network function (an
     * ETSI standard telecommunication application) and function package descriptor that uses the TOSCA standard to
     * describe how the network functions should run on your network.
     * </p>
     * 
     * @param getSolFunctionPackageContentRequest
     * @return Result of the GetSolFunctionPackageContent operation returned by the service.
     * @throws InternalServerException
     *         Unexpected error occurred. Problem on the server.
     * @throws ThrottlingException
     *         Exception caused by throttling.
     * @throws ValidationException
     *         Unable to process the request because the client provided input failed to satisfy request constraints.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws AccessDeniedException
     *         Insufficient permissions to make request.
     * @sample AWSTnb.GetSolFunctionPackageContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/GetSolFunctionPackageContent"
     *      target="_top">AWS API Documentation</a>
     */
    GetSolFunctionPackageContentResult getSolFunctionPackageContent(GetSolFunctionPackageContentRequest getSolFunctionPackageContentRequest);

    /**
     * <p>
     * Gets a function package descriptor in a function package.
     * </p>
     * <p>
     * A function package descriptor is a .yaml file in a function package that uses the TOSCA standard to describe how
     * the network function in the function package should run on your network.
     * </p>
     * <p>
     * A function package is a .zip file in CSAR (Cloud Service Archive) format that contains a network function (an
     * ETSI standard telecommunication application) and function package descriptor that uses the TOSCA standard to
     * describe how the network functions should run on your network.
     * </p>
     * 
     * @param getSolFunctionPackageDescriptorRequest
     * @return Result of the GetSolFunctionPackageDescriptor operation returned by the service.
     * @throws InternalServerException
     *         Unexpected error occurred. Problem on the server.
     * @throws ThrottlingException
     *         Exception caused by throttling.
     * @throws ValidationException
     *         Unable to process the request because the client provided input failed to satisfy request constraints.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws AccessDeniedException
     *         Insufficient permissions to make request.
     * @sample AWSTnb.GetSolFunctionPackageDescriptor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/GetSolFunctionPackageDescriptor"
     *      target="_top">AWS API Documentation</a>
     */
    GetSolFunctionPackageDescriptorResult getSolFunctionPackageDescriptor(GetSolFunctionPackageDescriptorRequest getSolFunctionPackageDescriptorRequest);

    /**
     * <p>
     * Gets the details of the network instance.
     * </p>
     * <p>
     * A network instance is a single network created in Amazon Web Services TNB that can be deployed and on which
     * life-cycle operations (like terminate, update, and delete) can be performed.
     * </p>
     * 
     * @param getSolNetworkInstanceRequest
     * @return Result of the GetSolNetworkInstance operation returned by the service.
     * @throws InternalServerException
     *         Unexpected error occurred. Problem on the server.
     * @throws ThrottlingException
     *         Exception caused by throttling.
     * @throws ValidationException
     *         Unable to process the request because the client provided input failed to satisfy request constraints.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws AccessDeniedException
     *         Insufficient permissions to make request.
     * @sample AWSTnb.GetSolNetworkInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/GetSolNetworkInstance" target="_top">AWS API
     *      Documentation</a>
     */
    GetSolNetworkInstanceResult getSolNetworkInstance(GetSolNetworkInstanceRequest getSolNetworkInstanceRequest);

    /**
     * <p>
     * Gets the details of a network operation, including the tasks involved in the network operation and the status of
     * the tasks.
     * </p>
     * <p>
     * A network operation is any operation that is done to your network, such as network instance instantiation or
     * termination.
     * </p>
     * 
     * @param getSolNetworkOperationRequest
     * @return Result of the GetSolNetworkOperation operation returned by the service.
     * @throws InternalServerException
     *         Unexpected error occurred. Problem on the server.
     * @throws ThrottlingException
     *         Exception caused by throttling.
     * @throws ValidationException
     *         Unable to process the request because the client provided input failed to satisfy request constraints.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws AccessDeniedException
     *         Insufficient permissions to make request.
     * @sample AWSTnb.GetSolNetworkOperation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/GetSolNetworkOperation" target="_top">AWS API
     *      Documentation</a>
     */
    GetSolNetworkOperationResult getSolNetworkOperation(GetSolNetworkOperationRequest getSolNetworkOperationRequest);

    /**
     * <p>
     * Gets the details of a network package.
     * </p>
     * <p>
     * A network package is a .zip file in CSAR (Cloud Service Archive) format defines the function packages you want to
     * deploy and the Amazon Web Services infrastructure you want to deploy them on.
     * </p>
     * 
     * @param getSolNetworkPackageRequest
     * @return Result of the GetSolNetworkPackage operation returned by the service.
     * @throws InternalServerException
     *         Unexpected error occurred. Problem on the server.
     * @throws ThrottlingException
     *         Exception caused by throttling.
     * @throws ValidationException
     *         Unable to process the request because the client provided input failed to satisfy request constraints.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws AccessDeniedException
     *         Insufficient permissions to make request.
     * @sample AWSTnb.GetSolNetworkPackage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/GetSolNetworkPackage" target="_top">AWS API
     *      Documentation</a>
     */
    GetSolNetworkPackageResult getSolNetworkPackage(GetSolNetworkPackageRequest getSolNetworkPackageRequest);

    /**
     * <p>
     * Gets the contents of a network package.
     * </p>
     * <p>
     * A network package is a .zip file in CSAR (Cloud Service Archive) format defines the function packages you want to
     * deploy and the Amazon Web Services infrastructure you want to deploy them on.
     * </p>
     * 
     * @param getSolNetworkPackageContentRequest
     * @return Result of the GetSolNetworkPackageContent operation returned by the service.
     * @throws InternalServerException
     *         Unexpected error occurred. Problem on the server.
     * @throws ThrottlingException
     *         Exception caused by throttling.
     * @throws ValidationException
     *         Unable to process the request because the client provided input failed to satisfy request constraints.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws AccessDeniedException
     *         Insufficient permissions to make request.
     * @sample AWSTnb.GetSolNetworkPackageContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/GetSolNetworkPackageContent"
     *      target="_top">AWS API Documentation</a>
     */
    GetSolNetworkPackageContentResult getSolNetworkPackageContent(GetSolNetworkPackageContentRequest getSolNetworkPackageContentRequest);

    /**
     * <p>
     * Gets the content of the network service descriptor.
     * </p>
     * <p>
     * A network service descriptor is a .yaml file in a network package that uses the TOSCA standard to describe the
     * network functions you want to deploy and the Amazon Web Services infrastructure you want to deploy the network
     * functions on.
     * </p>
     * 
     * @param getSolNetworkPackageDescriptorRequest
     * @return Result of the GetSolNetworkPackageDescriptor operation returned by the service.
     * @throws InternalServerException
     *         Unexpected error occurred. Problem on the server.
     * @throws ThrottlingException
     *         Exception caused by throttling.
     * @throws ValidationException
     *         Unable to process the request because the client provided input failed to satisfy request constraints.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws AccessDeniedException
     *         Insufficient permissions to make request.
     * @sample AWSTnb.GetSolNetworkPackageDescriptor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/GetSolNetworkPackageDescriptor"
     *      target="_top">AWS API Documentation</a>
     */
    GetSolNetworkPackageDescriptorResult getSolNetworkPackageDescriptor(GetSolNetworkPackageDescriptorRequest getSolNetworkPackageDescriptorRequest);

    /**
     * <p>
     * Instantiates a network instance.
     * </p>
     * <p>
     * A network instance is a single network created in Amazon Web Services TNB that can be deployed and on which
     * life-cycle operations (like terminate, update, and delete) can be performed.
     * </p>
     * <p>
     * Before you can instantiate a network instance, you have to create a network instance. For more information, see
     * <a href="https://docs.aws.amazon.com/tnb/latest/APIReference/API_CreateSolNetworkInstance.html">
     * CreateSolNetworkInstance</a>.
     * </p>
     * 
     * @param instantiateSolNetworkInstanceRequest
     * @return Result of the InstantiateSolNetworkInstance operation returned by the service.
     * @throws InternalServerException
     *         Unexpected error occurred. Problem on the server.
     * @throws ServiceQuotaExceededException
     *         Service quotas have been exceeded.
     * @throws ThrottlingException
     *         Exception caused by throttling.
     * @throws ValidationException
     *         Unable to process the request because the client provided input failed to satisfy request constraints.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws AccessDeniedException
     *         Insufficient permissions to make request.
     * @sample AWSTnb.InstantiateSolNetworkInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/InstantiateSolNetworkInstance"
     *      target="_top">AWS API Documentation</a>
     */
    InstantiateSolNetworkInstanceResult instantiateSolNetworkInstance(InstantiateSolNetworkInstanceRequest instantiateSolNetworkInstanceRequest);

    /**
     * <p>
     * Lists network function instances.
     * </p>
     * <p>
     * A network function instance is a function in a function package .
     * </p>
     * 
     * @param listSolFunctionInstancesRequest
     * @return Result of the ListSolFunctionInstances operation returned by the service.
     * @throws InternalServerException
     *         Unexpected error occurred. Problem on the server.
     * @throws ThrottlingException
     *         Exception caused by throttling.
     * @throws ValidationException
     *         Unable to process the request because the client provided input failed to satisfy request constraints.
     * @throws AccessDeniedException
     *         Insufficient permissions to make request.
     * @sample AWSTnb.ListSolFunctionInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/ListSolFunctionInstances" target="_top">AWS
     *      API Documentation</a>
     */
    ListSolFunctionInstancesResult listSolFunctionInstances(ListSolFunctionInstancesRequest listSolFunctionInstancesRequest);

    /**
     * <p>
     * Lists information about function packages.
     * </p>
     * <p>
     * A function package is a .zip file in CSAR (Cloud Service Archive) format that contains a network function (an
     * ETSI standard telecommunication application) and function package descriptor that uses the TOSCA standard to
     * describe how the network functions should run on your network.
     * </p>
     * 
     * @param listSolFunctionPackagesRequest
     * @return Result of the ListSolFunctionPackages operation returned by the service.
     * @throws InternalServerException
     *         Unexpected error occurred. Problem on the server.
     * @throws ThrottlingException
     *         Exception caused by throttling.
     * @throws ValidationException
     *         Unable to process the request because the client provided input failed to satisfy request constraints.
     * @throws AccessDeniedException
     *         Insufficient permissions to make request.
     * @sample AWSTnb.ListSolFunctionPackages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/ListSolFunctionPackages" target="_top">AWS
     *      API Documentation</a>
     */
    ListSolFunctionPackagesResult listSolFunctionPackages(ListSolFunctionPackagesRequest listSolFunctionPackagesRequest);

    /**
     * <p>
     * Lists your network instances.
     * </p>
     * <p>
     * A network instance is a single network created in Amazon Web Services TNB that can be deployed and on which
     * life-cycle operations (like terminate, update, and delete) can be performed.
     * </p>
     * 
     * @param listSolNetworkInstancesRequest
     * @return Result of the ListSolNetworkInstances operation returned by the service.
     * @throws InternalServerException
     *         Unexpected error occurred. Problem on the server.
     * @throws ThrottlingException
     *         Exception caused by throttling.
     * @throws ValidationException
     *         Unable to process the request because the client provided input failed to satisfy request constraints.
     * @throws AccessDeniedException
     *         Insufficient permissions to make request.
     * @sample AWSTnb.ListSolNetworkInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/ListSolNetworkInstances" target="_top">AWS
     *      API Documentation</a>
     */
    ListSolNetworkInstancesResult listSolNetworkInstances(ListSolNetworkInstancesRequest listSolNetworkInstancesRequest);

    /**
     * <p>
     * Lists details for a network operation, including when the operation started and the status of the operation.
     * </p>
     * <p>
     * A network operation is any operation that is done to your network, such as network instance instantiation or
     * termination.
     * </p>
     * 
     * @param listSolNetworkOperationsRequest
     * @return Result of the ListSolNetworkOperations operation returned by the service.
     * @throws InternalServerException
     *         Unexpected error occurred. Problem on the server.
     * @throws ThrottlingException
     *         Exception caused by throttling.
     * @throws ValidationException
     *         Unable to process the request because the client provided input failed to satisfy request constraints.
     * @throws AccessDeniedException
     *         Insufficient permissions to make request.
     * @sample AWSTnb.ListSolNetworkOperations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/ListSolNetworkOperations" target="_top">AWS
     *      API Documentation</a>
     */
    ListSolNetworkOperationsResult listSolNetworkOperations(ListSolNetworkOperationsRequest listSolNetworkOperationsRequest);

    /**
     * <p>
     * Lists network packages.
     * </p>
     * <p>
     * A network package is a .zip file in CSAR (Cloud Service Archive) format defines the function packages you want to
     * deploy and the Amazon Web Services infrastructure you want to deploy them on.
     * </p>
     * 
     * @param listSolNetworkPackagesRequest
     * @return Result of the ListSolNetworkPackages operation returned by the service.
     * @throws InternalServerException
     *         Unexpected error occurred. Problem on the server.
     * @throws ThrottlingException
     *         Exception caused by throttling.
     * @throws ValidationException
     *         Unable to process the request because the client provided input failed to satisfy request constraints.
     * @throws AccessDeniedException
     *         Insufficient permissions to make request.
     * @sample AWSTnb.ListSolNetworkPackages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/ListSolNetworkPackages" target="_top">AWS API
     *      Documentation</a>
     */
    ListSolNetworkPackagesResult listSolNetworkPackages(ListSolNetworkPackagesRequest listSolNetworkPackagesRequest);

    /**
     * <p>
     * Lists tags for AWS TNB resources.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InternalServerException
     *         Unexpected error occurred. Problem on the server.
     * @throws ThrottlingException
     *         Exception caused by throttling.
     * @throws ValidationException
     *         Unable to process the request because the client provided input failed to satisfy request constraints.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws AccessDeniedException
     *         Insufficient permissions to make request.
     * @sample AWSTnb.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Uploads the contents of a function package.
     * </p>
     * <p>
     * A function package is a .zip file in CSAR (Cloud Service Archive) format that contains a network function (an
     * ETSI standard telecommunication application) and function package descriptor that uses the TOSCA standard to
     * describe how the network functions should run on your network.
     * </p>
     * 
     * @param putSolFunctionPackageContentRequest
     * @return Result of the PutSolFunctionPackageContent operation returned by the service.
     * @throws InternalServerException
     *         Unexpected error occurred. Problem on the server.
     * @throws ThrottlingException
     *         Exception caused by throttling.
     * @throws ValidationException
     *         Unable to process the request because the client provided input failed to satisfy request constraints.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws AccessDeniedException
     *         Insufficient permissions to make request.
     * @sample AWSTnb.PutSolFunctionPackageContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/PutSolFunctionPackageContent"
     *      target="_top">AWS API Documentation</a>
     */
    PutSolFunctionPackageContentResult putSolFunctionPackageContent(PutSolFunctionPackageContentRequest putSolFunctionPackageContentRequest);

    /**
     * <p>
     * Uploads the contents of a network package.
     * </p>
     * <p>
     * A network package is a .zip file in CSAR (Cloud Service Archive) format defines the function packages you want to
     * deploy and the Amazon Web Services infrastructure you want to deploy them on.
     * </p>
     * 
     * @param putSolNetworkPackageContentRequest
     * @return Result of the PutSolNetworkPackageContent operation returned by the service.
     * @throws InternalServerException
     *         Unexpected error occurred. Problem on the server.
     * @throws ThrottlingException
     *         Exception caused by throttling.
     * @throws ValidationException
     *         Unable to process the request because the client provided input failed to satisfy request constraints.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws AccessDeniedException
     *         Insufficient permissions to make request.
     * @sample AWSTnb.PutSolNetworkPackageContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/PutSolNetworkPackageContent"
     *      target="_top">AWS API Documentation</a>
     */
    PutSolNetworkPackageContentResult putSolNetworkPackageContent(PutSolNetworkPackageContentRequest putSolNetworkPackageContentRequest);

    /**
     * <p>
     * Tags an AWS TNB resource.
     * </p>
     * <p>
     * A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key and an optional
     * value. You can use tags to search and filter your resources or track your Amazon Web Services costs.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InternalServerException
     *         Unexpected error occurred. Problem on the server.
     * @throws ThrottlingException
     *         Exception caused by throttling.
     * @throws ValidationException
     *         Unable to process the request because the client provided input failed to satisfy request constraints.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws AccessDeniedException
     *         Insufficient permissions to make request.
     * @sample AWSTnb.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Terminates a network instance.
     * </p>
     * <p>
     * A network instance is a single network created in Amazon Web Services TNB that can be deployed and on which
     * life-cycle operations (like terminate, update, and delete) can be performed.
     * </p>
     * <p>
     * You must terminate a network instance before you can delete it.
     * </p>
     * 
     * @param terminateSolNetworkInstanceRequest
     * @return Result of the TerminateSolNetworkInstance operation returned by the service.
     * @throws InternalServerException
     *         Unexpected error occurred. Problem on the server.
     * @throws ServiceQuotaExceededException
     *         Service quotas have been exceeded.
     * @throws ThrottlingException
     *         Exception caused by throttling.
     * @throws ValidationException
     *         Unable to process the request because the client provided input failed to satisfy request constraints.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws AccessDeniedException
     *         Insufficient permissions to make request.
     * @sample AWSTnb.TerminateSolNetworkInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/TerminateSolNetworkInstance"
     *      target="_top">AWS API Documentation</a>
     */
    TerminateSolNetworkInstanceResult terminateSolNetworkInstance(TerminateSolNetworkInstanceRequest terminateSolNetworkInstanceRequest);

    /**
     * <p>
     * Untags an AWS TNB resource.
     * </p>
     * <p>
     * A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key and an optional
     * value. You can use tags to search and filter your resources or track your Amazon Web Services costs.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InternalServerException
     *         Unexpected error occurred. Problem on the server.
     * @throws ThrottlingException
     *         Exception caused by throttling.
     * @throws ValidationException
     *         Unable to process the request because the client provided input failed to satisfy request constraints.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws AccessDeniedException
     *         Insufficient permissions to make request.
     * @sample AWSTnb.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates the operational state of function package.
     * </p>
     * <p>
     * A function package is a .zip file in CSAR (Cloud Service Archive) format that contains a network function (an
     * ETSI standard telecommunication application) and function package descriptor that uses the TOSCA standard to
     * describe how the network functions should run on your network.
     * </p>
     * 
     * @param updateSolFunctionPackageRequest
     * @return Result of the UpdateSolFunctionPackage operation returned by the service.
     * @throws InternalServerException
     *         Unexpected error occurred. Problem on the server.
     * @throws ThrottlingException
     *         Exception caused by throttling.
     * @throws ValidationException
     *         Unable to process the request because the client provided input failed to satisfy request constraints.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws AccessDeniedException
     *         Insufficient permissions to make request.
     * @sample AWSTnb.UpdateSolFunctionPackage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/UpdateSolFunctionPackage" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateSolFunctionPackageResult updateSolFunctionPackage(UpdateSolFunctionPackageRequest updateSolFunctionPackageRequest);

    /**
     * <p>
     * Update a network instance.
     * </p>
     * <p>
     * A network instance is a single network created in Amazon Web Services TNB that can be deployed and on which
     * life-cycle operations (like terminate, update, and delete) can be performed.
     * </p>
     * 
     * @param updateSolNetworkInstanceRequest
     * @return Result of the UpdateSolNetworkInstance operation returned by the service.
     * @throws InternalServerException
     *         Unexpected error occurred. Problem on the server.
     * @throws ServiceQuotaExceededException
     *         Service quotas have been exceeded.
     * @throws ThrottlingException
     *         Exception caused by throttling.
     * @throws ValidationException
     *         Unable to process the request because the client provided input failed to satisfy request constraints.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws AccessDeniedException
     *         Insufficient permissions to make request.
     * @sample AWSTnb.UpdateSolNetworkInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/UpdateSolNetworkInstance" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateSolNetworkInstanceResult updateSolNetworkInstance(UpdateSolNetworkInstanceRequest updateSolNetworkInstanceRequest);

    /**
     * <p>
     * Updates the operational state of a network package.
     * </p>
     * <p>
     * A network package is a .zip file in CSAR (Cloud Service Archive) format defines the function packages you want to
     * deploy and the Amazon Web Services infrastructure you want to deploy them on.
     * </p>
     * <p>
     * A network service descriptor is a .yaml file in a network package that uses the TOSCA standard to describe the
     * network functions you want to deploy and the Amazon Web Services infrastructure you want to deploy the network
     * functions on.
     * </p>
     * 
     * @param updateSolNetworkPackageRequest
     * @return Result of the UpdateSolNetworkPackage operation returned by the service.
     * @throws InternalServerException
     *         Unexpected error occurred. Problem on the server.
     * @throws ThrottlingException
     *         Exception caused by throttling.
     * @throws ValidationException
     *         Unable to process the request because the client provided input failed to satisfy request constraints.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws AccessDeniedException
     *         Insufficient permissions to make request.
     * @sample AWSTnb.UpdateSolNetworkPackage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/UpdateSolNetworkPackage" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateSolNetworkPackageResult updateSolNetworkPackage(UpdateSolNetworkPackageRequest updateSolNetworkPackageRequest);

    /**
     * <p>
     * Validates function package content. This can be used as a dry run before uploading function package content with
     * <a href="https://docs.aws.amazon.com/tnb/latest/APIReference/API_PutSolFunctionPackageContent.html">
     * PutSolFunctionPackageContent</a>.
     * </p>
     * <p>
     * A function package is a .zip file in CSAR (Cloud Service Archive) format that contains a network function (an
     * ETSI standard telecommunication application) and function package descriptor that uses the TOSCA standard to
     * describe how the network functions should run on your network.
     * </p>
     * 
     * @param validateSolFunctionPackageContentRequest
     * @return Result of the ValidateSolFunctionPackageContent operation returned by the service.
     * @throws InternalServerException
     *         Unexpected error occurred. Problem on the server.
     * @throws ThrottlingException
     *         Exception caused by throttling.
     * @throws ValidationException
     *         Unable to process the request because the client provided input failed to satisfy request constraints.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws AccessDeniedException
     *         Insufficient permissions to make request.
     * @sample AWSTnb.ValidateSolFunctionPackageContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/ValidateSolFunctionPackageContent"
     *      target="_top">AWS API Documentation</a>
     */
    ValidateSolFunctionPackageContentResult validateSolFunctionPackageContent(ValidateSolFunctionPackageContentRequest validateSolFunctionPackageContentRequest);

    /**
     * <p>
     * Validates network package content. This can be used as a dry run before uploading network package content with <a
     * href="https://docs.aws.amazon.com/tnb/latest/APIReference/API_PutSolNetworkPackageContent.html">
     * PutSolNetworkPackageContent</a>.
     * </p>
     * <p>
     * A network package is a .zip file in CSAR (Cloud Service Archive) format defines the function packages you want to
     * deploy and the Amazon Web Services infrastructure you want to deploy them on.
     * </p>
     * 
     * @param validateSolNetworkPackageContentRequest
     * @return Result of the ValidateSolNetworkPackageContent operation returned by the service.
     * @throws InternalServerException
     *         Unexpected error occurred. Problem on the server.
     * @throws ThrottlingException
     *         Exception caused by throttling.
     * @throws ValidationException
     *         Unable to process the request because the client provided input failed to satisfy request constraints.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws AccessDeniedException
     *         Insufficient permissions to make request.
     * @sample AWSTnb.ValidateSolNetworkPackageContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/ValidateSolNetworkPackageContent"
     *      target="_top">AWS API Documentation</a>
     */
    ValidateSolNetworkPackageContentResult validateSolNetworkPackageContent(ValidateSolNetworkPackageContentRequest validateSolNetworkPackageContentRequest);

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
