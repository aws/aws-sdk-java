/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/GetReservedNodeExchangeConfigurationOptions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetReservedNodeExchangeConfigurationOptionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * A pagination token provided by a previous <code>GetReservedNodeExchangeConfigurationOptions</code> request.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * the configuration options for the reserved-node exchange. These options include information about the source
     * reserved node and target reserved node. Details include the node type, the price, the node count, and the
     * offering type.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ReservedNodeConfigurationOption> reservedNodeConfigurationOptionList;

    /**
     * <p>
     * A pagination token provided by a previous <code>GetReservedNodeExchangeConfigurationOptions</code> request.
     * </p>
     * 
     * @param marker
     *        A pagination token provided by a previous <code>GetReservedNodeExchangeConfigurationOptions</code>
     *        request.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * A pagination token provided by a previous <code>GetReservedNodeExchangeConfigurationOptions</code> request.
     * </p>
     * 
     * @return A pagination token provided by a previous <code>GetReservedNodeExchangeConfigurationOptions</code>
     *         request.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * A pagination token provided by a previous <code>GetReservedNodeExchangeConfigurationOptions</code> request.
     * </p>
     * 
     * @param marker
     *        A pagination token provided by a previous <code>GetReservedNodeExchangeConfigurationOptions</code>
     *        request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReservedNodeExchangeConfigurationOptionsResult withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * the configuration options for the reserved-node exchange. These options include information about the source
     * reserved node and target reserved node. Details include the node type, the price, the node count, and the
     * offering type.
     * </p>
     * 
     * @return the configuration options for the reserved-node exchange. These options include information about the
     *         source reserved node and target reserved node. Details include the node type, the price, the node count,
     *         and the offering type.
     */

    public java.util.List<ReservedNodeConfigurationOption> getReservedNodeConfigurationOptionList() {
        if (reservedNodeConfigurationOptionList == null) {
            reservedNodeConfigurationOptionList = new com.amazonaws.internal.SdkInternalList<ReservedNodeConfigurationOption>();
        }
        return reservedNodeConfigurationOptionList;
    }

    /**
     * <p>
     * the configuration options for the reserved-node exchange. These options include information about the source
     * reserved node and target reserved node. Details include the node type, the price, the node count, and the
     * offering type.
     * </p>
     * 
     * @param reservedNodeConfigurationOptionList
     *        the configuration options for the reserved-node exchange. These options include information about the
     *        source reserved node and target reserved node. Details include the node type, the price, the node count,
     *        and the offering type.
     */

    public void setReservedNodeConfigurationOptionList(java.util.Collection<ReservedNodeConfigurationOption> reservedNodeConfigurationOptionList) {
        if (reservedNodeConfigurationOptionList == null) {
            this.reservedNodeConfigurationOptionList = null;
            return;
        }

        this.reservedNodeConfigurationOptionList = new com.amazonaws.internal.SdkInternalList<ReservedNodeConfigurationOption>(
                reservedNodeConfigurationOptionList);
    }

    /**
     * <p>
     * the configuration options for the reserved-node exchange. These options include information about the source
     * reserved node and target reserved node. Details include the node type, the price, the node count, and the
     * offering type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReservedNodeConfigurationOptionList(java.util.Collection)} or
     * {@link #withReservedNodeConfigurationOptionList(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param reservedNodeConfigurationOptionList
     *        the configuration options for the reserved-node exchange. These options include information about the
     *        source reserved node and target reserved node. Details include the node type, the price, the node count,
     *        and the offering type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReservedNodeExchangeConfigurationOptionsResult withReservedNodeConfigurationOptionList(
            ReservedNodeConfigurationOption... reservedNodeConfigurationOptionList) {
        if (this.reservedNodeConfigurationOptionList == null) {
            setReservedNodeConfigurationOptionList(new com.amazonaws.internal.SdkInternalList<ReservedNodeConfigurationOption>(
                    reservedNodeConfigurationOptionList.length));
        }
        for (ReservedNodeConfigurationOption ele : reservedNodeConfigurationOptionList) {
            this.reservedNodeConfigurationOptionList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * the configuration options for the reserved-node exchange. These options include information about the source
     * reserved node and target reserved node. Details include the node type, the price, the node count, and the
     * offering type.
     * </p>
     * 
     * @param reservedNodeConfigurationOptionList
     *        the configuration options for the reserved-node exchange. These options include information about the
     *        source reserved node and target reserved node. Details include the node type, the price, the node count,
     *        and the offering type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReservedNodeExchangeConfigurationOptionsResult withReservedNodeConfigurationOptionList(
            java.util.Collection<ReservedNodeConfigurationOption> reservedNodeConfigurationOptionList) {
        setReservedNodeConfigurationOptionList(reservedNodeConfigurationOptionList);
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
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
        if (getReservedNodeConfigurationOptionList() != null)
            sb.append("ReservedNodeConfigurationOptionList: ").append(getReservedNodeConfigurationOptionList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetReservedNodeExchangeConfigurationOptionsResult == false)
            return false;
        GetReservedNodeExchangeConfigurationOptionsResult other = (GetReservedNodeExchangeConfigurationOptionsResult) obj;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getReservedNodeConfigurationOptionList() == null ^ this.getReservedNodeConfigurationOptionList() == null)
            return false;
        if (other.getReservedNodeConfigurationOptionList() != null
                && other.getReservedNodeConfigurationOptionList().equals(this.getReservedNodeConfigurationOptionList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getReservedNodeConfigurationOptionList() == null) ? 0 : getReservedNodeConfigurationOptionList().hashCode());
        return hashCode;
    }

    @Override
    public GetReservedNodeExchangeConfigurationOptionsResult clone() {
        try {
            return (GetReservedNodeExchangeConfigurationOptionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
