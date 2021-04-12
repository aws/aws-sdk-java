/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * You can't delete a backup while it's being copied.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BackupBeingCopiedException extends com.amazonaws.services.fsx.model.AmazonFSxException {
    private static final long serialVersionUID = 1L;

    private String backupId;

    /**
     * Constructs a new BackupBeingCopiedException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public BackupBeingCopiedException(String message) {
        super(message);
    }

    /**
     * @param backupId
     */

    @com.fasterxml.jackson.annotation.JsonProperty("BackupId")
    public void setBackupId(String backupId) {
        this.backupId = backupId;
    }

    /**
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("BackupId")
    public String getBackupId() {
        return this.backupId;
    }

    /**
     * @param backupId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackupBeingCopiedException withBackupId(String backupId) {
        setBackupId(backupId);
        return this;
    }

}
