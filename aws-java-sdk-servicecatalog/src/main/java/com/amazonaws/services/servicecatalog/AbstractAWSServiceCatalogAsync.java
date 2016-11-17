/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.servicecatalog;

import com.amazonaws.services.servicecatalog.model.*;

/**
 * Abstract implementation of {@code AWSServiceCatalogAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
public class AbstractAWSServiceCatalogAsync extends AbstractAWSServiceCatalog implements AWSServiceCatalogAsync {

    protected AbstractAWSServiceCatalogAsync() {
    }

    @Override
    public java.util.concurrent.Future<AcceptPortfolioShareResult> acceptPortfolioShareAsync(AcceptPortfolioShareRequest request) {

        return acceptPortfolioShareAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AcceptPortfolioShareResult> acceptPortfolioShareAsync(AcceptPortfolioShareRequest request,
            com.amazonaws.handlers.AsyncHandler<AcceptPortfolioShareRequest, AcceptPortfolioShareResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<AssociatePrincipalWithPortfolioResult> associatePrincipalWithPortfolioAsync(
            AssociatePrincipalWithPortfolioRequest request) {

        return associatePrincipalWithPortfolioAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociatePrincipalWithPortfolioResult> associatePrincipalWithPortfolioAsync(
            AssociatePrincipalWithPortfolioRequest request,
            com.amazonaws.handlers.AsyncHandler<AssociatePrincipalWithPortfolioRequest, AssociatePrincipalWithPortfolioResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<AssociateProductWithPortfolioResult> associateProductWithPortfolioAsync(AssociateProductWithPortfolioRequest request) {

        return associateProductWithPortfolioAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateProductWithPortfolioResult> associateProductWithPortfolioAsync(AssociateProductWithPortfolioRequest request,
            com.amazonaws.handlers.AsyncHandler<AssociateProductWithPortfolioRequest, AssociateProductWithPortfolioResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateConstraintResult> createConstraintAsync(CreateConstraintRequest request) {

        return createConstraintAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateConstraintResult> createConstraintAsync(CreateConstraintRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateConstraintRequest, CreateConstraintResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreatePortfolioResult> createPortfolioAsync(CreatePortfolioRequest request) {

        return createPortfolioAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePortfolioResult> createPortfolioAsync(CreatePortfolioRequest request,
            com.amazonaws.handlers.AsyncHandler<CreatePortfolioRequest, CreatePortfolioResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreatePortfolioShareResult> createPortfolioShareAsync(CreatePortfolioShareRequest request) {

        return createPortfolioShareAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePortfolioShareResult> createPortfolioShareAsync(CreatePortfolioShareRequest request,
            com.amazonaws.handlers.AsyncHandler<CreatePortfolioShareRequest, CreatePortfolioShareResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateProductResult> createProductAsync(CreateProductRequest request) {

        return createProductAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateProductResult> createProductAsync(CreateProductRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateProductRequest, CreateProductResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateProvisioningArtifactResult> createProvisioningArtifactAsync(CreateProvisioningArtifactRequest request) {

        return createProvisioningArtifactAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateProvisioningArtifactResult> createProvisioningArtifactAsync(CreateProvisioningArtifactRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateProvisioningArtifactRequest, CreateProvisioningArtifactResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteConstraintResult> deleteConstraintAsync(DeleteConstraintRequest request) {

        return deleteConstraintAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteConstraintResult> deleteConstraintAsync(DeleteConstraintRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteConstraintRequest, DeleteConstraintResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeletePortfolioResult> deletePortfolioAsync(DeletePortfolioRequest request) {

        return deletePortfolioAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePortfolioResult> deletePortfolioAsync(DeletePortfolioRequest request,
            com.amazonaws.handlers.AsyncHandler<DeletePortfolioRequest, DeletePortfolioResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeletePortfolioShareResult> deletePortfolioShareAsync(DeletePortfolioShareRequest request) {

        return deletePortfolioShareAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePortfolioShareResult> deletePortfolioShareAsync(DeletePortfolioShareRequest request,
            com.amazonaws.handlers.AsyncHandler<DeletePortfolioShareRequest, DeletePortfolioShareResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteProductResult> deleteProductAsync(DeleteProductRequest request) {

        return deleteProductAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteProductResult> deleteProductAsync(DeleteProductRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteProductRequest, DeleteProductResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteProvisioningArtifactResult> deleteProvisioningArtifactAsync(DeleteProvisioningArtifactRequest request) {

        return deleteProvisioningArtifactAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteProvisioningArtifactResult> deleteProvisioningArtifactAsync(DeleteProvisioningArtifactRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteProvisioningArtifactRequest, DeleteProvisioningArtifactResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeConstraintResult> describeConstraintAsync(DescribeConstraintRequest request) {

        return describeConstraintAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeConstraintResult> describeConstraintAsync(DescribeConstraintRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeConstraintRequest, DescribeConstraintResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribePortfolioResult> describePortfolioAsync(DescribePortfolioRequest request) {

        return describePortfolioAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribePortfolioResult> describePortfolioAsync(DescribePortfolioRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribePortfolioRequest, DescribePortfolioResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeProductResult> describeProductAsync(DescribeProductRequest request) {

        return describeProductAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeProductResult> describeProductAsync(DescribeProductRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeProductRequest, DescribeProductResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeProductAsAdminResult> describeProductAsAdminAsync(DescribeProductAsAdminRequest request) {

        return describeProductAsAdminAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeProductAsAdminResult> describeProductAsAdminAsync(DescribeProductAsAdminRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeProductAsAdminRequest, DescribeProductAsAdminResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeProductViewResult> describeProductViewAsync(DescribeProductViewRequest request) {

        return describeProductViewAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeProductViewResult> describeProductViewAsync(DescribeProductViewRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeProductViewRequest, DescribeProductViewResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeProvisioningArtifactResult> describeProvisioningArtifactAsync(DescribeProvisioningArtifactRequest request) {

        return describeProvisioningArtifactAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeProvisioningArtifactResult> describeProvisioningArtifactAsync(DescribeProvisioningArtifactRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeProvisioningArtifactRequest, DescribeProvisioningArtifactResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeProvisioningParametersResult> describeProvisioningParametersAsync(DescribeProvisioningParametersRequest request) {

        return describeProvisioningParametersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeProvisioningParametersResult> describeProvisioningParametersAsync(DescribeProvisioningParametersRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeProvisioningParametersRequest, DescribeProvisioningParametersResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeRecordResult> describeRecordAsync(DescribeRecordRequest request) {

        return describeRecordAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRecordResult> describeRecordAsync(DescribeRecordRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeRecordRequest, DescribeRecordResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DisassociatePrincipalFromPortfolioResult> disassociatePrincipalFromPortfolioAsync(
            DisassociatePrincipalFromPortfolioRequest request) {

        return disassociatePrincipalFromPortfolioAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociatePrincipalFromPortfolioResult> disassociatePrincipalFromPortfolioAsync(
            DisassociatePrincipalFromPortfolioRequest request,
            com.amazonaws.handlers.AsyncHandler<DisassociatePrincipalFromPortfolioRequest, DisassociatePrincipalFromPortfolioResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DisassociateProductFromPortfolioResult> disassociateProductFromPortfolioAsync(
            DisassociateProductFromPortfolioRequest request) {

        return disassociateProductFromPortfolioAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateProductFromPortfolioResult> disassociateProductFromPortfolioAsync(
            DisassociateProductFromPortfolioRequest request,
            com.amazonaws.handlers.AsyncHandler<DisassociateProductFromPortfolioRequest, DisassociateProductFromPortfolioResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListAcceptedPortfolioSharesResult> listAcceptedPortfolioSharesAsync(ListAcceptedPortfolioSharesRequest request) {

        return listAcceptedPortfolioSharesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAcceptedPortfolioSharesResult> listAcceptedPortfolioSharesAsync(ListAcceptedPortfolioSharesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListAcceptedPortfolioSharesRequest, ListAcceptedPortfolioSharesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListConstraintsForPortfolioResult> listConstraintsForPortfolioAsync(ListConstraintsForPortfolioRequest request) {

        return listConstraintsForPortfolioAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListConstraintsForPortfolioResult> listConstraintsForPortfolioAsync(ListConstraintsForPortfolioRequest request,
            com.amazonaws.handlers.AsyncHandler<ListConstraintsForPortfolioRequest, ListConstraintsForPortfolioResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListLaunchPathsResult> listLaunchPathsAsync(ListLaunchPathsRequest request) {

        return listLaunchPathsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListLaunchPathsResult> listLaunchPathsAsync(ListLaunchPathsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListLaunchPathsRequest, ListLaunchPathsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListPortfolioAccessResult> listPortfolioAccessAsync(ListPortfolioAccessRequest request) {

        return listPortfolioAccessAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPortfolioAccessResult> listPortfolioAccessAsync(ListPortfolioAccessRequest request,
            com.amazonaws.handlers.AsyncHandler<ListPortfolioAccessRequest, ListPortfolioAccessResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListPortfoliosResult> listPortfoliosAsync(ListPortfoliosRequest request) {

        return listPortfoliosAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPortfoliosResult> listPortfoliosAsync(ListPortfoliosRequest request,
            com.amazonaws.handlers.AsyncHandler<ListPortfoliosRequest, ListPortfoliosResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListPortfoliosForProductResult> listPortfoliosForProductAsync(ListPortfoliosForProductRequest request) {

        return listPortfoliosForProductAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPortfoliosForProductResult> listPortfoliosForProductAsync(ListPortfoliosForProductRequest request,
            com.amazonaws.handlers.AsyncHandler<ListPortfoliosForProductRequest, ListPortfoliosForProductResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListPrincipalsForPortfolioResult> listPrincipalsForPortfolioAsync(ListPrincipalsForPortfolioRequest request) {

        return listPrincipalsForPortfolioAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPrincipalsForPortfolioResult> listPrincipalsForPortfolioAsync(ListPrincipalsForPortfolioRequest request,
            com.amazonaws.handlers.AsyncHandler<ListPrincipalsForPortfolioRequest, ListPrincipalsForPortfolioResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListProvisioningArtifactsResult> listProvisioningArtifactsAsync(ListProvisioningArtifactsRequest request) {

        return listProvisioningArtifactsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListProvisioningArtifactsResult> listProvisioningArtifactsAsync(ListProvisioningArtifactsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListProvisioningArtifactsRequest, ListProvisioningArtifactsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListRecordHistoryResult> listRecordHistoryAsync(ListRecordHistoryRequest request) {

        return listRecordHistoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRecordHistoryResult> listRecordHistoryAsync(ListRecordHistoryRequest request,
            com.amazonaws.handlers.AsyncHandler<ListRecordHistoryRequest, ListRecordHistoryResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ProvisionProductResult> provisionProductAsync(ProvisionProductRequest request) {

        return provisionProductAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ProvisionProductResult> provisionProductAsync(ProvisionProductRequest request,
            com.amazonaws.handlers.AsyncHandler<ProvisionProductRequest, ProvisionProductResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RejectPortfolioShareResult> rejectPortfolioShareAsync(RejectPortfolioShareRequest request) {

        return rejectPortfolioShareAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RejectPortfolioShareResult> rejectPortfolioShareAsync(RejectPortfolioShareRequest request,
            com.amazonaws.handlers.AsyncHandler<RejectPortfolioShareRequest, RejectPortfolioShareResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ScanProvisionedProductsResult> scanProvisionedProductsAsync(ScanProvisionedProductsRequest request) {

        return scanProvisionedProductsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ScanProvisionedProductsResult> scanProvisionedProductsAsync(ScanProvisionedProductsRequest request,
            com.amazonaws.handlers.AsyncHandler<ScanProvisionedProductsRequest, ScanProvisionedProductsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<SearchProductsResult> searchProductsAsync(SearchProductsRequest request) {

        return searchProductsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchProductsResult> searchProductsAsync(SearchProductsRequest request,
            com.amazonaws.handlers.AsyncHandler<SearchProductsRequest, SearchProductsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<SearchProductsAsAdminResult> searchProductsAsAdminAsync(SearchProductsAsAdminRequest request) {

        return searchProductsAsAdminAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchProductsAsAdminResult> searchProductsAsAdminAsync(SearchProductsAsAdminRequest request,
            com.amazonaws.handlers.AsyncHandler<SearchProductsAsAdminRequest, SearchProductsAsAdminResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<TerminateProvisionedProductResult> terminateProvisionedProductAsync(TerminateProvisionedProductRequest request) {

        return terminateProvisionedProductAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TerminateProvisionedProductResult> terminateProvisionedProductAsync(TerminateProvisionedProductRequest request,
            com.amazonaws.handlers.AsyncHandler<TerminateProvisionedProductRequest, TerminateProvisionedProductResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateConstraintResult> updateConstraintAsync(UpdateConstraintRequest request) {

        return updateConstraintAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateConstraintResult> updateConstraintAsync(UpdateConstraintRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateConstraintRequest, UpdateConstraintResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdatePortfolioResult> updatePortfolioAsync(UpdatePortfolioRequest request) {

        return updatePortfolioAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdatePortfolioResult> updatePortfolioAsync(UpdatePortfolioRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdatePortfolioRequest, UpdatePortfolioResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateProductResult> updateProductAsync(UpdateProductRequest request) {

        return updateProductAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateProductResult> updateProductAsync(UpdateProductRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateProductRequest, UpdateProductResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateProvisionedProductResult> updateProvisionedProductAsync(UpdateProvisionedProductRequest request) {

        return updateProvisionedProductAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateProvisionedProductResult> updateProvisionedProductAsync(UpdateProvisionedProductRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateProvisionedProductRequest, UpdateProvisionedProductResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateProvisioningArtifactResult> updateProvisioningArtifactAsync(UpdateProvisioningArtifactRequest request) {

        return updateProvisioningArtifactAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateProvisioningArtifactResult> updateProvisioningArtifactAsync(UpdateProvisioningArtifactRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateProvisioningArtifactRequest, UpdateProvisioningArtifactResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
