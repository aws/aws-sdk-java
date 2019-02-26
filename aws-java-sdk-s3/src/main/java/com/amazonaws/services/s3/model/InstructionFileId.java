/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.annotation.Immutable;

/**
 * The S3 object identifier for an instruction file.
 */
@Immutable
public final class InstructionFileId extends S3ObjectId {
    public static final String DEFAULT_INSTRUCTION_FILE_SUFFIX = "instruction";
    @Deprecated
    public static final String DEFAULT_INSTURCTION_FILE_SUFFIX = DEFAULT_INSTRUCTION_FILE_SUFFIX;
    public static final String DOT = ".";

    /**
     * Package private to enable the enforcement of naming convention for
     * instruction file.
     * 
     * @param key
     *            key of the instruction file.
     * @param versionId
     *            the version id of an instruction file is expected to be the
     *            same as that of the corresponding (encrypted) S3 object
     * 
     * @see S3ObjectId#instructionFileId()
     * @see S3ObjectId#instructionFileId(String)
     */
    InstructionFileId(String bucket, String key, String versionId) {
        super(bucket, key, versionId);
    }

    /**
     * Always throws {@link UnsupportedOperationException} since an instruction
     * file itself cannot further have an instruction file.
     */
    @Override
    public InstructionFileId instructionFileId() {
        throw new UnsupportedOperationException();
    }

    /**
     * Always throws {@link UnsupportedOperationException} since an instruction
     * file itself cannot further have an instruction file.
     */
    @Override
    public InstructionFileId instructionFileId(String suffix) {
        throw new UnsupportedOperationException();
    }
}
