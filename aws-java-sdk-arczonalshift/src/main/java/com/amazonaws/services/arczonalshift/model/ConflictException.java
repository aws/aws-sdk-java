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
package com.amazonaws.services.arczonalshift.model;

import javax.annotation.Generated;

/**
 * <p>
 * The request could not be processed because of conflict in the current state of the resource.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConflictException extends com.amazonaws.services.arczonalshift.model.AWSARCZonalShiftException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The reason for the conflict exception.
     * </p>
     */
    private String reason;
    /**
     * <p>
     * The zonal shift ID associated with the conflict exception.
     * </p>
     */
    private String zonalShiftId;

    /**
     * Constructs a new ConflictException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ConflictException(String message) {
        super(message);
    }

    /**
     * <p>
     * The reason for the conflict exception.
     * </p>
     * 
     * @param reason
     *        The reason for the conflict exception.
     * @see ConflictExceptionReason
     */

    @com.fasterxml.jackson.annotation.JsonProperty("reason")
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * The reason for the conflict exception.
     * </p>
     * 
     * @return The reason for the conflict exception.
     * @see ConflictExceptionReason
     */

    @com.fasterxml.jackson.annotation.JsonProperty("reason")
    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * The reason for the conflict exception.
     * </p>
     * 
     * @param reason
     *        The reason for the conflict exception.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConflictExceptionReason
     */

    public ConflictException withReason(String reason) {
        setReason(reason);
        return this;
    }

    /**
     * <p>
     * The reason for the conflict exception.
     * </p>
     * 
     * @param reason
     *        The reason for the conflict exception.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConflictExceptionReason
     */

    public ConflictException withReason(ConflictExceptionReason reason) {
        this.reason = reason.toString();
        return this;
    }

    /**
     * <p>
     * The zonal shift ID associated with the conflict exception.
     * </p>
     * 
     * @param zonalShiftId
     *        The zonal shift ID associated with the conflict exception.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("zonalShiftId")
    public void setZonalShiftId(String zonalShiftId) {
        this.zonalShiftId = zonalShiftId;
    }

    /**
     * <p>
     * The zonal shift ID associated with the conflict exception.
     * </p>
     * 
     * @return The zonal shift ID associated with the conflict exception.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("zonalShiftId")
    public String getZonalShiftId() {
        return this.zonalShiftId;
    }

    /**
     * <p>
     * The zonal shift ID associated with the conflict exception.
     * </p>
     * 
     * @param zonalShiftId
     *        The zonal shift ID associated with the conflict exception.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConflictException withZonalShiftId(String zonalShiftId) {
        setZonalShiftId(zonalShiftId);
        return this;
    }

}
