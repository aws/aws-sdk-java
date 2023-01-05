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
package com.amazonaws.services.iotwireless.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * LTE local identification (local ID) information.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/LteLocalId" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LteLocalId implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Physical cell ID.
     * </p>
     */
    private Integer pci;
    /**
     * <p>
     * Evolved universal terrestrial radio access (E-UTRA) absolute radio frequency channel number (FCN).
     * </p>
     */
    private Integer earfcn;

    /**
     * <p>
     * Physical cell ID.
     * </p>
     * 
     * @param pci
     *        Physical cell ID.
     */

    public void setPci(Integer pci) {
        this.pci = pci;
    }

    /**
     * <p>
     * Physical cell ID.
     * </p>
     * 
     * @return Physical cell ID.
     */

    public Integer getPci() {
        return this.pci;
    }

    /**
     * <p>
     * Physical cell ID.
     * </p>
     * 
     * @param pci
     *        Physical cell ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LteLocalId withPci(Integer pci) {
        setPci(pci);
        return this;
    }

    /**
     * <p>
     * Evolved universal terrestrial radio access (E-UTRA) absolute radio frequency channel number (FCN).
     * </p>
     * 
     * @param earfcn
     *        Evolved universal terrestrial radio access (E-UTRA) absolute radio frequency channel number (FCN).
     */

    public void setEarfcn(Integer earfcn) {
        this.earfcn = earfcn;
    }

    /**
     * <p>
     * Evolved universal terrestrial radio access (E-UTRA) absolute radio frequency channel number (FCN).
     * </p>
     * 
     * @return Evolved universal terrestrial radio access (E-UTRA) absolute radio frequency channel number (FCN).
     */

    public Integer getEarfcn() {
        return this.earfcn;
    }

    /**
     * <p>
     * Evolved universal terrestrial radio access (E-UTRA) absolute radio frequency channel number (FCN).
     * </p>
     * 
     * @param earfcn
     *        Evolved universal terrestrial radio access (E-UTRA) absolute radio frequency channel number (FCN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LteLocalId withEarfcn(Integer earfcn) {
        setEarfcn(earfcn);
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
        if (getPci() != null)
            sb.append("Pci: ").append(getPci()).append(",");
        if (getEarfcn() != null)
            sb.append("Earfcn: ").append(getEarfcn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LteLocalId == false)
            return false;
        LteLocalId other = (LteLocalId) obj;
        if (other.getPci() == null ^ this.getPci() == null)
            return false;
        if (other.getPci() != null && other.getPci().equals(this.getPci()) == false)
            return false;
        if (other.getEarfcn() == null ^ this.getEarfcn() == null)
            return false;
        if (other.getEarfcn() != null && other.getEarfcn().equals(this.getEarfcn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPci() == null) ? 0 : getPci().hashCode());
        hashCode = prime * hashCode + ((getEarfcn() == null) ? 0 : getEarfcn().hashCode());
        return hashCode;
    }

    @Override
    public LteLocalId clone() {
        try {
            return (LteLocalId) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotwireless.model.transform.LteLocalIdMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
