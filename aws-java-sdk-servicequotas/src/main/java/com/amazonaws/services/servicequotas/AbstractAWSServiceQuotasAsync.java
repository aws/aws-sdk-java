/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Abstract implementation of {@code AWSServiceQuotasAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSServiceQuotasAsync extends AbstractAWSServiceQuotas implements AWSServiceQuotasAsync {

    protected AbstractAWSServiceQuotasAsync() {
    }

    @Override
    public java.util.concurrent.Future<AssociateServiceQuotaTemplateResult> associateServiceQuotaTemplateAsync(AssociateServiceQuotaTemplateRequest request) {

        return associateServiceQuotaTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateServiceQuotaTemplateResult> associateServiceQuotaTemplateAsync(AssociateServiceQuotaTemplateRequest request,
            com.amazonaws.handlers.AsyncHandler<AssociateServiceQuotaTemplateRequest, AssociateServiceQuotaTemplateResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteServiceQuotaIncreaseRequestFromTemplateResult> deleteServiceQuotaIncreaseRequestFromTemplateAsync(
            DeleteServiceQuotaIncreaseRequestFromTemplateRequest request) {

        return deleteServiceQuotaIncreaseRequestFromTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteServiceQuotaIncreaseRequestFromTemplateResult> deleteServiceQuotaIncreaseRequestFromTemplateAsync(
            DeleteServiceQuotaIncreaseRequestFromTemplateRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteServiceQuotaIncreaseRequestFromTemplateRequest, DeleteServiceQuotaIncreaseRequestFromTemplateResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DisassociateServiceQuotaTemplateResult> disassociateServiceQuotaTemplateAsync(
            DisassociateServiceQuotaTemplateRequest request) {

        return disassociateServiceQuotaTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateServiceQuotaTemplateResult> disassociateServiceQuotaTemplateAsync(
            DisassociateServiceQuotaTemplateRequest request,
            com.amazonaws.handlers.AsyncHandler<DisassociateServiceQuotaTemplateRequest, DisassociateServiceQuotaTemplateResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetAWSDefaultServiceQuotaResult> getAWSDefaultServiceQuotaAsync(GetAWSDefaultServiceQuotaRequest request) {

        return getAWSDefaultServiceQuotaAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAWSDefaultServiceQuotaResult> getAWSDefaultServiceQuotaAsync(GetAWSDefaultServiceQuotaRequest request,
            com.amazonaws.handlers.AsyncHandler<GetAWSDefaultServiceQuotaRequest, GetAWSDefaultServiceQuotaResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetAssociationForServiceQuotaTemplateResult> getAssociationForServiceQuotaTemplateAsync(
            GetAssociationForServiceQuotaTemplateRequest request) {

        return getAssociationForServiceQuotaTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAssociationForServiceQuotaTemplateResult> getAssociationForServiceQuotaTemplateAsync(
            GetAssociationForServiceQuotaTemplateRequest request,
            com.amazonaws.handlers.AsyncHandler<GetAssociationForServiceQuotaTemplateRequest, GetAssociationForServiceQuotaTemplateResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetRequestedServiceQuotaChangeResult> getRequestedServiceQuotaChangeAsync(GetRequestedServiceQuotaChangeRequest request) {

        return getRequestedServiceQuotaChangeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRequestedServiceQuotaChangeResult> getRequestedServiceQuotaChangeAsync(GetRequestedServiceQuotaChangeRequest request,
            com.amazonaws.handlers.AsyncHandler<GetRequestedServiceQuotaChangeRequest, GetRequestedServiceQuotaChangeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetServiceQuotaResult> getServiceQuotaAsync(GetServiceQuotaRequest request) {

        return getServiceQuotaAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetServiceQuotaResult> getServiceQuotaAsync(GetServiceQuotaRequest request,
            com.amazonaws.handlers.AsyncHandler<GetServiceQuotaRequest, GetServiceQuotaResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetServiceQuotaIncreaseRequestFromTemplateResult> getServiceQuotaIncreaseRequestFromTemplateAsync(
            GetServiceQuotaIncreaseRequestFromTemplateRequest request) {

        return getServiceQuotaIncreaseRequestFromTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetServiceQuotaIncreaseRequestFromTemplateResult> getServiceQuotaIncreaseRequestFromTemplateAsync(
            GetServiceQuotaIncreaseRequestFromTemplateRequest request,
            com.amazonaws.handlers.AsyncHandler<GetServiceQuotaIncreaseRequestFromTemplateRequest, GetServiceQuotaIncreaseRequestFromTemplateResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListAWSDefaultServiceQuotasResult> listAWSDefaultServiceQuotasAsync(ListAWSDefaultServiceQuotasRequest request) {

        return listAWSDefaultServiceQuotasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAWSDefaultServiceQuotasResult> listAWSDefaultServiceQuotasAsync(ListAWSDefaultServiceQuotasRequest request,
            com.amazonaws.handlers.AsyncHandler<ListAWSDefaultServiceQuotasRequest, ListAWSDefaultServiceQuotasResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListRequestedServiceQuotaChangeHistoryResult> listRequestedServiceQuotaChangeHistoryAsync(
            ListRequestedServiceQuotaChangeHistoryRequest request) {

        return listRequestedServiceQuotaChangeHistoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRequestedServiceQuotaChangeHistoryResult> listRequestedServiceQuotaChangeHistoryAsync(
            ListRequestedServiceQuotaChangeHistoryRequest request,
            com.amazonaws.handlers.AsyncHandler<ListRequestedServiceQuotaChangeHistoryRequest, ListRequestedServiceQuotaChangeHistoryResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListRequestedServiceQuotaChangeHistoryByQuotaResult> listRequestedServiceQuotaChangeHistoryByQuotaAsync(
            ListRequestedServiceQuotaChangeHistoryByQuotaRequest request) {

        return listRequestedServiceQuotaChangeHistoryByQuotaAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRequestedServiceQuotaChangeHistoryByQuotaResult> listRequestedServiceQuotaChangeHistoryByQuotaAsync(
            ListRequestedServiceQuotaChangeHistoryByQuotaRequest request,
            com.amazonaws.handlers.AsyncHandler<ListRequestedServiceQuotaChangeHistoryByQuotaRequest, ListRequestedServiceQuotaChangeHistoryByQuotaResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListServiceQuotaIncreaseRequestsInTemplateResult> listServiceQuotaIncreaseRequestsInTemplateAsync(
            ListServiceQuotaIncreaseRequestsInTemplateRequest request) {

        return listServiceQuotaIncreaseRequestsInTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListServiceQuotaIncreaseRequestsInTemplateResult> listServiceQuotaIncreaseRequestsInTemplateAsync(
            ListServiceQuotaIncreaseRequestsInTemplateRequest request,
            com.amazonaws.handlers.AsyncHandler<ListServiceQuotaIncreaseRequestsInTemplateRequest, ListServiceQuotaIncreaseRequestsInTemplateResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListServiceQuotasResult> listServiceQuotasAsync(ListServiceQuotasRequest request) {

        return listServiceQuotasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListServiceQuotasResult> listServiceQuotasAsync(ListServiceQuotasRequest request,
            com.amazonaws.handlers.AsyncHandler<ListServiceQuotasRequest, ListServiceQuotasResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListServicesResult> listServicesAsync(ListServicesRequest request) {

        return listServicesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListServicesResult> listServicesAsync(ListServicesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListServicesRequest, ListServicesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutServiceQuotaIncreaseRequestIntoTemplateResult> putServiceQuotaIncreaseRequestIntoTemplateAsync(
            PutServiceQuotaIncreaseRequestIntoTemplateRequest request) {

        return putServiceQuotaIncreaseRequestIntoTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutServiceQuotaIncreaseRequestIntoTemplateResult> putServiceQuotaIncreaseRequestIntoTemplateAsync(
            PutServiceQuotaIncreaseRequestIntoTemplateRequest request,
            com.amazonaws.handlers.AsyncHandler<PutServiceQuotaIncreaseRequestIntoTemplateRequest, PutServiceQuotaIncreaseRequestIntoTemplateResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RequestServiceQuotaIncreaseResult> requestServiceQuotaIncreaseAsync(RequestServiceQuotaIncreaseRequest request) {

        return requestServiceQuotaIncreaseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RequestServiceQuotaIncreaseResult> requestServiceQuotaIncreaseAsync(RequestServiceQuotaIncreaseRequest request,
            com.amazonaws.handlers.AsyncHandler<RequestServiceQuotaIncreaseRequest, RequestServiceQuotaIncreaseResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
