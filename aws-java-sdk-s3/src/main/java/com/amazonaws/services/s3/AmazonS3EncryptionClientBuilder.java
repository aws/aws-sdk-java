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

import com.amazonaws.client.AwsSyncClientParams;
import com.amazonaws.services.kms.AWSKMS;
import com.amazonaws.services.s3.model.CryptoConfiguration;
import com.amazonaws.services.s3.model.EncryptionMaterialsProvider;

public final class AmazonS3EncryptionClientBuilder extends AmazonS3Builder<AmazonS3EncryptionClientBuilder, AmazonS3Encryption> {
    private EncryptionMaterialsProvider encryptionMaterials;
    private CryptoConfiguration cryptoConfig;
    private AWSKMS kms;

    /**
     * @return Create new instance of builder with all defaults set.
     */
    public static AmazonS3EncryptionClientBuilder standard() {
        return new AmazonS3EncryptionClientBuilder();
    }

    /**
     * @return Default client using the {@link com.amazonaws.auth.DefaultAWSCredentialsProviderChain}
     * and {@link com.amazonaws.regions.DefaultAwsRegionProviderChain} chain
     */
    public static AmazonS3Encryption defaultClient() {
        return standard().build();
    }

    /**
     * Sets the encryption materials to be used to encrypt and decrypt data
     * @param encryptionMaterials a provider for the encryption materials
     */
    public void setEncryptionMaterials(EncryptionMaterialsProvider encryptionMaterials) {
        this.encryptionMaterials = encryptionMaterials;
    }

    /**
     * Sets the encryption materials to be used to encrypt and decrypt data
     * @param encryptionMaterials A provider for the encryption materials to be used to encrypt and decrypt data.
     * @return this object for method chaining
     */
    public AmazonS3EncryptionClientBuilder withEncryptionMaterials(EncryptionMaterialsProvider encryptionMaterials) {
        setEncryptionMaterials(encryptionMaterials);
        return this;
    }

    /**
     * Sets the crypto configuration whose parameters will be used to encrypt and decrypt data.
     * @param cryptoConfig crypto configuration
     */
    public void setCryptoConfiguration(CryptoConfiguration cryptoConfig) {
        this.cryptoConfig = cryptoConfig;
    }

    /**
     * Sets the crypto configuration whose parameters will be used to encrypt and decrypt data.
     * @param cryptoConfig crypto configuration
     * @return this object for method chaining
     */
    public AmazonS3EncryptionClientBuilder withCryptoConfiguration(CryptoConfiguration cryptoConfig) {
        setCryptoConfiguration(cryptoConfig);
        return this;
    }

    /**
     * Sets the KMS implementation to be used throughout the crypto process
     * @param kms an {@link AWSKMS} implementation (e.g. {@link com.amazonaws.services.kms.AWSKMSClient})
     */
    public void setKms(AWSKMS kms) {
        this.kms = kms;
    }

    /**
     * Sets the KMS implementation to be used throughout the crypto process
     * @param kms an {@link AWSKMS} implementation (e.g. {@link com.amazonaws.services.kms.AWSKMSClient})
     * @return this object for method chaining
     */
    public AmazonS3EncryptionClientBuilder withKmsClient(AWSKMS kms) {
        setKms(kms);
        return this;
    }

    /**
     * Construct a synchronous implementation of AmazonS3Encryption using the current builder configuration.
     *
     * @return Fully configured implementation of AmazonS3Encryption.
     */
    @Override
    protected AmazonS3Encryption build(AwsSyncClientParams clientParams) {
        return new AmazonS3EncryptionClient(
                new AmazonS3EncryptionClientParamsWrapper(clientParams,
                        resolveS3ClientOptions(),
                        encryptionMaterials,
                        cryptoConfig != null ? cryptoConfig : new CryptoConfiguration(),
                        kms));
    }
}
