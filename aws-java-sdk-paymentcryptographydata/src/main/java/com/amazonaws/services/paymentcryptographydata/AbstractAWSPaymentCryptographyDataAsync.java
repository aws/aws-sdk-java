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
package com.amazonaws.services.paymentcryptographydata;

import javax.annotation.Generated;

import com.amazonaws.services.paymentcryptographydata.model.*;

/**
 * Abstract implementation of {@code AWSPaymentCryptographyDataAsync}. Convenient method forms pass through to the
 * corresponding overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSPaymentCryptographyDataAsync extends AbstractAWSPaymentCryptographyData implements AWSPaymentCryptographyDataAsync {

    protected AbstractAWSPaymentCryptographyDataAsync() {
    }

    @Override
    public java.util.concurrent.Future<DecryptDataResult> decryptDataAsync(DecryptDataRequest request) {

        return decryptDataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DecryptDataResult> decryptDataAsync(DecryptDataRequest request,
            com.amazonaws.handlers.AsyncHandler<DecryptDataRequest, DecryptDataResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<EncryptDataResult> encryptDataAsync(EncryptDataRequest request) {

        return encryptDataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EncryptDataResult> encryptDataAsync(EncryptDataRequest request,
            com.amazonaws.handlers.AsyncHandler<EncryptDataRequest, EncryptDataResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GenerateCardValidationDataResult> generateCardValidationDataAsync(GenerateCardValidationDataRequest request) {

        return generateCardValidationDataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GenerateCardValidationDataResult> generateCardValidationDataAsync(GenerateCardValidationDataRequest request,
            com.amazonaws.handlers.AsyncHandler<GenerateCardValidationDataRequest, GenerateCardValidationDataResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GenerateMacResult> generateMacAsync(GenerateMacRequest request) {

        return generateMacAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GenerateMacResult> generateMacAsync(GenerateMacRequest request,
            com.amazonaws.handlers.AsyncHandler<GenerateMacRequest, GenerateMacResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GeneratePinDataResult> generatePinDataAsync(GeneratePinDataRequest request) {

        return generatePinDataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GeneratePinDataResult> generatePinDataAsync(GeneratePinDataRequest request,
            com.amazonaws.handlers.AsyncHandler<GeneratePinDataRequest, GeneratePinDataResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ReEncryptDataResult> reEncryptDataAsync(ReEncryptDataRequest request) {

        return reEncryptDataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ReEncryptDataResult> reEncryptDataAsync(ReEncryptDataRequest request,
            com.amazonaws.handlers.AsyncHandler<ReEncryptDataRequest, ReEncryptDataResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<TranslatePinDataResult> translatePinDataAsync(TranslatePinDataRequest request) {

        return translatePinDataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TranslatePinDataResult> translatePinDataAsync(TranslatePinDataRequest request,
            com.amazonaws.handlers.AsyncHandler<TranslatePinDataRequest, TranslatePinDataResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<VerifyAuthRequestCryptogramResult> verifyAuthRequestCryptogramAsync(VerifyAuthRequestCryptogramRequest request) {

        return verifyAuthRequestCryptogramAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<VerifyAuthRequestCryptogramResult> verifyAuthRequestCryptogramAsync(VerifyAuthRequestCryptogramRequest request,
            com.amazonaws.handlers.AsyncHandler<VerifyAuthRequestCryptogramRequest, VerifyAuthRequestCryptogramResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<VerifyCardValidationDataResult> verifyCardValidationDataAsync(VerifyCardValidationDataRequest request) {

        return verifyCardValidationDataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<VerifyCardValidationDataResult> verifyCardValidationDataAsync(VerifyCardValidationDataRequest request,
            com.amazonaws.handlers.AsyncHandler<VerifyCardValidationDataRequest, VerifyCardValidationDataResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<VerifyMacResult> verifyMacAsync(VerifyMacRequest request) {

        return verifyMacAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<VerifyMacResult> verifyMacAsync(VerifyMacRequest request,
            com.amazonaws.handlers.AsyncHandler<VerifyMacRequest, VerifyMacResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<VerifyPinDataResult> verifyPinDataAsync(VerifyPinDataRequest request) {

        return verifyPinDataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<VerifyPinDataResult> verifyPinDataAsync(VerifyPinDataRequest request,
            com.amazonaws.handlers.AsyncHandler<VerifyPinDataRequest, VerifyPinDataResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
