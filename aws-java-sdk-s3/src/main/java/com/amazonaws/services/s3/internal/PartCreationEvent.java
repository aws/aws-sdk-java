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
package com.amazonaws.services.s3.internal;

import java.io.File;

import com.amazonaws.services.s3.OnFileDelete;

public class PartCreationEvent {
    private final File part;
    private final int partNumber;
    private final boolean isLastPart;
    private final OnFileDelete fileDeleteObserver;

    PartCreationEvent(File part, int partNumber, boolean isLastPart,
            OnFileDelete fileDeleteObserver) {
        if (part == null)
            throw new IllegalArgumentException("part must not be specified");
        this.part = part;
        this.partNumber = partNumber;
        this.isLastPart = isLastPart;
        this.fileDeleteObserver = fileDeleteObserver;
    }

    /**
     * Returns a non-null part (in the form of a file) for multi-part upload.
     */
    public File getPart() {
        return part;
    }

    public int getPartNumber() {
        return partNumber;
    }

    public boolean isLastPart() {
        return isLastPart;
    }

    /**
     * Returns an observer for file deletion; or null if there is none.
     */
    public OnFileDelete getFileDeleteObserver() {
        return fileDeleteObserver;
    }
}
