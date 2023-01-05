/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.account;

import javax.annotation.Generated;

import com.amazonaws.services.account.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AWSAccount}. Convenient method forms pass through to the corresponding overload
 * that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSAccount implements AWSAccount {

    protected AbstractAWSAccount() {
    }

    @Override
    public DeleteAlternateContactResult deleteAlternateContact(DeleteAlternateContactRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetAlternateContactResult getAlternateContact(GetAlternateContactRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetContactInformationResult getContactInformation(GetContactInformationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutAlternateContactResult putAlternateContact(PutAlternateContactRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutContactInformationResult putContactInformation(PutContactInformationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void shutdown() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public com.amazonaws.ResponseMetadata getCachedResponseMetadata(com.amazonaws.AmazonWebServiceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

}
