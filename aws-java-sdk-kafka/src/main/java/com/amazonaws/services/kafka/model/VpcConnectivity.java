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
package com.amazonaws.services.kafka.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * VPC connectivity access control for brokers.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/VpcConnectivity" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VpcConnectivity implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Includes all client authentication information for VPC connectivity.
     * </p>
     */
    private VpcConnectivityClientAuthentication clientAuthentication;

    /**
     * <p>
     * Includes all client authentication information for VPC connectivity.
     * </p>
     * 
     * @param clientAuthentication
     *        <p>
     *        Includes all client authentication information for VPC connectivity.
     *        </p>
     */

    public void setClientAuthentication(VpcConnectivityClientAuthentication clientAuthentication) {
        this.clientAuthentication = clientAuthentication;
    }

    /**
     * <p>
     * Includes all client authentication information for VPC connectivity.
     * </p>
     * 
     * @return <p>
     *         Includes all client authentication information for VPC connectivity.
     *         </p>
     */

    public VpcConnectivityClientAuthentication getClientAuthentication() {
        return this.clientAuthentication;
    }

    /**
     * <p>
     * Includes all client authentication information for VPC connectivity.
     * </p>
     * 
     * @param clientAuthentication
     *        <p>
     *        Includes all client authentication information for VPC connectivity.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcConnectivity withClientAuthentication(VpcConnectivityClientAuthentication clientAuthentication) {
        setClientAuthentication(clientAuthentication);
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
        if (getClientAuthentication() != null)
            sb.append("ClientAuthentication: ").append(getClientAuthentication());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VpcConnectivity == false)
            return false;
        VpcConnectivity other = (VpcConnectivity) obj;
        if (other.getClientAuthentication() == null ^ this.getClientAuthentication() == null)
            return false;
        if (other.getClientAuthentication() != null && other.getClientAuthentication().equals(this.getClientAuthentication()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientAuthentication() == null) ? 0 : getClientAuthentication().hashCode());
        return hashCode;
    }

    @Override
    public VpcConnectivity clone() {
        try {
            return (VpcConnectivity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kafka.model.transform.VpcConnectivityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
