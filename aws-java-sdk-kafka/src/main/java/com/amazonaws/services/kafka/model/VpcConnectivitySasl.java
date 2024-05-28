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
 * 
 <p>
 * Details for SASL client authentication for VPC connectivity.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/VpcConnectivitySasl" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VpcConnectivitySasl implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Details for SASL/SCRAM client authentication for VPC connectivity.
     * </p>
     */
    private VpcConnectivityScram scram;
    /**
     * <p>
     * Details for SASL/IAM client authentication for VPC connectivity.
     * </p>
     */
    private VpcConnectivityIam iam;

    /**
     * <p>
     * Details for SASL/SCRAM client authentication for VPC connectivity.
     * </p>
     * 
     * @param scram
     *        <p>
     *        Details for SASL/SCRAM client authentication for VPC connectivity.
     *        </p>
     */

    public void setScram(VpcConnectivityScram scram) {
        this.scram = scram;
    }

    /**
     * <p>
     * Details for SASL/SCRAM client authentication for VPC connectivity.
     * </p>
     * 
     * @return <p>
     *         Details for SASL/SCRAM client authentication for VPC connectivity.
     *         </p>
     */

    public VpcConnectivityScram getScram() {
        return this.scram;
    }

    /**
     * <p>
     * Details for SASL/SCRAM client authentication for VPC connectivity.
     * </p>
     * 
     * @param scram
     *        <p>
     *        Details for SASL/SCRAM client authentication for VPC connectivity.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcConnectivitySasl withScram(VpcConnectivityScram scram) {
        setScram(scram);
        return this;
    }

    /**
     * <p>
     * Details for SASL/IAM client authentication for VPC connectivity.
     * </p>
     * 
     * @param iam
     *        <p>
     *        Details for SASL/IAM client authentication for VPC connectivity.
     *        </p>
     */

    public void setIam(VpcConnectivityIam iam) {
        this.iam = iam;
    }

    /**
     * <p>
     * Details for SASL/IAM client authentication for VPC connectivity.
     * </p>
     * 
     * @return <p>
     *         Details for SASL/IAM client authentication for VPC connectivity.
     *         </p>
     */

    public VpcConnectivityIam getIam() {
        return this.iam;
    }

    /**
     * <p>
     * Details for SASL/IAM client authentication for VPC connectivity.
     * </p>
     * 
     * @param iam
     *        <p>
     *        Details for SASL/IAM client authentication for VPC connectivity.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcConnectivitySasl withIam(VpcConnectivityIam iam) {
        setIam(iam);
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
        if (getScram() != null)
            sb.append("Scram: ").append(getScram()).append(",");
        if (getIam() != null)
            sb.append("Iam: ").append(getIam());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VpcConnectivitySasl == false)
            return false;
        VpcConnectivitySasl other = (VpcConnectivitySasl) obj;
        if (other.getScram() == null ^ this.getScram() == null)
            return false;
        if (other.getScram() != null && other.getScram().equals(this.getScram()) == false)
            return false;
        if (other.getIam() == null ^ this.getIam() == null)
            return false;
        if (other.getIam() != null && other.getIam().equals(this.getIam()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScram() == null) ? 0 : getScram().hashCode());
        hashCode = prime * hashCode + ((getIam() == null) ? 0 : getIam().hashCode());
        return hashCode;
    }

    @Override
    public VpcConnectivitySasl clone() {
        try {
            return (VpcConnectivitySasl) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kafka.model.transform.VpcConnectivitySaslMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
