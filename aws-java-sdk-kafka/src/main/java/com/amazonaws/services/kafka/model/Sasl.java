/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Details for client authentication using SASL.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/Sasl" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Sasl implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Details for SASL/SCRAM client authentication.
     * </p>
     */
    private Scram scram;
    /**
     * <p>
     * Indicates whether IAM access control is enabled.
     * </p>
     */
    private Iam iam;

    /**
     * <p>
     * Details for SASL/SCRAM client authentication.
     * </p>
     * 
     * @param scram
     *        <p>
     *        Details for SASL/SCRAM client authentication.
     *        </p>
     */

    public void setScram(Scram scram) {
        this.scram = scram;
    }

    /**
     * <p>
     * Details for SASL/SCRAM client authentication.
     * </p>
     * 
     * @return <p>
     *         Details for SASL/SCRAM client authentication.
     *         </p>
     */

    public Scram getScram() {
        return this.scram;
    }

    /**
     * <p>
     * Details for SASL/SCRAM client authentication.
     * </p>
     * 
     * @param scram
     *        <p>
     *        Details for SASL/SCRAM client authentication.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Sasl withScram(Scram scram) {
        setScram(scram);
        return this;
    }

    /**
     * <p>
     * Indicates whether IAM access control is enabled.
     * </p>
     * 
     * @param iam
     *        <p>
     *        Indicates whether IAM access control is enabled.
     *        </p>
     */

    public void setIam(Iam iam) {
        this.iam = iam;
    }

    /**
     * <p>
     * Indicates whether IAM access control is enabled.
     * </p>
     * 
     * @return <p>
     *         Indicates whether IAM access control is enabled.
     *         </p>
     */

    public Iam getIam() {
        return this.iam;
    }

    /**
     * <p>
     * Indicates whether IAM access control is enabled.
     * </p>
     * 
     * @param iam
     *        <p>
     *        Indicates whether IAM access control is enabled.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Sasl withIam(Iam iam) {
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

        if (obj instanceof Sasl == false)
            return false;
        Sasl other = (Sasl) obj;
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
    public Sasl clone() {
        try {
            return (Sasl) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kafka.model.transform.SaslMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
