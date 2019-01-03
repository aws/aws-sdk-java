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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/AcceptReservedNodeExchange"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AcceptReservedNodeExchangeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A string representing the node identifier of the DC1 Reserved Node to be exchanged.
     * </p>
     */
    private String reservedNodeId;
    /**
     * <p>
     * The unique identifier of the DC2 Reserved Node offering to be used for the exchange. You can obtain the value for
     * the parameter by calling <a>GetReservedNodeExchangeOfferings</a>
     * </p>
     */
    private String targetReservedNodeOfferingId;

    /**
     * <p>
     * A string representing the node identifier of the DC1 Reserved Node to be exchanged.
     * </p>
     * 
     * @param reservedNodeId
     *        A string representing the node identifier of the DC1 Reserved Node to be exchanged.
     */

    public void setReservedNodeId(String reservedNodeId) {
        this.reservedNodeId = reservedNodeId;
    }

    /**
     * <p>
     * A string representing the node identifier of the DC1 Reserved Node to be exchanged.
     * </p>
     * 
     * @return A string representing the node identifier of the DC1 Reserved Node to be exchanged.
     */

    public String getReservedNodeId() {
        return this.reservedNodeId;
    }

    /**
     * <p>
     * A string representing the node identifier of the DC1 Reserved Node to be exchanged.
     * </p>
     * 
     * @param reservedNodeId
     *        A string representing the node identifier of the DC1 Reserved Node to be exchanged.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AcceptReservedNodeExchangeRequest withReservedNodeId(String reservedNodeId) {
        setReservedNodeId(reservedNodeId);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the DC2 Reserved Node offering to be used for the exchange. You can obtain the value for
     * the parameter by calling <a>GetReservedNodeExchangeOfferings</a>
     * </p>
     * 
     * @param targetReservedNodeOfferingId
     *        The unique identifier of the DC2 Reserved Node offering to be used for the exchange. You can obtain the
     *        value for the parameter by calling <a>GetReservedNodeExchangeOfferings</a>
     */

    public void setTargetReservedNodeOfferingId(String targetReservedNodeOfferingId) {
        this.targetReservedNodeOfferingId = targetReservedNodeOfferingId;
    }

    /**
     * <p>
     * The unique identifier of the DC2 Reserved Node offering to be used for the exchange. You can obtain the value for
     * the parameter by calling <a>GetReservedNodeExchangeOfferings</a>
     * </p>
     * 
     * @return The unique identifier of the DC2 Reserved Node offering to be used for the exchange. You can obtain the
     *         value for the parameter by calling <a>GetReservedNodeExchangeOfferings</a>
     */

    public String getTargetReservedNodeOfferingId() {
        return this.targetReservedNodeOfferingId;
    }

    /**
     * <p>
     * The unique identifier of the DC2 Reserved Node offering to be used for the exchange. You can obtain the value for
     * the parameter by calling <a>GetReservedNodeExchangeOfferings</a>
     * </p>
     * 
     * @param targetReservedNodeOfferingId
     *        The unique identifier of the DC2 Reserved Node offering to be used for the exchange. You can obtain the
     *        value for the parameter by calling <a>GetReservedNodeExchangeOfferings</a>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AcceptReservedNodeExchangeRequest withTargetReservedNodeOfferingId(String targetReservedNodeOfferingId) {
        setTargetReservedNodeOfferingId(targetReservedNodeOfferingId);
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
        if (getReservedNodeId() != null)
            sb.append("ReservedNodeId: ").append(getReservedNodeId()).append(",");
        if (getTargetReservedNodeOfferingId() != null)
            sb.append("TargetReservedNodeOfferingId: ").append(getTargetReservedNodeOfferingId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AcceptReservedNodeExchangeRequest == false)
            return false;
        AcceptReservedNodeExchangeRequest other = (AcceptReservedNodeExchangeRequest) obj;
        if (other.getReservedNodeId() == null ^ this.getReservedNodeId() == null)
            return false;
        if (other.getReservedNodeId() != null && other.getReservedNodeId().equals(this.getReservedNodeId()) == false)
            return false;
        if (other.getTargetReservedNodeOfferingId() == null ^ this.getTargetReservedNodeOfferingId() == null)
            return false;
        if (other.getTargetReservedNodeOfferingId() != null && other.getTargetReservedNodeOfferingId().equals(this.getTargetReservedNodeOfferingId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReservedNodeId() == null) ? 0 : getReservedNodeId().hashCode());
        hashCode = prime * hashCode + ((getTargetReservedNodeOfferingId() == null) ? 0 : getTargetReservedNodeOfferingId().hashCode());
        return hashCode;
    }

    @Override
    public AcceptReservedNodeExchangeRequest clone() {
        return (AcceptReservedNodeExchangeRequest) super.clone();
    }

}
