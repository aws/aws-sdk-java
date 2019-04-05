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

/**
 * Denotes the different storage modes available for storing the encryption
 * information that accompanies encrypted objects in S3. The encryption
 * information includes an encrypted envelope symmetric key, an initialization
 * vector, and a description of the encryption materials used during encryption.
 * <p>
 * ObjectMetadata is the default storage mode. If the ObjectMetadata mode is
 * used, then encryption information will be placed in the metadata of the
 * encrypted object stored in S3. Note: There is a 2 KB limit on the size of the
 * metadata, so be careful that you do not run out of space if you are storing a
 * lot of your own metadata.
 * <p>
 * If the InstructionFile mode is used, then encryption information will be
 * placed in a separate instruction file that will be stored in the same bucket
 * as the encrypted object in S3. No metadata will be used for storing
 * encryption information.
 */
public enum CryptoStorageMode {
    InstructionFile,
    ObjectMetadata
}
