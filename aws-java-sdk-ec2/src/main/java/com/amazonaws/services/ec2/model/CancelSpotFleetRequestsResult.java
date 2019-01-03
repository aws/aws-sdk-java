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

import com.amazonaws.AmazonWebServiceResult;

/**
 * <p>
 * Contains the output of CancelSpotFleetRequests.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CancelSpotFleetRequestsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the Spot Fleet requests that are successfully canceled.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<CancelSpotFleetRequestsSuccessItem> successfulFleetRequests;
    /**
     * <p>
     * Information about the Spot Fleet requests that are not successfully canceled.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<CancelSpotFleetRequestsErrorItem> unsuccessfulFleetRequests;

    /**
     * <p>
     * Information about the Spot Fleet requests that are successfully canceled.
     * </p>
     * 
     * @return Information about the Spot Fleet requests that are successfully canceled.
     */

    public java.util.List<CancelSpotFleetRequestsSuccessItem> getSuccessfulFleetRequests() {
        if (successfulFleetRequests == null) {
            successfulFleetRequests = new com.amazonaws.internal.SdkInternalList<CancelSpotFleetRequestsSuccessItem>();
        }
        return successfulFleetRequests;
    }

    /**
     * <p>
     * Information about the Spot Fleet requests that are successfully canceled.
     * </p>
     * 
     * @param successfulFleetRequests
     *        Information about the Spot Fleet requests that are successfully canceled.
     */

    public void setSuccessfulFleetRequests(java.util.Collection<CancelSpotFleetRequestsSuccessItem> successfulFleetRequests) {
        if (successfulFleetRequests == null) {
            this.successfulFleetRequests = null;
            return;
        }

        this.successfulFleetRequests = new com.amazonaws.internal.SdkInternalList<CancelSpotFleetRequestsSuccessItem>(successfulFleetRequests);
    }

    /**
     * <p>
     * Information about the Spot Fleet requests that are successfully canceled.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSuccessfulFleetRequests(java.util.Collection)} or
     * {@link #withSuccessfulFleetRequests(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param successfulFleetRequests
     *        Information about the Spot Fleet requests that are successfully canceled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelSpotFleetRequestsResult withSuccessfulFleetRequests(CancelSpotFleetRequestsSuccessItem... successfulFleetRequests) {
        if (this.successfulFleetRequests == null) {
            setSuccessfulFleetRequests(new com.amazonaws.internal.SdkInternalList<CancelSpotFleetRequestsSuccessItem>(successfulFleetRequests.length));
        }
        for (CancelSpotFleetRequestsSuccessItem ele : successfulFleetRequests) {
            this.successfulFleetRequests.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the Spot Fleet requests that are successfully canceled.
     * </p>
     * 
     * @param successfulFleetRequests
     *        Information about the Spot Fleet requests that are successfully canceled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelSpotFleetRequestsResult withSuccessfulFleetRequests(java.util.Collection<CancelSpotFleetRequestsSuccessItem> successfulFleetRequests) {
        setSuccessfulFleetRequests(successfulFleetRequests);
        return this;
    }

    /**
     * <p>
     * Information about the Spot Fleet requests that are not successfully canceled.
     * </p>
     * 
     * @return Information about the Spot Fleet requests that are not successfully canceled.
     */

    public java.util.List<CancelSpotFleetRequestsErrorItem> getUnsuccessfulFleetRequests() {
        if (unsuccessfulFleetRequests == null) {
            unsuccessfulFleetRequests = new com.amazonaws.internal.SdkInternalList<CancelSpotFleetRequestsErrorItem>();
        }
        return unsuccessfulFleetRequests;
    }

    /**
     * <p>
     * Information about the Spot Fleet requests that are not successfully canceled.
     * </p>
     * 
     * @param unsuccessfulFleetRequests
     *        Information about the Spot Fleet requests that are not successfully canceled.
     */

    public void setUnsuccessfulFleetRequests(java.util.Collection<CancelSpotFleetRequestsErrorItem> unsuccessfulFleetRequests) {
        if (unsuccessfulFleetRequests == null) {
            this.unsuccessfulFleetRequests = null;
            return;
        }

        this.unsuccessfulFleetRequests = new com.amazonaws.internal.SdkInternalList<CancelSpotFleetRequestsErrorItem>(unsuccessfulFleetRequests);
    }

    /**
     * <p>
     * Information about the Spot Fleet requests that are not successfully canceled.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUnsuccessfulFleetRequests(java.util.Collection)} or
     * {@link #withUnsuccessfulFleetRequests(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param unsuccessfulFleetRequests
     *        Information about the Spot Fleet requests that are not successfully canceled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelSpotFleetRequestsResult withUnsuccessfulFleetRequests(CancelSpotFleetRequestsErrorItem... unsuccessfulFleetRequests) {
        if (this.unsuccessfulFleetRequests == null) {
            setUnsuccessfulFleetRequests(new com.amazonaws.internal.SdkInternalList<CancelSpotFleetRequestsErrorItem>(unsuccessfulFleetRequests.length));
        }
        for (CancelSpotFleetRequestsErrorItem ele : unsuccessfulFleetRequests) {
            this.unsuccessfulFleetRequests.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the Spot Fleet requests that are not successfully canceled.
     * </p>
     * 
     * @param unsuccessfulFleetRequests
     *        Information about the Spot Fleet requests that are not successfully canceled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelSpotFleetRequestsResult withUnsuccessfulFleetRequests(java.util.Collection<CancelSpotFleetRequestsErrorItem> unsuccessfulFleetRequests) {
        setUnsuccessfulFleetRequests(unsuccessfulFleetRequests);
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
        if (getSuccessfulFleetRequests() != null)
            sb.append("SuccessfulFleetRequests: ").append(getSuccessfulFleetRequests()).append(",");
        if (getUnsuccessfulFleetRequests() != null)
            sb.append("UnsuccessfulFleetRequests: ").append(getUnsuccessfulFleetRequests());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CancelSpotFleetRequestsResult == false)
            return false;
        CancelSpotFleetRequestsResult other = (CancelSpotFleetRequestsResult) obj;
        if (other.getSuccessfulFleetRequests() == null ^ this.getSuccessfulFleetRequests() == null)
            return false;
        if (other.getSuccessfulFleetRequests() != null && other.getSuccessfulFleetRequests().equals(this.getSuccessfulFleetRequests()) == false)
            return false;
        if (other.getUnsuccessfulFleetRequests() == null ^ this.getUnsuccessfulFleetRequests() == null)
            return false;
        if (other.getUnsuccessfulFleetRequests() != null && other.getUnsuccessfulFleetRequests().equals(this.getUnsuccessfulFleetRequests()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSuccessfulFleetRequests() == null) ? 0 : getSuccessfulFleetRequests().hashCode());
        hashCode = prime * hashCode + ((getUnsuccessfulFleetRequests() == null) ? 0 : getUnsuccessfulFleetRequests().hashCode());
        return hashCode;
    }

    @Override
    public CancelSpotFleetRequestsResult clone() {
        try {
            return (CancelSpotFleetRequestsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
