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
package com.amazonaws.services.acmpca;

import javax.annotation.Generated;

import com.amazonaws.services.acmpca.model.*;
import com.amazonaws.*;
import com.amazonaws.services.acmpca.waiters.AWSACMPCAWaiters;

/**
 * Abstract implementation of {@code AWSACMPCA}. Convenient method forms pass through to the corresponding overload that
 * takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSACMPCA implements AWSACMPCA {

    protected AbstractAWSACMPCA() {
    }

    @Override
    public CreateCertificateAuthorityResult createCertificateAuthority(CreateCertificateAuthorityRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CreateCertificateAuthorityAuditReportResult createCertificateAuthorityAuditReport(CreateCertificateAuthorityAuditReportRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CreatePermissionResult createPermission(CreatePermissionRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteCertificateAuthorityResult deleteCertificateAuthority(DeleteCertificateAuthorityRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeletePermissionResult deletePermission(DeletePermissionRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeCertificateAuthorityResult describeCertificateAuthority(DescribeCertificateAuthorityRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeCertificateAuthorityAuditReportResult describeCertificateAuthorityAuditReport(DescribeCertificateAuthorityAuditReportRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public GetCertificateResult getCertificate(GetCertificateRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public GetCertificateAuthorityCertificateResult getCertificateAuthorityCertificate(GetCertificateAuthorityCertificateRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public GetCertificateAuthorityCsrResult getCertificateAuthorityCsr(GetCertificateAuthorityCsrRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ImportCertificateAuthorityCertificateResult importCertificateAuthorityCertificate(ImportCertificateAuthorityCertificateRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public IssueCertificateResult issueCertificate(IssueCertificateRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListCertificateAuthoritiesResult listCertificateAuthorities(ListCertificateAuthoritiesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListPermissionsResult listPermissions(ListPermissionsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListTagsResult listTags(ListTagsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public RestoreCertificateAuthorityResult restoreCertificateAuthority(RestoreCertificateAuthorityRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public RevokeCertificateResult revokeCertificate(RevokeCertificateRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public TagCertificateAuthorityResult tagCertificateAuthority(TagCertificateAuthorityRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public UntagCertificateAuthorityResult untagCertificateAuthority(UntagCertificateAuthorityRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public UpdateCertificateAuthorityResult updateCertificateAuthority(UpdateCertificateAuthorityRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override
    public com.amazonaws.ResponseMetadata getCachedResponseMetadata(com.amazonaws.AmazonWebServiceRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public AWSACMPCAWaiters waiters() {
        throw new UnsupportedOperationException();
    }

}
