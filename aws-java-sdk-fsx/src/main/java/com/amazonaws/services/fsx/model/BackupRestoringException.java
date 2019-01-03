/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.fsx.model;

import javax.annotation.Generated;

/**
 * <p>
 * You can't delete a backup while it's being used to restore a file system.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BackupRestoringException extends com.amazonaws.services.fsx.model.AmazonFSxException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The ID of a file system being restored from the backup.
     * </p>
     */
    private String fileSystemId;

    /**
     * Constructs a new BackupRestoringException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public BackupRestoringException(String message) {
        super(message);
    }

    /**
     * <p>
     * The ID of a file system being restored from the backup.
     * </p>
     * 
     * @param fileSystemId
     *        The ID of a file system being restored from the backup.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("FileSystemId")
    public void setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
    }

    /**
     * <p>
     * The ID of a file system being restored from the backup.
     * </p>
     * 
     * @return The ID of a file system being restored from the backup.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("FileSystemId")
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * <p>
     * The ID of a file system being restored from the backup.
     * </p>
     * 
     * @param fileSystemId
     *        The ID of a file system being restored from the backup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackupRestoringException withFileSystemId(String fileSystemId) {
        setFileSystemId(fileSystemId);
        return this;
    }

}
