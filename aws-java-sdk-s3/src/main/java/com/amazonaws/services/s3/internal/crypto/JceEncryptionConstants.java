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

package com.amazonaws.services.s3.internal.crypto;

/**
 * Contains constants required by the JCE encryption library.
 */
public class JceEncryptionConstants {

    /** Name of the symmetric encryption algorithm */
    public static final String SYMMETRIC_KEY_ALGORITHM = "AES";

    /** Name of the algorithm, mode, and padding we will use in the symmetric cipher for encryption */
    public static final String SYMMETRIC_CIPHER_METHOD = "AES/CBC/PKCS5Padding";

    /** Minimum length of the generated symmetric key */
    public static final int SYMMETRIC_KEY_LENGTH = 256;

    /** AES cipher block size */
    public static final int SYMMETRIC_CIPHER_BLOCK_SIZE = 16;

}
