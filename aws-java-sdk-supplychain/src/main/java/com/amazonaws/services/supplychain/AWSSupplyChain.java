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
package com.amazonaws.services.supplychain;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.supplychain.model.*;

/**
 * Interface for accessing AWS Supply Chain.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.supplychain.AbstractAWSSupplyChain} instead.
 * </p>
 * <p>
 * <p>
 * AWS Supply Chain is a cloud-based application that works with your enterprise resource planning (ERP) and supply
 * chain management systems. Using AWS Supply Chain, you can connect and extract your inventory, supply, and demand
 * related data from existing ERP or supply chain systems into a single data model.
 * </p>
 * <p>
 * The AWS Supply Chain API supports configuration data import for Supply Planning.
 * </p>
 * <p>
 * All AWS Supply chain API operations are Amazon-authenticated and certificate-signed. They not only require the use of
 * the AWS SDK, but also allow for the exclusive use of AWS Identity and Access Management users and roles to help
 * facilitate access, trust, and permission policies.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSSupplyChain {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "scn";

    /**
     * <p>
     * CreateBillOfMaterialsImportJob creates an import job for the Product Bill Of Materials (BOM) entity. For
     * information on the product_bom entity, see the AWS Supply Chain User Guide.
     * </p>
     * <p>
     * The CSV file must be located in an Amazon S3 location accessible to AWS Supply Chain. It is recommended to use
     * the same Amazon S3 bucket created during your AWS Supply Chain instance creation.
     * </p>
     * 
     * @param createBillOfMaterialsImportJobRequest
     *        The request parameters for CreateBillOfMaterialsImportJob.
     * @return Result of the CreateBillOfMaterialsImportJob operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         Request would cause a service quota to be exceeded.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws AccessDeniedException
     *         You do not have the required privileges to perform this action.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @sample AWSSupplyChain.CreateBillOfMaterialsImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/supplychain-2024-01-01/CreateBillOfMaterialsImportJob"
     *      target="_top">AWS API Documentation</a>
     */
    CreateBillOfMaterialsImportJobResult createBillOfMaterialsImportJob(CreateBillOfMaterialsImportJobRequest createBillOfMaterialsImportJobRequest);

    /**
     * <p>
     * Get status and details of a BillOfMaterialsImportJob.
     * </p>
     * 
     * @param getBillOfMaterialsImportJobRequest
     *        The request parameters for GetBillOfMaterialsImportJob.
     * @return Result of the GetBillOfMaterialsImportJob operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         Request would cause a service quota to be exceeded.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have the required privileges to perform this action.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @sample AWSSupplyChain.GetBillOfMaterialsImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/supplychain-2024-01-01/GetBillOfMaterialsImportJob"
     *      target="_top">AWS API Documentation</a>
     */
    GetBillOfMaterialsImportJobResult getBillOfMaterialsImportJob(GetBillOfMaterialsImportJobRequest getBillOfMaterialsImportJobRequest);

    /**
     * <p>
     * Send transactional data events with real-time data for analysis or monitoring.
     * </p>
     * 
     * @param sendDataIntegrationEventRequest
     *        The request parameters for SendDataIntegrationEvent.
     * @return Result of the SendDataIntegrationEvent operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         Request would cause a service quota to be exceeded.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have the required privileges to perform this action.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @sample AWSSupplyChain.SendDataIntegrationEvent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/supplychain-2024-01-01/SendDataIntegrationEvent"
     *      target="_top">AWS API Documentation</a>
     */
    SendDataIntegrationEventResult sendDataIntegrationEvent(SendDataIntegrationEventRequest sendDataIntegrationEventRequest);

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
