/*
 * Copyright (c) 2017. Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.s3;

import com.amazonaws.annotation.Immutable;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.client.AwsSyncClientParams;
import com.amazonaws.services.kms.AWSKMS;
import com.amazonaws.services.s3.model.CryptoConfigurationV2;
import com.amazonaws.services.s3.model.EncryptionMaterialsProvider;

/**
 * Encapsulates initialization parameters created by {@link AmazonS3EncryptionClientV2Builder} for the
 * {@link AmazonS3EncryptionClientV2}.
 *
 * @see AmazonS3EncryptionClientV2Builder
 */
@Immutable
@SdkInternalApi
public final class AmazonS3EncryptionClientV2ParamsWrapper extends AmazonS3EncryptionClientV2Params {
    private final EncryptionMaterialsProvider encryptionMaterials;
    private final CryptoConfigurationV2 cryptoConfiguration;
    private final AWSKMS kms;
    private final AwsSyncClientParams getClientParams;
    private final S3ClientOptions getS3ClientOptions;

    AmazonS3EncryptionClientV2ParamsWrapper(AwsSyncClientParams getClientParams,
                                            S3ClientOptions getS3ClientOptions,
                                            EncryptionMaterialsProvider encryptionMaterials,
                                            CryptoConfigurationV2 cryptoConfiguration,
                                            AWSKMS kms) {
        this.encryptionMaterials = encryptionMaterials;
        this.cryptoConfiguration = cryptoConfiguration;
        this.kms = kms;
        this.getClientParams = getClientParams;
        this.getS3ClientOptions = getS3ClientOptions;
    }

    @Override
    EncryptionMaterialsProvider getEncryptionMaterialsProvider() {
        return encryptionMaterials;
    }

    @Override
    CryptoConfigurationV2 getCryptoConfiguration() {
        return cryptoConfiguration;
    }

    @Override
    AWSKMS getKmsClient() {
        return kms;
    }

    @Override
    public AwsSyncClientParams getClientParams() {
        return getClientParams;
    }

    @Override
    public S3ClientOptions getS3ClientOptions() {
        return getS3ClientOptions;
    }
}
