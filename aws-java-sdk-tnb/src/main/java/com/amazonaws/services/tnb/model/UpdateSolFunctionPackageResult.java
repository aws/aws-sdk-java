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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/UpdateSolFunctionPackage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSolFunctionPackageResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Operational state of the function package.
     * </p>
     */
    private String operationalState;

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

    public UpdateSolFunctionPackageResult withOperationalState(String operationalState) {
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

    public UpdateSolFunctionPackageResult withOperationalState(OperationalState operationalState) {
        this.operationalState = operationalState.toString();
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
            sb.append("OperationalState: ").append(getOperationalState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSolFunctionPackageResult == false)
            return false;
        UpdateSolFunctionPackageResult other = (UpdateSolFunctionPackageResult) obj;
        if (other.getOperationalState() == null ^ this.getOperationalState() == null)
            return false;
        if (other.getOperationalState() != null && other.getOperationalState().equals(this.getOperationalState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOperationalState() == null) ? 0 : getOperationalState().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSolFunctionPackageResult clone() {
        try {
            return (UpdateSolFunctionPackageResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
