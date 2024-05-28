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
package com.amazonaws.services.internetmonitor.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An internet service provider (ISP) or network (ASN) in Amazon CloudWatch Internet Monitor.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/Network" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Network implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the internet service provider (ISP) or network (ASN).
     * </p>
     */
    private String aSName;
    /**
     * <p>
     * The Autonomous System Number (ASN) of the internet provider or network.
     * </p>
     */
    private Long aSNumber;

    /**
     * <p>
     * The name of the internet service provider (ISP) or network (ASN).
     * </p>
     * 
     * @param aSName
     *        The name of the internet service provider (ISP) or network (ASN).
     */

    public void setASName(String aSName) {
        this.aSName = aSName;
    }

    /**
     * <p>
     * The name of the internet service provider (ISP) or network (ASN).
     * </p>
     * 
     * @return The name of the internet service provider (ISP) or network (ASN).
     */

    public String getASName() {
        return this.aSName;
    }

    /**
     * <p>
     * The name of the internet service provider (ISP) or network (ASN).
     * </p>
     * 
     * @param aSName
     *        The name of the internet service provider (ISP) or network (ASN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Network withASName(String aSName) {
        setASName(aSName);
        return this;
    }

    /**
     * <p>
     * The Autonomous System Number (ASN) of the internet provider or network.
     * </p>
     * 
     * @param aSNumber
     *        The Autonomous System Number (ASN) of the internet provider or network.
     */

    public void setASNumber(Long aSNumber) {
        this.aSNumber = aSNumber;
    }

    /**
     * <p>
     * The Autonomous System Number (ASN) of the internet provider or network.
     * </p>
     * 
     * @return The Autonomous System Number (ASN) of the internet provider or network.
     */

    public Long getASNumber() {
        return this.aSNumber;
    }

    /**
     * <p>
     * The Autonomous System Number (ASN) of the internet provider or network.
     * </p>
     * 
     * @param aSNumber
     *        The Autonomous System Number (ASN) of the internet provider or network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Network withASNumber(Long aSNumber) {
        setASNumber(aSNumber);
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
        if (getASName() != null)
            sb.append("ASName: ").append(getASName()).append(",");
        if (getASNumber() != null)
            sb.append("ASNumber: ").append(getASNumber());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Network == false)
            return false;
        Network other = (Network) obj;
        if (other.getASName() == null ^ this.getASName() == null)
            return false;
        if (other.getASName() != null && other.getASName().equals(this.getASName()) == false)
            return false;
        if (other.getASNumber() == null ^ this.getASNumber() == null)
            return false;
        if (other.getASNumber() != null && other.getASNumber().equals(this.getASNumber()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getASName() == null) ? 0 : getASName().hashCode());
        hashCode = prime * hashCode + ((getASNumber() == null) ? 0 : getASNumber().hashCode());
        return hashCode;
    }

    @Override
    public Network clone() {
        try {
            return (Network) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.internetmonitor.model.transform.NetworkMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
