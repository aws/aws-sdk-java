/*
 * Copyright 2013-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * Denotes the different cryptographic modes available for securing an S3 object
 * via client-side encryption. 
 */
public enum CryptoMode {
    /**
     * Encryption-only mode using AES/CBC.
     * @deprecated This feature is in maintenance mode, no new updates will be released.
     * Please see https://docs.aws.amazon.com/general/latest/gr/aws_sdk_cryptography.html for more information.
     */
    @Deprecated
    EncryptionOnly,
    /**
     * Authenticated encryption mode using AES/GCM, AESWrap, etc. Please
     * note the limitation on the maximum message size in bytes that can be
     * encrypted under this mode is 2^36-32, or ~64G, due to the security
     * limitation of AES/GCM as recommended by NIST.
     * <p>
     * When decrypting with AES-GCM, read the entire object to the end before you start using the decrypted data. This
     * is to verify that the object has not been modified since it was encrypted.
     */
    AuthenticatedEncryption,
    /**
     * Strictly enforce the use of authenticated encryption via AES/GCM,
     * AESWrap, etc., and will throw security exception if an S3 object
     * retrieved is found to be not protected using authenticated encryption.
     * This means range-get operation is not supported in this mode, since
     * range-get is not authenticated.
     * <p>
     * Please note the limitation on the maximum message size in bytes that can
     * be encrypted under this mode is 2^36-32, or ~64G, due to the security
     * limitation of AES/GCM as recommended by NIST.
     * <p>
     * When decrypting with AES-GCM, read the entire object to the end before you start using the decrypted data. This
     * is to verify that the object has not been modified since it was encrypted.
     */
    StrictAuthenticatedEncryption, ;
}
