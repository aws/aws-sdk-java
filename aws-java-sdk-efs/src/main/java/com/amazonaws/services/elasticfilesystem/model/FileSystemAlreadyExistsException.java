/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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

package com.amazonaws.services.elasticfilesystem.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * Returned if the file system you are trying to create already exists, with the
 * creation token you provided.
 * </p>
 */
public class FileSystemAlreadyExistsException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    @com.fasterxml.jackson.annotation.JsonProperty("ErrorCode")
    private String errorCode;

    @com.fasterxml.jackson.annotation.JsonProperty("FileSystemId")
    private String fileSystemId;

    /**
     * Constructs a new FileSystemAlreadyExistsException with the specified
     * error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public FileSystemAlreadyExistsException(String message) {
        super(message);
    }

    /**
     * @param errorCode
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * @return
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @param errorCode
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public FileSystemAlreadyExistsException withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * @param fileSystemId
     */
    public void setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
    }

    /**
     * @return
     */
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * @param fileSystemId
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public FileSystemAlreadyExistsException withFileSystemId(String fileSystemId) {
        setFileSystemId(fileSystemId);
        return this;
    }

}