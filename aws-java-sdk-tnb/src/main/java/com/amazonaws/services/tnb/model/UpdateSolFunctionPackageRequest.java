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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/UpdateSolFunctionPackage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSolFunctionPackageRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Operational state of the function package.
     * </p>
     */
    private String operationalState;
    /**
     * <p>
     * ID of the function package.
     * </p>
     */
    private String vnfPkgId;

    /**
     * <p>
     * Operational state of the function package.
     * </p>
     * 
     * @param operationalState
     *        Operational state of the function package.
     * @see OperationalState
     */

    public void setOperationalState(String operationalState) {
        this.operationalState = operationalState;
    }

    /**
     * <p>
     * Operational state of the function package.
     * </p>
     * 
     * @return Operational state of the function package.
     * @see OperationalState
     */

    public String getOperationalState() {
        return this.operationalState;
    }

    /**
     * <p>
     * Operational state of the function package.
     * </p>
     * 
     * @param operationalState
     *        Operational state of the function package.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperationalState
     */

    public UpdateSolFunctionPackageRequest withOperationalState(String operationalState) {
        setOperationalState(operationalState);
        return this;
    }

    /**
     * <p>
     * Operational state of the function package.
     * </p>
     * 
     * @param operationalState
     *        Operational state of the function package.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperationalState
     */

    public UpdateSolFunctionPackageRequest withOperationalState(OperationalState operationalState) {
        this.operationalState = operationalState.toString();
        return this;
    }

    /**
     * <p>
     * ID of the function package.
     * </p>
     * 
     * @param vnfPkgId
     *        ID of the function package.
     */

    public void setVnfPkgId(String vnfPkgId) {
        this.vnfPkgId = vnfPkgId;
    }

    /**
     * <p>
     * ID of the function package.
     * </p>
     * 
     * @return ID of the function package.
     */

    public String getVnfPkgId() {
        return this.vnfPkgId;
    }

    /**
     * <p>
     * ID of the function package.
     * </p>
     * 
     * @param vnfPkgId
     *        ID of the function package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSolFunctionPackageRequest withVnfPkgId(String vnfPkgId) {
        setVnfPkgId(vnfPkgId);
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
        if (getOperationalState() != null)
            sb.append("OperationalState: ").append(getOperationalState()).append(",");
        if (getVnfPkgId() != null)
            sb.append("VnfPkgId: ").append(getVnfPkgId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSolFunctionPackageRequest == false)
            return false;
        UpdateSolFunctionPackageRequest other = (UpdateSolFunctionPackageRequest) obj;
        if (other.getOperationalState() == null ^ this.getOperationalState() == null)
            return false;
        if (other.getOperationalState() != null && other.getOperationalState().equals(this.getOperationalState()) == false)
            return false;
        if (other.getVnfPkgId() == null ^ this.getVnfPkgId() == null)
            return false;
        if (other.getVnfPkgId() != null && other.getVnfPkgId().equals(this.getVnfPkgId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOperationalState() == null) ? 0 : getOperationalState().hashCode());
        hashCode = prime * hashCode + ((getVnfPkgId() == null) ? 0 : getVnfPkgId().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSolFunctionPackageRequest clone() {
        return (UpdateSolFunctionPackageRequest) super.clone();
    }

}
