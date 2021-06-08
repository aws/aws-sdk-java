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
 * With Service Quotas, you can view and manage your quotas easily as your AWS workloads grow. Quotas, also referred to
 * as limits, are the maximum number of resources that you can create in your AWS account. For more information, see the
 * <a href="https://docs.aws.amazon.com/servicequotas/latest/userguide/">Service Quotas User Guide</a>.
 * </p>
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
     * Associates your quota request template with your organization. When a new account is created in your
     * organization, the quota increase requests in the template are automatically applied to the account. You can add a
     * quota increase request for any adjustable quota to your template.
     * </p>
     * 
     * @param associateServiceQuotaTemplateRequest
     * @return Result of the AssociateServiceQuotaTemplate operation returned by the service.
     * @throws DependencyAccessDeniedException
     *         You can't perform this action because a dependency does not have access.
     * @throws AccessDeniedException
     *         You do not have sufficient permission to perform this action.
     * @throws ServiceException
     *         Something went wrong.
     * @throws TooManyRequestsException
     *         Due to throttling, the request was denied. Slow down the rate of request calls, or request an increase
     *         for this quota.
     * @throws AWSServiceAccessNotEnabledException
     *         The action you attempted is not allowed unless Service Access with Service Quotas is enabled in your
     *         organization.
     * @throws OrganizationNotInAllFeaturesModeException
     *         The organization that your account belongs to is not in All Features mode.
     * @throws TemplatesNotAvailableInRegionException
     *         The Service Quotas template is not available in this AWS Region.
     * @throws NoAvailableOrganizationException
     *         The account making this call is not a member of an organization.
     * @sample AWSServiceQuotas.AssociateServiceQuotaTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/AssociateServiceQuotaTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateServiceQuotaTemplateResult associateServiceQuotaTemplate(AssociateServiceQuotaTemplateRequest associateServiceQuotaTemplateRequest);

    /**
     * <p>
     * Deletes the quota increase request for the specified quota from your quota request template.
     * </p>
     * 
     * @param deleteServiceQuotaIncreaseRequestFromTemplateRequest
     * @return Result of the DeleteServiceQuotaIncreaseRequestFromTemplate operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient permission to perform this action.
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
     *         organization.
     * @throws TemplatesNotAvailableInRegionException
     *         The Service Quotas template is not available in this AWS Region.
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
     * Disables your quota request template. After a template is disabled, the quota increase requests in the template
     * are not applied to new accounts in your organization. Disabling a quota request template does not apply its quota
     * increase requests.
     * </p>
     * 
     * @param disassociateServiceQuotaTemplateRequest
     * @return Result of the DisassociateServiceQuotaTemplate operation returned by the service.
     * @throws DependencyAccessDeniedException
     *         You can't perform this action because a dependency does not have access.
     * @throws ServiceQuotaTemplateNotInUseException
     *         The quota request template is not associated with your organization.
     * @throws AccessDeniedException
     *         You do not have sufficient permission to perform this action.
     * @throws ServiceException
     *         Something went wrong.
     * @throws TooManyRequestsException
     *         Due to throttling, the request was denied. Slow down the rate of request calls, or request an increase
     *         for this quota.
     * @throws AWSServiceAccessNotEnabledException
     *         The action you attempted is not allowed unless Service Access with Service Quotas is enabled in your
     *         organization.
     * @throws TemplatesNotAvailableInRegionException
     *         The Service Quotas template is not available in this AWS Region.
     * @throws NoAvailableOrganizationException
     *         The account making this call is not a member of an organization.
     * @sample AWSServiceQuotas.DisassociateServiceQuotaTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/DisassociateServiceQuotaTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateServiceQuotaTemplateResult disassociateServiceQuotaTemplate(DisassociateServiceQuotaTemplateRequest disassociateServiceQuotaTemplateRequest);

    /**
     * <p>
     * Retrieves the default value for the specified quota. The default value does not reflect any quota increases.
     * </p>
     * 
     * @param getAWSDefaultServiceQuotaRequest
     * @return Result of the GetAWSDefaultServiceQuota operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient permission to perform this action.
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
     * Retrieves the status of the association for the quota request template.
     * </p>
     * 
     * @param getAssociationForServiceQuotaTemplateRequest
     * @return Result of the GetAssociationForServiceQuotaTemplate operation returned by the service.
     * @throws DependencyAccessDeniedException
     *         You can't perform this action because a dependency does not have access.
     * @throws ServiceQuotaTemplateNotInUseException
     *         The quota request template is not associated with your organization.
     * @throws AccessDeniedException
     *         You do not have sufficient permission to perform this action.
     * @throws ServiceException
     *         Something went wrong.
     * @throws TooManyRequestsException
     *         Due to throttling, the request was denied. Slow down the rate of request calls, or request an increase
     *         for this quota.
     * @throws AWSServiceAccessNotEnabledException
     *         The action you attempted is not allowed unless Service Access with Service Quotas is enabled in your
     *         organization.
     * @throws TemplatesNotAvailableInRegionException
     *         The Service Quotas template is not available in this AWS Region.
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
     * Retrieves information about the specified quota increase request.
     * </p>
     * 
     * @param getRequestedServiceQuotaChangeRequest
     * @return Result of the GetRequestedServiceQuotaChange operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient permission to perform this action.
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
     * Retrieves the applied quota value for the specified quota. For some quotas, only the default values are
     * available. If the applied quota value is not available for a quota, the quota is not retrieved.
     * </p>
     * 
     * @param getServiceQuotaRequest
     * @return Result of the GetServiceQuota operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient permission to perform this action.
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
     * Retrieves information about the specified quota increase request in your quota request template.
     * </p>
     * 
     * @param getServiceQuotaIncreaseRequestFromTemplateRequest
     * @return Result of the GetServiceQuotaIncreaseRequestFromTemplate operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient permission to perform this action.
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
     *         organization.
     * @throws TemplatesNotAvailableInRegionException
     *         The Service Quotas template is not available in this AWS Region.
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
     * Lists the default values for the quotas for the specified AWS service. A default value does not reflect any quota
     * increases.
     * </p>
     * 
     * @param listAWSDefaultServiceQuotasRequest
     * @return Result of the ListAWSDefaultServiceQuotas operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient permission to perform this action.
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
     * Retrieves the quota increase requests for the specified service.
     * </p>
     * 
     * @param listRequestedServiceQuotaChangeHistoryRequest
     * @return Result of the ListRequestedServiceQuotaChangeHistory operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient permission to perform this action.
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
     * Retrieves the quota increase requests for the specified quota.
     * </p>
     * 
     * @param listRequestedServiceQuotaChangeHistoryByQuotaRequest
     * @return Result of the ListRequestedServiceQuotaChangeHistoryByQuota operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient permission to perform this action.
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
     * Lists the quota increase requests in the specified quota request template.
     * </p>
     * 
     * @param listServiceQuotaIncreaseRequestsInTemplateRequest
     * @return Result of the ListServiceQuotaIncreaseRequestsInTemplate operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient permission to perform this action.
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
     *         organization.
     * @throws TemplatesNotAvailableInRegionException
     *         The Service Quotas template is not available in this AWS Region.
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
     * Lists the applied quota values for the specified AWS service. For some quotas, only the default values are
     * available. If the applied quota value is not available for a quota, the quota is not retrieved.
     * </p>
     * 
     * @param listServiceQuotasRequest
     * @return Result of the ListServiceQuotas operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient permission to perform this action.
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
     * Lists the names and codes for the services integrated with Service Quotas.
     * </p>
     * 
     * @param listServicesRequest
     * @return Result of the ListServices operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient permission to perform this action.
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
     * Returns a list of the tags assigned to the specified applied quota.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws TooManyRequestsException
     *         Due to throttling, the request was denied. Slow down the rate of request calls, or request an increase
     *         for this quota.
     * @throws NoSuchResourceException
     *         The specified resource does not exist.
     * @throws IllegalArgumentException
     *         Invalid input was provided.
     * @throws AccessDeniedException
     *         You do not have sufficient permission to perform this action.
     * @throws ServiceException
     *         Something went wrong.
     * @sample AWSServiceQuotas.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Adds a quota increase request to your quota request template.
     * </p>
     * 
     * @param putServiceQuotaIncreaseRequestIntoTemplateRequest
     * @return Result of the PutServiceQuotaIncreaseRequestIntoTemplate operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient permission to perform this action.
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
     *         organization.
     * @throws TemplatesNotAvailableInRegionException
     *         The Service Quotas template is not available in this AWS Region.
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
     * Submits a quota increase request for the specified quota.
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
     *         You do not have sufficient permission to perform this action.
     * @throws NoSuchResourceException
     *         The specified resource does not exist.
     * @throws IllegalArgumentException
     *         Invalid input was provided.
     * @throws InvalidResourceStateException
     *         The resource is in an invalid state.
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
     * <p>
     * Adds tags to the specified applied quota. You can include one or more tags to add to the quota.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws TooManyRequestsException
     *         Due to throttling, the request was denied. Slow down the rate of request calls, or request an increase
     *         for this quota.
     * @throws NoSuchResourceException
     *         The specified resource does not exist.
     * @throws TooManyTagsException
     *         You've exceeded the number of tags allowed for a resource. For more information, see <a href=
     *         "https://docs.aws.amazon.com/servicequotas/latest/userguide/sq-tagging.html#sq-tagging-restrictions">Tag
     *         restrictions</a> in the <i>Service Quotas User Guide</i>.
     * @throws TagPolicyViolationException
     *         The specified tag is a reserved word and cannot be used.
     * @throws IllegalArgumentException
     *         Invalid input was provided.
     * @throws AccessDeniedException
     *         You do not have sufficient permission to perform this action.
     * @throws ServiceException
     *         Something went wrong.
     * @sample AWSServiceQuotas.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes tags from the specified applied quota. You can specify one or more tags to remove.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws TooManyRequestsException
     *         Due to throttling, the request was denied. Slow down the rate of request calls, or request an increase
     *         for this quota.
     * @throws NoSuchResourceException
     *         The specified resource does not exist.
     * @throws IllegalArgumentException
     *         Invalid input was provided.
     * @throws AccessDeniedException
     *         You do not have sufficient permission to perform this action.
     * @throws ServiceException
     *         Something went wrong.
     * @sample AWSServiceQuotas.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

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
