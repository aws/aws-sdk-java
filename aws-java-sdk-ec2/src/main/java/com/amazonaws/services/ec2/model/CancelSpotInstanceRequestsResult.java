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
 * Contains the output of CancelSpotInstanceRequests.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CancelSpotInstanceRequestsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * One or more Spot Instance requests.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<CancelledSpotInstanceRequest> cancelledSpotInstanceRequests;

    /**
     * <p>
     * One or more Spot Instance requests.
     * </p>
     * 
     * @return One or more Spot Instance requests.
     */

    public java.util.List<CancelledSpotInstanceRequest> getCancelledSpotInstanceRequests() {
        if (cancelledSpotInstanceRequests == null) {
            cancelledSpotInstanceRequests = new com.amazonaws.internal.SdkInternalList<CancelledSpotInstanceRequest>();
        }
        return cancelledSpotInstanceRequests;
    }

    /**
     * <p>
     * One or more Spot Instance requests.
     * </p>
     * 
     * @param cancelledSpotInstanceRequests
     *        One or more Spot Instance requests.
     */

    public void setCancelledSpotInstanceRequests(java.util.Collection<CancelledSpotInstanceRequest> cancelledSpotInstanceRequests) {
        if (cancelledSpotInstanceRequests == null) {
            this.cancelledSpotInstanceRequests = null;
            return;
        }

        this.cancelledSpotInstanceRequests = new com.amazonaws.internal.SdkInternalList<CancelledSpotInstanceRequest>(cancelledSpotInstanceRequests);
    }

    /**
     * <p>
     * One or more Spot Instance requests.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCancelledSpotInstanceRequests(java.util.Collection)} or
     * {@link #withCancelledSpotInstanceRequests(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param cancelledSpotInstanceRequests
     *        One or more Spot Instance requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelSpotInstanceRequestsResult withCancelledSpotInstanceRequests(CancelledSpotInstanceRequest... cancelledSpotInstanceRequests) {
        if (this.cancelledSpotInstanceRequests == null) {
            setCancelledSpotInstanceRequests(new com.amazonaws.internal.SdkInternalList<CancelledSpotInstanceRequest>(cancelledSpotInstanceRequests.length));
        }
        for (CancelledSpotInstanceRequest ele : cancelledSpotInstanceRequests) {
            this.cancelledSpotInstanceRequests.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more Spot Instance requests.
     * </p>
     * 
     * @param cancelledSpotInstanceRequests
     *        One or more Spot Instance requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelSpotInstanceRequestsResult withCancelledSpotInstanceRequests(java.util.Collection<CancelledSpotInstanceRequest> cancelledSpotInstanceRequests) {
        setCancelledSpotInstanceRequests(cancelledSpotInstanceRequests);
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
        if (getCancelledSpotInstanceRequests() != null)
            sb.append("CancelledSpotInstanceRequests: ").append(getCancelledSpotInstanceRequests());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CancelSpotInstanceRequestsResult == false)
            return false;
        CancelSpotInstanceRequestsResult other = (CancelSpotInstanceRequestsResult) obj;
        if (other.getCancelledSpotInstanceRequests() == null ^ this.getCancelledSpotInstanceRequests() == null)
            return false;
        if (other.getCancelledSpotInstanceRequests() != null
                && other.getCancelledSpotInstanceRequests().equals(this.getCancelledSpotInstanceRequests()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCancelledSpotInstanceRequests() == null) ? 0 : getCancelledSpotInstanceRequests().hashCode());
        return hashCode;
    }

    @Override
    public CancelSpotInstanceRequestsResult clone() {
        try {
            return (CancelSpotInstanceRequestsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
