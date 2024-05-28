/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.tnb.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/CancelSolNetworkOperation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CancelSolNetworkOperationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the network operation.
     * </p>
     */
    private String nsLcmOpOccId;

    /**
     * <p>
     * The identifier of the network operation.
     * </p>
     * 
     * @param nsLcmOpOccId
     *        The identifier of the network operation.
     */

    public void setNsLcmOpOccId(String nsLcmOpOccId) {
        this.nsLcmOpOccId = nsLcmOpOccId;
    }

    /**
     * <p>
     * The identifier of the network operation.
     * </p>
     * 
     * @return The identifier of the network operation.
     */

    public String getNsLcmOpOccId() {
        return this.nsLcmOpOccId;
    }

    /**
     * <p>
     * The identifier of the network operation.
     * </p>
     * 
     * @param nsLcmOpOccId
     *        The identifier of the network operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelSolNetworkOperationRequest withNsLcmOpOccId(String nsLcmOpOccId) {
        setNsLcmOpOccId(nsLcmOpOccId);
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
        if (getNsLcmOpOccId() != null)
            sb.append("NsLcmOpOccId: ").append(getNsLcmOpOccId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CancelSolNetworkOperationRequest == false)
            return false;
        CancelSolNetworkOperationRequest other = (CancelSolNetworkOperationRequest) obj;
        if (other.getNsLcmOpOccId() == null ^ this.getNsLcmOpOccId() == null)
            return false;
        if (other.getNsLcmOpOccId() != null && other.getNsLcmOpOccId().equals(this.getNsLcmOpOccId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNsLcmOpOccId() == null) ? 0 : getNsLcmOpOccId().hashCode());
        return hashCode;
    }

    @Override
    public CancelSolNetworkOperationRequest clone() {
        return (CancelSolNetworkOperationRequest) super.clone();
    }

}
