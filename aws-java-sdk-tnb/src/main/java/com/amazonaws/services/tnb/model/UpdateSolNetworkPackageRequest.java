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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/UpdateSolNetworkPackage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSolNetworkPackageRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * ID of the network service descriptor in the network package.
     * </p>
     */
    private String nsdInfoId;
    /**
     * <p>
     * Operational state of the network service descriptor in the network package.
     * </p>
     */
    private String nsdOperationalState;

    /**
     * <p>
     * ID of the network service descriptor in the network package.
     * </p>
     * 
     * @param nsdInfoId
     *        ID of the network service descriptor in the network package.
     */

    public void setNsdInfoId(String nsdInfoId) {
        this.nsdInfoId = nsdInfoId;
    }

    /**
     * <p>
     * ID of the network service descriptor in the network package.
     * </p>
     * 
     * @return ID of the network service descriptor in the network package.
     */

    public String getNsdInfoId() {
        return this.nsdInfoId;
    }

    /**
     * <p>
     * ID of the network service descriptor in the network package.
     * </p>
     * 
     * @param nsdInfoId
     *        ID of the network service descriptor in the network package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSolNetworkPackageRequest withNsdInfoId(String nsdInfoId) {
        setNsdInfoId(nsdInfoId);
        return this;
    }

    /**
     * <p>
     * Operational state of the network service descriptor in the network package.
     * </p>
     * 
     * @param nsdOperationalState
     *        Operational state of the network service descriptor in the network package.
     * @see NsdOperationalState
     */

    public void setNsdOperationalState(String nsdOperationalState) {
        this.nsdOperationalState = nsdOperationalState;
    }

    /**
     * <p>
     * Operational state of the network service descriptor in the network package.
     * </p>
     * 
     * @return Operational state of the network service descriptor in the network package.
     * @see NsdOperationalState
     */

    public String getNsdOperationalState() {
        return this.nsdOperationalState;
    }

    /**
     * <p>
     * Operational state of the network service descriptor in the network package.
     * </p>
     * 
     * @param nsdOperationalState
     *        Operational state of the network service descriptor in the network package.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NsdOperationalState
     */

    public UpdateSolNetworkPackageRequest withNsdOperationalState(String nsdOperationalState) {
        setNsdOperationalState(nsdOperationalState);
        return this;
    }

    /**
     * <p>
     * Operational state of the network service descriptor in the network package.
     * </p>
     * 
     * @param nsdOperationalState
     *        Operational state of the network service descriptor in the network package.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NsdOperationalState
     */

    public UpdateSolNetworkPackageRequest withNsdOperationalState(NsdOperationalState nsdOperationalState) {
        this.nsdOperationalState = nsdOperationalState.toString();
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
        if (getNsdInfoId() != null)
            sb.append("NsdInfoId: ").append(getNsdInfoId()).append(",");
        if (getNsdOperationalState() != null)
            sb.append("NsdOperationalState: ").append(getNsdOperationalState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSolNetworkPackageRequest == false)
            return false;
        UpdateSolNetworkPackageRequest other = (UpdateSolNetworkPackageRequest) obj;
        if (other.getNsdInfoId() == null ^ this.getNsdInfoId() == null)
            return false;
        if (other.getNsdInfoId() != null && other.getNsdInfoId().equals(this.getNsdInfoId()) == false)
            return false;
        if (other.getNsdOperationalState() == null ^ this.getNsdOperationalState() == null)
            return false;
        if (other.getNsdOperationalState() != null && other.getNsdOperationalState().equals(this.getNsdOperationalState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNsdInfoId() == null) ? 0 : getNsdInfoId().hashCode());
        hashCode = prime * hashCode + ((getNsdOperationalState() == null) ? 0 : getNsdOperationalState().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSolNetworkPackageRequest clone() {
        return (UpdateSolNetworkPackageRequest) super.clone();
    }

}
