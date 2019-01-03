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
 * Describes a Spot Fleet request that was successfully canceled.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CancelSpotFleetRequestsSuccessItem"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CancelSpotFleetRequestsSuccessItem implements Serializable, Cloneable {

    /**
     * <p>
     * The current state of the Spot Fleet request.
     * </p>
     */
    private String currentSpotFleetRequestState;
    /**
     * <p>
     * The previous state of the Spot Fleet request.
     * </p>
     */
    private String previousSpotFleetRequestState;
    /**
     * <p>
     * The ID of the Spot Fleet request.
     * </p>
     */
    private String spotFleetRequestId;

    /**
     * <p>
     * The current state of the Spot Fleet request.
     * </p>
     * 
     * @param currentSpotFleetRequestState
     *        The current state of the Spot Fleet request.
     * @see BatchState
     */

    public void setCurrentSpotFleetRequestState(String currentSpotFleetRequestState) {
        this.currentSpotFleetRequestState = currentSpotFleetRequestState;
    }

    /**
     * <p>
     * The current state of the Spot Fleet request.
     * </p>
     * 
     * @return The current state of the Spot Fleet request.
     * @see BatchState
     */

    public String getCurrentSpotFleetRequestState() {
        return this.currentSpotFleetRequestState;
    }

    /**
     * <p>
     * The current state of the Spot Fleet request.
     * </p>
     * 
     * @param currentSpotFleetRequestState
     *        The current state of the Spot Fleet request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BatchState
     */

    public CancelSpotFleetRequestsSuccessItem withCurrentSpotFleetRequestState(String currentSpotFleetRequestState) {
        setCurrentSpotFleetRequestState(currentSpotFleetRequestState);
        return this;
    }

    /**
     * <p>
     * The current state of the Spot Fleet request.
     * </p>
     * 
     * @param currentSpotFleetRequestState
     *        The current state of the Spot Fleet request.
     * @see BatchState
     */

    public void setCurrentSpotFleetRequestState(BatchState currentSpotFleetRequestState) {
        withCurrentSpotFleetRequestState(currentSpotFleetRequestState);
    }

    /**
     * <p>
     * The current state of the Spot Fleet request.
     * </p>
     * 
     * @param currentSpotFleetRequestState
     *        The current state of the Spot Fleet request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BatchState
     */

    public CancelSpotFleetRequestsSuccessItem withCurrentSpotFleetRequestState(BatchState currentSpotFleetRequestState) {
        this.currentSpotFleetRequestState = currentSpotFleetRequestState.toString();
        return this;
    }

    /**
     * <p>
     * The previous state of the Spot Fleet request.
     * </p>
     * 
     * @param previousSpotFleetRequestState
     *        The previous state of the Spot Fleet request.
     * @see BatchState
     */

    public void setPreviousSpotFleetRequestState(String previousSpotFleetRequestState) {
        this.previousSpotFleetRequestState = previousSpotFleetRequestState;
    }

    /**
     * <p>
     * The previous state of the Spot Fleet request.
     * </p>
     * 
     * @return The previous state of the Spot Fleet request.
     * @see BatchState
     */

    public String getPreviousSpotFleetRequestState() {
        return this.previousSpotFleetRequestState;
    }

    /**
     * <p>
     * The previous state of the Spot Fleet request.
     * </p>
     * 
     * @param previousSpotFleetRequestState
     *        The previous state of the Spot Fleet request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BatchState
     */

    public CancelSpotFleetRequestsSuccessItem withPreviousSpotFleetRequestState(String previousSpotFleetRequestState) {
        setPreviousSpotFleetRequestState(previousSpotFleetRequestState);
        return this;
    }

    /**
     * <p>
     * The previous state of the Spot Fleet request.
     * </p>
     * 
     * @param previousSpotFleetRequestState
     *        The previous state of the Spot Fleet request.
     * @see BatchState
     */

    public void setPreviousSpotFleetRequestState(BatchState previousSpotFleetRequestState) {
        withPreviousSpotFleetRequestState(previousSpotFleetRequestState);
    }

    /**
     * <p>
     * The previous state of the Spot Fleet request.
     * </p>
     * 
     * @param previousSpotFleetRequestState
     *        The previous state of the Spot Fleet request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BatchState
     */

    public CancelSpotFleetRequestsSuccessItem withPreviousSpotFleetRequestState(BatchState previousSpotFleetRequestState) {
        this.previousSpotFleetRequestState = previousSpotFleetRequestState.toString();
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

    public CancelSpotFleetRequestsSuccessItem withSpotFleetRequestId(String spotFleetRequestId) {
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
        if (getCurrentSpotFleetRequestState() != null)
            sb.append("CurrentSpotFleetRequestState: ").append(getCurrentSpotFleetRequestState()).append(",");
        if (getPreviousSpotFleetRequestState() != null)
            sb.append("PreviousSpotFleetRequestState: ").append(getPreviousSpotFleetRequestState()).append(",");
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

        if (obj instanceof CancelSpotFleetRequestsSuccessItem == false)
            return false;
        CancelSpotFleetRequestsSuccessItem other = (CancelSpotFleetRequestsSuccessItem) obj;
        if (other.getCurrentSpotFleetRequestState() == null ^ this.getCurrentSpotFleetRequestState() == null)
            return false;
        if (other.getCurrentSpotFleetRequestState() != null && other.getCurrentSpotFleetRequestState().equals(this.getCurrentSpotFleetRequestState()) == false)
            return false;
        if (other.getPreviousSpotFleetRequestState() == null ^ this.getPreviousSpotFleetRequestState() == null)
            return false;
        if (other.getPreviousSpotFleetRequestState() != null
                && other.getPreviousSpotFleetRequestState().equals(this.getPreviousSpotFleetRequestState()) == false)
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

        hashCode = prime * hashCode + ((getCurrentSpotFleetRequestState() == null) ? 0 : getCurrentSpotFleetRequestState().hashCode());
        hashCode = prime * hashCode + ((getPreviousSpotFleetRequestState() == null) ? 0 : getPreviousSpotFleetRequestState().hashCode());
        hashCode = prime * hashCode + ((getSpotFleetRequestId() == null) ? 0 : getSpotFleetRequestId().hashCode());
        return hashCode;
    }

    @Override
    public CancelSpotFleetRequestsSuccessItem clone() {
        try {
            return (CancelSpotFleetRequestsSuccessItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
