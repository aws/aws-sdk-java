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
 * Service Quotas is a web service that you can use to manage many of your AWS service quotas. Quotas, also referred to
 * as limits, are the maximum values for a resource, item, or operation. This guide provide descriptions of the Service
 * Quotas actions that you can call from an API. For the Service Quotas user guide, which explains how to use Service
 * Quotas from the console, see <a href="https://docs.aws.amazon.com/servicequotas/latest/userguide/intro.html">What is
 * Service Quotas</a>.
 * </p>
 * <note>
 * <p>
 * AWS provides SDKs that consist of libraries and sample code for programming languages and platforms (Java, Ruby,
 * .NET, iOS, Android, etc...,). The SDKs provide a convenient way to create programmatic access to Service Quotas and
 * AWS. For information about the AWS SDKs, including how to download and install them, see the <a
 * href="https://docs.aws.amazon.com/aws.amazon.com/tools">Tools for Amazon Web Services</a> page.
 * </p>
 * </note>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSServiceQuotasAsync extends AWSServiceQuotas {

    /**
     * <p>
     * Associates the Service Quotas template with your organization so that when new accounts are created in your
     * organization, the template submits increase requests for the specified service quotas. Use the Service Quotas
     * template to request an increase for any adjustable quota value. After you define the Service Quotas template, use
     * this operation to associate, or enable, the template.
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
     * Associates the Service Quotas template with your organization so that when new accounts are created in your
     * organization, the template submits increase requests for the specified service quotas. Use the Service Quotas
     * template to request an increase for any adjustable quota value. After you define the Service Quotas template, use
     * this operation to associate, or enable, the template.
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
     * Removes a service quota increase request from the Service Quotas template.
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
     * Removes a service quota increase request from the Service Quotas template.
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
     * Disables the Service Quotas template. Once the template is disabled, it does not request quota increases for new
     * accounts in your organization. Disabling the quota template does not apply the quota increase requests from the
     * template.
     * </p>
     * <p>
     * <b>Related operations</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * To enable the quota template, call <a>AssociateServiceQuotaTemplate</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To delete a specific service quota from the template, use <a>DeleteServiceQuotaIncreaseRequestFromTemplate</a>.
     * </p>
     * </li>
     * </ul>
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
     * Disables the Service Quotas template. Once the template is disabled, it does not request quota increases for new
     * accounts in your organization. Disabling the quota template does not apply the quota increase requests from the
     * template.
     * </p>
     * <p>
     * <b>Related operations</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * To enable the quota template, call <a>AssociateServiceQuotaTemplate</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To delete a specific service quota from the template, use <a>DeleteServiceQuotaIncreaseRequestFromTemplate</a>.
     * </p>
     * </li>
     * </ul>
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
     * Retrieves the default service quotas values. The Value returned for each quota is the AWS default value, even if
     * the quotas have been increased..
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
     * Retrieves the default service quotas values. The Value returned for each quota is the AWS default value, even if
     * the quotas have been increased..
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
     * Retrieves the <code>ServiceQuotaTemplateAssociationStatus</code> value from the service. Use this action to
     * determine if the Service Quota template is associated, or enabled.
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
     * Retrieves the <code>ServiceQuotaTemplateAssociationStatus</code> value from the service. Use this action to
     * determine if the Service Quota template is associated, or enabled.
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
     * Retrieves the details for a particular increase request.
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
     * Retrieves the details for a particular increase request.
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
     * Returns the details for the specified service quota. This operation provides a different Value than the
     * <code>GetAWSDefaultServiceQuota</code> operation. This operation returns the applied value for each quota.
     * <code>GetAWSDefaultServiceQuota</code> returns the default AWS value for each quota.
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
     * Returns the details for the specified service quota. This operation provides a different Value than the
     * <code>GetAWSDefaultServiceQuota</code> operation. This operation returns the applied value for each quota.
     * <code>GetAWSDefaultServiceQuota</code> returns the default AWS value for each quota.
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
     * Returns the details of the service quota increase request in your template.
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
     * Returns the details of the service quota increase request in your template.
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
     * Lists all default service quotas for the specified AWS service or all AWS services. ListAWSDefaultServiceQuotas
     * is similar to <a>ListServiceQuotas</a> except for the Value object. The Value object returned by
     * <code>ListAWSDefaultServiceQuotas</code> is the default value assigned by AWS. This request returns a list of all
     * service quotas for the specified service. The listing of each you'll see the default values are the values that
     * AWS provides for the quotas.
     * </p>
     * <note>
     * <p>
     * Always check the <code>NextToken</code> response parameter when calling any of the <code>List*</code> operations.
     * These operations can return an unexpected list of results, even when there are more results available. When this
     * happens, the <code>NextToken</code> response parameter contains a value to pass the next call to the same API to
     * request the next part of the list.
     * </p>
     * </note>
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
     * Lists all default service quotas for the specified AWS service or all AWS services. ListAWSDefaultServiceQuotas
     * is similar to <a>ListServiceQuotas</a> except for the Value object. The Value object returned by
     * <code>ListAWSDefaultServiceQuotas</code> is the default value assigned by AWS. This request returns a list of all
     * service quotas for the specified service. The listing of each you'll see the default values are the values that
     * AWS provides for the quotas.
     * </p>
     * <note>
     * <p>
     * Always check the <code>NextToken</code> response parameter when calling any of the <code>List*</code> operations.
     * These operations can return an unexpected list of results, even when there are more results available. When this
     * happens, the <code>NextToken</code> response parameter contains a value to pass the next call to the same API to
     * request the next part of the list.
     * </p>
     * </note>
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
     * Requests a list of the changes to quotas for a service.
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
     * Requests a list of the changes to quotas for a service.
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
     * Requests a list of the changes to specific service quotas. This command provides additional granularity over the
     * <code>ListRequestedServiceQuotaChangeHistory</code> command. Once a quota change request has reached
     * <code>CASE_CLOSED, APPROVED,</code> or <code>DENIED</code>, the history has been kept for 90 days.
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
     * Requests a list of the changes to specific service quotas. This command provides additional granularity over the
     * <code>ListRequestedServiceQuotaChangeHistory</code> command. Once a quota change request has reached
     * <code>CASE_CLOSED, APPROVED,</code> or <code>DENIED</code>, the history has been kept for 90 days.
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
     * Returns a list of the quota increase requests in the template.
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
     * Returns a list of the quota increase requests in the template.
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
     * Lists all service quotas for the specified AWS service. This request returns a list of the service quotas for the
     * specified service. you'll see the default values are the values that AWS provides for the quotas.
     * </p>
     * <note>
     * <p>
     * Always check the <code>NextToken</code> response parameter when calling any of the <code>List*</code> operations.
     * These operations can return an unexpected list of results, even when there are more results available. When this
     * happens, the <code>NextToken</code> response parameter contains a value to pass the next call to the same API to
     * request the next part of the list.
     * </p>
     * </note>
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
     * Lists all service quotas for the specified AWS service. This request returns a list of the service quotas for the
     * specified service. you'll see the default values are the values that AWS provides for the quotas.
     * </p>
     * <note>
     * <p>
     * Always check the <code>NextToken</code> response parameter when calling any of the <code>List*</code> operations.
     * These operations can return an unexpected list of results, even when there are more results available. When this
     * happens, the <code>NextToken</code> response parameter contains a value to pass the next call to the same API to
     * request the next part of the list.
     * </p>
     * </note>
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
     * Lists the AWS services available in Service Quotas. Not all AWS services are available in Service Quotas. To list
     * the see the list of the service quotas for a specific service, use <a>ListServiceQuotas</a>.
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
     * Lists the AWS services available in Service Quotas. Not all AWS services are available in Service Quotas. To list
     * the see the list of the service quotas for a specific service, use <a>ListServiceQuotas</a>.
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
     * Defines and adds a quota to the service quota template. To add a quota to the template, you must provide the
     * <code>ServiceCode</code>, <code>QuotaCode</code>, <code>AwsRegion</code>, and <code>DesiredValue</code>. Once you
     * add a quota to the template, use <a>ListServiceQuotaIncreaseRequestsInTemplate</a> to see the list of quotas in
     * the template.
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
     * Defines and adds a quota to the service quota template. To add a quota to the template, you must provide the
     * <code>ServiceCode</code>, <code>QuotaCode</code>, <code>AwsRegion</code>, and <code>DesiredValue</code>. Once you
     * add a quota to the template, use <a>ListServiceQuotaIncreaseRequestsInTemplate</a> to see the list of quotas in
     * the template.
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
     * Retrieves the details of a service quota increase request. The response to this command provides the details in
     * the <a>RequestedServiceQuotaChange</a> object.
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
     * Retrieves the details of a service quota increase request. The response to this command provides the details in
     * the <a>RequestedServiceQuotaChange</a> object.
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

}
