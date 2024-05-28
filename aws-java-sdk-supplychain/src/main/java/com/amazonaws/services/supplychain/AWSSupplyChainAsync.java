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

import com.amazonaws.services.supplychain.model.*;

/**
 * Interface for accessing AWS Supply Chain asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.supplychain.AbstractAWSSupplyChainAsync} instead.
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
public interface AWSSupplyChainAsync extends AWSSupplyChain {

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
     * @return A Java Future containing the result of the CreateBillOfMaterialsImportJob operation returned by the
     *         service.
     * @sample AWSSupplyChainAsync.CreateBillOfMaterialsImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/supplychain-2024-01-01/CreateBillOfMaterialsImportJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateBillOfMaterialsImportJobResult> createBillOfMaterialsImportJobAsync(
            CreateBillOfMaterialsImportJobRequest createBillOfMaterialsImportJobRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateBillOfMaterialsImportJob operation returned by the
     *         service.
     * @sample AWSSupplyChainAsyncHandler.CreateBillOfMaterialsImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/supplychain-2024-01-01/CreateBillOfMaterialsImportJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateBillOfMaterialsImportJobResult> createBillOfMaterialsImportJobAsync(
            CreateBillOfMaterialsImportJobRequest createBillOfMaterialsImportJobRequest,
            com.amazonaws.handlers.AsyncHandler<CreateBillOfMaterialsImportJobRequest, CreateBillOfMaterialsImportJobResult> asyncHandler);

    /**
     * <p>
     * Get status and details of a BillOfMaterialsImportJob.
     * </p>
     * 
     * @param getBillOfMaterialsImportJobRequest
     *        The request parameters for GetBillOfMaterialsImportJob.
     * @return A Java Future containing the result of the GetBillOfMaterialsImportJob operation returned by the service.
     * @sample AWSSupplyChainAsync.GetBillOfMaterialsImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/supplychain-2024-01-01/GetBillOfMaterialsImportJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetBillOfMaterialsImportJobResult> getBillOfMaterialsImportJobAsync(
            GetBillOfMaterialsImportJobRequest getBillOfMaterialsImportJobRequest);

    /**
     * <p>
     * Get status and details of a BillOfMaterialsImportJob.
     * </p>
     * 
     * @param getBillOfMaterialsImportJobRequest
     *        The request parameters for GetBillOfMaterialsImportJob.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetBillOfMaterialsImportJob operation returned by the service.
     * @sample AWSSupplyChainAsyncHandler.GetBillOfMaterialsImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/supplychain-2024-01-01/GetBillOfMaterialsImportJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetBillOfMaterialsImportJobResult> getBillOfMaterialsImportJobAsync(
            GetBillOfMaterialsImportJobRequest getBillOfMaterialsImportJobRequest,
            com.amazonaws.handlers.AsyncHandler<GetBillOfMaterialsImportJobRequest, GetBillOfMaterialsImportJobResult> asyncHandler);

    /**
     * <p>
     * Send transactional data events with real-time data for analysis or monitoring.
     * </p>
     * 
     * @param sendDataIntegrationEventRequest
     *        The request parameters for SendDataIntegrationEvent.
     * @return A Java Future containing the result of the SendDataIntegrationEvent operation returned by the service.
     * @sample AWSSupplyChainAsync.SendDataIntegrationEvent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/supplychain-2024-01-01/SendDataIntegrationEvent"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SendDataIntegrationEventResult> sendDataIntegrationEventAsync(SendDataIntegrationEventRequest sendDataIntegrationEventRequest);

    /**
     * <p>
     * Send transactional data events with real-time data for analysis or monitoring.
     * </p>
     * 
     * @param sendDataIntegrationEventRequest
     *        The request parameters for SendDataIntegrationEvent.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SendDataIntegrationEvent operation returned by the service.
     * @sample AWSSupplyChainAsyncHandler.SendDataIntegrationEvent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/supplychain-2024-01-01/SendDataIntegrationEvent"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SendDataIntegrationEventResult> sendDataIntegrationEventAsync(SendDataIntegrationEventRequest sendDataIntegrationEventRequest,
            com.amazonaws.handlers.AsyncHandler<SendDataIntegrationEventRequest, SendDataIntegrationEventResult> asyncHandler);

}
