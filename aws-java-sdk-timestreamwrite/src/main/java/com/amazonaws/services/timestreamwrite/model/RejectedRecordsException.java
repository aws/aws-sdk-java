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
package com.amazonaws.services.timestreamwrite.model;

import javax.annotation.Generated;

/**
 * <p>
 * WriteRecords would throw this exception in the following cases:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Records with duplicate data where there are multiple records with the same dimensions, timestamps, and measure names
 * but different measure values.
 * </p>
 * </li>
 * <li>
 * <p>
 * Records with timestamps that lie outside the retention duration of the memory store
 * </p>
 * </li>
 * <li>
 * <p>
 * Records with dimensions or measures that exceed the Timestream defined limits.
 * </p>
 * </li>
 * </ul>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/timestream/latest/developerguide/ts-limits.html">Access Management</a> in the
 * Timestream Developer Guide.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RejectedRecordsException extends com.amazonaws.services.timestreamwrite.model.AmazonTimestreamWriteException {
    private static final long serialVersionUID = 1L;

    private java.util.List<RejectedRecord> rejectedRecords;

    /**
     * Constructs a new RejectedRecordsException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public RejectedRecordsException(String message) {
        super(message);
    }

    /**
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("RejectedRecords")
    public java.util.List<RejectedRecord> getRejectedRecords() {
        return rejectedRecords;
    }

    /**
     * @param rejectedRecords
     */

    @com.fasterxml.jackson.annotation.JsonProperty("RejectedRecords")
    public void setRejectedRecords(java.util.Collection<RejectedRecord> rejectedRecords) {
        if (rejectedRecords == null) {
            this.rejectedRecords = null;
            return;
        }

        this.rejectedRecords = new java.util.ArrayList<RejectedRecord>(rejectedRecords);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRejectedRecords(java.util.Collection)} or {@link #withRejectedRecords(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param rejectedRecords
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RejectedRecordsException withRejectedRecords(RejectedRecord... rejectedRecords) {
        if (this.rejectedRecords == null) {
            setRejectedRecords(new java.util.ArrayList<RejectedRecord>(rejectedRecords.length));
        }
        for (RejectedRecord ele : rejectedRecords) {
            this.rejectedRecords.add(ele);
        }
        return this;
    }

    /**
     * @param rejectedRecords
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RejectedRecordsException withRejectedRecords(java.util.Collection<RejectedRecord> rejectedRecords) {
        setRejectedRecords(rejectedRecords);
        return this;
    }

}
