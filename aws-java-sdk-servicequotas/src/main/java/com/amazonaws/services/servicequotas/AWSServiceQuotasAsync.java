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
package com.amazonaws.services.servicequotas;

import javax.annotation.Generated;

import com.amazonaws.services.servicequotas.model.*;

/**
 * Interface for accessing Service Quotas asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.servicequotas.AbstractAWSServiceQuotasAsync} instead.
 * </p>
 * <p>
 * <p>
 * With Service Quotas, you can view and manage your quotas easily as your AWS workloads grow. Quotas, also referred to
 * as limits, are the maximum number of resources that you can create in your AWS account. For more information, see the
 * <a href="https://docs.aws.amazon.com/servicequotas/latest/userguide/">Service Quotas User Guide</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSServiceQuotasAsync extends AWSServiceQuotas {

    /**
     * <p>
     * Associates your quota request template with your organization. When a new account is created in your
     * organization, the quota increase requests in the template are automatically applied to the account. You can add a
     * quota increase request for any adjustable quota to your template.
     * </p>
     * 
     * @param associateServiceQuotaTemplateRequest
     * @return A Java Future containing the result of the AssociateServiceQuotaTemplate operation returned by the
     *         service.
     * @sample AWSServiceQuotasAsync.AssociateServiceQuotaTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/AssociateServiceQuotaTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateServiceQuotaTemplateResult> associateServiceQuotaTemplateAsync(
            AssociateServiceQuotaTemplateRequest associateServiceQuotaTemplateRequest);

    /**
     * <p>
     * Associates your quota request template with your organization. When a new account is created in your
     * organization, the quota increase requests in the template are automatically applied to the account. You can add a
     * quota increase request for any adjustable quota to your template.
     * </p>
     * 
     * @param associateServiceQuotaTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateServiceQuotaTemplate operation returned by the
     *         service.
     * @sample AWSServiceQuotasAsyncHandler.AssociateServiceQuotaTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/AssociateServiceQuotaTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateServiceQuotaTemplateResult> associateServiceQuotaTemplateAsync(
            AssociateServiceQuotaTemplateRequest associateServiceQuotaTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateServiceQuotaTemplateRequest, AssociateServiceQuotaTemplateResult> asyncHandler);

    /**
     * <p>
     * Deletes the quota increase request for the specified quota from your quota request template.
     * </p>
     * 
     * @param deleteServiceQuotaIncreaseRequestFromTemplateRequest
     * @return A Java Future containing the result of the DeleteServiceQuotaIncreaseRequestFromTemplate operation
     *         returned by the service.
     * @sample AWSServiceQuotasAsync.DeleteServiceQuotaIncreaseRequestFromTemplate
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/DeleteServiceQuotaIncreaseRequestFromTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteServiceQuotaIncreaseRequestFromTemplateResult> deleteServiceQuotaIncreaseRequestFromTemplateAsync(
            DeleteServiceQuotaIncreaseRequestFromTemplateRequest deleteServiceQuotaIncreaseRequestFromTemplateRequest);

    /**
     * <p>
     * Deletes the quota increase request for the specified quota from your quota request template.
     * </p>
     * 
     * @param deleteServiceQuotaIncreaseRequestFromTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteServiceQuotaIncreaseRequestFromTemplate operation
     *         returned by the service.
     * @sample AWSServiceQuotasAsyncHandler.DeleteServiceQuotaIncreaseRequestFromTemplate
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/DeleteServiceQuotaIncreaseRequestFromTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteServiceQuotaIncreaseRequestFromTemplateResult> deleteServiceQuotaIncreaseRequestFromTemplateAsync(
            DeleteServiceQuotaIncreaseRequestFromTemplateRequest deleteServiceQuotaIncreaseRequestFromTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteServiceQuotaIncreaseRequestFromTemplateRequest, DeleteServiceQuotaIncreaseRequestFromTemplateResult> asyncHandler);

    /**
     * <p>
     * Disables your quota request template. After a template is disabled, the quota increase requests in the template
     * are not applied to new accounts in your organization. Disabling a quota request template does not apply its quota
     * increase requests.
     * </p>
     * 
     * @param disassociateServiceQuotaTemplateRequest
     * @return A Java Future containing the result of the DisassociateServiceQuotaTemplate operation returned by the
     *         service.
     * @sample AWSServiceQuotasAsync.DisassociateServiceQuotaTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/DisassociateServiceQuotaTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateServiceQuotaTemplateResult> disassociateServiceQuotaTemplateAsync(
            DisassociateServiceQuotaTemplateRequest disassociateServiceQuotaTemplateRequest);

    /**
     * <p>
     * Disables your quota request template. After a template is disabled, the quota increase requests in the template
     * are not applied to new accounts in your organization. Disabling a quota request template does not apply its quota
     * increase requests.
     * </p>
     * 
     * @param disassociateServiceQuotaTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateServiceQuotaTemplate operation returned by the
     *         service.
     * @sample AWSServiceQuotasAsyncHandler.DisassociateServiceQuotaTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/DisassociateServiceQuotaTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateServiceQuotaTemplateResult> disassociateServiceQuotaTemplateAsync(
            DisassociateServiceQuotaTemplateRequest disassociateServiceQuotaTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateServiceQuotaTemplateRequest, DisassociateServiceQuotaTemplateResult> asyncHandler);

    /**
     * <p>
     * Retrieves the default value for the specified quota. The default value does not reflect any quota increases.
     * </p>
     * 
     * @param getAWSDefaultServiceQuotaRequest
     * @return A Java Future containing the result of the GetAWSDefaultServiceQuota operation returned by the service.
     * @sample AWSServiceQuotasAsync.GetAWSDefaultServiceQuota
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/GetAWSDefaultServiceQuota"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAWSDefaultServiceQuotaResult> getAWSDefaultServiceQuotaAsync(
            GetAWSDefaultServiceQuotaRequest getAWSDefaultServiceQuotaRequest);

    /**
     * <p>
     * Retrieves the default value for the specified quota. The default value does not reflect any quota increases.
     * </p>
     * 
     * @param getAWSDefaultServiceQuotaRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAWSDefaultServiceQuota operation returned by the service.
     * @sample AWSServiceQuotasAsyncHandler.GetAWSDefaultServiceQuota
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/GetAWSDefaultServiceQuota"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAWSDefaultServiceQuotaResult> getAWSDefaultServiceQuotaAsync(
            GetAWSDefaultServiceQuotaRequest getAWSDefaultServiceQuotaRequest,
            com.amazonaws.handlers.AsyncHandler<GetAWSDefaultServiceQuotaRequest, GetAWSDefaultServiceQuotaResult> asyncHandler);

    /**
     * <p>
     * Retrieves the status of the association for the quota request template.
     * </p>
     * 
     * @param getAssociationForServiceQuotaTemplateRequest
     * @return A Java Future containing the result of the GetAssociationForServiceQuotaTemplate operation returned by
     *         the service.
     * @sample AWSServiceQuotasAsync.GetAssociationForServiceQuotaTemplate
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/GetAssociationForServiceQuotaTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAssociationForServiceQuotaTemplateResult> getAssociationForServiceQuotaTemplateAsync(
            GetAssociationForServiceQuotaTemplateRequest getAssociationForServiceQuotaTemplateRequest);

    /**
     * <p>
     * Retrieves the status of the association for the quota request template.
     * </p>
     * 
     * @param getAssociationForServiceQuotaTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAssociationForServiceQuotaTemplate operation returned by
     *         the service.
     * @sample AWSServiceQuotasAsyncHandler.GetAssociationForServiceQuotaTemplate
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/GetAssociationForServiceQuotaTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAssociationForServiceQuotaTemplateResult> getAssociationForServiceQuotaTemplateAsync(
            GetAssociationForServiceQuotaTemplateRequest getAssociationForServiceQuotaTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<GetAssociationForServiceQuotaTemplateRequest, GetAssociationForServiceQuotaTemplateResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about the specified quota increase request.
     * </p>
     * 
     * @param getRequestedServiceQuotaChangeRequest
     * @return A Java Future containing the result of the GetRequestedServiceQuotaChange operation returned by the
     *         service.
     * @sample AWSServiceQuotasAsync.GetRequestedServiceQuotaChange
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/GetRequestedServiceQuotaChange"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRequestedServiceQuotaChangeResult> getRequestedServiceQuotaChangeAsync(
            GetRequestedServiceQuotaChangeRequest getRequestedServiceQuotaChangeRequest);

    /**
     * <p>
     * Retrieves information about the specified quota increase request.
     * </p>
     * 
     * @param getRequestedServiceQuotaChangeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRequestedServiceQuotaChange operation returned by the
     *         service.
     * @sample AWSServiceQuotasAsyncHandler.GetRequestedServiceQuotaChange
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/GetRequestedServiceQuotaChange"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRequestedServiceQuotaChangeResult> getRequestedServiceQuotaChangeAsync(
            GetRequestedServiceQuotaChangeRequest getRequestedServiceQuotaChangeRequest,
            com.amazonaws.handlers.AsyncHandler<GetRequestedServiceQuotaChangeRequest, GetRequestedServiceQuotaChangeResult> asyncHandler);

    /**
     * <p>
     * Retrieves the applied quota value for the specified quota. For some quotas, only the default values are
     * available. If the applied quota value is not available for a quota, the quota is not retrieved.
     * </p>
     * 
     * @param getServiceQuotaRequest
     * @return A Java Future containing the result of the GetServiceQuota operation returned by the service.
     * @sample AWSServiceQuotasAsync.GetServiceQuota
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/GetServiceQuota" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetServiceQuotaResult> getServiceQuotaAsync(GetServiceQuotaRequest getServiceQuotaRequest);

    /**
     * <p>
     * Retrieves the applied quota value for the specified quota. For some quotas, only the default values are
     * available. If the applied quota value is not available for a quota, the quota is not retrieved.
     * </p>
     * 
     * @param getServiceQuotaRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetServiceQuota operation returned by the service.
     * @sample AWSServiceQuotasAsyncHandler.GetServiceQuota
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/GetServiceQuota" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetServiceQuotaResult> getServiceQuotaAsync(GetServiceQuotaRequest getServiceQuotaRequest,
            com.amazonaws.handlers.AsyncHandler<GetServiceQuotaRequest, GetServiceQuotaResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about the specified quota increase request in your quota request template.
     * </p>
     * 
     * @param getServiceQuotaIncreaseRequestFromTemplateRequest
     * @return A Java Future containing the result of the GetServiceQuotaIncreaseRequestFromTemplate operation returned
     *         by the service.
     * @sample AWSServiceQuotasAsync.GetServiceQuotaIncreaseRequestFromTemplate
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/GetServiceQuotaIncreaseRequestFromTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetServiceQuotaIncreaseRequestFromTemplateResult> getServiceQuotaIncreaseRequestFromTemplateAsync(
            GetServiceQuotaIncreaseRequestFromTemplateRequest getServiceQuotaIncreaseRequestFromTemplateRequest);

    /**
     * <p>
     * Retrieves information about the specified quota increase request in your quota request template.
     * </p>
     * 
     * @param getServiceQuotaIncreaseRequestFromTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetServiceQuotaIncreaseRequestFromTemplate operation returned
     *         by the service.
     * @sample AWSServiceQuotasAsyncHandler.GetServiceQuotaIncreaseRequestFromTemplate
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/GetServiceQuotaIncreaseRequestFromTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetServiceQuotaIncreaseRequestFromTemplateResult> getServiceQuotaIncreaseRequestFromTemplateAsync(
            GetServiceQuotaIncreaseRequestFromTemplateRequest getServiceQuotaIncreaseRequestFromTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<GetServiceQuotaIncreaseRequestFromTemplateRequest, GetServiceQuotaIncreaseRequestFromTemplateResult> asyncHandler);

    /**
     * <p>
     * Lists the default values for the quotas for the specified AWS service. A default value does not reflect any quota
     * increases.
     * </p>
     * 
     * @param listAWSDefaultServiceQuotasRequest
     * @return A Java Future containing the result of the ListAWSDefaultServiceQuotas operation returned by the service.
     * @sample AWSServiceQuotasAsync.ListAWSDefaultServiceQuotas
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/ListAWSDefaultServiceQuotas"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAWSDefaultServiceQuotasResult> listAWSDefaultServiceQuotasAsync(
            ListAWSDefaultServiceQuotasRequest listAWSDefaultServiceQuotasRequest);

    /**
     * <p>
     * Lists the default values for the quotas for the specified AWS service. A default value does not reflect any quota
     * increases.
     * </p>
     * 
     * @param listAWSDefaultServiceQuotasRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAWSDefaultServiceQuotas operation returned by the service.
     * @sample AWSServiceQuotasAsyncHandler.ListAWSDefaultServiceQuotas
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/ListAWSDefaultServiceQuotas"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAWSDefaultServiceQuotasResult> listAWSDefaultServiceQuotasAsync(
            ListAWSDefaultServiceQuotasRequest listAWSDefaultServiceQuotasRequest,
            com.amazonaws.handlers.AsyncHandler<ListAWSDefaultServiceQuotasRequest, ListAWSDefaultServiceQuotasResult> asyncHandler);

    /**
     * <p>
     * Retrieves the quota increase requests for the specified service.
     * </p>
     * 
     * @param listRequestedServiceQuotaChangeHistoryRequest
     * @return A Java Future containing the result of the ListRequestedServiceQuotaChangeHistory operation returned by
     *         the service.
     * @sample AWSServiceQuotasAsync.ListRequestedServiceQuotaChangeHistory
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/ListRequestedServiceQuotaChangeHistory"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListRequestedServiceQuotaChangeHistoryResult> listRequestedServiceQuotaChangeHistoryAsync(
            ListRequestedServiceQuotaChangeHistoryRequest listRequestedServiceQuotaChangeHistoryRequest);

    /**
     * <p>
     * Retrieves the quota increase requests for the specified service.
     * </p>
     * 
     * @param listRequestedServiceQuotaChangeHistoryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRequestedServiceQuotaChangeHistory operation returned by
     *         the service.
     * @sample AWSServiceQuotasAsyncHandler.ListRequestedServiceQuotaChangeHistory
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/ListRequestedServiceQuotaChangeHistory"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListRequestedServiceQuotaChangeHistoryResult> listRequestedServiceQuotaChangeHistoryAsync(
            ListRequestedServiceQuotaChangeHistoryRequest listRequestedServiceQuotaChangeHistoryRequest,
            com.amazonaws.handlers.AsyncHandler<ListRequestedServiceQuotaChangeHistoryRequest, ListRequestedServiceQuotaChangeHistoryResult> asyncHandler);

    /**
     * <p>
     * Retrieves the quota increase requests for the specified quota.
     * </p>
     * 
     * @param listRequestedServiceQuotaChangeHistoryByQuotaRequest
     * @return A Java Future containing the result of the ListRequestedServiceQuotaChangeHistoryByQuota operation
     *         returned by the service.
     * @sample AWSServiceQuotasAsync.ListRequestedServiceQuotaChangeHistoryByQuota
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/ListRequestedServiceQuotaChangeHistoryByQuota"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListRequestedServiceQuotaChangeHistoryByQuotaResult> listRequestedServiceQuotaChangeHistoryByQuotaAsync(
            ListRequestedServiceQuotaChangeHistoryByQuotaRequest listRequestedServiceQuotaChangeHistoryByQuotaRequest);

    /**
     * <p>
     * Retrieves the quota increase requests for the specified quota.
     * </p>
     * 
     * @param listRequestedServiceQuotaChangeHistoryByQuotaRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRequestedServiceQuotaChangeHistoryByQuota operation
     *         returned by the service.
     * @sample AWSServiceQuotasAsyncHandler.ListRequestedServiceQuotaChangeHistoryByQuota
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/ListRequestedServiceQuotaChangeHistoryByQuota"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListRequestedServiceQuotaChangeHistoryByQuotaResult> listRequestedServiceQuotaChangeHistoryByQuotaAsync(
            ListRequestedServiceQuotaChangeHistoryByQuotaRequest listRequestedServiceQuotaChangeHistoryByQuotaRequest,
            com.amazonaws.handlers.AsyncHandler<ListRequestedServiceQuotaChangeHistoryByQuotaRequest, ListRequestedServiceQuotaChangeHistoryByQuotaResult> asyncHandler);

    /**
     * <p>
     * Lists the quota increase requests in the specified quota request template.
     * </p>
     * 
     * @param listServiceQuotaIncreaseRequestsInTemplateRequest
     * @return A Java Future containing the result of the ListServiceQuotaIncreaseRequestsInTemplate operation returned
     *         by the service.
     * @sample AWSServiceQuotasAsync.ListServiceQuotaIncreaseRequestsInTemplate
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/ListServiceQuotaIncreaseRequestsInTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListServiceQuotaIncreaseRequestsInTemplateResult> listServiceQuotaIncreaseRequestsInTemplateAsync(
            ListServiceQuotaIncreaseRequestsInTemplateRequest listServiceQuotaIncreaseRequestsInTemplateRequest);

    /**
     * <p>
     * Lists the quota increase requests in the specified quota request template.
     * </p>
     * 
     * @param listServiceQuotaIncreaseRequestsInTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListServiceQuotaIncreaseRequestsInTemplate operation returned
     *         by the service.
     * @sample AWSServiceQuotasAsyncHandler.ListServiceQuotaIncreaseRequestsInTemplate
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/ListServiceQuotaIncreaseRequestsInTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListServiceQuotaIncreaseRequestsInTemplateResult> listServiceQuotaIncreaseRequestsInTemplateAsync(
            ListServiceQuotaIncreaseRequestsInTemplateRequest listServiceQuotaIncreaseRequestsInTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<ListServiceQuotaIncreaseRequestsInTemplateRequest, ListServiceQuotaIncreaseRequestsInTemplateResult> asyncHandler);

    /**
     * <p>
     * Lists the applied quota values for the specified AWS service. For some quotas, only the default values are
     * available. If the applied quota value is not available for a quota, the quota is not retrieved.
     * </p>
     * 
     * @param listServiceQuotasRequest
     * @return A Java Future containing the result of the ListServiceQuotas operation returned by the service.
     * @sample AWSServiceQuotasAsync.ListServiceQuotas
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/ListServiceQuotas"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListServiceQuotasResult> listServiceQuotasAsync(ListServiceQuotasRequest listServiceQuotasRequest);

    /**
     * <p>
     * Lists the applied quota values for the specified AWS service. For some quotas, only the default values are
     * available. If the applied quota value is not available for a quota, the quota is not retrieved.
     * </p>
     * 
     * @param listServiceQuotasRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListServiceQuotas operation returned by the service.
     * @sample AWSServiceQuotasAsyncHandler.ListServiceQuotas
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/ListServiceQuotas"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListServiceQuotasResult> listServiceQuotasAsync(ListServiceQuotasRequest listServiceQuotasRequest,
            com.amazonaws.handlers.AsyncHandler<ListServiceQuotasRequest, ListServiceQuotasResult> asyncHandler);

    /**
     * <p>
     * Lists the names and codes for the services integrated with Service Quotas.
     * </p>
     * 
     * @param listServicesRequest
     * @return A Java Future containing the result of the ListServices operation returned by the service.
     * @sample AWSServiceQuotasAsync.ListServices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/ListServices" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListServicesResult> listServicesAsync(ListServicesRequest listServicesRequest);

    /**
     * <p>
     * Lists the names and codes for the services integrated with Service Quotas.
     * </p>
     * 
     * @param listServicesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListServices operation returned by the service.
     * @sample AWSServiceQuotasAsyncHandler.ListServices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/ListServices" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListServicesResult> listServicesAsync(ListServicesRequest listServicesRequest,
            com.amazonaws.handlers.AsyncHandler<ListServicesRequest, ListServicesResult> asyncHandler);

    /**
     * <p>
     * Returns a list of the tags assigned to the specified applied quota.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSServiceQuotasAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Returns a list of the tags assigned to the specified applied quota.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSServiceQuotasAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Adds a quota increase request to your quota request template.
     * </p>
     * 
     * @param putServiceQuotaIncreaseRequestIntoTemplateRequest
     * @return A Java Future containing the result of the PutServiceQuotaIncreaseRequestIntoTemplate operation returned
     *         by the service.
     * @sample AWSServiceQuotasAsync.PutServiceQuotaIncreaseRequestIntoTemplate
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/PutServiceQuotaIncreaseRequestIntoTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutServiceQuotaIncreaseRequestIntoTemplateResult> putServiceQuotaIncreaseRequestIntoTemplateAsync(
            PutServiceQuotaIncreaseRequestIntoTemplateRequest putServiceQuotaIncreaseRequestIntoTemplateRequest);

    /**
     * <p>
     * Adds a quota increase request to your quota request template.
     * </p>
     * 
     * @param putServiceQuotaIncreaseRequestIntoTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutServiceQuotaIncreaseRequestIntoTemplate operation returned
     *         by the service.
     * @sample AWSServiceQuotasAsyncHandler.PutServiceQuotaIncreaseRequestIntoTemplate
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/PutServiceQuotaIncreaseRequestIntoTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutServiceQuotaIncreaseRequestIntoTemplateResult> putServiceQuotaIncreaseRequestIntoTemplateAsync(
            PutServiceQuotaIncreaseRequestIntoTemplateRequest putServiceQuotaIncreaseRequestIntoTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<PutServiceQuotaIncreaseRequestIntoTemplateRequest, PutServiceQuotaIncreaseRequestIntoTemplateResult> asyncHandler);

    /**
     * <p>
     * Submits a quota increase request for the specified quota.
     * </p>
     * 
     * @param requestServiceQuotaIncreaseRequest
     * @return A Java Future containing the result of the RequestServiceQuotaIncrease operation returned by the service.
     * @sample AWSServiceQuotasAsync.RequestServiceQuotaIncrease
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/RequestServiceQuotaIncrease"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RequestServiceQuotaIncreaseResult> requestServiceQuotaIncreaseAsync(
            RequestServiceQuotaIncreaseRequest requestServiceQuotaIncreaseRequest);

    /**
     * <p>
     * Submits a quota increase request for the specified quota.
     * </p>
     * 
     * @param requestServiceQuotaIncreaseRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RequestServiceQuotaIncrease operation returned by the service.
     * @sample AWSServiceQuotasAsyncHandler.RequestServiceQuotaIncrease
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/RequestServiceQuotaIncrease"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RequestServiceQuotaIncreaseResult> requestServiceQuotaIncreaseAsync(
            RequestServiceQuotaIncreaseRequest requestServiceQuotaIncreaseRequest,
            com.amazonaws.handlers.AsyncHandler<RequestServiceQuotaIncreaseRequest, RequestServiceQuotaIncreaseResult> asyncHandler);

    /**
     * <p>
     * Adds tags to the specified applied quota. You can include one or more tags to add to the quota.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSServiceQuotasAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds tags to the specified applied quota. You can include one or more tags to add to the quota.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSServiceQuotasAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes tags from the specified applied quota. You can specify one or more tags to remove.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSServiceQuotasAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes tags from the specified applied quota. You can specify one or more tags to remove.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSServiceQuotasAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

}
