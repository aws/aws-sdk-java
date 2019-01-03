/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import java.io.Serializable;

import java.security.Provider;
import java.security.SecureRandom;

import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.internal.crypto.CryptoRuntime;

/**
 * Stores configuration parameters that will be used during encryption and
 * decryption by the Amazon S3 Encryption Client. With this object, you can set
 * the encryption client to use Instruction Files or Object Metadata for storing
 * encryption information. You can also specify your own crypto provider to be
 * used during encryption and decryption.
 */
public class CryptoConfiguration implements Cloneable,Serializable {

    private static final long serialVersionUID = -8646831898339939580L;

    private static final SecureRandom SRAND = new SecureRandom();

    private CryptoMode cryptoMode;
    private CryptoStorageMode storageMode;
    private Provider cryptoProvider;
    private boolean alwaysUseCryptoProvider;
    private SecureRandom secureRandom;

    /**
     * True to ignore instruction file that cannot be found during a GET
     * operation; false otherwise. Default is true. This property is ignored if
     * the crypto mode is {@link CryptoMode#StrictAuthenticatedEncryption} where
     * missing instruction file would always cause security exception.
     */
    private boolean ignoreMissingInstructionFile = true;
    /**
     * Used to specify the KMS region for the AWS KMS client when such client
     * is internally instantiated instead of externally passed in by users; or
     * null if no explicit KMS region is specified.
     */
    private transient com.amazonaws.regions.Region awskmsRegion;

    /**
     * Creates a new CryptoConfiguration object with default storage mode and
     * crypto provider settings. The default storage mode is the Object Metadata
     * storage mode, and the default crypto provider is the JCE provider.
     */
    public CryptoConfiguration() {
        this(CryptoMode.EncryptionOnly); // default to Encryption Only (EO) for
        // backward compatibility
    }

    /**
     * @param cryptoMode
     *            cryptographic mode to be used
     *
     * @throws UnsupportedOperationException
     *             if the necessary security provider cannot be found or the
     *             necessary cryptographic operations are not supported for the
     *             specified crypto mode.
     */
    public CryptoConfiguration(CryptoMode cryptoMode) {
        check(cryptoMode);
        // By default, store encryption info in metadata
        this.storageMode = CryptoStorageMode.ObjectMetadata;
        // A null value implies that the default JCE crypto provider will be
        // used
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
    public CryptoConfiguration withStorageMode(CryptoStorageMode storageMode) {
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
    public CryptoConfiguration withCryptoProvider(Provider cryptoProvider) {
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
    public CryptoConfiguration withAlwaysUseCryptoProvider(boolean value) {
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
    public CryptoConfiguration withSecureRandom(SecureRandom secureRandom) {
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
     *             if the necessary security provider cannot be found or the
     *             necessary cryptographic operations are not supported for the
     *             specified crypto mode. Note the crypto mode can and will
     *             still (intentionally) be set in such case, and it's up to the
     *             caller to decide what to do about it.
     */
    public void setCryptoMode(CryptoMode cryptoMode)
        throws UnsupportedOperationException {
        this.cryptoMode = cryptoMode;
        check(cryptoMode);
    }

    /**
     * Fluent API to set the crypto mode; applicable only to the S3 encryption
     * client.
     *
     * @throws UnsupportedOperationException
     *             if the necessary security provider cannot be found or the
     *             necessary cryptographic operations are not supported for the
     *             specified crypto mode.Note the crypto mode can and will still
     *             (intentionally) be set in such case, and it's up to the
     *             caller to decide what to do about it.
     */
    public CryptoConfiguration withCryptoMode(CryptoMode cryptoMode)
        throws UnsupportedOperationException {
        this.cryptoMode = cryptoMode;
        check(cryptoMode);
        return this;
    }

    /**
     * Returns true to ignore instruction file that cannot be found during a GET
     * operation; false otherwise. Default is true. This property is ignored if
     * the crypto mode is {@link CryptoMode#StrictAuthenticatedEncryption} where
     * missing instruction file would always cause security exception.
     */
    public boolean isIgnoreMissingInstructionFile() {
        return ignoreMissingInstructionFile;
    }

    /**
     * @param ignoreMissingInstructionFile
     *            true to ignore instruction file that cannot be found during a
     *            GET operation; false otherwise. Default is true. This property
     *            is ignored if the crypto mode is
     *            {@link CryptoMode#StrictAuthenticatedEncryption} where missing
     *            instruction file would always cause security exception.
     */
    public void setIgnoreMissingInstructionFile(
        boolean ignoreMissingInstructionFile) {
        this.ignoreMissingInstructionFile = ignoreMissingInstructionFile;
    }

    /**
     * Fluent API to set the property to ignore instruction file that cannot be
     * found during a GET operation.
     */
    public CryptoConfiguration withIgnoreMissingInstructionFile(
        boolean ignoreMissingInstructionFile) {
        this.ignoreMissingInstructionFile = ignoreMissingInstructionFile;
        return this;
    }

    /**
     * Checks if the crypto mode is supported by the runtime.
     *
     * @throws UnsupportedOperationException
     *             if the necessary security provider cannot be found or the
     *             necessary cryptographic operations are not supported for the
     *             specified crypto mode.
     */
    private void check(CryptoMode cryptoMode) {
        // For modes that use AES/GCM, we prefer using the BouncyCastle provider unless the
        // user has explicitly overridden us (i.e., with the FIPS-compliant BouncyCastle
        // implementation).
        boolean preferBC = (cryptoMode == CryptoMode.AuthenticatedEncryption)
                           || (cryptoMode == CryptoMode.StrictAuthenticatedEncryption);

        boolean haveOverride = (cryptoProvider != null && alwaysUseCryptoProvider);

        if (preferBC && !haveOverride) {
            if (!CryptoRuntime.isBouncyCastleAvailable()) {
                CryptoRuntime.enableBouncyCastle();
                if (!CryptoRuntime.isBouncyCastleAvailable()) {
                    throw new UnsupportedOperationException(
                        "The Bouncy castle library jar is required on the classpath to enable authenticated encryption");
                }
            }
            if (!CryptoRuntime.isAesGcmAvailable())
                throw new UnsupportedOperationException(
                    "More recent version of the Bouncy castle library is required to enable authenticated encryption");
        }
    }

    public boolean isReadOnly() { return false; }

    /**
     * Used to provide a read-only copy of the configuration.
     */
    private static final class ReadOnly extends CryptoConfiguration {
        private ReadOnly() {}
        @Override public boolean isReadOnly() { return true; }
        @Override public void setStorageMode(CryptoStorageMode storageMode) {
            throw new UnsupportedOperationException();
        }
        @Override public CryptoConfiguration withStorageMode(CryptoStorageMode storageMode) {
            throw new UnsupportedOperationException();
        }
        @Override public void setCryptoProvider(Provider cryptoProvider) {
            throw new UnsupportedOperationException();
        }
        @Override public CryptoConfiguration withCryptoProvider(Provider cryptoProvider) {
            throw new UnsupportedOperationException();
        }
        @Override public void setAlwaysUseCryptoProvider(boolean value) {
            throw new UnsupportedOperationException();
        }
        @Override public CryptoConfiguration withAlwaysUseCryptoProvider(boolean value) {
            throw new UnsupportedOperationException();
        }
        @Override public void setSecureRandom(SecureRandom random) {
            throw new UnsupportedOperationException();
        }
        @Override public CryptoConfiguration withSecureRandom(SecureRandom random) {
            throw new UnsupportedOperationException();
        }
        @Override public void setCryptoMode(CryptoMode cryptoMode) {
            throw new UnsupportedOperationException();
        }
        @Override public CryptoConfiguration withCryptoMode(CryptoMode cryptoMode) {
            throw new UnsupportedOperationException();
        }
        @Override public void setIgnoreMissingInstructionFile(
            boolean ignoreMissingInstructionFile) {
            throw new UnsupportedOperationException();
        }
        @Override public CryptoConfiguration withIgnoreMissingInstructionFile(
            boolean ignoreMissingInstructionFile) {
            throw new UnsupportedOperationException();
        }
        @Override public void setKmsRegion(Regions kmsRegion) {
            throw new UnsupportedOperationException();
        }
        @Override public CryptoConfiguration withKmsRegion(Regions kmsRegion) {
            throw new UnsupportedOperationException();
        }
    }

    /**
     * Returns a read-only copy of this configuration.
     */
    public CryptoConfiguration readOnly() {
        if (isReadOnly())
            return this;
        return copyTo(new CryptoConfiguration.ReadOnly());
    }

    @Override
    public CryptoConfiguration clone() {
        return copyTo(new CryptoConfiguration());
    }

    private CryptoConfiguration copyTo(CryptoConfiguration that) {
        that.cryptoMode = this.cryptoMode;
        that.storageMode = this.storageMode;
        that.cryptoProvider = this.cryptoProvider;
        that.alwaysUseCryptoProvider = this.alwaysUseCryptoProvider;
        that.secureRandom = this.secureRandom;
        that.ignoreMissingInstructionFile = this.ignoreMissingInstructionFile;
        that.awskmsRegion = this.awskmsRegion;
        return that;
    }

    /**
     * Returns the the KMS region explicitly specified for the AWS KMS client
     * when such client is internally instantiated; or null if no explicit KMS
     * region is specified. This KMS region parameter is ignored when the AWS
     * KMS client of the S3 encryption client is explicitly passed in by the
     * users, instead of being implicitly created.
     *
     * @Deprecated This method is not forward compatible. Throws
     * IllegalArguementException when a new region is encountered.
     *
     * @use {@link #getAwsKmsRegion()} instead
     */
    @Deprecated
    public Regions getKmsRegion() {
        if (awskmsRegion == null) return null;
        return Regions.fromName(awskmsRegion.getName());
    }

    /**
     * Sets the KMS region for the AWS KMS client when such client is internally
     * instantiated instead of externally passed in by users; or null if no
     * explicit KMS region is explicitly configured.This KMS region parameter is
     * ignored when the AWS KMS client of the S3 encryption client is explicitly
     * passed in by the users, instead of being implicitly created.
     *
     * @Deprecated This method is not forward compatible. Doesn't handle new
     * regions.
     *
     * @use {@link #setAwsKmsRegion(com.amazonaws.regions.Region)} instead
     */
    @Deprecated
    public void setKmsRegion(Regions kmsRegion) {
        if (kmsRegion != null) {
            setAwsKmsRegion(Region.getRegion(kmsRegion));
        } else {
            setAwsKmsRegion(null);
        }
    }

    /**
     * Fluent API for setting the KMS region for the AWS KMS client when such
     * client is internally instantiated instead of externally passed in by
     * users; or null if no explicit KMS region is explicitly configured.This
     * KMS region parameter is ignored when the AWS KMS client of the S3
     * encryption client is explicitly passed in by the users, instead of being
     * implicitly created.
     *
     * @Deprecated This method is not forward compatible. Doesn't handle new
     * regions.
     *
     * @use {@link #withAwsKmsRegion(com.amazonaws.regions.Region)} AwsKmsRegion}
     * instead
     */
    @Deprecated
    public CryptoConfiguration withKmsRegion(Regions kmsRegion) {
        setKmsRegion(kmsRegion);
        return this;
    }

    /**
     * Returns the the KMS region explicitly specified for the AWS KMS client
     * when such client is internally instantiated; or null if no explicit KMS
     * region is specified. This KMS region parameter is ignored when the AWS
     * KMS client of the S3 encryption client is explicitly passed in by the
     * users, instead of being implicitly created.
     */
    public Region getAwsKmsRegion() {
        return awskmsRegion;
    }

    /**
     * Sets the KMS region for the AWS KMS client when such client is internally
     * instantiated instead of externally passed in by users; or null if no
     * explicit KMS region is explicitly configured.This KMS region parameter is
     * ignored when the AWS KMS client of the S3 encryption client is explicitly
     * passed in by the users, instead of being implicitly created.
     */
    public void setAwsKmsRegion(Region awsKmsRegion) {
        this.awskmsRegion = awsKmsRegion;
    }

    /**
     * Fluent API for setting the KMS region for the AWS KMS client when such
     * client is internally instantiated instead of externally passed in by
     * users; or null if no explicit KMS region is explicitly configured.This
     * KMS region parameter is ignored when the AWS KMS client of the S3
     * encryption client is explicitly passed in by the users, instead of being
     * implicitly created.
     */
    public CryptoConfiguration withAwsKmsRegion(Region awsKmsRegion) {
        this.awskmsRegion = awsKmsRegion;
        return this;
    }
}
