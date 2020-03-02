/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.globalaccelerator.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about an IP address range that is provisioned for use with your AWS resources through bring your own IP
 * addresses (BYOIP).
 * </p>
 * <p>
 * The following describes each BYOIP <code>State</code> that your IP address range can be in.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>PENDING_PROVISIONING</b> — You’ve submitted a request to provision an IP address range but it is not yet
 * provisioned with AWS Global Accelerator.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>READY</b> — The address range is provisioned with AWS Global Accelerator and can be advertised.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>PENDING_ADVERTISING</b> — You’ve submitted a request for AWS Global Accelerator to advertise an address range but
 * it is not yet being advertised.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>ADVERTISING</b> — The address range is being advertised by AWS Global Accelerator.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>PENDING_WITHDRAWING</b> — You’ve submitted a request to withdraw an address range from being advertised but it is
 * still being advertised by AWS Global Accelerator.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>PENDING_DEPROVISIONING</b> — You’ve submitted a request to deprovision an address range from AWS Global
 * Accelerator but it is still provisioned.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>DEPROVISIONED</b> — The address range is deprovisioned from AWS Global Accelerator.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>FAILED_PROVISION </b> — The request to provision the address range from AWS Global Accelerator was not successful.
 * Please make sure that you provide all of the correct information, and try again. If the request fails a second time,
 * contact AWS support.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>FAILED_ADVERTISING</b> — The request for AWS Global Accelerator to advertise the address range was not successful.
 * Please make sure that you provide all of the correct information, and try again. If the request fails a second time,
 * contact AWS support.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>FAILED_WITHDRAW</b> — The request to withdraw the address range from advertising by AWS Global Accelerator was not
 * successful. Please make sure that you provide all of the correct information, and try again. If the request fails a
 * second time, contact AWS support.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>FAILED_DEPROVISION </b> — The request to deprovision the address range from AWS Global Accelerator was not
 * successful. Please make sure that you provide all of the correct information, and try again. If the request fails a
 * second time, contact AWS support.
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/ByoipCidr" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ByoipCidr implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The address range, in CIDR notation.
     * </p>
     */
    private String cidr;
    /**
     * <p>
     * The state of the address pool.
     * </p>
     */
    private String state;

    /**
     * <p>
     * The address range, in CIDR notation.
     * </p>
     * 
     * @param cidr
     *        The address range, in CIDR notation.
     */

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    /**
     * <p>
     * The address range, in CIDR notation.
     * </p>
     * 
     * @return The address range, in CIDR notation.
     */

    public String getCidr() {
        return this.cidr;
    }

    /**
     * <p>
     * The address range, in CIDR notation.
     * </p>
     * 
     * @param cidr
     *        The address range, in CIDR notation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ByoipCidr withCidr(String cidr) {
        setCidr(cidr);
        return this;
    }

    /**
     * <p>
     * The state of the address pool.
     * </p>
     * 
     * @param state
     *        The state of the address pool.
     * @see ByoipCidrState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the address pool.
     * </p>
     * 
     * @return The state of the address pool.
     * @see ByoipCidrState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the address pool.
     * </p>
     * 
     * @param state
     *        The state of the address pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ByoipCidrState
     */

    public ByoipCidr withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the address pool.
     * </p>
     * 
     * @param state
     *        The state of the address pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ByoipCidrState
     */

    public ByoipCidr withState(ByoipCidrState state) {
        this.state = state.toString();
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
        if (getCidr() != null)
            sb.append("Cidr: ").append(getCidr()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ByoipCidr == false)
            return false;
        ByoipCidr other = (ByoipCidr) obj;
        if (other.getCidr() == null ^ this.getCidr() == null)
            return false;
        if (other.getCidr() != null && other.getCidr().equals(this.getCidr()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCidr() == null) ? 0 : getCidr().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public ByoipCidr clone() {
        try {
            return (ByoipCidr) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.globalaccelerator.model.transform.ByoipCidrMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
