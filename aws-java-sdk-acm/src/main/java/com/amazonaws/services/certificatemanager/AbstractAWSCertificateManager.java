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
package com.amazonaws.services.certificatemanager;

import javax.annotation.Generated;

import com.amazonaws.services.certificatemanager.model.*;
import com.amazonaws.*;
import com.amazonaws.services.certificatemanager.waiters.AWSCertificateManagerWaiters;

/**
 * Abstract implementation of {@code AWSCertificateManager}. Convenient method forms pass through to the corresponding
 * overload that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSCertificateManager implements AWSCertificateManager {

    protected AbstractAWSCertificateManager() {
    }

    @Override
    public void setEndpoint(String endpoint) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setRegion(com.amazonaws.regions.Region region) {
        throw new UnsupportedOperationException();
    }

    @Override
    public AddTagsToCertificateResult addTagsToCertificate(AddTagsToCertificateRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteCertificateResult deleteCertificate(DeleteCertificateRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeCertificateResult describeCertificate(DescribeCertificateRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ExportCertificateResult exportCertificate(ExportCertificateRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public GetCertificateResult getCertificate(GetCertificateRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ImportCertificateResult importCertificate(ImportCertificateRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListCertificatesResult listCertificates(ListCertificatesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListTagsForCertificateResult listTagsForCertificate(ListTagsForCertificateRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public RemoveTagsFromCertificateResult removeTagsFromCertificate(RemoveTagsFromCertificateRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public RenewCertificateResult renewCertificate(RenewCertificateRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public RequestCertificateResult requestCertificate(RequestCertificateRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ResendValidationEmailResult resendValidationEmail(ResendValidationEmailRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public UpdateCertificateOptionsResult updateCertificateOptions(UpdateCertificateOptionsRequest request) {
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
    public AWSCertificateManagerWaiters waiters() {
        throw new UnsupportedOperationException();
    }

}
