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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a Spot Fleet request that was not successfully canceled.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CancelSpotFleetRequestsErrorItem"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CancelSpotFleetRequestsErrorItem implements Serializable, Cloneable {

    /**
     * <p>
     * The error.
     * </p>
     */
    private CancelSpotFleetRequestsError error;
    /**
     * <p>
     * The ID of the Spot Fleet request.
     * </p>
     */
    private String spotFleetRequestId;

    /**
     * <p>
     * The error.
     * </p>
     * 
     * @param error
     *        The error.
     */

    public void setError(CancelSpotFleetRequestsError error) {
        this.error = error;
    }

    /**
     * <p>
     * The error.
     * </p>
     * 
     * @return The error.
     */

    public CancelSpotFleetRequestsError getError() {
        return this.error;
    }

    /**
     * <p>
     * The error.
     * </p>
     * 
     * @param error
     *        The error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelSpotFleetRequestsErrorItem withError(CancelSpotFleetRequestsError error) {
        setError(error);
        return this;
    }

    /**
     * <p>
     * The ID of the Spot Fleet request.
     * </p>
     * 
     * @param spotFleetRequestId
     *        The ID of the Spot Fleet request.
     */

    public void setSpotFleetRequestId(String spotFleetRequestId) {
        this.spotFleetRequestId = spotFleetRequestId;
    }

    /**
     * <p>
     * The ID of the Spot Fleet request.
     * </p>
     * 
     * @return The ID of the Spot Fleet request.
     */

    public String getSpotFleetRequestId() {
        return this.spotFleetRequestId;
    }

    /**
     * <p>
     * The ID of the Spot Fleet request.
     * </p>
     * 
     * @param spotFleetRequestId
     *        The ID of the Spot Fleet request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelSpotFleetRequestsErrorItem withSpotFleetRequestId(String spotFleetRequestId) {
        setSpotFleetRequestId(spotFleetRequestId);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getError() != null)
            sb.append("Error: ").append(getError()).append(",");
        if (getSpotFleetRequestId() != null)
            sb.append("SpotFleetRequestId: ").append(getSpotFleetRequestId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CancelSpotFleetRequestsErrorItem == false)
            return false;
        CancelSpotFleetRequestsErrorItem other = (CancelSpotFleetRequestsErrorItem) obj;
        if (other.getError() == null ^ this.getError() == null)
            return false;
        if (other.getError() != null && other.getError().equals(this.getError()) == false)
            return false;
        if (other.getSpotFleetRequestId() == null ^ this.getSpotFleetRequestId() == null)
            return false;
        if (other.getSpotFleetRequestId() != null && other.getSpotFleetRequestId().equals(this.getSpotFleetRequestId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getError() == null) ? 0 : getError().hashCode());
        hashCode = prime * hashCode + ((getSpotFleetRequestId() == null) ? 0 : getSpotFleetRequestId().hashCode());
        return hashCode;
    }

    @Override
    public CancelSpotFleetRequestsErrorItem clone() {
        try {
            return (CancelSpotFleetRequestsErrorItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
