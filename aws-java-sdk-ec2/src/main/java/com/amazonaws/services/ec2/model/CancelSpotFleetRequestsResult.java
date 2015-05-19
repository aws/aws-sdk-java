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
 * Contains the output of CancelSpotFleetRequests.
 * </p>
 */
public class CancelSpotFleetRequestsResult implements Serializable, Cloneable {

    /**
     * Information about the Spot fleet requests that are not successfully
     * canceled.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<CancelSpotFleetRequestsErrorItem> unsuccessfulFleetRequests;

    /**
     * Information about the Spot fleet requests that are successfully
     * canceled.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<CancelSpotFleetRequestsSuccessItem> successfulFleetRequests;

    /**
     * Information about the Spot fleet requests that are not successfully
     * canceled.
     *
     * @return Information about the Spot fleet requests that are not successfully
     *         canceled.
     */
    public java.util.List<CancelSpotFleetRequestsErrorItem> getUnsuccessfulFleetRequests() {
        if (unsuccessfulFleetRequests == null) {
              unsuccessfulFleetRequests = new com.amazonaws.internal.ListWithAutoConstructFlag<CancelSpotFleetRequestsErrorItem>();
              unsuccessfulFleetRequests.setAutoConstruct(true);
        }
        return unsuccessfulFleetRequests;
    }
    
    /**
     * Information about the Spot fleet requests that are not successfully
     * canceled.
     *
     * @param unsuccessfulFleetRequests Information about the Spot fleet requests that are not successfully
     *         canceled.
     */
    public void setUnsuccessfulFleetRequests(java.util.Collection<CancelSpotFleetRequestsErrorItem> unsuccessfulFleetRequests) {
        if (unsuccessfulFleetRequests == null) {
            this.unsuccessfulFleetRequests = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<CancelSpotFleetRequestsErrorItem> unsuccessfulFleetRequestsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<CancelSpotFleetRequestsErrorItem>(unsuccessfulFleetRequests.size());
        unsuccessfulFleetRequestsCopy.addAll(unsuccessfulFleetRequests);
        this.unsuccessfulFleetRequests = unsuccessfulFleetRequestsCopy;
    }
    
    /**
     * Information about the Spot fleet requests that are not successfully
     * canceled.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setUnsuccessfulFleetRequests(java.util.Collection)}
     * or {@link #withUnsuccessfulFleetRequests(java.util.Collection)} if you
     * want to override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param unsuccessfulFleetRequests Information about the Spot fleet requests that are not successfully
     *         canceled.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CancelSpotFleetRequestsResult withUnsuccessfulFleetRequests(CancelSpotFleetRequestsErrorItem... unsuccessfulFleetRequests) {
        if (getUnsuccessfulFleetRequests() == null) setUnsuccessfulFleetRequests(new java.util.ArrayList<CancelSpotFleetRequestsErrorItem>(unsuccessfulFleetRequests.length));
        for (CancelSpotFleetRequestsErrorItem value : unsuccessfulFleetRequests) {
            getUnsuccessfulFleetRequests().add(value);
        }
        return this;
    }
    
    /**
     * Information about the Spot fleet requests that are not successfully
     * canceled.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param unsuccessfulFleetRequests Information about the Spot fleet requests that are not successfully
     *         canceled.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CancelSpotFleetRequestsResult withUnsuccessfulFleetRequests(java.util.Collection<CancelSpotFleetRequestsErrorItem> unsuccessfulFleetRequests) {
        if (unsuccessfulFleetRequests == null) {
            this.unsuccessfulFleetRequests = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<CancelSpotFleetRequestsErrorItem> unsuccessfulFleetRequestsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<CancelSpotFleetRequestsErrorItem>(unsuccessfulFleetRequests.size());
            unsuccessfulFleetRequestsCopy.addAll(unsuccessfulFleetRequests);
            this.unsuccessfulFleetRequests = unsuccessfulFleetRequestsCopy;
        }

        return this;
    }

    /**
     * Information about the Spot fleet requests that are successfully
     * canceled.
     *
     * @return Information about the Spot fleet requests that are successfully
     *         canceled.
     */
    public java.util.List<CancelSpotFleetRequestsSuccessItem> getSuccessfulFleetRequests() {
        if (successfulFleetRequests == null) {
              successfulFleetRequests = new com.amazonaws.internal.ListWithAutoConstructFlag<CancelSpotFleetRequestsSuccessItem>();
              successfulFleetRequests.setAutoConstruct(true);
        }
        return successfulFleetRequests;
    }
    
    /**
     * Information about the Spot fleet requests that are successfully
     * canceled.
     *
     * @param successfulFleetRequests Information about the Spot fleet requests that are successfully
     *         canceled.
     */
    public void setSuccessfulFleetRequests(java.util.Collection<CancelSpotFleetRequestsSuccessItem> successfulFleetRequests) {
        if (successfulFleetRequests == null) {
            this.successfulFleetRequests = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<CancelSpotFleetRequestsSuccessItem> successfulFleetRequestsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<CancelSpotFleetRequestsSuccessItem>(successfulFleetRequests.size());
        successfulFleetRequestsCopy.addAll(successfulFleetRequests);
        this.successfulFleetRequests = successfulFleetRequestsCopy;
    }
    
    /**
     * Information about the Spot fleet requests that are successfully
     * canceled.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setSuccessfulFleetRequests(java.util.Collection)} or
     * {@link #withSuccessfulFleetRequests(java.util.Collection)} if you want
     * to override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param successfulFleetRequests Information about the Spot fleet requests that are successfully
     *         canceled.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CancelSpotFleetRequestsResult withSuccessfulFleetRequests(CancelSpotFleetRequestsSuccessItem... successfulFleetRequests) {
        if (getSuccessfulFleetRequests() == null) setSuccessfulFleetRequests(new java.util.ArrayList<CancelSpotFleetRequestsSuccessItem>(successfulFleetRequests.length));
        for (CancelSpotFleetRequestsSuccessItem value : successfulFleetRequests) {
            getSuccessfulFleetRequests().add(value);
        }
        return this;
    }
    
    /**
     * Information about the Spot fleet requests that are successfully
     * canceled.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param successfulFleetRequests Information about the Spot fleet requests that are successfully
     *         canceled.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CancelSpotFleetRequestsResult withSuccessfulFleetRequests(java.util.Collection<CancelSpotFleetRequestsSuccessItem> successfulFleetRequests) {
        if (successfulFleetRequests == null) {
            this.successfulFleetRequests = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<CancelSpotFleetRequestsSuccessItem> successfulFleetRequestsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<CancelSpotFleetRequestsSuccessItem>(successfulFleetRequests.size());
            successfulFleetRequestsCopy.addAll(successfulFleetRequests);
            this.successfulFleetRequests = successfulFleetRequestsCopy;
        }

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
        if (getUnsuccessfulFleetRequests() != null) sb.append("UnsuccessfulFleetRequests: " + getUnsuccessfulFleetRequests() + ",");
        if (getSuccessfulFleetRequests() != null) sb.append("SuccessfulFleetRequests: " + getSuccessfulFleetRequests() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getUnsuccessfulFleetRequests() == null) ? 0 : getUnsuccessfulFleetRequests().hashCode()); 
        hashCode = prime * hashCode + ((getSuccessfulFleetRequests() == null) ? 0 : getSuccessfulFleetRequests().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CancelSpotFleetRequestsResult == false) return false;
        CancelSpotFleetRequestsResult other = (CancelSpotFleetRequestsResult)obj;
        
        if (other.getUnsuccessfulFleetRequests() == null ^ this.getUnsuccessfulFleetRequests() == null) return false;
        if (other.getUnsuccessfulFleetRequests() != null && other.getUnsuccessfulFleetRequests().equals(this.getUnsuccessfulFleetRequests()) == false) return false; 
        if (other.getSuccessfulFleetRequests() == null ^ this.getSuccessfulFleetRequests() == null) return false;
        if (other.getSuccessfulFleetRequests() != null && other.getSuccessfulFleetRequests().equals(this.getSuccessfulFleetRequests()) == false) return false; 
        return true;
    }
    
    @Override
    public CancelSpotFleetRequestsResult clone() {
        try {
            return (CancelSpotFleetRequestsResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    