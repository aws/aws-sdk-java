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
package com.amazonaws.services.directory.model;

import javax.annotation.Generated;

/**
 * <p>
 * The maximum number of manual snapshots for the directory has been reached. You can use the <a>GetSnapshotLimits</a>
 * operation to determine the snapshot limits for a directory.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SnapshotLimitExceededException extends com.amazonaws.services.directory.model.AWSDirectoryServiceException {
    private static final long serialVersionUID = 1L;

    private String requestId;

    /**
     * Constructs a new SnapshotLimitExceededException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public SnapshotLimitExceededException(String message) {
        super(message);
    }

    /**
     * @param requestId
     */

    @com.fasterxml.jackson.annotation.JsonProperty("RequestId")
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("RequestId")
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @param requestId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnapshotLimitExceededException withRequestId(String requestId) {
        setRequestId(requestId);
        return this;
    }

}
