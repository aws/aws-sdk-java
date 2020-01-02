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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.servicequotas.model.*;

/**
 * Interface for accessing Service Quotas.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.servicequotas.AbstractAWSServiceQuotas} instead.
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
public interface AWSServiceQuotas {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "servicequotas";

    /**
     * <p>
     * Associates the Service Quotas template with your organization so that when new accounts are created in your
     * organization, the template submits increase requests for the specified service quotas. Use the Service Quotas
     * template to request an increase for any adjustable quota value. After you define the Service Quotas template, use
     * this operation to associate, or enable, the template.
     * </p>
     * 
     * @param associateServiceQuotaTemplateRequest
     * @return Result of the AssociateServiceQuotaTemplate operation returned by the service.
     * @throws DependencyAccessDeniedException
     *         You can't perform this action because a dependency does not have access.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ServiceException
     *         Something went wrong.
     * @throws TooManyRequestsException
     *         Due to throttling, the request was denied. Slow down the rate of request calls, or request an increase
     *         for this quota.
     * @throws AWSServiceAccessNotEnabledException
     *         The action you attempted is not allowed unless Service Access with Service Quotas is enabled in your
     *         organization. To enable, call <a>AssociateServiceQuotaTemplate</a>.
     * @throws OrganizationNotInAllFeaturesModeException
     *         The organization that your account belongs to, is not in All Features mode. To enable all features mode,
     *         see <a href="https://docs.aws.amazon.com/organizations/latest/APIReference/API_EnableAllFeatures.html">
     *         EnableAllFeatures</a>.
     * @throws TemplatesNotAvailableInRegionException
     *         The Service Quotas template is not available in the Region where you are making the request. Please make
     *         the request in us-east-1.
     * @throws NoAvailableOrganizationException
     *         The account making this call is not a member of an organization.
     * @sample AWSServiceQuotas.AssociateServiceQuotaTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/AssociateServiceQuotaTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateServiceQuotaTemplateResult associateServiceQuotaTemplate(AssociateServiceQuotaTemplateRequest associateServiceQuotaTemplateRequest);

    /**
     * <p>
     * Removes a service quota increase request from the Service Quotas template.
     * </p>
     * 
     * @param deleteServiceQuotaIncreaseRequestFromTemplateRequest
     * @return Result of the DeleteServiceQuotaIncreaseRequestFromTemplate operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ServiceException
     *         Something went wrong.
     * @throws DependencyAccessDeniedException
     *         You can't perform this action because a dependency does not have access.
     * @throws TooManyRequestsException
     *         Due to throttling, the request was denied. Slow down the rate of request calls, or request an increase
     *         for this quota.
     * @throws NoSuchResourceException
     *         The specified resource does not exist.
     * @throws IllegalArgumentException
     *         Invalid input was provided.
     * @throws AWSServiceAccessNotEnabledException
     *         The action you attempted is not allowed unless Service Access with Service Quotas is enabled in your
     *         organization. To enable, call <a>AssociateServiceQuotaTemplate</a>.
     * @throws TemplatesNotAvailableInRegionException
     *         The Service Quotas template is not available in the Region where you are making the request. Please make
     *         the request in us-east-1.
     * @throws NoAvailableOrganizationException
     *         The account making this call is not a member of an organization.
     * @sample AWSServiceQuotas.DeleteServiceQuotaIncreaseRequestFromTemplate
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/DeleteServiceQuotaIncreaseRequestFromTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteServiceQuotaIncreaseRequestFromTemplateResult deleteServiceQuotaIncreaseRequestFromTemplate(
            DeleteServiceQuotaIncreaseRequestFromTemplateRequest deleteServiceQuotaIncreaseRequestFromTemplateRequest);

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
     * @return Result of the DisassociateServiceQuotaTemplate operation returned by the service.
     * @throws DependencyAccessDeniedException
     *         You can't perform this action because a dependency does not have access.
     * @throws ServiceQuotaTemplateNotInUseException
     *         The quota request template is not associated with your organization. </p>
     *         <p>
     *         To use the template, call <a>AssociateServiceQuotaTemplate</a>.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ServiceException
     *         Something went wrong.
     * @throws TooManyRequestsException
     *         Due to throttling, the request was denied. Slow down the rate of request calls, or request an increase
     *         for this quota.
     * @throws AWSServiceAccessNotEnabledException
     *         The action you attempted is not allowed unless Service Access with Service Quotas is enabled in your
     *         organization. To enable, call <a>AssociateServiceQuotaTemplate</a>.
     * @throws TemplatesNotAvailableInRegionException
     *         The Service Quotas template is not available in the Region where you are making the request. Please make
     *         the request in us-east-1.
     * @throws NoAvailableOrganizationException
     *         The account making this call is not a member of an organization.
     * @sample AWSServiceQuotas.DisassociateServiceQuotaTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/DisassociateServiceQuotaTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateServiceQuotaTemplateResult disassociateServiceQuotaTemplate(DisassociateServiceQuotaTemplateRequest disassociateServiceQuotaTemplateRequest);

    /**
     * <p>
     * Retrieves the default service quotas values. The Value returned for each quota is the AWS default value, even if
     * the quotas have been increased..
     * </p>
     * 
     * @param getAWSDefaultServiceQuotaRequest
     * @return Result of the GetAWSDefaultServiceQuota operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws NoSuchResourceException
     *         The specified resource does not exist.
     * @throws IllegalArgumentException
     *         Invalid input was provided.
     * @throws ServiceException
     *         Something went wrong.
     * @throws TooManyRequestsException
     *         Due to throttling, the request was denied. Slow down the rate of request calls, or request an increase
     *         for this quota.
     * @sample AWSServiceQuotas.GetAWSDefaultServiceQuota
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/GetAWSDefaultServiceQuota"
     *      target="_top">AWS API Documentation</a>
     */
    GetAWSDefaultServiceQuotaResult getAWSDefaultServiceQuota(GetAWSDefaultServiceQuotaRequest getAWSDefaultServiceQuotaRequest);

    /**
     * <p>
     * Retrieves the <code>ServiceQuotaTemplateAssociationStatus</code> value from the service. Use this action to
     * determine if the Service Quota template is associated, or enabled.
     * </p>
     * 
     * @param getAssociationForServiceQuotaTemplateRequest
     * @return Result of the GetAssociationForServiceQuotaTemplate operation returned by the service.
     * @throws DependencyAccessDeniedException
     *         You can't perform this action because a dependency does not have access.
     * @throws ServiceQuotaTemplateNotInUseException
     *         The quota request template is not associated with your organization. </p>
     *         <p>
     *         To use the template, call <a>AssociateServiceQuotaTemplate</a>.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ServiceException
     *         Something went wrong.
     * @throws TooManyRequestsException
     *         Due to throttling, the request was denied. Slow down the rate of request calls, or request an increase
     *         for this quota.
     * @throws AWSServiceAccessNotEnabledException
     *         The action you attempted is not allowed unless Service Access with Service Quotas is enabled in your
     *         organization. To enable, call <a>AssociateServiceQuotaTemplate</a>.
     * @throws TemplatesNotAvailableInRegionException
     *         The Service Quotas template is not available in the Region where you are making the request. Please make
     *         the request in us-east-1.
     * @throws NoAvailableOrganizationException
     *         The account making this call is not a member of an organization.
     * @sample AWSServiceQuotas.GetAssociationForServiceQuotaTemplate
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/GetAssociationForServiceQuotaTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    GetAssociationForServiceQuotaTemplateResult getAssociationForServiceQuotaTemplate(
            GetAssociationForServiceQuotaTemplateRequest getAssociationForServiceQuotaTemplateRequest);

    /**
     * <p>
     * Retrieves the details for a particular increase request.
     * </p>
     * 
     * @param getRequestedServiceQuotaChangeRequest
     * @return Result of the GetRequestedServiceQuotaChange operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws NoSuchResourceException
     *         The specified resource does not exist.
     * @throws IllegalArgumentException
     *         Invalid input was provided.
     * @throws ServiceException
     *         Something went wrong.
     * @throws TooManyRequestsException
     *         Due to throttling, the request was denied. Slow down the rate of request calls, or request an increase
     *         for this quota.
     * @sample AWSServiceQuotas.GetRequestedServiceQuotaChange
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/GetRequestedServiceQuotaChange"
     *      target="_top">AWS API Documentation</a>
     */
    GetRequestedServiceQuotaChangeResult getRequestedServiceQuotaChange(GetRequestedServiceQuotaChangeRequest getRequestedServiceQuotaChangeRequest);

    /**
     * <p>
     * Returns the details for the specified service quota. This operation provides a different Value than the
     * <code>GetAWSDefaultServiceQuota</code> operation. This operation returns the applied value for each quota.
     * <code>GetAWSDefaultServiceQuota</code> returns the default AWS value for each quota.
     * </p>
     * 
     * @param getServiceQuotaRequest
     * @return Result of the GetServiceQuota operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws NoSuchResourceException
     *         The specified resource does not exist.
     * @throws IllegalArgumentException
     *         Invalid input was provided.
     * @throws ServiceException
     *         Something went wrong.
     * @throws TooManyRequestsException
     *         Due to throttling, the request was denied. Slow down the rate of request calls, or request an increase
     *         for this quota.
     * @sample AWSServiceQuotas.GetServiceQuota
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/GetServiceQuota" target="_top">AWS
     *      API Documentation</a>
     */
    GetServiceQuotaResult getServiceQuota(GetServiceQuotaRequest getServiceQuotaRequest);

    /**
     * <p>
     * Returns the details of the service quota increase request in your template.
     * </p>
     * 
     * @param getServiceQuotaIncreaseRequestFromTemplateRequest
     * @return Result of the GetServiceQuotaIncreaseRequestFromTemplate operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws DependencyAccessDeniedException
     *         You can't perform this action because a dependency does not have access.
     * @throws ServiceException
     *         Something went wrong.
     * @throws TooManyRequestsException
     *         Due to throttling, the request was denied. Slow down the rate of request calls, or request an increase
     *         for this quota.
     * @throws NoSuchResourceException
     *         The specified resource does not exist.
     * @throws IllegalArgumentException
     *         Invalid input was provided.
     * @throws AWSServiceAccessNotEnabledException
     *         The action you attempted is not allowed unless Service Access with Service Quotas is enabled in your
     *         organization. To enable, call <a>AssociateServiceQuotaTemplate</a>.
     * @throws TemplatesNotAvailableInRegionException
     *         The Service Quotas template is not available in the Region where you are making the request. Please make
     *         the request in us-east-1.
     * @throws NoAvailableOrganizationException
     *         The account making this call is not a member of an organization.
     * @sample AWSServiceQuotas.GetServiceQuotaIncreaseRequestFromTemplate
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/GetServiceQuotaIncreaseRequestFromTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    GetServiceQuotaIncreaseRequestFromTemplateResult getServiceQuotaIncreaseRequestFromTemplate(
            GetServiceQuotaIncreaseRequestFromTemplateRequest getServiceQuotaIncreaseRequestFromTemplateRequest);

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
     * @return Result of the ListAWSDefaultServiceQuotas operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws NoSuchResourceException
     *         The specified resource does not exist.
     * @throws IllegalArgumentException
     *         Invalid input was provided.
     * @throws InvalidPaginationTokenException
     *         Invalid input was provided.
     * @throws ServiceException
     *         Something went wrong.
     * @throws TooManyRequestsException
     *         Due to throttling, the request was denied. Slow down the rate of request calls, or request an increase
     *         for this quota.
     * @sample AWSServiceQuotas.ListAWSDefaultServiceQuotas
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/ListAWSDefaultServiceQuotas"
     *      target="_top">AWS API Documentation</a>
     */
    ListAWSDefaultServiceQuotasResult listAWSDefaultServiceQuotas(ListAWSDefaultServiceQuotasRequest listAWSDefaultServiceQuotasRequest);

    /**
     * <p>
     * Requests a list of the changes to quotas for a service.
     * </p>
     * 
     * @param listRequestedServiceQuotaChangeHistoryRequest
     * @return Result of the ListRequestedServiceQuotaChangeHistory operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws NoSuchResourceException
     *         The specified resource does not exist.
     * @throws IllegalArgumentException
     *         Invalid input was provided.
     * @throws InvalidPaginationTokenException
     *         Invalid input was provided.
     * @throws ServiceException
     *         Something went wrong.
     * @throws TooManyRequestsException
     *         Due to throttling, the request was denied. Slow down the rate of request calls, or request an increase
     *         for this quota.
     * @sample AWSServiceQuotas.ListRequestedServiceQuotaChangeHistory
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/ListRequestedServiceQuotaChangeHistory"
     *      target="_top">AWS API Documentation</a>
     */
    ListRequestedServiceQuotaChangeHistoryResult listRequestedServiceQuotaChangeHistory(
            ListRequestedServiceQuotaChangeHistoryRequest listRequestedServiceQuotaChangeHistoryRequest);

    /**
     * <p>
     * Requests a list of the changes to specific service quotas. This command provides additional granularity over the
     * <code>ListRequestedServiceQuotaChangeHistory</code> command. Once a quota change request has reached
     * <code>CASE_CLOSED, APPROVED,</code> or <code>DENIED</code>, the history has been kept for 90 days.
     * </p>
     * 
     * @param listRequestedServiceQuotaChangeHistoryByQuotaRequest
     * @return Result of the ListRequestedServiceQuotaChangeHistoryByQuota operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws NoSuchResourceException
     *         The specified resource does not exist.
     * @throws IllegalArgumentException
     *         Invalid input was provided.
     * @throws InvalidPaginationTokenException
     *         Invalid input was provided.
     * @throws ServiceException
     *         Something went wrong.
     * @throws TooManyRequestsException
     *         Due to throttling, the request was denied. Slow down the rate of request calls, or request an increase
     *         for this quota.
     * @sample AWSServiceQuotas.ListRequestedServiceQuotaChangeHistoryByQuota
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/ListRequestedServiceQuotaChangeHistoryByQuota"
     *      target="_top">AWS API Documentation</a>
     */
    ListRequestedServiceQuotaChangeHistoryByQuotaResult listRequestedServiceQuotaChangeHistoryByQuota(
            ListRequestedServiceQuotaChangeHistoryByQuotaRequest listRequestedServiceQuotaChangeHistoryByQuotaRequest);

    /**
     * <p>
     * Returns a list of the quota increase requests in the template.
     * </p>
     * 
     * @param listServiceQuotaIncreaseRequestsInTemplateRequest
     * @return Result of the ListServiceQuotaIncreaseRequestsInTemplate operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws DependencyAccessDeniedException
     *         You can't perform this action because a dependency does not have access.
     * @throws ServiceException
     *         Something went wrong.
     * @throws TooManyRequestsException
     *         Due to throttling, the request was denied. Slow down the rate of request calls, or request an increase
     *         for this quota.
     * @throws IllegalArgumentException
     *         Invalid input was provided.
     * @throws AWSServiceAccessNotEnabledException
     *         The action you attempted is not allowed unless Service Access with Service Quotas is enabled in your
     *         organization. To enable, call <a>AssociateServiceQuotaTemplate</a>.
     * @throws TemplatesNotAvailableInRegionException
     *         The Service Quotas template is not available in the Region where you are making the request. Please make
     *         the request in us-east-1.
     * @throws NoAvailableOrganizationException
     *         The account making this call is not a member of an organization.
     * @sample AWSServiceQuotas.ListServiceQuotaIncreaseRequestsInTemplate
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/ListServiceQuotaIncreaseRequestsInTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    ListServiceQuotaIncreaseRequestsInTemplateResult listServiceQuotaIncreaseRequestsInTemplate(
            ListServiceQuotaIncreaseRequestsInTemplateRequest listServiceQuotaIncreaseRequestsInTemplateRequest);

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
     * @return Result of the ListServiceQuotas operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws NoSuchResourceException
     *         The specified resource does not exist.
     * @throws IllegalArgumentException
     *         Invalid input was provided.
     * @throws InvalidPaginationTokenException
     *         Invalid input was provided.
     * @throws ServiceException
     *         Something went wrong.
     * @throws TooManyRequestsException
     *         Due to throttling, the request was denied. Slow down the rate of request calls, or request an increase
     *         for this quota.
     * @sample AWSServiceQuotas.ListServiceQuotas
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/ListServiceQuotas"
     *      target="_top">AWS API Documentation</a>
     */
    ListServiceQuotasResult listServiceQuotas(ListServiceQuotasRequest listServiceQuotasRequest);

    /**
     * <p>
     * Lists the AWS services available in Service Quotas. Not all AWS services are available in Service Quotas. To list
     * the see the list of the service quotas for a specific service, use <a>ListServiceQuotas</a>.
     * </p>
     * 
     * @param listServicesRequest
     * @return Result of the ListServices operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws IllegalArgumentException
     *         Invalid input was provided.
     * @throws InvalidPaginationTokenException
     *         Invalid input was provided.
     * @throws ServiceException
     *         Something went wrong.
     * @throws TooManyRequestsException
     *         Due to throttling, the request was denied. Slow down the rate of request calls, or request an increase
     *         for this quota.
     * @sample AWSServiceQuotas.ListServices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/ListServices" target="_top">AWS
     *      API Documentation</a>
     */
    ListServicesResult listServices(ListServicesRequest listServicesRequest);

    /**
     * <p>
     * Defines and adds a quota to the service quota template. To add a quota to the template, you must provide the
     * <code>ServiceCode</code>, <code>QuotaCode</code>, <code>AwsRegion</code>, and <code>DesiredValue</code>. Once you
     * add a quota to the template, use <a>ListServiceQuotaIncreaseRequestsInTemplate</a> to see the list of quotas in
     * the template.
     * </p>
     * 
     * @param putServiceQuotaIncreaseRequestIntoTemplateRequest
     * @return Result of the PutServiceQuotaIncreaseRequestIntoTemplate operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws DependencyAccessDeniedException
     *         You can't perform this action because a dependency does not have access.
     * @throws ServiceException
     *         Something went wrong.
     * @throws TooManyRequestsException
     *         Due to throttling, the request was denied. Slow down the rate of request calls, or request an increase
     *         for this quota.
     * @throws IllegalArgumentException
     *         Invalid input was provided.
     * @throws QuotaExceededException
     *         You have exceeded your service quota. To perform the requested action, remove some of the relevant
     *         resources, or use Service Quotas to request a service quota increase.
     * @throws NoSuchResourceException
     *         The specified resource does not exist.
     * @throws AWSServiceAccessNotEnabledException
     *         The action you attempted is not allowed unless Service Access with Service Quotas is enabled in your
     *         organization. To enable, call <a>AssociateServiceQuotaTemplate</a>.
     * @throws TemplatesNotAvailableInRegionException
     *         The Service Quotas template is not available in the Region where you are making the request. Please make
     *         the request in us-east-1.
     * @throws NoAvailableOrganizationException
     *         The account making this call is not a member of an organization.
     * @sample AWSServiceQuotas.PutServiceQuotaIncreaseRequestIntoTemplate
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/PutServiceQuotaIncreaseRequestIntoTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    PutServiceQuotaIncreaseRequestIntoTemplateResult putServiceQuotaIncreaseRequestIntoTemplate(
            PutServiceQuotaIncreaseRequestIntoTemplateRequest putServiceQuotaIncreaseRequestIntoTemplateRequest);

    /**
     * <p>
     * Retrieves the details of a service quota increase request. The response to this command provides the details in
     * the <a>RequestedServiceQuotaChange</a> object.
     * </p>
     * 
     * @param requestServiceQuotaIncreaseRequest
     * @return Result of the RequestServiceQuotaIncrease operation returned by the service.
     * @throws DependencyAccessDeniedException
     *         You can't perform this action because a dependency does not have access.
     * @throws QuotaExceededException
     *         You have exceeded your service quota. To perform the requested action, remove some of the relevant
     *         resources, or use Service Quotas to request a service quota increase.
     * @throws ResourceAlreadyExistsException
     *         The specified resource already exists.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws NoSuchResourceException
     *         The specified resource does not exist.
     * @throws IllegalArgumentException
     *         Invalid input was provided.
     * @throws InvalidResourceStateException
     *         Invalid input was provided for the .
     * @throws ServiceException
     *         Something went wrong.
     * @throws TooManyRequestsException
     *         Due to throttling, the request was denied. Slow down the rate of request calls, or request an increase
     *         for this quota.
     * @sample AWSServiceQuotas.RequestServiceQuotaIncrease
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/RequestServiceQuotaIncrease"
     *      target="_top">AWS API Documentation</a>
     */
    RequestServiceQuotaIncreaseResult requestServiceQuotaIncrease(RequestServiceQuotaIncreaseRequest requestServiceQuotaIncreaseRequest);

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
