/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.s3.model;

import com.amazonaws.services.kms.AWSKMS;
import com.amazonaws.services.s3.AmazonS3EncryptionClientV2Builder;
import java.io.Serializable;
import java.security.Provider;
import java.security.SecureRandom;

import com.amazonaws.regions.Region;
import com.amazonaws.services.s3.internal.crypto.CryptoRuntime;

/**
 * Stores configuration parameters that will be used during encryption and
 * decryption by the Amazon S3 Encryption Client V2 {@link com.amazonaws.services.s3.AmazonS3EncryptionClientV2}.
 * <p>
 * <b>Note: </b> The {@link #withAwsKmsRegion(Region)} parameter only affects the internally instantiated KMS client that
 * is created by default, not an external client added through {@link AmazonS3EncryptionClientV2Builder#withKmsClient(AWSKMS)}.
 * The internal KMS client is instantiated even if the user supply their own encryption materials and do not call KMS.
 */
public class CryptoConfigurationV2 implements Cloneable,Serializable {

    private static final long serialVersionUID = -8646831898339939580L;
    private static final SecureRandom SRAND = new SecureRandom();

    private CryptoMode cryptoMode;
    private CryptoStorageMode storageMode;
    private Provider cryptoProvider;
    private boolean alwaysUseCryptoProvider;
    private SecureRandom secureRandom;
    private boolean unsafeUndecryptableObjectPassthrough = false;
    private transient Region awsKmsRegion;
    private CryptoRangeGetMode rangeGetMode = CryptoRangeGetMode.DISABLED;

    /**
     * Creates a new CryptoConfiguration object with default crypto mode,
     * {@link CryptoMode#StrictAuthenticatedEncryption}.
     */
    public CryptoConfigurationV2() {
        this(CryptoMode.StrictAuthenticatedEncryption);
    }

    /**
     * Creates a new CryptoConfiguration object with default storage mode and
     * crypto provider settings. The default storage mode is the Object Metadata
     * storage mode, and the default crypto provider is the JCE provider.
     *
     * Note that the V2 configuration and encryption client does not support
     * {@link CryptoMode#EncryptionOnly}. Attempts to use that mode will result in
     * an exception.
     *
     * @param cryptoMode
     *            cryptographic mode to be used
     *
     * @throws UnsupportedOperationException
     *             if the necessary security provider cannot be found, the
     *             necessary cryptographic operations are not supported for the
     *             specified crypto mode or an unsupported crypto mode is supplied
     */
    public CryptoConfigurationV2(CryptoMode cryptoMode) {
        checkCryptoMode(cryptoMode);
        this.storageMode = CryptoStorageMode.ObjectMetadata;
        this.cryptoProvider = null;
        this.secureRandom = SRAND;
        this.cryptoMode = cryptoMode;
    }

    /**
     * Sets the storage mode to the specified mode.
     *
     * @param storageMode
     *            The storage mode to be used for storing encryption
     *            information.
     */
    public void setStorageMode(CryptoStorageMode storageMode) {
        this.storageMode = storageMode;
    }

    /**
     * Sets the storage mode to the specified mode, and returns the updated
     * CryptoConfiguration object.
     *
     * @param storageMode
     *            The storage mode to be used for storing encryption
     *            information.
     * @return The updated CryptoConfiguration object.
     */
    public CryptoConfigurationV2 withStorageMode(CryptoStorageMode storageMode) {
        this.storageMode = storageMode;
        return this;
    }

    /**
     * Returns the current storage mode of a CryptoConfiguration object.
     *
     * @return The storage mode to be used for storing encryption information.
     */
    public CryptoStorageMode getStorageMode() {
        return this.storageMode;
    }

    /**
     * Sets the crypto provider to the specified provider.
     *
     * @param cryptoProvider
     *            The crypto provider whose encryption implementation will be
     *            used to encrypt and decrypt data.
     */
    public void setCryptoProvider(Provider cryptoProvider) {
        this.cryptoProvider = cryptoProvider;
    }

    /**
     * Sets the crypto provider to the specified provider, and returns the
     * updated CryptoConfiguration object.
     *
     * @param cryptoProvider
     *            The crypto provider whose encryption implementation will be
     *            used to encrypt and decrypt data.
     * @return The updated CryptoConfiguration object.
     */
    public CryptoConfigurationV2 withCryptoProvider(Provider cryptoProvider) {
        this.cryptoProvider = cryptoProvider;
        return this;
    }

    /**
     * Returns the crypto provider whose encryption implementation will be used
     * to encrypt and decrypt data.
     *
     * @return the crypto provider whose encryption implementation will be used
     *         to encrypt and decrypt data.
     */
    public Provider getCryptoProvider() {
        return this.cryptoProvider;
    }

    /**
     * Sets whether the specified crypto provider should be used in all cases. For
     * backwards compatibility, it will be ignored if CryptoMode specified authenticated
     * encryption.
     */
    public void setAlwaysUseCryptoProvider(boolean value) {
        this.alwaysUseCryptoProvider = value;
    }

    /**
     * Sets whether the specified crypto provider should be used in all cases. For
     * backwards compatibility, it will be ignored if CryptoMode specified authenticated
     * encryption.
     */
    public CryptoConfigurationV2 withAlwaysUseCryptoProvider(boolean value) {
        this.alwaysUseCryptoProvider = value;
        return this;
    }

    /**
     * Returns true if the specified crypto provider should be used in all cases. For
     * backwards compatibility, it will be ignored if CryptoMode specifies authenticated
     * encryption.
     *
     * @return true if the crypto provider should always be used
     */
    public boolean getAlwaysUseCryptoProvider() {
        return alwaysUseCryptoProvider;
    }

    /**
     * Returns the SecureRandom instance that will be used to generate
     * cryptographic parameters.
     */
    public SecureRandom getSecureRandom() {
        return secureRandom;
    }

    /**
     * Sets the secure random instance to use for generating cryptographic
     * parameters.
     */
    public void setSecureRandom(SecureRandom secureRandom) {
        this.secureRandom = secureRandom;
    }

    /**
     * Sets the secure random instance to use for generating cryptographic
     * parameters, and returns this object.
     */
    public CryptoConfigurationV2 withSecureRandom(SecureRandom secureRandom) {
        this.secureRandom = secureRandom;
        return this;
    }

    /**
     * Returns the optionally specified crypto mode applicable only to the S3
     * encryption client; or null. This attribute is ignored if the S3
     * encryption client is not in use.
     */
    public CryptoMode getCryptoMode() {
        return cryptoMode;
    }

    /**
     * Sets the crypto mode; applicable only to the S3 encryption client.
     *
     * @throws UnsupportedOperationException
     *             if the necessary security provider cannot be found, the
     *             necessary cryptographic operations are not supported for the
     *             specified crypto mode or an unsupported crypto mode is supplied.
     */
    public void setCryptoMode(CryptoMode cryptoMode) throws UnsupportedOperationException {
        checkCryptoMode(cryptoMode);
        this.cryptoMode = cryptoMode;
    }

    /**
     * Fluent API to set the crypto mode; applicable only to the S3 encryption
     * client.
     *
     * Note that the V2 configuration and encryption client does not support
     * {@link CryptoMode#EncryptionOnly}. Attempts to use that mode will result in
     * an exception.
     *
     * @throws UnsupportedOperationException
     *             if the necessary security provider cannot be found, the
     *             necessary cryptographic operations are not supported for the
     *             specified crypto mode or an unsupported crypto mode is supplied.
     */
    public CryptoConfigurationV2 withCryptoMode(CryptoMode cryptoMode) throws UnsupportedOperationException {
        checkCryptoMode(cryptoMode);
        this.cryptoMode = cryptoMode;
        return this;
    }

    /**
     * Returns true to pass through (download) an encrypted object without decrypting
     * it during a GET operation, if no encryption metadata is found for the object; false otherwise.
     * Default is false.
     */
    public boolean isUnsafeUndecryptableObjectPassthrough() {
        return unsafeUndecryptableObjectPassthrough;
    }

    /**
     * Set the property to to pass through (download) an encrypted object without decrypting
     * it during a GET operation, if no encryption metadata is found for the object. Default is false.
     * An exception will be thrown if it's enabled with {@link CryptoMode#StrictAuthenticatedEncryption}
     * crypto mode configured.
     * @param unsafeUndecryptableObjectPassthrough unsafeUndecryptableObjectPassthrough to set
     */
    public void setUnsafeUndecryptableObjectPassthrough(
        boolean unsafeUndecryptableObjectPassthrough) {
        this.unsafeUndecryptableObjectPassthrough = unsafeUndecryptableObjectPassthrough;
    }

    /**
     * Fluent API to set the property to to pass through (download) an encrypted object without decrypting
     * it during a GET operation, if no encryption metadata is found for the object. Default is false.
     * An exception will be thrown if it's enabled with {@link CryptoMode#StrictAuthenticatedEncryption}
     * crypto mode configured.
     */
    public CryptoConfigurationV2 withUnsafeUndecryptableObjectPassthrough(
        boolean unsafeUndecryptableObjectPassthrough) {
        this.unsafeUndecryptableObjectPassthrough = unsafeUndecryptableObjectPassthrough;
        return this;
    }

    /**
     * Returns the the KMS region explicitly specified for the Amazon Web Services KMS client
     * when such client is internally instantiated; or null if no explicit KMS
     * region is specified. This KMS region parameter is ignored when the Amazon Web Services
     * KMS client of the S3 encryption client is explicitly passed in by the
     * users, instead of being implicitly created.
     */
    public Region getAwsKmsRegion() {
        return awsKmsRegion;
    }

    /**
     * Sets the KMS region for the Amazon Web Services KMS client when such client is internally
     * instantiated instead of externally passed in by users; or null if no
     * explicit KMS region is explicitly configured.This KMS region parameter is
     * ignored when the Amazon Web Services KMS client of the S3 encryption client is explicitly
     * passed in by the users, instead of being implicitly created.
     *
     * <b>Note: </b> An internal KMS client is created even if the user supply their own encryption materials.
     *
     * @see AmazonS3EncryptionClientV2Builder#setKmsClient(AWSKMS)
     */
    public void setAwsKmsRegion(Region awsKmsRegion) {
        this.awsKmsRegion = awsKmsRegion;
    }

    /**
     * Fluent API for setting the KMS region for the Amazon Web Services KMS client when such
     * client is internally instantiated instead of externally passed in by
     * users; or null if no explicit KMS region is explicitly configured.This
     * KMS region parameter is ignored when the Amazon Web Services KMS client of the S3
     * encryption client is explicitly passed in by the users, instead of being
     * implicitly created.
     *
     * <b>Note: </b> An internal KMS client is created even if the user supply their own encryption materials.
     *
     * @see AmazonS3EncryptionClientV2Builder#setKmsClient(AWSKMS)
     */
    public CryptoConfigurationV2 withAwsKmsRegion(Region awsKmsRegion) {
        this.awsKmsRegion = awsKmsRegion;
        return this;
    }

    /**
     * An optional parameter specifying the behavior of the client a GetObjectRequest is made for only part of an object.
     * <p>
     * Range gets do not provide authenticated encryption properties even when used with an authenticated mode (AES-GCM).
     * <p>
     * By default, range gets are disabled.
     *
     * @param rangeGetMode The range get mode.
     */
    public CryptoConfigurationV2 withRangeGetMode(CryptoRangeGetMode rangeGetMode) {
        if (rangeGetMode == null) {
            rangeGetMode = CryptoRangeGetMode.DISABLED;
        }
        this.rangeGetMode = rangeGetMode;
        return this;
    }

    /**
     * An optional parameter specifying the behavior of the client when a GetObjectRequest is made that includes a range
     * or part number.
     * <p>
     * Range gets do not provide authenticated encryption properties even when used with an authenticated mode (AES-GCM).
     * <p>
     * By default, range gets are disabled.
     *
     * @param rangeGetMode The range get mode.
     */
    public void setRangeGetMode(CryptoRangeGetMode rangeGetMode) {
        withRangeGetMode(rangeGetMode);
    }

    public CryptoRangeGetMode getRangeGetMode() {
        return rangeGetMode;
    }

    /**
     * Checks if the crypto mode is supported by the runtime.
     *
     * @throws UnsupportedOperationException
     *             if the necessary security provider cannot be found or the
     *             necessary cryptographic operations are not supported for the
     *             specified crypto mode.
     */
    private void checkCryptoMode(CryptoMode cryptoMode) {
        if (cryptoMode == CryptoMode.EncryptionOnly) {
            throw new UnsupportedOperationException(
                    "CryptoMode.EncryptionOnly is not allowed in this configuration");
        }
        // For modes that use AES/GCM, we prefer using the BouncyCastle provider unless the
        // user has explicitly overridden us (i.e., with the FIPS-compliant BouncyCastle
        // implementation).
        boolean preferBC = (cryptoMode == CryptoMode.AuthenticatedEncryption)
                || (cryptoMode == CryptoMode.StrictAuthenticatedEncryption);

        boolean haveOverride = (cryptoProvider != null && alwaysUseCryptoProvider)
                || CryptoRuntime.preferDefaultSecurityProvider();

        if (preferBC && !haveOverride) {
            checkBountyCastle();
        }
    }

    private void checkBountyCastle() {
        if (!CryptoRuntime.isBouncyCastleAvailable()) {
            CryptoRuntime.enableBouncyCastle();
            if (!CryptoRuntime.isBouncyCastleAvailable()) {
                throw new UnsupportedOperationException(
                        "The Bouncy castle library jar is required on the classpath to enable authenticated encryption");
            }
        }
        if (!CryptoRuntime.isAesGcmAvailable())
            throw new UnsupportedOperationException(
                    "A more recent version of Bouncy castle is required for authenticated encryption.");
    }

    public boolean isReadOnly() { return false; }

    /**
     * Used to provide a read-only copy of the configuration.
     */
    private static final class ReadOnly extends CryptoConfigurationV2 {
        private ReadOnly() {}
        @Override public boolean isReadOnly() { return true; }
        @Override public void setStorageMode(CryptoStorageMode storageMode) {
            throw new UnsupportedOperationException();
        }
        @Override public CryptoConfigurationV2 withStorageMode(CryptoStorageMode storageMode) {
            throw new UnsupportedOperationException();
        }
        @Override public void setCryptoProvider(Provider cryptoProvider) {
            throw new UnsupportedOperationException();
        }
        @Override public CryptoConfigurationV2 withCryptoProvider(Provider cryptoProvider) {
            throw new UnsupportedOperationException();
        }
        @Override public void setAlwaysUseCryptoProvider(boolean value) {
            throw new UnsupportedOperationException();
        }
        @Override public CryptoConfigurationV2 withAlwaysUseCryptoProvider(boolean value) {
            throw new UnsupportedOperationException();
        }
        @Override public void setSecureRandom(SecureRandom random) {
            throw new UnsupportedOperationException();
        }
        @Override public CryptoConfigurationV2 withSecureRandom(SecureRandom random) {
            throw new UnsupportedOperationException();
        }
        @Override public void setCryptoMode(CryptoMode cryptoMode) {
            throw new UnsupportedOperationException();
        }
        @Override public CryptoConfigurationV2 withCryptoMode(CryptoMode cryptoMode) {
            throw new UnsupportedOperationException();
        }
        @Override public void setUnsafeUndecryptableObjectPassthrough(boolean unsafeUndecryptableObjectPassthrough) {
            throw new UnsupportedOperationException();
        }
        @Override public CryptoConfigurationV2 withUnsafeUndecryptableObjectPassthrough(boolean unsafeUndecryptableObjectPassthrough) {
            throw new UnsupportedOperationException();
        }
        @Override public void setAwsKmsRegion(Region awsKmsRegion) {
            throw new UnsupportedOperationException();
        }
        @Override public CryptoConfigurationV2 withAwsKmsRegion(Region awsKmsRegion) {
            throw new UnsupportedOperationException();
        }
    }

    /**
     * Returns a read-only copy of this configuration.
     */
    public CryptoConfigurationV2 readOnly() {
        if (isReadOnly())
            return this;
        return copyTo(new CryptoConfigurationV2.ReadOnly());
    }

    @Override
    public CryptoConfigurationV2 clone() {
        return copyTo(new CryptoConfigurationV2());
    }

    private CryptoConfigurationV2 copyTo(CryptoConfigurationV2 that) {
        that.cryptoMode = this.cryptoMode;
        that.storageMode = this.storageMode;
        that.cryptoProvider = this.cryptoProvider;
        that.alwaysUseCryptoProvider = this.alwaysUseCryptoProvider;
        that.secureRandom = this.secureRandom;
        that.unsafeUndecryptableObjectPassthrough = this.unsafeUndecryptableObjectPassthrough;
        that.awsKmsRegion = this.awsKmsRegion;
        that.rangeGetMode = this.rangeGetMode;
        return that;
    }

}
