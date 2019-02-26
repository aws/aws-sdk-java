/*
 * Copyright 2018-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

public class Stats implements Serializable {
    private Long bytesScanned;
    private Long bytesProcessed;
    private Long bytesReturned;

    /**
     * Total number of object bytes scanned.
     */
    public Long getBytesScanned() {
        return bytesScanned;
    }

    /**
     * Total number of object bytes scanned.
     */
    public void setBytesScanned(Long bytesScanned) {
        this.bytesScanned = bytesScanned;
    }

    /**
     * Total number of object bytes scanned.
     */
    public Stats withBytesScanned(Long readBytes) {
        setBytesScanned(readBytes);
        return this;
    }

    /**
     * Total number of bytes of records payload data returned.
     */
    public Long getBytesReturned() {
        return bytesReturned;
    }

    /**
     * Total number of bytes of records payload data returned.
     */
    public void setBytesReturned(Long bytesReturned) {
        this.bytesReturned = bytesReturned;
    }

    /**
     * Total number of bytes of records payload data returned.
     */
    public Stats withBytesReturned(Long bytesReturned) {
        setBytesReturned(bytesReturned);
        return this;
    }

    /**
     * Total number of uncompressed object bytes processed.
     */
    public Long getBytesProcessed() {
        return bytesProcessed;
    }

    /**
     * Total number of uncompressed object bytes processed.
     */
    public void setBytesProcessed(Long bytesProcessed) {
        this.bytesProcessed = bytesProcessed;
    }

    /**
     * Total number of uncompressed object bytes processed.
     */
    public Stats withBytesProcessed(Long processedBytes) {
        setBytesProcessed(processedBytes);
        return this;
    }
}
