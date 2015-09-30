/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a Spot fleet request that was successfully canceled.
 * </p>
 */
public class CancelSpotFleetRequestsSuccessItem implements Serializable, Cloneable {

    /**
     * The ID of the Spot fleet request.
     */
    private String spotFleetRequestId;

    /**
     * The current state of the Spot fleet request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>submitted, active, cancelled, failed, cancelled_running, cancelled_terminating, modifying
     */
    private String currentSpotFleetRequestState;

    /**
     * The previous state of the Spot fleet request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>submitted, active, cancelled, failed, cancelled_running, cancelled_terminating, modifying
     */
    private String previousSpotFleetRequestState;

    /**
     * The ID of the Spot fleet request.
     *
     * @return The ID of the Spot fleet request.
     */
    public String getSpotFleetRequestId() {
        return spotFleetRequestId;
    }
    
    /**
     * The ID of the Spot fleet request.
     *
     * @param spotFleetRequestId The ID of the Spot fleet request.
     */
    public void setSpotFleetRequestId(String spotFleetRequestId) {
        this.spotFleetRequestId = spotFleetRequestId;
    }
    
    /**
     * The ID of the Spot fleet request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param spotFleetRequestId The ID of the Spot fleet request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CancelSpotFleetRequestsSuccessItem withSpotFleetRequestId(String spotFleetRequestId) {
        this.spotFleetRequestId = spotFleetRequestId;
        return this;
    }

    /**
     * The current state of the Spot fleet request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>submitted, active, cancelled, failed, cancelled_running, cancelled_terminating, modifying
     *
     * @return The current state of the Spot fleet request.
     *
     * @see BatchState
     */
    public String getCurrentSpotFleetRequestState() {
        return currentSpotFleetRequestState;
    }
    
    /**
     * The current state of the Spot fleet request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>submitted, active, cancelled, failed, cancelled_running, cancelled_terminating, modifying
     *
     * @param currentSpotFleetRequestState The current state of the Spot fleet request.
     *
     * @see BatchState
     */
    public void setCurrentSpotFleetRequestState(String currentSpotFleetRequestState) {
        this.currentSpotFleetRequestState = currentSpotFleetRequestState;
    }
    
    /**
     * The current state of the Spot fleet request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>submitted, active, cancelled, failed, cancelled_running, cancelled_terminating, modifying
     *
     * @param currentSpotFleetRequestState The current state of the Spot fleet request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see BatchState
     */
    public CancelSpotFleetRequestsSuccessItem withCurrentSpotFleetRequestState(String currentSpotFleetRequestState) {
        this.currentSpotFleetRequestState = currentSpotFleetRequestState;
        return this;
    }

    /**
     * The current state of the Spot fleet request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>submitted, active, cancelled, failed, cancelled_running, cancelled_terminating, modifying
     *
     * @param currentSpotFleetRequestState The current state of the Spot fleet request.
     *
     * @see BatchState
     */
    public void setCurrentSpotFleetRequestState(BatchState currentSpotFleetRequestState) {
        this.currentSpotFleetRequestState = currentSpotFleetRequestState.toString();
    }
    
    /**
     * The current state of the Spot fleet request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>submitted, active, cancelled, failed, cancelled_running, cancelled_terminating, modifying
     *
     * @param currentSpotFleetRequestState The current state of the Spot fleet request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see BatchState
     */
    public CancelSpotFleetRequestsSuccessItem withCurrentSpotFleetRequestState(BatchState currentSpotFleetRequestState) {
        this.currentSpotFleetRequestState = currentSpotFleetRequestState.toString();
        return this;
    }

    /**
     * The previous state of the Spot fleet request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>submitted, active, cancelled, failed, cancelled_running, cancelled_terminating, modifying
     *
     * @return The previous state of the Spot fleet request.
     *
     * @see BatchState
     */
    public String getPreviousSpotFleetRequestState() {
        return previousSpotFleetRequestState;
    }
    
    /**
     * The previous state of the Spot fleet request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>submitted, active, cancelled, failed, cancelled_running, cancelled_terminating, modifying
     *
     * @param previousSpotFleetRequestState The previous state of the Spot fleet request.
     *
     * @see BatchState
     */
    public void setPreviousSpotFleetRequestState(String previousSpotFleetRequestState) {
        this.previousSpotFleetRequestState = previousSpotFleetRequestState;
    }
    
    /**
     * The previous state of the Spot fleet request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>submitted, active, cancelled, failed, cancelled_running, cancelled_terminating, modifying
     *
     * @param previousSpotFleetRequestState The previous state of the Spot fleet request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see BatchState
     */
    public CancelSpotFleetRequestsSuccessItem withPreviousSpotFleetRequestState(String previousSpotFleetRequestState) {
        this.previousSpotFleetRequestState = previousSpotFleetRequestState;
        return this;
    }

    /**
     * The previous state of the Spot fleet request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>submitted, active, cancelled, failed, cancelled_running, cancelled_terminating, modifying
     *
     * @param previousSpotFleetRequestState The previous state of the Spot fleet request.
     *
     * @see BatchState
     */
    public void setPreviousSpotFleetRequestState(BatchState previousSpotFleetRequestState) {
        this.previousSpotFleetRequestState = previousSpotFleetRequestState.toString();
    }
    
    /**
     * The previous state of the Spot fleet request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>submitted, active, cancelled, failed, cancelled_running, cancelled_terminating, modifying
     *
     * @param previousSpotFleetRequestState The previous state of the Spot fleet request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see BatchState
     */
    public CancelSpotFleetRequestsSuccessItem withPreviousSpotFleetRequestState(BatchState previousSpotFleetRequestState) {
        this.previousSpotFleetRequestState = previousSpotFleetRequestState.toString();
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSpotFleetRequestId() != null) sb.append("SpotFleetRequestId: " + getSpotFleetRequestId() + ",");
        if (getCurrentSpotFleetRequestState() != null) sb.append("CurrentSpotFleetRequestState: " + getCurrentSpotFleetRequestState() + ",");
        if (getPreviousSpotFleetRequestState() != null) sb.append("PreviousSpotFleetRequestState: " + getPreviousSpotFleetRequestState() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSpotFleetRequestId() == null) ? 0 : getSpotFleetRequestId().hashCode()); 
        hashCode = prime * hashCode + ((getCurrentSpotFleetRequestState() == null) ? 0 : getCurrentSpotFleetRequestState().hashCode()); 
        hashCode = prime * hashCode + ((getPreviousSpotFleetRequestState() == null) ? 0 : getPreviousSpotFleetRequestState().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CancelSpotFleetRequestsSuccessItem == false) return false;
        CancelSpotFleetRequestsSuccessItem other = (CancelSpotFleetRequestsSuccessItem)obj;
        
        if (other.getSpotFleetRequestId() == null ^ this.getSpotFleetRequestId() == null) return false;
        if (other.getSpotFleetRequestId() != null && other.getSpotFleetRequestId().equals(this.getSpotFleetRequestId()) == false) return false; 
        if (other.getCurrentSpotFleetRequestState() == null ^ this.getCurrentSpotFleetRequestState() == null) return false;
        if (other.getCurrentSpotFleetRequestState() != null && other.getCurrentSpotFleetRequestState().equals(this.getCurrentSpotFleetRequestState()) == false) return false; 
        if (other.getPreviousSpotFleetRequestState() == null ^ this.getPreviousSpotFleetRequestState() == null) return false;
        if (other.getPreviousSpotFleetRequestState() != null && other.getPreviousSpotFleetRequestState().equals(this.getPreviousSpotFleetRequestState()) == false) return false; 
        return true;
    }
    
    @Override
    public CancelSpotFleetRequestsSuccessItem clone() {
        try {
            return (CancelSpotFleetRequestsSuccessItem) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    