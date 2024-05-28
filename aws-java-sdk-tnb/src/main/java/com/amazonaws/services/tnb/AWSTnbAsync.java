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

import com.amazonaws.services.tnb.model.*;

/**
 * Interface for accessing AWS Telco Network Builder asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.tnb.AbstractAWSTnbAsync} instead.
 * </p>
 * <p>
 * <p>
 * Amazon Web Services Telco Network Builder (TNB) is a network automation service that helps you deploy and manage
 * telecom networks. AWS TNB helps you with the lifecycle management of your telecommunication network functions
 * throughout planning, deployment, and post-deployment activities.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSTnbAsync extends AWSTnb {

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
     * @return A Java Future containing the result of the CancelSolNetworkOperation operation returned by the service.
     * @sample AWSTnbAsync.CancelSolNetworkOperation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/CancelSolNetworkOperation" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CancelSolNetworkOperationResult> cancelSolNetworkOperationAsync(
            CancelSolNetworkOperationRequest cancelSolNetworkOperationRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelSolNetworkOperation operation returned by the service.
     * @sample AWSTnbAsyncHandler.CancelSolNetworkOperation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/CancelSolNetworkOperation" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CancelSolNetworkOperationResult> cancelSolNetworkOperationAsync(
            CancelSolNetworkOperationRequest cancelSolNetworkOperationRequest,
            com.amazonaws.handlers.AsyncHandler<CancelSolNetworkOperationRequest, CancelSolNetworkOperationResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateSolFunctionPackage operation returned by the service.
     * @sample AWSTnbAsync.CreateSolFunctionPackage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/CreateSolFunctionPackage" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateSolFunctionPackageResult> createSolFunctionPackageAsync(CreateSolFunctionPackageRequest createSolFunctionPackageRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSolFunctionPackage operation returned by the service.
     * @sample AWSTnbAsyncHandler.CreateSolFunctionPackage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/CreateSolFunctionPackage" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateSolFunctionPackageResult> createSolFunctionPackageAsync(CreateSolFunctionPackageRequest createSolFunctionPackageRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSolFunctionPackageRequest, CreateSolFunctionPackageResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateSolNetworkInstance operation returned by the service.
     * @sample AWSTnbAsync.CreateSolNetworkInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/CreateSolNetworkInstance" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateSolNetworkInstanceResult> createSolNetworkInstanceAsync(CreateSolNetworkInstanceRequest createSolNetworkInstanceRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSolNetworkInstance operation returned by the service.
     * @sample AWSTnbAsyncHandler.CreateSolNetworkInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/CreateSolNetworkInstance" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateSolNetworkInstanceResult> createSolNetworkInstanceAsync(CreateSolNetworkInstanceRequest createSolNetworkInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSolNetworkInstanceRequest, CreateSolNetworkInstanceResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateSolNetworkPackage operation returned by the service.
     * @sample AWSTnbAsync.CreateSolNetworkPackage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/CreateSolNetworkPackage" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateSolNetworkPackageResult> createSolNetworkPackageAsync(CreateSolNetworkPackageRequest createSolNetworkPackageRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSolNetworkPackage operation returned by the service.
     * @sample AWSTnbAsyncHandler.CreateSolNetworkPackage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/CreateSolNetworkPackage" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateSolNetworkPackageResult> createSolNetworkPackageAsync(CreateSolNetworkPackageRequest createSolNetworkPackageRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSolNetworkPackageRequest, CreateSolNetworkPackageResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteSolFunctionPackage operation returned by the service.
     * @sample AWSTnbAsync.DeleteSolFunctionPackage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/DeleteSolFunctionPackage" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSolFunctionPackageResult> deleteSolFunctionPackageAsync(DeleteSolFunctionPackageRequest deleteSolFunctionPackageRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSolFunctionPackage operation returned by the service.
     * @sample AWSTnbAsyncHandler.DeleteSolFunctionPackage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/DeleteSolFunctionPackage" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSolFunctionPackageResult> deleteSolFunctionPackageAsync(DeleteSolFunctionPackageRequest deleteSolFunctionPackageRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSolFunctionPackageRequest, DeleteSolFunctionPackageResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteSolNetworkInstance operation returned by the service.
     * @sample AWSTnbAsync.DeleteSolNetworkInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/DeleteSolNetworkInstance" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSolNetworkInstanceResult> deleteSolNetworkInstanceAsync(DeleteSolNetworkInstanceRequest deleteSolNetworkInstanceRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSolNetworkInstance operation returned by the service.
     * @sample AWSTnbAsyncHandler.DeleteSolNetworkInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/DeleteSolNetworkInstance" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSolNetworkInstanceResult> deleteSolNetworkInstanceAsync(DeleteSolNetworkInstanceRequest deleteSolNetworkInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSolNetworkInstanceRequest, DeleteSolNetworkInstanceResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteSolNetworkPackage operation returned by the service.
     * @sample AWSTnbAsync.DeleteSolNetworkPackage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/DeleteSolNetworkPackage" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSolNetworkPackageResult> deleteSolNetworkPackageAsync(DeleteSolNetworkPackageRequest deleteSolNetworkPackageRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSolNetworkPackage operation returned by the service.
     * @sample AWSTnbAsyncHandler.DeleteSolNetworkPackage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/DeleteSolNetworkPackage" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSolNetworkPackageResult> deleteSolNetworkPackageAsync(DeleteSolNetworkPackageRequest deleteSolNetworkPackageRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSolNetworkPackageRequest, DeleteSolNetworkPackageResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetSolFunctionInstance operation returned by the service.
     * @sample AWSTnbAsync.GetSolFunctionInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/GetSolFunctionInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSolFunctionInstanceResult> getSolFunctionInstanceAsync(GetSolFunctionInstanceRequest getSolFunctionInstanceRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSolFunctionInstance operation returned by the service.
     * @sample AWSTnbAsyncHandler.GetSolFunctionInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/GetSolFunctionInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSolFunctionInstanceResult> getSolFunctionInstanceAsync(GetSolFunctionInstanceRequest getSolFunctionInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<GetSolFunctionInstanceRequest, GetSolFunctionInstanceResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetSolFunctionPackage operation returned by the service.
     * @sample AWSTnbAsync.GetSolFunctionPackage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/GetSolFunctionPackage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSolFunctionPackageResult> getSolFunctionPackageAsync(GetSolFunctionPackageRequest getSolFunctionPackageRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSolFunctionPackage operation returned by the service.
     * @sample AWSTnbAsyncHandler.GetSolFunctionPackage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/GetSolFunctionPackage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSolFunctionPackageResult> getSolFunctionPackageAsync(GetSolFunctionPackageRequest getSolFunctionPackageRequest,
            com.amazonaws.handlers.AsyncHandler<GetSolFunctionPackageRequest, GetSolFunctionPackageResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetSolFunctionPackageContent operation returned by the
     *         service.
     * @sample AWSTnbAsync.GetSolFunctionPackageContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/GetSolFunctionPackageContent"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSolFunctionPackageContentResult> getSolFunctionPackageContentAsync(
            GetSolFunctionPackageContentRequest getSolFunctionPackageContentRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSolFunctionPackageContent operation returned by the
     *         service.
     * @sample AWSTnbAsyncHandler.GetSolFunctionPackageContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/GetSolFunctionPackageContent"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSolFunctionPackageContentResult> getSolFunctionPackageContentAsync(
            GetSolFunctionPackageContentRequest getSolFunctionPackageContentRequest,
            com.amazonaws.handlers.AsyncHandler<GetSolFunctionPackageContentRequest, GetSolFunctionPackageContentResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetSolFunctionPackageDescriptor operation returned by the
     *         service.
     * @sample AWSTnbAsync.GetSolFunctionPackageDescriptor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/GetSolFunctionPackageDescriptor"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSolFunctionPackageDescriptorResult> getSolFunctionPackageDescriptorAsync(
            GetSolFunctionPackageDescriptorRequest getSolFunctionPackageDescriptorRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSolFunctionPackageDescriptor operation returned by the
     *         service.
     * @sample AWSTnbAsyncHandler.GetSolFunctionPackageDescriptor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/GetSolFunctionPackageDescriptor"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSolFunctionPackageDescriptorResult> getSolFunctionPackageDescriptorAsync(
            GetSolFunctionPackageDescriptorRequest getSolFunctionPackageDescriptorRequest,
            com.amazonaws.handlers.AsyncHandler<GetSolFunctionPackageDescriptorRequest, GetSolFunctionPackageDescriptorResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetSolNetworkInstance operation returned by the service.
     * @sample AWSTnbAsync.GetSolNetworkInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/GetSolNetworkInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSolNetworkInstanceResult> getSolNetworkInstanceAsync(GetSolNetworkInstanceRequest getSolNetworkInstanceRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSolNetworkInstance operation returned by the service.
     * @sample AWSTnbAsyncHandler.GetSolNetworkInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/GetSolNetworkInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSolNetworkInstanceResult> getSolNetworkInstanceAsync(GetSolNetworkInstanceRequest getSolNetworkInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<GetSolNetworkInstanceRequest, GetSolNetworkInstanceResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetSolNetworkOperation operation returned by the service.
     * @sample AWSTnbAsync.GetSolNetworkOperation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/GetSolNetworkOperation" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSolNetworkOperationResult> getSolNetworkOperationAsync(GetSolNetworkOperationRequest getSolNetworkOperationRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSolNetworkOperation operation returned by the service.
     * @sample AWSTnbAsyncHandler.GetSolNetworkOperation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/GetSolNetworkOperation" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSolNetworkOperationResult> getSolNetworkOperationAsync(GetSolNetworkOperationRequest getSolNetworkOperationRequest,
            com.amazonaws.handlers.AsyncHandler<GetSolNetworkOperationRequest, GetSolNetworkOperationResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetSolNetworkPackage operation returned by the service.
     * @sample AWSTnbAsync.GetSolNetworkPackage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/GetSolNetworkPackage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSolNetworkPackageResult> getSolNetworkPackageAsync(GetSolNetworkPackageRequest getSolNetworkPackageRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSolNetworkPackage operation returned by the service.
     * @sample AWSTnbAsyncHandler.GetSolNetworkPackage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/GetSolNetworkPackage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSolNetworkPackageResult> getSolNetworkPackageAsync(GetSolNetworkPackageRequest getSolNetworkPackageRequest,
            com.amazonaws.handlers.AsyncHandler<GetSolNetworkPackageRequest, GetSolNetworkPackageResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetSolNetworkPackageContent operation returned by the service.
     * @sample AWSTnbAsync.GetSolNetworkPackageContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/GetSolNetworkPackageContent"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSolNetworkPackageContentResult> getSolNetworkPackageContentAsync(
            GetSolNetworkPackageContentRequest getSolNetworkPackageContentRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSolNetworkPackageContent operation returned by the service.
     * @sample AWSTnbAsyncHandler.GetSolNetworkPackageContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/GetSolNetworkPackageContent"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSolNetworkPackageContentResult> getSolNetworkPackageContentAsync(
            GetSolNetworkPackageContentRequest getSolNetworkPackageContentRequest,
            com.amazonaws.handlers.AsyncHandler<GetSolNetworkPackageContentRequest, GetSolNetworkPackageContentResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetSolNetworkPackageDescriptor operation returned by the
     *         service.
     * @sample AWSTnbAsync.GetSolNetworkPackageDescriptor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/GetSolNetworkPackageDescriptor"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSolNetworkPackageDescriptorResult> getSolNetworkPackageDescriptorAsync(
            GetSolNetworkPackageDescriptorRequest getSolNetworkPackageDescriptorRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSolNetworkPackageDescriptor operation returned by the
     *         service.
     * @sample AWSTnbAsyncHandler.GetSolNetworkPackageDescriptor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/GetSolNetworkPackageDescriptor"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSolNetworkPackageDescriptorResult> getSolNetworkPackageDescriptorAsync(
            GetSolNetworkPackageDescriptorRequest getSolNetworkPackageDescriptorRequest,
            com.amazonaws.handlers.AsyncHandler<GetSolNetworkPackageDescriptorRequest, GetSolNetworkPackageDescriptorResult> asyncHandler);

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
     * @return A Java Future containing the result of the InstantiateSolNetworkInstance operation returned by the
     *         service.
     * @sample AWSTnbAsync.InstantiateSolNetworkInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/InstantiateSolNetworkInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<InstantiateSolNetworkInstanceResult> instantiateSolNetworkInstanceAsync(
            InstantiateSolNetworkInstanceRequest instantiateSolNetworkInstanceRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the InstantiateSolNetworkInstance operation returned by the
     *         service.
     * @sample AWSTnbAsyncHandler.InstantiateSolNetworkInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/InstantiateSolNetworkInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<InstantiateSolNetworkInstanceResult> instantiateSolNetworkInstanceAsync(
            InstantiateSolNetworkInstanceRequest instantiateSolNetworkInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<InstantiateSolNetworkInstanceRequest, InstantiateSolNetworkInstanceResult> asyncHandler);

    /**
     * <p>
     * Lists network function instances.
     * </p>
     * <p>
     * A network function instance is a function in a function package .
     * </p>
     * 
     * @param listSolFunctionInstancesRequest
     * @return A Java Future containing the result of the ListSolFunctionInstances operation returned by the service.
     * @sample AWSTnbAsync.ListSolFunctionInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/ListSolFunctionInstances" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListSolFunctionInstancesResult> listSolFunctionInstancesAsync(ListSolFunctionInstancesRequest listSolFunctionInstancesRequest);

    /**
     * <p>
     * Lists network function instances.
     * </p>
     * <p>
     * A network function instance is a function in a function package .
     * </p>
     * 
     * @param listSolFunctionInstancesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSolFunctionInstances operation returned by the service.
     * @sample AWSTnbAsyncHandler.ListSolFunctionInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/ListSolFunctionInstances" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListSolFunctionInstancesResult> listSolFunctionInstancesAsync(ListSolFunctionInstancesRequest listSolFunctionInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<ListSolFunctionInstancesRequest, ListSolFunctionInstancesResult> asyncHandler);

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
     * @return A Java Future containing the result of the ListSolFunctionPackages operation returned by the service.
     * @sample AWSTnbAsync.ListSolFunctionPackages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/ListSolFunctionPackages" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListSolFunctionPackagesResult> listSolFunctionPackagesAsync(ListSolFunctionPackagesRequest listSolFunctionPackagesRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSolFunctionPackages operation returned by the service.
     * @sample AWSTnbAsyncHandler.ListSolFunctionPackages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/ListSolFunctionPackages" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListSolFunctionPackagesResult> listSolFunctionPackagesAsync(ListSolFunctionPackagesRequest listSolFunctionPackagesRequest,
            com.amazonaws.handlers.AsyncHandler<ListSolFunctionPackagesRequest, ListSolFunctionPackagesResult> asyncHandler);

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
     * @return A Java Future containing the result of the ListSolNetworkInstances operation returned by the service.
     * @sample AWSTnbAsync.ListSolNetworkInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/ListSolNetworkInstances" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListSolNetworkInstancesResult> listSolNetworkInstancesAsync(ListSolNetworkInstancesRequest listSolNetworkInstancesRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSolNetworkInstances operation returned by the service.
     * @sample AWSTnbAsyncHandler.ListSolNetworkInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/ListSolNetworkInstances" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListSolNetworkInstancesResult> listSolNetworkInstancesAsync(ListSolNetworkInstancesRequest listSolNetworkInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<ListSolNetworkInstancesRequest, ListSolNetworkInstancesResult> asyncHandler);

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
     * @return A Java Future containing the result of the ListSolNetworkOperations operation returned by the service.
     * @sample AWSTnbAsync.ListSolNetworkOperations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/ListSolNetworkOperations" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListSolNetworkOperationsResult> listSolNetworkOperationsAsync(ListSolNetworkOperationsRequest listSolNetworkOperationsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSolNetworkOperations operation returned by the service.
     * @sample AWSTnbAsyncHandler.ListSolNetworkOperations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/ListSolNetworkOperations" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListSolNetworkOperationsResult> listSolNetworkOperationsAsync(ListSolNetworkOperationsRequest listSolNetworkOperationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListSolNetworkOperationsRequest, ListSolNetworkOperationsResult> asyncHandler);

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
     * @return A Java Future containing the result of the ListSolNetworkPackages operation returned by the service.
     * @sample AWSTnbAsync.ListSolNetworkPackages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/ListSolNetworkPackages" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListSolNetworkPackagesResult> listSolNetworkPackagesAsync(ListSolNetworkPackagesRequest listSolNetworkPackagesRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSolNetworkPackages operation returned by the service.
     * @sample AWSTnbAsyncHandler.ListSolNetworkPackages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/ListSolNetworkPackages" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListSolNetworkPackagesResult> listSolNetworkPackagesAsync(ListSolNetworkPackagesRequest listSolNetworkPackagesRequest,
            com.amazonaws.handlers.AsyncHandler<ListSolNetworkPackagesRequest, ListSolNetworkPackagesResult> asyncHandler);

    /**
     * <p>
     * Lists tags for AWS TNB resources.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSTnbAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists tags for AWS TNB resources.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSTnbAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

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
     * @return A Java Future containing the result of the PutSolFunctionPackageContent operation returned by the
     *         service.
     * @sample AWSTnbAsync.PutSolFunctionPackageContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/PutSolFunctionPackageContent"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutSolFunctionPackageContentResult> putSolFunctionPackageContentAsync(
            PutSolFunctionPackageContentRequest putSolFunctionPackageContentRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutSolFunctionPackageContent operation returned by the
     *         service.
     * @sample AWSTnbAsyncHandler.PutSolFunctionPackageContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/PutSolFunctionPackageContent"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutSolFunctionPackageContentResult> putSolFunctionPackageContentAsync(
            PutSolFunctionPackageContentRequest putSolFunctionPackageContentRequest,
            com.amazonaws.handlers.AsyncHandler<PutSolFunctionPackageContentRequest, PutSolFunctionPackageContentResult> asyncHandler);

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
     * @return A Java Future containing the result of the PutSolNetworkPackageContent operation returned by the service.
     * @sample AWSTnbAsync.PutSolNetworkPackageContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/PutSolNetworkPackageContent"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutSolNetworkPackageContentResult> putSolNetworkPackageContentAsync(
            PutSolNetworkPackageContentRequest putSolNetworkPackageContentRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutSolNetworkPackageContent operation returned by the service.
     * @sample AWSTnbAsyncHandler.PutSolNetworkPackageContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/PutSolNetworkPackageContent"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutSolNetworkPackageContentResult> putSolNetworkPackageContentAsync(
            PutSolNetworkPackageContentRequest putSolNetworkPackageContentRequest,
            com.amazonaws.handlers.AsyncHandler<PutSolNetworkPackageContentRequest, PutSolNetworkPackageContentResult> asyncHandler);

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
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSTnbAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSTnbAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

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
     * @return A Java Future containing the result of the TerminateSolNetworkInstance operation returned by the service.
     * @sample AWSTnbAsync.TerminateSolNetworkInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/TerminateSolNetworkInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<TerminateSolNetworkInstanceResult> terminateSolNetworkInstanceAsync(
            TerminateSolNetworkInstanceRequest terminateSolNetworkInstanceRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TerminateSolNetworkInstance operation returned by the service.
     * @sample AWSTnbAsyncHandler.TerminateSolNetworkInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/TerminateSolNetworkInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<TerminateSolNetworkInstanceResult> terminateSolNetworkInstanceAsync(
            TerminateSolNetworkInstanceRequest terminateSolNetworkInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<TerminateSolNetworkInstanceRequest, TerminateSolNetworkInstanceResult> asyncHandler);

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
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSTnbAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSTnbAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

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
     * @return A Java Future containing the result of the UpdateSolFunctionPackage operation returned by the service.
     * @sample AWSTnbAsync.UpdateSolFunctionPackage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/UpdateSolFunctionPackage" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSolFunctionPackageResult> updateSolFunctionPackageAsync(UpdateSolFunctionPackageRequest updateSolFunctionPackageRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateSolFunctionPackage operation returned by the service.
     * @sample AWSTnbAsyncHandler.UpdateSolFunctionPackage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/UpdateSolFunctionPackage" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSolFunctionPackageResult> updateSolFunctionPackageAsync(UpdateSolFunctionPackageRequest updateSolFunctionPackageRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateSolFunctionPackageRequest, UpdateSolFunctionPackageResult> asyncHandler);

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
     * @return A Java Future containing the result of the UpdateSolNetworkInstance operation returned by the service.
     * @sample AWSTnbAsync.UpdateSolNetworkInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/UpdateSolNetworkInstance" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSolNetworkInstanceResult> updateSolNetworkInstanceAsync(UpdateSolNetworkInstanceRequest updateSolNetworkInstanceRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateSolNetworkInstance operation returned by the service.
     * @sample AWSTnbAsyncHandler.UpdateSolNetworkInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/UpdateSolNetworkInstance" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSolNetworkInstanceResult> updateSolNetworkInstanceAsync(UpdateSolNetworkInstanceRequest updateSolNetworkInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateSolNetworkInstanceRequest, UpdateSolNetworkInstanceResult> asyncHandler);

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
     * @return A Java Future containing the result of the UpdateSolNetworkPackage operation returned by the service.
     * @sample AWSTnbAsync.UpdateSolNetworkPackage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/UpdateSolNetworkPackage" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSolNetworkPackageResult> updateSolNetworkPackageAsync(UpdateSolNetworkPackageRequest updateSolNetworkPackageRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateSolNetworkPackage operation returned by the service.
     * @sample AWSTnbAsyncHandler.UpdateSolNetworkPackage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/UpdateSolNetworkPackage" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSolNetworkPackageResult> updateSolNetworkPackageAsync(UpdateSolNetworkPackageRequest updateSolNetworkPackageRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateSolNetworkPackageRequest, UpdateSolNetworkPackageResult> asyncHandler);

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
     * @return A Java Future containing the result of the ValidateSolFunctionPackageContent operation returned by the
     *         service.
     * @sample AWSTnbAsync.ValidateSolFunctionPackageContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/ValidateSolFunctionPackageContent"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ValidateSolFunctionPackageContentResult> validateSolFunctionPackageContentAsync(
            ValidateSolFunctionPackageContentRequest validateSolFunctionPackageContentRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ValidateSolFunctionPackageContent operation returned by the
     *         service.
     * @sample AWSTnbAsyncHandler.ValidateSolFunctionPackageContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/ValidateSolFunctionPackageContent"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ValidateSolFunctionPackageContentResult> validateSolFunctionPackageContentAsync(
            ValidateSolFunctionPackageContentRequest validateSolFunctionPackageContentRequest,
            com.amazonaws.handlers.AsyncHandler<ValidateSolFunctionPackageContentRequest, ValidateSolFunctionPackageContentResult> asyncHandler);

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
     * @return A Java Future containing the result of the ValidateSolNetworkPackageContent operation returned by the
     *         service.
     * @sample AWSTnbAsync.ValidateSolNetworkPackageContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/ValidateSolNetworkPackageContent"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ValidateSolNetworkPackageContentResult> validateSolNetworkPackageContentAsync(
            ValidateSolNetworkPackageContentRequest validateSolNetworkPackageContentRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ValidateSolNetworkPackageContent operation returned by the
     *         service.
     * @sample AWSTnbAsyncHandler.ValidateSolNetworkPackageContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/ValidateSolNetworkPackageContent"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ValidateSolNetworkPackageContentResult> validateSolNetworkPackageContentAsync(
            ValidateSolNetworkPackageContentRequest validateSolNetworkPackageContentRequest,
            com.amazonaws.handlers.AsyncHandler<ValidateSolNetworkPackageContentRequest, ValidateSolNetworkPackageContentResult> asyncHandler);

}
