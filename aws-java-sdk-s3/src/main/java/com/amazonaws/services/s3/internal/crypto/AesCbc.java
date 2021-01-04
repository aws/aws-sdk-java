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
package com.amazonaws.services.s3.internal.crypto;

class AesCbc extends ContentCryptoScheme {
    @Override
    public String getKeyGeneratorAlgorithm() { return "AES"; }
    @Override
    public String getCipherAlgorithm() { return "AES/CBC/PKCS5Padding"; }
    @Override
    public int getKeyLengthInBits() { return 256; }
    @Override
    public int getBlockSizeInBytes() { return 16; }
    @Override
    public int getIVLengthInBytes() { return 16; }
    @Override long getMaxPlaintextSize() { return MAX_CBC_BYTES; }
}
