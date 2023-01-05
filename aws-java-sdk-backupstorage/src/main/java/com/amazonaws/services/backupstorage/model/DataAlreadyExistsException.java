/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.backupstorage.model;

import javax.annotation.Generated;

/**
 * Non-retryable exception. Attempted to create already existing object or chunk. This message contains a checksum of
 * already presented data.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataAlreadyExistsException extends com.amazonaws.services.backupstorage.model.AWSBackupStorageException {
    private static final long serialVersionUID = 1L;

    /** Data checksum used */
    private String checksum;
    /** Checksum algorithm used */
    private String checksumAlgorithm;

    /**
     * Constructs a new DataAlreadyExistsException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public DataAlreadyExistsException(String message) {
        super(message);
    }

    /**
     * Data checksum used
     * 
     * @param checksum
     *        Data checksum used
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Checksum")
    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    /**
     * Data checksum used
     * 
     * @return Data checksum used
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Checksum")
    public String getChecksum() {
        return this.checksum;
    }

    /**
     * Data checksum used
     * 
     * @param checksum
     *        Data checksum used
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataAlreadyExistsException withChecksum(String checksum) {
        setChecksum(checksum);
        return this;
    }

    /**
     * Checksum algorithm used
     * 
     * @param checksumAlgorithm
     *        Checksum algorithm used
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ChecksumAlgorithm")
    public void setChecksumAlgorithm(String checksumAlgorithm) {
        this.checksumAlgorithm = checksumAlgorithm;
    }

    /**
     * Checksum algorithm used
     * 
     * @return Checksum algorithm used
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ChecksumAlgorithm")
    public String getChecksumAlgorithm() {
        return this.checksumAlgorithm;
    }

    /**
     * Checksum algorithm used
     * 
     * @param checksumAlgorithm
     *        Checksum algorithm used
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataAlreadyExistsException withChecksumAlgorithm(String checksumAlgorithm) {
        setChecksumAlgorithm(checksumAlgorithm);
        return this;
    }

}
