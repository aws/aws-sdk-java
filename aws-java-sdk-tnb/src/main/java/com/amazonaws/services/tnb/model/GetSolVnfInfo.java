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
 * Information about the network function.
 * </p>
 * <p>
 * A network function instance is a function in a function package .
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/GetSolVnfInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSolVnfInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * State of the network function instance.
     * </p>
     */
    private String vnfState;
    /**
     * <p>
     * Compute info used by the network function instance.
     * </p>
     */
    private java.util.List<GetSolVnfcResourceInfo> vnfcResourceInfo;

    /**
     * <p>
     * State of the network function instance.
     * </p>
     * 
     * @param vnfState
     *        State of the network function instance.
     * @see VnfOperationalState
     */

    public void setVnfState(String vnfState) {
        this.vnfState = vnfState;
    }

    /**
     * <p>
     * State of the network function instance.
     * </p>
     * 
     * @return State of the network function instance.
     * @see VnfOperationalState
     */

    public String getVnfState() {
        return this.vnfState;
    }

    /**
     * <p>
     * State of the network function instance.
     * </p>
     * 
     * @param vnfState
     *        State of the network function instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VnfOperationalState
     */

    public GetSolVnfInfo withVnfState(String vnfState) {
        setVnfState(vnfState);
        return this;
    }

    /**
     * <p>
     * State of the network function instance.
     * </p>
     * 
     * @param vnfState
     *        State of the network function instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VnfOperationalState
     */

    public GetSolVnfInfo withVnfState(VnfOperationalState vnfState) {
        this.vnfState = vnfState.toString();
        return this;
    }

    /**
     * <p>
     * Compute info used by the network function instance.
     * </p>
     * 
     * @return Compute info used by the network function instance.
     */

    public java.util.List<GetSolVnfcResourceInfo> getVnfcResourceInfo() {
        return vnfcResourceInfo;
    }

    /**
     * <p>
     * Compute info used by the network function instance.
     * </p>
     * 
     * @param vnfcResourceInfo
     *        Compute info used by the network function instance.
     */

    public void setVnfcResourceInfo(java.util.Collection<GetSolVnfcResourceInfo> vnfcResourceInfo) {
        if (vnfcResourceInfo == null) {
            this.vnfcResourceInfo = null;
            return;
        }

        this.vnfcResourceInfo = new java.util.ArrayList<GetSolVnfcResourceInfo>(vnfcResourceInfo);
    }

    /**
     * <p>
     * Compute info used by the network function instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVnfcResourceInfo(java.util.Collection)} or {@link #withVnfcResourceInfo(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param vnfcResourceInfo
     *        Compute info used by the network function instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSolVnfInfo withVnfcResourceInfo(GetSolVnfcResourceInfo... vnfcResourceInfo) {
        if (this.vnfcResourceInfo == null) {
            setVnfcResourceInfo(new java.util.ArrayList<GetSolVnfcResourceInfo>(vnfcResourceInfo.length));
        }
        for (GetSolVnfcResourceInfo ele : vnfcResourceInfo) {
            this.vnfcResourceInfo.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Compute info used by the network function instance.
     * </p>
     * 
     * @param vnfcResourceInfo
     *        Compute info used by the network function instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSolVnfInfo withVnfcResourceInfo(java.util.Collection<GetSolVnfcResourceInfo> vnfcResourceInfo) {
        setVnfcResourceInfo(vnfcResourceInfo);
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
            sb.append("VnfState: ").append(getVnfState()).append(",");
        if (getVnfcResourceInfo() != null)
            sb.append("VnfcResourceInfo: ").append(getVnfcResourceInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSolVnfInfo == false)
            return false;
        GetSolVnfInfo other = (GetSolVnfInfo) obj;
        if (other.getVnfState() == null ^ this.getVnfState() == null)
            return false;
        if (other.getVnfState() != null && other.getVnfState().equals(this.getVnfState()) == false)
            return false;
        if (other.getVnfcResourceInfo() == null ^ this.getVnfcResourceInfo() == null)
            return false;
        if (other.getVnfcResourceInfo() != null && other.getVnfcResourceInfo().equals(this.getVnfcResourceInfo()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVnfState() == null) ? 0 : getVnfState().hashCode());
        hashCode = prime * hashCode + ((getVnfcResourceInfo() == null) ? 0 : getVnfcResourceInfo().hashCode());
        return hashCode;
    }

    @Override
    public GetSolVnfInfo clone() {
        try {
            return (GetSolVnfInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.tnb.model.transform.GetSolVnfInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
