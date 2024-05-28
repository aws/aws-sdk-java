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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a network function.
 * </p>
 * <p>
 * A network instance is a single network created in Amazon Web Services TNB that can be deployed and on which
 * life-cycle operations (like terminate, update, and delete) can be performed.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/GetSolInstantiatedVnfInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSolInstantiatedVnfInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * State of the network function.
     * </p>
     */
    private String vnfState;

    /**
     * <p>
     * State of the network function.
     * </p>
     * 
     * @param vnfState
     *        State of the network function.
     * @see VnfOperationalState
     */

    public void setVnfState(String vnfState) {
        this.vnfState = vnfState;
    }

    /**
     * <p>
     * State of the network function.
     * </p>
     * 
     * @return State of the network function.
     * @see VnfOperationalState
     */

    public String getVnfState() {
        return this.vnfState;
    }

    /**
     * <p>
     * State of the network function.
     * </p>
     * 
     * @param vnfState
     *        State of the network function.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VnfOperationalState
     */

    public GetSolInstantiatedVnfInfo withVnfState(String vnfState) {
        setVnfState(vnfState);
        return this;
    }

    /**
     * <p>
     * State of the network function.
     * </p>
     * 
     * @param vnfState
     *        State of the network function.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VnfOperationalState
     */

    public GetSolInstantiatedVnfInfo withVnfState(VnfOperationalState vnfState) {
        this.vnfState = vnfState.toString();
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
        if (getVnfState() != null)
            sb.append("VnfState: ").append(getVnfState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSolInstantiatedVnfInfo == false)
            return false;
        GetSolInstantiatedVnfInfo other = (GetSolInstantiatedVnfInfo) obj;
        if (other.getVnfState() == null ^ this.getVnfState() == null)
            return false;
        if (other.getVnfState() != null && other.getVnfState().equals(this.getVnfState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVnfState() == null) ? 0 : getVnfState().hashCode());
        return hashCode;
    }

    @Override
    public GetSolInstantiatedVnfInfo clone() {
        try {
            return (GetSolInstantiatedVnfInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.tnb.model.transform.GetSolInstantiatedVnfInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
